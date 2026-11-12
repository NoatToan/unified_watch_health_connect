package zo0;

import android.content.SharedPreferences;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r22.m0;
import r22.v0;
import yr.o0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lzo0/u;", "Lzo0/p;", "Lzo0/q;", "navigator", "<init>", "(Lzo0/q;)V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class u implements p {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f206196c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f206197a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o13.t f206198b;

    static {
        new a(null);
    }

    public u(q qVar) {
        qVar.getClass();
        this.f206197a = qVar;
        this.f206198b = o13.m.b(new o0(this, 23));
    }

    @Override // zo0.p
    public final v0 b(n nVar) {
        if (!(nVar instanceof n.h)) {
            return null;
        }
        a2 a2Var = a2.TRAINING_INITIATIVE;
        i2.f36769a.getClass();
        i2.a.b(a2Var, "OnboardingRaceEventSearchDialogHandler", "showRaceEventSearchDialog: creating dialog");
        xp0.d dVar = new xp0.d(this, 26);
        do1.l lVar = new do1.l(3);
        m0.a aVar = m0.f149759e;
        q qVar = this.f206197a;
        return m0.a.e(aVar, 2131233268, qVar.u5().getString(R.string.find_event_promotional_title), qVar.u5().getString(R.string.find_event_promotional_message), R.string.find_a_race, dVar, R.string.not_now_lbl, lVar, 128);
    }

    @Override // zo0.p
    public final Object c(t13.d<? super n> dVar) {
        boolean z14 = ((SharedPreferences) this.f206198b.getValue()).getBoolean("KeyEventSearchOnBoardingAlert", true);
        boolean zE0 = bo1.a.a().c().E0();
        if (z14 && zE0) {
            return n.h.f206179a;
        }
        return null;
    }

    @Override // zo0.p
    public final Unit d(n nVar) {
        SharedPreferences sharedPreferences = (SharedPreferences) this.f206198b.getValue();
        sharedPreferences.getClass();
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        editorEdit.putBoolean("KeyEventSearchOnBoardingAlert", false);
        editorEdit.apply();
        return Unit.INSTANCE;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lzo0/u$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "EVENT_SEARCH_ON_BOARDING_ALERT", "EVENT_SEARCH_ON_BOARDING_SETTINGS", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
