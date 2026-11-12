package s00;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.garmin.android.apps.connectmobile.i2;
import java.util.ArrayList;
import org.koin.java.KoinJavaComponent;

/* JADX INFO: loaded from: classes7.dex */
public abstract class j implements n00.d {
    public static PendingIntent c(Context context, Intent intent) {
        z6.h0 h0VarE = z6.h0.e(context);
        ArrayList<Intent> arrayList = h0VarE.f202637a;
        h0VarE.b(intent);
        for (int i14 = 0; i14 < arrayList.size(); i14++) {
            Intent intent2 = arrayList.get(i14);
            if (intent2 != null) {
                i2.d("BasePushNotificationHandler", "Constructing intent stack: " + intent2);
            }
        }
        return h0VarE.f();
    }

    public static void e(Context context, sz0.e eVar, int i14, String str, String str2, PendingIntent pendingIntent) {
        z6.q qVar = new z6.q(context, eVar.f161386a);
        qVar.N.icon = 2131232010;
        qVar.f202683e = z6.q.e(str);
        qVar.f202684f = z6.q.e(str2);
        qVar.f202686h = pendingIntent;
        z6.o oVar = new z6.o();
        oVar.f202664e = z6.q.e(str2);
        qVar.l(oVar);
        qVar.B = "social";
        qVar.i(16, true);
        qVar.f202691m = 0;
        qVar.E = 0;
        sz0.f.a(context, qVar.c(), i14, eVar);
    }

    public final int d(n00.c cVar) {
        ((n00.e) KoinJavaComponent.get(n00.e.class)).getClass();
        cVar.getClass();
        return cVar.ordinal() + 999;
    }
}
