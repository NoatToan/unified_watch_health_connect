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
@v13.e(c = "com.garmin.android.apps.connectmobile.activities.health.presentation.HealthSnapshotViewModel$updateActivityNotes$1", f = "HealthSnapshotViewModel.kt", l = {151}, m = "invokeSuspend", v = 2)
public final class i extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f29088a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f29089b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e f29090c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f29091d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f29092e;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.activities.health.presentation.HealthSnapshotViewModel$updateActivityNotes$1$1", f = "HealthSnapshotViewModel.kt", l = {154}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f29093a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f29094b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f29095c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ e f29096d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f29097e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ String f29098f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, e eVar, String str2, String str3, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f29095c = str;
            this.f29096d = eVar;
            this.f29097e = str2;
            this.f29098f = str3;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f29095c, this.f29096d, this.f29097e, this.f29098f, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            String str;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f29094b;
            e eVar = this.f29096d;
            try {
                if (i14 == 0) {
                    r.b(obj);
                    String str2 = this.f29095c;
                    if (str2 == null) {
                        str2 = "";
                    }
                    qn.a aVar2 = eVar.f29061i;
                    String str3 = this.f29097e;
                    String str4 = this.f29098f;
                    this.f29093a = str2;
                    this.f29094b = 1;
                    Object objC = aVar2.c(str3, str4, str2, this);
                    if (objC == aVar) {
                        return aVar;
                    }
                    str = str2;
                    obj = objC;
                } else {
                    if (i14 != 1) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str = this.f29093a;
                    r.b(obj);
                }
                if (((v2) obj) instanceof v2.b) {
                    int i15 = e.f29058j;
                    eVar.getClass();
                    tn.g value = eVar.x4().getValue();
                    sn.h hVar = value.f165466a;
                    tn.g gVarA = tn.g.a(value, hVar != null ? sn.h.b(hVar, null, str, 65023) : null, null, 2);
                    nn.f<tn.g> fVarY4 = eVar.y4();
                    fVarY4.getClass();
                    fVarY4.f126670b.setValue(gVarA);
                    e.D4(eVar, com.garmin.android.apps.connectmobile.activities.health.presentation.a.f.f29032a);
                } else {
                    e.D4(eVar, com.garmin.android.apps.connectmobile.activities.health.presentation.a.c.f29029a);
                }
            } catch (Exception unused) {
                e.D4(eVar, com.garmin.android.apps.connectmobile.activities.health.presentation.a.c.f29029a);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(String str, e eVar, String str2, String str3, t13.d<? super i> dVar) {
        super(2, dVar);
        this.f29089b = str;
        this.f29090c = eVar;
        this.f29091d = str2;
        this.f29092e = str3;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new i(this.f29089b, this.f29090c, this.f29091d, this.f29092e, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((i) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f29088a;
        if (i14 == 0) {
            r.b(obj);
            x53.c cVar = s0.f129406a;
            x53.b bVar = x53.b.f189152a;
            a aVar2 = new a(this.f29089b, this.f29090c, this.f29091d, this.f29092e, null);
            this.f29088a = 1;
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
