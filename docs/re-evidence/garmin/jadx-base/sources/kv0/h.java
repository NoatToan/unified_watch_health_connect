package kv0;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.Toast;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.v1;
import c.w;
import c2.x2;
import c2.z;
import c22.s3;
import c80.s0;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.g3;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import dv0.u;
import gl1.y;
import h5.e0;
import i3.e5;
import i3.fe;
import iv0.v;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import l72.c1;
import l72.p2;
import lc.u0;
import o13.r;
import o53.b0;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p13.j0;
import p3.b4;
import p3.i2;
import p3.l0;
import p3.n1;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.x1;
import p3.x3;
import r22.q0;
import u1.a2;
import wd2.g2;
import wd2.m1;
import wd2.z1;
import zd0.g1;

/* JADX INFO: loaded from: classes9.dex */
public final class h {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.livetrackui.presentation.status.LiveTrackEnabledScreenKt$LiveTrackEnabledScreen$1$1", f = "LiveTrackEnabledScreen.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ gv0.d f106638a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ x3<g3<List<qu0.e>>> f106639b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ p1<Boolean> f106640c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ n1 f106641d;

        /* JADX INFO: renamed from: kv0.h$a$a, reason: collision with other inner class name */
        public static final /* synthetic */ class C2058a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f106642a;

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
                f106642a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(gv0.d dVar, x3<? extends g3<? extends List<qu0.e>>> x3Var, p1<Boolean> p1Var, n1 n1Var, t13.d<? super a> dVar2) {
            super(2, dVar2);
            this.f106638a = dVar;
            this.f106639b = x3Var;
            this.f106640c = p1Var;
            this.f106641d = n1Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f106638a, this.f106639b, this.f106640c, this.f106641d, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            int i14 = C2058a.f106642a[this.f106639b.getF182175a().f35300a.ordinal()];
            p1<Boolean> p1Var = this.f106640c;
            if (i14 == 1) {
                h.b(p1Var, true);
            } else if (i14 == 2) {
                h.b(p1Var, false);
                this.f106641d.t(this.f106638a.D4());
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.livetrackui.presentation.status.LiveTrackEnabledScreenKt$LiveTrackEnabledScreen$2$1", f = "LiveTrackEnabledScreen.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ x3<g3<List<ev0.b>>> f106643a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Context f106644b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ p1<Boolean> f106645c;

        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f106646a;

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
                f106646a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(x3<? extends g3<? extends List<ev0.b>>> x3Var, Context context, p1<Boolean> p1Var, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f106643a = x3Var;
            this.f106644b = context;
            this.f106645c = p1Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new b(this.f106643a, this.f106644b, this.f106645c, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            int i14 = a.f106646a[this.f106643a.getF182175a().f35300a.ordinal()];
            p1<Boolean> p1Var = this.f106645c;
            if (i14 == 1) {
                h.b(p1Var, true);
            } else if (i14 == 2) {
                h.b(p1Var, false);
            } else {
                if (i14 != 3) {
                    u0.r();
                    return null;
                }
                h.b(p1Var, false);
                Toast.makeText(this.f106644b, R.string.txt_error_occurred, 0).show();
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.livetrackui.presentation.status.LiveTrackEnabledScreenKt$LiveTrackEnabledScreen$3$1", f = "LiveTrackEnabledScreen.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class c extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f106647a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ View f106648b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Activity f106649c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ j f106650d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ x3<i> f106651e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ p1<Boolean> f106652f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ p1<lv0.a> f106653g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(Context context, View view2, Activity activity, j jVar, x3<? extends i> x3Var, p1<Boolean> p1Var, p1<lv0.a> p1Var2, t13.d<? super c> dVar) {
            super(2, dVar);
            this.f106647a = context;
            this.f106648b = view2;
            this.f106649c = activity;
            this.f106650d = jVar;
            this.f106651e = x3Var;
            this.f106652f = p1Var;
            this.f106653g = p1Var2;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new c(this.f106647a, this.f106648b, this.f106649c, this.f106650d, this.f106651e, this.f106652f, this.f106653g, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            i f182175a = this.f106651e.getF182175a();
            boolean z14 = f182175a instanceof i.e;
            p1<Boolean> p1Var = this.f106652f;
            j jVar = this.f106650d;
            Context context = this.f106647a;
            if (z14) {
                h.b(p1Var, false);
                String string = context.getString(R.string.msg_livetrack_session_active);
                string.getClass();
                q0.b.c(q0.f149800b, this.f106648b, string, oi0.c.A(context, new kn1.m(10), string), 8).show();
                Activity activity = this.f106649c;
                if (activity != null) {
                    activity.invalidateOptionsMenu();
                }
                jVar.C4(null);
            } else {
                boolean z15 = f182175a instanceof i.a;
                p1<lv0.a> p1Var2 = this.f106653g;
                if (z15) {
                    h.b(p1Var, false);
                    String string2 = context.getString(R.string.find_my_watch_device_not_connected_title);
                    string2.getClass();
                    String string3 = context.getString(R.string.msg_device_must_be_connected, ((i.a) f182175a).f106655a.f66142c);
                    string3.getClass();
                    p1Var2.setValue(new lv0.a.b(string2, string3));
                    jVar.C4(null);
                } else if (f182175a instanceof i.h) {
                    h.b(p1Var, false);
                    String string4 = context.getString(R.string.live_track_config_dialog_title_start_without_device_a);
                    string4.getClass();
                    String string5 = context.getString(R.string.live_track_config_dialog_start_without_device_a);
                    String string6 = context.getString(R.string.lbl_start);
                    string6.getClass();
                    p1Var2.setValue(new lv0.a.C2188a(string4, string5, string6, new k11.h(16, jVar, (i.h) f182175a)));
                    jVar.C4(null);
                } else if (f182175a instanceof i.g) {
                    h.b(p1Var, false);
                    String string7 = context.getString(R.string.lbl_auto_start_enabled);
                    string7.getClass();
                    String string8 = context.getString(R.string.msg_start_activity_to_begin_sharing, ((i.g) f182175a).f106661a.f66142c);
                    string8.getClass();
                    p1Var2.setValue(new lv0.a.b(string7, string8));
                    jVar.C4(null);
                } else if (f182175a instanceof i.c) {
                    h.b(p1Var, false);
                    String string9 = context.getString(R.string.lbl_sharing_required);
                    string9.getClass();
                    String string10 = context.getString(R.string.msg_auto_start_sharing_options);
                    String string11 = context.getString(R.string.lbl_settings);
                    string11.getClass();
                    p1Var2.setValue(new lv0.a.C2188a(string9, string10, string11, new ho0.a(context, 25)));
                    jVar.C4(null);
                } else if (f182175a instanceof i.b) {
                    h.b(p1Var, false);
                    String string12 = context.getString(R.string.lbl_sharing_required);
                    string12.getClass();
                    String string13 = context.getString(R.string.msg_auto_start_requires_sharing_friends);
                    String string14 = context.getString(R.string.lbl_settings);
                    string14.getClass();
                    p1Var2.setValue(new lv0.a.C2188a(string12, string13, string14, new ho0.a(context, 26)));
                    jVar.C4(null);
                } else if (f182175a instanceof i.d) {
                    h.b(p1Var, false);
                    jVar.C4(null);
                } else if (f182175a instanceof i.f) {
                    h.b(p1Var, false);
                    context.startActivity(Intent.createChooser(y.w(((i.f) f182175a).f106660a), null));
                    jVar.C4(null);
                } else if (f182175a != null) {
                    u0.r();
                    return null;
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final /* synthetic */ class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f106654a;

        static {
            int[] iArr = new int[yu0.a.values().length];
            try {
                iArr[yu0.a.SUBSCRIPTION_EXPIRED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[yu0.a.SUBSCRIPTION_EXPIRING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f106654a = iArr;
        }
    }

    /* JADX WARN: Code duplicated, block: B:68:0x016d  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v73 */
    /* JADX WARN: Type inference failed for: r0v77 */
    /* JADX WARN: Type inference failed for: r0v78, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v89 */
    /* JADX WARN: Type inference failed for: r6v22 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5, types: [e23.a, java.lang.Object, org.koin.core.qualifier.Qualifier, t13.d] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final void a(final yu0.f fVar, gv0.d dVar, final j jVar, e23.a<Unit> aVar, e23.a<Unit> aVar2, final e23.l<? super Long, Unit> lVar, final e23.a<Unit> aVar3, final e23.a<Unit> aVar4, final e23.a<Unit> aVar5, e23.a<Unit> aVar6, p3.m mVar, int i14) {
        o0 o0Var;
        boolean z14;
        gv0.d dVar2;
        p1 p1Var;
        ?? r14;
        g3 g3Var;
        n1 n1Var;
        i iVar;
        Context context;
        p1 p1Var2;
        final p1 p1Var3;
        ?? r15;
        o0 o0Var2;
        boolean z15;
        i53.c cVarL;
        fVar.getClass();
        dVar.getClass();
        jVar.getClass();
        aVar.getClass();
        aVar2.getClass();
        lVar.getClass();
        aVar3.getClass();
        aVar4.getClass();
        aVar5.getClass();
        aVar6.getClass();
        o0 o0VarE = mVar.E(116145780);
        int i15 = i14 | (o0VarE.r(fVar) ? 4 : 2) | (o0VarE.r(dVar) ? 32 : 16) | (o0VarE.r(jVar) ? 256 : 128) | (o0VarE.r(aVar) ? 2048 : 1024) | (o0VarE.r(aVar2) ? 16384 : 8192) | (o0VarE.r(lVar) ? 131072 : 65536) | (o0VarE.r(aVar3) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288) | (o0VarE.r(aVar4) ? 8388608 : 4194304) | (o0VarE.r(aVar5) ? 67108864 : 33554432) | (o0VarE.r(aVar6) ? 536870912 : 268435456);
        if (o0VarE.n(i15 & 1, (306783379 & i15) != 306783378)) {
            x1 x1Var = p3.n.f135158a;
            boolean zC5 = dVar.c5();
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            Object obj = p3.m.a.f135155b;
            if (objQ == obj) {
                objQ = Boolean.valueOf(s3.b());
                o0VarE.K(objQ);
            }
            boolean zBooleanValue = ((Boolean) objQ).booleanValue();
            Activity activity = (Activity) o0VarE.A(c.n.f22332a);
            Context context2 = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            View view2 = (View) o0VarE.A(AndroidCompositionLocals_androidKt.f6046f);
            Object objQ2 = o0VarE.q();
            if (objQ2 == obj) {
                objQ2 = p0.n(Boolean.FALSE);
                o0VarE.K(objQ2);
            }
            p1 p1Var4 = (p1) objQ2;
            final p1 p1VarC = s9.c.c(fVar.f199714l, o0VarE);
            r53.i<az0.c.a> iVar2 = fVar.f199709g;
            az0.c.a aVar7 = az0.c.a.Available;
            p1 p1VarB = s9.c.b(iVar2, aVar7, o0VarE, 48);
            final p1 p1VarC2 = s9.c.c(fVar.f199712j, o0VarE);
            p1 p1VarC3 = s9.c.c(dVar.f79204w, o0VarE);
            ou0.f fVar2 = (ou0.f) ((g3) p1VarC3.getF182175a()).f35301b;
            if (s.g(fVar2 != null ? fVar2.f133984b : null, ou0.b.C2540b.f133962a)) {
                z14 = true;
            } else {
                ou0.f fVar3 = (ou0.f) ((g3) p1VarC3.getF182175a()).f35301b;
                if (s.g(fVar3 != null ? fVar3.f133984b : null, ou0.b.a.f133961a)) {
                    z14 = true;
                } else {
                    z14 = false;
                }
            }
            ou0.f fVar4 = (ou0.f) ((g3) p1VarC3.getF182175a()).f35301b;
            final boolean zG = s.g(fVar4 != null ? fVar4.f133985c : null, g2.b.f184481a);
            ou0.f fVar5 = (ou0.f) ((g3) p1VarC3.getF182175a()).f35301b;
            boolean zG2 = fVar5 != null ? s.g(fVar5.f133983a, Boolean.TRUE) : false;
            p1 p1VarC4 = s9.c.c(jVar.f106674k, o0VarE);
            p1 p1VarC5 = s9.c.c(dVar.K0, o0VarE);
            Object objQ3 = o0VarE.q();
            if (objQ3 == obj) {
                objQ3 = e5.o(0, o0VarE);
            }
            n1 n1Var2 = (n1) objQ3;
            g3 g3Var2 = (g3) p1VarC2.getF182175a();
            g3 g3Var3 = (g3) p1VarC5.getF182175a();
            boolean zB = o0VarE.B(p1VarC5) | o0VarE.r(dVar);
            Object objQ4 = o0VarE.q();
            if (zB || objQ4 == obj) {
                dVar2 = dVar;
                p1Var = p1Var4;
                r14 = 0;
                g3Var = g3Var3;
                objQ4 = new a(dVar2, p1VarC5, p1Var, n1Var2, null);
                n1Var = n1Var2;
                o0VarE.K(objQ4);
            } else {
                n1Var = n1Var2;
                dVar2 = dVar;
                p1Var = p1Var4;
                r14 = 0;
                g3Var = g3Var3;
            }
            g3.a aVar8 = g3.f35298f;
            l0.f(g3Var2, g3Var, (e23.p) objQ4, o0VarE);
            p1 p1VarC6 = s9.c.c(jVar.f106675l, o0VarE);
            g3 g3Var4 = (g3) p1VarC6.getF182175a();
            boolean zB2 = o0VarE.B(p1VarC6) | o0VarE.r(context2);
            Object objQ5 = o0VarE.q();
            if (zB2 || objQ5 == obj) {
                objQ5 = new b(p1VarC6, context2, p1Var, r14);
                o0VarE.K(objQ5);
            }
            l0.e((e23.p) objQ5, g3Var4, o0VarE);
            List list = (List) ((g3) p1VarC6.getF182175a()).f35301b;
            if (list == null) {
                list = j0.f134944a;
            }
            final List list2 = list;
            boolean z16 = ((az0.c.a) p1VarB.getF182175a()) != aVar7;
            final yu0.d dVar3 = (yu0.d) KoinJavaComponent.get$default(yu0.d.class, r14, r14, 6, r14);
            final com.garmin.android.library.livetrack.b bVar = (com.garmin.android.library.livetrack.b) KoinJavaComponent.get$default(com.garmin.android.library.livetrack.b.class, r14, r14, 6, r14);
            final g1 g1Var = (g1) KoinJavaComponent.get$default(g1.class, r14, r14, 6, r14);
            final ub1.g gVar = (ub1.g) KoinJavaComponent.get$default(ub1.g.class, r14, r14, 6, r14);
            g.h hVar = new g.h();
            boolean zR = o0VarE.r(dVar2);
            Object objQ6 = o0VarE.q();
            if (zR || objQ6 == obj) {
                objQ6 = new bv0.n(dVar2, 20);
                o0VarE.K(objQ6);
            }
            c.q qVarC = w.c(hVar, (e23.l) objQ6, o0VarE, 0);
            g.h hVar2 = new g.h();
            boolean zR2 = o0VarE.r(fVar);
            Object objQ7 = o0VarE.q();
            if (zR2 || objQ7 == obj) {
                objQ7 = new dv0.d(fVar, 3);
                o0VarE.K(objQ7);
            }
            final c.q qVarC2 = w.c(hVar2, (e23.l) objQ7, o0VarE, 0);
            Object objQ8 = o0VarE.q();
            if (objQ8 == obj) {
                objQ8 = p0.n(lv0.a.c.f115044a);
                o0VarE.K(objQ8);
            }
            p1 p1Var5 = (p1) objQ8;
            i iVar3 = (i) p1VarC4.getF182175a();
            boolean zB3 = o0VarE.B(p1VarC4) | o0VarE.r(context2) | o0VarE.r(r18) | o0VarE.r(activity) | o0VarE.r(jVar);
            Object objQ9 = o0VarE.q();
            if (zB3 || objQ9 == obj) {
                p1 p1Var6 = p1Var;
                iVar = iVar3;
                objQ9 = new c(context2, view2, activity, jVar, p1VarC4, p1Var6, p1Var5, null);
                context = context2;
                p1Var2 = p1Var6;
                p1Var3 = p1Var5;
                o0VarE.K(objQ9);
            } else {
                p1Var2 = p1Var;
                context = context2;
                iVar = iVar3;
                p1Var3 = p1Var5;
            }
            l0.e((e23.p) objQ9, iVar, o0VarE);
            Object obj2 = (lv0.a) p1Var3.getF182175a();
            if (obj2 instanceof lv0.a.c) {
                o0VarE.C(-1636791380);
                o0VarE.g0(false);
                r15 = 0;
                o0Var2 = o0VarE;
            } else if (obj2 instanceof lv0.a.b) {
                o0VarE.C(-1636747329);
                c1 c1Var = c1.f110940a;
                lv0.a.b bVar2 = (lv0.a.b) obj2;
                String str = bVar2.f115042a;
                String str2 = bVar2.f115043b;
                String strQ = y.Q(o0VarE, R.string.lbl_ok);
                Object objQ10 = o0VarE.q();
                if (objQ10 == obj) {
                    objQ10 = new kb0.k(p1Var3, 16);
                    o0VarE.K(objQ10);
                }
                e23.a<Unit> aVar9 = (e23.a) objQ10;
                Object objQ11 = o0VarE.q();
                if (objQ11 == obj) {
                    objQ11 = new kb0.k(p1Var3, 17);
                    o0VarE.K(objQ11);
                }
                c1Var.a(false, str, str2, null, null, strQ, false, false, aVar9, null, (e23.a) objQ11, o0VarE, 100663296, 6, 729);
                r15 = 0;
                o0VarE.g0(false);
                o0Var2 = o0VarE;
            } else {
                if (!(obj2 instanceof lv0.a.C2188a)) {
                    throw kg.f.h(o0VarE, -52800816, false);
                }
                o0VarE.C(-1636374771);
                c1 c1Var2 = c1.f110940a;
                lv0.a.C2188a c2188a = (lv0.a.C2188a) obj2;
                String str3 = c2188a.f115038a;
                String str4 = c2188a.f115039b;
                String str5 = c2188a.f115040c;
                boolean zR3 = o0VarE.r(obj2);
                Object objQ12 = o0VarE.q();
                if (zR3 || objQ12 == obj) {
                    objQ12 = new v(c2188a, p1Var3, 1);
                    o0VarE.K(objQ12);
                }
                e23.a<Unit> aVar10 = (e23.a) objQ12;
                String strQ2 = y.Q(o0VarE, R.string.lbl_cancel);
                Object objQ13 = o0VarE.q();
                if (objQ13 == obj) {
                    objQ13 = new kb0.k(p1Var3, 18);
                    o0VarE.K(objQ13);
                }
                c1Var2.a(false, str3, str4, null, null, str5, false, false, aVar10, strQ2, (e23.a) objQ13, o0VarE, 0, 6, 217);
                o0 o0Var3 = o0VarE;
                r15 = 0;
                o0Var3.g0(false);
                o0Var2 = o0Var3;
            }
            String strQ3 = y.Q(o0Var2, R.string.title_live_track);
            boolean zBooleanValue2 = ((Boolean) p1Var2.getF182175a()).booleanValue();
            if (zBooleanValue) {
                o0Var2.C(-52764605);
                z15 = true;
                cVarL = gl1.d.l(r15, o0Var2, 1);
            } else {
                z15 = true;
                o0Var2.C(-52763917);
                cVarL = gl1.d.l(zC5, o0Var2, r15);
            }
            o0Var2.g0(r15);
            i53.c cVar = cVarL;
            boolean zR4 = o0Var2.r(dVar2) | o0Var2.r(qVarC) | o0Var2.r(context) | ((r17 & 7168) == 2048 ? z15 : false);
            if ((57344 & r17) != 16384) {
                z15 = false;
            }
            boolean z17 = zR4 | z15;
            Object objQ14 = o0Var2.q();
            if (z17 || objQ14 == obj) {
                Object u0Var = new gv0.u0(aVar, aVar2, qVarC, context, zBooleanValue, dVar2, 1);
                o0Var2.K(u0Var);
                objQ14 = u0Var;
            }
            e23.l lVar2 = (e23.l) objQ14;
            final Context context3 = context;
            final p1 p1Var7 = p1Var2;
            o0 o0Var4 = o0Var2;
            final boolean z18 = z14;
            final boolean z19 = zG2;
            final n1 n1Var3 = n1Var;
            final boolean z24 = z16;
            gl1.d.b(strQ3, aVar6, zBooleanValue2, cVar, null, lVar2, z3.f.c(-1732870490, new e23.q() { // from class: kv0.g
                /* JADX WARN: Code duplicated, block: B:104:0x03d8  */
                /* JADX WARN: Code duplicated, block: B:106:0x03f5  */
                /* JADX WARN: Code duplicated, block: B:117:0x045b  */
                /* JADX WARN: Code duplicated, block: B:124:0x0479  */
                /* JADX WARN: Code duplicated, block: B:129:0x0495  */
                /* JADX WARN: Code duplicated, block: B:136:0x04b4  */
                /* JADX WARN: Code duplicated, block: B:141:0x04d1  */
                /* JADX WARN: Code duplicated, block: B:146:0x04f3  */
                /* JADX WARN: Code duplicated, block: B:153:0x051e  */
                /* JADX WARN: Code duplicated, block: B:158:0x0539  */
                /* JADX WARN: Code duplicated, block: B:25:0x0104  */
                /* JADX WARN: Code duplicated, block: B:39:0x01c4  */
                /* JADX WARN: Code duplicated, block: B:56:0x0270  */
                /* JADX WARN: Code duplicated, block: B:62:0x02d2  */
                /* JADX WARN: Code duplicated, block: B:86:0x0363  */
                /* JADX WARN: Code duplicated, block: B:88:0x0375  */
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r5v18 */
                /* JADX WARN: Type inference failed for: r5v19 */
                /* JADX WARN: Type inference failed for: r5v42 */
                /* JADX WARN: Type inference fix 'apply assigned field type' failed
                java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
                	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                 */
                @Override // e23.q
                public final Object invoke(Object obj3, Object obj4, Object obj5) {
                    boolean z25;
                    Context context4;
                    int i16;
                    p1 p1Var8;
                    e23.l lVar3;
                    j jVar2;
                    Context context5;
                    p3.m mVar2;
                    Context context6;
                    final int i17;
                    ?? r16;
                    final int i18;
                    final int i19;
                    p1 p1Var9;
                    final int i24;
                    String str6;
                    boolean zG3;
                    l72.s sVar;
                    p3.m mVar3 = (p3.m) obj4;
                    int iIntValue = ((Integer) obj5).intValue();
                    ((fe) obj3).getClass();
                    if (mVar3.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                        x1 x1Var2 = p3.n.f135158a;
                        h4.r.a aVar11 = h4.r.S;
                        h4.r rVarB = a2.b(aVar11, a2.a(mVar3), true);
                        c2.j.f22691a.getClass();
                        c2.j.k kVar = c2.j.f22694d;
                        h4.d.f81522a.getClass();
                        z zVarA = c2.y.a(kVar, h4.d.a.f81536n, mVar3, 0);
                        int iHashCode = Long.hashCode(mVar3.getU());
                        i2 i2VarX = mVar3.x();
                        h4.r rVarC = h4.k.c(rVarB, mVar3);
                        h5.g.V.getClass();
                        e0.a aVar12 = h5.g.a.f81805b;
                        if (mVar3.F() == null) {
                            p0.l();
                            throw null;
                        }
                        mVar3.z();
                        if (mVar3.getT()) {
                            mVar3.M(aVar12);
                        } else {
                            mVar3.c();
                        }
                        b4.c(h5.g.a.f81810g, zVarA, mVar3);
                        b4.c(h5.g.a.f81809f, i2VarX, mVar3);
                        h5.g.a.b bVar3 = h5.g.a.f81813j;
                        if (mVar3.getT() || !s.g(mVar3.q(), Integer.valueOf(iHashCode))) {
                            v.h.z(iHashCode, mVar3, iHashCode, bVar3);
                        }
                        b4.c(h5.g.a.f81807d, rVarC, mVar3);
                        c2.b0 b0Var = c2.b0.f22601a;
                        mVar3.C(1946733844);
                        yu0.b bVar4 = (yu0.b) p1VarC.getF182175a();
                        boolean z26 = bVar4 instanceof yu0.b.C3736b;
                        Context context7 = context3;
                        boolean z27 = z24;
                        p3.m.a aVar13 = p3.m.f135153a;
                        if (z26) {
                            mVar3.C(-733452998);
                            l72.s sVar2 = l72.s.f111232a;
                            d92.b.f58623a.getClass();
                            d92.b.f58625c.getClass();
                            h4.r rVarY = c2.l.y(aVar11, j92.b.f97899b.f97920e);
                            boolean z28 = !z27;
                            yu0.b.C3736b c3736b = (yu0.b.C3736b) bVar4;
                            yu0.a aVar14 = c3736b.f199692a;
                            String strQ4 = y.Q(mVar3, aVar14.f199688a);
                            String strQ5 = y.Q(mVar3, aVar14.f199689b);
                            String strQ6 = y.Q(mVar3, aVar14.f199690c);
                            yu0.f fVar6 = fVar;
                            boolean zR5 = mVar3.r(fVar6) | mVar3.B(bVar4);
                            Object objQ15 = mVar3.q();
                            if (zR5) {
                                objQ15 = new k11.h(15, fVar6, c3736b);
                                mVar3.K(objQ15);
                            } else {
                                aVar13.getClass();
                                if (objQ15 == p3.m.a.f135155b) {
                                    objQ15 = new k11.h(15, fVar6, c3736b);
                                    mVar3.K(objQ15);
                                }
                            }
                            e23.a aVar15 = (e23.a) objQ15;
                            boolean zB4 = mVar3.B(bVar4);
                            com.garmin.android.library.livetrack.b bVar5 = bVar;
                            boolean zR6 = zB4 | mVar3.r(bVar5);
                            e23.a aVar16 = aVar5;
                            boolean zB5 = zR6 | mVar3.B(aVar16);
                            c.q qVar = qVarC2;
                            boolean zR7 = zB5 | mVar3.r(qVar);
                            ub1.g gVar2 = gVar;
                            boolean zR8 = zR7 | mVar3.r(gVar2) | mVar3.r(context7);
                            Object objQ16 = mVar3.q();
                            if (zR8) {
                                sVar = sVar2;
                            } else {
                                aVar13.getClass();
                                sVar = sVar2;
                                if (objQ16 == p3.m.a.f135155b) {
                                }
                                z25 = z27;
                                context4 = context7;
                                i16 = 0;
                                sVar.c(rVarY, null, null, null, strQ4, strQ5, strQ6, z28, aVar15, (e23.a) objQ16, mVar3, 0, 0, 142);
                                mVar3.f();
                            }
                            ck0.j jVar3 = new ck0.j(c3736b, bVar5, aVar16, qVar, gVar2, context7);
                            context7 = context7;
                            mVar3.K(jVar3);
                            objQ16 = jVar3;
                            z25 = z27;
                            context4 = context7;
                            i16 = 0;
                            sVar.c(rVarY, null, null, null, strQ4, strQ5, strQ6, z28, aVar15, (e23.a) objQ16, mVar3, 0, 0, 142);
                            mVar3.f();
                        } else {
                            z25 = z27;
                            context4 = context7;
                            i16 = 0;
                            mVar3.C(-732285786);
                            mVar3.f();
                        }
                        Unit unit = Unit.INSTANCE;
                        mVar3.f();
                        d92.b.f58623a.getClass();
                        d92.b.f58625c.getClass();
                        j92.e eVar = j92.b.f97899b;
                        c2.l.f(x2.h(aVar11, eVar.f97920e), mVar3);
                        j jVar4 = jVar;
                        Context context8 = context4;
                        boolean zR9 = mVar3.r(jVar4) | mVar3.r(context8);
                        Object objQ17 = mVar3.q();
                        p1 p1Var10 = p1Var3;
                        if (zR9) {
                            objQ17 = new k62.k(jVar4, 8, context8, p1Var10);
                            mVar3.K(objQ17);
                        } else {
                            aVar13.getClass();
                            if (objQ17 == p3.m.a.f135155b) {
                                objQ17 = new k62.k(jVar4, 8, context8, p1Var10);
                                mVar3.K(objQ17);
                            }
                        }
                        e23.l lVar4 = (e23.l) objQ17;
                        int intValue = n1Var3.getIntValue();
                        yu0.d dVar4 = dVar3;
                        l22.a aVar17 = dVar4.f199699b;
                        StringBuilder sb3 = new StringBuilder();
                        if (!z19) {
                            intValue = 0;
                        }
                        sb3.append(dVar4.f199699b.c(R.plurals.lbl_recipient_count, intValue, Integer.valueOf(intValue)));
                        sb3.append(", ");
                        if (z18) {
                            sb3.append(aVar17.getString(R.string.lbl_grouptrack));
                            sb3.append(", ");
                        }
                        if (zG) {
                            sb3.append(aVar17.getString(R.string.lbl_feature_tour_strava_beacon));
                        }
                        String strL0 = d53.w.l0(d53.w.i0(sb3.toString()).toString(), CoreConstants.COMMA_CHAR);
                        int length = strL0.length();
                        e23.a aVar18 = aVar3;
                        if (length == 0) {
                            mVar3.C(221288951);
                            p2 p2Var = p2.f111205a;
                            h4.r rVarF = x2.f(aVar11, 1.0f);
                            String strQ7 = y.Q(mVar3, R.string.lbl_sharing_settings);
                            boolean z29 = !z25;
                            boolean zB6 = mVar3.B(lVar4) | mVar3.B(aVar18);
                            Object objQ18 = mVar3.q();
                            if (zB6) {
                                objQ18 = new i51.e(1, aVar18, lVar4);
                                mVar3.K(objQ18);
                            } else {
                                aVar13.getClass();
                                if (objQ18 == p3.m.a.f135155b) {
                                    objQ18 = new i51.e(1, aVar18, lVar4);
                                    mVar3.K(objQ18);
                                }
                            }
                            p1Var8 = p1Var10;
                            p2Var.g(strQ7, rVarF, null, null, null, z29, false, (e23.a) objQ18, mVar3, 48, 220);
                            mVar2 = mVar3;
                            mVar2.f();
                            context5 = context8;
                            jVar2 = jVar4;
                            lVar3 = lVar4;
                        } else {
                            p1Var8 = p1Var10;
                            mVar3.C(221604872);
                            p2 p2Var2 = p2.f111205a;
                            h4.r rVarF2 = x2.f(aVar11, 1.0f);
                            boolean z34 = !z25;
                            String strQ8 = y.Q(mVar3, R.string.lbl_sharing_settings);
                            boolean zB7 = mVar3.B(lVar4) | mVar3.B(aVar18);
                            Object objQ19 = mVar3.q();
                            if (zB7) {
                                objQ19 = new i51.e(2, aVar18, lVar4);
                                mVar3.K(objQ19);
                            } else {
                                aVar13.getClass();
                                if (objQ19 == p3.m.a.f135155b) {
                                    objQ19 = new i51.e(2, aVar18, lVar4);
                                    mVar3.K(objQ19);
                                }
                            }
                            lVar3 = lVar4;
                            jVar2 = jVar4;
                            context5 = context8;
                            p2Var2.h(strQ8, strL0, null, rVarF2, null, z34, false, null, null, null, (e23.a) objQ19, mVar3, 3072, i16, 980);
                            mVar2 = mVar3;
                            mVar2.f();
                        }
                        p1 p1Var11 = p1VarC2;
                        ev0.c cVar2 = (ev0.c) ((g3) p1Var11.getF182175a()).f35301b;
                        if (cVar2 != null ? s.g(cVar2.f66152a, Boolean.TRUE) : false) {
                            ev0.c cVar3 = (ev0.c) ((g3) p1Var11.getF182175a()).f35301b;
                            String str7 = cVar3 != null ? cVar3.f66155d : null;
                            if (str7 == null || str7.length() == 0) {
                                mVar2.C(222058526);
                                boolean z35 = !z25;
                                context6 = context5;
                                boolean zB8 = mVar2.B(lVar3) | mVar2.r(context6);
                                Object objQ20 = mVar2.q();
                                if (zB8) {
                                    i17 = 0;
                                    objQ20 = new e(0, context6, lVar3);
                                    mVar2.K(objQ20);
                                } else {
                                    aVar13.getClass();
                                    if (objQ20 == p3.m.a.f135155b) {
                                        i17 = 0;
                                        objQ20 = new e(0, context6, lVar3);
                                        mVar2.K(objQ20);
                                    } else {
                                        i17 = 0;
                                    }
                                }
                                u.a(z35, (e23.a) objQ20, mVar2, i17);
                                mVar2.f();
                            } else {
                                context6 = context5;
                                i17 = 0;
                                mVar2.C(222496742);
                                mVar2.f();
                            }
                        } else {
                            context6 = context5;
                            i17 = 0;
                            mVar2.C(222496742);
                            mVar2.f();
                        }
                        ev0.c cVar4 = (ev0.c) ((g3) p1Var11.getF182175a()).f35301b;
                        if (cVar4 != null) {
                            zG3 = s.g(cVar4.f66152a, Boolean.TRUE);
                        } else {
                            r16 = i17;
                        }
                        if (r16 == 0) {
                            r16 = zG3;
                            mVar2.C(222911398);
                            mVar2.f();
                        } else {
                            ev0.c cVar5 = (ev0.c) ((g3) p1Var11.getF182175a()).f35301b;
                            if (cVar5 != null) {
                                r16 = zG3;
                                str6 = cVar5.f66155d;
                            } else {
                                r16 = zG3;
                                str6 = null;
                            }
                            if (g22.n.d(str6)) {
                                mVar2.C(222653416);
                                p2 p2Var3 = p2.f111205a;
                                boolean z36 = !z25;
                                String strQ9 = y.Q(mVar2, R.string.lbl_livetrack_profile_privacy);
                                boolean zB9 = mVar2.B(lVar3);
                                e23.a aVar19 = aVar4;
                                boolean zB10 = zB9 | mVar2.B(aVar19);
                                Object objQ21 = mVar2.q();
                                if (zB10) {
                                    objQ21 = new i51.e(3, aVar19, lVar3);
                                    mVar2.K(objQ21);
                                } else {
                                    aVar13.getClass();
                                    if (objQ21 == p3.m.a.f135155b) {
                                        objQ21 = new i51.e(3, aVar19, lVar3);
                                        mVar2.K(objQ21);
                                    }
                                }
                                p3.m mVar4 = mVar2;
                                p2Var3.g(strQ9, null, null, null, null, z36, false, (e23.a) objQ21, mVar4, 0, 222);
                                mVar2 = mVar4;
                                mVar2.f();
                            } else {
                                r16 = zG3;
                                mVar2.C(222911398);
                                mVar2.f();
                            }
                        }
                        ub1.l lVarU = g1.u(g1Var, s0.LIVE_TRACK_MAIN, null, 6);
                        if (lVarU == null) {
                            mVar2.C(222990695);
                            mVar2.f();
                            i18 = 2;
                        } else {
                            mVar2.C(1946855898);
                            i18 = 2;
                            lVarU.a(c2.l.C(c2.l.A(aVar11, eVar.f97920e, 0.0f, 2), 0.0f, eVar.f97920e, 0.0f, 0.0f, 13), mVar2, i17);
                            mVar2.f();
                        }
                        List list3 = list2;
                        if (list3.isEmpty()) {
                            mVar2.C(225793158);
                            mVar2.f();
                        } else {
                            mVar2.C(223293597);
                            final j jVar5 = jVar2;
                            boolean zR10 = mVar2.r(jVar5);
                            Object objQ22 = mVar2.q();
                            final p1 p1Var12 = p1Var7;
                            if (zR10) {
                                objQ22 = new e23.p() { // from class: kv0.f
                                    /* JADX WARN: Multi-variable type inference failed */
                                    @Override // e23.p
                                    public final Object invoke(Object obj6, Object obj7) {
                                        Map<Long, ge2.a> map;
                                        Map<Long, ge2.a> map2;
                                        switch (i17) {
                                            case 0:
                                                long jLongValue = ((Long) obj6).longValue();
                                                boolean zBooleanValue3 = ((Boolean) obj7).booleanValue();
                                                p1Var12.setValue(Boolean.TRUE);
                                                j jVar6 = jVar5;
                                                jVar6.getClass();
                                                ge1.b.T(v1.a(jVar6), null, null, new p(jVar6, zBooleanValue3, jLongValue, null), 3);
                                                break;
                                            case 1:
                                                Long l14 = (Long) obj6;
                                                long jLongValue2 = l14.longValue();
                                                Boolean bool = (Boolean) obj7;
                                                bool.getClass();
                                                p1Var12.setValue(Boolean.TRUE);
                                                j jVar7 = jVar5;
                                                ge2.e eVar2 = (ge2.e) ((g3) jVar7.f106669f.f150540a.getValue()).f35301b;
                                                LinkedHashMap linkedHashMap = (eVar2 == null || (map = eVar2.f77022a) == null) ? new LinkedHashMap() : new LinkedHashMap(map);
                                                ge2.a aVar20 = (ge2.a) linkedHashMap.get(l14);
                                                if (aVar20 != null) {
                                                    linkedHashMap.put(l14, ge2.a.a(aVar20, null, bool, null, null, 13));
                                                } else {
                                                    linkedHashMap.put(l14, new ge2.a(null, bool, null, null, 13, null));
                                                }
                                                m1 m1Var = jVar7.f106668e;
                                                if (m1Var != null) {
                                                    m1Var.f(jLongValue2, new ge2.e(linkedHashMap, null, null, null, null, null, null, 126, null));
                                                }
                                                break;
                                            default:
                                                Long l15 = (Long) obj6;
                                                long jLongValue3 = l15.longValue();
                                                Boolean bool2 = (Boolean) obj7;
                                                bool2.getClass();
                                                j jVar8 = jVar5;
                                                ge2.e eVar3 = (ge2.e) ((g3) jVar8.f106669f.f150540a.getValue()).f35301b;
                                                LinkedHashMap linkedHashMap2 = (eVar3 == null || (map2 = eVar3.f77022a) == null) ? new LinkedHashMap() : new LinkedHashMap(map2);
                                                ge2.a aVar21 = (ge2.a) linkedHashMap2.get(l15);
                                                if (aVar21 != null) {
                                                    linkedHashMap2.put(l15, ge2.a.a(aVar21, null, null, bool2, bool2, 3));
                                                } else {
                                                    linkedHashMap2.put(l15, new ge2.a(null, null, bool2, bool2, 3, null));
                                                }
                                                m1 m1Var2 = jVar8.f106668e;
                                                if (m1Var2 != null) {
                                                    m1Var2.f(jLongValue3, new ge2.e(linkedHashMap2, null, null, null, null, null, null, 126, null));
                                                }
                                                p1Var12.setValue(Boolean.TRUE);
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                };
                                mVar2.K(objQ22);
                            } else {
                                aVar13.getClass();
                                if (objQ22 == p3.m.a.f135155b) {
                                    objQ22 = new e23.p() { // from class: kv0.f
                                        /* JADX WARN: Multi-variable type inference failed */
                                        @Override // e23.p
                                        public final Object invoke(Object obj6, Object obj7) {
                                            Map<Long, ge2.a> map;
                                            Map<Long, ge2.a> map2;
                                            switch (i17) {
                                                case 0:
                                                    long jLongValue = ((Long) obj6).longValue();
                                                    boolean zBooleanValue3 = ((Boolean) obj7).booleanValue();
                                                    p1Var12.setValue(Boolean.TRUE);
                                                    j jVar6 = jVar5;
                                                    jVar6.getClass();
                                                    ge1.b.T(v1.a(jVar6), null, null, new p(jVar6, zBooleanValue3, jLongValue, null), 3);
                                                    break;
                                                case 1:
                                                    Long l14 = (Long) obj6;
                                                    long jLongValue2 = l14.longValue();
                                                    Boolean bool = (Boolean) obj7;
                                                    bool.getClass();
                                                    p1Var12.setValue(Boolean.TRUE);
                                                    j jVar7 = jVar5;
                                                    ge2.e eVar2 = (ge2.e) ((g3) jVar7.f106669f.f150540a.getValue()).f35301b;
                                                    LinkedHashMap linkedHashMap = (eVar2 == null || (map = eVar2.f77022a) == null) ? new LinkedHashMap() : new LinkedHashMap(map);
                                                    ge2.a aVar20 = (ge2.a) linkedHashMap.get(l14);
                                                    if (aVar20 != null) {
                                                        linkedHashMap.put(l14, ge2.a.a(aVar20, null, bool, null, null, 13));
                                                    } else {
                                                        linkedHashMap.put(l14, new ge2.a(null, bool, null, null, 13, null));
                                                    }
                                                    m1 m1Var = jVar7.f106668e;
                                                    if (m1Var != null) {
                                                        m1Var.f(jLongValue2, new ge2.e(linkedHashMap, null, null, null, null, null, null, 126, null));
                                                    }
                                                    break;
                                                default:
                                                    Long l15 = (Long) obj6;
                                                    long jLongValue3 = l15.longValue();
                                                    Boolean bool2 = (Boolean) obj7;
                                                    bool2.getClass();
                                                    j jVar8 = jVar5;
                                                    ge2.e eVar3 = (ge2.e) ((g3) jVar8.f106669f.f150540a.getValue()).f35301b;
                                                    LinkedHashMap linkedHashMap2 = (eVar3 == null || (map2 = eVar3.f77022a) == null) ? new LinkedHashMap() : new LinkedHashMap(map2);
                                                    ge2.a aVar21 = (ge2.a) linkedHashMap2.get(l15);
                                                    if (aVar21 != null) {
                                                        linkedHashMap2.put(l15, ge2.a.a(aVar21, null, null, bool2, bool2, 3));
                                                    } else {
                                                        linkedHashMap2.put(l15, new ge2.a(null, null, bool2, bool2, 3, null));
                                                    }
                                                    m1 m1Var2 = jVar8.f106668e;
                                                    if (m1Var2 != null) {
                                                        m1Var2.f(jLongValue3, new ge2.e(linkedHashMap2, null, null, null, null, null, null, 126, null));
                                                    }
                                                    p1Var12.setValue(Boolean.TRUE);
                                                    break;
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    };
                                    mVar2.K(objQ22);
                                }
                            }
                            e23.p pVar = (e23.p) objQ22;
                            boolean zR11 = mVar2.r(jVar5);
                            Object objQ23 = mVar2.q();
                            if (zR11) {
                                i19 = 1;
                                objQ23 = new e23.p() { // from class: kv0.f
                                    /* JADX WARN: Multi-variable type inference failed */
                                    @Override // e23.p
                                    public final Object invoke(Object obj6, Object obj7) {
                                        Map<Long, ge2.a> map;
                                        Map<Long, ge2.a> map2;
                                        switch (i19) {
                                            case 0:
                                                long jLongValue = ((Long) obj6).longValue();
                                                boolean zBooleanValue3 = ((Boolean) obj7).booleanValue();
                                                p1Var12.setValue(Boolean.TRUE);
                                                j jVar6 = jVar5;
                                                jVar6.getClass();
                                                ge1.b.T(v1.a(jVar6), null, null, new p(jVar6, zBooleanValue3, jLongValue, null), 3);
                                                break;
                                            case 1:
                                                Long l14 = (Long) obj6;
                                                long jLongValue2 = l14.longValue();
                                                Boolean bool = (Boolean) obj7;
                                                bool.getClass();
                                                p1Var12.setValue(Boolean.TRUE);
                                                j jVar7 = jVar5;
                                                ge2.e eVar2 = (ge2.e) ((g3) jVar7.f106669f.f150540a.getValue()).f35301b;
                                                LinkedHashMap linkedHashMap = (eVar2 == null || (map = eVar2.f77022a) == null) ? new LinkedHashMap() : new LinkedHashMap(map);
                                                ge2.a aVar20 = (ge2.a) linkedHashMap.get(l14);
                                                if (aVar20 != null) {
                                                    linkedHashMap.put(l14, ge2.a.a(aVar20, null, bool, null, null, 13));
                                                } else {
                                                    linkedHashMap.put(l14, new ge2.a(null, bool, null, null, 13, null));
                                                }
                                                m1 m1Var = jVar7.f106668e;
                                                if (m1Var != null) {
                                                    m1Var.f(jLongValue2, new ge2.e(linkedHashMap, null, null, null, null, null, null, 126, null));
                                                }
                                                break;
                                            default:
                                                Long l15 = (Long) obj6;
                                                long jLongValue3 = l15.longValue();
                                                Boolean bool2 = (Boolean) obj7;
                                                bool2.getClass();
                                                j jVar8 = jVar5;
                                                ge2.e eVar3 = (ge2.e) ((g3) jVar8.f106669f.f150540a.getValue()).f35301b;
                                                LinkedHashMap linkedHashMap2 = (eVar3 == null || (map2 = eVar3.f77022a) == null) ? new LinkedHashMap() : new LinkedHashMap(map2);
                                                ge2.a aVar21 = (ge2.a) linkedHashMap2.get(l15);
                                                if (aVar21 != null) {
                                                    linkedHashMap2.put(l15, ge2.a.a(aVar21, null, null, bool2, bool2, 3));
                                                } else {
                                                    linkedHashMap2.put(l15, new ge2.a(null, null, bool2, bool2, 3, null));
                                                }
                                                m1 m1Var2 = jVar8.f106668e;
                                                if (m1Var2 != null) {
                                                    m1Var2.f(jLongValue3, new ge2.e(linkedHashMap2, null, null, null, null, null, null, 126, null));
                                                }
                                                p1Var12.setValue(Boolean.TRUE);
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                };
                                mVar2.K(objQ23);
                            } else {
                                aVar13.getClass();
                                if (objQ23 == p3.m.a.f135155b) {
                                    i19 = 1;
                                    objQ23 = new e23.p() { // from class: kv0.f
                                        /* JADX WARN: Multi-variable type inference failed */
                                        @Override // e23.p
                                        public final Object invoke(Object obj6, Object obj7) {
                                            Map<Long, ge2.a> map;
                                            Map<Long, ge2.a> map2;
                                            switch (i19) {
                                                case 0:
                                                    long jLongValue = ((Long) obj6).longValue();
                                                    boolean zBooleanValue3 = ((Boolean) obj7).booleanValue();
                                                    p1Var12.setValue(Boolean.TRUE);
                                                    j jVar6 = jVar5;
                                                    jVar6.getClass();
                                                    ge1.b.T(v1.a(jVar6), null, null, new p(jVar6, zBooleanValue3, jLongValue, null), 3);
                                                    break;
                                                case 1:
                                                    Long l14 = (Long) obj6;
                                                    long jLongValue2 = l14.longValue();
                                                    Boolean bool = (Boolean) obj7;
                                                    bool.getClass();
                                                    p1Var12.setValue(Boolean.TRUE);
                                                    j jVar7 = jVar5;
                                                    ge2.e eVar2 = (ge2.e) ((g3) jVar7.f106669f.f150540a.getValue()).f35301b;
                                                    LinkedHashMap linkedHashMap = (eVar2 == null || (map = eVar2.f77022a) == null) ? new LinkedHashMap() : new LinkedHashMap(map);
                                                    ge2.a aVar20 = (ge2.a) linkedHashMap.get(l14);
                                                    if (aVar20 != null) {
                                                        linkedHashMap.put(l14, ge2.a.a(aVar20, null, bool, null, null, 13));
                                                    } else {
                                                        linkedHashMap.put(l14, new ge2.a(null, bool, null, null, 13, null));
                                                    }
                                                    m1 m1Var = jVar7.f106668e;
                                                    if (m1Var != null) {
                                                        m1Var.f(jLongValue2, new ge2.e(linkedHashMap, null, null, null, null, null, null, 126, null));
                                                    }
                                                    break;
                                                default:
                                                    Long l15 = (Long) obj6;
                                                    long jLongValue3 = l15.longValue();
                                                    Boolean bool2 = (Boolean) obj7;
                                                    bool2.getClass();
                                                    j jVar8 = jVar5;
                                                    ge2.e eVar3 = (ge2.e) ((g3) jVar8.f106669f.f150540a.getValue()).f35301b;
                                                    LinkedHashMap linkedHashMap2 = (eVar3 == null || (map2 = eVar3.f77022a) == null) ? new LinkedHashMap() : new LinkedHashMap(map2);
                                                    ge2.a aVar21 = (ge2.a) linkedHashMap2.get(l15);
                                                    if (aVar21 != null) {
                                                        linkedHashMap2.put(l15, ge2.a.a(aVar21, null, null, bool2, bool2, 3));
                                                    } else {
                                                        linkedHashMap2.put(l15, new ge2.a(null, null, bool2, bool2, 3, null));
                                                    }
                                                    m1 m1Var2 = jVar8.f106668e;
                                                    if (m1Var2 != null) {
                                                        m1Var2.f(jLongValue3, new ge2.e(linkedHashMap2, null, null, null, null, null, null, 126, null));
                                                    }
                                                    p1Var12.setValue(Boolean.TRUE);
                                                    break;
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    };
                                    mVar2.K(objQ23);
                                } else {
                                    i19 = 1;
                                }
                            }
                            e23.p pVar2 = (e23.p) objQ23;
                            boolean zR12 = mVar2.r(jVar5);
                            Object objQ24 = mVar2.q();
                            if (zR12) {
                                objQ24 = new e23.p() { // from class: kv0.f
                                    /* JADX WARN: Multi-variable type inference failed */
                                    @Override // e23.p
                                    public final Object invoke(Object obj6, Object obj7) {
                                        Map<Long, ge2.a> map;
                                        Map<Long, ge2.a> map2;
                                        switch (i18) {
                                            case 0:
                                                long jLongValue = ((Long) obj6).longValue();
                                                boolean zBooleanValue3 = ((Boolean) obj7).booleanValue();
                                                p1Var12.setValue(Boolean.TRUE);
                                                j jVar6 = jVar5;
                                                jVar6.getClass();
                                                ge1.b.T(v1.a(jVar6), null, null, new p(jVar6, zBooleanValue3, jLongValue, null), 3);
                                                break;
                                            case 1:
                                                Long l14 = (Long) obj6;
                                                long jLongValue2 = l14.longValue();
                                                Boolean bool = (Boolean) obj7;
                                                bool.getClass();
                                                p1Var12.setValue(Boolean.TRUE);
                                                j jVar7 = jVar5;
                                                ge2.e eVar2 = (ge2.e) ((g3) jVar7.f106669f.f150540a.getValue()).f35301b;
                                                LinkedHashMap linkedHashMap = (eVar2 == null || (map = eVar2.f77022a) == null) ? new LinkedHashMap() : new LinkedHashMap(map);
                                                ge2.a aVar20 = (ge2.a) linkedHashMap.get(l14);
                                                if (aVar20 != null) {
                                                    linkedHashMap.put(l14, ge2.a.a(aVar20, null, bool, null, null, 13));
                                                } else {
                                                    linkedHashMap.put(l14, new ge2.a(null, bool, null, null, 13, null));
                                                }
                                                m1 m1Var = jVar7.f106668e;
                                                if (m1Var != null) {
                                                    m1Var.f(jLongValue2, new ge2.e(linkedHashMap, null, null, null, null, null, null, 126, null));
                                                }
                                                break;
                                            default:
                                                Long l15 = (Long) obj6;
                                                long jLongValue3 = l15.longValue();
                                                Boolean bool2 = (Boolean) obj7;
                                                bool2.getClass();
                                                j jVar8 = jVar5;
                                                ge2.e eVar3 = (ge2.e) ((g3) jVar8.f106669f.f150540a.getValue()).f35301b;
                                                LinkedHashMap linkedHashMap2 = (eVar3 == null || (map2 = eVar3.f77022a) == null) ? new LinkedHashMap() : new LinkedHashMap(map2);
                                                ge2.a aVar21 = (ge2.a) linkedHashMap2.get(l15);
                                                if (aVar21 != null) {
                                                    linkedHashMap2.put(l15, ge2.a.a(aVar21, null, null, bool2, bool2, 3));
                                                } else {
                                                    linkedHashMap2.put(l15, new ge2.a(null, null, bool2, bool2, 3, null));
                                                }
                                                m1 m1Var2 = jVar8.f106668e;
                                                if (m1Var2 != null) {
                                                    m1Var2.f(jLongValue3, new ge2.e(linkedHashMap2, null, null, null, null, null, null, 126, null));
                                                }
                                                p1Var12.setValue(Boolean.TRUE);
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                };
                                mVar2.K(objQ24);
                            } else {
                                aVar13.getClass();
                                if (objQ24 == p3.m.a.f135155b) {
                                    objQ24 = new e23.p() { // from class: kv0.f
                                        /* JADX WARN: Multi-variable type inference failed */
                                        @Override // e23.p
                                        public final Object invoke(Object obj6, Object obj7) {
                                            Map<Long, ge2.a> map;
                                            Map<Long, ge2.a> map2;
                                            switch (i18) {
                                                case 0:
                                                    long jLongValue = ((Long) obj6).longValue();
                                                    boolean zBooleanValue3 = ((Boolean) obj7).booleanValue();
                                                    p1Var12.setValue(Boolean.TRUE);
                                                    j jVar6 = jVar5;
                                                    jVar6.getClass();
                                                    ge1.b.T(v1.a(jVar6), null, null, new p(jVar6, zBooleanValue3, jLongValue, null), 3);
                                                    break;
                                                case 1:
                                                    Long l14 = (Long) obj6;
                                                    long jLongValue2 = l14.longValue();
                                                    Boolean bool = (Boolean) obj7;
                                                    bool.getClass();
                                                    p1Var12.setValue(Boolean.TRUE);
                                                    j jVar7 = jVar5;
                                                    ge2.e eVar2 = (ge2.e) ((g3) jVar7.f106669f.f150540a.getValue()).f35301b;
                                                    LinkedHashMap linkedHashMap = (eVar2 == null || (map = eVar2.f77022a) == null) ? new LinkedHashMap() : new LinkedHashMap(map);
                                                    ge2.a aVar20 = (ge2.a) linkedHashMap.get(l14);
                                                    if (aVar20 != null) {
                                                        linkedHashMap.put(l14, ge2.a.a(aVar20, null, bool, null, null, 13));
                                                    } else {
                                                        linkedHashMap.put(l14, new ge2.a(null, bool, null, null, 13, null));
                                                    }
                                                    m1 m1Var = jVar7.f106668e;
                                                    if (m1Var != null) {
                                                        m1Var.f(jLongValue2, new ge2.e(linkedHashMap, null, null, null, null, null, null, 126, null));
                                                    }
                                                    break;
                                                default:
                                                    Long l15 = (Long) obj6;
                                                    long jLongValue3 = l15.longValue();
                                                    Boolean bool2 = (Boolean) obj7;
                                                    bool2.getClass();
                                                    j jVar8 = jVar5;
                                                    ge2.e eVar3 = (ge2.e) ((g3) jVar8.f106669f.f150540a.getValue()).f35301b;
                                                    LinkedHashMap linkedHashMap2 = (eVar3 == null || (map2 = eVar3.f77022a) == null) ? new LinkedHashMap() : new LinkedHashMap(map2);
                                                    ge2.a aVar21 = (ge2.a) linkedHashMap2.get(l15);
                                                    if (aVar21 != null) {
                                                        linkedHashMap2.put(l15, ge2.a.a(aVar21, null, null, bool2, bool2, 3));
                                                    } else {
                                                        linkedHashMap2.put(l15, new ge2.a(null, null, bool2, bool2, 3, null));
                                                    }
                                                    m1 m1Var2 = jVar8.f106668e;
                                                    if (m1Var2 != null) {
                                                        m1Var2.f(jLongValue3, new ge2.e(linkedHashMap2, null, null, null, null, null, null, 126, null));
                                                    }
                                                    p1Var12.setValue(Boolean.TRUE);
                                                    break;
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    };
                                    mVar2.K(objQ24);
                                }
                            }
                            e23.p pVar3 = (e23.p) objQ24;
                            boolean zR13 = mVar2.r(context6);
                            Object objQ25 = mVar2.q();
                            if (zR13) {
                                p1Var9 = p1Var8;
                                objQ25 = new by1.p(context6, p1Var9, i18);
                                mVar2.K(objQ25);
                            } else {
                                aVar13.getClass();
                                if (objQ25 == p3.m.a.f135155b) {
                                    p1Var9 = p1Var8;
                                    objQ25 = new by1.p(context6, p1Var9, i18);
                                    mVar2.K(objQ25);
                                } else {
                                    p1Var9 = p1Var8;
                                }
                            }
                            e23.a aVar20 = (e23.a) objQ25;
                            boolean zR14 = mVar2.r(jVar5);
                            Object objQ26 = mVar2.q();
                            if (zR14) {
                                objQ26 = new jt1.d(15, jVar5, p1Var12);
                                mVar2.K(objQ26);
                            } else {
                                aVar13.getClass();
                                if (objQ26 == p3.m.a.f135155b) {
                                    objQ26 = new jt1.d(15, jVar5, p1Var12);
                                    mVar2.K(objQ26);
                                }
                            }
                            e23.l lVar5 = (e23.l) objQ26;
                            boolean zR15 = mVar2.r(context6) | mVar2.r(jVar5);
                            Object objQ27 = mVar2.q();
                            if (zR15) {
                                p1 p1Var13 = p1Var9;
                                i24 = i17;
                                ev2.f fVar7 = new ev2.f(context6, jVar5, p1Var12, p1Var13, 21);
                                mVar2.K(fVar7);
                                objQ27 = fVar7;
                            } else {
                                aVar13.getClass();
                                if (objQ27 == p3.m.a.f135155b) {
                                    p1 p1Var14 = p1Var9;
                                    i24 = i17;
                                    ev2.f fVar8 = new ev2.f(context6, jVar5, p1Var12, p1Var14, 21);
                                    mVar2.K(fVar8);
                                    objQ27 = fVar8;
                                } else {
                                    i24 = i17;
                                }
                            }
                            e23.l lVar6 = (e23.l) objQ27;
                            boolean zR16 = mVar2.r(jVar5);
                            Object objQ28 = mVar2.q();
                            if (zR16) {
                                objQ28 = new e23.l() { // from class: kv0.d
                                    @Override // e23.l
                                    public final Object invoke(Object obj6) {
                                        Object value;
                                        switch (i24) {
                                            case 0:
                                                Boolean bool = (Boolean) obj6;
                                                boolean zBooleanValue3 = bool.booleanValue();
                                                j jVar6 = jVar5;
                                                jVar6.f106666c.b(zBooleanValue3);
                                                r53.p2 p2Var4 = jVar6.f106671h;
                                                do {
                                                    value = p2Var4.getValue();
                                                    ((Boolean) value).getClass();
                                                } while (!p2Var4.b(value, bool));
                                                break;
                                            default:
                                                z1 z1Var = (z1) obj6;
                                                z1Var.getClass();
                                                j jVar7 = jVar5;
                                                jVar7.getClass();
                                                ge1.b.T(v1.a(jVar7), null, null, new q(z1Var, jVar7, null), 3);
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                };
                                mVar2.K(objQ28);
                            } else {
                                aVar13.getClass();
                                if (objQ28 == p3.m.a.f135155b) {
                                    objQ28 = new e23.l() { // from class: kv0.d
                                        @Override // e23.l
                                        public final Object invoke(Object obj6) {
                                            Object value;
                                            switch (i24) {
                                                case 0:
                                                    Boolean bool = (Boolean) obj6;
                                                    boolean zBooleanValue3 = bool.booleanValue();
                                                    j jVar6 = jVar5;
                                                    jVar6.f106666c.b(zBooleanValue3);
                                                    r53.p2 p2Var4 = jVar6.f106671h;
                                                    do {
                                                        value = p2Var4.getValue();
                                                        ((Boolean) value).getClass();
                                                    } while (!p2Var4.b(value, bool));
                                                    break;
                                                default:
                                                    z1 z1Var = (z1) obj6;
                                                    z1Var.getClass();
                                                    j jVar7 = jVar5;
                                                    jVar7.getClass();
                                                    ge1.b.T(v1.a(jVar7), null, null, new q(z1Var, jVar7, null), 3);
                                                    break;
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    };
                                    mVar2.K(objQ28);
                                }
                            }
                            e23.l lVar7 = (e23.l) objQ28;
                            boolean zR17 = mVar2.r(jVar5);
                            Object objQ29 = mVar2.q();
                            if (zR17) {
                                objQ29 = new e23.l() { // from class: kv0.d
                                    @Override // e23.l
                                    public final Object invoke(Object obj6) {
                                        Object value;
                                        switch (i19) {
                                            case 0:
                                                Boolean bool = (Boolean) obj6;
                                                boolean zBooleanValue3 = bool.booleanValue();
                                                j jVar6 = jVar5;
                                                jVar6.f106666c.b(zBooleanValue3);
                                                r53.p2 p2Var4 = jVar6.f106671h;
                                                do {
                                                    value = p2Var4.getValue();
                                                    ((Boolean) value).getClass();
                                                } while (!p2Var4.b(value, bool));
                                                break;
                                            default:
                                                z1 z1Var = (z1) obj6;
                                                z1Var.getClass();
                                                j jVar7 = jVar5;
                                                jVar7.getClass();
                                                ge1.b.T(v1.a(jVar7), null, null, new q(z1Var, jVar7, null), 3);
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                };
                                mVar2.K(objQ29);
                            } else {
                                aVar13.getClass();
                                if (objQ29 == p3.m.a.f135155b) {
                                    objQ29 = new e23.l() { // from class: kv0.d
                                        @Override // e23.l
                                        public final Object invoke(Object obj6) {
                                            Object value;
                                            switch (i19) {
                                                case 0:
                                                    Boolean bool = (Boolean) obj6;
                                                    boolean zBooleanValue3 = bool.booleanValue();
                                                    j jVar6 = jVar5;
                                                    jVar6.f106666c.b(zBooleanValue3);
                                                    r53.p2 p2Var4 = jVar6.f106671h;
                                                    do {
                                                        value = p2Var4.getValue();
                                                        ((Boolean) value).getClass();
                                                    } while (!p2Var4.b(value, bool));
                                                    break;
                                                default:
                                                    z1 z1Var = (z1) obj6;
                                                    z1Var.getClass();
                                                    j jVar7 = jVar5;
                                                    jVar7.getClass();
                                                    ge1.b.T(v1.a(jVar7), null, null, new q(z1Var, jVar7, null), 3);
                                                    break;
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    };
                                    mVar2.K(objQ29);
                                }
                            }
                            xu0.e.e(list3, z25, pVar, pVar2, pVar3, aVar20, lVar5, lVar6, lVar7, (e23.l) objQ29, lVar, mVar2, 0);
                            mVar2.f();
                        }
                        mVar2.y();
                    } else {
                        mVar3.e();
                    }
                    return Unit.INSTANCE;
                }
            }, o0Var4), o0Var4, ((i15 >> 24) & 112) | 1576960, 16);
            o0Var = o0Var4;
        } else {
            o0 o0Var5 = o0VarE;
            o0Var5.e();
            o0Var = o0Var5;
        }
        p3.p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a11.j(fVar, dVar, jVar, aVar, aVar2, lVar, aVar3, aVar4, aVar5, aVar6, i14, 9);
        }
    }

    public static final void b(p1<Boolean> p1Var, boolean z14) {
        p1Var.setValue(Boolean.valueOf(z14));
    }
}
