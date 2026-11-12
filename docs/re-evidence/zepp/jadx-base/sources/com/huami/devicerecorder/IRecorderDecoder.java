package com.huami.devicerecorder;

import androidx.annotation.WorkerThread;
import com.xmlywind.sdk.common.mta.PointCategory;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H'J\b\u0010\u0004\u001a\u00020\u0002H'J\"\u0010\n\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u0007H'¨\u0006\u000b"}, d2 = {"Lcom/huami/devicerecorder/IRecorderDecoder;", "", "", PointCategory.INIT, "deInit", "", "opusFilePath", "", "deleteOriginFile", "deleteMidFile", "decodeRecord", "device-recorder_release"}, k = 1, mv = {1, 5, 1})
public interface IRecorderDecoder {

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class DefaultImpls {
        public static /* synthetic */ String decodeRecord$default(IRecorderDecoder iRecorderDecoder, String str, boolean z, boolean z2, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decodeRecord");
            }
            if ((i & 4) != 0) {
                z2 = true;
            }
            return iRecorderDecoder.decodeRecord(str, z, z2);
        }
    }

    @WorkerThread
    void deInit();

    @WorkerThread
    @NotNull
    String decodeRecord(@NotNull String opusFilePath, boolean deleteOriginFile, boolean deleteMidFile);

    @WorkerThread
    void init();
}
