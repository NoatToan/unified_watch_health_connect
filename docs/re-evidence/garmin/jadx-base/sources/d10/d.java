package d10;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatButton;
import androidx.compose.ui.platform.ComposeView;
import androidx.core.view.s;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.b0;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.connectiq.x;
import cw1.p0;
import l72.p2;
import p005kotlin.Metadata;
import p3.m;
import p3.n;
import p3.x1;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Ld10/d;", "T", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class d<T> extends Fragment {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public MenuItem f57030a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public c<T> f57031b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ComposeView f57032c;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"d10/d$a", "Landroidx/core/view/s;", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a implements s {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ d<T> f57033a;

        public a(d<T> dVar) {
            this.f57033a = dVar;
        }

        @Override // androidx.core.view.s
        public final void Y3(Menu menu, MenuInflater menuInflater) {
            zl.a.f(menu, menuInflater, R.menu.filter_menu, menu);
            MenuItem menuItemFindItem = menu.findItem(R.id.reset);
            d<T> dVar = this.f57033a;
            dVar.f57030a = menuItemFindItem;
            if (menuItemFindItem != null) {
                c<T> cVar = dVar.f57031b;
                menuItemFindItem.setEnabled(!(cVar != null ? cVar.g8() : true));
            }
        }

        @Override // androidx.core.view.s
        public final boolean w5(MenuItem menuItem) {
            menuItem.getClass();
            if (menuItem.getItemId() != R.id.reset) {
                return false;
            }
            d<T> dVar = this.f57033a;
            MenuItem menuItem2 = dVar.f57030a;
            if (menuItem2 != null) {
                menuItem2.setEnabled(false);
            }
            c<T> cVar = dVar.f57031b;
            if (cVar != null) {
                cVar.N3();
            }
            dVar.w6();
            return true;
        }
    }

    /* JADX WARN: Code duplicated, block: B:6:0x0030  */
    public static void u6(String str, String str2, e23.a aVar, m mVar) {
        str.getClass();
        aVar.getClass();
        mVar.C(-883969955);
        x1 x1Var = n.f135158a;
        p2 p2Var = p2.f111205a;
        z3.e eVarC = z3.f.c(1402886661, new c40.i(str, str2, 2), mVar);
        boolean zB = mVar.B(aVar);
        Object objQ = mVar.q();
        if (zB) {
            objQ = new p0(aVar, 8);
            mVar.K(objQ);
        } else {
            m.f135153a.getClass();
            if (objQ == m.a.f135155b) {
                objQ = new p0(aVar, 8);
                mVar.K(objQ);
            }
        }
        p2Var.f(null, eVarC, null, false, false, null, (e23.a) objQ, mVar, 48, 61);
        mVar.f();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        context.getClass();
        super.onAttach(context);
        if (context instanceof c) {
            this.f57031b = (c) context;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(R.layout.filter_fragment, viewGroup, false);
        layoutInflater.inflate(R.layout.fragment_composable_container, viewGroup2, true);
        return viewGroup2;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        a aVar = new a(this);
        androidx.fragment.app.m mVarRequireActivity = requireActivity();
        mVarRequireActivity.getClass();
        mVarRequireActivity.addMenuProvider(aVar, getViewLifecycleOwner(), b0.b.RESUMED);
        this.f57032c = (ComposeView) view2.findViewById(R.id.composable_container);
        View viewFindViewById = view2.findViewById(R.id.apply);
        viewFindViewById.getClass();
        ((AppCompatButton) viewFindViewById).setOnClickListener(new x(this, 12));
        w6();
    }

    public final T v6() {
        T tO;
        c<T> cVar = this.f57031b;
        if (cVar != null && (tO = cVar.O()) != null) {
            return tO;
        }
        vb.h.z("FilterDataListener is not set");
        return null;
    }

    public abstract void w6();
}
