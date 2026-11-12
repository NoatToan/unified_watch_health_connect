package com.google.maps.android.compose.streetview;

import e23.l;
import e23.p;
import h4.r;
import li0.d0;
import li0.f;
import li0.k0;
import o13.h;
import p005kotlin.Unit;
import p3.m;
import p3.p0;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f54225a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f54226b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f54227c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f54228d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f54229e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f54230f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ e23.a f54231g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f54232h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f54233i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f54234j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f54235k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ h f54236l;

    public /* synthetic */ a(r rVar, StreetViewCameraPositionState streetViewCameraPositionState, e23.a aVar, boolean z14, boolean z15, boolean z16, boolean z17, l lVar, l lVar2, int i14, int i15) {
        this.f54226b = rVar;
        this.f54234j = streetViewCameraPositionState;
        this.f54231g = aVar;
        this.f54227c = z14;
        this.f54228d = z15;
        this.f54229e = z16;
        this.f54230f = z17;
        this.f54235k = lVar;
        this.f54236l = lVar2;
        this.f54232h = i14;
        this.f54233i = i15;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f54225a) {
            case 0:
                return StreetViewKt.StreetView$lambda$19(this.f54226b, (StreetViewCameraPositionState) this.f54234j, this.f54231g, this.f54227c, this.f54228d, this.f54229e, this.f54230f, (l) this.f54235k, (l) this.f54236l, this.f54232h, this.f54233i, (m) obj, ((Integer) obj2).intValue());
            default:
                ((Integer) obj2).getClass();
                k0.a((d0) this.f54234j, (f) this.f54235k, this.f54226b, this.f54227c, this.f54228d, this.f54229e, this.f54230f, this.f54231g, (p) this.f54236l, (m) obj, p0.t(this.f54232h | 1), this.f54233i);
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ a(d0 d0Var, f fVar, r rVar, boolean z14, boolean z15, boolean z16, boolean z17, e23.a aVar, p pVar, int i14, int i15) {
        this.f54234j = d0Var;
        this.f54235k = fVar;
        this.f54226b = rVar;
        this.f54227c = z14;
        this.f54228d = z15;
        this.f54229e = z16;
        this.f54230f = z17;
        this.f54231g = aVar;
        this.f54236l = pVar;
        this.f54232h = i14;
        this.f54233i = i15;
    }
}
