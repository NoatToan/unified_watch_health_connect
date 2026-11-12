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
import p13.h0;
import p13.x;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lzz/n;", "Lzz/f;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "layoutResourceId", "Lzz/j;", "highlightDrawer", "", "isReversed", "<init>", "(Landroid/content/Context;ILzz/j;Z)V", "gcm-charts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@SuppressLint({"ViewConstructor"})
public class n extends f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f207558b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<m> f207559c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TextView f207560d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(Context context, int i14, j jVar, boolean z14) {
        super(context, i14, jVar);
        context.getClass();
        this.f207558b = z14;
        this.f207559c = x.k(new m(findViewById(R.id.highlight_metric_1)), new m(findViewById(R.id.highlight_metric_2)), new m(findViewById(R.id.highlight_metric_3)), new m(findViewById(R.id.highlight_metric_4)), new m(findViewById(R.id.highlight_metric_5)));
        View viewFindViewById = findViewById(R.id.highlight_date_time);
        viewFindViewById.getClass();
        this.f207560d = (TextView) viewFindViewById;
    }

    @Override // com.github.mikephil.charting.components.MarkerView, com.github.mikephil.charting.components.IMarker
    public final void refreshContent(Entry entry, Highlight highlight) {
        ArrayList arrayList;
        List listG0;
        Object data = entry != null ? entry.getData() : null;
        List list = data instanceof List ? (List) data : null;
        if (list != null) {
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : list) {
                if (obj instanceof l) {
                    arrayList2.add(obj);
                }
            }
            HashSet hashSet = new HashSet();
            arrayList = new ArrayList();
            for (Object obj2 : arrayList2) {
                if (hashSet.add(((l) obj2).f207546c)) {
                    arrayList.add(obj2);
                }
            }
        } else {
            arrayList = null;
        }
        if (arrayList != null) {
            if (this.f207558b) {
                listG0 = arrayList;
                listG0 = h0.G0(arrayList);
            }
            if (listG0 != null) {
                List<m> list2 = this.f207559c;
                int size = list2.size();
                int i14 = 0;
                for (int i15 = 0; i15 < size; i15++) {
                    if (listG0.size() > i15) {
                        l lVar = (l) listG0.get(i15);
                        list2.get(i15).a(lVar);
                        list2.get(i15).b();
                        this.f207560d.setText(lVar.f207544a);
                        i14++;
                    } else {
                        list2.get(i15).c();
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
                View viewFindViewById4 = findViewById(R.id.highlight_metric_5);
                ViewGroup.LayoutParams layoutParams7 = viewFindViewById4 != null ? viewFindViewById4.getLayoutParams() : null;
                LinearLayout.LayoutParams layoutParams8 = layoutParams7 instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams7 : null;
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
                    if (layoutParams8 != null) {
                        layoutParams8.setMarginStart(0);
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
                    if (layoutParams8 != null) {
                        layoutParams8.setMarginStart(iN);
                    }
                }
                super.refreshContent(entry, highlight);
            }
        }
    }

    public /* synthetic */ n(Context context, int i14, j jVar, boolean z14, int i15, p005kotlin.jvm.internal.j jVar2) {
        this(context, (i15 & 2) != 0 ? R.layout.chart_highlight_five_metrics : i14, (i15 & 4) != 0 ? null : jVar, (i15 & 8) != 0 ? false : z14);
    }
}
