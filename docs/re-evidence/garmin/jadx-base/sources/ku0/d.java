package ku0;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.f1;
import java.util.ArrayList;
import java.util.Iterator;
import k32.l;
import n23.j;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lku0/d;", "Lcom/garmin/android/apps/connectmobile/f1;", "<init>", "()V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d extends f1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f106544c = new ArrayList();

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lku0/d$a;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "Landroid/view/View;", "itemView", "<init>", "(Lku0/d;Landroid/view/View;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class a extends RecyclerView.f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final l f106545a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ d f106546b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(d dVar, View view2) {
            super(view2);
            view2.getClass();
            this.f106546b = dVar;
            this.f106545a = new l(view2);
        }
    }

    public final void A(Long l14, String str) {
        Iterator it = this.f106544c.iterator();
        while (it.hasNext()) {
            ku0.a aVar = (ku0.a) it.next();
            if (s.g(aVar.f106536a, str)) {
                long j8 = aVar.f106539d;
                if (l14 != null && j8 == l14.longValue()) {
                    it.remove();
                }
            }
        }
        notifyDataSetChanged();
    }

    @Override // com.garmin.android.apps.connectmobile.f1
    public final int u() {
        return this.f106544c.size();
    }

    @Override // com.garmin.android.apps.connectmobile.f1
    public final void x(int i14, RecyclerView.f0 f0Var) {
        if (i14 == -1) {
            return;
        }
        a aVar = f0Var instanceof a ? (a) f0Var : null;
        if (aVar != null) {
            l lVar = aVar.f106545a;
            ku0.a aVar2 = (ku0.a) aVar.f106546b.f106544c.get(i14);
            lVar.b(aVar2.f106537b, aVar2.f106538c);
            l.d(lVar, R.drawable.ic_error_circle_small, null, null, 14);
            lVar.e(null);
            lVar.f(aVar2.f106540e);
        }
    }

    @Override // com.garmin.android.apps.connectmobile.f1
    public final RecyclerView.f0 z(ViewGroup viewGroup, int i14) {
        viewGroup.getClass();
        return new a(this, j.b(viewGroup, R.layout.gcm_row_item, viewGroup, false));
    }
}
