package kx;

import android.content.Context;
import com.garmin.android.apps.connectmobile.charts.mpchart3.wrapper.CustomCombinedChart;
import com.github.mikephil.charting.components.Legend;
import com.github.mikephil.charting.components.LegendEntry;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lkx/d;", "Lqz/f;", "Lcom/garmin/android/apps/connectmobile/charts/mpchart3/wrapper/CustomCombinedChart;", "chart", "", "forceWordWrap", "<init>", "(Lcom/garmin/android/apps/connectmobile/charts/mpchart3/wrapper/CustomCombinedChart;Z)V", "a", "gcm-body-battery_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d implements qz.f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CustomCombinedChart f107012b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f107013c;

    static {
        new a(null);
        int i14 = CustomCombinedChart.f31335e;
    }

    public d(CustomCombinedChart customCombinedChart, boolean z14) {
        customCombinedChart.getClass();
        this.f107012b = customCombinedChart;
        this.f107013c = z14;
    }

    @Override // qz.f
    public final void a(List<xz.f> list) {
        List<LegendEntry> listA;
        if (list == null || (listA = xz.b.a(list)) == null) {
            return;
        }
        Legend f31342c = this.f107012b.getF31342c();
        f31342c.getClass();
        a00.a aVar = (a00.a) f31342c;
        aVar.setCustom(listA);
        if (this.f107013c) {
            aVar.f37a = new int[]{3};
        }
    }

    @Override // qz.f
    public final Legend b() {
        a00.a aVar = new a00.a();
        aVar.setEnabled(true);
        aVar.setHorizontalAlignment(Legend.LegendHorizontalAlignment.CENTER);
        Context context = this.f107012b.getContext();
        qz.f.f148595a.getClass();
        aVar.setTextColor(a7.b.getColor(context, qz.f.a.f148597b));
        aVar.setTextSize(12.0f);
        aVar.setFormSize(16.0f);
        aVar.setWordWrapEnabled(true);
        aVar.setXEntrySpace(17.0f);
        aVar.setYEntrySpace(5.0f);
        return aVar;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lkx/d$a;", "", "<init>", "()V", "", "LEGEND_X_ENTRY_SPACE", "F", "gcm-body-battery_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ d(CustomCombinedChart customCombinedChart, boolean z14, int i14, j jVar) {
        this(customCombinedChart, (i14 & 2) != 0 ? true : z14);
    }
}
