package gw0;

import android.content.Context;
import android.widget.Toast;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.room.w0;
import c2.q2;
import c2.s2;
import c2.u2;
import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import ew1.v1;
import f5.z0;
import g02.q0;
import g2.m1;
import i3.e9;
import i3.mc;
import i3.mh;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.t1;
import kotlin.t3;
import l72.c1;
import o53.m0;
import okhttp3.internal.http.StatusLine;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.j0;
import p3.b4;
import p3.i2;
import p3.l0;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;
import s5.x0;
import u1.a2;

/* JADX INFO: loaded from: classes9.dex */
public final class j {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.logging.presentation.reports.LifestyleDetailsReportScreenKt$LifestyleDetailsReport$1$1", f = "LifestyleDetailsReportScreen.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f79638a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ pv0.q f79639b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ o53.b0 f79640c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ p1<i53.c<pv0.h>> f79641d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ Context f79642e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ e23.a<Unit> f79643f;

        /* JADX INFO: renamed from: gw0.j$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.logging.presentation.reports.LifestyleDetailsReportScreenKt$LifestyleDetailsReport$1$1$1", f = "LifestyleDetailsReportScreen.kt", l = {216}, m = "invokeSuspend", v = 2)
        public static final class C1598a extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f79644a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ pv0.q f79645b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ Context f79646c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ e23.a<Unit> f79647d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ p1<i53.c<pv0.h>> f79648e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1598a(pv0.q qVar, Context context, e23.a<Unit> aVar, p1<i53.c<pv0.h>> p1Var, t13.d<? super C1598a> dVar) {
                super(2, dVar);
                this.f79645b = qVar;
                this.f79646c = context;
                this.f79647d = aVar;
                this.f79648e = p1Var;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new C1598a(this.f79645b, this.f79646c, this.f79647d, this.f79648e, dVar);
            }

            @Override // e23.p
            public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
                return ((C1598a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f79644a;
                if (i14 == 0) {
                    o13.r.b(obj);
                    this.f79644a = 1;
                    if (m0.b(500L, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i14 != 1) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    o13.r.b(obj);
                }
                this.f79647d.invoke();
                Toast.makeText(this.f79646c, R.string.txt_error_occurred, 0).show();
                Iterable iterable = this.f79645b.f141405a;
                if (iterable == null) {
                    iterable = j0.f134944a;
                }
                this.f79648e.setValue(i53.a.e(iterable));
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(boolean z14, pv0.q qVar, o53.b0 b0Var, p1<i53.c<pv0.h>> p1Var, Context context, e23.a<Unit> aVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f79638a = z14;
            this.f79639b = qVar;
            this.f79640c = b0Var;
            this.f79641d = p1Var;
            this.f79642e = context;
            this.f79643f = aVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f79638a, this.f79639b, this.f79640c, this.f79641d, this.f79642e, this.f79643f, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            if (this.f79638a) {
                i53.c<pv0.h> f182175a = this.f79641d.getF182175a();
                Iterable iterable = this.f79639b.f141405a;
                if (iterable == null) {
                    iterable = j0.f134944a;
                }
                if (!p005kotlin.jvm.internal.s.g(f182175a, i53.a.e(iterable))) {
                    ge1.b.T(this.f79640c, null, null, new C1598a(this.f79639b, this.f79642e, this.f79643f, this.f79641d, null), 3);
                }
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b implements e23.l<pv0.w, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ o53.b0 f79649a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ p1<pv0.w> f79650b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ mc f79651c;

        public b(o53.b0 b0Var, p1<pv0.w> p1Var, mc mcVar) {
            this.f79649a = b0Var;
            this.f79650b = p1Var;
            this.f79651c = mcVar;
        }

        @Override // e23.l
        public final Unit invoke(pv0.w wVar) {
            pv0.w wVar2 = wVar;
            wVar2.getClass();
            this.f79650b.setValue(wVar2);
            ge1.b.T(this.f79649a, null, null, new gw0.k(this.f79651c, null), 3);
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements e23.a<Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ pv0.h f79652a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ mc f79653b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ o53.b0 f79654c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ p1<pv0.h> f79655d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ i53.d<pv0.w, pv0.y> f79656e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ p1<pv0.y> f79657f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ p1<Boolean> f79658g;

        /* JADX WARN: Multi-variable type inference failed */
        public c(pv0.h hVar, mc mcVar, o53.b0 b0Var, p1<pv0.h> p1Var, i53.d<pv0.w, ? extends pv0.y> dVar, p1<pv0.y> p1Var2, p1<Boolean> p1Var3) {
            this.f79652a = hVar;
            this.f79653b = mcVar;
            this.f79654c = b0Var;
            this.f79655d = p1Var;
            this.f79656e = dVar;
            this.f79657f = p1Var2;
            this.f79658g = p1Var3;
        }

        @Override // e23.a
        public final Unit invoke() {
            p1<pv0.h> p1Var = this.f79655d;
            pv0.h hVar = this.f79652a;
            p1Var.setValue(hVar);
            pv0.w wVarC = pv0.j.c(hVar);
            this.f79657f.setValue(wVarC != null ? this.f79656e.get(wVarC) : null);
            this.f79658g.setValue(Boolean.valueOf(!og2.k.y(pv0.j.a(hVar))));
            j.m(this.f79653b, this.f79654c);
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class d implements e23.l<pv0.y, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ pv0.h f79659a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ mc f79660b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ o53.b0 f79661c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ p1<pv0.h> f79662d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ p1<pv0.y> f79663e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ p1<Boolean> f79664f;

        public d(pv0.h hVar, mc mcVar, o53.b0 b0Var, p1<pv0.h> p1Var, p1<pv0.y> p1Var2, p1<Boolean> p1Var3) {
            this.f79659a = hVar;
            this.f79660b = mcVar;
            this.f79661c = b0Var;
            this.f79662d = p1Var;
            this.f79663e = p1Var2;
            this.f79664f = p1Var3;
        }

        @Override // e23.l
        public final Unit invoke(pv0.y yVar) {
            this.f79662d.setValue(this.f79659a);
            this.f79663e.setValue(yVar);
            this.f79664f.setValue(Boolean.FALSE);
            j.m(this.f79660b, this.f79661c);
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class e implements e23.l<pv0.s, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ pv0.h f79665a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ e23.q<pv0.h, pv0.s, pv0.o, Unit> f79666b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ p1<i53.c<pv0.h>> f79667c;

        /* JADX WARN: Multi-variable type inference failed */
        public e(pv0.h hVar, e23.q<? super pv0.h, ? super pv0.s, ? super pv0.o, Unit> qVar, p1<i53.c<pv0.h>> p1Var) {
            this.f79665a = hVar;
            this.f79666b = qVar;
            this.f79667c = p1Var;
        }

        @Override // e23.l
        public final Unit invoke(pv0.s sVar) {
            pv0.s sVar2 = sVar;
            sVar2.getClass();
            gw0.l lVar = new gw0.l(this.f79665a, sVar2, this.f79666b, this.f79667c);
            if (az0.b.a()) {
                lVar.invoke();
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class f implements e23.l<pv0.w, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ o53.b0 f79668a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ p1<pv0.w> f79669b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ mc f79670c;

        public f(o53.b0 b0Var, p1<pv0.w> p1Var, mc mcVar) {
            this.f79668a = b0Var;
            this.f79669b = p1Var;
            this.f79670c = mcVar;
        }

        @Override // e23.l
        public final Unit invoke(pv0.w wVar) {
            pv0.w wVar2 = wVar;
            wVar2.getClass();
            this.f79669b.setValue(wVar2);
            ge1.b.T(this.f79668a, null, null, new gw0.m(this.f79670c, null), 3);
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class g implements e23.a<Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ pv0.h f79671a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ mc f79672b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ o53.b0 f79673c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ p1<pv0.h> f79674d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ i53.d<pv0.w, pv0.y> f79675e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ p1<pv0.y> f79676f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ p1<Boolean> f79677g;

        /* JADX WARN: Multi-variable type inference failed */
        public g(pv0.h hVar, mc mcVar, o53.b0 b0Var, p1<pv0.h> p1Var, i53.d<pv0.w, ? extends pv0.y> dVar, p1<pv0.y> p1Var2, p1<Boolean> p1Var3) {
            this.f79671a = hVar;
            this.f79672b = mcVar;
            this.f79673c = b0Var;
            this.f79674d = p1Var;
            this.f79675e = dVar;
            this.f79676f = p1Var2;
            this.f79677g = p1Var3;
        }

        @Override // e23.a
        public final Unit invoke() {
            p1<pv0.h> p1Var = this.f79674d;
            pv0.h hVar = this.f79671a;
            p1Var.setValue(hVar);
            pv0.w wVarC = pv0.j.c(hVar);
            this.f79676f.setValue(wVarC != null ? this.f79675e.get(wVarC) : null);
            this.f79677g.setValue(Boolean.valueOf(!og2.k.y(pv0.j.a(hVar))));
            j.m(this.f79672b, this.f79673c);
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class h implements e23.l<pv0.y, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ pv0.h f79678a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ mc f79679b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ o53.b0 f79680c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ p1<pv0.h> f79681d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ p1<pv0.y> f79682e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ p1<Boolean> f79683f;

        public h(pv0.h hVar, mc mcVar, o53.b0 b0Var, p1<pv0.h> p1Var, p1<pv0.y> p1Var2, p1<Boolean> p1Var3) {
            this.f79678a = hVar;
            this.f79679b = mcVar;
            this.f79680c = b0Var;
            this.f79681d = p1Var;
            this.f79682e = p1Var2;
            this.f79683f = p1Var3;
        }

        @Override // e23.l
        public final Unit invoke(pv0.y yVar) {
            this.f79681d.setValue(this.f79678a);
            this.f79682e.setValue(yVar);
            this.f79683f.setValue(Boolean.FALSE);
            j.m(this.f79679b, this.f79680c);
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class i implements e23.l<pv0.s, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ pv0.h f79684a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ e23.q<pv0.h, pv0.s, pv0.o, Unit> f79685b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ p1<i53.c<pv0.h>> f79686c;

        /* JADX WARN: Multi-variable type inference failed */
        public i(pv0.h hVar, e23.q<? super pv0.h, ? super pv0.s, ? super pv0.o, Unit> qVar, p1<i53.c<pv0.h>> p1Var) {
            this.f79684a = hVar;
            this.f79685b = qVar;
            this.f79686c = p1Var;
        }

        @Override // e23.l
        public final Unit invoke(pv0.s sVar) {
            pv0.s sVar2 = sVar;
            sVar2.getClass();
            gw0.n nVar = new gw0.n(this.f79684a, sVar2, this.f79685b, this.f79686c);
            if (az0.b.a()) {
                nVar.invoke();
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: gw0.j$j, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.logging.presentation.reports.LifestyleDetailsReportScreenKt$LifestyleDetailsReport$3$2$1$1", f = "LifestyleDetailsReportScreen.kt", l = {332}, m = "invokeSuspend", v = 2)
    public static final class C1599j extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f79687a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ mc f79688b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1599j(mc mcVar, t13.d<? super C1599j> dVar) {
            super(2, dVar);
            this.f79688b = mcVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new C1599j(this.f79688b, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((C1599j) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f79687a;
            if (i14 == 0) {
                o13.r.b(obj);
                this.f79687a = 1;
                if (this.f79688b.d(this) == aVar) {
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
    @v13.e(c = "com.garmin.android.apps.connectmobile.logging.presentation.reports.LifestyleDetailsReportScreenKt$LifestyleDetailsReport$4$1$1$1", f = "LifestyleDetailsReportScreen.kt", l = {346}, m = "invokeSuspend", v = 2)
    public static final class k extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f79689a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ mc f79690b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(mc mcVar, t13.d<? super k> dVar) {
            super(2, dVar);
            this.f79690b = mcVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new k(this.f79690b, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((k) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f79689a;
            if (i14 == 0) {
                o13.r.b(obj);
                this.f79689a = 1;
                if (this.f79690b.d(this) == aVar) {
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
    @v13.e(c = "com.garmin.android.apps.connectmobile.logging.presentation.reports.LifestyleDetailsReportScreenKt$LifestyleDetailsReport$4$2$1$1", f = "LifestyleDetailsReportScreen.kt", l = {349}, m = "invokeSuspend", v = 2)
    public static final class l extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f79691a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ mc f79692b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(mc mcVar, t13.d<? super l> dVar) {
            super(2, dVar);
            this.f79692b = mcVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new l(this.f79692b, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((l) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f79691a;
            if (i14 == 0) {
                o13.r.b(obj);
                this.f79691a = 1;
                if (this.f79692b.d(this) == aVar) {
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
    @v13.e(c = "com.garmin.android.apps.connectmobile.logging.presentation.reports.LifestyleDetailsReportScreenKt$LifestyleDetailsReport$4$3$1$1", f = "LifestyleDetailsReportScreen.kt", l = {351}, m = "invokeSuspend", v = 2)
    public static final class m extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f79693a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ mc f79694b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(mc mcVar, t13.d<? super m> dVar) {
            super(2, dVar);
            this.f79694b = mcVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new m(this.f79694b, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((m) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f79693a;
            if (i14 == 0) {
                o13.r.b(obj);
                this.f79693a = 1;
                if (this.f79694b.d(this) == aVar) {
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
    public static final class n implements e23.l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final n f79695a = new n();

        @Override // e23.l
        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return null;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class o implements e23.l<Integer, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.l f79696a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ List f79697b;

        public o(e23.l lVar, List list) {
            this.f79696a = lVar;
            this.f79697b = list;
        }

        @Override // e23.l
        public final Object invoke(Integer num) {
            return this.f79696a.invoke(this.f79697b.get(num.intValue()));
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class p implements e23.r<e2.d, Integer, p3.m, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ List f79698a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ o53.b0 f79699b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ mc f79700c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ p1 f79701d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ i53.d f79702e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ mc f79703f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ p1 f79704g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ e23.q f79705h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ e23.a f79706i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ p1 f79707j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final /* synthetic */ p1 f79708k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final /* synthetic */ p1 f79709l;

        public p(List list, o53.b0 b0Var, mc mcVar, p1 p1Var, i53.d dVar, mc mcVar2, p1 p1Var2, e23.q qVar, e23.a aVar, p1 p1Var3, p1 p1Var4, p1 p1Var5) {
            this.f79698a = list;
            this.f79699b = b0Var;
            this.f79700c = mcVar;
            this.f79701d = p1Var;
            this.f79702e = dVar;
            this.f79703f = mcVar2;
            this.f79704g = p1Var2;
            this.f79705h = qVar;
            this.f79706i = aVar;
            this.f79707j = p1Var3;
            this.f79708k = p1Var4;
            this.f79709l = p1Var5;
        }

        /* JADX WARN: Code duplicated, block: B:27:0x0078  */
        /* JADX WARN: Code duplicated, block: B:32:0x00b1  */
        /* JADX WARN: Code duplicated, block: B:37:0x00ee  */
        /* JADX WARN: Code duplicated, block: B:42:0x0122  */
        @Override // e23.r
        public final Unit invoke(e2.d dVar, Integer num, p3.m mVar, Integer num2) {
            int i14;
            e2.d dVar2 = dVar;
            int iIntValue = num.intValue();
            p3.m mVar2 = mVar;
            int iIntValue2 = num2.intValue();
            if ((iIntValue2 & 6) == 0) {
                i14 = (mVar2.B(dVar2) ? 4 : 2) | iIntValue2;
            } else {
                i14 = iIntValue2;
            }
            if ((iIntValue2 & 48) == 0) {
                i14 |= mVar2.k(iIntValue) ? 32 : 16;
            }
            if (mVar2.n(i14 & 1, (i14 & 147) != 146)) {
                x1 x1Var = p3.n.f135158a;
                pv0.h hVar = (pv0.h) this.f79698a.get(iIntValue);
                mVar2.C(-2130342982);
                o53.b0 b0Var = this.f79699b;
                boolean zR = mVar2.r(b0Var);
                mc mcVar = this.f79700c;
                boolean zB = zR | mVar2.B(mcVar);
                Object objQ = mVar2.q();
                p3.m.a aVar = p3.m.f135153a;
                if (zB) {
                    objQ = new b(b0Var, this.f79707j, mcVar);
                    mVar2.K(objQ);
                } else {
                    aVar.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new b(b0Var, this.f79707j, mcVar);
                        mVar2.K(objQ);
                    }
                }
                e23.l lVar = (e23.l) objQ;
                boolean zR2 = mVar2.r(hVar);
                p1 p1Var = this.f79701d;
                boolean zB2 = zR2 | mVar2.B(p1Var) | mVar2.r(this.f79702e);
                mc mcVar2 = this.f79703f;
                boolean zB3 = zB2 | mVar2.B(mcVar2) | mVar2.r(b0Var);
                Object objQ2 = mVar2.q();
                if (zB3) {
                    c cVar = new c(hVar, this.f79703f, this.f79699b, this.f79708k, this.f79702e, this.f79701d, this.f79709l);
                    mVar2.K(cVar);
                    objQ2 = cVar;
                } else {
                    aVar.getClass();
                    if (objQ2 == p3.m.a.f135155b) {
                        c cVar2 = new c(hVar, this.f79703f, this.f79699b, this.f79708k, this.f79702e, this.f79701d, this.f79709l);
                        mVar2.K(cVar2);
                        objQ2 = cVar2;
                    }
                }
                e23.a aVar2 = (e23.a) objQ2;
                boolean zR3 = mVar2.r(b0Var) | mVar2.r(hVar) | mVar2.B(p1Var) | mVar2.B(mcVar2);
                Object objQ3 = mVar2.q();
                if (zR3) {
                    objQ3 = new d(hVar, this.f79703f, this.f79699b, this.f79708k, this.f79701d, this.f79709l);
                    mVar2.K(objQ3);
                } else {
                    aVar.getClass();
                    if (objQ3 == p3.m.a.f135155b) {
                        objQ3 = new d(hVar, this.f79703f, this.f79699b, this.f79708k, this.f79701d, this.f79709l);
                        mVar2.K(objQ3);
                    }
                }
                e23.l lVar2 = (e23.l) objQ3;
                p1 p1Var2 = this.f79704g;
                boolean zB4 = mVar2.B(p1Var2) | mVar2.r(hVar);
                e23.q qVar = this.f79705h;
                boolean zB5 = zB4 | mVar2.B(qVar);
                Object objQ4 = mVar2.q();
                if (zB5) {
                    objQ4 = new e(hVar, qVar, p1Var2);
                    mVar2.K(objQ4);
                } else {
                    aVar.getClass();
                    if (objQ4 == p3.m.a.f135155b) {
                        objQ4 = new e(hVar, qVar, p1Var2);
                        mVar2.K(objQ4);
                    }
                }
                j.a(hVar, lVar, aVar2, lVar2, (e23.l) objQ4, this.f79706i, mVar2, pv0.h.f141372i);
                mVar2.f();
            } else {
                mVar2.e();
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class q implements e23.l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final q f79710a = new q();

        @Override // e23.l
        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return null;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class r implements e23.l<Integer, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.l f79711a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ List f79712b;

        public r(e23.l lVar, List list) {
            this.f79711a = lVar;
            this.f79712b = list;
        }

        @Override // e23.l
        public final Object invoke(Integer num) {
            return this.f79711a.invoke(this.f79712b.get(num.intValue()));
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class s implements e23.r<e2.d, Integer, p3.m, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ List f79713a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ o53.b0 f79714b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ mc f79715c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ p1 f79716d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ i53.d f79717e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ mc f79718f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ p1 f79719g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ e23.q f79720h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ e23.a f79721i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ p1 f79722j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final /* synthetic */ p1 f79723k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final /* synthetic */ p1 f79724l;

        public s(List list, o53.b0 b0Var, mc mcVar, p1 p1Var, i53.d dVar, mc mcVar2, p1 p1Var2, e23.q qVar, e23.a aVar, p1 p1Var3, p1 p1Var4, p1 p1Var5) {
            this.f79713a = list;
            this.f79714b = b0Var;
            this.f79715c = mcVar;
            this.f79716d = p1Var;
            this.f79717e = dVar;
            this.f79718f = mcVar2;
            this.f79719g = p1Var2;
            this.f79720h = qVar;
            this.f79721i = aVar;
            this.f79722j = p1Var3;
            this.f79723k = p1Var4;
            this.f79724l = p1Var5;
        }

        /* JADX WARN: Code duplicated, block: B:27:0x0078  */
        /* JADX WARN: Code duplicated, block: B:32:0x00b1  */
        /* JADX WARN: Code duplicated, block: B:37:0x00ee  */
        /* JADX WARN: Code duplicated, block: B:42:0x0122  */
        @Override // e23.r
        public final Unit invoke(e2.d dVar, Integer num, p3.m mVar, Integer num2) {
            int i14;
            e2.d dVar2 = dVar;
            int iIntValue = num.intValue();
            p3.m mVar2 = mVar;
            int iIntValue2 = num2.intValue();
            if ((iIntValue2 & 6) == 0) {
                i14 = (mVar2.B(dVar2) ? 4 : 2) | iIntValue2;
            } else {
                i14 = iIntValue2;
            }
            if ((iIntValue2 & 48) == 0) {
                i14 |= mVar2.k(iIntValue) ? 32 : 16;
            }
            if (mVar2.n(i14 & 1, (i14 & 147) != 146)) {
                x1 x1Var = p3.n.f135158a;
                pv0.h hVar = (pv0.h) this.f79713a.get(iIntValue);
                mVar2.C(1420238947);
                o53.b0 b0Var = this.f79714b;
                boolean zR = mVar2.r(b0Var);
                mc mcVar = this.f79715c;
                boolean zB = zR | mVar2.B(mcVar);
                Object objQ = mVar2.q();
                p3.m.a aVar = p3.m.f135153a;
                if (zB) {
                    objQ = new f(b0Var, this.f79722j, mcVar);
                    mVar2.K(objQ);
                } else {
                    aVar.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new f(b0Var, this.f79722j, mcVar);
                        mVar2.K(objQ);
                    }
                }
                e23.l lVar = (e23.l) objQ;
                boolean zR2 = mVar2.r(hVar);
                p1 p1Var = this.f79716d;
                boolean zB2 = zR2 | mVar2.B(p1Var) | mVar2.r(this.f79717e);
                mc mcVar2 = this.f79718f;
                boolean zB3 = zB2 | mVar2.B(mcVar2) | mVar2.r(b0Var);
                Object objQ2 = mVar2.q();
                if (zB3) {
                    g gVar = new g(hVar, this.f79718f, this.f79714b, this.f79723k, this.f79717e, this.f79716d, this.f79724l);
                    mVar2.K(gVar);
                    objQ2 = gVar;
                } else {
                    aVar.getClass();
                    if (objQ2 == p3.m.a.f135155b) {
                        g gVar2 = new g(hVar, this.f79718f, this.f79714b, this.f79723k, this.f79717e, this.f79716d, this.f79724l);
                        mVar2.K(gVar2);
                        objQ2 = gVar2;
                    }
                }
                e23.a aVar2 = (e23.a) objQ2;
                boolean zR3 = mVar2.r(b0Var) | mVar2.r(hVar) | mVar2.B(p1Var) | mVar2.B(mcVar2);
                Object objQ3 = mVar2.q();
                if (zR3) {
                    objQ3 = new h(hVar, this.f79718f, this.f79714b, this.f79723k, this.f79716d, this.f79724l);
                    mVar2.K(objQ3);
                } else {
                    aVar.getClass();
                    if (objQ3 == p3.m.a.f135155b) {
                        objQ3 = new h(hVar, this.f79718f, this.f79714b, this.f79723k, this.f79716d, this.f79724l);
                        mVar2.K(objQ3);
                    }
                }
                e23.l lVar2 = (e23.l) objQ3;
                p1 p1Var2 = this.f79719g;
                boolean zB4 = mVar2.B(p1Var2) | mVar2.r(hVar);
                e23.q qVar = this.f79720h;
                boolean zB5 = zB4 | mVar2.B(qVar);
                Object objQ4 = mVar2.q();
                if (zB5) {
                    objQ4 = new i(hVar, qVar, p1Var2);
                    mVar2.K(objQ4);
                } else {
                    aVar.getClass();
                    if (objQ4 == p3.m.a.f135155b) {
                        objQ4 = new i(hVar, qVar, p1Var2);
                        mVar2.K(objQ4);
                    }
                }
                j.a(hVar, lVar, aVar2, lVar2, (e23.l) objQ4, this.f79721i, mVar2, pv0.h.f141372i);
                mVar2.f();
            } else {
                mVar2.e();
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(final pv0.h hVar, e23.l<? super pv0.w, Unit> lVar, e23.a<Unit> aVar, e23.l<? super pv0.y, Unit> lVar2, final e23.l<? super pv0.s, Unit> lVar3, e23.a<Unit> aVar2, p3.m mVar, int i14) {
        e23.a aVar3;
        int i15;
        boolean z14;
        int i16;
        boolean z15;
        o0 o0VarE = mVar.E(-673920124);
        int i17 = i14 | ((i14 & 8) == 0 ? o0VarE.B(hVar) : o0VarE.r(hVar) ? 4 : 2) | (o0VarE.r(lVar) ? 32 : 16) | (o0VarE.r(aVar) ? 256 : 128) | (o0VarE.r(lVar2) ? 2048 : 1024) | (o0VarE.r(lVar3) ? 16384 : 8192) | (o0VarE.r(aVar2) ? 131072 : 65536);
        if (o0VarE.n(i17 & 1, (i17 & 74899) != 74898)) {
            x1 x1Var = p3.n.f135158a;
            String strA = new aw0.a(w2.a0.s(o0VarE)).a(hVar.f141374a, hVar.f141380g);
            pv0.w wVarC = pv0.j.c(hVar);
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            Boolean boolValueOf = null;
            if (objQ == c2565a) {
                objQ = p0.n(null);
                o0VarE.K(objQ);
            }
            final p1 p1Var = (p1) objQ;
            h4.r.a aVar4 = h4.r.S;
            d92.b.f58623a.getClass();
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.e eVar = j92.b.f97899b;
            float f14 = eVar.f97920e;
            bVar.getClass();
            h4.r rVarC = c2.l.C(aVar4, f14, 0.0f, eVar.f97920e, 0.0f, 10);
            h4.d.f81522a.getClass();
            z0 z0VarD = c2.q.d(h4.d.a.f81524b, false);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC2 = h4.k.c(rVarC, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar5 = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar5);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, z0VarD, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            }
            b4.c(h5.g.a.f81807d, rVarC2, o0VarE);
            c2.u uVar = c2.u.f22885a;
            if (wVarC == null) {
                o0VarE.C(1431840637);
                o0VarE.g0(false);
                aVar3 = null;
            } else {
                o0VarE.C(1431840638);
                boolean zK = ((i17 & 112) == 32) | o0VarE.k(wVarC.ordinal());
                Object objQ2 = o0VarE.q();
                if (zK || objQ2 == c2565a) {
                    objQ2 = new gp.f(6, lVar, wVarC);
                    o0VarE.K(objQ2);
                }
                o0VarE.g0(false);
                aVar3 = (e23.a) objQ2;
            }
            if (pv0.j.d(hVar)) {
                o0VarE.C(1431933452);
                int i18 = i17 & 14;
                boolean z16 = (i18 == 4 || ((i17 & 8) != 0 && o0VarE.r(hVar))) | ((i17 & 57344) == 16384);
                Object objQ3 = o0VarE.q();
                if (z16 || objQ3 == c2565a) {
                    final int i19 = 0;
                    objQ3 = new e23.l() { // from class: gw0.g
                        @Override // e23.l
                        public final Object invoke(Object obj) {
                            switch (i19) {
                                case 0:
                                    pv0.s sVar = (pv0.s) obj;
                                    sVar.getClass();
                                    if (pv0.j.b(hVar) == sVar) {
                                        p1Var.setValue(sVar);
                                    } else {
                                        lVar3.invoke(sVar);
                                    }
                                    break;
                                default:
                                    pv0.s sVar2 = ((Boolean) obj).booleanValue() ? pv0.s.YES : pv0.s.NO;
                                    if (pv0.j.b(hVar) == sVar2) {
                                        p1Var.setValue(sVar2);
                                    } else {
                                        lVar3.invoke(sVar2);
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    o0VarE.K(objQ3);
                }
                int i24 = i17 << 3;
                j(hVar, strA, aVar3, aVar, lVar2, (e23.l) objQ3, o0VarE, i18 | pv0.h.f141372i | (i24 & 7168) | (i24 & 57344));
                o0VarE.g0(false);
                z15 = false;
                z14 = true;
                i16 = 131072;
                i15 = 16384;
            } else {
                o0VarE.C(1432808148);
                pv0.s sVarB = pv0.j.b(hVar);
                if (sVarB != null) {
                    boolValueOf = Boolean.valueOf(sVarB == pv0.s.YES);
                }
                i15 = 16384;
                boolean z17 = ((i17 & 14) == 4 || ((i17 & 8) != 0 && o0VarE.r(hVar))) | ((i17 & 57344) == 16384);
                Object objQ4 = o0VarE.q();
                if (z17 || objQ4 == c2565a) {
                    z14 = true;
                    final char c14 = 1 == true ? 1 : 0;
                    objQ4 = new e23.l() { // from class: gw0.g
                        @Override // e23.l
                        public final Object invoke(Object obj) {
                            switch (c14) {
                                case 0:
                                    pv0.s sVar = (pv0.s) obj;
                                    sVar.getClass();
                                    if (pv0.j.b(hVar) == sVar) {
                                        p1Var.setValue(sVar);
                                    } else {
                                        lVar3.invoke(sVar);
                                    }
                                    break;
                                default:
                                    pv0.s sVar2 = ((Boolean) obj).booleanValue() ? pv0.s.YES : pv0.s.NO;
                                    if (pv0.j.b(hVar) == sVar2) {
                                        p1Var.setValue(sVar2);
                                    } else {
                                        lVar3.invoke(sVar2);
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    o0VarE.K(objQ4);
                } else {
                    z14 = true;
                }
                e23.l lVar4 = (e23.l) objQ4;
                i16 = 131072;
                z15 = false;
                wv0.o.a(null, strA, boolValueOf, aVar3, lVar4, null, o0VarE, 0, 33);
                o0VarE.g0(false);
            }
            o0VarE.g0(z14);
            if (((pv0.s) p1Var.getF182175a()) != null) {
                o0VarE.C(-2074583700);
                boolean z18 = (i17 & 57344) == i15 ? z14 : z15;
                if ((i17 & 458752) != i16) {
                    z14 = z15;
                }
                boolean z19 = z14 | z18;
                Object objQ5 = o0VarE.q();
                if (z19 != 0 || objQ5 == c2565a) {
                    objQ5 = new cv0.a(aVar2, p1Var, lVar3, 3);
                    o0VarE.K(objQ5);
                }
                e23.a aVar6 = (e23.a) objQ5;
                Object objQ6 = o0VarE.q();
                if (objQ6 == c2565a) {
                    objQ6 = new gp.e(p1Var, 14);
                    o0VarE.K(objQ6);
                }
                k(aVar6, (e23.a) objQ6, o0VarE, 48);
                o0VarE.g0(z15);
            } else {
                o0VarE.C(-2074197378);
                o0VarE.g0(z15);
            }
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a11.g0(hVar, lVar, aVar, lVar2, lVar3, aVar2, i14);
        }
    }

    public static final void b(String str, p3.m mVar, int i14) {
        o0 o0Var;
        o0 o0VarE = mVar.E(568221978);
        int i15 = (o0VarE.B(str) ? 4 : 2) | i14;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            String upperCase = str.toUpperCase(Locale.ROOT);
            upperCase.getClass();
            d92.b.f58623a.getClass();
            d92.b.f58624b.getClass();
            x0 x0VarF = d92.c.f(j92.f.f97934k, o0VarE);
            h4.r.a aVar = h4.r.S;
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.e eVar = j92.b.f97899b;
            h4.r rVarA = c2.l.A(aVar, eVar.f97920e, 0.0f, 2);
            bVar.getClass();
            o0Var = o0VarE;
            mh.c(upperCase, c2.l.C(rVarA, 0.0f, eVar.f97918c, 0.0f, 0.0f, 13), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarF, o0Var, 0, 0, 131068);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new fv1.b(str, i14, 8);
        }
    }

    /* JADX WARN: Code duplicated, block: B:108:0x01a0  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void c(pv0.h hVar, pv0.y yVar, boolean z14, mc mcVar, e23.p<? super pv0.w, ? super pv0.y, Unit> pVar, e23.p<? super pv0.h, ? super pv0.y, Unit> pVar2, e23.a<Unit> aVar, e23.p<? super pv0.s, ? super pv0.o, Unit> pVar3, p3.m mVar, int i14) {
        int i15;
        e23.a<Unit> aVar2;
        o0 o0Var;
        i53.c cVarE;
        Object next;
        ArrayList arrayList;
        Integer num;
        boolean z15;
        String strJ;
        e23.l lVar;
        e23.a aVar3;
        boolean z16;
        List<pv0.y> listA;
        o0 o0VarE = mVar.E(-1896436031);
        if ((i14 & 6) == 0) {
            i15 = ((i14 & 8) == 0 ? o0VarE.B(hVar) : o0VarE.r(hVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(yVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.h(z14) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.B(mcVar) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i15 |= o0VarE.r(pVar) ? 16384 : 8192;
        }
        if ((196608 & i14) == 0) {
            i15 |= o0VarE.r(pVar2) ? 131072 : 65536;
        }
        if ((1572864 & i14) == 0) {
            aVar2 = aVar;
            i15 |= o0VarE.r(aVar2) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        } else {
            aVar2 = aVar;
        }
        if ((12582912 & i14) == 0) {
            i15 |= o0VarE.r(pVar3) ? 8388608 : 4194304;
        }
        if (o0VarE.n(i15 & 1, (4793491 & i15) != 4793490)) {
            x1 x1Var = p3.n.f135158a;
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            if (objQ == p3.m.a.f135155b) {
                objQ = p0.n(Boolean.FALSE);
                o0VarE.K(objQ);
            }
            p1 p1Var = (p1) objQ;
            String strA = new aw0.a(w2.a0.s(o0VarE)).a(hVar.f141374a, hVar.f141380g);
            if (og2.k.y(pv0.j.a(hVar))) {
                o0VarE.C(-725221181);
            } else {
                o0VarE.C(-725165970);
                String str = hVar.f141376c;
                b63.o oVarB = str != null ? b63.o.Companion.b(b63.o.INSTANCE, str) : null;
                b63.o oVarD = g22.l.d(b63.o.INSTANCE);
                if (p005kotlin.jvm.internal.s.g(oVarB, oVarD)) {
                    strA = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, -1408861645, R.string.msg_how_many_drinks_today, o0VarE, false);
                } else {
                    b63.i.INSTANCE.getClass();
                    if (p005kotlin.jvm.internal.s.g(oVarB, b63.q.c(oVarD, 1, b63.i.f16190d))) {
                        strA = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, -1408858281, R.string.msg_how_many_drinks_yesterday, o0VarE, false);
                    } else {
                        o0VarE.C(-724851258);
                        String strD = oVarB != null ? new pi0.a((Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b)).d(g22.l.h(oVarB), qi0.a.NO_YEAR_ABBREV_MONTH_DAY) : null;
                        if (strD == null) {
                            strD = "";
                        }
                        strA = gl1.y.P(R.string.msg_how_many_drinks_on_date, new Object[]{strD}, o0VarE);
                        o0VarE.g0(false);
                    }
                }
            }
            o0VarE.g0(false);
            pv0.w wVarC = pv0.j.c(hVar);
            if (wVarC == null || (listA = pv0.x.a(wVarC)) == null) {
                cVarE = null;
            } else {
                if (!(!listA.isEmpty() && z14)) {
                    listA = null;
                }
                if (listA != null) {
                    cVarE = i53.a.e(listA);
                } else {
                    cVarE = null;
                }
            }
            Iterable iterable = hVar.f141378e;
            if (iterable == null) {
                iterable = j0.f134944a;
            }
            Iterator it = iterable.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!p005kotlin.jvm.internal.s.g(wVarC != null ? pv0.x.b(wVarC, ((pv0.o) next).f141395a) : null, yVar));
            pv0.o oVar = (pv0.o) next;
            Integer num2 = oVar != null ? oVar.f141397c : null;
            if (cVarE == null) {
                o0VarE.C(-724077871);
                o0VarE.g0(false);
                num = num2;
                z15 = false;
                arrayList = null;
            } else {
                o0VarE.C(-724077870);
                arrayList = new ArrayList(p13.y.r(cVarE, 10));
                Iterator it3 = cVarE.iterator();
                while (it3.hasNext()) {
                    Iterator it4 = it3;
                    pv0.y yVar2 = (pv0.y) it3.next();
                    zv0.a aVar4 = zv0.a.f207158a;
                    Integer num3 = num2;
                    l22.a aVarS = w2.a0.s(o0VarE);
                    aVar4.getClass();
                    arrayList.add(zv0.a.c(yVar2, aVarS));
                    it3 = it4;
                    num2 = num3;
                }
                num = num2;
                z15 = false;
                o0VarE.g0(false);
            }
            i53.c cVarE2 = arrayList != null ? i53.a.e(arrayList) : null;
            if (cVarE == null) {
                o0VarE.C(-723661975);
                o0VarE.g0(z15);
                strJ = null;
            } else {
                strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, -723661974, R.string.lbl_what_type_of_drink, o0VarE, z15);
            }
            Integer numValueOf = cVarE != null ? Integer.valueOf(cVarE.indexOf(yVar)) : null;
            if (cVarE == null) {
                o0VarE.C(-723415928);
                o0VarE.g0(z15);
                lVar = null;
            } else {
                o0VarE.C(-723415927);
                boolean zK = ((i15 & 57344) == 16384) | o0VarE.k(wVarC == null ? -1 : wVarC.ordinal()) | o0VarE.r(cVarE);
                Object objQ2 = o0VarE.q();
                if (zK || objQ2 == p3.m.a.f135155b) {
                    objQ2 = new ci0.b(pVar, 27, wVarC, cVarE);
                    o0VarE.K(objQ2);
                }
                lVar = (e23.l) objQ2;
                z15 = false;
                o0VarE.g0(false);
            }
            if (num == null) {
                o0VarE.C(-723259626);
                o0VarE.g0(z15);
                aVar3 = null;
            } else {
                o0VarE.C(-723259625);
                Object objQ3 = o0VarE.q();
                if (objQ3 == p3.m.a.f135155b) {
                    objQ3 = new gp.e(p1Var, 12);
                    o0VarE.K(objQ3);
                }
                o0VarE.g0(false);
                aVar3 = (e23.a) objQ3;
            }
            boolean zR = ((i15 & 29360128) == 8388608) | o0VarE.r(yVar);
            Object objQ4 = o0VarE.q();
            if (zR || objQ4 == p3.m.a.f135155b) {
                objQ4 = new m1(11, pVar3, yVar);
                o0VarE.K(objQ4);
            }
            e23.a<Unit> aVar5 = aVar2;
            Integer num4 = num;
            wv0.s.a(strA, num4, strJ, cVarE2, numValueOf, mcVar, lVar, aVar3, aVar5, (e23.l) objQ4, o0VarE, ((i15 << 12) & 29360128) | 3456, (i15 >> 18) & 14);
            o0Var = o0VarE;
            if (((Boolean) p1Var.getF182175a()).booleanValue()) {
                o0Var.C(-722959545);
                boolean zR2 = ((i15 & 458752) == 131072) | ((i15 & 14) == 4 || ((i15 & 8) != 0 && o0Var.r(hVar))) | o0Var.r(yVar);
                Object objQ5 = o0Var.q();
                if (zR2 || objQ5 == p3.m.a.f135155b) {
                    z16 = false;
                    af0.e eVar = new af0.e((Object) pVar2, (Object) hVar, (Object) yVar, (Object) p1Var, 27);
                    o0Var.K(eVar);
                    objQ5 = eVar;
                } else {
                    z16 = false;
                }
                e23.a aVar6 = (e23.a) objQ5;
                Object objQ6 = o0Var.q();
                if (objQ6 == p3.m.a.f135155b) {
                    objQ6 = new gp.e(p1Var, 13);
                    o0Var.K(objQ6);
                }
                f(aVar6, (e23.a) objQ6, o0Var, 48);
                o0Var.g0(z16);
            } else {
                o0Var.C(-722719295);
                o0Var.g0(false);
            }
            x1 x1Var2 = p3.n.f135158a;
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new e52.d(hVar, yVar, z14, mcVar, pVar, pVar2, aVar, pVar3, i14);
        }
    }

    /* JADX WARN: Code duplicated, block: B:66:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:69:0x00ed A[LOOP:1: B:67:0x00e7->B:69:0x00ed, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:72:0x00fe  */
    public static final void d(i53.c<pv0.h> cVar, i53.c<pv0.h> cVar2, b63.o oVar, i53.c<pv0.l> cVar3, e23.l<? super b63.o, Unit> lVar, p3.m mVar, int i14) {
        int i15;
        ArrayList arrayList;
        Iterator it;
        Object obj;
        o0 o0VarE = mVar.E(-2056404127);
        if ((i14 & 6) == 0) {
            i15 = ((i14 & 8) == 0 ? o0VarE.B(cVar) : o0VarE.r(cVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= (i14 & 64) == 0 ? o0VarE.B(cVar2) : o0VarE.r(cVar2) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.r(oVar) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= (i14 & 4096) == 0 ? o0VarE.B(cVar3) : o0VarE.r(cVar3) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i15 |= o0VarE.r(lVar) ? 16384 : 8192;
        }
        if (o0VarE.n(i15 & 1, (i15 & 9363) != 9362)) {
            x1 x1Var = p3.n.f135158a;
            int size = cVar.size();
            int size2 = cVar2.size();
            b63.j jVarB = oVar.b();
            boolean zK = ((i15 & 7168) == 2048 || ((i15 & 4096) != 0 && o0VarE.B(cVar3))) | o0VarE.k(jVarB.ordinal()) | o0VarE.k(size) | o0VarE.k(size2);
            Object objQ = o0VarE.q();
            if (zK) {
                obj = objQ;
                ArrayList arrayListA = pv0.m.a(cVar3);
                arrayList = new ArrayList(p13.y.r(arrayListA, 10));
                it = arrayListA.iterator();
                while (it.hasNext()) {
                    arrayList.add(((b63.o) it.next()).b());
                }
                if (size >= size2) {
                    arrayList = p13.h0.D0(arrayList, jVarB);
                }
                o0VarE.K(arrayList);
                obj = arrayList;
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    obj = objQ;
                    ArrayList arrayListA2 = pv0.m.a(cVar3);
                    arrayList = new ArrayList(p13.y.r(arrayListA2, 10));
                    it = arrayListA2.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((b63.o) it.next()).b());
                    }
                    if (size >= size2) {
                        arrayList = p13.h0.D0(arrayList, jVarB);
                    }
                    o0VarE.K(arrayList);
                    obj = arrayList;
                }
            }
            obj = objQ;
            List list = (List) obj;
            aw0.a aVar = new aw0.a(w2.a0.s(o0VarE));
            list.getClass();
            String strA = aVar.f13319a.a(R.string.lbl_logged_days, p13.h0.k0(list, null, null, null, new w0(11), 31));
            ArrayList arrayList2 = new ArrayList();
            o0VarE.C(-519381287);
            int i16 = 6;
            while (-1 < i16) {
                b63.i.INSTANCE.getClass();
                b63.o oVarC = b63.q.c(oVar, i16, b63.i.f16190d);
                arrayList2.add(new c82.j(oVarC, list.contains(oVarC.b()) ? new c82.h.a(null, 1, null) : c82.h.f.f25735a, gl1.y.P(R.string.lbl_press_to_navigate_to, new Object[]{oVarC.toString()}, o0VarE), false, 8, null));
                i16--;
                i15 = i15;
            }
            int i17 = i15;
            o0VarE.g0(false);
            h4.r.a aVar2 = h4.r.S;
            d92.b.f58623a.getClass();
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.e eVar = j92.b.f97899b;
            h4.r rVarY = c2.l.y(aVar2, eVar.f97920e);
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            c2.z zVarA = c2.y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            x1 x1Var2 = p3.n.f135158a;
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarY, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar3 = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p0.l();
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
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            c2.b0 b0Var = c2.b0.f22601a;
            e(size, size2, 0, o0VarE);
            i53.f fVarJ = i53.a.j(arrayList2);
            bVar.getClass();
            a12.c.a(fVarJ, strA, c2.l.C(aVar2, 0.0f, eVar.f97920e, 0.0f, 0.0f, 13), null, lVar, o0VarE, 3080 | (i17 & 57344));
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a42.n(cVar, cVar2, oVar, cVar3, lVar, i14, 23);
        }
    }

    public static final void e(int i14, int i15, int i16, p3.m mVar) {
        int i17;
        int i18;
        o0 o0VarE = mVar.E(856342076);
        int i19 = i16 | (o0VarE.k(i14) ? 4 : 2) | (o0VarE.k(i15) ? 32 : 16);
        if (o0VarE.n(i19 & 1, (i19 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            h4.r.a aVar = h4.r.S;
            h4.r rVarF = x2.f(aVar, 1.0f);
            h4.d.f81522a.getClass();
            h4.g.b bVar = h4.d.a.f81534l;
            c2.j.f22691a.getClass();
            s2 s2VarA = q2.a(c2.j.f22698h, bVar, o0VarE, 54);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarF, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar2 = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar2);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, s2VarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            u2 u2Var = u2.f22900a;
            String strQ = gl1.y.Q(o0VarE, R.string.lbl_behaviors_logged);
            d92.b.f58623a.getClass();
            j92.f fVar = d92.b.f58624b;
            fVar.getClass();
            mh.c(strQ, x2.f(u2Var.c(aVar, bVar), 0.7f), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(d92.c.e(j92.f.f97932i), o0VarE), o0VarE, 0, 0, 131068);
            o0VarE = o0VarE;
            String strP = gl1.y.P(R.string.lbl_value1_of_value2, new Object[]{Integer.valueOf(i14), Integer.valueOf(i15)}, o0VarE);
            fVar.getClass();
            x0 x0VarB = d92.c.b(j92.f.f97931h, o0VarE);
            h4.r rVarA = u2Var.a(aVar, 0.2f, true);
            d6.h.f57752b.getClass();
            g02.c.a(strP, rVarA, 0L, d6.h.a(d6.h.f57758h), 0, false, 1, x0VarB, 0.0d, o0VarE, 1572864, StatusLine.HTTP_PERM_REDIRECT);
            d92.b.f58625c.getClass();
            g6.f.a aVar3 = g6.f.f75994b;
            i18 = i14;
            i17 = i15;
            c02.h.c(Double.valueOf(i18), Double.valueOf(i17), u2Var.c(x2.q(c2.l.C(aVar, j92.b.f97899b.f97918c, 0.0f, 0.0f, 0.0f, 14), 28), bVar), o0VarE, 0, 0);
            o0VarE.g0(true);
        } else {
            i17 = i15;
            i18 = i14;
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a71.l(i18, i17, i16, 5);
        }
    }

    public static final void f(e23.a<Unit> aVar, e23.a<Unit> aVar2, p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(-1494511700);
        int i15 = i14 | (o0VarE.r(aVar) ? 4 : 2);
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            c1.f110940a.a(false, gl1.y.Q(o0VarE, R.string.lbl_delete_logging_details), gl1.y.Q(o0VarE, R.string.msg_delete_logging_details), null, null, gl1.y.Q(o0VarE, R.string.lbl_delete), false, false, aVar, gl1.y.Q(o0VarE, R.string.lbl_cancel), aVar2, o0VarE, ((i15 << 24) & 234881024) | 6, 6, 216);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new at1.f(aVar, aVar2, i14, 14);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void g(b63.o oVar, pv0.q qVar, boolean z14, boolean z15, i53.d<pv0.w, ? extends pv0.y> dVar, e23.p<? super pv0.w, ? super pv0.y, Unit> pVar, e23.p<? super pv0.h, ? super pv0.y, Unit> pVar2, e23.q<? super pv0.h, ? super pv0.s, ? super pv0.o, Unit> qVar2, e23.a<Unit> aVar, e23.a<Unit> aVar2, e23.a<Unit> aVar3, e23.l<? super b63.o, Unit> lVar, p3.m mVar, int i14, int i15) {
        e23.p<? super pv0.h, ? super pv0.y, Unit> pVar3;
        o0 o0Var;
        pv0.w wVarC;
        p1 p1Var;
        o53.b0 b0Var;
        p1 p1Var2;
        pv0.q qVar3;
        p1 p1Var3;
        p1 p1Var4;
        o53.b0 b0Var2;
        p1 p1Var5;
        o0 o0Var2;
        boolean z16;
        boolean z17;
        mc mcVar;
        o0 o0VarE = mVar.E(-10529812);
        int i16 = (i14 & 6) == 0 ? (o0VarE.r(oVar) ? 4 : 2) | i14 : i14;
        if ((i14 & 48) == 0) {
            i16 |= (i14 & 64) == 0 ? o0VarE.B(qVar) : o0VarE.r(qVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i16 |= o0VarE.h(z14) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i16 |= o0VarE.h(z15) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i16 |= o0VarE.r(dVar) ? 16384 : 8192;
        }
        if ((196608 & i14) == 0) {
            i16 |= o0VarE.r(pVar) ? 131072 : 65536;
        }
        if ((i14 & 1572864) == 0) {
            i16 |= o0VarE.r(pVar2) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((i14 & 12582912) == 0) {
            i16 |= o0VarE.r(qVar2) ? 8388608 : 4194304;
        }
        if ((i14 & 100663296) == 0) {
            i16 |= o0VarE.r(aVar) ? 67108864 : 33554432;
        }
        if ((i14 & C.ENCODING_PCM_32BIT) == 0) {
            i16 |= o0VarE.r(aVar2) ? 536870912 : 268435456;
        }
        int i17 = (i15 & 6) == 0 ? i15 | (o0VarE.r(aVar3) ? 4 : 2) : i15;
        if ((i15 & 48) == 0) {
            i17 |= o0VarE.r(lVar) ? 32 : 16;
        }
        if (o0VarE.n(i16 & 1, ((i16 & 306783379) == 306783378 && (i17 & 19) == 18) ? false : true)) {
            x1 x1Var = p3.n.f135158a;
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = l0.j(t13.h.f161748a, o0VarE);
                o0VarE.K(objQ);
            }
            o53.b0 b0Var3 = (o53.b0) objQ;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            mc mcVarF = e9.f(true, null, o0VarE, 6, 2);
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                objQ2 = p0.n(null);
                o0VarE.K(objQ2);
            }
            p1 p1Var6 = (p1) objQ2;
            mc mcVarF2 = e9.f(true, null, o0VarE, 6, 2);
            Object objQ3 = o0VarE.q();
            if (objQ3 == c2565a) {
                objQ3 = p0.n(null);
                o0VarE.K(objQ3);
            }
            p1 p1Var7 = (p1) objQ3;
            boolean zB = o0VarE.B(dVar);
            Object objQ4 = o0VarE.q();
            if (zB || objQ4 == c2565a) {
                pv0.h hVar = (pv0.h) p1Var7.getF182175a();
                objQ4 = p0.n((hVar == null || (wVarC = pv0.j.c(hVar)) == null) ? null : dVar.get(wVarC));
                o0VarE.K(objQ4);
            }
            p1 p1Var8 = (p1) objQ4;
            Object objQ5 = o0VarE.q();
            if (objQ5 == c2565a) {
                objQ5 = p0.n(Boolean.TRUE);
                o0VarE.K(objQ5);
            }
            p1 p1Var9 = (p1) objQ5;
            boolean zB2 = o0VarE.B(qVar.f141405a);
            Object objQ6 = o0VarE.q();
            if (zB2 || objQ6 == c2565a) {
                Iterable iterable = qVar.f141405a;
                if (iterable == null) {
                    iterable = j0.f134944a;
                }
                objQ6 = p0.n(i53.a.e(iterable));
                o0VarE.K(objQ6);
            }
            p1 p1Var10 = (p1) objQ6;
            Boolean boolValueOf = Boolean.valueOf(z14);
            int i18 = i16;
            int i19 = i18 & 112;
            boolean zB3 = (i19 == 32 || ((i18 & 64) != 0 && o0VarE.r(qVar))) | ((i16 & 896) == 256) | o0VarE.B(p1Var10) | o0VarE.r(b0Var3) | o0VarE.r(context) | ((i18 & 234881024) == 67108864);
            Object objQ7 = o0VarE.q();
            if (zB3 || objQ7 == c2565a) {
                p1Var = p1Var8;
                b0Var = b0Var3;
                p1Var2 = p1Var10;
                qVar3 = qVar;
                a aVar4 = new a(z14, qVar3, b0Var, p1Var2, context, aVar, null);
                o0VarE.K(aVar4);
                objQ7 = aVar4;
            } else {
                b0Var = b0Var3;
                p1Var = p1Var8;
                p1Var2 = p1Var10;
                qVar3 = qVar;
            }
            l0.e((e23.p) objQ7, boolValueOf, o0VarE);
            boolean zB4 = o0VarE.B((i53.c) p1Var2.getF182175a());
            Object objQ8 = o0VarE.q();
            if (zB4 || objQ8 == c2565a) {
                i53.c cVar = (i53.c) p1Var2.getF182175a();
                cVar.getClass();
                ArrayList arrayList = new ArrayList();
                for (Object obj : cVar) {
                    pv0.b bVarA = pv0.j.a((pv0.h) obj);
                    if (!(bVarA == pv0.b.SLEEP_RELATED || bVarA == pv0.b.CUSTOM_SLEEP_RELATED)) {
                        arrayList.add(obj);
                    }
                }
                objQ8 = p13.h0.N0(arrayList, new pv0.i());
                o0VarE.K(objQ8);
            }
            List list = (List) objQ8;
            boolean zB5 = o0VarE.B((i53.c) p1Var2.getF182175a());
            Object objQ9 = o0VarE.q();
            if (zB5 || objQ9 == p3.m.a.f135155b) {
                i53.c cVar2 = (i53.c) p1Var2.getF182175a();
                cVar2.getClass();
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : cVar2) {
                    pv0.b bVarA2 = pv0.j.a((pv0.h) obj2);
                    if (bVarA2 == pv0.b.SLEEP_RELATED || bVarA2 == pv0.b.CUSTOM_SLEEP_RELATED) {
                        arrayList2.add(obj2);
                    }
                }
                objQ9 = p13.h0.N0(arrayList2, new pv0.i());
                o0VarE.K(objQ9);
            }
            List list2 = (List) objQ9;
            boolean zB6 = o0VarE.B((i53.c) p1Var2.getF182175a());
            Object objQ10 = o0VarE.q();
            if (zB6 || objQ10 == p3.m.a.f135155b) {
                i53.c cVar3 = (i53.c) p1Var2.getF182175a();
                cVar3.getClass();
                ArrayList arrayList3 = new ArrayList();
                for (Object obj3 : cVar3) {
                    pv0.h hVar2 = (pv0.h) obj3;
                    hVar2.getClass();
                    if (pv0.j.b(hVar2) != null) {
                        arrayList3.add(obj3);
                    }
                }
                objQ10 = i53.a.e(arrayList3);
                o0VarE.K(objQ10);
            }
            i53.c cVar4 = (i53.c) objQ10;
            h4.r rVarE = u1.n.e(x2.d(h4.r.S, 1.0f), vb.h.f(d92.b.f58623a, o0VarE), o4.m1.f128891a);
            c2.j.a aVar5 = c2.j.a.f22700a;
            d92.b.f58625c.getClass();
            float f14 = j92.b.f97899b.f97918c;
            aVar5.getClass();
            c2.j.i iVar = new c2.j.i(f14, false, null, null);
            p1 p1Var11 = p1Var;
            int i24 = i18 & 29360128;
            boolean zR = o0VarE.r(cVar4) | o0VarE.B(p1Var2) | o0VarE.r(oVar) | (i19 == 32 || ((i18 & 64) != 0 && o0VarE.r(qVar3))) | ((i17 & 112) == 32) | o0VarE.r(list) | o0VarE.r(b0Var) | o0VarE.B(mcVarF) | o0VarE.B(p1Var11) | o0VarE.r(dVar) | o0VarE.B(r29) | (i24 == 8388608) | ((i18 & 1879048192) == 536870912) | o0VarE.r(list2) | ((i18 & 7168) == 2048) | ((i17 & 14) == 4);
            Object objQ11 = o0VarE.q();
            if (zR || objQ11 == p3.m.a.f135155b) {
                o53.b0 b0Var4 = b0Var;
                p1Var3 = p1Var9;
                p1Var4 = p1Var7;
                p1 p1Var12 = p1Var2;
                gw0.i iVar2 = new gw0.i(list, list2, z15, cVar4, oVar, qVar3, lVar, p1Var12, b0Var4, mcVarF, p1Var11, dVar, r29, qVar2, aVar2, p1Var6, p1Var4, p1Var3, aVar3);
                p1Var2 = p1Var12;
                b0Var2 = b0Var4;
                p1Var5 = p1Var11;
                o0Var2 = o0VarE;
                o0Var2.K(iVar2);
                objQ11 = iVar2;
            } else {
                b0Var2 = b0Var;
                o0Var2 = o0VarE;
                p1Var5 = p1Var11;
                p1Var3 = p1Var9;
                p1Var4 = p1Var7;
            }
            p1 p1Var13 = p1Var2;
            o0 o0Var3 = o0Var2;
            e2.c.b(rVarE, null, null, iVar, null, null, false, null, (e23.l) objQ11, o0Var3, 0, 494);
            o0Var = o0Var3;
            if (mcVarF.e()) {
                o0Var.C(-154657187);
                t3 t3Var = (t3) o0Var.A(t1.f91501s);
                pv0.w wVar = (pv0.w) p1Var6.getF182175a();
                if (wVar == null) {
                    o0Var.C(-154575689);
                    z17 = false;
                    o0Var.g0(false);
                    z16 = true;
                } else {
                    z17 = false;
                    o0Var.C(-154575688);
                    boolean zR2 = o0Var.r(t3Var);
                    Object objQ12 = o0Var.q();
                    if (zR2 || objQ12 == p3.m.a.f135155b) {
                        z16 = true;
                        objQ12 = new ak0.k(t3Var, 1);
                        o0Var.K(objQ12);
                    } else {
                        z16 = true;
                    }
                    e23.l lVar2 = (e23.l) objQ12;
                    boolean zR3 = o0Var.r(b0Var2) | o0Var.B(mcVarF);
                    Object objQ13 = o0Var.q();
                    if (zR3 || objQ13 == p3.m.a.f135155b) {
                        objQ13 = new cn1.t(b0Var2, mcVarF, 7);
                        o0Var.K(objQ13);
                    }
                    wv0.w.a(wVar, null, lVar2, (e23.a) objQ13, o0Var, 0);
                    Unit unit = Unit.INSTANCE;
                    o0Var.g0(false);
                }
                o0Var.g0(z17);
            } else {
                z16 = true;
                z17 = false;
                o0Var.C(-154325642);
                o0Var.g0(false);
            }
            if (r29.e()) {
                o0Var.C(-1528995658);
                pv0.h hVar3 = (pv0.h) p1Var4.getF182175a();
                if (hVar3 == null) {
                    o0Var.C(-154225141);
                    o0Var.g0(z17);
                    pVar3 = pVar2;
                } else {
                    o0Var.C(-154225140);
                    pv0.y yVar = (pv0.y) p1Var5.getF182175a();
                    boolean zBooleanValue = ((Boolean) p1Var3.getF182175a()).booleanValue();
                    boolean zR4 = o0Var.r(b0Var2) | o0Var.B(r29) | ((r8 & 3670016) == 1048576 ? z16 : z17);
                    Object objQ14 = o0Var.q();
                    if (zR4 || objQ14 == p3.m.a.f135155b) {
                        pVar3 = pVar2;
                        objQ14 = new e11.f0(b0Var2, pVar3, r29);
                        o0Var.K(objQ14);
                    } else {
                        pVar3 = pVar2;
                    }
                    e23.p pVar4 = (e23.p) objQ14;
                    boolean zR5 = o0Var.r(b0Var2) | o0Var.B(r29);
                    Object objQ15 = o0Var.q();
                    if (zR5 || objQ15 == p3.m.a.f135155b) {
                        objQ15 = new cn1.t(b0Var2, r29, 8);
                        o0Var.K(objQ15);
                    }
                    e23.a aVar6 = (e23.a) objQ15;
                    boolean zR6 = o0Var.r(b0Var2) | o0Var.B(r29) | o0Var.B(p1Var13) | o0Var.r(hVar3);
                    if (i24 != 8388608) {
                        z16 = z17;
                    }
                    boolean z18 = zR6 | z16;
                    Object objQ16 = o0Var.q();
                    if (z18 || objQ16 == p3.m.a.f135155b) {
                        objQ16 = new et.p(b0Var2, r29, hVar3, qVar2, p1Var13, 12);
                        mcVar = r29;
                        o0Var.K(objQ16);
                    } else {
                        mcVar = mcVarF2;
                    }
                    c(hVar3, yVar, zBooleanValue, mcVar, pVar, pVar4, aVar6, (e23.p) objQ16, o0Var, pv0.h.f141372i | ((i18 >> 3) & 57344));
                    o0Var = o0Var;
                    Unit unit2 = Unit.INSTANCE;
                    o0Var.g0(z17);
                }
                o0Var.g0(z17);
            } else {
                pVar3 = pVar2;
                o0Var.C(-153194762);
                o0Var.g0(z17);
            }
            x1 x1Var2 = p3.n.f135158a;
        } else {
            pVar3 = pVar2;
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new gw0.f(oVar, qVar, z14, z15, dVar, pVar, pVar3, qVar2, aVar, aVar2, aVar3, lVar, i14, i15, 0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:49:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:54:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:59:0x0122  */
    /* JADX WARN: Code duplicated, block: B:64:0x013e  */
    /* JADX WARN: Code duplicated, block: B:69:0x015d  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void h(b63.o oVar, pv0.q qVar, u uVar, e23.l<? super b63.o, Unit> lVar, p3.m mVar, int i14) {
        int i15;
        oVar.getClass();
        uVar.getClass();
        lVar.getClass();
        o0 o0VarE = mVar.E(-1673496383);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.r(oVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= (i14 & 64) == 0 ? o0VarE.B(qVar) : o0VarE.r(qVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.r(uVar) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.r(lVar) ? 2048 : 1024;
        }
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            x1 x1Var = p3.n.f135158a;
            p1 p1VarC = s9.c.c(uVar.f79771l, o0VarE);
            p1 p1VarC2 = s9.c.c(uVar.f79780w, o0VarE);
            p1 p1VarC3 = s9.c.c(uVar.f79774o, o0VarE);
            boolean z14 = ((h0) p1VarC.getF182175a()).f79612d;
            boolean zBooleanValue = ((Boolean) p1VarC3.getF182175a()).booleanValue();
            i53.d dVarG = i53.a.g((Map) p1VarC2.getF182175a());
            boolean zR = o0VarE.r(uVar);
            Object objQ = o0VarE.q();
            p3.m.a aVar = p3.m.f135153a;
            if (zR) {
                objQ = new fp0.l(uVar, 8);
                o0VarE.K(objQ);
            } else {
                aVar.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new fp0.l(uVar, 8);
                    o0VarE.K(objQ);
                }
            }
            e23.p pVar = (e23.p) objQ;
            boolean zR2 = o0VarE.r(uVar) | o0VarE.r(oVar);
            Object objQ2 = o0VarE.q();
            int i16 = 6;
            if (zR2) {
                objQ2 = new g80.e(i16, uVar, oVar);
                o0VarE.K(objQ2);
            } else {
                aVar.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    objQ2 = new g80.e(i16, uVar, oVar);
                    o0VarE.K(objQ2);
                }
            }
            e23.p pVar2 = (e23.p) objQ2;
            boolean zR3 = o0VarE.r(uVar) | o0VarE.r(oVar);
            Object objQ3 = o0VarE.q();
            if (zR3) {
                objQ3 = new e11.c0(20, uVar, oVar);
                o0VarE.K(objQ3);
            } else {
                aVar.getClass();
                if (objQ3 == p3.m.a.f135155b) {
                    objQ3 = new e11.c0(20, uVar, oVar);
                    o0VarE.K(objQ3);
                }
            }
            e23.q qVar2 = (e23.q) objQ3;
            boolean zR4 = o0VarE.r(uVar) | o0VarE.r(oVar);
            Object objQ4 = o0VarE.q();
            if (zR4) {
                objQ4 = new gp.f(7, uVar, oVar);
                o0VarE.K(objQ4);
            } else {
                aVar.getClass();
                if (objQ4 == p3.m.a.f135155b) {
                    objQ4 = new gp.f(7, uVar, oVar);
                    o0VarE.K(objQ4);
                }
            }
            e23.a aVar2 = (e23.a) objQ4;
            boolean zR5 = o0VarE.r(uVar);
            Object objQ5 = o0VarE.q();
            if (zR5) {
                objQ5 = new gw0.h(uVar, 0);
                o0VarE.K(objQ5);
            } else {
                aVar.getClass();
                if (objQ5 == p3.m.a.f135155b) {
                    objQ5 = new gw0.h(uVar, 0);
                    o0VarE.K(objQ5);
                }
            }
            e23.a aVar3 = (e23.a) objQ5;
            boolean zR6 = o0VarE.r(uVar);
            Object objQ6 = o0VarE.q();
            if (zR6) {
                objQ6 = new gw0.h(uVar, 1);
                o0VarE.K(objQ6);
            } else {
                aVar.getClass();
                if (objQ6 == p3.m.a.f135155b) {
                    objQ6 = new gw0.h(uVar, 1);
                    o0VarE.K(objQ6);
                }
            }
            i(oVar, qVar, z14, zBooleanValue, dVarG, pVar, pVar2, qVar2, aVar2, aVar3, (e23.a) objQ6, lVar, o0VarE, (i15 & 14) | (pv0.q.f141403c << 3) | (i15 & 112), (i15 >> 6) & 112);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new q0(oVar, qVar, uVar, lVar, i14, 2);
        }
    }

    public static final void i(b63.o oVar, pv0.q qVar, boolean z14, boolean z15, i53.d<pv0.w, ? extends pv0.y> dVar, e23.p<? super pv0.w, ? super pv0.y, Unit> pVar, e23.p<? super pv0.h, ? super pv0.y, Unit> pVar2, e23.q<? super pv0.h, ? super pv0.s, ? super pv0.o, Unit> qVar2, e23.a<Unit> aVar, e23.a<Unit> aVar2, e23.a<Unit> aVar3, e23.l<? super b63.o, Unit> lVar, p3.m mVar, int i14, int i15) {
        int i16;
        boolean z16;
        i53.d<pv0.w, ? extends pv0.y> dVar2;
        e23.p<? super pv0.w, ? super pv0.y, Unit> pVar3;
        e23.p<? super pv0.h, ? super pv0.y, Unit> pVar4;
        e23.q<? super pv0.h, ? super pv0.s, ? super pv0.o, Unit> qVar3;
        e23.a<Unit> aVar4;
        int i17;
        List<pv0.h> list;
        o0 o0VarE = mVar.E(-1313900768);
        if ((i14 & 6) == 0) {
            i16 = (o0VarE.r(oVar) ? 4 : 2) | i14;
        } else {
            i16 = i14;
        }
        if ((i14 & 48) == 0) {
            i16 |= (i14 & 64) == 0 ? o0VarE.B(qVar) : o0VarE.r(qVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i16 |= o0VarE.h(z14) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            z16 = z15;
            i16 |= o0VarE.h(z16) ? 2048 : 1024;
        } else {
            z16 = z15;
        }
        if ((i14 & 24576) == 0) {
            dVar2 = dVar;
            i16 |= o0VarE.r(dVar2) ? 16384 : 8192;
        } else {
            dVar2 = dVar;
        }
        if ((196608 & i14) == 0) {
            pVar3 = pVar;
            i16 |= o0VarE.r(pVar3) ? 131072 : 65536;
        } else {
            pVar3 = pVar;
        }
        if ((1572864 & i14) == 0) {
            pVar4 = pVar2;
            i16 |= o0VarE.r(pVar4) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        } else {
            pVar4 = pVar2;
        }
        if ((12582912 & i14) == 0) {
            qVar3 = qVar2;
            i16 |= o0VarE.r(qVar3) ? 8388608 : 4194304;
        } else {
            qVar3 = qVar2;
        }
        if ((100663296 & i14) == 0) {
            aVar4 = aVar;
            i16 |= o0VarE.r(aVar4) ? 67108864 : 33554432;
        } else {
            aVar4 = aVar;
        }
        if ((i14 & C.ENCODING_PCM_32BIT) == 0) {
            i16 |= o0VarE.r(aVar2) ? 536870912 : 268435456;
        }
        if ((i15 & 6) == 0) {
            i17 = i15 | (o0VarE.r(aVar3) ? 4 : 2);
        } else {
            i17 = i15;
        }
        if ((i15 & 48) == 0) {
            i17 |= o0VarE.r(lVar) ? 32 : 16;
        }
        if (o0VarE.n(i16 & 1, ((i16 & 306783379) == 306783378 && (i17 & 19) == 18) ? false : true)) {
            x1 x1Var = p3.n.f135158a;
            if ((qVar == null || (list = qVar.f141405a) == null || !(list.isEmpty() ^ true)) ? false : true) {
                o0VarE.C(1914919075);
                g(oVar, qVar, z14, z16, dVar2, pVar3, pVar4, qVar3, aVar4, aVar2, aVar3, lVar, o0VarE, (i16 & 14) | (pv0.q.f141403c << 3) | (i16 & 112) | (i16 & 896) | (i16 & 7168) | (57344 & i16) | (458752 & i16) | (3670016 & i16) | (29360128 & i16) | (234881024 & i16) | (1879048192 & i16), i17 & 126);
                o0VarE = o0VarE;
                o0VarE.g0(false);
            } else {
                o0VarE.C(1915647916);
                h4.r.a aVar5 = h4.r.S;
                h4.r rVarB = a2.b(x2.d(aVar5, 1.0f), a2.a(o0VarE), true);
                c2.j.f22691a.getClass();
                c2.j.k kVar = c2.j.f22694d;
                h4.d.f81522a.getClass();
                c2.z zVarA = c2.y.a(kVar, h4.d.a.f81536n, o0VarE, 6);
                int iHashCode = Long.hashCode(o0VarE.U);
                i2 i2VarA0 = o0VarE.a0();
                h4.r rVarC = h4.k.c(rVarB, o0VarE);
                h5.g.V.getClass();
                h5.e0.a aVar6 = h5.g.a.f81805b;
                if (o0VarE.f135177b == null) {
                    p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar6);
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
                s62.a.f157643a.getClass();
                b82.n.c(u62.a.a(t62.a.f162797a), gl1.y.Q(o0VarE, R.string.common_no_data), gl1.y.Q(o0VarE, R.string.msg_lifestyle_logging_no_data), x2.x(aVar5, h4.d.a.f81533k, 2), null, o0VarE, 3072, 16);
                o0VarE.g0(true);
                o0VarE.g0(false);
            }
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new gw0.f(oVar, qVar, z14, z15, dVar, pVar, pVar2, qVar2, aVar, aVar2, aVar3, lVar, i14, i15, 1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v0, types: [p13.j0] */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object] */
    public static final void j(pv0.h hVar, String str, e23.a<Unit> aVar, e23.a<Unit> aVar2, e23.l<? super pv0.y, Unit> lVar, e23.l<? super pv0.s, Unit> lVar2, p3.m mVar, int i14) {
        Object obj;
        ?? arrayList;
        int i15;
        e23.l<? super pv0.s, Unit> lVar3 = lVar2;
        hVar.getClass();
        aVar2.getClass();
        lVar.getClass();
        lVar3.getClass();
        o0 o0VarE = mVar.E(1684788026);
        int i16 = (i14 & 6) == 0 ? ((i14 & 8) == 0 ? o0VarE.B(hVar) : o0VarE.r(hVar) ? 4 : 2) | i14 : i14;
        if ((i14 & 48) == 0) {
            i16 |= o0VarE.B(str) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i16 |= o0VarE.r(aVar) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            obj = aVar2;
            i16 |= o0VarE.r(obj) ? 2048 : 1024;
        } else {
            obj = aVar2;
        }
        if ((i14 & 24576) == 0) {
            i16 |= o0VarE.r(lVar) ? 16384 : 8192;
        }
        if ((i14 & 196608) == 0) {
            i16 |= o0VarE.r(lVar3) ? 131072 : 65536;
        }
        int i17 = i16;
        if (o0VarE.n(i17 & 1, (74899 & i17) != 74898)) {
            x1 x1Var = p3.n.f135158a;
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            if (objQ == p3.m.a.f135155b) {
                objQ = p0.n(Boolean.FALSE);
                o0VarE.K(objQ);
            }
            p1 p1Var = (p1) objQ;
            aw0.a aVar3 = new aw0.a(w2.a0.s(o0VarE));
            List<pv0.o> list = hVar.f141378e;
            if (list != null) {
                arrayList = new ArrayList();
                for (Object obj2 : list) {
                    pv0.o oVar = (pv0.o) obj2;
                    ow0.a.f134291a.getClass();
                    oVar.getClass();
                    Integer num = oVar.f141397c;
                    if (num != null && num.intValue() > 0) {
                        arrayList.add(obj2);
                    }
                }
            } else {
                arrayList = j0.f134944a;
            }
            pv0.s sVarB = pv0.j.b(hVar);
            Boolean boolValueOf = sVarB != null ? Boolean.valueOf(sVarB == pv0.s.YES) : null;
            int i18 = i17 & 458752;
            boolean z14 = ((i17 & 7168) == 2048) | ((i17 & 14) == 4 || ((i17 & 8) != 0 && o0VarE.r(hVar))) | (i18 == 131072);
            Object objQ2 = o0VarE.q();
            if (z14 || objQ2 == p3.m.a.f135155b) {
                i15 = 131072;
                ev2.f fVar = new ev2.f(hVar, lVar3, obj, p1Var, 7);
                o0VarE.K(fVar);
                objQ2 = fVar;
            } else {
                i15 = 131072;
            }
            int i19 = 3;
            lVar3 = lVar2;
            int i24 = i15;
            wv0.o.a(null, str, boolValueOf, aVar, (e23.l) objQ2, z3.f.c(-1482454954, new et.p((Object) arrayList, (Object) lVar, (Object) hVar, (e23.a) aVar2, (Object) aVar3, 13), o0VarE), o0VarE, (i17 & 112) | 196608 | ((i17 << 3) & 7168), 1);
            if (((Boolean) p1Var.getF182175a()).booleanValue()) {
                o0VarE.C(534793654);
                boolean z15 = i18 == i24;
                Object objQ3 = o0VarE.q();
                if (z15 || objQ3 == p3.m.a.f135155b) {
                    objQ3 = new v1(lVar3, p1Var, i19);
                    o0VarE.K(objQ3);
                }
                e23.a aVar4 = (e23.a) objQ3;
                Object objQ4 = o0VarE.q();
                if (objQ4 == p3.m.a.f135155b) {
                    objQ4 = new gp.e(p1Var, 15);
                    o0VarE.K(objQ4);
                }
                l(aVar4, (e23.a) objQ4, o0VarE, 48);
                o0VarE.g0(false);
            } else {
                o0VarE.C(535026216);
                o0VarE.g0(false);
            }
            x1 x1Var2 = p3.n.f135158a;
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a11.g0(hVar, str, aVar, aVar2, lVar, lVar3, i14);
        }
    }

    public static final void k(e23.a<Unit> aVar, e23.a<Unit> aVar2, p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(573201310);
        int i15 = i14 | (o0VarE.r(aVar) ? 4 : 2);
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            c1.f110940a.a(false, gl1.y.Q(o0VarE, R.string.lbl_change_logging_selection), gl1.y.Q(o0VarE, R.string.msg_reset_logging_selection), null, null, gl1.y.Q(o0VarE, R.string.lbl_common_continue), false, false, aVar, gl1.y.Q(o0VarE, R.string.lbl_cancel), aVar2, o0VarE, ((i15 << 24) & 234881024) | 6, 6, 216);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new at1.f(aVar, aVar2, i14, 15);
        }
    }

    public static final void l(e23.a<Unit> aVar, e23.a<Unit> aVar2, p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(-853399417);
        int i15 = i14 | (o0VarE.r(aVar) ? 4 : 2);
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            c1.f110940a.a(false, gl1.y.Q(o0VarE, R.string.lbl_change_logging_selection), gl1.y.Q(o0VarE, R.string.msg_change_logging_selection), null, null, gl1.y.Q(o0VarE, R.string.lbl_common_continue), false, false, aVar, gl1.y.Q(o0VarE, R.string.lbl_cancel), aVar2, o0VarE, ((i15 << 24) & 234881024) | 6, 6, 216);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new at1.f(aVar, aVar2, i14, 16);
        }
    }

    public static final void m(mc mcVar, o53.b0 b0Var) {
        if (az0.b.a()) {
            ge1.b.T(b0Var, null, null, new gw0.o(mcVar, null), 3);
        }
    }

    public static final i53.c<pv0.h> n(i53.c<pv0.h> cVar, Long l14, pv0.s sVar, pv0.o oVar) {
        ArrayList arrayList = new ArrayList(p13.y.r(cVar, 10));
        for (pv0.h hVarO : cVar) {
            if (p005kotlin.jvm.internal.s.g(hVarO.f141374a, l14)) {
                hVarO = ge1.b.O(hVarO, sVar, oVar);
            }
            arrayList.add(hVarO);
        }
        return i53.a.e(arrayList);
    }
}
