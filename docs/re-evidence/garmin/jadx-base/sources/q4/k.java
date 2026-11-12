package q4;

import ch.qos.logback.core.CoreConstants;
import o4.g1;
import o4.u1;
import o4.v1;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import r1.q2;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\rB;\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lq4/k;", "Lq4/g;", "", "width", "miter", "Lo4/u1;", "cap", "Lo4/v1;", "join", "Lo4/g1;", "pathEffect", "<init>", "(FFIILo4/g1;Lkotlin/jvm/internal/j;)V", "a", "ui-graphics"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class k extends g {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f142561f = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f142562a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f142563b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f142564c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f142565d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final g1 f142566e;

    static {
        u1.f129010b.getClass();
        v1.f129019b.getClass();
    }

    public /* synthetic */ k(float f14, float f15, int i14, int i15, g1 g1Var, int i16, p005kotlin.jvm.internal.j jVar) {
        this((i16 & 1) != 0 ? 0.0f : f14, (i16 & 2) != 0 ? 4.0f : f15, (i16 & 4) != 0 ? 0 : i14, (i16 & 8) != 0 ? 0 : i15, (i16 & 16) != 0 ? null : g1Var, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        if (this.f142562a == kVar.f142562a && this.f142563b == kVar.f142563b) {
            int i14 = kVar.f142564c;
            u1.a aVar = u1.f129010b;
            if (this.f142564c == i14) {
                int i15 = kVar.f142565d;
                v1.a aVar2 = v1.f129019b;
                return this.f142565d == i15 && s.g(this.f142566e, kVar.f142566e);
            }
        }
        return false;
    }

    public final int hashCode() {
        int iD = q6.f.d(this.f142563b, Float.hashCode(this.f142562a) * 31, 31);
        u1.a aVar = u1.f129010b;
        int iD2 = q2.d(this.f142564c, iD, 31);
        v1.a aVar2 = v1.f129019b;
        int iD3 = q2.d(this.f142565d, iD2, 31);
        g1 g1Var = this.f142566e;
        return iD3 + (g1Var != null ? g1Var.hashCode() : 0);
    }

    public final String toString() {
        String str;
        StringBuilder sb3 = new StringBuilder("Stroke(width=");
        sb3.append(this.f142562a);
        sb3.append(", miter=");
        sb3.append(this.f142563b);
        sb3.append(", cap=");
        String str2 = "Unknown";
        int i14 = this.f142564c;
        if (i14 == 0) {
            str = "Butt";
        } else if (i14 == u1.f129011c) {
            str = "Round";
        } else {
            str = i14 == u1.f129012d ? "Square" : "Unknown";
        }
        sb3.append((Object) str);
        sb3.append(", join=");
        int i15 = this.f142565d;
        if (i15 == 0) {
            str2 = "Miter";
        } else if (i15 == v1.f129020c) {
            str2 = "Round";
        } else if (i15 == v1.f129021d) {
            str2 = "Bevel";
        }
        sb3.append((Object) str2);
        sb3.append(", pathEffect=");
        sb3.append(this.f142566e);
        sb3.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        return sb3.toString();
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lq4/k$a;", "", "<init>", "()V", "", "HairlineWidth", "F", "DefaultMiter", "ui-graphics"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    private k(float f14, float f15, int i14, int i15, g1 g1Var) {
        super(null);
        this.f142562a = f14;
        this.f142563b = f15;
        this.f142564c = i14;
        this.f142565d = i15;
        this.f142566e = g1Var;
    }

    public /* synthetic */ k(float f14, float f15, int i14, int i15, g1 g1Var, p005kotlin.jvm.internal.j jVar) {
        this(f14, f15, i14, i15, g1Var);
    }
}
