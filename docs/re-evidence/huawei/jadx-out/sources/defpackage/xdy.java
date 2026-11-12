package defpackage;

import android.util.Log;
import com.huawei.uikit.hwcolumnsystem.widget.akxao;

/* JADX INFO: loaded from: classes20.dex */
public class xdy extends akxao {
    private static final String o = "avpbg";
    private int m;
    private int n;
    private int r;

    @Override // com.huawei.uikit.hwcolumnsystem.widget.akxao
    public final float a(int i) {
        return (i * this.j) + ((i - 1) * this.f);
    }

    @Override // com.huawei.uikit.hwcolumnsystem.widget.akxao
    public final int b() {
        return this.m;
    }

    @Override // com.huawei.uikit.hwcolumnsystem.widget.akxao
    public int c() {
        return this.n;
    }

    @Override // com.huawei.uikit.hwcolumnsystem.widget.akxao
    public int d() {
        return this.m;
    }

    @Override // com.huawei.uikit.hwcolumnsystem.widget.akxao
    public void e() {
        int i = this.i;
        if (i == 0) {
            Log.e(o, "total column is 0");
            return;
        }
        this.j = ((this.f29346a - (this.e * 2)) - (this.f * (i - 1))) / (i * 1.0f);
        int iA = (int) (a(i) + 0.5f);
        this.r = iA;
        int i2 = this.g;
        if (i2 == -2) {
            this.m = iA + (this.e * 2);
        } else {
            this.m = (int) (a(i2) + b(true) + 0.5f);
        }
        int i3 = this.h;
        if (i3 == -2) {
            this.n = this.r + (this.e * 2);
        } else {
            this.n = (int) (a(i3) + b(false) + 0.5f);
        }
    }

    private int b(boolean z) {
        int i;
        int i2;
        if (!this.l) {
            return 0;
        }
        int i3 = this.k;
        if (i3 == 1 || i3 == 17) {
            if (this.i == 4 && z) {
                i = this.f;
                return i * 2;
            }
            return 0;
        }
        if (i3 == 19 && ((i2 = this.i) == 8 || i2 == 12)) {
            i = this.f;
            return i * 2;
        }
        return 0;
    }
}
