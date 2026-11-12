package com.google.androidbrowserhelper.trusted;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.RemoteException;
import android.text.TextUtils;
import androidx.browser.trusted.e;
import androidx.browser.trusted.i;
import at0.c;
import com.google.androidbrowserhelper.trusted.splashscreens.SplashScreenStrategy;
import r.b;
import r.d;
import r.f;
import r.g;
import vb.h;

/* JADX INFO: loaded from: classes14.dex */
public class TwaLauncher {
    private static final int DEFAULT_SESSION_ID = 96375;
    private static final String TAG = "TwaLauncher";
    private Context mContext;
    private boolean mDestroyed;
    private final int mLaunchMode;
    private final String mProviderPackage;
    private TwaCustomTabsServiceConnection mServiceConnection;
    private g mSession;
    private final int mSessionId;
    private e mTokenStore;
    public static final FallbackStrategy CCT_FALLBACK_STRATEGY = new a(1);
    public static final FallbackStrategy WEBVIEW_FALLBACK_STRATEGY = new a(2);

    public interface FallbackStrategy {
        void launch(Context context, i iVar, String str, Runnable runnable);
    }

    public class TwaCustomTabsServiceConnection extends f {
        private b mCustomTabsCallback;
        private Runnable mOnSessionCreatedRunnable;
        private Runnable mOnSessionCreationFailedRunnable;

        public TwaCustomTabsServiceConnection(b bVar) {
            this.mCustomTabsCallback = bVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSessionCreationRunnables(Runnable runnable, Runnable runnable2) {
            this.mOnSessionCreatedRunnable = runnable;
            this.mOnSessionCreationFailedRunnable = runnable2;
        }

        @Override // r.f
        public void onCustomTabsServiceConnected(ComponentName componentName, d dVar) {
            Runnable runnable;
            Runnable runnable2;
            if (!ChromeLegacyUtils.supportsLaunchWithoutWarmup(TwaLauncher.this.mContext.getPackageManager(), TwaLauncher.this.mProviderPackage)) {
                dVar.getClass();
                try {
                    dVar.f148674a.warmup(0L);
                } catch (RemoteException unused) {
                }
            }
            try {
                TwaLauncher twaLauncher = TwaLauncher.this;
                twaLauncher.mSession = dVar.b(this.mCustomTabsCallback, PendingIntent.getActivity(dVar.f148676c, twaLauncher.mSessionId, new Intent(), 67108864));
                if (TwaLauncher.this.mSession != null && (runnable2 = this.mOnSessionCreatedRunnable) != null) {
                    runnable2.run();
                } else if (TwaLauncher.this.mSession == null && (runnable = this.mOnSessionCreationFailedRunnable) != null) {
                    runnable.run();
                }
            } catch (RuntimeException unused2) {
                this.mOnSessionCreationFailedRunnable.run();
            }
            this.mOnSessionCreatedRunnable = null;
            this.mOnSessionCreationFailedRunnable = null;
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            TwaLauncher.this.mSession = null;
        }
    }

    public TwaLauncher(Context context, String str, int i14, e eVar) {
        this.mContext = context;
        this.mSessionId = i14;
        this.mTokenStore = eVar;
        if (str != null) {
            this.mProviderPackage = str;
            this.mLaunchMode = 0;
        } else {
            TwaProviderPicker.Action actionPickProvider = TwaProviderPicker.pickProvider(context.getPackageManager());
            this.mProviderPackage = actionPickProvider.provider;
            this.mLaunchMode = actionPickProvider.launchMode;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$launchTwa$3(FallbackStrategy fallbackStrategy, i iVar, Runnable runnable) {
        fallbackStrategy.launch(this.mContext, iVar, this.mProviderPackage, runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void lambda$static$0(Context context, i iVar, String str, Runnable runnable) {
        r.e eVarA = iVar.f5327b.a();
        Intent intent = eVarA.f148677a;
        if (str != null) {
            intent.setPackage(str);
        }
        if (ChromeOsSupport.isRunningOnArc(context.getPackageManager())) {
            intent.putExtra("android.support.customtabs.extra.LAUNCH_AS_TRUSTED_WEB_ACTIVITY", true);
        }
        intent.setData(iVar.f5326a);
        a7.b.startActivity(context, intent, eVarA.f148678b);
        if (runnable != null) {
            runnable.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void lambda$static$1(Context context, i iVar, String str, Runnable runnable) {
        context.startActivity(WebViewFallbackActivity.createLaunchIntent(context, iVar.f5326a, LauncherActivityMetadata.parse(context)));
        if (runnable != null) {
            runnable.run();
        }
    }

    private void launchTwa(i iVar, b bVar, SplashScreenStrategy splashScreenStrategy, Runnable runnable, FallbackStrategy fallbackStrategy) {
        if (splashScreenStrategy != null) {
            splashScreenStrategy.onTwaLaunchInitiated(this.mProviderPackage, iVar);
        }
        c cVar = new c(this, iVar, splashScreenStrategy, runnable, 4);
        if (this.mSession != null) {
            cVar.run();
            return;
        }
        c cVar2 = new c(this, fallbackStrategy, iVar, runnable, 5);
        if (this.mServiceConnection == null) {
            this.mServiceConnection = new TwaCustomTabsServiceConnection(bVar);
        }
        this.mServiceConnection.setSessionCreationRunnables(cVar, cVar2);
        Context context = this.mContext;
        String str = this.mProviderPackage;
        TwaCustomTabsServiceConnection twaCustomTabsServiceConnection = this.mServiceConnection;
        twaCustomTabsServiceConnection.setApplicationContext(context.getApplicationContext());
        Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
        if (!TextUtils.isEmpty(str)) {
            intent.setPackage(str);
        }
        context.bindService(intent, twaCustomTabsServiceConnection, 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: launchWhenSessionEstablished, reason: merged with bridge method [inline-methods] */
    public void lambda$launchTwa$2(i iVar, SplashScreenStrategy splashScreenStrategy, Runnable runnable) {
        g gVar = this.mSession;
        if (gVar == null) {
            h.z("mSession is null in launchWhenSessionEstablished");
        } else if (splashScreenStrategy != null) {
            splashScreenStrategy.configureTwaBuilder(iVar, gVar, new a8.d(this, 21, iVar, runnable));
        } else {
            lambda$launchWhenSessionEstablished$4(iVar, runnable);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: launchWhenSplashScreenReady, reason: merged with bridge method [inline-methods] */
    public void lambda$launchWhenSessionEstablished$4(i iVar, Runnable runnable) {
        g gVar;
        if (this.mDestroyed || (gVar = this.mSession) == null) {
            return;
        }
        androidx.browser.trusted.h hVarA = iVar.a(gVar);
        FocusActivity.addToIntent(hVarA.f5324a, this.mContext);
        hVarA.a(this.mContext);
        if (runnable != null) {
            runnable.run();
        }
    }

    public void destroy() {
        if (this.mDestroyed) {
            return;
        }
        TwaCustomTabsServiceConnection twaCustomTabsServiceConnection = this.mServiceConnection;
        if (twaCustomTabsServiceConnection != null) {
            this.mContext.unbindService(twaCustomTabsServiceConnection);
        }
        this.mContext = null;
        this.mDestroyed = true;
    }

    public String getProviderPackage() {
        return this.mProviderPackage;
    }

    public void launch(i iVar, b bVar, SplashScreenStrategy splashScreenStrategy, Runnable runnable, FallbackStrategy fallbackStrategy) {
        TwaLauncher twaLauncher;
        if (this.mDestroyed) {
            h.z("TwaLauncher already destroyed");
            return;
        }
        if (this.mLaunchMode == 0) {
            launchTwa(iVar, bVar, splashScreenStrategy, runnable, fallbackStrategy);
            twaLauncher = this;
        } else {
            twaLauncher = this;
            fallbackStrategy.launch(twaLauncher.mContext, iVar, twaLauncher.mProviderPackage, runnable);
        }
        if (ChromeOsSupport.isRunningOnArc(twaLauncher.mContext.getPackageManager())) {
            return;
        }
        twaLauncher.mTokenStore.store(androidx.browser.trusted.b.a(twaLauncher.mContext.getPackageManager(), twaLauncher.mProviderPackage));
    }

    public TwaLauncher(Context context, String str) {
        this(context, str, DEFAULT_SESSION_ID, new SharedPreferencesTokenStore(context));
    }

    public TwaLauncher(Context context) {
        this(context, null);
    }

    public void launch(Uri uri) {
        launch(new i(uri), new QualityEnforcer(), null, null, null);
    }

    public void launch(i iVar, b bVar, SplashScreenStrategy splashScreenStrategy, Runnable runnable) {
        launch(iVar, bVar, splashScreenStrategy, runnable, CCT_FALLBACK_STRATEGY);
    }
}
