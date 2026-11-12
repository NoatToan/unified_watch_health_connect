package com.garmin.android.apps.connectmobile.performance.acclimation.presentation;

import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.y1;
import com.garmin.android.apps.connectmobile.R;
import cq0.g;
import d61.d;
import e32.i;
import e32.l;
import e32.p;
import f32.m;
import java.io.Serializable;
import java.util.List;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import p005kotlin.jvm.internal.w;
import x61.e;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/garmin/android/apps/connectmobile/performance/acclimation/presentation/b;", "Le32/i;", "", "Lx61/e;", "Ld61/d;", "Ld61/b;", "<init>", "()V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b extends i<List<? extends e>, d, d61.b> {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final a f39846r = new a(null);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public c61.a f39847p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final w1 f39848q = new w1(s0.f105811a.b(d61.e.class), new C0731b(this), new g(this, 13), new c(null, this));

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.performance.acclimation.presentation.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/y1;", "invoke", "()Landroidx/lifecycle/y1;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class C0731b extends w implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f39849a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0731b(Fragment fragment) {
            super(0);
            this.f39849a = fragment;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f39849a.requireActivity().getF189591b();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class c extends w implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f39850a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Fragment f39851b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(e23.a aVar, Fragment fragment) {
            super(0);
            this.f39850a = aVar;
            this.f39851b = fragment;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f39850a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f39851b.requireActivity().getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Override // e32.a
    public final p K6(View view2, l lVar) {
        LocalDate localDate = V6().withTimeAtStartOfDay().toLocalDate();
        localDate.getClass();
        LocalDate localDate2 = T6().withTimeAtStartOfDay().toLocalDate();
        localDate2.getClass();
        c61.a aVar = this.f39847p;
        if (aVar != null) {
            return new d(localDate, localDate2, aVar, view2, null, 16, null);
        }
        s.m("trainingStatusAcclimationType");
        throw null;
    }

    @Override // e32.i
    public final int U6() {
        return R.id.reports_summary_header;
    }

    @Override // e32.i
    public final m X6() {
        return ((d61.e) this.f39848q.getValue()).f57986d;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        Bundle arguments = getArguments();
        Serializable serializable = null;
        if (Build.VERSION.SDK_INT < 33) {
            Serializable serializable2 = arguments != null ? arguments.getSerializable("extra_acclimation_data") : null;
            serializable = (c61.a) (serializable2 instanceof c61.a ? serializable2 : null);
        } else if (arguments != null) {
            serializable = arguments.getSerializable("extra_acclimation_data", c61.a.class);
        }
        c61.a aVar = (c61.a) serializable;
        if (aVar == null) {
            aVar = c61.a.ALTITUDE;
        }
        this.f39847p = aVar;
        return A6(viewGroup, layoutInflater, R.layout.fragment_acclimation_report_with_chart);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/performance/acclimation/presentation/b$a;", "", "<init>", "()V", "", "EXTRA_ACCLIMATION_DATA_KEY", "Ljava/lang/String;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
