package ko;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import aq.b0;
import com.garmin.android.apps.connectmobile.R;
import e23.l;
import i3.e5;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import qs.n;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\rB3\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lko/c;", "Landroidx/recyclerview/widget/RecyclerView$h;", "Lko/c$a;", "", "", "intervalList", "", "isRunningActivityType", "Lkotlin/Function1;", "", "onIntervalSelected", "<init>", "(Ljava/util/List;Ljava/lang/Boolean;Le23/l;)V", "a", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c extends RecyclerView.h<a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<String> f105702a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Boolean f105703b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l<String, Unit> f105704c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Context f105705d;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lko/c$a;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "Landroid/view/View;", "itemView", "<init>", "(Landroid/view/View;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a extends RecyclerView.f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TextView f105706a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(View view2) {
            Resources resources;
            super(view2);
            view2.getClass();
            Context context = view2.getContext();
            Integer numValueOf = (context == null || (resources = context.getResources()) == null) ? null : Integer.valueOf((int) resources.getDimension(R.dimen.spacing_normal));
            View viewFindViewById = view2.findViewById(android.R.id.text1);
            TextView textView = (TextView) viewFindViewById;
            textView.setTextColor(a7.b.getColor(view2.getContext(), R.color.gcm_text_primary));
            textView.setTextSize(0, view2.getContext().getResources().getDimension(R.dimen.andfont_h_3));
            numValueOf.getClass();
            textView.setPadding(numValueOf.intValue(), numValueOf.intValue(), numValueOf.intValue(), numValueOf.intValue());
            viewFindViewById.getClass();
            this.f105706a = (TextView) viewFindViewById;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c(List<String> list, Boolean bool, l<? super String, Unit> lVar) {
        list.getClass();
        lVar.getClass();
        this.f105702a = list;
        this.f105703b = bool;
        this.f105704c = lVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final int getItemCount() {
        return this.f105702a.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void onBindViewHolder(RecyclerView.f0 f0Var, int i14) {
        a aVar = (a) f0Var;
        aVar.getClass();
        TextView textView = aVar.f105706a;
        List<String> list = this.f105702a;
        if (s.g(list.get(i14), "CANCEL")) {
            Context context = this.f105705d;
            textView.setText(context != null ? context.getString(R.string.lbl_cancel) : null);
        } else {
            n.a aVar2 = n.f147118b;
            String str = list.get(i14);
            aVar2.getClass();
            n nVarA = n.a.a(str);
            Context context2 = this.f105705d;
            textView.setText(context2 != null ? context2.getString(nVarA.f147128a) : null);
            if (s.g(list.get(i14), "ACTIVE") && s.g(this.f105703b, Boolean.FALSE)) {
                Context context3 = this.f105705d;
                textView.setText(context3 != null ? context3.getString(R.string.lbl_bike) : null);
            }
        }
        textView.setOnClickListener(new b0(this, i14, 12));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final RecyclerView.f0 onCreateViewHolder(ViewGroup viewGroup, int i14) {
        View viewE = e5.e(viewGroup, android.R.layout.simple_list_item_1, viewGroup, false);
        this.f105705d = viewGroup.getContext();
        viewE.getClass();
        return new a(viewE);
    }
}
