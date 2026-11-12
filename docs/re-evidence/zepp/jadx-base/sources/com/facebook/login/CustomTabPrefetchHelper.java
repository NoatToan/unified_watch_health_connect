package com.facebook.login;

import android.content.ComponentName;
import android.net.Uri;
import androidx.browser.customtabs.CustomTabsClient;
import androidx.browser.customtabs.CustomTabsServiceConnection;
import androidx.browser.customtabs.CustomTabsSession;
import com.ximalaya.ting.android.opensdk.player.statistic.OpenSdkPlayStatisticUpload;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\r"}, d2 = {"Lcom/facebook/login/CustomTabPrefetchHelper;", "Landroidx/browser/customtabs/CustomTabsServiceConnection;", "Landroid/content/ComponentName;", "name", "Landroidx/browser/customtabs/CustomTabsClient;", "newClient", "", "onCustomTabsServiceConnected", "componentName", "onServiceDisconnected", "<init>", "()V", "Companion", "facebook-common_release"}, k = 1, mv = {1, 5, 1})
public final class CustomTabPrefetchHelper extends CustomTabsServiceConnection {
    private static CustomTabsClient a;
    private static CustomTabsSession b;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final ReentrantLock c = new ReentrantLock();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\n\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0007R\u0018\u0010\n\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\r\u001a\u00020\f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lcom/facebook/login/CustomTabPrefetchHelper$Companion;", "", "", "a", "Landroid/net/Uri;", "url", "mayLaunchUrl", "Landroidx/browser/customtabs/CustomTabsSession;", "getPreparedSessionOnce", "Landroidx/browser/customtabs/CustomTabsClient;", OpenSdkPlayStatisticUpload.KEY_CLIENT, "Landroidx/browser/customtabs/CustomTabsClient;", "Ljava/util/concurrent/locks/ReentrantLock;", "lock", "Ljava/util/concurrent/locks/ReentrantLock;", com.google.firebase.crashlytics.internal.settings.b.c, "Landroidx/browser/customtabs/CustomTabsSession;", "<init>", "()V", "facebook-common_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void a() {
            CustomTabsClient customTabsClient;
            CustomTabPrefetchHelper.c.lock();
            if (CustomTabPrefetchHelper.b == null && (customTabsClient = CustomTabPrefetchHelper.a) != null) {
                CustomTabPrefetchHelper.b = customTabsClient.newSession(null);
            }
            CustomTabPrefetchHelper.c.unlock();
        }

        @JvmStatic
        @Nullable
        public final CustomTabsSession getPreparedSessionOnce() {
            CustomTabPrefetchHelper.c.lock();
            CustomTabsSession customTabsSession = CustomTabPrefetchHelper.b;
            CustomTabPrefetchHelper.b = null;
            CustomTabPrefetchHelper.c.unlock();
            return customTabsSession;
        }

        @JvmStatic
        public final void mayLaunchUrl(@NotNull Uri url) {
            a();
            CustomTabPrefetchHelper.c.lock();
            CustomTabsSession customTabsSession = CustomTabPrefetchHelper.b;
            if (customTabsSession != null) {
                customTabsSession.mayLaunchUrl(url, null, null);
            }
            CustomTabPrefetchHelper.c.unlock();
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @JvmStatic
    @Nullable
    public static final CustomTabsSession getPreparedSessionOnce() {
        return INSTANCE.getPreparedSessionOnce();
    }

    @JvmStatic
    public static final void mayLaunchUrl(@NotNull Uri uri) {
        INSTANCE.mayLaunchUrl(uri);
    }

    @Override // androidx.browser.customtabs.CustomTabsServiceConnection
    public void onCustomTabsServiceConnected(@NotNull ComponentName name, @NotNull CustomTabsClient newClient) {
        newClient.warmup(0L);
        a = newClient;
        INSTANCE.a();
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(@NotNull ComponentName componentName) {
    }
}
