package k63;

import ch.qos.logback.core.CoreConstants;
import java.lang.annotation.Annotation;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lk63/b;", "Lk63/e;", "original", "Lk23/d;", "kClass", "<init>", "(Lk63/e;Lk23/d;)V", "kotlinx-serialization-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f103219a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k23.d<?> f103220b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f103221c;

    public b(e eVar, k23.d<?> dVar) {
        eVar.getClass();
        dVar.getClass();
        this.f103219a = eVar;
        this.f103220b = dVar;
        this.f103221c = eVar.getF103221c() + '<' + dVar.D() + '>';
    }

    @Override // k63.e
    public final boolean b() {
        return this.f103219a.b();
    }

    @Override // k63.e
    public final int c() {
        return this.f103219a.c();
    }

    @Override // k63.e
    public final String d(int i14) {
        return this.f103219a.d(i14);
    }

    @Override // k63.e
    public final List<Annotation> e(int i14) {
        return this.f103219a.e(i14);
    }

    public final boolean equals(Object obj) {
        b bVar = obj instanceof b ? (b) obj : null;
        return bVar != null && this.f103219a.equals(bVar.f103219a) && bVar.f103220b.equals(this.f103220b);
    }

    @Override // k63.e
    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getF103221c() {
        return this.f103221c;
    }

    @Override // k63.e
    public final int g(String str) {
        str.getClass();
        return this.f103219a.g(str);
    }

    @Override // k63.e
    public final List<Annotation> getAnnotations() {
        return this.f103219a.getAnnotations();
    }

    @Override // k63.e
    public final l getKind() {
        return this.f103219a.getKind();
    }

    @Override // k63.e
    public final e h(int i14) {
        return this.f103219a.h(i14);
    }

    public final int hashCode() {
        return this.f103221c.hashCode() + (this.f103220b.hashCode() * 31);
    }

    @Override // k63.e
    public final boolean i(int i14) {
        return this.f103219a.i(i14);
    }

    @Override // k63.e
    public final boolean isInline() {
        return this.f103219a.isInline();
    }

    public final String toString() {
        return "ContextDescriptor(kClass: " + this.f103220b + ", original: " + this.f103219a + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
