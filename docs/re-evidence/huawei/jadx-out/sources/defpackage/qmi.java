package defpackage;

import com.huawei.ui.commonui.linechart.icommon.IHwHealthDataSetStyle;

/* JADX INFO: loaded from: classes16.dex */
public class qmi {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f46478c = false;
    private IHwHealthDataSetStyle e = new qpf();

    public void e(boolean z) {
        this.f46478c = z;
    }

    public boolean b() {
        return this.f46478c;
    }

    public void d(IHwHealthDataSetStyle iHwHealthDataSetStyle) {
        this.e = iHwHealthDataSetStyle;
    }

    public IHwHealthDataSetStyle c() {
        return this.e;
    }

    public void e(qmi qmiVar) {
        if (qmiVar != null) {
            this.f46478c = qmiVar.f46478c;
            this.e = qmiVar.e;
        }
    }
}
