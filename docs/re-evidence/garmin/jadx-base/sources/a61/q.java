package a61;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y0;
import androidx.lifecycle.y1;
import com.garmin.android.apps.connectmobile.R;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La61/q;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "a", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class q extends Fragment {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f1656e = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public e32.l<com.garmin.android.apps.connectmobile.performance.a> f1658b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public com.garmin.android.apps.connectmobile.performance.b f1659c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w1 f1657a = new w1(s0.f105811a.b(o71.i.class), new b(this), new d(this), new c(null, this));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final y0<o71.e> f1660d = new y0<>();

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/y1;", "invoke", "()Landroidx/lifecycle/y1;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class b extends p005kotlin.jvm.internal.w implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f1661a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Fragment fragment) {
            super(0);
            this.f1661a = fragment;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f1661a.requireActivity().getF189591b();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class c extends p005kotlin.jvm.internal.w implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f1662a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Fragment f1663b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(e23.a aVar, Fragment fragment) {
            super(0);
            this.f1662a = aVar;
            this.f1663b = fragment;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f1662a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f1663b.requireActivity().getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/x1$c;", "invoke", "()Landroidx/lifecycle/x1$c;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class d extends p005kotlin.jvm.internal.w implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f1664a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Fragment fragment) {
            super(0);
            this.f1664a = fragment;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f1664a.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        context.getClass();
        this.f1658b = (e32.l) context;
        super.onAttach(context);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        return layoutInflater.inflate(R.layout.gcm_strength_training_performance_summary_fragment, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        com.garmin.android.apps.connectmobile.performance.b bVar = this.f1659c;
        if (bVar != null) {
            o71.e eVar = (o71.e) bVar.f39859f.f130243e.get(bVar.f39858e);
            bVar.b(eVar != null ? o71.e.b(eVar) : null);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        o71.g gVar;
        o71.h hVar;
        Object serializable;
        Object serializable2;
        view2.getClass();
        super.onViewCreated(view2, bundle);
        Bundle arguments = getArguments();
        DateTime dateTime = new DateTime(arguments != null ? arguments.getLong("GCM_extra_start_date") : DateTime.now().getMillis());
        Bundle arguments2 = getArguments();
        DateTime dateTime2 = new DateTime(arguments2 != null ? arguments2.getLong("GCM_extra_end_date") : DateTime.now().getMillis());
        Bundle arguments3 = getArguments();
        if (arguments3 != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                serializable2 = arguments3.getSerializable("GCM_extra_summary_interval", o71.g.class);
            } else {
                Object serializable3 = arguments3.getSerializable("GCM_extra_summary_interval");
                if (!(serializable3 instanceof o71.g)) {
                    serializable3 = null;
                }
                serializable2 = (o71.g) serializable3;
            }
            gVar = (o71.g) serializable2;
        } else {
            gVar = null;
        }
        gVar.getClass();
        Bundle arguments4 = getArguments();
        if (arguments4 != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                serializable = arguments4.getSerializable("extra.strength.type", o71.h.class);
            } else {
                Object serializable4 = arguments4.getSerializable("extra.strength.type");
                if (!(serializable4 instanceof o71.h)) {
                    serializable4 = null;
                }
                serializable = (o71.h) serializable4;
            }
            hVar = (o71.h) serializable;
        } else {
            hVar = null;
        }
        hVar.getClass();
        e32.l<com.garmin.android.apps.connectmobile.performance.a> lVar = this.f1658b;
        if (lVar == null) {
            p005kotlin.jvm.internal.s.m("navigator");
            throw null;
        }
        LocalDate localDate = dateTime.toLocalDate();
        localDate.getClass();
        LocalDate localDate2 = dateTime2.toLocalDate();
        localDate2.getClass();
        this.f1659c = new com.garmin.android.apps.connectmobile.performance.b(this, view2, lVar, hVar, gVar, j23.s.a(localDate, localDate2), (o71.i) this.f1657a.getValue(), this.f1660d);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"La61/q$a;", "", "<init>", "()V", "", "EXTRA_STRENGTH_TYPE", "Ljava/lang/String;", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
