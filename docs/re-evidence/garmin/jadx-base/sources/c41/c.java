package c41;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.highlight.Highlight;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.h0;
import p13.x;
import zz.f;
import zz.j;
import zz.l;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lc41/c;", "Lzz/f;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "layoutResourceId", "Lzz/j;", "highlightDrawer", "<init>", "(Landroid/content/Context;ILzz/j;)V", "gcm-domain-wellness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@SuppressLint({"ViewConstructor"})
public final class c extends f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f24344b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f24345c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b f24346d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final TextView f24347e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Context context, int i14, j jVar) {
        super(context, i14, jVar);
        context.getClass();
        this.f24344b = new b(findViewById(R.id.highlight_metric));
        this.f24345c = new b(findViewById(R.id.highlight_metric_2));
        this.f24346d = new b(findViewById(R.id.highlight_metric_3));
        View viewFindViewById = findViewById(R.id.highlight_date_time);
        viewFindViewById.getClass();
        this.f24347e = (TextView) viewFindViewById;
    }

    @Override // com.github.mikephil.charting.components.MarkerView, com.github.mikephil.charting.components.IMarker
    public final void refreshContent(Entry entry, Highlight highlight) {
        entry.getClass();
        b bVar = this.f24345c;
        View view2 = bVar.f24337a;
        if (view2 != null) {
            view2.setVisibility(8);
            Unit unit = Unit.INSTANCE;
        }
        b bVar2 = this.f24346d;
        View view3 = bVar2.f24337a;
        if (view3 != null) {
            view3.setVisibility(8);
            Unit unit2 = Unit.INSTANCE;
        }
        Object data = entry.getData();
        List list = data instanceof List ? (List) data : null;
        if (list == null) {
            return;
        }
        int i14 = 0;
        for (Object obj : h0.G0(list)) {
            int i15 = i14 + 1;
            if (i14 < 0) {
                x.q();
                throw null;
            }
            if (obj instanceof l) {
                l lVar = (l) obj;
                this.f24347e.setText(lVar.f207544a);
                if (i14 == 0) {
                    this.f24344b.a(lVar);
                } else if (i14 != 1) {
                    bVar2.a(lVar);
                } else {
                    bVar.a(lVar);
                }
            }
            i14 = i15;
        }
        super.refreshContent(entry, highlight);
    }

    public /* synthetic */ c(Context context, int i14, j jVar, int i15, p005kotlin.jvm.internal.j jVar2) {
        this(context, (i15 & 2) != 0 ? R.layout.chart_highlight_three_metrics : i14, (i15 & 4) != 0 ? null : jVar);
    }
}
