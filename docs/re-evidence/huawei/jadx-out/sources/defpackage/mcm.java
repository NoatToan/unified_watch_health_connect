package defpackage;

import com.huawei.hwdevice.mainprocess.mgr.hwwatchfacemgr.touchtransfer.initese.apdu.ApduResponseHandler;
import com.huawei.hwdevice.mainprocess.mgr.hwwatchfacemgr.touchtransfer.initese.oma.SmartCardCallback;
import com.huawei.hwlogsmodel.LogUtil;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes10.dex */
public class mcm implements Runnable, SmartCardCallback {
    private static final Object d = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<mck> f41424a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private mck f41426c;
    private String e;
    private ApduResponseHandler i;
    private int j;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f41425b = 0;
    private boolean g = false;
    private mcw h = new mcw();

    public mcm(ApduResponseHandler apduResponseHandler) {
        this.i = apduResponseHandler;
    }

    public mcw e() {
        return this.h;
    }

    @Override // java.lang.Runnable
    public void run() {
        d();
    }

    private void d() {
        synchronized (d) {
            List<mck> list = this.f41424a;
            if (list == null) {
                return;
            }
            if (this.f41425b == list.size()) {
                LogUtil.j("ApduSmartCardRequest", "mCurrentExecuteIndex == mApduList.size()");
                return;
            }
            mck mckVar = this.f41424a.get(this.f41425b);
            this.f41426c = mckVar;
            String strD = mckVar.d();
            LogUtil.a("ApduSmartCardRequest", "start get apdu index:", Integer.valueOf(this.f41425b), ", apdu:", strD);
            try {
                if ("00A4".equals(strD.substring(0, 4))) {
                    LogUtil.a("ApduSmartCardRequest", "deal with select apdu:", strD);
                    this.e = strD.substring(strD.length() - (Integer.parseInt(strD.substring(8, 10), 16) * 2), strD.length());
                    this.f41425b++;
                    this.h.a();
                    LogUtil.a("ApduSmartCardRequest", "has get select aid:", this.e);
                    d();
                    return;
                }
                if (this.e == null) {
                    LogUtil.j("ApduSmartCardRequest", "mApduAid is null");
                    return;
                }
                LogUtil.a("ApduSmartCardRequest", "start execute apdu:", strD);
                mct mctVar = new mct(this.e);
                mctVar.d(strD);
                this.h.a(this).a(this.j, mctVar);
            } catch (NumberFormatException | StringIndexOutOfBoundsException unused) {
                LogUtil.e("ApduSmartCardRequest", "sendApudToSmartCard catch exception");
            }
        }
    }

    @Override // com.huawei.hwdevice.mainprocess.mgr.hwwatchfacemgr.touchtransfer.initese.oma.SmartCardCallback
    public void onOperatorSuccess(int i, String str) {
        String upperCase;
        LogUtil.a("ApduSmartCardRequest", "handle apdu response:", str, ",mIsGetLocalData:", Boolean.valueOf(this.g));
        if (this.g) {
            a(str);
            return;
        }
        if (str != null && str.length() > 4) {
            String strSubstring = str.substring(str.length() - 4, str.length());
            upperCase = str.substring(0, str.length() - 4).toUpperCase(Locale.getDefault());
            str = strSubstring;
        } else {
            upperCase = "";
        }
        if (str != null) {
            str = str.toUpperCase(Locale.getDefault());
        }
        LogUtil.a("ApduSmartCardRequest", "get response respStatusWord:", str);
        if (this.f41426c.b() != null) {
            if (!Arrays.asList(this.f41426c.b()).contains(str)) {
                e(1, this.f41426c.e(), upperCase, str);
                return;
            }
        } else {
            LogUtil.j("ApduSmartCardRequest", "mCurrentExecuteApduBean.getStatusWord() is null");
        }
        if (this.f41425b < this.f41424a.size() - 1) {
            this.f41425b++;
            d();
        } else {
            e(0, this.f41426c.e(), upperCase, str);
        }
    }

    @Override // com.huawei.hwdevice.mainprocess.mgr.hwwatchfacemgr.touchtransfer.initese.oma.SmartCardCallback
    public void onOperatorFailure(int i, Error error) {
        LogUtil.a("ApduSmartCardRequest", "onOperatorFailure mIsGetLocalData : ", Boolean.valueOf(this.g));
        if (this.g) {
            e(100009, error);
        } else {
            c(1, this.f41426c.e(), "", "", error);
        }
    }

    public void a(List<mck> list) {
        this.f41424a = list;
    }

    public void c(int i) {
        this.j = i;
    }

    private void e(int i, int i2, String str, String str2) {
        a();
        ApduResponseHandler apduResponseHandler = this.i;
        if (apduResponseHandler != null) {
            apduResponseHandler.sendSendNextMessage(i, i2, str, str2);
        }
    }

    private void c(int i, int i2, String str, String str2, Error error) {
        a();
        ApduResponseHandler apduResponseHandler = this.i;
        if (apduResponseHandler != null) {
            apduResponseHandler.sendSendNextErrorMessage(i, i2, str, str2, error);
        }
    }

    private void a(String str) {
        a();
        ApduResponseHandler apduResponseHandler = this.i;
        if (apduResponseHandler != null) {
            apduResponseHandler.sendSuccessMessage(str);
        }
    }

    private void e(int i, Error error) {
        a();
        ApduResponseHandler apduResponseHandler = this.i;
        if (apduResponseHandler != null) {
            apduResponseHandler.sendFailureMessage(i, error);
        }
    }

    private void a() {
        LogUtil.a("ApduSmartCardRequest", "clearData");
        this.f41425b = 0;
        this.f41426c = null;
        this.g = false;
    }
}
