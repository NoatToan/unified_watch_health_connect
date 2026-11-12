package zo;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class s implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f206070a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t f206071b;

    public /* synthetic */ s(t tVar, int i14) {
        this.f206070a = i14;
        this.f206071b = tVar;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        int i14 = this.f206070a;
        t tVar = this.f206071b;
        int iIntValue = ((Integer) obj).intValue();
        switch (i14) {
            case 0:
                t.a aVar = t.f206072l;
                i2.a aVar2 = i2.f36769a;
                aVar2.getClass();
                i2.a.a(a2.ACTIVITIES, "Selected duration: " + iIntValue);
                tVar.E6().C4(iIntValue, tVar.f206024g);
                return Unit.INSTANCE;
            default:
                oi0.h hVar = tVar.f206073k;
                if (hVar != null) {
                    return hVar.d(iIntValue, true);
                }
                p005kotlin.jvm.internal.s.m("gcmContentDescriptionTimeFormatter");
                throw null;
        }
    }
}
