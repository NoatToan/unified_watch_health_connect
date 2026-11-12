package b11;

import c22.c3;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import lc.u0;
import p005kotlin.Metadata;
import p13.j0;
import p13.y;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lb11/u;", "", "<init>", "()V", "a", "b", "Lb11/u$a;", "Lb11/u$b;", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class u {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lb11/u$b;", "Lb11/u;", "", "text", "<init>", "(Ljava/lang/String;)V", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class b extends u {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f14384a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str) {
            super(null);
            str.getClass();
            this.f14384a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && p005kotlin.jvm.internal.s.g(this.f14384a, ((b) obj).f14384a);
        }

        public final int hashCode() {
            return this.f14384a.hashCode();
        }

        public final String toString() {
            return am.j.m("Text(text=", this.f14384a, ")");
        }
    }

    public /* synthetic */ u(p005kotlin.jvm.internal.j jVar) {
        this();
    }

    public final String a(p3.m mVar) {
        String strU;
        x1 x1Var = p3.n.f135158a;
        if (this instanceof a) {
            a aVar = (a) this;
            List<u> list = aVar.f14383b;
            boolean zIsEmpty = list.isEmpty();
            c3 c3Var = aVar.f14382a;
            if (zIsEmpty) {
                mVar.C(-21312236);
                strU = gl1.d.T(c3Var, mVar, 0);
                mVar.f();
            } else {
                mVar.C(-21247229);
                mVar.C(1661884328);
                ArrayList arrayList = new ArrayList(y.r(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((u) it.next()).a(mVar));
                }
                mVar.f();
                String[] strArr = (String[]) arrayList.toArray(new String[0]);
                strU = gl1.d.U(c3Var, Arrays.copyOf(strArr, strArr.length), mVar);
                mVar.f();
            }
        } else {
            if (!(this instanceof b)) {
                u0.r();
                return null;
            }
            strU = ((b) this).f14384a;
        }
        x1 x1Var2 = p3.n.f135158a;
        return strU;
    }

    private u() {
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lb11/u$a;", "Lb11/u;", "Lc22/c3;", "resourceId", "", "formatArgs", "<init>", "(Lc22/c3;Ljava/util/List;)V", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class a extends u {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final c3 f14382a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List<u> f14383b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(c3 c3Var, List<? extends u> list) {
            super(null);
            c3Var.getClass();
            list.getClass();
            this.f14382a = c3Var;
            this.f14383b = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return p005kotlin.jvm.internal.s.g(this.f14382a, aVar.f14382a) && p005kotlin.jvm.internal.s.g(this.f14383b, aVar.f14383b);
        }

        public final int hashCode() {
            return this.f14383b.hashCode() + (this.f14382a.hashCode() * 31);
        }

        public final String toString() {
            return "Compiled(resourceId=" + this.f14382a + ", formatArgs=" + this.f14383b + ")";
        }

        public a(c3 c3Var, List list, int i14, p005kotlin.jvm.internal.j jVar) {
            this(c3Var, (i14 & 2) != 0 ? j0.f134944a : list);
        }
    }
}
