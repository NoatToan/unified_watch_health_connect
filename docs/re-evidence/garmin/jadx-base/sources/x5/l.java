package x5;

import java.util.List;
import p005kotlin.Metadata;
import s5.w0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lx5/l;", "", "<init>", "()V", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public l0 f188874a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public m f188875b;

    public l() {
        s5.c cVar = s5.f.f157158a;
        w0.f157315b.getClass();
        this.f188874a = new l0(cVar, w0.f157316c, (w0) null, (p005kotlin.jvm.internal.j) null);
        l0 l0Var = this.f188874a;
        this.f188875b = new m(l0Var.f188878a, l0Var.f188879b, (p005kotlin.jvm.internal.j) null);
    }

    public final l0 a(List<? extends k> list) {
        k kVar = null;
        try {
            int size = list.size();
            int i14 = 0;
            k kVar2 = null;
            while (i14 < size) {
                try {
                    k kVar3 = list.get(i14);
                    try {
                        kVar3.a(this.f188875b);
                        i14++;
                        kVar2 = kVar3;
                    } catch (Exception e4) {
                        e = e4;
                        kVar = kVar3;
                        StringBuilder sb3 = new StringBuilder();
                        StringBuilder sb4 = new StringBuilder("Error while applying EditCommand batch to buffer (length=");
                        sb4.append(this.f188875b.f188881a.a());
                        sb4.append(", composition=");
                        sb4.append(this.f188875b.c());
                        sb4.append(", selection=");
                        m mVar = this.f188875b;
                        sb4.append((Object) w0.j(og.a.l(mVar.f188882b, mVar.f188883c)));
                        sb4.append("):");
                        sb3.append(sb4.toString());
                        sb3.append('\n');
                        p13.h0.j0(list, sb3, "\n", null, null, new vu1.b(kVar, this), 60);
                        throw new RuntimeException(sb3.toString(), e);
                    }
                } catch (Exception e14) {
                    e = e14;
                    kVar = kVar2;
                }
            }
            m mVar2 = this.f188875b;
            mVar2.getClass();
            s5.c cVar = new s5.c(mVar2.f188881a.toString(), null, 2, null);
            m mVar3 = this.f188875b;
            long jL = og.a.l(mVar3.f188882b, mVar3.f188883c);
            w0 w0VarA = w0.i(this.f188874a.f188879b) ? null : w0.a(jL);
            l0 l0Var = new l0(cVar, w0VarA != null ? w0VarA.f157317a : og.a.l(w0.g(jL), w0.h(jL)), this.f188875b.c(), (p005kotlin.jvm.internal.j) null);
            this.f188874a = l0Var;
            return l0Var;
        } catch (Exception e15) {
            e = e15;
        }
    }
}
