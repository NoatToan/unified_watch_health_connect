package po;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.garmin.android.apps.connectmobile.R;
import i3.e5;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\rB/\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0018\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0006¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lpo/a0;", "Landroidx/recyclerview/widget/RecyclerView$h;", "Lpo/a0$a;", "", "Lqw0/u;", "switchConfigs", "Lkotlin/Function2;", "Lqw0/v;", "", "", "onSwitchChanged", "<init>", "(Ljava/util/List;Le23/p;)V", "a", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a0 extends RecyclerView.h<a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<qw0.u> f138815a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e23.p<qw0.v, Boolean, Unit> f138816b;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lpo/a0$a;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "Landroid/view/View;", "itemView", "<init>", "(Lpo/a0;Landroid/view/View;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class a extends RecyclerView.f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TextView f138817a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final SwitchCompat f138818b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(a0 a0Var, View view2) {
            super(view2);
            view2.getClass();
            View viewFindViewById = view2.findViewById(R.id.text_view);
            viewFindViewById.getClass();
            this.f138817a = (TextView) viewFindViewById;
            View viewFindViewById2 = view2.findViewById(R.id.switch_view);
            viewFindViewById2.getClass();
            this.f138818b = (SwitchCompat) viewFindViewById2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a0(List<qw0.u> list, e23.p<? super qw0.v, ? super Boolean, Unit> pVar) {
        list.getClass();
        pVar.getClass();
        this.f138815a = list;
        this.f138816b = pVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final int getItemCount() {
        return this.f138815a.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void onBindViewHolder(RecyclerView.f0 f0Var, int i14) {
        CharSequence charSequenceA;
        a aVar = (a) f0Var;
        aVar.getClass();
        Context context = aVar.itemView.getContext();
        qw0.u uVar = this.f138815a.get(i14);
        Integer num = uVar.f148351d;
        boolean z14 = uVar.f148350c;
        if (num == null || (charSequenceA = context.getText(num.intValue())) == null) {
            context.getClass();
            charSequenceA = dh.b.A(context, uVar.f148348a.f148365a);
        }
        TextView textView = aVar.f138817a;
        textView.setText(charSequenceA);
        textView.setEnabled(z14);
        textView.setOnClickListener(new oq.a(aVar, 3));
        SwitchCompat switchCompat = aVar.f138818b;
        switchCompat.setChecked(uVar.f148349b);
        switchCompat.setEnabled(z14);
        switchCompat.setContentDescription(charSequenceA);
        switchCompat.setOnCheckedChangeListener(new ko.f(this, i14, 1));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final RecyclerView.f0 onCreateViewHolder(ViewGroup viewGroup, int i14) {
        View viewE = e5.e(viewGroup, R.layout.list_row_toggle_switch, viewGroup, false);
        viewE.getClass();
        return new a(this, viewE);
    }
}
