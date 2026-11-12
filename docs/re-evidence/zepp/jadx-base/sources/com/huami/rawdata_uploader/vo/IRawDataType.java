package com.huami.rawdata_uploader.vo;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0005\u001a\u00020\u0004H&J\b\u0010\u0006\u001a\u00020\u0004H&J\b\u0010\u0007\u001a\u00020\u0004H&J\b\u0010\b\u001a\u00020\u0004H\u0016J\b\u0010\t\u001a\u00020\u0004H&¨\u0006\n"}, d2 = {"Lcom/huami/rawdata_uploader/vo/IRawDataType;", "", "", "getValue", "", "getFileNamePrefix", "getEventType", "getSubType", "getValueStr", "getUploadType", "rawdata-uploader_release"}, k = 1, mv = {1, 5, 1})
public interface IRawDataType {

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class DefaultImpls {
        @NotNull
        public static String getValueStr(@NotNull IRawDataType iRawDataType) {
            return String.valueOf(iRawDataType.getValue());
        }
    }

    @NotNull
    String getEventType();

    @NotNull
    String getFileNamePrefix();

    @NotNull
    String getSubType();

    @NotNull
    String getUploadType();

    int getValue();

    @NotNull
    String getValueStr();
}
