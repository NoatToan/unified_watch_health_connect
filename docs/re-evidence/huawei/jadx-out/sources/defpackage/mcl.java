package defpackage;

import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwdevice.mainprocess.mgr.hwwatchfacemgr.touchtransfer.initese.apdu.ApduResponseHandler;
import com.huawei.hwdevice.mainprocess.mgr.hwwatchfacemgr.touchtransfer.initese.tsm.operator.TsmOperatorResponse;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.CommonUtil;
import health.compact.a.GRSManager;

/* JADX INFO: loaded from: classes10.dex */
public class mcl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private mcy f41421a;
    private String f;
    private TsmOperatorResponse i;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f41422b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f41423c = -1;
    private ApduResponseHandler e = new ApduResponseHandler() { // from class: mcl.2
        @Override // com.huawei.hwdevice.mainprocess.mgr.hwwatchfacemgr.touchtransfer.initese.apdu.ApduResponseHandler
        public void onSuccess(String str) {
            if (mcl.this.i != null) {
                mcl.this.i.onOperatorSuccess(str);
            }
            mcl.this.b();
        }

        @Override // com.huawei.hwdevice.mainprocess.mgr.hwwatchfacemgr.touchtransfer.initese.apdu.ApduResponseHandler
        public void onSendNext(int i, int i2, String str, String str2) {
            mcl.a(mcl.this);
            LogUtil.a("ApduManager", "onSendNext");
            mcl.this.e(i, i2, str, str2);
        }

        @Override // com.huawei.hwdevice.mainprocess.mgr.hwwatchfacemgr.touchtransfer.initese.apdu.ApduResponseHandler
        public void onSendNextError(int i, int i2, String str, String str2, Error error) {
            if (error != null) {
                mcl.this.f = error.getMessage();
            }
            mcl.a(mcl.this);
            LogUtil.a("ApduManager", "onSendNextError");
            mcl.this.e(i, i2, str, str2);
        }

        @Override // com.huawei.hwdevice.mainprocess.mgr.hwwatchfacemgr.touchtransfer.initese.apdu.ApduResponseHandler
        public void onFailure(int i, Error error) {
            if (mcl.this.i != null) {
                mcl.this.i.onOperatorFailure(i, error);
            }
            mcl.this.b();
        }
    };
    private String g = e();
    private mcm d = new mcm(this.e);

    static /* synthetic */ int a(mcl mclVar) {
        int i = mclVar.f41422b;
        mclVar.f41422b = i + 1;
        return i;
    }

    public void b(mcy mcyVar) {
        this.f41423c = 40;
        this.d.c(-1);
        this.f41421a = mcyVar;
        e(mea.d(mcyVar, this.f41423c, this.f41422b));
    }

    private void e(String str) {
        b(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(int i, int i2, String str, String str2) {
        LogUtil.a("ApduManager", "sendNextApdu index:", Integer.valueOf(i2), ", result:", Integer.valueOf(i), ",respApdu:", str, ",statusWord:", str2);
        mco mcoVar = new mco();
        mcoVar.c(i2);
        mcoVar.d(str);
        mcoVar.e(str2);
        b(mea.a(this.f41421a, this.f41423c, mcoVar, i, this.f41422b));
    }

    private void b(String str) {
        LogUtil.a("ApduManager", "sendApduToServer request:", str);
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(this.g)) {
            return;
        }
        String strD = d(str);
        if (TextUtils.isEmpty(strD)) {
            this.e.sendFailureMessage(100011, new Error("string is null."));
        } else {
            a(strD);
        }
    }

    private String d(String str) {
        if (c(this.g)) {
            return lta.b(this.g, str);
        }
        return ltf.a(this.g, str, false);
    }

    private boolean c(String str) {
        int iIndexOf;
        if (TextUtils.isEmpty(str) || (iIndexOf = str.indexOf(":")) < 0) {
            return false;
        }
        String strSubstring = str.substring(0, iIndexOf);
        LogUtil.a("ApduManager", "isHttpProtocol protocol:", strSubstring);
        return "http".equalsIgnoreCase(strSubstring);
    }

    private String e() {
        if (CommonUtil.cl()) {
            return GRSManager.c(BaseApplication.getContext()).getUrl("domainLfpaytest01Hwcloudtest") + "/TSMAPKP/HwTSMServer/applicationBusiness.action?version=" + mdy.h();
        }
        return GRSManager.c(BaseApplication.getContext()).getUrl("domainTsmServiceHicloud") + "/TSMAPKP/HwTSMServer/applicationBusiness.action?version=" + mdy.h();
    }

    private void a(String str) {
        mcv mcvVar;
        LogUtil.a("ApduManager", "onSuccess response:", str);
        try {
            mcvVar = (mcv) new Gson().fromJson(str, new TypeToken<mcv<mcs>>() { // from class: com.huawei.hwdevice.mainprocess.mgr.hwwatchfacemgr.touchtransfer.initese.apdu.ApduManager$2
            }.getType());
        } catch (JsonSyntaxException unused) {
            this.e.sendFailureMessage(100012, new Error("response data parse failure."));
            mcvVar = null;
        }
        if (mcvVar == null) {
            this.e.sendFailureMessage(100012, new Error("response data is empty."));
            return;
        }
        mcs mcsVar = (mcs) mcvVar.d();
        if (mcsVar == null) {
            this.e.sendFailureMessage(100012, new Error("business data is empty."));
            return;
        }
        int iB = mcsVar.b();
        LogUtil.a("ApduManager", "onSuccess result:", Integer.valueOf(iB));
        if (iB != 100000) {
            String strA = mcsVar.a();
            String str2 = this.f;
            if (str2 != null && !"".equals(str2)) {
                strA = strA + ":" + this.f;
                this.f = null;
            }
            this.e.sendFailureMessage(100013, new Error(strA));
            return;
        }
        int iC = mcsVar.c();
        LogUtil.a("ApduManager", "onSuccess finishFlag:", Integer.valueOf(iC));
        if (iC == 0) {
            this.e.sendSuccessMessage(null);
        } else {
            this.d.a(mcsVar.e());
            a();
        }
    }

    public void d(TsmOperatorResponse tsmOperatorResponse) {
        this.i = tsmOperatorResponse;
    }

    private void a() {
        mcm mcmVar = this.d;
        if (mcmVar != null) {
            mcmVar.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        this.f41422b = 1;
        this.f41423c = -1;
        this.f41421a = null;
        mcm mcmVar = this.d;
        if (mcmVar != null) {
            mcmVar.e().a();
        }
    }
}
