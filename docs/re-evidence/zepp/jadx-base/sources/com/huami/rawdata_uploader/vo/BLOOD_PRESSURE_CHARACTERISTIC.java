package com.huami.rawdata_uploader.vo;

import com.huami.rawdata_uploader.relation.remote.BloodPressureRawDataApi;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016J\b\u0010\u0007\u001a\u00020\u0004H\u0016¨\u0006\n"}, d2 = {"Lcom/huami/rawdata_uploader/vo/BLOOD_PRESSURE_CHARACTERISTIC;", "Lcom/huami/rawdata_uploader/vo/BloodPressureRawDataType;", "", "getValue", "", "getFileNamePrefix", "getEventType", "getSubType", "<init>", "()V", "rawdata-uploader_release"}, k = 1, mv = {1, 5, 1})
public final class BLOOD_PRESSURE_CHARACTERISTIC implements BloodPressureRawDataType {

    @NotNull
    public static final BLOOD_PRESSURE_CHARACTERISTIC INSTANCE = new BLOOD_PRESSURE_CHARACTERISTIC();

    private BLOOD_PRESSURE_CHARACTERISTIC() {
    }

    @Override // com.huami.rawdata_uploader.vo.IRawDataType
    @NotNull
    public String getEventType() {
        return "blood_pressure";
    }

    @Override // com.huami.rawdata_uploader.vo.IRawDataType
    @NotNull
    public String getFileNamePrefix() {
        return "blood_pressure_calibration_features";
    }

    @Override // com.huami.rawdata_uploader.vo.IRawDataType
    @NotNull
    public String getSubType() {
        return BloodPressureRawDataApi.Companion.ParamValue.CALIBRATION_FEATURES_RAW_DATA;
    }

    @Override // com.huami.rawdata_uploader.vo.BloodPressureRawDataType, com.huami.rawdata_uploader.vo.IRawDataType
    @NotNull
    public String getUploadType() {
        return BloodPressureRawDataType.DefaultImpls.getUploadType(this);
    }

    @Override // com.huami.rawdata_uploader.vo.IRawDataType
    public int getValue() {
        return 53;
    }

    @Override // com.huami.rawdata_uploader.vo.IRawDataType
    @NotNull
    public String getValueStr() {
        return BloodPressureRawDataType.DefaultImpls.getValueStr(this);
    }
}
