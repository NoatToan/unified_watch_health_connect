package com.huami.bloodoxygen.core.remote.upload;

import com.huami.bloodoxygen.core.local.database.entity.ClickMeasuredSpo2;
import com.huami.bloodoxygen.core.local.database.entity.Odi;
import com.huami.bloodoxygen.core.local.database.entity.OsaEvent;
import com.xiaomi.mipush.sdk.MiPushClient;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0004\u001a\u00020\u0002H&J\b\u0010\u0006\u001a\u00020\u0005H&J\u0014\u0010\t\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007H&J\b\u0010\n\u001a\u00020\u0002H&J\u0016\u0010\u000e\u001a\u00020\u00052\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH&J\u0016\u0010\u0010\u001a\u00020\u00052\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000bH&J\u0016\u0010\u0012\u001a\u00020\u00052\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00110\u000bH&¨\u0006\u0013"}, d2 = {"Lcom/huami/bloodoxygen/core/remote/upload/IUploader;", "", "", "register", MiPushClient.COMMAND_UNREGISTER, "", "uploadAll", "", "date", "uploadAlgoResultData", "uploadAlgoResultDataInScope", "", "Lcom/huami/bloodoxygen/core/local/database/entity/Odi;", "list", "uploadOdis", "Lcom/huami/bloodoxygen/core/local/database/entity/OsaEvent;", "uploadOsaEvents", "Lcom/huami/bloodoxygen/core/local/database/entity/ClickMeasuredSpo2;", "uploadClickSpo2s", "core_release"}, k = 1, mv = {1, 5, 1})
public interface IUploader {

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class DefaultImpls {
        public static /* synthetic */ boolean uploadAlgoResultData$default(IUploader iUploader, String str, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: uploadAlgoResultData");
            }
            if ((i & 1) != 0) {
                str = null;
            }
            return iUploader.uploadAlgoResultData(str);
        }
    }

    void register();

    void unregister();

    boolean uploadAlgoResultData(@Nullable String date);

    void uploadAlgoResultDataInScope();

    boolean uploadAll();

    boolean uploadClickSpo2s(@NotNull List<ClickMeasuredSpo2> list);

    boolean uploadOdis(@NotNull List<Odi> list);

    boolean uploadOsaEvents(@NotNull List<OsaEvent> list);
}
