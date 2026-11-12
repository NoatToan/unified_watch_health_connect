package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public final class se4 implements Handler.Callback, eyl.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f33557a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Handler f33558b;
    public final Map<String, eyl> c = new HashMap();
    public boolean d;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final egi f33559a;

        public a(the theVar, egi egiVar) {
            this.f33559a = egiVar;
        }

        public the a() {
            return null;
        }

        public egi b() {
            return this.f33559a;
        }
    }

    public se4(Context context, Looper looper) {
        this.f33557a = context;
        this.f33558b = new Handler(looper, this);
    }

    @Override // eyl.a
    public boolean a() {
        return this.d;
    }

    @Override // eyl.a
    public void b(eyl eylVar) {
        Handler handler = this.f33558b;
        handler.sendMessage(handler.obtainMessage(1, eylVar));
    }

    @Override // eyl.a
    public void c(eyl eylVar, long j) {
        Handler handler = this.f33558b;
        handler.sendMessageDelayed(handler.obtainMessage(2, eylVar), j);
    }

    public void d(eyl eylVar) {
        this.f33558b.removeMessages(6, eylVar);
        Handler handler = this.f33558b;
        handler.sendMessageDelayed(handler.obtainMessage(6, eylVar), 15000L);
    }

    @VisibleForTesting
    public eyl e(re4 re4Var) {
        String strC = re4Var.c();
        eyl eylVar = this.c.get(strC);
        if (eylVar != null) {
            return eylVar;
        }
        eyl eylVar2 = new eyl(this.f33557a, re4Var, new vu5(), this);
        this.c.put(strC, eylVar2);
        return eylVar2;
    }

    public void f(the theVar, egi egiVar) {
        Handler handler = this.f33558b;
        handler.sendMessage(handler.obtainMessage(4, new a(theVar, egiVar)));
    }

    public void g(egi egiVar) {
        Handler handler = this.f33558b;
        handler.sendMessage(handler.obtainMessage(3, egiVar));
    }

    public void h(the theVar, egi egiVar) {
        Handler handler = this.f33558b;
        handler.sendMessage(handler.obtainMessage(5, new a(theVar, egiVar)));
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        switch (message.what) {
            case 1:
                eyl eylVar = (eyl) message.obj;
                eylVar.q();
                eylVar.r();
                eylVar.i();
                d(eylVar);
                return true;
            case 2:
                ((eyl) message.obj).p();
                return true;
            case 3:
                egi egiVar = (egi) message.obj;
                eyl eylVarE = e(egiVar.a());
                eylVarE.g(egiVar);
                d(eylVarE);
                return true;
            case 4:
                a aVar = (a) message.obj;
                eyl eylVarE2 = e(aVar.b().a());
                aVar.a();
                eylVarE2.s(null, aVar.b());
                d(eylVarE2);
                return true;
            case 5:
                a aVar2 = (a) message.obj;
                eyl eylVarE3 = e(aVar2.b().a());
                aVar2.a();
                eylVarE3.u(null, aVar2.b());
                d(eylVarE3);
                return true;
            case 6:
                eyl eylVar2 = (eyl) message.obj;
                if (!this.f33558b.hasMessages(3) && !this.f33558b.hasMessages(4) && !this.f33558b.hasMessages(5) && !eylVar2.e()) {
                    d(eylVar2);
                }
                return true;
            default:
                StringBuilder sb = new StringBuilder();
                sb.append("Received unknown message: ");
                sb.append(message.what);
                return false;
        }
    }
}
