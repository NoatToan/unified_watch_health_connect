package va1;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.f1;
import java.util.ArrayList;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB\u001d\u0012\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lva1/m;", "Lcom/garmin/android/apps/connectmobile/f1;", "Lkotlin/Function1;", "Lab1/l;", "", "selectionChangedListener", "<init>", "(Le23/l;)V", "a", "gcm-power-guide_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class m extends f1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e23.l<ab1.l, Unit> f176637c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f176638d = new ArrayList();

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lva1/m$a;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "Landroid/view/View;", "itemView", "<init>", "(Lva1/m;Landroid/view/View;)V", "gcm-power-guide_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class a extends RecyclerView.f0 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int f176639c = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ImageView f176640a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TextView f176641b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(m mVar, View view2) {
            super(view2);
            view2.getClass();
            this.f176640a = (ImageView) view2.findViewById(R.id.icon);
            this.f176641b = (TextView) view2.findViewById(R.id.label);
            view2.setOnClickListener(new u12.e(18, this, mVar));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public m(e23.l<? super ab1.l, Unit> lVar) {
        this.f176637c = lVar;
    }

    @Override // com.garmin.android.apps.connectmobile.f1
    public final int u() {
        return this.f176638d.size();
    }

    @Override // com.garmin.android.apps.connectmobile.f1
    public final void x(int i14, RecyclerView.f0 f0Var) {
        if (i14 == -1) {
            return;
        }
        a aVar = f0Var instanceof a ? (a) f0Var : null;
        if (aVar != null) {
            ab1.l lVar = (ab1.l) this.f176638d.get(i14);
            lVar.getClass();
            ImageView imageView = aVar.f176640a;
            imageView.setImageResource(lVar.f2604c);
            Context context = imageView.getContext();
            context.getClass();
            int iC = (int) c22.b.c(context, imageView.getResources().getDimensionPixelSize(R.dimen.icon_large), 1.5f);
            imageView.getLayoutParams().width = iC;
            imageView.getLayoutParams().height = iC;
            aVar.f176641b.setText(lVar.f2605d);
        }
    }

    @Override // com.garmin.android.apps.connectmobile.f1
    public final RecyclerView.f0 z(ViewGroup viewGroup, int i14) {
        viewGroup.getClass();
        return new a(this, n23.j.b(viewGroup, R.layout.power_guide_one_line_item_with_icon, viewGroup, false));
    }
}
