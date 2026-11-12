package od0;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.garmin.android.apps.connectmobile.device.setup.presentation.inreach.InReachSubscriptionPollingWorker;
import com.garmin.android.apps.connectmobile.settings.lte.cwsactivation.InReachLTEActivationRedirectActivity;
import com.garmin.proto.generated.GDIInReachMessaging;
import java.io.Serializable;
import java.util.List;
import o13.r;
import p005kotlin.Metadata;
import p13.h0;
import ui1.e;
import ui1.l;
import v13.c;
import vb.h;
import yx2.i;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lod0/b;", "Lm90/a;", "Lui1/l;", "inReachRepo", "<init>", "(Lui1/l;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b implements m90.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f131177a;

    public b(l lVar) {
        lVar.getClass();
        this.f131177a = lVar;
    }

    @Override // m90.a
    public final Serializable a(long j8, InReachSubscriptionPollingWorker.b bVar) {
        e eVarB = l.b(j8, "messagingSubscribeRequest");
        return eVarB == null ? null : eVarB.l(bVar);
    }

    @Override // m90.a
    public final Enum b(String str, InReachSubscriptionPollingWorker.b bVar) {
        return this.f131177a.l(str, bVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // m90.a
    public final Object c(long j8, c cVar) {
        a aVar;
        if (cVar instanceof a) {
            aVar = (a) cVar;
            int i14 = aVar.f131176c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                aVar.f131176c = i14 - Integer.MIN_VALUE;
            } else {
                aVar = new a(this, cVar);
            }
        } else {
            aVar = new a(this, cVar);
        }
        Object objA = aVar.f131174a;
        Object obj = u13.a.COROUTINE_SUSPENDED;
        int i15 = aVar.f131176c;
        if (i15 == 0) {
            r.b(objA);
            aVar.f131176c = 1;
            objA = this.f131177a.a(j8, aVar);
            if (objA == obj) {
                return obj;
            }
        } else {
            if (i15 != 1) {
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(objA);
        }
        List list = (List) objA;
        boolean zIsEmpty = list.isEmpty();
        i iVar = (i) h0.e0(0, list);
        Integer num = iVar != null ? new Integer(iVar.f200099l) : null;
        return new o90.b((zIsEmpty || num == null || num.intValue() <= 0) ? false : true, num != null ? num.intValue() : 0);
    }

    @Override // m90.a
    public final Object d(long j8, InReachSubscriptionPollingWorker.b bVar) {
        return this.f131177a.h(j8, bVar);
    }

    @Override // m90.a
    public final Object e(long j8, wa0.e eVar) {
        return this.f131177a.k(j8, eVar);
    }

    @Override // m90.a
    public final Serializable f(long j8, InReachSubscriptionPollingWorker.b bVar) {
        GDIInReachMessaging.ActivationMethod activationMethod = GDIInReachMessaging.ActivationMethod.ACTIVATION_METHOD_BACKGROUND;
        e eVarB = l.b(j8, "startDeviceActivation");
        return eVarB == null ? null : eVarB.m(activationMethod, bVar);
    }

    @Override // m90.a
    public final Object g(long j8, wa0.e eVar) {
        return this.f131177a.i(j8, eVar);
    }

    @Override // m90.a
    public final PendingIntent h(Context context, long j8) {
        context.getClass();
        Intent intentA = InReachLTEActivationRedirectActivity.a.a(InReachLTEActivationRedirectActivity.f43507a, context, Long.valueOf(j8), 12);
        intentA.addFlags(335544320);
        PendingIntent activity = PendingIntent.getActivity(context, 0, intentA, 201326592);
        activity.getClass();
        return activity;
    }
}
