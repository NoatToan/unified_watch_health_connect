package b71;

import android.annotation.SuppressLint;
import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.github.mikephil.charting.data.Entry;
import java.util.ArrayList;
import java.util.List;
import p005kotlin.Metadata;
import zz.t;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lb71/e;", "Lzz/t;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "layoutResourceId", "Lzz/j;", "highlightDrawer", "<init>", "(Landroid/content/Context;ILzz/j;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@SuppressLint({"ViewConstructor"})
public final class e extends t {
    public /* synthetic */ e(Context context, int i14, zz.j jVar, int i15, p005kotlin.jvm.internal.j jVar2) {
        this(context, (i15 & 2) != 0 ? R.layout.chart_highlight_twelve_metrics_wrap : i14, (i15 & 4) != 0 ? null : jVar);
    }

    @Override // zz.t
    public final List<zz.l> b(Entry entry) {
        ArrayList arrayList = null;
        Object data = entry != null ? entry.getData() : null;
        List list = data instanceof List ? (List) data : null;
        if (list != null) {
            arrayList = new ArrayList();
            for (Object obj : list) {
                if (obj instanceof zz.l) {
                    arrayList.add(obj);
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(Context context, int i14, zz.j jVar) {
        super(context, i14, jVar);
        context.getClass();
    }
}
