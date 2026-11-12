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
@v13.e(c = "com.garmin.android.apps.connectmobile.activities.health.presentation.HealthSnapshotViewModel$updateActivityName$1", f = "HealthSnapshotViewModel.kt", l = {170}, m = "invokeSuspend", v = 2)
public final class h extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f29078a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f29079b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f29080c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f29081d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f29082e;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.activities.health.presentation.HealthSnapshotViewModel$updateActivityName$1$1", f = "HealthSnapshotViewModel.kt", l = {173}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f29083a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ e f29084b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f29085c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f29086d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f29087e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(e eVar, String str, String str2, String str3, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f29084b = eVar;
            this.f29085c = str;
            this.f29086d = str2;
            this.f29087e = str3;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f29084b, this.f29085c, this.f29086d, this.f29087e, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f29083a;
            String str = this.f29087e;
            e eVar = this.f29084b;
            try {
                if (i14 == 0) {
                    r.b(obj);
                    e.D4(eVar, com.garmin.android.apps.connectmobile.activities.health.presentation.a.d.f29030a);
                    qn.a aVar2 = eVar.f29061i;
                    String str2 = this.f29085c;
                    String str3 = this.f29086d;
                    this.f29083a = 1;
                    obj = aVar2.d(str2, str3, str, this);
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
                    tn.g value = eVar.x4().getValue();
                    sn.h hVar = value.f165466a;
                    tn.g gVarA = tn.g.a(value, hVar != null ? sn.h.b(hVar, str, null, 65407) : null, null, 2);
                    nn.f<tn.g> fVarY4 = eVar.y4();
                    fVarY4.getClass();
                    fVarY4.f126670b.setValue(gVarA);
                    e.D4(eVar, com.garmin.android.apps.connectmobile.activities.health.presentation.a.b.f29028a);
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
    public h(e eVar, String str, String str2, String str3, t13.d<? super h> dVar) {
        super(2, dVar);
        this.f29079b = eVar;
        this.f29080c = str;
        this.f29081d = str2;
        this.f29082e = str3;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new h(this.f29079b, this.f29080c, this.f29081d, this.f29082e, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((h) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f29078a;
        if (i14 == 0) {
            r.b(obj);
            x53.c cVar = s0.f129406a;
            x53.b bVar = x53.b.f189152a;
            a aVar2 = new a(this.f29079b, this.f29080c, this.f29081d, this.f29082e, null);
            this.f29078a = 1;
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
