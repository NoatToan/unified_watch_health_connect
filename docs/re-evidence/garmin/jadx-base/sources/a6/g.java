package a6;

import b21.d7;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.google.accompanist.systemuicontroller.SystemUiController;
import o4.p1;
import o4.w;
import org.koin.core.parameter.ParametersHolderKt;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1497a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f1498b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1499c;

    public /* synthetic */ g(long j8, Object obj, int i14) {
        this.f1497a = i14;
        this.f1498b = j8;
        this.f1499c = obj;
    }

    @Override // e23.a
    public final Object invoke() {
        int i14 = this.f1497a;
        long j8 = this.f1498b;
        Object obj = this.f1499c;
        switch (i14) {
            case 0:
                int i15 = h.f1500j;
                return ((p1) ((w) obj)).b(j8);
            case 1:
                return ParametersHolderKt.parametersOf(Long.valueOf(j8), (l90.b) obj);
            case 2:
                Object bVar = null;
                String strA4 = ((gi1.b) obj).f77485a.A4("device_location_" + j8, null);
                try {
                    int i16 = o13.q.f128596b;
                    if (strA4 != null) {
                        n63.b.a aVar = n63.b.f123892d;
                        aVar.getClass();
                        bVar = (fi1.b) aVar.c(fi1.b.INSTANCE.serializer(), strA4);
                    }
                    break;
                } catch (Exception e4) {
                    i2.a aVar2 = i2.f36769a;
                    a2 a2Var = a2.GENERAL;
                    aVar2.getClass();
                    i2.a.g(a2Var, "DeviceLocationPreferencesImpl", e4);
                    int i17 = o13.q.f128596b;
                    bVar = new o13.q.b(e4);
                }
                return o13.q.a(bVar);
            case 3:
                ((d7) obj).invoke(Long.valueOf(j8));
                return Unit.INSTANCE;
            case 4:
                ((d7) obj).invoke(Long.valueOf(j8));
                return Unit.INSTANCE;
            case 5:
                return ParametersHolderKt.parametersOf(Long.valueOf(j8), (zf2.d) obj);
            case 6:
                return ParametersHolderKt.parametersOf((h90.a) obj, Long.valueOf(j8));
            case 7:
                int i18 = qr.t.A2;
                ((qr.t) obj).b6(j8);
                return Unit.INSTANCE;
            case 8:
                return ParametersHolderKt.parametersOf(Long.valueOf(j8), Boolean.valueOf(((ri1.l) obj).f152845a));
            case 9:
                ((ya0.a) obj).x4(j8);
                return Unit.INSTANCE;
            default:
                SystemUiController.m95setSystemBarsColorIv8Zu3U$default((SystemUiController) obj, this.f1498b, false, false, null, 14, null);
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ g(Object obj, long j8, int i14) {
        this.f1497a = i14;
        this.f1499c = obj;
        this.f1498b = j8;
    }
}
