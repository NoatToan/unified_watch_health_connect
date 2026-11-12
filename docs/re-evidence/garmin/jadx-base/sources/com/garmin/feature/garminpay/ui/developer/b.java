package com.garmin.feature.garminpay.ui.developer;

import android.os.Bundle;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.m;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.garmin.android.apps.connectmobile.R;
import jr2.f;
import kr2.h;
import n23.j;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import q03.t;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/garmin/feature/garminpay/ui/developer/b;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "b", "a", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b extends Fragment {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C1089b f51982d = new C1089b(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a f51983a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public CharSequence f51984b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f51985c = new c();

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/garmin/feature/garminpay/ui/developer/b$a;", "Landroidx/recyclerview/widget/RecyclerView$h;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "<init>", "()V", "a", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a extends RecyclerView.h<RecyclerView.f0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Pair<String, String>[] f51986a;

        /* JADX INFO: renamed from: com.garmin.feature.garminpay.ui.developer.b$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/garmin/feature/garminpay/ui/developer/b$a$a;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "Landroid/view/View;", "itemView", "<init>", "(Lcom/garmin/feature/garminpay/ui/developer/b$a;Landroid/view/View;)V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public final class C1088a extends RecyclerView.f0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final TextView f51987a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final TextView f51988b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ a f51989c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1088a(a aVar, View view2) {
                super(view2);
                view2.getClass();
                this.f51989c = aVar;
                this.f51987a = (TextView) view2.findViewById(R.id.config_key);
                this.f51988b = (TextView) view2.findViewById(R.id.config_value);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public final int getItemCount() {
            Pair<String, String>[] pairArr = this.f51986a;
            if (pairArr != null) {
                return pairArr.length;
            }
            return 0;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public final void onBindViewHolder(RecyclerView.f0 f0Var, int i14) {
            Pair<String, String>[] pairArr;
            f0Var.getClass();
            if (i14 == -1) {
                return;
            }
            C1088a c1088a = f0Var instanceof C1088a ? (C1088a) f0Var : null;
            if (c1088a == null || (pairArr = c1088a.f51989c.f51986a) == null) {
                return;
            }
            Pair<String, String> pair = pairArr[i14];
            c1088a.f51987a.setText((CharSequence) pair.first);
            c1088a.f51988b.setText((CharSequence) pair.second);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public final RecyclerView.f0 onCreateViewHolder(ViewGroup viewGroup, int i14) {
            viewGroup.getClass();
            return new C1088a(this, j.b(viewGroup, R.layout.remote_config_contents_list_item, viewGroup, false));
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00030\u00020\u0001¨\u0006\u0005"}, d2 = {"com/garmin/feature/garminpay/ui/developer/b$c", "Lq03/t;", "", "Landroid/util/Pair;", "", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c implements t<Pair<String, String>[]> {
        public c() {
        }

        @Override // q03.t
        public final void a(s03.b bVar) {
            bVar.getClass();
        }

        @Override // q03.t
        public final void onError(Throwable th3) {
            th3.getClass();
            a aVar = b.this.f51983a;
            if (aVar == null) {
                s.m("theAdapter");
                throw null;
            }
            aVar.f51986a = new Pair[]{new Pair("ERROR", th3.getLocalizedMessage())};
            aVar.notifyDataSetChanged();
        }

        @Override // q03.t
        public final void onSuccess(Pair<String, String>[] pairArr) {
            Pair<String, String>[] pairArr2 = pairArr;
            pairArr2.getClass();
            a aVar = b.this.f51983a;
            if (aVar == null) {
                s.m("theAdapter");
                throw null;
            }
            aVar.f51986a = pairArr2;
            aVar.notifyDataSetChanged();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        m activity = getActivity();
        activity.getClass();
        i.a supportActionBar = ((DeveloperSettingsActivity) activity).getSupportActionBar();
        if (supportActionBar != null) {
            CharSequence charSequenceF = supportActionBar.f();
            charSequenceF.getClass();
            this.f51984b = charSequenceF;
            supportActionBar.C(h.b.FIREBASE_REMOTE_CONFIG.f106298a);
        }
        return layoutInflater.inflate(R.layout.fragment_remote_config_contents, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        i.a supportActionBar;
        super.onDestroyView();
        m activity = getActivity();
        if (activity == null || activity.isDestroyed() || activity.isFinishing() || (supportActionBar = ((DeveloperSettingsActivity) activity).getSupportActionBar()) == null) {
            return;
        }
        supportActionBar.C(this.f51984b);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        View viewFindViewById = view2.findViewById(R.id.recycler_view);
        viewFindViewById.getClass();
        RecyclerView recyclerView = (RecyclerView) viewFindViewById;
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        a aVar = new a();
        this.f51983a = aVar;
        recyclerView.setAdapter(aVar);
        f fVar = new f(1);
        int i14 = w03.b.f181178a;
        new e13.m(fVar).j(l13.a.f108327b).g(r03.a.a()).a(this.f51985c);
    }

    /* JADX INFO: renamed from: com.garmin.feature.garminpay.ui.developer.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/feature/garminpay/ui/developer/b$b;", "", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C1089b {
        public /* synthetic */ C1089b(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private C1089b() {
        }
    }
}
