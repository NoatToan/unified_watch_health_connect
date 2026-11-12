package wg0;

import android.content.Context;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class i implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f185095a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ vg0.a f185096b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f185097c;

    public /* synthetic */ i(vg0.a aVar, Context context, int i14) {
        this.f185095a = i14;
        this.f185096b = aVar;
        this.f185097c = context;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        ds1.a aVar = (ds1.a) obj;
        switch (this.f185095a) {
            case 0:
                aVar.getClass();
                String str = aVar.f61092b;
                if (str != null) {
                    this.f185096b.b(this.f185097c, str, aVar.f61093c);
                }
                break;
            default:
                aVar.getClass();
                String str2 = aVar.f61092b;
                if (str2 != null) {
                    this.f185096b.b(this.f185097c, str2, aVar.f61093c);
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
