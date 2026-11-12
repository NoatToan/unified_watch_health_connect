package sw;

import android.content.Context;
import com.garmin.android.apps.connectmobile.R;
import com.github.mikephil.chartingv2.data.LineDataSet;
import java.util.ArrayList;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@o13.e
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lsw/f;", "Lgz/a;", "Loz/a;", "chart", "<init>", "(Loz/a;)V", "a", "gcm-blood-pressure_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class f extends gz.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final oz.a f161049d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public r22.a f161050e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public List<Integer> f161051f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f161052g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f161053h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f161054i;

    static {
        new a(null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public f(oz.a aVar) {
        aVar.getClass();
        Context context = aVar.getContext();
        context.getClass();
        super(context);
        this.f161049d = aVar;
        this.f161052g = this.f80356a.getColor(R.color.secondary_text);
        this.f161053h = this.f80356a.getColor(R.color.blood_pressure_chart_dot_fill_color);
        this.f161054i = this.f80356a.getColor(R.color.gcm_background_hero);
    }

    public static LineDataSet d(ArrayList arrayList) {
        LineDataSet lineDataSet = new LineDataSet(arrayList, "");
        lineDataSet.setDrawFilled(true);
        lineDataSet.setDrawStepped(true);
        lineDataSet.setDrawCircles(false);
        lineDataSet.setDrawValues(false);
        return lineDataSet;
    }

    public final int c(int i14) {
        List<Integer> list = this.f161051f;
        if (i14 < 0) {
            if (list != null) {
                return list.indexOf(30);
            }
            s.m("xValues");
            throw null;
        }
        if (list != null) {
            return list.indexOf(Integer.valueOf(i14));
        }
        s.m("xValues");
        throw null;
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\tR\u0014\u0010\f\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\tR\u0014\u0010\r\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\tR\u0014\u0010\u000e\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\tR\u0014\u0010\u000f\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\tR\u0014\u0010\u0010\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\t¨\u0006\u0011"}, d2 = {"Lsw/f$a;", "", "<init>", "()V", "", "MAX_LABEL_COUNT_FOR_DEFAULT_LABEL_SIZE", "I", "", "DEFAULT_LABEL_SIZE", "F", "MAX_LABEL_COUNT_FOR_SMALL_LABEL_SIZE", "SMALL_LABEL_SIZE", "EXTRA_SMALL_LABEL_SIZE", "ZERO_VALUE", "X_AXIS_OFFSET", "SCATTER_SHAPE_SIZE", "SCATTER_SHAPE_HOLE", "gcm-blood-pressure_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
