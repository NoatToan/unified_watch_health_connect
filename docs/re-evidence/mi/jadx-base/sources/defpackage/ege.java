package defpackage;

import android.annotation.TargetApi;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import com.github.mikephil.charting.data.Entry;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ege<T extends Entry> extends hge<T> implements ltc<T> {
    public int A;
    public Drawable B;
    public int C;
    public float D;
    public boolean E;

    public ege(List<T> list, String str) {
        super(list, str);
        this.A = Color.rgb(140, 234, 255);
        this.C = 85;
        this.D = 2.5f;
        this.E = false;
    }

    @Override // defpackage.ltc
    public boolean C0() {
        return this.E;
    }

    @Override // defpackage.ltc
    public int U() {
        return this.C;
    }

    @Override // defpackage.ltc
    public float X() {
        return this.D;
    }

    @Override // defpackage.ltc
    public Drawable g() {
        return this.B;
    }

    public void o1(boolean z) {
        this.E = z;
    }

    public void p1(int i) {
        this.C = i;
    }

    public void q1(int i) {
        this.A = i;
        this.B = null;
    }

    @TargetApi(18)
    public void r1(Drawable drawable) {
        this.B = drawable;
    }

    public void s1(float f) {
        if (f < 0.0f) {
            f = 0.0f;
        }
        if (f > 10.0f) {
            f = 10.0f;
        }
        this.D = fmq.e(f);
    }

    @Override // defpackage.ltc
    public int y() {
        return this.A;
    }
}
