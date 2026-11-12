package com.xiaomi.hm.health.utils;

import com.huami.feedback.api.UploadFileSetting;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.koin.core.Koin;
import org.koin.core.context.GlobalContext;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0003\u001a\u00020\u0002H\u0007R\u0016\u0010\u0007\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/xiaomi/hm/health/utils/BleLogUploadHelper;", "", "", "addToFeedback", "", "a", "Ljava/lang/String;", "LOG_FILE_NAME", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class BleLogUploadHelper {

    @NotNull
    public static final BleLogUploadHelper INSTANCE = new BleLogUploadHelper();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private static final String LOG_FILE_NAME = "hmble_log.log";

    private BleLogUploadHelper() {
    }

    @JvmStatic
    public static final void addToFeedback() {
        UploadFileSetting uploadFileSetting;
        Koin orNull = GlobalContext.INSTANCE.getOrNull();
        if (orNull == null || (uploadFileSetting = (UploadFileSetting) orNull.getScopeRegistry().getRootScope().getOrNull(Reflection.getOrCreateKotlinClass(UploadFileSetting.class), null, null)) == null) {
            return;
        }
        uploadFileSetting.addUploadFileName(LOG_FILE_NAME);
    }
}
