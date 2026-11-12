package k9;

import android.content.Context;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: loaded from: classes.dex */
public final class c implements Handler.Callback, i.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f103411a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Handler f103412b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f103413c = new HashMap();

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final f f103414a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final g f103415b;

        public a(f fVar, g gVar) {
            this.f103414a = fVar;
            this.f103415b = gVar;
        }
    }

    public c(Context context, Looper looper) {
        this.f103411a = context;
        this.f103412b = new Handler(looper, this);
    }

    @Override // k9.i.a
    public final void a(i iVar) {
        Handler handler = this.f103412b;
        handler.sendMessage(handler.obtainMessage(1, iVar));
    }

    @Override // k9.i.a
    public final void b(i iVar, long j8) {
        Handler handler = this.f103412b;
        handler.sendMessageDelayed(handler.obtainMessage(2, iVar), j8);
    }

    public final void c(i iVar) {
        Handler handler = this.f103412b;
        handler.removeMessages(6, iVar);
        handler.sendMessageDelayed(handler.obtainMessage(6, iVar), 15000L);
    }

    public final i d(b bVar) {
        String strA = bVar.a();
        HashMap map = this.f103413c;
        i iVar = (i) map.get(strA);
        if (iVar != null) {
            return iVar;
        }
        i iVar2 = new i(this.f103411a, bVar, new d(), this);
        map.put(strA, iVar2);
        return iVar2;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        switch (message.what) {
            case 1:
                i iVar = (i) message.obj;
                HashMap map = iVar.f103423e;
                ConcurrentLinkedQueue concurrentLinkedQueue = iVar.f103420b;
                for (Map.Entry entry : map.entrySet()) {
                    Objects.toString(entry.getKey());
                    int i14 = l9.a.f111509a;
                    iVar.c((g) entry.getValue());
                }
                concurrentLinkedQueue.add(iVar.f103421c.f103410d);
                for (g gVar : new ArrayList(concurrentLinkedQueue)) {
                    if (concurrentLinkedQueue.remove(gVar)) {
                        iVar.c(gVar);
                    }
                }
                c(iVar);
                return true;
            case 2:
                i iVar2 = (i) message.obj;
                b bVar = iVar2.f103421c;
                if (iVar2.f103423e.isEmpty()) {
                    String str = bVar.f103408b;
                    int i15 = l9.a.f111509a;
                    return true;
                }
                iVar2.f103427i++;
                String str2 = bVar.f103408b;
                int i16 = l9.a.f111509a;
                iVar2.a();
                return true;
            case 3:
                g gVar2 = (g) message.obj;
                i iVarD = d(gVar2.a());
                iVarD.b(gVar2);
                c(iVarD);
                return true;
            case 4:
                a aVar = (a) message.obj;
                i iVarD2 = d(aVar.f103415b.a());
                f fVar = aVar.f103414a;
                g gVar3 = aVar.f103415b;
                iVarD2.f103423e.put(fVar, gVar3);
                IBinder iBinder = iVarD2.f103425g;
                if (iBinder == null || !iBinder.isBinderAlive()) {
                    iVarD2.a();
                } else {
                    iVarD2.b(gVar3);
                }
                c(iVarD2);
                return true;
            case 5:
                a aVar2 = (a) message.obj;
                i iVarD3 = d(aVar2.f103415b.a());
                f fVar2 = aVar2.f103414a;
                g gVar4 = aVar2.f103415b;
                iVarD3.f103423e.remove(fVar2);
                iVarD3.b(gVar4);
                c(iVarD3);
                return true;
            case 6:
                i iVar3 = (i) message.obj;
                Handler handler = this.f103412b;
                if (!handler.hasMessages(3) && !handler.hasMessages(4) && !handler.hasMessages(5)) {
                    if (iVar3.f103420b.isEmpty() && iVar3.f103423e.isEmpty()) {
                        iVar3.e();
                        return true;
                    }
                    c(iVar3);
                }
                return true;
            default:
                return false;
        }
    }
}
