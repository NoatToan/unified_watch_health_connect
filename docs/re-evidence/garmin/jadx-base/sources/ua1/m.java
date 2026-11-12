package ua1;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import c22.j0;
import c22.l3;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.f1;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Date;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB\u001b\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lua1/m;", "Lcom/garmin/android/apps/connectmobile/f1;", "Lkotlin/Function1;", "Lab1/m;", "", "itemClickListener", "<init>", "(Le23/l;)V", "a", "gcm-power-guide_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class m extends f1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e23.l<ab1.m, Unit> f169655c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f169656d;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lua1/m$a;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "Landroid/view/View;", "itemView", "<init>", "(Lua1/m;Landroid/view/View;)V", "gcm-power-guide_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class a extends RecyclerView.f0 {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ int f169657e = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f169658a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TextView f169659b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final TextView f169660c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final View f169661d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(m mVar, View view2) {
            super(view2);
            view2.getClass();
            this.f169658a = view2.getContext();
            this.f169659b = (TextView) view2.findViewById(R.id.event_name_text_view);
            this.f169660c = (TextView) view2.findViewById(R.id.event_details_text_view);
            this.f169661d = view2.findViewById(R.id.event_has_pg_text_view);
            view2.setOnClickListener(new u12.e(4, this, mVar));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public m(e23.l<? super ab1.m, Unit> lVar) {
        lVar.getClass();
        this.f169655c = lVar;
        this.f169656d = new ArrayList();
    }

    @Override // com.garmin.android.apps.connectmobile.f1
    /* JADX INFO: renamed from: u */
    public final int getF187301i() {
        return this.f169656d.size();
    }

    @Override // com.garmin.android.apps.connectmobile.f1
    public final void x(int i14, RecyclerView.f0 f0Var) {
        if (i14 == -1) {
            return;
        }
        a aVar = f0Var instanceof a ? (a) f0Var : null;
        if (aVar != null) {
            ab1.m mVar = (ab1.m) this.f169656d.get(i14);
            mVar.getClass();
            aVar.f169659b.setText(mVar.f2606a);
            l3.a aVar2 = l3.f23124b;
            Context context = aVar.f169658a;
            double d14 = mVar.f2607b;
            DecimalFormat decimalFormat = l3.f23129g;
            boolean zY = ((bv.d) KoinJavaComponent.get$default(bv.d.class, null, null, 6, null)).y();
            aVar2.getClass();
            String strQ = l3.a.Q(context, d14, decimalFormat, true, zY);
            LocalDate localDate = mVar.f2608c;
            String str = localDate.getYear() == DateTime.now().getYear() ? "MMM d" : "MMM d, yyyy";
            Date date = localDate.toDate();
            date.getClass();
            aVar.f169660c.setText(aVar.f169658a.getString(R.string.string_space_bullet_string_pattern, strQ, j0.g(date, str, null)));
            View view2 = aVar.f169661d;
            view2.getClass();
            Long l14 = mVar.f2610e;
            v22.e.v(view2, l14 != null && l14.longValue() > 0);
        }
    }

    @Override // com.garmin.android.apps.connectmobile.f1
    public final RecyclerView.f0 z(ViewGroup viewGroup, int i14) {
        viewGroup.getClass();
        return new a(this, n23.j.b(viewGroup, R.layout.scheduled_event_item, viewGroup, false));
    }
}
