package jx0;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.menstrualcycle.presentation.util.GridChartView;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import p005kotlin.Metadata;
import p13.x;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0007B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Ljx0/n;", "Lmx0/a;", "Lcom/garmin/android/apps/connectmobile/menstrualcycle/presentation/util/GridChartView$b;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "a", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class n extends mx0.a<GridChartView.b> {

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Ljx0/n$a;", "Lmx0/a$a;", "Lcom/garmin/android/apps/connectmobile/menstrualcycle/presentation/util/GridChartView$b;", "Landroid/view/View;", "itemView", "<init>", "(Landroid/view/View;)V", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a extends mx0.a.AbstractC2298a<GridChartView.b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TextView f101506a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final GridChartView f101507b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(View view2) {
            super(view2);
            view2.getClass();
            this.f101506a = (TextView) view2.findViewById(R.id.view_grid_chart_title);
            this.f101507b = (GridChartView) view2.findViewById(R.id.view_grid_chart);
        }

        @Override // mx0.a.AbstractC2298a
        public final void d(GridChartView.b bVar) {
            GridChartView.b bVar2 = bVar;
            bVar2.getClass();
            this.f101506a.setText(bVar2.f39185a);
            int i14 = bVar2.f39186b;
            List<GridChartView.c> list = bVar2.f39187c;
            int i15 = bVar2.f39188d;
            GridChartView gridChartView = this.f101507b;
            gridChartView.getClass();
            gridChartView.f39183g = i14;
            gridChartView.f39178b.setColor(a7.b.getColor(gridChartView.getContext(), i15));
            gridChartView.f39182f = list;
            gridChartView.requestLayout();
            gridChartView.invalidate();
            String str = "";
            for (GridChartView.c cVar : list) {
                int i16 = 0;
                String str2 = "";
                for (Object obj : cVar.f39190b) {
                    int i17 = i16 + 1;
                    if (i16 < 0) {
                        x.q();
                        throw null;
                    }
                    if (((Boolean) obj).booleanValue()) {
                        str2 = ((Object) str2) + i17 + ", ";
                    }
                    i16 = i17;
                }
                str = ((Object) str) + StringUtils.SPACE + this.itemView.getContext().getString(R.string.lbl_symptoms_grid, cVar.f39189a, str2);
            }
            gridChartView.setContentDescription(str);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(Context context) {
        super(context);
        context.getClass();
    }

    @Override // mx0.a
    public final mx0.a.AbstractC2298a r(ViewGroup viewGroup, LayoutInflater layoutInflater, int i14) {
        layoutInflater.getClass();
        View viewInflate = layoutInflater.inflate(R.layout.view_grid_chart, viewGroup, false);
        viewInflate.getClass();
        return new a(viewInflate);
    }
}
