package y10;

import android.content.Context;
import android.support.v4.media.session.PlaybackStateCompat;
import androidx.lifecycle.y0;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.v2;
import java.util.Collection;
import java.util.List;
import lc.u0;
import o53.s0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.connectiq.viewmodel.ConnectIQAppDetailsViewModel$appInstall$1", f = "ConnectIQAppDetailsViewModel.kt", l = {91}, m = "invokeSuspend", v = 2)
public final class c extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f193788a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f193789b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f193790c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f193791d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f193792e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f193793f;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lo53/b0;", "Lcom/garmin/android/apps/connectmobile/v2;", "", "Lq10/b;", "<anonymous>", "(Lo53/b0;)Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.connectiq.viewmodel.ConnectIQAppDetailsViewModel$appInstall$1$result$1", f = "ConnectIQAppDetailsViewModel.kt", l = {93}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super v2<? extends List<? extends q10.b>>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f193794a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f193795b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ long f193796c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ b f193797d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ long f193798e;

        /* JADX INFO: renamed from: y10.c$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/v2;", "", "Lq10/b;", "<anonymous>", "()Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.connectiq.viewmodel.ConnectIQAppDetailsViewModel$appInstall$1$result$1$1", f = "ConnectIQAppDetailsViewModel.kt", l = {94}, m = "invokeSuspend", v = 2)
        public static final class C3617a extends v13.i implements e23.l<t13.d<? super v2<? extends List<? extends q10.b>>>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f193799a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ b f193800b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ long f193801c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ q10.c f193802d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C3617a(b bVar, long j8, q10.c cVar, t13.d<? super C3617a> dVar) {
                super(1, dVar);
                this.f193800b = bVar;
                this.f193801c = j8;
                this.f193802d = cVar;
            }

            @Override // v13.a
            public final t13.d<Unit> create(t13.d<?> dVar) {
                return new C3617a(this.f193800b, this.f193801c, this.f193802d, dVar);
            }

            @Override // e23.l
            public final Object invoke(t13.d<? super v2<? extends List<? extends q10.b>>> dVar) {
                return ((C3617a) create(dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f193799a;
                if (i14 != 0) {
                    if (i14 == 1) {
                        o13.r.b(obj);
                        return obj;
                    }
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
                q10.a aVar2 = new q10.a(String.valueOf(this.f193801c), p13.x.d(this.f193802d));
                this.f193799a = 1;
                Object objX4 = b.x4(this.f193800b, aVar2, this);
                return objX4 == aVar ? aVar : objX4;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, long j8, b bVar, long j14, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f193795b = str;
            this.f193796c = j8;
            this.f193797d = bVar;
            this.f193798e = j14;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f193795b, this.f193796c, this.f193797d, this.f193798e, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super v2<? extends List<? extends q10.b>>> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f193794a;
            if (i14 != 0) {
                if (i14 == 1) {
                    o13.r.b(obj);
                    return obj;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
            C3617a c3617a = new C3617a(this.f193797d, this.f193798e, new q10.c(this.f193795b, this.f193796c), null);
            this.f193794a = 1;
            Object objA = p10.e.a(c3617a, "Error occurred", this);
            return objA == aVar ? aVar : objA;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(b bVar, Context context, long j8, String str, long j14, t13.d<? super c> dVar) {
        super(2, dVar);
        this.f193789b = bVar;
        this.f193790c = context;
        this.f193791d = j8;
        this.f193792e = str;
        this.f193793f = j14;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new c(this.f193789b, this.f193790c, this.f193791d, this.f193792e, this.f193793f, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x007d  */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f193788a;
        if (i14 == 0) {
            o13.r.b(obj);
            x53.c cVar = s0.f129406a;
            x53.b bVar = x53.b.f189152a;
            a aVar2 = new a(this.f193792e, this.f193793f, this.f193789b, this.f193791d, null);
            this.f193788a = 1;
            obj = ge1.b.e0(bVar, aVar2, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        v2 v2Var = (v2) obj;
        boolean z14 = v2Var instanceof v2.b;
        b bVar2 = this.f193789b;
        if (z14) {
            T t7 = ((v2.b) v2Var).f47386a;
            if (((Collection) t7).isEmpty()) {
                int i15 = b.f193776f;
                bVar2.getClass();
                a2 a2Var = a2.GENERAL;
                long j8 = this.f193791d;
                String strF = androidx.room.a0.f(j8, "triggerSync unitId[", "]");
                i2.f36769a.getClass();
                i2.a.b(a2Var, "ConnectIQAppDetailsViewModel", strF);
                bVar2.f193779c = Long.valueOf(j8);
                yr1.e.g(j8, PlaybackStateCompat.ACTION_PREPARE_FROM_URI, this.f193790c, "ConnectIQAppDetailsViewModel");
                bVar2.f193781e.start();
                gb2.a.b().a(bVar2.f193780d);
            } else {
                List list = (List) t7;
                if (((q10.b) list.get(0)).getStatus() != 200) {
                    l0 l0Var = new l0(g0.ERROR, am.j.h(((q10.b) list.get(0)).getStatus(), "Error response code "));
                    y0<l0> y0Var = bVar2.f193778b;
                    if (y0Var == null) {
                        p005kotlin.jvm.internal.s.m("connectIQLiveData");
                        throw null;
                    }
                    y0Var.m(l0Var);
                } else {
                    int i16 = b.f193776f;
                    bVar2.getClass();
                    a2 a2Var2 = a2.GENERAL;
                    long j14 = this.f193791d;
                    String strF2 = androidx.room.a0.f(j14, "triggerSync unitId[", "]");
                    i2.f36769a.getClass();
                    i2.a.b(a2Var2, "ConnectIQAppDetailsViewModel", strF2);
                    bVar2.f193779c = Long.valueOf(j14);
                    yr1.e.g(j14, PlaybackStateCompat.ACTION_PREPARE_FROM_URI, this.f193790c, "ConnectIQAppDetailsViewModel");
                    bVar2.f193781e.start();
                    gb2.a.b().a(bVar2.f193780d);
                }
            }
        } else {
            if (!(v2Var instanceof v2.a)) {
                u0.r();
                return null;
            }
            g0 g0Var = g0.ERROR;
            String message = ((v2.a) v2Var).f47383a.getMessage();
            if (message == null) {
                message = "";
            }
            l0 l0Var2 = new l0(g0Var, message);
            y0<l0> y0Var2 = bVar2.f193778b;
            if (y0Var2 == null) {
                p005kotlin.jvm.internal.s.m("connectIQLiveData");
                throw null;
            }
            y0Var2.m(l0Var2);
        }
        return Unit.INSTANCE;
    }
}
