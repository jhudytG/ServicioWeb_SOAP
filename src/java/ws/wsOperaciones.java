/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/WebServices/WebService.java to edit this template
 */
package ws;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author jhudy
 */
@WebService(serviceName = "wsOperaciones")
public class wsOperaciones {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "Login")
    public Boolean Login(@WebParam(name = "usuario") String usuario, @WebParam(name = "contrasena") String contrasena) {
        //TODO write your implementation code here:
        if(usuario.equals("Jhudyt")&& contrasena.equals("123")){
            return true;
        }else{
            return false;
        }
    }
    
    @WebMethod(operationName = "ProcesarPago")
    public int ProcesarPago(@WebParam(name = "pago") int pago,@WebParam(name = "total")int total){
        if(pago>=total){
            //retornar vuelto
            return pago-total;
        }else{
            return -1;
        }
    }


}
