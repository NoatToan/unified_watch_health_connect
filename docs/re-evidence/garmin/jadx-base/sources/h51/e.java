package h51;

import e23.l;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class e implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f82100a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f82101b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o51.c f82102c;

    public /* synthetic */ e(l lVar, o51.c cVar, int i14) {
        this.f82100a = i14;
        this.f82101b = lVar;
        this.f82102c = cVar;
    }

    @Override // e23.a
    public final Object invoke() {
        switch (this.f82100a) {
            case 0:
                this.f82101b.invoke(Long.valueOf(this.f82102c.f129221c));
                break;
            case 1:
                this.f82101b.invoke(Long.valueOf(this.f82102c.f129221c));
                break;
            default:
                this.f82101b.invoke(Long.valueOf(this.f82102c.f129221c));
                break;
        }
        return Unit.INSTANCE;
    }
}
