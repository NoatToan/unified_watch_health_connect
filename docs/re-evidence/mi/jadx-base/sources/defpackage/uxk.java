package defpackage;

import com.airbnb.lottie.model.layer.a;

/* JADX INFO: loaded from: classes.dex */
public class uxk implements fi4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f36254a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final sb1<Float, Float> f36255b;

    public uxk(String str, sb1<Float, Float> sb1Var) {
        this.f36254a = str;
        this.f36255b = sb1Var;
    }

    @Override // defpackage.fi4
    public hh4 a(jte jteVar, lse lseVar, a aVar) {
        return new vxk(jteVar, aVar, this);
    }

    public sb1<Float, Float> b() {
        return this.f36255b;
    }

    public String c() {
        return this.f36254a;
    }
}
