package com.garmin.android.apps.connectmobile.leaderboard.challenges;

import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y1;
import java.util.ArrayList;
import java.util.List;
import mt0.x3;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/leaderboard/challenges/v0;", "Landroidx/fragment/app/n0;", "Lcom/garmin/android/apps/connectmobile/leaderboard/challenges/u0$a;", "<init>", "()V", "a", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class v0 extends androidx.fragment.app.n0 implements u0.a {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final a f37924m = new a(null);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public u0 f37926k;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final w1 f37925j = new w1(p005kotlin.jvm.internal.s0.f105811a.b(x3.class), new b(this), new d(this), new c(null, this));

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final kt0.a f37927l = (kt0.a) KoinJavaComponent.get$default(kt0.a.class, null, null, 6, null);

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/y1;", "invoke", "()Landroidx/lifecycle/y1;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class b extends p005kotlin.jvm.internal.w implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f37928a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Fragment fragment) {
            super(0);
            this.f37928a = fragment;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f37928a.requireActivity().getF189591b();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class c extends p005kotlin.jvm.internal.w implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f37929a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Fragment f37930b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(e23.a aVar, Fragment fragment) {
            super(0);
            this.f37929a = aVar;
            this.f37930b = fragment;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f37929a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f37930b.requireActivity().getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/x1$c;", "invoke", "()Landroidx/lifecycle/x1$c;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class d extends p005kotlin.jvm.internal.w implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f37931a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Fragment fragment) {
            super(0);
            this.f37931a = fragment;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f37931a.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        w1 w1Var = this.f37925j;
        u0 u0Var = new u0(contextRequireContext, ((x3) w1Var.getValue()).f120925c, this);
        this.f37926k = u0Var;
        w6(u0Var);
        u6();
        this.f7311e.setDividerHeight(0);
        u0 u0Var2 = this.f37926k;
        if (u0Var2 == null) {
            p005kotlin.jvm.internal.s.m("adapter");
            throw null;
        }
        com.garmin.android.apps.connectmobile.leaderboard.model.h0 h0Var = ((x3) w1Var.getValue()).f120923a;
        com.garmin.android.apps.connectmobile.leaderboard.model.j0 j0Var = ((x3) w1Var.getValue()).f120924b;
        h0Var.getClass();
        j0Var.getClass();
        u0Var2.f37901c = h0Var;
        List<com.garmin.android.apps.connectmobile.leaderboard.model.i0> listB = j0Var.b();
        if (listB != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : listB) {
                com.garmin.android.apps.connectmobile.leaderboard.model.i0 i0Var = (com.garmin.android.apps.connectmobile.leaderboard.model.i0) obj;
                if (i0Var.getIsAcceptedChallenge() != null && i0Var.getIsAcceptedChallenge().booleanValue()) {
                    arrayList.add(obj);
                }
            }
            u0Var2.clear();
            u0Var2.addAll(arrayList);
            u0Var2.notifyDataSetChanged();
        }
    }

    @Override // com.garmin.android.apps.connectmobile.leaderboard.challenges.u0.a
    public final void x(com.garmin.android.apps.connectmobile.leaderboard.model.i0 i0Var) {
        androidx.fragment.app.m activity = getActivity();
        if (activity == null || i0Var.o()) {
            return;
        }
        this.f37927l.a(activity, i0Var.getDisplayName(), i0Var.getFullName(), i0Var.getProfileImageMedium());
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/leaderboard/challenges/v0$a;", "", "<init>", "()V", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
