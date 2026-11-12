package defpackage;

import com.chipsea.health.CSAlgorithmUtils;
import java.util.Calendar;

/* JADX INFO: loaded from: classes4.dex */
public class wj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f52094a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f52095b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f52096c;
    private float d;
    private byte e;
    private int f;
    private final String g = "No Authorized Access!";
    private final String h = "Illegal device!";
    private final long m = 8613800138008L;
    private boolean i = true;
    private int j = Calendar.getInstance().get(1);

    public int d(float f, float f2, byte b2, int i, float f3) {
        if (f < 90.0f || f > 220.0f) {
            return -3;
        }
        if (f2 < 20.0f || f2 > 150.0f) {
            return -2;
        }
        if (i < 10 || i > 99) {
            return -4;
        }
        if (b2 != 0 && b2 != 1) {
            return -5;
        }
        this.f52095b = f;
        this.f52094a = f2;
        this.e = b2;
        this.f52096c = i;
        this.d = f3;
        this.f = 0;
        return 0;
    }

    public void b(float f, float f2, byte b2, int i, float f3) {
        this.f52095b = f;
        this.f52094a = f2;
        this.e = b2;
        this.f52096c = i;
        this.d = f3;
        this.f = 0;
    }

    public float g() throws wk {
        if (this.i) {
            return new CSAlgorithmUtils().getVFR(this.f52095b, this.e, this.f52094a, this.f52096c, (int) this.d, this.j);
        }
        throw new wk("No Authorized Access!");
    }

    public float h() throws wk {
        if (this.i) {
            return new CSAlgorithmUtils().getTFR(this.f52095b, this.e, this.f52094a, this.f52096c, (int) this.d, this.j);
        }
        throw new wk("No Authorized Access!");
    }

    public int i() throws wk {
        if (this.i) {
            return new CSAlgorithmUtils().getScore(this.f52095b, this.e, this.f52094a, this.f52096c, (int) this.d, this.j);
        }
        throw new wk("No Authorized Access!");
    }

    public float f() throws wk {
        if (this.i) {
            return new CSAlgorithmUtils().getSMM(this.f52095b, this.e, this.f52094a, this.f52096c, (int) this.d, this.j);
        }
        throw new wk("No Authorized Access!");
    }

    public float j() throws wk {
        if (this.i) {
            return new CSAlgorithmUtils().getSLM(this.f52095b, this.e, this.f52094a, this.f52096c, (int) this.d, this.j);
        }
        throw new wk("No Authorized Access!");
    }

    public float a() throws wk {
        if (this.i) {
            return new CSAlgorithmUtils().getPM(this.f52095b, this.e, this.f52094a, this.f52096c, (int) this.d, this.j);
        }
        throw new wk("No Authorized Access!");
    }

    public float e() throws wk {
        if (this.i) {
            return new CSAlgorithmUtils().getMSW(this.f52095b, this.e, this.f52094a, this.f52096c, (int) this.d, this.j);
        }
        throw new wk("No Authorized Access!");
    }

    public float d() throws wk {
        if (!this.i) {
            throw new wk("No Authorized Access!");
        }
        int bodyAge = new CSAlgorithmUtils().getBodyAge(this.f52095b, this.e, this.f52094a, this.f52096c, (int) this.d, this.j);
        int i = this.f52096c;
        int i2 = bodyAge - i;
        if (i2 > 10) {
            bodyAge = i + 10;
        } else if (i2 < -10) {
            bodyAge = i - 10;
        }
        return bodyAge;
    }

    public float b() throws wk {
        if (this.i) {
            return new CSAlgorithmUtils().getBMR(this.f52095b, this.e, this.f52094a, this.f52096c, (int) this.d, this.j);
        }
        throw new wk("No Authorized Access!");
    }

    public float c() throws wk {
        if (this.i) {
            return new CSAlgorithmUtils().getBFR(this.f52095b, this.e, this.f52094a, this.f52096c, (int) this.d, this.j);
        }
        throw new wk("No Authorized Access!");
    }

    public static int c(float f, byte b2, float f2, int i, float f3) {
        return new CSAlgorithmUtils().getResistance(f, b2, f2, i, f3);
    }
}
