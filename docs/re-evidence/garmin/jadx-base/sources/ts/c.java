package ts;

import androidx.room.a0;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import d53.w;
import f12.l;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p13.h0;
import p13.j0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lts/c;", "Lts/b;", "Lf12/l;", "userSettings", "<init>", "(Lf12/l;)V", "a", "gcm-activity-recording_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f166189a;

    static {
        new a(null);
    }

    public c(l lVar) {
        lVar.getClass();
        this.f166189a = lVar;
    }

    @Override // ts.b
    public final void a() {
        this.f166189a.O2("activity_recording_genesis_screen_key", false);
    }

    @Override // ts.b
    public final void b(String str) {
        str.getClass();
        Set<String> setC = c();
        ArrayList arrayListD1 = h0.d1(setC);
        if (setC.contains(str)) {
            arrayListD1.remove(str);
        }
        arrayListD1.add(0, str);
        if (arrayListD1.size() == 4) {
            arrayListD1.remove(3);
        }
        String strK0 = h0.k0(arrayListD1, ",", null, null, null, 62);
        a2 a2Var = a2.ACTIVITY_RECORDING;
        String strJ = a0.j("updateRecentlyRecordedActivityType ", str, " -> new list ", strK0);
        i2.f36769a.getClass();
        i2.a.b(a2Var, "ActivityRecordingPreferences", strJ);
        this.f166189a.S("activity_recording_recent_sports", strK0);
    }

    @Override // ts.b
    public final Set<String> c() {
        String strA4 = this.f166189a.A4("activity_recording_recent_sports", null);
        List listW = strA4 != null ? w.W(strA4, new String[]{","}) : null;
        if (listW == null) {
            listW = j0.f134944a;
        }
        return h0.g1(listW);
    }

    @Override // ts.b
    public final boolean d() {
        return this.f166189a.W2("activity_recording_genesis_screen_key", true);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lts/c$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "ACTIVITY_RECORDING_RECENT_SPORTS_KEY", "ACTIVITY_RECORDING_GENESIS_SCREEN_KEY", "gcm-activity-recording_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
