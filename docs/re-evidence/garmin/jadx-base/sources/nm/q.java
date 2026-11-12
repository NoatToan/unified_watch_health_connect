package nm;

import am.z0;
import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import im.b0;
import java.util.List;
import o4.f0;
import p005kotlin.Metadata;
import p13.w;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lnm/q;", "Lnm/b;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lzm/p;", "mainChartData", "overlayChartData", "<init>", "(Landroid/content/Context;Lzm/p;Lzm/p;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class q extends b {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(Context context, zm.p pVar, zm.p pVar2) {
        super(context, pVar, pVar2);
        context.getClass();
        pVar.getClass();
    }

    @Override // nm.b
    public final i53.c<j82.f> b() {
        q13.b bVarB = w.b();
        zm.p pVar = this.f126527b;
        boolean zX = z0.X(pVar.getF113501k1());
        int i14 = !zX ? R.string.lbl_wakesports_run : R.string.activities_wave_label;
        Context context = this.f126526a;
        String string = context.getString(i14);
        string.getClass();
        bVarB.add(new j82.f(string, new j82.g.a(f0.b(a7.b.getColor(context, R.color.palette_blue_8)), null), null, 4, null));
        String string2 = context.getString(!zX ? R.string.activity_wakesports_run_distance_longest_run : R.string.activities_thumbnail_map_legend_longest_wave);
        string2.getClass();
        bVarB.add(new j82.f(string2, new j82.g.a(f0.b(a7.b.getColor(context, R.color.palette_red_9)), null), null, 4, null));
        b0 b0Var = pVar instanceof b0 ? (b0) pVar : null;
        if (b0Var != null && b0Var.A()) {
            String string3 = context.getString(R.string.allday_stress_unmeasurable);
            string3.getClass();
            bVarB.add(new j82.f(string3, new j82.g.c(f0.b(a7.b.getColor(context, R.color.white_alpha_75_percent)), null), null, 4, null));
        }
        return i53.a.e(w.a(bVarB));
    }

    @Override // nm.b
    public final List<Integer> c() {
        return w.c(49);
    }

    @Override // nm.b
    public final boolean d() {
        zm.p pVar = this.f126527b;
        return (pVar instanceof b0) && c().contains(Integer.valueOf(((b0) pVar).getF113498h1()));
    }
}
