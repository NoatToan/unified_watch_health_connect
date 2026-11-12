package com.garmin.android.apps.connectmobile.workouts.presentation.msn;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.appcompat.widget.SearchView;
import androidx.compose.ui.platform.ComposeView;
import androidx.lifecycle.b0;
import androidx.lifecycle.x1;
import androidx.lifecycle.y0;
import androidx.lifecycle.z0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import c22.l3;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.k1;
import com.garmin.android.apps.connectmobile.m0;
import com.garmin.android.apps.connectmobile.s2;
import com.garmin.android.apps.connectmobile.workouts.data.model.n;
import com.garmin.android.apps.connectmobile.workouts.data.model.r;
import com.garmin.android.apps.connectmobile.workouts.data.model.s;
import com.garmin.android.apps.connectmobile.workouts.data.model.u;
import com.garmin.android.apps.connectmobile.workouts.presentation.msn.filter.MSNWorkoutFilterActivity;
import i3.bf;
import i62.h;
import i62.i;
import i62.j;
import i62.l;
import i62.o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lc.u0;
import m52.k;
import o13.m;
import o13.p;
import o13.t;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s0;
import p13.h0;
import p13.j0;
import p13.w;
import p13.x;
import p13.y;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0002\u0006\u0007B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/workouts/presentation/msn/b;", "Lcom/garmin/android/apps/connectmobile/m0;", "Landroidx/appcompat/widget/SearchView$m;", "", "<init>", "()V", "a", "b", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b extends m0 implements SearchView.m {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final a f49484x = new a(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public s2 f49485h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ComposeView f49486i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public o f49487j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public SearchView f49488k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f49489l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Boolean f49490m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f49491n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public s f49492o;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public j62.d f49494q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public l f49495r;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Object f49493p = j0.f134944a;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final f f49496t = new f();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final t f49497v = m.b(new i(this, 0));

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final t f49498w = m.b(new i(this, 1));

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.workouts.presentation.msn.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b¢\u0004\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/workouts/presentation/msn/b$b;", "Landroidx/lifecycle/z0;", "Lfw/m;", "Lcom/garmin/android/apps/connectmobile/workouts/data/model/s;", "<init>", "(Lcom/garmin/android/apps/connectmobile/workouts/presentation/msn/b;)V", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public abstract class AbstractC0971b implements z0<fw.m<? extends s>> {
        public AbstractC0971b() {
        }

        public final void a() {
            b bVar = b.this;
            bVar.f49492o = null;
            j62.d dVar = bVar.f49494q;
            if (dVar == null) {
                p005kotlin.jvm.internal.s.m("filterData");
                throw null;
            }
            j0 j0Var = j0.f134944a;
            j0Var.getClass();
            dVar.f97409a = j0Var;
            j62.d dVar2 = bVar.f49494q;
            if (dVar2 == null) {
                p005kotlin.jvm.internal.s.m("filterData");
                throw null;
            }
            dVar2.f97411c = j0Var;
            if (dVar2 == null) {
                p005kotlin.jvm.internal.s.m("filterData");
                throw null;
            }
            dVar2.f97410b = j0Var;
            androidx.fragment.app.m activity = bVar.getActivity();
            if (activity != null) {
                activity.invalidateOptionsMenu();
            }
            SearchView searchView = bVar.f49488k;
            if (searchView != null) {
                v22.e.b(searchView);
            }
            a2 a2Var = a2.WORKOUTS;
            i2.f36769a.getClass();
            i2.a.k(a2Var, "MSNWorkoutListFragment", "Showing error screen");
            bVar.f49493p = j0Var;
            ComposeView composeView = bVar.f49486i;
            if (composeView == null) {
                p005kotlin.jvm.internal.s.m("errorBannerView");
                throw null;
            }
            composeView.setVisibility(8);
            o oVar = bVar.f49487j;
            if (oVar != null) {
                oVar.r(w.c(new n.a(2131232244, R.string.msg_workouts_unknown_error)));
            } else {
                p005kotlin.jvm.internal.s.m("adapter");
                throw null;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r8v0 */
        /* JADX WARN: Type inference failed for: r8v1 */
        /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Object, java.util.List<o13.p<java.lang.String, java.lang.String>>] */
        /* JADX WARN: Type inference failed for: r8v5, types: [p13.j0] */
        /* JADX WARN: Type inference failed for: r8v7, types: [java.util.ArrayList] */
        public final void b(s sVar) throws Throwable {
            ?? arrayList;
            List<p<String, String>> listN0;
            if (sVar != null) {
                b bVar = b.this;
                bVar.f49492o = sVar;
                j62.d dVar = bVar.f49494q;
                if (dVar == null) {
                    p005kotlin.jvm.internal.s.m("filterData");
                    throw null;
                }
                com.garmin.android.apps.connectmobile.workouts.data.model.e difficulties = sVar.getDifficulties();
                if (difficulties != null) {
                    List<String> listK = x.k("BEGINNER", "INTERMEDIATE", "ADVANCED");
                    arrayList = new ArrayList();
                    for (String str : listK) {
                        String strB = difficulties.b(str);
                        p pVar = strB != null ? new p(str, strB) : null;
                        if (pVar != null) {
                            arrayList.add(pVar);
                        }
                    }
                } else {
                    arrayList = 0;
                }
                if (arrayList == 0) {
                    arrayList = j0.f134944a;
                }
                arrayList.getClass();
                dVar.f97409a = arrayList;
                bv.b.f21239a.getClass();
                bv.b.a();
                if (k1.f37122a.e()) {
                    Context contextRequireContext = bVar.requireContext();
                    contextRequireContext.getClass();
                    zw1.b bVar2 = new zw1.b(new l22.a(contextRequireContext));
                    j62.d dVar2 = bVar.f49494q;
                    if (dVar2 == null) {
                        p005kotlin.jvm.internal.s.m("filterData");
                        throw null;
                    }
                    List<p<String, String>> listA = bVar2.a(sVar.g());
                    listA.getClass();
                    dVar2.f97410b = listA;
                } else {
                    j62.d dVar3 = bVar.f49494q;
                    if (dVar3 == null) {
                        p005kotlin.jvm.internal.s.m("filterData");
                        throw null;
                    }
                    com.garmin.android.apps.connectmobile.workouts.data.model.t muscleGroups = sVar.getMuscleGroups();
                    if (muscleGroups != null) {
                        List<String> listK2 = x.k("ARMS", "BICEPS", "TRICEPS", "TOTAL_BODY", "LOWER_BODY", "CHEST", "BACK", "SHOULDERS", "ABS", "QUADS", "HAMSTRINGS", "GLUTES");
                        ArrayList arrayList2 = new ArrayList();
                        for (String str2 : listK2) {
                            String strB2 = muscleGroups.b(str2);
                            p pVar2 = strB2 != null ? new p(str2, strB2) : null;
                            if (pVar2 != null) {
                                arrayList2.add(pVar2);
                            }
                        }
                        listN0 = h0.N0(arrayList2, new u());
                    } else {
                        listN0 = null;
                    }
                    if (listN0 == null) {
                        listN0 = j0.f134944a;
                    }
                    listN0.getClass();
                    dVar3.f97410b = listN0;
                }
                j62.d dVar4 = bVar.f49494q;
                if (dVar4 == null) {
                    p005kotlin.jvm.internal.s.m("filterData");
                    throw null;
                }
                com.garmin.android.apps.connectmobile.workouts.data.model.i goals = sVar.getGoals();
                List<p<String, String>> listB = goals != null ? goals.b() : null;
                if (listB == null) {
                    listB = j0.f134944a;
                }
                listB.getClass();
                dVar4.f97411c = listB;
                j62.d dVar5 = bVar.f49494q;
                if (dVar5 == null) {
                    p005kotlin.jvm.internal.s.m("filterData");
                    throw null;
                }
                List<String> listH = sVar.h();
                if (listH == null) {
                    listH = j0.f134944a;
                }
                listH.getClass();
                dVar5.f97412d = listH;
                androidx.fragment.app.m activity = bVar.getActivity();
                if (activity != null) {
                    activity.invalidateOptionsMenu();
                }
                SearchView searchView = bVar.f49488k;
                if (searchView != null) {
                    v22.e.b(searchView);
                }
                bVar.J6(null);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/workouts/presentation/msn/b$c", "Landroid/content/BroadcastReceiver;", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c extends BroadcastReceiver {
        public c() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            a aVar = b.f49484x;
            b.this.I6();
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/workouts/presentation/msn/b$d", "Landroidx/core/view/s;", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class d implements androidx.core.view.s {
        public d() {
        }

        @Override // androidx.core.view.s
        public final void Y3(Menu menu, MenuInflater menuInflater) {
            menu.getClass();
            menuInflater.getClass();
            menuInflater.inflate(R.menu.msn_workouts_menu, menu);
            MenuItem menuItemFindItem = menu.findItem(R.id.menu_item_search);
            View actionView = menuItemFindItem != null ? menuItemFindItem.getActionView() : null;
            actionView.getClass();
            SearchView searchView = (SearchView) actionView;
            b bVar = b.this;
            bVar.f49488k = searchView;
            searchView.setMaxWidth(Integer.MAX_VALUE);
            SearchView searchView2 = bVar.f49488k;
            if (searchView2 != null) {
                searchView2.setOnQueryTextListener(bVar);
            }
            ColorStateList colorStateListValueOf = ColorStateList.valueOf(a7.b.getColor(bVar.requireContext(), R.color.gcm_icon_primary));
            colorStateListValueOf.getClass();
            SearchView searchView3 = bVar.f49488k;
            ImageView imageView = searchView3 != null ? (ImageView) searchView3.findViewById(R.id.search_button) : null;
            if (imageView != null) {
                imageView.setImageResource(R.drawable.search);
            }
            if (imageView != null) {
                imageView.setImageTintList(colorStateListValueOf);
            }
            SearchView searchView4 = bVar.f49488k;
            ImageView imageView2 = searchView4 != null ? (ImageView) searchView4.findViewById(R.id.search_mag_icon) : null;
            if (imageView2 != null) {
                imageView2.setImageResource(R.drawable.search);
            }
            if (imageView2 != null) {
                imageView2.setImageTintList(colorStateListValueOf);
            }
        }

        /* JADX WARN: Code duplicated, block: B:20:0x0034  */
        @Override // androidx.core.view.s
        public final void Z4(Menu menu) {
            boolean z14;
            b bVar = b.this;
            j62.d dVar = bVar.f49494q;
            if (dVar == null) {
                p005kotlin.jvm.internal.s.m("filterData");
                throw null;
            }
            if (dVar.f97409a.isEmpty()) {
                j62.d dVar2 = bVar.f49494q;
                if (dVar2 == null) {
                    p005kotlin.jvm.internal.s.m("filterData");
                    throw null;
                }
                if (dVar2.f97411c.isEmpty()) {
                    j62.d dVar3 = bVar.f49494q;
                    if (dVar3 == null) {
                        p005kotlin.jvm.internal.s.m("filterData");
                        throw null;
                    }
                    if (dVar3.f97410b.isEmpty()) {
                        z14 = false;
                    } else {
                        z14 = true;
                    }
                } else {
                    z14 = true;
                }
            } else {
                z14 = true;
            }
            MenuItem menuItemFindItem = menu.findItem(R.id.menu_item_filter);
            MenuItem menuItemFindItem2 = menu.findItem(R.id.menu_item_search);
            if (menuItemFindItem != null) {
                menuItemFindItem.setVisible(z14);
            }
            if (menuItemFindItem2 != null) {
                menuItemFindItem2.setVisible(z14);
            }
            if (menuItemFindItem != null) {
                Context contextRequireContext = bVar.requireContext();
                contextRequireContext.getClass();
                oc.b.G(menuItemFindItem, contextRequireContext, R.color.gcm_icon_primary);
            }
            if (menuItemFindItem2 != null) {
                Context contextRequireContext2 = bVar.requireContext();
                contextRequireContext2.getClass();
                oc.b.G(menuItemFindItem2, contextRequireContext2, R.color.gcm_icon_primary);
            }
        }

        @Override // androidx.core.view.s
        public final boolean w5(MenuItem menuItem) {
            ArrayList<? extends Parcelable> arrayList;
            List<r> listI;
            menuItem.getClass();
            if (menuItem.getItemId() != R.id.menu_item_filter) {
                return false;
            }
            b bVar = b.this;
            s sVar = bVar.f49492o;
            if (sVar == null || (listI = sVar.i()) == null) {
                arrayList = new ArrayList<>();
            } else {
                arrayList = new ArrayList<>();
                Iterator<T> it = listI.iterator();
                while (it.hasNext()) {
                    arrayList.add((r) it.next());
                }
            }
            j62.d dVar = bVar.f49494q;
            if (dVar == null) {
                p005kotlin.jvm.internal.s.m("filterData");
                throw null;
            }
            if (dVar.f97409a.isEmpty()) {
                j62.d dVar2 = bVar.f49494q;
                if (dVar2 == null) {
                    p005kotlin.jvm.internal.s.m("filterData");
                    throw null;
                }
                if (dVar2.f97411c.isEmpty()) {
                    j62.d dVar3 = bVar.f49494q;
                    if (dVar3 == null) {
                        p005kotlin.jvm.internal.s.m("filterData");
                        throw null;
                    }
                    if (dVar3.f97410b.isEmpty()) {
                        return true;
                    }
                }
            }
            if (arrayList.isEmpty()) {
                return true;
            }
            MSNWorkoutFilterActivity.a aVar = MSNWorkoutFilterActivity.f49506d;
            j62.d dVar4 = bVar.f49494q;
            if (dVar4 == null) {
                p005kotlin.jvm.internal.s.m("filterData");
                throw null;
            }
            aVar.getClass();
            Intent intent = new Intent(bVar.getActivity(), (Class<?>) MSNWorkoutFilterActivity.class);
            intent.putExtra("GCM_workout_filter_data", dVar4);
            intent.putParcelableArrayListExtra("GCM_workouts_list", arrayList);
            bVar.startActivityForResult(intent, 100);
            return true;
        }
    }

    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00060\u0001R\u00020\u0002¨\u0006\u0003"}, d2 = {"com/garmin/android/apps/connectmobile/workouts/presentation/msn/b$e", "Lcom/garmin/android/apps/connectmobile/workouts/presentation/msn/b$b;", "Lcom/garmin/android/apps/connectmobile/workouts/presentation/msn/b;", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class e extends AbstractC0971b {

        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f49503a;

            static {
                int[] iArr = new int[fw.p.values().length];
                try {
                    iArr[fw.p.LOADING.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[fw.p.SUCCESS.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[fw.p.ERROR.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f49503a = iArr;
            }
        }

        public e() {
            super();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.lifecycle.z0
        public final void onChanged(fw.m<? extends s> mVar) throws Throwable {
            fw.m<? extends s> mVar2 = mVar;
            mVar2.getClass();
            int i14 = a.f49503a[mVar2.f73769b.ordinal()];
            b bVar = b.this;
            if (i14 == 1) {
                bVar.G6();
                return;
            }
            if (i14 == 2) {
                bVar.w6();
                b((s) mVar2.f73770c);
            } else if (i14 != 3) {
                u0.r();
            } else {
                bVar.w6();
                a();
            }
        }
    }

    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00060\u0001R\u00020\u0002¨\u0006\u0003"}, d2 = {"com/garmin/android/apps/connectmobile/workouts/presentation/msn/b$f", "Lcom/garmin/android/apps/connectmobile/workouts/presentation/msn/b$b;", "Lcom/garmin/android/apps/connectmobile/workouts/presentation/msn/b;", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class f extends AbstractC0971b {

        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f49505a;

            static {
                int[] iArr = new int[fw.p.values().length];
                try {
                    iArr[fw.p.LOADING.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[fw.p.SUCCESS.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[fw.p.ERROR.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f49505a = iArr;
            }
        }

        public f() {
            super();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.lifecycle.z0
        public final void onChanged(fw.m<? extends s> mVar) throws Throwable {
            fw.m<? extends s> mVar2 = mVar;
            mVar2.getClass();
            int i14 = a.f49505a[mVar2.f73769b.ordinal()];
            b bVar = b.this;
            if (i14 == 1) {
                s2 s2Var = bVar.f49485h;
                if (s2Var != null) {
                    s2Var.showProgressOverlay();
                    return;
                }
                return;
            }
            if (i14 == 2) {
                s2 s2Var2 = bVar.f49485h;
                if (s2Var2 != null) {
                    s2Var2.hideProgressOverlay();
                }
                b((s) mVar2.f73770c);
                return;
            }
            if (i14 != 3) {
                u0.r();
                return;
            }
            s2 s2Var3 = bVar.f49485h;
            if (s2Var3 != null) {
                s2Var3.hideProgressOverlay();
            }
            a();
        }
    }

    @Override // androidx.appcompat.widget.SearchView.m
    public final boolean E0(String str) {
        str.getClass();
        return false;
    }

    @Override // com.garmin.android.apps.connectmobile.m0
    public final void E6() {
        l lVar = this.f49495r;
        if (lVar != null) {
            y0 y0Var = new y0();
            ge1.b.T(lVar, null, null, new j(lVar, y0Var, null), 3);
            y0Var.f(this, (e) this.f49497v.getValue());
        }
    }

    public final void I6() {
        if (!this.f49489l) {
            if (this.f49490m == null) {
                this.f49490m = Boolean.FALSE;
            }
            a2 a2Var = a2.WORKOUTS;
            i2.f36769a.getClass();
            i2.a.k(a2Var, "MSNWorkoutListFragment", "Showing compatibility banner");
            if (this.f49491n) {
                return;
            }
            ComposeView composeView = this.f49486i;
            if (composeView == null) {
                p005kotlin.jvm.internal.s.m("errorBannerView");
                throw null;
            }
            composeView.setVisibility(0);
            ComposeView composeView2 = this.f49486i;
            if (composeView2 != null) {
                composeView2.setContent(new z3.e(501823849, true, new h(this, 0)));
                return;
            } else {
                p005kotlin.jvm.internal.s.m("errorBannerView");
                throw null;
            }
        }
        Context context = getContext();
        if (context == null) {
            a2 a2Var2 = a2.WORKOUTS;
            i2.f36769a.getClass();
            i2.a.k(a2Var2, "MSNWorkoutListFragment", "Missing context");
            return;
        }
        Object systemService = context.getSystemService("bluetooth");
        systemService.getClass();
        BluetoothAdapter adapter = ((BluetoothManager) systemService).getAdapter();
        if (adapter == null) {
            a2 a2Var3 = a2.WORKOUTS;
            i2.f36769a.getClass();
            i2.a.k(a2Var3, "MSNWorkoutListFragment", "Missing bluetooth manager");
            return;
        }
        int state = adapter.getState();
        if (12 != state) {
            if (10 == state && this.f49490m == null) {
                this.f49490m = Boolean.FALSE;
                return;
            }
            return;
        }
        if (this.f49490m == null) {
            this.f49490m = Boolean.TRUE;
        }
        ComposeView composeView3 = this.f49486i;
        if (composeView3 != null) {
            composeView3.setVisibility(8);
        } else {
            p005kotlin.jvm.internal.s.m("errorBannerView");
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:150:0x03da  */
    /* JADX WARN: Code duplicated, block: B:151:0x03e8  */
    /* JADX WARN: Code duplicated, block: B:154:0x03f2  */
    /* JADX WARN: Code duplicated, block: B:157:0x03ff  */
    /* JADX WARN: Code duplicated, block: B:176:0x0401 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:92:0x0232  */
    /* JADX WARN: Code duplicated, block: B:95:0x023f  */
    /* JADX WARN: Code duplicated, block: B:98:0x024d  */
    /* JADX WARN: Code duplicated, block: B:99:0x025b  */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.Iterable, java.lang.Object] */
    public final void J6(String str) throws Throwable {
        Throwable th3;
        String str2;
        String strValueOf;
        Iterator it;
        List list;
        int i14;
        String str3;
        String str4;
        String workoutName;
        String strA;
        String sportTypeKey;
        k kVarC;
        String strValueOf2;
        int i15;
        String str5;
        String str6;
        String sportTypeKey2;
        k kVarC2;
        String workoutName2;
        String strA2;
        s sVar = this.f49492o;
        List<r> listI = sVar != null ? sVar.i() : null;
        j62.d dVar = this.f49494q;
        if (dVar == null) {
            p005kotlin.jvm.internal.s.m("filterData");
            throw null;
        }
        List<r> listA = com.garmin.android.apps.connectmobile.workouts.presentation.msn.filter.e.a(listI, dVar, str);
        this.f49493p = listA;
        String str7 = "adapter";
        if (listA.isEmpty()) {
            a2 a2Var = a2.WORKOUTS;
            i2.f36769a.getClass();
            i2.a.k(a2Var, "MSNWorkoutListFragment", "Showing no results");
            ComposeView composeView = this.f49486i;
            if (composeView == null) {
                p005kotlin.jvm.internal.s.m("errorBannerView");
                throw null;
            }
            composeView.setVisibility(8);
            o oVar = this.f49487j;
            if (oVar != null) {
                oVar.r(w.c(new n.a(2131232226, R.string.msn_workouts_no_search_results_msg)));
                return;
            } else {
                p005kotlin.jvm.internal.s.m("adapter");
                throw null;
            }
        }
        Context context = getContext();
        s sVar2 = this.f49492o;
        com.garmin.android.apps.connectmobile.workouts.data.model.e difficulties = sVar2 != null ? sVar2.getDifficulties() : null;
        ArrayList arrayList = new ArrayList();
        if (context == null || difficulties == null) {
            th3 = null;
            str2 = "adapter";
        } else {
            s sVar3 = this.f49492o;
            List<String> listG = sVar3 != null ? sVar3.g() : null;
            s sVar4 = this.f49492o;
            com.garmin.android.apps.connectmobile.workouts.data.model.t muscleGroups = sVar4 != null ? sVar4.getMuscleGroups() : null;
            int i16 = R.string.common_minutes_abbreviation_label;
            th3 = null;
            if (listG != null) {
                I6();
                ?? r14 = this.f49493p;
                r14.getClass();
                String strB = i62.n.b();
                ArrayList arrayList2 = new ArrayList(y.r(r14, 10));
                for (r rVar : r14) {
                    String difficulty = rVar.getDifficulty();
                    String strB2 = difficulty != null ? difficulties.b(difficulty) : null;
                    Long duration = rVar.getDuration();
                    String str8 = str7;
                    if (duration != null) {
                        double dLongValue = duration.longValue();
                        l3.f23124b.getClass();
                        strValueOf2 = String.valueOf((int) (dLongValue / 60.0d));
                    } else {
                        strValueOf2 = null;
                    }
                    String string = context.getString(i16, strValueOf2);
                    string.getClass();
                    List<String> listI2 = rVar.i();
                    if (listI2 == null) {
                        listI2 = j0.f134944a;
                    }
                    oi0.h hVar = new oi0.h(context);
                    Long duration2 = rVar.getDuration();
                    ArrayList arrayList3 = arrayList2;
                    if (duration2 != null) {
                        double dLongValue2 = duration2.longValue();
                        l3.f23124b.getClass();
                        i15 = (int) (dLongValue2 / 60.0d);
                    } else {
                        i15 = 0;
                    }
                    String strF = hVar.f(i15);
                    if (strValueOf2 == null || listI2.isEmpty()) {
                        if (strValueOf2 == null || !listI2.isEmpty()) {
                            if (strValueOf2 != null || listI2.isEmpty()) {
                                str5 = "";
                                str6 = str5;
                            } else if (listI2.size() <= 3) {
                                ArrayList arrayListB = new zw1.b(new l22.a(context)).b(listI2);
                                string = arrayListB != null ? h0.k0(arrayListB, null, null, null, null, 63) : null;
                                strF = arrayListB != null ? h0.k0(arrayListB, null, null, null, null, 63) : null;
                            } else {
                                string = context.getString(R.string.lbl_primary_muscle_groups_plural_param, String.valueOf(listI2.size()));
                                strF = context.getString(R.string.lbl_primary_muscle_groups_plural_param, String.valueOf(listI2.size()));
                            }
                        }
                        String strV = d53.u.v(strB + rVar.getHeroImage(), "/images/workouts/images/", "/images/workouts/images/compressed/", false);
                        k.a aVar = k.f116753m;
                        sportTypeKey2 = rVar.getSportTypeKey();
                        if (sportTypeKey2 == null) {
                            sportTypeKey2 = k.f116756p.f116765a;
                        }
                        aVar.getClass();
                        kVarC2 = k.a.c(sportTypeKey2);
                        if (kVarC2 == null) {
                            kVarC2 = k.f116756p;
                        }
                        k kVar = kVarC2;
                        String workoutSourceId = rVar.getWorkoutSourceId();
                        workoutName2 = rVar.getWorkoutName();
                        if (workoutName2 != null) {
                            strA2 = oi0.c.A(context, new bf(16), workoutName2);
                        } else {
                            strA2 = null;
                        }
                        arrayList3.add(new n.b(strB2, rVar.getWorkoutName(), str5, kVar, strV, workoutSourceId, strA2, str6));
                        str7 = str8;
                        arrayList2 = arrayList3;
                        i16 = R.string.common_minutes_abbreviation_label;
                    } else if (listI2.size() <= 3) {
                        ArrayList arrayListB2 = new zw1.b(new l22.a(context)).b(listI2);
                        string = context.getString(R.string.string_space_bullet_string_pattern, arrayListB2 != null ? h0.k0(arrayListB2, null, null, null, null, 63) : null, string);
                        strF = context.getString(R.string.string_space_bullet_string_pattern, arrayListB2 != null ? h0.k0(arrayListB2, null, null, null, null, 63) : null, strF);
                    } else {
                        String string2 = context.getString(R.string.lbl_primary_muscle_groups_plural_param, String.valueOf(listI2.size()));
                        string2.getClass();
                        string = context.getString(R.string.string_space_bullet_string_pattern, string2, string);
                        strF = context.getString(R.string.string_space_bullet_string_pattern, string2, strF);
                    }
                    str5 = string;
                    str6 = strF;
                    String strV2 = d53.u.v(strB + rVar.getHeroImage(), "/images/workouts/images/", "/images/workouts/images/compressed/", false);
                    k.a aVar2 = k.f116753m;
                    sportTypeKey2 = rVar.getSportTypeKey();
                    if (sportTypeKey2 == null) {
                        sportTypeKey2 = k.f116756p.f116765a;
                    }
                    aVar2.getClass();
                    kVarC2 = k.a.c(sportTypeKey2);
                    if (kVarC2 == null) {
                        kVarC2 = k.f116756p;
                    }
                    k kVar2 = kVarC2;
                    String workoutSourceId2 = rVar.getWorkoutSourceId();
                    workoutName2 = rVar.getWorkoutName();
                    if (workoutName2 != null) {
                        strA2 = oi0.c.A(context, new bf(16), workoutName2);
                    } else {
                        strA2 = null;
                    }
                    arrayList3.add(new n.b(strB2, rVar.getWorkoutName(), str5, kVar2, strV2, workoutSourceId2, strA2, str6));
                    str7 = str8;
                    arrayList2 = arrayList3;
                    i16 = R.string.common_minutes_abbreviation_label;
                }
                str2 = str7;
                arrayList.addAll(arrayList2);
                if (p005kotlin.jvm.internal.s.g(this.f49490m, Boolean.TRUE)) {
                    arrayList.add(0, new n.c());
                }
            } else {
                str2 = "adapter";
                if (muscleGroups != null) {
                    I6();
                    ?? r15 = this.f49493p;
                    r15.getClass();
                    String strB3 = i62.n.b();
                    ArrayList arrayList4 = new ArrayList(y.r(r15, 10));
                    Iterator it3 = r15.iterator();
                    while (it3.hasNext()) {
                        r rVar2 = (r) it3.next();
                        String difficulty2 = rVar2.getDifficulty();
                        String strB4 = difficulty2 != null ? difficulties.b(difficulty2) : null;
                        Long duration3 = rVar2.getDuration();
                        if (duration3 != null) {
                            double dLongValue3 = duration3.longValue();
                            l3.f23124b.getClass();
                            strValueOf = String.valueOf((int) (dLongValue3 / 60.0d));
                        } else {
                            strValueOf = null;
                        }
                        String string3 = context.getString(R.string.common_minutes_abbreviation_label, strValueOf);
                        string3.getClass();
                        List<String> listH = rVar2.h();
                        if (listH != null) {
                            ArrayList arrayList5 = new ArrayList();
                            Iterator<T> it4 = listH.iterator();
                            while (it4.hasNext()) {
                                Iterator it5 = it3;
                                String strB5 = muscleGroups.b((String) it4.next());
                                if (strB5 != null) {
                                    arrayList5.add(strB5);
                                }
                                it3 = it5;
                            }
                            it = it3;
                            list = arrayList5;
                        } else {
                            it = it3;
                            list = j0.f134944a;
                        }
                        oi0.h hVar2 = new oi0.h(context);
                        Long duration4 = rVar2.getDuration();
                        String str9 = strValueOf;
                        if (duration4 != null) {
                            double dLongValue4 = duration4.longValue();
                            l3.f23124b.getClass();
                            i14 = (int) (dLongValue4 / 60.0d);
                        } else {
                            i14 = 0;
                        }
                        String strF2 = hVar2.f(i14);
                        if (str9 == null || list.isEmpty()) {
                            if (str9 == null || !list.isEmpty()) {
                                if (str9 != null || list.isEmpty()) {
                                    str3 = "";
                                    str4 = str3;
                                } else {
                                    List list2 = list;
                                    string3 = h0.k0(list2, null, null, null, null, 63);
                                    strF2 = h0.k0(list2, null, null, null, null, 63);
                                }
                            }
                            String strV3 = d53.u.v(strB3 + rVar2.getHeroImage(), "/images/workouts/images/", "/images/workouts/images/compressed/", false);
                            String workoutSourceId3 = rVar2.getWorkoutSourceId();
                            workoutName = rVar2.getWorkoutName();
                            if (workoutName != null) {
                                strA = oi0.c.A(context, new bf(15), workoutName);
                            } else {
                                strA = null;
                            }
                            k.a aVar3 = k.f116753m;
                            sportTypeKey = rVar2.getSportTypeKey();
                            if (sportTypeKey == null) {
                                sportTypeKey = k.f116756p.f116765a;
                            }
                            aVar3.getClass();
                            kVarC = k.a.c(sportTypeKey);
                            if (kVarC == null) {
                                kVarC = k.f116756p;
                            }
                            arrayList4.add(new n.b(strB4, rVar2.getWorkoutName(), str3, kVarC, strV3, workoutSourceId3, strA, str4));
                            it3 = it;
                        } else {
                            List list3 = list;
                            string3 = context.getString(R.string.string_space_bullet_string_pattern, h0.k0(h0.S0(list3, 2), null, null, null, null, 63), string3);
                            strF2 = context.getString(R.string.string_space_bullet_string_pattern, h0.k0(h0.S0(list3, 2), null, null, null, null, 63), strF2);
                        }
                        str4 = strF2;
                        str3 = string3;
                        String strV4 = d53.u.v(strB3 + rVar2.getHeroImage(), "/images/workouts/images/", "/images/workouts/images/compressed/", false);
                        String workoutSourceId4 = rVar2.getWorkoutSourceId();
                        workoutName = rVar2.getWorkoutName();
                        if (workoutName != null) {
                            strA = oi0.c.A(context, new bf(15), workoutName);
                        } else {
                            strA = null;
                        }
                        k.a aVar4 = k.f116753m;
                        sportTypeKey = rVar2.getSportTypeKey();
                        if (sportTypeKey == null) {
                            sportTypeKey = k.f116756p.f116765a;
                        }
                        aVar4.getClass();
                        kVarC = k.a.c(sportTypeKey);
                        if (kVarC == null) {
                            kVarC = k.f116756p;
                        }
                        arrayList4.add(new n.b(strB4, rVar2.getWorkoutName(), str3, kVarC, strV4, workoutSourceId4, strA, str4));
                        it3 = it;
                    }
                    arrayList.addAll(arrayList4);
                    if (p005kotlin.jvm.internal.s.g(this.f49490m, Boolean.TRUE)) {
                        arrayList.add(0, new n.c());
                    }
                }
            }
        }
        o oVar2 = this.f49487j;
        if (oVar2 == null) {
            p005kotlin.jvm.internal.s.m(str2);
            throw th3;
        }
        oVar2.r(arrayList);
    }

    @Override // androidx.appcompat.widget.SearchView.m
    public final boolean l5(String str) throws Throwable {
        str.getClass();
        J6(str);
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i14, int i15, Intent intent) throws Throwable {
        j62.d dVar;
        Parcelable parcelable;
        if (i14 != 100) {
            super.onActivityResult(i14, i15, intent);
            return;
        }
        if (i15 == -1) {
            if (intent != null) {
                if (Build.VERSION.SDK_INT >= 33) {
                    parcelable = (Parcelable) intent.getParcelableExtra("GCM_workout_filter_data", j62.d.class);
                } else {
                    Parcelable parcelableExtra = intent.getParcelableExtra("GCM_workout_filter_data");
                    if (!(parcelableExtra instanceof j62.d)) {
                        parcelableExtra = null;
                    }
                    parcelable = (j62.d) parcelableExtra;
                }
                dVar = (j62.d) parcelable;
            } else {
                dVar = null;
            }
            if (dVar != null) {
                j62.d dVar2 = this.f49494q;
                if (dVar2 == null) {
                    p005kotlin.jvm.internal.s.m("filterData");
                    throw null;
                }
                if (dVar2.equals(dVar)) {
                    return;
                }
                this.f49494q = dVar;
                J6(null);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        context.getClass();
        super.onAttach(context);
        this.f49485h = context instanceof s2 ? (s2) context : null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f49489l = ((o52.e) KoinJavaComponent.get$default(o52.e.class, null, null, 6, null)).q();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        return A6(viewGroup, layoutInflater, R.layout.gcm4_fragment_msn_workout_list);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        if (this.f49489l) {
            try {
                androidx.fragment.app.m activity = getActivity();
                if (activity != null) {
                    activity.unregisterReceiver((c) this.f49498w.getValue());
                }
            } catch (IllegalArgumentException unused) {
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        androidx.fragment.app.m activity;
        super.onResume();
        if (!this.f49489l || (activity = getActivity()) == null) {
            return;
        }
        activity.registerReceiver((c) this.f49498w.getValue(), new IntentFilter("android.bluetooth.adapter.action.STATE_CHANGED"));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        String string;
        Object next;
        view2.getClass();
        super.onViewCreated(view2, bundle);
        g22.e.k(this, new d(), b0.b.RESUMED);
        androidx.fragment.app.m activity = getActivity();
        if (activity != null) {
            this.f49491n = false;
            View viewFindViewById = view2.findViewById(R.id.banner_view);
            viewFindViewById.getClass();
            ComposeView composeView = (ComposeView) viewFindViewById;
            this.f49486i = composeView;
            composeView.setVisibility(8);
            RecyclerView recyclerView = (RecyclerView) view2.findViewById(R.id.recycler_view);
            recyclerView.setHasFixedSize(true);
            recyclerView.setLayoutManager(new LinearLayoutManager(activity));
            o oVar = new o();
            this.f49487j = oVar;
            oVar.f91869b = this;
            recyclerView.setAdapter(oVar);
            this.f49494q = new j62.d(null, null, null, null, null, null, null, null, null, null, 1023, null);
            Bundle arguments = getArguments();
            if (arguments != null && (string = arguments.getString("GCM_extra_activity_type")) != null) {
                j62.b.f97400c.getClass();
                Iterator<T> it = j62.b.f97406i.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!d53.u.q(((j62.b) next).f97407a, string, true));
                j62.b bVar = (j62.b) next;
                if (bVar != null) {
                    j62.d dVar = this.f49494q;
                    if (dVar == null) {
                        p005kotlin.jvm.internal.s.m("filterData");
                        throw null;
                    }
                    dVar.d(bVar);
                }
            }
            Context context = getContext();
            if (context != null) {
                Resources resources = context.getResources();
                resources.getClass();
                l lVar = (l) new x1(this, new i62.m(i62.n.a(resources))).b(s0.f105811a.b(l.class));
                this.f49495r = lVar;
                y0 y0Var = new y0();
                ge1.b.T(lVar, null, null, new j(lVar, y0Var, null), 3);
                y0Var.f(getViewLifecycleOwner(), this.f49496t);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/garmin/android/apps/connectmobile/workouts/presentation/msn/b$a;", "", "<init>", "()V", "", "FILTER_REQUEST_CODE", "I", "", "TAG", "Ljava/lang/String;", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
