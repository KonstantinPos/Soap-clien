import com.*;

import java.math.BigDecimal;
import java.util.List;

public class Main {
    public static void main(String[] args) throws DocumentAlreadyExist_Exception, DocumentNotFound_Exception {
        DocumentServiceImplService documentServiceImplService = new DocumentServiceImplService();
        DocumentService documentService = documentServiceImplService.getDocumentServiceImplPort();
        Document document1 = new Document();
        document1.setId(8);
        document1.setDestination("заработная плата");
        document1.setAmount(new BigDecimal("50000.05"));
        document1.setBillWrite(1234567897);
        document1.setBillRemove(1234567897);
        documentService.save(document1);

        List<Document> documentList = documentService.findAll();
        Document document = documentService.findById(8);

        document1.setId(2);
        document1.setDestination("заработная плата");
        document1.setAmount(new BigDecimal("50000.05"));
        document1.setBillWrite(1234567897);
        document1.setBillRemove(1234567897);
        documentService.delete(document1);
        List<Document> documentList2 = documentService.findAll();
        documentService.save(document1);
        List<Document> documentList3 = documentService.findAll();
    }
}
