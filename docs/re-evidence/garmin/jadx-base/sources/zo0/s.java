package zo0;

import android.content.SharedPreferences;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r22.m0;
import r22.v0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lzo0/s;", "Lzo0/p;", "Lzo0/q;", "navigator", "<init>", "(Lzo0/q;)V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class s implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f206195a;

    static {
        new a(null);
    }

    public s(q qVar) {
        qVar.getClass();
        this.f206195a = qVar;
    }

    @Override // zo0.p
    public final v0 b(n nVar) {
        m0.a aVar = m0.f149759e;
        q qVar = this.f206195a;
        return m0.a.e(aVar, 2131231747, qVar.u5().getString(R.string.pregnancy_ready_to_start_tracking), qVar.u5().getString(R.string.pregnancy_track_mct_message), R.string.gcm_body_battery_popover_get_started_button, new xp0.d(this, 25), R.string.feedback_no_thanks_btn, null, 192);
    }

    @Override // zo0.p
    public final Object c(t13.d<? super n> dVar) {
        SharedPreferences sharedPreferences = i52.a.f91797b;
        i52.a aVar = i52.a.f91796a;
        aVar.getClass();
        long j8 = sharedPreferences.getLong(i52.a.c(R.string.key_inactive_report_timestamp), -1L);
        String strF = androidx.room.a0.f(j8, "requestDialogData inactiveTimestamp[", "]");
        i2.a aVar2 = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar2.getClass();
        i2.a.b(a2Var, "MCTResumeDialogHandler", strF);
        if (j8 == -1) {
            return null;
        }
        boolean zIsBeforeNow = new DateTime(j8).plusWeeks(4).isBeforeNow();
        aVar.getClass();
        boolean z14 = i52.a.l() == ww0.a.INACTIVE;
        boolean z15 = sharedPreferences.getBoolean(i52.a.c(R.string.key_has_user_seen_myday_resume_dialog), false);
        StringBuilder sbM = com.airbnb.lottie.animation.keyframe.a.m("requestDialogData weeksPassed[", "] cycleTypeNotInactive[", "] userSeenMctResumeDialog[", zIsBeforeNow, z14);
        sbM.append(z15);
        sbM.append("]");
        i2.a.b(a2Var, "MCTResumeDialogHandler", sbM.toString());
        if (z14 && zIsBeforeNow && !z15) {
            return n.f.f206176a;
        }
        return null;
    }

    @Override // zo0.p
    public final Unit d(n nVar) {
        i52.a.f91796a.getClass();
        i52.a.f91797b.edit().putBoolean(i52.a.c(R.string.key_has_user_seen_myday_resume_dialog), true).apply();
        return Unit.INSTANCE;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lzo0/s$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
