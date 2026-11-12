package com.facebook.internal;

import android.os.RemoteException;
import com.android.installreferrer.api.InstallReferrerClient;
import com.android.installreferrer.api.InstallReferrerStateListener;
import com.facebook.FacebookSdk;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.text.StringsKt__StringsKt;
import org.cybergarage.soap.SOAP;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0011B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0007\u001a\u00020\u0004H\u0002R\u0016\u0010\u000b\u001a\u00020\b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0016\u0010\u000e\u001a\u00020\f8B@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\r¨\u0006\u0012"}, d2 = {"Lcom/facebook/internal/InstallReferrerUtil;", "", "Lcom/facebook/internal/InstallReferrerUtil$Callback;", "callback", "", "tryUpdateReferrerInfo", "b", "c", "", "a", "Ljava/lang/String;", "IS_REFERRER_UPDATED", "", "()Z", "isUpdated", "<init>", "()V", "Callback", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
public final class InstallReferrerUtil {

    @NotNull
    public static final InstallReferrerUtil INSTANCE = new InstallReferrerUtil();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private static final String IS_REFERRER_UPDATED = "is_referrer_updated";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¨\u0006\u0006"}, d2 = {"Lcom/facebook/internal/InstallReferrerUtil$Callback;", "", "", SOAP.XMLNS, "", "onReceiveReferrerUrl", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public interface Callback {
        void onReceiveReferrerUrl(@Nullable String s);
    }

    private InstallReferrerUtil() {
    }

    private final boolean a() {
        return FacebookSdk.getApplicationContext().getSharedPreferences(FacebookSdk.APP_EVENT_PREFERENCES, 0).getBoolean(IS_REFERRER_UPDATED, false);
    }

    private final void b(final Callback callback) {
        final InstallReferrerClient installReferrerClientBuild = InstallReferrerClient.newBuilder(FacebookSdk.getApplicationContext()).build();
        try {
            installReferrerClientBuild.startConnection(new InstallReferrerStateListener() { // from class: com.facebook.internal.InstallReferrerUtil$tryConnectReferrerInfo$installReferrerStateListener$1
                @Override // com.android.installreferrer.api.InstallReferrerStateListener
                public void onInstallReferrerServiceDisconnected() {
                }

                @Override // com.android.installreferrer.api.InstallReferrerStateListener
                public void onInstallReferrerSetupFinished(int responseCode) {
                    if (CrashShieldHandler.isObjectCrashing(this)) {
                        return;
                    }
                    try {
                        if (responseCode != 0) {
                            if (responseCode != 2) {
                                return;
                            }
                            InstallReferrerUtil.INSTANCE.c();
                            return;
                        }
                        try {
                            String installReferrer = installReferrerClientBuild.getInstallReferrer().getInstallReferrer();
                            if (installReferrer != null && (StringsKt__StringsKt.contains$default((CharSequence) installReferrer, (CharSequence) "fb", false, 2, (Object) null) || StringsKt__StringsKt.contains$default((CharSequence) installReferrer, (CharSequence) "facebook", false, 2, (Object) null))) {
                                callback.onReceiveReferrerUrl(installReferrer);
                            }
                            InstallReferrerUtil.INSTANCE.c();
                        } catch (RemoteException unused) {
                        }
                    } catch (Throwable th) {
                        CrashShieldHandler.handleThrowable(th, this);
                    }
                }
            });
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c() {
        FacebookSdk.getApplicationContext().getSharedPreferences(FacebookSdk.APP_EVENT_PREFERENCES, 0).edit().putBoolean(IS_REFERRER_UPDATED, true).apply();
    }

    @JvmStatic
    public static final void tryUpdateReferrerInfo(@NotNull Callback callback) {
        InstallReferrerUtil installReferrerUtil = INSTANCE;
        if (installReferrerUtil.a()) {
            return;
        }
        installReferrerUtil.b(callback);
    }
}
