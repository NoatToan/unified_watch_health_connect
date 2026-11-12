package com.example.statistics.export;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.xiaomi.onetrack.c.i;
import com.xiaomi.passport.ui.onetrack.TrackConstants;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\bf\u0018\u0000 !2\u00020\u0001:\u0001!J\b\u0010\u0002\u001a\u00020\u0003H&J)\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0012\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\b\"\u00020\u0001H&¢\u0006\u0002\u0010\tJ(\u0010\u0004\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000b2\u0016\u0010\f\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\rH&J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0010H&J4\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u00142\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00010\r2\u0006\u0010\u0015\u001a\u00020\u0010H&J\b\u0010\u0016\u001a\u00020\u0003H&J\u0010\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u0019H&J\u0010\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u0019H&J\u0010\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\u0010H&J\b\u0010\u001e\u001a\u00020\u0003H&J\b\u0010\u001f\u001a\u00020\u000bH&J\n\u0010 \u001a\u0004\u0018\u00010\u000bH&¨\u0006\""}, d2 = {"Lcom/example/statistics/export/IOnetrack;", "", "init", "", "reportData", "bean", "Lcom/example/statistics/export/OneTrackStatBean;", "args", "", "(Lcom/example/statistics/export/OneTrackStatBean;[Ljava/lang/Object;)V", i.d, "", "params", "", "setPrivacyExperienceAccepted", "accepted", "", "login", "userId", "accountType", "Lcom/example/statistics/export/AccountType;", "skipLoginEvent", TrackConstants.LOGOUT, "addListenerBleLogLoadProgress", "bleLogUploadProgressListener", "Lcom/example/statistics/export/BleLogUploadProgressListener;", "removeListenerBleLogLoadProgress", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "notifyListenerBleLogLoadProgressChanged", "success", "setCommonProperty", "getInstanceID", "getAutoPageTrackCurrentFragmentName", "Companion", "statistics-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface IOnetrack {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/example/statistics/export/IOnetrack$Companion;", "", "<init>", "()V", "statistics-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }
    }

    void addListenerBleLogLoadProgress(@NotNull BleLogUploadProgressListener bleLogUploadProgressListener);

    @Nullable
    String getAutoPageTrackCurrentFragmentName();

    @NotNull
    String getInstanceID();

    void init();

    void login(@NotNull String userId, @NotNull AccountType accountType, @NotNull Map<String, ? extends Object> params, boolean skipLoginEvent);

    void logout();

    void notifyListenerBleLogLoadProgressChanged(boolean success);

    void removeListenerBleLogLoadProgress(@NotNull BleLogUploadProgressListener listener);

    void reportData(@NotNull OneTrackStatBean bean, @NotNull Object... args);

    void reportData(@NotNull String eventName, @NotNull Map<String, ? extends Object> params);

    void setCommonProperty();

    void setPrivacyExperienceAccepted(boolean accepted);
}
