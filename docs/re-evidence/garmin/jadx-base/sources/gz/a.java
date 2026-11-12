package gz;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.github.mikephil.chartingv2.components.YAxis;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@o13.e
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0017\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lgz/a;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "a", "gcm-charts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f80356a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f80357b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public oz.a f80358c;

    static {
        new C1606a(null);
    }

    public a(Context context) {
        context.getClass();
        this.f80356a = context;
    }

    public final oz.a a() {
        oz.a aVar = this.f80358c;
        if (aVar != null) {
            return aVar;
        }
        s.m("combinedChart");
        throw null;
    }

    public final void b(int i14, int i15, int i16) {
        if (i14 != 0) {
            a().getXAxis().setLabelRotationAngle(i14);
        }
        mz.f fVar = new mz.f(a().getViewPortHandler(), a().getXAxis(), a().getTransformer(YAxis.AxisDependency.LEFT), i15, i16, false);
        int color = a7.b.getColor(this.f80356a, R.color.gcm_chart_mark);
        if (color != 0) {
            fVar.f121634i = color;
        }
        a().setXAxisRenderer(fVar);
    }

    /* JADX INFO: renamed from: gz.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006¨\u0006\n"}, d2 = {"Lgz/a$a;", "", "<init>", "()V", "", "DEFAULT_LABEL_SIZE", "F", "DEFAULT_Y_OFFSET", "TOP_OFFSET", "BOTTOM_OFFSET", "gcm-charts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C1606a {
        public /* synthetic */ C1606a(j jVar) {
            this();
        }

        private C1606a() {
        }
    }
}
