package b53;

import ch.qos.logback.core.CoreConstants;
import d53.w;
import java.util.Collection;
import java.util.List;
import n23.v3;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u00032\u00020\u00042\u00020\u0005B]\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u001e\u0010\f\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\t\u0012\u001e\u0010\u000e\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\n0\t¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lb53/p;", "", "T", "Lk23/d;", "Lt43/m;", "Ln23/v3;", "klass", "", "qualifiedName", "Lkotlin/Function1;", "", "Lk23/q;", "createTypeParameters", "Lk23/p;", "createSupertypes", "<init>", "(Lk23/d;Ljava/lang/String;Le23/l;Le23/l;)V", "kotlin-reflection"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class p<T> implements k23.d<T>, v3, t43.m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k23.d<T> f16140a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f16141b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<k23.q> f16142c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<k23.p> f16143d;

    public p(k23.d<T> dVar, String str, e23.l<? super p<T>, ? extends List<? extends k23.q>> lVar, e23.l<? super p<T>, ? extends List<? extends k23.p>> lVar2) {
        dVar.getClass();
        str.getClass();
        lVar.getClass();
        lVar2.getClass();
        this.f16140a = dVar;
        this.f16141b = str;
        this.f16142c = (List) lVar.invoke(this);
        this.f16143d = (List) lVar2.invoke(this);
    }

    @Override // k23.d
    public final String D() {
        return w.e0(this.f16141b, ".");
    }

    @Override // k23.d
    public final List<k23.p> b() {
        return this.f16143d;
    }

    @Override // k23.d
    public final boolean equals(Object obj) {
        if (obj instanceof p) {
            return this.f16140a.equals(((p) obj).f16140a);
        }
        return false;
    }

    @Override // k23.d
    public final List<k23.q> getTypeParameters() {
        return this.f16142c;
    }

    @Override // k23.d
    public final int hashCode() {
        return this.f16140a.hashCode();
    }

    @Override // k23.d
    public final boolean k() {
        return this.f16140a.k();
    }

    @Override // k23.d
    public final boolean l() {
        return this.f16140a.l();
    }

    @Override // k23.d
    public final Collection<k23.g<T>> n() {
        return this.f16140a.n();
    }

    @Override // k23.d
    public final Collection<k23.d<?>> o() {
        return this.f16140a.o();
    }

    @Override // k23.d
    public final boolean q(Object obj) {
        return this.f16140a.q(obj);
    }

    @Override // k23.d
    public final Collection<k23.c<?>> s() {
        return this.f16140a.s();
    }

    public final String toString() {
        return "MutableCollectionKClass(" + this.f16140a + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Override // k23.d
    /* JADX INFO: renamed from: w, reason: from getter */
    public final String getF16141b() {
        return this.f16141b;
    }

    @Override // k23.d
    public final boolean z() {
        return this.f16140a.z();
    }
}
