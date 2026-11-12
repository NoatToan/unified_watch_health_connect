package ds;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.graphics.Bitmap;
import android.graphics.Picture;
import android.os.Build;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.n0;
import androidx.lifecycle.u1;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.z0;
import b21.n9;
import b82.a1;
import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import com.google.accompanist.permissions.PermissionState;
import com.google.accompanist.permissions.PermissionStateKt;
import com.google.accompanist.permissions.PermissionsUtilKt;
import i3.fe;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.m1;
import kotlin.o1;
import kotlin.t1;
import l72.c1;
import l72.d3;
import l72.w1;
import nr.p0;
import nr.w0;
import org.koin.compose.InjectKt;
import org.koin.compose.KoinApplicationKt;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.parameter.ParametersHolderKt;
import org.koin.core.qualifier.Qualifier;
import org.koin.core.scope.Scope;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s0;
import p3.b4;
import p3.i2;
import p3.l0;
import p3.o0;
import p3.p1;
import p3.x1;
import p3.x3;
import r53.p2;

/* JADX INFO: loaded from: classes7.dex */
public final class j {

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements e23.a<ParametersHolder> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ x3 f60954a;

        public a(x3 x3Var) {
            this.f60954a = x3Var;
        }

        @Override // e23.a
        public final ParametersHolder invoke() {
            ParametersHolder parametersHolder;
            e23.a aVarM473koinInject$lambda0 = InjectKt.m473koinInject$lambda0(this.f60954a);
            return (aVarM473koinInject$lambda0 == null || (parametersHolder = (ParametersHolder) aVarM473koinInject$lambda0.invoke()) == null) ? ParametersHolderKt.emptyParametersHolder() : parametersHolder;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.activity.details.presentation.share.ActivityShareScreenKt$ActivityShareScreen$2$1", f = "ActivityShareScreen.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ x3<List<p0>> f60955a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Context f60956b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ x3<n> f60957c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(x3<? extends List<p0>> x3Var, Context context, x3<? extends n> x3Var2, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f60955a = x3Var;
            this.f60956b = context;
            this.f60957c = x3Var2;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new b(this.f60955a, this.f60956b, this.f60957c, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            Object next;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            Iterator<T> it = this.f60955a.getF182175a().iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!(((p0) next).f127286e instanceof p0.a.g));
            p0 p0Var = (p0) next;
            if (p0Var != null) {
                jr.t tVar = ((p0.a.g) p0Var.f127286e).f127300a;
                Context context = this.f60956b;
                wf.f.a aVar2 = new wf.f.a(context);
                pr.b bVar = pr.b.f139599a;
                String str = tVar.f100469a + is.c.a(this.f60957c.getF182175a(), false);
                bVar.getClass();
                aVar2.f184930c = pr.b.b(str);
                hf.v.a(context).c(aVar2.a());
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.activity.details.presentation.share.ActivityShareScreenKt$ActivityShareScreen$3$1", f = "ActivityShareScreen.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class c extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ x3<List<p0>> f60958a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Context f60959b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ x3<n> f60960c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(x3<? extends List<p0>> x3Var, Context context, x3<? extends n> x3Var2, t13.d<? super c> dVar) {
            super(2, dVar);
            this.f60958a = x3Var;
            this.f60959b = context;
            this.f60960c = x3Var2;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new c(this.f60958a, this.f60959b, this.f60960c, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            Object next;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            Iterator<T> it = this.f60958a.getF182175a().iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!(((p0) next).f127286e instanceof p0.a.h));
            if (((p0) next) != null) {
                Context context = this.f60959b;
                wf.f.a aVar2 = new wf.f.a(context);
                pr.b bVar = pr.b.f139599a;
                String strA = is.c.a(this.f60960c.getF182175a(), true);
                bVar.getClass();
                aVar2.f184930c = pr.b.c(strA);
                hf.v.a(context).c(aVar2.a());
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.activity.details.presentation.share.ActivityShareScreenKt$ActivityShareScreen$4$1", f = "ActivityShareScreen.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class d extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ x3<List<p0>> f60961a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Context f60962b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ x3<n> f60963c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(x3<? extends List<p0>> x3Var, Context context, x3<? extends n> x3Var2, t13.d<? super d> dVar) {
            super(2, dVar);
            this.f60961a = x3Var;
            this.f60962b = context;
            this.f60963c = x3Var2;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new d(this.f60961a, this.f60962b, this.f60963c, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((d) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            Object next;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            Iterator<T> it = this.f60961a.getF182175a().iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!(((p0) next).f127286e instanceof p0.a.b));
            p0 p0Var = (p0) next;
            if (p0Var != null) {
                String str = ((p0.a.b) p0Var.f127286e).f127288a;
                Context context = this.f60962b;
                wf.f.a aVar2 = new wf.f.a(context);
                pr.b bVar = pr.b.f139599a;
                String strB = is.c.b(this.f60963c.getF182175a());
                bVar.getClass();
                aVar2.f184930c = pr.b.a(str, strB);
                hf.v.a(context).c(aVar2.a());
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.activity.details.presentation.share.ActivityShareScreenKt$ActivityShareScreen$5$1", f = "ActivityShareScreen.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class e extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f60964a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ x3<nr.i> f60965b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a<Unit> f60966c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ qr.t f60967d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ i53.f<is.s> f60968e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ h2.j0 f60969f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ bq0.l f60970g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ Context f60971h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ am.d f60972i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ PermissionState f60973j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final /* synthetic */ c.q<Intent, f.a> f60974k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final /* synthetic */ x3<List<p0>> f60975l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final /* synthetic */ p1<Boolean> f60976m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final /* synthetic */ n0 f60977n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public final /* synthetic */ fe f60978o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public final /* synthetic */ o1 f60979p;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.activity.details.presentation.share.ActivityShareScreenKt$ActivityShareScreen$5$1$1$2$1$1", f = "ActivityShareScreen.kt", l = {356}, m = "invokeSuspend", v = 2)
        public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f60980a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ fe f60981b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ Context f60982c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(fe feVar, Context context, t13.d<? super a> dVar) {
                super(2, dVar);
                this.f60981b = feVar;
                this.f60982c = context;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new a(this.f60981b, this.f60982c, dVar);
            }

            @Override // e23.p
            public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
                return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f60980a;
                if (i14 == 0) {
                    o13.r.b(obj);
                    String string = this.f60982c.getString(R.string.lbl_image_saved_to_photos);
                    string.getClass();
                    this.f60980a = 1;
                    if (d3.c(this.f60981b, string, null, this) == aVar) {
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
        @v13.e(c = "com.garmin.android.apps.connectmobile.activity.details.presentation.share.ActivityShareScreenKt$ActivityShareScreen$5$1$1$3$1", f = "ActivityShareScreen.kt", l = {373}, m = "invokeSuspend", v = 2)
        public static final class b extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f60983a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o1 f60984b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ m1 f60985c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(o1 o1Var, m1 m1Var, t13.d<? super b> dVar) {
                super(2, dVar);
                this.f60984b = o1Var;
                this.f60985c = m1Var;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new b(this.f60984b, this.f60985c, dVar);
            }

            @Override // e23.p
            public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
                return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f60983a;
                if (i14 == 0) {
                    o13.r.b(obj);
                    this.f60983a = 1;
                    if (this.f60984b.c(this.f60985c) == aVar) {
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
        @v13.e(c = "com.garmin.android.apps.connectmobile.activity.details.presentation.share.ActivityShareScreenKt$ActivityShareScreen$5$1$1$3$2", f = "ActivityShareScreen.kt", l = {377}, m = "invokeSuspend", v = 2)
        public static final class c extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f60986a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ fe f60987b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ Context f60988c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(fe feVar, Context context, t13.d<? super c> dVar) {
                super(2, dVar);
                this.f60987b = feVar;
                this.f60988c = context;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new c(this.f60987b, this.f60988c, dVar);
            }

            @Override // e23.p
            public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
                return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f60986a;
                if (i14 == 0) {
                    o13.r.b(obj);
                    String string = this.f60988c.getString(R.string.lbl_image_copied_to_clipboard);
                    string.getClass();
                    this.f60986a = 1;
                    if (d3.c(this.f60987b, string, null, this) == aVar) {
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public e(x3<nr.i> x3Var, e23.a<Unit> aVar, qr.t tVar, i53.f<is.s> fVar, h2.j0 j0Var, bq0.l lVar, Context context, am.d dVar, PermissionState permissionState, c.q<Intent, f.a> qVar, x3<? extends List<p0>> x3Var2, p1<Boolean> p1Var, n0 n0Var, fe feVar, o1 o1Var, t13.d<? super e> dVar2) {
            super(2, dVar2);
            this.f60965b = x3Var;
            this.f60966c = aVar;
            this.f60967d = tVar;
            this.f60968e = fVar;
            this.f60969f = j0Var;
            this.f60970g = lVar;
            this.f60971h = context;
            this.f60972i = dVar;
            this.f60973j = permissionState;
            this.f60974k = qVar;
            this.f60975l = x3Var2;
            this.f60976m = p1Var;
            this.f60977n = n0Var;
            this.f60978o = feVar;
            this.f60979p = o1Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            e eVar = new e(this.f60965b, this.f60966c, this.f60967d, this.f60968e, this.f60969f, this.f60970g, this.f60971h, this.f60972i, this.f60973j, this.f60974k, this.f60975l, this.f60976m, this.f60977n, this.f60978o, this.f60979p, dVar);
            eVar.f60964a = obj;
            return eVar;
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((e) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            o53.b0 b0Var = (o53.b0) this.f60964a;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            for (w0 w0Var : this.f60965b.getF182175a().f127194d) {
                boolean z14 = w0Var instanceof w0.y0;
                qr.t tVar = this.f60967d;
                if (z14) {
                    this.f60966c.invoke();
                    tVar.M5(w0Var);
                } else {
                    boolean z15 = w0Var instanceof w0.r1;
                    i53.f<is.s> fVar = this.f60968e;
                    h2.j0 j0Var = this.f60969f;
                    bq0.l lVar = this.f60970g;
                    Context context = this.f60971h;
                    if (z15) {
                        w0.r1 r1Var = (w0.r1) w0Var;
                        is.p.a(b0Var, fVar, j0Var, lVar, context, w0Var, r1Var.f127522a, tVar, new a03.n0(context, r1Var, this.f60974k, tVar, 23));
                    } else if (w0Var instanceof w0.m1) {
                        p0 p0Var = (p0) p13.h0.e0(j0Var.l(), this.f60975l.getF182175a());
                        w0.m1 m1Var = (w0.m1) w0Var;
                        ro1.e eVar = m1Var.f127488a;
                        Intent intent = m1Var.f127489b;
                        ActivityInfo activityInfo = eVar.f153929a;
                        intent.setClassName(activityInfo.packageName, activityInfo.name);
                        intent.putExtra("android.intent.extra.TEXT", m1Var.f127492e);
                        intent.putExtra("EXTRA_WEB_LINK", m1Var.f127491d);
                        this.f60972i.W(context, intent);
                        String str = eVar.f153929a.packageName;
                        str.getClass();
                        qr.t.I5(tVar, str, p0Var != null ? p0Var.f127286e : null, 4);
                        tVar.M5(w0Var);
                    } else {
                        boolean z16 = w0Var instanceof w0.e;
                        fe feVar = this.f60978o;
                        if (z16) {
                            if (Build.VERSION.SDK_INT > 28 || PermissionsUtilKt.isGranted(this.f60973j.getStatus())) {
                                w0.e eVar2 = (w0.e) w0Var;
                                is.p.a(b0Var, fVar, j0Var, lVar, context, w0Var, eVar2.f127433a, tVar, new aa2.p(lVar, context, this.f60977n, tVar, eVar2, feVar, 6));
                            } else {
                                this.f60976m.setValue(Boolean.TRUE);
                                tVar.M5(w0Var);
                            }
                        } else if (w0Var instanceof w0.c) {
                            w0.c cVar = (w0.c) w0Var;
                            o53.b0 b0Var2 = b0Var;
                            b0Var = b0Var2;
                            is.p.a(b0Var, fVar, j0Var, lVar, context, w0Var, cVar.f127415a, tVar, new aa2.p(context, b0Var2, tVar, cVar, this.f60979p, feVar, 7));
                        }
                    }
                }
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.activity.details.presentation.share.ActivityShareScreenKt$ActivityShareScreen$6$1", f = "ActivityShareScreen.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class f extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ h2.j0 f60989a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ boolean f60990b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ qr.t f60991c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ x3<String> f60992d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ x3<List<p0>> f60993e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ x3<List<p0>> f60994f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public f(h2.j0 j0Var, boolean z14, qr.t tVar, x3<String> x3Var, x3<? extends List<p0>> x3Var2, x3<? extends List<p0>> x3Var3, t13.d<? super f> dVar) {
            super(2, dVar);
            this.f60989a = j0Var;
            this.f60990b = z14;
            this.f60991c = tVar;
            this.f60992d = x3Var;
            this.f60993e = x3Var2;
            this.f60994f = x3Var3;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new f(this.f60989a, this.f60990b, this.f60991c, this.f60992d, this.f60993e, this.f60994f, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((f) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:7:0x002b  */
        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            p0.a aVar;
            Object value;
            u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            String f182175a = this.f60992d.getF182175a();
            int iL = this.f60989a.l();
            if (this.f60990b) {
                p0 p0Var = (p0) p13.h0.e0(iL, this.f60993e.getF182175a());
                if (p0Var != null) {
                    aVar = p0Var.f127286e;
                } else {
                    aVar = null;
                }
            } else {
                p0 p0Var2 = (p0) p13.h0.e0(iL, this.f60994f.getF182175a());
                if (p0Var2 != null) {
                    aVar = p0Var2.f127286e;
                } else {
                    aVar = null;
                }
            }
            if (f182175a != null) {
                Integer num = new Integer(iL);
                qr.t tVar = this.f60991c;
                tVar.H5(f182175a, aVar, num);
                p2 p2Var = tVar.N0;
                do {
                    value = p2Var.getValue();
                } while (!p2Var.b(value, null));
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class g implements z0, p005kotlin.jvm.internal.n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.l f60995a;

        public g(e23.l lVar) {
            lVar.getClass();
            this.f60995a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof p005kotlin.jvm.internal.n)) {
                return p005kotlin.jvm.internal.s.g(getFunctionDelegate(), ((p005kotlin.jvm.internal.n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final o13.h<?> getFunctionDelegate() {
            return this.f60995a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f60995a.invoke(obj);
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x008b  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(qr.t tVar, Bitmap bitmap, e23.a<Unit> aVar, p3.m mVar, int i14) {
        o0 o0Var;
        boolean z14;
        e23.a aVar2;
        o1 o1Var;
        p1 p1Var;
        p1 p1Var2;
        p1 p1Var3;
        Context context;
        o0 o0Var2;
        int i15;
        p1 p1Var4;
        int i16;
        qr.t tVar2;
        h2.b bVar;
        tVar.getClass();
        aVar.getClass();
        o0 o0VarE = mVar.E(270922876);
        int i17 = (o0VarE.r(tVar) ? 4 : 2) | i14;
        if ((i14 & 48) == 0) {
            i17 |= o0VarE.r(bitmap) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i17 |= o0VarE.r(aVar) ? 256 : 128;
        }
        if (o0VarE.n(i17 & 1, (i17 & 147) != 146)) {
            x1 x1Var = p3.n.f135158a;
            Context context2 = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            o0VarE.L(414512006);
            Scope scopeCurrentKoinScope = KoinApplicationKt.currentKoinScope(o0VarE, 0);
            p1 p1VarQ = p3.p0.q(null, o0VarE);
            o0VarE.L(855641119);
            boolean zB = o0VarE.B(null) | o0VarE.B(scopeCurrentKoinScope);
            Object objQ = o0VarE.q();
            p3.m.a aVar3 = p3.m.f135153a;
            if (zB) {
                objQ = scopeCurrentKoinScope.get((k23.d<?>) s0.f105811a.b(am.d.class), (Qualifier) null, new a(p1VarQ));
                o0VarE.K(objQ);
            } else {
                aVar3.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = scopeCurrentKoinScope.get((k23.d<?>) s0.f105811a.b(am.d.class), (Qualifier) null, new a(p1VarQ));
                    o0VarE.K(objQ);
                }
            }
            o0VarE.g0(false);
            o0VarE.g0(false);
            am.d dVar = (am.d) objQ;
            v9.a.f176280a.getClass();
            ViewModelStoreOwner viewModelStoreOwnerA = v9.a.a(o0VarE);
            if (viewModelStoreOwnerA == null) {
                vb.h.z("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            u1 u1VarA = v9.b.a(s0.f105811a.b(bq0.l.class), viewModelStoreOwnerA, null, null, viewModelStoreOwnerA instanceof androidx.lifecycle.y ? ((androidx.lifecycle.y) viewModelStoreOwnerA).getDefaultViewModelCreationExtras() : CreationExtras.b.f8056c, o0VarE);
            o0 o0Var3 = o0VarE;
            bq0.l lVar = (bq0.l) u1VarA;
            p1 p1VarC = s9.c.c(tVar.f146503a2, o0Var3);
            p1 p1VarC2 = s9.c.c(tVar.O0, o0Var3);
            p1 p1VarC3 = s9.c.c(tVar.L1, o0Var3);
            p1 p1VarC4 = s9.c.c(tVar.X, o0Var3);
            p1 p1VarC5 = s9.c.c(tVar.Y, o0Var3);
            n0 n0Var = (n0) o0Var3.A(s9.j.f158018a);
            Object objQ2 = o0Var3.q();
            aVar3.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ2 == c2565a) {
                objQ2 = com.nimbusds.jose.shaded.gson.internal.a.f(o0Var3);
            }
            fe feVar = (fe) objQ2;
            o1 o1Var2 = (o1) o0Var3.A(t1.f91488f);
            int i18 = i17;
            p1 p1VarC6 = s9.c.c(tVar.f146577z2, o0Var3);
            p1 p1VarC7 = s9.c.c(tVar.f146571x2, o0Var3);
            Object objQ3 = o0Var3.q();
            if (objQ3 == c2565a) {
                objQ3 = p3.p0.n(Boolean.FALSE);
                o0Var3.K(objQ3);
            }
            p1 p1Var5 = (p1) objQ3;
            Object objQ4 = o0Var3.q();
            if (objQ4 == c2565a) {
                objQ4 = p3.p0.n(Boolean.FALSE);
                o0Var3.K(objQ4);
            }
            p1 p1Var6 = (p1) objQ4;
            boolean z15 = ((Boolean) p1Var5.getF182175a()).booleanValue() && ((Boolean) p1VarC7.getF182175a()).booleanValue();
            if ((((Boolean) p1Var5.getF182175a()).booleanValue() || ((Boolean) p1Var6.getF182175a()).booleanValue()) && ((Boolean) p1VarC7.getF182175a()).booleanValue()) {
                o0Var3.C(821479497);
                boolean zR = o0Var3.r(tVar);
                Object objQ5 = o0Var3.q();
                if (zR || objQ5 == c2565a) {
                    objQ5 = new ds.f(tVar, 1);
                    o0Var3.K(objQ5);
                }
                z14 = false;
                o0Var3.g0(false);
                aVar2 = (e23.a) objQ5;
            } else {
                p1VarC = p1VarC;
                z14 = false;
                o0Var3.C(821544690);
                o0Var3.g0(false);
                aVar2 = null;
            }
            boolean z16 = bitmap != null ? true : z14;
            bq0.l lVar2 = lVar;
            boolean zB2 = o0Var3.B((List) p1VarC4.getF182175a()) | o0Var3.B((List) p1VarC5.getF182175a()) | o0Var3.k(((n) p1VarC.getF182175a()).ordinal()) | o0Var3.h(z16) | o0Var3.B(bitmap) | o0Var3.h(z15);
            Object objQ6 = o0Var3.q();
            Context context3 = context2;
            int i19 = 5;
            if (zB2 || objQ6 == c2565a) {
                if (z16) {
                    o0 o0Var4 = o0Var3;
                    List list = (List) p1VarC5.getF182175a();
                    n nVar = (n) p1VarC.getF182175a();
                    p1 p1Var7 = p1VarC4;
                    ds.c cVar = new ds.c(tVar, 2);
                    list.getClass();
                    nVar.getClass();
                    bitmap.getClass();
                    ArrayList arrayList = new ArrayList(p13.y.r(list, 10));
                    Iterator it = list.iterator();
                    o1 o1Var3 = o1Var2;
                    int i24 = 0;
                    while (it.hasNext()) {
                        Object next = it.next();
                        int i25 = i24 + 1;
                        if (i24 < 0) {
                            p13.x.q();
                            throw null;
                        }
                        p0 p0Var = (p0) next;
                        Picture picture = new Picture();
                        p1 p1Var8 = p1VarC2;
                        n nVar2 = nVar;
                        arrayList.add(new is.s(picture, new z3.e(-460186746, true, new a42.n(picture, p0Var, nVar2, bitmap, cVar, i24, 27))));
                        context3 = context3;
                        it = it;
                        o0Var4 = o0Var4;
                        nVar = nVar2;
                        p1VarC2 = p1Var8;
                        p1Var7 = p1Var7;
                        i24 = i25;
                        p1VarC3 = p1VarC3;
                        p1VarC5 = p1VarC5;
                        o1Var3 = o1Var3;
                    }
                    o1Var = o1Var3;
                    p1Var = p1Var7;
                    p1Var2 = p1VarC3;
                    p1Var3 = p1VarC5;
                    context = context3;
                    o0Var2 = o0Var4;
                    i15 = 0;
                    p1Var4 = p1VarC2;
                    objQ6 = i53.a.j(arrayList);
                } else {
                    List list2 = (List) p1VarC4.getF182175a();
                    n nVar3 = (n) p1VarC.getF182175a();
                    ds.f fVar = new ds.f(tVar, i19);
                    ds.c cVar2 = new ds.c(tVar, 1);
                    list2.getClass();
                    nVar3.getClass();
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj : list2) {
                        boolean z17 = z15;
                        if (!(((p0) obj).f127286e instanceof p0.a.c)) {
                            arrayList2.add(obj);
                        }
                        z15 = z17;
                    }
                    boolean z18 = z15;
                    ArrayList arrayList3 = new ArrayList(p13.y.r(arrayList2, 10));
                    Iterator it3 = arrayList2.iterator();
                    int i26 = 0;
                    while (it3.hasNext()) {
                        Object next2 = it3.next();
                        int i27 = i26 + 1;
                        if (i26 < 0) {
                            p13.x.q();
                            throw null;
                        }
                        Picture picture2 = new Picture();
                        ds.c cVar3 = cVar2;
                        ds.f fVar2 = fVar;
                        arrayList3.add(new is.s(picture2, new z3.e(154796829, true, new n9((p0) next2, picture2, nVar3, z18, aVar2, fVar2, cVar3, i26))));
                        i26 = i27;
                        it3 = it3;
                        o0Var3 = o0Var3;
                        fVar = fVar2;
                        cVar2 = cVar3;
                    }
                    objQ6 = i53.a.j(arrayList3);
                    p1Var2 = p1VarC3;
                    p1Var = p1VarC4;
                    o1Var = o1Var2;
                    p1Var3 = p1VarC5;
                    context = context3;
                    o0Var2 = o0Var3;
                    i15 = 0;
                    p1Var4 = p1VarC2;
                }
                o0Var2.K(objQ6);
            } else {
                o0Var2 = o0Var3;
                p1Var4 = p1VarC2;
                p1Var2 = p1VarC3;
                p1Var = p1VarC4;
                o1Var = o1Var2;
                p1Var3 = p1VarC5;
                context = context3;
                lVar2 = lVar2;
                i15 = 0;
            }
            i53.f fVar3 = (i53.f) objQ6;
            boolean zR2 = o0Var2.r(fVar3);
            Object objQ7 = o0Var2.q();
            int i28 = 3;
            if (zR2 || objQ7 == p3.m.a.f135155b) {
                objQ7 = new ak0.w(fVar3, 3);
                o0Var2.K(objQ7);
            }
            h2.b bVarB = h2.o0.b(i15, (e23.a) objQ7, o0Var2, i15, 3);
            Object objQ8 = o0Var2.q();
            p3.m.a.C2565a c2565a2 = p3.m.a.f135155b;
            if (objQ8 == c2565a2) {
                objQ8 = p3.p0.f(new c.e(z16, bVarB, p1Var, i28));
                o0Var2.K(objQ8);
            }
            x3 x3Var = (x3) objQ8;
            PermissionState permissionStateRememberPermissionState = PermissionStateKt.rememberPermissionState("android.permission.WRITE_EXTERNAL_STORAGE", null, o0Var2, 6, 2);
            Object[] objArr = new Object[i15];
            Object objQ9 = o0Var2.q();
            if (objQ9 == c2565a2) {
                objQ9 = new dh0.j(5);
                o0Var2.K(objQ9);
            }
            p1 p1Var9 = (p1) d4.a.e(objArr, (e23.a) objQ9, o0Var2, 48);
            g.h hVar = new g.h();
            boolean zR3 = o0Var2.r(context) | o0Var2.r(tVar);
            Object objQ10 = o0Var2.q();
            if (zR3 || objQ10 == c2565a2) {
                objQ10 = new cn1.d(22, context, (Object) tVar);
                o0Var2.K(objQ10);
            }
            c.q qVarC = c.w.c(hVar, (e23.l) objQ10, o0Var2, i15);
            Context context4 = context;
            o0 o0Var5 = o0Var2;
            p1 p1Var10 = p1Var;
            bq0.l lVar3 = lVar2;
            boolean z19 = z16;
            z02.b.a(false, null, null, null, false, z3.f.c(-1289205326, new ds.b(feVar, p1Var9, context4, qVarC, fVar3, p1Var10, z19, p1VarC6, tVar, bVarB, p1Var5, p1Var6, x3Var), o0Var5), o0Var5, 196608, 31);
            g.h hVar2 = new g.h();
            boolean zR4 = o0Var5.r(tVar);
            Object objQ11 = o0Var5.q();
            if (zR4 || objQ11 == c2565a2) {
                i16 = 0;
                objQ11 = new ds.c(tVar, 0);
                o0Var5.K(objQ11);
            } else {
                i16 = 0;
            }
            c.q qVarC2 = c.w.c(hVar2, (e23.l) objQ11, o0Var5, i16);
            List list3 = (List) p1Var10.getF182175a();
            n nVar4 = (n) p1VarC.getF182175a();
            p1 p1Var11 = p1VarC;
            boolean zB3 = o0Var5.B(p1Var10) | o0Var5.r(context4) | o0Var5.B(p1Var11);
            Object objQ12 = o0Var5.q();
            if (zB3 || objQ12 == c2565a2) {
                objQ12 = new b(p1Var10, context4, p1Var11, null);
                o0Var5.K(objQ12);
            }
            l0.f(list3, nVar4, (e23.p) objQ12, o0Var5);
            List list4 = (List) p1Var10.getF182175a();
            n nVar5 = (n) p1Var11.getF182175a();
            boolean zB4 = o0Var5.B(p1Var10) | o0Var5.r(context4) | o0Var5.B(p1Var11);
            Object objQ13 = o0Var5.q();
            if (zB4 || objQ13 == c2565a2) {
                objQ13 = new c(p1Var10, context4, p1Var11, null);
                o0Var5.K(objQ13);
            }
            l0.f(list4, nVar5, (e23.p) objQ13, o0Var5);
            List list5 = (List) p1Var10.getF182175a();
            n nVar6 = (n) p1Var11.getF182175a();
            boolean zB5 = o0Var5.B(p1Var10) | o0Var5.r(context4) | o0Var5.B(p1Var11);
            Object objQ14 = o0Var5.q();
            if (zB5 || objQ14 == c2565a2) {
                objQ14 = new d(p1Var10, context4, p1Var11, null);
                o0Var5.K(objQ14);
            }
            l0.f(list5, nVar6, (e23.p) objQ14, o0Var5);
            nr.i iVar = (nr.i) p1Var2.getF182175a();
            p1 p1Var12 = p1Var2;
            o1 o1Var4 = o1Var;
            boolean z24 = ((((((((((((((o0Var5.B(p1Var12) ? 1 : 0) | ((i18 & 896) != 256 ? i16 : 1)) | (o0Var5.r(tVar) ? 1 : 0)) == true ? 1 : 0) | (o0Var5.r(fVar3) ? 1 : 0)) | (o0Var5.B(bVarB) ? 1 : 0) ? 1 : 0) | (o0Var5.r(lVar3) ? 1 : 0)) | (o0Var5.r(context4) ? 1 : 0) ? 1 : 0) | (o0Var5.r(qVarC2) ? 1 : 0)) | (o0Var5.B(p1Var10) ? 1 : 0) ? 1 : 0) | (o0Var5.r(dVar) ? 1 : 0)) | (o0Var5.B(permissionStateRememberPermissionState) ? 1 : 0) ? 1 : 0) | (o0Var5.B(p1Var9) ? 1 : 0)) | (o0Var5.r(n0Var) ? 1 : 0) ? 1 : 0) | (o0Var5.r(o1Var4) ? 1 : 0);
            Object objQ15 = o0Var5.q();
            if (z24 != 0 || objQ15 == c2565a2) {
                tVar2 = tVar;
                objQ15 = new e(p1Var12, aVar, tVar2, fVar3, bVarB, lVar3, context4, dVar, permissionStateRememberPermissionState, qVarC2, p1Var10, p1Var9, n0Var, feVar, o1Var4, null);
                bVar = bVarB;
                o0Var = o0Var5;
                o0Var.K(objQ15);
            } else {
                tVar2 = tVar;
                o0Var = o0Var5;
                bVar = bVarB;
            }
            l0.e((e23.p) objQ15, iVar, o0Var);
            String str = (String) p1Var4.getF182175a();
            p1 p1Var13 = p1Var4;
            p1 p1Var14 = p1Var3;
            boolean zB6 = o0Var.B(p1Var13) | o0Var.B(bVar) | o0Var.h(z19) | o0Var.B(p1Var14) | o0Var.B(p1Var10) | o0Var.r(tVar2);
            Object objQ16 = o0Var.q();
            if (zB6 || objQ16 == c2565a2) {
                f fVar4 = new f(bVar, z19, tVar2, p1Var13, p1Var14, p1Var10, null);
                o0Var.K(fVar4);
                objQ16 = fVar4;
            }
            l0.e((e23.p) objQ16, str, o0Var);
            x1 x1Var2 = p3.n.f135158a;
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p3.p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new cn1.p(tVar, bitmap, aVar, i14, 18);
        }
    }

    /* JADX WARN: Code duplicated, block: B:50:0x009a  */
    public static final void b(final h4.r rVar, final float f14, final float f15, int i14, final z3.e eVar, p3.m mVar, final int i15) {
        int i16;
        o0 o0VarE = mVar.E(-1122158178);
        if ((i15 & 6) == 0) {
            i16 = (o0VarE.B(rVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        int i17 = i16 | (o0VarE.i(f14) ? 32 : 16) | (o0VarE.i(f15) ? 256 : 128) | 3072;
        if (o0VarE.n(i17 & 1, (i17 & 9363) != 9362)) {
            o0VarE.G0();
            if ((i15 & 1) == 0 || o0VarE.o0()) {
                i14 = 2;
            } else {
                o0VarE.e();
            }
            o0VarE.h0();
            x1 x1Var = p3.n.f135158a;
            h4.r rVarF = x2.f(rVar, 1.0f);
            boolean z14 = ((((i17 & 112) ^ 48) > 32 && o0VarE.i(f14)) || (i17 & 48) == 32) | ((((i17 & 896) ^ 384) > 256 && o0VarE.i(f15)) || (i17 & 384) == 256);
            Object objQ = o0VarE.q();
            if (z14) {
                objQ = new m(f14, f15, i14);
                o0VarE.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new m(f14, f15, i14);
                    o0VarE.K(objQ);
                }
            }
            f5.z0 z0Var = (f5.z0) objQ;
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarF, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p3.p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, z0Var, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            b71.i.n(6, eVar, o0VarE, true);
        } else {
            o0VarE.e();
        }
        final int i18 = i14;
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new e23.p() { // from class: ds.i
                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    j.b(rVar, f14, f15, i18, eVar, (p3.m) obj, p3.p0.t(i15 | 1));
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final void c(h4.r rVar, e23.a aVar, e23.a aVar2, e23.a aVar3, p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(-727245814);
        int i15 = i14 | (o0VarE.B(rVar) ? 4 : 2) | (o0VarE.r(aVar) ? 32 : 16) | (o0VarE.r(aVar2) ? 256 : 128) | (o0VarE.r(aVar3) ? 2048 : 1024);
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            x1 x1Var = p3.n.f135158a;
            d92.b.f58623a.getClass();
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.e eVar = j92.b.f97899b;
            float f14 = eVar.f97920e;
            bVar.getClass();
            b(rVar, f14, eVar.f97920e, 0, z3.f.c(-1137164656, new ds.g(aVar, aVar2, aVar3, 0), o0VarE), o0VarE, (i15 & 14) | 24576);
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new h(rVar, aVar, aVar2, aVar3, i14, 0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x006a  */
    /* JADX WARN: Code duplicated, block: B:33:0x0090  */
    public static final void d(e23.a<Unit> aVar, e23.a<Unit> aVar2, p3.m mVar, int i14) {
        o0 o0Var;
        o0 o0VarE = mVar.E(-747040363);
        int i15 = (o0VarE.r(aVar) ? 4 : 2) | i14 | (o0VarE.r(aVar2) ? 32 : 16);
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            c1 c1Var = c1.f110940a;
            String strQ = gl1.y.Q(o0VarE, R.string.lbl_photo_access_required);
            String strQ2 = gl1.y.Q(o0VarE, R.string.msg_photo_access_required);
            String strQ3 = gl1.y.Q(o0VarE, R.string.lbl_settings);
            boolean z14 = (i15 & 14) == 4;
            Object objQ = o0VarE.q();
            p3.m.a aVar3 = p3.m.f135153a;
            if (z14) {
                objQ = new cw1.p0(aVar, 17);
                o0VarE.K(objQ);
            } else {
                aVar3.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new cw1.p0(aVar, 17);
                    o0VarE.K(objQ);
                }
            }
            e23.a<Unit> aVar4 = (e23.a) objQ;
            String strQ4 = gl1.y.Q(o0VarE, R.string.lbl_cancel);
            boolean z15 = (i15 & 112) == 32;
            Object objQ2 = o0VarE.q();
            if (z15) {
                objQ2 = new cw1.p0(aVar2, 18);
                o0VarE.K(objQ2);
            } else {
                aVar3.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    objQ2 = new cw1.p0(aVar2, 18);
                    o0VarE.K(objQ2);
                }
            }
            o0Var = o0VarE;
            c1Var.a(false, strQ, strQ2, null, null, strQ3, false, false, aVar4, strQ4, (e23.a) objQ2, o0Var, 6, 0, 216);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p3.p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new at1.f(aVar, aVar2, i14, 10);
        }
    }

    public static final void e(int i14, e23.a aVar, h4.r rVar, p3.m mVar, boolean z14) {
        o0 o0VarE = mVar.E(788379224);
        int i15 = (o0VarE.B(rVar) ? 4 : 2) | i14 | (o0VarE.h(z14) ? 32 : 16) | (o0VarE.r(aVar) ? 256 : 128);
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = p3.n.f135158a;
            h4.r rVarF = x2.f(rVar, 1.0f);
            h4.d.f81522a.getClass();
            h4.g.a aVar2 = h4.d.a.f81537o;
            c2.j.f22691a.getClass();
            c2.z zVarA = c2.y.a(c2.j.f22694d, aVar2, o0VarE, 48);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarF, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar3 = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p3.p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar3);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, zVarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            c2.b0 b0Var = c2.b0.f22601a;
            w1 w1Var = w1.BottomStart;
            l72.x1 x1Var2 = l72.x1.Center;
            String strQ = gl1.y.Q(o0VarE, R.string.txt_add_a_photo_or_swipe_for_more_images);
            o.f61024a.getClass();
            int i16 = i15 << 15;
            a1.a(strQ, w1Var, x1Var2, 200, 0L, z14, aVar, o.f61025b, o0VarE, (3670016 & i16) | 100691328 | (i16 & 29360128), 34);
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new d50.n(rVar, z14, aVar, i14, 1);
        }
    }
}
