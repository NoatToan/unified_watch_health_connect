package defpackage;

import java.text.DecimalFormat;

/* JADX INFO: loaded from: classes4.dex */
public class nt5 implements fpc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public DecimalFormat f28349a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f28350b;

    public nt5(int i) {
        this.f28350b = i;
        StringBuffer stringBuffer = new StringBuffer();
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 == 0) {
                stringBuffer.append(".");
            }
            stringBuffer.append("0");
        }
        this.f28349a = new DecimalFormat("###,###,###,##0" + stringBuffer.toString());
    }

    public int a() {
        return this.f28350b;
    }

    @Override // defpackage.fpc
    public String getFormattedValue(float f, ft1 ft1Var) {
        return this.f28349a.format(f);
    }
}
