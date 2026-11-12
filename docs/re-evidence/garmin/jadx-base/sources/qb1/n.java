package qb1;

import androidx.lifecycle.y0;
import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;
import com.garmin.android.apps.connectmobile.settings.model.UserSettingsDTO;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import o53.i0;
import o53.j0;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import zb0.u0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.pregnancytracking.ui.setup.PregnancySetupViewModel$getPregnancySetupRequiredData$1", f = "PregnancySetupViewModel.kt", l = {446, 457, 458, 459, 460, 461, 462, 463}, m = "invokeSuspend", v = 2)
public final class n extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public j0 f144127a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public i0 f144128b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public i0 f144129c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public i0 f144130d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public i0 f144131e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public i0 f144132f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public i0 f144133g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public o13.p f144134h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public o13.p f144135i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public o13.p f144136j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public o13.p f144137k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public o13.p f144138l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public o13.p f144139m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f144140n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f144141o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public /* synthetic */ Object f144142p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ qb1.f f144143q;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0004\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lo53/b0;", "Lo13/p;", "Lcom/garmin/android/apps/connectmobile/devices/model/DeviceSettingsDTO;", "", "<anonymous>", "(Lo53/b0;)Lo13/p;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.pregnancytracking.ui.setup.PregnancySetupViewModel$getPregnancySetupRequiredData$1$1", f = "PregnancySetupViewModel.kt", l = {448}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super o13.p<? extends DeviceSettingsDTO, ? extends Throwable>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f144144a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ qb1.f f144145b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Long f144146c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(qb1.f fVar, Long l14, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f144145b = fVar;
            this.f144146c = l14;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f144145b, this.f144146c, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super o13.p<? extends DeviceSettingsDTO, ? extends Throwable>> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f144144a;
            if (i14 != 0) {
                if (i14 == 1) {
                    o13.r.b(obj);
                    return obj;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
            long jLongValue = this.f144146c.longValue();
            this.f144144a = 1;
            Serializable serializableZ4 = qb1.f.z4(this.f144145b, jLongValue, this);
            return serializableZ4 == aVar ? aVar : serializableZ4;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0004\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lo53/b0;", "Lo13/p;", "Lcom/garmin/android/apps/connectmobile/devices/model/DeviceSettingsDTO;", "", "<anonymous>", "(Lo53/b0;)Lo13/p;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.pregnancytracking.ui.setup.PregnancySetupViewModel$getPregnancySetupRequiredData$1$2", f = "PregnancySetupViewModel.kt", l = {454}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements e23.p<o53.b0, t13.d<? super o13.p<? extends DeviceSettingsDTO, ? extends Throwable>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f144147a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ qb1.f f144148b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ long f144149c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(qb1.f fVar, long j8, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f144148b = fVar;
            this.f144149c = j8;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new b(this.f144148b, this.f144149c, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super o13.p<? extends DeviceSettingsDTO, ? extends Throwable>> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f144147a;
            if (i14 == 0) {
                o13.r.b(obj);
                this.f144147a = 1;
                Serializable serializableZ4 = qb1.f.z4(this.f144148b, this.f144149c, this);
                return serializableZ4 == aVar ? aVar : serializableZ4;
            }
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0004\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lo53/b0;", "Lo13/p;", "Lop0/c;", "", "<anonymous>", "(Lo53/b0;)Lo13/p;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.pregnancytracking.ui.setup.PregnancySetupViewModel$getPregnancySetupRequiredData$1$hydrationSetting$1", f = "PregnancySetupViewModel.kt", l = {441}, m = "invokeSuspend", v = 2)
    public static final class c extends v13.i implements e23.p<o53.b0, t13.d<? super o13.p<? extends op0.c, ? extends Throwable>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f144150a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ qb1.f f144151b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(qb1.f fVar, t13.d<? super c> dVar) {
            super(2, dVar);
            this.f144151b = fVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new c(this.f144151b, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super o13.p<? extends op0.c, ? extends Throwable>> dVar) {
            return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f144150a;
            if (i14 == 0) {
                o13.r.b(obj);
                this.f144150a = 1;
                Serializable serializableA4 = qb1.f.A4(this.f144151b, this);
                return serializableA4 == aVar ? aVar : serializableA4;
            }
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0004\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lo53/b0;", "Lo13/p;", "Lww0/j;", "", "<anonymous>", "(Lo53/b0;)Lo13/p;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.pregnancytracking.ui.setup.PregnancySetupViewModel$getPregnancySetupRequiredData$1$lastConfirmedCycle$1", f = "PregnancySetupViewModel.kt", l = {440}, m = "invokeSuspend", v = 2)
    public static final class d extends v13.i implements e23.p<o53.b0, t13.d<? super o13.p<? extends ww0.j, ? extends Throwable>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f144152a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ qb1.f f144153b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(qb1.f fVar, t13.d<? super d> dVar) {
            super(2, dVar);
            this.f144153b = fVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new d(this.f144153b, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super o13.p<? extends ww0.j, ? extends Throwable>> dVar) {
            return ((d) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f144152a;
            if (i14 == 0) {
                o13.r.b(obj);
                this.f144152a = 1;
                Serializable serializableB4 = qb1.f.B4(this.f144153b, this);
                return serializableB4 == aVar ? aVar : serializableB4;
            }
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0005\u001a\u0018\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lo53/b0;", "Lo13/p;", "", "Ldb1/m;", "", "<anonymous>", "(Lo53/b0;)Lo13/p;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.pregnancytracking.ui.setup.PregnancySetupViewModel$getPregnancySetupRequiredData$1$pregnancyList$1", f = "PregnancySetupViewModel.kt", l = {439}, m = "invokeSuspend", v = 2)
    public static final class e extends v13.i implements e23.p<o53.b0, t13.d<? super o13.p<? extends List<? extends db1.m>, ? extends Throwable>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f144154a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ qb1.f f144155b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(qb1.f fVar, t13.d<? super e> dVar) {
            super(2, dVar);
            this.f144155b = fVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new e(this.f144155b, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super o13.p<? extends List<? extends db1.m>, ? extends Throwable>> dVar) {
            return ((e) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f144154a;
            if (i14 == 0) {
                o13.r.b(obj);
                this.f144154a = 1;
                Serializable serializableC4 = qb1.f.C4(this.f144155b, this);
                return serializableC4 == aVar ? aVar : serializableC4;
            }
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0006\u001a$\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002j\n\u0012\u0004\u0012\u00020\u0003\u0018\u0001`\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lo53/b0;", "Lo13/p;", "Ljava/util/ArrayList;", "Lbm2/c;", "Lkotlin/collections/ArrayList;", "", "<anonymous>", "(Lo53/b0;)Lo13/p;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.pregnancytracking.ui.setup.PregnancySetupViewModel$getPregnancySetupRequiredData$1$registeredGCDevices$1", f = "PregnancySetupViewModel.kt", l = {443}, m = "invokeSuspend", v = 2)
    public static final class f extends v13.i implements e23.p<o53.b0, t13.d<? super o13.p<? extends ArrayList<bm2.c>, ? extends Throwable>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f144156a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ qb1.f f144157b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(qb1.f fVar, t13.d<? super f> dVar) {
            super(2, dVar);
            this.f144157b = fVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new f(this.f144157b, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super o13.p<? extends ArrayList<bm2.c>, ? extends Throwable>> dVar) {
            return ((f) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f144156a;
            if (i14 == 0) {
                o13.r.b(obj);
                this.f144156a = 1;
                Serializable serializableX4 = qb1.f.x4(this.f144157b, this);
                return serializableX4 == aVar ? aVar : serializableX4;
            }
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0004\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lo53/b0;", "Lo13/p;", "Lcom/garmin/android/apps/connectmobile/settings/model/UserSettingsDTO;", "", "<anonymous>", "(Lo53/b0;)Lo13/p;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.pregnancytracking.ui.setup.PregnancySetupViewModel$getPregnancySetupRequiredData$1$userSettings$1", f = "PregnancySetupViewModel.kt", l = {442}, m = "invokeSuspend", v = 2)
    public static final class g extends v13.i implements e23.p<o53.b0, t13.d<? super o13.p<? extends UserSettingsDTO, ? extends Throwable>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f144158a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ qb1.f f144159b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(qb1.f fVar, t13.d<? super g> dVar) {
            super(2, dVar);
            this.f144159b = fVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new g(this.f144159b, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super o13.p<? extends UserSettingsDTO, ? extends Throwable>> dVar) {
            return ((g) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f144158a;
            if (i14 == 0) {
                o13.r.b(obj);
                this.f144158a = 1;
                Serializable serializableD4 = qb1.f.D4(this.f144159b, this);
                return serializableD4 == aVar ? aVar : serializableD4;
            }
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(qb1.f fVar, t13.d<? super n> dVar) {
        super(2, dVar);
        this.f144143q = fVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        n nVar = new n(this.f144143q, dVar);
        nVar.f144142p = obj;
        return nVar;
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((n) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:102:0x031e  */
    /* JADX WARN: Code duplicated, block: B:103:0x0327  */
    /* JADX WARN: Code duplicated, block: B:105:0x032a  */
    /* JADX WARN: Code duplicated, block: B:110:0x033a  */
    /* JADX WARN: Code duplicated, block: B:111:0x0343  */
    /* JADX WARN: Code duplicated, block: B:114:0x0349  */
    /* JADX WARN: Code duplicated, block: B:119:0x0359  */
    /* JADX WARN: Code duplicated, block: B:120:0x0362  */
    /* JADX WARN: Code duplicated, block: B:124:0x036a  */
    /* JADX WARN: Code duplicated, block: B:126:0x0374  */
    /* JADX WARN: Code duplicated, block: B:129:0x0384  */
    /* JADX WARN: Code duplicated, block: B:140:0x03b1  */
    /* JADX WARN: Code duplicated, block: B:145:0x03c7  */
    /* JADX WARN: Code duplicated, block: B:148:0x03df  */
    /* JADX WARN: Code duplicated, block: B:150:0x03f8  */
    /* JADX WARN: Code duplicated, block: B:151:0x03fb  */
    /* JADX WARN: Code duplicated, block: B:158:0x0390 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:159:0x039d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:160:0x0399 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:161:0x03a3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:163:0x037e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:164:0x037e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:169:0x0402 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:171:0x03d9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:24:0x0133 A[PHI: r3 r9 r10 r11 r12
      0x0133: PHI (r3v11 o53.i0) = (r3v10 o53.i0), (r3v19 o53.i0) binds: [B:16:0x010b, B:21:0x0125] A[DONT_GENERATE, DONT_INLINE]
      0x0133: PHI (r9v3 o53.i0) = (r9v2 o53.i0), (r9v6 o53.i0) binds: [B:16:0x010b, B:21:0x0125] A[DONT_GENERATE, DONT_INLINE]
      0x0133: PHI (r10v1 o53.i0) = (r10v0 o53.i0), (r10v3 o53.i0) binds: [B:16:0x010b, B:21:0x0125] A[DONT_GENERATE, DONT_INLINE]
      0x0133: PHI (r11v1 o53.i0) = (r11v0 o53.i0), (r11v4 o53.i0) binds: [B:16:0x010b, B:21:0x0125] A[DONT_GENERATE, DONT_INLINE]
      0x0133: PHI (r12v1 o53.j0) = (r12v0 o53.j0), (r12v4 o53.j0) binds: [B:16:0x010b, B:21:0x0125] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:27:0x0148  */
    /* JADX WARN: Code duplicated, block: B:28:0x0152  */
    /* JADX WARN: Code duplicated, block: B:32:0x0170  */
    /* JADX WARN: Code duplicated, block: B:36:0x0196  */
    /* JADX WARN: Code duplicated, block: B:40:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:44:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:47:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:50:0x0218  */
    /* JADX WARN: Code duplicated, block: B:52:0x0222  */
    /* JADX WARN: Code duplicated, block: B:54:0x022b  */
    /* JADX WARN: Code duplicated, block: B:57:0x0251  */
    /* JADX WARN: Code duplicated, block: B:60:0x025d  */
    /* JADX WARN: Code duplicated, block: B:64:0x028b  */
    /* JADX WARN: Code duplicated, block: B:67:0x029b  */
    /* JADX WARN: Code duplicated, block: B:70:0x02a6  */
    /* JADX WARN: Code duplicated, block: B:73:0x02b1  */
    /* JADX WARN: Code duplicated, block: B:75:0x02b6  */
    /* JADX WARN: Code duplicated, block: B:79:0x02c1  */
    /* JADX WARN: Code duplicated, block: B:84:0x02d0  */
    /* JADX WARN: Code duplicated, block: B:87:0x02d9  */
    /* JADX WARN: Code duplicated, block: B:90:0x02f4  */
    /* JADX WARN: Code duplicated, block: B:91:0x02f9  */
    /* JADX WARN: Code duplicated, block: B:94:0x02fe  */
    /* JADX WARN: Code duplicated, block: B:95:0x0303  */
    /* JADX WARN: Code duplicated, block: B:98:0x0310  */
    /* JADX WARN: Code duplicated, block: B:99:0x0319  */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x011f, code lost:
    
        if (r13 == r2) goto L63;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        j0 j0VarJ;
        i0 i0VarJ;
        i0 i0VarJ2;
        i0 i0VarJ3;
        i0 i0VarJ4;
        Object objY4;
        i0 i0VarJ5;
        i0 i0Var;
        i0 i0Var2;
        long jS4;
        i0 i0VarJ6;
        Object objAwait;
        i0 i0Var3;
        i0 i0Var4;
        long j8;
        o13.p pVar;
        Object objAwait2;
        i0 i0Var5;
        i0 i0Var6;
        i0 i0Var7;
        i0 i0Var8;
        o13.p pVar2;
        Object objAwait3;
        i0 i0Var9;
        i0 i0Var10;
        i0 i0Var11;
        o13.p pVar3;
        o13.p pVar4;
        Object objAwait4;
        o13.p pVar5;
        i0 i0Var12;
        o13.p pVar6;
        o13.p pVar7;
        i0 i0Var13;
        i0 i0Var14;
        o13.p pVar8;
        o13.p pVar9;
        o13.p pVar10;
        o13.p pVar11;
        o13.p pVar12;
        i0 i0Var15;
        o13.p pVar13;
        Object objAwait5;
        o13.p pVar14;
        o13.p pVar15;
        o13.p pVar16;
        o13.p pVar17;
        o13.p pVar18;
        Object objAwait6;
        o13.p pVar19;
        Object objAwait7;
        o13.p pVar20;
        o13.p pVar21;
        o13.p pVar22;
        ArrayList arrayList;
        Throwable th3;
        Throwable th4;
        Throwable th5;
        Throwable th6;
        Throwable th7;
        DeviceSettingsDTO deviceSettingsDTO;
        DeviceSettingsDTO deviceSettingsDTO2;
        db1.u weightGoalUserInputs;
        UserSettingsDTO userSettingsDTO;
        Double dValueOf;
        UserSettingsDTO userSettingsDTO2;
        Double dValueOf2;
        List<db1.m> list;
        ArrayList<bm2.c> arrayList2;
        Iterator<bm2.c> it;
        String str;
        u0 u0Var;
        String str2;
        ArrayList<LocalDate> arrayList3;
        LinkedHashSet linkedHashSet;
        LocalDate dueDate;
        LocalDate deliveryDate;
        LocalDate endDate;
        UserSettingsDTO userSettingsDTO3;
        Double dValueOf3;
        UserSettingsDTO userSettingsDTO4;
        Double dValueOf4;
        Throwable th8;
        Throwable th9;
        o53.b0 b0Var = (o53.b0) this.f144142p;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f144141o;
        qb1.f fVar = this.f144143q;
        switch (i14) {
            case 0:
                o13.r.b(obj);
                int i15 = qb1.f.D;
                ((y0) fVar.f144059c.getValue()).j(fw.m.a.f(fw.m.f73767e, null, null, 3));
                j0VarJ = ge1.b.j(b0Var, null, null, new e(fVar, null), 3);
                i0VarJ = ge1.b.j(b0Var, null, null, new d(fVar, null), 3);
                i0VarJ2 = ge1.b.j(b0Var, null, null, new c(fVar, null), 3);
                i0VarJ3 = ge1.b.j(b0Var, null, null, new g(fVar, null), 3);
                i0VarJ4 = ge1.b.j(b0Var, null, null, new f(fVar, null), 3);
                if (fVar.B) {
                    this.f144142p = b0Var;
                    this.f144127a = j0VarJ;
                    this.f144128b = i0VarJ;
                    this.f144129c = i0VarJ2;
                    this.f144130d = i0VarJ3;
                    this.f144131e = i0VarJ4;
                    this.f144141o = 1;
                    objY4 = qb1.f.y4(fVar, this);
                    break;
                } else {
                    i0VarJ5 = null;
                    i0Var = i0VarJ;
                    i0Var2 = i0VarJ4;
                    f12.l.f68084a.getClass();
                    jS4 = f12.l.a.a().s4();
                    if (jS4 != -1) {
                        i0VarJ6 = ge1.b.j(b0Var, null, null, new b(fVar, jS4, null), 3);
                    } else {
                        i0VarJ6 = null;
                    }
                    this.f144142p = null;
                    this.f144127a = null;
                    this.f144128b = i0Var;
                    this.f144129c = i0VarJ2;
                    this.f144130d = i0VarJ3;
                    this.f144131e = i0Var2;
                    this.f144132f = i0VarJ5;
                    this.f144133g = i0VarJ6;
                    this.f144140n = jS4;
                    this.f144141o = 2;
                    objAwait = j0VarJ.await(this);
                    if (objAwait != aVar) {
                        i0Var3 = i0VarJ3;
                        i0Var4 = i0VarJ2;
                        j8 = jS4;
                        pVar = (o13.p) objAwait;
                        this.f144142p = null;
                        this.f144127a = null;
                        this.f144128b = null;
                        this.f144129c = i0Var4;
                        this.f144130d = i0Var3;
                        this.f144131e = i0Var2;
                        this.f144132f = i0VarJ5;
                        this.f144133g = i0VarJ6;
                        this.f144134h = pVar;
                        this.f144140n = j8;
                        this.f144141o = 3;
                        objAwait2 = i0Var.await(this);
                        if (objAwait2 != aVar) {
                            i0Var5 = i0VarJ5;
                            i0Var6 = i0Var4;
                            i0Var7 = i0Var3;
                            i0Var8 = i0Var2;
                            pVar2 = (o13.p) objAwait2;
                            this.f144142p = null;
                            this.f144127a = null;
                            this.f144128b = null;
                            this.f144129c = null;
                            this.f144130d = i0Var7;
                            this.f144131e = i0Var8;
                            this.f144132f = i0Var5;
                            this.f144133g = i0VarJ6;
                            this.f144134h = pVar;
                            this.f144135i = pVar2;
                            this.f144140n = j8;
                            this.f144141o = 4;
                            objAwait3 = i0Var6.await(this);
                            if (objAwait3 != aVar) {
                                i0Var9 = i0Var7;
                                i0Var10 = i0Var5;
                                i0Var11 = i0VarJ6;
                                pVar3 = pVar2;
                                pVar4 = (o13.p) objAwait3;
                                this.f144142p = null;
                                this.f144127a = null;
                                this.f144128b = null;
                                this.f144129c = null;
                                this.f144130d = null;
                                this.f144131e = i0Var8;
                                this.f144132f = i0Var10;
                                this.f144133g = i0Var11;
                                this.f144134h = pVar;
                                this.f144135i = pVar3;
                                this.f144136j = pVar4;
                                this.f144140n = j8;
                                this.f144141o = 5;
                                objAwait4 = i0Var9.await(this);
                                if (objAwait4 != aVar) {
                                    i0 i0Var16 = i0Var11;
                                    pVar5 = pVar3;
                                    i0Var12 = i0Var16;
                                    pVar6 = pVar;
                                    pVar7 = pVar4;
                                    i0Var13 = i0Var8;
                                    i0Var14 = i0Var10;
                                    pVar8 = (o13.p) objAwait4;
                                    if (i0Var14 != null) {
                                        this.f144142p = null;
                                        this.f144127a = null;
                                        this.f144128b = null;
                                        this.f144129c = null;
                                        this.f144130d = null;
                                        this.f144131e = i0Var13;
                                        this.f144132f = null;
                                        this.f144133g = i0Var12;
                                        this.f144134h = pVar6;
                                        this.f144135i = pVar5;
                                        this.f144136j = pVar7;
                                        this.f144137k = pVar8;
                                        this.f144140n = j8;
                                        this.f144141o = 6;
                                        objAwait5 = i0Var14.await(this);
                                        if (objAwait5 != aVar) {
                                            i0Var15 = i0Var12;
                                            pVar14 = pVar8;
                                            pVar11 = pVar6;
                                            pVar12 = pVar5;
                                            pVar9 = pVar7;
                                            pVar10 = pVar14;
                                            pVar13 = (o13.p) objAwait5;
                                            if (i0Var15 != null) {
                                                this.f144142p = null;
                                                this.f144127a = null;
                                                this.f144128b = null;
                                                this.f144129c = null;
                                                this.f144130d = null;
                                                this.f144131e = i0Var13;
                                                this.f144132f = null;
                                                this.f144133g = null;
                                                this.f144134h = pVar11;
                                                this.f144135i = pVar12;
                                                this.f144136j = pVar9;
                                                this.f144137k = pVar10;
                                                this.f144138l = pVar13;
                                                this.f144140n = j8;
                                                this.f144141o = 7;
                                                objAwait6 = i0Var15.await(this);
                                                if (objAwait6 != aVar) {
                                                    pVar15 = pVar11;
                                                    pVar16 = pVar10;
                                                    pVar17 = pVar13;
                                                    pVar18 = (o13.p) objAwait6;
                                                    long j14 = j8;
                                                    pVar19 = pVar12;
                                                    this.f144142p = null;
                                                    this.f144127a = null;
                                                    this.f144128b = null;
                                                    this.f144129c = null;
                                                    this.f144130d = null;
                                                    this.f144131e = null;
                                                    this.f144132f = null;
                                                    this.f144133g = null;
                                                    this.f144134h = pVar15;
                                                    this.f144135i = pVar19;
                                                    this.f144136j = pVar9;
                                                    this.f144137k = pVar16;
                                                    this.f144138l = pVar17;
                                                    this.f144139m = pVar18;
                                                    this.f144140n = j14;
                                                    this.f144141o = 8;
                                                    objAwait7 = i0Var13.await(this);
                                                    if (objAwait7 != aVar) {
                                                        pVar20 = pVar17;
                                                        pVar21 = pVar16;
                                                        pVar22 = pVar15;
                                                        o13.p pVar23 = (o13.p) objAwait7;
                                                        arrayList = new ArrayList();
                                                        th3 = (Throwable) pVar19.f128595b;
                                                        if (th3 != null) {
                                                            arrayList.add(th3);
                                                        }
                                                        B b14 = pVar9.f128595b;
                                                        A a14 = pVar9.f128594a;
                                                        th4 = (Throwable) b14;
                                                        if (th4 != null) {
                                                            arrayList.add(th4);
                                                        }
                                                        B b15 = pVar21.f128595b;
                                                        A a15 = pVar21.f128594a;
                                                        th5 = (Throwable) b15;
                                                        if (th5 != null) {
                                                            arrayList.add(th5);
                                                        }
                                                        if (pVar20 != null && (th9 = (Throwable) pVar20.f128595b) != null) {
                                                            arrayList.add(th9);
                                                        }
                                                        if (pVar18 != null && (th8 = (Throwable) pVar18.f128595b) != null) {
                                                            arrayList.add(th8);
                                                        }
                                                        th6 = (Throwable) pVar22.f128595b;
                                                        if (th6 != null) {
                                                            arrayList.add(th6);
                                                        }
                                                        th7 = (Throwable) pVar23.f128595b;
                                                        if (th7 != null) {
                                                            arrayList.add(th7);
                                                        }
                                                        fVar.f144071o = (List) pVar22.f128594a;
                                                        fVar.f144067k = (ww0.j) pVar19.f128594a;
                                                        fVar.f144065i = (op0.c) a14;
                                                        fVar.f144072p = (UserSettingsDTO) a15;
                                                        if (pVar20 != null) {
                                                            deviceSettingsDTO = (DeviceSettingsDTO) pVar20.f128594a;
                                                        } else {
                                                            deviceSettingsDTO = null;
                                                        }
                                                        fVar.f144066j = deviceSettingsDTO;
                                                        if (pVar18 != null) {
                                                            deviceSettingsDTO2 = (DeviceSettingsDTO) pVar18.f128594a;
                                                        } else {
                                                            deviceSettingsDTO2 = null;
                                                        }
                                                        fVar.f144068l = deviceSettingsDTO2;
                                                        weightGoalUserInputs = fVar.C.getWeightGoalUserInputs();
                                                        userSettingsDTO = fVar.f144072p;
                                                        if (userSettingsDTO != null) {
                                                            dValueOf = Double.valueOf(userSettingsDTO.E2());
                                                        } else {
                                                            dValueOf = null;
                                                        }
                                                        userSettingsDTO2 = fVar.f144072p;
                                                        if (userSettingsDTO2 != null) {
                                                            dValueOf2 = Double.valueOf(userSettingsDTO2.I());
                                                        } else {
                                                            dValueOf2 = null;
                                                        }
                                                        if (dValueOf != null && !Double.isNaN(dValueOf.doubleValue()) && weightGoalUserInputs != null) {
                                                            userSettingsDTO4 = fVar.f144072p;
                                                            if (userSettingsDTO4 != null) {
                                                                dValueOf4 = Double.valueOf(userSettingsDTO4.E2());
                                                            } else {
                                                                dValueOf4 = null;
                                                            }
                                                            weightGoalUserInputs.k(dValueOf4);
                                                        }
                                                        if (dValueOf2 != null && !Double.isNaN(dValueOf2.doubleValue()) && weightGoalUserInputs != null) {
                                                            userSettingsDTO3 = fVar.f144072p;
                                                            if (userSettingsDTO3 != null) {
                                                                dValueOf3 = Double.valueOf(userSettingsDTO3.I());
                                                            } else {
                                                                dValueOf3 = null;
                                                            }
                                                            weightGoalUserInputs.h(dValueOf3);
                                                        }
                                                        list = fVar.f144071o;
                                                        if (list != null) {
                                                            arrayList3 = fVar.f144069m;
                                                            linkedHashSet = fVar.f144070n;
                                                            if (!list.isEmpty()) {
                                                                arrayList3.clear();
                                                                linkedHashSet.clear();
                                                                for (db1.m mVar : list) {
                                                                    dueDate = mVar.getDueDate();
                                                                    if (dueDate != null) {
                                                                        arrayList3.add(dueDate);
                                                                        deliveryDate = mVar.getDeliveryDate();
                                                                        if (deliveryDate != null) {
                                                                            linkedHashSet.add(deliveryDate);
                                                                        } else {
                                                                            endDate = mVar.getEndDate();
                                                                            if (endDate != null) {
                                                                                linkedHashSet.add(endDate);
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            Unit unit = Unit.INSTANCE;
                                                        }
                                                        arrayList2 = (ArrayList) pVar23.f128594a;
                                                        fVar.f144074r = arrayList2;
                                                        if (arrayList2 != null && arrayList2.size() > 0) {
                                                            for (u0 u0Var2 : p13.w.c(u0.P5)) {
                                                                ArrayList<bm2.c> arrayList4 = fVar.f144074r;
                                                                arrayList4.getClass();
                                                                it = arrayList4.iterator();
                                                                it.getClass();
                                                                while (it.hasNext()) {
                                                                    bm2.c next = it.next();
                                                                    next.getClass();
                                                                    str = u0Var2.f203860g;
                                                                    u0Var = (u0) u0.f203782n6.get(next.getF143517g());
                                                                    if (u0Var != null) {
                                                                        str2 = u0Var.f203860g;
                                                                    } else {
                                                                        str2 = null;
                                                                    }
                                                                    if (p005kotlin.jvm.internal.s.g(str, str2)) {
                                                                        fVar.B = true;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        ((y0) fVar.f144059c.getValue()).j(tb1.d.b(new o13.p(a14, a15), null, null, tb1.d.a(arrayList), 6));
                                                        return Unit.INSTANCE;
                                                    }
                                                }
                                            } else {
                                                pVar15 = pVar11;
                                                pVar16 = pVar10;
                                                pVar17 = pVar13;
                                                pVar18 = null;
                                                long j15 = j8;
                                                pVar19 = pVar12;
                                                this.f144142p = null;
                                                this.f144127a = null;
                                                this.f144128b = null;
                                                this.f144129c = null;
                                                this.f144130d = null;
                                                this.f144131e = null;
                                                this.f144132f = null;
                                                this.f144133g = null;
                                                this.f144134h = pVar15;
                                                this.f144135i = pVar19;
                                                this.f144136j = pVar9;
                                                this.f144137k = pVar16;
                                                this.f144138l = pVar17;
                                                this.f144139m = pVar18;
                                                this.f144140n = j15;
                                                this.f144141o = 8;
                                                objAwait7 = i0Var13.await(this);
                                                if (objAwait7 != aVar) {
                                                    pVar20 = pVar17;
                                                    pVar21 = pVar16;
                                                    pVar22 = pVar15;
                                                    o13.p pVar24 = (o13.p) objAwait7;
                                                    arrayList = new ArrayList();
                                                    th3 = (Throwable) pVar19.f128595b;
                                                    if (th3 != null) {
                                                        arrayList.add(th3);
                                                    }
                                                    B b16 = pVar9.f128595b;
                                                    A a16 = pVar9.f128594a;
                                                    th4 = (Throwable) b16;
                                                    if (th4 != null) {
                                                        arrayList.add(th4);
                                                    }
                                                    B b17 = pVar21.f128595b;
                                                    A a17 = pVar21.f128594a;
                                                    th5 = (Throwable) b17;
                                                    if (th5 != null) {
                                                        arrayList.add(th5);
                                                    }
                                                    if (pVar20 != null) {
                                                        arrayList.add(th9);
                                                    }
                                                    if (pVar18 != null) {
                                                        arrayList.add(th8);
                                                    }
                                                    th6 = (Throwable) pVar22.f128595b;
                                                    if (th6 != null) {
                                                        arrayList.add(th6);
                                                    }
                                                    th7 = (Throwable) pVar24.f128595b;
                                                    if (th7 != null) {
                                                        arrayList.add(th7);
                                                    }
                                                    fVar.f144071o = (List) pVar22.f128594a;
                                                    fVar.f144067k = (ww0.j) pVar19.f128594a;
                                                    fVar.f144065i = (op0.c) a16;
                                                    fVar.f144072p = (UserSettingsDTO) a17;
                                                    if (pVar20 != null) {
                                                        deviceSettingsDTO = (DeviceSettingsDTO) pVar20.f128594a;
                                                    } else {
                                                        deviceSettingsDTO = null;
                                                    }
                                                    fVar.f144066j = deviceSettingsDTO;
                                                    if (pVar18 != null) {
                                                        deviceSettingsDTO2 = (DeviceSettingsDTO) pVar18.f128594a;
                                                    } else {
                                                        deviceSettingsDTO2 = null;
                                                    }
                                                    fVar.f144068l = deviceSettingsDTO2;
                                                    weightGoalUserInputs = fVar.C.getWeightGoalUserInputs();
                                                    userSettingsDTO = fVar.f144072p;
                                                    if (userSettingsDTO != null) {
                                                        dValueOf = Double.valueOf(userSettingsDTO.E2());
                                                    } else {
                                                        dValueOf = null;
                                                    }
                                                    userSettingsDTO2 = fVar.f144072p;
                                                    if (userSettingsDTO2 != null) {
                                                        dValueOf2 = Double.valueOf(userSettingsDTO2.I());
                                                    } else {
                                                        dValueOf2 = null;
                                                    }
                                                    if (dValueOf != null) {
                                                        userSettingsDTO4 = fVar.f144072p;
                                                        if (userSettingsDTO4 != null) {
                                                            dValueOf4 = Double.valueOf(userSettingsDTO4.E2());
                                                        } else {
                                                            dValueOf4 = null;
                                                        }
                                                        weightGoalUserInputs.k(dValueOf4);
                                                    }
                                                    if (dValueOf2 != null) {
                                                        userSettingsDTO3 = fVar.f144072p;
                                                        if (userSettingsDTO3 != null) {
                                                            dValueOf3 = Double.valueOf(userSettingsDTO3.I());
                                                        } else {
                                                            dValueOf3 = null;
                                                        }
                                                        weightGoalUserInputs.h(dValueOf3);
                                                    }
                                                    list = fVar.f144071o;
                                                    if (list != null) {
                                                        arrayList3 = fVar.f144069m;
                                                        linkedHashSet = fVar.f144070n;
                                                        if (!list.isEmpty()) {
                                                            arrayList3.clear();
                                                            linkedHashSet.clear();
                                                            while (r1.hasNext()) {
                                                                dueDate = mVar.getDueDate();
                                                                if (dueDate != null) {
                                                                    arrayList3.add(dueDate);
                                                                    deliveryDate = mVar.getDeliveryDate();
                                                                    if (deliveryDate != null) {
                                                                        linkedHashSet.add(deliveryDate);
                                                                    } else {
                                                                        endDate = mVar.getEndDate();
                                                                        if (endDate != null) {
                                                                            linkedHashSet.add(endDate);
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        Unit unit2 = Unit.INSTANCE;
                                                    }
                                                    arrayList2 = (ArrayList) pVar24.f128594a;
                                                    fVar.f144074r = arrayList2;
                                                    if (arrayList2 != null) {
                                                        while (r1.hasNext()) {
                                                            ArrayList<bm2.c> arrayList5 = fVar.f144074r;
                                                            arrayList5.getClass();
                                                            it = arrayList5.iterator();
                                                            it.getClass();
                                                            while (it.hasNext()) {
                                                                bm2.c next2 = it.next();
                                                                next2.getClass();
                                                                str = u0Var2.f203860g;
                                                                u0Var = (u0) u0.f203782n6.get(next2.getF143517g());
                                                                if (u0Var != null) {
                                                                    str2 = u0Var.f203860g;
                                                                } else {
                                                                    str2 = null;
                                                                }
                                                                if (p005kotlin.jvm.internal.s.g(str, str2)) {
                                                                    fVar.B = true;
                                                                }
                                                            }
                                                        }
                                                    }
                                                    ((y0) fVar.f144059c.getValue()).j(tb1.d.b(new o13.p(a16, a17), null, null, tb1.d.a(arrayList), 6));
                                                    return Unit.INSTANCE;
                                                }
                                            }
                                        }
                                    } else {
                                        o13.p pVar25 = pVar5;
                                        pVar9 = pVar7;
                                        pVar10 = pVar8;
                                        pVar11 = pVar6;
                                        pVar12 = pVar25;
                                        i0Var15 = i0Var12;
                                        pVar13 = null;
                                        if (i0Var15 != null) {
                                            this.f144142p = null;
                                            this.f144127a = null;
                                            this.f144128b = null;
                                            this.f144129c = null;
                                            this.f144130d = null;
                                            this.f144131e = i0Var13;
                                            this.f144132f = null;
                                            this.f144133g = null;
                                            this.f144134h = pVar11;
                                            this.f144135i = pVar12;
                                            this.f144136j = pVar9;
                                            this.f144137k = pVar10;
                                            this.f144138l = pVar13;
                                            this.f144140n = j8;
                                            this.f144141o = 7;
                                            objAwait6 = i0Var15.await(this);
                                            if (objAwait6 != aVar) {
                                                pVar15 = pVar11;
                                                pVar16 = pVar10;
                                                pVar17 = pVar13;
                                                pVar18 = (o13.p) objAwait6;
                                                long j16 = j8;
                                                pVar19 = pVar12;
                                                this.f144142p = null;
                                                this.f144127a = null;
                                                this.f144128b = null;
                                                this.f144129c = null;
                                                this.f144130d = null;
                                                this.f144131e = null;
                                                this.f144132f = null;
                                                this.f144133g = null;
                                                this.f144134h = pVar15;
                                                this.f144135i = pVar19;
                                                this.f144136j = pVar9;
                                                this.f144137k = pVar16;
                                                this.f144138l = pVar17;
                                                this.f144139m = pVar18;
                                                this.f144140n = j16;
                                                this.f144141o = 8;
                                                objAwait7 = i0Var13.await(this);
                                                if (objAwait7 != aVar) {
                                                    pVar20 = pVar17;
                                                    pVar21 = pVar16;
                                                    pVar22 = pVar15;
                                                    o13.p pVar26 = (o13.p) objAwait7;
                                                    arrayList = new ArrayList();
                                                    th3 = (Throwable) pVar19.f128595b;
                                                    if (th3 != null) {
                                                        arrayList.add(th3);
                                                    }
                                                    B b18 = pVar9.f128595b;
                                                    A a18 = pVar9.f128594a;
                                                    th4 = (Throwable) b18;
                                                    if (th4 != null) {
                                                        arrayList.add(th4);
                                                    }
                                                    B b19 = pVar21.f128595b;
                                                    A a19 = pVar21.f128594a;
                                                    th5 = (Throwable) b19;
                                                    if (th5 != null) {
                                                        arrayList.add(th5);
                                                    }
                                                    if (pVar20 != null) {
                                                        arrayList.add(th9);
                                                    }
                                                    if (pVar18 != null) {
                                                        arrayList.add(th8);
                                                    }
                                                    th6 = (Throwable) pVar22.f128595b;
                                                    if (th6 != null) {
                                                        arrayList.add(th6);
                                                    }
                                                    th7 = (Throwable) pVar26.f128595b;
                                                    if (th7 != null) {
                                                        arrayList.add(th7);
                                                    }
                                                    fVar.f144071o = (List) pVar22.f128594a;
                                                    fVar.f144067k = (ww0.j) pVar19.f128594a;
                                                    fVar.f144065i = (op0.c) a18;
                                                    fVar.f144072p = (UserSettingsDTO) a19;
                                                    if (pVar20 != null) {
                                                        deviceSettingsDTO = (DeviceSettingsDTO) pVar20.f128594a;
                                                    } else {
                                                        deviceSettingsDTO = null;
                                                    }
                                                    fVar.f144066j = deviceSettingsDTO;
                                                    if (pVar18 != null) {
                                                        deviceSettingsDTO2 = (DeviceSettingsDTO) pVar18.f128594a;
                                                    } else {
                                                        deviceSettingsDTO2 = null;
                                                    }
                                                    fVar.f144068l = deviceSettingsDTO2;
                                                    weightGoalUserInputs = fVar.C.getWeightGoalUserInputs();
                                                    userSettingsDTO = fVar.f144072p;
                                                    if (userSettingsDTO != null) {
                                                        dValueOf = Double.valueOf(userSettingsDTO.E2());
                                                    } else {
                                                        dValueOf = null;
                                                    }
                                                    userSettingsDTO2 = fVar.f144072p;
                                                    if (userSettingsDTO2 != null) {
                                                        dValueOf2 = Double.valueOf(userSettingsDTO2.I());
                                                    } else {
                                                        dValueOf2 = null;
                                                    }
                                                    if (dValueOf != null) {
                                                        userSettingsDTO4 = fVar.f144072p;
                                                        if (userSettingsDTO4 != null) {
                                                            dValueOf4 = Double.valueOf(userSettingsDTO4.E2());
                                                        } else {
                                                            dValueOf4 = null;
                                                        }
                                                        weightGoalUserInputs.k(dValueOf4);
                                                    }
                                                    if (dValueOf2 != null) {
                                                        userSettingsDTO3 = fVar.f144072p;
                                                        if (userSettingsDTO3 != null) {
                                                            dValueOf3 = Double.valueOf(userSettingsDTO3.I());
                                                        } else {
                                                            dValueOf3 = null;
                                                        }
                                                        weightGoalUserInputs.h(dValueOf3);
                                                    }
                                                    list = fVar.f144071o;
                                                    if (list != null) {
                                                        arrayList3 = fVar.f144069m;
                                                        linkedHashSet = fVar.f144070n;
                                                        if (!list.isEmpty()) {
                                                            arrayList3.clear();
                                                            linkedHashSet.clear();
                                                            while (r1.hasNext()) {
                                                                dueDate = mVar.getDueDate();
                                                                if (dueDate != null) {
                                                                    arrayList3.add(dueDate);
                                                                    deliveryDate = mVar.getDeliveryDate();
                                                                    if (deliveryDate != null) {
                                                                        linkedHashSet.add(deliveryDate);
                                                                    } else {
                                                                        endDate = mVar.getEndDate();
                                                                        if (endDate != null) {
                                                                            linkedHashSet.add(endDate);
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        Unit unit3 = Unit.INSTANCE;
                                                    }
                                                    arrayList2 = (ArrayList) pVar26.f128594a;
                                                    fVar.f144074r = arrayList2;
                                                    if (arrayList2 != null) {
                                                        while (r1.hasNext()) {
                                                            ArrayList<bm2.c> arrayList6 = fVar.f144074r;
                                                            arrayList6.getClass();
                                                            it = arrayList6.iterator();
                                                            it.getClass();
                                                            while (it.hasNext()) {
                                                                bm2.c next3 = it.next();
                                                                next3.getClass();
                                                                str = u0Var2.f203860g;
                                                                u0Var = (u0) u0.f203782n6.get(next3.getF143517g());
                                                                if (u0Var != null) {
                                                                    str2 = u0Var.f203860g;
                                                                } else {
                                                                    str2 = null;
                                                                }
                                                                if (p005kotlin.jvm.internal.s.g(str, str2)) {
                                                                    fVar.B = true;
                                                                }
                                                            }
                                                        }
                                                    }
                                                    ((y0) fVar.f144059c.getValue()).j(tb1.d.b(new o13.p(a18, a19), null, null, tb1.d.a(arrayList), 6));
                                                    return Unit.INSTANCE;
                                                }
                                            }
                                        } else {
                                            pVar15 = pVar11;
                                            pVar16 = pVar10;
                                            pVar17 = pVar13;
                                            pVar18 = null;
                                            long j17 = j8;
                                            pVar19 = pVar12;
                                            this.f144142p = null;
                                            this.f144127a = null;
                                            this.f144128b = null;
                                            this.f144129c = null;
                                            this.f144130d = null;
                                            this.f144131e = null;
                                            this.f144132f = null;
                                            this.f144133g = null;
                                            this.f144134h = pVar15;
                                            this.f144135i = pVar19;
                                            this.f144136j = pVar9;
                                            this.f144137k = pVar16;
                                            this.f144138l = pVar17;
                                            this.f144139m = pVar18;
                                            this.f144140n = j17;
                                            this.f144141o = 8;
                                            objAwait7 = i0Var13.await(this);
                                            if (objAwait7 != aVar) {
                                                pVar20 = pVar17;
                                                pVar21 = pVar16;
                                                pVar22 = pVar15;
                                                o13.p pVar27 = (o13.p) objAwait7;
                                                arrayList = new ArrayList();
                                                th3 = (Throwable) pVar19.f128595b;
                                                if (th3 != null) {
                                                    arrayList.add(th3);
                                                }
                                                B b110 = pVar9.f128595b;
                                                A a110 = pVar9.f128594a;
                                                th4 = (Throwable) b110;
                                                if (th4 != null) {
                                                    arrayList.add(th4);
                                                }
                                                B b111 = pVar21.f128595b;
                                                A a111 = pVar21.f128594a;
                                                th5 = (Throwable) b111;
                                                if (th5 != null) {
                                                    arrayList.add(th5);
                                                }
                                                if (pVar20 != null) {
                                                    arrayList.add(th9);
                                                }
                                                if (pVar18 != null) {
                                                    arrayList.add(th8);
                                                }
                                                th6 = (Throwable) pVar22.f128595b;
                                                if (th6 != null) {
                                                    arrayList.add(th6);
                                                }
                                                th7 = (Throwable) pVar27.f128595b;
                                                if (th7 != null) {
                                                    arrayList.add(th7);
                                                }
                                                fVar.f144071o = (List) pVar22.f128594a;
                                                fVar.f144067k = (ww0.j) pVar19.f128594a;
                                                fVar.f144065i = (op0.c) a110;
                                                fVar.f144072p = (UserSettingsDTO) a111;
                                                if (pVar20 != null) {
                                                    deviceSettingsDTO = (DeviceSettingsDTO) pVar20.f128594a;
                                                } else {
                                                    deviceSettingsDTO = null;
                                                }
                                                fVar.f144066j = deviceSettingsDTO;
                                                if (pVar18 != null) {
                                                    deviceSettingsDTO2 = (DeviceSettingsDTO) pVar18.f128594a;
                                                } else {
                                                    deviceSettingsDTO2 = null;
                                                }
                                                fVar.f144068l = deviceSettingsDTO2;
                                                weightGoalUserInputs = fVar.C.getWeightGoalUserInputs();
                                                userSettingsDTO = fVar.f144072p;
                                                if (userSettingsDTO != null) {
                                                    dValueOf = Double.valueOf(userSettingsDTO.E2());
                                                } else {
                                                    dValueOf = null;
                                                }
                                                userSettingsDTO2 = fVar.f144072p;
                                                if (userSettingsDTO2 != null) {
                                                    dValueOf2 = Double.valueOf(userSettingsDTO2.I());
                                                } else {
                                                    dValueOf2 = null;
                                                }
                                                if (dValueOf != null) {
                                                    userSettingsDTO4 = fVar.f144072p;
                                                    if (userSettingsDTO4 != null) {
                                                        dValueOf4 = Double.valueOf(userSettingsDTO4.E2());
                                                    } else {
                                                        dValueOf4 = null;
                                                    }
                                                    weightGoalUserInputs.k(dValueOf4);
                                                }
                                                if (dValueOf2 != null) {
                                                    userSettingsDTO3 = fVar.f144072p;
                                                    if (userSettingsDTO3 != null) {
                                                        dValueOf3 = Double.valueOf(userSettingsDTO3.I());
                                                    } else {
                                                        dValueOf3 = null;
                                                    }
                                                    weightGoalUserInputs.h(dValueOf3);
                                                }
                                                list = fVar.f144071o;
                                                if (list != null) {
                                                    arrayList3 = fVar.f144069m;
                                                    linkedHashSet = fVar.f144070n;
                                                    if (!list.isEmpty()) {
                                                        arrayList3.clear();
                                                        linkedHashSet.clear();
                                                        while (r1.hasNext()) {
                                                            dueDate = mVar.getDueDate();
                                                            if (dueDate != null) {
                                                                arrayList3.add(dueDate);
                                                                deliveryDate = mVar.getDeliveryDate();
                                                                if (deliveryDate != null) {
                                                                    linkedHashSet.add(deliveryDate);
                                                                } else {
                                                                    endDate = mVar.getEndDate();
                                                                    if (endDate != null) {
                                                                        linkedHashSet.add(endDate);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                    Unit unit4 = Unit.INSTANCE;
                                                }
                                                arrayList2 = (ArrayList) pVar27.f128594a;
                                                fVar.f144074r = arrayList2;
                                                if (arrayList2 != null) {
                                                    while (r1.hasNext()) {
                                                        ArrayList<bm2.c> arrayList7 = fVar.f144074r;
                                                        arrayList7.getClass();
                                                        it = arrayList7.iterator();
                                                        it.getClass();
                                                        while (it.hasNext()) {
                                                            bm2.c next4 = it.next();
                                                            next4.getClass();
                                                            str = u0Var2.f203860g;
                                                            u0Var = (u0) u0.f203782n6.get(next4.getF143517g());
                                                            if (u0Var != null) {
                                                                str2 = u0Var.f203860g;
                                                            } else {
                                                                str2 = null;
                                                            }
                                                            if (p005kotlin.jvm.internal.s.g(str, str2)) {
                                                                fVar.B = true;
                                                            }
                                                        }
                                                    }
                                                }
                                                ((y0) fVar.f144059c.getValue()).j(tb1.d.b(new o13.p(a110, a111), null, null, tb1.d.a(arrayList), 6));
                                                return Unit.INSTANCE;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return aVar;
            case 1:
                i0VarJ4 = this.f144131e;
                i0VarJ3 = this.f144130d;
                i0VarJ2 = this.f144129c;
                i0VarJ = this.f144128b;
                j0VarJ = this.f144127a;
                o13.r.b(obj);
                objY4 = obj;
                Long l14 = (Long) objY4;
                if (l14 != null) {
                    i0VarJ5 = ge1.b.j(b0Var, null, null, new a(fVar, l14, null), 3);
                } else {
                    i0VarJ5 = null;
                }
                i0Var = i0VarJ;
                i0Var2 = i0VarJ4;
                f12.l.f68084a.getClass();
                jS4 = f12.l.a.a().s4();
                if (jS4 != -1) {
                    i0VarJ6 = ge1.b.j(b0Var, null, null, new b(fVar, jS4, null), 3);
                } else {
                    i0VarJ6 = null;
                }
                this.f144142p = null;
                this.f144127a = null;
                this.f144128b = i0Var;
                this.f144129c = i0VarJ2;
                this.f144130d = i0VarJ3;
                this.f144131e = i0Var2;
                this.f144132f = i0VarJ5;
                this.f144133g = i0VarJ6;
                this.f144140n = jS4;
                this.f144141o = 2;
                objAwait = j0VarJ.await(this);
                if (objAwait != aVar) {
                    i0Var3 = i0VarJ3;
                    i0Var4 = i0VarJ2;
                    j8 = jS4;
                    pVar = (o13.p) objAwait;
                    this.f144142p = null;
                    this.f144127a = null;
                    this.f144128b = null;
                    this.f144129c = i0Var4;
                    this.f144130d = i0Var3;
                    this.f144131e = i0Var2;
                    this.f144132f = i0VarJ5;
                    this.f144133g = i0VarJ6;
                    this.f144134h = pVar;
                    this.f144140n = j8;
                    this.f144141o = 3;
                    objAwait2 = i0Var.await(this);
                    if (objAwait2 != aVar) {
                        i0Var5 = i0VarJ5;
                        i0Var6 = i0Var4;
                        i0Var7 = i0Var3;
                        i0Var8 = i0Var2;
                        pVar2 = (o13.p) objAwait2;
                        this.f144142p = null;
                        this.f144127a = null;
                        this.f144128b = null;
                        this.f144129c = null;
                        this.f144130d = i0Var7;
                        this.f144131e = i0Var8;
                        this.f144132f = i0Var5;
                        this.f144133g = i0VarJ6;
                        this.f144134h = pVar;
                        this.f144135i = pVar2;
                        this.f144140n = j8;
                        this.f144141o = 4;
                        objAwait3 = i0Var6.await(this);
                        if (objAwait3 != aVar) {
                            i0Var9 = i0Var7;
                            i0Var10 = i0Var5;
                            i0Var11 = i0VarJ6;
                            pVar3 = pVar2;
                            pVar4 = (o13.p) objAwait3;
                            this.f144142p = null;
                            this.f144127a = null;
                            this.f144128b = null;
                            this.f144129c = null;
                            this.f144130d = null;
                            this.f144131e = i0Var8;
                            this.f144132f = i0Var10;
                            this.f144133g = i0Var11;
                            this.f144134h = pVar;
                            this.f144135i = pVar3;
                            this.f144136j = pVar4;
                            this.f144140n = j8;
                            this.f144141o = 5;
                            objAwait4 = i0Var9.await(this);
                            if (objAwait4 != aVar) {
                                i0 i0Var17 = i0Var11;
                                pVar5 = pVar3;
                                i0Var12 = i0Var17;
                                pVar6 = pVar;
                                pVar7 = pVar4;
                                i0Var13 = i0Var8;
                                i0Var14 = i0Var10;
                                pVar8 = (o13.p) objAwait4;
                                if (i0Var14 != null) {
                                    this.f144142p = null;
                                    this.f144127a = null;
                                    this.f144128b = null;
                                    this.f144129c = null;
                                    this.f144130d = null;
                                    this.f144131e = i0Var13;
                                    this.f144132f = null;
                                    this.f144133g = i0Var12;
                                    this.f144134h = pVar6;
                                    this.f144135i = pVar5;
                                    this.f144136j = pVar7;
                                    this.f144137k = pVar8;
                                    this.f144140n = j8;
                                    this.f144141o = 6;
                                    objAwait5 = i0Var14.await(this);
                                    if (objAwait5 != aVar) {
                                        i0Var15 = i0Var12;
                                        pVar14 = pVar8;
                                        pVar11 = pVar6;
                                        pVar12 = pVar5;
                                        pVar9 = pVar7;
                                        pVar10 = pVar14;
                                        pVar13 = (o13.p) objAwait5;
                                        if (i0Var15 != null) {
                                            this.f144142p = null;
                                            this.f144127a = null;
                                            this.f144128b = null;
                                            this.f144129c = null;
                                            this.f144130d = null;
                                            this.f144131e = i0Var13;
                                            this.f144132f = null;
                                            this.f144133g = null;
                                            this.f144134h = pVar11;
                                            this.f144135i = pVar12;
                                            this.f144136j = pVar9;
                                            this.f144137k = pVar10;
                                            this.f144138l = pVar13;
                                            this.f144140n = j8;
                                            this.f144141o = 7;
                                            objAwait6 = i0Var15.await(this);
                                            if (objAwait6 != aVar) {
                                                pVar15 = pVar11;
                                                pVar16 = pVar10;
                                                pVar17 = pVar13;
                                                pVar18 = (o13.p) objAwait6;
                                                long j18 = j8;
                                                pVar19 = pVar12;
                                                this.f144142p = null;
                                                this.f144127a = null;
                                                this.f144128b = null;
                                                this.f144129c = null;
                                                this.f144130d = null;
                                                this.f144131e = null;
                                                this.f144132f = null;
                                                this.f144133g = null;
                                                this.f144134h = pVar15;
                                                this.f144135i = pVar19;
                                                this.f144136j = pVar9;
                                                this.f144137k = pVar16;
                                                this.f144138l = pVar17;
                                                this.f144139m = pVar18;
                                                this.f144140n = j18;
                                                this.f144141o = 8;
                                                objAwait7 = i0Var13.await(this);
                                                if (objAwait7 != aVar) {
                                                    pVar20 = pVar17;
                                                    pVar21 = pVar16;
                                                    pVar22 = pVar15;
                                                    o13.p pVar28 = (o13.p) objAwait7;
                                                    arrayList = new ArrayList();
                                                    th3 = (Throwable) pVar19.f128595b;
                                                    if (th3 != null) {
                                                        arrayList.add(th3);
                                                    }
                                                    B b112 = pVar9.f128595b;
                                                    A a112 = pVar9.f128594a;
                                                    th4 = (Throwable) b112;
                                                    if (th4 != null) {
                                                        arrayList.add(th4);
                                                    }
                                                    B b113 = pVar21.f128595b;
                                                    A a113 = pVar21.f128594a;
                                                    th5 = (Throwable) b113;
                                                    if (th5 != null) {
                                                        arrayList.add(th5);
                                                    }
                                                    if (pVar20 != null) {
                                                        arrayList.add(th9);
                                                    }
                                                    if (pVar18 != null) {
                                                        arrayList.add(th8);
                                                    }
                                                    th6 = (Throwable) pVar22.f128595b;
                                                    if (th6 != null) {
                                                        arrayList.add(th6);
                                                    }
                                                    th7 = (Throwable) pVar28.f128595b;
                                                    if (th7 != null) {
                                                        arrayList.add(th7);
                                                    }
                                                    fVar.f144071o = (List) pVar22.f128594a;
                                                    fVar.f144067k = (ww0.j) pVar19.f128594a;
                                                    fVar.f144065i = (op0.c) a112;
                                                    fVar.f144072p = (UserSettingsDTO) a113;
                                                    if (pVar20 != null) {
                                                        deviceSettingsDTO = (DeviceSettingsDTO) pVar20.f128594a;
                                                    } else {
                                                        deviceSettingsDTO = null;
                                                    }
                                                    fVar.f144066j = deviceSettingsDTO;
                                                    if (pVar18 != null) {
                                                        deviceSettingsDTO2 = (DeviceSettingsDTO) pVar18.f128594a;
                                                    } else {
                                                        deviceSettingsDTO2 = null;
                                                    }
                                                    fVar.f144068l = deviceSettingsDTO2;
                                                    weightGoalUserInputs = fVar.C.getWeightGoalUserInputs();
                                                    userSettingsDTO = fVar.f144072p;
                                                    if (userSettingsDTO != null) {
                                                        dValueOf = Double.valueOf(userSettingsDTO.E2());
                                                    } else {
                                                        dValueOf = null;
                                                    }
                                                    userSettingsDTO2 = fVar.f144072p;
                                                    if (userSettingsDTO2 != null) {
                                                        dValueOf2 = Double.valueOf(userSettingsDTO2.I());
                                                    } else {
                                                        dValueOf2 = null;
                                                    }
                                                    if (dValueOf != null) {
                                                        userSettingsDTO4 = fVar.f144072p;
                                                        if (userSettingsDTO4 != null) {
                                                            dValueOf4 = Double.valueOf(userSettingsDTO4.E2());
                                                        } else {
                                                            dValueOf4 = null;
                                                        }
                                                        weightGoalUserInputs.k(dValueOf4);
                                                    }
                                                    if (dValueOf2 != null) {
                                                        userSettingsDTO3 = fVar.f144072p;
                                                        if (userSettingsDTO3 != null) {
                                                            dValueOf3 = Double.valueOf(userSettingsDTO3.I());
                                                        } else {
                                                            dValueOf3 = null;
                                                        }
                                                        weightGoalUserInputs.h(dValueOf3);
                                                    }
                                                    list = fVar.f144071o;
                                                    if (list != null) {
                                                        arrayList3 = fVar.f144069m;
                                                        linkedHashSet = fVar.f144070n;
                                                        if (!list.isEmpty()) {
                                                            arrayList3.clear();
                                                            linkedHashSet.clear();
                                                            while (r1.hasNext()) {
                                                                dueDate = mVar.getDueDate();
                                                                if (dueDate != null) {
                                                                    arrayList3.add(dueDate);
                                                                    deliveryDate = mVar.getDeliveryDate();
                                                                    if (deliveryDate != null) {
                                                                        linkedHashSet.add(deliveryDate);
                                                                    } else {
                                                                        endDate = mVar.getEndDate();
                                                                        if (endDate != null) {
                                                                            linkedHashSet.add(endDate);
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        Unit unit5 = Unit.INSTANCE;
                                                    }
                                                    arrayList2 = (ArrayList) pVar28.f128594a;
                                                    fVar.f144074r = arrayList2;
                                                    if (arrayList2 != null) {
                                                        while (r1.hasNext()) {
                                                            ArrayList<bm2.c> arrayList8 = fVar.f144074r;
                                                            arrayList8.getClass();
                                                            it = arrayList8.iterator();
                                                            it.getClass();
                                                            while (it.hasNext()) {
                                                                bm2.c next5 = it.next();
                                                                next5.getClass();
                                                                str = u0Var2.f203860g;
                                                                u0Var = (u0) u0.f203782n6.get(next5.getF143517g());
                                                                if (u0Var != null) {
                                                                    str2 = u0Var.f203860g;
                                                                } else {
                                                                    str2 = null;
                                                                }
                                                                if (p005kotlin.jvm.internal.s.g(str, str2)) {
                                                                    fVar.B = true;
                                                                }
                                                            }
                                                        }
                                                    }
                                                    ((y0) fVar.f144059c.getValue()).j(tb1.d.b(new o13.p(a112, a113), null, null, tb1.d.a(arrayList), 6));
                                                    return Unit.INSTANCE;
                                                }
                                            }
                                        } else {
                                            pVar15 = pVar11;
                                            pVar16 = pVar10;
                                            pVar17 = pVar13;
                                            pVar18 = null;
                                            long j19 = j8;
                                            pVar19 = pVar12;
                                            this.f144142p = null;
                                            this.f144127a = null;
                                            this.f144128b = null;
                                            this.f144129c = null;
                                            this.f144130d = null;
                                            this.f144131e = null;
                                            this.f144132f = null;
                                            this.f144133g = null;
                                            this.f144134h = pVar15;
                                            this.f144135i = pVar19;
                                            this.f144136j = pVar9;
                                            this.f144137k = pVar16;
                                            this.f144138l = pVar17;
                                            this.f144139m = pVar18;
                                            this.f144140n = j19;
                                            this.f144141o = 8;
                                            objAwait7 = i0Var13.await(this);
                                            if (objAwait7 != aVar) {
                                                pVar20 = pVar17;
                                                pVar21 = pVar16;
                                                pVar22 = pVar15;
                                                o13.p pVar29 = (o13.p) objAwait7;
                                                arrayList = new ArrayList();
                                                th3 = (Throwable) pVar19.f128595b;
                                                if (th3 != null) {
                                                    arrayList.add(th3);
                                                }
                                                B b114 = pVar9.f128595b;
                                                A a114 = pVar9.f128594a;
                                                th4 = (Throwable) b114;
                                                if (th4 != null) {
                                                    arrayList.add(th4);
                                                }
                                                B b115 = pVar21.f128595b;
                                                A a115 = pVar21.f128594a;
                                                th5 = (Throwable) b115;
                                                if (th5 != null) {
                                                    arrayList.add(th5);
                                                }
                                                if (pVar20 != null) {
                                                    arrayList.add(th9);
                                                }
                                                if (pVar18 != null) {
                                                    arrayList.add(th8);
                                                }
                                                th6 = (Throwable) pVar22.f128595b;
                                                if (th6 != null) {
                                                    arrayList.add(th6);
                                                }
                                                th7 = (Throwable) pVar29.f128595b;
                                                if (th7 != null) {
                                                    arrayList.add(th7);
                                                }
                                                fVar.f144071o = (List) pVar22.f128594a;
                                                fVar.f144067k = (ww0.j) pVar19.f128594a;
                                                fVar.f144065i = (op0.c) a114;
                                                fVar.f144072p = (UserSettingsDTO) a115;
                                                if (pVar20 != null) {
                                                    deviceSettingsDTO = (DeviceSettingsDTO) pVar20.f128594a;
                                                } else {
                                                    deviceSettingsDTO = null;
                                                }
                                                fVar.f144066j = deviceSettingsDTO;
                                                if (pVar18 != null) {
                                                    deviceSettingsDTO2 = (DeviceSettingsDTO) pVar18.f128594a;
                                                } else {
                                                    deviceSettingsDTO2 = null;
                                                }
                                                fVar.f144068l = deviceSettingsDTO2;
                                                weightGoalUserInputs = fVar.C.getWeightGoalUserInputs();
                                                userSettingsDTO = fVar.f144072p;
                                                if (userSettingsDTO != null) {
                                                    dValueOf = Double.valueOf(userSettingsDTO.E2());
                                                } else {
                                                    dValueOf = null;
                                                }
                                                userSettingsDTO2 = fVar.f144072p;
                                                if (userSettingsDTO2 != null) {
                                                    dValueOf2 = Double.valueOf(userSettingsDTO2.I());
                                                } else {
                                                    dValueOf2 = null;
                                                }
                                                if (dValueOf != null) {
                                                    userSettingsDTO4 = fVar.f144072p;
                                                    if (userSettingsDTO4 != null) {
                                                        dValueOf4 = Double.valueOf(userSettingsDTO4.E2());
                                                    } else {
                                                        dValueOf4 = null;
                                                    }
                                                    weightGoalUserInputs.k(dValueOf4);
                                                }
                                                if (dValueOf2 != null) {
                                                    userSettingsDTO3 = fVar.f144072p;
                                                    if (userSettingsDTO3 != null) {
                                                        dValueOf3 = Double.valueOf(userSettingsDTO3.I());
                                                    } else {
                                                        dValueOf3 = null;
                                                    }
                                                    weightGoalUserInputs.h(dValueOf3);
                                                }
                                                list = fVar.f144071o;
                                                if (list != null) {
                                                    arrayList3 = fVar.f144069m;
                                                    linkedHashSet = fVar.f144070n;
                                                    if (!list.isEmpty()) {
                                                        arrayList3.clear();
                                                        linkedHashSet.clear();
                                                        while (r1.hasNext()) {
                                                            dueDate = mVar.getDueDate();
                                                            if (dueDate != null) {
                                                                arrayList3.add(dueDate);
                                                                deliveryDate = mVar.getDeliveryDate();
                                                                if (deliveryDate != null) {
                                                                    linkedHashSet.add(deliveryDate);
                                                                } else {
                                                                    endDate = mVar.getEndDate();
                                                                    if (endDate != null) {
                                                                        linkedHashSet.add(endDate);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                    Unit unit6 = Unit.INSTANCE;
                                                }
                                                arrayList2 = (ArrayList) pVar29.f128594a;
                                                fVar.f144074r = arrayList2;
                                                if (arrayList2 != null) {
                                                    while (r1.hasNext()) {
                                                        ArrayList<bm2.c> arrayList9 = fVar.f144074r;
                                                        arrayList9.getClass();
                                                        it = arrayList9.iterator();
                                                        it.getClass();
                                                        while (it.hasNext()) {
                                                            bm2.c next6 = it.next();
                                                            next6.getClass();
                                                            str = u0Var2.f203860g;
                                                            u0Var = (u0) u0.f203782n6.get(next6.getF143517g());
                                                            if (u0Var != null) {
                                                                str2 = u0Var.f203860g;
                                                            } else {
                                                                str2 = null;
                                                            }
                                                            if (p005kotlin.jvm.internal.s.g(str, str2)) {
                                                                fVar.B = true;
                                                            }
                                                        }
                                                    }
                                                }
                                                ((y0) fVar.f144059c.getValue()).j(tb1.d.b(new o13.p(a114, a115), null, null, tb1.d.a(arrayList), 6));
                                                return Unit.INSTANCE;
                                            }
                                        }
                                    }
                                } else {
                                    o13.p pVar210 = pVar5;
                                    pVar9 = pVar7;
                                    pVar10 = pVar8;
                                    pVar11 = pVar6;
                                    pVar12 = pVar210;
                                    i0Var15 = i0Var12;
                                    pVar13 = null;
                                    if (i0Var15 != null) {
                                        this.f144142p = null;
                                        this.f144127a = null;
                                        this.f144128b = null;
                                        this.f144129c = null;
                                        this.f144130d = null;
                                        this.f144131e = i0Var13;
                                        this.f144132f = null;
                                        this.f144133g = null;
                                        this.f144134h = pVar11;
                                        this.f144135i = pVar12;
                                        this.f144136j = pVar9;
                                        this.f144137k = pVar10;
                                        this.f144138l = pVar13;
                                        this.f144140n = j8;
                                        this.f144141o = 7;
                                        objAwait6 = i0Var15.await(this);
                                        if (objAwait6 != aVar) {
                                            pVar15 = pVar11;
                                            pVar16 = pVar10;
                                            pVar17 = pVar13;
                                            pVar18 = (o13.p) objAwait6;
                                            long j110 = j8;
                                            pVar19 = pVar12;
                                            this.f144142p = null;
                                            this.f144127a = null;
                                            this.f144128b = null;
                                            this.f144129c = null;
                                            this.f144130d = null;
                                            this.f144131e = null;
                                            this.f144132f = null;
                                            this.f144133g = null;
                                            this.f144134h = pVar15;
                                            this.f144135i = pVar19;
                                            this.f144136j = pVar9;
                                            this.f144137k = pVar16;
                                            this.f144138l = pVar17;
                                            this.f144139m = pVar18;
                                            this.f144140n = j110;
                                            this.f144141o = 8;
                                            objAwait7 = i0Var13.await(this);
                                            if (objAwait7 != aVar) {
                                                pVar20 = pVar17;
                                                pVar21 = pVar16;
                                                pVar22 = pVar15;
                                                o13.p pVar211 = (o13.p) objAwait7;
                                                arrayList = new ArrayList();
                                                th3 = (Throwable) pVar19.f128595b;
                                                if (th3 != null) {
                                                    arrayList.add(th3);
                                                }
                                                B b116 = pVar9.f128595b;
                                                A a116 = pVar9.f128594a;
                                                th4 = (Throwable) b116;
                                                if (th4 != null) {
                                                    arrayList.add(th4);
                                                }
                                                B b117 = pVar21.f128595b;
                                                A a117 = pVar21.f128594a;
                                                th5 = (Throwable) b117;
                                                if (th5 != null) {
                                                    arrayList.add(th5);
                                                }
                                                if (pVar20 != null) {
                                                    arrayList.add(th9);
                                                }
                                                if (pVar18 != null) {
                                                    arrayList.add(th8);
                                                }
                                                th6 = (Throwable) pVar22.f128595b;
                                                if (th6 != null) {
                                                    arrayList.add(th6);
                                                }
                                                th7 = (Throwable) pVar211.f128595b;
                                                if (th7 != null) {
                                                    arrayList.add(th7);
                                                }
                                                fVar.f144071o = (List) pVar22.f128594a;
                                                fVar.f144067k = (ww0.j) pVar19.f128594a;
                                                fVar.f144065i = (op0.c) a116;
                                                fVar.f144072p = (UserSettingsDTO) a117;
                                                if (pVar20 != null) {
                                                    deviceSettingsDTO = (DeviceSettingsDTO) pVar20.f128594a;
                                                } else {
                                                    deviceSettingsDTO = null;
                                                }
                                                fVar.f144066j = deviceSettingsDTO;
                                                if (pVar18 != null) {
                                                    deviceSettingsDTO2 = (DeviceSettingsDTO) pVar18.f128594a;
                                                } else {
                                                    deviceSettingsDTO2 = null;
                                                }
                                                fVar.f144068l = deviceSettingsDTO2;
                                                weightGoalUserInputs = fVar.C.getWeightGoalUserInputs();
                                                userSettingsDTO = fVar.f144072p;
                                                if (userSettingsDTO != null) {
                                                    dValueOf = Double.valueOf(userSettingsDTO.E2());
                                                } else {
                                                    dValueOf = null;
                                                }
                                                userSettingsDTO2 = fVar.f144072p;
                                                if (userSettingsDTO2 != null) {
                                                    dValueOf2 = Double.valueOf(userSettingsDTO2.I());
                                                } else {
                                                    dValueOf2 = null;
                                                }
                                                if (dValueOf != null) {
                                                    userSettingsDTO4 = fVar.f144072p;
                                                    if (userSettingsDTO4 != null) {
                                                        dValueOf4 = Double.valueOf(userSettingsDTO4.E2());
                                                    } else {
                                                        dValueOf4 = null;
                                                    }
                                                    weightGoalUserInputs.k(dValueOf4);
                                                }
                                                if (dValueOf2 != null) {
                                                    userSettingsDTO3 = fVar.f144072p;
                                                    if (userSettingsDTO3 != null) {
                                                        dValueOf3 = Double.valueOf(userSettingsDTO3.I());
                                                    } else {
                                                        dValueOf3 = null;
                                                    }
                                                    weightGoalUserInputs.h(dValueOf3);
                                                }
                                                list = fVar.f144071o;
                                                if (list != null) {
                                                    arrayList3 = fVar.f144069m;
                                                    linkedHashSet = fVar.f144070n;
                                                    if (!list.isEmpty()) {
                                                        arrayList3.clear();
                                                        linkedHashSet.clear();
                                                        while (r1.hasNext()) {
                                                            dueDate = mVar.getDueDate();
                                                            if (dueDate != null) {
                                                                arrayList3.add(dueDate);
                                                                deliveryDate = mVar.getDeliveryDate();
                                                                if (deliveryDate != null) {
                                                                    linkedHashSet.add(deliveryDate);
                                                                } else {
                                                                    endDate = mVar.getEndDate();
                                                                    if (endDate != null) {
                                                                        linkedHashSet.add(endDate);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                    Unit unit7 = Unit.INSTANCE;
                                                }
                                                arrayList2 = (ArrayList) pVar211.f128594a;
                                                fVar.f144074r = arrayList2;
                                                if (arrayList2 != null) {
                                                    while (r1.hasNext()) {
                                                        ArrayList<bm2.c> arrayList10 = fVar.f144074r;
                                                        arrayList10.getClass();
                                                        it = arrayList10.iterator();
                                                        it.getClass();
                                                        while (it.hasNext()) {
                                                            bm2.c next7 = it.next();
                                                            next7.getClass();
                                                            str = u0Var2.f203860g;
                                                            u0Var = (u0) u0.f203782n6.get(next7.getF143517g());
                                                            if (u0Var != null) {
                                                                str2 = u0Var.f203860g;
                                                            } else {
                                                                str2 = null;
                                                            }
                                                            if (p005kotlin.jvm.internal.s.g(str, str2)) {
                                                                fVar.B = true;
                                                            }
                                                        }
                                                    }
                                                }
                                                ((y0) fVar.f144059c.getValue()).j(tb1.d.b(new o13.p(a116, a117), null, null, tb1.d.a(arrayList), 6));
                                                return Unit.INSTANCE;
                                            }
                                        }
                                    } else {
                                        pVar15 = pVar11;
                                        pVar16 = pVar10;
                                        pVar17 = pVar13;
                                        pVar18 = null;
                                        long j111 = j8;
                                        pVar19 = pVar12;
                                        this.f144142p = null;
                                        this.f144127a = null;
                                        this.f144128b = null;
                                        this.f144129c = null;
                                        this.f144130d = null;
                                        this.f144131e = null;
                                        this.f144132f = null;
                                        this.f144133g = null;
                                        this.f144134h = pVar15;
                                        this.f144135i = pVar19;
                                        this.f144136j = pVar9;
                                        this.f144137k = pVar16;
                                        this.f144138l = pVar17;
                                        this.f144139m = pVar18;
                                        this.f144140n = j111;
                                        this.f144141o = 8;
                                        objAwait7 = i0Var13.await(this);
                                        if (objAwait7 != aVar) {
                                            pVar20 = pVar17;
                                            pVar21 = pVar16;
                                            pVar22 = pVar15;
                                            o13.p pVar212 = (o13.p) objAwait7;
                                            arrayList = new ArrayList();
                                            th3 = (Throwable) pVar19.f128595b;
                                            if (th3 != null) {
                                                arrayList.add(th3);
                                            }
                                            B b118 = pVar9.f128595b;
                                            A a118 = pVar9.f128594a;
                                            th4 = (Throwable) b118;
                                            if (th4 != null) {
                                                arrayList.add(th4);
                                            }
                                            B b119 = pVar21.f128595b;
                                            A a119 = pVar21.f128594a;
                                            th5 = (Throwable) b119;
                                            if (th5 != null) {
                                                arrayList.add(th5);
                                            }
                                            if (pVar20 != null) {
                                                arrayList.add(th9);
                                            }
                                            if (pVar18 != null) {
                                                arrayList.add(th8);
                                            }
                                            th6 = (Throwable) pVar22.f128595b;
                                            if (th6 != null) {
                                                arrayList.add(th6);
                                            }
                                            th7 = (Throwable) pVar212.f128595b;
                                            if (th7 != null) {
                                                arrayList.add(th7);
                                            }
                                            fVar.f144071o = (List) pVar22.f128594a;
                                            fVar.f144067k = (ww0.j) pVar19.f128594a;
                                            fVar.f144065i = (op0.c) a118;
                                            fVar.f144072p = (UserSettingsDTO) a119;
                                            if (pVar20 != null) {
                                                deviceSettingsDTO = (DeviceSettingsDTO) pVar20.f128594a;
                                            } else {
                                                deviceSettingsDTO = null;
                                            }
                                            fVar.f144066j = deviceSettingsDTO;
                                            if (pVar18 != null) {
                                                deviceSettingsDTO2 = (DeviceSettingsDTO) pVar18.f128594a;
                                            } else {
                                                deviceSettingsDTO2 = null;
                                            }
                                            fVar.f144068l = deviceSettingsDTO2;
                                            weightGoalUserInputs = fVar.C.getWeightGoalUserInputs();
                                            userSettingsDTO = fVar.f144072p;
                                            if (userSettingsDTO != null) {
                                                dValueOf = Double.valueOf(userSettingsDTO.E2());
                                            } else {
                                                dValueOf = null;
                                            }
                                            userSettingsDTO2 = fVar.f144072p;
                                            if (userSettingsDTO2 != null) {
                                                dValueOf2 = Double.valueOf(userSettingsDTO2.I());
                                            } else {
                                                dValueOf2 = null;
                                            }
                                            if (dValueOf != null) {
                                                userSettingsDTO4 = fVar.f144072p;
                                                if (userSettingsDTO4 != null) {
                                                    dValueOf4 = Double.valueOf(userSettingsDTO4.E2());
                                                } else {
                                                    dValueOf4 = null;
                                                }
                                                weightGoalUserInputs.k(dValueOf4);
                                            }
                                            if (dValueOf2 != null) {
                                                userSettingsDTO3 = fVar.f144072p;
                                                if (userSettingsDTO3 != null) {
                                                    dValueOf3 = Double.valueOf(userSettingsDTO3.I());
                                                } else {
                                                    dValueOf3 = null;
                                                }
                                                weightGoalUserInputs.h(dValueOf3);
                                            }
                                            list = fVar.f144071o;
                                            if (list != null) {
                                                arrayList3 = fVar.f144069m;
                                                linkedHashSet = fVar.f144070n;
                                                if (!list.isEmpty()) {
                                                    arrayList3.clear();
                                                    linkedHashSet.clear();
                                                    while (r1.hasNext()) {
                                                        dueDate = mVar.getDueDate();
                                                        if (dueDate != null) {
                                                            arrayList3.add(dueDate);
                                                            deliveryDate = mVar.getDeliveryDate();
                                                            if (deliveryDate != null) {
                                                                linkedHashSet.add(deliveryDate);
                                                            } else {
                                                                endDate = mVar.getEndDate();
                                                                if (endDate != null) {
                                                                    linkedHashSet.add(endDate);
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                                Unit unit8 = Unit.INSTANCE;
                                            }
                                            arrayList2 = (ArrayList) pVar212.f128594a;
                                            fVar.f144074r = arrayList2;
                                            if (arrayList2 != null) {
                                                while (r1.hasNext()) {
                                                    ArrayList<bm2.c> arrayList11 = fVar.f144074r;
                                                    arrayList11.getClass();
                                                    it = arrayList11.iterator();
                                                    it.getClass();
                                                    while (it.hasNext()) {
                                                        bm2.c next8 = it.next();
                                                        next8.getClass();
                                                        str = u0Var2.f203860g;
                                                        u0Var = (u0) u0.f203782n6.get(next8.getF143517g());
                                                        if (u0Var != null) {
                                                            str2 = u0Var.f203860g;
                                                        } else {
                                                            str2 = null;
                                                        }
                                                        if (p005kotlin.jvm.internal.s.g(str, str2)) {
                                                            fVar.B = true;
                                                        }
                                                    }
                                                }
                                            }
                                            ((y0) fVar.f144059c.getValue()).j(tb1.d.b(new o13.p(a118, a119), null, null, tb1.d.a(arrayList), 6));
                                            return Unit.INSTANCE;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return aVar;
            case 2:
                j8 = this.f144140n;
                i0VarJ6 = this.f144133g;
                i0 i0Var18 = this.f144132f;
                i0Var2 = this.f144131e;
                i0Var3 = this.f144130d;
                i0 i0Var19 = this.f144129c;
                i0Var = this.f144128b;
                o13.r.b(obj);
                i0Var4 = i0Var19;
                i0VarJ5 = i0Var18;
                objAwait = obj;
                pVar = (o13.p) objAwait;
                this.f144142p = null;
                this.f144127a = null;
                this.f144128b = null;
                this.f144129c = i0Var4;
                this.f144130d = i0Var3;
                this.f144131e = i0Var2;
                this.f144132f = i0VarJ5;
                this.f144133g = i0VarJ6;
                this.f144134h = pVar;
                this.f144140n = j8;
                this.f144141o = 3;
                objAwait2 = i0Var.await(this);
                if (objAwait2 != aVar) {
                    i0Var5 = i0VarJ5;
                    i0Var6 = i0Var4;
                    i0Var7 = i0Var3;
                    i0Var8 = i0Var2;
                    pVar2 = (o13.p) objAwait2;
                    this.f144142p = null;
                    this.f144127a = null;
                    this.f144128b = null;
                    this.f144129c = null;
                    this.f144130d = i0Var7;
                    this.f144131e = i0Var8;
                    this.f144132f = i0Var5;
                    this.f144133g = i0VarJ6;
                    this.f144134h = pVar;
                    this.f144135i = pVar2;
                    this.f144140n = j8;
                    this.f144141o = 4;
                    objAwait3 = i0Var6.await(this);
                    if (objAwait3 != aVar) {
                        i0Var9 = i0Var7;
                        i0Var10 = i0Var5;
                        i0Var11 = i0VarJ6;
                        pVar3 = pVar2;
                        pVar4 = (o13.p) objAwait3;
                        this.f144142p = null;
                        this.f144127a = null;
                        this.f144128b = null;
                        this.f144129c = null;
                        this.f144130d = null;
                        this.f144131e = i0Var8;
                        this.f144132f = i0Var10;
                        this.f144133g = i0Var11;
                        this.f144134h = pVar;
                        this.f144135i = pVar3;
                        this.f144136j = pVar4;
                        this.f144140n = j8;
                        this.f144141o = 5;
                        objAwait4 = i0Var9.await(this);
                        if (objAwait4 != aVar) {
                            i0 i0Var110 = i0Var11;
                            pVar5 = pVar3;
                            i0Var12 = i0Var110;
                            pVar6 = pVar;
                            pVar7 = pVar4;
                            i0Var13 = i0Var8;
                            i0Var14 = i0Var10;
                            pVar8 = (o13.p) objAwait4;
                            if (i0Var14 != null) {
                                this.f144142p = null;
                                this.f144127a = null;
                                this.f144128b = null;
                                this.f144129c = null;
                                this.f144130d = null;
                                this.f144131e = i0Var13;
                                this.f144132f = null;
                                this.f144133g = i0Var12;
                                this.f144134h = pVar6;
                                this.f144135i = pVar5;
                                this.f144136j = pVar7;
                                this.f144137k = pVar8;
                                this.f144140n = j8;
                                this.f144141o = 6;
                                objAwait5 = i0Var14.await(this);
                                if (objAwait5 != aVar) {
                                    i0Var15 = i0Var12;
                                    pVar14 = pVar8;
                                    pVar11 = pVar6;
                                    pVar12 = pVar5;
                                    pVar9 = pVar7;
                                    pVar10 = pVar14;
                                    pVar13 = (o13.p) objAwait5;
                                    if (i0Var15 != null) {
                                        this.f144142p = null;
                                        this.f144127a = null;
                                        this.f144128b = null;
                                        this.f144129c = null;
                                        this.f144130d = null;
                                        this.f144131e = i0Var13;
                                        this.f144132f = null;
                                        this.f144133g = null;
                                        this.f144134h = pVar11;
                                        this.f144135i = pVar12;
                                        this.f144136j = pVar9;
                                        this.f144137k = pVar10;
                                        this.f144138l = pVar13;
                                        this.f144140n = j8;
                                        this.f144141o = 7;
                                        objAwait6 = i0Var15.await(this);
                                        if (objAwait6 != aVar) {
                                            pVar15 = pVar11;
                                            pVar16 = pVar10;
                                            pVar17 = pVar13;
                                            pVar18 = (o13.p) objAwait6;
                                            long j112 = j8;
                                            pVar19 = pVar12;
                                            this.f144142p = null;
                                            this.f144127a = null;
                                            this.f144128b = null;
                                            this.f144129c = null;
                                            this.f144130d = null;
                                            this.f144131e = null;
                                            this.f144132f = null;
                                            this.f144133g = null;
                                            this.f144134h = pVar15;
                                            this.f144135i = pVar19;
                                            this.f144136j = pVar9;
                                            this.f144137k = pVar16;
                                            this.f144138l = pVar17;
                                            this.f144139m = pVar18;
                                            this.f144140n = j112;
                                            this.f144141o = 8;
                                            objAwait7 = i0Var13.await(this);
                                            if (objAwait7 != aVar) {
                                                pVar20 = pVar17;
                                                pVar21 = pVar16;
                                                pVar22 = pVar15;
                                                o13.p pVar213 = (o13.p) objAwait7;
                                                arrayList = new ArrayList();
                                                th3 = (Throwable) pVar19.f128595b;
                                                if (th3 != null) {
                                                    arrayList.add(th3);
                                                }
                                                B b1110 = pVar9.f128595b;
                                                A a1110 = pVar9.f128594a;
                                                th4 = (Throwable) b1110;
                                                if (th4 != null) {
                                                    arrayList.add(th4);
                                                }
                                                B b1111 = pVar21.f128595b;
                                                A a1111 = pVar21.f128594a;
                                                th5 = (Throwable) b1111;
                                                if (th5 != null) {
                                                    arrayList.add(th5);
                                                }
                                                if (pVar20 != null) {
                                                    arrayList.add(th9);
                                                }
                                                if (pVar18 != null) {
                                                    arrayList.add(th8);
                                                }
                                                th6 = (Throwable) pVar22.f128595b;
                                                if (th6 != null) {
                                                    arrayList.add(th6);
                                                }
                                                th7 = (Throwable) pVar213.f128595b;
                                                if (th7 != null) {
                                                    arrayList.add(th7);
                                                }
                                                fVar.f144071o = (List) pVar22.f128594a;
                                                fVar.f144067k = (ww0.j) pVar19.f128594a;
                                                fVar.f144065i = (op0.c) a1110;
                                                fVar.f144072p = (UserSettingsDTO) a1111;
                                                if (pVar20 != null) {
                                                    deviceSettingsDTO = (DeviceSettingsDTO) pVar20.f128594a;
                                                } else {
                                                    deviceSettingsDTO = null;
                                                }
                                                fVar.f144066j = deviceSettingsDTO;
                                                if (pVar18 != null) {
                                                    deviceSettingsDTO2 = (DeviceSettingsDTO) pVar18.f128594a;
                                                } else {
                                                    deviceSettingsDTO2 = null;
                                                }
                                                fVar.f144068l = deviceSettingsDTO2;
                                                weightGoalUserInputs = fVar.C.getWeightGoalUserInputs();
                                                userSettingsDTO = fVar.f144072p;
                                                if (userSettingsDTO != null) {
                                                    dValueOf = Double.valueOf(userSettingsDTO.E2());
                                                } else {
                                                    dValueOf = null;
                                                }
                                                userSettingsDTO2 = fVar.f144072p;
                                                if (userSettingsDTO2 != null) {
                                                    dValueOf2 = Double.valueOf(userSettingsDTO2.I());
                                                } else {
                                                    dValueOf2 = null;
                                                }
                                                if (dValueOf != null) {
                                                    userSettingsDTO4 = fVar.f144072p;
                                                    if (userSettingsDTO4 != null) {
                                                        dValueOf4 = Double.valueOf(userSettingsDTO4.E2());
                                                    } else {
                                                        dValueOf4 = null;
                                                    }
                                                    weightGoalUserInputs.k(dValueOf4);
                                                }
                                                if (dValueOf2 != null) {
                                                    userSettingsDTO3 = fVar.f144072p;
                                                    if (userSettingsDTO3 != null) {
                                                        dValueOf3 = Double.valueOf(userSettingsDTO3.I());
                                                    } else {
                                                        dValueOf3 = null;
                                                    }
                                                    weightGoalUserInputs.h(dValueOf3);
                                                }
                                                list = fVar.f144071o;
                                                if (list != null) {
                                                    arrayList3 = fVar.f144069m;
                                                    linkedHashSet = fVar.f144070n;
                                                    if (!list.isEmpty()) {
                                                        arrayList3.clear();
                                                        linkedHashSet.clear();
                                                        while (r1.hasNext()) {
                                                            dueDate = mVar.getDueDate();
                                                            if (dueDate != null) {
                                                                arrayList3.add(dueDate);
                                                                deliveryDate = mVar.getDeliveryDate();
                                                                if (deliveryDate != null) {
                                                                    linkedHashSet.add(deliveryDate);
                                                                } else {
                                                                    endDate = mVar.getEndDate();
                                                                    if (endDate != null) {
                                                                        linkedHashSet.add(endDate);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                    Unit unit9 = Unit.INSTANCE;
                                                }
                                                arrayList2 = (ArrayList) pVar213.f128594a;
                                                fVar.f144074r = arrayList2;
                                                if (arrayList2 != null) {
                                                    while (r1.hasNext()) {
                                                        ArrayList<bm2.c> arrayList12 = fVar.f144074r;
                                                        arrayList12.getClass();
                                                        it = arrayList12.iterator();
                                                        it.getClass();
                                                        while (it.hasNext()) {
                                                            bm2.c next9 = it.next();
                                                            next9.getClass();
                                                            str = u0Var2.f203860g;
                                                            u0Var = (u0) u0.f203782n6.get(next9.getF143517g());
                                                            if (u0Var != null) {
                                                                str2 = u0Var.f203860g;
                                                            } else {
                                                                str2 = null;
                                                            }
                                                            if (p005kotlin.jvm.internal.s.g(str, str2)) {
                                                                fVar.B = true;
                                                            }
                                                        }
                                                    }
                                                }
                                                ((y0) fVar.f144059c.getValue()).j(tb1.d.b(new o13.p(a1110, a1111), null, null, tb1.d.a(arrayList), 6));
                                                return Unit.INSTANCE;
                                            }
                                        }
                                    } else {
                                        pVar15 = pVar11;
                                        pVar16 = pVar10;
                                        pVar17 = pVar13;
                                        pVar18 = null;
                                        long j113 = j8;
                                        pVar19 = pVar12;
                                        this.f144142p = null;
                                        this.f144127a = null;
                                        this.f144128b = null;
                                        this.f144129c = null;
                                        this.f144130d = null;
                                        this.f144131e = null;
                                        this.f144132f = null;
                                        this.f144133g = null;
                                        this.f144134h = pVar15;
                                        this.f144135i = pVar19;
                                        this.f144136j = pVar9;
                                        this.f144137k = pVar16;
                                        this.f144138l = pVar17;
                                        this.f144139m = pVar18;
                                        this.f144140n = j113;
                                        this.f144141o = 8;
                                        objAwait7 = i0Var13.await(this);
                                        if (objAwait7 != aVar) {
                                            pVar20 = pVar17;
                                            pVar21 = pVar16;
                                            pVar22 = pVar15;
                                            o13.p pVar214 = (o13.p) objAwait7;
                                            arrayList = new ArrayList();
                                            th3 = (Throwable) pVar19.f128595b;
                                            if (th3 != null) {
                                                arrayList.add(th3);
                                            }
                                            B b1112 = pVar9.f128595b;
                                            A a1112 = pVar9.f128594a;
                                            th4 = (Throwable) b1112;
                                            if (th4 != null) {
                                                arrayList.add(th4);
                                            }
                                            B b1113 = pVar21.f128595b;
                                            A a1113 = pVar21.f128594a;
                                            th5 = (Throwable) b1113;
                                            if (th5 != null) {
                                                arrayList.add(th5);
                                            }
                                            if (pVar20 != null) {
                                                arrayList.add(th9);
                                            }
                                            if (pVar18 != null) {
                                                arrayList.add(th8);
                                            }
                                            th6 = (Throwable) pVar22.f128595b;
                                            if (th6 != null) {
                                                arrayList.add(th6);
                                            }
                                            th7 = (Throwable) pVar214.f128595b;
                                            if (th7 != null) {
                                                arrayList.add(th7);
                                            }
                                            fVar.f144071o = (List) pVar22.f128594a;
                                            fVar.f144067k = (ww0.j) pVar19.f128594a;
                                            fVar.f144065i = (op0.c) a1112;
                                            fVar.f144072p = (UserSettingsDTO) a1113;
                                            if (pVar20 != null) {
                                                deviceSettingsDTO = (DeviceSettingsDTO) pVar20.f128594a;
                                            } else {
                                                deviceSettingsDTO = null;
                                            }
                                            fVar.f144066j = deviceSettingsDTO;
                                            if (pVar18 != null) {
                                                deviceSettingsDTO2 = (DeviceSettingsDTO) pVar18.f128594a;
                                            } else {
                                                deviceSettingsDTO2 = null;
                                            }
                                            fVar.f144068l = deviceSettingsDTO2;
                                            weightGoalUserInputs = fVar.C.getWeightGoalUserInputs();
                                            userSettingsDTO = fVar.f144072p;
                                            if (userSettingsDTO != null) {
                                                dValueOf = Double.valueOf(userSettingsDTO.E2());
                                            } else {
                                                dValueOf = null;
                                            }
                                            userSettingsDTO2 = fVar.f144072p;
                                            if (userSettingsDTO2 != null) {
                                                dValueOf2 = Double.valueOf(userSettingsDTO2.I());
                                            } else {
                                                dValueOf2 = null;
                                            }
                                            if (dValueOf != null) {
                                                userSettingsDTO4 = fVar.f144072p;
                                                if (userSettingsDTO4 != null) {
                                                    dValueOf4 = Double.valueOf(userSettingsDTO4.E2());
                                                } else {
                                                    dValueOf4 = null;
                                                }
                                                weightGoalUserInputs.k(dValueOf4);
                                            }
                                            if (dValueOf2 != null) {
                                                userSettingsDTO3 = fVar.f144072p;
                                                if (userSettingsDTO3 != null) {
                                                    dValueOf3 = Double.valueOf(userSettingsDTO3.I());
                                                } else {
                                                    dValueOf3 = null;
                                                }
                                                weightGoalUserInputs.h(dValueOf3);
                                            }
                                            list = fVar.f144071o;
                                            if (list != null) {
                                                arrayList3 = fVar.f144069m;
                                                linkedHashSet = fVar.f144070n;
                                                if (!list.isEmpty()) {
                                                    arrayList3.clear();
                                                    linkedHashSet.clear();
                                                    while (r1.hasNext()) {
                                                        dueDate = mVar.getDueDate();
                                                        if (dueDate != null) {
                                                            arrayList3.add(dueDate);
                                                            deliveryDate = mVar.getDeliveryDate();
                                                            if (deliveryDate != null) {
                                                                linkedHashSet.add(deliveryDate);
                                                            } else {
                                                                endDate = mVar.getEndDate();
                                                                if (endDate != null) {
                                                                    linkedHashSet.add(endDate);
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                                Unit unit10 = Unit.INSTANCE;
                                            }
                                            arrayList2 = (ArrayList) pVar214.f128594a;
                                            fVar.f144074r = arrayList2;
                                            if (arrayList2 != null) {
                                                while (r1.hasNext()) {
                                                    ArrayList<bm2.c> arrayList13 = fVar.f144074r;
                                                    arrayList13.getClass();
                                                    it = arrayList13.iterator();
                                                    it.getClass();
                                                    while (it.hasNext()) {
                                                        bm2.c next10 = it.next();
                                                        next10.getClass();
                                                        str = u0Var2.f203860g;
                                                        u0Var = (u0) u0.f203782n6.get(next10.getF143517g());
                                                        if (u0Var != null) {
                                                            str2 = u0Var.f203860g;
                                                        } else {
                                                            str2 = null;
                                                        }
                                                        if (p005kotlin.jvm.internal.s.g(str, str2)) {
                                                            fVar.B = true;
                                                        }
                                                    }
                                                }
                                            }
                                            ((y0) fVar.f144059c.getValue()).j(tb1.d.b(new o13.p(a1112, a1113), null, null, tb1.d.a(arrayList), 6));
                                            return Unit.INSTANCE;
                                        }
                                    }
                                }
                            } else {
                                o13.p pVar215 = pVar5;
                                pVar9 = pVar7;
                                pVar10 = pVar8;
                                pVar11 = pVar6;
                                pVar12 = pVar215;
                                i0Var15 = i0Var12;
                                pVar13 = null;
                                if (i0Var15 != null) {
                                    this.f144142p = null;
                                    this.f144127a = null;
                                    this.f144128b = null;
                                    this.f144129c = null;
                                    this.f144130d = null;
                                    this.f144131e = i0Var13;
                                    this.f144132f = null;
                                    this.f144133g = null;
                                    this.f144134h = pVar11;
                                    this.f144135i = pVar12;
                                    this.f144136j = pVar9;
                                    this.f144137k = pVar10;
                                    this.f144138l = pVar13;
                                    this.f144140n = j8;
                                    this.f144141o = 7;
                                    objAwait6 = i0Var15.await(this);
                                    if (objAwait6 != aVar) {
                                        pVar15 = pVar11;
                                        pVar16 = pVar10;
                                        pVar17 = pVar13;
                                        pVar18 = (o13.p) objAwait6;
                                        long j114 = j8;
                                        pVar19 = pVar12;
                                        this.f144142p = null;
                                        this.f144127a = null;
                                        this.f144128b = null;
                                        this.f144129c = null;
                                        this.f144130d = null;
                                        this.f144131e = null;
                                        this.f144132f = null;
                                        this.f144133g = null;
                                        this.f144134h = pVar15;
                                        this.f144135i = pVar19;
                                        this.f144136j = pVar9;
                                        this.f144137k = pVar16;
                                        this.f144138l = pVar17;
                                        this.f144139m = pVar18;
                                        this.f144140n = j114;
                                        this.f144141o = 8;
                                        objAwait7 = i0Var13.await(this);
                                        if (objAwait7 != aVar) {
                                            pVar20 = pVar17;
                                            pVar21 = pVar16;
                                            pVar22 = pVar15;
                                            o13.p pVar216 = (o13.p) objAwait7;
                                            arrayList = new ArrayList();
                                            th3 = (Throwable) pVar19.f128595b;
                                            if (th3 != null) {
                                                arrayList.add(th3);
                                            }
                                            B b1114 = pVar9.f128595b;
                                            A a1114 = pVar9.f128594a;
                                            th4 = (Throwable) b1114;
                                            if (th4 != null) {
                                                arrayList.add(th4);
                                            }
                                            B b1115 = pVar21.f128595b;
                                            A a1115 = pVar21.f128594a;
                                            th5 = (Throwable) b1115;
                                            if (th5 != null) {
                                                arrayList.add(th5);
                                            }
                                            if (pVar20 != null) {
                                                arrayList.add(th9);
                                            }
                                            if (pVar18 != null) {
                                                arrayList.add(th8);
                                            }
                                            th6 = (Throwable) pVar22.f128595b;
                                            if (th6 != null) {
                                                arrayList.add(th6);
                                            }
                                            th7 = (Throwable) pVar216.f128595b;
                                            if (th7 != null) {
                                                arrayList.add(th7);
                                            }
                                            fVar.f144071o = (List) pVar22.f128594a;
                                            fVar.f144067k = (ww0.j) pVar19.f128594a;
                                            fVar.f144065i = (op0.c) a1114;
                                            fVar.f144072p = (UserSettingsDTO) a1115;
                                            if (pVar20 != null) {
                                                deviceSettingsDTO = (DeviceSettingsDTO) pVar20.f128594a;
                                            } else {
                                                deviceSettingsDTO = null;
                                            }
                                            fVar.f144066j = deviceSettingsDTO;
                                            if (pVar18 != null) {
                                                deviceSettingsDTO2 = (DeviceSettingsDTO) pVar18.f128594a;
                                            } else {
                                                deviceSettingsDTO2 = null;
                                            }
                                            fVar.f144068l = deviceSettingsDTO2;
                                            weightGoalUserInputs = fVar.C.getWeightGoalUserInputs();
                                            userSettingsDTO = fVar.f144072p;
                                            if (userSettingsDTO != null) {
                                                dValueOf = Double.valueOf(userSettingsDTO.E2());
                                            } else {
                                                dValueOf = null;
                                            }
                                            userSettingsDTO2 = fVar.f144072p;
                                            if (userSettingsDTO2 != null) {
                                                dValueOf2 = Double.valueOf(userSettingsDTO2.I());
                                            } else {
                                                dValueOf2 = null;
                                            }
                                            if (dValueOf != null) {
                                                userSettingsDTO4 = fVar.f144072p;
                                                if (userSettingsDTO4 != null) {
                                                    dValueOf4 = Double.valueOf(userSettingsDTO4.E2());
                                                } else {
                                                    dValueOf4 = null;
                                                }
                                                weightGoalUserInputs.k(dValueOf4);
                                            }
                                            if (dValueOf2 != null) {
                                                userSettingsDTO3 = fVar.f144072p;
                                                if (userSettingsDTO3 != null) {
                                                    dValueOf3 = Double.valueOf(userSettingsDTO3.I());
                                                } else {
                                                    dValueOf3 = null;
                                                }
                                                weightGoalUserInputs.h(dValueOf3);
                                            }
                                            list = fVar.f144071o;
                                            if (list != null) {
                                                arrayList3 = fVar.f144069m;
                                                linkedHashSet = fVar.f144070n;
                                                if (!list.isEmpty()) {
                                                    arrayList3.clear();
                                                    linkedHashSet.clear();
                                                    while (r1.hasNext()) {
                                                        dueDate = mVar.getDueDate();
                                                        if (dueDate != null) {
                                                            arrayList3.add(dueDate);
                                                            deliveryDate = mVar.getDeliveryDate();
                                                            if (deliveryDate != null) {
                                                                linkedHashSet.add(deliveryDate);
                                                            } else {
                                                                endDate = mVar.getEndDate();
                                                                if (endDate != null) {
                                                                    linkedHashSet.add(endDate);
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                                Unit unit11 = Unit.INSTANCE;
                                            }
                                            arrayList2 = (ArrayList) pVar216.f128594a;
                                            fVar.f144074r = arrayList2;
                                            if (arrayList2 != null) {
                                                while (r1.hasNext()) {
                                                    ArrayList<bm2.c> arrayList14 = fVar.f144074r;
                                                    arrayList14.getClass();
                                                    it = arrayList14.iterator();
                                                    it.getClass();
                                                    while (it.hasNext()) {
                                                        bm2.c next11 = it.next();
                                                        next11.getClass();
                                                        str = u0Var2.f203860g;
                                                        u0Var = (u0) u0.f203782n6.get(next11.getF143517g());
                                                        if (u0Var != null) {
                                                            str2 = u0Var.f203860g;
                                                        } else {
                                                            str2 = null;
                                                        }
                                                        if (p005kotlin.jvm.internal.s.g(str, str2)) {
                                                            fVar.B = true;
                                                        }
                                                    }
                                                }
                                            }
                                            ((y0) fVar.f144059c.getValue()).j(tb1.d.b(new o13.p(a1114, a1115), null, null, tb1.d.a(arrayList), 6));
                                            return Unit.INSTANCE;
                                        }
                                    }
                                } else {
                                    pVar15 = pVar11;
                                    pVar16 = pVar10;
                                    pVar17 = pVar13;
                                    pVar18 = null;
                                    long j115 = j8;
                                    pVar19 = pVar12;
                                    this.f144142p = null;
                                    this.f144127a = null;
                                    this.f144128b = null;
                                    this.f144129c = null;
                                    this.f144130d = null;
                                    this.f144131e = null;
                                    this.f144132f = null;
                                    this.f144133g = null;
                                    this.f144134h = pVar15;
                                    this.f144135i = pVar19;
                                    this.f144136j = pVar9;
                                    this.f144137k = pVar16;
                                    this.f144138l = pVar17;
                                    this.f144139m = pVar18;
                                    this.f144140n = j115;
                                    this.f144141o = 8;
                                    objAwait7 = i0Var13.await(this);
                                    if (objAwait7 != aVar) {
                                        pVar20 = pVar17;
                                        pVar21 = pVar16;
                                        pVar22 = pVar15;
                                        o13.p pVar217 = (o13.p) objAwait7;
                                        arrayList = new ArrayList();
                                        th3 = (Throwable) pVar19.f128595b;
                                        if (th3 != null) {
                                            arrayList.add(th3);
                                        }
                                        B b1116 = pVar9.f128595b;
                                        A a1116 = pVar9.f128594a;
                                        th4 = (Throwable) b1116;
                                        if (th4 != null) {
                                            arrayList.add(th4);
                                        }
                                        B b1117 = pVar21.f128595b;
                                        A a1117 = pVar21.f128594a;
                                        th5 = (Throwable) b1117;
                                        if (th5 != null) {
                                            arrayList.add(th5);
                                        }
                                        if (pVar20 != null) {
                                            arrayList.add(th9);
                                        }
                                        if (pVar18 != null) {
                                            arrayList.add(th8);
                                        }
                                        th6 = (Throwable) pVar22.f128595b;
                                        if (th6 != null) {
                                            arrayList.add(th6);
                                        }
                                        th7 = (Throwable) pVar217.f128595b;
                                        if (th7 != null) {
                                            arrayList.add(th7);
                                        }
                                        fVar.f144071o = (List) pVar22.f128594a;
                                        fVar.f144067k = (ww0.j) pVar19.f128594a;
                                        fVar.f144065i = (op0.c) a1116;
                                        fVar.f144072p = (UserSettingsDTO) a1117;
                                        if (pVar20 != null) {
                                            deviceSettingsDTO = (DeviceSettingsDTO) pVar20.f128594a;
                                        } else {
                                            deviceSettingsDTO = null;
                                        }
                                        fVar.f144066j = deviceSettingsDTO;
                                        if (pVar18 != null) {
                                            deviceSettingsDTO2 = (DeviceSettingsDTO) pVar18.f128594a;
                                        } else {
                                            deviceSettingsDTO2 = null;
                                        }
                                        fVar.f144068l = deviceSettingsDTO2;
                                        weightGoalUserInputs = fVar.C.getWeightGoalUserInputs();
                                        userSettingsDTO = fVar.f144072p;
                                        if (userSettingsDTO != null) {
                                            dValueOf = Double.valueOf(userSettingsDTO.E2());
                                        } else {
                                            dValueOf = null;
                                        }
                                        userSettingsDTO2 = fVar.f144072p;
                                        if (userSettingsDTO2 != null) {
                                            dValueOf2 = Double.valueOf(userSettingsDTO2.I());
                                        } else {
                                            dValueOf2 = null;
                                        }
                                        if (dValueOf != null) {
                                            userSettingsDTO4 = fVar.f144072p;
                                            if (userSettingsDTO4 != null) {
                                                dValueOf4 = Double.valueOf(userSettingsDTO4.E2());
                                            } else {
                                                dValueOf4 = null;
                                            }
                                            weightGoalUserInputs.k(dValueOf4);
                                        }
                                        if (dValueOf2 != null) {
                                            userSettingsDTO3 = fVar.f144072p;
                                            if (userSettingsDTO3 != null) {
                                                dValueOf3 = Double.valueOf(userSettingsDTO3.I());
                                            } else {
                                                dValueOf3 = null;
                                            }
                                            weightGoalUserInputs.h(dValueOf3);
                                        }
                                        list = fVar.f144071o;
                                        if (list != null) {
                                            arrayList3 = fVar.f144069m;
                                            linkedHashSet = fVar.f144070n;
                                            if (!list.isEmpty()) {
                                                arrayList3.clear();
                                                linkedHashSet.clear();
                                                while (r1.hasNext()) {
                                                    dueDate = mVar.getDueDate();
                                                    if (dueDate != null) {
                                                        arrayList3.add(dueDate);
                                                        deliveryDate = mVar.getDeliveryDate();
                                                        if (deliveryDate != null) {
                                                            linkedHashSet.add(deliveryDate);
                                                        } else {
                                                            endDate = mVar.getEndDate();
                                                            if (endDate != null) {
                                                                linkedHashSet.add(endDate);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            Unit unit12 = Unit.INSTANCE;
                                        }
                                        arrayList2 = (ArrayList) pVar217.f128594a;
                                        fVar.f144074r = arrayList2;
                                        if (arrayList2 != null) {
                                            while (r1.hasNext()) {
                                                ArrayList<bm2.c> arrayList15 = fVar.f144074r;
                                                arrayList15.getClass();
                                                it = arrayList15.iterator();
                                                it.getClass();
                                                while (it.hasNext()) {
                                                    bm2.c next12 = it.next();
                                                    next12.getClass();
                                                    str = u0Var2.f203860g;
                                                    u0Var = (u0) u0.f203782n6.get(next12.getF143517g());
                                                    if (u0Var != null) {
                                                        str2 = u0Var.f203860g;
                                                    } else {
                                                        str2 = null;
                                                    }
                                                    if (p005kotlin.jvm.internal.s.g(str, str2)) {
                                                        fVar.B = true;
                                                    }
                                                }
                                            }
                                        }
                                        ((y0) fVar.f144059c.getValue()).j(tb1.d.b(new o13.p(a1116, a1117), null, null, tb1.d.a(arrayList), 6));
                                        return Unit.INSTANCE;
                                    }
                                }
                            }
                        }
                    }
                }
                return aVar;
            case 3:
                j8 = this.f144140n;
                o13.p pVar30 = this.f144134h;
                i0 i0Var20 = this.f144133g;
                i0Var5 = this.f144132f;
                i0Var2 = this.f144131e;
                i0Var3 = this.f144130d;
                i0Var6 = this.f144129c;
                o13.r.b(obj);
                pVar = pVar30;
                i0VarJ6 = i0Var20;
                objAwait2 = obj;
                i0Var7 = i0Var3;
                i0Var8 = i0Var2;
                pVar2 = (o13.p) objAwait2;
                this.f144142p = null;
                this.f144127a = null;
                this.f144128b = null;
                this.f144129c = null;
                this.f144130d = i0Var7;
                this.f144131e = i0Var8;
                this.f144132f = i0Var5;
                this.f144133g = i0VarJ6;
                this.f144134h = pVar;
                this.f144135i = pVar2;
                this.f144140n = j8;
                this.f144141o = 4;
                objAwait3 = i0Var6.await(this);
                if (objAwait3 != aVar) {
                    i0Var9 = i0Var7;
                    i0Var10 = i0Var5;
                    i0Var11 = i0VarJ6;
                    pVar3 = pVar2;
                    pVar4 = (o13.p) objAwait3;
                    this.f144142p = null;
                    this.f144127a = null;
                    this.f144128b = null;
                    this.f144129c = null;
                    this.f144130d = null;
                    this.f144131e = i0Var8;
                    this.f144132f = i0Var10;
                    this.f144133g = i0Var11;
                    this.f144134h = pVar;
                    this.f144135i = pVar3;
                    this.f144136j = pVar4;
                    this.f144140n = j8;
                    this.f144141o = 5;
                    objAwait4 = i0Var9.await(this);
                    if (objAwait4 != aVar) {
                        i0 i0Var111 = i0Var11;
                        pVar5 = pVar3;
                        i0Var12 = i0Var111;
                        pVar6 = pVar;
                        pVar7 = pVar4;
                        i0Var13 = i0Var8;
                        i0Var14 = i0Var10;
                        pVar8 = (o13.p) objAwait4;
                        if (i0Var14 != null) {
                            this.f144142p = null;
                            this.f144127a = null;
                            this.f144128b = null;
                            this.f144129c = null;
                            this.f144130d = null;
                            this.f144131e = i0Var13;
                            this.f144132f = null;
                            this.f144133g = i0Var12;
                            this.f144134h = pVar6;
                            this.f144135i = pVar5;
                            this.f144136j = pVar7;
                            this.f144137k = pVar8;
                            this.f144140n = j8;
                            this.f144141o = 6;
                            objAwait5 = i0Var14.await(this);
                            if (objAwait5 != aVar) {
                                i0Var15 = i0Var12;
                                pVar14 = pVar8;
                                pVar11 = pVar6;
                                pVar12 = pVar5;
                                pVar9 = pVar7;
                                pVar10 = pVar14;
                                pVar13 = (o13.p) objAwait5;
                                if (i0Var15 != null) {
                                    this.f144142p = null;
                                    this.f144127a = null;
                                    this.f144128b = null;
                                    this.f144129c = null;
                                    this.f144130d = null;
                                    this.f144131e = i0Var13;
                                    this.f144132f = null;
                                    this.f144133g = null;
                                    this.f144134h = pVar11;
                                    this.f144135i = pVar12;
                                    this.f144136j = pVar9;
                                    this.f144137k = pVar10;
                                    this.f144138l = pVar13;
                                    this.f144140n = j8;
                                    this.f144141o = 7;
                                    objAwait6 = i0Var15.await(this);
                                    if (objAwait6 != aVar) {
                                        pVar15 = pVar11;
                                        pVar16 = pVar10;
                                        pVar17 = pVar13;
                                        pVar18 = (o13.p) objAwait6;
                                        long j116 = j8;
                                        pVar19 = pVar12;
                                        this.f144142p = null;
                                        this.f144127a = null;
                                        this.f144128b = null;
                                        this.f144129c = null;
                                        this.f144130d = null;
                                        this.f144131e = null;
                                        this.f144132f = null;
                                        this.f144133g = null;
                                        this.f144134h = pVar15;
                                        this.f144135i = pVar19;
                                        this.f144136j = pVar9;
                                        this.f144137k = pVar16;
                                        this.f144138l = pVar17;
                                        this.f144139m = pVar18;
                                        this.f144140n = j116;
                                        this.f144141o = 8;
                                        objAwait7 = i0Var13.await(this);
                                        if (objAwait7 != aVar) {
                                            pVar20 = pVar17;
                                            pVar21 = pVar16;
                                            pVar22 = pVar15;
                                            o13.p pVar218 = (o13.p) objAwait7;
                                            arrayList = new ArrayList();
                                            th3 = (Throwable) pVar19.f128595b;
                                            if (th3 != null) {
                                                arrayList.add(th3);
                                            }
                                            B b1118 = pVar9.f128595b;
                                            A a1118 = pVar9.f128594a;
                                            th4 = (Throwable) b1118;
                                            if (th4 != null) {
                                                arrayList.add(th4);
                                            }
                                            B b1119 = pVar21.f128595b;
                                            A a1119 = pVar21.f128594a;
                                            th5 = (Throwable) b1119;
                                            if (th5 != null) {
                                                arrayList.add(th5);
                                            }
                                            if (pVar20 != null) {
                                                arrayList.add(th9);
                                            }
                                            if (pVar18 != null) {
                                                arrayList.add(th8);
                                            }
                                            th6 = (Throwable) pVar22.f128595b;
                                            if (th6 != null) {
                                                arrayList.add(th6);
                                            }
                                            th7 = (Throwable) pVar218.f128595b;
                                            if (th7 != null) {
                                                arrayList.add(th7);
                                            }
                                            fVar.f144071o = (List) pVar22.f128594a;
                                            fVar.f144067k = (ww0.j) pVar19.f128594a;
                                            fVar.f144065i = (op0.c) a1118;
                                            fVar.f144072p = (UserSettingsDTO) a1119;
                                            if (pVar20 != null) {
                                                deviceSettingsDTO = (DeviceSettingsDTO) pVar20.f128594a;
                                            } else {
                                                deviceSettingsDTO = null;
                                            }
                                            fVar.f144066j = deviceSettingsDTO;
                                            if (pVar18 != null) {
                                                deviceSettingsDTO2 = (DeviceSettingsDTO) pVar18.f128594a;
                                            } else {
                                                deviceSettingsDTO2 = null;
                                            }
                                            fVar.f144068l = deviceSettingsDTO2;
                                            weightGoalUserInputs = fVar.C.getWeightGoalUserInputs();
                                            userSettingsDTO = fVar.f144072p;
                                            if (userSettingsDTO != null) {
                                                dValueOf = Double.valueOf(userSettingsDTO.E2());
                                            } else {
                                                dValueOf = null;
                                            }
                                            userSettingsDTO2 = fVar.f144072p;
                                            if (userSettingsDTO2 != null) {
                                                dValueOf2 = Double.valueOf(userSettingsDTO2.I());
                                            } else {
                                                dValueOf2 = null;
                                            }
                                            if (dValueOf != null) {
                                                userSettingsDTO4 = fVar.f144072p;
                                                if (userSettingsDTO4 != null) {
                                                    dValueOf4 = Double.valueOf(userSettingsDTO4.E2());
                                                } else {
                                                    dValueOf4 = null;
                                                }
                                                weightGoalUserInputs.k(dValueOf4);
                                            }
                                            if (dValueOf2 != null) {
                                                userSettingsDTO3 = fVar.f144072p;
                                                if (userSettingsDTO3 != null) {
                                                    dValueOf3 = Double.valueOf(userSettingsDTO3.I());
                                                } else {
                                                    dValueOf3 = null;
                                                }
                                                weightGoalUserInputs.h(dValueOf3);
                                            }
                                            list = fVar.f144071o;
                                            if (list != null) {
                                                arrayList3 = fVar.f144069m;
                                                linkedHashSet = fVar.f144070n;
                                                if (!list.isEmpty()) {
                                                    arrayList3.clear();
                                                    linkedHashSet.clear();
                                                    while (r1.hasNext()) {
                                                        dueDate = mVar.getDueDate();
                                                        if (dueDate != null) {
                                                            arrayList3.add(dueDate);
                                                            deliveryDate = mVar.getDeliveryDate();
                                                            if (deliveryDate != null) {
                                                                linkedHashSet.add(deliveryDate);
                                                            } else {
                                                                endDate = mVar.getEndDate();
                                                                if (endDate != null) {
                                                                    linkedHashSet.add(endDate);
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                                Unit unit13 = Unit.INSTANCE;
                                            }
                                            arrayList2 = (ArrayList) pVar218.f128594a;
                                            fVar.f144074r = arrayList2;
                                            if (arrayList2 != null) {
                                                while (r1.hasNext()) {
                                                    ArrayList<bm2.c> arrayList16 = fVar.f144074r;
                                                    arrayList16.getClass();
                                                    it = arrayList16.iterator();
                                                    it.getClass();
                                                    while (it.hasNext()) {
                                                        bm2.c next13 = it.next();
                                                        next13.getClass();
                                                        str = u0Var2.f203860g;
                                                        u0Var = (u0) u0.f203782n6.get(next13.getF143517g());
                                                        if (u0Var != null) {
                                                            str2 = u0Var.f203860g;
                                                        } else {
                                                            str2 = null;
                                                        }
                                                        if (p005kotlin.jvm.internal.s.g(str, str2)) {
                                                            fVar.B = true;
                                                        }
                                                    }
                                                }
                                            }
                                            ((y0) fVar.f144059c.getValue()).j(tb1.d.b(new o13.p(a1118, a1119), null, null, tb1.d.a(arrayList), 6));
                                            return Unit.INSTANCE;
                                        }
                                    }
                                } else {
                                    pVar15 = pVar11;
                                    pVar16 = pVar10;
                                    pVar17 = pVar13;
                                    pVar18 = null;
                                    long j117 = j8;
                                    pVar19 = pVar12;
                                    this.f144142p = null;
                                    this.f144127a = null;
                                    this.f144128b = null;
                                    this.f144129c = null;
                                    this.f144130d = null;
                                    this.f144131e = null;
                                    this.f144132f = null;
                                    this.f144133g = null;
                                    this.f144134h = pVar15;
                                    this.f144135i = pVar19;
                                    this.f144136j = pVar9;
                                    this.f144137k = pVar16;
                                    this.f144138l = pVar17;
                                    this.f144139m = pVar18;
                                    this.f144140n = j117;
                                    this.f144141o = 8;
                                    objAwait7 = i0Var13.await(this);
                                    if (objAwait7 != aVar) {
                                        pVar20 = pVar17;
                                        pVar21 = pVar16;
                                        pVar22 = pVar15;
                                        o13.p pVar219 = (o13.p) objAwait7;
                                        arrayList = new ArrayList();
                                        th3 = (Throwable) pVar19.f128595b;
                                        if (th3 != null) {
                                            arrayList.add(th3);
                                        }
                                        B b11110 = pVar9.f128595b;
                                        A a11110 = pVar9.f128594a;
                                        th4 = (Throwable) b11110;
                                        if (th4 != null) {
                                            arrayList.add(th4);
                                        }
                                        B b11111 = pVar21.f128595b;
                                        A a11111 = pVar21.f128594a;
                                        th5 = (Throwable) b11111;
                                        if (th5 != null) {
                                            arrayList.add(th5);
                                        }
                                        if (pVar20 != null) {
                                            arrayList.add(th9);
                                        }
                                        if (pVar18 != null) {
                                            arrayList.add(th8);
                                        }
                                        th6 = (Throwable) pVar22.f128595b;
                                        if (th6 != null) {
                                            arrayList.add(th6);
                                        }
                                        th7 = (Throwable) pVar219.f128595b;
                                        if (th7 != null) {
                                            arrayList.add(th7);
                                        }
                                        fVar.f144071o = (List) pVar22.f128594a;
                                        fVar.f144067k = (ww0.j) pVar19.f128594a;
                                        fVar.f144065i = (op0.c) a11110;
                                        fVar.f144072p = (UserSettingsDTO) a11111;
                                        if (pVar20 != null) {
                                            deviceSettingsDTO = (DeviceSettingsDTO) pVar20.f128594a;
                                        } else {
                                            deviceSettingsDTO = null;
                                        }
                                        fVar.f144066j = deviceSettingsDTO;
                                        if (pVar18 != null) {
                                            deviceSettingsDTO2 = (DeviceSettingsDTO) pVar18.f128594a;
                                        } else {
                                            deviceSettingsDTO2 = null;
                                        }
                                        fVar.f144068l = deviceSettingsDTO2;
                                        weightGoalUserInputs = fVar.C.getWeightGoalUserInputs();
                                        userSettingsDTO = fVar.f144072p;
                                        if (userSettingsDTO != null) {
                                            dValueOf = Double.valueOf(userSettingsDTO.E2());
                                        } else {
                                            dValueOf = null;
                                        }
                                        userSettingsDTO2 = fVar.f144072p;
                                        if (userSettingsDTO2 != null) {
                                            dValueOf2 = Double.valueOf(userSettingsDTO2.I());
                                        } else {
                                            dValueOf2 = null;
                                        }
                                        if (dValueOf != null) {
                                            userSettingsDTO4 = fVar.f144072p;
                                            if (userSettingsDTO4 != null) {
                                                dValueOf4 = Double.valueOf(userSettingsDTO4.E2());
                                            } else {
                                                dValueOf4 = null;
                                            }
                                            weightGoalUserInputs.k(dValueOf4);
                                        }
                                        if (dValueOf2 != null) {
                                            userSettingsDTO3 = fVar.f144072p;
                                            if (userSettingsDTO3 != null) {
                                                dValueOf3 = Double.valueOf(userSettingsDTO3.I());
                                            } else {
                                                dValueOf3 = null;
                                            }
                                            weightGoalUserInputs.h(dValueOf3);
                                        }
                                        list = fVar.f144071o;
                                        if (list != null) {
                                            arrayList3 = fVar.f144069m;
                                            linkedHashSet = fVar.f144070n;
                                            if (!list.isEmpty()) {
                                                arrayList3.clear();
                                                linkedHashSet.clear();
                                                while (r1.hasNext()) {
                                                    dueDate = mVar.getDueDate();
                                                    if (dueDate != null) {
                                                        arrayList3.add(dueDate);
                                                        deliveryDate = mVar.getDeliveryDate();
                                                        if (deliveryDate != null) {
                                                            linkedHashSet.add(deliveryDate);
                                                        } else {
                                                            endDate = mVar.getEndDate();
                                                            if (endDate != null) {
                                                                linkedHashSet.add(endDate);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            Unit unit14 = Unit.INSTANCE;
                                        }
                                        arrayList2 = (ArrayList) pVar219.f128594a;
                                        fVar.f144074r = arrayList2;
                                        if (arrayList2 != null) {
                                            while (r1.hasNext()) {
                                                ArrayList<bm2.c> arrayList17 = fVar.f144074r;
                                                arrayList17.getClass();
                                                it = arrayList17.iterator();
                                                it.getClass();
                                                while (it.hasNext()) {
                                                    bm2.c next14 = it.next();
                                                    next14.getClass();
                                                    str = u0Var2.f203860g;
                                                    u0Var = (u0) u0.f203782n6.get(next14.getF143517g());
                                                    if (u0Var != null) {
                                                        str2 = u0Var.f203860g;
                                                    } else {
                                                        str2 = null;
                                                    }
                                                    if (p005kotlin.jvm.internal.s.g(str, str2)) {
                                                        fVar.B = true;
                                                    }
                                                }
                                            }
                                        }
                                        ((y0) fVar.f144059c.getValue()).j(tb1.d.b(new o13.p(a11110, a11111), null, null, tb1.d.a(arrayList), 6));
                                        return Unit.INSTANCE;
                                    }
                                }
                            }
                        } else {
                            o13.p pVar2110 = pVar5;
                            pVar9 = pVar7;
                            pVar10 = pVar8;
                            pVar11 = pVar6;
                            pVar12 = pVar2110;
                            i0Var15 = i0Var12;
                            pVar13 = null;
                            if (i0Var15 != null) {
                                this.f144142p = null;
                                this.f144127a = null;
                                this.f144128b = null;
                                this.f144129c = null;
                                this.f144130d = null;
                                this.f144131e = i0Var13;
                                this.f144132f = null;
                                this.f144133g = null;
                                this.f144134h = pVar11;
                                this.f144135i = pVar12;
                                this.f144136j = pVar9;
                                this.f144137k = pVar10;
                                this.f144138l = pVar13;
                                this.f144140n = j8;
                                this.f144141o = 7;
                                objAwait6 = i0Var15.await(this);
                                if (objAwait6 != aVar) {
                                    pVar15 = pVar11;
                                    pVar16 = pVar10;
                                    pVar17 = pVar13;
                                    pVar18 = (o13.p) objAwait6;
                                    long j118 = j8;
                                    pVar19 = pVar12;
                                    this.f144142p = null;
                                    this.f144127a = null;
                                    this.f144128b = null;
                                    this.f144129c = null;
                                    this.f144130d = null;
                                    this.f144131e = null;
                                    this.f144132f = null;
                                    this.f144133g = null;
                                    this.f144134h = pVar15;
                                    this.f144135i = pVar19;
                                    this.f144136j = pVar9;
                                    this.f144137k = pVar16;
                                    this.f144138l = pVar17;
                                    this.f144139m = pVar18;
                                    this.f144140n = j118;
                                    this.f144141o = 8;
                                    objAwait7 = i0Var13.await(this);
                                    if (objAwait7 != aVar) {
                                        pVar20 = pVar17;
                                        pVar21 = pVar16;
                                        pVar22 = pVar15;
                                        o13.p pVar2111 = (o13.p) objAwait7;
                                        arrayList = new ArrayList();
                                        th3 = (Throwable) pVar19.f128595b;
                                        if (th3 != null) {
                                            arrayList.add(th3);
                                        }
                                        B b11112 = pVar9.f128595b;
                                        A a11112 = pVar9.f128594a;
                                        th4 = (Throwable) b11112;
                                        if (th4 != null) {
                                            arrayList.add(th4);
                                        }
                                        B b11113 = pVar21.f128595b;
                                        A a11113 = pVar21.f128594a;
                                        th5 = (Throwable) b11113;
                                        if (th5 != null) {
                                            arrayList.add(th5);
                                        }
                                        if (pVar20 != null) {
                                            arrayList.add(th9);
                                        }
                                        if (pVar18 != null) {
                                            arrayList.add(th8);
                                        }
                                        th6 = (Throwable) pVar22.f128595b;
                                        if (th6 != null) {
                                            arrayList.add(th6);
                                        }
                                        th7 = (Throwable) pVar2111.f128595b;
                                        if (th7 != null) {
                                            arrayList.add(th7);
                                        }
                                        fVar.f144071o = (List) pVar22.f128594a;
                                        fVar.f144067k = (ww0.j) pVar19.f128594a;
                                        fVar.f144065i = (op0.c) a11112;
                                        fVar.f144072p = (UserSettingsDTO) a11113;
                                        if (pVar20 != null) {
                                            deviceSettingsDTO = (DeviceSettingsDTO) pVar20.f128594a;
                                        } else {
                                            deviceSettingsDTO = null;
                                        }
                                        fVar.f144066j = deviceSettingsDTO;
                                        if (pVar18 != null) {
                                            deviceSettingsDTO2 = (DeviceSettingsDTO) pVar18.f128594a;
                                        } else {
                                            deviceSettingsDTO2 = null;
                                        }
                                        fVar.f144068l = deviceSettingsDTO2;
                                        weightGoalUserInputs = fVar.C.getWeightGoalUserInputs();
                                        userSettingsDTO = fVar.f144072p;
                                        if (userSettingsDTO != null) {
                                            dValueOf = Double.valueOf(userSettingsDTO.E2());
                                        } else {
                                            dValueOf = null;
                                        }
                                        userSettingsDTO2 = fVar.f144072p;
                                        if (userSettingsDTO2 != null) {
                                            dValueOf2 = Double.valueOf(userSettingsDTO2.I());
                                        } else {
                                            dValueOf2 = null;
                                        }
                                        if (dValueOf != null) {
                                            userSettingsDTO4 = fVar.f144072p;
                                            if (userSettingsDTO4 != null) {
                                                dValueOf4 = Double.valueOf(userSettingsDTO4.E2());
                                            } else {
                                                dValueOf4 = null;
                                            }
                                            weightGoalUserInputs.k(dValueOf4);
                                        }
                                        if (dValueOf2 != null) {
                                            userSettingsDTO3 = fVar.f144072p;
                                            if (userSettingsDTO3 != null) {
                                                dValueOf3 = Double.valueOf(userSettingsDTO3.I());
                                            } else {
                                                dValueOf3 = null;
                                            }
                                            weightGoalUserInputs.h(dValueOf3);
                                        }
                                        list = fVar.f144071o;
                                        if (list != null) {
                                            arrayList3 = fVar.f144069m;
                                            linkedHashSet = fVar.f144070n;
                                            if (!list.isEmpty()) {
                                                arrayList3.clear();
                                                linkedHashSet.clear();
                                                while (r1.hasNext()) {
                                                    dueDate = mVar.getDueDate();
                                                    if (dueDate != null) {
                                                        arrayList3.add(dueDate);
                                                        deliveryDate = mVar.getDeliveryDate();
                                                        if (deliveryDate != null) {
                                                            linkedHashSet.add(deliveryDate);
                                                        } else {
                                                            endDate = mVar.getEndDate();
                                                            if (endDate != null) {
                                                                linkedHashSet.add(endDate);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            Unit unit15 = Unit.INSTANCE;
                                        }
                                        arrayList2 = (ArrayList) pVar2111.f128594a;
                                        fVar.f144074r = arrayList2;
                                        if (arrayList2 != null) {
                                            while (r1.hasNext()) {
                                                ArrayList<bm2.c> arrayList18 = fVar.f144074r;
                                                arrayList18.getClass();
                                                it = arrayList18.iterator();
                                                it.getClass();
                                                while (it.hasNext()) {
                                                    bm2.c next15 = it.next();
                                                    next15.getClass();
                                                    str = u0Var2.f203860g;
                                                    u0Var = (u0) u0.f203782n6.get(next15.getF143517g());
                                                    if (u0Var != null) {
                                                        str2 = u0Var.f203860g;
                                                    } else {
                                                        str2 = null;
                                                    }
                                                    if (p005kotlin.jvm.internal.s.g(str, str2)) {
                                                        fVar.B = true;
                                                    }
                                                }
                                            }
                                        }
                                        ((y0) fVar.f144059c.getValue()).j(tb1.d.b(new o13.p(a11112, a11113), null, null, tb1.d.a(arrayList), 6));
                                        return Unit.INSTANCE;
                                    }
                                }
                            } else {
                                pVar15 = pVar11;
                                pVar16 = pVar10;
                                pVar17 = pVar13;
                                pVar18 = null;
                                long j119 = j8;
                                pVar19 = pVar12;
                                this.f144142p = null;
                                this.f144127a = null;
                                this.f144128b = null;
                                this.f144129c = null;
                                this.f144130d = null;
                                this.f144131e = null;
                                this.f144132f = null;
                                this.f144133g = null;
                                this.f144134h = pVar15;
                                this.f144135i = pVar19;
                                this.f144136j = pVar9;
                                this.f144137k = pVar16;
                                this.f144138l = pVar17;
                                this.f144139m = pVar18;
                                this.f144140n = j119;
                                this.f144141o = 8;
                                objAwait7 = i0Var13.await(this);
                                if (objAwait7 != aVar) {
                                    pVar20 = pVar17;
                                    pVar21 = pVar16;
                                    pVar22 = pVar15;
                                    o13.p pVar2112 = (o13.p) objAwait7;
                                    arrayList = new ArrayList();
                                    th3 = (Throwable) pVar19.f128595b;
                                    if (th3 != null) {
                                        arrayList.add(th3);
                                    }
                                    B b11114 = pVar9.f128595b;
                                    A a11114 = pVar9.f128594a;
                                    th4 = (Throwable) b11114;
                                    if (th4 != null) {
                                        arrayList.add(th4);
                                    }
                                    B b11115 = pVar21.f128595b;
                                    A a11115 = pVar21.f128594a;
                                    th5 = (Throwable) b11115;
                                    if (th5 != null) {
                                        arrayList.add(th5);
                                    }
                                    if (pVar20 != null) {
                                        arrayList.add(th9);
                                    }
                                    if (pVar18 != null) {
                                        arrayList.add(th8);
                                    }
                                    th6 = (Throwable) pVar22.f128595b;
                                    if (th6 != null) {
                                        arrayList.add(th6);
                                    }
                                    th7 = (Throwable) pVar2112.f128595b;
                                    if (th7 != null) {
                                        arrayList.add(th7);
                                    }
                                    fVar.f144071o = (List) pVar22.f128594a;
                                    fVar.f144067k = (ww0.j) pVar19.f128594a;
                                    fVar.f144065i = (op0.c) a11114;
                                    fVar.f144072p = (UserSettingsDTO) a11115;
                                    if (pVar20 != null) {
                                        deviceSettingsDTO = (DeviceSettingsDTO) pVar20.f128594a;
                                    } else {
                                        deviceSettingsDTO = null;
                                    }
                                    fVar.f144066j = deviceSettingsDTO;
                                    if (pVar18 != null) {
                                        deviceSettingsDTO2 = (DeviceSettingsDTO) pVar18.f128594a;
                                    } else {
                                        deviceSettingsDTO2 = null;
                                    }
                                    fVar.f144068l = deviceSettingsDTO2;
                                    weightGoalUserInputs = fVar.C.getWeightGoalUserInputs();
                                    userSettingsDTO = fVar.f144072p;
                                    if (userSettingsDTO != null) {
                                        dValueOf = Double.valueOf(userSettingsDTO.E2());
                                    } else {
                                        dValueOf = null;
                                    }
                                    userSettingsDTO2 = fVar.f144072p;
                                    if (userSettingsDTO2 != null) {
                                        dValueOf2 = Double.valueOf(userSettingsDTO2.I());
                                    } else {
                                        dValueOf2 = null;
                                    }
                                    if (dValueOf != null) {
                                        userSettingsDTO4 = fVar.f144072p;
                                        if (userSettingsDTO4 != null) {
                                            dValueOf4 = Double.valueOf(userSettingsDTO4.E2());
                                        } else {
                                            dValueOf4 = null;
                                        }
                                        weightGoalUserInputs.k(dValueOf4);
                                    }
                                    if (dValueOf2 != null) {
                                        userSettingsDTO3 = fVar.f144072p;
                                        if (userSettingsDTO3 != null) {
                                            dValueOf3 = Double.valueOf(userSettingsDTO3.I());
                                        } else {
                                            dValueOf3 = null;
                                        }
                                        weightGoalUserInputs.h(dValueOf3);
                                    }
                                    list = fVar.f144071o;
                                    if (list != null) {
                                        arrayList3 = fVar.f144069m;
                                        linkedHashSet = fVar.f144070n;
                                        if (!list.isEmpty()) {
                                            arrayList3.clear();
                                            linkedHashSet.clear();
                                            while (r1.hasNext()) {
                                                dueDate = mVar.getDueDate();
                                                if (dueDate != null) {
                                                    arrayList3.add(dueDate);
                                                    deliveryDate = mVar.getDeliveryDate();
                                                    if (deliveryDate != null) {
                                                        linkedHashSet.add(deliveryDate);
                                                    } else {
                                                        endDate = mVar.getEndDate();
                                                        if (endDate != null) {
                                                            linkedHashSet.add(endDate);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        Unit unit16 = Unit.INSTANCE;
                                    }
                                    arrayList2 = (ArrayList) pVar2112.f128594a;
                                    fVar.f144074r = arrayList2;
                                    if (arrayList2 != null) {
                                        while (r1.hasNext()) {
                                            ArrayList<bm2.c> arrayList19 = fVar.f144074r;
                                            arrayList19.getClass();
                                            it = arrayList19.iterator();
                                            it.getClass();
                                            while (it.hasNext()) {
                                                bm2.c next16 = it.next();
                                                next16.getClass();
                                                str = u0Var2.f203860g;
                                                u0Var = (u0) u0.f203782n6.get(next16.getF143517g());
                                                if (u0Var != null) {
                                                    str2 = u0Var.f203860g;
                                                } else {
                                                    str2 = null;
                                                }
                                                if (p005kotlin.jvm.internal.s.g(str, str2)) {
                                                    fVar.B = true;
                                                }
                                            }
                                        }
                                    }
                                    ((y0) fVar.f144059c.getValue()).j(tb1.d.b(new o13.p(a11114, a11115), null, null, tb1.d.a(arrayList), 6));
                                    return Unit.INSTANCE;
                                }
                            }
                        }
                    }
                }
                return aVar;
            case 4:
                j8 = this.f144140n;
                pVar3 = this.f144135i;
                pVar = this.f144134h;
                i0Var11 = this.f144133g;
                i0 i0Var21 = this.f144132f;
                i0Var8 = this.f144131e;
                i0Var9 = this.f144130d;
                o13.r.b(obj);
                i0Var10 = i0Var21;
                objAwait3 = obj;
                pVar4 = (o13.p) objAwait3;
                this.f144142p = null;
                this.f144127a = null;
                this.f144128b = null;
                this.f144129c = null;
                this.f144130d = null;
                this.f144131e = i0Var8;
                this.f144132f = i0Var10;
                this.f144133g = i0Var11;
                this.f144134h = pVar;
                this.f144135i = pVar3;
                this.f144136j = pVar4;
                this.f144140n = j8;
                this.f144141o = 5;
                objAwait4 = i0Var9.await(this);
                if (objAwait4 != aVar) {
                    i0 i0Var112 = i0Var11;
                    pVar5 = pVar3;
                    i0Var12 = i0Var112;
                    pVar6 = pVar;
                    pVar7 = pVar4;
                    i0Var13 = i0Var8;
                    i0Var14 = i0Var10;
                    pVar8 = (o13.p) objAwait4;
                    if (i0Var14 != null) {
                        this.f144142p = null;
                        this.f144127a = null;
                        this.f144128b = null;
                        this.f144129c = null;
                        this.f144130d = null;
                        this.f144131e = i0Var13;
                        this.f144132f = null;
                        this.f144133g = i0Var12;
                        this.f144134h = pVar6;
                        this.f144135i = pVar5;
                        this.f144136j = pVar7;
                        this.f144137k = pVar8;
                        this.f144140n = j8;
                        this.f144141o = 6;
                        objAwait5 = i0Var14.await(this);
                        if (objAwait5 != aVar) {
                            i0Var15 = i0Var12;
                            pVar14 = pVar8;
                            pVar11 = pVar6;
                            pVar12 = pVar5;
                            pVar9 = pVar7;
                            pVar10 = pVar14;
                            pVar13 = (o13.p) objAwait5;
                            if (i0Var15 != null) {
                                this.f144142p = null;
                                this.f144127a = null;
                                this.f144128b = null;
                                this.f144129c = null;
                                this.f144130d = null;
                                this.f144131e = i0Var13;
                                this.f144132f = null;
                                this.f144133g = null;
                                this.f144134h = pVar11;
                                this.f144135i = pVar12;
                                this.f144136j = pVar9;
                                this.f144137k = pVar10;
                                this.f144138l = pVar13;
                                this.f144140n = j8;
                                this.f144141o = 7;
                                objAwait6 = i0Var15.await(this);
                                if (objAwait6 != aVar) {
                                    pVar15 = pVar11;
                                    pVar16 = pVar10;
                                    pVar17 = pVar13;
                                    pVar18 = (o13.p) objAwait6;
                                    long j1110 = j8;
                                    pVar19 = pVar12;
                                    this.f144142p = null;
                                    this.f144127a = null;
                                    this.f144128b = null;
                                    this.f144129c = null;
                                    this.f144130d = null;
                                    this.f144131e = null;
                                    this.f144132f = null;
                                    this.f144133g = null;
                                    this.f144134h = pVar15;
                                    this.f144135i = pVar19;
                                    this.f144136j = pVar9;
                                    this.f144137k = pVar16;
                                    this.f144138l = pVar17;
                                    this.f144139m = pVar18;
                                    this.f144140n = j1110;
                                    this.f144141o = 8;
                                    objAwait7 = i0Var13.await(this);
                                    if (objAwait7 != aVar) {
                                        pVar20 = pVar17;
                                        pVar21 = pVar16;
                                        pVar22 = pVar15;
                                        o13.p pVar2113 = (o13.p) objAwait7;
                                        arrayList = new ArrayList();
                                        th3 = (Throwable) pVar19.f128595b;
                                        if (th3 != null) {
                                            arrayList.add(th3);
                                        }
                                        B b11116 = pVar9.f128595b;
                                        A a11116 = pVar9.f128594a;
                                        th4 = (Throwable) b11116;
                                        if (th4 != null) {
                                            arrayList.add(th4);
                                        }
                                        B b11117 = pVar21.f128595b;
                                        A a11117 = pVar21.f128594a;
                                        th5 = (Throwable) b11117;
                                        if (th5 != null) {
                                            arrayList.add(th5);
                                        }
                                        if (pVar20 != null) {
                                            arrayList.add(th9);
                                        }
                                        if (pVar18 != null) {
                                            arrayList.add(th8);
                                        }
                                        th6 = (Throwable) pVar22.f128595b;
                                        if (th6 != null) {
                                            arrayList.add(th6);
                                        }
                                        th7 = (Throwable) pVar2113.f128595b;
                                        if (th7 != null) {
                                            arrayList.add(th7);
                                        }
                                        fVar.f144071o = (List) pVar22.f128594a;
                                        fVar.f144067k = (ww0.j) pVar19.f128594a;
                                        fVar.f144065i = (op0.c) a11116;
                                        fVar.f144072p = (UserSettingsDTO) a11117;
                                        if (pVar20 != null) {
                                            deviceSettingsDTO = (DeviceSettingsDTO) pVar20.f128594a;
                                        } else {
                                            deviceSettingsDTO = null;
                                        }
                                        fVar.f144066j = deviceSettingsDTO;
                                        if (pVar18 != null) {
                                            deviceSettingsDTO2 = (DeviceSettingsDTO) pVar18.f128594a;
                                        } else {
                                            deviceSettingsDTO2 = null;
                                        }
                                        fVar.f144068l = deviceSettingsDTO2;
                                        weightGoalUserInputs = fVar.C.getWeightGoalUserInputs();
                                        userSettingsDTO = fVar.f144072p;
                                        if (userSettingsDTO != null) {
                                            dValueOf = Double.valueOf(userSettingsDTO.E2());
                                        } else {
                                            dValueOf = null;
                                        }
                                        userSettingsDTO2 = fVar.f144072p;
                                        if (userSettingsDTO2 != null) {
                                            dValueOf2 = Double.valueOf(userSettingsDTO2.I());
                                        } else {
                                            dValueOf2 = null;
                                        }
                                        if (dValueOf != null) {
                                            userSettingsDTO4 = fVar.f144072p;
                                            if (userSettingsDTO4 != null) {
                                                dValueOf4 = Double.valueOf(userSettingsDTO4.E2());
                                            } else {
                                                dValueOf4 = null;
                                            }
                                            weightGoalUserInputs.k(dValueOf4);
                                        }
                                        if (dValueOf2 != null) {
                                            userSettingsDTO3 = fVar.f144072p;
                                            if (userSettingsDTO3 != null) {
                                                dValueOf3 = Double.valueOf(userSettingsDTO3.I());
                                            } else {
                                                dValueOf3 = null;
                                            }
                                            weightGoalUserInputs.h(dValueOf3);
                                        }
                                        list = fVar.f144071o;
                                        if (list != null) {
                                            arrayList3 = fVar.f144069m;
                                            linkedHashSet = fVar.f144070n;
                                            if (!list.isEmpty()) {
                                                arrayList3.clear();
                                                linkedHashSet.clear();
                                                while (r1.hasNext()) {
                                                    dueDate = mVar.getDueDate();
                                                    if (dueDate != null) {
                                                        arrayList3.add(dueDate);
                                                        deliveryDate = mVar.getDeliveryDate();
                                                        if (deliveryDate != null) {
                                                            linkedHashSet.add(deliveryDate);
                                                        } else {
                                                            endDate = mVar.getEndDate();
                                                            if (endDate != null) {
                                                                linkedHashSet.add(endDate);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            Unit unit17 = Unit.INSTANCE;
                                        }
                                        arrayList2 = (ArrayList) pVar2113.f128594a;
                                        fVar.f144074r = arrayList2;
                                        if (arrayList2 != null) {
                                            while (r1.hasNext()) {
                                                ArrayList<bm2.c> arrayList110 = fVar.f144074r;
                                                arrayList110.getClass();
                                                it = arrayList110.iterator();
                                                it.getClass();
                                                while (it.hasNext()) {
                                                    bm2.c next17 = it.next();
                                                    next17.getClass();
                                                    str = u0Var2.f203860g;
                                                    u0Var = (u0) u0.f203782n6.get(next17.getF143517g());
                                                    if (u0Var != null) {
                                                        str2 = u0Var.f203860g;
                                                    } else {
                                                        str2 = null;
                                                    }
                                                    if (p005kotlin.jvm.internal.s.g(str, str2)) {
                                                        fVar.B = true;
                                                    }
                                                }
                                            }
                                        }
                                        ((y0) fVar.f144059c.getValue()).j(tb1.d.b(new o13.p(a11116, a11117), null, null, tb1.d.a(arrayList), 6));
                                        return Unit.INSTANCE;
                                    }
                                }
                            } else {
                                pVar15 = pVar11;
                                pVar16 = pVar10;
                                pVar17 = pVar13;
                                pVar18 = null;
                                long j1111 = j8;
                                pVar19 = pVar12;
                                this.f144142p = null;
                                this.f144127a = null;
                                this.f144128b = null;
                                this.f144129c = null;
                                this.f144130d = null;
                                this.f144131e = null;
                                this.f144132f = null;
                                this.f144133g = null;
                                this.f144134h = pVar15;
                                this.f144135i = pVar19;
                                this.f144136j = pVar9;
                                this.f144137k = pVar16;
                                this.f144138l = pVar17;
                                this.f144139m = pVar18;
                                this.f144140n = j1111;
                                this.f144141o = 8;
                                objAwait7 = i0Var13.await(this);
                                if (objAwait7 != aVar) {
                                    pVar20 = pVar17;
                                    pVar21 = pVar16;
                                    pVar22 = pVar15;
                                    o13.p pVar2114 = (o13.p) objAwait7;
                                    arrayList = new ArrayList();
                                    th3 = (Throwable) pVar19.f128595b;
                                    if (th3 != null) {
                                        arrayList.add(th3);
                                    }
                                    B b11118 = pVar9.f128595b;
                                    A a11118 = pVar9.f128594a;
                                    th4 = (Throwable) b11118;
                                    if (th4 != null) {
                                        arrayList.add(th4);
                                    }
                                    B b11119 = pVar21.f128595b;
                                    A a11119 = pVar21.f128594a;
                                    th5 = (Throwable) b11119;
                                    if (th5 != null) {
                                        arrayList.add(th5);
                                    }
                                    if (pVar20 != null) {
                                        arrayList.add(th9);
                                    }
                                    if (pVar18 != null) {
                                        arrayList.add(th8);
                                    }
                                    th6 = (Throwable) pVar22.f128595b;
                                    if (th6 != null) {
                                        arrayList.add(th6);
                                    }
                                    th7 = (Throwable) pVar2114.f128595b;
                                    if (th7 != null) {
                                        arrayList.add(th7);
                                    }
                                    fVar.f144071o = (List) pVar22.f128594a;
                                    fVar.f144067k = (ww0.j) pVar19.f128594a;
                                    fVar.f144065i = (op0.c) a11118;
                                    fVar.f144072p = (UserSettingsDTO) a11119;
                                    if (pVar20 != null) {
                                        deviceSettingsDTO = (DeviceSettingsDTO) pVar20.f128594a;
                                    } else {
                                        deviceSettingsDTO = null;
                                    }
                                    fVar.f144066j = deviceSettingsDTO;
                                    if (pVar18 != null) {
                                        deviceSettingsDTO2 = (DeviceSettingsDTO) pVar18.f128594a;
                                    } else {
                                        deviceSettingsDTO2 = null;
                                    }
                                    fVar.f144068l = deviceSettingsDTO2;
                                    weightGoalUserInputs = fVar.C.getWeightGoalUserInputs();
                                    userSettingsDTO = fVar.f144072p;
                                    if (userSettingsDTO != null) {
                                        dValueOf = Double.valueOf(userSettingsDTO.E2());
                                    } else {
                                        dValueOf = null;
                                    }
                                    userSettingsDTO2 = fVar.f144072p;
                                    if (userSettingsDTO2 != null) {
                                        dValueOf2 = Double.valueOf(userSettingsDTO2.I());
                                    } else {
                                        dValueOf2 = null;
                                    }
                                    if (dValueOf != null) {
                                        userSettingsDTO4 = fVar.f144072p;
                                        if (userSettingsDTO4 != null) {
                                            dValueOf4 = Double.valueOf(userSettingsDTO4.E2());
                                        } else {
                                            dValueOf4 = null;
                                        }
                                        weightGoalUserInputs.k(dValueOf4);
                                    }
                                    if (dValueOf2 != null) {
                                        userSettingsDTO3 = fVar.f144072p;
                                        if (userSettingsDTO3 != null) {
                                            dValueOf3 = Double.valueOf(userSettingsDTO3.I());
                                        } else {
                                            dValueOf3 = null;
                                        }
                                        weightGoalUserInputs.h(dValueOf3);
                                    }
                                    list = fVar.f144071o;
                                    if (list != null) {
                                        arrayList3 = fVar.f144069m;
                                        linkedHashSet = fVar.f144070n;
                                        if (!list.isEmpty()) {
                                            arrayList3.clear();
                                            linkedHashSet.clear();
                                            while (r1.hasNext()) {
                                                dueDate = mVar.getDueDate();
                                                if (dueDate != null) {
                                                    arrayList3.add(dueDate);
                                                    deliveryDate = mVar.getDeliveryDate();
                                                    if (deliveryDate != null) {
                                                        linkedHashSet.add(deliveryDate);
                                                    } else {
                                                        endDate = mVar.getEndDate();
                                                        if (endDate != null) {
                                                            linkedHashSet.add(endDate);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        Unit unit18 = Unit.INSTANCE;
                                    }
                                    arrayList2 = (ArrayList) pVar2114.f128594a;
                                    fVar.f144074r = arrayList2;
                                    if (arrayList2 != null) {
                                        while (r1.hasNext()) {
                                            ArrayList<bm2.c> arrayList111 = fVar.f144074r;
                                            arrayList111.getClass();
                                            it = arrayList111.iterator();
                                            it.getClass();
                                            while (it.hasNext()) {
                                                bm2.c next18 = it.next();
                                                next18.getClass();
                                                str = u0Var2.f203860g;
                                                u0Var = (u0) u0.f203782n6.get(next18.getF143517g());
                                                if (u0Var != null) {
                                                    str2 = u0Var.f203860g;
                                                } else {
                                                    str2 = null;
                                                }
                                                if (p005kotlin.jvm.internal.s.g(str, str2)) {
                                                    fVar.B = true;
                                                }
                                            }
                                        }
                                    }
                                    ((y0) fVar.f144059c.getValue()).j(tb1.d.b(new o13.p(a11118, a11119), null, null, tb1.d.a(arrayList), 6));
                                    return Unit.INSTANCE;
                                }
                            }
                        }
                    } else {
                        o13.p pVar2115 = pVar5;
                        pVar9 = pVar7;
                        pVar10 = pVar8;
                        pVar11 = pVar6;
                        pVar12 = pVar2115;
                        i0Var15 = i0Var12;
                        pVar13 = null;
                        if (i0Var15 != null) {
                            this.f144142p = null;
                            this.f144127a = null;
                            this.f144128b = null;
                            this.f144129c = null;
                            this.f144130d = null;
                            this.f144131e = i0Var13;
                            this.f144132f = null;
                            this.f144133g = null;
                            this.f144134h = pVar11;
                            this.f144135i = pVar12;
                            this.f144136j = pVar9;
                            this.f144137k = pVar10;
                            this.f144138l = pVar13;
                            this.f144140n = j8;
                            this.f144141o = 7;
                            objAwait6 = i0Var15.await(this);
                            if (objAwait6 != aVar) {
                                pVar15 = pVar11;
                                pVar16 = pVar10;
                                pVar17 = pVar13;
                                pVar18 = (o13.p) objAwait6;
                                long j1112 = j8;
                                pVar19 = pVar12;
                                this.f144142p = null;
                                this.f144127a = null;
                                this.f144128b = null;
                                this.f144129c = null;
                                this.f144130d = null;
                                this.f144131e = null;
                                this.f144132f = null;
                                this.f144133g = null;
                                this.f144134h = pVar15;
                                this.f144135i = pVar19;
                                this.f144136j = pVar9;
                                this.f144137k = pVar16;
                                this.f144138l = pVar17;
                                this.f144139m = pVar18;
                                this.f144140n = j1112;
                                this.f144141o = 8;
                                objAwait7 = i0Var13.await(this);
                                if (objAwait7 != aVar) {
                                    pVar20 = pVar17;
                                    pVar21 = pVar16;
                                    pVar22 = pVar15;
                                    o13.p pVar2116 = (o13.p) objAwait7;
                                    arrayList = new ArrayList();
                                    th3 = (Throwable) pVar19.f128595b;
                                    if (th3 != null) {
                                        arrayList.add(th3);
                                    }
                                    B b111110 = pVar9.f128595b;
                                    A a111110 = pVar9.f128594a;
                                    th4 = (Throwable) b111110;
                                    if (th4 != null) {
                                        arrayList.add(th4);
                                    }
                                    B b111111 = pVar21.f128595b;
                                    A a111111 = pVar21.f128594a;
                                    th5 = (Throwable) b111111;
                                    if (th5 != null) {
                                        arrayList.add(th5);
                                    }
                                    if (pVar20 != null) {
                                        arrayList.add(th9);
                                    }
                                    if (pVar18 != null) {
                                        arrayList.add(th8);
                                    }
                                    th6 = (Throwable) pVar22.f128595b;
                                    if (th6 != null) {
                                        arrayList.add(th6);
                                    }
                                    th7 = (Throwable) pVar2116.f128595b;
                                    if (th7 != null) {
                                        arrayList.add(th7);
                                    }
                                    fVar.f144071o = (List) pVar22.f128594a;
                                    fVar.f144067k = (ww0.j) pVar19.f128594a;
                                    fVar.f144065i = (op0.c) a111110;
                                    fVar.f144072p = (UserSettingsDTO) a111111;
                                    if (pVar20 != null) {
                                        deviceSettingsDTO = (DeviceSettingsDTO) pVar20.f128594a;
                                    } else {
                                        deviceSettingsDTO = null;
                                    }
                                    fVar.f144066j = deviceSettingsDTO;
                                    if (pVar18 != null) {
                                        deviceSettingsDTO2 = (DeviceSettingsDTO) pVar18.f128594a;
                                    } else {
                                        deviceSettingsDTO2 = null;
                                    }
                                    fVar.f144068l = deviceSettingsDTO2;
                                    weightGoalUserInputs = fVar.C.getWeightGoalUserInputs();
                                    userSettingsDTO = fVar.f144072p;
                                    if (userSettingsDTO != null) {
                                        dValueOf = Double.valueOf(userSettingsDTO.E2());
                                    } else {
                                        dValueOf = null;
                                    }
                                    userSettingsDTO2 = fVar.f144072p;
                                    if (userSettingsDTO2 != null) {
                                        dValueOf2 = Double.valueOf(userSettingsDTO2.I());
                                    } else {
                                        dValueOf2 = null;
                                    }
                                    if (dValueOf != null) {
                                        userSettingsDTO4 = fVar.f144072p;
                                        if (userSettingsDTO4 != null) {
                                            dValueOf4 = Double.valueOf(userSettingsDTO4.E2());
                                        } else {
                                            dValueOf4 = null;
                                        }
                                        weightGoalUserInputs.k(dValueOf4);
                                    }
                                    if (dValueOf2 != null) {
                                        userSettingsDTO3 = fVar.f144072p;
                                        if (userSettingsDTO3 != null) {
                                            dValueOf3 = Double.valueOf(userSettingsDTO3.I());
                                        } else {
                                            dValueOf3 = null;
                                        }
                                        weightGoalUserInputs.h(dValueOf3);
                                    }
                                    list = fVar.f144071o;
                                    if (list != null) {
                                        arrayList3 = fVar.f144069m;
                                        linkedHashSet = fVar.f144070n;
                                        if (!list.isEmpty()) {
                                            arrayList3.clear();
                                            linkedHashSet.clear();
                                            while (r1.hasNext()) {
                                                dueDate = mVar.getDueDate();
                                                if (dueDate != null) {
                                                    arrayList3.add(dueDate);
                                                    deliveryDate = mVar.getDeliveryDate();
                                                    if (deliveryDate != null) {
                                                        linkedHashSet.add(deliveryDate);
                                                    } else {
                                                        endDate = mVar.getEndDate();
                                                        if (endDate != null) {
                                                            linkedHashSet.add(endDate);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        Unit unit19 = Unit.INSTANCE;
                                    }
                                    arrayList2 = (ArrayList) pVar2116.f128594a;
                                    fVar.f144074r = arrayList2;
                                    if (arrayList2 != null) {
                                        while (r1.hasNext()) {
                                            ArrayList<bm2.c> arrayList112 = fVar.f144074r;
                                            arrayList112.getClass();
                                            it = arrayList112.iterator();
                                            it.getClass();
                                            while (it.hasNext()) {
                                                bm2.c next19 = it.next();
                                                next19.getClass();
                                                str = u0Var2.f203860g;
                                                u0Var = (u0) u0.f203782n6.get(next19.getF143517g());
                                                if (u0Var != null) {
                                                    str2 = u0Var.f203860g;
                                                } else {
                                                    str2 = null;
                                                }
                                                if (p005kotlin.jvm.internal.s.g(str, str2)) {
                                                    fVar.B = true;
                                                }
                                            }
                                        }
                                    }
                                    ((y0) fVar.f144059c.getValue()).j(tb1.d.b(new o13.p(a111110, a111111), null, null, tb1.d.a(arrayList), 6));
                                    return Unit.INSTANCE;
                                }
                            }
                        } else {
                            pVar15 = pVar11;
                            pVar16 = pVar10;
                            pVar17 = pVar13;
                            pVar18 = null;
                            long j1113 = j8;
                            pVar19 = pVar12;
                            this.f144142p = null;
                            this.f144127a = null;
                            this.f144128b = null;
                            this.f144129c = null;
                            this.f144130d = null;
                            this.f144131e = null;
                            this.f144132f = null;
                            this.f144133g = null;
                            this.f144134h = pVar15;
                            this.f144135i = pVar19;
                            this.f144136j = pVar9;
                            this.f144137k = pVar16;
                            this.f144138l = pVar17;
                            this.f144139m = pVar18;
                            this.f144140n = j1113;
                            this.f144141o = 8;
                            objAwait7 = i0Var13.await(this);
                            if (objAwait7 != aVar) {
                                pVar20 = pVar17;
                                pVar21 = pVar16;
                                pVar22 = pVar15;
                                o13.p pVar2117 = (o13.p) objAwait7;
                                arrayList = new ArrayList();
                                th3 = (Throwable) pVar19.f128595b;
                                if (th3 != null) {
                                    arrayList.add(th3);
                                }
                                B b111112 = pVar9.f128595b;
                                A a111112 = pVar9.f128594a;
                                th4 = (Throwable) b111112;
                                if (th4 != null) {
                                    arrayList.add(th4);
                                }
                                B b111113 = pVar21.f128595b;
                                A a111113 = pVar21.f128594a;
                                th5 = (Throwable) b111113;
                                if (th5 != null) {
                                    arrayList.add(th5);
                                }
                                if (pVar20 != null) {
                                    arrayList.add(th9);
                                }
                                if (pVar18 != null) {
                                    arrayList.add(th8);
                                }
                                th6 = (Throwable) pVar22.f128595b;
                                if (th6 != null) {
                                    arrayList.add(th6);
                                }
                                th7 = (Throwable) pVar2117.f128595b;
                                if (th7 != null) {
                                    arrayList.add(th7);
                                }
                                fVar.f144071o = (List) pVar22.f128594a;
                                fVar.f144067k = (ww0.j) pVar19.f128594a;
                                fVar.f144065i = (op0.c) a111112;
                                fVar.f144072p = (UserSettingsDTO) a111113;
                                if (pVar20 != null) {
                                    deviceSettingsDTO = (DeviceSettingsDTO) pVar20.f128594a;
                                } else {
                                    deviceSettingsDTO = null;
                                }
                                fVar.f144066j = deviceSettingsDTO;
                                if (pVar18 != null) {
                                    deviceSettingsDTO2 = (DeviceSettingsDTO) pVar18.f128594a;
                                } else {
                                    deviceSettingsDTO2 = null;
                                }
                                fVar.f144068l = deviceSettingsDTO2;
                                weightGoalUserInputs = fVar.C.getWeightGoalUserInputs();
                                userSettingsDTO = fVar.f144072p;
                                if (userSettingsDTO != null) {
                                    dValueOf = Double.valueOf(userSettingsDTO.E2());
                                } else {
                                    dValueOf = null;
                                }
                                userSettingsDTO2 = fVar.f144072p;
                                if (userSettingsDTO2 != null) {
                                    dValueOf2 = Double.valueOf(userSettingsDTO2.I());
                                } else {
                                    dValueOf2 = null;
                                }
                                if (dValueOf != null) {
                                    userSettingsDTO4 = fVar.f144072p;
                                    if (userSettingsDTO4 != null) {
                                        dValueOf4 = Double.valueOf(userSettingsDTO4.E2());
                                    } else {
                                        dValueOf4 = null;
                                    }
                                    weightGoalUserInputs.k(dValueOf4);
                                }
                                if (dValueOf2 != null) {
                                    userSettingsDTO3 = fVar.f144072p;
                                    if (userSettingsDTO3 != null) {
                                        dValueOf3 = Double.valueOf(userSettingsDTO3.I());
                                    } else {
                                        dValueOf3 = null;
                                    }
                                    weightGoalUserInputs.h(dValueOf3);
                                }
                                list = fVar.f144071o;
                                if (list != null) {
                                    arrayList3 = fVar.f144069m;
                                    linkedHashSet = fVar.f144070n;
                                    if (!list.isEmpty()) {
                                        arrayList3.clear();
                                        linkedHashSet.clear();
                                        while (r1.hasNext()) {
                                            dueDate = mVar.getDueDate();
                                            if (dueDate != null) {
                                                arrayList3.add(dueDate);
                                                deliveryDate = mVar.getDeliveryDate();
                                                if (deliveryDate != null) {
                                                    linkedHashSet.add(deliveryDate);
                                                } else {
                                                    endDate = mVar.getEndDate();
                                                    if (endDate != null) {
                                                        linkedHashSet.add(endDate);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    Unit unit110 = Unit.INSTANCE;
                                }
                                arrayList2 = (ArrayList) pVar2117.f128594a;
                                fVar.f144074r = arrayList2;
                                if (arrayList2 != null) {
                                    while (r1.hasNext()) {
                                        ArrayList<bm2.c> arrayList113 = fVar.f144074r;
                                        arrayList113.getClass();
                                        it = arrayList113.iterator();
                                        it.getClass();
                                        while (it.hasNext()) {
                                            bm2.c next110 = it.next();
                                            next110.getClass();
                                            str = u0Var2.f203860g;
                                            u0Var = (u0) u0.f203782n6.get(next110.getF143517g());
                                            if (u0Var != null) {
                                                str2 = u0Var.f203860g;
                                            } else {
                                                str2 = null;
                                            }
                                            if (p005kotlin.jvm.internal.s.g(str, str2)) {
                                                fVar.B = true;
                                            }
                                        }
                                    }
                                }
                                ((y0) fVar.f144059c.getValue()).j(tb1.d.b(new o13.p(a111112, a111113), null, null, tb1.d.a(arrayList), 6));
                                return Unit.INSTANCE;
                            }
                        }
                    }
                }
                return aVar;
            case 5:
                j8 = this.f144140n;
                o13.p pVar31 = this.f144136j;
                o13.p pVar32 = this.f144135i;
                o13.p pVar33 = this.f144134h;
                i0 i0Var22 = this.f144133g;
                i0Var14 = this.f144132f;
                i0Var13 = this.f144131e;
                o13.r.b(obj);
                pVar7 = pVar31;
                i0Var12 = i0Var22;
                pVar6 = pVar33;
                pVar5 = pVar32;
                objAwait4 = obj;
                pVar8 = (o13.p) objAwait4;
                if (i0Var14 != null) {
                    this.f144142p = null;
                    this.f144127a = null;
                    this.f144128b = null;
                    this.f144129c = null;
                    this.f144130d = null;
                    this.f144131e = i0Var13;
                    this.f144132f = null;
                    this.f144133g = i0Var12;
                    this.f144134h = pVar6;
                    this.f144135i = pVar5;
                    this.f144136j = pVar7;
                    this.f144137k = pVar8;
                    this.f144140n = j8;
                    this.f144141o = 6;
                    objAwait5 = i0Var14.await(this);
                    if (objAwait5 != aVar) {
                        i0Var15 = i0Var12;
                        pVar14 = pVar8;
                        pVar11 = pVar6;
                        pVar12 = pVar5;
                        pVar9 = pVar7;
                        pVar10 = pVar14;
                        pVar13 = (o13.p) objAwait5;
                        if (i0Var15 != null) {
                            this.f144142p = null;
                            this.f144127a = null;
                            this.f144128b = null;
                            this.f144129c = null;
                            this.f144130d = null;
                            this.f144131e = i0Var13;
                            this.f144132f = null;
                            this.f144133g = null;
                            this.f144134h = pVar11;
                            this.f144135i = pVar12;
                            this.f144136j = pVar9;
                            this.f144137k = pVar10;
                            this.f144138l = pVar13;
                            this.f144140n = j8;
                            this.f144141o = 7;
                            objAwait6 = i0Var15.await(this);
                            if (objAwait6 != aVar) {
                                pVar15 = pVar11;
                                pVar16 = pVar10;
                                pVar17 = pVar13;
                                pVar18 = (o13.p) objAwait6;
                                long j1114 = j8;
                                pVar19 = pVar12;
                                this.f144142p = null;
                                this.f144127a = null;
                                this.f144128b = null;
                                this.f144129c = null;
                                this.f144130d = null;
                                this.f144131e = null;
                                this.f144132f = null;
                                this.f144133g = null;
                                this.f144134h = pVar15;
                                this.f144135i = pVar19;
                                this.f144136j = pVar9;
                                this.f144137k = pVar16;
                                this.f144138l = pVar17;
                                this.f144139m = pVar18;
                                this.f144140n = j1114;
                                this.f144141o = 8;
                                objAwait7 = i0Var13.await(this);
                                if (objAwait7 != aVar) {
                                    pVar20 = pVar17;
                                    pVar21 = pVar16;
                                    pVar22 = pVar15;
                                    o13.p pVar2118 = (o13.p) objAwait7;
                                    arrayList = new ArrayList();
                                    th3 = (Throwable) pVar19.f128595b;
                                    if (th3 != null) {
                                        arrayList.add(th3);
                                    }
                                    B b111114 = pVar9.f128595b;
                                    A a111114 = pVar9.f128594a;
                                    th4 = (Throwable) b111114;
                                    if (th4 != null) {
                                        arrayList.add(th4);
                                    }
                                    B b111115 = pVar21.f128595b;
                                    A a111115 = pVar21.f128594a;
                                    th5 = (Throwable) b111115;
                                    if (th5 != null) {
                                        arrayList.add(th5);
                                    }
                                    if (pVar20 != null) {
                                        arrayList.add(th9);
                                    }
                                    if (pVar18 != null) {
                                        arrayList.add(th8);
                                    }
                                    th6 = (Throwable) pVar22.f128595b;
                                    if (th6 != null) {
                                        arrayList.add(th6);
                                    }
                                    th7 = (Throwable) pVar2118.f128595b;
                                    if (th7 != null) {
                                        arrayList.add(th7);
                                    }
                                    fVar.f144071o = (List) pVar22.f128594a;
                                    fVar.f144067k = (ww0.j) pVar19.f128594a;
                                    fVar.f144065i = (op0.c) a111114;
                                    fVar.f144072p = (UserSettingsDTO) a111115;
                                    if (pVar20 != null) {
                                        deviceSettingsDTO = (DeviceSettingsDTO) pVar20.f128594a;
                                    } else {
                                        deviceSettingsDTO = null;
                                    }
                                    fVar.f144066j = deviceSettingsDTO;
                                    if (pVar18 != null) {
                                        deviceSettingsDTO2 = (DeviceSettingsDTO) pVar18.f128594a;
                                    } else {
                                        deviceSettingsDTO2 = null;
                                    }
                                    fVar.f144068l = deviceSettingsDTO2;
                                    weightGoalUserInputs = fVar.C.getWeightGoalUserInputs();
                                    userSettingsDTO = fVar.f144072p;
                                    if (userSettingsDTO != null) {
                                        dValueOf = Double.valueOf(userSettingsDTO.E2());
                                    } else {
                                        dValueOf = null;
                                    }
                                    userSettingsDTO2 = fVar.f144072p;
                                    if (userSettingsDTO2 != null) {
                                        dValueOf2 = Double.valueOf(userSettingsDTO2.I());
                                    } else {
                                        dValueOf2 = null;
                                    }
                                    if (dValueOf != null) {
                                        userSettingsDTO4 = fVar.f144072p;
                                        if (userSettingsDTO4 != null) {
                                            dValueOf4 = Double.valueOf(userSettingsDTO4.E2());
                                        } else {
                                            dValueOf4 = null;
                                        }
                                        weightGoalUserInputs.k(dValueOf4);
                                    }
                                    if (dValueOf2 != null) {
                                        userSettingsDTO3 = fVar.f144072p;
                                        if (userSettingsDTO3 != null) {
                                            dValueOf3 = Double.valueOf(userSettingsDTO3.I());
                                        } else {
                                            dValueOf3 = null;
                                        }
                                        weightGoalUserInputs.h(dValueOf3);
                                    }
                                    list = fVar.f144071o;
                                    if (list != null) {
                                        arrayList3 = fVar.f144069m;
                                        linkedHashSet = fVar.f144070n;
                                        if (!list.isEmpty()) {
                                            arrayList3.clear();
                                            linkedHashSet.clear();
                                            while (r1.hasNext()) {
                                                dueDate = mVar.getDueDate();
                                                if (dueDate != null) {
                                                    arrayList3.add(dueDate);
                                                    deliveryDate = mVar.getDeliveryDate();
                                                    if (deliveryDate != null) {
                                                        linkedHashSet.add(deliveryDate);
                                                    } else {
                                                        endDate = mVar.getEndDate();
                                                        if (endDate != null) {
                                                            linkedHashSet.add(endDate);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        Unit unit111 = Unit.INSTANCE;
                                    }
                                    arrayList2 = (ArrayList) pVar2118.f128594a;
                                    fVar.f144074r = arrayList2;
                                    if (arrayList2 != null) {
                                        while (r1.hasNext()) {
                                            ArrayList<bm2.c> arrayList114 = fVar.f144074r;
                                            arrayList114.getClass();
                                            it = arrayList114.iterator();
                                            it.getClass();
                                            while (it.hasNext()) {
                                                bm2.c next111 = it.next();
                                                next111.getClass();
                                                str = u0Var2.f203860g;
                                                u0Var = (u0) u0.f203782n6.get(next111.getF143517g());
                                                if (u0Var != null) {
                                                    str2 = u0Var.f203860g;
                                                } else {
                                                    str2 = null;
                                                }
                                                if (p005kotlin.jvm.internal.s.g(str, str2)) {
                                                    fVar.B = true;
                                                }
                                            }
                                        }
                                    }
                                    ((y0) fVar.f144059c.getValue()).j(tb1.d.b(new o13.p(a111114, a111115), null, null, tb1.d.a(arrayList), 6));
                                    return Unit.INSTANCE;
                                }
                            }
                        } else {
                            pVar15 = pVar11;
                            pVar16 = pVar10;
                            pVar17 = pVar13;
                            pVar18 = null;
                            long j1115 = j8;
                            pVar19 = pVar12;
                            this.f144142p = null;
                            this.f144127a = null;
                            this.f144128b = null;
                            this.f144129c = null;
                            this.f144130d = null;
                            this.f144131e = null;
                            this.f144132f = null;
                            this.f144133g = null;
                            this.f144134h = pVar15;
                            this.f144135i = pVar19;
                            this.f144136j = pVar9;
                            this.f144137k = pVar16;
                            this.f144138l = pVar17;
                            this.f144139m = pVar18;
                            this.f144140n = j1115;
                            this.f144141o = 8;
                            objAwait7 = i0Var13.await(this);
                            if (objAwait7 != aVar) {
                                pVar20 = pVar17;
                                pVar21 = pVar16;
                                pVar22 = pVar15;
                                o13.p pVar2119 = (o13.p) objAwait7;
                                arrayList = new ArrayList();
                                th3 = (Throwable) pVar19.f128595b;
                                if (th3 != null) {
                                    arrayList.add(th3);
                                }
                                B b111116 = pVar9.f128595b;
                                A a111116 = pVar9.f128594a;
                                th4 = (Throwable) b111116;
                                if (th4 != null) {
                                    arrayList.add(th4);
                                }
                                B b111117 = pVar21.f128595b;
                                A a111117 = pVar21.f128594a;
                                th5 = (Throwable) b111117;
                                if (th5 != null) {
                                    arrayList.add(th5);
                                }
                                if (pVar20 != null) {
                                    arrayList.add(th9);
                                }
                                if (pVar18 != null) {
                                    arrayList.add(th8);
                                }
                                th6 = (Throwable) pVar22.f128595b;
                                if (th6 != null) {
                                    arrayList.add(th6);
                                }
                                th7 = (Throwable) pVar2119.f128595b;
                                if (th7 != null) {
                                    arrayList.add(th7);
                                }
                                fVar.f144071o = (List) pVar22.f128594a;
                                fVar.f144067k = (ww0.j) pVar19.f128594a;
                                fVar.f144065i = (op0.c) a111116;
                                fVar.f144072p = (UserSettingsDTO) a111117;
                                if (pVar20 != null) {
                                    deviceSettingsDTO = (DeviceSettingsDTO) pVar20.f128594a;
                                } else {
                                    deviceSettingsDTO = null;
                                }
                                fVar.f144066j = deviceSettingsDTO;
                                if (pVar18 != null) {
                                    deviceSettingsDTO2 = (DeviceSettingsDTO) pVar18.f128594a;
                                } else {
                                    deviceSettingsDTO2 = null;
                                }
                                fVar.f144068l = deviceSettingsDTO2;
                                weightGoalUserInputs = fVar.C.getWeightGoalUserInputs();
                                userSettingsDTO = fVar.f144072p;
                                if (userSettingsDTO != null) {
                                    dValueOf = Double.valueOf(userSettingsDTO.E2());
                                } else {
                                    dValueOf = null;
                                }
                                userSettingsDTO2 = fVar.f144072p;
                                if (userSettingsDTO2 != null) {
                                    dValueOf2 = Double.valueOf(userSettingsDTO2.I());
                                } else {
                                    dValueOf2 = null;
                                }
                                if (dValueOf != null) {
                                    userSettingsDTO4 = fVar.f144072p;
                                    if (userSettingsDTO4 != null) {
                                        dValueOf4 = Double.valueOf(userSettingsDTO4.E2());
                                    } else {
                                        dValueOf4 = null;
                                    }
                                    weightGoalUserInputs.k(dValueOf4);
                                }
                                if (dValueOf2 != null) {
                                    userSettingsDTO3 = fVar.f144072p;
                                    if (userSettingsDTO3 != null) {
                                        dValueOf3 = Double.valueOf(userSettingsDTO3.I());
                                    } else {
                                        dValueOf3 = null;
                                    }
                                    weightGoalUserInputs.h(dValueOf3);
                                }
                                list = fVar.f144071o;
                                if (list != null) {
                                    arrayList3 = fVar.f144069m;
                                    linkedHashSet = fVar.f144070n;
                                    if (!list.isEmpty()) {
                                        arrayList3.clear();
                                        linkedHashSet.clear();
                                        while (r1.hasNext()) {
                                            dueDate = mVar.getDueDate();
                                            if (dueDate != null) {
                                                arrayList3.add(dueDate);
                                                deliveryDate = mVar.getDeliveryDate();
                                                if (deliveryDate != null) {
                                                    linkedHashSet.add(deliveryDate);
                                                } else {
                                                    endDate = mVar.getEndDate();
                                                    if (endDate != null) {
                                                        linkedHashSet.add(endDate);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    Unit unit112 = Unit.INSTANCE;
                                }
                                arrayList2 = (ArrayList) pVar2119.f128594a;
                                fVar.f144074r = arrayList2;
                                if (arrayList2 != null) {
                                    while (r1.hasNext()) {
                                        ArrayList<bm2.c> arrayList115 = fVar.f144074r;
                                        arrayList115.getClass();
                                        it = arrayList115.iterator();
                                        it.getClass();
                                        while (it.hasNext()) {
                                            bm2.c next112 = it.next();
                                            next112.getClass();
                                            str = u0Var2.f203860g;
                                            u0Var = (u0) u0.f203782n6.get(next112.getF143517g());
                                            if (u0Var != null) {
                                                str2 = u0Var.f203860g;
                                            } else {
                                                str2 = null;
                                            }
                                            if (p005kotlin.jvm.internal.s.g(str, str2)) {
                                                fVar.B = true;
                                            }
                                        }
                                    }
                                }
                                ((y0) fVar.f144059c.getValue()).j(tb1.d.b(new o13.p(a111116, a111117), null, null, tb1.d.a(arrayList), 6));
                                return Unit.INSTANCE;
                            }
                        }
                    }
                } else {
                    o13.p pVar21110 = pVar5;
                    pVar9 = pVar7;
                    pVar10 = pVar8;
                    pVar11 = pVar6;
                    pVar12 = pVar21110;
                    i0Var15 = i0Var12;
                    pVar13 = null;
                    if (i0Var15 != null) {
                        this.f144142p = null;
                        this.f144127a = null;
                        this.f144128b = null;
                        this.f144129c = null;
                        this.f144130d = null;
                        this.f144131e = i0Var13;
                        this.f144132f = null;
                        this.f144133g = null;
                        this.f144134h = pVar11;
                        this.f144135i = pVar12;
                        this.f144136j = pVar9;
                        this.f144137k = pVar10;
                        this.f144138l = pVar13;
                        this.f144140n = j8;
                        this.f144141o = 7;
                        objAwait6 = i0Var15.await(this);
                        if (objAwait6 != aVar) {
                            pVar15 = pVar11;
                            pVar16 = pVar10;
                            pVar17 = pVar13;
                            pVar18 = (o13.p) objAwait6;
                            long j1116 = j8;
                            pVar19 = pVar12;
                            this.f144142p = null;
                            this.f144127a = null;
                            this.f144128b = null;
                            this.f144129c = null;
                            this.f144130d = null;
                            this.f144131e = null;
                            this.f144132f = null;
                            this.f144133g = null;
                            this.f144134h = pVar15;
                            this.f144135i = pVar19;
                            this.f144136j = pVar9;
                            this.f144137k = pVar16;
                            this.f144138l = pVar17;
                            this.f144139m = pVar18;
                            this.f144140n = j1116;
                            this.f144141o = 8;
                            objAwait7 = i0Var13.await(this);
                            if (objAwait7 != aVar) {
                                pVar20 = pVar17;
                                pVar21 = pVar16;
                                pVar22 = pVar15;
                                o13.p pVar21111 = (o13.p) objAwait7;
                                arrayList = new ArrayList();
                                th3 = (Throwable) pVar19.f128595b;
                                if (th3 != null) {
                                    arrayList.add(th3);
                                }
                                B b111118 = pVar9.f128595b;
                                A a111118 = pVar9.f128594a;
                                th4 = (Throwable) b111118;
                                if (th4 != null) {
                                    arrayList.add(th4);
                                }
                                B b111119 = pVar21.f128595b;
                                A a111119 = pVar21.f128594a;
                                th5 = (Throwable) b111119;
                                if (th5 != null) {
                                    arrayList.add(th5);
                                }
                                if (pVar20 != null) {
                                    arrayList.add(th9);
                                }
                                if (pVar18 != null) {
                                    arrayList.add(th8);
                                }
                                th6 = (Throwable) pVar22.f128595b;
                                if (th6 != null) {
                                    arrayList.add(th6);
                                }
                                th7 = (Throwable) pVar21111.f128595b;
                                if (th7 != null) {
                                    arrayList.add(th7);
                                }
                                fVar.f144071o = (List) pVar22.f128594a;
                                fVar.f144067k = (ww0.j) pVar19.f128594a;
                                fVar.f144065i = (op0.c) a111118;
                                fVar.f144072p = (UserSettingsDTO) a111119;
                                if (pVar20 != null) {
                                    deviceSettingsDTO = (DeviceSettingsDTO) pVar20.f128594a;
                                } else {
                                    deviceSettingsDTO = null;
                                }
                                fVar.f144066j = deviceSettingsDTO;
                                if (pVar18 != null) {
                                    deviceSettingsDTO2 = (DeviceSettingsDTO) pVar18.f128594a;
                                } else {
                                    deviceSettingsDTO2 = null;
                                }
                                fVar.f144068l = deviceSettingsDTO2;
                                weightGoalUserInputs = fVar.C.getWeightGoalUserInputs();
                                userSettingsDTO = fVar.f144072p;
                                if (userSettingsDTO != null) {
                                    dValueOf = Double.valueOf(userSettingsDTO.E2());
                                } else {
                                    dValueOf = null;
                                }
                                userSettingsDTO2 = fVar.f144072p;
                                if (userSettingsDTO2 != null) {
                                    dValueOf2 = Double.valueOf(userSettingsDTO2.I());
                                } else {
                                    dValueOf2 = null;
                                }
                                if (dValueOf != null) {
                                    userSettingsDTO4 = fVar.f144072p;
                                    if (userSettingsDTO4 != null) {
                                        dValueOf4 = Double.valueOf(userSettingsDTO4.E2());
                                    } else {
                                        dValueOf4 = null;
                                    }
                                    weightGoalUserInputs.k(dValueOf4);
                                }
                                if (dValueOf2 != null) {
                                    userSettingsDTO3 = fVar.f144072p;
                                    if (userSettingsDTO3 != null) {
                                        dValueOf3 = Double.valueOf(userSettingsDTO3.I());
                                    } else {
                                        dValueOf3 = null;
                                    }
                                    weightGoalUserInputs.h(dValueOf3);
                                }
                                list = fVar.f144071o;
                                if (list != null) {
                                    arrayList3 = fVar.f144069m;
                                    linkedHashSet = fVar.f144070n;
                                    if (!list.isEmpty()) {
                                        arrayList3.clear();
                                        linkedHashSet.clear();
                                        while (r1.hasNext()) {
                                            dueDate = mVar.getDueDate();
                                            if (dueDate != null) {
                                                arrayList3.add(dueDate);
                                                deliveryDate = mVar.getDeliveryDate();
                                                if (deliveryDate != null) {
                                                    linkedHashSet.add(deliveryDate);
                                                } else {
                                                    endDate = mVar.getEndDate();
                                                    if (endDate != null) {
                                                        linkedHashSet.add(endDate);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    Unit unit113 = Unit.INSTANCE;
                                }
                                arrayList2 = (ArrayList) pVar21111.f128594a;
                                fVar.f144074r = arrayList2;
                                if (arrayList2 != null) {
                                    while (r1.hasNext()) {
                                        ArrayList<bm2.c> arrayList116 = fVar.f144074r;
                                        arrayList116.getClass();
                                        it = arrayList116.iterator();
                                        it.getClass();
                                        while (it.hasNext()) {
                                            bm2.c next113 = it.next();
                                            next113.getClass();
                                            str = u0Var2.f203860g;
                                            u0Var = (u0) u0.f203782n6.get(next113.getF143517g());
                                            if (u0Var != null) {
                                                str2 = u0Var.f203860g;
                                            } else {
                                                str2 = null;
                                            }
                                            if (p005kotlin.jvm.internal.s.g(str, str2)) {
                                                fVar.B = true;
                                            }
                                        }
                                    }
                                }
                                ((y0) fVar.f144059c.getValue()).j(tb1.d.b(new o13.p(a111118, a111119), null, null, tb1.d.a(arrayList), 6));
                                return Unit.INSTANCE;
                            }
                        }
                    } else {
                        pVar15 = pVar11;
                        pVar16 = pVar10;
                        pVar17 = pVar13;
                        pVar18 = null;
                        long j1117 = j8;
                        pVar19 = pVar12;
                        this.f144142p = null;
                        this.f144127a = null;
                        this.f144128b = null;
                        this.f144129c = null;
                        this.f144130d = null;
                        this.f144131e = null;
                        this.f144132f = null;
                        this.f144133g = null;
                        this.f144134h = pVar15;
                        this.f144135i = pVar19;
                        this.f144136j = pVar9;
                        this.f144137k = pVar16;
                        this.f144138l = pVar17;
                        this.f144139m = pVar18;
                        this.f144140n = j1117;
                        this.f144141o = 8;
                        objAwait7 = i0Var13.await(this);
                        if (objAwait7 != aVar) {
                            pVar20 = pVar17;
                            pVar21 = pVar16;
                            pVar22 = pVar15;
                            o13.p pVar21112 = (o13.p) objAwait7;
                            arrayList = new ArrayList();
                            th3 = (Throwable) pVar19.f128595b;
                            if (th3 != null) {
                                arrayList.add(th3);
                            }
                            B b1111110 = pVar9.f128595b;
                            A a1111110 = pVar9.f128594a;
                            th4 = (Throwable) b1111110;
                            if (th4 != null) {
                                arrayList.add(th4);
                            }
                            B b1111111 = pVar21.f128595b;
                            A a1111111 = pVar21.f128594a;
                            th5 = (Throwable) b1111111;
                            if (th5 != null) {
                                arrayList.add(th5);
                            }
                            if (pVar20 != null) {
                                arrayList.add(th9);
                            }
                            if (pVar18 != null) {
                                arrayList.add(th8);
                            }
                            th6 = (Throwable) pVar22.f128595b;
                            if (th6 != null) {
                                arrayList.add(th6);
                            }
                            th7 = (Throwable) pVar21112.f128595b;
                            if (th7 != null) {
                                arrayList.add(th7);
                            }
                            fVar.f144071o = (List) pVar22.f128594a;
                            fVar.f144067k = (ww0.j) pVar19.f128594a;
                            fVar.f144065i = (op0.c) a1111110;
                            fVar.f144072p = (UserSettingsDTO) a1111111;
                            if (pVar20 != null) {
                                deviceSettingsDTO = (DeviceSettingsDTO) pVar20.f128594a;
                            } else {
                                deviceSettingsDTO = null;
                            }
                            fVar.f144066j = deviceSettingsDTO;
                            if (pVar18 != null) {
                                deviceSettingsDTO2 = (DeviceSettingsDTO) pVar18.f128594a;
                            } else {
                                deviceSettingsDTO2 = null;
                            }
                            fVar.f144068l = deviceSettingsDTO2;
                            weightGoalUserInputs = fVar.C.getWeightGoalUserInputs();
                            userSettingsDTO = fVar.f144072p;
                            if (userSettingsDTO != null) {
                                dValueOf = Double.valueOf(userSettingsDTO.E2());
                            } else {
                                dValueOf = null;
                            }
                            userSettingsDTO2 = fVar.f144072p;
                            if (userSettingsDTO2 != null) {
                                dValueOf2 = Double.valueOf(userSettingsDTO2.I());
                            } else {
                                dValueOf2 = null;
                            }
                            if (dValueOf != null) {
                                userSettingsDTO4 = fVar.f144072p;
                                if (userSettingsDTO4 != null) {
                                    dValueOf4 = Double.valueOf(userSettingsDTO4.E2());
                                } else {
                                    dValueOf4 = null;
                                }
                                weightGoalUserInputs.k(dValueOf4);
                            }
                            if (dValueOf2 != null) {
                                userSettingsDTO3 = fVar.f144072p;
                                if (userSettingsDTO3 != null) {
                                    dValueOf3 = Double.valueOf(userSettingsDTO3.I());
                                } else {
                                    dValueOf3 = null;
                                }
                                weightGoalUserInputs.h(dValueOf3);
                            }
                            list = fVar.f144071o;
                            if (list != null) {
                                arrayList3 = fVar.f144069m;
                                linkedHashSet = fVar.f144070n;
                                if (!list.isEmpty()) {
                                    arrayList3.clear();
                                    linkedHashSet.clear();
                                    while (r1.hasNext()) {
                                        dueDate = mVar.getDueDate();
                                        if (dueDate != null) {
                                            arrayList3.add(dueDate);
                                            deliveryDate = mVar.getDeliveryDate();
                                            if (deliveryDate != null) {
                                                linkedHashSet.add(deliveryDate);
                                            } else {
                                                endDate = mVar.getEndDate();
                                                if (endDate != null) {
                                                    linkedHashSet.add(endDate);
                                                }
                                            }
                                        }
                                    }
                                }
                                Unit unit114 = Unit.INSTANCE;
                            }
                            arrayList2 = (ArrayList) pVar21112.f128594a;
                            fVar.f144074r = arrayList2;
                            if (arrayList2 != null) {
                                while (r1.hasNext()) {
                                    ArrayList<bm2.c> arrayList117 = fVar.f144074r;
                                    arrayList117.getClass();
                                    it = arrayList117.iterator();
                                    it.getClass();
                                    while (it.hasNext()) {
                                        bm2.c next114 = it.next();
                                        next114.getClass();
                                        str = u0Var2.f203860g;
                                        u0Var = (u0) u0.f203782n6.get(next114.getF143517g());
                                        if (u0Var != null) {
                                            str2 = u0Var.f203860g;
                                        } else {
                                            str2 = null;
                                        }
                                        if (p005kotlin.jvm.internal.s.g(str, str2)) {
                                            fVar.B = true;
                                        }
                                    }
                                }
                            }
                            ((y0) fVar.f144059c.getValue()).j(tb1.d.b(new o13.p(a1111110, a1111111), null, null, tb1.d.a(arrayList), 6));
                            return Unit.INSTANCE;
                        }
                    }
                }
                return aVar;
            case 6:
                j8 = this.f144140n;
                pVar14 = this.f144137k;
                pVar7 = this.f144136j;
                pVar5 = this.f144135i;
                pVar6 = this.f144134h;
                i0Var15 = this.f144133g;
                i0Var13 = this.f144131e;
                o13.r.b(obj);
                objAwait5 = obj;
                pVar11 = pVar6;
                pVar12 = pVar5;
                pVar9 = pVar7;
                pVar10 = pVar14;
                pVar13 = (o13.p) objAwait5;
                if (i0Var15 != null) {
                    this.f144142p = null;
                    this.f144127a = null;
                    this.f144128b = null;
                    this.f144129c = null;
                    this.f144130d = null;
                    this.f144131e = i0Var13;
                    this.f144132f = null;
                    this.f144133g = null;
                    this.f144134h = pVar11;
                    this.f144135i = pVar12;
                    this.f144136j = pVar9;
                    this.f144137k = pVar10;
                    this.f144138l = pVar13;
                    this.f144140n = j8;
                    this.f144141o = 7;
                    objAwait6 = i0Var15.await(this);
                    if (objAwait6 != aVar) {
                        pVar15 = pVar11;
                        pVar16 = pVar10;
                        pVar17 = pVar13;
                        pVar18 = (o13.p) objAwait6;
                        long j1118 = j8;
                        pVar19 = pVar12;
                        this.f144142p = null;
                        this.f144127a = null;
                        this.f144128b = null;
                        this.f144129c = null;
                        this.f144130d = null;
                        this.f144131e = null;
                        this.f144132f = null;
                        this.f144133g = null;
                        this.f144134h = pVar15;
                        this.f144135i = pVar19;
                        this.f144136j = pVar9;
                        this.f144137k = pVar16;
                        this.f144138l = pVar17;
                        this.f144139m = pVar18;
                        this.f144140n = j1118;
                        this.f144141o = 8;
                        objAwait7 = i0Var13.await(this);
                        if (objAwait7 != aVar) {
                            pVar20 = pVar17;
                            pVar21 = pVar16;
                            pVar22 = pVar15;
                            o13.p pVar21113 = (o13.p) objAwait7;
                            arrayList = new ArrayList();
                            th3 = (Throwable) pVar19.f128595b;
                            if (th3 != null) {
                                arrayList.add(th3);
                            }
                            B b1111112 = pVar9.f128595b;
                            A a1111112 = pVar9.f128594a;
                            th4 = (Throwable) b1111112;
                            if (th4 != null) {
                                arrayList.add(th4);
                            }
                            B b1111113 = pVar21.f128595b;
                            A a1111113 = pVar21.f128594a;
                            th5 = (Throwable) b1111113;
                            if (th5 != null) {
                                arrayList.add(th5);
                            }
                            if (pVar20 != null) {
                                arrayList.add(th9);
                            }
                            if (pVar18 != null) {
                                arrayList.add(th8);
                            }
                            th6 = (Throwable) pVar22.f128595b;
                            if (th6 != null) {
                                arrayList.add(th6);
                            }
                            th7 = (Throwable) pVar21113.f128595b;
                            if (th7 != null) {
                                arrayList.add(th7);
                            }
                            fVar.f144071o = (List) pVar22.f128594a;
                            fVar.f144067k = (ww0.j) pVar19.f128594a;
                            fVar.f144065i = (op0.c) a1111112;
                            fVar.f144072p = (UserSettingsDTO) a1111113;
                            if (pVar20 != null) {
                                deviceSettingsDTO = (DeviceSettingsDTO) pVar20.f128594a;
                            } else {
                                deviceSettingsDTO = null;
                            }
                            fVar.f144066j = deviceSettingsDTO;
                            if (pVar18 != null) {
                                deviceSettingsDTO2 = (DeviceSettingsDTO) pVar18.f128594a;
                            } else {
                                deviceSettingsDTO2 = null;
                            }
                            fVar.f144068l = deviceSettingsDTO2;
                            weightGoalUserInputs = fVar.C.getWeightGoalUserInputs();
                            userSettingsDTO = fVar.f144072p;
                            if (userSettingsDTO != null) {
                                dValueOf = Double.valueOf(userSettingsDTO.E2());
                            } else {
                                dValueOf = null;
                            }
                            userSettingsDTO2 = fVar.f144072p;
                            if (userSettingsDTO2 != null) {
                                dValueOf2 = Double.valueOf(userSettingsDTO2.I());
                            } else {
                                dValueOf2 = null;
                            }
                            if (dValueOf != null) {
                                userSettingsDTO4 = fVar.f144072p;
                                if (userSettingsDTO4 != null) {
                                    dValueOf4 = Double.valueOf(userSettingsDTO4.E2());
                                } else {
                                    dValueOf4 = null;
                                }
                                weightGoalUserInputs.k(dValueOf4);
                            }
                            if (dValueOf2 != null) {
                                userSettingsDTO3 = fVar.f144072p;
                                if (userSettingsDTO3 != null) {
                                    dValueOf3 = Double.valueOf(userSettingsDTO3.I());
                                } else {
                                    dValueOf3 = null;
                                }
                                weightGoalUserInputs.h(dValueOf3);
                            }
                            list = fVar.f144071o;
                            if (list != null) {
                                arrayList3 = fVar.f144069m;
                                linkedHashSet = fVar.f144070n;
                                if (!list.isEmpty()) {
                                    arrayList3.clear();
                                    linkedHashSet.clear();
                                    while (r1.hasNext()) {
                                        dueDate = mVar.getDueDate();
                                        if (dueDate != null) {
                                            arrayList3.add(dueDate);
                                            deliveryDate = mVar.getDeliveryDate();
                                            if (deliveryDate != null) {
                                                linkedHashSet.add(deliveryDate);
                                            } else {
                                                endDate = mVar.getEndDate();
                                                if (endDate != null) {
                                                    linkedHashSet.add(endDate);
                                                }
                                            }
                                        }
                                    }
                                }
                                Unit unit115 = Unit.INSTANCE;
                            }
                            arrayList2 = (ArrayList) pVar21113.f128594a;
                            fVar.f144074r = arrayList2;
                            if (arrayList2 != null) {
                                while (r1.hasNext()) {
                                    ArrayList<bm2.c> arrayList118 = fVar.f144074r;
                                    arrayList118.getClass();
                                    it = arrayList118.iterator();
                                    it.getClass();
                                    while (it.hasNext()) {
                                        bm2.c next115 = it.next();
                                        next115.getClass();
                                        str = u0Var2.f203860g;
                                        u0Var = (u0) u0.f203782n6.get(next115.getF143517g());
                                        if (u0Var != null) {
                                            str2 = u0Var.f203860g;
                                        } else {
                                            str2 = null;
                                        }
                                        if (p005kotlin.jvm.internal.s.g(str, str2)) {
                                            fVar.B = true;
                                        }
                                    }
                                }
                            }
                            ((y0) fVar.f144059c.getValue()).j(tb1.d.b(new o13.p(a1111112, a1111113), null, null, tb1.d.a(arrayList), 6));
                            return Unit.INSTANCE;
                        }
                    }
                } else {
                    pVar15 = pVar11;
                    pVar16 = pVar10;
                    pVar17 = pVar13;
                    pVar18 = null;
                    long j1119 = j8;
                    pVar19 = pVar12;
                    this.f144142p = null;
                    this.f144127a = null;
                    this.f144128b = null;
                    this.f144129c = null;
                    this.f144130d = null;
                    this.f144131e = null;
                    this.f144132f = null;
                    this.f144133g = null;
                    this.f144134h = pVar15;
                    this.f144135i = pVar19;
                    this.f144136j = pVar9;
                    this.f144137k = pVar16;
                    this.f144138l = pVar17;
                    this.f144139m = pVar18;
                    this.f144140n = j1119;
                    this.f144141o = 8;
                    objAwait7 = i0Var13.await(this);
                    if (objAwait7 != aVar) {
                        pVar20 = pVar17;
                        pVar21 = pVar16;
                        pVar22 = pVar15;
                        o13.p pVar21114 = (o13.p) objAwait7;
                        arrayList = new ArrayList();
                        th3 = (Throwable) pVar19.f128595b;
                        if (th3 != null) {
                            arrayList.add(th3);
                        }
                        B b1111114 = pVar9.f128595b;
                        A a1111114 = pVar9.f128594a;
                        th4 = (Throwable) b1111114;
                        if (th4 != null) {
                            arrayList.add(th4);
                        }
                        B b1111115 = pVar21.f128595b;
                        A a1111115 = pVar21.f128594a;
                        th5 = (Throwable) b1111115;
                        if (th5 != null) {
                            arrayList.add(th5);
                        }
                        if (pVar20 != null) {
                            arrayList.add(th9);
                        }
                        if (pVar18 != null) {
                            arrayList.add(th8);
                        }
                        th6 = (Throwable) pVar22.f128595b;
                        if (th6 != null) {
                            arrayList.add(th6);
                        }
                        th7 = (Throwable) pVar21114.f128595b;
                        if (th7 != null) {
                            arrayList.add(th7);
                        }
                        fVar.f144071o = (List) pVar22.f128594a;
                        fVar.f144067k = (ww0.j) pVar19.f128594a;
                        fVar.f144065i = (op0.c) a1111114;
                        fVar.f144072p = (UserSettingsDTO) a1111115;
                        if (pVar20 != null) {
                            deviceSettingsDTO = (DeviceSettingsDTO) pVar20.f128594a;
                        } else {
                            deviceSettingsDTO = null;
                        }
                        fVar.f144066j = deviceSettingsDTO;
                        if (pVar18 != null) {
                            deviceSettingsDTO2 = (DeviceSettingsDTO) pVar18.f128594a;
                        } else {
                            deviceSettingsDTO2 = null;
                        }
                        fVar.f144068l = deviceSettingsDTO2;
                        weightGoalUserInputs = fVar.C.getWeightGoalUserInputs();
                        userSettingsDTO = fVar.f144072p;
                        if (userSettingsDTO != null) {
                            dValueOf = Double.valueOf(userSettingsDTO.E2());
                        } else {
                            dValueOf = null;
                        }
                        userSettingsDTO2 = fVar.f144072p;
                        if (userSettingsDTO2 != null) {
                            dValueOf2 = Double.valueOf(userSettingsDTO2.I());
                        } else {
                            dValueOf2 = null;
                        }
                        if (dValueOf != null) {
                            userSettingsDTO4 = fVar.f144072p;
                            if (userSettingsDTO4 != null) {
                                dValueOf4 = Double.valueOf(userSettingsDTO4.E2());
                            } else {
                                dValueOf4 = null;
                            }
                            weightGoalUserInputs.k(dValueOf4);
                        }
                        if (dValueOf2 != null) {
                            userSettingsDTO3 = fVar.f144072p;
                            if (userSettingsDTO3 != null) {
                                dValueOf3 = Double.valueOf(userSettingsDTO3.I());
                            } else {
                                dValueOf3 = null;
                            }
                            weightGoalUserInputs.h(dValueOf3);
                        }
                        list = fVar.f144071o;
                        if (list != null) {
                            arrayList3 = fVar.f144069m;
                            linkedHashSet = fVar.f144070n;
                            if (!list.isEmpty()) {
                                arrayList3.clear();
                                linkedHashSet.clear();
                                while (r1.hasNext()) {
                                    dueDate = mVar.getDueDate();
                                    if (dueDate != null) {
                                        arrayList3.add(dueDate);
                                        deliveryDate = mVar.getDeliveryDate();
                                        if (deliveryDate != null) {
                                            linkedHashSet.add(deliveryDate);
                                        } else {
                                            endDate = mVar.getEndDate();
                                            if (endDate != null) {
                                                linkedHashSet.add(endDate);
                                            }
                                        }
                                    }
                                }
                            }
                            Unit unit116 = Unit.INSTANCE;
                        }
                        arrayList2 = (ArrayList) pVar21114.f128594a;
                        fVar.f144074r = arrayList2;
                        if (arrayList2 != null) {
                            while (r1.hasNext()) {
                                ArrayList<bm2.c> arrayList119 = fVar.f144074r;
                                arrayList119.getClass();
                                it = arrayList119.iterator();
                                it.getClass();
                                while (it.hasNext()) {
                                    bm2.c next116 = it.next();
                                    next116.getClass();
                                    str = u0Var2.f203860g;
                                    u0Var = (u0) u0.f203782n6.get(next116.getF143517g());
                                    if (u0Var != null) {
                                        str2 = u0Var.f203860g;
                                    } else {
                                        str2 = null;
                                    }
                                    if (p005kotlin.jvm.internal.s.g(str, str2)) {
                                        fVar.B = true;
                                    }
                                }
                            }
                        }
                        ((y0) fVar.f144059c.getValue()).j(tb1.d.b(new o13.p(a1111114, a1111115), null, null, tb1.d.a(arrayList), 6));
                        return Unit.INSTANCE;
                    }
                }
                return aVar;
            case 7:
                j8 = this.f144140n;
                pVar13 = this.f144138l;
                pVar10 = this.f144137k;
                pVar9 = this.f144136j;
                pVar12 = this.f144135i;
                pVar15 = this.f144134h;
                i0Var13 = this.f144131e;
                o13.r.b(obj);
                objAwait6 = obj;
                pVar16 = pVar10;
                pVar17 = pVar13;
                pVar18 = (o13.p) objAwait6;
                long j11110 = j8;
                pVar19 = pVar12;
                this.f144142p = null;
                this.f144127a = null;
                this.f144128b = null;
                this.f144129c = null;
                this.f144130d = null;
                this.f144131e = null;
                this.f144132f = null;
                this.f144133g = null;
                this.f144134h = pVar15;
                this.f144135i = pVar19;
                this.f144136j = pVar9;
                this.f144137k = pVar16;
                this.f144138l = pVar17;
                this.f144139m = pVar18;
                this.f144140n = j11110;
                this.f144141o = 8;
                objAwait7 = i0Var13.await(this);
                if (objAwait7 != aVar) {
                    pVar20 = pVar17;
                    pVar21 = pVar16;
                    pVar22 = pVar15;
                    o13.p pVar21115 = (o13.p) objAwait7;
                    arrayList = new ArrayList();
                    th3 = (Throwable) pVar19.f128595b;
                    if (th3 != null) {
                        arrayList.add(th3);
                    }
                    B b1111116 = pVar9.f128595b;
                    A a1111116 = pVar9.f128594a;
                    th4 = (Throwable) b1111116;
                    if (th4 != null) {
                        arrayList.add(th4);
                    }
                    B b1111117 = pVar21.f128595b;
                    A a1111117 = pVar21.f128594a;
                    th5 = (Throwable) b1111117;
                    if (th5 != null) {
                        arrayList.add(th5);
                    }
                    if (pVar20 != null) {
                        arrayList.add(th9);
                    }
                    if (pVar18 != null) {
                        arrayList.add(th8);
                    }
                    th6 = (Throwable) pVar22.f128595b;
                    if (th6 != null) {
                        arrayList.add(th6);
                    }
                    th7 = (Throwable) pVar21115.f128595b;
                    if (th7 != null) {
                        arrayList.add(th7);
                    }
                    fVar.f144071o = (List) pVar22.f128594a;
                    fVar.f144067k = (ww0.j) pVar19.f128594a;
                    fVar.f144065i = (op0.c) a1111116;
                    fVar.f144072p = (UserSettingsDTO) a1111117;
                    if (pVar20 != null) {
                        deviceSettingsDTO = (DeviceSettingsDTO) pVar20.f128594a;
                    } else {
                        deviceSettingsDTO = null;
                    }
                    fVar.f144066j = deviceSettingsDTO;
                    if (pVar18 != null) {
                        deviceSettingsDTO2 = (DeviceSettingsDTO) pVar18.f128594a;
                    } else {
                        deviceSettingsDTO2 = null;
                    }
                    fVar.f144068l = deviceSettingsDTO2;
                    weightGoalUserInputs = fVar.C.getWeightGoalUserInputs();
                    userSettingsDTO = fVar.f144072p;
                    if (userSettingsDTO != null) {
                        dValueOf = Double.valueOf(userSettingsDTO.E2());
                    } else {
                        dValueOf = null;
                    }
                    userSettingsDTO2 = fVar.f144072p;
                    if (userSettingsDTO2 != null) {
                        dValueOf2 = Double.valueOf(userSettingsDTO2.I());
                    } else {
                        dValueOf2 = null;
                    }
                    if (dValueOf != null) {
                        userSettingsDTO4 = fVar.f144072p;
                        if (userSettingsDTO4 != null) {
                            dValueOf4 = Double.valueOf(userSettingsDTO4.E2());
                        } else {
                            dValueOf4 = null;
                        }
                        weightGoalUserInputs.k(dValueOf4);
                    }
                    if (dValueOf2 != null) {
                        userSettingsDTO3 = fVar.f144072p;
                        if (userSettingsDTO3 != null) {
                            dValueOf3 = Double.valueOf(userSettingsDTO3.I());
                        } else {
                            dValueOf3 = null;
                        }
                        weightGoalUserInputs.h(dValueOf3);
                    }
                    list = fVar.f144071o;
                    if (list != null) {
                        arrayList3 = fVar.f144069m;
                        linkedHashSet = fVar.f144070n;
                        if (!list.isEmpty()) {
                            arrayList3.clear();
                            linkedHashSet.clear();
                            while (r1.hasNext()) {
                                dueDate = mVar.getDueDate();
                                if (dueDate != null) {
                                    arrayList3.add(dueDate);
                                    deliveryDate = mVar.getDeliveryDate();
                                    if (deliveryDate != null) {
                                        linkedHashSet.add(deliveryDate);
                                    } else {
                                        endDate = mVar.getEndDate();
                                        if (endDate != null) {
                                            linkedHashSet.add(endDate);
                                        }
                                    }
                                }
                            }
                        }
                        Unit unit117 = Unit.INSTANCE;
                    }
                    arrayList2 = (ArrayList) pVar21115.f128594a;
                    fVar.f144074r = arrayList2;
                    if (arrayList2 != null) {
                        while (r1.hasNext()) {
                            ArrayList<bm2.c> arrayList1110 = fVar.f144074r;
                            arrayList1110.getClass();
                            it = arrayList1110.iterator();
                            it.getClass();
                            while (it.hasNext()) {
                                bm2.c next117 = it.next();
                                next117.getClass();
                                str = u0Var2.f203860g;
                                u0Var = (u0) u0.f203782n6.get(next117.getF143517g());
                                if (u0Var != null) {
                                    str2 = u0Var.f203860g;
                                } else {
                                    str2 = null;
                                }
                                if (p005kotlin.jvm.internal.s.g(str, str2)) {
                                    fVar.B = true;
                                }
                            }
                        }
                    }
                    ((y0) fVar.f144059c.getValue()).j(tb1.d.b(new o13.p(a1111116, a1111117), null, null, tb1.d.a(arrayList), 6));
                    return Unit.INSTANCE;
                }
                return aVar;
            case 8:
                pVar18 = this.f144139m;
                pVar20 = this.f144138l;
                pVar21 = this.f144137k;
                pVar9 = this.f144136j;
                pVar19 = this.f144135i;
                pVar22 = this.f144134h;
                o13.r.b(obj);
                objAwait7 = obj;
                o13.p pVar21116 = (o13.p) objAwait7;
                arrayList = new ArrayList();
                th3 = (Throwable) pVar19.f128595b;
                if (th3 != null) {
                    arrayList.add(th3);
                }
                B b1111118 = pVar9.f128595b;
                A a1111118 = pVar9.f128594a;
                th4 = (Throwable) b1111118;
                if (th4 != null) {
                    arrayList.add(th4);
                }
                B b1111119 = pVar21.f128595b;
                A a1111119 = pVar21.f128594a;
                th5 = (Throwable) b1111119;
                if (th5 != null) {
                    arrayList.add(th5);
                }
                if (pVar20 != null) {
                    arrayList.add(th9);
                }
                if (pVar18 != null) {
                    arrayList.add(th8);
                }
                th6 = (Throwable) pVar22.f128595b;
                if (th6 != null) {
                    arrayList.add(th6);
                }
                th7 = (Throwable) pVar21116.f128595b;
                if (th7 != null) {
                    arrayList.add(th7);
                }
                fVar.f144071o = (List) pVar22.f128594a;
                fVar.f144067k = (ww0.j) pVar19.f128594a;
                fVar.f144065i = (op0.c) a1111118;
                fVar.f144072p = (UserSettingsDTO) a1111119;
                if (pVar20 != null) {
                    deviceSettingsDTO = (DeviceSettingsDTO) pVar20.f128594a;
                } else {
                    deviceSettingsDTO = null;
                }
                fVar.f144066j = deviceSettingsDTO;
                if (pVar18 != null) {
                    deviceSettingsDTO2 = (DeviceSettingsDTO) pVar18.f128594a;
                } else {
                    deviceSettingsDTO2 = null;
                }
                fVar.f144068l = deviceSettingsDTO2;
                weightGoalUserInputs = fVar.C.getWeightGoalUserInputs();
                userSettingsDTO = fVar.f144072p;
                if (userSettingsDTO != null) {
                    dValueOf = Double.valueOf(userSettingsDTO.E2());
                } else {
                    dValueOf = null;
                }
                userSettingsDTO2 = fVar.f144072p;
                if (userSettingsDTO2 != null) {
                    dValueOf2 = Double.valueOf(userSettingsDTO2.I());
                } else {
                    dValueOf2 = null;
                }
                if (dValueOf != null) {
                    userSettingsDTO4 = fVar.f144072p;
                    if (userSettingsDTO4 != null) {
                        dValueOf4 = Double.valueOf(userSettingsDTO4.E2());
                    } else {
                        dValueOf4 = null;
                    }
                    weightGoalUserInputs.k(dValueOf4);
                }
                if (dValueOf2 != null) {
                    userSettingsDTO3 = fVar.f144072p;
                    if (userSettingsDTO3 != null) {
                        dValueOf3 = Double.valueOf(userSettingsDTO3.I());
                    } else {
                        dValueOf3 = null;
                    }
                    weightGoalUserInputs.h(dValueOf3);
                }
                list = fVar.f144071o;
                if (list != null) {
                    arrayList3 = fVar.f144069m;
                    linkedHashSet = fVar.f144070n;
                    if (!list.isEmpty()) {
                        arrayList3.clear();
                        linkedHashSet.clear();
                        while (r1.hasNext()) {
                            dueDate = mVar.getDueDate();
                            if (dueDate != null) {
                                arrayList3.add(dueDate);
                                deliveryDate = mVar.getDeliveryDate();
                                if (deliveryDate != null) {
                                    linkedHashSet.add(deliveryDate);
                                } else {
                                    endDate = mVar.getEndDate();
                                    if (endDate != null) {
                                        linkedHashSet.add(endDate);
                                    }
                                }
                            }
                        }
                    }
                    Unit unit118 = Unit.INSTANCE;
                }
                arrayList2 = (ArrayList) pVar21116.f128594a;
                fVar.f144074r = arrayList2;
                if (arrayList2 != null) {
                    while (r1.hasNext()) {
                        ArrayList<bm2.c> arrayList1111 = fVar.f144074r;
                        arrayList1111.getClass();
                        it = arrayList1111.iterator();
                        it.getClass();
                        while (it.hasNext()) {
                            bm2.c next118 = it.next();
                            next118.getClass();
                            str = u0Var2.f203860g;
                            u0Var = (u0) u0.f203782n6.get(next118.getF143517g());
                            if (u0Var != null) {
                                str2 = u0Var.f203860g;
                            } else {
                                str2 = null;
                            }
                            if (p005kotlin.jvm.internal.s.g(str, str2)) {
                                fVar.B = true;
                            }
                        }
                    }
                }
                ((y0) fVar.f144059c.getValue()).j(tb1.d.b(new o13.p(a1111118, a1111119), null, null, tb1.d.a(arrayList), 6));
                return Unit.INSTANCE;
            default:
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
