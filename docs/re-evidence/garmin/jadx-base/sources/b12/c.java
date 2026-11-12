package b12;

import e23.l;
import e23.p;
import h4.r;
import li0.d0;
import li0.k0;
import m92.u;
import p005kotlin.Unit;
import p3.m;
import p3.p0;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class c implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14392a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f14393b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f14394c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f14395d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f14396e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f14397f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f14398g;

    public /* synthetic */ c(r rVar, i53.c cVar, float f14, String str, int i14, int i15) {
        this.f14392a = 3;
        this.f14397f = rVar;
        this.f14398g = cVar;
        this.f14393b = f14;
        this.f14394c = str;
        this.f14395d = i14;
        this.f14396e = i15;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f14392a) {
            case 0:
                ((Integer) obj2).getClass();
                k.b((r) this.f14397f, (String) this.f14394c, this.f14393b, (b) this.f14398g, (m) obj, p0.t(this.f14395d | 1), this.f14396e);
                break;
            case 1:
                ((Integer) obj2).getClass();
                ((bn1.h) this.f14397f).a(this.f14393b, (String) this.f14394c, (h4.d.b) this.f14398g, (m) obj, p0.t(this.f14395d | 1), this.f14396e);
                break;
            case 2:
                ((Integer) obj2).getClass();
                k0.g((d0) this.f14394c, (li0.f) this.f14398g, this.f14393b, (r) this.f14397f, (m) obj, p0.t(this.f14395d | 1), this.f14396e);
                break;
            case 3:
                ((Integer) obj2).getClass();
                u.b((r) this.f14397f, (i53.c) this.f14398g, this.f14393b, (String) this.f14394c, (m) obj, p0.t(this.f14395d | 1), p0.t(this.f14396e));
                break;
            case 4:
                ((Integer) obj2).getClass();
                n21.c.a((r) this.f14397f, this.f14393b, (l) this.f14394c, (j23.f) this.f14398g, (m) obj, p0.t(this.f14395d | 1), this.f14396e);
                break;
            default:
                ((Integer) obj2).getClass();
                n21.e.b((r) this.f14397f, this.f14393b, (l) this.f14394c, (j23.e) this.f14398g, (m) obj, p0.t(this.f14395d | 1), this.f14396e);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ c(r rVar, String str, float f14, b bVar, int i14, int i15) {
        this.f14392a = 0;
        this.f14397f = rVar;
        this.f14394c = str;
        this.f14393b = f14;
        this.f14398g = bVar;
        this.f14395d = i14;
        this.f14396e = i15;
    }

    public /* synthetic */ c(Object obj, float f14, Object obj2, Object obj3, int i14, int i15, int i16) {
        this.f14392a = i16;
        this.f14397f = obj;
        this.f14393b = f14;
        this.f14394c = obj2;
        this.f14398g = obj3;
        this.f14395d = i14;
        this.f14396e = i15;
    }

    public /* synthetic */ c(d0 d0Var, li0.f fVar, float f14, r rVar, int i14, int i15) {
        this.f14392a = 2;
        this.f14394c = d0Var;
        this.f14398g = fVar;
        this.f14393b = f14;
        this.f14397f = rVar;
        this.f14395d = i14;
        this.f14396e = i15;
    }
}
