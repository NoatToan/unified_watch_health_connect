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
import d61.e;
import e32.l;
import e32.p;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import p005kotlin.jvm.internal.w;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\u0007B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/performance/acclimation/presentation/a;", "Le32/c;", "Lc61/c;", "Ld61/a;", "Ld61/b;", "<init>", "()V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a extends e32.c<c61.c, d61.a, d61.b> {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final C0730a f39840p = new C0730a(null);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public c61.a f39841n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final w1 f39842o = new w1(s0.f105811a.b(e.class), new b(this), new g(this, 12), new c(null, this));

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/y1;", "invoke", "()Landroidx/lifecycle/y1;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class b extends w implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f39843a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Fragment fragment) {
            super(0);
            this.f39843a = fragment;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f39843a.requireActivity().getF189591b();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class c extends w implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f39844a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Fragment f39845b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(e23.a aVar, Fragment fragment) {
            super(0);
            this.f39844a = aVar;
            this.f39845b = fragment;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f39844a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f39845b.requireActivity().getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Override // e32.a
    public final p K6(View view2, l lVar) {
        c61.a aVar = this.f39841n;
        if (aVar != null) {
            return new d61.a(view2, aVar);
        }
        s.m("trainingStatusAcclimationType");
        throw null;
    }

    @Override // e32.c
    public final f32.l V6() {
        return ((e) this.f39842o.getValue()).f57985c;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Object serializable;
        layoutInflater.getClass();
        Bundle arguments = getArguments();
        if (Build.VERSION.SDK_INT >= 33) {
            serializable = arguments != null ? arguments.getSerializable("extra_acclimation_data", c61.a.class) : null;
        } else {
            Object serializable2 = arguments != null ? arguments.getSerializable("extra_acclimation_data") : null;
            if (!(serializable2 instanceof c61.a)) {
                serializable2 = null;
            }
            serializable = (c61.a) serializable2;
        }
        c61.a aVar = (c61.a) serializable;
        if (aVar == null) {
            aVar = c61.a.ALTITUDE;
        }
        this.f39841n = aVar;
        e eVar = (e) this.f39842o.getValue();
        c61.a aVar2 = this.f39841n;
        if (aVar2 != null) {
            eVar.f57984b = aVar2;
            return A6(viewGroup, layoutInflater, R.layout.fragment_altitude_acclimation_current);
        }
        s.m("trainingStatusAcclimationType");
        throw null;
    }

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.performance.acclimation.presentation.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/performance/acclimation/presentation/a$a;", "", "<init>", "()V", "", "EXTRA_ACCLIMATION_DATA_KEY", "Ljava/lang/String;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C0730a {
        public /* synthetic */ C0730a(j jVar) {
            this();
        }

        private C0730a() {
        }
    }
}
