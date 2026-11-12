package pr0;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.TextView;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.net.SyslogConstants;
import com.garmin.android.apps.connectmobile.R;
import com.github.mikephil.chartingv2.components.MarkerView;
import com.github.mikephil.chartingv2.data.Entry;
import com.github.mikephil.chartingv2.highlight.Highlight;
import p005kotlin.Metadata;
import zz.l;
import zz.m;

/* JADX INFO: loaded from: classes8.dex */
@o13.e
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\tB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lpr0/i;", "Lcom/github/mikephil/chartingv2/components/MarkerView;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "", "getDefaultPadding", "()F", "a", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class i extends MarkerView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f139624a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f139625b;

    static {
        new a(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(Context context) {
        super(context, R.layout.chart_highlight_custom_view);
        context.getClass();
        this.f139624a = new m(findViewById(R.id.highlight_metric_1));
        View viewFindViewById = findViewById(R.id.highlight_date_time);
        viewFindViewById.getClass();
        this.f139625b = (TextView) viewFindViewById;
    }

    private final float getDefaultPadding() {
        return 5.0f;
    }

    @Override // com.github.mikephil.chartingv2.components.MarkerView
    public final void draw(Canvas canvas, float f14, float f15) {
        canvas.getClass();
        int width = getWidth() / 2;
        float width2 = canvas.getWidth() - (getWidth() / 2);
        float height = canvas.getHeight() - (getHeight() / 2);
        float f16 = width;
        if (f14 <= f16) {
            super.draw(canvas, f16, getDefaultPadding());
            return;
        }
        if (f14 >= width2) {
            super.draw(canvas, width2, getDefaultPadding());
        } else if (f15 >= height) {
            super.draw(canvas, getDefaultPadding(), height);
        } else {
            super.draw(canvas, f14, getDefaultPadding());
        }
    }

    @Override // com.github.mikephil.chartingv2.components.MarkerView
    public final int getXOffset(float f14) {
        return -(getWidth() / 2);
    }

    @Override // com.github.mikephil.chartingv2.components.MarkerView
    public final int getYOffset(float f14) {
        return -((int) getDefaultPadding());
    }

    @Override // com.github.mikephil.chartingv2.components.MarkerView
    public final void refreshContent(Entry entry, Highlight highlight) {
        String str;
        entry.getClass();
        highlight.getClass();
        Object data = entry.getData();
        if (data == null || !(data instanceof h)) {
            return;
        }
        h hVar = (h) data;
        String string = hVar.f139619a;
        String str2 = hVar.f139620b;
        if (string == null || string.length() <= 0 || str2 == null || str2.length() <= 0) {
            if (string == null || string.length() <= 0) {
                if (str2 == null || str2.length() <= 0) {
                    string = "";
                } else {
                    str = str2;
                }
            }
            str.getClass();
            String string2 = getContext().getString(R.string.title_intensity_minutes);
            string2.getClass();
            this.f139624a.a(new l(str, hVar.f139621c, string2, null, null, hVar.f139622d, hVar.f139623e, null, SyslogConstants.LOG_LOCAL3, null));
            this.f139625b.setText(str);
        }
        string = getContext().getString(R.string.string_space_bullet_string_pattern, string, str2);
        str = string;
        str.getClass();
        String string3 = getContext().getString(R.string.title_intensity_minutes);
        string3.getClass();
        this.f139624a.a(new l(str, hVar.f139621c, string3, null, null, hVar.f139622d, hVar.f139623e, null, SyslogConstants.LOG_LOCAL3, null));
        this.f139625b.setText(str);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lpr0/i$a;", "", "<init>", "()V", "", "DEFAULT_PADDING", "F", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
