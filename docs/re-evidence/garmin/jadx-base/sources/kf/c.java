package kf;

import com.google.firebase.analytics.FirebaseAnalytics;
import e23.l;
import f5.k;
import h4.r;
import h5.t;
import h5.x0;
import kotlin.m2;
import kotlin.v3;
import o4.e0;
import o4.o0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import r1.q2;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u008f\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\t\u0012\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\f\u0018\u00010\t\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lkf/c;", "Lh5/x0;", "Lkf/d;", "Lwf/f;", "request", "Lhf/j;", "imageLoader", "Ljf/c;", "modelEqualityDelegate", "Lkotlin/Function1;", "Ljf/d$c;", "transform", "", "onState", "Lo4/o0;", "filterQuality", "Lh4/d;", "alignment", "Lf5/k;", "contentScale", "", "alpha", "Lo4/e0;", "colorFilter", "", "clipToBounds", "Ljf/i;", "previewHandler", "", "contentDescription", "<init>", "(Lwf/f;Lhf/j;Ljf/c;Le23/l;Le23/l;ILh4/d;Lf5/k;FLo4/e0;ZLjf/i;Ljava/lang/String;Lkotlin/jvm/internal/j;)V", "coil-compose-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class c extends x0<d> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wf.f f104564a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hf.j f104565b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final jf.c f104566c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final l<jf.d.c, jf.d.c> f104567d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final l<jf.d.c, Unit> f104568e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f104569f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final h4.d f104570g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final k f104571h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final float f104572i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e0 f104573j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f104574k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final jf.i f104575l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f104576m;

    /* JADX WARN: Multi-variable type inference failed */
    private c(wf.f fVar, hf.j jVar, jf.c cVar, l<? super jf.d.c, ? extends jf.d.c> lVar, l<? super jf.d.c, Unit> lVar2, int i14, h4.d dVar, k kVar, float f14, e0 e0Var, boolean z14, jf.i iVar, String str) {
        this.f104564a = fVar;
        this.f104565b = jVar;
        this.f104566c = cVar;
        this.f104567d = lVar;
        this.f104568e = lVar2;
        this.f104569f = i14;
        this.f104570g = dVar;
        this.f104571h = kVar;
        this.f104572i = f14;
        this.f104573j = e0Var;
        this.f104574k = z14;
        this.f104575l = iVar;
        this.f104576m = str;
    }

    @Override // h5.x0
    public final r.c create() {
        jf.c cVar = this.f104566c;
        hf.j jVar = this.f104565b;
        wf.f fVar = this.f104564a;
        jf.d.b bVar = new jf.d.b(jVar, fVar, cVar);
        jf.d dVar = new jf.d(bVar);
        dVar.f98624i = this.f104567d;
        dVar.f98625j = this.f104568e;
        dVar.f98626k = this.f104571h;
        dVar.f98627l = this.f104569f;
        dVar.f98628m = this.f104575l;
        dVar.d(bVar);
        xf.h hVar = fVar.f184922u;
        return new d(dVar, this.f104570g, this.f104571h, this.f104572i, this.f104573j, this.f104574k, this.f104576m, hVar instanceof jf.j ? (jf.j) hVar : null);
    }

    @Override // h5.x0
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (!s.g(this.f104564a, cVar.f104564a) || !s.g(this.f104565b, cVar.f104565b) || !s.g(this.f104566c, cVar.f104566c) || !s.g(this.f104567d, cVar.f104567d) || !s.g(this.f104568e, cVar.f104568e)) {
            return false;
        }
        int i14 = cVar.f104569f;
        o0.a aVar = o0.f128897b;
        return this.f104569f == i14 && s.g(this.f104570g, cVar.f104570g) && s.g(this.f104571h, cVar.f104571h) && Float.compare(this.f104572i, cVar.f104572i) == 0 && s.g(this.f104573j, cVar.f104573j) && this.f104574k == cVar.f104574k && s.g(this.f104575l, cVar.f104575l) && s.g(this.f104576m, cVar.f104576m);
    }

    @Override // h5.x0
    public final int hashCode() {
        int iH = q6.f.h((this.f104566c.hashCode() + ((this.f104565b.hashCode() + (this.f104564a.hashCode() * 31)) * 31)) * 31, this.f104567d, 31);
        l<jf.d.c, Unit> lVar = this.f104568e;
        int iHashCode = (iH + (lVar == null ? 0 : lVar.hashCode())) * 31;
        o0.a aVar = o0.f128897b;
        int iD = q6.f.d(this.f104572i, (this.f104571h.hashCode() + ((this.f104570g.hashCode() + q2.d(this.f104569f, iHashCode, 31)) * 31)) * 31, 31);
        e0 e0Var = this.f104573j;
        int iG = q6.f.g((iD + (e0Var == null ? 0 : e0Var.hashCode())) * 31, 31, this.f104574k);
        jf.i iVar = this.f104575l;
        int iHashCode2 = (iG + (iVar == null ? 0 : iVar.hashCode())) * 31;
        String str = this.f104576m;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    @Override // h5.x0
    public final void inspectableProperties(m2 m2Var) {
        m2Var.f91341a = FirebaseAnalytics.Param.CONTENT;
        v3 v3Var = m2Var.f91343c;
        v3Var.c(this.f104564a, "request");
        v3Var.c(this.f104565b, "imageLoader");
        v3Var.c(this.f104566c, "modelEqualityDelegate");
        v3Var.c(this.f104567d, "transform");
        v3Var.c(this.f104568e, "onState");
        v3Var.c(o0.a(this.f104569f), "filterQuality");
        v3Var.c(this.f104570g, "alignment");
        v3Var.c(this.f104571h, "contentScale");
        v3Var.c(Float.valueOf(this.f104572i), "alpha");
        v3Var.c(this.f104573j, "colorFilter");
        v3Var.c(Boolean.valueOf(this.f104574k), "clipToBounds");
        v3Var.c(this.f104575l, "previewHandler");
        v3Var.c(this.f104576m, "contentDescription");
    }

    public final String toString() {
        String strB = o0.b(this.f104569f);
        StringBuilder sb3 = new StringBuilder("ContentPainterElement(request=");
        sb3.append(this.f104564a);
        sb3.append(", imageLoader=");
        sb3.append(this.f104565b);
        sb3.append(", modelEqualityDelegate=");
        sb3.append(this.f104566c);
        sb3.append(", transform=");
        sb3.append(this.f104567d);
        sb3.append(", onState=");
        sb3.append(this.f104568e);
        sb3.append(", filterQuality=");
        sb3.append(strB);
        sb3.append(", alignment=");
        sb3.append(this.f104570g);
        sb3.append(", contentScale=");
        sb3.append(this.f104571h);
        sb3.append(", alpha=");
        sb3.append(this.f104572i);
        sb3.append(", colorFilter=");
        sb3.append(this.f104573j);
        sb3.append(", clipToBounds=");
        sb3.append(this.f104574k);
        sb3.append(", previewHandler=");
        sb3.append(this.f104575l);
        sb3.append(", contentDescription=");
        return am.j.o(this.f104576m, ")", sb3);
    }

    @Override // h5.x0
    public final void update(r.c cVar) {
        d dVar = (d) cVar;
        long f162260d = dVar.f104577h.getF162260d();
        jf.j jVar = dVar.f104560g;
        jf.c cVar2 = this.f104566c;
        hf.j jVar2 = this.f104565b;
        wf.f fVar = this.f104564a;
        jf.d.b bVar = new jf.d.b(jVar2, fVar, cVar2);
        jf.d dVar2 = dVar.f104577h;
        dVar2.f98624i = this.f104567d;
        dVar2.f98625j = this.f104568e;
        k kVar = this.f104571h;
        dVar2.f98626k = kVar;
        dVar2.f98627l = this.f104569f;
        dVar2.f98628m = this.f104575l;
        dVar2.d(bVar);
        boolean zC = n4.g.c(f162260d, dVar2.getF162260d());
        dVar.f104554a = this.f104570g;
        xf.h hVar = fVar.f184922u;
        dVar.f104560g = hVar instanceof jf.j ? (jf.j) hVar : null;
        dVar.f104555b = kVar;
        dVar.f104556c = this.f104572i;
        dVar.f104557d = this.f104573j;
        dVar.f104558e = this.f104574k;
        String str = dVar.f104559f;
        String str2 = this.f104576m;
        if (!s.g(str, str2)) {
            dVar.f104559f = str2;
            h5.k.g(dVar).U();
        }
        boolean zG = s.g(jVar, dVar.f104560g);
        if (!zC || !zG) {
            h5.k.g(dVar).T();
        }
        t.a(dVar);
    }

    public /* synthetic */ c(wf.f fVar, hf.j jVar, jf.c cVar, l lVar, l lVar2, int i14, h4.d dVar, k kVar, float f14, e0 e0Var, boolean z14, jf.i iVar, String str, p005kotlin.jvm.internal.j jVar2) {
        this(fVar, jVar, cVar, lVar, lVar2, i14, dVar, kVar, f14, e0Var, z14, iVar, str);
    }
}
