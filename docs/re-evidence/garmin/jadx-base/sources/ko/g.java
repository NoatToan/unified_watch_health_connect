package ko;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.garmin.android.apps.connectmobile.R;
import e23.p;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000eB9\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lko/g;", "Landroidx/recyclerview/widget/RecyclerView$h;", "Lko/g$a;", "", "Lko/e;", "rowUIModelList", "", "resetCheckBoxes", "Lkotlin/Function2;", "", "", "onRowChecked", "<init>", "(Ljava/util/List;ZLe23/p;)V", "a", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class g extends RecyclerView.h<a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List<e> f105717a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f105718b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p<Integer, Boolean, Unit> f105719c;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lko/g$a;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "Landroid/view/View;", "view", "<init>", "(Landroid/view/View;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a extends RecyclerView.f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final View f105720a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final CheckBox f105721b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final TextView f105722c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final TextView f105723d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final TextView f105724e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(View view2) {
            super(view2);
            view2.getClass();
            this.f105720a = view2;
            View viewFindViewById = view2.findViewById(R.id.check_box);
            viewFindViewById.getClass();
            this.f105721b = (CheckBox) viewFindViewById;
            View viewFindViewById2 = view2.findViewById(R.id.label_right);
            viewFindViewById2.getClass();
            this.f105722c = (TextView) viewFindViewById2;
            View viewFindViewById3 = view2.findViewById(R.id.label_top);
            viewFindViewById3.getClass();
            this.f105723d = (TextView) viewFindViewById3;
            View viewFindViewById4 = view2.findViewById(R.id.label_bottom);
            viewFindViewById4.getClass();
            this.f105724e = (TextView) viewFindViewById4;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public g(List<e> list, boolean z14, p<? super Integer, ? super Boolean, Unit> pVar) {
        list.getClass();
        pVar.getClass();
        this.f105717a = list;
        this.f105718b = z14;
        this.f105719c = pVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final int getItemCount() {
        return this.f105717a.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void onBindViewHolder(RecyclerView.f0 f0Var, int i14) {
        a aVar = (a) f0Var;
        aVar.getClass();
        aVar.f105723d.setText(this.f105717a.get(i14).f105710c);
        aVar.f105724e.setText(this.f105717a.get(i14).f105711d);
        aVar.f105722c.setText(this.f105717a.get(i14).f105712e);
        boolean z14 = this.f105718b;
        CheckBox checkBox = aVar.f105721b;
        if (z14) {
            checkBox.setOnCheckedChangeListener(null);
            checkBox.setChecked(false);
            this.f105717a.get(i14).f105713f = false;
        } else {
            checkBox.setOnCheckedChangeListener(null);
            checkBox.setChecked(this.f105717a.get(i14).f105713f);
        }
        checkBox.setOnCheckedChangeListener(new f(this, i14, 0));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final RecyclerView.f0 onCreateViewHolder(ViewGroup viewGroup, int i14) {
        viewGroup.getClass();
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.edit_interval_row, viewGroup, false);
        viewInflate.getClass();
        return new a(viewInflate);
    }

    public /* synthetic */ g(List list, boolean z14, p pVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this(list, (i14 & 2) != 0 ? false : z14, pVar);
    }
}
