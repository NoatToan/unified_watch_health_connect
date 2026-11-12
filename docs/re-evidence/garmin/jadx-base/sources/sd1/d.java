package sd1;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.reminders.network.RemindersNetwork;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lsd1/d;", "Lcom/garmin/android/library/backgroundtaskmanagement/b$a;", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d implements com.garmin.android.library.backgroundtaskmanagement.b.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ RemindersNetwork f158624a;

    public d(RemindersNetwork remindersNetwork) {
        this.f158624a = remindersNetwork;
    }

    @Override // com.garmin.android.library.backgroundtaskmanagement.b.a
    public final void E(com.garmin.android.library.backgroundtaskmanagement.b<?> bVar) {
        a2 a2Var = a2.USER_REMINDERS;
        String strN = fb1.c.n("onComplete: ", bVar.f().name());
        i2.f36769a.getClass();
        i2.a.b(a2Var, "RemindersNetwork", strN);
    }

    @Override // com.garmin.android.library.backgroundtaskmanagement.b.a
    public final void J(com.garmin.android.library.backgroundtaskmanagement.b<?> bVar, com.garmin.android.library.backgroundtaskmanagement.b.e eVar, Object obj) {
        bVar.getClass();
        eVar.getClass();
        obj.getClass();
        if (obj instanceof pd1.c) {
            a2 a2Var = a2.USER_REMINDERS;
            i2.f36769a.getClass();
            i2.a.b(a2Var, "RemindersNetwork", "onResults: data IS of correct type");
            this.f158624a.e((pd1.c) obj);
        }
    }
}
