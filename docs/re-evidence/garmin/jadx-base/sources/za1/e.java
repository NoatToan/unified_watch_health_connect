package za1;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.github.mikephil.charting.components.LimitLine;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lza1/e;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lza1/c;", "chartData", "<init>", "(Landroid/content/Context;Lza1/c;)V", "a", "gcm-power-guide_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f203298h = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f203299a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f203300b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f203301c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f203302d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final LimitLine f203303e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f203304f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f203305g;

    static {
        new a(null);
    }

    public e(Context context, c cVar) {
        context.getClass();
        cVar.getClass();
        this.f203299a = context;
        this.f203300b = cVar;
        this.f203301c = (float) cVar.f203292e;
        int i14 = cVar.f203291d;
        this.f203302d = Math.max(i14 * 2.0f, cVar.f203290c + 10.0f);
        LimitLine limitLine = new LimitLine(i14);
        limitLine.setLineWidth(2.0f);
        limitLine.setLineColor(a7.b.getColor(context, R.color.gcm_chart_avg_line));
        limitLine.enableDashedLine(20.0f, 20.0f, 0.0f);
        this.f203303e = limitLine;
        float f14 = 10;
        float fFloor = ((float) Math.floor(cVar.f203293f / 10.0d)) * f14;
        this.f203304f = fFloor;
        this.f203305g = (((float) Math.ceil(Math.max((((float) Math.ceil(cVar.f203294g / 10.0d)) * f14) - fFloor, 40.0f) / 40.0f)) * 40.0f) + fFloor;
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lza1/e$a;", "", "<init>", "()V", "", "CHART_LINE_WIDTH", "F", "HIGHLIGHT_LINE_WIDTH", "", "LEFT_AXIS_MARGIN", "D", "", "ELEVATION_AXIS_LABEL_COUNT", "I", "gcm-power-guide_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
