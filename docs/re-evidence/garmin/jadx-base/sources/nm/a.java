package nm;

import am.z0;
import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import java.util.List;
import o4.f0;
import p005kotlin.Metadata;
import p13.x;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lnm/a;", "Lnm/b;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lzm/p;", "mainChartData", "overlayChartData", "<init>", "(Landroid/content/Context;Lzm/p;Lzm/p;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a extends b {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Context context, zm.p pVar, zm.p pVar2) {
        super(context, pVar, pVar2);
        context.getClass();
        pVar.getClass();
    }

    @Override // nm.b
    public final i53.c b() {
        Context context = this.f126526a;
        String string = context.getString(R.string.activities_ascent_label);
        string.getClass();
        j82.f fVar = new j82.f(string, new j82.g.a(f0.b(a7.b.getColor(context, R.color.gcm_polyline_activity_lap_ascent)), null), null, 4, null);
        String string2 = context.getString(R.string.activities_descent_label);
        string2.getClass();
        j82.f fVar2 = new j82.f(string2, new j82.g.a(f0.b(a7.b.getColor(context, R.color.gcm_polyline_activity_lap_descent)), null), null, 4, null);
        String string3 = context.getString(R.string.lbl_transition);
        string3.getClass();
        return i53.a.a(fVar, fVar2, new j82.f(string3, new j82.g.a(f0.b(a7.b.getColor(context, R.color.gcm3_stress_active)), null), null, 4, null));
    }

    @Override // nm.b
    public final List<Integer> c() {
        return x.k(2, 87);
    }

    @Override // nm.b
    public final boolean d() {
        List<Integer> listC = c();
        zm.p pVar = this.f126527b;
        return listC.contains(Integer.valueOf(pVar.g1())) && pVar.U2() && z0.o(pVar.U()) && this.f126528c == null;
    }
}
