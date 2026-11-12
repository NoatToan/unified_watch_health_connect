package p005kotlin.jvm.internal;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import jx0.e;
import k23.q;
import o13.m;
import o13.n;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lkotlin/jvm/internal/u;", "Lk23/q;", "", "Lkotlin/jvm/internal/TypeParameterContainer;", TtmlNode.RUBY_CONTAINER, "<init>", "(Ljava/lang/Object;)V", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class u implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f105813a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f105814b;

    public u(Object obj) {
        obj.getClass();
        this.f105813a = obj;
        this.f105814b = m.a(n.PUBLICATION, new e(this, 22));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return s.g(((z0) this).f105820c, ((z0) uVar).f105820c) && this.f105813a.equals(uVar.f105813a);
    }

    public final int hashCode() {
        return ((z0) this).f105820c.hashCode() + (this.f105813a.hashCode() * 31);
    }

    public final String toString() {
        z0.f105819f.getClass();
        return z0.a.a(this);
    }
}
