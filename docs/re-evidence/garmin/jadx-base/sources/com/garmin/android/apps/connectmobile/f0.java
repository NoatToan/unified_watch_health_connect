package com.garmin.android.apps.connectmobile;

import com.garmin.android.lib.networking.exceptions.NoNetworkException;
import java.io.IOException;
import java.util.concurrent.CancellationException;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import retrofit2.HttpException;

/* JADX INFO: loaded from: classes7.dex */
public interface f0 {
    public static final /* synthetic */ int O = 0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/f0$a;", "", "<init>", "()V", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int f34929a = 0;

        static {
            new a();
        }

        private a() {
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    @v13.e(c = "com.garmin.android.apps.connectmobile.BaseRepository", f = "BaseRepository.kt", l = {28}, m = "safeApiResult$suspendImpl", v = 2)
    public static final class b<T> extends v13.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f34930a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f34932c;

        public b(t13.d<? super b> dVar) {
            super(dVar);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            this.f34930a = obj;
            this.f34932c |= Integer.MIN_VALUE;
            return f0.J(f0.this, null, this);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "T", "Lcom/garmin/android/apps/connectmobile/v2;", "<anonymous>", "()Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.BaseRepository$safeApiResult$2", f = "BaseRepository.kt", l = {29}, m = "invokeSuspend", v = 2)
    public static final class c<T> extends v13.i implements e23.l<t13.d<? super v2<? extends T>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f34933a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ e23.l<t13.d<? super c83.a0<T>>, Object> f34934b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Logger f34935c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f34936d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(e23.l<? super t13.d<? super c83.a0<T>>, ? extends Object> lVar, Logger logger, String str, t13.d<? super c> dVar) {
            super(1, dVar);
            this.f34934b = lVar;
            this.f34935c = logger;
            this.f34936d = str;
        }

        @Override // v13.a
        public final t13.d<Unit> create(t13.d<?> dVar) {
            return new c(this.f34934b, this.f34935c, this.f34936d, dVar);
        }

        @Override // e23.l
        public final Object invoke(Object obj) {
            return ((c) create((t13.d) obj)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f34933a;
            if (i14 == 0) {
                o13.r.b(obj);
                this.f34933a = 1;
                obj = this.f34934b.invoke(this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            c83.a0 a0Var = (c83.a0) obj;
            T t7 = a0Var.f25746b;
            Response response = a0Var.f25745a;
            if (response.isSuccessful() && t7 != null) {
                return new v2.b(t7, response.code(), response.request().url(), response.headers());
            }
            if (response.isSuccessful()) {
                return new v2.b(Unit.INSTANCE, response.code(), response.request().url(), response.headers());
            }
            int iCode = response.code();
            String strMessage = response.message();
            String str = this.f34936d;
            StringBuilder sbK = androidx.core.view.j.k(iCode, "BaseRepository - ", str, " -> server error response code=[", "] message=[");
            sbK.append(strMessage);
            sbK.append("].");
            this.f34935c.error(sbK.toString());
            IOException iOException = new IOException("Error Occurred during getting safe Api result, " + str + ", Response [" + a0Var + "]");
            Integer num = new Integer(response.code());
            ResponseBody responseBody = a0Var.f25747c;
            return new v2.a(iOException, num, responseBody != null ? responseBody.string() : null);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    @v13.e(c = "com.garmin.android.apps.connectmobile.BaseRepository", f = "BaseRepository.kt", l = {109}, m = "tryCatchNetworkCall", v = 2)
    public static final class d<T> extends v13.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f34937a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Logger f34938b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f34939c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f34941e;

        public d(t13.d<? super d> dVar) {
            super(dVar);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            this.f34939c = obj;
            this.f34941e |= Integer.MIN_VALUE;
            int i14 = f0.O;
            return f0.this.l0(null, null, this);
        }
    }

    static {
        int i14 = a.f34929a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    static <T> Object J(f0 f0Var, e23.l<? super t13.d<? super c83.a0<T>>, ? extends Object> lVar, t13.d<? super v2<? extends T>> dVar) {
        b bVar;
        if (dVar instanceof b) {
            bVar = (b) dVar;
            int i14 = bVar.f34932c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                bVar.f34932c = i14 - Integer.MIN_VALUE;
            } else {
                bVar = f0Var.new b(dVar);
            }
        } else {
            bVar = f0Var.new b(dVar);
        }
        Object objL0 = bVar.f34930a;
        Object obj = u13.a.COROUTINE_SUSPENDED;
        int i15 = bVar.f34932c;
        if (i15 == 0) {
            o13.r.b(objL0);
            Logger loggerB = gt2.c.b(a2.GENERAL.f28756a);
            String name = lVar.getClass().getName();
            e23.l cVar = new c(lVar, loggerB, name, null);
            bVar.f34932c = 1;
            objL0 = f0Var.l0(cVar, name, bVar);
            if (objL0 == obj) {
                return obj;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objL0);
        }
        objL0.getClass();
        return (v2) objL0;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:36:0x00e3 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:37:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    static Object R3(f0 f0Var, int i14, long j8, e23.l lVar, v13.c cVar) {
        h0 h0Var;
        p005kotlin.jvm.internal.p0 p0Var;
        long j14;
        e23.l lVar2;
        f0 f0Var2;
        int i15;
        e23.l lVar3;
        f0 f0Var3;
        p005kotlin.jvm.internal.p0 p0Var2;
        long j15;
        Object objO0;
        int i16 = i14;
        if (cVar instanceof h0) {
            h0Var = (h0) cVar;
            int i17 = h0Var.f36515h;
            if ((i17 & Integer.MIN_VALUE) != 0) {
                h0Var.f36515h = i17 - Integer.MIN_VALUE;
            } else {
                h0Var = new h0(f0Var, cVar);
            }
        } else {
            h0Var = new h0(f0Var, cVar);
        }
        Object objL0 = h0Var.f36513f;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i18 = h0Var.f36515h;
        if (i18 == 0) {
            o13.r.b(objL0);
            Logger loggerB = gt2.c.b(a2.GENERAL.f28756a);
            String name = lVar.getClass().getName();
            p0Var = new p005kotlin.jvm.internal.p0();
            p0Var.f105807a = i16;
            i0 i0Var = new i0(lVar, loggerB, name, p0Var, null);
            h0Var.f36508a = f0Var;
            h0Var.f36509b = lVar;
            h0Var.f36510c = p0Var;
            h0Var.f36511d = i16;
            j14 = j8;
            h0Var.f36512e = j14;
            h0Var.f36515h = 1;
            objL0 = f0Var.l0(i0Var, name, h0Var);
            if (objL0 != aVar) {
                lVar2 = lVar;
                f0Var2 = f0Var;
            }
            return aVar;
        }
        if (i18 == 1) {
            long j16 = h0Var.f36512e;
            int i19 = h0Var.f36511d;
            p005kotlin.jvm.internal.p0 p0Var3 = h0Var.f36510c;
            lVar2 = h0Var.f36509b;
            f0Var2 = h0Var.f36508a;
            o13.r.b(objL0);
            j14 = j16;
            i16 = i19;
            p0Var = p0Var3;
        } else {
            if (i18 != 2) {
                if (i18 == 3) {
                    o13.r.b(objL0);
                    return objL0;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j15 = h0Var.f36512e;
            i15 = h0Var.f36511d;
            p0Var2 = h0Var.f36510c;
            lVar3 = h0Var.f36509b;
            f0Var3 = h0Var.f36508a;
            o13.r.b(objL0);
        }
        if (g8.i.P(h0Var.getF129302c())) {
            p0Var2.f105807a = 0;
            return new v2.a(new Exception("Coroutine is not active, stop retry."), null, null, 6, null);
        }
        int i24 = p0Var2.f105807a - 1;
        p0Var2.f105807a = i24;
        h0Var.f36508a = null;
        h0Var.f36509b = null;
        h0Var.f36510c = null;
        h0Var.f36511d = i15;
        h0Var.f36512e = j15;
        h0Var.f36515h = 3;
        objO0 = f0Var3.O0(i24, j15, lVar3, h0Var);
        if (objO0 != aVar) {
            return aVar;
        }
        return objO0;
        v2 v2Var = (v2) objL0;
        if (p0Var.f105807a <= 0 || (v2Var instanceof v2.b)) {
            v2Var.getClass();
            return v2Var;
        }
        h0Var.f36508a = f0Var2;
        h0Var.f36509b = lVar2;
        h0Var.f36510c = p0Var;
        h0Var.f36511d = i16;
        h0Var.f36512e = j14;
        h0Var.f36515h = 2;
        if (o53.m0.b(j14, h0Var) != aVar) {
            i15 = i16;
            lVar3 = lVar2;
            f0Var3 = f0Var2;
            p0Var2 = p0Var;
            j15 = j14;
            if (g8.i.P(h0Var.getF129302c())) {
                p0Var2.f105807a = 0;
                return new v2.a(new Exception("Coroutine is not active, stop retry."), null, null, 6, null);
            }
            int i25 = p0Var2.f105807a - 1;
            p0Var2.f105807a = i25;
            h0Var.f36508a = null;
            h0Var.f36509b = null;
            h0Var.f36510c = null;
            h0Var.f36511d = i15;
            h0Var.f36512e = j15;
            h0Var.f36515h = 3;
            objO0 = f0Var3.O0(i25, j15, lVar3, h0Var);
            if (objO0 != aVar) {
                return objO0;
            }
        }
        return aVar;
    }

    default <T> Object C(e23.l<? super t13.d<? super c83.a0<T>>, ? extends Object> lVar, t13.d<? super v2<? extends T>> dVar) {
        Logger loggerB = gt2.c.b(a2.GENERAL.f28756a);
        String name = lVar.getClass().getName();
        return l0(new g0(lVar, loggerB, name, null), name, dVar);
    }

    default Object O0(int i14, long j8, e23.l lVar, v13.c cVar) {
        return R3(this, i14, j8, lVar, cVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    default Object l0(e23.l lVar, String str, t13.d dVar) {
        d dVar2;
        String str2;
        Logger logger;
        CancellationException cancellationException;
        NoNetworkException noNetworkException;
        String str3;
        if (dVar instanceof d) {
            dVar2 = (d) dVar;
            int i14 = dVar2.f34941e;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                dVar2.f34941e = i14 - Integer.MIN_VALUE;
            } else {
                dVar2 = new d(dVar);
            }
        } else {
            dVar2 = new d(dVar);
        }
        Object objInvoke = dVar2.f34939c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = dVar2.f34941e;
        if (i15 == 0) {
            o13.r.b(objInvoke);
            Logger loggerB = gt2.c.b(a2.GENERAL.f28756a);
            str2 = str;
            try {
                dVar2.f34937a = str2;
                dVar2.f34938b = loggerB;
                dVar2.f34941e = 1;
                objInvoke = lVar.invoke(dVar2);
                if (objInvoke == aVar) {
                    return aVar;
                }
                logger = loggerB;
                str3 = str2;
            } catch (NoNetworkException e4) {
                noNetworkException = e4;
                logger = loggerB;
                logger.error("$BaseRepository -" + str2 + "  -> Network not available error message=[" + noNetworkException + "].");
                return new v2.a(noNetworkException, null, null, 6, null);
            } catch (CancellationException e14) {
                cancellationException = e14;
                logger = loggerB;
                logger.error("$BaseRepository -" + str2 + "  -> Network request cancelled=[" + cancellationException + "].");
                return new v2.a(cancellationException, null, null, 6, null);
            } catch (HttpException e15) {
                e = e15;
                logger = loggerB;
                int iCode = e.code();
                String strMessage = e.message();
                StringBuilder sbK = androidx.core.view.j.k(iCode, "BaseRepository - ", str2, " -> server error response code=[", "] message=[");
                sbK.append(strMessage);
                sbK.append("].");
                logger.error(sbK.toString());
                return new v2.a(new IOException("Error Occurred during getting safe Api result, " + str2 + ", ERROR [" + e + "]", e), new Integer(e.code()), null, 4, null);
            } catch (Throwable th3) {
                th = th3;
                logger = loggerB;
                logger.error("BaseRepository -" + str2 + "  -> error message=[" + th + "].");
                return new v2.a(new IOException("Error Occurred during getting safe Api result, " + str2 + ", ERROR [" + th + "]", th), null, null, 6, null);
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            logger = dVar2.f34938b;
            str3 = dVar2.f34937a;
            try {
                o13.r.b(objInvoke);
            } catch (NoNetworkException e16) {
                noNetworkException = e16;
                str2 = str3;
                logger.error("$BaseRepository -" + str2 + "  -> Network not available error message=[" + noNetworkException + "].");
                return new v2.a(noNetworkException, null, null, 6, null);
            } catch (CancellationException e17) {
                cancellationException = e17;
                str2 = str3;
                logger.error("$BaseRepository -" + str2 + "  -> Network request cancelled=[" + cancellationException + "].");
                return new v2.a(cancellationException, null, null, 6, null);
            } catch (HttpException e18) {
                e = e18;
                str2 = str3;
                int iCode2 = e.code();
                String strMessage2 = e.message();
                StringBuilder sbK2 = androidx.core.view.j.k(iCode2, "BaseRepository - ", str2, " -> server error response code=[", "] message=[");
                sbK2.append(strMessage2);
                sbK2.append("].");
                logger.error(sbK2.toString());
                return new v2.a(new IOException("Error Occurred during getting safe Api result, " + str2 + ", ERROR [" + e + "]", e), new Integer(e.code()), null, 4, null);
            } catch (Throwable th4) {
                th = th4;
                str2 = str3;
                logger.error("BaseRepository -" + str2 + "  -> error message=[" + th + "].");
                return new v2.a(new IOException("Error Occurred during getting safe Api result, " + str2 + ", ERROR [" + th + "]", th), null, null, 6, null);
            }
        }
        return (v2) objInvoke;
    }
}
