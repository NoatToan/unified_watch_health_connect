package com.huawei.hwversionmgr.utils.service;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.text.TextUtils;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.hwversionmgr.selfupdate.appupdate.UpdateBase;
import com.huawei.hwversionmgr.utils.handler.AppCheckNewVersionHandler;
import com.huawei.hwversionmgr.utils.handler.AppDownloadHandler;
import com.huawei.hwversionmgr.utils.handler.AppPullChangeLogHandler;
import defpackage.nuf;
import defpackage.nui;
import defpackage.nuk;
import defpackage.nuu;
import defpackage.nuv;
import defpackage.nuw;
import defpackage.nva;
import defpackage.nvd;
import defpackage.nvi;
import defpackage.nvp;
import defpackage.nvt;
import health.compact.a.CommonUtil;
import java.io.File;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class ScaleUpdateService extends Service {
    private String g;
    private String o;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f17756b = null;
    private UpdateBase n = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f17757c = null;
    private String d = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f17755a = 0;
    private int e = 0;
    private String h = null;
    private int f = -1;
    private int j = 4;
    private AppDownloadHandler m = new AppDownloadHandler() { // from class: com.huawei.hwversionmgr.utils.service.ScaleUpdateService.1
        @Override // com.huawei.hwversionmgr.utils.handler.AppDownloadHandler
        public void doDownloadFailed(int i) {
            LogUtil.e("Scale_ScaleUpdateService", "doDownloadFailed: statusCode = ", Integer.valueOf(i));
            nvi.a(22, i);
            ScaleUpdateService.this.stopSelf();
        }

        @Override // com.huawei.hwversionmgr.utils.handler.AppDownloadHandler
        public void doDownloadSuccess(nui nuiVar) {
            if (nuiVar == null) {
                LogUtil.a("Scale_ScaleUpdateService", "doDownloadSuccess: appDownloadInfo is null");
                return;
            }
            String strA = nuiVar.a();
            LogUtil.a("Scale_ScaleUpdateService", "doDownloadSuccess: mCheckNewVersionCode = ", ScaleUpdateService.this.f17757c, ", strAppStorePath = ", strA, ", mReportSuccess = ", Integer.valueOf(ScaleUpdateService.this.f));
            if (ScaleUpdateService.this.f == 5 || ScaleUpdateService.this.f == 4) {
                nuu.a().b(strA, ScaleUpdateService.this.g);
                nuu.a().c(ScaleUpdateService.this.f17757c, ScaleUpdateService.this.g);
            }
            nvi.a(23, 0);
            ScaleUpdateService.this.stopSelf();
        }

        @Override // com.huawei.hwversionmgr.utils.handler.AppDownloadHandler
        public void doInDownloadProgress(nui nuiVar) {
            if (nuiVar == null) {
                return;
            }
            LogUtil.a("Scale_ScaleUpdateService", "doInDownloadProgress() total=", Long.valueOf(nuiVar.d()), ",current=", Long.valueOf(nuiVar.c()));
            nvi.a(21, (int) ((nuiVar.c() * 100) / nuiVar.d()));
        }
    };
    private AppPullChangeLogHandler k = new AppPullChangeLogHandler() { // from class: com.huawei.hwversionmgr.utils.service.ScaleUpdateService.2
        @Override // com.huawei.hwversionmgr.utils.handler.AppPullChangeLogHandler
        public void pullChangeLogFailed() {
            LogUtil.a("Scale_ScaleUpdateService", "mScaleBandPullChangeLogHandler pullChangeLogFail");
            if (ScaleUpdateService.this.j == 5) {
                nvi.a(52, -1);
            }
            ScaleUpdateService.this.stopSelf();
        }

        @Override // com.huawei.hwversionmgr.utils.handler.AppPullChangeLogHandler
        public void pullChangeLogSuccess(List<nuk> list) {
            LogUtil.a("Scale_ScaleUpdateService", "mScaleBandPullChangeLogHandler pullChangeLogSuccess");
            ScaleUpdateService scaleUpdateService = ScaleUpdateService.this;
            scaleUpdateService.f = scaleUpdateService.j;
            if (list != null) {
                StringBuffer stringBuffer = new StringBuffer();
                for (int i = 0; i < list.size(); i++) {
                    stringBuffer.append(list.get(i).b());
                    stringBuffer.append(System.lineSeparator());
                    stringBuffer.append(list.get(i).e());
                    LogUtil.a("Scale_ScaleUpdateService", "mBandPullChangeLogHandler pullChangeLogSuccess() i = ", Integer.valueOf(i), ", Title = ", list.get(i).b(), ", Content=", list.get(i).e());
                }
                String string = stringBuffer.toString();
                LogUtil.a("Scale_ScaleUpdateService", "BAND_MANUAL_UPDATE()");
                if (ScaleUpdateService.this.j == 4) {
                    LogUtil.a("Scale_ScaleUpdateService", "BAND_AUTO_UPDATE()");
                    c(string);
                }
                if (ScaleUpdateService.this.j == 5) {
                    LogUtil.a("Scale_ScaleUpdateService", "BAND_MANUAL_UPDATE()");
                    nvi.b(53, 0, string, ScaleUpdateService.this.h, ScaleUpdateService.this.e);
                }
                LogUtil.a("Scale_ScaleUpdateService", "mScaleBandPullChangeLogHandler pullChangeLogSuccess() strFeatures = ", string);
            } else {
                LogUtil.e("Scale_ScaleUpdateService", "mScaleBandPullChangeLogHandler pullChangeLogSuccess() feature is null");
            }
            ScaleUpdateService.this.stopSelf();
        }

        private void c(String str) {
            nvi.b(new nvi.d(15).c(ScaleUpdateService.this.d).e(ScaleUpdateService.this.f17755a).b(str).d(ScaleUpdateService.this.h).c(ScaleUpdateService.this.e).e(ScaleUpdateService.this.g), ScaleUpdateService.this.o);
        }
    };
    private AppCheckNewVersionHandler i = new AppCheckNewVersionHandler() { // from class: com.huawei.hwversionmgr.utils.service.ScaleUpdateService.3
        @Override // com.huawei.hwversionmgr.utils.handler.AppCheckNewVersionHandler
        public void handleCheckSuccess(nuf nufVar) {
            if (nufVar != null) {
                ScaleUpdateService.this.f17757c = nufVar.i();
                ScaleUpdateService.this.d = nufVar.d();
                ScaleUpdateService.this.f17755a = (int) nufVar.a();
                LogUtil.a("Scale_ScaleUpdateService", "mBandCheckNewVersionHandler handleManualCheckSuccess: mCheckNewVersionCode = ", ScaleUpdateService.this.f17757c);
                ScaleUpdateService.this.e = nufVar.c();
                ScaleUpdateService.this.h = nufVar.e();
                if (ScaleUpdateService.this.j == 4) {
                    nva.d(ScaleUpdateService.this.d, ScaleUpdateService.this.f17756b, ScaleUpdateService.this.g);
                    nva.g(ScaleUpdateService.this.d, ScaleUpdateService.this.f17756b, ScaleUpdateService.this.o);
                    if (TextUtils.isEmpty(ScaleUpdateService.this.h)) {
                        nva.a(nvd.b(), ScaleUpdateService.this.f17756b, ScaleUpdateService.this.g);
                    } else {
                        nva.a("", ScaleUpdateService.this.f17756b, ScaleUpdateService.this.g);
                    }
                    LogUtil.a("Scale_ScaleUpdateService", "mBandCheckNewVersion success");
                }
                if (ScaleUpdateService.this.j == 5) {
                    nva.d(ScaleUpdateService.this.d, ScaleUpdateService.this.f17756b, ScaleUpdateService.this.g);
                    nva.g(ScaleUpdateService.this.d, ScaleUpdateService.this.f17756b, ScaleUpdateService.this.o);
                    if (TextUtils.isEmpty(ScaleUpdateService.this.h)) {
                        nva.a(nvd.b(), ScaleUpdateService.this.f17756b, ScaleUpdateService.this.g);
                    } else {
                        nva.a("", ScaleUpdateService.this.f17756b, ScaleUpdateService.this.g);
                    }
                    nvi.b(50, ScaleUpdateService.this.f17755a, ScaleUpdateService.this.d, ScaleUpdateService.this.h, ScaleUpdateService.this.e);
                }
                LogUtil.a("Scale_ScaleUpdateService", nufVar.toString());
                ScaleUpdateService.this.a();
            }
            ScaleUpdateService.this.stopSelf();
        }

        @Override // com.huawei.hwversionmgr.utils.handler.AppCheckNewVersionHandler
        public void handleCheckFailed(int i) {
            LogUtil.e("Scale_ScaleUpdateService", "mScaleCheckNewVersionHandler HandlerhandleCheckFailed: stausCode = ", Integer.valueOf(i), " mCheck = ", Integer.valueOf(ScaleUpdateService.this.j));
            if (ScaleUpdateService.this.j == 4) {
                if (i == 0) {
                    LogUtil.e("Scale_ScaleUpdateService", "mScaleCheckNewVersionHandler handleAutoCheckFailed() reason = FAILED_REASON_NOTFOUND");
                    nva.a(nvd.b(), ScaleUpdateService.this.f17756b, ScaleUpdateService.this.g);
                } else {
                    LogUtil.e("Scale_ScaleUpdateService", "mScaleCheckNewVersionHandler handleAutoCheckFailed() reason other");
                }
                nva.d("", ScaleUpdateService.this.f17756b, ScaleUpdateService.this.g);
                nva.g("", ScaleUpdateService.this.f17756b, ScaleUpdateService.this.o);
            }
            if (ScaleUpdateService.this.j == 5) {
                if (i == 0) {
                    LogUtil.e("Scale_ScaleUpdateService", "mScaleCheckNewVersionHandler handleAutoCheckFailed() reason = FAILED_REASON_NOTFOUND");
                    nva.d("", ScaleUpdateService.this.f17756b, ScaleUpdateService.this.g);
                    nva.g("", ScaleUpdateService.this.f17756b, ScaleUpdateService.this.o);
                    nva.a(nvd.b(), ScaleUpdateService.this.f17756b, ScaleUpdateService.this.g);
                }
                nvi.a(49, i);
            }
            ScaleUpdateService.this.stopSelf();
        }
    };

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        Context applicationContext = getApplicationContext();
        this.f17756b = applicationContext;
        this.n = new UpdateBase(applicationContext);
        LogUtil.a("Scale_ScaleUpdateService", "onCreate");
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        super.onStartCommand(intent, i, i2);
        LogUtil.a("Scale_ScaleUpdateService", "onStartCommand: intent = ", intent);
        b(intent);
        return 2;
    }

    private void b(Intent intent) {
        if (intent == null) {
            return;
        }
        String action = intent.getAction();
        LogUtil.a("Scale_ScaleUpdateService", "handleIntent: action = ", action);
        if ("action_scale_check_new_version".equals(action)) {
            b(intent, 5);
            return;
        }
        if ("action_scale_auto_check_new_version".equals(action)) {
            b(intent, 4);
            return;
        }
        if ("action_scale_download_new_version".equals(action)) {
            this.g = intent.getStringExtra("scale_name");
            c();
        } else {
            if ("action_cancel_download_app".equals(action)) {
                LogUtil.a("Scale_ScaleUpdateService", "cancel download app!");
                this.g = intent.getStringExtra("scale_name");
                this.n.c();
                return;
            }
            LogUtil.j("Scale_ScaleUpdateService", "handleIntent is other action");
        }
    }

    private void b(Intent intent, int i) {
        this.j = i;
        String stringExtra = intent.getStringExtra("extra_band_unique_id");
        this.o = stringExtra;
        e(stringExtra);
        String stringExtra2 = intent.getStringExtra("extra_band_version");
        this.g = intent.getStringExtra("scale_name");
        String stringExtra3 = intent.getStringExtra("scale_mac_address");
        LogUtil.a("Scale_ScaleUpdateService", "checkNewVersion bandVersion = ", stringExtra2, ",deviceName = ", CommonUtil.n(this.g), ",scaleCheckStatus = ", Integer.valueOf(this.j));
        nvi.a(this.g, stringExtra2, this.n, this.i, stringExtra3);
    }

    private void e(String str) {
        boolean zG = nva.g(this.f17756b, str);
        UpdateBase.b(zG);
        nvp.b(zG);
        nvt.b(zG);
    }

    private void c() {
        this.f = 5;
        boolean zB = nvi.b(5, this.g);
        LogUtil.a("Scale_ScaleUpdateService", "downloadFile: isNewVersionExist = ", Boolean.valueOf(zB));
        if (zB) {
            if (d()) {
                nvi.a(23, 0);
                return;
            } else {
                e();
                return;
            }
        }
        e();
    }

    private void e() {
        this.n.downloadScaleFile(this.m, false);
    }

    private boolean d() throws Throwable {
        LogUtil.a("Scale_ScaleUpdateService", "enter checkMd5 mReportSuccess:", Integer.valueOf(this.f));
        String strG = nuu.a().g(this.g);
        String strH = nuw.o().h();
        String strE = nuv.e(strG);
        File file = new File(strG);
        LogUtil.a("Scale_ScaleUpdateService", "srcMd5=", strH, " ,path=", strG, " file exists:", Boolean.valueOf(file.exists()), " file size:", Long.valueOf(file.length()));
        if (TextUtils.isEmpty(strH)) {
            LogUtil.e("Scale_ScaleUpdateService", "verify md5 srcMd5 is null");
            nuu.a().e(this.g);
            return false;
        }
        if (strH.equalsIgnoreCase(strE)) {
            LogUtil.a("Scale_ScaleUpdateService", "verify md5 success  ", strE);
            return true;
        }
        LogUtil.a("Scale_ScaleUpdateService", "verify md5 failed  ", strE);
        nuu.a().e(this.g);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        LogUtil.a("Scale_ScaleUpdateService", "fetchChangeLogForBand");
        nvi.a(51, -1);
        this.n.fetchScaleChangeLog(this.k, false);
    }
}
