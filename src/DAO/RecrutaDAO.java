
package DAO;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import Model.RecrutaM;



public class RecrutaDAO {
    PreparedStatement pst;
    String sql;
    
    public void salvar(RecrutaM recruta)throws SQLException{
        sql = "insert into recruta values(?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        pst = Conexao.getInstance().prepareStatement(sql);
        pst.setInt(1, 0);
        pst.setString(2, recruta.getNome());
        pst.setString(3, recruta.getEndereco());
        pst.setString(4, recruta.getData_nascimento());
        pst.setString(5, recruta.getRg());
        pst.setString(6, recruta.getCpf());
        pst.setString(7, recruta.getTelefone());
        pst.setString(8, recruta.getTelefone_recado());
        pst.setString(9, recruta.getMae());
        pst.setString(10, recruta.getPai());
        pst.setString(11, recruta.getNome_guerra());
        pst.setInt(12, recruta.getMaticula());
        pst.setInt(13, recruta.getChamada());
        pst.setString(14, recruta.getAno_instrucao());
        pst.execute();
        pst.close();
        
    }
    
    
}
