package qe2;

import e23.l;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class e implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f144577a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.library.mapsdkadapter.e f144578b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f144579c;

    public /* synthetic */ e(com.garmin.android.library.mapsdkadapter.e eVar, int i14, int i15) {
        this.f144577a = i15;
        this.f144578b = eVar;
        this.f144579c = i14;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        com.garmin.android.library.mapsdkadapter.i iVar = (com.garmin.android.library.mapsdkadapter.i) obj;
        switch (this.f144577a) {
            case 0:
                iVar.getClass();
                iVar.v(this.f144578b, this.f144579c);
                break;
            default:
                iVar.getClass();
                iVar.c(this.f144578b, this.f144579c);
                break;
        }
        return Unit.INSTANCE;
    }
}
