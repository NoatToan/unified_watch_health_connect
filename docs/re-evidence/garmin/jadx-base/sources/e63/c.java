package e63;

import ch.qos.logback.core.CoreConstants;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;
import p13.j0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u0002B)\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Le63/c;", "T", "Le63/s;", "Le63/o;", "mainFormat", "", "formats", "<init>", "(Le63/o;Ljava/util/List;)V", "kotlinx-datetime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class c<T> implements s<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o<T> f63236a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<o<T>> f63237b;

    /* JADX WARN: Multi-variable type inference failed */
    public c(o<? super T> oVar, List<? extends o<? super T>> list) {
        oVar.getClass();
        list.getClass();
        this.f63236a = oVar;
        this.f63237b = list;
    }

    @Override // e63.o
    public final f63.e<T> a() {
        return this.f63236a.a();
    }

    @Override // e63.o
    public final g63.o<T> b() {
        j0 j0Var = j0.f134944a;
        q13.b bVarB = p13.w.b();
        bVarB.add(this.f63236a.b());
        Iterator<o<T>> it = this.f63237b.iterator();
        while (it.hasNext()) {
            bVarB.add(it.next().b());
        }
        return new g63.o<>(j0Var, p13.w.a(bVarB));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f63236a.equals(cVar.f63236a) && this.f63237b.equals(cVar.f63237b);
    }

    public final int hashCode() {
        return this.f63237b.hashCode() + (this.f63236a.hashCode() * 31);
    }

    public final String toString() {
        return o2.c.d(CoreConstants.RIGHT_PARENTHESIS_CHAR, this.f63237b, new StringBuilder("AlternativesParsing("));
    }
}
