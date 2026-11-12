package ohos.ace.plugin.clipboard;

/* JADX INFO: loaded from: classes46.dex */
public class PasteDataDTO {
    private PropertyDTO propertyDTO = null;
    private DataRecordDTO[] records = null;

    public void setPropertyDTO(PropertyDTO propertyDTO) {
        this.propertyDTO = propertyDTO;
    }

    public void setRecords(DataRecordDTO[] dataRecordDTOArr) {
        this.records = dataRecordDTOArr;
    }

    public PropertyDTO getPropertyDTO() {
        return this.propertyDTO;
    }

    public DataRecordDTO[] getRecords() {
        return this.records;
    }
}
