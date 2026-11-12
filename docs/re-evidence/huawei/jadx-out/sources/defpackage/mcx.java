package defpackage;

import android.text.TextUtils;
import com.huawei.hwdevice.mainprocess.mgr.hwwatchfacemgr.touchtransfer.initese.oma.SmartCardCallback;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.nfc.PluginPayAdapter;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class mcx implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f41444b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private SmartCardCallback f41445c;
    private mct e;

    mcx() {
    }

    public void b(mct mctVar) {
        this.e = mctVar;
    }

    public void e(SmartCardCallback smartCardCallback) {
        this.f41445c = smartCardCallback;
    }

    public void b(int i) {
        this.f41444b = i;
    }

    @Override // java.lang.Runnable
    public void run() {
        String strC = c(this.e.a());
        LogUtil.a("SmartCardRequest", "run openResult:", strC);
        if (TextUtils.isEmpty(strC)) {
            return;
        }
        try {
            a(strC);
        } catch (IOException unused) {
            mdt.d().a();
            e(this.f41444b, "execute apdu error.");
        }
    }

    private void a(String str) throws IOException {
        String strE;
        String strD = this.e.d();
        if (TextUtils.isEmpty(strD)) {
            e(this.f41444b, "executeApduCommand param is null");
            return;
        }
        try {
            strE = mdt.d().e(str, strD);
        } catch (mdc unused) {
            strE = null;
        }
        if (strE == null) {
            strE = "-1";
        }
        LogUtil.a("SmartCardRequest", "executeApduCommand channelType:", str, "executeApduCommand command:", strD, "，response apdu:", strE);
        a(this.f41444b, strE);
    }

    private String c(String str) {
        String str2;
        LogUtil.a("SmartCardRequest", "openCurrentAvailableChannel aid:", str);
        Map mapA = mdt.d().a(str, 0);
        if (mapA == null) {
            str2 = "";
        } else {
            str2 = (String) mapA.get(PluginPayAdapter.KEY_OPEN_CHANNEL_ID);
        }
        LogUtil.a("SmartCardRequest", "open channel:", str2);
        return str2;
    }

    private void a(int i, String str) {
        SmartCardCallback smartCardCallback = this.f41445c;
        if (smartCardCallback != null) {
            smartCardCallback.onOperatorSuccess(i, str);
        }
    }

    private void e(int i, String str) {
        LogUtil.a("SmartCardRequest", "operateFailure:", str);
        if (this.f41445c != null) {
            this.f41445c.onOperatorFailure(i, new Error(str));
        }
    }
}
