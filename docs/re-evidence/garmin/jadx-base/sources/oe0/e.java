package oe0;

import androidx.lifecycle.y0;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import java.lang.annotation.Annotation;
import m63.f1;
import m63.y1;
import of2.c0;
import okhttp3.OkHttpClient;
import org.koin.compose.KoinApplicationKt;
import org.koin.java.KoinJavaComponent;
import p005kotlin.KotlinNothingValueException;
import p005kotlin.Unit;
import p3.p0;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class e implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f131274a;

    public /* synthetic */ e(int i14) {
        this.f131274a = i14;
    }

    @Override // e23.a
    public final Object invoke() {
        switch (this.f131274a) {
            case 0:
                return new le0.b();
            case 1:
                return p0.n(Boolean.FALSE);
            case 2:
                int i14 = c0.f131771p;
                return (ah2.g) KoinJavaComponent.get$default(ah2.g.class, null, null, 6, null);
            case 3:
                int i15 = oj0.f.f132279m;
                int iF = ((c22.o) KoinJavaComponent.get$default(c22.o.class, null, null, 6, null)).f();
                a2 a2Var = a2.SUBSCRIPTIONS;
                String strH = am.j.h(iF, "Screen density dpi: ");
                i2.f36769a.getClass();
                i2.a.b(a2Var, "GCPlusRepository", strH);
                return Integer.valueOf(iF);
            case 4:
                return (bv.d) KoinJavaComponent.get$default(bv.d.class, null, null, 6, null);
            case 5:
                ok2.d.b bVar = ok2.d.f132618i;
                return Boolean.FALSE;
            case 6:
                return new y0();
            case 7:
                return new y0();
            case 8:
                return new y0();
            case 9:
                return new y0();
            case 10:
                int i16 = oo.b.f133050p;
                return zf0.d.a.a(zf0.d.f204343b);
            case 11:
                int i17 = oo.b.f133050p;
                return am.m.a.a(am.m.f4066e, 6);
            case 12:
                int i18 = oo.b.f133050p;
                return new y0();
            case 13:
                int i19 = oo.b.f133050p;
                return new y0();
            case 14:
                int i24 = oo.b.f133050p;
                return new y0();
            case 15:
                int i25 = oo.b.f133050p;
                return new y0();
            case 16:
                return KoinApplicationKt.LocalKoinApplication$lambda$0();
            case 17:
                return KoinApplicationKt.LocalKoinScope$lambda$1();
            case 18:
                return new f1("com.garmin.android.apps.connectmobile.menstrualcycle.presentation.v2.navigation.MctNavDestination.Genesis", ox0.a.INSTANCE, new Annotation[0]);
            case 19:
                return new f1("com.garmin.android.apps.connectmobile.menstrualcycle.presentation.v2.navigation.MctNavDestination.Init", ox0.b.INSTANCE, new Annotation[0]);
            case 20:
                return new f1("com.garmin.android.apps.connectmobile.menstrualcycle.presentation.v2.navigation.MctNavDestination.Reports", ox0.c.INSTANCE, new Annotation[0]);
            case 21:
                oy0.a aVar = oy0.a.f134364a;
                return Unit.INSTANCE;
            case 22:
                oz0.d.b bVar2 = oz0.d.Companion;
                return new m63.e(y1.f117048a);
            case 23:
                oz0.h.Companion bVar3 = oz0.h.INSTANCE;
                return new m63.e(oz0.i.a.f134489a);
            case 24:
                p10.a.b bVar4 = p10.a.f134883c;
                bz0.o.f22274a.getClass();
                OkHttpClient.Builder builderNewBuilder = bz0.o.c().newBuilder();
                g22.m.a(builderNewBuilder);
                return builderNewBuilder.addInterceptor(new p10.a.c()).build();
            case 25:
                p10.c.a aVar2 = p10.c.f134886c;
                bz0.o.f22274a.getClass();
                OkHttpClient.Builder builderNewBuilder2 = bz0.o.c().newBuilder();
                g22.m.a(builderNewBuilder2);
                return builderNewBuilder2.addInterceptor(new p10.c.b()).build();
            case 26:
                return Unit.INSTANCE;
            case 27:
                return Unit.INSTANCE;
            case 28:
                p3.n.b("Unexpected call to default provider");
                throw new KotlinNothingValueException();
            default:
                throw new IllegalStateException("CompositionLocal LocalHostDefaultProvider not present");
        }
    }
}
