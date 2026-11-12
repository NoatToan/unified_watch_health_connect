package em1;

import android.content.Context;
import com.garmin.android.apps.connectmobile.R;
import java.util.List;
import p005kotlin.Metadata;
import p13.w;
import p13.x;
import rl1.i;
import xz.g;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lem1/f;", "", "<init>", "()V", "gcm-charts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f64626a = new f();

    private f() {
    }

    public static List a(Context context, i iVar, boolean z14) {
        iVar.getClass();
        c cVar = new c(new l22.a(context));
        if (!z14) {
            return w.c(new xz.f(cVar.a(iVar), null, Integer.valueOf(a7.b.getColor(context, R.color.transparent)), null, g.a.f192745a, null, null, 106, null));
        }
        int color = a7.b.getColor(context, R.color.gcm_chart_default_data_set);
        if (iVar != i.AWAKE_RESTLESSNESS) {
            return w.c(new xz.f(cVar.a(iVar), null, Integer.valueOf(color), null, new g.e(0.0f, 1, null), null, null, 106, null));
        }
        String string = context.getString(R.string.sleep_lbl_awake);
        string.getClass();
        return x.k(new xz.f(string, null, Integer.valueOf(a7.b.getColor(context, R.color.gcm_sleep_chart_levels_awake)), null, g.a.f192745a, null, null, 106, null), new xz.f(cVar.a(iVar), null, Integer.valueOf(color), null, new g.e(0.0f, 1, null), null, null, 106, null));
    }
}
