package com.garmin.android.apps.connectmobile.activities.health.presentation;

import com.garmin.android.apps.connectmobile.v2;
import e23.p;
import o13.r;
import o53.b0;
import o53.s0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.activities.health.presentation.HealthSnapshotViewModel$deleteActivity$1", f = "HealthSnapshotViewModel.kt", l = {108}, m = "invokeSuspend", v = 2)
public final class f extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f29062a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f29063b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f29064c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f29065d;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.activities.health.presentation.HealthSnapshotViewModel$deleteActivity$1$1", f = "HealthSnapshotViewModel.kt", l = {111}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f29066a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ e f29067b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f29068c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f29069d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(e eVar, String str, String str2, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f29067b = eVar;
            this.f29068c = str;
            this.f29069d = str2;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f29067b, this.f29068c, this.f29069d, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f29066a;
            e eVar = this.f29067b;
            try {
                if (i14 == 0) {
                    r.b(obj);
                    e.D4(eVar, com.garmin.android.apps.connectmobile.activities.health.presentation.a.d.f29030a);
                    qn.a aVar2 = eVar.f29061i;
                    String str = this.f29068c;
                    String str2 = this.f29069d;
                    this.f29066a = 1;
                    obj = aVar2.f(str, str2, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i14 != 1) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    r.b(obj);
                }
                if (((v2) obj) instanceof v2.b) {
                    e.D4(eVar, com.garmin.android.apps.connectmobile.activities.health.presentation.a.e.f29031a);
                    e.D4(eVar, com.garmin.android.apps.connectmobile.activities.health.presentation.a.C0445a.f29027a);
                } else {
                    e.D4(eVar, com.garmin.android.apps.connectmobile.activities.health.presentation.a.e.f29031a);
                    e.D4(eVar, com.garmin.android.apps.connectmobile.activities.health.presentation.a.c.f29029a);
                }
            } catch (Exception unused) {
                e.D4(eVar, com.garmin.android.apps.connectmobile.activities.health.presentation.a.e.f29031a);
                e.D4(eVar, com.garmin.android.apps.connectmobile.activities.health.presentation.a.c.f29029a);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(e eVar, String str, String str2, t13.d<? super f> dVar) {
        super(2, dVar);
        this.f29063b = eVar;
        this.f29064c = str;
        this.f29065d = str2;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new f(this.f29063b, this.f29064c, this.f29065d, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((f) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f29062a;
        if (i14 == 0) {
            r.b(obj);
            x53.c cVar = s0.f129406a;
            x53.b bVar = x53.b.f189152a;
            a aVar2 = new a(this.f29063b, this.f29064c, this.f29065d, null);
            this.f29062a = 1;
            if (ge1.b.e0(bVar, aVar2, this) == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
        }
        return Unit.INSTANCE;
    }
}
