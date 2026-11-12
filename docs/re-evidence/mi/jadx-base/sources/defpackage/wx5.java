package defpackage;

import com.github.mikephil.charting.data.Entry;
import java.text.DecimalFormat;

/* JADX INFO: loaded from: classes4.dex */
public class wx5 implements k0d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public DecimalFormat f38451a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f38452b;

    public wx5(int i) {
        b(i);
    }

    @Override // defpackage.k0d
    public String a(float f, Entry entry, int i, hwq hwqVar) {
        return this.f38451a.format(f);
    }

    public void b(int i) {
        this.f38452b = i;
        StringBuffer stringBuffer = new StringBuffer();
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 == 0) {
                stringBuffer.append(".");
            }
            stringBuffer.append("0");
        }
        this.f38451a = new DecimalFormat("###,###,###,##0" + stringBuffer.toString());
    }
}
