package defpackage;

import java.text.DecimalFormat;

/* JADX INFO: loaded from: classes7.dex */
public class mt5 extends vx5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public DecimalFormat f27175a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f27176b;

    public mt5(int i) {
        this.f27176b = i;
        StringBuffer stringBuffer = new StringBuffer();
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 == 0) {
                stringBuffer.append(".");
            }
            stringBuffer.append("0");
        }
        this.f27175a = new DecimalFormat("###,###,###,##0" + stringBuffer.toString());
    }

    @Override // defpackage.vx5
    public int getDecimalDigits() {
        return this.f27176b;
    }

    @Override // defpackage.vx5, defpackage.onq
    public String getFormattedValue(float f) {
        return this.f27175a.format(f);
    }
}
