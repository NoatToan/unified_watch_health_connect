package com.garmin.android.apps.connectmobile.weighttracker.presentation;

import android.os.Build;
import android.os.Bundle;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.y1;
import b.g;
import g22.k;
import java.io.Serializable;
import o13.l;
import o13.m;
import o13.n;
import org.joda.time.DateTime;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.bundle.GetViewModelKt;
import org.koin.core.qualifier.Qualifier;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s0;
import q42.d0;
import q42.f0;
import q42.i;
import q42.q;
import q42.y;
import r53.p2;
import z3.e;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u000b²\u0006\f\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002²\u0006\f\u0010\b\u001a\u00020\u00078\nX\u008a\u0084\u0002²\u0006\f\u0010\n\u001a\u00020\t8\nX\u008a\u0084\u0002"}, d2 = {"Lcom/garmin/android/apps/connectmobile/weighttracker/presentation/WeightReportsActivity;", "Lcom/garmin/android/apps/connectmobile/d;", "<init>", "()V", "a", "Lq42/y;", "viewModel", "Lq42/d0;", "pregnancyViewModel", "Lq42/i;", "weightGoalViewModel", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class WeightReportsActivity extends com.garmin.android.apps.connectmobile.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f47991a = 0;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b implements e23.a<y> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g f47992a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f47993b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f47994c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ e23.a f47995d;

        public b(g gVar, Qualifier qualifier, e23.a aVar, e23.a aVar2) {
            this.f47992a = gVar;
            this.f47993b = qualifier;
            this.f47994c = aVar;
            this.f47995d = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [androidx.lifecycle.u1, q42.y] */
        @Override // e23.a
        public final y invoke() {
            CreationExtras defaultViewModelCreationExtras;
            g gVar = this.f47992a;
            y1 viewModelStore = gVar.getF189591b();
            e23.a aVar = this.f47994c;
            if (aVar == null || (defaultViewModelCreationExtras = (CreationExtras) aVar.invoke()) == null) {
                defaultViewModelCreationExtras = gVar.getDefaultViewModelCreationExtras();
            }
            return GetViewModelKt.resolveViewModel$default(s0.f105811a.b(y.class), viewModelStore, null, defaultViewModelCreationExtras, this.f47993b, AndroidKoinScopeExtKt.getKoinScope(gVar), this.f47995d, 4, null);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements e23.a<d0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g f47996a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f47997b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f47998c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ e23.a f47999d;

        public c(g gVar, Qualifier qualifier, e23.a aVar, e23.a aVar2) {
            this.f47996a = gVar;
            this.f47997b = qualifier;
            this.f47998c = aVar;
            this.f47999d = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [androidx.lifecycle.u1, q42.d0] */
        @Override // e23.a
        public final d0 invoke() {
            CreationExtras defaultViewModelCreationExtras;
            g gVar = this.f47996a;
            y1 viewModelStore = gVar.getF189591b();
            e23.a aVar = this.f47998c;
            if (aVar == null || (defaultViewModelCreationExtras = (CreationExtras) aVar.invoke()) == null) {
                defaultViewModelCreationExtras = gVar.getDefaultViewModelCreationExtras();
            }
            return GetViewModelKt.resolveViewModel$default(s0.f105811a.b(d0.class), viewModelStore, null, defaultViewModelCreationExtras, this.f47997b, AndroidKoinScopeExtKt.getKoinScope(gVar), this.f47999d, 4, null);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class d implements e23.a<i> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g f48000a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f48001b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f48002c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ e23.a f48003d;

        public d(g gVar, Qualifier qualifier, e23.a aVar, e23.a aVar2) {
            this.f48000a = gVar;
            this.f48001b = qualifier;
            this.f48002c = aVar;
            this.f48003d = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [androidx.lifecycle.u1, q42.i] */
        @Override // e23.a
        public final i invoke() {
            CreationExtras defaultViewModelCreationExtras;
            g gVar = this.f48000a;
            y1 viewModelStore = gVar.getF189591b();
            e23.a aVar = this.f48002c;
            if (aVar == null || (defaultViewModelCreationExtras = (CreationExtras) aVar.invoke()) == null) {
                defaultViewModelCreationExtras = gVar.getDefaultViewModelCreationExtras();
            }
            return GetViewModelKt.resolveViewModel$default(s0.f105811a.b(i.class), viewModelStore, null, defaultViewModelCreationExtras, this.f48001b, AndroidKoinScopeExtKt.getKoinScope(gVar), this.f48003d, 4, null);
        }
    }

    static {
        new a(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.garmin.android.apps.connectmobile.d, com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        DateTime dateTime;
        Object value;
        Object value2;
        Serializable serializable;
        Object serializable2;
        super.onCreate(bundle);
        q qVar = new q(this, 0);
        n nVar = n.NONE;
        Serializable serializable3 = null;
        l lVarA = m.a(nVar, new b(this, null, null, qVar));
        l lVarA2 = m.a(nVar, new c(this, null, null, null));
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                serializable2 = extras.getSerializable("EXTRA_INITIAL_DATE", DateTime.class);
            } else {
                Object serializable4 = extras.getSerializable("EXTRA_INITIAL_DATE");
                if (!(serializable4 instanceof DateTime)) {
                    serializable4 = null;
                }
                serializable2 = (DateTime) serializable4;
            }
            dateTime = (DateTime) serializable2;
        } else {
            dateTime = null;
        }
        Bundle extras2 = getIntent().getExtras();
        if (extras2 != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                serializable = extras2.getSerializable("EXTRA_SELECTED_INTERVAL_TYPE", o82.g.class);
            } else {
                Serializable serializable5 = extras2.getSerializable("EXTRA_SELECTED_INTERVAL_TYPE");
                serializable = (o82.g) (serializable5 instanceof o82.g ? serializable5 : null);
            }
            serializable3 = (o82.g) serializable;
        }
        o82.g gVar = serializable3;
        boolean booleanExtra = getIntent().getBooleanExtra("EXTRA_SHOW_EDIT_WEIGHT_GOAL", false);
        p2 p2Var = ((y) lVarA.getValue()).f142755k;
        if (dateTime != null) {
            do {
                value2 = p2Var.getValue();
            } while (!p2Var.b(value2, f0.a((f0) value2, k.z(dateTime).b(), null, null, null, null, 62)));
        }
        if (gVar != 0) {
            do {
                value = p2Var.getValue();
            } while (!p2Var.b(value, f0.a((f0) value, null, gVar, null, null, null, 61)));
        }
        initComposeScreen(new e(1183824216, true, new li0.y(booleanExtra, lVarA, lVarA2, this, 5)));
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/garmin/android/apps/connectmobile/weighttracker/presentation/WeightReportsActivity$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "MENU_ITEM_POUNDS_ID", "MENU_ITEM_KILOGRAMS_ID", "MENU_ITEM_STONES_ID", "MENU_ITEM_ADD_WEIGHT_ID", "MENU_ITEM_EDIT_GOAL_ID", "MENU_ITEM_HELP_ID", "MENU_ITEM_DELETE_WEIGHT_ID", "REGISTERED_INDEX_SCALE_2_AVAILABLE", "EXTRA_SHOW_INDEX_S2_WHATS_NEW", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
