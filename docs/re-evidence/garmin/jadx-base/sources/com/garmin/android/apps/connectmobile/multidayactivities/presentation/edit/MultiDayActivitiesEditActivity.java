package com.garmin.android.apps.connectmobile.multidayactivities.presentation.edit;

import android.annotation.SuppressLint;
import android.net.Uri;
import android.os.Bundle;
import androidx.compose.ui.platform.ComposeView;
import androidx.lifecycle.v1;
import c22.g;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import cy0.k;
import e23.p;
import gy0.t1;
import gy0.u1;
import jy0.l;
import jy0.q;
import o13.m;
import o13.n;
import o13.r;
import o53.b0;
import org.joda.time.DateTime;
import org.koin.core.qualifier.Qualifier;
import org.koin.core.scope.Scope;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s0;
import p3.p1;
import p3.x3;
import sy0.j;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0013²\u0006\f\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002²\u0006\u0010\u0010\b\u001a\u0004\u0018\u00010\u00078\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\n\u001a\u00020\t8\n@\nX\u008a\u008e\u0002²\u0006\u0014\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b8\nX\u008a\u0084\u0002²\u0006\f\u0010\u000f\u001a\u00020\u000e8\nX\u008a\u0084\u0002²\u0006\f\u0010\u0011\u001a\u00020\u00108\nX\u008a\u0084\u0002²\u0006\u000e\u0010\u0012\u001a\u00020\t8\n@\nX\u008a\u008e\u0002²\u0006\f\u0010\u0011\u001a\u00020\u00108\nX\u008a\u0084\u0002"}, d2 = {"Lcom/garmin/android/apps/connectmobile/multidayactivities/presentation/edit/MultiDayActivitiesEditActivity;", "Lcom/garmin/android/apps/connectmobile/c;", "<init>", "()V", "a", "Lsy0/j;", "multiDayActivityCreationData", "Lcy0/e;", "dateRangeConflict", "", "hasError", "Li53/f;", "Lsy0/f;", "processedCoursesList", "Lk30/n;", "courseFilterData", "Lsy0/b;", "activitiesSelectionState", "inProgress", "gcm-multi-day-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class MultiDayActivitiesEditActivity extends com.garmin.android.apps.connectmobile.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f39291b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f39292a = m.a(n.SYNCHRONIZED, new f(xy2.b.v(), null, null));

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.multidayactivities.presentation.edit.MultiDayActivitiesEditActivity$onCreate$1$1$1$1$1$10$1$1", f = "MultiDayActivitiesEditActivity.kt", l = {131}, m = "invokeSuspend", v = 2)
    public static final class b extends i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public MultiDayActivitiesEditActivity f39293a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public p1 f39294b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public p1 f39295c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f39296d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public /* synthetic */ Object f39297e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ k f39298f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ MultiDayActivitiesEditActivity f39299g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ p1<cy0.e> f39300h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ p1<Boolean> f39301i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(k kVar, MultiDayActivitiesEditActivity multiDayActivitiesEditActivity, p1<cy0.e> p1Var, p1<Boolean> p1Var2, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f39298f = kVar;
            this.f39299g = multiDayActivitiesEditActivity;
            this.f39300h = p1Var;
            this.f39301i = p1Var2;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            b bVar = new b(this.f39298f, this.f39299g, this.f39300h, this.f39301i, dVar);
            bVar.f39297e = obj;
            return bVar;
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object, o13.l] */
        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            MultiDayActivitiesEditActivity multiDayActivitiesEditActivity;
            p1<Boolean> p1Var;
            Object objU;
            p1<cy0.e> p1Var2;
            p1<Boolean> p1Var3;
            b0 b0Var = (b0) this.f39297e;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f39296d;
            if (i14 == 0) {
                r.b(obj);
                k kVar = this.f39298f;
                if (kVar != null) {
                    a aVar2 = MultiDayActivitiesEditActivity.f39291b;
                    multiDayActivitiesEditActivity = this.f39299g;
                    multiDayActivitiesEditActivity.ca().N2();
                    l lVarCa = multiDayActivitiesEditActivity.ca();
                    this.f39297e = b0Var;
                    this.f39293a = multiDayActivitiesEditActivity;
                    p1<cy0.e> p1Var4 = this.f39300h;
                    this.f39294b = p1Var4;
                    p1<Boolean> p1Var5 = this.f39301i;
                    this.f39295c = p1Var5;
                    this.f39296d = 1;
                    String str = lVarCa.f101747f;
                    if (str != null) {
                        k kVarC0 = oe2.f.c0((j) lVarCa.f101748g.getValue());
                        p1Var = p1Var5;
                        objU = ((t1) lVarCa.f101746e.getValue()).f80234a.u(str, k.b(kVar, kVarC0.getName(), null, kVarC0.getStartDate(), kVarC0.getEndDate(), kVarC0.k().f161256a, kVarC0.getShareLiveTrack(), kVarC0.f(), kVarC0.d(), 6219), this);
                        if (objU != aVar) {
                            objU = (u1) objU;
                        }
                    } else {
                        p1Var = p1Var5;
                        objU = null;
                    }
                    if (objU == aVar) {
                        return aVar;
                    }
                    p1Var2 = p1Var4;
                    p1Var3 = p1Var;
                }
                return Unit.INSTANCE;
            }
            if (i14 != 1) {
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            p1Var3 = this.f39295c;
            p1Var2 = this.f39294b;
            MultiDayActivitiesEditActivity multiDayActivitiesEditActivity2 = this.f39293a;
            r.b(obj);
            multiDayActivitiesEditActivity = multiDayActivitiesEditActivity2;
            objU = obj;
            u1 u1Var = (u1) objU;
            if (u1Var instanceof u1.c) {
                multiDayActivitiesEditActivity.setResult(-1);
                multiDayActivitiesEditActivity.finish();
            } else if (u1Var instanceof u1.a) {
                cy0.e eVar = ((u1.a) u1Var).f80241a;
                a aVar3 = MultiDayActivitiesEditActivity.f39291b;
                p1Var2.setValue(eVar);
            } else if (u1Var instanceof u1.b) {
                u1.b bVar = (u1.b) u1Var;
                String str2 = "Error updating epic - Code " + bVar.f80243b + ", exception: " + bVar.f80242a;
                i2.a aVar4 = i2.f36769a;
                a2 a2Var = a2.GENERAL;
                aVar4.getClass();
                i2.a.f(a2Var, "MULTI_DAY_ACTIVITY_EDIT", str2);
                a aVar5 = MultiDayActivitiesEditActivity.f39291b;
                p1Var3.setValue(Boolean.TRUE);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.multidayactivities.presentation.edit.MultiDayActivitiesEditActivity$onCreate$1$1$1$1$1$2$1$1", f = "MultiDayActivitiesEditActivity.kt", l = {95}, m = "invokeSuspend", v = 2)
    public static final class c extends i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f39302a;

        public c(t13.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return MultiDayActivitiesEditActivity.this.new c(dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f39302a;
            if (i14 == 0) {
                r.b(obj);
                a aVar2 = MultiDayActivitiesEditActivity.f39291b;
                l lVarCa = MultiDayActivitiesEditActivity.this.ca();
                this.f39302a = 1;
                if (lVarCa.V(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.multidayactivities.presentation.edit.MultiDayActivitiesEditActivity$onCreate$1$1$1$1$1$3$1$1", f = "MultiDayActivitiesEditActivity.kt", l = {103}, m = "invokeSuspend", v = 2)
    public static final class d extends i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f39304a;

        public d(t13.d<? super d> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return MultiDayActivitiesEditActivity.this.new d(dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((d) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f39304a;
            if (i14 == 0) {
                r.b(obj);
                a aVar2 = MultiDayActivitiesEditActivity.f39291b;
                l lVarCa = MultiDayActivitiesEditActivity.this.ca();
                this.f39304a = 1;
                if (lVarCa.V(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 3, 0}, xi = 48)
    @v13.e(c = "com.garmin.android.apps.connectmobile.multidayactivities.presentation.edit.MultiDayActivitiesEditActivity$onCreate$1$1$1$1$4$2$1$1", f = "MultiDayActivitiesEditActivity.kt", l = {253}, m = "invokeSuspend", v = 2)
    public static final class e extends i implements e23.l<t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f39306a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ x3<sy0.b> f39308c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(x3<sy0.b> x3Var, t13.d<? super e> dVar) {
            super(1, dVar);
            this.f39308c = x3Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(t13.d<?> dVar) {
            return MultiDayActivitiesEditActivity.this.new e(this.f39308c, dVar);
        }

        @Override // e23.l
        public final Object invoke(t13.d<? super Unit> dVar) {
            return ((e) create(dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f39306a;
            if (i14 == 0) {
                r.b(obj);
                a aVar2 = MultiDayActivitiesEditActivity.f39291b;
                if (!this.f39308c.getF182175a().f161204d) {
                    l lVarCa = MultiDayActivitiesEditActivity.this.ca();
                    this.f39306a = 1;
                    if (lVarCa.V(this) == aVar) {
                        return aVar;
                    }
                }
            } else {
                if (i14 != 1) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class f implements e23.a<l> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Scope f39309a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f39310b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f39311c;

        public f(Scope scope, Qualifier qualifier, e23.a aVar) {
            this.f39309a = scope;
            this.f39310b = qualifier;
            this.f39311c = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, jy0.l] */
        @Override // e23.a
        public final l invoke() {
            return this.f39309a.get(s0.f105811a.b(l.class), this.f39310b, this.f39311c);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o13.l] */
    public final l ca() {
        return (l) this.f39292a.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0027  */
    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    @SuppressLint({"MissingPermission"})
    public final void onCreate(Bundle bundle) {
        String uuid;
        super.onCreate(bundle);
        b.j.a(this);
        k kVar = (k) getIntent().getParcelableExtra("MULTI_DAY_ACTIVITY_DATA");
        l lVarCa = ca();
        if (kVar != null) {
            lVarCa.getClass();
            cy0.r rVarT = kVar.getUuid();
            if (rVarT != null) {
                uuid = rVarT.getUuid();
            } else {
                uuid = null;
            }
        } else {
            uuid = null;
        }
        lVarCa.f101747f = uuid;
        if (kVar != null) {
            lVarCa.e2(kVar.getName());
            DateTime dateTimeC = ay0.b.c(kVar.getStartDate());
            lVarCa.N3(dateTimeC != null ? Long.valueOf(dateTimeC.getMillis()) : null);
            DateTime dateTimeC2 = ay0.b.c(kVar.getEndDate());
            lVarCa.n3(dateTimeC2 != null ? Long.valueOf(dateTimeC2.getMillis()) : null);
            lVarCa.N2();
            ge1.b.T(v1.a(lVarCa), null, null, new q(lVarCa, kVar, null), 3);
            ge1.b.T(v1.a(lVarCa), null, null, new jy0.r(lVarCa, kVar, null), 3);
            lVarCa.Q1(kVar.k());
            lVarCa.E1(kVar.getShareLiveTrack());
        }
        Uri data = getIntent().getData();
        if (data != null) {
            g.f23056a.getClass();
            g.b(data);
        }
        setContentView(R.layout.activity_composable_container);
        ((ComposeView) findViewById(R.id.composable_container)).setContent(new z3.e(1283956521, true, new qy0.c(this, kVar, 0)));
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/multidayactivities/presentation/edit/MultiDayActivitiesEditActivity$a;", "", "<init>", "()V", "", "MULTI_DAY_ACTIVITY_DATA", "Ljava/lang/String;", "CLASS_TAG", "gcm-multi-day-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
