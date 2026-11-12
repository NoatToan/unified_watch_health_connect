package rt1;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import androidx.fragment.app.v;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.o1;
import i3.m8;
import java.util.List;
import l72.u;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
public final class n {

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"rt1/n$a", "Lcom/garmin/android/apps/connectmobile/o1$a;", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a implements o1.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.l<Boolean, Unit> f154549a;

        /* JADX WARN: Multi-variable type inference failed */
        public a(e23.l<? super Boolean, Unit> lVar) {
            this.f154549a = lVar;
        }

        @Override // com.garmin.android.apps.connectmobile.o1.a
        public final void a(boolean z14) {
            this.f154549a.invoke(Boolean.valueOf(z14));
        }
    }

    public static final Activity a(Context context) {
        context.getClass();
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (!(context instanceof ContextWrapper)) {
            return null;
        }
        Context baseContext = ((ContextWrapper) context).getBaseContext();
        baseContext.getClass();
        return a(baseContext);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0041  */
    /* JADX WARN: Code duplicated, block: B:47:0x0090  */
    /* JADX WARN: Code duplicated, block: B:49:0x0093  */
    /* JADX WARN: Code duplicated, block: B:50:0x009f  */
    /* JADX WARN: Code duplicated, block: B:53:0x00af  */
    /* JADX WARN: Code duplicated, block: B:54:0x00b3  */
    public static final void b(Context context, v vVar, j jVar, e23.q<? super Boolean, ? super Long, ? super String, Unit> qVar, e23.a<Unit> aVar) {
        boolean z14;
        String strR;
        Long l14;
        Long raceEventId;
        String shareableEventUuid;
        boolean z15;
        String string;
        int i14;
        fg0.k kVar;
        fg0.k kVar2;
        ww1.h hVar;
        ww1.h hVar2;
        context.getClass();
        String str = null;
        if (((jVar == null || (hVar2 = jVar.f154541a) == null) ? null : hVar2.getRaceEventId()) != null) {
            z14 = true;
        } else {
            if (((jVar == null || (hVar = jVar.f154541a) == null) ? null : hVar.getRaceEventUuid()) != null) {
                z14 = true;
            } else {
                if (((jVar == null || (kVar2 = jVar.f154542b) == null) ? null : kVar2.getCom.google.android.exoplayer2.text.ttml.TtmlNode.ATTR_ID java.lang.String()) != null) {
                    z14 = true;
                } else {
                    if (((jVar == null || (kVar = jVar.f154542b) == null) ? null : kVar.getShareableEventUuid()) != null) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                }
            }
        }
        fy1.i.f73924a.getClass();
        fy1.i.a.s(500L);
        if (!z14) {
            aVar.invoke();
            return;
        }
        if ((jVar != null ? jVar.f154541a : null) == null) {
            if ((jVar != null ? jVar.f154542b : null) != null) {
                fg0.k kVar3 = jVar.f154542b;
                raceEventId = kVar3.getCom.google.android.exoplayer2.text.ttml.TtmlNode.ATTR_ID java.lang.String();
                shareableEventUuid = kVar3.getShareableEventUuid();
                strR = kVar3.r(false);
            } else {
                a2 a2Var = a2.GENERAL;
                i2.f36769a.getClass();
                i2.a.e(a2Var, "Both raceDTO and eventDTO are null in linkedData.");
                strR = null;
                l14 = null;
            }
            z15 = str != null;
            if (z15) {
                string = context.getString(R.string.keep_training_plan_with_event_subscribed, strR);
            } else {
                string = context.getString(R.string.keep_training_plan_with_event_created, strR);
            }
            string.getClass();
            if (z15) {
                i14 = R.string.workout_remove_from_calendar;
            } else {
                i14 = R.string.delete_event;
            }
            d(context, vVar, string, i14, new rp.b(qVar, 4, l14, str));
        }
        ww1.h hVar3 = jVar.f154541a;
        raceEventId = hVar3.getRaceEventId();
        shareableEventUuid = hVar3.getRaceEventUuid();
        strR = hVar3.getRaceName();
        Long l15 = raceEventId;
        str = shareableEventUuid;
        l14 = l15;
        if (str != null) {
        }
        if (z15) {
            string = context.getString(R.string.keep_training_plan_with_event_subscribed, strR);
        } else {
            string = context.getString(R.string.keep_training_plan_with_event_created, strR);
        }
        string.getClass();
        if (z15) {
            i14 = R.string.workout_remove_from_calendar;
        } else {
            i14 = R.string.delete_event;
        }
        d(context, vVar, string, i14, new rp.b(qVar, 4, l14, str));
    }

    public static final void c(Context context, v vVar, ww1.a aVar, ww1.c cVar, ww1.b bVar, ww1.d dVar, List<ww1.e> list, e23.q<? super Long, ? super Boolean, ? super j, Unit> qVar, e23.a<Unit> aVar2) {
        context.getClass();
        list.getClass();
        if (aVar != null && cVar != null) {
            e(context, vVar, new m8(aVar2, 27));
            return;
        }
        if (!list.isEmpty()) {
            e(context, vVar, new jv0.c(cVar, aVar, bVar, dVar, new u(qVar, 3), 21));
            return;
        }
        jv0.c cVar2 = new jv0.c(cVar, aVar, bVar, dVar, new u(qVar, 2), 20);
        String string = context.getString(R.string.quit_active_plan_message);
        string.getClass();
        o1.b.a(o1.f39651c, R.string.quit_current_plan_question, string, R.string.atp_quit_plan, R.string.lbl_cancel, new p(cVar2), null, null, null, 448).show(vVar, "GCMFragTwoBtnVerticalAlertDialog");
    }

    public static final void d(Context context, v vVar, String str, int i14, e23.l<? super Boolean, Unit> lVar) {
        context.getClass();
        o1.b.a(o1.f39651c, R.string.keep_event_question, str, R.string.keep_my_event, i14, new a(lVar), null, null, null, 448).show(vVar, "GCMFragTwoBtnVerticalAlertDialog");
    }

    public static void e(Context context, v vVar, e23.l lVar) {
        String string = context.getString(R.string.quit_active_plans_message);
        string.getClass();
        o1.b.a(o1.f39651c, R.string.quit_current_plans_question, string, R.string.quit_all_plans, R.string.lbl_cancel, new o(lVar), null, null, null, 448).show(vVar, "GCMFragTwoBtnVerticalAlertDialog");
    }
}
