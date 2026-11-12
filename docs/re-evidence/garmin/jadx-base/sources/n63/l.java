package n63;

import java.lang.annotation.Annotation;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ln63/l;", "Lk63/e;", "kotlinx-serialization-json"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class l implements k63.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o13.t f123938a;

    public l(e23.a<? extends k63.e> aVar) {
        this.f123938a = o13.m.b(aVar);
    }

    public final k63.e a() {
        return (k63.e) this.f123938a.getValue();
    }

    @Override // k63.e
    /* JADX INFO: renamed from: c */
    public final int getF116985c() {
        return a().getF116985c();
    }

    @Override // k63.e
    public final String d(int i14) {
        return a().d(i14);
    }

    @Override // k63.e
    public final List<Annotation> e(int i14) {
        return a().e(i14);
    }

    @Override // k63.e
    /* JADX INFO: renamed from: f */
    public final String getF117019b() {
        return a().getF117019b();
    }

    @Override // k63.e
    public final int g(String str) {
        str.getClass();
        return a().g(str);
    }

    @Override // k63.e
    /* JADX INFO: renamed from: getKind */
    public final k63.l getF103234b() {
        return a().getF103234b();
    }

    @Override // k63.e
    public final k63.e h(int i14) {
        return a().h(i14);
    }

    @Override // k63.e
    public final boolean i(int i14) {
        return a().i(i14);
    }
}
