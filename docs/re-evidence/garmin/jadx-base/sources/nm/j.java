package nm;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import im.b0;
import java.util.List;
import o4.f0;
import p005kotlin.Metadata;
import p13.x;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lnm/j;", "Lnm/b;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lzm/p;", "mainChartData", "overlayChartData", "", "hasComparisonTargetData", "<init>", "(Landroid/content/Context;Lzm/p;Lzm/p;Z)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class j extends b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f126541e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(Context context, zm.p pVar, zm.p pVar2, boolean z14) {
        super(context, pVar, pVar2);
        context.getClass();
        pVar.getClass();
        this.f126541e = z14;
    }

    @Override // nm.b
    public final i53.c b() {
        Context context = this.f126526a;
        String string = context.getString(R.string.lbl_actual_power);
        string.getClass();
        j82.f fVar = new j82.f(string, new j82.g.a(f0.b(a7.b.getColor(context, R.color.palette_berry_4)), null), null, 4, null);
        String string2 = context.getString(R.string.power_target_title);
        string2.getClass();
        return i53.a.a(fVar, new j82.f(string2, new j82.g.l(f0.b(a7.b.getColor(context, R.color.gcm_chart_legend_pacepro_power_color)), null), null, 4, null));
    }

    @Override // nm.b
    public final List<Integer> c() {
        return x.k(81, 5, 57, 61, 62, 63);
    }

    @Override // nm.b
    public final boolean d() {
        zm.p pVar = this.f126527b;
        return !(pVar instanceof b0) && c().contains(Integer.valueOf(pVar.g1())) && this.f126541e && this.f126528c == null;
    }
}
