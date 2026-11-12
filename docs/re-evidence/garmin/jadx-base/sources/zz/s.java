package zz;

import android.annotation.SuppressLint;
import android.content.Context;
import android.widget.TextView;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.highlight.Highlight;
import java.util.ArrayList;
import java.util.List;
import p005kotlin.Metadata;
import p13.x;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lzz/s;", "Lzz/f;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "layoutResourceId", "Lzz/j;", "highlightDrawer", "<init>", "(Landroid/content/Context;ILzz/j;)V", "gcm-charts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@SuppressLint({"ViewConstructor"})
public final class s extends f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<m> f207571b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<TextView> f207572c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public s(Context context, int i14, j jVar) {
        super(context, i14, jVar);
        context.getClass();
        this.f207571b = x.k(new m(findViewById(R.id.highlight_metric_1)), new m(findViewById(R.id.highlight_metric_2)), new m(findViewById(R.id.highlight_metric_3)));
        this.f207572c = x.k(findViewById(R.id.highlight_date_time_1), findViewById(R.id.highlight_date_time_2), findViewById(R.id.highlight_date_time_3));
    }

    @Override // com.github.mikephil.charting.components.MarkerView, com.github.mikephil.charting.components.IMarker
    public final void refreshContent(Entry entry, Highlight highlight) {
        Object data = entry != null ? entry.getData() : null;
        List list = data instanceof List ? (List) data : null;
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (obj instanceof l) {
                    arrayList.add(obj);
                }
            }
            List<m> list2 = this.f207571b;
            int size = list2.size();
            for (int i14 = 0; i14 < size; i14++) {
                int size2 = arrayList.size();
                List<TextView> list3 = this.f207572c;
                if (size2 > i14) {
                    l lVar = (l) arrayList.get(i14);
                    list2.get(i14).a(lVar);
                    TextView textView = list3.get(i14);
                    textView.setText(lVar.f207544a);
                    textView.setVisibility(0);
                } else {
                    list2.get(i14).c();
                    v22.e.j(list3.get(i14));
                }
            }
            super.refreshContent(entry, highlight);
        }
    }

    public /* synthetic */ s(Context context, int i14, j jVar, int i15, p005kotlin.jvm.internal.j jVar2) {
        this(context, (i15 & 2) != 0 ? R.layout.chart_highlight_three_timestamp_metrics : i14, (i15 & 4) != 0 ? null : jVar);
    }
}
