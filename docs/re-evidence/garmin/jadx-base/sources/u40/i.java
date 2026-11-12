package u40;

import android.view.View;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class i implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f168571a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f168572b;

    public /* synthetic */ i(j jVar, int i14) {
        this.f168571a = i14;
        this.f168572b = jVar;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        int i14 = this.f168571a;
        j jVar = this.f168572b;
        switch (i14) {
            case 0:
                j.a aVar = j.f168573h;
                ((View) obj).getClass();
                jVar.dismiss();
                break;
            default:
                com.garmin.android.apps.connectmobile.courses.model.f fVar = (com.garmin.android.apps.connectmobile.courses.model.f) obj;
                j.a aVar2 = j.f168573h;
                fVar.getClass();
                e23.l<? super com.garmin.android.apps.connectmobile.courses.model.f, Unit> lVar = jVar.f168575g;
                if (lVar != null) {
                    lVar.invoke(fVar);
                }
                jVar.dismiss();
                break;
        }
        return Unit.INSTANCE;
    }
}
