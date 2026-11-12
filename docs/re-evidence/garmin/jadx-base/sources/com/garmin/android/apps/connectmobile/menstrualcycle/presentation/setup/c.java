package com.garmin.android.apps.connectmobile.menstrualcycle.presentation.setup;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.y0;
import androidx.lifecycle.y1;
import b.g;
import com.garmin.android.apps.connectmobile.R;
import java.util.Iterator;
import java.util.Map;
import lx0.k;
import o13.m;
import o13.n;
import o13.p;
import o13.t;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.bundle.GetViewModelKt;
import org.koin.core.qualifier.Qualifier;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import p006l2.v0;
import p13.u0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/menstrualcycle/presentation/setup/c;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "a", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c extends Fragment {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f39117f = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f39118g = c.class.getSimpleName();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f39120b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TextView f39122d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public TextView f39123e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f39119a = m.a(n.NONE, new e(this, null, new d(this), null, null));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t f39121c = m.b(new v0(this, 17));

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f39124a;

        static {
            int[] iArr = new int[ww0.a.values().length];
            try {
                iArr[ww0.a.REGULAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ww0.a.IRREGULAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ww0.a.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ww0.a.PREGNANT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ww0.a.INACTIVE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f39124a = iArr;
        }
    }

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.menstrualcycle.presentation.setup.c$c, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/menstrualcycle/presentation/setup/c$c", "Landroidx/core/view/a;", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C0693c extends androidx.core.view.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Map.Entry<ww0.a, View> f39125a;

        /* JADX WARN: Multi-variable type inference failed */
        public C0693c(Map.Entry<? extends ww0.a, ? extends View> entry) {
            this.f39125a = entry;
        }

        @Override // androidx.core.view.a
        public final void onInitializeAccessibilityNodeInfo(View view2, l7.f fVar) {
            view2.getClass();
            fVar.getClass();
            super.onInitializeAccessibilityNodeInfo(view2, fVar);
            fVar.t(((ImageView) this.f39125a.getValue().findViewById(R.id.checkmark_cell_check_icon)).getVisibility() == 0);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class d implements e23.a<androidx.fragment.app.m> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f39126a;

        public d(Fragment fragment) {
            this.f39126a = fragment;
        }

        @Override // e23.a
        public final androidx.fragment.app.m invoke() {
            return this.f39126a.requireActivity();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class e implements e23.a<k> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f39127a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f39128b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f39129c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ e23.a f39130d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ e23.a f39131e;

        public e(Fragment fragment, Qualifier qualifier, e23.a aVar, e23.a aVar2, e23.a aVar3) {
            this.f39127a = fragment;
            this.f39128b = qualifier;
            this.f39129c = aVar;
            this.f39130d = aVar2;
            this.f39131e = aVar3;
        }

        /* JADX WARN: Type inference failed for: r0v7, types: [androidx.lifecycle.u1, lx0.k] */
        @Override // e23.a
        public final k invoke() {
            CreationExtras defaultViewModelCreationExtras;
            ViewModelStoreOwner viewModelStoreOwner = (ViewModelStoreOwner) this.f39129c.invoke();
            y1 f189591b = viewModelStoreOwner.getF189591b();
            Fragment fragment = this.f39127a;
            e23.a aVar = this.f39130d;
            if (aVar == null || (defaultViewModelCreationExtras = (CreationExtras) aVar.invoke()) == null) {
                g gVar = viewModelStoreOwner instanceof g ? (g) viewModelStoreOwner : null;
                if (gVar != null) {
                    defaultViewModelCreationExtras = gVar.getDefaultViewModelCreationExtras();
                } else {
                    defaultViewModelCreationExtras = fragment.getDefaultViewModelCreationExtras();
                    defaultViewModelCreationExtras.getClass();
                }
            }
            return GetViewModelKt.resolveViewModel$default(s0.f105811a.b(k.class), f189591b, null, defaultViewModelCreationExtras, this.f39128b, AndroidKoinScopeExtKt.getKoinScope(fragment), this.f39131e, 4, null);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return com.airbnb.lottie.animation.keyframe.a.b(layoutInflater, R.layout.fragment_mct_setup_cycle_type, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onHiddenChanged(boolean z14) {
        super.onHiddenChanged(z14);
        if (z14) {
            u6(false);
        } else {
            u6(true);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        u6(true);
    }

    /* JADX WARN: Type inference failed for: r11v3, types: [java.lang.Object, java.util.Map] */
    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onCreate(bundle);
        View viewFindViewById = view2.findViewById(R.id.cell_regular);
        View viewFindViewById2 = view2.findViewById(R.id.cell_irregular);
        View viewFindViewById3 = view2.findViewById(R.id.cell_none);
        View viewFindViewById4 = view2.findViewById(R.id.cell_pregnant);
        View viewFindViewById5 = view2.findViewById(R.id.cycle_type_description);
        viewFindViewById5.getClass();
        this.f39122d = (TextView) viewFindViewById5;
        View viewFindViewById6 = view2.findViewById(R.id.cycle_type_pregnancy);
        viewFindViewById6.getClass();
        this.f39123e = (TextView) viewFindViewById6;
        p pVar = new p(ww0.a.REGULAR, viewFindViewById);
        p pVar2 = new p(ww0.a.IRREGULAR, viewFindViewById2);
        ww0.a aVar = ww0.a.NONE;
        this.f39120b = u0.e(pVar, pVar2, new p(aVar, viewFindViewById3), new p(ww0.a.PREGNANT, viewFindViewById4));
        ((TextView) viewFindViewById.findViewById(R.id.checkmark_cell_text)).setText(getString(R.string.mct_regular));
        ((TextView) viewFindViewById2.findViewById(R.id.checkmark_cell_text)).setText(getString(R.string.mct_irregular));
        ((TextView) viewFindViewById3.findViewById(R.id.checkmark_cell_text)).setText(getString(R.string.mct_no_period));
        ((TextView) viewFindViewById4.findViewById(R.id.checkmark_cell_text)).setText(getString(R.string.pregnancy_pregnant));
        viewFindViewById4.setVisibility(0);
        if (((Boolean) this.f39121c.getValue()).booleanValue()) {
            k kVarV6 = v6();
            kVarV6.getClass();
            aVar.getClass();
            kVarV6.f115190f = aVar;
            ((TextView) view2.findViewById(R.id.cycle_type_question)).setText(getString(R.string.pregnancy_cycle_tracking_message));
            view2.findViewById(R.id.cycle_type_pregnancy).setVisibility(8);
            viewFindViewById4.setVisibility(8);
        }
        w6(v6().f115190f);
        ?? r14 = this.f39120b;
        if (r14 == 0) {
            s.m("mCellMap");
            throw null;
        }
        for (Map.Entry entry : r14.entrySet()) {
            androidx.core.view.s0.r((View) entry.getValue(), new C0693c(entry));
            ((View) entry.getValue()).setOnClickListener(new lq.g(3, this, (ww0.a) entry.getKey()));
        }
    }

    public final void u6(boolean z14) {
        ((y0) v6().f115201q.getValue()).m(new w61.f(Integer.valueOf((z14 && ((Boolean) this.f39121c.getValue()).booleanValue()) ? 0 : 8)));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o13.l] */
    public final k v6() {
        return (k) this.f39119a.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    public final void w6(ww0.a aVar) {
        String string;
        k kVarV6 = v6();
        kVarV6.getClass();
        aVar.getClass();
        kVarV6.f115190f = aVar;
        ?? r14 = this.f39120b;
        String string2 = null;
        if (r14 == 0) {
            s.m("mCellMap");
            throw null;
        }
        Iterator it = r14.entrySet().iterator();
        while (true) {
            int i14 = 0;
            if (!it.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            ImageView imageView = (ImageView) ((View) entry.getValue()).findViewById(R.id.checkmark_cell_check_icon);
            if (aVar != entry.getKey()) {
                i14 = 8;
            }
            imageView.setVisibility(i14);
        }
        TextView textView = this.f39122d;
        if (textView == null) {
            s.m("cycleTypeDescription");
            throw null;
        }
        int[] iArr = b.f39124a;
        int i15 = iArr[aVar.ordinal()];
        if (i15 == 1) {
            string = getString(R.string.mct_setup_cycle_type_regular_description);
        } else if (i15 == 2) {
            string = getString(R.string.mct_cycle_type_irregular_description);
        } else if (i15 == 3) {
            string = getString(R.string.mct_setup_cycle_type_no_period_description);
        } else {
            if (i15 != 4 && i15 != 5) {
                lc.u0.r();
                return;
            }
            string = getString(R.string.pregnancy_track_your_current_pregnancy);
        }
        textView.setText(string);
        TextView textView2 = this.f39123e;
        if (textView2 == null) {
            s.m("cycleTypePregnancy");
            throw null;
        }
        int i16 = iArr[aVar.ordinal()];
        if (i16 != 3 && i16 != 4) {
            string2 = getString(R.string.mct_if_you_were_recently, getString(R.string.mct_no_period));
        }
        textView2.setText(string2);
        if (aVar == ww0.a.NONE) {
            v6().f115193i = 0;
            v6().f115192h = 0;
            v6().f115192h = 0;
        } else {
            k kVarV7 = v6();
            kVarV7.f115192h = 5;
            kVarV7.f115193i = 28;
        }
        requireActivity().invalidateOptionsMenu();
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/menstrualcycle/presentation/setup/c$a;", "", "<init>", "()V", "", "STOP_PREGNANCY_FLOW_KEY", "Ljava/lang/String;", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
