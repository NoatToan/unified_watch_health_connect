package ns0;

import android.content.Context;
import aq.q1;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;
import r22.o0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lns0/a;", "", "<init>", "()V", "gcm-jet-lag_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f127811a = new a();

    private a() {
    }

    public static o0 a(Context context, boolean z14, e23.a aVar, e23.a aVar2) {
        l22.a aVar3 = new l22.a(context);
        String string = aVar3.getString(z14 ? R.string.lbl_jet_lag_end_trip_in_progress : R.string.lbl_delete_trip_question);
        String string2 = aVar3.getString(z14 ? R.string.msg_jet_lag_end_trip_in_progress : R.string.msg_jet_lag_delete_trip);
        int i14 = z14 ? R.string.lbl_end_trip : R.string.lbl_delete;
        o0.a aVar4 = o0.f149771c;
        q1 q1Var = new q1(aVar, 14);
        q1 q1Var2 = new q1(aVar2, 15);
        aVar4.getClass();
        return o0.a.a(string, string2, i14, q1Var, R.string.lbl_cancel, q1Var2);
    }
}
