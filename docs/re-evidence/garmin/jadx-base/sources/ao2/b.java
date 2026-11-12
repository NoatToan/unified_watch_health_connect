package ao2;

import aq2.j;
import c83.a0;
import com.garmin.feature.garminpay.providers.gpay.snowball.exception.NeedToUpgradeManuallyException;
import com.garmin.feature.garminpay.providers.gpay.snowball.exception.ProviderErrorCodeException;
import com.google.firebase.messaging.l;
import com.google.gson.Gson;
import fo2.b0;
import fo2.k;
import java.io.Reader;
import o13.r;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.apache.commons.lang3.BooleanUtils;
import p005kotlin.jvm.internal.s;
import vb.h;

/* JADX INFO: loaded from: classes11.dex */
public final class b {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f11574a;

        static {
            int[] iArr = new int[pl2.c.values().length];
            try {
                iArr[pl2.c.f138556c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[pl2.c.f138557d.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[pl2.c.f138566m.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[pl2.c.f138569p.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[pl2.c.f138570q.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[pl2.c.f138572t.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[pl2.c.f138565l.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[pl2.c.f138567n.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[pl2.c.f138568o.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[pl2.c.f138571r.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[pl2.c.f138558e.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[pl2.c.f138559f.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[pl2.c.f138560g.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[pl2.c.f138561h.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[pl2.c.f138562i.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[pl2.c.f138563j.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[pl2.c.f138564k.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            f11574a = iArr;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Object a(ao2.a aVar, String str, b0 b0Var, v13.c cVar) {
        d dVar;
        if (cVar instanceof d) {
            dVar = (d) cVar;
            int i14 = dVar.f11577b;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                dVar.f11577b = i14 - Integer.MIN_VALUE;
            } else {
                dVar = new d(cVar);
            }
        } else {
            dVar = new d(cVar);
        }
        Object objC = dVar.f11576a;
        Object obj = u13.a.COROUTINE_SUSPENDED;
        int i15 = dVar.f11577b;
        if (i15 == 0) {
            r.b(objC);
            dVar.f11577b = 1;
            objC = aVar.C(str, b0Var, dVar);
            if (objC == obj) {
                return obj;
            }
        } else {
            if (i15 != 1) {
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(objC);
        }
        a0 a0Var = (a0) objC;
        Response response = a0Var.f25745a;
        if (!response.isSuccessful()) {
            ResponseBody responseBody = a0Var.f25747c;
            if (responseBody != null) {
                return a0.a(responseBody, response);
            }
            l.n(a0Var, "null error body from a error response: ");
            return null;
        }
        ResponseBody responseBody2 = (ResponseBody) a0Var.f25746b;
        if (responseBody2 == null) {
            l.n(a0Var, "null body from a successful response: ");
            return null;
        }
        j.f12491a.getClass();
        Gson gsonD = j.d();
        try {
            Reader readerCharStream = responseBody2.charStream();
            responseBody2.close();
            return a0.c(gsonD.fromJson(readerCharStream, fo2.a0.class), response);
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                jg.b.l(responseBody2, th3);
                throw th4;
            }
        }
    }

    public static final <T> T b(a0<T> a0Var) {
        Throwable providerErrorCodeException;
        a0Var.getClass();
        Response response = a0Var.f25745a;
        if ((response.code() == 503 || response.code() == 500) && s.g(response.headers().get("maintenance-mode"), BooleanUtils.TRUE)) {
            androidx.room.a0.v(a0Var, "SnowballApi response: ");
            return null;
        }
        if (response.isSuccessful()) {
            T t7 = a0Var.f25746b;
            if (t7 != null) {
                return t7;
            }
            l.n(a0Var, "No body. SnowballApi response: ");
            return null;
        }
        ResponseBody responseBody = a0Var.f25747c;
        if (responseBody == null) {
            l.n(a0Var, "No error body. SnowballApi response: ");
            return null;
        }
        try {
            j.f12491a.getClass();
            k kVar = (k) j.d().fromJson(responseBody.charStream(), (Class) k.class);
            responseBody.close();
            String strA = kVar.a(0);
            if (strA == null) {
                throw new IllegalStateException("SnowballApi response: " + a0Var);
            }
            if (strA.equals("02-2101")) {
                String strA2 = kVar.a(1);
                if (strA2 == null) {
                    throw new IllegalStateException("No error url with errorCode: 02-2101");
                }
                providerErrorCodeException = new NeedToUpgradeManuallyException(strA2, "SnowballApi response: " + a0Var);
            } else {
                providerErrorCodeException = new ProviderErrorCodeException(strA, "SnowballApi response: " + a0Var);
            }
            throw providerErrorCodeException;
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                jg.b.l(responseBody, th3);
                throw th4;
            }
        }
    }
}
