package zz;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import ch.qos.logback.core.CoreConstants;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.highlight.Highlight;
import java.util.ArrayList;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lzz/p;", "Lzz/o;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "gcm-charts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class p extends o {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(Context context) {
        super(context, 0, null, 6, null);
        context.getClass();
    }

    @Override // zz.o, com.github.mikephil.charting.components.MarkerView, com.github.mikephil.charting.components.IMarker
    public final void refreshContent(Entry entry, Highlight highlight) {
        TextView textView;
        List<l> listB = b(entry);
        if (listB == null) {
            return;
        }
        int size = getMetrics().size();
        for (int i14 = 0; i14 < size; i14++) {
            m mVar = getMetrics().get(i14);
            int i15 = (int) (((double) getContext().getResources().getDisplayMetrics().widthPixels) * 0.2d);
            TextView textView2 = mVar.f207556e;
            if (textView2 != null) {
                textView2.setMaxWidth(i15);
            }
            ArrayList arrayList = (ArrayList) listB;
            if (arrayList.size() > i14) {
                l lVar = (l) arrayList.get(i14);
                getMetrics().get(i14).a(lVar);
                getMetrics().get(i14).b();
                m mVar2 = getMetrics().get(i14);
                if (mVar2.f207552a != null && (textView = mVar2.f207556e) != null) {
                    textView.setMaxLines(2);
                }
                getTimeTextView().setText(lVar.f207544a);
            } else {
                getMetrics().get(i14).c();
            }
        }
        measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        layout(0, 0, getMeasuredWidth(), getMeasuredHeight());
    }
}
