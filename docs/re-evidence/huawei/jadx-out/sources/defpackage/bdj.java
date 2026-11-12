package defpackage;

import com.huawei.animation.physical2.ParamTransfer;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes23.dex */
public class bdj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f1041a = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<bdk> f1042c = new ArrayList();
    private float d;
    private ParamTransfer<Float> e;

    private bdj(ParamTransfer<Float> paramTransfer) {
        this.e = paramTransfer;
    }

    public static bdj a(int i, int i2, float f, ParamTransfer<Float> paramTransfer) {
        if (i <= 0 || paramTransfer == null) {
            throw new IllegalArgumentException("illegal parameter");
        }
        bdj bdjVar = new bdj(paramTransfer);
        bdjVar.e = paramTransfer;
        bdjVar.d = f;
        for (int i3 = 0; i3 < i; i3++) {
            bdjVar.f1042c.add(new bdk(i2, paramTransfer.transfer(Float.valueOf(bdjVar.d), i3).floatValue()));
        }
        return bdjVar;
    }

    public float e(int i, float f) {
        if (i < 0 || i >= this.f1042c.size() || this.f1042c.get(i) == null) {
            throw new IllegalArgumentException("parameter out of range");
        }
        return this.f1042c.get(i).getRate(f);
    }

    public void e(int i) {
        if (i == this.f1041a) {
            return;
        }
        this.f1041a = i;
        for (int i2 = 0; i2 < this.f1042c.size(); i2++) {
            bdk bdkVar = this.f1042c.get(i2);
            if (bdkVar != null) {
                bdkVar.d(this.e.transfer(Float.valueOf(this.d), Math.abs(i2 - i)).floatValue());
            }
        }
    }
}
