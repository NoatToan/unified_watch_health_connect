package defpackage;

import com.xiaomi.fitness.common.utils.TimeDateUtil;
import java.text.DecimalFormat;

/* JADX INFO: loaded from: classes7.dex */
public class mx5 extends mt5 {
    public DecimalFormat c;
    public int d;

    public mx5() {
        this(0);
    }

    @Override // defpackage.mt5, defpackage.vx5
    public int getDecimalDigits() {
        return this.d;
    }

    @Override // defpackage.mt5, defpackage.vx5, defpackage.onq
    public String getFormattedValue(float f) {
        return TimeDateUtil.getSportPaceStrWithSecDef(Math.round(f));
    }

    public mx5(int i) {
        super(i);
        this.d = i;
        StringBuffer stringBuffer = new StringBuffer();
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 == 0) {
                stringBuffer.append(".");
            }
            stringBuffer.append("0");
        }
        this.c = new DecimalFormat("###,###,###,##0" + stringBuffer.toString());
    }
}
