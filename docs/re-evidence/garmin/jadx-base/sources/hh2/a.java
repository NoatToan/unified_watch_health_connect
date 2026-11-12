package hh2;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Handler;
import android.os.Message;
import j20.x;
import java.util.HashMap;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class a implements Handler.Callback {
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        b.a aVar;
        HashMap<String, b.a> map = b.f83753g;
        message.getClass();
        if (message.what != 1) {
            return false;
        }
        Object obj = message.obj;
        if (obj == null) {
            x.l("null cannot be cast to non-null type android.content.Intent");
            return false;
        }
        ComponentName component = ((Intent) obj).getComponent();
        if (component == null) {
            return true;
        }
        int i14 = message.arg1;
        if (i14 == 0) {
            b.a aVar2 = map.get(component.getClassName());
            if (aVar2 != null) {
                aVar2.d();
            }
        } else if (i14 == 1) {
            b.a aVar3 = map.get(component.getClassName());
            if (aVar3 != null) {
                aVar3.a();
            }
        } else if (i14 == 2 && (aVar = map.get(component.getClassName())) != null) {
            aVar.b();
        }
        map.remove(component.getClassName());
        return true;
    }
}
