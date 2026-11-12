package gt;

import android.content.Context;
import com.github.mikephil.charting.charts.Chart;
import com.github.mikephil.charting.components.Legend;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u0013\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lgt/f;", "Lqz/f;", "Lcom/github/mikephil/charting/charts/Chart;", "chart", "<init>", "(Lcom/github/mikephil/charting/charts/Chart;)V", "a", "gcm-domain-wellness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class f implements qz.f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Chart<?> f78915b;

    static {
        new a(null);
    }

    public f(Chart<?> chart) {
        chart.getClass();
        this.f78915b = chart;
    }

    @Override // qz.f
    public final void a(List<xz.f> list) {
        Legend f31342c = this.f78915b.getF31342c();
        if (f31342c != null) {
            f31342c.setCustom(list != null ? xz.b.a(list) : null);
        }
    }

    @Override // qz.f
    public final Legend b() {
        Legend legend = new Legend();
        legend.setEnabled(true);
        legend.setHorizontalAlignment(Legend.LegendHorizontalAlignment.CENTER);
        Context context = this.f78915b.getContext();
        qz.f.f148595a.getClass();
        legend.setTextColor(a7.b.getColor(context, qz.f.a.f148597b));
        legend.setTextSize(12.0f);
        legend.setFormSize(16.0f);
        legend.setXEntrySpace(17.0f);
        legend.setWordWrapEnabled(true);
        return legend;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lgt/f$a;", "", "<init>", "()V", "", "LEGEND_X_ENTRY_SPACE", "F", "gcm-domain-wellness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
