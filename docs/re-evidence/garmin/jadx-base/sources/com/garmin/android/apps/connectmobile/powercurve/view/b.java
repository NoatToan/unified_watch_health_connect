package com.garmin.android.apps.connectmobile.powercurve.view;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.m;
import com.garmin.android.apps.connectmobile.R;
import e32.i;
import e32.l;
import e32.p;
import na1.c;
import org.joda.time.LocalDate;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.bundle.GetViewModelKt;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import q42.d;
import qa1.f;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\u0007B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/powercurve/view/b;", "Le32/i;", "Lna1/c;", "Lqa1/f;", "Lja1/c;", "<init>", "()V", "a", "gcm-power-curve_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b extends i<c, f, ja1.c> {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final a f40346q = new a(null);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ra1.a f40347p;

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.powercurve.view.b$b, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class C0758b implements e23.a<m> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f40348a;

        public C0758b(Fragment fragment) {
            this.f40348a = fragment;
        }

        @Override // e23.a
        public final m invoke() {
            return this.f40348a.requireActivity();
        }
    }

    @Override // e32.a
    public final p K6(View view2, l lVar) {
        int i14 = this.f62794m;
        LocalDate localDate = V6().toLocalDate();
        localDate.getClass();
        LocalDate localDate2 = T6().toLocalDate();
        localDate2.getClass();
        ra1.a aVar = this.f40347p;
        if (aVar != null) {
            return new f(view2, lVar, i14, localDate, localDate2, aVar.f151466a);
        }
        s.m("viewModel");
        throw null;
    }

    @Override // e32.i
    public final int U6() {
        return -1;
    }

    @Override // e32.i
    public final f32.m X6() {
        ra1.a aVar = this.f40347p;
        if (aVar != null) {
            return aVar.f151468c;
        }
        s.m("viewModel");
        throw null;
    }

    @Override // e32.i, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        ma1.a.C2227a c2227a = ma1.a.f117623d;
        Bundle arguments = getArguments();
        String string = arguments != null ? arguments.getString("extra_power_curve_sport_key") : null;
        c2227a.getClass();
        ma1.a aVarA = ma1.a.C2227a.a(string);
        if (aVarA == null) {
            aVarA = ma1.a.CYCLING;
        }
        d dVar = new d(aVarA, 2);
        m mVarRequireActivity = new C0758b(this).f40348a.requireActivity();
        this.f40347p = (ra1.a) GetViewModelKt.resolveViewModel$default(s0.f105811a.b(ra1.a.class), mVarRequireActivity.getF189591b(), null, mVarRequireActivity.getDefaultViewModelCreationExtras(), null, AndroidKoinScopeExtKt.getKoinScope(this), dVar, 4, null);
        super.onCreate(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        return A6(viewGroup, layoutInflater, R.layout.gcm_power_curve_summary_fragment);
    }

    @Override // e32.i, e32.a, androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        TextView textView = (TextView) view2.findViewById(R.id.power_records_tv);
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        ra1.a aVar = this.f40347p;
        if (aVar == null) {
            s.m("viewModel");
            throw null;
        }
        textView.setText(dh.b.A(contextRequireContext, aVar.f151466a.f117630c));
        ((TextView) view2.findViewById(R.id.power_curve_explanation_text)).setText(requireContext().getString(R.string.power_curve_sport_agnostic_help_text));
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/powercurve/view/b$a;", "", "<init>", "()V", "gcm-power-curve_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
