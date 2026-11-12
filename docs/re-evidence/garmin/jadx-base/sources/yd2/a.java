package yd2;

import c83.a0;
import com.garmin.android.lib.networking.exceptions.NoNetworkException;
import e23.l;
import java.io.IOException;
import java.util.Map;
import o13.r;
import o53.m0;
import okhttp3.Headers;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.u0;
import retrofit2.HttpException;
import t13.d;
import v13.c;
import v13.e;
import v13.i;
import vb.h;
import wd2.i2;

/* JADX INFO: loaded from: classes11.dex */
public interface a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f196763b = 0;

    /* JADX INFO: renamed from: yd2.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lyd2/a$a;", "", "<init>", "()V", "livetrack_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C3682a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int f196764a = 0;

        static {
            new C3682a();
        }

        private C3682a() {
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    @e(c = "com.garmin.android.library.livetrack.data.base.BaseRepository", f = "BaseRepository.kt", l = {52, 101, 102}, m = "getSafeApiResultWithRetry", v = 2)
    public static final class b<T> extends c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public l f196765a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Logger f196766b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f196767c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f196768d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public /* synthetic */ Object f196769e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f196771g;

        public b(d<? super b> dVar) {
            super(dVar);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            this.f196769e = obj;
            this.f196771g |= Integer.MIN_VALUE;
            int i14 = a.f196763b;
            return a.this.k(0, null, this);
        }
    }

    static {
        int i14 = C3682a.f196764a;
    }

    /* JADX WARN: Code duplicated, block: B:112:0x02c9  */
    /* JADX WARN: Code duplicated, block: B:115:0x02d8  */
    /* JADX WARN: Code duplicated, block: B:118:0x02ee  */
    /* JADX WARN: Code duplicated, block: B:121:0x0303 A[PHI: r2 r3 r6 r7
      0x0303: PHI (r2v29 int) = (r2v14 int), (r2v36 int) binds: [B:119:0x0300, B:17:0x0048] A[DONT_GENERATE, DONT_INLINE]
      0x0303: PHI (r3v27 int) = (r3v15 int), (r3v34 int) binds: [B:119:0x0300, B:17:0x0048] A[DONT_GENERATE, DONT_INLINE]
      0x0303: PHI (r6v21 e23.l) = (r6v17 e23.l), (r6v23 e23.l) binds: [B:119:0x0300, B:17:0x0048] A[DONT_GENERATE, DONT_INLINE]
      0x0303: PHI (r7v7 ??) = (r7v5 ??), (r7v9 ??) binds: [B:119:0x0300, B:17:0x0048] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:124:0x0317 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:125:0x0318 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v7, types: [e23.l, org.slf4j.Logger] */
    /* JADX WARN: Type inference failed for: r7v9 */
    default Object k(int i14, l lVar, d dVar) {
        b bVar;
        Logger loggerA;
        l lVar2;
        int i15;
        NoNetworkException noNetworkException;
        l lVar3;
        NoNetworkException e4;
        yd2.b.a aVar;
        int i16;
        int i17;
        a0<?> a0VarResponse;
        Map mapL;
        l lVar4;
        Headers headers;
        ?? r14;
        a0 a0Var;
        T t7;
        int i18;
        int i19;
        Response response;
        Object objK;
        int i24 = i14;
        if (dVar instanceof b) {
            bVar = (b) dVar;
            int i25 = bVar.f196771g;
            if ((i25 & Integer.MIN_VALUE) != 0) {
                bVar.f196771g = i25 - Integer.MIN_VALUE;
            } else {
                bVar = new b(dVar);
            }
        } else {
            bVar = new b(dVar);
        }
        Object objInvoke = bVar.f196769e;
        Object obj = u13.a.COROUTINE_SUSPENDED;
        int i26 = bVar.f196771g;
        try {
            try {
                try {
                    if (i26 == 0) {
                        r.b(objInvoke);
                        loggerA = i2.a("BaseRepository");
                        try {
                            bVar.f196765a = lVar;
                            bVar.f196766b = loggerA;
                            bVar.f196767c = i24;
                            bVar.f196768d = i24;
                            bVar.f196771g = 1;
                            objInvoke = lVar.invoke(bVar);
                            if (objInvoke != obj) {
                                lVar3 = lVar;
                                i15 = i24;
                            }
                        } catch (NoNetworkException e14) {
                            noNetworkException = e14;
                            lVar2 = lVar;
                            i15 = i24;
                        } catch (HttpException e15) {
                            e = e15;
                            lVar2 = lVar;
                            i15 = i24;
                            int i27 = i24;
                            loggerA.error(lVar2.getClass().getName() + " -> server error response code=[" + e.code() + "] message=[" + e.message() + "].");
                            String name = lVar2.getClass().getName();
                            StringBuilder sb3 = new StringBuilder("Error Occurred during getting safe Api result, ");
                            sb3.append(name);
                            sb3.append(", ERROR [");
                            sb3.append(e);
                            sb3.append("]");
                            IOException iOException = new IOException(sb3.toString());
                            Integer num = new Integer(e.code());
                            a0VarResponse = e.response();
                            if (a0VarResponse != null) {
                                mapL = null;
                            } else {
                                mapL = null;
                            }
                            aVar = new yd2.b.a(iOException, num, null, mapL, 4, null);
                            i17 = i15;
                            lVar4 = lVar2;
                            i16 = i27;
                            if (i17 > 0) {
                                return aVar;
                            }
                            bVar.f196765a = lVar4;
                            r14 = 0;
                            bVar.f196766b = null;
                            bVar.f196767c = i16;
                            bVar.f196768d = i17;
                            bVar.f196771g = 2;
                            if (m0.b(15000L, bVar) != obj) {
                                int i28 = i17 - 1;
                                bVar.f196765a = r14;
                                bVar.f196766b = r14;
                                bVar.f196767c = i16;
                                bVar.f196768d = i28;
                                bVar.f196771g = 3;
                                objK = k(i28, lVar4, bVar);
                                if (objK == obj) {
                                    return objK;
                                }
                            }
                            return obj;
                        } catch (Throwable th3) {
                            th = th3;
                            lVar2 = lVar;
                            i15 = i24;
                            loggerA.error(lVar2.getClass().getName() + "  -> error message=[" + th + "].");
                            aVar = new yd2.b.a(new IOException("Error Occurred during getting safe Api result, " + lVar2.getClass().getName() + ", ERROR [" + th + "]"), null, null, null, 14, null);
                            int i29 = i15;
                            i16 = i24;
                            i17 = i29;
                            lVar4 = lVar2;
                            if (i17 > 0) {
                                return aVar;
                            }
                            bVar.f196765a = lVar4;
                            r14 = 0;
                            bVar.f196766b = null;
                            bVar.f196767c = i16;
                            bVar.f196768d = i17;
                            bVar.f196771g = 2;
                            if (m0.b(15000L, bVar) != obj) {
                                int i210 = i17 - 1;
                                bVar.f196765a = r14;
                                bVar.f196766b = r14;
                                bVar.f196767c = i16;
                                bVar.f196768d = i210;
                                bVar.f196771g = 3;
                                objK = k(i210, lVar4, bVar);
                                if (objK == obj) {
                                    return objK;
                                }
                            }
                            return obj;
                        }
                        return obj;
                    }
                    if (i26 == 1) {
                        int i30 = bVar.f196768d;
                        int i34 = bVar.f196767c;
                        loggerA = bVar.f196766b;
                        lVar3 = bVar.f196765a;
                        try {
                            r.b(objInvoke);
                            i15 = i30;
                            i24 = i34;
                        } catch (NoNetworkException e16) {
                            e4 = e16;
                            i15 = i30;
                            i24 = i34;
                            noNetworkException = e4;
                            lVar2 = lVar3;
                            loggerA.error("No network connection");
                            int i35 = i15;
                            i16 = i24;
                            i17 = i35;
                            aVar = new yd2.b.a(noNetworkException, null, null, null, 14, null);
                            lVar4 = lVar2;
                            if (i17 > 0) {
                                return aVar;
                            }
                            bVar.f196765a = lVar4;
                            r14 = 0;
                            bVar.f196766b = null;
                            bVar.f196767c = i16;
                            bVar.f196768d = i17;
                            bVar.f196771g = 2;
                            if (m0.b(15000L, bVar) != obj) {
                                int i211 = i17 - 1;
                                bVar.f196765a = r14;
                                bVar.f196766b = r14;
                                bVar.f196767c = i16;
                                bVar.f196768d = i211;
                                bVar.f196771g = 3;
                                objK = k(i211, lVar4, bVar);
                                if (objK == obj) {
                                    return objK;
                                }
                            }
                            return obj;
                        } catch (HttpException e17) {
                            e = e17;
                            i15 = i30;
                            i24 = i34;
                            lVar2 = lVar3;
                            int i212 = i24;
                            loggerA.error(lVar2.getClass().getName() + " -> server error response code=[" + e.code() + "] message=[" + e.message() + "].");
                            String name2 = lVar2.getClass().getName();
                            StringBuilder sb4 = new StringBuilder("Error Occurred during getting safe Api result, ");
                            sb4.append(name2);
                            sb4.append(", ERROR [");
                            sb4.append(e);
                            sb4.append("]");
                            IOException iOException2 = new IOException(sb4.toString());
                            Integer num2 = new Integer(e.code());
                            a0VarResponse = e.response();
                            if (a0VarResponse != null || (headers = a0VarResponse.f25745a.headers()) == null) {
                                mapL = null;
                            } else {
                                mapL = u0.l(headers);
                            }
                            aVar = new yd2.b.a(iOException2, num2, null, mapL, 4, null);
                            i17 = i15;
                            lVar4 = lVar2;
                            i16 = i212;
                            if (i17 > 0) {
                                return aVar;
                            }
                            bVar.f196765a = lVar4;
                            r14 = 0;
                            bVar.f196766b = null;
                            bVar.f196767c = i16;
                            bVar.f196768d = i17;
                            bVar.f196771g = 2;
                            if (m0.b(15000L, bVar) != obj) {
                                int i213 = i17 - 1;
                                bVar.f196765a = r14;
                                bVar.f196766b = r14;
                                bVar.f196767c = i16;
                                bVar.f196768d = i213;
                                bVar.f196771g = 3;
                                objK = k(i213, lVar4, bVar);
                                if (objK == obj) {
                                    return objK;
                                }
                            }
                            return obj;
                        } catch (Throwable th4) {
                            th = th4;
                            i15 = i30;
                            i24 = i34;
                            lVar2 = lVar3;
                            loggerA.error(lVar2.getClass().getName() + "  -> error message=[" + th + "].");
                            aVar = new yd2.b.a(new IOException("Error Occurred during getting safe Api result, " + lVar2.getClass().getName() + ", ERROR [" + th + "]"), null, null, null, 14, null);
                            int i214 = i15;
                            i16 = i24;
                            i17 = i214;
                            lVar4 = lVar2;
                            if (i17 > 0) {
                                return aVar;
                            }
                            bVar.f196765a = lVar4;
                            r14 = 0;
                            bVar.f196766b = null;
                            bVar.f196767c = i16;
                            bVar.f196768d = i17;
                            bVar.f196771g = 2;
                            if (m0.b(15000L, bVar) != obj) {
                                int i215 = i17 - 1;
                                bVar.f196765a = r14;
                                bVar.f196766b = r14;
                                bVar.f196767c = i16;
                                bVar.f196768d = i215;
                                bVar.f196771g = 3;
                                objK = k(i215, lVar4, bVar);
                                if (objK == obj) {
                                    return objK;
                                }
                            }
                            return obj;
                        }
                    } else {
                        if (i26 != 2) {
                            if (i26 == 3) {
                                r.b(objInvoke);
                                return objInvoke;
                            }
                            h.z("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        i17 = bVar.f196768d;
                        i16 = bVar.f196767c;
                        lVar4 = bVar.f196765a;
                        r.b(objInvoke);
                        r14 = 0;
                    }
                    int i216 = i17 - 1;
                    bVar.f196765a = r14;
                    bVar.f196766b = r14;
                    bVar.f196767c = i16;
                    bVar.f196768d = i216;
                    bVar.f196771g = 3;
                    objK = k(i216, lVar4, bVar);
                    if (objK == obj) {
                        return obj;
                    }
                    return objK;
                    if (response.isSuccessful() && t7 != 0) {
                        return new yd2.b.C3683b(t7, response.code());
                    }
                    if (response.isSuccessful()) {
                        return new yd2.b.C3683b(Unit.INSTANCE, response.code());
                    }
                    ResponseBody responseBody = a0Var.f25747c;
                    String strString = responseBody != null ? responseBody.string() : null;
                    i18 = i24;
                    try {
                        i19 = i15;
                        try {
                            lVar2 = lVar3;
                            try {
                                loggerA.error(lVar3.getClass().getName() + " -> server error response code=[" + response.code() + "] message=[" + response.message() + "] error body=[" + strString + "].");
                                String name3 = lVar2.getClass().getName();
                                StringBuilder sb5 = new StringBuilder("Error Occurred during getting safe Api result, ");
                                sb5.append(name3);
                                sb5.append(", Response [");
                                sb5.append(a0Var);
                                sb5.append("]");
                                IOException iOException3 = new IOException(sb5.toString());
                                Integer num3 = new Integer(response.code());
                                Headers headers2 = response.headers();
                                headers2.getClass();
                                yd2.b.a aVar2 = new yd2.b.a(iOException3, num3, strString, u0.l(headers2));
                                if (response.code() == 404 || response.code() == 401) {
                                    loggerA.error("cancel retries");
                                    i16 = i18;
                                    aVar = aVar2;
                                    lVar4 = lVar2;
                                    i17 = 0;
                                } else {
                                    i16 = i18;
                                    aVar = aVar2;
                                    lVar4 = lVar2;
                                    i17 = i19;
                                }
                            } catch (NoNetworkException e18) {
                                e = e18;
                                i24 = i18;
                                i15 = i19;
                                noNetworkException = e;
                                loggerA.error("No network connection");
                                int i36 = i15;
                                i16 = i24;
                                i17 = i36;
                                aVar = new yd2.b.a(noNetworkException, null, null, null, 14, null);
                                lVar4 = lVar2;
                            } catch (HttpException e19) {
                                e = e19;
                                i24 = i18;
                                i15 = i19;
                                int i217 = i24;
                                loggerA.error(lVar2.getClass().getName() + " -> server error response code=[" + e.code() + "] message=[" + e.message() + "].");
                                String name4 = lVar2.getClass().getName();
                                StringBuilder sb6 = new StringBuilder("Error Occurred during getting safe Api result, ");
                                sb6.append(name4);
                                sb6.append(", ERROR [");
                                sb6.append(e);
                                sb6.append("]");
                                IOException iOException4 = new IOException(sb6.toString());
                                Integer num4 = new Integer(e.code());
                                a0VarResponse = e.response();
                                if (a0VarResponse != null) {
                                    mapL = null;
                                } else {
                                    mapL = null;
                                }
                                aVar = new yd2.b.a(iOException4, num4, null, mapL, 4, null);
                                i17 = i15;
                                lVar4 = lVar2;
                                i16 = i217;
                            } catch (Throwable th5) {
                                th = th5;
                                i24 = i18;
                                i15 = i19;
                                loggerA.error(lVar2.getClass().getName() + "  -> error message=[" + th + "].");
                                aVar = new yd2.b.a(new IOException("Error Occurred during getting safe Api result, " + lVar2.getClass().getName() + ", ERROR [" + th + "]"), null, null, null, 14, null);
                                int i218 = i15;
                                i16 = i24;
                                i17 = i218;
                                lVar4 = lVar2;
                            }
                        } catch (NoNetworkException e24) {
                            e = e24;
                            lVar2 = lVar3;
                            i24 = i18;
                            i15 = i19;
                            noNetworkException = e;
                            loggerA.error("No network connection");
                            int i37 = i15;
                            i16 = i24;
                            i17 = i37;
                            aVar = new yd2.b.a(noNetworkException, null, null, null, 14, null);
                            lVar4 = lVar2;
                            if (i17 > 0) {
                                return aVar;
                            }
                            bVar.f196765a = lVar4;
                            r14 = 0;
                            bVar.f196766b = null;
                            bVar.f196767c = i16;
                            bVar.f196768d = i17;
                            bVar.f196771g = 2;
                            if (m0.b(15000L, bVar) != obj) {
                                int i219 = i17 - 1;
                                bVar.f196765a = r14;
                                bVar.f196766b = r14;
                                bVar.f196767c = i16;
                                bVar.f196768d = i219;
                                bVar.f196771g = 3;
                                objK = k(i219, lVar4, bVar);
                                if (objK == obj) {
                                    return objK;
                                }
                            }
                            return obj;
                        } catch (HttpException e25) {
                            e = e25;
                            lVar2 = lVar3;
                            i24 = i18;
                            i15 = i19;
                            int i2110 = i24;
                            loggerA.error(lVar2.getClass().getName() + " -> server error response code=[" + e.code() + "] message=[" + e.message() + "].");
                            String name5 = lVar2.getClass().getName();
                            StringBuilder sb7 = new StringBuilder("Error Occurred during getting safe Api result, ");
                            sb7.append(name5);
                            sb7.append(", ERROR [");
                            sb7.append(e);
                            sb7.append("]");
                            IOException iOException5 = new IOException(sb7.toString());
                            Integer num5 = new Integer(e.code());
                            a0VarResponse = e.response();
                            if (a0VarResponse != null) {
                                mapL = null;
                            } else {
                                mapL = null;
                            }
                            aVar = new yd2.b.a(iOException5, num5, null, mapL, 4, null);
                            i17 = i15;
                            lVar4 = lVar2;
                            i16 = i2110;
                            if (i17 > 0) {
                                return aVar;
                            }
                            bVar.f196765a = lVar4;
                            r14 = 0;
                            bVar.f196766b = null;
                            bVar.f196767c = i16;
                            bVar.f196768d = i17;
                            bVar.f196771g = 2;
                            if (m0.b(15000L, bVar) != obj) {
                                int i2111 = i17 - 1;
                                bVar.f196765a = r14;
                                bVar.f196766b = r14;
                                bVar.f196767c = i16;
                                bVar.f196768d = i2111;
                                bVar.f196771g = 3;
                                objK = k(i2111, lVar4, bVar);
                                if (objK == obj) {
                                    return objK;
                                }
                            }
                            return obj;
                        } catch (Throwable th6) {
                            th = th6;
                            lVar2 = lVar3;
                            i24 = i18;
                            i15 = i19;
                            loggerA.error(lVar2.getClass().getName() + "  -> error message=[" + th + "].");
                            aVar = new yd2.b.a(new IOException("Error Occurred during getting safe Api result, " + lVar2.getClass().getName() + ", ERROR [" + th + "]"), null, null, null, 14, null);
                            int i2112 = i15;
                            i16 = i24;
                            i17 = i2112;
                            lVar4 = lVar2;
                            if (i17 > 0) {
                                return aVar;
                            }
                            bVar.f196765a = lVar4;
                            r14 = 0;
                            bVar.f196766b = null;
                            bVar.f196767c = i16;
                            bVar.f196768d = i17;
                            bVar.f196771g = 2;
                            if (m0.b(15000L, bVar) != obj) {
                                int i2113 = i17 - 1;
                                bVar.f196765a = r14;
                                bVar.f196766b = r14;
                                bVar.f196767c = i16;
                                bVar.f196768d = i2113;
                                bVar.f196771g = 3;
                                objK = k(i2113, lVar4, bVar);
                                if (objK == obj) {
                                    return objK;
                                }
                            }
                            return obj;
                        }
                    } catch (NoNetworkException e26) {
                        e = e26;
                        lVar2 = lVar3;
                        i24 = i18;
                        noNetworkException = e;
                        loggerA.error("No network connection");
                        int i38 = i15;
                        i16 = i24;
                        i17 = i38;
                        aVar = new yd2.b.a(noNetworkException, null, null, null, 14, null);
                        lVar4 = lVar2;
                    } catch (HttpException e27) {
                        e = e27;
                        lVar2 = lVar3;
                        i24 = i18;
                        int i2114 = i24;
                        loggerA.error(lVar2.getClass().getName() + " -> server error response code=[" + e.code() + "] message=[" + e.message() + "].");
                        String name6 = lVar2.getClass().getName();
                        StringBuilder sb8 = new StringBuilder("Error Occurred during getting safe Api result, ");
                        sb8.append(name6);
                        sb8.append(", ERROR [");
                        sb8.append(e);
                        sb8.append("]");
                        IOException iOException6 = new IOException(sb8.toString());
                        Integer num6 = new Integer(e.code());
                        a0VarResponse = e.response();
                        if (a0VarResponse != null) {
                            mapL = null;
                        } else {
                            mapL = null;
                        }
                        aVar = new yd2.b.a(iOException6, num6, null, mapL, 4, null);
                        i17 = i15;
                        lVar4 = lVar2;
                        i16 = i2114;
                    } catch (Throwable th7) {
                        th = th7;
                        lVar2 = lVar3;
                        i24 = i18;
                        loggerA.error(lVar2.getClass().getName() + "  -> error message=[" + th + "].");
                        aVar = new yd2.b.a(new IOException("Error Occurred during getting safe Api result, " + lVar2.getClass().getName() + ", ERROR [" + th + "]"), null, null, null, 14, null);
                        int i2115 = i15;
                        i16 = i24;
                        i17 = i2115;
                        lVar4 = lVar2;
                    }
                    if (i17 > 0) {
                        return aVar;
                    }
                    bVar.f196765a = lVar4;
                    r14 = 0;
                    bVar.f196766b = null;
                    bVar.f196767c = i16;
                    bVar.f196768d = i17;
                    bVar.f196771g = 2;
                    if (m0.b(15000L, bVar) != obj) {
                        int i2116 = i17 - 1;
                        bVar.f196765a = r14;
                        bVar.f196766b = r14;
                        bVar.f196767c = i16;
                        bVar.f196768d = i2116;
                        bVar.f196771g = 3;
                        objK = k(i2116, lVar4, bVar);
                        if (objK == obj) {
                            return objK;
                        }
                    }
                    return obj;
                } catch (NoNetworkException e28) {
                    e4 = e28;
                    noNetworkException = e4;
                    lVar2 = lVar3;
                    loggerA.error("No network connection");
                    int i39 = i15;
                    i16 = i24;
                    i17 = i39;
                    aVar = new yd2.b.a(noNetworkException, null, null, null, 14, null);
                    lVar4 = lVar2;
                } catch (HttpException e29) {
                    e = e29;
                    lVar2 = lVar3;
                    int i2117 = i24;
                    loggerA.error(lVar2.getClass().getName() + " -> server error response code=[" + e.code() + "] message=[" + e.message() + "].");
                    String name7 = lVar2.getClass().getName();
                    StringBuilder sb9 = new StringBuilder("Error Occurred during getting safe Api result, ");
                    sb9.append(name7);
                    sb9.append(", ERROR [");
                    sb9.append(e);
                    sb9.append("]");
                    IOException iOException7 = new IOException(sb9.toString());
                    Integer num7 = new Integer(e.code());
                    a0VarResponse = e.response();
                    if (a0VarResponse != null) {
                        mapL = null;
                    } else {
                        mapL = null;
                    }
                    aVar = new yd2.b.a(iOException7, num7, null, mapL, 4, null);
                    i17 = i15;
                    lVar4 = lVar2;
                    i16 = i2117;
                    if (i17 > 0) {
                        return aVar;
                    }
                    bVar.f196765a = lVar4;
                    r14 = 0;
                    bVar.f196766b = null;
                    bVar.f196767c = i16;
                    bVar.f196768d = i17;
                    bVar.f196771g = 2;
                    if (m0.b(15000L, bVar) != obj) {
                        int i2118 = i17 - 1;
                        bVar.f196765a = r14;
                        bVar.f196766b = r14;
                        bVar.f196767c = i16;
                        bVar.f196768d = i2118;
                        bVar.f196771g = 3;
                        objK = k(i2118, lVar4, bVar);
                        if (objK == obj) {
                            return objK;
                        }
                    }
                    return obj;
                } catch (Throwable th8) {
                    th = th8;
                    lVar2 = lVar3;
                    loggerA.error(lVar2.getClass().getName() + "  -> error message=[" + th + "].");
                    aVar = new yd2.b.a(new IOException("Error Occurred during getting safe Api result, " + lVar2.getClass().getName() + ", ERROR [" + th + "]"), null, null, null, 14, null);
                    int i2119 = i15;
                    i16 = i24;
                    i17 = i2119;
                    lVar4 = lVar2;
                    if (i17 > 0) {
                        return aVar;
                    }
                    bVar.f196765a = lVar4;
                    r14 = 0;
                    bVar.f196766b = null;
                    bVar.f196767c = i16;
                    bVar.f196768d = i17;
                    bVar.f196771g = 2;
                    if (m0.b(15000L, bVar) != obj) {
                        int i21110 = i17 - 1;
                        bVar.f196765a = r14;
                        bVar.f196766b = r14;
                        bVar.f196767c = i16;
                        bVar.f196768d = i21110;
                        bVar.f196771g = 3;
                        objK = k(i21110, lVar4, bVar);
                        if (objK == obj) {
                            return objK;
                        }
                    }
                    return obj;
                }
                response = a0Var.f25745a;
            } catch (NoNetworkException e34) {
                e = e34;
                i18 = i24;
                i19 = i15;
            } catch (HttpException e35) {
                e = e35;
                i18 = i24;
                i19 = i15;
            } catch (Throwable th9) {
                th = th9;
                i18 = i24;
                i19 = i15;
            }
            a0Var = (a0) objInvoke;
            t7 = a0Var.f25746b;
        } catch (NoNetworkException e36) {
            e = e36;
            lVar2 = lVar3;
        } catch (HttpException e37) {
            e = e37;
        } catch (Throwable th10) {
            th = th10;
        }
        noNetworkException = e;
        loggerA.error("No network connection");
        int i310 = i15;
        i16 = i24;
        i17 = i310;
        aVar = new yd2.b.a(noNetworkException, null, null, null, 14, null);
        lVar4 = lVar2;
        if (i17 > 0) {
            return aVar;
        }
        bVar.f196765a = lVar4;
        r14 = 0;
        bVar.f196766b = null;
        bVar.f196767c = i16;
        bVar.f196768d = i17;
        bVar.f196771g = 2;
        if (m0.b(15000L, bVar) != obj) {
            int i21111 = i17 - 1;
            bVar.f196765a = r14;
            bVar.f196766b = r14;
            bVar.f196767c = i16;
            bVar.f196768d = i21111;
            bVar.f196771g = 3;
            objK = k(i21111, lVar4, bVar);
            if (objK == obj) {
                return objK;
            }
        }
        return obj;
    }

    default Object o(l lVar, i iVar) {
        return k(3, lVar, iVar);
    }
}
