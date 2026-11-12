package wh;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lwh/b;", "Lwh/d;", "apollo-api"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class b implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f185216a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w63.h f185217b;

    public b(w63.h hVar) {
        this.f185217b = hVar;
        this.f185216a = hVar.d();
    }

    @Override // wh.d
    public final void a(w63.f fVar) {
        fVar.O3(this.f185217b);
    }

    @Override // wh.d
    /* JADX INFO: renamed from: getContentLength, reason: from getter */
    public final long getF185216a() {
        return this.f185216a;
    }

    @Override // wh.d
    public final String getContentType() {
        return "application/json";
    }
}
