package t10;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import ch.qos.logback.core.CoreConstants;
import java.util.Arrays;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.x0;
import z6.q;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lt10/o;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f161710a;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f161711a;

        static {
            int[] iArr = new int[n.values().length];
            try {
                iArr[n.EDIT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[n.CREATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[n.FIND.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f161711a = iArr;
        }
    }

    public o(Context context) {
        context.getClass();
        this.f161710a = context;
    }

    public final void a(Intent intent, n nVar, String str) {
        String string;
        Context context = this.f161710a;
        PendingIntent activity = PendingIntent.getActivity(context, 0, intent, 201326592);
        activity.getClass();
        sz0.e eVar = sz0.e.F;
        int iCurrentTimeMillis = (int) System.currentTimeMillis();
        int i14 = nVar.f161706a;
        int i15 = nVar.f161707b;
        String string2 = context.getString(i14);
        string2.getClass();
        if (nVar != n.EDIT || str == null) {
            string = context.getString(i15);
            string.getClass();
        } else {
            x0 x0Var = x0.f105818a;
            String string3 = context.getString(i15);
            string3.getClass();
            string = String.format(string3, Arrays.copyOf(new Object[]{str}, 1));
        }
        q qVar = new q(context, eVar.f161386a);
        qVar.N.icon = 2131232010;
        qVar.f202683e = q.e(string2);
        qVar.f202684f = q.e(string);
        z6.o oVar = new z6.o();
        oVar.f202664e = q.e(string);
        qVar.l(oVar);
        qVar.f202691m = 1;
        qVar.f202686h = activity;
        qVar.i(16, true);
        Notification notificationC = qVar.c();
        notificationC.getClass();
        sz0.f.f161394a.getClass();
        sz0.f.a.f(context, notificationC, iCurrentTimeMillis, eVar);
    }
}
