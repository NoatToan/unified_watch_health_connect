package sc;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.firebase.analytics.FirebaseAnalytics;
import e23.q;
import java.util.Map;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p13.k0;
import p3.m;
import p3.n;
import p3.o0;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001BC\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0001\u0012\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u0005\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fB+\b\u0016\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\u000e¨\u0006\u000f"}, d2 = {"Lsc/h;", "", "T", Action.KEY_ATTRIBUTE, "contentKey", "", "", TtmlNode.TAG_METADATA, "Lkotlin/Function1;", "", FirebaseAnalytics.Param.CONTENT, "<init>", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Map;Le23/q;)V", "navEntry", "(Lsc/h;Le23/q;)V", "navigation3-runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class h<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final T f158451a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f158452b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map<String, Object> f158453c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final q<T, m, Integer, Unit> f158454d;

    /* JADX WARN: Illegal instructions before constructor call */
    public h(Object obj, Object obj2, Map map, q qVar, int i14, p005kotlin.jvm.internal.j jVar) {
        obj2 = (i14 & 2) != 0 ? obj.toString() : obj2;
        if ((i14 & 4) != 0) {
            map = k0.f134949a;
            map.getClass();
        }
        this(obj, obj2, map, qVar);
    }

    public final void a(m mVar, int i14) {
        o0 o0VarE = mVar.E(295512821);
        int i15 = (o0VarE.B(this) ? 4 : 2) | i14;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = n.f135158a;
            this.f158454d.invoke(this.f158451a, o0VarE, 0);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new g(this, i14);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && h.class == obj.getClass()) {
            h hVar = (h) obj;
            if (s.g(this.f158451a, hVar.f158451a) && s.g(this.f158452b, hVar.f158452b) && s.g(this.f158453c, hVar.f158453c) && this.f158454d == hVar.f158454d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f158454d.hashCode() * 31) + (this.f158453c.hashCode() * 31) + (this.f158452b.hashCode() * 31) + (this.f158451a.hashCode() * 31);
    }

    public final String toString() {
        return "NavEntry(key=" + this.f158451a + ", contentKey=" + this.f158452b + ", metadata=" + this.f158453c + ", content=" + this.f158454d + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public h(h<T> hVar, q<? super T, ? super m, ? super Integer, Unit> qVar) {
        this(hVar.f158451a, hVar.f158452b, hVar.f158453c, qVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public h(T t7, Object obj, Map<String, ? extends Object> map, q<? super T, ? super m, ? super Integer, Unit> qVar) {
        this.f158451a = t7;
        this.f158452b = obj;
        this.f158453c = map;
        this.f158454d = qVar;
    }
}
