package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Parcelable;
import com.huawei.hms.hmsscankit.ScanUtil;
import com.huawei.hms.hmsscankit.WriterException;
import com.huawei.hms.ml.scan.HmsBuildBitmapOption;
import com.huawei.hms.ml.scan.HmsScan;
import com.huawei.hms.ml.scan.HmsScanAnalyzerOptions;
import com.huawei.hwlogsmodel.LogUtil;

/* JADX INFO: loaded from: classes8.dex */
public class gsm {
    public static void a(Activity activity, int i) {
        if (activity == null) {
            LogUtil.e("R_QrCode_QrCodeUtil", "startScan null activity");
            return;
        }
        HmsScanAnalyzerOptions hmsScanAnalyzerOptionsCreate = new HmsScanAnalyzerOptions.Creator().setHmsScanTypes(HmsScan.QRCODE_SCAN_TYPE, HmsScan.CODE128_SCAN_TYPE).setErrorCheck(true).setShowGuide(true).create();
        LogUtil.a("R_QrCode_QrCodeUtil", "startScan activity ", activity.getLocalClassName(), " requestCode: ", Integer.valueOf(i));
        ScanUtil.startScan(activity, i, hmsScanAnalyzerOptionsCreate);
    }

    public static void b(Activity activity, int i) {
        if (activity == null) {
            LogUtil.e("R_QrCode_QrCodeUtil", "startBarCodeScan null activity");
            return;
        }
        HmsScanAnalyzerOptions hmsScanAnalyzerOptionsCreate = new HmsScanAnalyzerOptions.Creator().setHmsScanTypes(HmsScan.CODE39_SCAN_TYPE, HmsScan.CODE93_SCAN_TYPE, HmsScan.CODE128_SCAN_TYPE, HmsScan.EAN13_SCAN_TYPE, HmsScan.EAN8_SCAN_TYPE, HmsScan.UPCCODE_A_SCAN_TYPE, HmsScan.ITF14_SCAN_TYPE, HmsScan.UPCCODE_E_SCAN_TYPE, HmsScan.CODABAR_SCAN_TYPE).setErrorCheck(true).setShowGuide(true).create();
        LogUtil.a("R_QrCode_QrCodeUtil", "startBarCodeScan activity ", activity.getLocalClassName(), " requestCode: ", Integer.valueOf(i));
        ScanUtil.startScan(activity, i, hmsScanAnalyzerOptionsCreate);
    }

    public static Bitmap b(String str, c cVar) throws gsk {
        if (cVar == null) {
            throw new gsk("generateOption is null");
        }
        try {
            LogUtil.a("R_QrCode_QrCodeUtil", "generateMap:(", Integer.valueOf(cVar.f35986b), ",", Integer.valueOf(cVar.e), ") ", cVar.f35985a.toString());
            return ScanUtil.buildBitmap(str, HmsScan.QRCODE_SCAN_TYPE, cVar.f35986b, cVar.e, cVar.f35985a);
        } catch (WriterException e) {
            throw new gsk(e.getMessage());
        }
    }

    public static String b(Intent intent) {
        if (intent == null) {
            LogUtil.j("R_QrCode_QrCodeUtil", "getUrlFromIntent null intent");
            return "";
        }
        Parcelable parcelableExtra = intent.getParcelableExtra(ScanUtil.RESULT);
        if (parcelableExtra == null) {
            LogUtil.e("R_QrCode_QrCodeUtil", "getText parcelableExtra is null");
            return "";
        }
        if (parcelableExtra instanceof HmsScan) {
            return ((HmsScan) parcelableExtra).getOriginalValue();
        }
        LogUtil.e("R_QrCode_QrCodeUtil", "getText parcelableExtra instance error");
        return "";
    }

    public static int c(Intent intent) {
        if (intent == null) {
            LogUtil.j("R_QrCode_QrCodeUtil", "getCodeFromIntent null intent");
            return -1;
        }
        return intent.getIntExtra(ScanUtil.RESULT_CODE, 0);
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final HmsBuildBitmapOption f35985a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f35986b;
        final int e;

        private c(int i, int i2, HmsBuildBitmapOption hmsBuildBitmapOption) {
            this.f35986b = i;
            this.e = i2;
            this.f35985a = hmsBuildBitmapOption;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static HmsBuildBitmapOption a(int i, int i2, int i3, HmsBuildBitmapOption.ErrorCorrectionLevel errorCorrectionLevel) {
            return new HmsBuildBitmapOption.Creator().setBitmapMargin(i3).setBitmapColor(i).setBitmapBackgroundColor(i2).setQRErrorCorrection(errorCorrectionLevel).create();
        }

        public static class b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private HmsBuildBitmapOption.ErrorCorrectionLevel f35987a;
            private int j = 400;
            private int d = 400;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private int f35989c = 0;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private int f35988b = -16777216;
            private int e = -1;

            public b b(int i, int i2) {
                this.j = i;
                this.d = i2;
                return this;
            }

            public c d() {
                return new c(this.j, this.d, c.a(this.f35988b, this.e, this.f35989c, this.f35987a));
            }
        }
    }
}
