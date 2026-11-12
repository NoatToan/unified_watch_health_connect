package com.huami.rawdata_uploader.vo;

import com.huami.rawdata_uploader.file.remote.BloodPressureFileUploadRepo;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, d2 = {"Lcom/huami/rawdata_uploader/vo/BloodPressureRawDataType;", "Lcom/huami/rawdata_uploader/vo/IRawDataType;", "", "getUploadType", "rawdata-uploader_release"}, k = 1, mv = {1, 5, 1})
public interface BloodPressureRawDataType extends IRawDataType {

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class DefaultImpls {
        @NotNull
        public static String getUploadType(@NotNull BloodPressureRawDataType bloodPressureRawDataType) {
            return BloodPressureFileUploadRepo.INSTANCE.getPARAM_BP_FILE_TYPE();
        }

        @NotNull
        public static String getValueStr(@NotNull BloodPressureRawDataType bloodPressureRawDataType) {
            return IRawDataType.DefaultImpls.getValueStr(bloodPressureRawDataType);
        }
    }

    @Override // com.huami.rawdata_uploader.vo.IRawDataType
    @NotNull
    String getUploadType();
}
