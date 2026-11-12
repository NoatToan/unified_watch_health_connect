package w5;

import ch.qos.logback.core.CoreConstants;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.util.ArrayList;
import p005kotlin.Metadata;
import r1.q2;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B9\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lw5/p0;", "Lw5/p;", "", "resId", "Lw5/f0;", "weight", "Lw5/b0;", TtmlNode.TAG_STYLE, "Lw5/e0$d;", "variationSettings", "Lw5/z;", "loadingStrategy", "<init>", "(ILw5/f0;ILw5/e0$d;ILkotlin/jvm/internal/j;)V", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class p0 implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f182144a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f0 f182145b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f182146c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e0.d f182147d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f182148e;

    public p0(int i14, f0 f0Var, int i15, e0.d dVar, int i16, int i17, p005kotlin.jvm.internal.j jVar) {
        int i18;
        if ((i17 & 2) != 0) {
            f0.f182097b.getClass();
            f0Var = f0.f182102g;
        }
        f0 f0Var2 = f0Var;
        if ((i17 & 4) != 0) {
            b0.f182070b.getClass();
            i18 = 0;
        } else {
            i18 = i15;
        }
        if ((i17 & 8) != 0) {
            e0.a[] aVarArr = new e0.a[0];
            e0.f182088a.getClass();
            p005kotlin.jvm.internal.w0 w0Var = new p005kotlin.jvm.internal.w0(3);
            int i19 = f0Var2.f182107a;
            if (1 > i19 || i19 >= 1001) {
                y5.a.a("'wght' value must be in [1, 1000]. Actual: " + i19);
            }
            w0Var.a(new e0.c("wght", i19));
            float f14 = i18;
            if (0.0f > f14 || f14 > 1.0f) {
                y5.a.a("'ital' must be in 0.0f..1.0f. Actual: " + f14);
            }
            w0Var.a(new e0.b("ital", f14));
            w0Var.b(aVarArr);
            ArrayList<Object> arrayList = w0Var.f105816a;
            dVar = new e0.d((e0.a[]) arrayList.toArray(new e0.a[arrayList.size()]));
        }
        e0.d dVar2 = dVar;
        if ((i17 & 16) != 0) {
            z.f182183b.getClass();
            i16 = z.f182185d;
        }
        this(i14, f0Var2, i18, dVar2, i16, null);
    }

    @Override // w5.p
    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getF182148e() {
        return this.f182148e;
    }

    @Override // w5.p
    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getF182146c() {
        return this.f182146c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p0)) {
            return false;
        }
        p0 p0Var = (p0) obj;
        if (this.f182144a != p0Var.f182144a || !p005kotlin.jvm.internal.s.g(this.f182145b, p0Var.f182145b)) {
            return false;
        }
        int i14 = p0Var.f182146c;
        b0.a aVar = b0.f182070b;
        if (this.f182146c != i14 || !p005kotlin.jvm.internal.s.g(this.f182147d, p0Var.f182147d)) {
            return false;
        }
        int i15 = p0Var.f182148e;
        z.a aVar2 = z.f182183b;
        return this.f182148e == i15;
    }

    @Override // w5.p
    /* JADX INFO: renamed from: getWeight, reason: from getter */
    public final f0 getF182145b() {
        return this.f182145b;
    }

    public final int hashCode() {
        int i14 = ((this.f182144a * 31) + this.f182145b.f182107a) * 31;
        b0.a aVar = b0.f182070b;
        int iD = q2.d(this.f182146c, i14, 31);
        z.a aVar2 = z.f182183b;
        return this.f182147d.f182093a.hashCode() + q2.d(this.f182148e, iD, 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb3 = new StringBuilder("ResourceFont(resId=");
        sb3.append(this.f182144a);
        sb3.append(", weight=");
        sb3.append(this.f182145b);
        sb3.append(", style=");
        int i14 = this.f182146c;
        if (i14 == 0) {
            b0.a aVar = b0.f182070b;
            str = "Normal";
        } else {
            str = i14 == b0.f182071c ? "Italic" : "Invalid";
        }
        sb3.append((Object) str);
        sb3.append(", loadingStrategy=");
        sb3.append((Object) z.a(this.f182148e));
        sb3.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        return sb3.toString();
    }

    private p0(int i14, f0 f0Var, int i15, e0.d dVar, int i16) {
        this.f182144a = i14;
        this.f182145b = f0Var;
        this.f182146c = i15;
        this.f182147d = dVar;
        this.f182148e = i16;
    }

    public /* synthetic */ p0(int i14, f0 f0Var, int i15, e0.d dVar, int i16, p005kotlin.jvm.internal.j jVar) {
        this(i14, f0Var, i15, dVar, i16);
    }
}
