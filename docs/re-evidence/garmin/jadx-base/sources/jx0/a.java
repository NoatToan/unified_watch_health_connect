package jx0;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.SpannableString;
import android.text.style.TextAppearanceSpan;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.Group;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.y1;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.m0;
import com.garmin.android.apps.connectmobile.view.view_3_0.GCMRunningProgressView;
import d53.w;
import i3.f2;
import java.text.NumberFormat;
import o13.t;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.bundle.GetViewModelKt;
import org.koin.core.qualifier.Qualifier;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Ljx0/a;", "Lcom/garmin/android/apps/connectmobile/m0;", "<init>", "()V", "a", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class a extends m0 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final C1950a f101397n = new C1950a(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ww0.k f101399i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public d f101400j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Boolean f101401k;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f101398h = o13.m.a(o13.n.NONE, new c(this, null, new b(this), null, null));

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final t f101402l = o13.m.b(new f2(this, 29));

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f101403m = "";

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b implements e23.a<androidx.fragment.app.m> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f101404a;

        public b(Fragment fragment) {
            this.f101404a = fragment;
        }

        @Override // e23.a
        public final androidx.fragment.app.m invoke() {
            return this.f101404a.requireActivity();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements e23.a<k> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f101405a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f101406b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f101407c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ e23.a f101408d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ e23.a f101409e;

        public c(Fragment fragment, Qualifier qualifier, e23.a aVar, e23.a aVar2, e23.a aVar3) {
            this.f101405a = fragment;
            this.f101406b = qualifier;
            this.f101407c = aVar;
            this.f101408d = aVar2;
            this.f101409e = aVar3;
        }

        /* JADX WARN: Type inference failed for: r0v7, types: [androidx.lifecycle.u1, jx0.k] */
        @Override // e23.a
        public final k invoke() {
            CreationExtras defaultViewModelCreationExtras;
            ViewModelStoreOwner viewModelStoreOwner = (ViewModelStoreOwner) this.f101407c.invoke();
            y1 viewModelStore = viewModelStoreOwner.getF189591b();
            Fragment fragment = this.f101405a;
            e23.a aVar = this.f101408d;
            if (aVar == null || (defaultViewModelCreationExtras = (CreationExtras) aVar.invoke()) == null) {
                b.g gVar = viewModelStoreOwner instanceof b.g ? (b.g) viewModelStoreOwner : null;
                if (gVar != null) {
                    defaultViewModelCreationExtras = gVar.getDefaultViewModelCreationExtras();
                } else {
                    defaultViewModelCreationExtras = fragment.getDefaultViewModelCreationExtras();
                    defaultViewModelCreationExtras.getClass();
                }
            }
            return GetViewModelKt.resolveViewModel$default(s0.f105811a.b(k.class), viewModelStore, null, defaultViewModelCreationExtras, this.f101406b, AndroidKoinScopeExtKt.getKoinScope(fragment), this.f101409e, 4, null);
        }
    }

    @Override // com.garmin.android.apps.connectmobile.m0
    public final void E6() {
        d dVar = this.f101400j;
        if (dVar != null && dVar.isAdded()) {
            d.A6(dVar, dVar.v6().f101410h.get(dVar.z6().getCurrentItem()), false, 2);
        }
        if (this.f101400j == null) {
            w6();
        }
    }

    public void I6(ww0.k kVar) {
        GCMRunningProgressView gCMRunningProgressViewT6 = T6();
        Boolean bool = this.f101401k;
        Boolean bool2 = Boolean.TRUE;
        gCMRunningProgressViewT6.setVisibility(s.g(bool, bool2) ? 0 : 8);
        M6().setVisibility(s.g(this.f101401k, bool2) ? 8 : 0);
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        oi0.a aVar = new oi0.a(new l22.a(contextRequireContext));
        K6().setText(J6(kVar != null ? kVar.getAvgCycleLength() : null));
        K6().setContentDescription(oi0.a.a(aVar, kVar != null ? kVar.getAvgCycleLength() : null));
        S6().setText(J6(kVar != null ? kVar.getAvgPeriodLength() : null));
        S6().setContentDescription(oi0.a.a(aVar, kVar != null ? kVar.getAvgPeriodLength() : null));
    }

    public final SpannableString J6(Integer num) {
        String str = (num == null || num.intValue() == 0) ? "--" : NumberFormat.getIntegerInstance().format(num);
        SpannableString spannableString = new SpannableString(getString(R.string.mct_num_days_label, str));
        str.getClass();
        int iH = w.H(spannableString, str, 0, false, 6);
        if (iH > 0) {
            spannableString.setSpan(new TextAppearanceSpan(getContext(), R.style.Text_Body2), 0, iH, 33);
        }
        spannableString.setSpan(new TextAppearanceSpan(getContext(), R.style.Text_Title2), iH, str.length() + iH, 33);
        if (str.length() + iH < spannableString.length()) {
            spannableString.setSpan(new TextAppearanceSpan(getContext(), R.style.Text_Body2), str.length() + iH, spannableString.length(), 33);
        }
        return spannableString;
    }

    public abstract TextView K6();

    public abstract Group M6();

    public abstract TextView S6();

    public abstract GCMRunningProgressView T6();

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, o13.l] */
    @Override // androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.getClass();
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("AbstractMenstrualCycleReportFragmentReport", this.f101399i);
        bundle2.putSerializable("AbstractMenstrualCycleReportFragmentLoading", this.f101401k);
        k kVar = (k) this.f101398h.getValue();
        String str = this.f101403m;
        kVar.getClass();
        str.getClass();
        kVar.f101498f.put(str, bundle2);
        bundle.putString("AbstractMenstrualCycleReportFragmentCycleReportState", this.f101403m);
        super.onSaveInstanceState(bundle);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, o13.l] */
    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view2, Bundle bundle) {
        Boolean bool;
        Object serializable;
        ww0.k kVar;
        Parcelable parcelable;
        Parcelable parcelable2;
        androidx.fragment.app.m activity;
        String string;
        view2.getClass();
        super.onViewCreated(view2, bundle);
        t tVar = this.f101402l;
        String str = "";
        Boolean boolValueOf = null;
        if (bundle == null || (string = bundle.getString("AbstractMenstrualCycleReportFragmentCycleReportState", "")) == null) {
            Bundle bundle2 = (Bundle) tVar.getValue();
            String string2 = bundle2 != null ? bundle2.getString("AbstractMenstrualCycleReportFragmentCycleReportState", "") : null;
            if (string2 != null) {
                str = string2;
            }
        } else {
            str = string;
        }
        this.f101403m = str;
        k kVar2 = (k) this.f101398h.getValue();
        String str2 = this.f101403m;
        kVar2.getClass();
        str2.getClass();
        Bundle bundle3 = (Bundle) kVar2.f101498f.get(str2);
        if (bundle != null && bundle3 == null && ((activity = getActivity()) == null || !activity.isFinishing())) {
            androidx.fragment.app.m activity2 = getActivity();
            if (activity2 != null) {
                activity2.finish();
                return;
            }
            return;
        }
        ww0.k kVar3 = this.f101399i;
        if (kVar3 == null) {
            if (bundle3 != null) {
                if (Build.VERSION.SDK_INT >= 33) {
                    parcelable2 = (Parcelable) bundle3.getParcelable("AbstractMenstrualCycleReportFragmentReport", ww0.k.class);
                } else {
                    Parcelable parcelable3 = bundle3.getParcelable("AbstractMenstrualCycleReportFragmentReport");
                    if (!(parcelable3 instanceof ww0.k)) {
                        parcelable3 = null;
                    }
                    parcelable2 = (ww0.k) parcelable3;
                }
                kVar = (ww0.k) parcelable2;
            } else {
                kVar = null;
            }
            if (kVar == null) {
                Bundle bundle4 = (Bundle) tVar.getValue();
                if (bundle4 != null) {
                    if (Build.VERSION.SDK_INT >= 33) {
                        parcelable = (Parcelable) bundle4.getParcelable("AbstractMenstrualCycleReportFragmentReport", ww0.k.class);
                    } else {
                        Parcelable parcelable4 = bundle4.getParcelable("AbstractMenstrualCycleReportFragmentReport");
                        if (!(parcelable4 instanceof ww0.k)) {
                            parcelable4 = null;
                        }
                        parcelable = (ww0.k) parcelable4;
                    }
                    kVar3 = (ww0.k) parcelable;
                } else {
                    kVar3 = null;
                }
            } else {
                kVar3 = kVar;
            }
        }
        this.f101399i = kVar3;
        Boolean bool2 = this.f101401k;
        if (bool2 == null) {
            if (bundle3 != null) {
                if (Build.VERSION.SDK_INT >= 33) {
                    serializable = bundle3.getSerializable("AbstractMenstrualCycleReportFragmentLoading", Boolean.class);
                } else {
                    Object serializable2 = bundle3.getSerializable("AbstractMenstrualCycleReportFragmentLoading");
                    if (!(serializable2 instanceof Boolean)) {
                        serializable2 = null;
                    }
                    serializable = (Boolean) serializable2;
                }
                bool = (Boolean) serializable;
            } else {
                bool = null;
            }
            if (bool == null) {
                Bundle bundle5 = (Bundle) tVar.getValue();
                if (bundle5 != null) {
                    boolValueOf = Boolean.valueOf(bundle5.getBoolean("AbstractMenstrualCycleReportFragmentLoading"));
                }
            } else {
                boolValueOf = bool;
            }
        } else {
            boolValueOf = bool2;
        }
        this.f101401k = boolValueOf;
        I6(this.f101399i);
    }

    /* JADX INFO: renamed from: jx0.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Ljx0/a$a;", "", "<init>", "()V", "", "REPORT_KEY", "Ljava/lang/String;", "LOADING_KEY", "CYCLE_REPORT_STATE_KEY", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C1950a {
        public /* synthetic */ C1950a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private C1950a() {
        }
    }
}
