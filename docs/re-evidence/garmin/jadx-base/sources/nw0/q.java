package nw0;

import c2.n3;
import c2.x2;
import ch.qos.logback.core.net.SyslogConstants;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import g02.q0;
import i3.e9;
import i3.mc;
import i3.ve;
import java.util.ArrayList;
import java.util.List;
import kotlin.t1;
import l72.c1;
import l72.i3;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.l0;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.x1;
import p3.x3;
import r53.p2;
import v62.o7;

/* JADX INFO: loaded from: classes9.dex */
public final class q {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.logging.presentation.settings.LifestyleLoggingEditBehaviorsScreenKt$EditBehavioursScreen$1$1$1", f = "LifestyleLoggingEditBehaviorsScreen.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.l<pv0.b, Unit> f128077a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ pv0.b f128078b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(e23.l<? super pv0.b, Unit> lVar, pv0.b bVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f128077a = lVar;
            this.f128078b = bVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f128077a, this.f128078b, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            this.f128077a.invoke(this.f128078b);
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.logging.presentation.settings.LifestyleLoggingEditBehaviorsScreenKt$EditBehavioursScreen$1$3$1$1", f = "LifestyleLoggingEditBehaviorsScreen.kt", l = {209}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f128079a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ mc f128080b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(mc mcVar, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f128080b = mcVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new b(this.f128080b, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f128079a;
            if (i14 == 0) {
                o13.r.b(obj);
                this.f128079a = 1;
                if (this.f128080b.b(this) == aVar) {
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
    @v13.e(c = "com.garmin.android.apps.connectmobile.logging.presentation.settings.LifestyleLoggingEditBehaviorsScreenKt$EditBehavioursScreen$1$4$1$1", f = "LifestyleLoggingEditBehaviorsScreen.kt", l = {218}, m = "invokeSuspend", v = 2)
    public static final class c extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f128081a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ mc f128082b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(mc mcVar, t13.d<? super c> dVar) {
            super(2, dVar);
            this.f128082b = mcVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new c(this.f128082b, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f128081a;
            if (i14 == 0) {
                o13.r.b(obj);
                this.f128081a = 1;
                if (this.f128082b.b(this) == aVar) {
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
    @v13.e(c = "com.garmin.android.apps.connectmobile.logging.presentation.settings.LifestyleLoggingEditBehaviorsScreenKt$EditBehavioursScreen$1$6$1$1", f = "LifestyleLoggingEditBehaviorsScreen.kt", l = {221}, m = "invokeSuspend", v = 2)
    public static final class d extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f128083a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ mc f128084b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(mc mcVar, t13.d<? super d> dVar) {
            super(2, dVar);
            this.f128084b = mcVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new d(this.f128084b, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((d) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f128083a;
            if (i14 == 0) {
                o13.r.b(obj);
                this.f128083a = 1;
                if (this.f128084b.b(this) == aVar) {
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
    @v13.e(c = "com.garmin.android.apps.connectmobile.logging.presentation.settings.LifestyleLoggingEditBehaviorsScreenKt$EditBehavioursScreen$1$8$1$1", f = "LifestyleLoggingEditBehaviorsScreen.kt", l = {227}, m = "invokeSuspend", v = 2)
    public static final class e extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f128085a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ mc f128086b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(mc mcVar, t13.d<? super e> dVar) {
            super(2, dVar);
            this.f128086b = mcVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new e(this.f128086b, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((e) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f128085a;
            if (i14 == 0) {
                o13.r.b(obj);
                this.f128085a = 1;
                if (this.f128086b.b(this) == aVar) {
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
    @v13.e(c = "com.garmin.android.apps.connectmobile.logging.presentation.settings.LifestyleLoggingEditBehaviorsScreenKt$EditBehavioursScreen$2$1$1", f = "LifestyleLoggingEditBehaviorsScreen.kt", l = {252}, m = "invokeSuspend", v = 2)
    public static final class f extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f128087a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ mc f128088b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(mc mcVar, t13.d<? super f> dVar) {
            super(2, dVar);
            this.f128088b = mcVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new f(this.f128088b, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((f) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f128087a;
            if (i14 == 0) {
                o13.r.b(obj);
                this.f128087a = 1;
                if (this.f128088b.d(this) == aVar) {
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
    @v13.e(c = "com.garmin.android.apps.connectmobile.logging.presentation.settings.LifestyleLoggingEditBehaviorsScreenKt$EditBehavioursScreen$3$1$1", f = "LifestyleLoggingEditBehaviorsScreen.kt", l = {255}, m = "invokeSuspend", v = 2)
    public static final class g extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f128089a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ mc f128090b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(mc mcVar, t13.d<? super g> dVar) {
            super(2, dVar);
            this.f128090b = mcVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new g(this.f128090b, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((g) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f128089a;
            if (i14 == 0) {
                o13.r.b(obj);
                this.f128089a = 1;
                if (this.f128090b.d(this) == aVar) {
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
    @v13.e(c = "com.garmin.android.apps.connectmobile.logging.presentation.settings.LifestyleLoggingEditBehaviorsScreenKt$EditBehavioursScreen$4$1$1$1$1", f = "LifestyleLoggingEditBehaviorsScreen.kt", l = {266}, m = "invokeSuspend", v = 2)
    public static final class h extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f128091a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ mc f128092b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(mc mcVar, t13.d<? super h> dVar) {
            super(2, dVar);
            this.f128092b = mcVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new h(this.f128092b, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((h) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f128091a;
            if (i14 == 0) {
                o13.r.b(obj);
                this.f128091a = 1;
                if (this.f128092b.d(this) == aVar) {
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
    @v13.e(c = "com.garmin.android.apps.connectmobile.logging.presentation.settings.LifestyleLoggingEditBehaviorsScreenKt$EditBehavioursScreen$4$1$2$1$1", f = "LifestyleLoggingEditBehaviorsScreen.kt", l = {271}, m = "invokeSuspend", v = 2)
    public static final class i extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f128093a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ mc f128094b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(mc mcVar, t13.d<? super i> dVar) {
            super(2, dVar);
            this.f128094b = mcVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new i(this.f128094b, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((i) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f128093a;
            if (i14 == 0) {
                o13.r.b(obj);
                this.f128093a = 1;
                if (this.f128094b.d(this) == aVar) {
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
    @v13.e(c = "com.garmin.android.apps.connectmobile.logging.presentation.settings.LifestyleLoggingEditBehaviorsScreenKt$LifestyleLoggingEditBehaviorsScreen$2$1", f = "LifestyleLoggingEditBehaviorsScreen.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class j extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ r f128095a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ e23.l<Boolean, Unit> f128096b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ x3<nw0.d> f128097c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public j(r rVar, e23.l<? super Boolean, Unit> lVar, x3<nw0.d> x3Var, t13.d<? super j> dVar) {
            super(2, dVar);
            this.f128095a = rVar;
            this.f128096b = lVar;
            this.f128097c = x3Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new j(this.f128095a, this.f128096b, this.f128097c, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((j) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            Object value;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            h0 h0Var = this.f128097c.getF182175a().f128011b;
            if (h0Var instanceof h0.b) {
                p2 p2Var = this.f128095a.f128105f;
                do {
                    value = p2Var.getValue();
                } while (!p2Var.b(value, nw0.d.a((nw0.d) value, null, null, null, false, false, false, false, 125)));
                this.f128096b.invoke(Boolean.valueOf(((h0.b) h0Var).f128043a));
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.logging.presentation.settings.LifestyleLoggingEditBehaviorsScreenKt$SearchableTitleBar$4$1", f = "LifestyleLoggingEditBehaviorsScreen.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class k extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ m4.b0 f128098a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(m4.b0 b0Var, t13.d<? super k> dVar) {
            super(2, dVar);
            this.f128098a = b0Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new k(this.f128098a, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((k) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            m4.b0.a(this.f128098a);
            return Unit.INSTANCE;
        }
    }

    public static final void a(e23.a<Unit> aVar, e23.a<Unit> aVar2, p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(1098471476);
        int i15 = i14 | (o0VarE.r(aVar) ? 4 : 2) | (o0VarE.r(aVar2) ? 32 : 16);
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            c1.f110940a.a(false, gl1.y.Q(o0VarE, R.string.lbl_allow_auto_logging), gl1.y.Q(o0VarE, R.string.msg_allow_auto_logging), null, null, gl1.y.Q(o0VarE, R.string.lbl_allow), false, false, aVar2, gl1.y.Q(o0VarE, R.string.not_now_lbl), aVar, o0VarE, ((i15 << 21) & 234881024) | 6, i15 & 14, 216);
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new l(aVar, aVar2, i14, 0);
        }
    }

    public static final void b(e23.a<Unit> aVar, e23.a<Unit> aVar2, p3.m mVar, int i14) {
        int i15;
        o0 o0VarE = mVar.E(1202197654);
        if ((i14 & 6) == 0) {
            i15 = i14 | (o0VarE.r(aVar) ? 4 : 2);
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(aVar2) ? 32 : 16;
        }
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            c1.f110940a.a(false, gl1.y.Q(o0VarE, R.string.lbl_delete_behavior), gl1.y.Q(o0VarE, R.string.msg_delete_custom_behavior), null, null, gl1.y.Q(o0VarE, R.string.lbl_delete), true, false, aVar2, gl1.y.Q(o0VarE, R.string.lbl_cancel), aVar, o0VarE, ((i15 << 21) & 234881024) | 1572870, i15 & 14, SyslogConstants.LOG_LOCAL3);
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new com.google.maps.android.compose.l(aVar, aVar2, i14, 7, (byte) 0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void c(i53.c<pv0.d> cVar, nw0.d dVar, r rVar, e23.l<? super pv0.b, Unit> lVar, p3.m mVar, int i14) {
        i53.c<pv0.d> cVar2;
        r rVar2;
        o0 o0Var;
        String strJ;
        o0 o0VarE = mVar.E(-921556177);
        int i15 = i14 | ((i14 & 8) == 0 ? o0VarE.B(cVar) : o0VarE.r(cVar) ? 4 : 2) | (o0VarE.B(dVar) ? 32 : 16) | (o0VarE.r(rVar) ? 256 : 128) | (o0VarE.r(lVar) ? 2048 : 1024);
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            x1 x1Var = p3.n.f135158a;
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = l0.j(t13.h.f161748a, o0VarE);
                o0VarE.K(objQ);
            }
            o53.b0 b0Var = (o53.b0) objQ;
            mc mcVarF = e9.f(true, null, o0VarE, 6, 2);
            mc mcVarF2 = e9.f(true, null, o0VarE, 6, 2);
            Object[] objArr = new Object[0];
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                objQ2 = new n61.h(27);
                o0VarE.K(objQ2);
            }
            p1 p1Var = (p1) d4.a.e(objArr, (e23.a) objQ2, o0VarE, 48);
            Object objQ3 = o0VarE.q();
            if (objQ3 == c2565a) {
                List listC = p13.w.c(null);
                pv0.b.f141341b.getClass();
                objQ3 = p13.h0.C0(listC, p13.x.k(pv0.b.LIFESTYLE, pv0.b.SELF_CARE, pv0.b.TREATMENTS, pv0.b.SLEEP_RELATED, pv0.b.LIFE_STATUS, pv0.b.CUSTOM));
                o0VarE.K(objQ3);
            }
            List<pv0.b> list = (List) objQ3;
            o0VarE.C(-852199903);
            ArrayList arrayList = new ArrayList(p13.y.r(list, 10));
            for (pv0.b bVar : list) {
                if (bVar != null) {
                    o0VarE.C(-2077634737);
                    zv0.a aVar = zv0.a.f207158a;
                    l22.a aVarS = w2.a0.s(o0VarE);
                    aVar.getClass();
                    strJ = zv0.a.a(bVar, aVarS);
                    o0VarE.g0(false);
                } else {
                    strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, -2077523881, R.string.common_all, o0VarE, false);
                }
                arrayList.add(strJ);
            }
            o0VarE.g0(false);
            cVar2 = cVar;
            mc mcVar = mcVarF2;
            wv0.i.c(i53.a.e(arrayList), z3.f.c(389729822, new a11.l(list, cVar, dVar.f128012c, lVar, rVar, b0Var, mcVarF, p1Var, mcVarF2, new aw0.a(w2.a0.s(o0VarE))), o0VarE), o0VarE, 48);
            if (mcVarF.e()) {
                o0VarE.C(-644954354);
                boolean zR = o0VarE.r(b0Var) | o0VarE.B(mcVarF);
                Object objQ4 = o0VarE.q();
                if (zR || objQ4 == p3.m.a.f135155b) {
                    objQ4 = new cn1.t(b0Var, mcVarF, 29);
                    o0VarE.K(objQ4);
                }
                e23.a aVar2 = (e23.a) objQ4;
                boolean zR2 = o0VarE.r(rVar) | o0VarE.r(b0Var) | o0VarE.B(mcVarF);
                Object objQ5 = o0VarE.q();
                if (zR2 || objQ5 == p3.m.a.f135155b) {
                    objQ5 = new ng2.i(rVar, 2, b0Var, mcVarF);
                    o0VarE.K(objQ5);
                }
                wv0.d.a(mcVarF, aVar2, (e23.q) objQ5, o0VarE, 0);
                o0VarE.g0(false);
            } else {
                o0VarE.C(-644580525);
                o0VarE.g0(false);
            }
            if (mcVar.e()) {
                o0VarE.C(-852073529);
                Long l14 = (Long) p1Var.getF182175a();
                if (l14 == null) {
                    o0VarE.C(-644475622);
                    o0VarE.g0(false);
                    rVar2 = rVar;
                    o0Var = o0VarE;
                } else {
                    o0VarE.C(-644475621);
                    long jLongValue = l14.longValue();
                    pv0.d dVarC = pv0.f.c(jLongValue, cVar2);
                    String str = dVarC != null ? dVarC.f141361d : null;
                    if (str == null) {
                        o0VarE.C(-828459981);
                        o0VarE.g0(false);
                        rVar2 = rVar;
                        o0Var = o0VarE;
                    } else {
                        o0VarE.C(-828459980);
                        boolean zR3 = o0VarE.r(b0Var) | o0VarE.B(mcVar) | o0VarE.B(p1Var);
                        Object objQ6 = o0VarE.q();
                        if (zR3 || objQ6 == p3.m.a.f135155b) {
                            objQ6 = new fo.j(b0Var, mcVar, p1Var, 6);
                            o0VarE.K(objQ6);
                        }
                        e23.a aVar3 = (e23.a) objQ6;
                        boolean zR4 = o0VarE.r(rVar) | o0VarE.l(jLongValue) | o0VarE.r(b0Var) | o0VarE.B(mcVar);
                        Object objQ7 = o0VarE.q();
                        if (zR4 || objQ7 == p3.m.a.f135155b) {
                            bn0.h hVar = new bn0.h(rVar, jLongValue, b0Var, mcVar, 6);
                            rVar2 = rVar;
                            mcVar = mcVar;
                            o0VarE.K(hVar);
                            objQ7 = hVar;
                        } else {
                            rVar2 = rVar;
                        }
                        o0Var = o0VarE;
                        wv0.u.a(mcVar, str, aVar3, (e23.l) objQ7, o0Var, 0);
                        Unit unit = Unit.INSTANCE;
                        o0Var.g0(false);
                    }
                    o0Var.g0(false);
                }
                o0Var.g0(false);
            } else {
                rVar2 = rVar;
                o0Var = o0VarE;
                o0Var.C(-643800813);
                o0Var.g0(false);
            }
            if (dVar.f128013d) {
                o0Var.C(-643761257);
                boolean zR5 = o0Var.r(rVar2);
                Object objQ8 = o0Var.q();
                if (zR5 || objQ8 == p3.m.a.f135155b) {
                    objQ8 = new nw0.k(rVar2, 1);
                    o0Var.K(objQ8);
                }
                f((e23.a) objQ8, o0Var, 0);
                o0Var.g0(false);
            } else {
                o0Var.C(-643672845);
                o0Var.g0(false);
            }
            if (dVar.f128014e) {
                o0Var.C(-643619959);
                boolean zR6 = o0Var.r(rVar2);
                Object objQ9 = o0Var.q();
                if (zR6 || objQ9 == p3.m.a.f135155b) {
                    objQ9 = new nw0.k(rVar2, 2);
                    o0Var.K(objQ9);
                }
                w13.b.a((e23.a) objQ9, o0Var, 0);
                o0Var.g0(false);
            } else {
                o0Var.C(-643518093);
                o0Var.g0(false);
            }
            if (dVar.f128016g) {
                o0Var.C(-643472740);
                boolean zR7 = o0Var.r(rVar2);
                Object objQ10 = o0Var.q();
                if (zR7 || objQ10 == p3.m.a.f135155b) {
                    objQ10 = new nw0.k(rVar2, 3);
                    o0Var.K(objQ10);
                }
                e23.a aVar4 = (e23.a) objQ10;
                boolean zR8 = o0Var.r(rVar2);
                Object objQ11 = o0Var.q();
                if (zR8 || objQ11 == p3.m.a.f135155b) {
                    objQ11 = new nw0.k(rVar2, 4);
                    o0Var.K(objQ11);
                }
                a(aVar4, (e23.a) objQ11, o0Var, 0);
                o0Var.g0(false);
            } else {
                o0Var.C(-643296877);
                o0Var.g0(false);
            }
            x1 x1Var2 = p3.n.f135158a;
        } else {
            cVar2 = cVar;
            rVar2 = rVar;
            o0Var = o0VarE;
            o0Var.e();
        }
        p3.p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new q0(cVar2, dVar, rVar2, lVar, i14, 22);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void d(i53.c<pv0.d> cVar, e23.l<? super Long, Unit> lVar, e23.l<? super Long, Unit> lVar2, e23.a<Unit> aVar, p3.m mVar, int i14) {
        cVar.getClass();
        lVar.getClass();
        lVar2.getClass();
        aVar.getClass();
        o0 o0VarE = mVar.E(1817717075);
        int i15 = i14 | ((i14 & 8) == 0 ? o0VarE.B(cVar) : o0VarE.r(cVar) ? 4 : 2) | (o0VarE.r(lVar) ? 32 : 16) | (o0VarE.r(lVar2) ? 256 : 128) | (o0VarE.r(aVar) ? 2048 : 1024);
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            x1 x1Var = p3.n.f135158a;
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = p0.n(null);
                o0VarE.K(objQ);
            }
            p1 p1Var = (p1) objQ;
            Object objQ2 = o0VarE.q();
            int i16 = 6;
            if (objQ2 == c2565a) {
                objQ2 = new md0.f(p1Var, i16);
                o0VarE.K(objQ2);
            }
            wv0.i.j(cVar, lVar, (e23.l) objQ2, aVar, o0VarE, pv0.d.f141356k | 384 | (i15 & 14) | (i15 & 112) | (i15 & 7168));
            Long l14 = (Long) p1Var.getF182175a();
            if (l14 == null) {
                o0VarE.C(662343619);
                o0VarE.g0(false);
            } else {
                o0VarE.C(662343620);
                long jLongValue = l14.longValue();
                Object objQ3 = o0VarE.q();
                if (objQ3 == c2565a) {
                    objQ3 = new n02.c(p1Var, 6);
                    o0VarE.K(objQ3);
                }
                e23.a aVar2 = (e23.a) objQ3;
                boolean zL = o0VarE.l(jLongValue) | ((i15 & 896) == 256);
                Object objQ4 = o0VarE.q();
                if (zL || objQ4 == c2565a) {
                    objQ4 = new at1.g(lVar2, jLongValue, p1Var);
                    o0VarE.K(objQ4);
                }
                b(aVar2, (e23.a) objQ4, o0VarE, 6);
                o0VarE.g0(false);
            }
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new o(cVar, lVar, lVar2, aVar, i14, 0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void e(r rVar, e23.l<? super Boolean, Unit> lVar, p3.m mVar, int i14) {
        r rVar2 = rVar;
        rVar2.getClass();
        lVar.getClass();
        o0 o0VarE = mVar.E(985807427);
        int i15 = (o0VarE.r(rVar2) ? 4 : 2) | i14 | (o0VarE.r(lVar) ? 32 : 16);
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            p1 p1VarC = s9.c.c(rVar2.f128106g, o0VarE);
            p1 p1VarC2 = s9.c.c(rVar2.f128108i, o0VarE);
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = p0.n(Boolean.FALSE);
                o0VarE.K(objQ);
            }
            p1 p1Var = (p1) objQ;
            j0 j0Var = ((nw0.d) p1VarC.getF182175a()).f128012c;
            int i16 = i15 & 112;
            boolean zB = o0VarE.B(p1VarC) | (i16 == 32) | o0VarE.r(rVar2);
            Object objQ2 = o0VarE.q();
            int i17 = 29;
            if (zB || objQ2 == c2565a) {
                objQ2 = new kk1.a(lVar, i17, rVar2, p1VarC);
                o0VarE.K(objQ2);
            }
            e23.a aVar = (e23.a) objQ2;
            boolean zB2 = o0VarE.B(aVar);
            Object objQ3 = o0VarE.q();
            if (zB2 || objQ3 == c2565a) {
                objQ3 = new ll0.a(aVar, 29);
                o0VarE.K(objQ3);
            }
            c.w.a(6, 0, (e23.a) objQ3, o0VarE, true);
            h0 h0Var = ((nw0.d) p1VarC.getF182175a()).f128011b;
            boolean zB3 = (i16 == 32) | o0VarE.B(p1VarC) | o0VarE.r(rVar2);
            Object objQ4 = o0VarE.q();
            if (zB3 || objQ4 == c2565a) {
                objQ4 = new j(rVar2, lVar, p1VarC, null);
                o0VarE.K(objQ4);
            }
            l0.e((e23.p) objQ4, h0Var, o0VarE);
            boolean z14 = (((nw0.d) p1VarC.getF182175a()).f128010a instanceof e0.c) || (((nw0.d) p1VarC.getF182175a()).f128011b instanceof h0.c);
            z3.e eVarC = z3.f.c(160853832, new na0.a(j0Var, rVar2, aVar, p1Var, 8), o0VarE);
            g6.f.a aVar2 = g6.f.f75994b;
            rVar2 = rVar;
            z02.d.a(z14, eVarC, null, null, n3.b(0.0f, 0.0f, 0.0f, 0, 7), z3.f.c(2078235980, new ix.h(rVar2, j0Var, p1VarC, p1VarC2, p1Var), o0VarE), o0VarE, 196656, 12);
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new mw0.i(rVar2, lVar, i14, 10);
        }
    }

    public static final void f(e23.a<Unit> aVar, p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(466725548);
        int i15 = i14 | (o0VarE.r(aVar) ? 4 : 2);
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            c1.f110940a.a(false, gl1.y.Q(o0VarE, R.string.lbl_one_behavior_required), gl1.y.Q(o0VarE, R.string.lbl_one_behavior_required_message), null, null, gl1.y.Q(o0VarE, R.string.lbl_ok), false, false, aVar, null, null, o0VarE, ((i15 << 24) & 234881024) | 6, 0, 1752);
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ll1.g(aVar, i14, 20);
        }
    }

    public static final void g(String str, e23.l<? super String, Unit> lVar, e23.a<Unit> aVar, e23.a<Unit> aVar2, p3.m mVar, int i14) {
        String str2;
        int i15;
        o0 o0Var;
        o0 o0VarE = mVar.E(488928986);
        if ((i14 & 6) == 0) {
            str2 = str;
            i15 = (o0VarE.B(str2) ? 4 : 2) | i14;
        } else {
            str2 = str;
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(lVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.r(aVar) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.r(aVar2) ? 2048 : 1024;
        }
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            x1 x1Var = p3.n.f135158a;
            m4.q qVar = (m4.q) o0VarE.A(t1.f91491i);
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = kg.f.j(o0VarE);
            }
            m4.b0 b0Var = (m4.b0) objQ;
            Unit unit = Unit.INSTANCE;
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                objQ2 = new k(b0Var, null);
                o0VarE.K(objQ2);
            }
            l0.e((e23.p) objQ2, unit, o0VarE);
            o0Var = o0VarE;
            ve.a(x2.f(h4.r.S, 1.0f), null, tn.k.b(d92.b.f58623a, o0VarE), 0L, 0.0f, 0.0f, null, z3.f.c(-1823462177, new hl1.j(b0Var, qVar, str2, lVar, aVar2, aVar), o0VarE), o0Var, 12582918, 122);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p3.p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new q0(str, (Object) lVar, (e23.a) aVar, (o13.h) aVar2, i14, 23);
        }
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:65:0x0162  */
    public static final void h(String str, boolean z14, String str2, e23.l<? super String, Unit> lVar, e23.a<Unit> aVar, e23.a<Unit> aVar2, e23.a<Unit> aVar3, p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(1174445705);
        int i15 = 2;
        int i16 = i14 | (o0VarE.B(str) ? 4 : 2) | (o0VarE.h(z14) ? 32 : 16) | (o0VarE.B(str2) ? 256 : 128) | (o0VarE.r(lVar) ? 2048 : 1024) | (o0VarE.r(aVar) ? 16384 : 8192) | (o0VarE.r(aVar2) ? 131072 : 65536) | (o0VarE.r(aVar3) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288);
        if (o0VarE.n(i16 & 1, (599187 & i16) != 599186)) {
            x1 x1Var = p3.n.f135158a;
            p3.m.a aVar4 = p3.m.f135153a;
            if (str2 != null) {
                o0VarE.C(1108673149);
                boolean z15 = (i16 & 7168) == 2048;
                Object objQ = o0VarE.q();
                if (z15) {
                    objQ = new me2.d(lVar, i15);
                    o0VarE.K(objQ);
                } else {
                    aVar4.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new me2.d(lVar, i15);
                        o0VarE.K(objQ);
                    }
                }
                g(str2, lVar, (e23.a) objQ, aVar3, o0VarE, ((i16 >> 6) & 126) | ((i16 >> 9) & 7168));
                o0VarE.g0(false);
            } else {
                o0VarE.C(1108934014);
                int i17 = b3.a.f15501a;
                u4.d dVarA = c3.a.a();
                i53.f fVarA = null;
                b92.a.C0235a c0235a = new b92.a.C0235a(null, 1, null);
                c0235a.f16962a.put("navigateIconDescription", str);
                b92.a aVarB = c0235a.b();
                String strQ = gl1.y.Q(o0VarE, R.string.lbl_search);
                s62.a.f157643a.getClass();
                i53.f fVarA2 = i53.a.a(new i3("MENU_SEARCH", strQ, false, o7.a(t62.b.f162798a), (String) null, 20, (p005kotlin.jvm.internal.j) null));
                if (z14) {
                    o0VarE.C(1109456550);
                    fVarA = i53.a.a(new i3("MENU_EDIT_BEHAVIOURS", gl1.y.Q(o0VarE, R.string.lbl_edit_behaviors), false, (u4.d) null, (String) null, 28, (p005kotlin.jvm.internal.j) null));
                    o0VarE.g0(false);
                } else {
                    o0VarE.C(1109697141);
                    o0VarE.g0(false);
                }
                i53.f fVar = fVarA;
                boolean z16 = ((i16 & 57344) == 16384) | ((458752 & i16) == 131072);
                Object objQ2 = o0VarE.q();
                if (z16) {
                    objQ2 = new d52.m(aVar, aVar2, 3);
                    o0VarE.K(objQ2);
                } else {
                    aVar4.getClass();
                    if (objQ2 == p3.m.a.f135155b) {
                        objQ2 = new d52.m(aVar, aVar2, 3);
                        o0VarE.K(objQ2);
                    }
                }
                int i18 = b92.a.f16960b;
                z02.f.b(dVarA, aVarB, str, null, aVar3, fVarA2, fVar, (e23.l) objQ2, o0VarE, ((i16 >> 6) & 57344) | ((i16 << 6) & 896) | 2359296, 8);
                o0VarE.g0(false);
            }
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new defpackage.d(str, z14, str2, lVar, aVar, aVar2, aVar3, i14);
        }
    }
}
