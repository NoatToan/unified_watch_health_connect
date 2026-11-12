package com.huawei.health.browseraction;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Toast;
import com.huawei.featureuserprofile.route.navigationparser.NavigationFileParser;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.health.R;
import com.huawei.healthcloud.plugintrack.runningroute.utils.RunningRouteUtils;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.route.utils.RouteSourceUtils;
import defpackage.fns;

/* JADX INFO: loaded from: classes26.dex */
public class HwSchemeFilterActivity extends Activity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f6244a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f6245b = null;

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f6245b = this;
        Intent intent = getIntent();
        if (intent == null) {
            LogUtil.j("Suggestion_HwSchemeFilterActivity", "intent == null");
            return;
        }
        Uri data = intent.getData();
        if (data == null) {
            LogUtil.j("Suggestion_HwSchemeFilterActivity", "schemeData == null");
            return;
        }
        String scheme = data.getScheme();
        String host = data.getHost();
        LogUtil.a("Suggestion_HwSchemeFilterActivity", "schemeName:", scheme, " host:", host, " path:", data.getPath());
        if (!CommonConstant.ACTION.HWID_SCHEME_URL.equals(intent.getAction()) || !b(data)) {
            LogUtil.j("Suggestion_HwSchemeFilterActivity", "is not match Intent.ACTION_VIEW");
        } else {
            LogUtil.a("Suggestion_HwSchemeFilterActivity", "begin to deal with route");
            d(host);
        }
    }

    private void d(String str) {
        if (!fns.b()) {
            Intent launchIntentForPackage = this.f6245b.getPackageManager().getLaunchIntentForPackage(this.f6245b.getPackageName());
            launchIntentForPackage.putExtra("schemeTrackFilePath", this.f6244a);
            launchIntentForPackage.addFlags(67108864);
            LogUtil.a("Suggestion_HwSchemeFilterActivity", "no login");
            startActivity(launchIntentForPackage);
        } else {
            RunningRouteUtils.a(this.f6245b, this.f6244a);
        }
        finish();
    }

    private String e(Uri uri) {
        String trackFileName = "";
        if (uri == null || uri.getScheme() == null) {
            LogUtil.j("Suggestion_HwSchemeFilterActivity", "uri is null");
            return "";
        }
        String scheme = uri.getScheme();
        scheme.hashCode();
        if (scheme.equals("file")) {
            String[] strArrSplit = uri.getPath().split("/");
            trackFileName = strArrSplit[strArrSplit.length - 1];
        } else if (scheme.equals("content")) {
            try {
                Cursor cursorQuery = getContentResolver().query(uri, null, null, null, null);
                try {
                    trackFileName = RouteSourceUtils.getTrackFileName(cursorQuery);
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                } catch (Throwable th) {
                    if (cursorQuery != null) {
                        try {
                            cursorQuery.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            } catch (SecurityException unused) {
                LogUtil.e("Suggestion_HwSchemeFilterActivity", "query file address, catch securityException");
            }
        }
        LogUtil.a("Suggestion_HwSchemeFilterActivity", "trackFileName = ", trackFileName);
        return trackFileName;
    }

    private boolean b(Uri uri) {
        String strE = e(uri);
        if (TextUtils.isEmpty(strE) || (!strE.endsWith("gpx") && !strE.endsWith(NavigationFileParser.TCX) && !strE.endsWith(NavigationFileParser.KML) && !strE.endsWith(NavigationFileParser.KMZ) && !e(strE))) {
            Toast.makeText(this.f6245b, R.string.IDS_my_route_incorrect_file, 0).show();
            return false;
        }
        this.f6244a = RouteSourceUtils.parseFileCopyToRoutePath(uri, strE);
        return true;
    }

    private boolean e(String str) {
        return str.endsWith(NavigationFileParser.BIN) && str.contains(".gpx.");
    }

    @Override // android.app.Activity
    protected void onResume() {
        super.onResume();
        e();
    }

    private void e() {
        HandlerExecutor.c(new Runnable() { // from class: dgi
            @Override // java.lang.Runnable
            public final void run() {
                this.e.a();
            }
        }, 200L);
    }

    public /* synthetic */ void a() {
        setIntent(null);
        finish();
        LogUtil.a("Suggestion_HwSchemeFilterActivity", "HwSchemeFilterActivity onFinish");
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
