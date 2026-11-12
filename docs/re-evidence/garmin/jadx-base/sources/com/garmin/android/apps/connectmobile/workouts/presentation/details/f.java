package com.garmin.android.apps.connectmobile.workouts.presentation.details;

import android.content.res.Resources;
import androidx.lifecycle.u1;
import androidx.lifecycle.v1;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import androidx.room.a0;
import bs2.nv;
import c22.l3;
import c62.b2;
import c62.d2;
import c62.g2;
import c62.l1;
import c62.l2;
import c62.m1;
import c62.m2;
import c62.n1;
import c62.o1;
import c62.p1;
import c62.q1;
import c62.r1;
import c62.s1;
import c62.t1;
import c62.w1;
import c62.x1;
import c62.y1;
import c62.z1;
import ch.qos.logback.core.net.SyslogConstants;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.calendar.model.CalendarItemDTO;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.settings.user.PowerZonesDTO;
import com.garmin.android.apps.connectmobile.v2;
import com.garmin.android.apps.connectmobile.workouts.data.model.WorkoutDetailsDTO;
import com.garmin.android.apps.connectmobile.workouts.data.model.WorkoutScheduleDTO;
import com.garmin.android.apps.connectmobile.workouts.data.model.f0;
import com.garmin.android.apps.connectmobile.workouts.data.model.h0;
import com.garmin.android.apps.connectmobile.workouts.data.model.j0;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import lc.u0;
import o53.b0;
import o53.s0;
import org.joda.time.DateTime;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.NoWhenBranchMatchedException;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.p0;
import p005kotlin.jvm.internal.x0;
import p006l2.w2;
import r53.o2;
import r53.p2;
import r53.q2;
import ww1.i0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0017\u0018\u00002\u00020\u00012\u00020\u0002:\u0003\u0005\u0006\u0007B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/workouts/presentation/details/f;", "Landroidx/lifecycle/u1;", "Lc62/t;", "<init>", "()V", "a", "b", "c", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public class f extends u1 implements c62.t {
    public static final /* synthetic */ int J0 = 0;
    public boolean A;
    public long B;
    public long C;
    public Long D;
    public boolean E;
    public boolean F;
    public final r53.i<v52.c<com.garmin.android.apps.connectmobile.workouts.presentation.details.d>> H0;
    public com.garmin.android.apps.connectmobile.workouts.presentation.details.c I;
    public final l I0;
    public boolean P;
    public boolean T;
    public a X;
    public final r53.j<v52.c<? extends com.garmin.android.apps.connectmobile.workouts.presentation.details.e>> Y;
    public final o2<v52.c<com.garmin.android.apps.connectmobile.workouts.presentation.details.e>> Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o52.e f48587a = (o52.e) KoinJavaComponent.get$default(o52.e.class, null, null, 6, null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l52.y f48588b = (l52.y) KoinJavaComponent.get$default(l52.y.class, null, null, 6, null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final oc1.b f48589c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final rt1.m f48590d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final o13.t f48591e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final q52.f f48592f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final q52.c f48593g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final o52.c f48594h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final o52.f f48595i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final rd2.f f48596j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final bu0.i f48597k;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public final q53.w<v52.c<? extends com.garmin.android.apps.connectmobile.workouts.presentation.details.d>> f48598k0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final bu0.b f48599l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f48600m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f48601n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public o13.p<Boolean, Double> f48602o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public List<i0> f48603p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f48604q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public WorkoutDetailsDTO f48605r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public WorkoutScheduleDTO f48606t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public com.garmin.android.apps.connectmobile.repcounting.model.c f48607v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public List<com.garmin.android.apps.connectmobile.workouts.data.model.v> f48608w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public List<com.garmin.android.apps.connectmobile.workouts.data.model.b> f48609x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public PowerZonesDTO f48610y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public String f48611z;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0082\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012(\u0010\u0007\u001a$\b\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0004¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/garmin/android/apps/connectmobile/workouts/presentation/details/f$a;", "", "", "audioDirectory", "Lkotlin/Function3;", "Lt13/d;", "", "downloadAudioNoteFunc", "<init>", "(Ljava/lang/String;Le23/q;)V", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f48612a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final e23.q<String, String, t13.d<? super Boolean>, Object> f48613b;

        /* JADX WARN: Multi-variable type inference failed */
        public a(String str, e23.q<? super String, ? super String, ? super t13.d<? super Boolean>, ? extends Object> qVar) {
            str.getClass();
            qVar.getClass();
            this.f48612a = str;
            this.f48613b = qVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f48612a.equals(aVar.f48612a) && this.f48613b.equals(aVar.f48613b);
        }

        public final int hashCode() {
            return this.f48613b.hashCode() + (this.f48612a.hashCode() * 31);
        }

        public final String toString() {
            return "AudioNoteHandler(audioDirectory=" + this.f48612a + ", downloadAudioNoteFunc=" + this.f48613b + ")";
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B5\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012\u0018\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/garmin/android/apps/connectmobile/workouts/presentation/details/f$c;", "Lcom/garmin/android/library/backgroundtaskmanagement/b$b;", "Lok1/b;", "Lkotlin/Function1;", "Lcom/garmin/android/apps/connectmobile/settings/user/PowerZonesDTO;", "", "onSuccess", "Lkotlin/Function2;", "", "Lcom/garmin/android/library/backgroundtaskmanagement/b$c;", "onError", "<init>", "(Le23/l;Le23/p;)V", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c implements com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b<ok1.b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final e23.l<PowerZonesDTO, Unit> f48614a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final e23.p<Long, com.garmin.android.library.backgroundtaskmanagement.b.c, Unit> f48615b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public PowerZonesDTO f48616c;

        /* JADX WARN: Multi-variable type inference failed */
        public c(e23.l<? super PowerZonesDTO, Unit> lVar, e23.p<? super Long, ? super com.garmin.android.library.backgroundtaskmanagement.b.c, Unit> pVar) {
            lVar.getClass();
            pVar.getClass();
            this.f48614a = lVar;
            this.f48615b = pVar;
        }

        @Override // com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b
        public final void onComplete(long j8, com.garmin.android.library.backgroundtaskmanagement.b.c cVar) {
            cVar.getClass();
            com.garmin.android.library.backgroundtaskmanagement.b.c cVar2 = com.garmin.android.library.backgroundtaskmanagement.b.c.SUCCESS;
            e23.p<Long, com.garmin.android.library.backgroundtaskmanagement.b.c, Unit> pVar = this.f48615b;
            if (cVar != cVar2) {
                pVar.invoke(Long.valueOf(j8), cVar);
                return;
            }
            PowerZonesDTO powerZonesDTO = this.f48616c;
            if (powerZonesDTO != null) {
                this.f48614a.invoke(powerZonesDTO);
            } else {
                pVar.invoke(Long.valueOf(j8), com.garmin.android.library.backgroundtaskmanagement.b.c.UNRECOVERABLE);
            }
        }

        @Override // com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b
        public final void onResults(long j8, com.garmin.android.library.backgroundtaskmanagement.b.e eVar, ok1.b bVar) {
            ok1.b bVar2 = bVar;
            eVar.getClass();
            bVar2.getClass();
            this.f48616c = bVar2.f132582a;
        }
    }

    public static final /* synthetic */ class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f48617a;

        static {
            int[] iArr = new int[fw.p.values().length];
            try {
                iArr[fw.p.LOADING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[fw.p.SUCCESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[fw.p.ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f48617a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.workouts.presentation.details.WorkoutDetailsViewModel$doWhenActivityNotInProgress$1", f = "WorkoutDetailsViewModel.kt", l = {2146}, m = "invokeSuspend", v = 2)
    public static final class e extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f48618a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.l<t13.d<? super Unit>, Object> f48620c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public e(e23.l<? super t13.d<? super Unit>, ? extends Object> lVar, t13.d<? super e> dVar) {
            super(2, dVar);
            this.f48620c = lVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return f.this.new e(this.f48620c, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((e) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f48618a;
            if (i14 == 0) {
                o13.r.b(obj);
                f fVar = f.this;
                if (fVar.f48597k.a(null)) {
                    fVar.d5(true);
                } else {
                    this.f48618a = 1;
                    if (this.f48620c.invoke(this) == aVar) {
                        return aVar;
                    }
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.workouts.presentation.details.f$f, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.workouts.presentation.details.WorkoutDetailsViewModel$doWorkout$1", f = "WorkoutDetailsViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class C0947f extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f48621a;

        /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.workouts.presentation.details.f$f$a */
        @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 3, 0}, xi = 48)
        @v13.e(c = "com.garmin.android.apps.connectmobile.workouts.presentation.details.WorkoutDetailsViewModel$doWorkout$1$1", f = "WorkoutDetailsViewModel.kt", l = {2014, 2018}, m = "invokeSuspend", v = 2)
        public static final class a extends v13.i implements e23.l<t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f48623a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f48624b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ b0 f48625c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(f fVar, b0 b0Var, t13.d<? super a> dVar) {
                super(1, dVar);
                this.f48624b = fVar;
                this.f48625c = b0Var;
            }

            @Override // v13.a
            public final t13.d<Unit> create(t13.d<?> dVar) {
                return new a(this.f48624b, this.f48625c, dVar);
            }

            @Override // e23.l
            public final Object invoke(t13.d<? super Unit> dVar) {
                return ((a) create(dVar)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Code restructure failed: missing block: B:24:0x0076, code lost:
            
                if (com.garmin.android.apps.connectmobile.workouts.presentation.details.f.E4(r6, r12, r11) == r1) goto L28;
             */
            /* JADX WARN: Code restructure failed: missing block: B:27:0x0097, code lost:
            
                if (v52.d.d(r12, r0, r11) == r1) goto L28;
             */
            /* JADX WARN: Code restructure failed: missing block: B:28:0x0099, code lost:
            
                return r1;
             */
            @Override // v13.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f48623a;
                f fVar = this.f48624b;
                try {
                    if (i14 == 0) {
                        o13.r.b(obj);
                        Long l14 = fVar.D;
                        if (l14 == null || l14.longValue() <= 0) {
                            com.garmin.android.apps.connectmobile.workouts.presentation.details.e eVar = (com.garmin.android.apps.connectmobile.workouts.presentation.details.e) v52.d.b(fVar.Z);
                            if (eVar == null) {
                                return Unit.INSTANCE;
                            }
                            com.garmin.android.apps.connectmobile.workouts.data.model.y f48583g = eVar.getF48583g();
                            this.f48623a = 1;
                        } else {
                            i2.a aVar2 = i2.f36769a;
                            a2 a2Var = a2.GENERAL;
                            aVar2.getClass();
                            i2.a.b(a2Var, "WorkoutDetailsViewModel", "Pre-selected device ID found: " + l14 + ".");
                            fVar.K4(new com.garmin.android.apps.connectmobile.workouts.presentation.details.o(fVar, l14.longValue(), null));
                        }
                    } else {
                        if (i14 != 1 && i14 != 2) {
                            vb.h.z("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        o13.r.b(obj);
                    }
                } catch (Exception e4) {
                    String strN = fb1.c.n("Failed to fetch paired devices: ", e4.getMessage());
                    i2.a aVar3 = i2.f36769a;
                    a2 a2Var2 = a2.GENERAL;
                    aVar3.getClass();
                    i2.a.f(a2Var2, "WorkoutDetailsViewModel", strN);
                    q53.w<v52.c<? extends com.garmin.android.apps.connectmobile.workouts.presentation.details.d>> wVar = fVar.f48598k0;
                    com.garmin.android.apps.connectmobile.workouts.presentation.details.d.h hVar = com.garmin.android.apps.connectmobile.workouts.presentation.details.d.h.f48527a;
                    this.f48623a = 2;
                }
                return Unit.INSTANCE;
            }
        }

        public C0947f(t13.d<? super C0947f> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            C0947f c0947f = f.this.new C0947f(dVar);
            c0947f.f48621a = obj;
            return c0947f;
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((C0947f) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            b0 b0Var = (b0) this.f48621a;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            f fVar = f.this;
            a aVar2 = new a(fVar, b0Var, null);
            int i14 = f.J0;
            fVar.K4(aVar2);
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.workouts.presentation.details.WorkoutDetailsViewModel$downloadAudioNote$1", f = "WorkoutDetailsViewModel.kt", l = {1780, 1782, 1785, 1790}, m = "invokeSuspend", v = 2)
    public static final class g extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f48626a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f48627b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f48629d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f48630e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ e23.a<Unit> f48631f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(String str, String str2, e23.a<Unit> aVar, t13.d<? super g> dVar) {
            super(2, dVar);
            this.f48629d = str;
            this.f48630e = str2;
            this.f48631f = aVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            g gVar = f.this.new g(this.f48629d, this.f48630e, this.f48631f, dVar);
            gVar.f48627b = obj;
            return gVar;
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((g) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:29:0x0077  */
        /* JADX WARN: Code duplicated, block: B:30:0x007b  */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x005a, code lost:
        
            if (r12.h(r0, r11) == r1) goto L32;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x008a, code lost:
        
            if (v52.d.d(r12, r2, r11) == r1) goto L32;
         */
        @Override // v13.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            boolean zBooleanValue;
            e23.a<Unit> aVar;
            b0 b0Var = (b0) this.f48627b;
            u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f48626a;
            String str = this.f48630e;
            String str2 = this.f48629d;
            f fVar = f.this;
            if (i14 == 0) {
                o13.r.b(obj);
                q53.w<v52.c<? extends com.garmin.android.apps.connectmobile.workouts.presentation.details.d>> wVar = fVar.f48598k0;
                v52.c.b bVar = v52.c.b.f175759a;
                this.f48627b = b0Var;
                this.f48626a = 1;
                if (wVar.h(bVar, this) != aVar2) {
                }
                return aVar2;
            }
            if (i14 != 1) {
                if (i14 == 2) {
                    o13.r.b(obj);
                    return Unit.INSTANCE;
                }
                if (i14 == 3) {
                    o13.r.b(obj);
                    zBooleanValue = ((Boolean) obj).booleanValue();
                    aVar = this.f48631f;
                    if (zBooleanValue) {
                        aVar.invoke();
                    } else {
                        q53.w<v52.c<? extends com.garmin.android.apps.connectmobile.workouts.presentation.details.d>> wVar2 = fVar.f48598k0;
                        com.garmin.android.apps.connectmobile.workouts.presentation.details.d.r rVar = new com.garmin.android.apps.connectmobile.workouts.presentation.details.d.r(str2, str, aVar);
                        this.f48627b = null;
                        this.f48626a = 4;
                    }
                } else {
                    if (i14 != 4) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    o13.r.b(obj);
                }
                return Unit.INSTANCE;
            }
            o13.r.b(obj);
            a aVar3 = fVar.X;
            if (aVar3 == null) {
                q53.w<v52.c<? extends com.garmin.android.apps.connectmobile.workouts.presentation.details.d>> wVar3 = fVar.f48598k0;
                v52.c.a aVar4 = new v52.c.a(null, 1, null);
                this.f48627b = null;
                this.f48626a = 2;
            } else {
                e23.q<String, String, t13.d<? super Boolean>, Object> qVar = aVar3.f48613b;
                this.f48627b = null;
                this.f48626a = 3;
                obj = qVar.invoke(str2, str, this);
                if (obj != aVar2) {
                    zBooleanValue = ((Boolean) obj).booleanValue();
                    aVar = this.f48631f;
                    if (zBooleanValue) {
                        aVar.invoke();
                    } else {
                        q53.w<v52.c<? extends com.garmin.android.apps.connectmobile.workouts.presentation.details.d>> wVar4 = fVar.f48598k0;
                        com.garmin.android.apps.connectmobile.workouts.presentation.details.d.r rVar2 = new com.garmin.android.apps.connectmobile.workouts.presentation.details.d.r(str2, str, aVar);
                        this.f48627b = null;
                        this.f48626a = 4;
                    }
                    return Unit.INSTANCE;
                }
            }
            return aVar2;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.workouts.presentation.details.WorkoutDetailsViewModel$duplicateMSNWorkout$1", f = "WorkoutDetailsViewModel.kt", l = {1745}, m = "invokeSuspend", v = 2)
    public static final class h extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public f f48632a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public WorkoutDetailsDTO f48633b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f48634c;

        public h(t13.d<? super h> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return f.this.new h(dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((h) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            f fVar;
            WorkoutDetailsDTO workoutDetailsDTO;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f48634c;
            if (i14 == 0) {
                o13.r.b(obj);
                fVar = f.this;
                WorkoutDetailsDTO workoutDetailsDTO2 = fVar.f48605r;
                if (workoutDetailsDTO2 != null) {
                    q53.w<v52.c<? extends com.garmin.android.apps.connectmobile.workouts.presentation.details.d>> wVar = fVar.f48598k0;
                    com.garmin.android.apps.connectmobile.workouts.presentation.details.d.s sVar = com.garmin.android.apps.connectmobile.workouts.presentation.details.d.s.f48543a;
                    this.f48632a = fVar;
                    this.f48633b = workoutDetailsDTO2;
                    this.f48634c = 1;
                    if (v52.d.d(wVar, sVar, this) == aVar) {
                        return aVar;
                    }
                    workoutDetailsDTO = workoutDetailsDTO2;
                }
                return Unit.INSTANCE;
            }
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            workoutDetailsDTO = this.f48633b;
            fVar = this.f48632a;
            o13.r.b(obj);
            boolean z14 = workoutDetailsDTO.f48044e == m52.k.A;
            int i15 = f.J0;
            WorkoutDetailsDTO workoutDetailsDTOH4 = fVar.H4(workoutDetailsDTO, z14);
            if (z14) {
                workoutDetailsDTOH4.f48053m = m52.b.TIME_ESTIMATED;
                Iterator<T> it = workoutDetailsDTOH4.Q0.iterator();
                while (it.hasNext()) {
                    ((h0) it.next()).z(m52.b.TIME_ESTIMATED);
                }
            }
            ge1.b.T(v1.a(fVar), null, null, new com.garmin.android.apps.connectmobile.workouts.presentation.details.h(fVar, workoutDetailsDTOH4, null), 3);
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.workouts.presentation.details.WorkoutDetailsViewModel$fetchWorkoutSchedule$1", f = "WorkoutDetailsViewModel.kt", l = {SyslogConstants.SYSLOG_PORT}, m = "invokeSuspend", v = 2)
    public static final class i extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f48636a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ long f48638c;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.workouts.presentation.details.WorkoutDetailsViewModel$fetchWorkoutSchedule$1$1", f = "WorkoutDetailsViewModel.kt", l = {516, 518, 518, 523, 528, 539, 549, 553, 563, 575, 576, 589, 593, 596}, m = "invokeSuspend", v = 2)
        public static final class a extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public WorkoutScheduleDTO f48639a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public WorkoutDetailsDTO f48640b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public m52.k f48641c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public Object f48642d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public int f48643e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public /* synthetic */ Object f48644f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public final /* synthetic */ f f48645g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            public final /* synthetic */ long f48646h;

            /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.workouts.presentation.details.f$i$a$a, reason: collision with other inner class name */
            public static final /* synthetic */ class C0948a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final /* synthetic */ int[] f48647a;

                static {
                    int[] iArr = new int[m52.k.values().length];
                    try {
                        iArr[m52.k.f116755o.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[m52.k.f116754n.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[m52.k.f116758r.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    f48647a = iArr;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(f fVar, long j8, t13.d<? super a> dVar) {
                super(2, dVar);
                this.f48645g = fVar;
                this.f48646h = j8;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                a aVar = new a(this.f48645g, this.f48646h, dVar);
                aVar.f48644f = obj;
                return aVar;
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
                return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
            /* JADX WARN: Code duplicated, block: B:102:0x0229  */
            /* JADX WARN: Code duplicated, block: B:103:0x022b A[Catch: all -> 0x028f, PHI: r0 r1 r3 r15
              0x022b: PHI (r0v13 java.util.List<com.garmin.android.apps.connectmobile.workouts.data.model.v>) = 
              (r0v11 java.util.List<com.garmin.android.apps.connectmobile.workouts.data.model.v>)
              (r0v17 java.util.List<com.garmin.android.apps.connectmobile.workouts.data.model.v>)
             binds: [B:101:0x0227, B:18:0x004d] A[DONT_GENERATE, DONT_INLINE]
              0x022b: PHI (r1v9 m52.k) = (r1v7 m52.k), (r1v10 m52.k) binds: [B:101:0x0227, B:18:0x004d] A[DONT_GENERATE, DONT_INLINE]
              0x022b: PHI (r3v12 com.garmin.android.apps.connectmobile.workouts.data.model.WorkoutScheduleDTO) = 
              (r3v10 com.garmin.android.apps.connectmobile.workouts.data.model.WorkoutScheduleDTO)
              (r3v15 com.garmin.android.apps.connectmobile.workouts.data.model.WorkoutScheduleDTO)
             binds: [B:101:0x0227, B:18:0x004d] A[DONT_GENERATE, DONT_INLINE]
              0x022b: PHI (r15v44 java.lang.Object) = (r15v40 java.lang.Object), (r15v0 java.lang.Object) binds: [B:101:0x0227, B:18:0x004d] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {all -> 0x028f, blocks: (B:7:0x0024, B:10:0x002d, B:74:0x0158, B:14:0x003b, B:81:0x0188, B:83:0x01a9, B:85:0x01ad, B:86:0x01af, B:87:0x01b1, B:18:0x004d, B:103:0x022b, B:105:0x024c, B:107:0x0250, B:108:0x0252, B:109:0x0254, B:21:0x0056, B:94:0x01e7, B:96:0x01ed, B:100:0x0216, B:97:0x01f5, B:99:0x01f9, B:112:0x0271, B:113:0x0276, B:24:0x0063, B:48:0x00dc, B:55:0x00f6, B:57:0x0106, B:59:0x010a, B:60:0x010c, B:61:0x010e, B:64:0x0129, B:66:0x0139, B:68:0x013d, B:69:0x013f, B:70:0x0141, B:77:0x0172, B:90:0x01d0, B:51:0x00e8, B:25:0x0068, B:39:0x00a9, B:41:0x00b0, B:43:0x00b6, B:45:0x00bc, B:114:0x0277, B:26:0x006c, B:36:0x009b, B:27:0x0070, B:33:0x0087, B:30:0x0077), top: B:122:0x0012 }] */
            /* JADX WARN: Code duplicated, block: B:105:0x024c A[Catch: all -> 0x028f, TryCatch #0 {all -> 0x028f, blocks: (B:7:0x0024, B:10:0x002d, B:74:0x0158, B:14:0x003b, B:81:0x0188, B:83:0x01a9, B:85:0x01ad, B:86:0x01af, B:87:0x01b1, B:18:0x004d, B:103:0x022b, B:105:0x024c, B:107:0x0250, B:108:0x0252, B:109:0x0254, B:21:0x0056, B:94:0x01e7, B:96:0x01ed, B:100:0x0216, B:97:0x01f5, B:99:0x01f9, B:112:0x0271, B:113:0x0276, B:24:0x0063, B:48:0x00dc, B:55:0x00f6, B:57:0x0106, B:59:0x010a, B:60:0x010c, B:61:0x010e, B:64:0x0129, B:66:0x0139, B:68:0x013d, B:69:0x013f, B:70:0x0141, B:77:0x0172, B:90:0x01d0, B:51:0x00e8, B:25:0x0068, B:39:0x00a9, B:41:0x00b0, B:43:0x00b6, B:45:0x00bc, B:114:0x0277, B:26:0x006c, B:36:0x009b, B:27:0x0070, B:33:0x0087, B:30:0x0077), top: B:122:0x0012 }] */
            /* JADX WARN: Code duplicated, block: B:107:0x0250 A[Catch: all -> 0x028f, TryCatch #0 {all -> 0x028f, blocks: (B:7:0x0024, B:10:0x002d, B:74:0x0158, B:14:0x003b, B:81:0x0188, B:83:0x01a9, B:85:0x01ad, B:86:0x01af, B:87:0x01b1, B:18:0x004d, B:103:0x022b, B:105:0x024c, B:107:0x0250, B:108:0x0252, B:109:0x0254, B:21:0x0056, B:94:0x01e7, B:96:0x01ed, B:100:0x0216, B:97:0x01f5, B:99:0x01f9, B:112:0x0271, B:113:0x0276, B:24:0x0063, B:48:0x00dc, B:55:0x00f6, B:57:0x0106, B:59:0x010a, B:60:0x010c, B:61:0x010e, B:64:0x0129, B:66:0x0139, B:68:0x013d, B:69:0x013f, B:70:0x0141, B:77:0x0172, B:90:0x01d0, B:51:0x00e8, B:25:0x0068, B:39:0x00a9, B:41:0x00b0, B:43:0x00b6, B:45:0x00bc, B:114:0x0277, B:26:0x006c, B:36:0x009b, B:27:0x0070, B:33:0x0087, B:30:0x0077), top: B:122:0x0012 }] */
            /* JADX WARN: Code duplicated, block: B:111:0x0270  */
            /* JADX WARN: Code duplicated, block: B:112:0x0271 A[Catch: all -> 0x028f, TryCatch #0 {all -> 0x028f, blocks: (B:7:0x0024, B:10:0x002d, B:74:0x0158, B:14:0x003b, B:81:0x0188, B:83:0x01a9, B:85:0x01ad, B:86:0x01af, B:87:0x01b1, B:18:0x004d, B:103:0x022b, B:105:0x024c, B:107:0x0250, B:108:0x0252, B:109:0x0254, B:21:0x0056, B:94:0x01e7, B:96:0x01ed, B:100:0x0216, B:97:0x01f5, B:99:0x01f9, B:112:0x0271, B:113:0x0276, B:24:0x0063, B:48:0x00dc, B:55:0x00f6, B:57:0x0106, B:59:0x010a, B:60:0x010c, B:61:0x010e, B:64:0x0129, B:66:0x0139, B:68:0x013d, B:69:0x013f, B:70:0x0141, B:77:0x0172, B:90:0x01d0, B:51:0x00e8, B:25:0x0068, B:39:0x00a9, B:41:0x00b0, B:43:0x00b6, B:45:0x00bc, B:114:0x0277, B:26:0x006c, B:36:0x009b, B:27:0x0070, B:33:0x0087, B:30:0x0077), top: B:122:0x0012 }] */
            /* JADX WARN: Code duplicated, block: B:114:0x0277 A[Catch: all -> 0x028f, TRY_LEAVE, TryCatch #0 {all -> 0x028f, blocks: (B:7:0x0024, B:10:0x002d, B:74:0x0158, B:14:0x003b, B:81:0x0188, B:83:0x01a9, B:85:0x01ad, B:86:0x01af, B:87:0x01b1, B:18:0x004d, B:103:0x022b, B:105:0x024c, B:107:0x0250, B:108:0x0252, B:109:0x0254, B:21:0x0056, B:94:0x01e7, B:96:0x01ed, B:100:0x0216, B:97:0x01f5, B:99:0x01f9, B:112:0x0271, B:113:0x0276, B:24:0x0063, B:48:0x00dc, B:55:0x00f6, B:57:0x0106, B:59:0x010a, B:60:0x010c, B:61:0x010e, B:64:0x0129, B:66:0x0139, B:68:0x013d, B:69:0x013f, B:70:0x0141, B:77:0x0172, B:90:0x01d0, B:51:0x00e8, B:25:0x0068, B:39:0x00a9, B:41:0x00b0, B:43:0x00b6, B:45:0x00bc, B:114:0x0277, B:26:0x006c, B:36:0x009b, B:27:0x0070, B:33:0x0087, B:30:0x0077), top: B:122:0x0012 }] */
            /* JADX WARN: Code duplicated, block: B:35:0x0099  */
            /* JADX WARN: Code duplicated, block: B:36:0x009b A[Catch: all -> 0x028f, PHI: r15
              0x009b: PHI (r15v8 java.lang.Object) = (r15v7 java.lang.Object), (r15v0 java.lang.Object) binds: [B:34:0x0097, B:26:0x006c] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {all -> 0x028f, blocks: (B:7:0x0024, B:10:0x002d, B:74:0x0158, B:14:0x003b, B:81:0x0188, B:83:0x01a9, B:85:0x01ad, B:86:0x01af, B:87:0x01b1, B:18:0x004d, B:103:0x022b, B:105:0x024c, B:107:0x0250, B:108:0x0252, B:109:0x0254, B:21:0x0056, B:94:0x01e7, B:96:0x01ed, B:100:0x0216, B:97:0x01f5, B:99:0x01f9, B:112:0x0271, B:113:0x0276, B:24:0x0063, B:48:0x00dc, B:55:0x00f6, B:57:0x0106, B:59:0x010a, B:60:0x010c, B:61:0x010e, B:64:0x0129, B:66:0x0139, B:68:0x013d, B:69:0x013f, B:70:0x0141, B:77:0x0172, B:90:0x01d0, B:51:0x00e8, B:25:0x0068, B:39:0x00a9, B:41:0x00b0, B:43:0x00b6, B:45:0x00bc, B:114:0x0277, B:26:0x006c, B:36:0x009b, B:27:0x0070, B:33:0x0087, B:30:0x0077), top: B:122:0x0012 }] */
            /* JADX WARN: Code duplicated, block: B:38:0x00a7  */
            /* JADX WARN: Code duplicated, block: B:39:0x00a9 A[Catch: all -> 0x028f, PHI: r15
              0x00a9: PHI (r15v11 java.lang.Object) = (r15v10 java.lang.Object), (r15v0 java.lang.Object) binds: [B:37:0x00a5, B:25:0x0068] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {all -> 0x028f, blocks: (B:7:0x0024, B:10:0x002d, B:74:0x0158, B:14:0x003b, B:81:0x0188, B:83:0x01a9, B:85:0x01ad, B:86:0x01af, B:87:0x01b1, B:18:0x004d, B:103:0x022b, B:105:0x024c, B:107:0x0250, B:108:0x0252, B:109:0x0254, B:21:0x0056, B:94:0x01e7, B:96:0x01ed, B:100:0x0216, B:97:0x01f5, B:99:0x01f9, B:112:0x0271, B:113:0x0276, B:24:0x0063, B:48:0x00dc, B:55:0x00f6, B:57:0x0106, B:59:0x010a, B:60:0x010c, B:61:0x010e, B:64:0x0129, B:66:0x0139, B:68:0x013d, B:69:0x013f, B:70:0x0141, B:77:0x0172, B:90:0x01d0, B:51:0x00e8, B:25:0x0068, B:39:0x00a9, B:41:0x00b0, B:43:0x00b6, B:45:0x00bc, B:114:0x0277, B:26:0x006c, B:36:0x009b, B:27:0x0070, B:33:0x0087, B:30:0x0077), top: B:122:0x0012 }] */
            /* JADX WARN: Code duplicated, block: B:41:0x00b0 A[Catch: all -> 0x028f, TryCatch #0 {all -> 0x028f, blocks: (B:7:0x0024, B:10:0x002d, B:74:0x0158, B:14:0x003b, B:81:0x0188, B:83:0x01a9, B:85:0x01ad, B:86:0x01af, B:87:0x01b1, B:18:0x004d, B:103:0x022b, B:105:0x024c, B:107:0x0250, B:108:0x0252, B:109:0x0254, B:21:0x0056, B:94:0x01e7, B:96:0x01ed, B:100:0x0216, B:97:0x01f5, B:99:0x01f9, B:112:0x0271, B:113:0x0276, B:24:0x0063, B:48:0x00dc, B:55:0x00f6, B:57:0x0106, B:59:0x010a, B:60:0x010c, B:61:0x010e, B:64:0x0129, B:66:0x0139, B:68:0x013d, B:69:0x013f, B:70:0x0141, B:77:0x0172, B:90:0x01d0, B:51:0x00e8, B:25:0x0068, B:39:0x00a9, B:41:0x00b0, B:43:0x00b6, B:45:0x00bc, B:114:0x0277, B:26:0x006c, B:36:0x009b, B:27:0x0070, B:33:0x0087, B:30:0x0077), top: B:122:0x0012 }] */
            /* JADX WARN: Code duplicated, block: B:43:0x00b6 A[Catch: all -> 0x028f, TryCatch #0 {all -> 0x028f, blocks: (B:7:0x0024, B:10:0x002d, B:74:0x0158, B:14:0x003b, B:81:0x0188, B:83:0x01a9, B:85:0x01ad, B:86:0x01af, B:87:0x01b1, B:18:0x004d, B:103:0x022b, B:105:0x024c, B:107:0x0250, B:108:0x0252, B:109:0x0254, B:21:0x0056, B:94:0x01e7, B:96:0x01ed, B:100:0x0216, B:97:0x01f5, B:99:0x01f9, B:112:0x0271, B:113:0x0276, B:24:0x0063, B:48:0x00dc, B:55:0x00f6, B:57:0x0106, B:59:0x010a, B:60:0x010c, B:61:0x010e, B:64:0x0129, B:66:0x0139, B:68:0x013d, B:69:0x013f, B:70:0x0141, B:77:0x0172, B:90:0x01d0, B:51:0x00e8, B:25:0x0068, B:39:0x00a9, B:41:0x00b0, B:43:0x00b6, B:45:0x00bc, B:114:0x0277, B:26:0x006c, B:36:0x009b, B:27:0x0070, B:33:0x0087, B:30:0x0077), top: B:122:0x0012 }] */
            /* JADX WARN: Code duplicated, block: B:45:0x00bc A[Catch: all -> 0x028f, TryCatch #0 {all -> 0x028f, blocks: (B:7:0x0024, B:10:0x002d, B:74:0x0158, B:14:0x003b, B:81:0x0188, B:83:0x01a9, B:85:0x01ad, B:86:0x01af, B:87:0x01b1, B:18:0x004d, B:103:0x022b, B:105:0x024c, B:107:0x0250, B:108:0x0252, B:109:0x0254, B:21:0x0056, B:94:0x01e7, B:96:0x01ed, B:100:0x0216, B:97:0x01f5, B:99:0x01f9, B:112:0x0271, B:113:0x0276, B:24:0x0063, B:48:0x00dc, B:55:0x00f6, B:57:0x0106, B:59:0x010a, B:60:0x010c, B:61:0x010e, B:64:0x0129, B:66:0x0139, B:68:0x013d, B:69:0x013f, B:70:0x0141, B:77:0x0172, B:90:0x01d0, B:51:0x00e8, B:25:0x0068, B:39:0x00a9, B:41:0x00b0, B:43:0x00b6, B:45:0x00bc, B:114:0x0277, B:26:0x006c, B:36:0x009b, B:27:0x0070, B:33:0x0087, B:30:0x0077), top: B:122:0x0012 }] */
            /* JADX WARN: Code duplicated, block: B:47:0x00da  */
            /* JADX WARN: Code duplicated, block: B:48:0x00dc A[Catch: all -> 0x028f, PHI: r3 r11
              0x00dc: PHI (r3v4 com.garmin.android.apps.connectmobile.workouts.data.model.WorkoutDetailsDTO) = 
              (r3v3 com.garmin.android.apps.connectmobile.workouts.data.model.WorkoutDetailsDTO)
              (r3v3 com.garmin.android.apps.connectmobile.workouts.data.model.WorkoutDetailsDTO)
              (r3v9 com.garmin.android.apps.connectmobile.workouts.data.model.WorkoutDetailsDTO)
             binds: [B:46:0x00d8, B:44:0x00ba, B:24:0x0063] A[DONT_GENERATE, DONT_INLINE]
              0x00dc: PHI (r11v3 com.garmin.android.apps.connectmobile.workouts.data.model.WorkoutScheduleDTO) = 
              (r11v2 com.garmin.android.apps.connectmobile.workouts.data.model.WorkoutScheduleDTO)
              (r11v2 com.garmin.android.apps.connectmobile.workouts.data.model.WorkoutScheduleDTO)
              (r11v4 com.garmin.android.apps.connectmobile.workouts.data.model.WorkoutScheduleDTO)
             binds: [B:46:0x00d8, B:44:0x00ba, B:24:0x0063] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {all -> 0x028f, blocks: (B:7:0x0024, B:10:0x002d, B:74:0x0158, B:14:0x003b, B:81:0x0188, B:83:0x01a9, B:85:0x01ad, B:86:0x01af, B:87:0x01b1, B:18:0x004d, B:103:0x022b, B:105:0x024c, B:107:0x0250, B:108:0x0252, B:109:0x0254, B:21:0x0056, B:94:0x01e7, B:96:0x01ed, B:100:0x0216, B:97:0x01f5, B:99:0x01f9, B:112:0x0271, B:113:0x0276, B:24:0x0063, B:48:0x00dc, B:55:0x00f6, B:57:0x0106, B:59:0x010a, B:60:0x010c, B:61:0x010e, B:64:0x0129, B:66:0x0139, B:68:0x013d, B:69:0x013f, B:70:0x0141, B:77:0x0172, B:90:0x01d0, B:51:0x00e8, B:25:0x0068, B:39:0x00a9, B:41:0x00b0, B:43:0x00b6, B:45:0x00bc, B:114:0x0277, B:26:0x006c, B:36:0x009b, B:27:0x0070, B:33:0x0087, B:30:0x0077), top: B:122:0x0012 }] */
            /* JADX WARN: Code duplicated, block: B:50:0x00e6  */
            /* JADX WARN: Code duplicated, block: B:51:0x00e8 A[Catch: all -> 0x028f, TryCatch #0 {all -> 0x028f, blocks: (B:7:0x0024, B:10:0x002d, B:74:0x0158, B:14:0x003b, B:81:0x0188, B:83:0x01a9, B:85:0x01ad, B:86:0x01af, B:87:0x01b1, B:18:0x004d, B:103:0x022b, B:105:0x024c, B:107:0x0250, B:108:0x0252, B:109:0x0254, B:21:0x0056, B:94:0x01e7, B:96:0x01ed, B:100:0x0216, B:97:0x01f5, B:99:0x01f9, B:112:0x0271, B:113:0x0276, B:24:0x0063, B:48:0x00dc, B:55:0x00f6, B:57:0x0106, B:59:0x010a, B:60:0x010c, B:61:0x010e, B:64:0x0129, B:66:0x0139, B:68:0x013d, B:69:0x013f, B:70:0x0141, B:77:0x0172, B:90:0x01d0, B:51:0x00e8, B:25:0x0068, B:39:0x00a9, B:41:0x00b0, B:43:0x00b6, B:45:0x00bc, B:114:0x0277, B:26:0x006c, B:36:0x009b, B:27:0x0070, B:33:0x0087, B:30:0x0077), top: B:122:0x0012 }] */
            /* JADX WARN: Code duplicated, block: B:53:0x00f2 A[DONT_INVERT] */
            /* JADX WARN: Code duplicated, block: B:54:0x00f4 A[DONT_INVERT] */
            /* JADX WARN: Code duplicated, block: B:55:0x00f6 A[Catch: all -> 0x028f, TryCatch #0 {all -> 0x028f, blocks: (B:7:0x0024, B:10:0x002d, B:74:0x0158, B:14:0x003b, B:81:0x0188, B:83:0x01a9, B:85:0x01ad, B:86:0x01af, B:87:0x01b1, B:18:0x004d, B:103:0x022b, B:105:0x024c, B:107:0x0250, B:108:0x0252, B:109:0x0254, B:21:0x0056, B:94:0x01e7, B:96:0x01ed, B:100:0x0216, B:97:0x01f5, B:99:0x01f9, B:112:0x0271, B:113:0x0276, B:24:0x0063, B:48:0x00dc, B:55:0x00f6, B:57:0x0106, B:59:0x010a, B:60:0x010c, B:61:0x010e, B:64:0x0129, B:66:0x0139, B:68:0x013d, B:69:0x013f, B:70:0x0141, B:77:0x0172, B:90:0x01d0, B:51:0x00e8, B:25:0x0068, B:39:0x00a9, B:41:0x00b0, B:43:0x00b6, B:45:0x00bc, B:114:0x0277, B:26:0x006c, B:36:0x009b, B:27:0x0070, B:33:0x0087, B:30:0x0077), top: B:122:0x0012 }] */
            /* JADX WARN: Code duplicated, block: B:57:0x0106 A[Catch: all -> 0x028f, TryCatch #0 {all -> 0x028f, blocks: (B:7:0x0024, B:10:0x002d, B:74:0x0158, B:14:0x003b, B:81:0x0188, B:83:0x01a9, B:85:0x01ad, B:86:0x01af, B:87:0x01b1, B:18:0x004d, B:103:0x022b, B:105:0x024c, B:107:0x0250, B:108:0x0252, B:109:0x0254, B:21:0x0056, B:94:0x01e7, B:96:0x01ed, B:100:0x0216, B:97:0x01f5, B:99:0x01f9, B:112:0x0271, B:113:0x0276, B:24:0x0063, B:48:0x00dc, B:55:0x00f6, B:57:0x0106, B:59:0x010a, B:60:0x010c, B:61:0x010e, B:64:0x0129, B:66:0x0139, B:68:0x013d, B:69:0x013f, B:70:0x0141, B:77:0x0172, B:90:0x01d0, B:51:0x00e8, B:25:0x0068, B:39:0x00a9, B:41:0x00b0, B:43:0x00b6, B:45:0x00bc, B:114:0x0277, B:26:0x006c, B:36:0x009b, B:27:0x0070, B:33:0x0087, B:30:0x0077), top: B:122:0x0012 }] */
            /* JADX WARN: Code duplicated, block: B:59:0x010a A[Catch: all -> 0x028f, TryCatch #0 {all -> 0x028f, blocks: (B:7:0x0024, B:10:0x002d, B:74:0x0158, B:14:0x003b, B:81:0x0188, B:83:0x01a9, B:85:0x01ad, B:86:0x01af, B:87:0x01b1, B:18:0x004d, B:103:0x022b, B:105:0x024c, B:107:0x0250, B:108:0x0252, B:109:0x0254, B:21:0x0056, B:94:0x01e7, B:96:0x01ed, B:100:0x0216, B:97:0x01f5, B:99:0x01f9, B:112:0x0271, B:113:0x0276, B:24:0x0063, B:48:0x00dc, B:55:0x00f6, B:57:0x0106, B:59:0x010a, B:60:0x010c, B:61:0x010e, B:64:0x0129, B:66:0x0139, B:68:0x013d, B:69:0x013f, B:70:0x0141, B:77:0x0172, B:90:0x01d0, B:51:0x00e8, B:25:0x0068, B:39:0x00a9, B:41:0x00b0, B:43:0x00b6, B:45:0x00bc, B:114:0x0277, B:26:0x006c, B:36:0x009b, B:27:0x0070, B:33:0x0087, B:30:0x0077), top: B:122:0x0012 }] */
            /* JADX WARN: Code duplicated, block: B:63:0x0127  */
            /* JADX WARN: Code duplicated, block: B:64:0x0129 A[Catch: all -> 0x028f, TryCatch #0 {all -> 0x028f, blocks: (B:7:0x0024, B:10:0x002d, B:74:0x0158, B:14:0x003b, B:81:0x0188, B:83:0x01a9, B:85:0x01ad, B:86:0x01af, B:87:0x01b1, B:18:0x004d, B:103:0x022b, B:105:0x024c, B:107:0x0250, B:108:0x0252, B:109:0x0254, B:21:0x0056, B:94:0x01e7, B:96:0x01ed, B:100:0x0216, B:97:0x01f5, B:99:0x01f9, B:112:0x0271, B:113:0x0276, B:24:0x0063, B:48:0x00dc, B:55:0x00f6, B:57:0x0106, B:59:0x010a, B:60:0x010c, B:61:0x010e, B:64:0x0129, B:66:0x0139, B:68:0x013d, B:69:0x013f, B:70:0x0141, B:77:0x0172, B:90:0x01d0, B:51:0x00e8, B:25:0x0068, B:39:0x00a9, B:41:0x00b0, B:43:0x00b6, B:45:0x00bc, B:114:0x0277, B:26:0x006c, B:36:0x009b, B:27:0x0070, B:33:0x0087, B:30:0x0077), top: B:122:0x0012 }] */
            /* JADX WARN: Code duplicated, block: B:66:0x0139 A[Catch: all -> 0x028f, TryCatch #0 {all -> 0x028f, blocks: (B:7:0x0024, B:10:0x002d, B:74:0x0158, B:14:0x003b, B:81:0x0188, B:83:0x01a9, B:85:0x01ad, B:86:0x01af, B:87:0x01b1, B:18:0x004d, B:103:0x022b, B:105:0x024c, B:107:0x0250, B:108:0x0252, B:109:0x0254, B:21:0x0056, B:94:0x01e7, B:96:0x01ed, B:100:0x0216, B:97:0x01f5, B:99:0x01f9, B:112:0x0271, B:113:0x0276, B:24:0x0063, B:48:0x00dc, B:55:0x00f6, B:57:0x0106, B:59:0x010a, B:60:0x010c, B:61:0x010e, B:64:0x0129, B:66:0x0139, B:68:0x013d, B:69:0x013f, B:70:0x0141, B:77:0x0172, B:90:0x01d0, B:51:0x00e8, B:25:0x0068, B:39:0x00a9, B:41:0x00b0, B:43:0x00b6, B:45:0x00bc, B:114:0x0277, B:26:0x006c, B:36:0x009b, B:27:0x0070, B:33:0x0087, B:30:0x0077), top: B:122:0x0012 }] */
            /* JADX WARN: Code duplicated, block: B:68:0x013d A[Catch: all -> 0x028f, TryCatch #0 {all -> 0x028f, blocks: (B:7:0x0024, B:10:0x002d, B:74:0x0158, B:14:0x003b, B:81:0x0188, B:83:0x01a9, B:85:0x01ad, B:86:0x01af, B:87:0x01b1, B:18:0x004d, B:103:0x022b, B:105:0x024c, B:107:0x0250, B:108:0x0252, B:109:0x0254, B:21:0x0056, B:94:0x01e7, B:96:0x01ed, B:100:0x0216, B:97:0x01f5, B:99:0x01f9, B:112:0x0271, B:113:0x0276, B:24:0x0063, B:48:0x00dc, B:55:0x00f6, B:57:0x0106, B:59:0x010a, B:60:0x010c, B:61:0x010e, B:64:0x0129, B:66:0x0139, B:68:0x013d, B:69:0x013f, B:70:0x0141, B:77:0x0172, B:90:0x01d0, B:51:0x00e8, B:25:0x0068, B:39:0x00a9, B:41:0x00b0, B:43:0x00b6, B:45:0x00bc, B:114:0x0277, B:26:0x006c, B:36:0x009b, B:27:0x0070, B:33:0x0087, B:30:0x0077), top: B:122:0x0012 }] */
            /* JADX WARN: Code duplicated, block: B:72:0x0155  */
            /* JADX WARN: Code duplicated, block: B:73:0x0157  */
            /* JADX WARN: Code duplicated, block: B:76:0x0170  */
            /* JADX WARN: Code duplicated, block: B:77:0x0172 A[Catch: all -> 0x028f, TryCatch #0 {all -> 0x028f, blocks: (B:7:0x0024, B:10:0x002d, B:74:0x0158, B:14:0x003b, B:81:0x0188, B:83:0x01a9, B:85:0x01ad, B:86:0x01af, B:87:0x01b1, B:18:0x004d, B:103:0x022b, B:105:0x024c, B:107:0x0250, B:108:0x0252, B:109:0x0254, B:21:0x0056, B:94:0x01e7, B:96:0x01ed, B:100:0x0216, B:97:0x01f5, B:99:0x01f9, B:112:0x0271, B:113:0x0276, B:24:0x0063, B:48:0x00dc, B:55:0x00f6, B:57:0x0106, B:59:0x010a, B:60:0x010c, B:61:0x010e, B:64:0x0129, B:66:0x0139, B:68:0x013d, B:69:0x013f, B:70:0x0141, B:77:0x0172, B:90:0x01d0, B:51:0x00e8, B:25:0x0068, B:39:0x00a9, B:41:0x00b0, B:43:0x00b6, B:45:0x00bc, B:114:0x0277, B:26:0x006c, B:36:0x009b, B:27:0x0070, B:33:0x0087, B:30:0x0077), top: B:122:0x0012 }] */
            /* JADX WARN: Code duplicated, block: B:79:0x0184  */
            /* JADX WARN: Code duplicated, block: B:80:0x0186  */
            /* JADX WARN: Code duplicated, block: B:83:0x01a9 A[Catch: all -> 0x028f, TryCatch #0 {all -> 0x028f, blocks: (B:7:0x0024, B:10:0x002d, B:74:0x0158, B:14:0x003b, B:81:0x0188, B:83:0x01a9, B:85:0x01ad, B:86:0x01af, B:87:0x01b1, B:18:0x004d, B:103:0x022b, B:105:0x024c, B:107:0x0250, B:108:0x0252, B:109:0x0254, B:21:0x0056, B:94:0x01e7, B:96:0x01ed, B:100:0x0216, B:97:0x01f5, B:99:0x01f9, B:112:0x0271, B:113:0x0276, B:24:0x0063, B:48:0x00dc, B:55:0x00f6, B:57:0x0106, B:59:0x010a, B:60:0x010c, B:61:0x010e, B:64:0x0129, B:66:0x0139, B:68:0x013d, B:69:0x013f, B:70:0x0141, B:77:0x0172, B:90:0x01d0, B:51:0x00e8, B:25:0x0068, B:39:0x00a9, B:41:0x00b0, B:43:0x00b6, B:45:0x00bc, B:114:0x0277, B:26:0x006c, B:36:0x009b, B:27:0x0070, B:33:0x0087, B:30:0x0077), top: B:122:0x0012 }] */
            /* JADX WARN: Code duplicated, block: B:85:0x01ad A[Catch: all -> 0x028f, TryCatch #0 {all -> 0x028f, blocks: (B:7:0x0024, B:10:0x002d, B:74:0x0158, B:14:0x003b, B:81:0x0188, B:83:0x01a9, B:85:0x01ad, B:86:0x01af, B:87:0x01b1, B:18:0x004d, B:103:0x022b, B:105:0x024c, B:107:0x0250, B:108:0x0252, B:109:0x0254, B:21:0x0056, B:94:0x01e7, B:96:0x01ed, B:100:0x0216, B:97:0x01f5, B:99:0x01f9, B:112:0x0271, B:113:0x0276, B:24:0x0063, B:48:0x00dc, B:55:0x00f6, B:57:0x0106, B:59:0x010a, B:60:0x010c, B:61:0x010e, B:64:0x0129, B:66:0x0139, B:68:0x013d, B:69:0x013f, B:70:0x0141, B:77:0x0172, B:90:0x01d0, B:51:0x00e8, B:25:0x0068, B:39:0x00a9, B:41:0x00b0, B:43:0x00b6, B:45:0x00bc, B:114:0x0277, B:26:0x006c, B:36:0x009b, B:27:0x0070, B:33:0x0087, B:30:0x0077), top: B:122:0x0012 }] */
            /* JADX WARN: Code duplicated, block: B:89:0x01ce  */
            /* JADX WARN: Code duplicated, block: B:90:0x01d0 A[Catch: all -> 0x028f, TryCatch #0 {all -> 0x028f, blocks: (B:7:0x0024, B:10:0x002d, B:74:0x0158, B:14:0x003b, B:81:0x0188, B:83:0x01a9, B:85:0x01ad, B:86:0x01af, B:87:0x01b1, B:18:0x004d, B:103:0x022b, B:105:0x024c, B:107:0x0250, B:108:0x0252, B:109:0x0254, B:21:0x0056, B:94:0x01e7, B:96:0x01ed, B:100:0x0216, B:97:0x01f5, B:99:0x01f9, B:112:0x0271, B:113:0x0276, B:24:0x0063, B:48:0x00dc, B:55:0x00f6, B:57:0x0106, B:59:0x010a, B:60:0x010c, B:61:0x010e, B:64:0x0129, B:66:0x0139, B:68:0x013d, B:69:0x013f, B:70:0x0141, B:77:0x0172, B:90:0x01d0, B:51:0x00e8, B:25:0x0068, B:39:0x00a9, B:41:0x00b0, B:43:0x00b6, B:45:0x00bc, B:114:0x0277, B:26:0x006c, B:36:0x009b, B:27:0x0070, B:33:0x0087, B:30:0x0077), top: B:122:0x0012 }] */
            /* JADX WARN: Code duplicated, block: B:92:0x01e3  */
            /* JADX WARN: Code duplicated, block: B:93:0x01e5  */
            /* JADX WARN: Code duplicated, block: B:96:0x01ed A[Catch: all -> 0x028f, TryCatch #0 {all -> 0x028f, blocks: (B:7:0x0024, B:10:0x002d, B:74:0x0158, B:14:0x003b, B:81:0x0188, B:83:0x01a9, B:85:0x01ad, B:86:0x01af, B:87:0x01b1, B:18:0x004d, B:103:0x022b, B:105:0x024c, B:107:0x0250, B:108:0x0252, B:109:0x0254, B:21:0x0056, B:94:0x01e7, B:96:0x01ed, B:100:0x0216, B:97:0x01f5, B:99:0x01f9, B:112:0x0271, B:113:0x0276, B:24:0x0063, B:48:0x00dc, B:55:0x00f6, B:57:0x0106, B:59:0x010a, B:60:0x010c, B:61:0x010e, B:64:0x0129, B:66:0x0139, B:68:0x013d, B:69:0x013f, B:70:0x0141, B:77:0x0172, B:90:0x01d0, B:51:0x00e8, B:25:0x0068, B:39:0x00a9, B:41:0x00b0, B:43:0x00b6, B:45:0x00bc, B:114:0x0277, B:26:0x006c, B:36:0x009b, B:27:0x0070, B:33:0x0087, B:30:0x0077), top: B:122:0x0012 }] */
            /* JADX WARN: Code duplicated, block: B:97:0x01f5 A[Catch: all -> 0x028f, TryCatch #0 {all -> 0x028f, blocks: (B:7:0x0024, B:10:0x002d, B:74:0x0158, B:14:0x003b, B:81:0x0188, B:83:0x01a9, B:85:0x01ad, B:86:0x01af, B:87:0x01b1, B:18:0x004d, B:103:0x022b, B:105:0x024c, B:107:0x0250, B:108:0x0252, B:109:0x0254, B:21:0x0056, B:94:0x01e7, B:96:0x01ed, B:100:0x0216, B:97:0x01f5, B:99:0x01f9, B:112:0x0271, B:113:0x0276, B:24:0x0063, B:48:0x00dc, B:55:0x00f6, B:57:0x0106, B:59:0x010a, B:60:0x010c, B:61:0x010e, B:64:0x0129, B:66:0x0139, B:68:0x013d, B:69:0x013f, B:70:0x0141, B:77:0x0172, B:90:0x01d0, B:51:0x00e8, B:25:0x0068, B:39:0x00a9, B:41:0x00b0, B:43:0x00b6, B:45:0x00bc, B:114:0x0277, B:26:0x006c, B:36:0x009b, B:27:0x0070, B:33:0x0087, B:30:0x0077), top: B:122:0x0012 }] */
            /* JADX WARN: Code duplicated, block: B:99:0x01f9 A[Catch: all -> 0x028f, TryCatch #0 {all -> 0x028f, blocks: (B:7:0x0024, B:10:0x002d, B:74:0x0158, B:14:0x003b, B:81:0x0188, B:83:0x01a9, B:85:0x01ad, B:86:0x01af, B:87:0x01b1, B:18:0x004d, B:103:0x022b, B:105:0x024c, B:107:0x0250, B:108:0x0252, B:109:0x0254, B:21:0x0056, B:94:0x01e7, B:96:0x01ed, B:100:0x0216, B:97:0x01f5, B:99:0x01f9, B:112:0x0271, B:113:0x0276, B:24:0x0063, B:48:0x00dc, B:55:0x00f6, B:57:0x0106, B:59:0x010a, B:60:0x010c, B:61:0x010e, B:64:0x0129, B:66:0x0139, B:68:0x013d, B:69:0x013f, B:70:0x0141, B:77:0x0172, B:90:0x01d0, B:51:0x00e8, B:25:0x0068, B:39:0x00a9, B:41:0x00b0, B:43:0x00b6, B:45:0x00bc, B:114:0x0277, B:26:0x006c, B:36:0x009b, B:27:0x0070, B:33:0x0087, B:30:0x0077), top: B:122:0x0012 }] */
            /* JADX WARN: Code restructure failed: missing block: B:115:0x028c, code lost:
            
                if (r15.emit(r0, r14) == r2) goto L119;
             */
            /* JADX WARN: Code restructure failed: missing block: B:118:0x02a8, code lost:
            
                if (r15.emit(r0, r14) == r2) goto L119;
             */
            /* JADX WARN: Instruction removed from duplicated block: B:99:0x01f9, please report this as an issue */
            @Override // v13.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                WorkoutScheduleDTO workoutScheduleDTO;
                WorkoutDetailsDTO workoutDetailsDTO;
                String strA;
                Boolean bool;
                m52.k kVarR4;
                int i14;
                m52.k kVar;
                WorkoutScheduleDTO workoutScheduleDTO2;
                m52.k kVar2;
                WorkoutScheduleDTO workoutScheduleDTO3;
                f fVar;
                v2 v2Var;
                List<com.garmin.android.apps.connectmobile.workouts.data.model.v> list;
                b0 b0Var = (b0) this.f48644f;
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i15 = this.f48643e;
                f fVar2 = this.f48645g;
                try {
                    switch (i15) {
                        case 0:
                            o13.r.b(obj);
                            r53.j<v52.c<? extends com.garmin.android.apps.connectmobile.workouts.presentation.details.e>> jVar = fVar2.Y;
                            v52.c.b bVar = v52.c.b.f175759a;
                            this.f48644f = b0Var;
                            this.f48643e = 1;
                            if (jVar.emit(bVar, this) != aVar) {
                                l52.y yVar = fVar2.f48588b;
                                String strValueOf = String.valueOf(this.f48646h);
                                this.f48644f = b0Var;
                                this.f48643e = 2;
                                obj = yVar.I(strValueOf);
                                if (obj == aVar) {
                                    this.f48644f = b0Var;
                                    this.f48643e = 3;
                                    obj = ((o53.i0) obj).await(this);
                                    if (obj != aVar) {
                                        workoutScheduleDTO = (WorkoutScheduleDTO) obj;
                                        workoutDetailsDTO = workoutScheduleDTO.f48065a;
                                        if (workoutDetailsDTO != null) {
                                            r53.j<v52.c<? extends com.garmin.android.apps.connectmobile.workouts.presentation.details.e>> jVar2 = fVar2.Y;
                                            v52.c.a aVar2 = new v52.c.a(null, 1, null);
                                            this.f48644f = null;
                                            this.f48639a = null;
                                            this.f48640b = null;
                                            this.f48643e = 13;
                                            break;
                                        } else {
                                            if (workoutDetailsDTO.H() || workoutDetailsDTO.F()) {
                                                int i16 = f.J0;
                                                Resources resourcesQ4 = fVar2.Q4();
                                                resourcesQ4.getClass();
                                                strA = i62.n.a(resourcesQ4);
                                                this.f48644f = b0Var;
                                                this.f48639a = workoutScheduleDTO;
                                                this.f48640b = workoutDetailsDTO;
                                                this.f48641c = null;
                                                this.f48643e = 4;
                                                if (f.y4(fVar2, strA, workoutDetailsDTO, this) == aVar) {
                                                }
                                            }
                                            int i17 = f.J0;
                                            bool = Boolean.FALSE;
                                            kVarR4 = fVar2.R4(workoutDetailsDTO, bool);
                                            if (kVarR4 == null) {
                                                i14 = -1;
                                            } else {
                                                i14 = C0948a.f48647a[kVarR4.ordinal()];
                                            }
                                            if (i14 != 1) {
                                                l52.y yVar2 = fVar2.f48588b;
                                                this.f48644f = b0Var;
                                                this.f48639a = workoutScheduleDTO;
                                                this.f48640b = null;
                                                this.f48641c = kVarR4;
                                                this.f48643e = 5;
                                                obj = yVar2.Y(this);
                                                if (obj == aVar) {
                                                    kVar = kVarR4;
                                                    workoutScheduleDTO2 = workoutScheduleDTO;
                                                    v2Var = (v2) obj;
                                                    if (v2Var instanceof v2.b) {
                                                        list = (List) ((v2.b) v2Var).f47386a;
                                                    } else {
                                                        if (!(v2Var instanceof v2.a)) {
                                                            throw new NoWhenBranchMatchedException();
                                                        }
                                                        String str = "Error retrieving PowerCurve Targets Data. Error=" + ((v2.a) v2Var).f47383a;
                                                        i2.a aVar3 = i2.f36769a;
                                                        a2 a2Var = a2.GENERAL;
                                                        aVar3.getClass();
                                                        i2.a.f(a2Var, "WorkoutDetailsViewModel", str);
                                                        list = null;
                                                    }
                                                    this.f48644f = null;
                                                    this.f48639a = workoutScheduleDTO2;
                                                    this.f48640b = null;
                                                    this.f48641c = kVar;
                                                    this.f48642d = list;
                                                    this.f48643e = 6;
                                                    obj = f.A4(fVar2, this);
                                                    if (obj != aVar) {
                                                        PowerZonesDTO powerZonesDTO = (PowerZonesDTO) obj;
                                                        fVar2.f48606t = workoutScheduleDTO2;
                                                        fVar2.f48605r = workoutScheduleDTO2.f48065a;
                                                        fVar2.f48608w = list;
                                                        x52.g.a aVar4 = x52.g.f189104d;
                                                        Resources resourcesQ5 = fVar2.Q4();
                                                        resourcesQ5.getClass();
                                                        aVar4.getClass();
                                                        x52.g.a.b(resourcesQ5, kVar, powerZonesDTO);
                                                        fVar2.f48610y = powerZonesDTO;
                                                        if (!fVar2.Y4()) {
                                                            WorkoutDetailsDTO workoutDetailsDTO2 = fVar2.f48605r;
                                                            fVar2.C = workoutDetailsDTO2 != null ? workoutDetailsDTO2.Y : -1L;
                                                        }
                                                        fVar2.f48602o = new o13.p<>(Boolean.FALSE, null);
                                                        this.f48644f = null;
                                                        this.f48639a = null;
                                                        this.f48640b = null;
                                                        this.f48641c = null;
                                                        this.f48642d = null;
                                                        this.f48643e = 7;
                                                        if (f.x4(fVar2, this) == aVar) {
                                                        }
                                                        return Unit.INSTANCE;
                                                    }
                                                }
                                            } else if (i14 != 2) {
                                                this.f48644f = null;
                                                this.f48639a = workoutScheduleDTO;
                                                this.f48640b = null;
                                                this.f48641c = kVarR4;
                                                this.f48643e = 8;
                                                obj = f.A4(fVar2, this);
                                                if (obj == aVar) {
                                                    kVar2 = kVarR4;
                                                    workoutScheduleDTO3 = workoutScheduleDTO;
                                                    PowerZonesDTO powerZonesDTO2 = (PowerZonesDTO) obj;
                                                    fVar2.f48606t = workoutScheduleDTO3;
                                                    fVar2.f48605r = workoutScheduleDTO3.f48065a;
                                                    fVar2.f48608w = null;
                                                    x52.g.a aVar5 = x52.g.f189104d;
                                                    Resources resourcesQ6 = fVar2.Q4();
                                                    resourcesQ6.getClass();
                                                    aVar5.getClass();
                                                    x52.g.a.b(resourcesQ6, kVar2, powerZonesDTO2);
                                                    fVar2.f48610y = powerZonesDTO2;
                                                    if (!fVar2.Y4()) {
                                                        WorkoutDetailsDTO workoutDetailsDTO3 = fVar2.f48605r;
                                                        fVar2.C = workoutDetailsDTO3 != null ? workoutDetailsDTO3.Y : -1L;
                                                    }
                                                    fVar2.f48602o = new o13.p<>(Boolean.FALSE, null);
                                                    this.f48644f = null;
                                                    this.f48639a = null;
                                                    this.f48640b = null;
                                                    this.f48641c = null;
                                                    this.f48642d = null;
                                                    this.f48643e = 9;
                                                    if (f.x4(fVar2, this) == aVar) {
                                                    }
                                                    return Unit.INSTANCE;
                                                }
                                            } else {
                                                if (i14 != 3) {
                                                    fVar2.f48606t = workoutScheduleDTO;
                                                    fVar2.f48605r = workoutScheduleDTO.f48065a;
                                                    fVar2.f48608w = null;
                                                    fVar2.f48610y = null;
                                                    if (!fVar2.Y4()) {
                                                        WorkoutDetailsDTO workoutDetailsDTO4 = fVar2.f48605r;
                                                        fVar2.C = workoutDetailsDTO4 != null ? workoutDetailsDTO4.Y : -1L;
                                                    }
                                                    fVar2.f48602o = new o13.p<>(bool, null);
                                                    this.f48644f = null;
                                                    this.f48639a = null;
                                                    this.f48640b = null;
                                                    this.f48641c = null;
                                                    this.f48643e = 12;
                                                    if (f.x4(fVar2, this) == aVar) {
                                                    }
                                                    return Unit.INSTANCE;
                                                }
                                                fVar2.f48606t = workoutScheduleDTO;
                                                fVar2.f48605r = workoutScheduleDTO.f48065a;
                                                fVar2.f48608w = null;
                                                fVar2.f48610y = null;
                                                if (!fVar2.Y4()) {
                                                    WorkoutDetailsDTO workoutDetailsDTO5 = fVar2.f48605r;
                                                    fVar2.C = workoutDetailsDTO5 != null ? workoutDetailsDTO5.Y : -1L;
                                                }
                                                this.f48644f = null;
                                                this.f48639a = null;
                                                this.f48640b = null;
                                                this.f48641c = null;
                                                this.f48642d = fVar2;
                                                this.f48643e = 10;
                                                obj = f.D4(fVar2, this);
                                                if (obj == aVar) {
                                                    fVar = fVar2;
                                                    fVar.f48602o = (o13.p) obj;
                                                    this.f48644f = null;
                                                    this.f48639a = null;
                                                    this.f48640b = null;
                                                    this.f48641c = null;
                                                    this.f48642d = null;
                                                    this.f48643e = 11;
                                                    if (f.x4(fVar2, this) == aVar) {
                                                    }
                                                    return Unit.INSTANCE;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            return aVar;
                        case 1:
                            o13.r.b(obj);
                            l52.y yVar3 = fVar2.f48588b;
                            String strValueOf2 = String.valueOf(this.f48646h);
                            this.f48644f = b0Var;
                            this.f48643e = 2;
                            obj = yVar3.I(strValueOf2);
                            if (obj == aVar) {
                                this.f48644f = b0Var;
                                this.f48643e = 3;
                                obj = ((o53.i0) obj).await(this);
                                if (obj != aVar) {
                                    workoutScheduleDTO = (WorkoutScheduleDTO) obj;
                                    workoutDetailsDTO = workoutScheduleDTO.f48065a;
                                    if (workoutDetailsDTO != null) {
                                        r53.j<v52.c<? extends com.garmin.android.apps.connectmobile.workouts.presentation.details.e>> jVar3 = fVar2.Y;
                                        v52.c.a aVar6 = new v52.c.a(null, 1, null);
                                        this.f48644f = null;
                                        this.f48639a = null;
                                        this.f48640b = null;
                                        this.f48643e = 13;
                                        break;
                                    } else if (workoutDetailsDTO.H()) {
                                        int i18 = f.J0;
                                        Resources resourcesQ7 = fVar2.Q4();
                                        resourcesQ7.getClass();
                                        strA = i62.n.a(resourcesQ7);
                                        this.f48644f = b0Var;
                                        this.f48639a = workoutScheduleDTO;
                                        this.f48640b = workoutDetailsDTO;
                                        this.f48641c = null;
                                        this.f48643e = 4;
                                        if (f.y4(fVar2, strA, workoutDetailsDTO, this) == aVar) {
                                            int i19 = f.J0;
                                            bool = Boolean.FALSE;
                                            kVarR4 = fVar2.R4(workoutDetailsDTO, bool);
                                            if (kVarR4 == null) {
                                                i14 = -1;
                                            } else {
                                                i14 = C0948a.f48647a[kVarR4.ordinal()];
                                            }
                                            if (i14 != 1) {
                                                l52.y yVar4 = fVar2.f48588b;
                                                this.f48644f = b0Var;
                                                this.f48639a = workoutScheduleDTO;
                                                this.f48640b = null;
                                                this.f48641c = kVarR4;
                                                this.f48643e = 5;
                                                obj = yVar4.Y(this);
                                                if (obj == aVar) {
                                                    kVar = kVarR4;
                                                    workoutScheduleDTO2 = workoutScheduleDTO;
                                                    v2Var = (v2) obj;
                                                    if (v2Var instanceof v2.b) {
                                                        list = (List) ((v2.b) v2Var).f47386a;
                                                    } else {
                                                        if (!(v2Var instanceof v2.a)) {
                                                            throw new NoWhenBranchMatchedException();
                                                        }
                                                        String str2 = "Error retrieving PowerCurve Targets Data. Error=" + ((v2.a) v2Var).f47383a;
                                                        i2.a aVar7 = i2.f36769a;
                                                        a2 a2Var2 = a2.GENERAL;
                                                        aVar7.getClass();
                                                        i2.a.f(a2Var2, "WorkoutDetailsViewModel", str2);
                                                        list = null;
                                                    }
                                                    this.f48644f = null;
                                                    this.f48639a = workoutScheduleDTO2;
                                                    this.f48640b = null;
                                                    this.f48641c = kVar;
                                                    this.f48642d = list;
                                                    this.f48643e = 6;
                                                    obj = f.A4(fVar2, this);
                                                    if (obj != aVar) {
                                                        PowerZonesDTO powerZonesDTO3 = (PowerZonesDTO) obj;
                                                        fVar2.f48606t = workoutScheduleDTO2;
                                                        fVar2.f48605r = workoutScheduleDTO2.f48065a;
                                                        fVar2.f48608w = list;
                                                        x52.g.a aVar8 = x52.g.f189104d;
                                                        Resources resourcesQ8 = fVar2.Q4();
                                                        resourcesQ8.getClass();
                                                        aVar8.getClass();
                                                        x52.g.a.b(resourcesQ8, kVar, powerZonesDTO3);
                                                        fVar2.f48610y = powerZonesDTO3;
                                                        if (!fVar2.Y4()) {
                                                            WorkoutDetailsDTO workoutDetailsDTO6 = fVar2.f48605r;
                                                            fVar2.C = workoutDetailsDTO6 != null ? workoutDetailsDTO6.Y : -1L;
                                                        }
                                                        fVar2.f48602o = new o13.p<>(Boolean.FALSE, null);
                                                        this.f48644f = null;
                                                        this.f48639a = null;
                                                        this.f48640b = null;
                                                        this.f48641c = null;
                                                        this.f48642d = null;
                                                        this.f48643e = 7;
                                                        if (f.x4(fVar2, this) == aVar) {
                                                        }
                                                        return Unit.INSTANCE;
                                                    }
                                                }
                                            } else if (i14 != 2) {
                                                this.f48644f = null;
                                                this.f48639a = workoutScheduleDTO;
                                                this.f48640b = null;
                                                this.f48641c = kVarR4;
                                                this.f48643e = 8;
                                                obj = f.A4(fVar2, this);
                                                if (obj == aVar) {
                                                    kVar2 = kVarR4;
                                                    workoutScheduleDTO3 = workoutScheduleDTO;
                                                    PowerZonesDTO powerZonesDTO4 = (PowerZonesDTO) obj;
                                                    fVar2.f48606t = workoutScheduleDTO3;
                                                    fVar2.f48605r = workoutScheduleDTO3.f48065a;
                                                    fVar2.f48608w = null;
                                                    x52.g.a aVar9 = x52.g.f189104d;
                                                    Resources resourcesQ9 = fVar2.Q4();
                                                    resourcesQ9.getClass();
                                                    aVar9.getClass();
                                                    x52.g.a.b(resourcesQ9, kVar2, powerZonesDTO4);
                                                    fVar2.f48610y = powerZonesDTO4;
                                                    if (!fVar2.Y4()) {
                                                        WorkoutDetailsDTO workoutDetailsDTO7 = fVar2.f48605r;
                                                        fVar2.C = workoutDetailsDTO7 != null ? workoutDetailsDTO7.Y : -1L;
                                                    }
                                                    fVar2.f48602o = new o13.p<>(Boolean.FALSE, null);
                                                    this.f48644f = null;
                                                    this.f48639a = null;
                                                    this.f48640b = null;
                                                    this.f48641c = null;
                                                    this.f48642d = null;
                                                    this.f48643e = 9;
                                                    if (f.x4(fVar2, this) == aVar) {
                                                    }
                                                    return Unit.INSTANCE;
                                                }
                                            } else {
                                                if (i14 != 3) {
                                                    fVar2.f48606t = workoutScheduleDTO;
                                                    fVar2.f48605r = workoutScheduleDTO.f48065a;
                                                    fVar2.f48608w = null;
                                                    fVar2.f48610y = null;
                                                    if (!fVar2.Y4()) {
                                                        WorkoutDetailsDTO workoutDetailsDTO8 = fVar2.f48605r;
                                                        fVar2.C = workoutDetailsDTO8 != null ? workoutDetailsDTO8.Y : -1L;
                                                    }
                                                    fVar2.f48602o = new o13.p<>(bool, null);
                                                    this.f48644f = null;
                                                    this.f48639a = null;
                                                    this.f48640b = null;
                                                    this.f48641c = null;
                                                    this.f48643e = 12;
                                                    if (f.x4(fVar2, this) == aVar) {
                                                    }
                                                    return Unit.INSTANCE;
                                                }
                                                fVar2.f48606t = workoutScheduleDTO;
                                                fVar2.f48605r = workoutScheduleDTO.f48065a;
                                                fVar2.f48608w = null;
                                                fVar2.f48610y = null;
                                                if (!fVar2.Y4()) {
                                                    WorkoutDetailsDTO workoutDetailsDTO9 = fVar2.f48605r;
                                                    fVar2.C = workoutDetailsDTO9 != null ? workoutDetailsDTO9.Y : -1L;
                                                }
                                                this.f48644f = null;
                                                this.f48639a = null;
                                                this.f48640b = null;
                                                this.f48641c = null;
                                                this.f48642d = fVar2;
                                                this.f48643e = 10;
                                                obj = f.D4(fVar2, this);
                                                if (obj == aVar) {
                                                    fVar = fVar2;
                                                    fVar.f48602o = (o13.p) obj;
                                                    this.f48644f = null;
                                                    this.f48639a = null;
                                                    this.f48640b = null;
                                                    this.f48641c = null;
                                                    this.f48642d = null;
                                                    this.f48643e = 11;
                                                    if (f.x4(fVar2, this) == aVar) {
                                                    }
                                                    return Unit.INSTANCE;
                                                }
                                            }
                                        }
                                    } else {
                                        int i110 = f.J0;
                                        Resources resourcesQ10 = fVar2.Q4();
                                        resourcesQ10.getClass();
                                        strA = i62.n.a(resourcesQ10);
                                        this.f48644f = b0Var;
                                        this.f48639a = workoutScheduleDTO;
                                        this.f48640b = workoutDetailsDTO;
                                        this.f48641c = null;
                                        this.f48643e = 4;
                                        if (f.y4(fVar2, strA, workoutDetailsDTO, this) == aVar) {
                                            int i111 = f.J0;
                                            bool = Boolean.FALSE;
                                            kVarR4 = fVar2.R4(workoutDetailsDTO, bool);
                                            if (kVarR4 == null) {
                                                i14 = -1;
                                            } else {
                                                i14 = C0948a.f48647a[kVarR4.ordinal()];
                                            }
                                            if (i14 != 1) {
                                                l52.y yVar5 = fVar2.f48588b;
                                                this.f48644f = b0Var;
                                                this.f48639a = workoutScheduleDTO;
                                                this.f48640b = null;
                                                this.f48641c = kVarR4;
                                                this.f48643e = 5;
                                                obj = yVar5.Y(this);
                                                if (obj == aVar) {
                                                    kVar = kVarR4;
                                                    workoutScheduleDTO2 = workoutScheduleDTO;
                                                    v2Var = (v2) obj;
                                                    if (v2Var instanceof v2.b) {
                                                        list = (List) ((v2.b) v2Var).f47386a;
                                                    } else {
                                                        if (!(v2Var instanceof v2.a)) {
                                                            throw new NoWhenBranchMatchedException();
                                                        }
                                                        String str3 = "Error retrieving PowerCurve Targets Data. Error=" + ((v2.a) v2Var).f47383a;
                                                        i2.a aVar10 = i2.f36769a;
                                                        a2 a2Var3 = a2.GENERAL;
                                                        aVar10.getClass();
                                                        i2.a.f(a2Var3, "WorkoutDetailsViewModel", str3);
                                                        list = null;
                                                    }
                                                    this.f48644f = null;
                                                    this.f48639a = workoutScheduleDTO2;
                                                    this.f48640b = null;
                                                    this.f48641c = kVar;
                                                    this.f48642d = list;
                                                    this.f48643e = 6;
                                                    obj = f.A4(fVar2, this);
                                                    if (obj != aVar) {
                                                        PowerZonesDTO powerZonesDTO5 = (PowerZonesDTO) obj;
                                                        fVar2.f48606t = workoutScheduleDTO2;
                                                        fVar2.f48605r = workoutScheduleDTO2.f48065a;
                                                        fVar2.f48608w = list;
                                                        x52.g.a aVar11 = x52.g.f189104d;
                                                        Resources resourcesQ11 = fVar2.Q4();
                                                        resourcesQ11.getClass();
                                                        aVar11.getClass();
                                                        x52.g.a.b(resourcesQ11, kVar, powerZonesDTO5);
                                                        fVar2.f48610y = powerZonesDTO5;
                                                        if (!fVar2.Y4()) {
                                                            WorkoutDetailsDTO workoutDetailsDTO10 = fVar2.f48605r;
                                                            fVar2.C = workoutDetailsDTO10 != null ? workoutDetailsDTO10.Y : -1L;
                                                        }
                                                        fVar2.f48602o = new o13.p<>(Boolean.FALSE, null);
                                                        this.f48644f = null;
                                                        this.f48639a = null;
                                                        this.f48640b = null;
                                                        this.f48641c = null;
                                                        this.f48642d = null;
                                                        this.f48643e = 7;
                                                        if (f.x4(fVar2, this) == aVar) {
                                                        }
                                                        return Unit.INSTANCE;
                                                    }
                                                }
                                            } else if (i14 != 2) {
                                                this.f48644f = null;
                                                this.f48639a = workoutScheduleDTO;
                                                this.f48640b = null;
                                                this.f48641c = kVarR4;
                                                this.f48643e = 8;
                                                obj = f.A4(fVar2, this);
                                                if (obj == aVar) {
                                                    kVar2 = kVarR4;
                                                    workoutScheduleDTO3 = workoutScheduleDTO;
                                                    PowerZonesDTO powerZonesDTO6 = (PowerZonesDTO) obj;
                                                    fVar2.f48606t = workoutScheduleDTO3;
                                                    fVar2.f48605r = workoutScheduleDTO3.f48065a;
                                                    fVar2.f48608w = null;
                                                    x52.g.a aVar12 = x52.g.f189104d;
                                                    Resources resourcesQ12 = fVar2.Q4();
                                                    resourcesQ12.getClass();
                                                    aVar12.getClass();
                                                    x52.g.a.b(resourcesQ12, kVar2, powerZonesDTO6);
                                                    fVar2.f48610y = powerZonesDTO6;
                                                    if (!fVar2.Y4()) {
                                                        WorkoutDetailsDTO workoutDetailsDTO11 = fVar2.f48605r;
                                                        fVar2.C = workoutDetailsDTO11 != null ? workoutDetailsDTO11.Y : -1L;
                                                    }
                                                    fVar2.f48602o = new o13.p<>(Boolean.FALSE, null);
                                                    this.f48644f = null;
                                                    this.f48639a = null;
                                                    this.f48640b = null;
                                                    this.f48641c = null;
                                                    this.f48642d = null;
                                                    this.f48643e = 9;
                                                    if (f.x4(fVar2, this) == aVar) {
                                                    }
                                                    return Unit.INSTANCE;
                                                }
                                            } else {
                                                if (i14 != 3) {
                                                    fVar2.f48606t = workoutScheduleDTO;
                                                    fVar2.f48605r = workoutScheduleDTO.f48065a;
                                                    fVar2.f48608w = null;
                                                    fVar2.f48610y = null;
                                                    if (!fVar2.Y4()) {
                                                        WorkoutDetailsDTO workoutDetailsDTO12 = fVar2.f48605r;
                                                        fVar2.C = workoutDetailsDTO12 != null ? workoutDetailsDTO12.Y : -1L;
                                                    }
                                                    fVar2.f48602o = new o13.p<>(bool, null);
                                                    this.f48644f = null;
                                                    this.f48639a = null;
                                                    this.f48640b = null;
                                                    this.f48641c = null;
                                                    this.f48643e = 12;
                                                    if (f.x4(fVar2, this) == aVar) {
                                                    }
                                                    return Unit.INSTANCE;
                                                }
                                                fVar2.f48606t = workoutScheduleDTO;
                                                fVar2.f48605r = workoutScheduleDTO.f48065a;
                                                fVar2.f48608w = null;
                                                fVar2.f48610y = null;
                                                if (!fVar2.Y4()) {
                                                    WorkoutDetailsDTO workoutDetailsDTO13 = fVar2.f48605r;
                                                    fVar2.C = workoutDetailsDTO13 != null ? workoutDetailsDTO13.Y : -1L;
                                                }
                                                this.f48644f = null;
                                                this.f48639a = null;
                                                this.f48640b = null;
                                                this.f48641c = null;
                                                this.f48642d = fVar2;
                                                this.f48643e = 10;
                                                obj = f.D4(fVar2, this);
                                                if (obj == aVar) {
                                                    fVar = fVar2;
                                                    fVar.f48602o = (o13.p) obj;
                                                    this.f48644f = null;
                                                    this.f48639a = null;
                                                    this.f48640b = null;
                                                    this.f48641c = null;
                                                    this.f48642d = null;
                                                    this.f48643e = 11;
                                                    if (f.x4(fVar2, this) == aVar) {
                                                    }
                                                    return Unit.INSTANCE;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            return aVar;
                        case 2:
                            o13.r.b(obj);
                            this.f48644f = b0Var;
                            this.f48643e = 3;
                            obj = ((o53.i0) obj).await(this);
                            if (obj != aVar) {
                                workoutScheduleDTO = (WorkoutScheduleDTO) obj;
                                workoutDetailsDTO = workoutScheduleDTO.f48065a;
                                if (workoutDetailsDTO != null) {
                                    r53.j<v52.c<? extends com.garmin.android.apps.connectmobile.workouts.presentation.details.e>> jVar4 = fVar2.Y;
                                    v52.c.a aVar13 = new v52.c.a(null, 1, null);
                                    this.f48644f = null;
                                    this.f48639a = null;
                                    this.f48640b = null;
                                    this.f48643e = 13;
                                    break;
                                } else if (workoutDetailsDTO.H()) {
                                    int i112 = f.J0;
                                    Resources resourcesQ13 = fVar2.Q4();
                                    resourcesQ13.getClass();
                                    strA = i62.n.a(resourcesQ13);
                                    this.f48644f = b0Var;
                                    this.f48639a = workoutScheduleDTO;
                                    this.f48640b = workoutDetailsDTO;
                                    this.f48641c = null;
                                    this.f48643e = 4;
                                    if (f.y4(fVar2, strA, workoutDetailsDTO, this) == aVar) {
                                        int i113 = f.J0;
                                        bool = Boolean.FALSE;
                                        kVarR4 = fVar2.R4(workoutDetailsDTO, bool);
                                        if (kVarR4 == null) {
                                            i14 = -1;
                                        } else {
                                            i14 = C0948a.f48647a[kVarR4.ordinal()];
                                        }
                                        if (i14 != 1) {
                                            l52.y yVar6 = fVar2.f48588b;
                                            this.f48644f = b0Var;
                                            this.f48639a = workoutScheduleDTO;
                                            this.f48640b = null;
                                            this.f48641c = kVarR4;
                                            this.f48643e = 5;
                                            obj = yVar6.Y(this);
                                            if (obj == aVar) {
                                                kVar = kVarR4;
                                                workoutScheduleDTO2 = workoutScheduleDTO;
                                                v2Var = (v2) obj;
                                                if (v2Var instanceof v2.b) {
                                                    list = (List) ((v2.b) v2Var).f47386a;
                                                } else {
                                                    if (!(v2Var instanceof v2.a)) {
                                                        throw new NoWhenBranchMatchedException();
                                                    }
                                                    String str4 = "Error retrieving PowerCurve Targets Data. Error=" + ((v2.a) v2Var).f47383a;
                                                    i2.a aVar14 = i2.f36769a;
                                                    a2 a2Var4 = a2.GENERAL;
                                                    aVar14.getClass();
                                                    i2.a.f(a2Var4, "WorkoutDetailsViewModel", str4);
                                                    list = null;
                                                }
                                                this.f48644f = null;
                                                this.f48639a = workoutScheduleDTO2;
                                                this.f48640b = null;
                                                this.f48641c = kVar;
                                                this.f48642d = list;
                                                this.f48643e = 6;
                                                obj = f.A4(fVar2, this);
                                                if (obj != aVar) {
                                                    PowerZonesDTO powerZonesDTO7 = (PowerZonesDTO) obj;
                                                    fVar2.f48606t = workoutScheduleDTO2;
                                                    fVar2.f48605r = workoutScheduleDTO2.f48065a;
                                                    fVar2.f48608w = list;
                                                    x52.g.a aVar15 = x52.g.f189104d;
                                                    Resources resourcesQ14 = fVar2.Q4();
                                                    resourcesQ14.getClass();
                                                    aVar15.getClass();
                                                    x52.g.a.b(resourcesQ14, kVar, powerZonesDTO7);
                                                    fVar2.f48610y = powerZonesDTO7;
                                                    if (!fVar2.Y4()) {
                                                        WorkoutDetailsDTO workoutDetailsDTO14 = fVar2.f48605r;
                                                        fVar2.C = workoutDetailsDTO14 != null ? workoutDetailsDTO14.Y : -1L;
                                                    }
                                                    fVar2.f48602o = new o13.p<>(Boolean.FALSE, null);
                                                    this.f48644f = null;
                                                    this.f48639a = null;
                                                    this.f48640b = null;
                                                    this.f48641c = null;
                                                    this.f48642d = null;
                                                    this.f48643e = 7;
                                                    if (f.x4(fVar2, this) == aVar) {
                                                    }
                                                    return Unit.INSTANCE;
                                                }
                                            }
                                        } else if (i14 != 2) {
                                            this.f48644f = null;
                                            this.f48639a = workoutScheduleDTO;
                                            this.f48640b = null;
                                            this.f48641c = kVarR4;
                                            this.f48643e = 8;
                                            obj = f.A4(fVar2, this);
                                            if (obj == aVar) {
                                                kVar2 = kVarR4;
                                                workoutScheduleDTO3 = workoutScheduleDTO;
                                                PowerZonesDTO powerZonesDTO8 = (PowerZonesDTO) obj;
                                                fVar2.f48606t = workoutScheduleDTO3;
                                                fVar2.f48605r = workoutScheduleDTO3.f48065a;
                                                fVar2.f48608w = null;
                                                x52.g.a aVar16 = x52.g.f189104d;
                                                Resources resourcesQ15 = fVar2.Q4();
                                                resourcesQ15.getClass();
                                                aVar16.getClass();
                                                x52.g.a.b(resourcesQ15, kVar2, powerZonesDTO8);
                                                fVar2.f48610y = powerZonesDTO8;
                                                if (!fVar2.Y4()) {
                                                    WorkoutDetailsDTO workoutDetailsDTO15 = fVar2.f48605r;
                                                    fVar2.C = workoutDetailsDTO15 != null ? workoutDetailsDTO15.Y : -1L;
                                                }
                                                fVar2.f48602o = new o13.p<>(Boolean.FALSE, null);
                                                this.f48644f = null;
                                                this.f48639a = null;
                                                this.f48640b = null;
                                                this.f48641c = null;
                                                this.f48642d = null;
                                                this.f48643e = 9;
                                                if (f.x4(fVar2, this) == aVar) {
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        } else {
                                            if (i14 != 3) {
                                                fVar2.f48606t = workoutScheduleDTO;
                                                fVar2.f48605r = workoutScheduleDTO.f48065a;
                                                fVar2.f48608w = null;
                                                fVar2.f48610y = null;
                                                if (!fVar2.Y4()) {
                                                    WorkoutDetailsDTO workoutDetailsDTO16 = fVar2.f48605r;
                                                    fVar2.C = workoutDetailsDTO16 != null ? workoutDetailsDTO16.Y : -1L;
                                                }
                                                fVar2.f48602o = new o13.p<>(bool, null);
                                                this.f48644f = null;
                                                this.f48639a = null;
                                                this.f48640b = null;
                                                this.f48641c = null;
                                                this.f48643e = 12;
                                                if (f.x4(fVar2, this) == aVar) {
                                                }
                                                return Unit.INSTANCE;
                                            }
                                            fVar2.f48606t = workoutScheduleDTO;
                                            fVar2.f48605r = workoutScheduleDTO.f48065a;
                                            fVar2.f48608w = null;
                                            fVar2.f48610y = null;
                                            if (!fVar2.Y4()) {
                                                WorkoutDetailsDTO workoutDetailsDTO17 = fVar2.f48605r;
                                                fVar2.C = workoutDetailsDTO17 != null ? workoutDetailsDTO17.Y : -1L;
                                            }
                                            this.f48644f = null;
                                            this.f48639a = null;
                                            this.f48640b = null;
                                            this.f48641c = null;
                                            this.f48642d = fVar2;
                                            this.f48643e = 10;
                                            obj = f.D4(fVar2, this);
                                            if (obj == aVar) {
                                                fVar = fVar2;
                                                fVar.f48602o = (o13.p) obj;
                                                this.f48644f = null;
                                                this.f48639a = null;
                                                this.f48640b = null;
                                                this.f48641c = null;
                                                this.f48642d = null;
                                                this.f48643e = 11;
                                                if (f.x4(fVar2, this) == aVar) {
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        }
                                    }
                                } else {
                                    int i114 = f.J0;
                                    Resources resourcesQ16 = fVar2.Q4();
                                    resourcesQ16.getClass();
                                    strA = i62.n.a(resourcesQ16);
                                    this.f48644f = b0Var;
                                    this.f48639a = workoutScheduleDTO;
                                    this.f48640b = workoutDetailsDTO;
                                    this.f48641c = null;
                                    this.f48643e = 4;
                                    if (f.y4(fVar2, strA, workoutDetailsDTO, this) == aVar) {
                                        int i115 = f.J0;
                                        bool = Boolean.FALSE;
                                        kVarR4 = fVar2.R4(workoutDetailsDTO, bool);
                                        if (kVarR4 == null) {
                                            i14 = -1;
                                        } else {
                                            i14 = C0948a.f48647a[kVarR4.ordinal()];
                                        }
                                        if (i14 != 1) {
                                            l52.y yVar7 = fVar2.f48588b;
                                            this.f48644f = b0Var;
                                            this.f48639a = workoutScheduleDTO;
                                            this.f48640b = null;
                                            this.f48641c = kVarR4;
                                            this.f48643e = 5;
                                            obj = yVar7.Y(this);
                                            if (obj == aVar) {
                                                kVar = kVarR4;
                                                workoutScheduleDTO2 = workoutScheduleDTO;
                                                v2Var = (v2) obj;
                                                if (v2Var instanceof v2.b) {
                                                    list = (List) ((v2.b) v2Var).f47386a;
                                                } else {
                                                    if (!(v2Var instanceof v2.a)) {
                                                        throw new NoWhenBranchMatchedException();
                                                    }
                                                    String str5 = "Error retrieving PowerCurve Targets Data. Error=" + ((v2.a) v2Var).f47383a;
                                                    i2.a aVar17 = i2.f36769a;
                                                    a2 a2Var5 = a2.GENERAL;
                                                    aVar17.getClass();
                                                    i2.a.f(a2Var5, "WorkoutDetailsViewModel", str5);
                                                    list = null;
                                                }
                                                this.f48644f = null;
                                                this.f48639a = workoutScheduleDTO2;
                                                this.f48640b = null;
                                                this.f48641c = kVar;
                                                this.f48642d = list;
                                                this.f48643e = 6;
                                                obj = f.A4(fVar2, this);
                                                if (obj != aVar) {
                                                    PowerZonesDTO powerZonesDTO9 = (PowerZonesDTO) obj;
                                                    fVar2.f48606t = workoutScheduleDTO2;
                                                    fVar2.f48605r = workoutScheduleDTO2.f48065a;
                                                    fVar2.f48608w = list;
                                                    x52.g.a aVar18 = x52.g.f189104d;
                                                    Resources resourcesQ17 = fVar2.Q4();
                                                    resourcesQ17.getClass();
                                                    aVar18.getClass();
                                                    x52.g.a.b(resourcesQ17, kVar, powerZonesDTO9);
                                                    fVar2.f48610y = powerZonesDTO9;
                                                    if (!fVar2.Y4()) {
                                                        WorkoutDetailsDTO workoutDetailsDTO18 = fVar2.f48605r;
                                                        fVar2.C = workoutDetailsDTO18 != null ? workoutDetailsDTO18.Y : -1L;
                                                    }
                                                    fVar2.f48602o = new o13.p<>(Boolean.FALSE, null);
                                                    this.f48644f = null;
                                                    this.f48639a = null;
                                                    this.f48640b = null;
                                                    this.f48641c = null;
                                                    this.f48642d = null;
                                                    this.f48643e = 7;
                                                    if (f.x4(fVar2, this) == aVar) {
                                                    }
                                                    return Unit.INSTANCE;
                                                }
                                            }
                                        } else if (i14 != 2) {
                                            this.f48644f = null;
                                            this.f48639a = workoutScheduleDTO;
                                            this.f48640b = null;
                                            this.f48641c = kVarR4;
                                            this.f48643e = 8;
                                            obj = f.A4(fVar2, this);
                                            if (obj == aVar) {
                                                kVar2 = kVarR4;
                                                workoutScheduleDTO3 = workoutScheduleDTO;
                                                PowerZonesDTO powerZonesDTO10 = (PowerZonesDTO) obj;
                                                fVar2.f48606t = workoutScheduleDTO3;
                                                fVar2.f48605r = workoutScheduleDTO3.f48065a;
                                                fVar2.f48608w = null;
                                                x52.g.a aVar19 = x52.g.f189104d;
                                                Resources resourcesQ18 = fVar2.Q4();
                                                resourcesQ18.getClass();
                                                aVar19.getClass();
                                                x52.g.a.b(resourcesQ18, kVar2, powerZonesDTO10);
                                                fVar2.f48610y = powerZonesDTO10;
                                                if (!fVar2.Y4()) {
                                                    WorkoutDetailsDTO workoutDetailsDTO19 = fVar2.f48605r;
                                                    fVar2.C = workoutDetailsDTO19 != null ? workoutDetailsDTO19.Y : -1L;
                                                }
                                                fVar2.f48602o = new o13.p<>(Boolean.FALSE, null);
                                                this.f48644f = null;
                                                this.f48639a = null;
                                                this.f48640b = null;
                                                this.f48641c = null;
                                                this.f48642d = null;
                                                this.f48643e = 9;
                                                if (f.x4(fVar2, this) == aVar) {
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        } else {
                                            if (i14 != 3) {
                                                fVar2.f48606t = workoutScheduleDTO;
                                                fVar2.f48605r = workoutScheduleDTO.f48065a;
                                                fVar2.f48608w = null;
                                                fVar2.f48610y = null;
                                                if (!fVar2.Y4()) {
                                                    WorkoutDetailsDTO workoutDetailsDTO110 = fVar2.f48605r;
                                                    fVar2.C = workoutDetailsDTO110 != null ? workoutDetailsDTO110.Y : -1L;
                                                }
                                                fVar2.f48602o = new o13.p<>(bool, null);
                                                this.f48644f = null;
                                                this.f48639a = null;
                                                this.f48640b = null;
                                                this.f48641c = null;
                                                this.f48643e = 12;
                                                if (f.x4(fVar2, this) == aVar) {
                                                }
                                                return Unit.INSTANCE;
                                            }
                                            fVar2.f48606t = workoutScheduleDTO;
                                            fVar2.f48605r = workoutScheduleDTO.f48065a;
                                            fVar2.f48608w = null;
                                            fVar2.f48610y = null;
                                            if (!fVar2.Y4()) {
                                                WorkoutDetailsDTO workoutDetailsDTO111 = fVar2.f48605r;
                                                fVar2.C = workoutDetailsDTO111 != null ? workoutDetailsDTO111.Y : -1L;
                                            }
                                            this.f48644f = null;
                                            this.f48639a = null;
                                            this.f48640b = null;
                                            this.f48641c = null;
                                            this.f48642d = fVar2;
                                            this.f48643e = 10;
                                            obj = f.D4(fVar2, this);
                                            if (obj == aVar) {
                                                fVar = fVar2;
                                                fVar.f48602o = (o13.p) obj;
                                                this.f48644f = null;
                                                this.f48639a = null;
                                                this.f48640b = null;
                                                this.f48641c = null;
                                                this.f48642d = null;
                                                this.f48643e = 11;
                                                if (f.x4(fVar2, this) == aVar) {
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        }
                                    }
                                }
                            }
                            return aVar;
                        case 3:
                            o13.r.b(obj);
                            workoutScheduleDTO = (WorkoutScheduleDTO) obj;
                            workoutDetailsDTO = workoutScheduleDTO.f48065a;
                            if (workoutDetailsDTO != null) {
                                r53.j<v52.c<? extends com.garmin.android.apps.connectmobile.workouts.presentation.details.e>> jVar5 = fVar2.Y;
                                v52.c.a aVar110 = new v52.c.a(null, 1, null);
                                this.f48644f = null;
                                this.f48639a = null;
                                this.f48640b = null;
                                this.f48643e = 13;
                                break;
                            } else if (workoutDetailsDTO.H()) {
                                int i116 = f.J0;
                                Resources resourcesQ19 = fVar2.Q4();
                                resourcesQ19.getClass();
                                strA = i62.n.a(resourcesQ19);
                                this.f48644f = b0Var;
                                this.f48639a = workoutScheduleDTO;
                                this.f48640b = workoutDetailsDTO;
                                this.f48641c = null;
                                this.f48643e = 4;
                                if (f.y4(fVar2, strA, workoutDetailsDTO, this) == aVar) {
                                    int i117 = f.J0;
                                    bool = Boolean.FALSE;
                                    kVarR4 = fVar2.R4(workoutDetailsDTO, bool);
                                    if (kVarR4 == null) {
                                        i14 = -1;
                                    } else {
                                        i14 = C0948a.f48647a[kVarR4.ordinal()];
                                    }
                                    if (i14 != 1) {
                                        l52.y yVar8 = fVar2.f48588b;
                                        this.f48644f = b0Var;
                                        this.f48639a = workoutScheduleDTO;
                                        this.f48640b = null;
                                        this.f48641c = kVarR4;
                                        this.f48643e = 5;
                                        obj = yVar8.Y(this);
                                        if (obj == aVar) {
                                            kVar = kVarR4;
                                            workoutScheduleDTO2 = workoutScheduleDTO;
                                            v2Var = (v2) obj;
                                            if (v2Var instanceof v2.b) {
                                                list = (List) ((v2.b) v2Var).f47386a;
                                            } else {
                                                if (!(v2Var instanceof v2.a)) {
                                                    throw new NoWhenBranchMatchedException();
                                                }
                                                String str6 = "Error retrieving PowerCurve Targets Data. Error=" + ((v2.a) v2Var).f47383a;
                                                i2.a aVar111 = i2.f36769a;
                                                a2 a2Var6 = a2.GENERAL;
                                                aVar111.getClass();
                                                i2.a.f(a2Var6, "WorkoutDetailsViewModel", str6);
                                                list = null;
                                            }
                                            this.f48644f = null;
                                            this.f48639a = workoutScheduleDTO2;
                                            this.f48640b = null;
                                            this.f48641c = kVar;
                                            this.f48642d = list;
                                            this.f48643e = 6;
                                            obj = f.A4(fVar2, this);
                                            if (obj != aVar) {
                                                PowerZonesDTO powerZonesDTO11 = (PowerZonesDTO) obj;
                                                fVar2.f48606t = workoutScheduleDTO2;
                                                fVar2.f48605r = workoutScheduleDTO2.f48065a;
                                                fVar2.f48608w = list;
                                                x52.g.a aVar112 = x52.g.f189104d;
                                                Resources resourcesQ110 = fVar2.Q4();
                                                resourcesQ110.getClass();
                                                aVar112.getClass();
                                                x52.g.a.b(resourcesQ110, kVar, powerZonesDTO11);
                                                fVar2.f48610y = powerZonesDTO11;
                                                if (!fVar2.Y4()) {
                                                    WorkoutDetailsDTO workoutDetailsDTO112 = fVar2.f48605r;
                                                    fVar2.C = workoutDetailsDTO112 != null ? workoutDetailsDTO112.Y : -1L;
                                                }
                                                fVar2.f48602o = new o13.p<>(Boolean.FALSE, null);
                                                this.f48644f = null;
                                                this.f48639a = null;
                                                this.f48640b = null;
                                                this.f48641c = null;
                                                this.f48642d = null;
                                                this.f48643e = 7;
                                                if (f.x4(fVar2, this) == aVar) {
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        }
                                    } else if (i14 != 2) {
                                        this.f48644f = null;
                                        this.f48639a = workoutScheduleDTO;
                                        this.f48640b = null;
                                        this.f48641c = kVarR4;
                                        this.f48643e = 8;
                                        obj = f.A4(fVar2, this);
                                        if (obj == aVar) {
                                            kVar2 = kVarR4;
                                            workoutScheduleDTO3 = workoutScheduleDTO;
                                            PowerZonesDTO powerZonesDTO12 = (PowerZonesDTO) obj;
                                            fVar2.f48606t = workoutScheduleDTO3;
                                            fVar2.f48605r = workoutScheduleDTO3.f48065a;
                                            fVar2.f48608w = null;
                                            x52.g.a aVar113 = x52.g.f189104d;
                                            Resources resourcesQ111 = fVar2.Q4();
                                            resourcesQ111.getClass();
                                            aVar113.getClass();
                                            x52.g.a.b(resourcesQ111, kVar2, powerZonesDTO12);
                                            fVar2.f48610y = powerZonesDTO12;
                                            if (!fVar2.Y4()) {
                                                WorkoutDetailsDTO workoutDetailsDTO113 = fVar2.f48605r;
                                                fVar2.C = workoutDetailsDTO113 != null ? workoutDetailsDTO113.Y : -1L;
                                            }
                                            fVar2.f48602o = new o13.p<>(Boolean.FALSE, null);
                                            this.f48644f = null;
                                            this.f48639a = null;
                                            this.f48640b = null;
                                            this.f48641c = null;
                                            this.f48642d = null;
                                            this.f48643e = 9;
                                            if (f.x4(fVar2, this) == aVar) {
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    } else {
                                        if (i14 != 3) {
                                            fVar2.f48606t = workoutScheduleDTO;
                                            fVar2.f48605r = workoutScheduleDTO.f48065a;
                                            fVar2.f48608w = null;
                                            fVar2.f48610y = null;
                                            if (!fVar2.Y4()) {
                                                WorkoutDetailsDTO workoutDetailsDTO114 = fVar2.f48605r;
                                                fVar2.C = workoutDetailsDTO114 != null ? workoutDetailsDTO114.Y : -1L;
                                            }
                                            fVar2.f48602o = new o13.p<>(bool, null);
                                            this.f48644f = null;
                                            this.f48639a = null;
                                            this.f48640b = null;
                                            this.f48641c = null;
                                            this.f48643e = 12;
                                            if (f.x4(fVar2, this) == aVar) {
                                            }
                                            return Unit.INSTANCE;
                                        }
                                        fVar2.f48606t = workoutScheduleDTO;
                                        fVar2.f48605r = workoutScheduleDTO.f48065a;
                                        fVar2.f48608w = null;
                                        fVar2.f48610y = null;
                                        if (!fVar2.Y4()) {
                                            WorkoutDetailsDTO workoutDetailsDTO115 = fVar2.f48605r;
                                            fVar2.C = workoutDetailsDTO115 != null ? workoutDetailsDTO115.Y : -1L;
                                        }
                                        this.f48644f = null;
                                        this.f48639a = null;
                                        this.f48640b = null;
                                        this.f48641c = null;
                                        this.f48642d = fVar2;
                                        this.f48643e = 10;
                                        obj = f.D4(fVar2, this);
                                        if (obj == aVar) {
                                            fVar = fVar2;
                                            fVar.f48602o = (o13.p) obj;
                                            this.f48644f = null;
                                            this.f48639a = null;
                                            this.f48640b = null;
                                            this.f48641c = null;
                                            this.f48642d = null;
                                            this.f48643e = 11;
                                            if (f.x4(fVar2, this) == aVar) {
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    }
                                }
                            } else {
                                int i118 = f.J0;
                                Resources resourcesQ112 = fVar2.Q4();
                                resourcesQ112.getClass();
                                strA = i62.n.a(resourcesQ112);
                                this.f48644f = b0Var;
                                this.f48639a = workoutScheduleDTO;
                                this.f48640b = workoutDetailsDTO;
                                this.f48641c = null;
                                this.f48643e = 4;
                                if (f.y4(fVar2, strA, workoutDetailsDTO, this) == aVar) {
                                    int i119 = f.J0;
                                    bool = Boolean.FALSE;
                                    kVarR4 = fVar2.R4(workoutDetailsDTO, bool);
                                    if (kVarR4 == null) {
                                        i14 = -1;
                                    } else {
                                        i14 = C0948a.f48647a[kVarR4.ordinal()];
                                    }
                                    if (i14 != 1) {
                                        l52.y yVar9 = fVar2.f48588b;
                                        this.f48644f = b0Var;
                                        this.f48639a = workoutScheduleDTO;
                                        this.f48640b = null;
                                        this.f48641c = kVarR4;
                                        this.f48643e = 5;
                                        obj = yVar9.Y(this);
                                        if (obj == aVar) {
                                            kVar = kVarR4;
                                            workoutScheduleDTO2 = workoutScheduleDTO;
                                            v2Var = (v2) obj;
                                            if (v2Var instanceof v2.b) {
                                                list = (List) ((v2.b) v2Var).f47386a;
                                            } else {
                                                if (!(v2Var instanceof v2.a)) {
                                                    throw new NoWhenBranchMatchedException();
                                                }
                                                String str7 = "Error retrieving PowerCurve Targets Data. Error=" + ((v2.a) v2Var).f47383a;
                                                i2.a aVar114 = i2.f36769a;
                                                a2 a2Var7 = a2.GENERAL;
                                                aVar114.getClass();
                                                i2.a.f(a2Var7, "WorkoutDetailsViewModel", str7);
                                                list = null;
                                            }
                                            this.f48644f = null;
                                            this.f48639a = workoutScheduleDTO2;
                                            this.f48640b = null;
                                            this.f48641c = kVar;
                                            this.f48642d = list;
                                            this.f48643e = 6;
                                            obj = f.A4(fVar2, this);
                                            if (obj != aVar) {
                                                PowerZonesDTO powerZonesDTO13 = (PowerZonesDTO) obj;
                                                fVar2.f48606t = workoutScheduleDTO2;
                                                fVar2.f48605r = workoutScheduleDTO2.f48065a;
                                                fVar2.f48608w = list;
                                                x52.g.a aVar115 = x52.g.f189104d;
                                                Resources resourcesQ113 = fVar2.Q4();
                                                resourcesQ113.getClass();
                                                aVar115.getClass();
                                                x52.g.a.b(resourcesQ113, kVar, powerZonesDTO13);
                                                fVar2.f48610y = powerZonesDTO13;
                                                if (!fVar2.Y4()) {
                                                    WorkoutDetailsDTO workoutDetailsDTO116 = fVar2.f48605r;
                                                    fVar2.C = workoutDetailsDTO116 != null ? workoutDetailsDTO116.Y : -1L;
                                                }
                                                fVar2.f48602o = new o13.p<>(Boolean.FALSE, null);
                                                this.f48644f = null;
                                                this.f48639a = null;
                                                this.f48640b = null;
                                                this.f48641c = null;
                                                this.f48642d = null;
                                                this.f48643e = 7;
                                                if (f.x4(fVar2, this) == aVar) {
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        }
                                    } else if (i14 != 2) {
                                        this.f48644f = null;
                                        this.f48639a = workoutScheduleDTO;
                                        this.f48640b = null;
                                        this.f48641c = kVarR4;
                                        this.f48643e = 8;
                                        obj = f.A4(fVar2, this);
                                        if (obj == aVar) {
                                            kVar2 = kVarR4;
                                            workoutScheduleDTO3 = workoutScheduleDTO;
                                            PowerZonesDTO powerZonesDTO14 = (PowerZonesDTO) obj;
                                            fVar2.f48606t = workoutScheduleDTO3;
                                            fVar2.f48605r = workoutScheduleDTO3.f48065a;
                                            fVar2.f48608w = null;
                                            x52.g.a aVar116 = x52.g.f189104d;
                                            Resources resourcesQ114 = fVar2.Q4();
                                            resourcesQ114.getClass();
                                            aVar116.getClass();
                                            x52.g.a.b(resourcesQ114, kVar2, powerZonesDTO14);
                                            fVar2.f48610y = powerZonesDTO14;
                                            if (!fVar2.Y4()) {
                                                WorkoutDetailsDTO workoutDetailsDTO117 = fVar2.f48605r;
                                                fVar2.C = workoutDetailsDTO117 != null ? workoutDetailsDTO117.Y : -1L;
                                            }
                                            fVar2.f48602o = new o13.p<>(Boolean.FALSE, null);
                                            this.f48644f = null;
                                            this.f48639a = null;
                                            this.f48640b = null;
                                            this.f48641c = null;
                                            this.f48642d = null;
                                            this.f48643e = 9;
                                            if (f.x4(fVar2, this) == aVar) {
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    } else {
                                        if (i14 != 3) {
                                            fVar2.f48606t = workoutScheduleDTO;
                                            fVar2.f48605r = workoutScheduleDTO.f48065a;
                                            fVar2.f48608w = null;
                                            fVar2.f48610y = null;
                                            if (!fVar2.Y4()) {
                                                WorkoutDetailsDTO workoutDetailsDTO118 = fVar2.f48605r;
                                                fVar2.C = workoutDetailsDTO118 != null ? workoutDetailsDTO118.Y : -1L;
                                            }
                                            fVar2.f48602o = new o13.p<>(bool, null);
                                            this.f48644f = null;
                                            this.f48639a = null;
                                            this.f48640b = null;
                                            this.f48641c = null;
                                            this.f48643e = 12;
                                            if (f.x4(fVar2, this) == aVar) {
                                            }
                                            return Unit.INSTANCE;
                                        }
                                        fVar2.f48606t = workoutScheduleDTO;
                                        fVar2.f48605r = workoutScheduleDTO.f48065a;
                                        fVar2.f48608w = null;
                                        fVar2.f48610y = null;
                                        if (!fVar2.Y4()) {
                                            WorkoutDetailsDTO workoutDetailsDTO119 = fVar2.f48605r;
                                            fVar2.C = workoutDetailsDTO119 != null ? workoutDetailsDTO119.Y : -1L;
                                        }
                                        this.f48644f = null;
                                        this.f48639a = null;
                                        this.f48640b = null;
                                        this.f48641c = null;
                                        this.f48642d = fVar2;
                                        this.f48643e = 10;
                                        obj = f.D4(fVar2, this);
                                        if (obj == aVar) {
                                            fVar = fVar2;
                                            fVar.f48602o = (o13.p) obj;
                                            this.f48644f = null;
                                            this.f48639a = null;
                                            this.f48640b = null;
                                            this.f48641c = null;
                                            this.f48642d = null;
                                            this.f48643e = 11;
                                            if (f.x4(fVar2, this) == aVar) {
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    }
                                }
                            }
                            return aVar;
                        case 4:
                            workoutDetailsDTO = this.f48640b;
                            workoutScheduleDTO = this.f48639a;
                            o13.r.b(obj);
                            int i1110 = f.J0;
                            bool = Boolean.FALSE;
                            kVarR4 = fVar2.R4(workoutDetailsDTO, bool);
                            if (kVarR4 == null) {
                                i14 = -1;
                            } else {
                                i14 = C0948a.f48647a[kVarR4.ordinal()];
                            }
                            if (i14 != 1) {
                                l52.y yVar10 = fVar2.f48588b;
                                this.f48644f = b0Var;
                                this.f48639a = workoutScheduleDTO;
                                this.f48640b = null;
                                this.f48641c = kVarR4;
                                this.f48643e = 5;
                                obj = yVar10.Y(this);
                                if (obj == aVar) {
                                    kVar = kVarR4;
                                    workoutScheduleDTO2 = workoutScheduleDTO;
                                    v2Var = (v2) obj;
                                    if (v2Var instanceof v2.b) {
                                        list = (List) ((v2.b) v2Var).f47386a;
                                    } else {
                                        if (!(v2Var instanceof v2.a)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        String str8 = "Error retrieving PowerCurve Targets Data. Error=" + ((v2.a) v2Var).f47383a;
                                        i2.a aVar117 = i2.f36769a;
                                        a2 a2Var8 = a2.GENERAL;
                                        aVar117.getClass();
                                        i2.a.f(a2Var8, "WorkoutDetailsViewModel", str8);
                                        list = null;
                                    }
                                    this.f48644f = null;
                                    this.f48639a = workoutScheduleDTO2;
                                    this.f48640b = null;
                                    this.f48641c = kVar;
                                    this.f48642d = list;
                                    this.f48643e = 6;
                                    obj = f.A4(fVar2, this);
                                    if (obj != aVar) {
                                        PowerZonesDTO powerZonesDTO15 = (PowerZonesDTO) obj;
                                        fVar2.f48606t = workoutScheduleDTO2;
                                        fVar2.f48605r = workoutScheduleDTO2.f48065a;
                                        fVar2.f48608w = list;
                                        x52.g.a aVar118 = x52.g.f189104d;
                                        Resources resourcesQ115 = fVar2.Q4();
                                        resourcesQ115.getClass();
                                        aVar118.getClass();
                                        x52.g.a.b(resourcesQ115, kVar, powerZonesDTO15);
                                        fVar2.f48610y = powerZonesDTO15;
                                        if (!fVar2.Y4()) {
                                            WorkoutDetailsDTO workoutDetailsDTO1110 = fVar2.f48605r;
                                            fVar2.C = workoutDetailsDTO1110 != null ? workoutDetailsDTO1110.Y : -1L;
                                        }
                                        fVar2.f48602o = new o13.p<>(Boolean.FALSE, null);
                                        this.f48644f = null;
                                        this.f48639a = null;
                                        this.f48640b = null;
                                        this.f48641c = null;
                                        this.f48642d = null;
                                        this.f48643e = 7;
                                        if (f.x4(fVar2, this) == aVar) {
                                        }
                                        return Unit.INSTANCE;
                                    }
                                }
                            } else if (i14 != 2) {
                                this.f48644f = null;
                                this.f48639a = workoutScheduleDTO;
                                this.f48640b = null;
                                this.f48641c = kVarR4;
                                this.f48643e = 8;
                                obj = f.A4(fVar2, this);
                                if (obj == aVar) {
                                    kVar2 = kVarR4;
                                    workoutScheduleDTO3 = workoutScheduleDTO;
                                    PowerZonesDTO powerZonesDTO16 = (PowerZonesDTO) obj;
                                    fVar2.f48606t = workoutScheduleDTO3;
                                    fVar2.f48605r = workoutScheduleDTO3.f48065a;
                                    fVar2.f48608w = null;
                                    x52.g.a aVar119 = x52.g.f189104d;
                                    Resources resourcesQ116 = fVar2.Q4();
                                    resourcesQ116.getClass();
                                    aVar119.getClass();
                                    x52.g.a.b(resourcesQ116, kVar2, powerZonesDTO16);
                                    fVar2.f48610y = powerZonesDTO16;
                                    if (!fVar2.Y4()) {
                                        WorkoutDetailsDTO workoutDetailsDTO1111 = fVar2.f48605r;
                                        fVar2.C = workoutDetailsDTO1111 != null ? workoutDetailsDTO1111.Y : -1L;
                                    }
                                    fVar2.f48602o = new o13.p<>(Boolean.FALSE, null);
                                    this.f48644f = null;
                                    this.f48639a = null;
                                    this.f48640b = null;
                                    this.f48641c = null;
                                    this.f48642d = null;
                                    this.f48643e = 9;
                                    if (f.x4(fVar2, this) == aVar) {
                                    }
                                    return Unit.INSTANCE;
                                }
                            } else {
                                if (i14 != 3) {
                                    fVar2.f48606t = workoutScheduleDTO;
                                    fVar2.f48605r = workoutScheduleDTO.f48065a;
                                    fVar2.f48608w = null;
                                    fVar2.f48610y = null;
                                    if (!fVar2.Y4()) {
                                        WorkoutDetailsDTO workoutDetailsDTO1112 = fVar2.f48605r;
                                        fVar2.C = workoutDetailsDTO1112 != null ? workoutDetailsDTO1112.Y : -1L;
                                    }
                                    fVar2.f48602o = new o13.p<>(bool, null);
                                    this.f48644f = null;
                                    this.f48639a = null;
                                    this.f48640b = null;
                                    this.f48641c = null;
                                    this.f48643e = 12;
                                    if (f.x4(fVar2, this) == aVar) {
                                    }
                                    return Unit.INSTANCE;
                                }
                                fVar2.f48606t = workoutScheduleDTO;
                                fVar2.f48605r = workoutScheduleDTO.f48065a;
                                fVar2.f48608w = null;
                                fVar2.f48610y = null;
                                if (!fVar2.Y4()) {
                                    WorkoutDetailsDTO workoutDetailsDTO1113 = fVar2.f48605r;
                                    fVar2.C = workoutDetailsDTO1113 != null ? workoutDetailsDTO1113.Y : -1L;
                                }
                                this.f48644f = null;
                                this.f48639a = null;
                                this.f48640b = null;
                                this.f48641c = null;
                                this.f48642d = fVar2;
                                this.f48643e = 10;
                                obj = f.D4(fVar2, this);
                                if (obj == aVar) {
                                    fVar = fVar2;
                                    fVar.f48602o = (o13.p) obj;
                                    this.f48644f = null;
                                    this.f48639a = null;
                                    this.f48640b = null;
                                    this.f48641c = null;
                                    this.f48642d = null;
                                    this.f48643e = 11;
                                    if (f.x4(fVar2, this) == aVar) {
                                    }
                                    return Unit.INSTANCE;
                                }
                            }
                            return aVar;
                        case 5:
                            kVar = this.f48641c;
                            workoutScheduleDTO2 = this.f48639a;
                            o13.r.b(obj);
                            v2Var = (v2) obj;
                            if (v2Var instanceof v2.b) {
                                list = (List) ((v2.b) v2Var).f47386a;
                            } else {
                                if (!(v2Var instanceof v2.a)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                String str9 = "Error retrieving PowerCurve Targets Data. Error=" + ((v2.a) v2Var).f47383a;
                                i2.a aVar1110 = i2.f36769a;
                                a2 a2Var9 = a2.GENERAL;
                                aVar1110.getClass();
                                i2.a.f(a2Var9, "WorkoutDetailsViewModel", str9);
                                list = null;
                            }
                            this.f48644f = null;
                            this.f48639a = workoutScheduleDTO2;
                            this.f48640b = null;
                            this.f48641c = kVar;
                            this.f48642d = list;
                            this.f48643e = 6;
                            obj = f.A4(fVar2, this);
                            if (obj != aVar) {
                                PowerZonesDTO powerZonesDTO17 = (PowerZonesDTO) obj;
                                fVar2.f48606t = workoutScheduleDTO2;
                                fVar2.f48605r = workoutScheduleDTO2.f48065a;
                                fVar2.f48608w = list;
                                x52.g.a aVar1111 = x52.g.f189104d;
                                Resources resourcesQ117 = fVar2.Q4();
                                resourcesQ117.getClass();
                                aVar1111.getClass();
                                x52.g.a.b(resourcesQ117, kVar, powerZonesDTO17);
                                fVar2.f48610y = powerZonesDTO17;
                                if (!fVar2.Y4()) {
                                    WorkoutDetailsDTO workoutDetailsDTO1114 = fVar2.f48605r;
                                    fVar2.C = workoutDetailsDTO1114 != null ? workoutDetailsDTO1114.Y : -1L;
                                }
                                fVar2.f48602o = new o13.p<>(Boolean.FALSE, null);
                                this.f48644f = null;
                                this.f48639a = null;
                                this.f48640b = null;
                                this.f48641c = null;
                                this.f48642d = null;
                                this.f48643e = 7;
                                if (f.x4(fVar2, this) == aVar) {
                                }
                                return Unit.INSTANCE;
                            }
                            return aVar;
                        case 6:
                            list = (List) this.f48642d;
                            kVar = this.f48641c;
                            workoutScheduleDTO2 = this.f48639a;
                            o13.r.b(obj);
                            PowerZonesDTO powerZonesDTO18 = (PowerZonesDTO) obj;
                            fVar2.f48606t = workoutScheduleDTO2;
                            fVar2.f48605r = workoutScheduleDTO2.f48065a;
                            fVar2.f48608w = list;
                            x52.g.a aVar1112 = x52.g.f189104d;
                            Resources resourcesQ118 = fVar2.Q4();
                            resourcesQ118.getClass();
                            aVar1112.getClass();
                            x52.g.a.b(resourcesQ118, kVar, powerZonesDTO18);
                            fVar2.f48610y = powerZonesDTO18;
                            if (!fVar2.Y4()) {
                                WorkoutDetailsDTO workoutDetailsDTO1115 = fVar2.f48605r;
                                fVar2.C = workoutDetailsDTO1115 != null ? workoutDetailsDTO1115.Y : -1L;
                            }
                            fVar2.f48602o = new o13.p<>(Boolean.FALSE, null);
                            this.f48644f = null;
                            this.f48639a = null;
                            this.f48640b = null;
                            this.f48641c = null;
                            this.f48642d = null;
                            this.f48643e = 7;
                            if (f.x4(fVar2, this) == aVar) {
                                return aVar;
                            }
                            return Unit.INSTANCE;
                        case 7:
                            o13.r.b(obj);
                            return Unit.INSTANCE;
                        case 8:
                            kVar2 = this.f48641c;
                            workoutScheduleDTO3 = this.f48639a;
                            o13.r.b(obj);
                            PowerZonesDTO powerZonesDTO19 = (PowerZonesDTO) obj;
                            fVar2.f48606t = workoutScheduleDTO3;
                            fVar2.f48605r = workoutScheduleDTO3.f48065a;
                            fVar2.f48608w = null;
                            x52.g.a aVar1113 = x52.g.f189104d;
                            Resources resourcesQ119 = fVar2.Q4();
                            resourcesQ119.getClass();
                            aVar1113.getClass();
                            x52.g.a.b(resourcesQ119, kVar2, powerZonesDTO19);
                            fVar2.f48610y = powerZonesDTO19;
                            if (!fVar2.Y4()) {
                                WorkoutDetailsDTO workoutDetailsDTO1116 = fVar2.f48605r;
                                fVar2.C = workoutDetailsDTO1116 != null ? workoutDetailsDTO1116.Y : -1L;
                            }
                            fVar2.f48602o = new o13.p<>(Boolean.FALSE, null);
                            this.f48644f = null;
                            this.f48639a = null;
                            this.f48640b = null;
                            this.f48641c = null;
                            this.f48642d = null;
                            this.f48643e = 9;
                            if (f.x4(fVar2, this) == aVar) {
                                return aVar;
                            }
                            return Unit.INSTANCE;
                        case 9:
                            o13.r.b(obj);
                            return Unit.INSTANCE;
                        case 10:
                            fVar = (f) this.f48642d;
                            o13.r.b(obj);
                            fVar.f48602o = (o13.p) obj;
                            this.f48644f = null;
                            this.f48639a = null;
                            this.f48640b = null;
                            this.f48641c = null;
                            this.f48642d = null;
                            this.f48643e = 11;
                            if (f.x4(fVar2, this) == aVar) {
                                return aVar;
                            }
                            return Unit.INSTANCE;
                        case 11:
                        case 12:
                        case 13:
                            o13.r.b(obj);
                            return Unit.INSTANCE;
                        case 14:
                            o13.r.b(obj);
                            return Unit.INSTANCE;
                        default:
                            vb.h.z("call to 'resume' before 'invoke' with coroutine");
                            return null;
                    }
                } catch (Throwable unused) {
                    r53.j<v52.c<? extends com.garmin.android.apps.connectmobile.workouts.presentation.details.e>> jVar6 = fVar2.Y;
                    v52.c.a aVar20 = new v52.c.a(null, 1, null);
                    this.f48644f = null;
                    this.f48639a = null;
                    this.f48640b = null;
                    this.f48641c = null;
                    this.f48642d = null;
                    this.f48643e = 14;
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(long j8, t13.d<? super i> dVar) {
            super(2, dVar);
            this.f48638c = j8;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return f.this.new i(this.f48638c, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((i) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f48636a;
            if (i14 == 0) {
                o13.r.b(obj);
                x53.c cVar = s0.f129406a;
                x53.b bVar = x53.b.f189152a;
                a aVar2 = new a(f.this, this.f48638c, null);
                this.f48636a = 1;
                if (ge1.b.e0(bVar, aVar2, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.workouts.presentation.details.WorkoutDetailsViewModel$handleSendToDevice$1", f = "WorkoutDetailsViewModel.kt", l = {1165}, m = "invokeSuspend", v = 2)
    public static final class j extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f48648a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ WorkoutDetailsDTO f48649b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ f f48650c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(WorkoutDetailsDTO workoutDetailsDTO, f fVar, t13.d<? super j> dVar) {
            super(2, dVar);
            this.f48649b = workoutDetailsDTO;
            this.f48650c = fVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new j(this.f48649b, this.f48650c, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((j) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:25:0x006a  */
        /* JADX WARN: Code duplicated, block: B:56:0x00f7  */
        /* JADX WARN: Code duplicated, block: B:79:0x013b  */
        /* JADX WARN: Code duplicated, block: B:90:0x016e  */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            boolean zBooleanValue;
            boolean zBooleanValue2;
            boolean zBooleanValue3;
            boolean zBooleanValue4;
            h0 h0VarT4;
            h0 h0VarT5;
            l52.i<j0> iVarT;
            h0 h0VarT6;
            l52.i<j0> iVarT2;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f48648a;
            int i15 = 1;
            if (i14 == 0) {
                o13.r.b(obj);
                WorkoutDetailsDTO workoutDetailsDTO = this.f48649b;
                if (workoutDetailsDTO != null) {
                    ArrayList arrayList = new ArrayList();
                    int i16 = f.J0;
                    f fVar = this.f48650c;
                    fVar.getClass();
                    int i17 = 0;
                    if (g22.n.d(workoutDetailsDTO.T)) {
                        zBooleanValue = true;
                    } else {
                        h0 h0VarT7 = fVar.T4(workoutDetailsDTO);
                        if (h0VarT7 != null) {
                            m52.k kVar = h0VarT7.f48193h;
                            o13.t tVar = k52.g.f102952a;
                            if (kVar == m52.k.f116758r || !k52.g.d()) {
                                zBooleanValue = false;
                            } else {
                                Object objB = l52.o.b(h0VarT7.t(), l52.h.PRE_ORDER, new c50.a(5));
                                int i18 = o13.q.f128596b;
                                if (objB instanceof o13.q.b) {
                                    objB = null;
                                }
                                Boolean bool = (Boolean) objB;
                                if (bool != null) {
                                    zBooleanValue = bool.booleanValue();
                                } else {
                                    zBooleanValue = false;
                                }
                            }
                        } else {
                            zBooleanValue = false;
                        }
                    }
                    boolean zW4 = fVar.W4(workoutDetailsDTO);
                    ArrayList arrayListX4 = fVar.X4(workoutDetailsDTO);
                    if (zBooleanValue) {
                        String string = fVar.Q4().getString(R.string.audio_note);
                        string.getClass();
                        arrayList.add(string);
                    }
                    if (!arrayListX4.isEmpty()) {
                        arrayList.addAll(arrayListX4);
                    } else if (zW4) {
                        String string2 = fVar.Q4().getString(R.string.lbl_workout_skip_last_step, fVar.Q4().getString(R.string.workout_step_type_rest));
                        string2.getClass();
                        arrayList.add(string2);
                    }
                    m52.k kVar2 = workoutDetailsDTO.f48044e;
                    m52.k kVar3 = m52.k.f116755o;
                    if (kVar2 != kVar3) {
                        zBooleanValue2 = false;
                    } else {
                        h0 h0VarT8 = fVar.T4(workoutDetailsDTO);
                        if ((h0VarT8 != null ? h0VarT8.f48193h : null) != kVar3 || workoutDetailsDTO.Q0.isEmpty() || (h0VarT6 = fVar.T4(workoutDetailsDTO)) == null || (iVarT2 = h0VarT6.t()) == null) {
                            zBooleanValue2 = false;
                        } else {
                            Object objB2 = l52.o.b(iVarT2, l52.h.PRE_ORDER, new c50.a(3));
                            int i19 = o13.q.f128596b;
                            if (objB2 instanceof o13.q.b) {
                                objB2 = null;
                            }
                            Boolean bool2 = (Boolean) objB2;
                            if (bool2 != null) {
                                zBooleanValue2 = bool2.booleanValue();
                            } else {
                                zBooleanValue2 = false;
                            }
                        }
                    }
                    if (workoutDetailsDTO.f48044e != kVar3) {
                        zBooleanValue3 = false;
                    } else {
                        h0 h0VarT9 = fVar.T4(workoutDetailsDTO);
                        if ((h0VarT9 != null ? h0VarT9.f48193h : null) != kVar3 || workoutDetailsDTO.Q0.isEmpty() || (h0VarT5 = fVar.T4(workoutDetailsDTO)) == null || (iVarT = h0VarT5.t()) == null) {
                            zBooleanValue3 = false;
                        } else {
                            Object objB3 = l52.o.b(iVarT, l52.h.PRE_ORDER, new c50.a(7));
                            int i24 = o13.q.f128596b;
                            if (objB3 instanceof o13.q.b) {
                                objB3 = null;
                            }
                            Boolean bool3 = (Boolean) objB3;
                            if (bool3 != null) {
                                zBooleanValue3 = bool3.booleanValue();
                            } else {
                                zBooleanValue3 = false;
                            }
                        }
                    }
                    m52.k kVarR4 = fVar.R4(workoutDetailsDTO, Boolean.TRUE);
                    o13.t tVar2 = k52.g.f102952a;
                    if (kVarR4 != m52.k.f116759t || (h0VarT4 = fVar.T4(workoutDetailsDTO)) == null) {
                        zBooleanValue4 = false;
                    } else {
                        Object objB4 = l52.o.b(h0VarT4.t(), l52.h.PRE_ORDER, new c50.a(4));
                        int i25 = o13.q.f128596b;
                        if (objB4 instanceof o13.q.b) {
                            objB4 = null;
                        }
                        Boolean bool4 = (Boolean) objB4;
                        if (bool4 != null) {
                            zBooleanValue4 = bool4.booleanValue();
                        } else {
                            zBooleanValue4 = false;
                        }
                    }
                    p0 p0Var = new p0();
                    if (workoutDetailsDTO.f48044e != m52.k.f116761w) {
                        h0 h0VarT10 = fVar.T4(workoutDetailsDTO);
                        if (h0VarT10 != null) {
                            l52.o.b(h0VarT10.t(), l52.h.PRE_ORDER, new m1(p0Var, i17));
                        }
                        a2 a2Var = a2.WORKOUTS;
                        String strH = am.j.h(p0Var.f105807a, "Steps count = ");
                        i2.f36769a.getClass();
                        i2.a.b(a2Var, "WorkoutDetailsViewModel", strH);
                        if (p0Var.f105807a > 50) {
                            i17 = i15;
                        }
                    } else {
                        i15 = 1;
                    }
                    boolean z14 = !arrayListX4.isEmpty();
                    boolean zD0 = bo1.a.a().c().d0();
                    List<h0> list = workoutDetailsDTO.Q0;
                    ArrayList arrayList2 = new ArrayList(p13.y.r(list, 10));
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(((h0) it.next()).f48193h);
                    }
                    f0 f0Var = new f0(zBooleanValue2, zBooleanValue3, zBooleanValue4, zBooleanValue, i17, zW4, false, false, false, false, z14, zD0, arrayList, arrayList2, 960, null);
                    q53.w<v52.c<? extends com.garmin.android.apps.connectmobile.workouts.presentation.details.d>> wVar = fVar.f48598k0;
                    com.garmin.android.apps.connectmobile.workouts.presentation.details.d.q qVar = new com.garmin.android.apps.connectmobile.workouts.presentation.details.d.q(workoutDetailsDTO.f48044e, f0Var);
                    this.f48648a = i15;
                    if (v52.d.d(wVar, qVar, this) == aVar) {
                        return aVar;
                    }
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.workouts.presentation.details.WorkoutDetailsViewModel$hideLoadingWorkoutDialog$1", f = "WorkoutDetailsViewModel.kt", l = {303}, m = "invokeSuspend", v = 2)
    public static final class k extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f48651a;

        public k(t13.d<? super k> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return f.this.new k(dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((k) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f48651a;
            if (i14 == 0) {
                o13.r.b(obj);
                f fVar = f.this;
                com.garmin.android.apps.connectmobile.workouts.presentation.details.e eVar = (com.garmin.android.apps.connectmobile.workouts.presentation.details.e) v52.d.b(fVar.Z);
                if (eVar != null) {
                    r53.j<v52.c<? extends com.garmin.android.apps.connectmobile.workouts.presentation.details.e>> jVar = fVar.Y;
                    com.garmin.android.apps.connectmobile.workouts.presentation.details.e eVarK = eVar.K(new l2(false, null, null, 6, null));
                    this.f48651a = 1;
                    if (v52.d.a(jVar, eVarK, this) == aVar) {
                        return aVar;
                    }
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/garmin/android/apps/connectmobile/workouts/presentation/details/f$l", "Lcom/garmin/android/library/backgroundtaskmanagement/b$b;", "", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class l implements com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b<Object> {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.workouts.presentation.details.WorkoutDetailsViewModel$mRemoveATPWorkoutListener$1$onComplete$1", f = "WorkoutDetailsViewModel.kt", l = {917, 919}, m = "invokeSuspend", v = 2)
        public static final class a extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f48654a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.library.backgroundtaskmanagement.b.c f48655b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ f f48656c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(com.garmin.android.library.backgroundtaskmanagement.b.c cVar, f fVar, t13.d<? super a> dVar) {
                super(2, dVar);
                this.f48655b = cVar;
                this.f48656c = fVar;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new a(this.f48655b, this.f48656c, dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
                return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Code restructure failed: missing block: B:13:0x002d, code lost:
            
                if (v52.d.d(r6, r1, r5) == r0) goto L17;
             */
            /* JADX WARN: Code restructure failed: missing block: B:16:0x003a, code lost:
            
                if (v52.d.d(r6, r1, r5) == r0) goto L17;
             */
            /* JADX WARN: Code restructure failed: missing block: B:17:0x003c, code lost:
            
                return r0;
             */
            @Override // v13.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f48654a;
                if (i14 == 0) {
                    o13.r.b(obj);
                    com.garmin.android.library.backgroundtaskmanagement.b.c cVar = com.garmin.android.library.backgroundtaskmanagement.b.c.SUCCESS;
                    com.garmin.android.library.backgroundtaskmanagement.b.c cVar2 = this.f48655b;
                    f fVar = this.f48656c;
                    if (cVar2 == cVar) {
                        q53.w<v52.c<? extends com.garmin.android.apps.connectmobile.workouts.presentation.details.d>> wVar = fVar.f48598k0;
                        com.garmin.android.apps.connectmobile.workouts.presentation.details.d.l lVar = com.garmin.android.apps.connectmobile.workouts.presentation.details.d.l.f48531a;
                        this.f48654a = 1;
                    } else {
                        q53.w<v52.c<? extends com.garmin.android.apps.connectmobile.workouts.presentation.details.d>> wVar2 = fVar.f48598k0;
                        com.garmin.android.apps.connectmobile.workouts.presentation.details.d.h hVar = com.garmin.android.apps.connectmobile.workouts.presentation.details.d.h.f48527a;
                        this.f48654a = 2;
                    }
                } else {
                    if (i14 != 1 && i14 != 2) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    o13.r.b(obj);
                }
                return Unit.INSTANCE;
            }
        }

        public l() {
        }

        @Override // com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b
        public final void onComplete(long j8, com.garmin.android.library.backgroundtaskmanagement.b.c cVar) {
            cVar.getClass();
            f fVar = f.this;
            w9.a aVarA = v1.a(fVar);
            x53.c cVar2 = s0.f129406a;
            ge1.b.T(aVarA, x53.b.f189152a, null, new a(cVar, fVar, null), 2);
        }

        @Override // com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b
        public final void onResults(long j8, com.garmin.android.library.backgroundtaskmanagement.b.e eVar, Object obj) {
            eVar.getClass();
            obj.getClass();
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.workouts.presentation.details.WorkoutDetailsViewModel$openActivityRecording$1", f = "WorkoutDetailsViewModel.kt", l = {2031}, m = "invokeSuspend", v = 2)
    public static final class m extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f48657a;

        public m(t13.d<? super m> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return f.this.new m(dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((m) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f48657a;
            if (i14 == 0) {
                o13.r.b(obj);
                q53.w<v52.c<? extends com.garmin.android.apps.connectmobile.workouts.presentation.details.d>> wVar = f.this.f48598k0;
                com.garmin.android.apps.connectmobile.workouts.presentation.details.d.i iVar = com.garmin.android.apps.connectmobile.workouts.presentation.details.d.i.f48528a;
                this.f48657a = 1;
                if (v52.d.d(wVar, iVar, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.workouts.presentation.details.WorkoutDetailsViewModel$openDeviceTroubleshooting$1", f = "WorkoutDetailsViewModel.kt", l = {2042}, m = "invokeSuspend", v = 2)
    public static final class n extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f48659a;

        public n(t13.d<? super n> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return f.this.new n(dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((n) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f48659a;
            if (i14 == 0) {
                o13.r.b(obj);
                q53.w<v52.c<? extends com.garmin.android.apps.connectmobile.workouts.presentation.details.d>> wVar = f.this.f48598k0;
                com.garmin.android.apps.connectmobile.workouts.presentation.details.d.j jVar = com.garmin.android.apps.connectmobile.workouts.presentation.details.d.j.f48529a;
                this.f48659a = 1;
                if (v52.d.d(wVar, jVar, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.workouts.presentation.details.WorkoutDetailsViewModel$removeWorkoutFromITP$1", f = "WorkoutDetailsViewModel.kt", l = {927}, m = "invokeSuspend", v = 2)
    public static final class o extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f48661a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ long f48663c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ long f48664d;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.workouts.presentation.details.WorkoutDetailsViewModel$removeWorkoutFromITP$1$1", f = "WorkoutDetailsViewModel.kt", l = {928, 929, 931, 935}, m = "invokeSuspend", v = 2)
        public static final class a extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f48665a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f48666b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ long f48667c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ long f48668d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(f fVar, long j8, long j14, t13.d<? super a> dVar) {
                super(2, dVar);
                this.f48666b = fVar;
                this.f48667c = j8;
                this.f48668d = j14;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new a(this.f48666b, this.f48667c, this.f48668d, dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
                return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Code duplicated, block: B:23:0x0051  */
            /* JADX WARN: Code duplicated, block: B:26:0x005e  */
            /* JADX WARN: Code duplicated, block: B:28:0x0062  */
            /* JADX WARN: Code duplicated, block: B:33:0x0072  */
            /* JADX WARN: Code restructure failed: missing block: B:24:0x005b, code lost:
            
                if (v52.d.d(r14, r1, r13) == r0) goto L30;
             */
            /* JADX WARN: Code restructure failed: missing block: B:29:0x006c, code lost:
            
                if (v52.d.d(r14, r1, r13) == r0) goto L30;
             */
            @Override // v13.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                a aVar;
                v2 v2Var;
                u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f48665a;
                f fVar = this.f48666b;
                if (i14 == 0) {
                    o13.r.b(obj);
                    q53.w<v52.c<? extends com.garmin.android.apps.connectmobile.workouts.presentation.details.d>> wVar = fVar.f48598k0;
                    v52.c.b bVar = v52.c.b.f175759a;
                    this.f48665a = 1;
                    if (wVar.h(bVar, this) == aVar2) {
                    }
                    return aVar2;
                }
                if (i14 == 1) {
                    o13.r.b(obj);
                } else if (i14 == 2) {
                    o13.r.b(obj);
                    aVar = this;
                    v2Var = (v2) obj;
                    if (v2Var instanceof v2.b) {
                        q53.w<v52.c<? extends com.garmin.android.apps.connectmobile.workouts.presentation.details.d>> wVar2 = fVar.f48598k0;
                        com.garmin.android.apps.connectmobile.workouts.presentation.details.d.l lVar = com.garmin.android.apps.connectmobile.workouts.presentation.details.d.l.f48531a;
                        aVar.f48665a = 3;
                    } else {
                        if (v2Var instanceof v2.a) {
                            u0.r();
                            return null;
                        }
                        q53.w<v52.c<? extends com.garmin.android.apps.connectmobile.workouts.presentation.details.d>> wVar3 = fVar.f48598k0;
                        com.garmin.android.apps.connectmobile.workouts.presentation.details.d.h hVar = com.garmin.android.apps.connectmobile.workouts.presentation.details.d.h.f48527a;
                        aVar.f48665a = 4;
                    }
                } else {
                    if (i14 != 3 && i14 != 4) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    o13.r.b(obj);
                }
                return Unit.INSTANCE;
                l52.y yVar = fVar.f48588b;
                this.f48665a = 2;
                aVar = this;
                obj = yVar.y(this.f48667c, this.f48668d, aVar);
                if (obj != aVar2) {
                    v2Var = (v2) obj;
                    if (v2Var instanceof v2.b) {
                        q53.w<v52.c<? extends com.garmin.android.apps.connectmobile.workouts.presentation.details.d>> wVar4 = fVar.f48598k0;
                        com.garmin.android.apps.connectmobile.workouts.presentation.details.d.l lVar2 = com.garmin.android.apps.connectmobile.workouts.presentation.details.d.l.f48531a;
                        aVar.f48665a = 3;
                    } else {
                        if (v2Var instanceof v2.a) {
                            u0.r();
                            return null;
                        }
                        q53.w<v52.c<? extends com.garmin.android.apps.connectmobile.workouts.presentation.details.d>> wVar5 = fVar.f48598k0;
                        com.garmin.android.apps.connectmobile.workouts.presentation.details.d.h hVar2 = com.garmin.android.apps.connectmobile.workouts.presentation.details.d.h.f48527a;
                        aVar.f48665a = 4;
                    }
                }
                return aVar2;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(long j8, long j14, t13.d<? super o> dVar) {
            super(2, dVar);
            this.f48663c = j8;
            this.f48664d = j14;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return f.this.new o(this.f48663c, this.f48664d, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((o) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f48661a;
            if (i14 == 0) {
                o13.r.b(obj);
                x53.c cVar = s0.f129406a;
                x53.b bVar = x53.b.f189152a;
                a aVar2 = new a(f.this, this.f48663c, this.f48664d, null);
                this.f48661a = 1;
                if (ge1.b.e0(bVar, aVar2, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class p implements z0, p005kotlin.jvm.internal.n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.l f48669a;

        public p(e23.l lVar) {
            lVar.getClass();
            this.f48669a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof p005kotlin.jvm.internal.n)) {
                return p005kotlin.jvm.internal.s.g(getFunctionDelegate(), ((p005kotlin.jvm.internal.n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final o13.h<?> getFunctionDelegate() {
            return this.f48669a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f48669a.invoke(obj);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.workouts.presentation.details.WorkoutDetailsViewModel$selectWorkoutStep$1", f = "WorkoutDetailsViewModel.kt", l = {2000}, m = "invokeSuspend", v = 2)
    public static final class q extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f48670a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f48672c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f48673d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(String str, String str2, t13.d<? super q> dVar) {
            super(2, dVar);
            this.f48672c = str;
            this.f48673d = str2;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return f.this.new q(this.f48672c, this.f48673d, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((q) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            Object next;
            WorkoutDetailsDTO f48577a;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f48670a;
            if (i14 == 0) {
                ArrayList arrayListX = v.h.x(obj);
                f fVar = f.this;
                com.garmin.android.apps.connectmobile.workouts.presentation.details.e eVar = (com.garmin.android.apps.connectmobile.workouts.presentation.details.e) v52.d.b(fVar.Z);
                l52.i<j0> iVarP = null;
                if (((eVar == null || (f48577a = eVar.getF48577a()) == null) ? null : f48577a.f48044e) == m52.k.A) {
                    Iterator<T> it = eVar.getF48577a().Q0.iterator();
                    do {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                    } while (!k52.g.f(((h0) next).f48193h));
                    h0 h0Var = (h0) next;
                    if (h0Var != null) {
                        iVarP = h0Var.t();
                    }
                } else if (eVar != null) {
                    iVarP = eVar.p();
                }
                if (iVarP == null) {
                    return Unit.INSTANCE;
                }
                l52.o.a(iVarP, l52.h.PRE_ORDER, new g2(0, arrayListX));
                if (arrayListX.isEmpty()) {
                    return Unit.INSTANCE;
                }
                q53.w<v52.c<? extends com.garmin.android.apps.connectmobile.workouts.presentation.details.d>> wVar = fVar.f48598k0;
                com.garmin.android.apps.connectmobile.workouts.presentation.details.d.t tVar = new com.garmin.android.apps.connectmobile.workouts.presentation.details.d.t(this.f48672c, this.f48673d, arrayListX);
                this.f48670a = 1;
                if (v52.d.d(wVar, tVar, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.workouts.presentation.details.WorkoutDetailsViewModel$showActivityInProgressDialog$1", f = "WorkoutDetailsViewModel.kt", l = {315}, m = "invokeSuspend", v = 2)
    public static final class r extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f48674a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ boolean f48676c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(boolean z14, t13.d<? super r> dVar) {
            super(2, dVar);
            this.f48676c = z14;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return f.this.new r(this.f48676c, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((r) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            com.garmin.android.apps.connectmobile.workouts.presentation.details.a bVar;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f48674a;
            if (i14 == 0) {
                o13.r.b(obj);
                f fVar = f.this;
                com.garmin.android.apps.connectmobile.workouts.presentation.details.e eVar = (com.garmin.android.apps.connectmobile.workouts.presentation.details.e) v52.d.b(fVar.Z);
                if (eVar != null) {
                    r53.j<v52.c<? extends com.garmin.android.apps.connectmobile.workouts.presentation.details.e>> jVar = fVar.Y;
                    if (this.f48676c) {
                        rs2.c cVar = (rs2.c) fVar.f48599l.f21191a.f13016o.f150540a.getValue();
                        bVar = new com.garmin.android.apps.connectmobile.workouts.presentation.details.a.b(cVar != null ? cVar.getF92742f() : null);
                    } else {
                        bVar = com.garmin.android.apps.connectmobile.workouts.presentation.details.a.C0944a.f48507a;
                    }
                    com.garmin.android.apps.connectmobile.workouts.presentation.details.e eVarM = eVar.m(bVar);
                    this.f48674a = 1;
                    if (v52.d.a(jVar, eVarM, this) == aVar) {
                        return aVar;
                    }
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.workouts.presentation.details.WorkoutDetailsViewModel$triggerWorkoutPaywall$1", f = "WorkoutDetailsViewModel.kt", l = {2206}, m = "invokeSuspend", v = 2)
    public static final class s extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f48677a;

        public s(t13.d<? super s> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return f.this.new s(dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((s) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f48677a;
            if (i14 == 0) {
                o13.r.b(obj);
                q53.w<v52.c<? extends com.garmin.android.apps.connectmobile.workouts.presentation.details.d>> wVar = f.this.f48598k0;
                com.garmin.android.apps.connectmobile.workouts.presentation.details.d.y yVar = com.garmin.android.apps.connectmobile.workouts.presentation.details.d.y.f48553a;
                this.f48677a = 1;
                if (v52.d.d(wVar, yVar, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.workouts.presentation.details.WorkoutDetailsViewModel$updateDeviceDisconnectedDialogState$1", f = "WorkoutDetailsViewModel.kt", l = {331}, m = "invokeSuspend", v = 2)
    public static final class t extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f48679a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ com.garmin.android.apps.connectmobile.workouts.presentation.details.b f48681c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public t(com.garmin.android.apps.connectmobile.workouts.presentation.details.b bVar, t13.d<? super t> dVar) {
            super(2, dVar);
            this.f48681c = bVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return f.this.new t(this.f48681c, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((t) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f48679a;
            if (i14 == 0) {
                o13.r.b(obj);
                f fVar = f.this;
                com.garmin.android.apps.connectmobile.workouts.presentation.details.e eVar = (com.garmin.android.apps.connectmobile.workouts.presentation.details.e) v52.d.b(fVar.Z);
                if (eVar != null) {
                    r53.j<v52.c<? extends com.garmin.android.apps.connectmobile.workouts.presentation.details.e>> jVar = fVar.Y;
                    com.garmin.android.apps.connectmobile.workouts.presentation.details.e eVarQ = eVar.q(this.f48681c);
                    this.f48679a = 1;
                    if (v52.d.a(jVar, eVarQ, this) == aVar) {
                        return aVar;
                    }
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.workouts.presentation.details.WorkoutDetailsViewModel$viewMyMSNWorkoutCopy$1", f = "WorkoutDetailsViewModel.kt", l = {1802}, m = "invokeSuspend", v = 2)
    public static final class u extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f48682a;

        public u(t13.d<? super u> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return f.this.new u(dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((u) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            c62.c cVarL;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f48682a;
            if (i14 == 0) {
                o13.r.b(obj);
                f fVar = f.this;
                com.garmin.android.apps.connectmobile.workouts.presentation.details.e eVar = (com.garmin.android.apps.connectmobile.workouts.presentation.details.e) v52.d.b(fVar.Z);
                if (eVar == null || (cVarL = eVar.getF24790m()) == null) {
                    return Unit.INSTANCE;
                }
                long j8 = cVarL.f24691b;
                q53.w<v52.c<? extends com.garmin.android.apps.connectmobile.workouts.presentation.details.d>> wVar = fVar.f48598k0;
                com.garmin.android.apps.connectmobile.workouts.presentation.details.d.x xVar = new com.garmin.android.apps.connectmobile.workouts.presentation.details.d.x(j8);
                this.f48682a = 1;
                if (v52.d.d(wVar, xVar, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    static {
        new b(null);
    }

    public f() {
        oc1.b.f131159b.getClass();
        this.f48589c = oc1.b.a.a();
        this.f48590d = (rt1.m) KoinJavaComponent.get$default(rt1.m.class, null, null, 6, null);
        this.f48591e = o13.m.b(new bv0.b(29));
        this.f48592f = (q52.f) KoinJavaComponent.get$default(q52.f.class, null, null, 6, null);
        this.f48593g = (q52.c) KoinJavaComponent.get$default(q52.c.class, null, null, 6, null);
        this.f48594h = (o52.c) KoinJavaComponent.get$default(o52.c.class, null, null, 6, null);
        this.f48595i = (o52.f) KoinJavaComponent.get$default(o52.f.class, null, null, 6, null);
        this.f48596j = (rd2.f) KoinJavaComponent.get$default(rd2.f.class, null, null, 6, null);
        this.f48597k = (bu0.i) KoinJavaComponent.get$default(bu0.i.class, null, null, 6, null);
        this.f48599l = (bu0.b) KoinJavaComponent.get$default(bu0.b.class, null, null, 6, null);
        this.f48600m = 1;
        this.f48602o = new o13.p<>(Boolean.FALSE, null);
        this.B = -1L;
        this.C = -1L;
        this.I = com.garmin.android.apps.connectmobile.workouts.presentation.details.c.None;
        p2 p2VarA = q2.a(v52.c.b.f175759a);
        o13.p pVar = new o13.p(p2VarA, p2VarA);
        r53.j<v52.c<? extends com.garmin.android.apps.connectmobile.workouts.presentation.details.e>> jVar = (r53.j) pVar.f128594a;
        o2<v52.c<com.garmin.android.apps.connectmobile.workouts.presentation.details.e>> o2Var = (o2) pVar.f128595b;
        this.Y = jVar;
        this.Z = o2Var;
        q53.b bVarA = q53.l.a(0, 7, null);
        o13.p pVar2 = new o13.p(bVarA, r53.s.F(bVarA));
        q53.w<v52.c<? extends com.garmin.android.apps.connectmobile.workouts.presentation.details.d>> wVar = (q53.w) pVar2.f128594a;
        r53.i<v52.c<com.garmin.android.apps.connectmobile.workouts.presentation.details.d>> iVar = (r53.i) pVar2.f128595b;
        this.f48598k0 = wVar;
        this.H0 = iVar;
        this.I0 = new l();
    }

    public static final Object A4(f fVar, v13.i iVar) {
        fVar.getClass();
        t13.i iVar2 = new t13.i(u13.f.b(iVar));
        fVar.f48587a.k(new c(new w1(iVar2), new x1(iVar2)));
        Object objA = iVar2.a();
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        return objA;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Object B4(f fVar, long j8, v13.c cVar) {
        y1 y1Var;
        boolean zG;
        fVar.getClass();
        if (cVar instanceof y1) {
            y1Var = (y1) cVar;
            int i14 = y1Var.f24935c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                y1Var.f24935c = i14 - Integer.MIN_VALUE;
            } else {
                y1Var = new y1(fVar, cVar);
            }
        } else {
            y1Var = new y1(fVar, cVar);
        }
        Object objG = y1Var.f24933a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = y1Var.f24935c;
        if (i15 == 0) {
            o13.r.b(objG);
            pc0.j jVarA = pc0.j.a.a(pc0.j.f137223i);
            String strValueOf = String.valueOf(j8);
            y1Var.f24935c = 1;
            objG = jVarA.g(strValueOf, y1Var);
            if (objG == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objG);
        }
        v2 v2Var = (v2) objG;
        if (v2Var instanceof v2.b) {
            zG = p005kotlin.jvm.internal.s.g(((com.garmin.android.apps.connectmobile.devices.model.m) ((v2.b) v2Var).f47386a).getSwimWorkout2Capable(), Boolean.FALSE);
        } else {
            if (!(v2Var instanceof v2.a)) {
                u0.r();
                return null;
            }
            zG = false;
        }
        return Boolean.valueOf(zG);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Object C4(f fVar, v13.c cVar) {
        c62.a2 a2Var;
        fVar.getClass();
        if (cVar instanceof c62.a2) {
            a2Var = (c62.a2) cVar;
            int i14 = a2Var.f24682c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                a2Var.f24682c = i14 - Integer.MIN_VALUE;
            } else {
                a2Var = new c62.a2(fVar, cVar);
            }
        } else {
            a2Var = new c62.a2(fVar, cVar);
        }
        Object objG = a2Var.f24680a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = a2Var.f24682c;
        if (i15 == 0) {
            o13.r.b(objG);
            l52.y yVar = fVar.f48588b;
            a2Var.f24682c = 1;
            objG = yVar.g(a2Var);
            if (objG == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objG);
        }
        v2 v2Var = (v2) objG;
        if (v2Var instanceof v2.b) {
            return (ww1.h0) ((v2.b) v2Var).f47386a;
        }
        if (!(v2Var instanceof v2.a)) {
            u0.r();
            return null;
        }
        String strD = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var).f47383a, "Error retrieving FBT workout compatible activities list. Error=");
        i2.a aVar2 = i2.f36769a;
        a2 a2Var2 = a2.GENERAL;
        aVar2.getClass();
        i2.a.f(a2Var2, "WorkoutDetailsViewModel", strD);
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Serializable D4(f fVar, v13.c cVar) {
        b2 b2Var;
        fVar.getClass();
        if (cVar instanceof b2) {
            b2Var = (b2) cVar;
            int i14 = b2Var.f24689c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                b2Var.f24689c = i14 - Integer.MIN_VALUE;
            } else {
                b2Var = new b2(fVar, cVar);
            }
        } else {
            b2Var = new b2(fVar, cVar);
        }
        Object objB = b2Var.f24687a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = b2Var.f24689c;
        if (i15 == 0) {
            o13.r.b(objB);
            g60.c.R.getClass();
            g60.h hVarA = g60.c.a.a();
            DateTime dateTimeNow = DateTime.now();
            dateTimeNow.getClass();
            b2Var.f24689c = 1;
            objB = hVarA.b(dateTimeNow, b2Var);
            if (objB == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objB);
        }
        v2 v2Var = (v2) objB;
        if (!(v2Var instanceof v2.b)) {
            return new o13.p(Boolean.FALSE, null);
        }
        v2.b bVar = (v2.b) v2Var;
        return bVar.f47387b == 200 ? new o13.p(Boolean.TRUE, ((g60.b) bVar.f47386a).d()) : new o13.p(Boolean.TRUE, null);
    }

    public static final Object E4(f fVar, com.garmin.android.apps.connectmobile.workouts.data.model.y yVar, C0947f.a aVar) {
        fVar.getClass();
        if (yVar instanceof com.garmin.android.apps.connectmobile.workouts.data.model.y.a) {
            com.garmin.android.apps.connectmobile.workouts.data.model.y.a aVar2 = (com.garmin.android.apps.connectmobile.workouts.data.model.y.a) yVar;
            if (aVar2.f48352c) {
                Object objV4 = fVar.V4(aVar2.f48350a, true, aVar);
                return objV4 == u13.a.COROUTINE_SUSPENDED ? objV4 : Unit.INSTANCE;
            }
            fVar.U4(fVar.f48605r);
        } else if (yVar instanceof com.garmin.android.apps.connectmobile.workouts.data.model.y.c) {
            com.garmin.android.apps.connectmobile.workouts.data.model.y.c cVar = (com.garmin.android.apps.connectmobile.workouts.data.model.y.c) yVar;
            if (cVar.f48356b) {
                Object objV5 = fVar.V4(cVar.f48355a, false, aVar);
                return objV5 == u13.a.COROUTINE_SUSPENDED ? objV5 : Unit.INSTANCE;
            }
            fVar.d3();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:41:0x0110  */
    /* JADX WARN: Code duplicated, block: B:42:0x0115  */
    /* JADX WARN: Code duplicated, block: B:44:0x0118  */
    /* JADX WARN: Code duplicated, block: B:46:0x0137  */
    /* JADX WARN: Code duplicated, block: B:7:0x001c  */
    public static final Object F4(f fVar, w0 w0Var, sd2.f fVar2, m2 m2Var, v13.c cVar) throws Throwable {
        d2 d2Var;
        c62.b bVar;
        long j8;
        Object objL4;
        Long lZ;
        w0 w0Var2;
        Object obj;
        long j14;
        c62.b bVar2;
        w0 w0Var3;
        long j15;
        WorkoutDetailsDTO workoutDetailsDTO;
        Long lZ2;
        Throwable thB;
        w0 w0Var4 = w0Var;
        fVar.getClass();
        if (cVar instanceof d2) {
            d2Var = (d2) cVar;
            int i14 = d2Var.f24717g;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                d2Var.f24717g = i14 - Integer.MIN_VALUE;
            } else {
                d2Var = new d2(fVar, cVar);
            }
        } else {
            d2Var = new d2(fVar, cVar);
        }
        Object obj2 = d2Var.f24715e;
        Object obj3 = u13.a.COROUTINE_SUSPENDED;
        int i15 = d2Var.f24717g;
        if (i15 == 0) {
            o13.r.b(obj2);
            long unitID = fVar2.getUnitID();
            String productDisplayName = fVar2.getProductDisplayName();
            WorkoutDetailsDTO workoutDetailsDTO2 = fVar.f48605r;
            bVar = new c62.b(unitID, productDisplayName, m2Var, (workoutDetailsDTO2 == null || (lZ = workoutDetailsDTO2.Z()) == null) ? z.c.f48843a : new z.b(lZ.longValue()));
            g3.f35298f.getClass();
            w0Var4.j(g3.a.b(bVar));
            boolean z14 = bVar.f24686d instanceof z.c;
            j8 = bVar.f24683a;
            if (z14) {
                String strF = a0.f(j8, "loadSavedWorkout: Saving workout for device[", "]");
                i2.a aVar = i2.f36769a;
                a2 a2Var = a2.GENERAL;
                aVar.getClass();
                i2.a.b(a2Var, "WorkoutDetailsViewModel", strF);
                d2Var.f24711a = w0Var4;
                d2Var.f24712b = bVar;
                d2Var.f24714d = j8;
                d2Var.f24717g = 1;
                objL4 = fVar.L4(d2Var);
                if (objL4 != obj3) {
                }
                return obj3;
            }
            w0Var3 = w0Var4;
            j15 = j8;
            workoutDetailsDTO = fVar.f48605r;
            if (workoutDetailsDTO != null) {
                lZ2 = workoutDetailsDTO.Z();
            } else {
                lZ2 = null;
            }
            if (lZ2 == null) {
                i2.a aVar2 = i2.f36769a;
                a2 a2Var2 = a2.GENERAL;
                aVar2.getClass();
                i2.a.f(a2Var2, "WorkoutDetailsViewModel", "loadSavedWorkout: Invalid workout ID. Cannot send workout to device.");
                w0Var3.j(g3.a.a(g3.f35298f, "Invalid workout ID", null, null, null, 14));
                return Unit.INSTANCE;
            }
            c62.b bVar3 = new c62.b(bVar.f24683a, bVar.f24684b, bVar.f24685c, new z.b(lZ2.longValue()));
            i2.a aVar3 = i2.f36769a;
            a2 a2Var3 = a2.GENERAL;
            aVar3.getClass();
            i2.a.b(a2Var3, "WorkoutDetailsViewModel", "loadSavedWorkout: Sending workout to device");
            Long l14 = new Long(j15);
            w0 w0Var5 = new w0(g3.a.c(g3.f35298f));
            ge1.b.T(v1.a(fVar), null, null, new v(fVar, w0Var5, l14, null), 3);
            w0Var3.n(w0Var5, new p(new bn0.h(w0Var3, bVar3, fVar, j15, 2)));
            return Unit.INSTANCE;
        }
        if (i15 == 1) {
            j8 = d2Var.f24714d;
            c62.b bVar4 = d2Var.f24712b;
            w0 w0Var6 = d2Var.f24711a;
            o13.r.b(obj2);
            objL4 = ((o13.q) obj2).f128597a;
            bVar = bVar4;
            w0Var4 = w0Var6;
        } else {
            if (i15 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j14 = d2Var.f24714d;
            obj = d2Var.f24713c;
            bVar2 = d2Var.f24712b;
            w0Var2 = d2Var.f24711a;
            o13.r.b(obj2);
        }
        objL4 = obj;
        w0Var4 = w0Var2;
        j8 = j14;
        bVar = bVar2;
        thB = o13.q.b(objL4);
        if (thB != null) {
            String strN = fb1.c.n("loadSavedWorkout: Error creating workout before sending to device: ", thB.getMessage());
            i2.a aVar4 = i2.f36769a;
            a2 a2Var4 = a2.GENERAL;
            aVar4.getClass();
            i2.a.f(a2Var4, "WorkoutDetailsViewModel", strN);
            w0Var4.j(g3.a.a(g3.f35298f, thB.getMessage(), null, null, null, 14));
            return Unit.INSTANCE;
        }
        w0Var3 = w0Var4;
        j15 = j8;
        workoutDetailsDTO = fVar.f48605r;
        if (workoutDetailsDTO != null) {
            lZ2 = workoutDetailsDTO.Z();
        } else {
            lZ2 = null;
        }
        if (lZ2 == null) {
            i2.a aVar5 = i2.f36769a;
            a2 a2Var5 = a2.GENERAL;
            aVar5.getClass();
            i2.a.f(a2Var5, "WorkoutDetailsViewModel", "loadSavedWorkout: Invalid workout ID. Cannot send workout to device.");
            w0Var3.j(g3.a.a(g3.f35298f, "Invalid workout ID", null, null, null, 14));
            return Unit.INSTANCE;
        }
        c62.b bVar5 = new c62.b(bVar.f24683a, bVar.f24684b, bVar.f24685c, new z.b(lZ2.longValue()));
        i2.a aVar6 = i2.f36769a;
        a2 a2Var6 = a2.GENERAL;
        aVar6.getClass();
        i2.a.b(a2Var6, "WorkoutDetailsViewModel", "loadSavedWorkout: Sending workout to device");
        Long l15 = new Long(j15);
        w0 w0Var7 = new w0(g3.a.c(g3.f35298f));
        ge1.b.T(v1.a(fVar), null, null, new v(fVar, w0Var7, l15, null), 3);
        w0Var3.n(w0Var7, new p(new bn0.h(w0Var3, bVar5, fVar, j15, 2)));
        return Unit.INSTANCE;
        int i16 = o13.q.f128596b;
        if (!(objL4 instanceof o13.q.b)) {
            q53.w<v52.c<? extends com.garmin.android.apps.connectmobile.workouts.presentation.details.d>> wVar = fVar.f48598k0;
            com.garmin.android.apps.connectmobile.workouts.presentation.details.d.k kVar = com.garmin.android.apps.connectmobile.workouts.presentation.details.d.k.f48530a;
            d2Var.f24711a = w0Var4;
            d2Var.f24712b = bVar;
            d2Var.f24713c = objL4;
            d2Var.f24714d = j8;
            d2Var.f24717g = 2;
            if (v52.d.d(wVar, kVar, d2Var) != obj3) {
                w0Var2 = w0Var4;
                obj = objL4;
                j14 = j8;
                bVar2 = bVar;
                objL4 = obj;
                w0Var4 = w0Var2;
                j8 = j14;
                bVar = bVar2;
            }
            return obj3;
        }
        thB = o13.q.b(objL4);
        if (thB != null) {
            String strN2 = fb1.c.n("loadSavedWorkout: Error creating workout before sending to device: ", thB.getMessage());
            i2.a aVar7 = i2.f36769a;
            a2 a2Var7 = a2.GENERAL;
            aVar7.getClass();
            i2.a.f(a2Var7, "WorkoutDetailsViewModel", strN2);
            w0Var4.j(g3.a.a(g3.f35298f, thB.getMessage(), null, null, null, 14));
            return Unit.INSTANCE;
        }
        w0Var3 = w0Var4;
        j15 = j8;
        workoutDetailsDTO = fVar.f48605r;
        if (workoutDetailsDTO != null) {
            lZ2 = workoutDetailsDTO.Z();
        } else {
            lZ2 = null;
        }
        if (lZ2 == null) {
            i2.a aVar8 = i2.f36769a;
            a2 a2Var8 = a2.GENERAL;
            aVar8.getClass();
            i2.a.f(a2Var8, "WorkoutDetailsViewModel", "loadSavedWorkout: Invalid workout ID. Cannot send workout to device.");
            w0Var3.j(g3.a.a(g3.f35298f, "Invalid workout ID", null, null, null, 14));
            return Unit.INSTANCE;
        }
        c62.b bVar6 = new c62.b(bVar.f24683a, bVar.f24684b, bVar.f24685c, new z.b(lZ2.longValue()));
        i2.a aVar9 = i2.f36769a;
        a2 a2Var9 = a2.GENERAL;
        aVar9.getClass();
        i2.a.b(a2Var9, "WorkoutDetailsViewModel", "loadSavedWorkout: Sending workout to device");
        Long l16 = new Long(j15);
        w0 w0Var8 = new w0(g3.a.c(g3.f35298f));
        ge1.b.T(v1.a(fVar), null, null, new v(fVar, w0Var8, l16, null), 3);
        w0Var3.n(w0Var8, new p(new bn0.h(w0Var3, bVar6, fVar, j15, 2)));
        return Unit.INSTANCE;
    }

    public static boolean a5(WorkoutDetailsDTO workoutDetailsDTO) {
        return (workoutDetailsDTO != null ? workoutDetailsDTO.f48044e : null) == m52.k.A;
    }

    /* JADX WARN: Code duplicated, block: B:57:0x0151 A[PHI: r4
      0x0151: PHI (r4v10 int) = (r4v9 int), (r4v13 int) binds: [B:55:0x014e, B:17:0x0040] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:7:0x001a  */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0168, code lost:
    
        if (v52.d.d(r0, r6, r2) == r3) goto L59;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object x4(f fVar, v13.c cVar) {
        r1 r1Var;
        WorkoutDetailsDTO workoutDetailsDTO;
        m52.k kVar;
        int i14;
        r53.j<v52.c<? extends com.garmin.android.apps.connectmobile.workouts.presentation.details.e>> jVar;
        WorkoutScheduleDTO workoutScheduleDTO;
        l1 l1VarG4;
        z52.a aVar;
        r53.j<v52.c<? extends com.garmin.android.apps.connectmobile.workouts.presentation.details.e>> jVar2;
        com.garmin.android.apps.connectmobile.workouts.presentation.details.e.a aVar2;
        fVar.getClass();
        if (cVar instanceof r1) {
            r1Var = (r1) cVar;
            int i15 = r1Var.f24879k;
            if ((i15 & Integer.MIN_VALUE) != 0) {
                r1Var.f24879k = i15 - Integer.MIN_VALUE;
            } else {
                r1Var = new r1(fVar, cVar);
            }
        } else {
            r1Var = new r1(fVar, cVar);
        }
        Object obj = r1Var.f24877i;
        u13.a aVar3 = u13.a.COROUTINE_SUSPENDED;
        int i16 = r1Var.f24879k;
        if (i16 == 0) {
            o13.r.b(obj);
            WorkoutDetailsDTO workoutDetailsDTO2 = fVar.f48605r;
            if (workoutDetailsDTO2 == null) {
                return Unit.INSTANCE;
            }
            m52.k kVarR4 = fVar.R4(workoutDetailsDTO2, Boolean.TRUE);
            if (kVarR4 == null) {
                kVarR4 = m52.k.f116756p;
            }
            int i17 = kVarR4 == m52.k.A ? 1 : 0;
            new z52.c();
            PowerZonesDTO powerZonesDTO = fVar.f48610y;
            List<com.garmin.android.apps.connectmobile.workouts.data.model.v> list = fVar.f48608w;
            r1Var.f24869a = workoutDetailsDTO2;
            r1Var.f24870b = kVarR4;
            r1Var.f24876h = i17;
            r1Var.f24879k = 1;
            Object objA = z52.c.a(kVarR4, powerZonesDTO, list, r1Var);
            if (objA != aVar3) {
                int i18 = i17;
                workoutDetailsDTO = workoutDetailsDTO2;
                obj = objA;
                kVar = kVarR4;
                i14 = i18;
            }
            return aVar3;
        }
        if (i16 == 1) {
            i14 = r1Var.f24876h;
            kVar = r1Var.f24870b;
            workoutDetailsDTO = r1Var.f24869a;
            o13.r.b(obj);
        } else {
            if (i16 == 2) {
                i14 = r1Var.f24876h;
                l1 l1Var = r1Var.f24875g;
                WorkoutScheduleDTO workoutScheduleDTO2 = r1Var.f24874f;
                workoutDetailsDTO = r1Var.f24873e;
                jVar = r1Var.f24872d;
                z52.a aVar4 = r1Var.f24871c;
                o13.r.b(obj);
                l1VarG4 = l1Var;
                aVar = aVar4;
                workoutScheduleDTO = workoutScheduleDTO2;
                jVar2 = jVar;
                aVar2 = new com.garmin.android.apps.connectmobile.workouts.presentation.details.e.a(workoutDetailsDTO, workoutScheduleDTO, l1VarG4, null, (com.garmin.android.apps.connectmobile.workouts.data.model.y) obj, null, null, aVar, 104, null);
                r1Var.f24869a = null;
                r1Var.f24870b = null;
                r1Var.f24871c = null;
                r1Var.f24872d = null;
                r1Var.f24873e = null;
                r1Var.f24874f = null;
                r1Var.f24875g = null;
                r1Var.f24876h = i14;
                r1Var.f24879k = 3;
                if (v52.d.a(jVar2, aVar2, r1Var) != aVar3) {
                    q53.w<v52.c<? extends com.garmin.android.apps.connectmobile.workouts.presentation.details.d>> wVar = fVar.f48598k0;
                    com.garmin.android.apps.connectmobile.workouts.presentation.details.d.a aVar5 = new com.garmin.android.apps.connectmobile.workouts.presentation.details.d.a(fVar.I);
                    r1Var.f24869a = null;
                    r1Var.f24870b = null;
                    r1Var.f24871c = null;
                    r1Var.f24876h = i14;
                    r1Var.f24879k = 4;
                }
                return aVar3;
            }
            if (i16 == 3) {
                i14 = r1Var.f24876h;
                o13.r.b(obj);
                q53.w<v52.c<? extends com.garmin.android.apps.connectmobile.workouts.presentation.details.d>> wVar2 = fVar.f48598k0;
                com.garmin.android.apps.connectmobile.workouts.presentation.details.d.a aVar6 = new com.garmin.android.apps.connectmobile.workouts.presentation.details.d.a(fVar.I);
                r1Var.f24869a = null;
                r1Var.f24870b = null;
                r1Var.f24871c = null;
                r1Var.f24876h = i14;
                r1Var.f24879k = 4;
            } else {
                if (i16 != 4) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
        }
        return Unit.INSTANCE;
        z52.a aVar7 = (z52.a) obj;
        if (k52.g.f(kVar) || ((Set) k52.g.f102954c.getValue()).contains(kVar)) {
            boolean zG = p005kotlin.jvm.internal.s.g(workoutDetailsDTO.I0, Boolean.TRUE);
            h0 h0Var = (h0) p13.h0.d0(workoutDetailsDTO.Q0);
            ge1.b.T(v1.a(fVar), null, null, new com.garmin.android.apps.connectmobile.workouts.presentation.details.l(fVar, k52.g.c(kVar), h0Var != null ? h0Var.t() : null, kVar, aVar7, zG, null), 3);
        } else {
            if (i14 == 0) {
                jVar = fVar.Y;
                workoutScheduleDTO = fVar.f48606t;
                l1VarG4 = fVar.G4(workoutDetailsDTO);
                o52.c cVar2 = fVar.f48594h;
                r1Var.f24869a = null;
                r1Var.f24870b = null;
                r1Var.f24871c = aVar7;
                r1Var.f24872d = jVar;
                r1Var.f24873e = workoutDetailsDTO;
                r1Var.f24874f = workoutScheduleDTO;
                r1Var.f24875g = l1VarG4;
                r1Var.f24876h = i14;
                r1Var.f24879k = 2;
                Object objA2 = cVar2.a(kVar, r1Var);
                if (objA2 != aVar3) {
                    aVar = aVar7;
                    obj = objA2;
                    jVar2 = jVar;
                    aVar2 = new com.garmin.android.apps.connectmobile.workouts.presentation.details.e.a(workoutDetailsDTO, workoutScheduleDTO, l1VarG4, null, (com.garmin.android.apps.connectmobile.workouts.data.model.y) obj, null, null, aVar, 104, null);
                    r1Var.f24869a = null;
                    r1Var.f24870b = null;
                    r1Var.f24871c = null;
                    r1Var.f24872d = null;
                    r1Var.f24873e = null;
                    r1Var.f24874f = null;
                    r1Var.f24875g = null;
                    r1Var.f24876h = i14;
                    r1Var.f24879k = 3;
                    if (v52.d.a(jVar2, aVar2, r1Var) != aVar3) {
                        q53.w<v52.c<? extends com.garmin.android.apps.connectmobile.workouts.presentation.details.d>> wVar3 = fVar.f48598k0;
                        com.garmin.android.apps.connectmobile.workouts.presentation.details.d.a aVar8 = new com.garmin.android.apps.connectmobile.workouts.presentation.details.d.a(fVar.I);
                        r1Var.f24869a = null;
                        r1Var.f24870b = null;
                        r1Var.f24871c = null;
                        r1Var.f24876h = i14;
                        r1Var.f24879k = 4;
                    }
                }
                return aVar3;
            }
            Iterator<T> it = workoutDetailsDTO.Q0.iterator();
            while (it.hasNext()) {
                m52.k kVar2 = ((h0) it.next()).f48193h;
                boolean zG2 = p005kotlin.jvm.internal.s.g(workoutDetailsDTO.I0, Boolean.TRUE);
                h0 h0Var2 = (h0) p13.h0.d0(workoutDetailsDTO.Q0);
                z52.a aVar9 = aVar7;
                aVar7 = aVar9;
                ge1.b.T(v1.a(fVar), null, null, new com.garmin.android.apps.connectmobile.workouts.presentation.details.l(fVar, k52.g.c(kVar2), h0Var2 != null ? h0Var2.t() : null, kVar2, aVar9, zG2, null), 3);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Object y4(f fVar, String str, WorkoutDetailsDTO workoutDetailsDTO, v13.c cVar) {
        s1 s1Var;
        WorkoutDetailsDTO workoutDetailsDTO2;
        WorkoutDetailsDTO workoutDetailsDTO3;
        WorkoutDetailsDTO workoutDetailsDTO4;
        int i14;
        int i15;
        WorkoutDetailsDTO workoutDetailsDTO5;
        WorkoutDetailsDTO workoutDetailsDTO6;
        WorkoutDetailsDTO workoutDetailsDTO7;
        l52.y yVar = fVar.f48588b;
        if (cVar instanceof s1) {
            s1Var = (s1) cVar;
            int i16 = s1Var.f24891j;
            if ((i16 & Integer.MIN_VALUE) != 0) {
                s1Var.f24891j = i16 - Integer.MIN_VALUE;
            } else {
                s1Var = new s1(fVar, cVar);
            }
        } else {
            s1Var = new s1(fVar, cVar);
        }
        Object objT = s1Var.f24889h;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i17 = s1Var.f24891j;
        try {
            if (i17 == 0) {
                o13.r.b(objT);
                String str2 = workoutDetailsDTO.E;
                if (str2 == null) {
                    a2 a2Var = a2.WORKOUTS;
                    i2.f36769a.getClass();
                    i2.a.f(a2Var, "WorkoutDetailsViewModel", "workoutSourceId is null, not going to fetch msn Workout Details.");
                    return Unit.INSTANCE;
                }
                s1Var.f24882a = workoutDetailsDTO;
                s1Var.f24891j = 1;
                objT = yVar.t(str, str2, s1Var);
                if (objT == aVar) {
                }
                return aVar;
            }
            if (i17 == 1) {
                workoutDetailsDTO = s1Var.f24882a;
                o13.r.b(objT);
            } else {
                if (i17 == 2) {
                    int i18 = s1Var.f24888g;
                    int i19 = s1Var.f24887f;
                    WorkoutDetailsDTO workoutDetailsDTO8 = s1Var.f24886e;
                    workoutDetailsDTO3 = s1Var.f24885d;
                    workoutDetailsDTO4 = s1Var.f24884c;
                    workoutDetailsDTO2 = s1Var.f24883b;
                    o13.r.b(objT);
                    i14 = i18;
                    workoutDetailsDTO5 = workoutDetailsDTO8;
                    i15 = i19;
                    s1Var.f24882a = null;
                    s1Var.f24883b = workoutDetailsDTO2;
                    s1Var.f24884c = workoutDetailsDTO4;
                    s1Var.f24885d = workoutDetailsDTO3;
                    s1Var.f24886e = workoutDetailsDTO5;
                    s1Var.f24887f = i15;
                    s1Var.f24888g = i14;
                    s1Var.f24891j = 3;
                    objT = ((o53.i0) objT).await(s1Var);
                    if (objT != aVar) {
                        workoutDetailsDTO6 = workoutDetailsDTO3;
                        workoutDetailsDTO7 = workoutDetailsDTO2;
                    }
                    return aVar;
                }
                if (i17 != 3) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                workoutDetailsDTO5 = s1Var.f24886e;
                workoutDetailsDTO6 = s1Var.f24885d;
                workoutDetailsDTO7 = s1Var.f24883b;
                o13.r.b(objT);
            }
            workoutDetailsDTO5.P = (String) objT;
            workoutDetailsDTO6.I0 = workoutDetailsDTO7.I0;
            return Unit.INSTANCE;
            v2 v2Var = (v2) objT;
            if (v2Var instanceof v2.b) {
                WorkoutDetailsDTO workoutDetailsDTO9 = (WorkoutDetailsDTO) ((v2.b) v2Var).f47386a;
                workoutDetailsDTO.F = workoutDetailsDTO9.F;
                workoutDetailsDTO.f48062x = workoutDetailsDTO9.f48062x;
                workoutDetailsDTO.B = workoutDetailsDTO9.B;
                s1Var.f24882a = null;
                s1Var.f24883b = workoutDetailsDTO9;
                s1Var.f24884c = workoutDetailsDTO;
                s1Var.f24885d = workoutDetailsDTO;
                s1Var.f24886e = workoutDetailsDTO;
                s1Var.f24887f = 0;
                s1Var.f24888g = 0;
                s1Var.f24891j = 2;
                o53.i0 i0VarB = yVar.b();
                if (i0VarB != aVar) {
                    workoutDetailsDTO2 = workoutDetailsDTO9;
                    workoutDetailsDTO3 = workoutDetailsDTO;
                    workoutDetailsDTO4 = workoutDetailsDTO3;
                    objT = i0VarB;
                    i14 = 0;
                    i15 = 0;
                    workoutDetailsDTO5 = workoutDetailsDTO4;
                    s1Var.f24882a = null;
                    s1Var.f24883b = workoutDetailsDTO2;
                    s1Var.f24884c = workoutDetailsDTO4;
                    s1Var.f24885d = workoutDetailsDTO3;
                    s1Var.f24886e = workoutDetailsDTO5;
                    s1Var.f24887f = i15;
                    s1Var.f24888g = i14;
                    s1Var.f24891j = 3;
                    objT = ((o53.i0) objT).await(s1Var);
                    if (objT != aVar) {
                        workoutDetailsDTO6 = workoutDetailsDTO3;
                        workoutDetailsDTO7 = workoutDetailsDTO2;
                        workoutDetailsDTO5.P = (String) objT;
                        workoutDetailsDTO6.I0 = workoutDetailsDTO7.I0;
                    }
                }
                return aVar;
            }
        } catch (Throwable unused) {
            a2 a2Var2 = a2.WORKOUTS;
            i2.f36769a.getClass();
            i2.a.f(a2Var2, "WorkoutDetailsViewModel", "No MSN or Garmin workout details found. Going head with available details.");
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object z4(f fVar, String str, String str2, v13.c cVar) {
        c62.u1 u1Var;
        fVar.getClass();
        if (cVar instanceof c62.u1) {
            u1Var = (c62.u1) cVar;
            int i14 = u1Var.f24910d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                u1Var.f24910d = i14 - Integer.MIN_VALUE;
            } else {
                u1Var = new c62.u1(fVar, cVar);
            }
        } else {
            u1Var = new c62.u1(fVar, cVar);
        }
        Object objV = u1Var.f24908b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = u1Var.f24910d;
        if (i15 == 0) {
            o13.r.b(objV);
            i62.p.f91878a.getClass();
            str2.getClass();
            if (i62.p.f91879b.get(str2) == null) {
                l52.y yVar = fVar.f48588b;
                u1Var.f24907a = str2;
                u1Var.f24910d = 1;
                objV = yVar.V(str, str2, u1Var);
                if (objV == aVar) {
                    return aVar;
                }
            }
            return Unit.INSTANCE;
        }
        if (i15 != 1) {
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        str2 = u1Var.f24907a;
        o13.r.b(objV);
        v2 v2Var = (v2) objV;
        if (v2Var instanceof v2.b) {
            i62.p pVar = i62.p.f91878a;
            Iterable iterable = (Iterable) ((v2.b) v2Var).f47386a;
            ArrayList arrayList = new ArrayList(p13.y.r(iterable, 10));
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                q6.f.s(((WorkoutDetailsDTO) it.next()).f48040a, arrayList);
            }
            pVar.getClass();
            str2.getClass();
            i62.p.f91879b.put(str2, new ArrayList(arrayList));
        } else {
            if (!(v2Var instanceof v2.a)) {
                u0.r();
                return null;
            }
            String str3 = "Failed to fetch my workouts cloned from source " + str2 + ", error: " + ((v2.a) v2Var).f47383a;
            i2.a aVar2 = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar2.getClass();
            i2.a.f(a2Var, "WorkoutDetailsViewModel", str3);
        }
        return Unit.INSTANCE;
    }

    @Override // c62.t
    public final void A3() {
        d5(false);
    }

    @Override // c62.t
    public final void C1() {
        ge1.b.T(v1.a(this), null, null, new C0947f(null), 3);
    }

    /* JADX WARN: Code duplicated, block: B:107:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:57:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:64:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:71:0x010d  */
    /* JADX WARN: Code duplicated, block: B:78:0x011e  */
    /* JADX WARN: Code duplicated, block: B:81:0x0125  */
    /* JADX WARN: Code duplicated, block: B:83:0x012f  */
    /* JADX WARN: Code duplicated, block: B:86:0x013d  */
    /* JADX WARN: Code duplicated, block: B:88:0x0142  */
    /* JADX WARN: Code duplicated, block: B:90:0x0152  */
    /* JADX WARN: Code duplicated, block: B:93:0x015d  */
    /* JADX WARN: Code duplicated, block: B:96:0x0179  */
    public final l1 G4(WorkoutDetailsDTO workoutDetailsDTO) {
        l52.i<j0> iVarD;
        h0 h0VarT4;
        String strC;
        String str;
        com.garmin.android.apps.connectmobile.workouts.presentation.edit.d dVarA;
        f62.o oVar;
        Integer estimatedDurationInSecs;
        Double estimatedDistanceInMeters;
        m52.b estimateType;
        m52.j estimatedDistanceUnit;
        com.garmin.android.apps.connectmobile.workouts.presentation.edit.g aVar;
        com.garmin.android.apps.connectmobile.workouts.presentation.edit.g gVar;
        l1 l1Var;
        f62.p bVar;
        f62.p pVar;
        l1 l1Var2;
        com.garmin.android.apps.connectmobile.workouts.data.model.a aVarC;
        m52.k kVar;
        c62.c cVarI4;
        com.garmin.android.apps.connectmobile.workouts.presentation.details.c cVar;
        boolean z14;
        boolean z15;
        boolean z16;
        a aVar2;
        double dDoubleValue;
        Double avgTrainingSpeed;
        String str2;
        if (g22.n.d(workoutDetailsDTO.f48056p) && ((str2 = workoutDetailsDTO.f48057q) == null || str2.length() == 0)) {
            workoutDetailsDTO.f48057q = Q4().getString(R.string.unknown);
        }
        int i14 = 18;
        if (g22.n.d(workoutDetailsDTO.f48057q) || workoutDetailsDTO.Q0.isEmpty() || (h0VarT4 = T4(workoutDetailsDTO)) == null || (iVarD = h0VarT4.t()) == null) {
            iVarD = l52.n.d(new w2(i14));
        }
        l52.i<j0> iVar = iVarD;
        m52.k kVarR4 = R4(workoutDetailsDTO, Boolean.FALSE);
        o13.t tVar = k52.g.f102952a;
        boolean z17 = true;
        l52.o.a(iVar, l52.h.PRE_ORDER, new n1(kVarR4 == m52.k.f116759t && this.f48609x != null, this, kVarR4));
        boolean zA5 = a5(workoutDetailsDTO);
        h0 h0VarT5 = T4(workoutDetailsDTO);
        if (!this.F || zA5 || (Double.isNaN(workoutDetailsDTO.Z) && Double.isNaN(workoutDetailsDTO.f48051k0))) {
            z17 = false;
        }
        if (!a5(workoutDetailsDTO)) {
            com.garmin.android.apps.connectmobile.workouts.data.model.w wVar = workoutDetailsDTO.N0;
            if (wVar != null) {
                Resources resourcesQ4 = Q4();
                resourcesQ4.getClass();
                strC = wVar.C(resourcesQ4);
            } else {
                strC = workoutDetailsDTO.f48046g;
            }
        } else {
            if (!this.E) {
                h0 h0VarT6 = T4(workoutDetailsDTO);
                if (h0VarT6 != null) {
                    strC = h0VarT6.getDescription();
                } else {
                    str = null;
                }
                com.garmin.android.apps.connectmobile.workouts.presentation.edit.d.a aVar3 = com.garmin.android.apps.connectmobile.workouts.presentation.edit.d.f48945a;
                Double d14 = workoutDetailsDTO.f48047h;
                m52.j jVar = workoutDetailsDTO.f48048i;
                aVar3.getClass();
                dVarA = com.garmin.android.apps.connectmobile.workouts.presentation.edit.d.a.a(d14, jVar);
                if (zA5 || this.E) {
                    estimatedDurationInSecs = workoutDetailsDTO.f48049j;
                } else {
                    estimatedDurationInSecs = h0VarT5 != null ? h0VarT5.getEstimatedDurationInSecs() : null;
                }
                if (zA5 || this.E) {
                    estimatedDistanceInMeters = workoutDetailsDTO.f48050k;
                } else {
                    estimatedDistanceInMeters = h0VarT5 != null ? h0VarT5.getEstimatedDistanceInMeters() : null;
                }
                if (zA5 || this.E) {
                    estimateType = workoutDetailsDTO.f48053m;
                } else {
                    estimateType = h0VarT5 != null ? h0VarT5.getEstimateType() : null;
                }
                if (zA5 || this.E) {
                    estimatedDistanceUnit = workoutDetailsDTO.f48054n;
                } else {
                    estimatedDistanceUnit = h0VarT5 != null ? h0VarT5.getEstimatedDistanceUnit() : null;
                }
                oVar = new f62.o(estimatedDurationInSecs, estimatedDistanceInMeters, estimateType, estimatedDistanceUnit);
                if (zA5) {
                    aVar = new com.garmin.android.apps.connectmobile.workouts.presentation.edit.g.a(this.f48600m, workoutDetailsDTO.a0() - (h0VarT5 != null ? h0VarT5.s() : 0), zf.b.B(workoutDetailsDTO));
                } else {
                    aVar = com.garmin.android.apps.connectmobile.workouts.presentation.edit.g.b.f48995a;
                }
                gVar = aVar;
                if (z17) {
                    l1Var = null;
                    bVar = new f62.p.b(workoutDetailsDTO.Z, workoutDetailsDTO.f48051k0);
                } else {
                    l1Var = null;
                    bVar = f62.p.a.f69298a;
                }
                pVar = bVar;
                l1Var2 = l1Var;
                aVarC = workoutDetailsDTO.C();
                if (kVarR4 == null) {
                    kVarR4 = m52.k.f116756p;
                }
                kVar = kVarR4;
                cVarI4 = I4(workoutDetailsDTO);
                cVar = this.I;
                z14 = this.f48604q;
                z15 = this.f48601n;
                z16 = this.A;
                aVar2 = this.X;
                if (aVar2 != null) {
                    kg.f.n("AudioNoteHandler is not set yet.");
                    return l1Var2;
                }
                String str3 = aVar2.f48612a;
                o13.p<Boolean, Double> pVar2 = this.f48602o;
                List<com.garmin.android.apps.connectmobile.workouts.data.model.v> list = this.f48608w;
                PowerZonesDTO powerZonesDTO = this.f48610y;
                dDoubleValue = 0.0d;
                if (!zA5 ? (avgTrainingSpeed = workoutDetailsDTO.f48052l) != null : !(h0VarT5 == null || (avgTrainingSpeed = h0VarT5.getAvgTrainingSpeed()) == null)) {
                    dDoubleValue = avgTrainingSpeed.doubleValue();
                }
                return new l1(cVar, z14, z15, z16, kVar, str3, oVar, dVarA, gVar, iVar, str, aVarC, cVarI4, pVar, pVar2, list, powerZonesDTO, dDoubleValue, this.f48607v, this.F, this.C, this.P, this.T, this.f48603p);
            }
            strC = workoutDetailsDTO.f48046g;
        }
        str = strC;
        com.garmin.android.apps.connectmobile.workouts.presentation.edit.d.a aVar4 = com.garmin.android.apps.connectmobile.workouts.presentation.edit.d.f48945a;
        Double d15 = workoutDetailsDTO.f48047h;
        m52.j jVar2 = workoutDetailsDTO.f48048i;
        aVar4.getClass();
        dVarA = com.garmin.android.apps.connectmobile.workouts.presentation.edit.d.a.a(d15, jVar2);
        if (zA5) {
            estimatedDurationInSecs = workoutDetailsDTO.f48049j;
        } else {
            estimatedDurationInSecs = workoutDetailsDTO.f48049j;
        }
        if (zA5) {
            estimatedDistanceInMeters = workoutDetailsDTO.f48050k;
        } else {
            estimatedDistanceInMeters = workoutDetailsDTO.f48050k;
        }
        if (zA5) {
            estimateType = workoutDetailsDTO.f48053m;
        } else {
            estimateType = workoutDetailsDTO.f48053m;
        }
        if (zA5) {
            estimatedDistanceUnit = workoutDetailsDTO.f48054n;
        } else {
            estimatedDistanceUnit = workoutDetailsDTO.f48054n;
        }
        oVar = new f62.o(estimatedDurationInSecs, estimatedDistanceInMeters, estimateType, estimatedDistanceUnit);
        if (zA5) {
            aVar = new com.garmin.android.apps.connectmobile.workouts.presentation.edit.g.a(this.f48600m, workoutDetailsDTO.a0() - (h0VarT5 != null ? h0VarT5.s() : 0), zf.b.B(workoutDetailsDTO));
        } else {
            aVar = com.garmin.android.apps.connectmobile.workouts.presentation.edit.g.b.f48995a;
        }
        gVar = aVar;
        if (z17) {
            l1Var = null;
            bVar = new f62.p.b(workoutDetailsDTO.Z, workoutDetailsDTO.f48051k0);
        } else {
            l1Var = null;
            bVar = f62.p.a.f69298a;
        }
        pVar = bVar;
        l1Var2 = l1Var;
        aVarC = workoutDetailsDTO.C();
        if (kVarR4 == null) {
            kVarR4 = m52.k.f116756p;
        }
        kVar = kVarR4;
        cVarI4 = I4(workoutDetailsDTO);
        cVar = this.I;
        z14 = this.f48604q;
        z15 = this.f48601n;
        z16 = this.A;
        aVar2 = this.X;
        if (aVar2 != null) {
            kg.f.n("AudioNoteHandler is not set yet.");
            return l1Var2;
        }
        String str4 = aVar2.f48612a;
        o13.p<Boolean, Double> pVar3 = this.f48602o;
        List<com.garmin.android.apps.connectmobile.workouts.data.model.v> list2 = this.f48608w;
        PowerZonesDTO powerZonesDTO2 = this.f48610y;
        dDoubleValue = 0.0d;
        if (!zA5) {
            dDoubleValue = avgTrainingSpeed.doubleValue();
        }
        return new l1(cVar, z14, z15, z16, kVar, str4, oVar, dVarA, gVar, iVar, str, aVarC, cVarI4, pVar, pVar3, list2, powerZonesDTO2, dDoubleValue, this.f48607v, this.F, this.C, this.P, this.T, this.f48603p);
    }

    public final WorkoutDetailsDTO H4(WorkoutDetailsDTO workoutDetailsDTO, boolean z14) {
        WorkoutDetailsDTO workoutDetailsDTO2 = new WorkoutDetailsDTO();
        workoutDetailsDTO2.f48049j = workoutDetailsDTO.f48049j;
        workoutDetailsDTO2.f48050k = workoutDetailsDTO.f48050k;
        workoutDetailsDTO2.f48052l = workoutDetailsDTO.f48052l;
        workoutDetailsDTO2.f48053m = workoutDetailsDTO.f48053m;
        x0 x0Var = x0.f105818a;
        String string = Q4().getString(R.string.workout_duplicate_default_format);
        string.getClass();
        workoutDetailsDTO2.f48041b = String.format(string, Arrays.copyOf(new Object[]{workoutDetailsDTO.f48041b}, 1));
        workoutDetailsDTO2.f48046g = workoutDetailsDTO.f48046g;
        workoutDetailsDTO2.D = workoutDetailsDTO.D;
        workoutDetailsDTO2.E = workoutDetailsDTO.E;
        m52.k kVarR4 = R4(workoutDetailsDTO, Boolean.valueOf(z14));
        if (kVarR4 == null) {
            kVarR4 = m52.k.f116756p;
        }
        kVarR4.getClass();
        workoutDetailsDTO2.f48044e = kVarR4;
        List<h0> list = workoutDetailsDTO.Q0;
        list.getClass();
        workoutDetailsDTO2.Q0 = list;
        m52.l lVar = workoutDetailsDTO.f48045f;
        lVar.getClass();
        workoutDetailsDTO2.f48045f = lVar;
        workoutDetailsDTO2.I0 = workoutDetailsDTO.I0;
        workoutDetailsDTO2.J0 = workoutDetailsDTO.J0;
        return workoutDetailsDTO2;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x003f  */
    public final c62.c I4(WorkoutDetailsDTO workoutDetailsDTO) {
        long jLongValue;
        boolean z14 = this.E;
        if (workoutDetailsDTO == null || workoutDetailsDTO.f48040a > 0) {
            jLongValue = -1;
        } else {
            String str = workoutDetailsDTO.E;
            if (g22.n.d(str)) {
                i62.p.f91878a.getClass();
                str.getClass();
                List<Long> list = i62.p.f91879b.get(str);
                if (list == null || list.isEmpty()) {
                    jLongValue = -1;
                } else {
                    jLongValue = list.get(0).longValue();
                }
            } else {
                jLongValue = -1;
            }
        }
        Resources resourcesQ4 = Q4();
        resourcesQ4.getClass();
        boolean z15 = this.E;
        workoutDetailsDTO.getClass();
        String str2 = workoutDetailsDTO.f48041b;
        String str3 = workoutDetailsDTO.f48062x;
        String strG = tn.k.g(i62.n.b(), workoutDetailsDTO.F);
        String string = resourcesQ4.getString(workoutDetailsDTO.f48044e.f116769e);
        string.getClass();
        String str4 = workoutDetailsDTO.f48064z;
        String str5 = workoutDetailsDTO.f48060v;
        l3.a aVar = l3.f23124b;
        Integer num = workoutDetailsDTO.f48049j;
        int iIntValue = num != null ? num.intValue() : 0;
        aVar.getClass();
        return new c62.c(z14, jLongValue, new com.garmin.android.apps.connectmobile.workouts.data.model.p(str2, str3, strG, string, str4, str5, (int) (((double) iIntValue) / 60.0d), workoutDetailsDTO.I, z15, workoutDetailsDTO.f48061w, workoutDetailsDTO.H0));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object J4(WorkoutDetailsDTO workoutDetailsDTO, WorkoutDetailsDTO workoutDetailsDTO2, v13.c cVar) throws Throwable {
        o1 o1Var;
        if (cVar instanceof o1) {
            o1Var = (o1) cVar;
            int i14 = o1Var.f24826d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                o1Var.f24826d = i14 - Integer.MIN_VALUE;
            } else {
                o1Var = new o1(this, cVar);
            }
        } else {
            o1Var = new o1(this, cVar);
        }
        Object objE0 = o1Var.f24824b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = o1Var.f24826d;
        if (i15 == 0) {
            o13.r.b(objE0);
            x53.c cVar2 = s0.f129406a;
            x53.b bVar = x53.b.f189152a;
            p1 p1Var = new p1(this, workoutDetailsDTO, null);
            o1Var.f24823a = workoutDetailsDTO2;
            o1Var.f24826d = 1;
            objE0 = ge1.b.e0(bVar, p1Var, o1Var);
            if (objE0 == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            workoutDetailsDTO2 = o1Var.f24823a;
            o13.r.b(objE0);
        }
        v2 v2Var = (v2) objE0;
        if (!(v2Var instanceof v2.b)) {
            if (v2Var instanceof v2.a) {
                int i16 = o13.q.f128596b;
                return o13.r.a(((v2.a) v2Var).f47383a);
            }
            u0.r();
            return null;
        }
        WorkoutDetailsDTO workoutDetailsDTO3 = (WorkoutDetailsDTO) ((v2.b) v2Var).f47386a;
        if (workoutDetailsDTO2 != null) {
            String str = workoutDetailsDTO2.F;
            String str2 = workoutDetailsDTO2.f48062x;
            String str3 = workoutDetailsDTO2.B;
            workoutDetailsDTO3.F = str;
            workoutDetailsDTO3.f48062x = str2;
            workoutDetailsDTO3.B = str3;
            i62.p pVar = i62.p.f91878a;
            String str4 = workoutDetailsDTO3.E;
            Long l14 = new Long(workoutDetailsDTO3.f48040a);
            pVar.getClass();
            i62.p.a(l14, str4);
        }
        int i17 = o13.q.f128596b;
        return workoutDetailsDTO3;
    }

    public final void K4(e23.l<? super t13.d<? super Unit>, ? extends Object> lVar) {
        ge1.b.T(v1.a(this), null, null, new e(lVar, null), 3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object L4(v13.c cVar) throws Throwable {
        q1 q1Var;
        Object objJ4;
        if (cVar instanceof q1) {
            q1Var = (q1) cVar;
            int i14 = q1Var.f24864d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                q1Var.f24864d = i14 - Integer.MIN_VALUE;
            } else {
                q1Var = new q1(this, cVar);
            }
        } else {
            q1Var = new q1(this, cVar);
        }
        Object obj = q1Var.f24862b;
        Object obj2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = q1Var.f24864d;
        if (i15 == 0) {
            o13.r.b(obj);
            WorkoutDetailsDTO workoutDetailsDTO = this.f48605r;
            if (workoutDetailsDTO == null) {
                int i16 = o13.q.f128596b;
                return new o13.q.b(new IllegalStateException("Workout details are null"));
            }
            if (workoutDetailsDTO.Z() != null && !this.E) {
                int i17 = o13.q.f128596b;
                return workoutDetailsDTO;
            }
            WorkoutDetailsDTO workoutDetailsDTOH4 = H4(workoutDetailsDTO, false);
            q1Var.f24864d = 1;
            objJ4 = J4(workoutDetailsDTOH4, workoutDetailsDTO, q1Var);
            if (objJ4 != obj2) {
            }
            return obj2;
        }
        if (i15 != 1) {
            if (i15 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            Object obj3 = q1Var.f24861a;
            o13.r.b(obj);
            return obj3;
        }
        o13.r.b(obj);
        objJ4 = ((o13.q) obj).f128597a;
        int i18 = o13.q.f128596b;
        if (!(objJ4 instanceof o13.q.b)) {
            WorkoutDetailsDTO workoutDetailsDTO2 = (WorkoutDetailsDTO) objJ4;
            this.E = false;
            this.f48605r = workoutDetailsDTO2;
            com.garmin.android.apps.connectmobile.workouts.presentation.details.e eVar = (com.garmin.android.apps.connectmobile.workouts.presentation.details.e) v52.d.b(this.Z);
            if (eVar != null) {
                com.garmin.android.apps.connectmobile.workouts.presentation.details.e eVarC = eVar.C(workoutDetailsDTO2, I4(workoutDetailsDTO2));
                q1Var.f24861a = objJ4;
                q1Var.f24864d = 2;
                if (v52.d.a(this.Y, eVarC, q1Var) == obj2) {
                    return obj2;
                }
            }
        }
        return objJ4;
    }

    public void M4(String str) {
        str.getClass();
        ge1.b.T(v1.a(this), null, null, new c62.v1(this, str, null, null, null), 3);
    }

    public void N4(long j8, Long l14) {
        ge1.b.T(v1.a(this), null, null, new c62.v1(this, null, Long.valueOf(j8), l14, null), 3);
    }

    public final void O4(long j8) {
        ge1.b.T(v1.a(this), null, null, new i(j8, null), 3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object P4(am.x0 x0Var, boolean z14, v13.c cVar) {
        z1 z1Var;
        if (cVar instanceof z1) {
            z1Var = (z1) cVar;
            int i14 = z1Var.f24940c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                z1Var.f24940c = i14 - Integer.MIN_VALUE;
            } else {
                z1Var = new z1(this, cVar);
            }
        } else {
            z1Var = new z1(this, cVar);
        }
        Object objK = z1Var.f24938a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = z1Var.f24940c;
        if (i15 == 0) {
            o13.r.b(objK);
            z1Var.f24940c = 1;
            objK = this.f48588b.k(x0Var, z14, z1Var);
            if (objK == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objK);
        }
        v2 v2Var = (v2) objK;
        if (v2Var instanceof v2.b) {
            return (com.garmin.android.apps.connectmobile.repcounting.model.c) ((v2.b) v2Var).f47386a;
        }
        if (v2Var instanceof v2.a) {
            return null;
        }
        u0.r();
        return null;
    }

    public final Resources Q4() {
        return (Resources) this.f48591e.getValue();
    }

    public final m52.k R4(WorkoutDetailsDTO workoutDetailsDTO, Boolean bool) {
        if (!a5(workoutDetailsDTO)) {
            if (workoutDetailsDTO != null) {
                return workoutDetailsDTO.f48044e;
            }
            return null;
        }
        if (bool.booleanValue()) {
            return m52.k.A;
        }
        h0 h0VarT4 = T4(workoutDetailsDTO);
        if (h0VarT4 != null) {
            return h0VarT4.f48193h;
        }
        return null;
    }

    public final Long S4() {
        m52.k kVarR4 = R4(this.f48605r, Boolean.TRUE);
        nv nvVar = kVarR4 != null ? kVarR4.f116768d : null;
        if (nvVar != null) {
            return Long.valueOf(this.f48590d.y(nvVar));
        }
        return null;
    }

    public final h0 T4(WorkoutDetailsDTO workoutDetailsDTO) {
        List<h0> list;
        Object obj = null;
        if (workoutDetailsDTO == null || (list = workoutDetailsDTO.Q0) == null) {
            return null;
        }
        for (Object obj2 : list) {
            if (((h0) obj2).getSegmentOrder() == this.f48600m) {
                obj = obj2;
                break;
            }
        }
        return (h0) obj;
    }

    public final void U4(WorkoutDetailsDTO workoutDetailsDTO) {
        w9.a aVarA = v1.a(this);
        x53.c cVar = s0.f129406a;
        ge1.b.T(aVarA, x53.b.f189152a, null, new j(workoutDetailsDTO, this, null), 2);
    }

    @Override // c62.t
    public final boolean V1() {
        com.garmin.android.apps.connectmobile.workouts.presentation.details.e eVar;
        if (!this.f48595i.a() || (eVar = (com.garmin.android.apps.connectmobile.workouts.presentation.details.e) v52.d.b(this.Z)) == null || eVar.getF48583g().a() || !eVar.getF48583g().b()) {
            return false;
        }
        com.garmin.android.apps.connectmobile.workouts.data.model.y f48583g = eVar.getF48583g();
        f48583g.getClass();
        return (f48583g instanceof com.garmin.android.apps.connectmobile.workouts.data.model.y.a) || (f48583g instanceof com.garmin.android.apps.connectmobile.workouts.data.model.y.c);
    }

    public final Object V4(List list, boolean z14, C0947f.a aVar) {
        boolean zIsEmpty = list.isEmpty();
        q53.w<v52.c<? extends com.garmin.android.apps.connectmobile.workouts.presentation.details.d>> wVar = this.f48598k0;
        if (zIsEmpty) {
            i2.a aVar2 = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar2.getClass();
            i2.a.b(a2Var, "WorkoutDetailsViewModel", "No screenless devices available for workout");
            Object objD = v52.d.d(wVar, com.garmin.android.apps.connectmobile.workouts.presentation.details.d.h.f48527a, aVar);
            return objD == u13.a.COROUTINE_SUSPENDED ? objD : Unit.INSTANCE;
        }
        if (list.size() != 1) {
            i2.a aVar3 = i2.f36769a;
            a2 a2Var2 = a2.GENERAL;
            aVar3.getClass();
            i2.a.b(a2Var2, "WorkoutDetailsViewModel", "Multiple screenless devices found for workout, showing device selection");
            Object objD2 = v52.d.d(wVar, new com.garmin.android.apps.connectmobile.workouts.presentation.details.d.n(list, z14), aVar);
            return objD2 == u13.a.COROUTINE_SUSPENDED ? objD2 : Unit.INSTANCE;
        }
        String strN = fb1.c.n("One screenless device found for workout, starting workout on device ", ((sd2.f) list.get(0)).getProductDisplayName());
        i2.a aVar4 = i2.f36769a;
        a2 a2Var3 = a2.GENERAL;
        aVar4.getClass();
        i2.a.b(a2Var3, "WorkoutDetailsViewModel", strN);
        K4(new com.garmin.android.apps.connectmobile.workouts.presentation.details.o(this, ((sd2.f) list.get(0)).getUnitID(), null));
        return Unit.INSTANCE;
    }

    public final boolean W4(WorkoutDetailsDTO workoutDetailsDTO) {
        h0 h0VarT4 = T4(workoutDetailsDTO);
        if (h0VarT4 == null) {
            return false;
        }
        Object objB = l52.o.b(h0VarT4.t(), l52.h.PRE_ORDER, new c50.a(6));
        int i14 = o13.q.f128596b;
        if (objB instanceof o13.q.b) {
            objB = null;
        }
        Boolean bool = (Boolean) objB;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public final ArrayList X4(WorkoutDetailsDTO workoutDetailsDTO) {
        ArrayList arrayList = new ArrayList();
        if ((workoutDetailsDTO != null ? workoutDetailsDTO.f48044e : null) == m52.k.f116758r) {
            h0 h0VarT4 = T4(workoutDetailsDTO);
            AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            AtomicBoolean atomicBoolean2 = new AtomicBoolean(false);
            AtomicBoolean atomicBoolean3 = new AtomicBoolean(false);
            AtomicBoolean atomicBoolean4 = new AtomicBoolean(false);
            if (!zf.b.D(workoutDetailsDTO.f48047h)) {
                String string = Q4().getString(R.string.lbl_unspecified_pool_sizes);
                string.getClass();
                arrayList.add(string);
            }
            if (W4(workoutDetailsDTO)) {
                o13.t tVar = k52.g.f102952a;
                if (bo1.a.a().c().U0()) {
                    String string2 = Q4().getString(R.string.lbl_workout_skip_last_step, Q4().getString(R.string.workout_step_type_rest));
                    string2.getClass();
                    arrayList.add(string2);
                }
            }
            if (h0VarT4 != null) {
                l52.o.a(h0VarT4.t(), l52.h.PRE_ORDER, new bm.h0(atomicBoolean, atomicBoolean2, atomicBoolean3, atomicBoolean4, 1));
            }
            if (atomicBoolean.get()) {
                String string3 = Q4().getString(R.string.lbl_kick_drill_types);
                string3.getClass();
                arrayList.add(string3);
            }
            if (atomicBoolean2.get()) {
                String string4 = Q4().getString(R.string.lbl_pull_drill_types);
                string4.getClass();
                arrayList.add(string4);
            }
            if (atomicBoolean3.get()) {
                String string5 = Q4().getString(R.string.workout_intensity_target);
                string5.getClass();
                arrayList.add(string5);
            }
            if (atomicBoolean4.get()) {
                String string6 = Q4().getString(R.string.lbl_im_by_round_stroke_types);
                string6.getClass();
                arrayList.add(string6);
            }
        }
        return arrayList;
    }

    public final boolean Y4() {
        return this.C > 0;
    }

    public final void Z4() {
        ge1.b.T(v1.a(this), null, null, new k(null), 3);
    }

    @Override // c62.t
    public final void a1() {
        ge1.b.T(v1.a(this), null, null, new u(null), 3);
    }

    public final void b5(long j8, long j14) {
        ge1.b.T(v1.a(this), null, null, new o(j8, j14, null), 3);
    }

    @Override // c62.t
    public final void c2() {
        this.f48595i.b();
    }

    public final w0 c5(long j8, boolean z14) {
        w0 w0Var = new w0(g3.a.c(g3.f35298f));
        ge1.b.T(v1.a(this), null, null, new com.garmin.android.apps.connectmobile.workouts.presentation.details.u(this, w0Var, z14, j8, null), 3);
        return w0Var;
    }

    @Override // c62.t
    public final void d3() {
        ge1.b.T(v1.a(this), null, null, new s(null), 3);
    }

    public final void d5(boolean z14) {
        ge1.b.T(v1.a(this), null, null, new r(z14, null), 3);
    }

    public final void e5(boolean z14, boolean z15, boolean z16, boolean z17, int i14, Long l14, Long l15, CalendarItemDTO calendarItemDTO, String str, String str2, com.garmin.android.apps.connectmobile.workouts.presentation.details.c cVar, boolean z18, boolean z19, Long l16) {
        cVar.getClass();
        this.f48601n = z14;
        this.A = z15;
        this.F = z16;
        this.f48600m = i14;
        this.I = cVar;
        this.P = z18;
        this.T = z19;
        this.D = (l16 == null || l16.longValue() <= -1) ? null : l16;
        if (z17) {
            if (l15.longValue() != -1) {
                O4(l15.longValue());
                return;
            }
            return;
        }
        if (l14.longValue() != -1) {
            N4(l14.longValue(), l15);
            return;
        }
        if (calendarItemDTO != null) {
            this.B = calendarItemDTO.f30967a;
            this.C = calendarItemDTO.f30971c;
            this.f48604q = calendarItemDTO.f30995n1;
            this.f48601n = calendarItemDTO.f30997o1;
            if (calendarItemDTO.f30993m1 == 0 || calendarItemDTO.G() || calendarItemDTO.f30971c > 0) {
                O4(this.B);
                return;
            } else {
                N4(calendarItemDTO.f30993m1, null);
                return;
            }
        }
        if (l15.longValue() != -1) {
            O4(l15.longValue());
            return;
        }
        if (z16) {
            if (str != null) {
                M4(str);
            }
        } else {
            if (str2 == null) {
                kg.f.n("Unhandled case. Not knowing how to do initial fetch.");
                return;
            }
            this.E = true;
            Resources resourcesQ4 = Q4();
            resourcesQ4.getClass();
            ge1.b.T(v1.a(this), null, null, new t1(this, i62.n.a(resourcesQ4), str2, null), 3);
        }
    }

    public final void f5(com.garmin.android.apps.connectmobile.workouts.presentation.details.b bVar) {
        bVar.getClass();
        ge1.b.T(v1.a(this), null, null, new t(bVar, null), 3);
    }

    @Override // c62.t
    public final void i3(String str, String str2) {
        str.getClass();
        ge1.b.T(v1.a(this), null, null, new q(str, str2, null), 3);
    }

    @Override // c62.t
    public final void o0() {
        p1();
        ge1.b.T(v1.a(this), null, null, new n(null), 3);
    }

    @Override // c62.t
    public final void p1() {
        f5(com.garmin.android.apps.connectmobile.workouts.presentation.details.b.a.f48509a);
    }

    @Override // c62.t
    public final void s2() {
        d5(false);
        ge1.b.T(v1.a(this), null, null, new m(null), 3);
    }

    @Override // c62.t
    public final void s4() {
        ge1.b.T(v1.a(this), null, null, new h(null), 3);
    }

    @Override // c62.t
    public final void t(e23.a aVar, String str, String str2) {
        str.getClass();
        str2.getClass();
        aVar.getClass();
        ge1.b.T(v1.a(this), null, null, new g(str, str2, aVar, null), 3);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/workouts/presentation/details/f$b;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private b() {
        }
    }
}
