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
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lzz/t;", "Lzz/f;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "layoutResourceId", "Lzz/j;", "highlightDrawer", "<init>", "(Landroid/content/Context;ILzz/j;)V", "gcm-charts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@SuppressLint({"ViewConstructor"})
public class t extends f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<m> f207573b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextView f207574c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(Context context, int i14, j jVar) {
        super(context, i14, jVar);
        context.getClass();
        this.f207573b = x.k(new m(findViewById(R.id.highlight_metric_1)), new m(findViewById(R.id.highlight_metric_2)), new m(findViewById(R.id.highlight_metric_3)), new m(findViewById(R.id.highlight_metric_4)), new m(findViewById(R.id.highlight_metric_5)), new m(findViewById(R.id.highlight_metric_6)), new m(findViewById(R.id.highlight_metric_7)), new m(findViewById(R.id.highlight_metric_8)), new m(findViewById(R.id.highlight_metric_9)), new m(findViewById(R.id.highlight_metric_10)), new m(findViewById(R.id.highlight_metric_11)), new m(findViewById(R.id.highlight_metric_12)));
        View viewFindViewById = findViewById(R.id.highlight_date_time);
        viewFindViewById.getClass();
        this.f207574c = (TextView) viewFindViewById;
    }

    public List<l> b(Entry entry) {
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

    @Override // com.github.mikephil.charting.components.MarkerView, com.github.mikephil.charting.components.IMarker
    public final void refreshContent(Entry entry, Highlight highlight) {
        List<l> listB = b(entry);
        if (listB == null) {
            return;
        }
        List<m> list = this.f207573b;
        int size = list.size();
        int i14 = 0;
        for (int i15 = 0; i15 < size; i15++) {
            ArrayList arrayList = (ArrayList) listB;
            if (arrayList.size() > i15) {
                l lVar = (l) arrayList.get(i15);
                list.get(i15).a(lVar);
                list.get(i15).b();
                this.f207574c.setText(lVar.f207544a);
                i14++;
            } else {
                list.get(i15).c();
            }
        }
        View viewFindViewById = findViewById(R.id.highlight_metric_2);
        ViewGroup.LayoutParams layoutParams = viewFindViewById != null ? viewFindViewById.getLayoutParams() : null;
        LinearLayout.LayoutParams layoutParams2 = layoutParams instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams : null;
        View viewFindViewById2 = findViewById(R.id.highlight_metric_5);
        ViewGroup.LayoutParams layoutParams3 = viewFindViewById2 != null ? viewFindViewById2.getLayoutParams() : null;
        LinearLayout.LayoutParams layoutParams4 = layoutParams3 instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams3 : null;
        if (i14 <= 4) {
            if (layoutParams2 != null) {
                layoutParams2.bottomMargin = 0;
            }
            if (layoutParams4 != null) {
                layoutParams4.bottomMargin = 0;
            }
        } else if (i14 <= 8) {
            Resources resources = getResources();
            resources.getClass();
            int iN = (int) xy2.b.n(resources, 8.0f);
            if (layoutParams2 != null) {
                layoutParams2.bottomMargin = iN;
            }
        } else {
            Resources resources2 = getResources();
            resources2.getClass();
            int iN2 = (int) xy2.b.n(resources2, 8.0f);
            if (layoutParams2 != null) {
                layoutParams2.bottomMargin = iN2;
            }
            if (layoutParams4 != null) {
                layoutParams4.bottomMargin = iN2;
            }
        }
        super.refreshContent(entry, highlight);
    }

    public /* synthetic */ t(Context context, int i14, j jVar, int i15, p005kotlin.jvm.internal.j jVar2) {
        this(context, (i15 & 2) != 0 ? R.layout.chart_highlight_twelve_metrics_wrap : i14, (i15 & 4) != 0 ? null : jVar);
    }
}
