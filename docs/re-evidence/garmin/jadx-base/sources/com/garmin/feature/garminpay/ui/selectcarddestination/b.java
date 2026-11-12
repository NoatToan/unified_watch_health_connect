package com.garmin.feature.garminpay.ui.selectcarddestination;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.s;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.m;
import androidx.lifecycle.b0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import br2.e;
import br2.f;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.feature.garminpay.ui.common.GenericHelpPageActivity;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p13.j0;
import p13.y;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/feature/garminpay/ui/selectcarddestination/b;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "a", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b extends Fragment {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f52162c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public e f52163a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List<f> f52164b = j0.f134944a;

    /* JADX INFO: renamed from: com.garmin.feature.garminpay.ui.selectcarddestination.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/feature/garminpay/ui/selectcarddestination/b$b", "Landroidx/core/view/s;", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C1102b implements s {
        public C1102b() {
        }

        @Override // androidx.core.view.s
        public final void Y3(Menu menu, MenuInflater menuInflater) {
            zl.a.f(menu, menuInflater, R.menu.menu_gp_help, menu);
        }

        @Override // androidx.core.view.s
        public final boolean w5(MenuItem menuItem) {
            menuItem.getClass();
            if (menuItem.getItemId() != R.id.menu_item_help) {
                return false;
            }
            a aVar = b.f52162c;
            b bVar = b.this;
            bVar.getClass();
            GenericHelpPageActivity.a aVar2 = GenericHelpPageActivity.f51857k;
            m activity = bVar.getActivity();
            activity.getClass();
            GenericHelpPageActivity.b bVar2 = GenericHelpPageActivity.b.WATCH_NOT_SHOWN;
            aVar2.getClass();
            GenericHelpPageActivity.a.a(activity, bVar2);
            return true;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Iterable<Parcelable> iterableAsList;
        Parcelable[] parcelableArray;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments == null || (parcelableArray = arguments.getParcelableArray("DeviceListBundleKey")) == null) {
            iterableAsList = j0.f134944a;
        } else {
            iterableAsList = Arrays.asList(parcelableArray);
            iterableAsList.getClass();
        }
        ArrayList arrayList = new ArrayList(y.r(iterableAsList, 10));
        for (Parcelable parcelable : iterableAsList) {
            parcelable.getClass();
            arrayList.add((f) parcelable);
        }
        this.f52164b = arrayList;
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        e eVar = new e(contextRequireContext, true);
        this.f52163a = eVar;
        eVar.f19596d = new qw0.y(this, 24);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        return layoutInflater.inflate(R.layout.fragment_select_watch, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        g22.e.k(this, new C1102b(), b0.b.RESUMED);
        RecyclerView recyclerView = (RecyclerView) view2.findViewById(R.id.device_list_recycler_view);
        if (recyclerView != null) {
            recyclerView.setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
        }
        if (recyclerView != null) {
            recyclerView.setAdapter(this.f52163a);
        }
        e eVar = this.f52163a;
        if (eVar != null) {
            List<f> list = this.f52164b;
            eVar.f19597e = list;
            eVar.t(list);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/feature/garminpay/ui/selectcarddestination/b$a;", "", "<init>", "()V", "", "DEVICE_LIST_BUNDLE_KEY", "Ljava/lang/String;", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
