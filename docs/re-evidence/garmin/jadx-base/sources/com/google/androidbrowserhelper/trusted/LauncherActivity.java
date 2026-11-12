package com.google.androidbrowserhelper.trusted;

import a7.b;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Matrix;
import android.net.Uri;
import android.os.Bundle;
import android.util.SparseArray;
import android.widget.ImageView;
import androidx.browser.trusted.g;
import androidx.browser.trusted.i;
import cd0.h0;
import com.google.androidbrowserhelper.trusted.splashscreens.PwaWrapperSplashScreenStrategy;
import java.util.List;
import org.json.JSONException;
import r.e;

/* JADX INFO: loaded from: classes14.dex */
public class LauncherActivity extends Activity {
    private static final String BROWSER_WAS_LAUNCHED_KEY = "android.support.customtabs.trusted.BROWSER_WAS_LAUNCHED_KEY";
    private static final String FALLBACK_TYPE_WEBVIEW = "webview";
    private static final String TAG = "TWALauncherActivity";
    private static boolean sChromeVersionChecked;
    private static int sLauncherActivitiesAlive;
    private boolean mBrowserWasLaunched;
    private LauncherActivityMetadata mMetadata;
    private PwaWrapperSplashScreenStrategy mSplashScreenStrategy;
    private TwaLauncher mTwaLauncher;

    private void addShareDataIfPresent(i iVar) {
        String str;
        s.a aVarRetrieveShareDataFromIntent = SharingUtils.retrieveShareDataFromIntent(getIntent());
        if (aVarRetrieveShareDataFromIntent == null || (str = this.mMetadata.shareTarget) == null) {
            return;
        }
        try {
            iVar.f5331f = SharingUtils.parseShareTargetJson(str);
            iVar.f5330e = aVarRetrieveShareDataFromIntent;
        } catch (JSONException e4) {
            e4.toString();
        }
    }

    private int getColorCompat(int i14) {
        return b.getColor(this, i14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$launchTwa$0() {
        this.mBrowserWasLaunched = true;
    }

    private boolean restartInNewTask() {
        boolean z14 = (getIntent().getFlags() & 268435456) != 0;
        boolean z15 = (getIntent().getFlags() & 524288) != 0;
        if (z14 && !z15) {
            return false;
        }
        Intent intent = new Intent(getIntent());
        intent.setFlags((268435456 | getIntent().getFlags()) & (-524289));
        startActivity(intent);
        return true;
    }

    private boolean splashScreenNeeded() {
        if (this.mMetadata.splashImageDrawableId == 0) {
            return false;
        }
        return isTaskRoot();
    }

    public TwaLauncher createTwaLauncher() {
        return new TwaLauncher(this);
    }

    public r.b getCustomTabsCallback() {
        return new QualityEnforcer();
    }

    public g getDisplayMode() {
        return this.mMetadata.displayMode;
    }

    public TwaLauncher.FallbackStrategy getFallbackStrategy() {
        return FALLBACK_TYPE_WEBVIEW.equalsIgnoreCase(this.mMetadata.fallbackStrategyType) ? TwaLauncher.WEBVIEW_FALLBACK_STRATEGY : TwaLauncher.CCT_FALLBACK_STRATEGY;
    }

    public Uri getLaunchingUrl() {
        Uri data = getIntent().getData();
        if (data != null) {
            data.toString();
            return data;
        }
        String str = this.mMetadata.defaultUrl;
        return str != null ? Uri.parse(str) : Uri.parse("https://www.example.com/");
    }

    public ImageView.ScaleType getSplashImageScaleType() {
        return ImageView.ScaleType.CENTER;
    }

    public Matrix getSplashImageTransformationMatrix() {
        return null;
    }

    public void launchTwa() {
        if (isFinishing()) {
            return;
        }
        r.a.C2800a c2800a = new r.a.C2800a();
        c2800a.f148636a = Integer.valueOf(getColorCompat(this.mMetadata.statusBarColorDarkId) | (-16777216));
        c2800a.f148637b = Integer.valueOf(getColorCompat(this.mMetadata.navigationBarColorDarkId) | (-16777216));
        Integer numValueOf = Integer.valueOf(getColorCompat(this.mMetadata.navigationBarDividerColorDarkId));
        c2800a.f148638c = numValueOf;
        r.a aVar = new r.a(c2800a.f148636a, null, c2800a.f148637b, numValueOf);
        i iVar = new i(getLaunchingUrl());
        int colorCompat = getColorCompat(this.mMetadata.statusBarColorId);
        e.d dVar = iVar.f5327b;
        r.a.C2800a c2800a2 = dVar.f148680b;
        r.a.C2800a c2800a3 = dVar.f148680b;
        c2800a2.f148636a = Integer.valueOf(colorCompat | (-16777216));
        c2800a3.f148637b = Integer.valueOf(getColorCompat(this.mMetadata.navigationBarColorId) | (-16777216));
        c2800a3.f148638c = Integer.valueOf(getColorCompat(this.mMetadata.navigationBarDividerColorId));
        dVar.f148679a.putExtra("androidx.browser.customtabs.extra.COLOR_SCHEME", 0);
        if (dVar.f148682d == null) {
            dVar.f148682d = new SparseArray<>();
        }
        dVar.f148682d.put(2, aVar.b());
        iVar.f5332g = getDisplayMode();
        LauncherActivityMetadata launcherActivityMetadata = this.mMetadata;
        iVar.f5333h = launcherActivityMetadata.screenOrientation;
        List<String> list = launcherActivityMetadata.additionalTrustedOrigins;
        if (list != null) {
            iVar.f5328c = list;
        }
        addShareDataIfPresent(iVar);
        TwaLauncher twaLauncherCreateTwaLauncher = createTwaLauncher();
        this.mTwaLauncher = twaLauncherCreateTwaLauncher;
        twaLauncherCreateTwaLauncher.launch(iVar, getCustomTabsCallback(), this.mSplashScreenStrategy, new h0(this, 17), getFallbackStrategy());
        if (!sChromeVersionChecked) {
            ChromeUpdatePrompt.promptIfNeeded(this, this.mTwaLauncher.getProviderPackage());
            sChromeVersionChecked = true;
        }
        if (ChromeOsSupport.isRunningOnArc(getApplicationContext().getPackageManager())) {
            new TwaSharedPreferencesManager(this).writeLastLaunchedProviderPackageName(ChromeOsSupport.ARC_PAYMENT_APP);
        } else {
            new TwaSharedPreferencesManager(this).writeLastLaunchedProviderPackageName(this.mTwaLauncher.getProviderPackage());
        }
        ManageDataLauncherActivity.addSiteSettingsShortcut(this, this.mTwaLauncher.getProviderPackage());
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int i14 = sLauncherActivitiesAlive + 1;
        sLauncherActivitiesAlive = i14;
        boolean z14 = i14 > 1;
        boolean z15 = getIntent().getData() != null;
        boolean zIsShareIntent = SharingUtils.isShareIntent(getIntent());
        if (z14 && !z15 && !zIsShareIntent) {
            finish();
            return;
        }
        if (restartInNewTask()) {
            finish();
            return;
        }
        if (bundle != null && bundle.getBoolean(BROWSER_WAS_LAUNCHED_KEY)) {
            finish();
            return;
        }
        this.mMetadata = LauncherActivityMetadata.parse(this);
        if (splashScreenNeeded()) {
            LauncherActivityMetadata launcherActivityMetadata = this.mMetadata;
            int i15 = launcherActivityMetadata.splashImageDrawableId;
            int colorCompat = getColorCompat(launcherActivityMetadata.splashScreenBackgroundColorId);
            ImageView.ScaleType splashImageScaleType = getSplashImageScaleType();
            Matrix splashImageTransformationMatrix = getSplashImageTransformationMatrix();
            LauncherActivityMetadata launcherActivityMetadata2 = this.mMetadata;
            this.mSplashScreenStrategy = new PwaWrapperSplashScreenStrategy(this, i15, colorCompat, splashImageScaleType, splashImageTransformationMatrix, launcherActivityMetadata2.splashScreenFadeOutDurationMillis, launcherActivityMetadata2.fileProviderAuthority);
        }
        if (shouldLaunchImmediately()) {
            launchTwa();
        }
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        sLauncherActivitiesAlive--;
        TwaLauncher twaLauncher = this.mTwaLauncher;
        if (twaLauncher != null) {
            twaLauncher.destroy();
        }
        PwaWrapperSplashScreenStrategy pwaWrapperSplashScreenStrategy = this.mSplashScreenStrategy;
        if (pwaWrapperSplashScreenStrategy != null) {
            pwaWrapperSplashScreenStrategy.destroy();
        }
    }

    @Override // android.app.Activity
    public void onEnterAnimationComplete() {
        super.onEnterAnimationComplete();
        PwaWrapperSplashScreenStrategy pwaWrapperSplashScreenStrategy = this.mSplashScreenStrategy;
        if (pwaWrapperSplashScreenStrategy != null) {
            pwaWrapperSplashScreenStrategy.onActivityEnterAnimationComplete();
        }
    }

    @Override // android.app.Activity
    public void onRestart() {
        super.onRestart();
        if (this.mBrowserWasLaunched) {
            finish();
        }
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean(BROWSER_WAS_LAUNCHED_KEY, this.mBrowserWasLaunched);
    }

    public boolean shouldLaunchImmediately() {
        return true;
    }
}
