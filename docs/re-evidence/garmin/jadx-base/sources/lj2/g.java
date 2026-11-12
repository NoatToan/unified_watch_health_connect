package lj2;

import e23.l;
import f4.u;
import o13.p;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class g implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f113124a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u f113125b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ nj2.a.b f113126c;

    public /* synthetic */ g(u uVar, nj2.a.b bVar, int i14) {
        this.f113124a = i14;
        this.f113125b = uVar;
        this.f113126c = bVar;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        switch (this.f113124a) {
            case 0:
                this.f113125b.put(this.f113126c, (p) obj);
                break;
            default:
                this.f113125b.put(this.f113126c, (p) obj);
                break;
        }
        return Unit.INSTANCE;
    }
}
