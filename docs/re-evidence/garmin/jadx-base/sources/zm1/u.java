package zm1;

import android.content.Context;
import com.garmin.android.apps.connectmobile.charts.mpchart3.wrapper.CustomCombinedChart;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\u0012BK\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u000e\u001a\u00020\n\u0012\u0006\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lzm1/u;", "Luz/a;", "Lzm1/o;", "Lrl1/i;", "Lzm1/s;", "Lcom/garmin/android/apps/connectmobile/charts/mpchart3/wrapper/CustomCombinedChart;", "chart", "Lorg/joda/time/LocalDate;", "startDate", "endDate", "", "daily", "chartType", "overlayType", "trainingReadinessFactor", "hideLegendConfig", "<init>", "(Lcom/garmin/android/apps/connectmobile/charts/mpchart3/wrapper/CustomCombinedChart;Lorg/joda/time/LocalDate;Lorg/joda/time/LocalDate;ZLzm1/o;Lrl1/i;ZZ)V", "a", "gcm-domain-wellness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class u extends uz.a<o, rl1.i, s> {
    static {
        new a(null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public u(CustomCombinedChart customCombinedChart, LocalDate localDate, LocalDate localDate2, boolean z14, o oVar, rl1.i iVar, boolean z15, boolean z16) {
        customCombinedChart.getClass();
        localDate.getClass();
        localDate2.getClass();
        oVar.getClass();
        Context context = customCombinedChart.getContext();
        context.getClass();
        super(customCombinedChart, new uz.f(oVar, new v(context, localDate, localDate2, z14, z15)), new uz.d(customCombinedChart, oVar, new w(customCombinedChart, localDate, localDate2, z14)), new hm1.a(customCombinedChart), !z16 ? new sl1.c(customCombinedChart) : null, 24.0f);
        if (iVar != null) {
            b(iVar);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lzm1/u$a;", "", "<init>", "()V", "", "FIXED_Y_AXIS_WIDTH", "F", "gcm-domain-wellness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ u(CustomCombinedChart customCombinedChart, LocalDate localDate, LocalDate localDate2, boolean z14, o oVar, rl1.i iVar, boolean z15, boolean z16, int i14, p005kotlin.jvm.internal.j jVar) {
        this(customCombinedChart, localDate, localDate2, z14, oVar, (i14 & 32) != 0 ? null : iVar, z15, z16);
    }
}
