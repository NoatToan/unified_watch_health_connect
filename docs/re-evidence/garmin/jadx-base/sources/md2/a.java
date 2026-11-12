package md2;

import com.garmin.android.lib.networking.exceptions.NoNetworkException;
import e23.l;
import java.io.IOException;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import o13.r;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import retrofit2.HttpException;
import vb.h;

/* JADX INFO: loaded from: classes11.dex */
public interface a {

    /* JADX INFO: renamed from: md2.a$a, reason: collision with other inner class name */
    public static final class C2243a {
        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        public static Object a(a aVar, l lVar, v13.c cVar) {
            b bVar;
            if (cVar instanceof b) {
                bVar = (b) cVar;
                int i14 = bVar.f117940b;
                if ((i14 & Integer.MIN_VALUE) != 0) {
                    bVar.f117940b = i14 - Integer.MIN_VALUE;
                } else {
                    bVar = new b(cVar);
                }
            } else {
                bVar = new b(cVar);
            }
            Object objA = bVar.f117939a;
            u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
            int i15 = bVar.f117940b;
            if (i15 == 0) {
                r.b(objA);
                Logger logger = LoggerFactory.getLogger(aVar.getTag());
                String name = lVar.getClass().getName();
                c cVar2 = new c(lVar, logger, name, null);
                bVar.f117940b = 1;
                objA = aVar.a(name, cVar2, bVar);
                if (objA == aVar2) {
                    return aVar2;
                }
            } else {
                if (i15 != 1) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(objA);
            }
            objA.getClass();
            return (wc2.a) objA;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0015  */
        public static Object b(a aVar, String str, c cVar, v13.c cVar2) {
            d dVar;
            String str2;
            Logger logger;
            UnknownHostException unknownHostException;
            SocketTimeoutException socketTimeoutException;
            SocketException socketException;
            NoNetworkException noNetworkException;
            String str3;
            wc2.a.C3415a c3415a;
            if (cVar2 instanceof d) {
                dVar = (d) cVar2;
                int i14 = dVar.f117948d;
                if ((i14 & Integer.MIN_VALUE) != 0) {
                    dVar.f117948d = i14 - Integer.MIN_VALUE;
                } else {
                    dVar = new d(cVar2);
                }
            } else {
                dVar = new d(cVar2);
            }
            Object objInvoke = dVar.f117947c;
            Object obj = u13.a.COROUTINE_SUSPENDED;
            int i15 = dVar.f117948d;
            if (i15 == 0) {
                r.b(objInvoke);
                Logger logger2 = LoggerFactory.getLogger(aVar.getTag());
                str2 = str;
                try {
                    dVar.f117945a = str2;
                    dVar.f117946b = logger2;
                    dVar.f117948d = 1;
                    objInvoke = cVar.invoke(dVar);
                    if (objInvoke == obj) {
                        return obj;
                    }
                    logger = logger2;
                    str3 = str2;
                } catch (NoNetworkException e4) {
                    noNetworkException = e4;
                    logger = logger2;
                    logger.error(str2 + "  -> Network not available error message=[" + noNetworkException + "].");
                    c3415a = new wc2.a.C3415a(noNetworkException, null, null, null, 14, null);
                    return c3415a;
                } catch (SocketException e14) {
                    socketException = e14;
                    logger = logger2;
                    logger.error(str2 + "  -> SocketException: message=[" + socketException + "].");
                    c3415a = new wc2.a.C3415a(socketException, null, null, null, 14, null);
                    return c3415a;
                } catch (SocketTimeoutException e15) {
                    socketTimeoutException = e15;
                    logger = logger2;
                    logger.error(str2 + "  -> SocketTimeoutException: message=[" + socketTimeoutException + "].");
                    c3415a = new wc2.a.C3415a(socketTimeoutException, null, null, null, 14, null);
                    return c3415a;
                } catch (UnknownHostException e16) {
                    unknownHostException = e16;
                    logger = logger2;
                    logger.error(str2 + "  -> UnknownHostException: message=[" + unknownHostException + "].");
                    c3415a = new wc2.a.C3415a(unknownHostException, null, null, null, 14, null);
                    return c3415a;
                } catch (HttpException e17) {
                    e = e17;
                    logger = logger2;
                    logger.error(str2 + " -> server error response code=[" + e.code() + "] message=[" + e.message() + "].");
                    return new wc2.a.C3415a(new IOException("Error Occurred during getting safe Api result, " + str2 + ", ERROR [" + e + "]", e), new Integer(e.code()), null, null, 12, null);
                } catch (Throwable th3) {
                    th = th3;
                    logger = logger2;
                    logger.error(str2 + "  -> error message=[" + th + "].");
                    return new wc2.a.C3415a(new IOException("Error Occurred during getting safe Api result, " + str2 + ", ERROR [" + th + "]", th), null, null, null, 14, null);
                }
            } else {
                if (i15 != 1) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                logger = dVar.f117946b;
                str3 = dVar.f117945a;
                try {
                    r.b(objInvoke);
                } catch (NoNetworkException e18) {
                    str2 = str3;
                    noNetworkException = e18;
                    logger.error(str2 + "  -> Network not available error message=[" + noNetworkException + "].");
                    c3415a = new wc2.a.C3415a(noNetworkException, null, null, null, 14, null);
                    return c3415a;
                } catch (SocketException e19) {
                    str2 = str3;
                    socketException = e19;
                    logger.error(str2 + "  -> SocketException: message=[" + socketException + "].");
                    c3415a = new wc2.a.C3415a(socketException, null, null, null, 14, null);
                    return c3415a;
                } catch (SocketTimeoutException e24) {
                    str2 = str3;
                    socketTimeoutException = e24;
                    logger.error(str2 + "  -> SocketTimeoutException: message=[" + socketTimeoutException + "].");
                    c3415a = new wc2.a.C3415a(socketTimeoutException, null, null, null, 14, null);
                    return c3415a;
                } catch (UnknownHostException e25) {
                    str2 = str3;
                    unknownHostException = e25;
                    logger.error(str2 + "  -> UnknownHostException: message=[" + unknownHostException + "].");
                    c3415a = new wc2.a.C3415a(unknownHostException, null, null, null, 14, null);
                    return c3415a;
                } catch (HttpException e26) {
                    e = e26;
                    str2 = str3;
                    logger.error(str2 + " -> server error response code=[" + e.code() + "] message=[" + e.message() + "].");
                    return new wc2.a.C3415a(new IOException("Error Occurred during getting safe Api result, " + str2 + ", ERROR [" + e + "]", e), new Integer(e.code()), null, null, 12, null);
                } catch (Throwable th4) {
                    th = th4;
                    str2 = str3;
                    logger.error(str2 + "  -> error message=[" + th + "].");
                    return new wc2.a.C3415a(new IOException("Error Occurred during getting safe Api result, " + str2 + ", ERROR [" + th + "]", th), null, null, null, 14, null);
                }
            }
            return (wc2.a) objInvoke;
        }
    }

    Object a(String str, c cVar, b bVar);

    String getTag();
}
