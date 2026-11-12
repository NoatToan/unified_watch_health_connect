package com.xiaomi.wearable.yrn.export;

import android.net.Uri;
import com.xiaomi.fitness.util.SportRecordBundleKey;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eJ\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\u001a\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0007H&J\u0010\u0010\u0005\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH&J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH&J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH&J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH&¨\u0006\u000f"}, d2 = {"Lcom/xiaomi/wearable/yrn/export/YRNPushHandler;", "", "afterInit", "", "clearMessages", "handlePushRNPage", "pageUrl", "", "operationSource", SportRecordBundleKey.BUNDLE_PARAM_URI, "Landroid/net/Uri;", "handlePushMessage", "handleNotificationClick", "handleSchemeMessage", "Companion", "yrn-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface YRNPushHandler {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/xiaomi/wearable/yrn/export/YRNPushHandler$Companion;", "", "<init>", "()V", "yrn-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }
    }

    void afterInit();

    void clearMessages();

    void handleNotificationClick(@NotNull Uri uri);

    void handlePushMessage(@NotNull Uri uri);

    void handlePushRNPage(@NotNull Uri uri);

    void handlePushRNPage(@NotNull String pageUrl, @Nullable String operationSource);

    void handleSchemeMessage(@NotNull Uri uri);
}
