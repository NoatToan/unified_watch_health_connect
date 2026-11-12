package vd0;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final class s1 implements e23.a<Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f177377a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f177378b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ pe0.d f177379c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3.p1<pe0.d> f177380d;

    public s1(boolean z14, boolean z15, pe0.d dVar, p3.p1<pe0.d> p1Var) {
        this.f177377a = z14;
        this.f177378b = z15;
        this.f177379c = dVar;
        this.f177380d = p1Var;
    }

    @Override // e23.a
    public final Unit invoke() {
        if (!this.f177377a) {
            this.f177380d.setValue(this.f177378b ? null : this.f177379c);
        }
        return Unit.INSTANCE;
    }
}
