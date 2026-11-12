package zz;

import android.annotation.SuppressLint;
import android.content.Context;
import android.widget.TextView;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.highlight.Highlight;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lzz/q;", "Lzz/f;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "layoutResourceId", "Lzz/j;", "highlightDrawer", "<init>", "(Landroid/content/Context;ILzz/j;)V", "gcm-charts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@SuppressLint({"ViewConstructor"})
public final class q extends f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f207563b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextView f207564c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(Context context, int i14, j jVar) {
        super(context, i14, jVar);
        context.getClass();
        this.f207563b = new m(findViewById(R.id.highlight_metric));
        this.f207564c = (TextView) findViewById(R.id.highlight_date_time);
    }

    @Override // com.github.mikephil.charting.components.MarkerView, com.github.mikephil.charting.components.IMarker
    public final void refreshContent(Entry entry, Highlight highlight) {
        entry.getClass();
        Object data = entry.getData();
        l lVar = data instanceof l ? (l) data : null;
        if (lVar == null) {
            return;
        }
        TextView textView = this.f207564c;
        if (textView != null) {
            textView.setText(lVar.f207544a);
        }
        this.f207563b.a(lVar);
        super.refreshContent(entry, highlight);
    }

    public /* synthetic */ q(Context context, int i14, j jVar, int i15, p005kotlin.jvm.internal.j jVar2) {
        this(context, (i15 & 2) != 0 ? R.layout.chart_highlight_one_metric : i14, (i15 & 4) != 0 ? null : jVar);
    }
}
