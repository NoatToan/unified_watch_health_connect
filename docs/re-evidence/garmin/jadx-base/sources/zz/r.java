package zz;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.View;
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
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lzz/r;", "Lzz/f;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "layoutResourceId", "Lzz/j;", "highlightDrawer", "", "isReversed", "<init>", "(Landroid/content/Context;ILzz/j;Z)V", "gcm-charts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@SuppressLint({"ViewConstructor"})
public final class r extends f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f207565b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinearLayout f207566c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final m f207567d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final m f207568e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final m f207569f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TextView f207570g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(Context context, int i14, j jVar, boolean z14) {
        super(context, i14, jVar);
        context.getClass();
        this.f207565b = z14;
        View viewFindViewById = findViewById(R.id.highlight_metrics_container);
        viewFindViewById.getClass();
        this.f207566c = (LinearLayout) viewFindViewById;
        this.f207567d = new m(findViewById(R.id.highlight_metric));
        this.f207568e = new m(findViewById(R.id.highlight_metric_2));
        this.f207569f = new m(findViewById(R.id.highlight_metric_3));
        View viewFindViewById2 = findViewById(R.id.highlight_date_time);
        viewFindViewById2.getClass();
        this.f207570g = (TextView) viewFindViewById2;
    }

    @Override // com.github.mikephil.charting.components.MarkerView, com.github.mikephil.charting.components.IMarker
    public final void refreshContent(Entry entry, Highlight highlight) {
        List list;
        List listG0;
        entry.getClass();
        int i14 = 0;
        this.f207566c.setOrientation(getContext().getResources().getConfiguration().fontScale > 1.3f ? 1 : 0);
        m mVar = this.f207568e;
        mVar.c();
        m mVar2 = this.f207569f;
        mVar2.c();
        Object data = entry.getData();
        List list2 = data instanceof List ? (List) data : null;
        if (list2 != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list2) {
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
            list = arrayList2;
            if (this.f207565b) {
                listG0 = h0.G0(arrayList2);
            }
        } else {
            list = null;
        }
        if (list != null) {
            list = listG0;
            for (Object obj3 : list) {
                int i15 = i14 + 1;
                if (i14 < 0) {
                    x.q();
                    throw null;
                }
                l lVar = (l) obj3;
                this.f207570g.setText(lVar.f207544a);
                if (i14 == 0) {
                    this.f207567d.a(lVar);
                } else if (i14 == 1) {
                    mVar.a(lVar);
                } else if (i14 == 2) {
                    mVar2.a(lVar);
                }
                i14 = i15;
            }
        }
        list = listG0;
        super.refreshContent(entry, highlight);
    }

    public /* synthetic */ r(Context context, int i14, j jVar, boolean z14, int i15, p005kotlin.jvm.internal.j jVar2) {
        this(context, (i15 & 2) != 0 ? R.layout.chart_highlight_three_metrics_view : i14, (i15 & 4) != 0 ? null : jVar, (i15 & 8) != 0 ? false : z14);
    }
}
