package nm;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import java.util.List;
import o4.f0;
import p005kotlin.Metadata;
import p13.w;
import ps.h1;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lnm/e;", "Lnm/b;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lzm/p;", "mainChartData", "overlayChartData", "<init>", "(Landroid/content/Context;Lzm/p;Lzm/p;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e extends b {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(Context context, zm.p pVar, zm.p pVar2) {
        super(context, pVar, pVar2);
        context.getClass();
        pVar.getClass();
    }

    @Override // nm.b
    public final String a() {
        String string = this.f126526a.getString(R.string.lbl_time_h_m_s);
        string.getClass();
        return string;
    }

    @Override // nm.b
    public final i53.c b() {
        h1 h1Var = h1.DYN;
        Context context = this.f126526a;
        return i53.a.a(new j82.f(h1Var.a(context), new j82.g.a(f0.b(a7.b.getColor(context, R.color.gds_data_viz_blue_secondary)), null), null, 4, null), new j82.f(h1.STA.a(context), new j82.g.a(f0.b(a7.b.getColor(context, R.color.gds_data_viz_violet_primary)), null), null, 4, null), new j82.f(h1.REST.a(context), new j82.g.a(f0.b(a7.b.getColor(context, R.color.gds_data_viz_yellow_primary)), null), null, 4, null));
    }

    @Override // nm.b
    public final List<Integer> c() {
        return w.c(80);
    }

    @Override // nm.b
    public final boolean d() {
        return c().contains(Integer.valueOf(this.f126527b.g1()));
    }
}
