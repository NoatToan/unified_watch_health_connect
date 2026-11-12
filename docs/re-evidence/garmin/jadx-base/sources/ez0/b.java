package ez0;

import am.d2;
import bz0.o;
import c83.b0;
import c83.h;
import com.garmin.android.apps.connectmobile.util.GsonUtil;
import com.google.gson.Gson;
import ds0.g;
import h83.k;
import java.util.ArrayList;
import lc.u0;
import n63.p;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.qualifier.QualifierKt;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s0;
import p63.e;
import zy0.l;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lez0/b;", "", "<init>", "()V", "gcm-network_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f67468a = new b();

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f67469a;

        static {
            int[] iArr = new int[c.values().length];
            try {
                iArr[c.APP_REVIEW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[c.GC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[c.GC_WEB_URL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[c.GCS_API_DI.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[c.SSO.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[c.TRAILS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[c.OMT_CMS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[c.GCX.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[c.OMT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[c.GC_OAUTH_1.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[c.GCS.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[c.GOLF.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[c.ECC_URL.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[c.GCS_API.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[c.LTE_SUBSCRIPTIONS_URL.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[c.COMMUNICATION_SERVICES.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[c.SHORT_LINK.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[c.STATIC.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[c.STATIC_ATP_GATEWAY.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[c.GARMIN_HEALTH_SERVICES.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[c.GARMIN_HEALTH_SERVICES_GC.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[c.INREACH.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            f67469a = iArr;
        }
    }

    private b() {
    }

    public static Object a(b bVar, c cVar, Class cls, h.a[] aVarArr, Gson gson, p63.c cVar2, f83.b bVar2, int i14) {
        OkHttpClient okHttpClientB;
        if ((i14 & 8) != 0) {
            GsonUtil.f47252a.getClass();
            gson = GsonUtil.f47253b;
        }
        Gson gson2 = gson;
        p63.c cVar3 = (i14 & 16) != 0 ? null : cVar2;
        boolean z14 = (i14 & 32) == 0;
        f83.b bVar3 = (i14 & 64) != 0 ? null : bVar2;
        bVar.getClass();
        cVar.getClass();
        gson2.getClass();
        String strK = ((l) KoinJavaComponent.get$default(l.class, null, null, 6, null)).k(cVar);
        switch (a.f67469a[cVar.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                o.f22274a.getClass();
                okHttpClientB = o.b();
                break;
            case 9:
                o.f22274a.getClass();
                okHttpClientB = (OkHttpClient) o.i().get((k23.d<?>) s0.f105811a.b(OkHttpClient.class), QualifierKt.named("omtHttpClient"), (e23.a<? extends ParametersHolder>) null);
                break;
            case 10:
            case 11:
            case 12:
                o.f22274a.getClass();
                okHttpClientB = o.c();
                break;
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
                o.f22274a.getClass();
                okHttpClientB = o.e();
                break;
            case 18:
            case 19:
                o.f22274a.getClass();
                okHttpClientB = o.j();
                break;
            case 20:
                o.f22274a.getClass();
                okHttpClientB = o.f();
                break;
            case 21:
                o.f22274a.getClass();
                okHttpClientB = o.b();
                break;
            case 22:
                o.f22274a.getClass();
                okHttpClientB = o.g();
                break;
            default:
                u0.r();
                return null;
        }
        return d(cls, strK, okHttpClientB, aVarArr, cVar3, gson2, z14, bVar3);
    }

    public static Object b(b bVar, String str, Class cls, h.a[] aVarArr) {
        bVar.getClass();
        o.f22274a.getClass();
        OkHttpClient okHttpClientJ = o.j();
        GsonUtil.f47252a.getClass();
        return d(cls, str, okHttpClientJ, aVarArr, null, GsonUtil.f47253b, false, null);
    }

    public static Object c(b bVar, c cVar, h.a[] aVarArr, e23.l lVar) {
        bVar.getClass();
        cVar.getClass();
        lVar.getClass();
        String strK = ((l) KoinJavaComponent.get$default(l.class, null, null, 6, null)).k(cVar);
        o.f22274a.getClass();
        o.f22281h = lVar;
        OkHttpClient okHttpClient = (OkHttpClient) o.i().get((k23.d<?>) s0.f105811a.b(OkHttpClient.class), QualifierKt.named("gcTrackingHttpClient"), (e23.a<? extends ParametersHolder>) null);
        GsonUtil.f47252a.getClass();
        return d(d2.class, strK, okHttpClient, aVarArr, null, GsonUtil.f47253b, false, null);
    }

    public static Object d(Class cls, String str, OkHttpClient okHttpClient, h.a[] aVarArr, e eVar, Gson gson, boolean z14, h.a aVar) {
        if (aVar == null) {
            if (z14) {
                ez0.a.f67467a.getClass();
                aVar = f83.c.a(p.a(new g(eVar, 28)), MediaType.INSTANCE.get("application/json"));
            } else {
                aVar = null;
            }
        }
        b0.b bVar = new b0.b();
        mz2.c.f122004a.getClass();
        mz2.c cVarA = mz2.c.b.a();
        ArrayList arrayList = bVar.f25769d;
        arrayList.add(cVarA);
        arrayList.add(d83.g.b());
        for (h.a aVar2 : aVarArr) {
            bVar.a(aVar2);
        }
        bVar.a(d.f67493a);
        bVar.a(k.c());
        if (aVar != null) {
            bVar.a(aVar);
        } else {
            bVar.a(e83.a.d(gson));
        }
        bVar.d(okHttpClient);
        bVar.b(str);
        return bVar.c().b(cls);
    }
}
