package zz;

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
import p13.x;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lzz/u;", "Lzz/f;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "layoutResourceId", "Lzz/j;", "highlightDrawer", "<init>", "(Landroid/content/Context;ILzz/j;)V", "gcm-charts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@SuppressLint({"ViewConstructor"})
public final class u extends f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f207575b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m f207576c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TextView f207577d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(Context context, int i14, j jVar) {
        super(context, i14, jVar);
        context.getClass();
        this.f207575b = new m(findViewById(R.id.highlight_metric));
        this.f207576c = new m(findViewById(R.id.highlight_metric_2));
        View viewFindViewById = findViewById(R.id.highlight_date_time);
        viewFindViewById.getClass();
        this.f207577d = (TextView) viewFindViewById;
    }

    @Override // com.github.mikephil.charting.components.MarkerView, com.github.mikephil.charting.components.IMarker
    public final void refreshContent(Entry entry, Highlight highlight) {
        entry.getClass();
        m mVar = this.f207576c;
        mVar.c();
        Object data = entry.getData();
        List list = data instanceof List ? (List) data : null;
        if (list == null) {
            return;
        }
        int i14 = 0;
        for (Object obj : list) {
            int i15 = i14 + 1;
            if (i14 < 0) {
                x.q();
                throw null;
            }
            if (obj instanceof l) {
                l lVar = (l) obj;
                this.f207577d.setText(lVar.f207544a);
                if (i14 == 0) {
                    this.f207575b.a(lVar);
                } else {
                    mVar.a(lVar);
                }
            }
            i14 = i15;
        }
        super.refreshContent(entry, highlight);
    }

    public /* synthetic */ u(Context context, int i14, j jVar, int i15, p005kotlin.jvm.internal.j jVar2) {
        this(context, (i15 & 2) != 0 ? R.layout.chart_highlight_two_metrics : i14, (i15 & 4) != 0 ? null : jVar);
    }
}
