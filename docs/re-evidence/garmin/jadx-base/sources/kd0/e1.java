package kd0;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.livetrackui.presentation.LiveTrackActivity;
import com.garmin.android.apps.connectmobile.settings.GCMSettingManager;
import com.garmin.android.apps.connectmobile.settings.lte.cwsactivation.InReachLTEActivationRedirectActivity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lkd0/e1;", "Lwd2/a;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e1 implements wd2.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f104039a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public wd2.y1 f104040b;

    public e1(Context context) {
        context.getClass();
        this.f104039a = context;
    }

    @Override // wd2.a
    public final void a(Context context) {
        context.getClass();
        context.startActivity(InReachLTEActivationRedirectActivity.a.a(InReachLTEActivationRedirectActivity.f43507a, context, null, 4));
    }

    @Override // wd2.a
    public final Object b(wd2.j0 j0Var) throws Throwable {
        o53.k kVar = new o53.k(u13.f.b(j0Var), 1);
        kVar.q();
        qw0.b.a aVar = qw0.b.f148296j;
        String str = com.garmin.android.apps.connectmobile.a2.LIVETRACK.f28756a;
        d1 d1Var = new d1(kVar);
        aVar.getClass();
        qw0.b.a.a(this.f104039a, str, d1Var);
        Object objP = kVar.p();
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        return objP;
    }

    @Override // wd2.a
    public final void c(Activity activity) {
        Uri uri = Uri.parse(GCMSettingManager.k().i().concat("/search/shopResults.faces?site=Shop&filter=0&client=garmin_fe&contentType=Shop&q=LiveTrack+compatible"));
        uri.getClass();
        g22.a.c(activity, uri);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(v13.c cVar) {
        c1 c1Var;
        ArrayList arrayList;
        if (cVar instanceof c1) {
            c1Var = (c1) cVar;
            int i14 = c1Var.f104013c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                c1Var.f104013c = i14 - Integer.MIN_VALUE;
            } else {
                c1Var = new c1(this, cVar);
            }
        } else {
            c1Var = new c1(this, cVar);
        }
        Object objF = c1Var.f104011a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = c1Var.f104013c;
        if (i15 == 0) {
            o13.r.b(objF);
            ui1.o0.f171346d.getClass();
            ui1.o0 o0VarA = ui1.o0.a.a();
            c1Var.f104013c = 1;
            objF = o0VarA.f(null, c1Var);
            if (objF == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objF);
        }
        com.garmin.android.apps.connectmobile.v2 v2Var = (com.garmin.android.apps.connectmobile.v2) objF;
        if (!(v2Var instanceof com.garmin.android.apps.connectmobile.v2.b)) {
            return null;
        }
        Iterable iterable = (Iterable) ((com.garmin.android.apps.connectmobile.v2.b) v2Var).f47386a;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : iterable) {
            if (((ui1.z0) obj).d()) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            List<ui1.a> listA = ((ui1.z0) it.next()).a();
            if (listA != null) {
                arrayList = new ArrayList();
                Iterator<T> it3 = listA.iterator();
                while (it3.hasNext()) {
                    String unitId = ((ui1.a) it3.next()).getUnitId();
                    if (unitId != null) {
                        arrayList.add(unitId);
                    }
                }
            } else {
                arrayList = null;
            }
            if (arrayList != null) {
                arrayList3.add(arrayList);
            }
        }
        return p13.h0.b1(p13.h0.f1(p13.y.s(arrayList3)));
    }

    public final wd2.y1 e() {
        if (this.f104040b == null) {
            Context context = this.f104039a;
            l22.a aVar = new l22.a(context);
            String string = context.getString(R.string.live_track_in_progress_notification_bar_title);
            string.getClass();
            Intent intent = new Intent(context, (Class<?>) LiveTrackActivity.class);
            intent.setFlags(335544320);
            PendingIntent activity = PendingIntent.getActivity(context, 0, intent, 335544320);
            activity.getClass();
            sz0.e eVar = sz0.e.f161376o;
            this.f104040b = new wd2.y1(string, 2131232012, activity, eVar.f161386a, eVar.b(aVar), eVar.a(aVar));
        }
        wd2.y1 y1Var = this.f104040b;
        y1Var.getClass();
        return y1Var;
    }

    public final Context f() {
        Context applicationContext = this.f104039a.getApplicationContext();
        applicationContext.getClass();
        return applicationContext;
    }

    public final String g() {
        String string = this.f104039a.getString(R.string.lbl_shared_livetrack);
        string.getClass();
        return string;
    }

    public final boolean h(long j8) {
        Context contextF = f();
        if (!cu0.g.c(j8)) {
            return false;
        }
        f12.l.f68084a.getClass();
        return f12.l.a.a().o2() && new hu0.b(contextF).a().getIsLiveTrackON();
    }
}
