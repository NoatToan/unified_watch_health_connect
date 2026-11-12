package defpackage;

import java.text.DecimalFormat;

/* JADX INFO: loaded from: classes7.dex */
public class vx5 extends onq {
    protected int mDecimalDigits;
    protected DecimalFormat mFormat;

    public vx5() {
        this(0);
    }

    public int getDecimalDigits() {
        return this.mDecimalDigits;
    }

    @Override // defpackage.onq
    public String getFormattedValue(float f) {
        return this.mFormat.format(f);
    }

    public void setup(int i) {
        this.mDecimalDigits = i;
        StringBuffer stringBuffer = new StringBuffer();
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 == 0) {
                stringBuffer.append(".");
            }
            stringBuffer.append("0");
        }
        this.mFormat = new DecimalFormat("###,###,###,##0" + stringBuffer.toString());
    }

    public vx5(int i) {
        setup(i);
    }
}
