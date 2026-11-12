package com.huami.rawdata_uploader.workmanager;

import com.huami.rawdata_uploader.vo.IRawDataType;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016J\b\u0010\u0007\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0004H\u0016¨\u0006\t"}, d2 = {"com/huami/rawdata_uploader/workmanager/BloodPressureRawDataUploadWork$doWork$dataDataType$1", "Lcom/huami/rawdata_uploader/vo/IRawDataType;", "", "getValue", "", "getFileNamePrefix", "getEventType", "getSubType", "getUploadType", "rawdata-uploader_release"}, k = 1, mv = {1, 5, 1})
public final class BloodPressureRawDataUploadWork$doWork$dataDataType$1 implements IRawDataType {
    public final /* synthetic */ BloodPressureRawDataUploadWork a;

    public BloodPressureRawDataUploadWork$doWork$dataDataType$1(BloodPressureRawDataUploadWork bloodPressureRawDataUploadWork) {
        this.a = bloodPressureRawDataUploadWork;
    }

    @Override // com.huami.rawdata_uploader.vo.IRawDataType
    @NotNull
    public String getEventType() {
        String string = this.a.getInputData().getString("WORK_DATA_TYPE_EVENTTYPE");
        return string == null ? "" : string;
    }

    @Override // com.huami.rawdata_uploader.vo.IRawDataType
    @NotNull
    public String getFileNamePrefix() {
        String string = this.a.getInputData().getString("WORK_DATA_TYPE_FILENAMEPREFIX");
        return string == null ? "" : string;
    }

    @Override // com.huami.rawdata_uploader.vo.IRawDataType
    @NotNull
    public String getSubType() {
        String string = this.a.getInputData().getString("WORK_DATA_TYPE_SUBTYPE");
        return string == null ? "" : string;
    }

    @Override // com.huami.rawdata_uploader.vo.IRawDataType
    @NotNull
    public String getUploadType() {
        String string = this.a.getInputData().getString("WORK_DATA_TYPE_UPLOADTYPE");
        return string == null ? "" : string;
    }

    @Override // com.huami.rawdata_uploader.vo.IRawDataType
    public int getValue() {
        return this.a.getInputData().getInt("WORK_DATA_TYPE_VALUE", -1);
    }

    @Override // com.huami.rawdata_uploader.vo.IRawDataType
    @NotNull
    public String getValueStr() {
        return IRawDataType.DefaultImpls.getValueStr(this);
    }
}
