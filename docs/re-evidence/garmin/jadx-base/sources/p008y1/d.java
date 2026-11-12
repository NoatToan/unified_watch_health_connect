package p008y1;

import e23.a;
import e23.l;
import p005kotlin.Metadata;
import z1.t;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ly1/d;", "Lz1/t;", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class d implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r<Object> f193149a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l<Float, Float> f193150b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a<Float> f193151c;

    /* JADX WARN: Multi-variable type inference failed */
    public d(r<Object> rVar, l<? super Float, Float> lVar, a<Float> aVar) {
        this.f193149a = rVar;
        this.f193150b = lVar;
        this.f193151c = aVar;
    }

    @Override // z1.t
    public final float a(float f14) {
        r<Object> rVar = this.f193149a;
        float fE = rVar.e();
        Object objB = e.b(rVar.b(), fE, f14, this.f193150b, this.f193151c);
        if (!rVar.f193579a.invoke(objB).booleanValue()) {
            objB = rVar.f193586h.getF182175a();
        }
        return rVar.b().c(objB) - fE;
    }

    @Override // z1.t
    public final float b(float f14, float f15) {
        return 0.0f;
    }
}
