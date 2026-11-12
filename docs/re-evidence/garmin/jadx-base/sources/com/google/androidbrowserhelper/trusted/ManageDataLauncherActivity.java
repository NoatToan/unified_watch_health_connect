package com.google.androidbrowserhelper.trusted;

import am.j;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ShortcutInfo;
import android.content.pm.ShortcutManager;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.Toast;
import com.google.androidbrowserhelper.R;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import r.b;
import r.d;
import r.e;
import r.f;
import r.g;

/* JADX INFO: loaded from: classes14.dex */
public class ManageDataLauncherActivity extends Activity {
    public static final String ACTION_MANAGE_TRUSTED_WEB_ACTIVITY_DATA = "android.support.customtabs.action.ACTION_MANAGE_TRUSTED_WEB_ACTIVITY_DATA";
    public static final String CATEGORY_LAUNCH_SITE_SETTINGS = "androidx.browser.trusted.category.LaunchSiteSettings";
    private static final String METADATA_MANAGE_SPACE_DEFAULT_URL = "android.support.customtabs.trusted.MANAGE_SPACE_URL";
    public static final String OVERRIDE_IC_SITE_SETTINGS_ID = "drawable/override_ic_site_settings";
    public static final String SITE_SETTINGS_SHORTCUT_ID = "android.support.customtabs.action.SITE_SETTINGS_SHORTCUT";
    private static final String TAG = "ManageDataLauncher";
    private f mConnection;
    private String mProviderPackage;

    public class Connection extends f {
        private Connection() {
        }

        @Override // r.f
        public void onCustomTabsServiceConnected(ComponentName componentName, d dVar) {
            if (ManageDataLauncherActivity.this.isFinishing()) {
                return;
            }
            ManageDataLauncherActivity.this.launchSettings(dVar.b(null, null));
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }
    }

    public class LegacyChromeConnection extends f {
        private b mCustomTabsCallback;
        private g mSession;

        private LegacyChromeConnection() {
            this.mCustomTabsCallback = new b() { // from class: com.google.androidbrowserhelper.trusted.ManageDataLauncherActivity.LegacyChromeConnection.1
                @Override // r.b
                public void onRelationshipValidationResult(int i14, Uri uri, boolean z14, Bundle bundle) {
                    if (ManageDataLauncherActivity.this.isFinishing()) {
                        return;
                    }
                    LegacyChromeConnection legacyChromeConnection = LegacyChromeConnection.this;
                    if (z14) {
                        ManageDataLauncherActivity.this.launchSettings(legacyChromeConnection.mSession);
                    } else {
                        ManageDataLauncherActivity.this.onError(new RuntimeException(j.j(uri, "Failed to validate origin ")));
                        ManageDataLauncherActivity.this.finish();
                    }
                }
            };
        }

        @Override // r.f
        public void onCustomTabsServiceConnected(ComponentName componentName, d dVar) {
            boolean zWarmup;
            if (ManageDataLauncherActivity.this.isFinishing()) {
                return;
            }
            Uri defaultUrlForManagingSpace = ManageDataLauncherActivity.this.getDefaultUrlForManagingSpace();
            if (defaultUrlForManagingSpace == null) {
                ManageDataLauncherActivity.this.onError(new RuntimeException("Can't launch settings without an url"));
                ManageDataLauncherActivity.this.finish();
                return;
            }
            this.mSession = dVar.b(this.mCustomTabsCallback, null);
            try {
                zWarmup = dVar.f148674a.warmup(0L);
            } catch (RemoteException unused) {
                zWarmup = false;
            }
            if (!zWarmup) {
                ManageDataLauncherActivity.this.handleTwaNeverLaunched();
                return;
            }
            g gVar = this.mSession;
            gVar.getClass();
            try {
                gVar.f148685a.validateRelationship(gVar.f148686b, 2, defaultUrlForManagingSpace, gVar.a());
            } catch (RemoteException unused2) {
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }
    }

    public static void addSiteSettingsShortcut(Context context, String str) {
        PackageManager packageManager = context.getPackageManager();
        ShortcutManager shortcutManager = (ShortcutManager) context.getSystemService(ShortcutManager.class);
        if (!packageSupportsSiteSettings(str, packageManager)) {
            shortcutManager.removeDynamicShortcuts(Collections.singletonList(SITE_SETTINGS_SHORTCUT_ID));
            return;
        }
        ShortcutInfo siteSettingsShortcutOrNull = getSiteSettingsShortcutOrNull(context, packageManager);
        if (siteSettingsShortcutOrNull == null) {
            shortcutManager.removeDynamicShortcuts(Collections.singletonList(SITE_SETTINGS_SHORTCUT_ID));
        } else {
            shortcutManager.addDynamicShortcuts(Collections.singletonList(siteSettingsShortcutOrNull));
        }
    }

    public static ShortcutInfo getSiteSettingsShortcutOrNull(Context context, PackageManager packageManager) {
        Intent intent = new Intent(context, (Class<?>) ManageDataLauncherActivity.class);
        intent.setAction(ACTION_MANAGE_TRUSTED_WEB_ACTIVITY_DATA);
        if (packageManager.queryIntentActivities(intent, 65536).size() == 0) {
            return null;
        }
        int identifier = context.getResources().getIdentifier(OVERRIDE_IC_SITE_SETTINGS_ID, "drawable", context.getPackageName());
        ShortcutInfo.Builder longLabel = new ShortcutInfo.Builder(context, SITE_SETTINGS_SHORTCUT_ID).setShortLabel("Site Settings").setLongLabel("Manage website notifications, permissions, etc.");
        if (identifier == 0) {
            identifier = R.drawable.ic_site_settings;
        }
        return longLabel.setIcon(Icon.createWithResource(context, identifier)).setIntent(intent).build();
    }

    private static boolean launchBrowserSiteSettings(Activity activity, g gVar, String str, Uri uri) {
        e.d dVar = new e.d();
        dVar.b(gVar);
        Intent intent = dVar.a().f148677a;
        intent.setAction(ACTION_MANAGE_TRUSTED_WEB_ACTIVITY_DATA);
        intent.setPackage(str);
        intent.setData(uri);
        try {
            activity.startActivity(intent);
            return true;
        } catch (ActivityNotFoundException unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void launchSettings(g gVar) {
        if (launchBrowserSiteSettings(this, gVar, this.mProviderPackage, getDefaultUrlForManagingSpace())) {
            finish();
        } else {
            handleNoSupportForManageSpace();
        }
    }

    public static boolean packageSupportsSiteSettings(String str, PackageManager packageManager) {
        if (str == null) {
            return false;
        }
        if (ChromeLegacyUtils.supportsSiteSettings(packageManager, str)) {
            return true;
        }
        Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
        intent.addCategory(CATEGORY_LAUNCH_SITE_SETTINGS);
        intent.setPackage(str);
        return packageManager.queryIntentServices(intent, 64).size() > 0;
    }

    private boolean supportsTrustedWebActivities(String str) {
        IntentFilter intentFilter;
        if (ChromeLegacyUtils.supportsTrustedWebActivities(getPackageManager(), str)) {
            return true;
        }
        List<ResolveInfo> listQueryIntentServices = getPackageManager().queryIntentServices(new Intent("android.support.customtabs.action.CustomTabsService").setPackage(str), 64);
        return (listQueryIntentServices.isEmpty() || (intentFilter = listQueryIntentServices.get(0).filter) == null || !intentFilter.hasCategory("androidx.browser.trusted.category.TrustedWebActivities")) ? false : true;
    }

    public View createLoadingView() {
        View progressBar = new ProgressBar(this);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        progressBar.setLayoutParams(layoutParams);
        FrameLayout frameLayout = new FrameLayout(this);
        frameLayout.addView(progressBar);
        return frameLayout;
    }

    public Uri getDefaultUrlForManagingSpace() {
        try {
            ActivityInfo activityInfo = getPackageManager().getActivityInfo(getComponentName(), 128);
            Bundle bundle = activityInfo.metaData;
            if (bundle == null || !bundle.containsKey(METADATA_MANAGE_SPACE_DEFAULT_URL)) {
                return null;
            }
            Uri uri = Uri.parse(activityInfo.metaData.getString(METADATA_MANAGE_SPACE_DEFAULT_URL));
            Objects.toString(uri);
            return uri;
        } catch (PackageManager.NameNotFoundException e4) {
            onError(new RuntimeException(e4));
            return null;
        }
    }

    public void handleNoSupportForManageSpace() {
        String string;
        try {
            string = getPackageManager().getApplicationLabel(getPackageManager().getApplicationInfo(this.mProviderPackage, 0)).toString();
        } catch (PackageManager.NameNotFoundException unused) {
            string = this.mProviderPackage;
        }
        Toast.makeText(this, getString(R.string.manage_space_not_supported_toast, string), 1).show();
        finish();
    }

    public void handleTwaNeverLaunched() {
        Toast.makeText(this, getString(R.string.manage_space_no_data_toast), 1).show();
        finish();
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String lastLaunchedProviderPackageName = new TwaSharedPreferencesManager(this).readLastLaunchedProviderPackageName();
        this.mProviderPackage = lastLaunchedProviderPackageName;
        if (lastLaunchedProviderPackageName == null) {
            handleTwaNeverLaunched();
            return;
        }
        if (!supportsTrustedWebActivities(lastLaunchedProviderPackageName)) {
            handleNoSupportForManageSpace();
            return;
        }
        View viewCreateLoadingView = createLoadingView();
        if (viewCreateLoadingView != null) {
            setContentView(viewCreateLoadingView);
        }
        if (ChromeLegacyUtils.supportsManageSpaceWithoutWarmupAndValidation(getPackageManager(), this.mProviderPackage)) {
            this.mConnection = new Connection();
        } else {
            this.mConnection = new LegacyChromeConnection();
        }
        String str = this.mProviderPackage;
        f fVar = this.mConnection;
        fVar.setApplicationContext(getApplicationContext());
        Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
        if (!TextUtils.isEmpty(str)) {
            intent.setPackage(str);
        }
        bindService(intent, fVar, 33);
    }

    public void onError(RuntimeException runtimeException) {
        throw runtimeException;
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        f fVar = this.mConnection;
        if (fVar != null) {
            unbindService(fVar);
        }
        finish();
    }
}
