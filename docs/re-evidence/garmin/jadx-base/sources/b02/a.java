package b02;

import e23.p;
import p005kotlin.Unit;
import p3.m;
import p3.p0;
import sk0.s1;
import u4.d;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class a implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14165a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f14166b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d f14167c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f14168d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e23.a f14169e;

    public /* synthetic */ a(String str, d dVar, boolean z14, e23.a aVar, int i14) {
        this.f14166b = str;
        this.f14167c = dVar;
        this.f14168d = z14;
        this.f14169e = aVar;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f14165a) {
            case 0:
                ((Integer) obj2).getClass();
                b.a(p0.t(1), this.f14169e, this.f14166b, (m) obj, this.f14167c, this.f14168d);
                break;
            default:
                ((Integer) obj2).getClass();
                s1.a(p0.t(1), this.f14169e, this.f14166b, (m) obj, this.f14167c, this.f14168d);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ a(d dVar, boolean z14, String str, e23.a aVar, int i14) {
        this.f14167c = dVar;
        this.f14168d = z14;
        this.f14166b = str;
        this.f14169e = aVar;
    }
}
