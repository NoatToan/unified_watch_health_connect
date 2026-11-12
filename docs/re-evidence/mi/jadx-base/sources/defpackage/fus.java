package defpackage;

import com.xiaomi.push.fs;
import com.xiaomi.push.ha;
import java.net.UnknownHostException;

/* JADX INFO: loaded from: classes11.dex */
public final class fus {

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public fs f18270a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f18271b;
    }

    public static a a(Exception exc) {
        b(exc);
        boolean z = exc instanceof ha;
        Throwable thA = exc;
        if (z) {
            ha haVar = (ha) exc;
            if (haVar.a() != null) {
                thA = exc;
                thA = haVar.a();
            }
        }
        thA = exc;
        a aVar = new a();
        String message = thA.getMessage();
        if (thA.getCause() != null) {
            message = thA.getCause().getMessage();
        }
        String str = thA.getClass().getSimpleName() + ":" + message;
        int iA = lws.a(thA);
        if (iA != 0) {
            aVar.f18270a = fs.a(fs.GSLB_REQUEST_SUCCESS.a() + iA);
        }
        if (aVar.f18270a == null) {
            aVar.f18270a = fs.GSLB_TCP_ERR_OTHER;
        }
        if (aVar.f18270a == fs.GSLB_TCP_ERR_OTHER) {
            aVar.f18271b = str;
        }
        return aVar;
    }

    public static void b(Exception exc) {
        exc.getClass();
    }

    public static a c(Exception exc) {
        Throwable cause;
        b(exc);
        boolean z = exc instanceof ha;
        Throwable thA = exc;
        if (z) {
            ha haVar = (ha) exc;
            if (haVar.a() != null) {
                thA = exc;
                thA = haVar.a();
            }
        }
        thA = exc;
        a aVar = new a();
        String message = thA.getMessage();
        if (thA.getCause() != null) {
            message = thA.getCause().getMessage();
        }
        int iA = lws.a(thA);
        String str = thA.getClass().getSimpleName() + ":" + message;
        if (iA != 0) {
            fs fsVarA = fs.a(fs.CONN_SUCCESS.a() + iA);
            aVar.f18270a = fsVarA;
            if (fsVarA == fs.CONN_BOSH_ERR && (cause = thA.getCause()) != null && (cause instanceof UnknownHostException)) {
                aVar.f18270a = fs.CONN_BOSH_UNKNOWNHOST;
            }
        } else {
            aVar.f18270a = fs.CONN_XMPP_ERR;
        }
        fs fsVar = aVar.f18270a;
        if (fsVar == fs.CONN_TCP_ERR_OTHER || fsVar == fs.CONN_XMPP_ERR || fsVar == fs.CONN_BOSH_ERR) {
            aVar.f18271b = str;
        }
        return aVar;
    }

    public static a d(Exception exc) {
        b(exc);
        boolean z = exc instanceof ha;
        Throwable thA = exc;
        if (z) {
            ha haVar = (ha) exc;
            if (haVar.a() != null) {
                thA = exc;
                thA = haVar.a();
            }
        }
        thA = exc;
        a aVar = new a();
        String message = thA.getMessage();
        if (thA.getCause() != null) {
            message = thA.getCause().getMessage();
        }
        int iA = lws.a(thA);
        String str = thA.getClass().getSimpleName() + ":" + message;
        if (iA == 105) {
            aVar.f18270a = fs.BIND_TCP_READ_TIMEOUT;
        } else if (iA == 199) {
            aVar.f18270a = fs.BIND_TCP_ERR;
        } else if (iA == 499) {
            aVar.f18270a = fs.BIND_BOSH_ERR;
            if (message.startsWith("Terminal binding condition encountered: item-not-found")) {
                aVar.f18270a = fs.BIND_BOSH_ITEM_NOT_FOUND;
            }
        } else if (iA == 109) {
            aVar.f18270a = fs.BIND_TCP_CONNRESET;
        } else if (iA != 110) {
            aVar.f18270a = fs.BIND_XMPP_ERR;
        } else {
            aVar.f18270a = fs.BIND_TCP_BROKEN_PIPE;
        }
        fs fsVar = aVar.f18270a;
        if (fsVar == fs.BIND_TCP_ERR || fsVar == fs.BIND_XMPP_ERR || fsVar == fs.BIND_BOSH_ERR) {
            aVar.f18271b = str;
        }
        return aVar;
    }

    public static a e(Exception exc) {
        b(exc);
        boolean z = exc instanceof ha;
        Throwable thA = exc;
        if (z) {
            ha haVar = (ha) exc;
            if (haVar.a() != null) {
                thA = exc;
                thA = haVar.a();
            }
        }
        thA = exc;
        a aVar = new a();
        String message = thA.getMessage();
        int iA = lws.a(thA);
        String str = thA.getClass().getSimpleName() + ":" + message;
        if (iA == 105) {
            aVar.f18270a = fs.CHANNEL_TCP_READTIMEOUT;
        } else if (iA == 199) {
            aVar.f18270a = fs.CHANNEL_TCP_ERR;
        } else if (iA == 499) {
            aVar.f18270a = fs.CHANNEL_BOSH_EXCEPTION;
            if (message.startsWith("Terminal binding condition encountered: item-not-found")) {
                aVar.f18270a = fs.CHANNEL_BOSH_ITEMNOTFIND;
            }
        } else if (iA == 109) {
            aVar.f18270a = fs.CHANNEL_TCP_CONNRESET;
        } else if (iA != 110) {
            aVar.f18270a = fs.CHANNEL_XMPPEXCEPTION;
        } else {
            aVar.f18270a = fs.CHANNEL_TCP_BROKEN_PIPE;
        }
        fs fsVar = aVar.f18270a;
        if (fsVar == fs.CHANNEL_TCP_ERR || fsVar == fs.CHANNEL_XMPPEXCEPTION || fsVar == fs.CHANNEL_BOSH_EXCEPTION) {
            aVar.f18271b = str;
        }
        return aVar;
    }
}
