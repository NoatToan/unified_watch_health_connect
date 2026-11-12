package defpackage;

import com.huawei.hwdevice.mainprocess.mgr.hwwatchfacemgr.touchtransfer.initese.oma.SmartCardCallback;
import com.huawei.hwlogsmodel.LogUtil;

/* JADX INFO: loaded from: classes10.dex */
public class mcw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private mcx f41441a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private SmartCardCallback f41442b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private mct f41443c;
    private int e = -1;

    public void a(int i, mct mctVar) {
        this.e = i;
        if (mctVar == null) {
            b(i, "SmartCardBean must not allow to null.");
        } else if (mctVar.a() == null) {
            b(this.e, "the aid must not allow to null");
        } else {
            this.f41443c = mctVar;
            e();
        }
    }

    private void e() {
        if (this.f41441a == null) {
            LogUtil.j("SmartCard", "new SmartCardRequest");
            this.f41441a = new mcx();
        }
        this.f41441a.b(this.f41443c);
        this.f41441a.e(this.f41442b);
        this.f41441a.b(this.e);
        this.f41441a.run();
    }

    public mcw a(SmartCardCallback smartCardCallback) {
        this.f41442b = smartCardCallback;
        return this;
    }

    public void a() {
        if (this.f41441a != null) {
            mdt.d().a();
            this.f41441a = null;
        }
        this.f41442b = null;
        this.f41443c = null;
    }

    private void b(int i, String str) {
        if (this.f41442b != null) {
            this.f41442b.onOperatorFailure(i, new Error(str));
        }
    }
}
