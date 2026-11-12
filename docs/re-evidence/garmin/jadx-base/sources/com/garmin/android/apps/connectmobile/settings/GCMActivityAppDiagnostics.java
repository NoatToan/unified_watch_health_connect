package com.garmin.android.apps.connectmobile.settings;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.text.TextUtils;
import android.util.Base64;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebView;
import android.widget.Toast;
import androidx.core.content.FileProvider;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.z1;
import com.garmin.android.gncs.GNCSListenerService;
import com.garmin.android.gncs.settings.SmartNotificationsConfig;
import ew1.h1;
import f12.l;
import f20.i;
import j83.m;
import java.io.File;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import pi1.h;
import rx.schedulers.Schedulers;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 -2\u00020\u0001:\u0001.B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0003J#\u0010\f\u001a\u00020\u000b2\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0013\u001a\u00020\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0015\u0010\u0003J\u000f\u0010\u0016\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0016\u0010\u0003J\u0019\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001c\u0010\u001bJ\u0017\u0010\u001f\u001a\u00020\u00192\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0004H\u0017¢\u0006\u0004\b!\u0010\u0003J\u000f\u0010\"\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\"\u0010#R\u0016\u0010%\u001a\u00020$8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b%\u0010&R\u0016\u0010'\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u0016\u0010)\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010(R\u0018\u0010+\u001a\u0004\u0018\u00010*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,¨\u0006/"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/GCMActivityAppDiagnostics;", "Lcom/garmin/android/apps/connectmobile/z1;", "<init>", "()V", "", "shareReportPreCheck", "shareReportPostCheck", "", "subject", "Landroid/net/Uri;", "attachment", "Landroid/content/Intent;", "createShareChooser", "(Ljava/lang/String;Landroid/net/Uri;)Landroid/content/Intent;", "Lj83/l;", "createZipFile", "()Lj83/l;", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "onResume", "onPause", "Landroid/view/Menu;", "menu", "", "onCreateOptionsMenu", "(Landroid/view/Menu;)Z", "onPrepareOptionsMenu", "Landroid/view/MenuItem;", "item", "onOptionsItemSelected", "(Landroid/view/MenuItem;)Z", "onBackPressed", "onNavigateUp", "()Z", "Landroid/webkit/WebView;", "mWebView", "Landroid/webkit/WebView;", "mIsActivityAlive", "Z", "mCalledByMobileAuth", "Lorg/slf4j/Logger;", "mLogger", "Lorg/slf4j/Logger;", "Companion", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class GCMActivityAppDiagnostics extends z1 {
    private static final String EXTRA_CALLED_BY_MOBILE_AUTH = "calledByMobileAuth";
    private static final String TAG = "AppDiagnostics";
    private boolean mCalledByMobileAuth;
    private boolean mIsActivityAlive;
    private Logger mLogger;
    private WebView mWebView;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001¨\u0006\u0003"}, d2 = {"com/garmin/android/apps/connectmobile/settings/GCMActivityAppDiagnostics$b", "Lj83/m;", "", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b extends m<String> {
        public b() {
        }

        @Override // j83.m
        public final void b(Throwable th3) {
            GCMActivityAppDiagnostics.this.hideProgressOverlay();
        }

        @Override // j83.m
        public final void c(String str) {
            String str2 = str;
            GCMActivityAppDiagnostics gCMActivityAppDiagnostics = GCMActivityAppDiagnostics.this;
            gCMActivityAppDiagnostics.hideProgressOverlay();
            WebView webView = gCMActivityAppDiagnostics.mWebView;
            byte[] bytes = null;
            if (webView == null) {
                s.m("mWebView");
                throw null;
            }
            if (str2 != null) {
                Charset charset = StandardCharsets.UTF_8;
                charset.getClass();
                bytes = str2.getBytes(charset);
                bytes.getClass();
            }
            webView.loadData(Base64.encodeToString(bytes, 0), "text/html; charset=utf-8", "base64");
        }
    }

    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001¨\u0006\u0003"}, d2 = {"com/garmin/android/apps/connectmobile/settings/GCMActivityAppDiagnostics$c", "Lj83/m;", "Landroid/net/Uri;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c extends m<Uri> {
        public c() {
        }

        @Override // j83.m
        public final void b(Throwable th3) {
            th3.getClass();
            GCMActivityAppDiagnostics gCMActivityAppDiagnostics = GCMActivityAppDiagnostics.this;
            if (gCMActivityAppDiagnostics.mIsActivityAlive) {
                gCMActivityAppDiagnostics.hideProgressOverlay();
                Toast toastMakeText = Toast.makeText(gCMActivityAppDiagnostics, th3.getMessage(), 1);
                toastMakeText.setGravity(49, 0, 0);
                toastMakeText.show();
            }
        }

        @Override // j83.m
        public final void c(Uri uri) {
            Uri uri2 = uri;
            GCMActivityAppDiagnostics gCMActivityAppDiagnostics = GCMActivityAppDiagnostics.this;
            if (gCMActivityAppDiagnostics.mIsActivityAlive) {
                gCMActivityAppDiagnostics.hideProgressOverlay();
                l.f68084a.getClass();
                gCMActivityAppDiagnostics.startActivity(gCMActivityAppDiagnostics.createShareChooser(((Object) gCMActivityAppDiagnostics.getText(R.string.gcm_title_app_overview)) + StringUtils.SPACE + ((Object) gCMActivityAppDiagnostics.getText(R.string.pref_app_diagnostics_email_subject_suffix)) + " [" + l.a.a().getUserName() + "]", uri2));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Intent createShareChooser(String subject, Uri attachment) {
        Intent intent = new Intent("android.intent.action.SEND");
        intent.addFlags(1);
        intent.setType("application/zip");
        intent.putExtra("android.intent.extra.SUBJECT", subject);
        intent.putExtra("android.intent.extra.STREAM", attachment);
        Intent intentCreateChooser = Intent.createChooser(intent, getString(R.string.lbl_share));
        intentCreateChooser.getClass();
        return intentCreateChooser;
    }

    private final j83.l<Uri> createZipFile() {
        return j83.l.a(new com.google.firebase.remoteconfig.b(3, new File(pi1.b.a(this, null), "gcm_folder"), this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Uri createZipFile$lambda$0(File file, GCMActivityAppDiagnostics gCMActivityAppDiagnostics) {
        h hVar = new h();
        file.getClass();
        hVar.f137864a = file;
        return FileProvider.d(gCMActivityAppDiagnostics, "GarminConnectMobileApp.provider", hVar.b(gCMActivityAppDiagnostics));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onResume$lambda$0(GCMActivityAppDiagnostics gCMActivityAppDiagnostics) {
        return new pi1.f(gCMActivityAppDiagnostics).c();
    }

    private final void shareReportPostCheck() {
        showProgressOverlay();
        createZipFile().d(Schedulers.io()).b(l83.a.a()).c(new c());
    }

    private final void shareReportPreCheck() {
        Object systemService = getSystemService("connectivity");
        systemService.getClass();
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) systemService).getActiveNetworkInfo();
        if (activeNetworkInfo == null || !activeNetworkInfo.isConnectedOrConnecting()) {
            Toast.makeText(this, R.string.msg_common_no_internet_try_again, 1).show();
            return;
        }
        boolean z14 = activeNetworkInfo.getType() == 1;
        String externalStorageState = Environment.getExternalStorageState();
        if (TextUtils.isEmpty(externalStorageState)) {
            Toast.makeText(this, "Null external storage state. Impossible to write diagnostics file to disk.", 1).show();
            return;
        }
        if (s.g(externalStorageState, "mounted")) {
            if (z14) {
                shareReportPostCheck();
                return;
            } else {
                new androidx.appcompat.app.e.a(this).setTitle(R.string.title_share_file).setMessage(R.string.msg_share_file_non_wifi_connection).setCancelable(false).setPositiveButton(R.string.lbl_ok, new h1(this, 7)).setNegativeButton(R.string.lbl_cancel, new i(15)).show();
                return;
            }
        }
        if (s.g(externalStorageState, "shared")) {
            Toast.makeText(this, "Please disconnect USB cable.", 1).show();
            return;
        }
        Toast.makeText(this, "Unknown external storage state [" + externalStorageState + "]", 1).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void shareReportPreCheck$lambda$0(GCMActivityAppDiagnostics gCMActivityAppDiagnostics, DialogInterface dialogInterface, int i14) {
        if (dialogInterface != null) {
            dialogInterface.dismiss();
        }
        gCMActivityAppDiagnostics.shareReportPostCheck();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void shareReportPreCheck$lambda$1(DialogInterface dialogInterface, int i14) {
        if (dialogInterface != null) {
            dialogInterface.dismiss();
        }
    }

    @Override // com.garmin.android.apps.connectmobile.z1, b.g, android.app.Activity
    @SuppressLint({"MissingSuperCall"})
    public void onBackPressed() {
        onNavigateUp();
    }

    @Override // com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gcm_app_diagnostics);
        super.initActionBar(true, R.string.pref_app_diagnostics_title);
        View viewFindViewById = findViewById(R.id.app_diagnostics_view);
        viewFindViewById.getClass();
        WebView webView = (WebView) viewFindViewById;
        this.mWebView = webView;
        webView.setBackgroundColor(Color.parseColor("#FFFFFF"));
        this.mCalledByMobileAuth = getIntent().hasExtra(EXTRA_CALLED_BY_MOBILE_AUTH);
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.app_diagnostics, menu);
        return true;
    }

    @Override // com.garmin.android.apps.connectmobile.z1, android.app.Activity
    public boolean onNavigateUp() {
        if (!this.mCalledByMobileAuth) {
            super.onBackPressed();
            return true;
        }
        startActivity(getPackageManager().getLaunchIntentForPackage(getPackageName()));
        finish();
        return true;
    }

    @Override // com.garmin.android.apps.connectmobile.z1, android.app.Activity
    public boolean onOptionsItemSelected(MenuItem item) {
        item.getClass();
        if (item.getItemId() == R.id.menu_garminpay_feature) {
            kj0.c.f104941a.getClass();
            if (kj0.c.f104945e.get() == kj0.e.INITIALIZED) {
                Intent intent = new Intent();
                intent.setClassName(getPackageName(), "com.garmin.feature.garminpay.ui.dev.devices.DevDevicesActivity");
                startActivity(intent);
            } else {
                Toast.makeText(this, "GarminPay feature is not initialized...", 1).show();
            }
            return true;
        }
        if (item.getItemId() == R.id.menu_share) {
            shareReportPreCheck();
            return true;
        }
        if (item.getItemId() != R.id.menu_mark_logs) {
            if (item.getItemId() != R.id.menu_gncs_verbose_logging) {
                return super.onOptionsItemSelected(item);
            }
            boolean z14 = !item.isChecked();
            item.setChecked(z14);
            SmartNotificationsConfig.getInstance().setVerboseLoggingEnabled(z14);
            return true;
        }
        if (this.mLogger == null) {
            int i14 = gt2.c.f79010a;
            this.mLogger = gt2.b.f79005a.h(TAG);
        }
        Logger logger = this.mLogger;
        if (logger != null) {
            logger.debug("***************** MARK LOGS ******************");
        }
        return true;
    }

    @Override // androidx.fragment.app.m, android.app.Activity
    public void onPause() {
        super.onPause();
        this.mIsActivityAlive = false;
    }

    @Override // android.app.Activity
    public boolean onPrepareOptionsMenu(Menu menu) {
        menu.getClass();
        if (GNCSListenerService.isNotificationAccessAllowed(this)) {
            menu.findItem(R.id.menu_gncs_verbose_logging).setChecked(SmartNotificationsConfig.getInstance().isVerboseLoggingEnabled());
        } else {
            menu.findItem(R.id.menu_gncs_verbose_logging).setEnabled(false);
        }
        return super.onPrepareOptionsMenu(menu);
    }

    @Override // com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, android.app.Activity
    public void onResume() {
        super.onResume();
        this.mIsActivityAlive = true;
        showProgressOverlay();
        j83.l.a(new a73.h(this, 5)).d(Schedulers.io()).b(l83.a.a()).c(new b());
    }

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.settings.GCMActivityAppDiagnostics$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/GCMActivityAppDiagnostics$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "EXTRA_CALLED_BY_MOBILE_AUTH", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(j jVar) {
            this();
        }

        private Companion() {
        }
    }
}
