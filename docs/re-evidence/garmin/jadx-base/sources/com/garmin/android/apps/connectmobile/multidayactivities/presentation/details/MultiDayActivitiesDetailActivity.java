package com.garmin.android.apps.connectmobile.multidayactivities.presentation.details;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import b.j;
import c22.g;
import com.garmin.android.apps.connectmobile.k1;
import e23.p;
import ky0.w0;
import ky0.x;
import o13.l;
import o13.m;
import o13.n;
import o13.r;
import o53.b0;
import org.koin.core.qualifier.Qualifier;
import org.koin.core.scope.Scope;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s0;
import p3.x3;
import sy0.f;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0010²\u0006\f\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002²\u0006\f\u0010\b\u001a\u00020\u00078\nX\u008a\u0084\u0002²\u0006\f\u0010\n\u001a\u00020\t8\nX\u008a\u0084\u0002²\u0006\f\u0010\f\u001a\u00020\u000b8\nX\u008a\u0084\u0002²\u0006\u0018\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00070\r8\nX\u008a\u0084\u0002"}, d2 = {"Lcom/garmin/android/apps/connectmobile/multidayactivities/presentation/details/MultiDayActivitiesDetailActivity;", "Lcom/garmin/android/apps/connectmobile/c;", "<init>", "()V", "a", "Lky0/w0;", "viewModel", "", "hasChanges", "Lsy0/e;", "courseDetails", "Lk30/n;", "courseFilterData", "Li53/g;", "Lky0/a2;", "availableSettings", "gcm-multi-day-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class MultiDayActivitiesDetailActivity extends com.garmin.android.apps.connectmobile.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f39233a = new a(null);

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b implements e23.a<w0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Scope f39234a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f39235b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f39236c;

        public b(Scope scope, Qualifier qualifier, e23.a aVar) {
            this.f39234a = scope;
            this.f39235b = qualifier;
            this.f39236c = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, ky0.w0] */
        @Override // e23.a
        public final w0 invoke() {
            return this.f39234a.get(s0.f105811a.b(w0.class), this.f39235b, this.f39236c);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.multidayactivities.presentation.details.MultiDayActivitiesDetailActivity$onCreate$1$1$1$1", f = "MultiDayActivitiesDetailActivity.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class c extends i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ x3<Boolean> f39238b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(x3<Boolean> x3Var, t13.d<? super c> dVar) {
            super(2, dVar);
            this.f39238b = x3Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return MultiDayActivitiesDetailActivity.this.new c(this.f39238b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            a aVar2 = MultiDayActivitiesDetailActivity.f39233a;
            MultiDayActivitiesDetailActivity.this.setResult(this.f39238b.getF182175a().booleanValue() ? -1 : 0);
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.multidayactivities.presentation.details.MultiDayActivitiesDetailActivity$onCreate$1$1$2$1$2$1$1$1$1$1", f = "MultiDayActivitiesDetailActivity.kt", l = {100}, m = "invokeSuspend", v = 2)
    public static final class d extends i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f39239a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ f f39240b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ l<w0> f39241c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(f fVar, l<w0> lVar, t13.d<? super d> dVar) {
            super(2, dVar);
            this.f39240b = fVar;
            this.f39241c = lVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new d(this.f39240b, this.f39241c, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((d) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f39239a;
            if (i14 == 0) {
                r.b(obj);
                a aVar2 = MultiDayActivitiesDetailActivity.f39233a;
                w0 value = this.f39241c.getValue();
                this.f39239a = 1;
                if (value.U4(this.f39240b, this) == aVar) {
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
    @v13.e(c = "com.garmin.android.apps.connectmobile.multidayactivities.presentation.details.MultiDayActivitiesDetailActivity$onCreate$1$1$2$1$2$2$1$1$1$1", f = "MultiDayActivitiesDetailActivity.kt", l = {125}, m = "invokeSuspend", v = 2)
    public static final class e extends i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f39242a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ f f39243b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ l<w0> f39244c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(f fVar, l<w0> lVar, t13.d<? super e> dVar) {
            super(2, dVar);
            this.f39243b = fVar;
            this.f39244c = lVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new e(this.f39243b, this.f39244c, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((e) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f39242a;
            if (i14 == 0) {
                r.b(obj);
                a aVar2 = MultiDayActivitiesDetailActivity.f39233a;
                w0 value = this.f39244c.getValue();
                this.f39242a = 1;
                if (value.U4(this.f39243b, this) == aVar) {
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

    public static Unit ca(MultiDayActivitiesDetailActivity multiDayActivitiesDetailActivity) {
        super.onBackPressed();
        return Unit.INSTANCE;
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        j.a(this);
        String stringExtra = getIntent().getStringExtra("EPIC_ACTIVITY_ID");
        if (stringExtra == null) {
            stringExtra = "";
        }
        l lVarA = m.a(n.SYNCHRONIZED, new b(xy2.b.v(), null, new a90.c(stringExtra, 6)));
        bv.b.f21239a.getClass();
        bv.b.a();
        if (!k1.f37122a.x()) {
            super.onBackPressed();
            return;
        }
        Uri data = getIntent().getData();
        if (data != null) {
            g.f23056a.getClass();
            g.b(data);
        }
        c.j.a(this, new z3.e(-1016690092, true, new x(this, lVarA, 0)));
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/multidayactivities/presentation/details/MultiDayActivitiesDetailActivity$a;", "", "<init>", "()V", "", "EPIC_ACTIVITY_ID", "Ljava/lang/String;", "gcm-multi-day-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static void a(Context context, f.c cVar, String str) {
            context.getClass();
            cVar.getClass();
            str.getClass();
            Intent intent = new Intent(context, (Class<?>) MultiDayActivitiesDetailActivity.class);
            intent.putExtra("EPIC_ACTIVITY_ID", str);
            intent.setFlags(536870912);
            cVar.a(intent, null);
        }

        public static void b(Context context, String str) {
            context.getClass();
            str.getClass();
            Intent intent = new Intent(context, (Class<?>) MultiDayActivitiesDetailActivity.class);
            intent.putExtra("EPIC_ACTIVITY_ID", str);
            intent.setFlags(536870912);
            context.startActivity(intent);
        }

        private a() {
        }
    }
}
