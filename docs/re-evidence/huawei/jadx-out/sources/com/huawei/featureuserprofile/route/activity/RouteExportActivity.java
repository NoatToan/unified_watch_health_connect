package com.huawei.featureuserprofile.route.activity;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.RelativeLayout;
import android.widget.Toast;
import com.huawei.agconnect.apms.Agent;
import com.huawei.featureuserprofile.R;
import com.huawei.featureuserprofile.route.navigationgenerator.BaseGenerator;
import com.huawei.featureuserprofile.route.navigationparser.NavigationFileParser;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.common.os.FileUtils;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.socialshare.api.SocialShareCenterApi;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hwcloudmodel.healthdatacloud.HealthDataCloudFactory;
import com.huawei.hwcloudmodel.model.unite.RouteData;
import com.huawei.hwcloudmodel.model.unite.RouteExtendData;
import com.huawei.hwcommonmodel.utils.PermissionUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.route.GetRouteDetailReq;
import com.huawei.route.GetSingleRouteDetailRsp;
import com.huawei.route.Manger.RouteDataStorageManager;
import com.huawei.route.TrackInfoModel;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.dialog.CustomViewDialog;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.radiobutton.HealthRadioButton;
import com.huawei.ui.commonui.titlebar.CustomTitleBar;
import com.huawei.ui.commonui.utils.CustomPermissionAction;
import com.huawei.ui.commonui.view.shareSelector.ShareSelector;
import com.huawei.ui.commonui.view.shareSelector.ShareSelectorClickCallback;
import defpackage.cxq;
import defpackage.gxt;
import defpackage.njy;
import defpackage.oet;
import defpackage.ofe;
import defpackage.qrs;
import health.compact.a.CommonUtil;
import health.compact.a.EnvironmentInfo;
import health.compact.a.Services;
import health.compact.a.Utils;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public class RouteExportActivity extends BaseActivity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HealthRadioButton f5621a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HealthRadioButton f5622b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f5623c;
    private HealthRadioButton d;
    private boolean e = true;
    private TrackInfoModel h;
    private ShareSelector i;
    private RelativeLayout j;

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getIntent() != null && getIntent().hasExtra("routeVersion")) {
            a();
            return;
        }
        setContentView(R.layout.activity_route_export);
        TrackInfoModel trackInfoModel = RouteDataStorageManager.getTrackInfoModel();
        this.h = trackInfoModel;
        if (trackInfoModel != null && !njy.e(trackInfoModel.getPoints())) {
            if (getIntent() != null) {
                this.e = getIntent().getBooleanExtra("IS_NEED_CHANGE_POINT", true);
            }
            b();
            j();
            return;
        }
        finish();
    }

    private void a() {
        final String stringExtra = getIntent().getStringExtra("routeVersion");
        ThreadPoolManager.c().execute(new Runnable() { // from class: cxe
            @Override // java.lang.Runnable
            public final void run() {
                this.e.e(stringExtra);
            }
        });
    }

    public /* synthetic */ void e(String str) {
        b(str);
        runOnUiThread(new Runnable() { // from class: cxc
            @Override // java.lang.Runnable
            public final void run() {
                this.f31462a.c();
            }
        });
    }

    public /* synthetic */ void c() {
        setContentView(R.layout.activity_route_export);
        TrackInfoModel trackInfoModel = this.h;
        if (trackInfoModel != null && !njy.e(trackInfoModel.getPoints())) {
            b();
        } else {
            finish();
        }
    }

    private void b(String str) {
        LogUtil.a("track_route_export_activity", "Export Route FromH5 routeVersion: ", str);
        long jCurrentTimeMillis = System.currentTimeMillis();
        long jF = qrs.f(str);
        HealthDataCloudFactory healthDataCloudFactory = new HealthDataCloudFactory(BaseApplication.b());
        GetRouteDetailReq getRouteDetailReq = new GetRouteDetailReq();
        getRouteDetailReq.setType(1);
        getRouteDetailReq.setVersion(jF);
        GetSingleRouteDetailRsp getSingleRouteDetailRsp = (GetSingleRouteDetailRsp) oet.d().e(getRouteDetailReq.getSingleRouteUrl(), healthDataCloudFactory.getHeaders(), ofe.c(healthDataCloudFactory.getBody(getRouteDetailReq)), GetSingleRouteDetailRsp.class);
        RouteData routeData = (getSingleRouteDetailRsp == null || getSingleRouteDetailRsp.getResultCode().intValue() != 0 || getSingleRouteDetailRsp.getRouteData() == null) ? null : getSingleRouteDetailRsp.getRouteData();
        if (routeData == null) {
            LogUtil.a("track_route_export_activity", "transferDataFromH5 fail: routeData is null");
            return;
        }
        TrackInfoModel.Builder builderRouteType = new TrackInfoModel.Builder().routeName(routeData.getRouteName()).sportType(routeData.getSportType()).sportTotalTime(routeData.getRouteTime()).sportTotalDistance(routeData.getRouteDistance()).points(routeData.getRoutePoints()).routeType(routeData.getRouteType());
        if (!TextUtils.isEmpty(routeData.getExtendData())) {
            RouteExtendData routeExtendData = (RouteExtendData) HiJsonUtil.d(routeData.getExtendData(), RouteExtendData.class);
            builderRouteType.cumulativeClimb(routeExtendData.getCumulativeClimb()).cumulativeDecrease(routeExtendData.getCumulativeDecrease()).routeType(routeExtendData.getRouteType());
        }
        this.h = builderRouteType.build();
        this.f5623c = true;
        LogUtil.a("track_route_export_activity", "transferTrackPoint waste time:", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
    }

    private void j() {
        ThreadPoolManager.c().execute(new Runnable() { // from class: cxd
            @Override // java.lang.Runnable
            public final void run() {
                this.e.e();
            }
        });
    }

    public /* synthetic */ void e() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (this.h == null) {
            LogUtil.a("track_route_export_activity", "transferData mTrackInfoModel == null");
            return;
        }
        if (this.e) {
            TrackInfoModel.Builder builderRouteType = new TrackInfoModel.Builder().routeName(this.h.getRouteName()).sportType(this.h.getSportType()).sportTotalTime(this.h.getSportTotalTime()).sportTotalDistance(this.h.getSportTotalDistance()).cumulativeClimb(this.h.getCumulativeClimb()).cumulativeDecrease(this.h.getCumulativeDecrease()).routeType(this.h.getRouteType());
            builderRouteType.points(cxq.a(this.h.getPoints()));
            this.h = builderRouteType.build();
        }
        this.f5623c = true;
        LogUtil.a("track_route_export_activity", "transferTrackPoint waste time:", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
    }

    private void b() {
        getWindow().setBackgroundDrawableResource(R.color.colorSubBackground);
        ((CustomTitleBar) findViewById(R.id.title_bar)).setTitleText(getString(R.string.IDS_hwh_choose_export_line));
        d();
        this.f5622b = (HealthRadioButton) findViewById(R.id.radiobutton_tcx);
        this.d = (HealthRadioButton) findViewById(R.id.radiobutton_gpx);
        this.f5621a = (HealthRadioButton) findViewById(R.id.radiobutton_kml);
        findViewById(R.id.health_card_view_tcx).setOnClickListener(new View.OnClickListener() { // from class: cxf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f31464b.a(view);
            }
        });
        findViewById(R.id.health_card_view_gpx).setOnClickListener(new View.OnClickListener() { // from class: cxh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f31466b.e(view);
            }
        });
        findViewById(R.id.health_card_view_kml).setOnClickListener(new View.OnClickListener() { // from class: cxg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f31465c.d(view);
            }
        });
    }

    public /* synthetic */ void a(View view) {
        if (this.f5622b.isChecked()) {
            return;
        }
        this.f5622b.setChecked(true);
        this.d.setChecked(false);
        this.f5621a.setChecked(false);
    }

    public /* synthetic */ void e(View view) {
        if (this.d.isChecked()) {
            return;
        }
        this.f5622b.setChecked(false);
        this.d.setChecked(true);
        this.f5621a.setChecked(false);
    }

    public /* synthetic */ void d(View view) {
        if (this.f5621a.isChecked()) {
            return;
        }
        this.f5622b.setChecked(false);
        this.d.setChecked(false);
        this.f5621a.setChecked(true);
    }

    private void d() {
        ShareSelector shareSelector = (ShareSelector) findViewById(R.id.share_selector);
        this.i = shareSelector;
        shareSelector.setLocalShareVisibility(EnvironmentInfo.m() ? 8 : 0);
        this.i.setShareWeChatVisibility(Utils.o() ? 8 : 0);
        this.i.setMoreVisibility(EnvironmentInfo.m() ? 8 : 0);
        this.i.setShareWeChatFriendsVisibility(8);
        this.i.setSinaVisibility(8);
        this.i.setMoreLayoutText(getString(R.string.IDS_user_profile_more));
        this.i.setClickCallback(new ShareSelectorClickCallback() { // from class: com.huawei.featureuserprofile.route.activity.RouteExportActivity.4
            @Override // com.huawei.ui.commonui.view.shareSelector.ShareSelectorClickCallback
            public void onSinaShare() {
            }

            @Override // com.huawei.ui.commonui.view.shareSelector.ShareSelectorClickCallback
            public void onWeChatFriendShare() {
            }

            @Override // com.huawei.ui.commonui.view.shareSelector.ShareSelectorClickCallback
            public void onWeChatShare() {
                RouteExportActivity.this.a(0);
            }

            @Override // com.huawei.ui.commonui.view.shareSelector.ShareSelectorClickCallback
            public void onLocalShare() {
                RouteExportActivity.this.a(1);
            }

            @Override // com.huawei.ui.commonui.view.shareSelector.ShareSelectorClickCallback
            public void onMoreShare() {
                RouteExportActivity.this.a(2);
            }
        });
    }

    /* JADX INFO: renamed from: com.huawei.featureuserprofile.route.activity.RouteExportActivity$3, reason: invalid class name */
    public class AnonymousClass3 extends CustomPermissionAction {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f5624b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3(Context context, int i) {
            super(context);
            this.f5624b = i;
        }

        @Override // com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
        public void onGranted() {
            final String strD = RouteExportActivity.this.d(this.f5624b);
            if (strD == null) {
                LogUtil.e("track_route_export_activity", "onGranted dirPath == null");
                return;
            }
            ViewStub viewStub = (ViewStub) RouteExportActivity.this.findViewById(R.id.export_loading_stub);
            if (RouteExportActivity.this.j == null) {
                RouteExportActivity.this.j = (RelativeLayout) viewStub.inflate();
            }
            RouteExportActivity.this.j.setVisibility(0);
            RouteExportActivity.this.j.setClickable(true);
            ThreadPoolManager threadPoolManagerC = ThreadPoolManager.c();
            final int i = this.f5624b;
            threadPoolManagerC.execute(new Runnable() { // from class: cxj
                @Override // java.lang.Runnable
                public final void run() {
                    this.f31469b.e(i, strD);
                }
            });
        }

        public /* synthetic */ void e(int i, String str) {
            RouteExportActivity.this.c(i, str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i) {
        PermissionUtil.d(this, PermissionUtil.PermissionType.MANAGE_EXTERNAL_STORAGE, new AnonymousClass3(this, i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(final int i, String str) {
        final File fileMakeTrackFile;
        String routeName = this.h.getRouteName();
        if (i != 1) {
            FileUtils.e(new File(str), false);
        }
        if (routeName.length() > 100) {
            routeName = routeName.substring(0, 100);
        }
        if (routeName.contains(File.separator)) {
            routeName = routeName.replace(File.separator, Constants.LINK);
        }
        if (this.d.isChecked()) {
            fileMakeTrackFile = BaseGenerator.makeTrackFile(this.h, "gpx", e(i, str, routeName, "gpx"));
        } else if (this.f5622b.isChecked()) {
            fileMakeTrackFile = BaseGenerator.makeTrackFile(this.h, NavigationFileParser.TCX, e(i, str, routeName, NavigationFileParser.TCX));
        } else {
            fileMakeTrackFile = BaseGenerator.makeTrackFile(this.h, NavigationFileParser.KML, e(i, str, routeName, NavigationFileParser.KML));
        }
        runOnUiThread(new Runnable() { // from class: cwy
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                this.d.a(i, fileMakeTrackFile);
            }
        });
    }

    public /* synthetic */ void a(int i, File file) throws Throwable {
        this.j.setVisibility(8);
        d(i, file);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String d(int i) {
        if (!this.f5623c) {
            LogUtil.a("track_route_export_activity", "transfer point not finish,please try again");
            return null;
        }
        this.i.setEnabled(false);
        StringBuilder sb = new StringBuilder();
        sb.append(CommonUtil.f((Context) null).getAbsolutePath());
        sb.append(File.separator);
        sb.append(i == 1 ? "Tracks/Export" : "TracksShare");
        String string = sb.toString();
        File file = new File(string);
        try {
            if (file.exists() || file.mkdirs()) {
                return string;
            }
            LogUtil.a("track_route_export_activity", "create dirPath fail");
            return null;
        } catch (SecurityException unused) {
            LogUtil.e("track_route_export_activity", "mkdir error");
            return null;
        }
    }

    private void d(int i, File file) throws Throwable {
        String canonicalPath;
        this.i.setEnabled(true);
        if (!FileUtils.a(file)) {
            a(getString(R.string.IDS_hwh_create_line_file_fail));
            return;
        }
        try {
            canonicalPath = file.getCanonicalPath();
        } catch (IOException unused) {
            LogUtil.e("track_route_export_activity", "getCanonicalPath IOException");
            canonicalPath = null;
        }
        if (TextUtils.isEmpty(canonicalPath)) {
            LogUtil.a("track_route_export_activity", "canonicalPath is empty");
            return;
        }
        int iLastIndexOf = canonicalPath.lastIndexOf(File.separator);
        if (iLastIndexOf == -1) {
            LogUtil.a("track_route_export_activity", "get fileName fail");
            return;
        }
        String strSubstring = canonicalPath.substring(iLastIndexOf + 1);
        if (i != 0) {
            if (i == 1) {
                a(file, canonicalPath, strSubstring);
                return;
            } else {
                d(canonicalPath, strSubstring, 5);
                return;
            }
        }
        if (!CommonUtil.ab(this)) {
            a(getString(R.string.IDS_connect_error));
        } else if (!Utils.b(this, "com.tencent.mm")) {
            a(getString(R.string.IDS_plugin_socialshare_install_wechat));
        } else {
            d(canonicalPath, strSubstring, 2);
        }
    }

    private void a(File file, String str, String str2) throws Throwable {
        if (Build.VERSION.SDK_INT < 30) {
            if (str.contains(Agent.OS_NAME)) {
                c(String.format(Locale.ENGLISH, getString(R.string.IDS_hwh_file_save_to), str.substring(str.indexOf(Agent.OS_NAME))));
                return;
            }
            if (str.contains("Tracks/Export")) {
                int iIndexOf = str.indexOf(Environment.DIRECTORY_DOWNLOADS);
                Locale locale = Locale.ENGLISH;
                String string = getString(R.string.IDS_hwh_file_save_to);
                if (iIndexOf <= 0) {
                    iIndexOf = str.indexOf("Tracks/Export");
                }
                c(String.format(locale, string, str.substring(iIndexOf)));
                return;
            }
            LogUtil.a("track_route_export_activity", "canonicalPath is error:", str);
            return;
        }
        ContentValues contentValues = new ContentValues();
        String str3 = Environment.DIRECTORY_DOWNLOADS + File.separator + "Tracks/Export";
        contentValues.put("_display_name", str2);
        contentValues.put("mime_type", "*/*");
        contentValues.put("title", str2);
        contentValues.put("relative_path", str3);
        Uri uri = MediaStore.Downloads.EXTERNAL_CONTENT_URI;
        ContentResolver contentResolver = getContentResolver();
        Uri uriInsert = contentResolver.insert(uri, contentValues);
        LogUtil.a("track_route_export_activity", "insertUri:", uriInsert);
        FileInputStream fileInputStream = null;
        try {
            FileInputStream fileInputStream2 = new FileInputStream(file);
            try {
                OutputStream outputStreamOpenOutputStream = contentResolver.openOutputStream(uriInsert);
                if (outputStreamOpenOutputStream != null) {
                    FileUtils.a(fileInputStream2, outputStreamOpenOutputStream);
                } else {
                    LogUtil.a("track_route_export_activity", "fileInputStream is empty");
                }
                a(fileInputStream2, outputStreamOpenOutputStream);
            } catch (IOException unused) {
                fileInputStream = fileInputStream2;
                try {
                    LogUtil.e("track_route_export_activity", "IOException");
                    a(fileInputStream, (OutputStream) fileInputStream);
                } catch (Throwable th) {
                    th = th;
                    a(fileInputStream, (OutputStream) null);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                fileInputStream = fileInputStream2;
                a(fileInputStream, (OutputStream) null);
                throw th;
            }
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            th = th3;
        }
        c(String.format(Locale.ENGLISH, getString(R.string.IDS_hwh_file_save_to), str3 + File.separator + str2));
    }

    private void a(FileInputStream fileInputStream, OutputStream outputStream) {
        if (fileInputStream != null) {
            try {
                fileInputStream.close();
            } catch (IOException unused) {
                LogUtil.e("track_route_export_activity", "fileInputStream close catch IOException");
            }
        }
        if (outputStream != null) {
            try {
                outputStream.close();
            } catch (IOException unused2) {
                LogUtil.e("track_route_export_activity", "outputStream close catch IOException");
            }
        }
    }

    private void c(String str) {
        View viewInflate = LayoutInflater.from(this).inflate(R.layout.dialog_confirm_route_location, (ViewGroup) null);
        ((HealthTextView) viewInflate.findViewById(R.id.tv_remind)).setText(str);
        CustomViewDialog.Builder builder = new CustomViewDialog.Builder(this);
        builder.a(getString(R.string.IDS_file_save_to_local)).b(viewInflate, 0, 0).d(R.string.IDS_user_permission_know, new View.OnClickListener() { // from class: cxb
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LogUtil.a("track_route_export_activity", "onClick positive view");
            }
        });
        builder.d().show();
    }

    private void a(String str) {
        Toast.makeText(this, str, 0).show();
    }

    private String e(int i, String str, String str2, String str3) {
        String str4 = str + File.separator + str2 + "." + str3;
        if (i != 1) {
            return str4;
        }
        int i2 = 1;
        while (FileUtils.a(new File(str4))) {
            str4 = str + File.separator + str2 + com.huawei.operation.utils.Constants.LEFT_BRACKET_ONLY + i2 + ")." + str3;
            i2++;
        }
        return str4;
    }

    private void d(String str, String str2, int i) {
        gxt gxtVar = new gxt(10);
        gxtVar.a(str);
        gxtVar.d(9);
        gxtVar.e(str2);
        ((SocialShareCenterApi) Services.b("PluginSocialShare", SocialShareCenterApi.class)).exeShare(this, i, gxtVar);
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.h = null;
        RouteDataStorageManager.clearTrackInfoModel();
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
