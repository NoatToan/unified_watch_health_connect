package ug2;

import androidx.lifecycle.v1;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class s implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f170997a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ lg2.a f170998b;

    public /* synthetic */ s(lg2.a aVar, int i14) {
        this.f170997a = i14;
        this.f170998b = aVar;
    }

    @Override // e23.a
    public final Object invoke() {
        switch (this.f170997a) {
            case 0:
                lg2.a aVar = this.f170998b;
                if (aVar.f112269p) {
                    aVar.f112269p = false;
                    ge1.b.T(v1.a(aVar), null, null, new lg2.h(aVar, null), 3);
                }
                break;
            case 1:
                this.f170998b.D4();
                break;
            case 2:
                this.f170998b.D4();
                break;
            case 3:
                this.f170998b.C4();
                break;
            default:
                this.f170998b.C4();
                break;
        }
        return Unit.INSTANCE;
    }
}
