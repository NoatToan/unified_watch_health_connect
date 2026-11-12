package u1;

import android.view.KeyEvent;
import java.util.List;
import kotlin.a4;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p008y1.k3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0011\u0018\u00002\u00020\u0001BM\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lu1/y;", "Lu1/b;", "La2/j;", "interactionSource", "Lu1/f1;", "indicationNodeFactory", "", "useLocalIndication", "enabled", "", "onClickLabel", "Lp5/l;", "role", "Lkotlin/Function0;", "", "onClick", "<init>", "(La2/j;Lu1/f1;ZZLjava/lang/String;Lp5/l;Le23/a;Lkotlin/jvm/internal/j;)V", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class y extends b {
    public final boolean A;
    public b5.a0 B;

    private y(a2.j jVar, f1 f1Var, boolean z14, boolean z15, String str, p5.l lVar, e23.a<Unit> aVar) {
        super(jVar, f1Var, z14, z15, str, lVar, aVar, null);
        this.A = (g0.f167494a && g0.f167498e) ? false : true;
    }

    @Override // u1.b
    public final b5.v0 Y1() {
        if (this.A) {
            return b5.s0.a(new x(this));
        }
        return null;
    }

    @Override // u1.b, h5.u1
    public final void a1() {
        super.a1();
        if (this.B != null) {
            this.B = null;
            b2(false);
        }
    }

    @Override // u1.b
    public final boolean g2(KeyEvent keyEvent) {
        return false;
    }

    @Override // u1.b
    public final void h2(KeyEvent keyEvent) {
        this.f167354i.invoke();
    }

    @Override // u1.b, h5.u1
    public final void u1(b5.q qVar, b5.s sVar, long j8) {
        super.u1(qVar, sVar, j8);
        if (this.A) {
            return;
        }
        if (sVar != b5.s.Main) {
            if (sVar != b5.s.Final || this.B == null) {
                return;
            }
            List<b5.a0> list = qVar.f15870a;
            int size = list.size();
            for (int i14 = 0; i14 < size; i14++) {
                b5.a0 a0Var = list.get(i14);
                if (a0Var.b() && !a0Var.equals(this.B)) {
                    this.B = null;
                    b2(false);
                    return;
                }
            }
            return;
        }
        b5.a0 a0Var2 = this.B;
        if (a0Var2 == null) {
            if (k3.g(qVar, true, false)) {
                b5.a0 a0Var3 = qVar.f15870a.get(0);
                a0Var3.a();
                this.B = a0Var3;
                if (this.f167353h) {
                    d2(a0Var3.f15750c, false);
                    return;
                }
                return;
            }
            return;
        }
        List<b5.a0> list2 = qVar.f15870a;
        int size2 = list2.size();
        for (int i15 = 0; i15 < size2; i15++) {
            if (!b5.r.c(list2.get(i15))) {
                long jK1 = h5.k.g(this).A.k1(((a4) h5.i.a(this, kotlin.t1.f91502t)).g());
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Math.max(0.0f, Float.intBitsToFloat((int) (jK1 >> 32)) - ((int) (j8 >> 32))) / 2.0f)) << 32) | (((long) Float.floatToRawIntBits(Math.max(0.0f, Float.intBitsToFloat((int) (jK1 & 4294967295L)) - ((int) (j8 & 4294967295L))) / 2.0f)) & 4294967295L);
                n4.g.a aVar = n4.g.f123559b;
                int size3 = list2.size();
                for (int i16 = 0; i16 < size3; i16++) {
                    b5.a0 a0Var4 = list2.get(i16);
                    if (a0Var4.b() || b5.r.e(a0Var4, j8, jFloatToRawIntBits)) {
                        this.B = null;
                        b2(false);
                        return;
                    }
                }
                return;
            }
        }
        list2.get(0).a();
        if (this.f167353h) {
            c2(a0Var2.f15750c, false);
            this.f167354i.invoke();
        }
        this.B = null;
    }

    public /* synthetic */ y(a2.j jVar, f1 f1Var, boolean z14, boolean z15, String str, p5.l lVar, e23.a aVar, p005kotlin.jvm.internal.j jVar2) {
        this(jVar, f1Var, z14, z15, str, lVar, aVar);
    }
}
