package zz;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.highlight.Highlight;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import p005kotlin.Metadata;
import p13.x;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0017\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tR \u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0016\u001a\u00020\u00118\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Lzz/o;", "Lzz/f;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "layoutResourceId", "Lzz/j;", "highlightDrawer", "<init>", "(Landroid/content/Context;ILzz/j;)V", "", "Lzz/m;", "b", "Ljava/util/List;", "getMetrics", "()Ljava/util/List;", "metrics", "Landroid/widget/TextView;", "c", "Landroid/widget/TextView;", "getTimeTextView", "()Landroid/widget/TextView;", "timeTextView", "gcm-charts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@SuppressLint({"ViewConstructor"})
public class o extends f {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final List<m> metrics;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final TextView timeTextView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(Context context, int i14, j jVar) {
        super(context, i14, jVar);
        context.getClass();
        this.metrics = x.k(new m(findViewById(R.id.highlight_metric_1)), new m(findViewById(R.id.highlight_metric_2)), new m(findViewById(R.id.highlight_metric_3)), new m(findViewById(R.id.highlight_metric_4)));
        View viewFindViewById = findViewById(R.id.highlight_date_time);
        viewFindViewById.getClass();
        this.timeTextView = (TextView) viewFindViewById;
    }

    public final List<l> b(Entry entry) {
        Object data = entry != null ? entry.getData() : null;
        List list = data instanceof List ? (List) data : null;
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof l) {
                arrayList.add(obj);
            }
        }
        HashSet hashSet = new HashSet();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (hashSet.add(((l) obj2).f207546c)) {
                arrayList2.add(obj2);
            }
        }
        return arrayList2;
    }

    public final List<m> getMetrics() {
        return this.metrics;
    }

    public final TextView getTimeTextView() {
        return this.timeTextView;
    }

    @Override // com.github.mikephil.charting.components.MarkerView, com.github.mikephil.charting.components.IMarker
    public void refreshContent(Entry entry, Highlight highlight) {
        List<l> listB = b(entry);
        if (listB == null) {
            return;
        }
        List<m> list = this.metrics;
        int size = list.size();
        int i14 = 0;
        for (int i15 = 0; i15 < size; i15++) {
            ArrayList arrayList = (ArrayList) listB;
            if (arrayList.size() > i15) {
                l lVar = (l) arrayList.get(i15);
                list.get(i15).a(lVar);
                list.get(i15).b();
                this.timeTextView.setText(lVar.f207544a);
                i14++;
            } else {
                list.get(i15).c();
            }
        }
        LinearLayout linearLayout = (LinearLayout) getRootView().findViewById(R.id.metric_content_layout);
        View viewFindViewById = findViewById(R.id.highlight_metric_2);
        ViewGroup.LayoutParams layoutParams = viewFindViewById != null ? viewFindViewById.getLayoutParams() : null;
        LinearLayout.LayoutParams layoutParams2 = layoutParams instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams : null;
        View viewFindViewById2 = findViewById(R.id.highlight_metric_3);
        ViewGroup.LayoutParams layoutParams3 = viewFindViewById2 != null ? viewFindViewById2.getLayoutParams() : null;
        LinearLayout.LayoutParams layoutParams4 = layoutParams3 instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams3 : null;
        View viewFindViewById3 = findViewById(R.id.highlight_metric_4);
        ViewGroup.LayoutParams layoutParams5 = viewFindViewById3 != null ? viewFindViewById3.getLayoutParams() : null;
        LinearLayout.LayoutParams layoutParams6 = layoutParams5 instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams5 : null;
        if (i14 > 2) {
            linearLayout.setOrientation(1);
            if (layoutParams2 != null) {
                layoutParams2.setMarginStart(0);
            }
            if (layoutParams4 != null) {
                layoutParams4.setMarginStart(0);
            }
            if (layoutParams6 != null) {
                layoutParams6.setMarginStart(0);
            }
        } else {
            linearLayout.setOrientation(0);
            Resources resources = getResources();
            resources.getClass();
            int iN = (int) xy2.b.n(resources, 16.0f);
            if (layoutParams2 != null) {
                layoutParams2.setMarginStart(iN);
            }
            if (layoutParams4 != null) {
                layoutParams4.setMarginStart(iN);
            }
            if (layoutParams6 != null) {
                layoutParams6.setMarginStart(iN);
            }
        }
        super.refreshContent(entry, highlight);
    }

    public /* synthetic */ o(Context context, int i14, j jVar, int i15, p005kotlin.jvm.internal.j jVar2) {
        this(context, (i15 & 2) != 0 ? R.layout.chart_highlight_four_metrics : i14, (i15 & 4) != 0 ? null : jVar);
    }
}
