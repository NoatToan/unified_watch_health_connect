package zo;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.widget.ViewPager2;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0001\fBG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lzo/j;", "", "Landroid/view/View;", "rootView", "", "legIndex", "Lkotlin/Function1;", "", "divideCallback", "deleteCallback", "<init>", "(Landroid/view/View;ILe23/l;Le23/l;)V", "a", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f206038a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f206039b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e23.l<Integer, Unit> f206040c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e23.l<Integer, Unit> f206041d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final TextView f206042e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final h32.n.b f206043f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final h32.n.b f206044g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final h32.n.b f206045h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final h32.n.b f206046i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Button f206047j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Button f206048k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final TabLayout f206049l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ViewPager2 f206050m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public TabLayoutMediator f206051n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Boolean f206052o;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lzo/j$a;", "Lhe/a;", "", "showDistanceTab", "<init>", "(Lzo/j;Z)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class a extends he.a {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final boolean f206053j;

        /* JADX WARN: Illegal instructions before constructor call */
        public a(boolean z14) {
            View view2 = j.this.f206038a;
            Fragment fragmentI = androidx.fragment.app.v.I(view2);
            if (fragmentI == null) {
                kg.f.o("View ", view2, " does not have a Fragment set");
                throw null;
            }
            super(fragmentI);
            this.f206053j = z14;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public final int getItemCount() {
            return this.f206053j ? 2 : 1;
        }

        @Override // he.a
        public final Fragment u(int i14) {
            j jVar = j.this;
            if (i14 == 0) {
                t.a aVar = t.f206072l;
                int i15 = jVar.f206039b;
                aVar.getClass();
                Bundle bundle = new Bundle(1);
                bundle.putInt("legIndex", i15);
                t tVar = new t();
                tVar.setArguments(bundle);
                return tVar;
            }
            q.a aVar2 = q.f206067k;
            int i16 = jVar.f206039b;
            aVar2.getClass();
            Bundle bundle2 = new Bundle(1);
            bundle2.putInt("legIndex", i16);
            q qVar = new q();
            qVar.setArguments(bundle2);
            return qVar;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public j(View view2, int i14, e23.l<? super Integer, Unit> lVar, e23.l<? super Integer, Unit> lVar2) {
        view2.getClass();
        this.f206038a = view2;
        this.f206039b = i14;
        this.f206040c = lVar;
        this.f206041d = lVar2;
        View viewFindViewById = view2.findViewById(R.id.leg_type_label);
        viewFindViewById.getClass();
        this.f206042e = (TextView) viewFindViewById;
        k32.q qVar = new k32.q(view2);
        this.f206043f = qVar.f102722c;
        this.f206044g = qVar.f102723d;
        this.f206045h = qVar.f102724e;
        this.f206046i = qVar.f102725f;
        View viewFindViewById2 = view2.findViewById(R.id.leg_divide_button);
        viewFindViewById2.getClass();
        this.f206047j = (Button) viewFindViewById2;
        View viewFindViewById3 = view2.findViewById(R.id.leg_delete_button);
        viewFindViewById3.getClass();
        this.f206048k = (Button) viewFindViewById3;
        View viewFindViewById4 = view2.findViewById(R.id.time_distance_tab_layout);
        viewFindViewById4.getClass();
        this.f206049l = (TabLayout) viewFindViewById4;
        View viewFindViewById5 = view2.findViewById(R.id.time_distance_view_pager);
        viewFindViewById5.getClass();
        this.f206050m = (ViewPager2) viewFindViewById5;
    }

    public /* synthetic */ j(View view2, int i14, e23.l lVar, e23.l lVar2, int i15, p005kotlin.jvm.internal.j jVar) {
        this(view2, i14, (i15 & 4) != 0 ? null : lVar, (i15 & 8) != 0 ? null : lVar2);
    }
}
