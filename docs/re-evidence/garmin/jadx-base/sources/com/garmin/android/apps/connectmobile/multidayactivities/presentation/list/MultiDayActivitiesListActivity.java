package com.garmin.android.apps.connectmobile.multidayactivities.presentation.list;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import c22.g;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.multidayactivities.presentation.creation.MultiDayActivitiesCreationActivity;
import e23.p;
import o13.m;
import o13.n;
import o13.r;
import o53.b0;
import org.koin.core.qualifier.Qualifier;
import org.koin.core.scope.Scope;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import p3.x3;
import ry0.j;
import t13.d;
import v13.e;
import v13.i;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007²\u0006\u000e\u0010\u0006\u001a\u0004\u0018\u00010\u00058\nX\u008a\u0084\u0002"}, d2 = {"Lcom/garmin/android/apps/connectmobile/multidayactivities/presentation/list/MultiDayActivitiesListActivity;", "Lcom/garmin/android/apps/connectmobile/c;", "<init>", "()V", "a", "", "hasEpics", "gcm-multi-day-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class MultiDayActivitiesListActivity extends com.garmin.android.apps.connectmobile.c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f39318c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Scope f39319a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f39320b;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @e(c = "com.garmin.android.apps.connectmobile.multidayactivities.presentation.list.MultiDayActivitiesListActivity$onCreate$1$1$1", f = "MultiDayActivitiesListActivity.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class b extends i implements p<b0, d<? super Unit>, Object> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ x3<Boolean> f39322b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(x3<Boolean> x3Var, d<? super b> dVar) {
            super(2, dVar);
            this.f39322b = x3Var;
        }

        @Override // v13.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return MultiDayActivitiesListActivity.this.new b(this.f39322b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            a aVar2 = MultiDayActivitiesListActivity.f39318c;
            if (s.g(this.f39322b.getF182175a(), Boolean.FALSE)) {
                MultiDayActivitiesListActivity multiDayActivitiesListActivity = MultiDayActivitiesListActivity.this;
                multiDayActivitiesListActivity.startActivity(new Intent(multiDayActivitiesListActivity, (Class<?>) MultiDayActivitiesCreationActivity.class));
                multiDayActivitiesListActivity.finish();
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements e23.a<j> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Scope f39323a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f39324b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f39325c;

        public c(Scope scope, Qualifier qualifier, e23.a aVar) {
            this.f39323a = scope;
            this.f39324b = qualifier;
            this.f39325c = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, ry0.j] */
        @Override // e23.a
        public final j invoke() {
            return this.f39323a.get(s0.f105811a.b(j.class), this.f39324b, this.f39325c);
        }
    }

    public MultiDayActivitiesListActivity() {
        Scope scopeV = xy2.b.v();
        this.f39319a = scopeV;
        this.f39320b = m.a(n.SYNCHRONIZED, new c(scopeV, null, null));
    }

    @Override // android.app.Activity
    public final void finish() {
        a2 a2Var = a2.MULTI_DAY_ACTIVITY;
        i2.f36769a.getClass();
        i2.a.a(a2Var, "EpicScope - MultiDayActivitiesListActivity - finish");
        if (!getIntent().getBooleanExtra("SELF_INVOKE", false)) {
            i2.a.a(a2Var, "EpicScope - MultiDayActivitiesListActivity - Epic Scope Closed!");
            this.f39319a.close();
        }
        super.finish();
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    @SuppressLint({"MissingPermission"})
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        b.j.a(this);
        Uri data = getIntent().getData();
        if (data != null) {
            g.f23056a.getClass();
            g.b(data);
        }
        c.j.a(this, new z3.e(-2115596778, true, new r12.a(this, 28)));
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/multidayactivities/presentation/list/MultiDayActivitiesListActivity$a;", "", "<init>", "()V", "", "SELF_INVOKE", "Ljava/lang/String;", "gcm-multi-day-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
