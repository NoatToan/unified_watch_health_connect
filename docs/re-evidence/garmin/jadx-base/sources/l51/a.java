package l51;

import android.content.Intent;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class a implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f110147a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p51.b f110148b;

    public /* synthetic */ a(p51.b bVar, int i14) {
        this.f110147a = i14;
        this.f110148b = bVar;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        switch (this.f110147a) {
            case 0:
                if (((Boolean) obj).booleanValue()) {
                    this.f110148b.y4(w41.a.l.f181958a);
                }
                break;
            case 1:
                f.a aVar = (f.a) obj;
                aVar.getClass();
                i2.a aVar2 = i2.f36769a;
                aVar2.getClass();
                i2.a.a(a2.PACE_PRO, "Edit course result: " + aVar);
                Intent intent = aVar.f67586b;
                boolean zG = s.g(intent != null ? intent.getAction() : null, "android.intent.action.EDIT");
                p51.b bVar = this.f110148b;
                if (zG) {
                    bVar.y4(w41.a.i.f181955a);
                } else {
                    if (s.g(intent != null ? intent.getAction() : null, "android.intent.action.DELETE")) {
                        bVar.y4(new w41.a.m(new w41.b.a(true)));
                    }
                }
                break;
            case 2:
                this.f110148b.y4(new w41.a.t(((Integer) obj).intValue()));
                break;
            case 3:
                com.garmin.android.library.mapsdkadapter.i.d dVar = (com.garmin.android.library.mapsdkadapter.i.d) obj;
                dVar.getClass();
                this.f110148b.y4(new w41.a.s(dVar));
                break;
            default:
                this.f110148b.y4(new w41.a.n(((Boolean) obj).booleanValue()));
                break;
        }
        return Unit.INSTANCE;
    }
}
