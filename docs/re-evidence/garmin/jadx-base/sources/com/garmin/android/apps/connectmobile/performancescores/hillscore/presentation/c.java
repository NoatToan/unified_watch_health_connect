package com.garmin.android.apps.connectmobile.performancescores.hillscore.presentation;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.y1;
import com.garmin.android.apps.connectmobile.R;
import e32.i;
import e32.l;
import e32.p;
import f32.m;
import o72.v3;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s0;
import p005kotlin.jvm.internal.w;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\u0007B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/performancescores/hillscore/presentation/c;", "Le32/i;", "Lu81/b;", "Lq81/i;", "Lo81/d;", "<init>", "()V", "a", "gcm-performance-scores_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c extends i<u81.b, q81.i, o81.d> {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final a f40279q = new a(null);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final w1 f40280p = new w1(s0.f105811a.b(v81.a.class), new b(this), new v3(17), new C0755c(null, this));

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/y1;", "invoke", "()Landroidx/lifecycle/y1;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class b extends w implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f40281a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Fragment fragment) {
            super(0);
            this.f40281a = fragment;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f40281a.requireActivity().getF189591b();
        }
    }

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.performancescores.hillscore.presentation.c$c, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class C0755c extends w implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f40282a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Fragment f40283b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0755c(e23.a aVar, Fragment fragment) {
            super(0);
            this.f40282a = aVar;
            this.f40283b = fragment;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f40282a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f40283b.requireActivity().getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Override // e32.a
    public final p K6(View view2, l lVar) {
        LocalDate localDate = V6().toLocalDate();
        localDate.getClass();
        LocalDate localDate2 = T6().toLocalDate();
        localDate2.getClass();
        return new q81.i(view2, lVar, localDate, localDate2);
    }

    @Override // e32.i
    public final int U6() {
        return R.id.reports_summary_header;
    }

    @Override // e32.i
    public final m X6() {
        return ((v81.a) this.f40280p.getValue()).f176228g;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        return A6(viewGroup, layoutInflater, R.layout.hill_score_report_fragment);
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/performancescores/hillscore/presentation/c$a;", "", "<init>", "()V", "gcm-performance-scores_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
