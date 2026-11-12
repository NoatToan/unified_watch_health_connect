package es0;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.TextView;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.highlight.Highlight;
import java.util.List;
import p005kotlin.Metadata;
import p13.x;
import zz.l;
import zz.m;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Les0/g;", "Lzz/f;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "", "getMarkerTopPosition", "()F", "gcm-jet-lag_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class g extends zz.f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f65196b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ks0.c f65197c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final View f65198d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final m f65199e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final m f65200f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TextView f65201g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final View f65202h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final TextView f65203i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(Context context) {
        super(context, R.layout.jet_lag_marker_view, null);
        context.getClass();
        this.f65196b = true;
        this.f65197c = new ks0.c(context);
        this.f65198d = findViewById(R.id.jet_lag_marker_regular);
        this.f65199e = new m(findViewById(R.id.highlight_metric));
        this.f65200f = new m(findViewById(R.id.highlight_metric_2));
        View viewFindViewById = findViewById(R.id.highlight_date_time);
        viewFindViewById.getClass();
        this.f65201g = (TextView) viewFindViewById;
        this.f65202h = findViewById(R.id.jet_lag_marker_now);
        this.f65203i = (TextView) findViewById(R.id.jet_lag_marker_now_label);
    }

    @Override // zz.f, com.github.mikephil.charting.components.MarkerView, com.github.mikephil.charting.components.IMarker
    public final void draw(Canvas canvas, float f14, float f15) {
        canvas.getClass();
        int width = getWidth() / 2;
        float width2 = canvas.getWidth() - (getWidth() / 2);
        float f16 = this.f65196b ? 150.0f : 0.0f;
        float f17 = width;
        if (f14 <= f17) {
            a(canvas, f17, f16);
        } else if (f14 >= width2) {
            a(canvas, width2, f16);
        } else {
            a(canvas, f14, f16);
        }
    }

    public final float getMarkerTopPosition() {
        return this.f65196b ? 150.0f : 0.0f;
    }

    @Override // com.github.mikephil.charting.components.MarkerView, com.github.mikephil.charting.components.IMarker
    public final void refreshContent(Entry entry, Highlight highlight) {
        entry.getClass();
        this.f65196b = highlight instanceof h;
        View view2 = this.f65202h;
        view2.getClass();
        v22.e.v(view2, this.f65196b);
        View view3 = this.f65198d;
        view3.getClass();
        v22.e.v(view3, !this.f65196b);
        int i14 = 0;
        if (this.f65196b) {
            float x14 = entry.getX();
            ks0.c cVar = this.f65197c;
            this.f65203i.setText(cVar.f106382a.a(R.string.lbl_now_with_time, cVar.d(true, false, x14)));
        } else {
            m mVar = this.f65200f;
            mVar.c();
            Object data = entry.getData();
            List list = data instanceof List ? (List) data : null;
            if (list == null) {
                return;
            }
            for (Object obj : list) {
                int i15 = i14 + 1;
                if (i14 < 0) {
                    x.q();
                    throw null;
                }
                if (obj instanceof l) {
                    l lVar = (l) obj;
                    this.f65201g.setText(lVar.f207544a);
                    if (i14 == 0) {
                        this.f65199e.a(lVar);
                    } else {
                        mVar.a(lVar);
                    }
                }
                i14 = i15;
            }
        }
        super.refreshContent(entry, highlight);
    }
}
