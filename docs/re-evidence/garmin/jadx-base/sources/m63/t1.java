package m63;

import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Set;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lm63/t1;", "Lk63/e;", "Lm63/k;", "original", "<init>", "(Lk63/e;)V", "kotlinx-serialization-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class t1 implements k63.e, k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k63.e f117018a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f117019b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set<String> f117020c;

    public t1(k63.e eVar) {
        eVar.getClass();
        this.f117018a = eVar;
        this.f117019b = eVar.getF117019b() + '?';
        this.f117020c = k1.b(eVar);
    }

    @Override // m63.k
    public final Set<String> a() {
        return this.f117020c;
    }

    @Override // k63.e
    public final boolean b() {
        return true;
    }

    @Override // k63.e
    /* JADX INFO: renamed from: c */
    public final int getF116985c() {
        return this.f117018a.getF116985c();
    }

    @Override // k63.e
    public final String d(int i14) {
        return this.f117018a.d(i14);
    }

    @Override // k63.e
    public final List<Annotation> e(int i14) {
        return this.f117018a.e(i14);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof t1) {
            return this.f117018a.equals(((t1) obj).f117018a);
        }
        return false;
    }

    @Override // k63.e
    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getF117019b() {
        return this.f117019b;
    }

    @Override // k63.e
    public final int g(String str) {
        str.getClass();
        return this.f117018a.g(str);
    }

    @Override // k63.e
    public final List<Annotation> getAnnotations() {
        return this.f117018a.getAnnotations();
    }

    @Override // k63.e
    /* JADX INFO: renamed from: getKind */
    public final k63.l getF103234b() {
        return this.f117018a.getF103234b();
    }

    @Override // k63.e
    public final k63.e h(int i14) {
        return this.f117018a.h(i14);
    }

    public final int hashCode() {
        return this.f117018a.hashCode() * 31;
    }

    @Override // k63.e
    public final boolean i(int i14) {
        return this.f117018a.i(i14);
    }

    @Override // k63.e
    public final boolean isInline() {
        return this.f117018a.isInline();
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder();
        sb3.append(this.f117018a);
        sb3.append('?');
        return sb3.toString();
    }
}
