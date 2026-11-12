package sw;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.TextView;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.github.mikephil.chartingv2.data.Entry;
import com.github.mikephil.chartingv2.highlight.Highlight;
import java.util.ArrayList;
import java.util.List;
import p005kotlin.Metadata;
import p13.x;

/* JADX INFO: loaded from: classes7.dex */
@o13.e
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB\u001b\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lsw/b;", "Lgz/c;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "resourceId", "<init>", "(Landroid/content/Context;I)V", "a", "gcm-blood-pressure_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b extends gz.c {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final TextView f161046y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final List<zz.m> f161047z;

    static {
        new a(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Context context, int i14) {
        super(context, i14, null);
        context.getClass();
        View viewFindViewById = findViewById(R.id.highlight_date_time);
        viewFindViewById.getClass();
        this.f161046y = (TextView) viewFindViewById;
        this.f161047z = x.k(new zz.m(findViewById(R.id.highlight_metric_1)), new zz.m(findViewById(R.id.highlight_metric_2)), new zz.m(findViewById(R.id.highlight_metric_3)));
    }

    @Override // gz.c, gz.e, com.github.mikephil.chartingv2.components.MarkerView
    public final void draw(Canvas canvas, float f14, float f15) {
        canvas.getClass();
        int width = getWidth() / 2;
        float width2 = canvas.getWidth() - (getWidth() / 2);
        float height = canvas.getHeight() - (getHeight() / 2);
        float f16 = width;
        if (f14 <= f16) {
            super.draw(canvas, f16, 5.0f);
            return;
        }
        if (f14 >= width2) {
            super.draw(canvas, width2, 5.0f);
        } else if (f15 >= height) {
            super.draw(canvas, 5.0f, height);
        } else {
            super.draw(canvas, f14, 5.0f);
        }
    }

    @Override // gz.c, gz.e, com.github.mikephil.chartingv2.components.MarkerView
    public final void refreshContent(Entry entry, Highlight highlight) {
        Object data = entry != null ? entry.getData() : null;
        List list = data instanceof List ? (List) data : null;
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (obj instanceof zz.l) {
                    arrayList.add(obj);
                }
            }
            float f14 = getContext().getResources().getConfiguration().fontScale;
            int i14 = 0;
            List<zz.m> list2 = this.f161047z;
            if (f14 >= 1.3f) {
                zz.m mVar = list2.get(0);
                int i15 = (int) (getContext().getResources().getDisplayMetrics().widthPixels * 0.3f);
                TextView textView = mVar.f207554c;
                if (textView != null) {
                    textView.setMaxWidth(i15);
                }
            }
            for (Object obj2 : arrayList) {
                int i16 = i14 + 1;
                if (i14 < 0) {
                    x.q();
                    throw null;
                }
                zz.l lVar = (zz.l) obj2;
                this.f161046y.setText(lVar.f207544a);
                list2.get(i14).a(lVar);
                list2.get(i14).b();
                i14 = i16;
            }
            super.refreshContent(entry, highlight);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lsw/b$a;", "", "<init>", "()V", "", "DEFAULT_PADDING", "F", "PERCENT_OF_SCREEN_WIDTH", "gcm-blood-pressure_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(Context context) {
        this(context, 0, 2, null);
        context.getClass();
    }

    public /* synthetic */ b(Context context, int i14, int i15, p005kotlin.jvm.internal.j jVar) {
        this(context, (i15 & 2) != 0 ? R.layout.chart_highlight_custom_view : i14);
    }
}
