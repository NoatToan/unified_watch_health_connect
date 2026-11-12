package k63;

import java.lang.annotation.Annotation;
import java.util.List;
import m63.k1;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lk63/n;", "Lk63/e;", "", "serialName", "original", "<init>", "(Ljava/lang/String;Lk63/e;)V", "kotlinx-serialization-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class n implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f103257a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f103258b;

    public n(String str, e eVar) {
        str.getClass();
        eVar.getClass();
        this.f103257a = str;
        this.f103258b = eVar;
    }

    @Override // k63.e
    public final boolean b() {
        return this.f103258b.b();
    }

    @Override // k63.e
    /* JADX INFO: renamed from: c */
    public final int getF116985c() {
        return this.f103258b.getF116985c();
    }

    @Override // k63.e
    public final String d(int i14) {
        return this.f103258b.d(i14);
    }

    @Override // k63.e
    public final List<Annotation> e(int i14) {
        return this.f103258b.e(i14);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return this.f103257a.equals(nVar.f103257a) && this.f103258b.equals(nVar.f103258b);
    }

    @Override // k63.e
    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getF103257a() {
        return this.f103257a;
    }

    @Override // k63.e
    public final int g(String str) {
        str.getClass();
        return this.f103258b.g(str);
    }

    @Override // k63.e
    public final List<Annotation> getAnnotations() {
        return this.f103258b.getAnnotations();
    }

    @Override // k63.e
    /* JADX INFO: renamed from: getKind */
    public final l getF103234b() {
        return this.f103258b.getF103234b();
    }

    @Override // k63.e
    public final e h(int i14) {
        return this.f103258b.h(i14);
    }

    public final int hashCode() {
        return this.f103258b.hashCode() + (this.f103257a.hashCode() * 31);
    }

    @Override // k63.e
    public final boolean i(int i14) {
        return this.f103258b.i(i14);
    }

    @Override // k63.e
    /* JADX INFO: renamed from: isInline */
    public final boolean getF116965m() {
        return this.f103258b.getF116965m();
    }

    public final String toString() {
        return k1.j(this);
    }
}
