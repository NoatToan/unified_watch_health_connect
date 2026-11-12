package x70;

import e23.p;
import p005kotlin.Unit;
import p3.m;
import p3.p0;
import w3.x;
import ya0.c0;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class f implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f189406a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f189407b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f189408c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e23.a f189409d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e23.a f189410e;

    public /* synthetic */ f(String str, boolean z14, e23.a aVar, e23.a aVar2, int i14) {
        this.f189407b = str;
        this.f189408c = z14;
        this.f189409d = aVar;
        this.f189410e = aVar2;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f189406a) {
            case 0:
                ((Integer) obj2).getClass();
                x.a(p0.t(1), this.f189409d, this.f189410e, this.f189407b, (m) obj, this.f189408c);
                break;
            default:
                ((Integer) obj2).getClass();
                c0.d(p0.t(1), this.f189409d, this.f189410e, this.f189407b, (m) obj, this.f189408c);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ f(boolean z14, String str, e23.a aVar, e23.a aVar2, int i14) {
        this.f189408c = z14;
        this.f189407b = str;
        this.f189409d = aVar;
        this.f189410e = aVar2;
    }
}
