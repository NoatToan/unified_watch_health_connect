package jd1;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;
import androidx.core.view.s;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.b0;
import androidx.lifecycle.n0;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.y0;
import androidx.lifecycle.y1;
import androidx.lifecycle.z0;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.d3;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.s2;
import fw.p;
import i3.f2;
import java.util.ArrayList;
import java.util.List;
import lc.u0;
import o13.m;
import o13.t;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s0;
import p005kotlin.jvm.internal.w;
import p13.h0;
import r22.m0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b'\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Ljd1/f;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "b", "a", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class f extends Fragment {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ int f98420q = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public View f98422b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public b f98425e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f98426f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public SwipeRefreshLayout f98427g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public d3 f98428h;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f98432l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final jd1.d f98433m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final jd1.d f98434n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final jd1.d f98435o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public m0 f98436p;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f98421a = m.b(new j21.f(19));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w1 f98423c = new w1(s0.f105811a.b(h.class), new e(this), new f2(this, 21), new C1887f(null, this));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final jd1.b f98424d = new jd1.b(G6(), new g(this));

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f98429i = View.generateViewId();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f98430j = View.generateViewId();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final long f98431k = C6();

    public interface b {
        void b0();

        void k2(pd1.b bVar);
    }

    public static final /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f98437a;

        static {
            int[] iArr = new int[p.values().length];
            try {
                iArr[p.LOADING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[p.SUCCESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[p.ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f98437a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"jd1/f$d", "Landroidx/core/view/s;", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class d implements s {
        public d() {
        }

        @Override // androidx.core.view.s
        public final void Y3(Menu menu, MenuInflater menuInflater) {
            List<pd1.b> listF;
            menu.getClass();
            menuInflater.getClass();
            f fVar = f.this;
            fVar.A6().debug("onCreateOptionsMenu: isEditing=[" + fVar.f98432l + "]");
            menu.clear();
            boolean z14 = true;
            if (fVar.f98432l) {
                menuInflater.inflate(R.menu.menu_done, menu);
                menu.findItem(R.id.menu_item_done).setEnabled(true);
                return;
            }
            pd1.c cVarD = fVar.H6().C4().d();
            int size = (cVarD == null || (listF = cVarD.f()) == null) ? 0 : listF.size();
            boolean z15 = ((long) size) >= fVar.C6() && (fVar instanceof com.garmin.android.apps.connectmobile.blood_pressure.presentation.reminders.a);
            if (size == 0) {
                z14 = true ^ (fVar instanceof com.garmin.android.apps.connectmobile.blood_pressure.presentation.reminders.a);
            } else if (z15) {
                z14 = false;
            }
            if (z14) {
                menu.add(0, fVar.f98429i, 0, fVar.getString(R.string.lbl_add_reminder));
            }
            if (size > 0) {
                menu.add(0, fVar.f98430j, 0, fVar.getString(R.string.pregnancy_edit_reminders));
            }
            fVar.v6(menu);
        }

        @Override // androidx.core.view.s
        public final boolean w5(MenuItem menuItem) {
            menuItem.getClass();
            int itemId = menuItem.getItemId();
            f fVar = f.this;
            if (itemId == fVar.f98429i) {
                fVar.A6().debug("onOptionsItemSelected: addReminderId");
                if (fVar.f98424d.f98402d.size() >= fVar.f98431k) {
                    fVar.M6();
                    return true;
                }
                b bVar = fVar.f98425e;
                if (bVar != null) {
                    bVar.b0();
                    return true;
                }
            } else if (itemId == fVar.f98430j) {
                fVar.A6().debug("onOptionsItemSelected: editReminderId");
                fVar.K6(true);
                d3 d3Var = fVar.f98428h;
                if (d3Var != null) {
                    d3Var.updateActionBar(fVar.y6(), 1);
                    return true;
                }
            } else {
                if (itemId != R.id.menu_item_done) {
                    fVar.A6().debug("onOptionsItemSelected: not handling this event");
                    return false;
                }
                fVar.A6().debug("onOptionsItemSelected: menu_item_done");
                fVar.K6(false);
                d3 d3Var2 = fVar.f98428h;
                if (d3Var2 != null) {
                    d3Var2.updateActionBar(fVar.z6(), 2);
                }
            }
            return true;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/y1;", "invoke", "()Landroidx/lifecycle/y1;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class e extends w implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f98439a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Fragment fragment) {
            super(0);
            this.f98439a = fragment;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f98439a.requireActivity().getF189591b();
        }
    }

    /* JADX INFO: renamed from: jd1.f$f, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class C1887f extends w implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f98440a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Fragment f98441b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1887f(e23.a aVar, Fragment fragment) {
            super(0);
            this.f98440a = aVar;
            this.f98441b = fragment;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f98440a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f98441b.requireActivity().getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    static {
        new a(null);
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [jd1.d] */
    /* JADX WARN: Type inference failed for: r0v8, types: [jd1.d] */
    /* JADX WARN: Type inference failed for: r0v9, types: [jd1.d] */
    public f() {
        final int i14 = 2;
        this.f98433m = new z0(this) { // from class: jd1.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f98417b;

            {
                this.f98417b = this;
            }

            @Override // androidx.lifecycle.z0
            public final void onChanged(Object obj) {
                List<pd1.b> listF;
                int i15 = i14;
                f fVar = this.f98417b;
                switch (i15) {
                    case 0:
                        pd1.c cVar = (pd1.c) obj;
                        int i16 = f.f98420q;
                        fVar.A6().debug("observer: Got update for reminderList, size=[" + ((cVar == null || (listF = cVar.f()) == null) ? null : Integer.valueOf(listF.size())) + "]");
                        if (cVar != null) {
                            Context contextRequireContext = fVar.requireContext();
                            contextRequireContext.getClass();
                            fVar.S6(contextRequireContext, cVar);
                            b bVar = fVar.f98424d;
                            bVar.getClass();
                            Logger logger = bVar.f98401c;
                            List<pd1.b> listF2 = cVar.f();
                            logger.debug("setReminderList: size=[" + (listF2 != null ? Integer.valueOf(listF2.size()) : null) + "]");
                            ArrayList arrayList = bVar.f98402d;
                            arrayList.clear();
                            List<pd1.b> listF3 = cVar.f();
                            if (listF3 != null) {
                                arrayList.addAll(h0.Z(listF3));
                            }
                            bVar.notifyDataSetChanged();
                            androidx.fragment.app.m activity = fVar.getActivity();
                            if (activity != null) {
                                activity.invalidateOptionsMenu();
                            }
                        }
                        break;
                    case 1:
                        fw.m mVar = (fw.m) obj;
                        int i17 = f.f98420q;
                        mVar.getClass();
                        if (mVar.f73769b == p.SUCCESS) {
                            fVar.A6().debug("Received success from saving reminders, refreshing list");
                            fVar.H6().A4();
                        }
                        break;
                    default:
                        fw.m mVar2 = (fw.m) obj;
                        int i18 = f.f98420q;
                        mVar2.getClass();
                        int i19 = f.c.f98437a[mVar2.f73769b.ordinal()];
                        if (i19 == 1) {
                            fVar.A6().debug("Received loading status...");
                            a7.e activity2 = fVar.getActivity();
                            if (activity2 != null) {
                                ((s2) activity2).showProgressOverlay();
                            }
                        } else if (i19 == 2) {
                            fVar.A6().debug("Received success status");
                            fVar.E6().setRefreshing(false);
                            fVar.f98426f = true;
                            a7.e activity3 = fVar.getActivity();
                            if (activity3 != null) {
                                ((s2) activity3).hideProgressOverlay();
                            }
                        } else if (i19 != 3) {
                            u0.r();
                        } else {
                            fVar.A6().debug("Received error status");
                            fVar.E6().setRefreshing(false);
                            a7.e activity4 = fVar.getActivity();
                            if (activity4 != null) {
                                ((s2) activity4).hideProgressOverlay();
                            }
                            androidx.fragment.app.m activity5 = fVar.getActivity();
                            if (activity5 != null) {
                                Toast.makeText(activity5, R.string.txt_error_occurred, 0).show();
                            }
                        }
                        break;
                }
            }
        };
        final int i15 = 0;
        this.f98434n = new z0(this) { // from class: jd1.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f98417b;

            {
                this.f98417b = this;
            }

            @Override // androidx.lifecycle.z0
            public final void onChanged(Object obj) {
                List<pd1.b> listF;
                int i16 = i15;
                f fVar = this.f98417b;
                switch (i16) {
                    case 0:
                        pd1.c cVar = (pd1.c) obj;
                        int i17 = f.f98420q;
                        fVar.A6().debug("observer: Got update for reminderList, size=[" + ((cVar == null || (listF = cVar.f()) == null) ? null : Integer.valueOf(listF.size())) + "]");
                        if (cVar != null) {
                            Context contextRequireContext = fVar.requireContext();
                            contextRequireContext.getClass();
                            fVar.S6(contextRequireContext, cVar);
                            b bVar = fVar.f98424d;
                            bVar.getClass();
                            Logger logger = bVar.f98401c;
                            List<pd1.b> listF2 = cVar.f();
                            logger.debug("setReminderList: size=[" + (listF2 != null ? Integer.valueOf(listF2.size()) : null) + "]");
                            ArrayList arrayList = bVar.f98402d;
                            arrayList.clear();
                            List<pd1.b> listF3 = cVar.f();
                            if (listF3 != null) {
                                arrayList.addAll(h0.Z(listF3));
                            }
                            bVar.notifyDataSetChanged();
                            androidx.fragment.app.m activity = fVar.getActivity();
                            if (activity != null) {
                                activity.invalidateOptionsMenu();
                            }
                        }
                        break;
                    case 1:
                        fw.m mVar = (fw.m) obj;
                        int i18 = f.f98420q;
                        mVar.getClass();
                        if (mVar.f73769b == p.SUCCESS) {
                            fVar.A6().debug("Received success from saving reminders, refreshing list");
                            fVar.H6().A4();
                        }
                        break;
                    default:
                        fw.m mVar2 = (fw.m) obj;
                        int i19 = f.f98420q;
                        mVar2.getClass();
                        int i110 = f.c.f98437a[mVar2.f73769b.ordinal()];
                        if (i110 == 1) {
                            fVar.A6().debug("Received loading status...");
                            a7.e activity2 = fVar.getActivity();
                            if (activity2 != null) {
                                ((s2) activity2).showProgressOverlay();
                            }
                        } else if (i110 == 2) {
                            fVar.A6().debug("Received success status");
                            fVar.E6().setRefreshing(false);
                            fVar.f98426f = true;
                            a7.e activity3 = fVar.getActivity();
                            if (activity3 != null) {
                                ((s2) activity3).hideProgressOverlay();
                            }
                        } else if (i110 != 3) {
                            u0.r();
                        } else {
                            fVar.A6().debug("Received error status");
                            fVar.E6().setRefreshing(false);
                            a7.e activity4 = fVar.getActivity();
                            if (activity4 != null) {
                                ((s2) activity4).hideProgressOverlay();
                            }
                            androidx.fragment.app.m activity5 = fVar.getActivity();
                            if (activity5 != null) {
                                Toast.makeText(activity5, R.string.txt_error_occurred, 0).show();
                            }
                        }
                        break;
                }
            }
        };
        final int i16 = 1;
        this.f98435o = new z0(this) { // from class: jd1.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f98417b;

            {
                this.f98417b = this;
            }

            @Override // androidx.lifecycle.z0
            public final void onChanged(Object obj) {
                List<pd1.b> listF;
                int i17 = i16;
                f fVar = this.f98417b;
                switch (i17) {
                    case 0:
                        pd1.c cVar = (pd1.c) obj;
                        int i18 = f.f98420q;
                        fVar.A6().debug("observer: Got update for reminderList, size=[" + ((cVar == null || (listF = cVar.f()) == null) ? null : Integer.valueOf(listF.size())) + "]");
                        if (cVar != null) {
                            Context contextRequireContext = fVar.requireContext();
                            contextRequireContext.getClass();
                            fVar.S6(contextRequireContext, cVar);
                            b bVar = fVar.f98424d;
                            bVar.getClass();
                            Logger logger = bVar.f98401c;
                            List<pd1.b> listF2 = cVar.f();
                            logger.debug("setReminderList: size=[" + (listF2 != null ? Integer.valueOf(listF2.size()) : null) + "]");
                            ArrayList arrayList = bVar.f98402d;
                            arrayList.clear();
                            List<pd1.b> listF3 = cVar.f();
                            if (listF3 != null) {
                                arrayList.addAll(h0.Z(listF3));
                            }
                            bVar.notifyDataSetChanged();
                            androidx.fragment.app.m activity = fVar.getActivity();
                            if (activity != null) {
                                activity.invalidateOptionsMenu();
                            }
                        }
                        break;
                    case 1:
                        fw.m mVar = (fw.m) obj;
                        int i19 = f.f98420q;
                        mVar.getClass();
                        if (mVar.f73769b == p.SUCCESS) {
                            fVar.A6().debug("Received success from saving reminders, refreshing list");
                            fVar.H6().A4();
                        }
                        break;
                    default:
                        fw.m mVar2 = (fw.m) obj;
                        int i110 = f.f98420q;
                        mVar2.getClass();
                        int i111 = f.c.f98437a[mVar2.f73769b.ordinal()];
                        if (i111 == 1) {
                            fVar.A6().debug("Received loading status...");
                            a7.e activity2 = fVar.getActivity();
                            if (activity2 != null) {
                                ((s2) activity2).showProgressOverlay();
                            }
                        } else if (i111 == 2) {
                            fVar.A6().debug("Received success status");
                            fVar.E6().setRefreshing(false);
                            fVar.f98426f = true;
                            a7.e activity3 = fVar.getActivity();
                            if (activity3 != null) {
                                ((s2) activity3).hideProgressOverlay();
                            }
                        } else if (i111 != 3) {
                            u0.r();
                        } else {
                            fVar.A6().debug("Received error status");
                            fVar.E6().setRefreshing(false);
                            a7.e activity4 = fVar.getActivity();
                            if (activity4 != null) {
                                ((s2) activity4).hideProgressOverlay();
                            }
                            androidx.fragment.app.m activity5 = fVar.getActivity();
                            if (activity5 != null) {
                                Toast.makeText(activity5, R.string.txt_error_occurred, 0).show();
                            }
                        }
                        break;
                }
            }
        };
    }

    public final Logger A6() {
        return (Logger) this.f98421a.getValue();
    }

    public abstract long C6();

    public final SwipeRefreshLayout E6() {
        SwipeRefreshLayout swipeRefreshLayout = this.f98427g;
        if (swipeRefreshLayout != null) {
            return swipeRefreshLayout;
        }
        p005kotlin.jvm.internal.s.m("refreshLayout");
        throw null;
    }

    public abstract pd1.a F6();

    public abstract int G6();

    public final h H6() {
        return (h) this.f98423c.getValue();
    }

    public void I6(View view2) {
    }

    public void J6(View view2) {
        if (getActivity() != null) {
            h hVarH6 = H6();
            y0<fw.m<Unit>> y0Var = hVarH6.f98449g;
            n0 viewLifecycleOwner = getViewLifecycleOwner();
            viewLifecycleOwner.getClass();
            jd1.d dVar = this.f98433m;
            dh.b.L(y0Var, viewLifecycleOwner, dVar);
            y0<fw.m<Unit>> y0Var2 = hVarH6.f98451i;
            n0 viewLifecycleOwner2 = getViewLifecycleOwner();
            viewLifecycleOwner2.getClass();
            dh.b.L(y0Var2, viewLifecycleOwner2, dVar);
            y0<fw.m<Unit>> y0Var3 = hVarH6.f98450h;
            n0 viewLifecycleOwner3 = getViewLifecycleOwner();
            viewLifecycleOwner3.getClass();
            dh.b.L(y0Var3, viewLifecycleOwner3, this.f98435o);
            y0<pd1.c> y0VarC4 = hVarH6.C4();
            n0 viewLifecycleOwner4 = getViewLifecycleOwner();
            viewLifecycleOwner4.getClass();
            dh.b.L(y0VarC4, viewLifecycleOwner4, this.f98434n);
            I6(view2);
        }
    }

    public final void K6(boolean z14) {
        this.f98432l = z14;
        wr.g.y("isInEditingMode now == ", z14, A6());
        jd1.b bVar = this.f98424d;
        wr.g.y("updateIsEditing: ", z14, bVar.f98401c);
        bVar.f98403e = z14;
        bVar.notifyDataSetChanged();
        requireActivity().invalidateOptionsMenu();
    }

    @SuppressLint({"StringFormatMatches"})
    public abstract void M6();

    public abstract void S6(Context context, pd1.c cVar);

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        context.getClass();
        super.onAttach(context);
        try {
            a7.e activity = getActivity();
            activity.getClass();
            this.f98425e = (b) activity;
            a7.e activity2 = getActivity();
            activity2.getClass();
            this.f98428h = (d3) activity2;
        } catch (Exception e4) {
            A6().error("could not attach RemindersListener or ToolbarListener to fragment", (Throwable) e4);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDetach() {
        super.onDetach();
        this.f98425e = null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        d3 d3Var = this.f98428h;
        if (d3Var != null) {
            d3Var.updateActionBar(z6(), 2);
        }
        j22.b.f96736a.getClass();
        if (j22.b.l()) {
            Context contextRequireContext = requireContext();
            contextRequireContext.getClass();
            if (!j22.b.a(contextRequireContext)) {
                View view2 = this.f98422b;
                if (view2 != null) {
                    view2.setVisibility(8);
                }
                a2 a2Var = a2.USER_REMINDERS;
                i2.f36769a.getClass();
                i2.a.b(a2Var, "RemindersFragment", "showEnableAlarmsAndRemindersDialog");
                m0.a aVar = m0.f149759e;
                String string = getString(R.string.lbl_alarms_and_reminders_permission_needed);
                String string2 = getString(R.string.lbl_set_reminders_alarms_and_reminders_permission_must_be_turned_on);
                final int i14 = 0;
                View.OnClickListener onClickListener = new View.OnClickListener(this) { // from class: jd1.e

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ f f98419b;

                    {
                        this.f98419b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view3) {
                        int i15 = i14;
                        f fVar = this.f98419b;
                        switch (i15) {
                            case 0:
                                int i16 = f.f98420q;
                                a2 a2Var2 = a2.USER_REMINDERS;
                                i2.f36769a.getClass();
                                i2.a.b(a2Var2, "RemindersFragment", "[showEnableAlarmsAndRemindersDialog] positive button pressed, going to settings");
                                fVar.startActivity(new Intent("android.settings.REQUEST_SCHEDULE_EXACT_ALARM", Uri.parse("package:" + fVar.requireContext().getPackageName())));
                                break;
                            default:
                                int i17 = f.f98420q;
                                a2 a2Var3 = a2.USER_REMINDERS;
                                i2.f36769a.getClass();
                                i2.a.b(a2Var3, "RemindersFragment", "[showEnableAlarmsAndRemindersDialog] dialog cancelled, finishing");
                                bv.b.f21239a.getClass();
                                bv.c cVarA = bv.b.a();
                                androidx.fragment.app.m mVarRequireActivity = fVar.requireActivity();
                                mVarRequireActivity.getClass();
                                ((kd0.m) cVarA).a(mVarRequireActivity, null, 268468224);
                                break;
                        }
                    }
                };
                final int i15 = 1;
                m0 m0VarC = m0.a.c(aVar, string, string2, R.string.lbl_turn_on_alarms_and_reminders, onClickListener, R.string.common_button_not_now, new View.OnClickListener(this) { // from class: jd1.e

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ f f98419b;

                    {
                        this.f98419b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view3) {
                        int i16 = i15;
                        f fVar = this.f98419b;
                        switch (i16) {
                            case 0:
                                int i17 = f.f98420q;
                                a2 a2Var2 = a2.USER_REMINDERS;
                                i2.f36769a.getClass();
                                i2.a.b(a2Var2, "RemindersFragment", "[showEnableAlarmsAndRemindersDialog] positive button pressed, going to settings");
                                fVar.startActivity(new Intent("android.settings.REQUEST_SCHEDULE_EXACT_ALARM", Uri.parse("package:" + fVar.requireContext().getPackageName())));
                                break;
                            default:
                                int i18 = f.f98420q;
                                a2 a2Var3 = a2.USER_REMINDERS;
                                i2.f36769a.getClass();
                                i2.a.b(a2Var3, "RemindersFragment", "[showEnableAlarmsAndRemindersDialog] dialog cancelled, finishing");
                                bv.b.f21239a.getClass();
                                bv.c cVarA = bv.b.a();
                                androidx.fragment.app.m mVarRequireActivity = fVar.requireActivity();
                                mVarRequireActivity.getClass();
                                ((kd0.m) cVarA).a(mVarRequireActivity, null, 268468224);
                                break;
                        }
                    }
                }, 192);
                this.f98436p = m0VarC;
                m0VarC.show(requireActivity().getSupportFragmentManager(), "RemindersFragment");
                return;
            }
        }
        m0 m0Var = this.f98436p;
        if (m0Var != null) {
            m0Var.dismiss();
        }
        View view3 = this.f98422b;
        if (view3 != null) {
            view3.setVisibility(0);
        }
        H6().A4();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        this.f98422b = view2;
        J6(view2);
        d dVar = new d();
        androidx.fragment.app.m mVarRequireActivity = requireActivity();
        mVarRequireActivity.getClass();
        mVarRequireActivity.addMenuProvider(dVar, getViewLifecycleOwner(), b0.b.RESUMED);
    }

    public void u6(pd1.b bVar, Integer num) {
        H6().y4(bVar);
    }

    public void v6(Menu menu) {
        menu.getClass();
    }

    public pd1.c w6() {
        return null;
    }

    public abstract String y6();

    public abstract String z6();

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Ljd1/f$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
