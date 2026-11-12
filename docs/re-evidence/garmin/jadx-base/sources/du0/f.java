package du0;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.liveeventsharing.ui.LiveEventSharingActivity;
import e23.p;
import g22.k;
import java.util.List;
import o13.r;
import o13.t;
import o53.b0;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import v13.i;
import z6.o;
import z6.q;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.liveeventsharing.commands.StopEventSharingCommand$execute$1", f = "StopEventSharingCommand.kt", l = {50, 51}, m = "invokeSuspend", v = 2)
public final class f extends i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public gu0.b f61243a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f61244b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f61245c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e f61246d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(e eVar, t13.d<? super f> dVar) {
        super(2, dVar);
        this.f61246d = eVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        f fVar = new f(this.f61246d, dVar);
        fVar.f61245c = obj;
        return fVar;
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((f) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:26:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:28:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:29:0x00db  */
    /* JADX WARN: Code duplicated, block: B:31:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:32:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:34:0x0112  */
    /* JADX WARN: Code duplicated, block: B:35:0x011e  */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        gu0.b bVar;
        Context context;
        DateTime dateTime;
        String string;
        String string2;
        List<ju0.c> list;
        b0 b0Var = (b0) this.f61245c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f61244b;
        e eVar = this.f61246d;
        if (i14 == 0) {
            r.b(obj);
            a2 a2Var = a2.LIVE_EVENT_SHARING;
            i2.f36769a.getClass();
            i2.a.b(a2Var, "DistanceEventSharingCommand", "execute():");
            ju0.e eVar2 = (ju0.e) eVar.f61241e.getValue();
            long j8 = eVar.f61238b;
            this.f61245c = b0Var;
            this.f61244b = 1;
            ju0.e.a aVar2 = ju0.e.f100881g;
            obj = eVar2.a(j8, this, false);
            if (obj != aVar) {
            }
            return aVar;
        }
        if (i14 == 1) {
            r.b(obj);
        } else {
            if (i14 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            bVar = this.f61243a;
            r.b(obj);
        }
        List list2 = (List) obj;
        t tVar = eVar.f61241e;
        context = eVar.f61237a;
        ((fu0.e) ((ju0.e) tVar.getValue()).f100886e.getValue()).a(eVar.f61238b);
        if (bVar == null && (list = bVar.f79040e) != null && list.contains(ju0.c.END)) {
            a2 a2Var2 = a2.LIVE_EVENT_SHARING;
            i2.f36769a.getClass();
            i2.a.b(a2Var2, "StopEventSharingCommand", "Message End has been selected, sending text message");
            lu0.b bVar2 = new lu0.b(context);
            bVar2.f114956c = eVar.f61239c.getTotalTime();
            bVar2.e(lu0.c.STOP);
            eVar.f61240d.a(bVar2.a(), list2);
        } else {
            a2 a2Var3 = a2.LIVE_EVENT_SHARING;
            i2.f36769a.getClass();
            i2.a.b(a2Var3, "StartEventSharingCommand", "Message End is not selected, text message for STOP will not be sent.");
        }
        if ((bVar != null ? bVar.f79038c : null) == null) {
            a2 a2Var4 = a2.LIVE_EVENT_SHARING;
            i2.f36769a.getClass();
            i2.a.b(a2Var4, "StopEventSharingCommand", "The end time is null, we shouldn't be here.");
        } else {
            dateTime = new DateTime(bVar.f79038c.longValue());
            if (dateTime.isBeforeNow()) {
                a2 a2Var5 = a2.LIVE_EVENT_SHARING;
                i2.f36769a.getClass();
                i2.a.b(a2Var5, "StopEventSharingCommand", "The end-time stamp has expired. Nothing to show the user.");
            } else {
                a2 a2Var6 = a2.LIVE_EVENT_SHARING;
                i2.f36769a.getClass();
                i2.a.b(a2Var6, "StopEventSharingCommand", "Sending push notification to the user...");
                string = dateTime.toString("h:mm a");
                if (k.k(dateTime)) {
                    string2 = context.getString(R.string.live_event_sharing_notification_reminder_description_today, string);
                } else {
                    string2 = context.getString(R.string.live_event_sharing_notification_reminder_description_tomorrow, string);
                }
                string2.getClass();
                Intent intent = new Intent(context, (Class<?>) LiveEventSharingActivity.class);
                intent.setFlags(536870912);
                sz0.e eVar3 = sz0.e.f161383x;
                q qVar = new q(context, eVar3.f161386a);
                qVar.N.icon = 2131232010;
                qVar.f202683e = q.e(context.getString(R.string.live_event_sharing_title));
                qVar.f202684f = q.e(string2);
                qVar.i(16, true);
                qVar.B = "service";
                qVar.f202691m = 0;
                qVar.D = a7.b.getColor(context, R.color.gcm_text_primary_action);
                o oVar = new o();
                oVar.f202664e = q.e(string2);
                qVar.l(oVar);
                qVar.f202686h = PendingIntent.getActivity(context, 0, intent, 1140850688);
                Notification notificationC = qVar.c();
                notificationC.getClass();
                sz0.f.f161394a.getClass();
                sz0.f.a.f(context, notificationC, 26, eVar3);
            }
        }
        return Unit.INSTANCE;
        gu0.b bVar3 = (gu0.b) obj;
        ju0.e eVar4 = (ju0.e) eVar.f61241e.getValue();
        this.f61245c = b0Var;
        this.f61243a = bVar3;
        this.f61244b = 2;
        ju0.e.a aVar3 = ju0.e.f100881g;
        Object objB = eVar4.b(false, this);
        if (objB != aVar) {
            bVar = bVar3;
            obj = objB;
            List list3 = (List) obj;
            t tVar2 = eVar.f61241e;
            context = eVar.f61237a;
            ((fu0.e) ((ju0.e) tVar2.getValue()).f100886e.getValue()).a(eVar.f61238b);
            if (bVar == null) {
                a2 a2Var7 = a2.LIVE_EVENT_SHARING;
                i2.f36769a.getClass();
                i2.a.b(a2Var7, "StartEventSharingCommand", "Message End is not selected, text message for STOP will not be sent.");
            } else {
                a2 a2Var8 = a2.LIVE_EVENT_SHARING;
                i2.f36769a.getClass();
                i2.a.b(a2Var8, "StartEventSharingCommand", "Message End is not selected, text message for STOP will not be sent.");
            }
            if ((bVar != null ? bVar.f79038c : null) == null) {
                a2 a2Var9 = a2.LIVE_EVENT_SHARING;
                i2.f36769a.getClass();
                i2.a.b(a2Var9, "StopEventSharingCommand", "The end time is null, we shouldn't be here.");
            } else {
                dateTime = new DateTime(bVar.f79038c.longValue());
                if (dateTime.isBeforeNow()) {
                    a2 a2Var10 = a2.LIVE_EVENT_SHARING;
                    i2.f36769a.getClass();
                    i2.a.b(a2Var10, "StopEventSharingCommand", "The end-time stamp has expired. Nothing to show the user.");
                } else {
                    a2 a2Var11 = a2.LIVE_EVENT_SHARING;
                    i2.f36769a.getClass();
                    i2.a.b(a2Var11, "StopEventSharingCommand", "Sending push notification to the user...");
                    string = dateTime.toString("h:mm a");
                    if (k.k(dateTime)) {
                        string2 = context.getString(R.string.live_event_sharing_notification_reminder_description_today, string);
                    } else {
                        string2 = context.getString(R.string.live_event_sharing_notification_reminder_description_tomorrow, string);
                    }
                    string2.getClass();
                    Intent intent2 = new Intent(context, (Class<?>) LiveEventSharingActivity.class);
                    intent2.setFlags(536870912);
                    sz0.e eVar5 = sz0.e.f161383x;
                    q qVar2 = new q(context, eVar5.f161386a);
                    qVar2.N.icon = 2131232010;
                    qVar2.f202683e = q.e(context.getString(R.string.live_event_sharing_title));
                    qVar2.f202684f = q.e(string2);
                    qVar2.i(16, true);
                    qVar2.B = "service";
                    qVar2.f202691m = 0;
                    qVar2.D = a7.b.getColor(context, R.color.gcm_text_primary_action);
                    o oVar2 = new o();
                    oVar2.f202664e = q.e(string2);
                    qVar2.l(oVar2);
                    qVar2.f202686h = PendingIntent.getActivity(context, 0, intent2, 1140850688);
                    Notification notificationC2 = qVar2.c();
                    notificationC2.getClass();
                    sz0.f.f161394a.getClass();
                    sz0.f.a.f(context, notificationC2, 26, eVar5);
                }
            }
            return Unit.INSTANCE;
        }
        return aVar;
    }
}
