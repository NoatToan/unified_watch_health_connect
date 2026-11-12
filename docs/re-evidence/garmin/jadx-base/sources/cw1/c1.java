package cw1;

import java.util.List;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class c1 implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f55998a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h4.r f55999b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f56000c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f56001d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f56002e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ e23.l f56003f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f56004g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f56005h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f56006i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f56007j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f56008k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f56009l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f56010m;

    public /* synthetic */ c1(h4.r rVar, tw1.k kVar, tw1.k kVar2, boolean z14, String str, boolean z15, vt1.o oVar, int i14, int i15, Integer num, e23.l lVar, int i16) {
        this.f55999b = rVar;
        this.f56006i = kVar;
        this.f56007j = kVar2;
        this.f56001d = z14;
        this.f56008k = str;
        this.f56002e = z15;
        this.f56009l = oVar;
        this.f56000c = i14;
        this.f56004g = i15;
        this.f56010m = num;
        this.f56003f = lVar;
        this.f56005h = i16;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f55998a) {
            case 0:
                ((Integer) obj2).getClass();
                d1.a(this.f55999b, (tw1.k) this.f56006i, (tw1.k) this.f56007j, this.f56001d, (String) this.f56008k, this.f56002e, (vt1.o) this.f56009l, this.f56000c, this.f56004g, (Integer) this.f56010m, this.f56003f, (p3.m) obj, p3.p0.t(this.f56005h | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                ((je2.b) this.f56006i).b(this.f55999b, (i53.c) this.f56007j, (i53.c) this.f56008k, (List) this.f56009l, this.f56000c, this.f56001d, (e23.a) this.f56010m, this.f56002e, this.f56003f, (p3.m) obj, p3.p0.t(this.f56004g | 1), this.f56005h);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ c1(je2.b bVar, h4.r rVar, i53.c cVar, i53.c cVar2, List list, int i14, boolean z14, e23.a aVar, boolean z15, e23.l lVar, int i15, int i16) {
        this.f56006i = bVar;
        this.f55999b = rVar;
        this.f56007j = cVar;
        this.f56008k = cVar2;
        this.f56009l = list;
        this.f56000c = i14;
        this.f56001d = z14;
        this.f56010m = aVar;
        this.f56002e = z15;
        this.f56003f = lVar;
        this.f56004g = i15;
        this.f56005h = i16;
    }
}
