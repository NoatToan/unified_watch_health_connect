package qt0;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.j;
import androidx.lifecycle.n0;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y0;
import androidx.lifecycle.y1;
import androidx.lifecycle.z0;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.leaderboard.model.ConnectionLeaderBoardDTO;
import com.garmin.android.apps.connectmobile.leaderboard.model.MetricsMapDTO;
import com.garmin.android.apps.connectmobile.o0;
import e23.l;
import fw.p;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.TreeMap;
import mt0.k4;
import mt0.p3;
import o13.h;
import o13.m;
import o13.n;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.bundle.GetViewModelKt;
import org.koin.core.qualifier.Qualifier;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import p005kotlin.jvm.internal.w;
import p13.c0;
import p13.x;
import pt0.j0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lqt0/c;", "Lcom/garmin/android/apps/connectmobile/o0;", "<init>", "()V", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class c extends o0 {
    public ConnectionLeaderBoardDTO A;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public TextView f147468z;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final w1 f147465w = new w1(s0.f105811a.b(j0.class), new C2774c(this), new e(this), new d(null, this));

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Object f147466x = m.a(n.NONE, new g(this, null, new f(this), null, null));

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final ArrayList f147467y = new ArrayList();
    public String B = "";

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f147469a;

        static {
            int[] iArr = new int[p.values().length];
            try {
                iArr[p.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[p.ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[p.LOADING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f147469a = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b implements z0, p005kotlin.jvm.internal.n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f147470a;

        public b(l lVar) {
            lVar.getClass();
            this.f147470a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof p005kotlin.jvm.internal.n)) {
                return s.g(getFunctionDelegate(), ((p005kotlin.jvm.internal.n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final h<?> getFunctionDelegate() {
            return this.f147470a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f147470a.invoke(obj);
        }
    }

    /* JADX INFO: renamed from: qt0.c$c, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/y1;", "invoke", "()Landroidx/lifecycle/y1;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class C2774c extends w implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f147471a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2774c(Fragment fragment) {
            super(0);
            this.f147471a = fragment;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f147471a.requireActivity().getF189591b();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class d extends w implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f147472a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Fragment f147473b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(e23.a aVar, Fragment fragment) {
            super(0);
            this.f147472a = aVar;
            this.f147473b = fragment;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f147472a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f147473b.requireActivity().getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/x1$c;", "invoke", "()Landroidx/lifecycle/x1$c;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class e extends w implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f147474a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Fragment fragment) {
            super(0);
            this.f147474a = fragment;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f147474a.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class f implements e23.a<Fragment> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f147475a;

        public f(Fragment fragment) {
            this.f147475a = fragment;
        }

        @Override // e23.a
        public final Fragment invoke() {
            return this.f147475a;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class g implements e23.a<p3> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f147476a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f147477b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f147478c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ e23.a f147479d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ e23.a f147480e;

        public g(Fragment fragment, Qualifier qualifier, e23.a aVar, e23.a aVar2, e23.a aVar3) {
            this.f147476a = fragment;
            this.f147477b = qualifier;
            this.f147478c = aVar;
            this.f147479d = aVar2;
            this.f147480e = aVar3;
        }

        /* JADX WARN: Type inference failed for: r0v5, types: [androidx.lifecycle.u1, mt0.p3] */
        @Override // e23.a
        public final p3 invoke() {
            CreationExtras defaultViewModelCreationExtras;
            y1 f189591b = ((ViewModelStoreOwner) this.f147478c.invoke()).getF189591b();
            Fragment fragment = this.f147476a;
            e23.a aVar = this.f147479d;
            if (aVar == null || (defaultViewModelCreationExtras = (CreationExtras) aVar.invoke()) == null) {
                defaultViewModelCreationExtras = fragment.getDefaultViewModelCreationExtras();
                defaultViewModelCreationExtras.getClass();
            }
            return GetViewModelKt.resolveViewModel$default(s0.f105811a.b(p3.class), f189591b, null, defaultViewModelCreationExtras, this.f147477b, AndroidKoinScopeExtKt.getKoinScope(fragment), this.f147480e, 4, null);
        }
    }

    @Override // com.garmin.android.apps.connectmobile.o0
    public final void I6() {
        U6().f(getViewLifecycleOwner(), new b(new qt0.b(this, 0)));
    }

    public abstract qt0.a T6();

    public abstract j U6();

    public abstract String V6();

    public final j0 X6() {
        return (j0) this.f147465w.getValue();
    }

    public abstract void Y6(List<? extends MetricsMapDTO> list);

    public final void c7() {
        MetricsMapDTO[] metricsMapDTOArr;
        int count;
        if (isAdded()) {
            ArrayList arrayList = this.f147467y;
            arrayList.clear();
            ConnectionLeaderBoardDTO connectionLeaderBoardDTO = this.A;
            if (connectionLeaderBoardDTO == null || (metricsMapDTOArr = connectionLeaderBoardDTO.f38024d) == null) {
                Y6(p13.j0.f134944a);
                return;
            }
            ArrayList arrayListM = x.m(Arrays.copyOf(metricsMapDTOArr, metricsMapDTOArr.length));
            c0.u(arrayListM, new a61.c(new q51.a(21), 18));
            TreeMap treeMap = new TreeMap();
            Iterator it = arrayListM.iterator();
            while (true) {
                count = 0;
                if (!it.hasNext()) {
                    break;
                }
                MetricsMapDTO metricsMapDTO = (MetricsMapDTO) it.next();
                int i14 = metricsMapDTO.f38033a;
                if (treeMap.get(Integer.valueOf(i14)) == null) {
                    treeMap.put(Integer.valueOf(i14), new ArrayList());
                }
                if (s.g(metricsMapDTO.f38035c.f31696b, "")) {
                    List list = (List) treeMap.get(Integer.valueOf(i14));
                    if (list != null) {
                        list.add(0, metricsMapDTO);
                    }
                } else if (s.g(this.B, metricsMapDTO.f38035c.f31696b) || metricsMapDTO.f38034b != 0.0d) {
                    List list2 = (List) treeMap.get(Integer.valueOf(i14));
                    if (list2 != null) {
                        list2.add(metricsMapDTO);
                    }
                }
            }
            Iterator it3 = treeMap.keySet().iterator();
            while (it3.hasNext()) {
                Object obj = treeMap.get(Integer.valueOf(((Number) it3.next()).intValue()));
                obj.getClass();
                arrayList.addAll((Collection) obj);
            }
            int size = arrayListM.size() - arrayList.size();
            TextView textView = this.f147468z;
            if (size != 0) {
                if (textView == null) {
                    s.m("mLeaderboardFooterView");
                    throw null;
                }
                textView.setVisibility(0);
                TextView textView2 = this.f147468z;
                if (textView2 == null) {
                    s.m("mLeaderboardFooterView");
                    throw null;
                }
                textView2.setText(getString(R.string.leaderboard_footer_no_synced_data, Integer.valueOf(size), V6()));
            } else {
                if (textView == null) {
                    s.m("mLeaderboardFooterView");
                    throw null;
                }
                textView.setVisibility(8);
            }
            Y6(arrayList);
            ListAdapter listAdapter = this.f7310d;
            int size2 = arrayList.size();
            int i15 = 0;
            while (true) {
                if (i15 >= size2) {
                    i15 = -1;
                    break;
                }
                com.garmin.android.apps.connectmobile.connections.model.c cVar = ((MetricsMapDTO) arrayList.get(i15)).f38035c;
                if (s.g(cVar != null ? cVar.f31696b : null, "")) {
                    break;
                } else {
                    i15++;
                }
            }
            if (i15 >= 0) {
                listAdapter.getClass();
                count = i15 >= listAdapter.getCount() ? listAdapter.getCount() - 1 : i15;
            }
            u6();
            this.f7311e.setSelection(count);
        }
    }

    public final void d7() {
        Integer numValueOf = Integer.valueOf(this.f147467y.size());
        ConnectionLeaderBoardDTO connectionLeaderBoardDTO = this.A;
        if ((connectionLeaderBoardDTO != null ? connectionLeaderBoardDTO.f38024d : null) == null) {
            numValueOf = null;
        }
        K6(numValueOf != null ? numValueOf.intValue() : 0);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        if (this.A == null) {
            w6(T6());
        } else {
            c7();
            d7();
        }
    }

    @Override // com.garmin.android.apps.connectmobile.o0, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            String string = arguments.getString("GCM_userDisplayName", "");
            string.getClass();
            this.B = string;
        }
    }

    @Override // com.garmin.android.apps.connectmobile.o0, androidx.fragment.app.n0, androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        u6();
        ListView listView = this.f7311e;
        listView.getClass();
        listView.setDividerHeight(0);
        View viewInflate = LayoutInflater.from(getContext()).inflate(R.layout.gcm3_leaderboard_list_footer_layout, (ViewGroup) listView, false);
        viewInflate.getClass();
        TextView textView = (TextView) viewInflate;
        this.f147468z = textView;
        listView.addFooterView(textView, null, false);
        y0<k4> y0Var = X6().f140718d;
        n0 viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        dh.b.L(y0Var, viewLifecycleOwner, new b(new qt0.b(this, 1)));
    }
}
