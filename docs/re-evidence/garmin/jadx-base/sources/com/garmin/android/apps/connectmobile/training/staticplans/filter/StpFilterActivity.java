package com.garmin.android.apps.connectmobile.training.staticplans.filter;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.v;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y1;
import androidx.lifecycle.z0;
import b.g;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.training.staticplans.filter.StpFilterActivity;
import e23.l;
import hx1.c;
import hx1.f;
import hx1.i;
import java.io.Serializable;
import n23.j;
import o13.h;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.n;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/training/staticplans/filter/StpFilterActivity;", "Lcom/garmin/android/apps/connectmobile/c;", "<init>", "()V", "a", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class StpFilterActivity extends com.garmin.android.apps.connectmobile.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f45633b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w1 f45634a = new w1(s0.f105811a.b(gx1.b.class), new d(this), new c(this), new e(null, this));

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b implements z0, n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f45635a;

        public b(l lVar) {
            lVar.getClass();
            this.f45635a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof n)) {
                return s.g(getFunctionDelegate(), ((n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final h<?> getFunctionDelegate() {
            return this.f45635a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f45635a.invoke(obj);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g f45636a;

        public c(g gVar) {
            this.f45636a = gVar;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f45636a.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class d implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g f45637a;

        public d(g gVar) {
            this.f45637a = gVar;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f45637a.getF189591b();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class e implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f45638a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ g f45639b;

        public e(e23.a aVar, g gVar) {
            this.f45638a = aVar;
            this.f45639b = gVar;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f45638a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f45639b.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    static {
        new a(null);
    }

    public final void ca(Fragment fragment, String str) {
        v supportFragmentManager = getSupportFragmentManager();
        androidx.fragment.app.a aVarC = j.c(supportFragmentManager, supportFragmentManager, R.id.content_frame, fragment, str);
        aVarC.d(str);
        aVarC.e();
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Object serializableExtra;
        Parcelable parcelable;
        super.onCreate(bundle);
        setContentView();
        initActionBar(true, R.string.lbl_filter);
        hideActionBar();
        w1 w1Var = this.f45634a;
        gx1.b bVar = (gx1.b) w1Var.getValue();
        Intent intent = getIntent();
        int i14 = Build.VERSION.SDK_INT;
        if (i14 >= 33) {
            serializableExtra = intent != null ? intent.getSerializableExtra("GCM_plan_training_type", fx1.c.class) : null;
        } else {
            Serializable serializableExtra2 = intent != null ? intent.getSerializableExtra("GCM_plan_training_type") : null;
            if (!(serializableExtra2 instanceof fx1.c)) {
                serializableExtra2 = null;
            }
            serializableExtra = (fx1.c) serializableExtra2;
        }
        serializableExtra.getClass();
        bVar.f80047a = (fx1.c) serializableExtra;
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            if (i14 >= 33) {
                parcelable = (Parcelable) extras.getParcelable("GCM_extra_static_plan_filter_dto", ex1.a.class);
            } else {
                Parcelable parcelable2 = extras.getParcelable("GCM_extra_static_plan_filter_dto");
                parcelable = (ex1.a) (parcelable2 instanceof ex1.a ? parcelable2 : null);
            }
            ex1.a aVar = (ex1.a) parcelable;
            if (aVar != null) {
                ((gx1.b) w1Var.getValue()).x4().j(aVar);
            }
        }
        final int i15 = 0;
        ((gx1.b) w1Var.getValue()).f80049c.f(this, new b(new l(this) { // from class: gx1.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ StpFilterActivity f80045b;

            {
                this.f80045b = this;
            }

            /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
            @Override // e23.l
            public final Object invoke(Object obj) {
                int i16 = i15;
                StpFilterActivity stpFilterActivity = this.f80045b;
                switch (i16) {
                    case 0:
                        String str = (String) obj;
                        int i17 = StpFilterActivity.f45633b;
                        if (str != null) {
                            switch (str.hashCode()) {
                                case -1669408270:
                                    if (str.equals("StpFilterDifficultyFragment")) {
                                        c.f86223i.getClass();
                                        stpFilterActivity.ca(new c(), str);
                                    }
                                    break;
                                case -43623068:
                                    if (str.equals("StpFilterWorkoutsPerWeekFragment")) {
                                        hx1.l.f86289l.getClass();
                                        stpFilterActivity.ca(new hx1.l(), str);
                                    }
                                    break;
                                case 51373527:
                                    if (str.equals("StpFilterFragment")) {
                                        f.f86243l.getClass();
                                        stpFilterActivity.ca(new f(), str);
                                    }
                                    break;
                                case 915010042:
                                    if (str.equals("StpFilterPlanTypeFragment")) {
                                        i.f86265m.getClass();
                                        stpFilterActivity.ca(new i(), str);
                                    }
                                    break;
                            }
                        }
                        break;
                    default:
                        Boolean bool = (Boolean) obj;
                        int i18 = StpFilterActivity.f45633b;
                        if (bool != null) {
                            if (bool.booleanValue()) {
                                stpFilterActivity.showActionBar();
                            } else {
                                stpFilterActivity.hideActionBar();
                            }
                        }
                        break;
                }
                return Unit.INSTANCE;
            }
        }));
        final int i16 = 1;
        ((gx1.b) w1Var.getValue()).f80051e.f(this, new b(new l(this) { // from class: gx1.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ StpFilterActivity f80045b;

            {
                this.f80045b = this;
            }

            /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
            @Override // e23.l
            public final Object invoke(Object obj) {
                int i17 = i16;
                StpFilterActivity stpFilterActivity = this.f80045b;
                switch (i17) {
                    case 0:
                        String str = (String) obj;
                        int i18 = StpFilterActivity.f45633b;
                        if (str != null) {
                            switch (str.hashCode()) {
                                case -1669408270:
                                    if (str.equals("StpFilterDifficultyFragment")) {
                                        c.f86223i.getClass();
                                        stpFilterActivity.ca(new c(), str);
                                    }
                                    break;
                                case -43623068:
                                    if (str.equals("StpFilterWorkoutsPerWeekFragment")) {
                                        hx1.l.f86289l.getClass();
                                        stpFilterActivity.ca(new hx1.l(), str);
                                    }
                                    break;
                                case 51373527:
                                    if (str.equals("StpFilterFragment")) {
                                        f.f86243l.getClass();
                                        stpFilterActivity.ca(new f(), str);
                                    }
                                    break;
                                case 915010042:
                                    if (str.equals("StpFilterPlanTypeFragment")) {
                                        i.f86265m.getClass();
                                        stpFilterActivity.ca(new i(), str);
                                    }
                                    break;
                            }
                        }
                        break;
                    default:
                        Boolean bool = (Boolean) obj;
                        int i19 = StpFilterActivity.f45633b;
                        if (bool != null) {
                            if (bool.booleanValue()) {
                                stpFilterActivity.showActionBar();
                            } else {
                                stpFilterActivity.hideActionBar();
                            }
                        }
                        break;
                }
                return Unit.INSTANCE;
            }
        }));
    }

    @Override // com.garmin.android.apps.connectmobile.z1, android.app.Activity
    public final boolean onNavigateUp() {
        onBackPressed();
        return true;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/training/staticplans/filter/StpFilterActivity$a;", "", "<init>", "()V", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
