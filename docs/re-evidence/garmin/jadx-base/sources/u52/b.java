package u52;

import android.graphics.drawable.ColorDrawable;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.workouts.presentation.charts.PowerCurveTargetChart;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lu52/b;", "", "Lcom/garmin/android/apps/connectmobile/workouts/presentation/charts/PowerCurveTargetChart;", "chart", "<init>", "(Lcom/garmin/android/apps/connectmobile/workouts/presentation/charts/PowerCurveTargetChart;)V", "a", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PowerCurveTargetChart f168705a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public c f168706b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f168707c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f168708d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ColorDrawable f168709e;

    static {
        new a(null);
    }

    public b(PowerCurveTargetChart powerCurveTargetChart) {
        powerCurveTargetChart.getClass();
        this.f168705a = powerCurveTargetChart;
        this.f168707c = a7.b.getColor(powerCurveTargetChart.getContext(), R.color.gcm_text_primary);
        this.f168708d = a7.b.getColor(powerCurveTargetChart.getContext(), R.color.palette_delta_3);
        this.f168709e = new ColorDrawable(a7.b.getColor(powerCurveTargetChart.getContext(), R.color.palette_delta_4_alpha));
    }

    public final void a(int i14, int i15, int i16) {
        PowerCurveTargetChart powerCurveTargetChart = this.f168705a;
        if (i14 == -1) {
            powerCurveTargetChart.highlightValue(null);
            return;
        }
        c cVar = this.f168706b;
        if (cVar != null) {
            cVar.f168711i = i15;
        }
        if (cVar != null) {
            cVar.f168713k = i16;
        }
        powerCurveTargetChart.highlightValue(i14, 0);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0006¨\u0006\r"}, d2 = {"Lu52/b$a;", "", "<init>", "()V", "", "DEFAULT_LINE_WIDTH", "F", "HIGHLIGHT_LINE_WIDTH", "BOTTOM_OFFSET", "TOP_OFFSET", "TEXT_SIZE", "EXTRA_RIGHT_OFFSET", "LABEL_ROTATION_ANGLE", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
