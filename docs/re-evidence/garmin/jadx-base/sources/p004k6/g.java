package p004k6;

import android.os.IBinder;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import e23.p;
import f5.a1;
import f5.b1;
import f5.c0;
import f5.g0;
import f5.v1;
import f5.y0;
import f5.z0;
import g6.o;
import h4.r;
import h5.e0;
import java.util.List;
import java.util.UUID;
import kotlin.t1;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.w;
import p3.b4;
import p3.h0;
import p3.i0;
import p3.i2;
import p3.j0;
import p3.l0;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.v;
import p3.x1;
import p3.x3;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j0 f103039a = v.c(b.f103042a);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final j0 f103040b = v.c(a.f103041a);

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class a extends w implements e23.a<Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f103041a = new a();

        public a() {
            super(0);
        }

        @Override // e23.a
        public final /* bridge */ /* synthetic */ Boolean invoke() {
            return Boolean.FALSE;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class b extends w implements e23.a<String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f103042a = new b();

        public b() {
            super(0);
        }

        @Override // e23.a
        public final /* bridge */ /* synthetic */ String invoke() {
            return "DEFAULT_TEST_TAG";
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class c extends w implements p<m, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ h4.d f103043a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ long f103044b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a<Unit> f103045c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ d0 f103046d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ p<m, Integer, Unit> f103047e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ int f103048f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ int f103049g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(h4.d dVar, long j8, e23.a<Unit> aVar, d0 d0Var, p<? super m, ? super Integer, Unit> pVar, int i14, int i15) {
            super(2);
            this.f103043a = dVar;
            this.f103044b = j8;
            this.f103045c = aVar;
            this.f103046d = d0Var;
            this.f103047e = pVar;
            this.f103048f = i14;
            this.f103049g = i15;
        }

        @Override // e23.p
        public final Unit invoke(m mVar, Integer num) {
            num.intValue();
            g.b(this.f103043a, this.f103044b, this.f103045c, this.f103046d, this.f103047e, mVar, p0.t(this.f103048f | 1), this.f103049g);
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lp3/i0;", "Lp3/h0;", "invoke", "(Lp3/i0;)Lp3/h0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class d extends w implements e23.l<i0, h0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ x f103050a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ e23.a<Unit> f103051b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ d0 f103052c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f103053d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ o f103054e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(x xVar, e23.a<Unit> aVar, d0 d0Var, String str, o oVar) {
            super(1);
            this.f103050a = xVar;
            this.f103051b = aVar;
            this.f103052c = d0Var;
            this.f103053d = str;
            this.f103054e = oVar;
        }

        @Override // e23.l
        public final h0 invoke(i0 i0Var) {
            x xVar = this.f103050a;
            xVar.f103129g.addView(xVar, xVar.params);
            xVar.d(this.f103051b, this.f103052c, this.f103053d, this.f103054e);
            return new p004k6.h(xVar);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class e extends w implements e23.a<Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ x f103055a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ e23.a<Unit> f103056b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ d0 f103057c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f103058d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ o f103059e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(x xVar, e23.a<Unit> aVar, d0 d0Var, String str, o oVar) {
            super(0);
            this.f103055a = xVar;
            this.f103056b = aVar;
            this.f103057c = d0Var;
            this.f103058d = str;
            this.f103059e = oVar;
        }

        @Override // e23.a
        public final Unit invoke() {
            this.f103055a.d(this.f103056b, this.f103057c, this.f103058d, this.f103059e);
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lp3/i0;", "Lp3/h0;", "invoke", "(Lp3/i0;)Lp3/h0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class f extends w implements e23.l<i0, h0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ x f103060a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ c0 f103061b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(x xVar, c0 c0Var) {
            super(1);
            this.f103060a = xVar;
            this.f103061b = c0Var;
        }

        @Override // e23.l
        public final h0 invoke(i0 i0Var) {
            c0 c0Var = this.f103061b;
            x xVar = this.f103060a;
            xVar.setPositionProvider(c0Var);
            xVar.g();
            return new p004k6.i();
        }
    }

    /* JADX INFO: renamed from: k6.g$g, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
    @v13.e(c = "androidx.compose.ui.window.AndroidPopup_androidKt$Popup$5$1", f = "AndroidPopup.android.kt", l = {496}, m = "invokeSuspend", v = 1)
    public static final class C1978g extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f103062a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f103063b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ x f103064c;

        /* JADX INFO: renamed from: k6.g$g$a */
        @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class a extends w implements e23.l<Long, Unit> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f103065a = new a();

            public a() {
                super(1);
            }

            @Override // e23.l
            public final /* bridge */ /* synthetic */ Unit invoke(Long l14) {
                l14.longValue();
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1978g(x xVar, t13.d<? super C1978g> dVar) {
            super(2, dVar);
            this.f103064c = xVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            C1978g c1978g = new C1978g(this.f103064c, dVar);
            c1978g.f103063b = obj;
            return c1978g;
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((C1978g) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:11:0x0026  */
        /* JADX WARN: Code duplicated, block: B:13:0x003a  */
        /* JADX WARN: Code duplicated, block: B:14:0x0047  */
        /* JADX WARN: Code duplicated, block: B:16:0x0053 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:20:0x005f  */
        /* JADX WARN: Code duplicated, block: B:22:0x006d  */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:16:0x0053
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // v13.a
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                u13.a r0 = u13.a.COROUTINE_SUSPENDED
                int r1 = r8.f103062a
                r2 = 1
                if (r1 == 0) goto L18
                if (r1 != r2) goto L11
                java.lang.Object r1 = r8.f103063b
                o53.b0 r1 = (o53.b0) r1
                o13.r.b(r9)
                goto L54
            L11:
                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                vb.h.z(r9)
                r9 = 0
                return r9
            L18:
                o13.r.b(r9)
                java.lang.Object r9 = r8.f103063b
                o53.b0 r9 = (o53.b0) r9
                r1 = r9
            L20:
                boolean r9 = o53.c0.g(r1)
                if (r9 == 0) goto L75
                k6.g$g$a r9 = p004k6.g.C1978g.a.f103065a
                r8.f103063b = r1
                r8.f103062a = r2
                t13.g r3 = r8.getF157466b()
                i5.g2$a r4 = kotlin.g2.f91193c0
                t13.g$a r3 = r3.get(r4)
                i5.g2 r3 = (kotlin.g2) r3
                if (r3 != 0) goto L47
                t13.g r3 = r8.getF157466b()
                p3.e1 r3 = p3.g1.a(r3)
                java.lang.Object r9 = r3.v(r9, r8)
                goto L51
            L47:
                i5.h2 r4 = new i5.h2
                r5 = 0
                r4.<init>(r9, r5)
                java.lang.Object r9 = r3.x()
            L51:
                if (r9 != r0) goto L54
                return r0
            L54:
                k6.x r9 = r8.f103064c
                int[] r3 = r9.f103142v
                boolean r4 = r9.isAttachedToWindow()
                if (r4 != 0) goto L5f
                goto L20
            L5f:
                r4 = 0
                r5 = r3[r4]
                r6 = r3[r2]
                android.view.View r7 = r9.f103126d
                r7.getLocationOnScreen(r3)
                r4 = r3[r4]
                if (r5 != r4) goto L71
                r3 = r3[r2]
                if (r6 == r3) goto L20
            L71:
                r9.e()
                goto L20
            L75:
                kotlin.Unit r9 = p005kotlin.Unit.INSTANCE
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: p004k6.g.C1978g.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lf5/c0;", "childCoordinates", "", "invoke", "(Lf5/c0;)V", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class h extends w implements e23.l<c0, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ x f103066a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(x xVar) {
            super(1);
            this.f103066a = xVar;
        }

        @Override // e23.l
        public final Unit invoke(c0 c0Var) {
            c0 c0VarY = c0Var.y();
            c0VarY.getClass();
            this.f103066a.f(c0VarY);
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lf5/b1;", "", "Lf5/y0;", "<unused var>", "Lg6/a;", "Lf5/a1;", "measure-3p2s80s", "(Lf5/b1;Ljava/util/List;J)Lf5/a1;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class i implements z0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ x f103067a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ o f103068b;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lf5/v1$a;", "", "invoke", "(Lf5/v1$a;)V", "<anonymous>"}, k = 3, mv = {2, 1, 0})
        public static final class a extends w implements e23.l<v1.a, Unit> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f103069a = new a();

            public a() {
                super(1);
            }

            @Override // e23.l
            public final /* bridge */ /* synthetic */ Unit invoke(v1.a aVar) {
                return Unit.INSTANCE;
            }
        }

        public i(x xVar, o oVar) {
            this.f103067a = xVar;
            this.f103068b = oVar;
        }

        @Override // f5.z0
        public final a1 f(b1 b1Var, List<? extends y0> list, long j8) {
            this.f103067a.setParentLayoutDirection(this.f103068b);
            return b1.h0(b1Var, 0, 0, a.f103069a);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class j extends w implements p<m, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ c0 f103070a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ e23.a<Unit> f103071b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ d0 f103072c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ p<m, Integer, Unit> f103073d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ int f103074e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ int f103075f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public j(c0 c0Var, e23.a<Unit> aVar, d0 d0Var, p<? super m, ? super Integer, Unit> pVar, int i14, int i15) {
            super(2);
            this.f103070a = c0Var;
            this.f103071b = aVar;
            this.f103072c = d0Var;
            this.f103073d = pVar;
            this.f103074e = i14;
            this.f103075f = i15;
        }

        @Override // e23.p
        public final Unit invoke(m mVar, Integer num) {
            num.intValue();
            g.a(this.f103070a, this.f103071b, this.f103072c, this.f103073d, mVar, p0.t(this.f103074e | 1), this.f103075f);
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Ljava/util/UUID;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class k extends w implements e23.a<UUID> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final k f103076a = new k();

        public k() {
            super(0);
        }

        @Override // e23.a
        public final UUID invoke() {
            return UUID.randomUUID();
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "(Lp3/m;I)V", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class l extends w implements p<m, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ x f103077a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ x3<p<m, Integer, Unit>> f103078b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public l(x xVar, x3<? extends p<? super m, ? super Integer, Unit>> x3Var) {
            super(2);
            this.f103077a = xVar;
            this.f103078b = x3Var;
        }

        @Override // e23.p
        public final Unit invoke(m mVar, Integer num) {
            m mVar2 = mVar;
            int iIntValue = num.intValue();
            if (mVar2.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                x1 x1Var = n.f135158a;
                v.a(g.f103040b.c(Boolean.TRUE), z3.f.c(1022273628, new p004k6.l(this.f103077a, this.f103078b), mVar2), mVar2, 56);
            } else {
                mVar2.e();
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x020f  */
    /* JADX WARN: Code duplicated, block: B:103:0x0230 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:104:0x0232  */
    /* JADX WARN: Code duplicated, block: B:107:0x0255  */
    /* JADX WARN: Code duplicated, block: B:109:0x025c  */
    /* JADX WARN: Code duplicated, block: B:110:0x0260  */
    /* JADX WARN: Code duplicated, block: B:112:0x0289  */
    /* JADX WARN: Code duplicated, block: B:114:0x028f  */
    /* JADX WARN: Code duplicated, block: B:117:0x029a  */
    /* JADX WARN: Code duplicated, block: B:119:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x003e  */
    /* JADX WARN: Code duplicated, block: B:25:0x0043  */
    /* JADX WARN: Code duplicated, block: B:27:0x0047  */
    /* JADX WARN: Code duplicated, block: B:29:0x004f  */
    /* JADX WARN: Code duplicated, block: B:30:0x0052  */
    /* JADX WARN: Code duplicated, block: B:34:0x0059  */
    /* JADX WARN: Code duplicated, block: B:36:0x005f  */
    /* JADX WARN: Code duplicated, block: B:37:0x0062  */
    /* JADX WARN: Code duplicated, block: B:41:0x006d  */
    /* JADX WARN: Code duplicated, block: B:42:0x006f  */
    /* JADX WARN: Code duplicated, block: B:45:0x0078  */
    /* JADX WARN: Code duplicated, block: B:47:0x007b  */
    /* JADX WARN: Code duplicated, block: B:48:0x007e  */
    /* JADX WARN: Code duplicated, block: B:50:0x0082  */
    /* JADX WARN: Code duplicated, block: B:51:0x0096  */
    /* JADX WARN: Code duplicated, block: B:54:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:57:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:58:0x0133  */
    /* JADX WARN: Code duplicated, block: B:61:0x0147  */
    /* JADX WARN: Code duplicated, block: B:62:0x0149  */
    /* JADX WARN: Code duplicated, block: B:65:0x0152  */
    /* JADX WARN: Code duplicated, block: B:66:0x0154  */
    /* JADX WARN: Code duplicated, block: B:69:0x016b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:70:0x016d  */
    /* JADX WARN: Code duplicated, block: B:73:0x0186  */
    /* JADX WARN: Code duplicated, block: B:74:0x0188  */
    /* JADX WARN: Code duplicated, block: B:77:0x018f  */
    /* JADX WARN: Code duplicated, block: B:78:0x0191  */
    /* JADX WARN: Code duplicated, block: B:81:0x01a8 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:84:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:87:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:88:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:91:0x01d8 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:92:0x01da  */
    /* JADX WARN: Code duplicated, block: B:95:0x01f1 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:96:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:99:0x020d A[ADDED_TO_REGION] */
    public static final void a(c0 c0Var, e23.a<Unit> aVar, d0 d0Var, p<? super m, ? super Integer, Unit> pVar, m mVar, int i14, int i15) {
        int i16;
        e23.a<Unit> aVar2;
        int i17;
        d0 d0Var2;
        int i18;
        boolean z14;
        e23.a<Unit> aVar3;
        d0 d0Var3;
        p2 p2VarI0;
        e23.a<Unit> aVar4;
        d0 d0Var4;
        View view2;
        g6.c cVar;
        String str;
        o oVar;
        o0.b bVarG;
        p1 p1VarQ;
        Object objQ;
        m.a.C2565a c2565a;
        UUID uuid;
        boolean zBooleanValue;
        Object objQ2;
        int i19;
        boolean z15;
        String str2;
        int i24;
        x xVar;
        int i25;
        int i26;
        boolean z16;
        int i27;
        boolean z17;
        boolean zB;
        Object objQ3;
        boolean z18;
        boolean z19;
        boolean zB2;
        Object objQ4;
        boolean z24;
        boolean z25;
        Object objQ5;
        boolean zR;
        Object objQ6;
        boolean zR2;
        Object objQ7;
        boolean zR3;
        Object objQ8;
        z0 z0Var;
        int iHashCode;
        i2 i2VarA0;
        r rVarC;
        e0.a aVar5;
        int i28;
        c0 c0Var2 = c0Var;
        o0 o0VarE = mVar.E(-1772091631);
        if ((i14 & 6) == 0) {
            i16 = (o0VarE.B(c0Var2) ? 4 : 2) | i14;
        } else {
            i16 = i14;
        }
        int i29 = i15 & 2;
        if (i29 == 0) {
            if ((i14 & 48) == 0) {
                aVar2 = aVar;
                i16 |= o0VarE.r(aVar2) ? 32 : 16;
            }
            i17 = i15 & 4;
            if (i17 != 0) {
                if ((i14 & 384) == 0) {
                    d0Var2 = d0Var;
                    if (o0VarE.B(d0Var2)) {
                        i18 = 256;
                    } else {
                        i18 = 128;
                    }
                    i16 |= i18;
                }
                if ((i14 & 3072) == 0) {
                    if (o0VarE.r(pVar)) {
                        i28 = 2048;
                    } else {
                        i28 = 1024;
                    }
                    i16 |= i28;
                }
                if ((i16 & 1171) != 1170) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (o0VarE.n(i16 & 1, z14)) {
                    if (i29 != 0) {
                        aVar4 = null;
                    } else {
                        aVar4 = aVar2;
                    }
                    if (i17 != 0) {
                        d0Var4 = new d0(false, false, false, false, false, 31, (p005kotlin.jvm.internal.j) null);
                    } else {
                        d0Var4 = d0Var2;
                    }
                    x1 x1Var = n.f135158a;
                    view2 = (View) o0VarE.A(AndroidCompositionLocals_androidKt.f6046f);
                    cVar = (g6.c) o0VarE.A(t1.f91490h);
                    str = (String) o0VarE.A(f103039a);
                    oVar = (o) o0VarE.A(t1.f91496n);
                    bVarG = o0VarE.g();
                    p1VarQ = p0.q(pVar, o0VarE);
                    Object[] objArr = new Object[0];
                    objQ = o0VarE.q();
                    m.f135153a.getClass();
                    c2565a = m.a.f135155b;
                    if (objQ == c2565a) {
                        objQ = k.f103076a;
                        o0VarE.K(objQ);
                    }
                    uuid = (UUID) d4.a.e(objArr, (e23.a) objQ, o0VarE, 48);
                    zBooleanValue = ((Boolean) o0VarE.A(f103040b)).booleanValue();
                    objQ2 = o0VarE.q();
                    if (objQ2 == c2565a) {
                        i19 = i16;
                        z15 = false;
                        i24 = 32;
                        str2 = str;
                        x xVar2 = new x(aVar4, d0Var4, str2, view2, cVar, c0Var2, uuid, zBooleanValue, null, 256, null);
                        c0Var2 = c0Var2;
                        xVar2.c(bVarG, new z3.e(-297523940, true, new l(xVar2, p1VarQ)));
                        o0VarE.K(xVar2);
                        objQ2 = xVar2;
                    } else {
                        i19 = i16;
                        z15 = false;
                        str2 = str;
                        i24 = 32;
                    }
                    xVar = (x) objQ2;
                    boolean zR4 = o0VarE.r(xVar);
                    i25 = i19;
                    i26 = i25 & 112;
                    if (i26 == i24) {
                        z16 = true;
                    } else {
                        z16 = z15;
                    }
                    boolean z26 = zR4 | z16;
                    i27 = i25 & 896;
                    if (i27 == 256) {
                        z17 = true;
                    } else {
                        z17 = z15;
                    }
                    zB = z26 | z17 | o0VarE.B(str2) | o0VarE.k(oVar.ordinal());
                    objQ3 = o0VarE.q();
                    if (zB || objQ3 == c2565a) {
                        objQ3 = new d(xVar, aVar4, d0Var4, str2, oVar);
                        o0VarE.K(objQ3);
                    }
                    l0.a(xVar, (e23.l) objQ3, o0VarE);
                    boolean zR5 = o0VarE.r(xVar);
                    if (i26 == i24) {
                        z18 = true;
                    } else {
                        z18 = z15;
                    }
                    boolean z27 = zR5 | z18;
                    if (i27 == 256) {
                        z19 = true;
                    } else {
                        z19 = z15;
                    }
                    zB2 = z27 | z19 | o0VarE.B(str2) | o0VarE.k(oVar.ordinal());
                    objQ4 = o0VarE.q();
                    if (zB2 || objQ4 == c2565a) {
                        objQ4 = new e(xVar, aVar4, d0Var4, str2, oVar);
                        o0VarE.K(objQ4);
                    }
                    l0.i((e23.a) objQ4, o0VarE);
                    boolean zR6 = o0VarE.r(xVar);
                    if ((i25 & 14) == 4) {
                        z24 = true;
                    } else {
                        z24 = z15;
                    }
                    z25 = zR6 | z24;
                    objQ5 = o0VarE.q();
                    if (z25 || objQ5 == c2565a) {
                        objQ5 = new f(xVar, c0Var2);
                        o0VarE.K(objQ5);
                    }
                    l0.a(c0Var2, (e23.l) objQ5, o0VarE);
                    zR = o0VarE.r(xVar);
                    objQ6 = o0VarE.q();
                    if (zR || objQ6 == c2565a) {
                        objQ6 = new C1978g(xVar, null);
                        o0VarE.K(objQ6);
                    }
                    l0.e((p) objQ6, xVar, o0VarE);
                    r.a aVar6 = r.S;
                    zR2 = o0VarE.r(xVar);
                    objQ7 = o0VarE.q();
                    if (zR2 || objQ7 == c2565a) {
                        objQ7 = new h(xVar);
                        o0VarE.K(objQ7);
                    }
                    r rVarF = g0.f(aVar6, (e23.l) objQ7);
                    zR3 = o0VarE.r(xVar) | o0VarE.k(oVar.ordinal());
                    objQ8 = o0VarE.q();
                    if (zR3 || objQ8 == c2565a) {
                        objQ8 = new i(xVar, oVar);
                        o0VarE.K(objQ8);
                    }
                    z0Var = (z0) objQ8;
                    iHashCode = Long.hashCode(o0VarE.U);
                    i2VarA0 = o0VarE.a0();
                    rVarC = h4.k.c(rVarF, o0VarE);
                    h5.g.V.getClass();
                    aVar5 = h5.g.a.f81805b;
                    if (o0VarE.f135177b != null) {
                        p0.l();
                        throw null;
                    }
                    o0VarE.z();
                    if (o0VarE.T) {
                        o0VarE.M(aVar5);
                    } else {
                        o0VarE.c();
                    }
                    b4.c(h5.g.a.f81810g, z0Var, o0VarE);
                    b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
                    b4.c(h5.g.a.f81813j, Integer.valueOf(iHashCode), o0VarE);
                    b4.b(h5.g.a.f81814k, o0VarE);
                    b4.c(h5.g.a.f81807d, rVarC, o0VarE);
                    o0VarE.g0(true);
                    aVar3 = aVar4;
                    d0Var3 = d0Var4;
                } else {
                    o0VarE.e();
                    aVar3 = aVar2;
                    d0Var3 = d0Var2;
                }
                p2VarI0 = o0VarE.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new j(c0Var2, aVar3, d0Var3, pVar, i14, i15);
                }
            }
            i16 |= 384;
            d0Var2 = d0Var;
            if ((i14 & 3072) == 0) {
                if (o0VarE.r(pVar)) {
                    i28 = 2048;
                } else {
                    i28 = 1024;
                }
                i16 |= i28;
            }
            if ((i16 & 1171) != 1170) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (o0VarE.n(i16 & 1, z14)) {
                if (i29 != 0) {
                    aVar4 = null;
                } else {
                    aVar4 = aVar2;
                }
                if (i17 != 0) {
                    d0Var4 = new d0(false, false, false, false, false, 31, (p005kotlin.jvm.internal.j) null);
                } else {
                    d0Var4 = d0Var2;
                }
                x1 x1Var2 = n.f135158a;
                view2 = (View) o0VarE.A(AndroidCompositionLocals_androidKt.f6046f);
                cVar = (g6.c) o0VarE.A(t1.f91490h);
                str = (String) o0VarE.A(f103039a);
                oVar = (o) o0VarE.A(t1.f91496n);
                bVarG = o0VarE.g();
                p1VarQ = p0.q(pVar, o0VarE);
                Object[] objArr2 = new Object[0];
                objQ = o0VarE.q();
                m.f135153a.getClass();
                c2565a = m.a.f135155b;
                if (objQ == c2565a) {
                    objQ = k.f103076a;
                    o0VarE.K(objQ);
                }
                uuid = (UUID) d4.a.e(objArr2, (e23.a) objQ, o0VarE, 48);
                zBooleanValue = ((Boolean) o0VarE.A(f103040b)).booleanValue();
                objQ2 = o0VarE.q();
                if (objQ2 == c2565a) {
                    i19 = i16;
                    z15 = false;
                    i24 = 32;
                    str2 = str;
                    x xVar3 = new x(aVar4, d0Var4, str2, view2, cVar, c0Var2, uuid, zBooleanValue, null, 256, null);
                    c0Var2 = c0Var2;
                    xVar3.c(bVarG, new z3.e(-297523940, true, new l(xVar3, p1VarQ)));
                    o0VarE.K(xVar3);
                    objQ2 = xVar3;
                } else {
                    i19 = i16;
                    z15 = false;
                    str2 = str;
                    i24 = 32;
                }
                xVar = (x) objQ2;
                boolean zR7 = o0VarE.r(xVar);
                i25 = i19;
                i26 = i25 & 112;
                if (i26 == i24) {
                    z16 = true;
                } else {
                    z16 = z15;
                }
                boolean z28 = zR7 | z16;
                i27 = i25 & 896;
                if (i27 == 256) {
                    z17 = true;
                } else {
                    z17 = z15;
                }
                zB = z28 | z17 | o0VarE.B(str2) | o0VarE.k(oVar.ordinal());
                objQ3 = o0VarE.q();
                if (zB) {
                    objQ3 = new d(xVar, aVar4, d0Var4, str2, oVar);
                    o0VarE.K(objQ3);
                } else {
                    objQ3 = new d(xVar, aVar4, d0Var4, str2, oVar);
                    o0VarE.K(objQ3);
                }
                l0.a(xVar, (e23.l) objQ3, o0VarE);
                boolean zR8 = o0VarE.r(xVar);
                if (i26 == i24) {
                    z18 = true;
                } else {
                    z18 = z15;
                }
                boolean z29 = zR8 | z18;
                if (i27 == 256) {
                    z19 = true;
                } else {
                    z19 = z15;
                }
                zB2 = z29 | z19 | o0VarE.B(str2) | o0VarE.k(oVar.ordinal());
                objQ4 = o0VarE.q();
                if (zB2) {
                    objQ4 = new e(xVar, aVar4, d0Var4, str2, oVar);
                    o0VarE.K(objQ4);
                } else {
                    objQ4 = new e(xVar, aVar4, d0Var4, str2, oVar);
                    o0VarE.K(objQ4);
                }
                l0.i((e23.a) objQ4, o0VarE);
                boolean zR9 = o0VarE.r(xVar);
                if ((i25 & 14) == 4) {
                    z24 = true;
                } else {
                    z24 = z15;
                }
                z25 = zR9 | z24;
                objQ5 = o0VarE.q();
                if (z25) {
                    objQ5 = new f(xVar, c0Var2);
                    o0VarE.K(objQ5);
                } else {
                    objQ5 = new f(xVar, c0Var2);
                    o0VarE.K(objQ5);
                }
                l0.a(c0Var2, (e23.l) objQ5, o0VarE);
                zR = o0VarE.r(xVar);
                objQ6 = o0VarE.q();
                if (zR) {
                    objQ6 = new C1978g(xVar, null);
                    o0VarE.K(objQ6);
                } else {
                    objQ6 = new C1978g(xVar, null);
                    o0VarE.K(objQ6);
                }
                l0.e((p) objQ6, xVar, o0VarE);
                r.a aVar7 = r.S;
                zR2 = o0VarE.r(xVar);
                objQ7 = o0VarE.q();
                if (zR2) {
                    objQ7 = new h(xVar);
                    o0VarE.K(objQ7);
                } else {
                    objQ7 = new h(xVar);
                    o0VarE.K(objQ7);
                }
                r rVarF2 = g0.f(aVar7, (e23.l) objQ7);
                zR3 = o0VarE.r(xVar) | o0VarE.k(oVar.ordinal());
                objQ8 = o0VarE.q();
                if (zR3) {
                    objQ8 = new i(xVar, oVar);
                    o0VarE.K(objQ8);
                } else {
                    objQ8 = new i(xVar, oVar);
                    o0VarE.K(objQ8);
                }
                z0Var = (z0) objQ8;
                iHashCode = Long.hashCode(o0VarE.U);
                i2VarA0 = o0VarE.a0();
                rVarC = h4.k.c(rVarF2, o0VarE);
                h5.g.V.getClass();
                aVar5 = h5.g.a.f81805b;
                if (o0VarE.f135177b != null) {
                    p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar5);
                } else {
                    o0VarE.c();
                }
                b4.c(h5.g.a.f81810g, z0Var, o0VarE);
                b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
                b4.c(h5.g.a.f81813j, Integer.valueOf(iHashCode), o0VarE);
                b4.b(h5.g.a.f81814k, o0VarE);
                b4.c(h5.g.a.f81807d, rVarC, o0VarE);
                o0VarE.g0(true);
                aVar3 = aVar4;
                d0Var3 = d0Var4;
            } else {
                o0VarE.e();
                aVar3 = aVar2;
                d0Var3 = d0Var2;
            }
            p2VarI0 = o0VarE.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new j(c0Var2, aVar3, d0Var3, pVar, i14, i15);
            }
        }
        i16 |= 48;
        aVar2 = aVar;
        i17 = i15 & 4;
        if (i17 != 0) {
            if ((i14 & 384) == 0) {
                d0Var2 = d0Var;
                if (o0VarE.B(d0Var2)) {
                    i18 = 256;
                } else {
                    i18 = 128;
                }
                i16 |= i18;
            }
            if ((i14 & 3072) == 0) {
                if (o0VarE.r(pVar)) {
                    i28 = 2048;
                } else {
                    i28 = 1024;
                }
                i16 |= i28;
            }
            if ((i16 & 1171) != 1170) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (o0VarE.n(i16 & 1, z14)) {
                if (i29 != 0) {
                    aVar4 = null;
                } else {
                    aVar4 = aVar2;
                }
                if (i17 != 0) {
                    d0Var4 = new d0(false, false, false, false, false, 31, (p005kotlin.jvm.internal.j) null);
                } else {
                    d0Var4 = d0Var2;
                }
                x1 x1Var3 = n.f135158a;
                view2 = (View) o0VarE.A(AndroidCompositionLocals_androidKt.f6046f);
                cVar = (g6.c) o0VarE.A(t1.f91490h);
                str = (String) o0VarE.A(f103039a);
                oVar = (o) o0VarE.A(t1.f91496n);
                bVarG = o0VarE.g();
                p1VarQ = p0.q(pVar, o0VarE);
                Object[] objArr3 = new Object[0];
                objQ = o0VarE.q();
                m.f135153a.getClass();
                c2565a = m.a.f135155b;
                if (objQ == c2565a) {
                    objQ = k.f103076a;
                    o0VarE.K(objQ);
                }
                uuid = (UUID) d4.a.e(objArr3, (e23.a) objQ, o0VarE, 48);
                zBooleanValue = ((Boolean) o0VarE.A(f103040b)).booleanValue();
                objQ2 = o0VarE.q();
                if (objQ2 == c2565a) {
                    i19 = i16;
                    z15 = false;
                    i24 = 32;
                    str2 = str;
                    x xVar4 = new x(aVar4, d0Var4, str2, view2, cVar, c0Var2, uuid, zBooleanValue, null, 256, null);
                    c0Var2 = c0Var2;
                    xVar4.c(bVarG, new z3.e(-297523940, true, new l(xVar4, p1VarQ)));
                    o0VarE.K(xVar4);
                    objQ2 = xVar4;
                } else {
                    i19 = i16;
                    z15 = false;
                    str2 = str;
                    i24 = 32;
                }
                xVar = (x) objQ2;
                boolean zR10 = o0VarE.r(xVar);
                i25 = i19;
                i26 = i25 & 112;
                if (i26 == i24) {
                    z16 = true;
                } else {
                    z16 = z15;
                }
                boolean z210 = zR10 | z16;
                i27 = i25 & 896;
                if (i27 == 256) {
                    z17 = true;
                } else {
                    z17 = z15;
                }
                zB = z210 | z17 | o0VarE.B(str2) | o0VarE.k(oVar.ordinal());
                objQ3 = o0VarE.q();
                if (zB) {
                    objQ3 = new d(xVar, aVar4, d0Var4, str2, oVar);
                    o0VarE.K(objQ3);
                } else {
                    objQ3 = new d(xVar, aVar4, d0Var4, str2, oVar);
                    o0VarE.K(objQ3);
                }
                l0.a(xVar, (e23.l) objQ3, o0VarE);
                boolean zR11 = o0VarE.r(xVar);
                if (i26 == i24) {
                    z18 = true;
                } else {
                    z18 = z15;
                }
                boolean z211 = zR11 | z18;
                if (i27 == 256) {
                    z19 = true;
                } else {
                    z19 = z15;
                }
                zB2 = z211 | z19 | o0VarE.B(str2) | o0VarE.k(oVar.ordinal());
                objQ4 = o0VarE.q();
                if (zB2) {
                    objQ4 = new e(xVar, aVar4, d0Var4, str2, oVar);
                    o0VarE.K(objQ4);
                } else {
                    objQ4 = new e(xVar, aVar4, d0Var4, str2, oVar);
                    o0VarE.K(objQ4);
                }
                l0.i((e23.a) objQ4, o0VarE);
                boolean zR12 = o0VarE.r(xVar);
                if ((i25 & 14) == 4) {
                    z24 = true;
                } else {
                    z24 = z15;
                }
                z25 = zR12 | z24;
                objQ5 = o0VarE.q();
                if (z25) {
                    objQ5 = new f(xVar, c0Var2);
                    o0VarE.K(objQ5);
                } else {
                    objQ5 = new f(xVar, c0Var2);
                    o0VarE.K(objQ5);
                }
                l0.a(c0Var2, (e23.l) objQ5, o0VarE);
                zR = o0VarE.r(xVar);
                objQ6 = o0VarE.q();
                if (zR) {
                    objQ6 = new C1978g(xVar, null);
                    o0VarE.K(objQ6);
                } else {
                    objQ6 = new C1978g(xVar, null);
                    o0VarE.K(objQ6);
                }
                l0.e((p) objQ6, xVar, o0VarE);
                r.a aVar8 = r.S;
                zR2 = o0VarE.r(xVar);
                objQ7 = o0VarE.q();
                if (zR2) {
                    objQ7 = new h(xVar);
                    o0VarE.K(objQ7);
                } else {
                    objQ7 = new h(xVar);
                    o0VarE.K(objQ7);
                }
                r rVarF3 = g0.f(aVar8, (e23.l) objQ7);
                zR3 = o0VarE.r(xVar) | o0VarE.k(oVar.ordinal());
                objQ8 = o0VarE.q();
                if (zR3) {
                    objQ8 = new i(xVar, oVar);
                    o0VarE.K(objQ8);
                } else {
                    objQ8 = new i(xVar, oVar);
                    o0VarE.K(objQ8);
                }
                z0Var = (z0) objQ8;
                iHashCode = Long.hashCode(o0VarE.U);
                i2VarA0 = o0VarE.a0();
                rVarC = h4.k.c(rVarF3, o0VarE);
                h5.g.V.getClass();
                aVar5 = h5.g.a.f81805b;
                if (o0VarE.f135177b != null) {
                    p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar5);
                } else {
                    o0VarE.c();
                }
                b4.c(h5.g.a.f81810g, z0Var, o0VarE);
                b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
                b4.c(h5.g.a.f81813j, Integer.valueOf(iHashCode), o0VarE);
                b4.b(h5.g.a.f81814k, o0VarE);
                b4.c(h5.g.a.f81807d, rVarC, o0VarE);
                o0VarE.g0(true);
                aVar3 = aVar4;
                d0Var3 = d0Var4;
            } else {
                o0VarE.e();
                aVar3 = aVar2;
                d0Var3 = d0Var2;
            }
            p2VarI0 = o0VarE.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new j(c0Var2, aVar3, d0Var3, pVar, i14, i15);
            }
        }
        i16 |= 384;
        d0Var2 = d0Var;
        if ((i14 & 3072) == 0) {
            if (o0VarE.r(pVar)) {
                i28 = 2048;
            } else {
                i28 = 1024;
            }
            i16 |= i28;
        }
        if ((i16 & 1171) != 1170) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (o0VarE.n(i16 & 1, z14)) {
            if (i29 != 0) {
                aVar4 = null;
            } else {
                aVar4 = aVar2;
            }
            if (i17 != 0) {
                d0Var4 = new d0(false, false, false, false, false, 31, (p005kotlin.jvm.internal.j) null);
            } else {
                d0Var4 = d0Var2;
            }
            x1 x1Var4 = n.f135158a;
            view2 = (View) o0VarE.A(AndroidCompositionLocals_androidKt.f6046f);
            cVar = (g6.c) o0VarE.A(t1.f91490h);
            str = (String) o0VarE.A(f103039a);
            oVar = (o) o0VarE.A(t1.f91496n);
            bVarG = o0VarE.g();
            p1VarQ = p0.q(pVar, o0VarE);
            Object[] objArr4 = new Object[0];
            objQ = o0VarE.q();
            m.f135153a.getClass();
            c2565a = m.a.f135155b;
            if (objQ == c2565a) {
                objQ = k.f103076a;
                o0VarE.K(objQ);
            }
            uuid = (UUID) d4.a.e(objArr4, (e23.a) objQ, o0VarE, 48);
            zBooleanValue = ((Boolean) o0VarE.A(f103040b)).booleanValue();
            objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                i19 = i16;
                z15 = false;
                i24 = 32;
                str2 = str;
                x xVar5 = new x(aVar4, d0Var4, str2, view2, cVar, c0Var2, uuid, zBooleanValue, null, 256, null);
                c0Var2 = c0Var2;
                xVar5.c(bVarG, new z3.e(-297523940, true, new l(xVar5, p1VarQ)));
                o0VarE.K(xVar5);
                objQ2 = xVar5;
            } else {
                i19 = i16;
                z15 = false;
                str2 = str;
                i24 = 32;
            }
            xVar = (x) objQ2;
            boolean zR13 = o0VarE.r(xVar);
            i25 = i19;
            i26 = i25 & 112;
            if (i26 == i24) {
                z16 = true;
            } else {
                z16 = z15;
            }
            boolean z212 = zR13 | z16;
            i27 = i25 & 896;
            if (i27 == 256) {
                z17 = true;
            } else {
                z17 = z15;
            }
            zB = z212 | z17 | o0VarE.B(str2) | o0VarE.k(oVar.ordinal());
            objQ3 = o0VarE.q();
            if (zB) {
                objQ3 = new d(xVar, aVar4, d0Var4, str2, oVar);
                o0VarE.K(objQ3);
            } else {
                objQ3 = new d(xVar, aVar4, d0Var4, str2, oVar);
                o0VarE.K(objQ3);
            }
            l0.a(xVar, (e23.l) objQ3, o0VarE);
            boolean zR14 = o0VarE.r(xVar);
            if (i26 == i24) {
                z18 = true;
            } else {
                z18 = z15;
            }
            boolean z213 = zR14 | z18;
            if (i27 == 256) {
                z19 = true;
            } else {
                z19 = z15;
            }
            zB2 = z213 | z19 | o0VarE.B(str2) | o0VarE.k(oVar.ordinal());
            objQ4 = o0VarE.q();
            if (zB2) {
                objQ4 = new e(xVar, aVar4, d0Var4, str2, oVar);
                o0VarE.K(objQ4);
            } else {
                objQ4 = new e(xVar, aVar4, d0Var4, str2, oVar);
                o0VarE.K(objQ4);
            }
            l0.i((e23.a) objQ4, o0VarE);
            boolean zR15 = o0VarE.r(xVar);
            if ((i25 & 14) == 4) {
                z24 = true;
            } else {
                z24 = z15;
            }
            z25 = zR15 | z24;
            objQ5 = o0VarE.q();
            if (z25) {
                objQ5 = new f(xVar, c0Var2);
                o0VarE.K(objQ5);
            } else {
                objQ5 = new f(xVar, c0Var2);
                o0VarE.K(objQ5);
            }
            l0.a(c0Var2, (e23.l) objQ5, o0VarE);
            zR = o0VarE.r(xVar);
            objQ6 = o0VarE.q();
            if (zR) {
                objQ6 = new C1978g(xVar, null);
                o0VarE.K(objQ6);
            } else {
                objQ6 = new C1978g(xVar, null);
                o0VarE.K(objQ6);
            }
            l0.e((p) objQ6, xVar, o0VarE);
            r.a aVar9 = r.S;
            zR2 = o0VarE.r(xVar);
            objQ7 = o0VarE.q();
            if (zR2) {
                objQ7 = new h(xVar);
                o0VarE.K(objQ7);
            } else {
                objQ7 = new h(xVar);
                o0VarE.K(objQ7);
            }
            r rVarF4 = g0.f(aVar9, (e23.l) objQ7);
            zR3 = o0VarE.r(xVar) | o0VarE.k(oVar.ordinal());
            objQ8 = o0VarE.q();
            if (zR3) {
                objQ8 = new i(xVar, oVar);
                o0VarE.K(objQ8);
            } else {
                objQ8 = new i(xVar, oVar);
                o0VarE.K(objQ8);
            }
            z0Var = (z0) objQ8;
            iHashCode = Long.hashCode(o0VarE.U);
            i2VarA0 = o0VarE.a0();
            rVarC = h4.k.c(rVarF4, o0VarE);
            h5.g.V.getClass();
            aVar5 = h5.g.a.f81805b;
            if (o0VarE.f135177b != null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar5);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, z0Var, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            b4.c(h5.g.a.f81813j, Integer.valueOf(iHashCode), o0VarE);
            b4.b(h5.g.a.f81814k, o0VarE);
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            o0VarE.g0(true);
            aVar3 = aVar4;
            d0Var3 = d0Var4;
        } else {
            o0VarE.e();
            aVar3 = aVar2;
            d0Var3 = d0Var2;
        }
        p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new j(c0Var2, aVar3, d0Var3, pVar, i14, i15);
        }
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0063  */
    /* JADX WARN: Code duplicated, block: B:38:0x0068  */
    /* JADX WARN: Code duplicated, block: B:40:0x006c  */
    /* JADX WARN: Code duplicated, block: B:42:0x0074  */
    /* JADX WARN: Code duplicated, block: B:43:0x0077  */
    /* JADX WARN: Code duplicated, block: B:47:0x007e  */
    /* JADX WARN: Code duplicated, block: B:49:0x0086  */
    /* JADX WARN: Code duplicated, block: B:50:0x0089  */
    /* JADX WARN: Code duplicated, block: B:52:0x008d  */
    /* JADX WARN: Code duplicated, block: B:55:0x009a  */
    /* JADX WARN: Code duplicated, block: B:56:0x009d  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:60:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:61:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:64:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:67:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:70:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:71:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:74:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:75:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:78:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:81:0x0109  */
    /* JADX WARN: Code duplicated, block: B:83:0x0112  */
    /* JADX WARN: Code duplicated, block: B:85:0x012c  */
    /* JADX WARN: Code duplicated, block: B:88:0x0139  */
    /* JADX WARN: Code duplicated, block: B:90:? A[RETURN, SYNTHETIC] */
    public static final void b(h4.d dVar, long j8, e23.a<Unit> aVar, d0 d0Var, p<? super m, ? super Integer, Unit> pVar, m mVar, int i14, int i15) {
        h4.d dVar2;
        int i16;
        long j14;
        e23.a<Unit> aVar2;
        int i17;
        d0 d0Var2;
        int i18;
        boolean z14;
        h4.d dVar3;
        long j15;
        e23.a<Unit> aVar3;
        d0 d0Var3;
        p2 p2VarI0;
        h4.d dVar4;
        long j16;
        e23.a<Unit> aVar4;
        d0 d0Var4;
        boolean z15;
        boolean zK;
        Object objQ;
        int i19;
        o0 o0VarE = mVar.E(71005054);
        int i24 = i15 & 1;
        if (i24 != 0) {
            i16 = i14 | 6;
            dVar2 = dVar;
        } else if ((i14 & 6) == 0) {
            dVar2 = dVar;
            i16 = (o0VarE.B(dVar2) ? 4 : 2) | i14;
        } else {
            dVar2 = dVar;
            i16 = i14;
        }
        int i25 = i15 & 2;
        if (i25 != 0) {
            i16 |= 48;
            j14 = j8;
        } else {
            j14 = j8;
            if ((i14 & 48) == 0) {
                i16 |= o0VarE.l(j14) ? 32 : 16;
            }
        }
        int i26 = i15 & 4;
        if (i26 == 0) {
            if ((i14 & 384) == 0) {
                aVar2 = aVar;
                i16 |= o0VarE.r(aVar2) ? 256 : 128;
            }
            i17 = i15 & 8;
            if (i17 != 0) {
                if ((i14 & 3072) == 0) {
                    d0Var2 = d0Var;
                    if (o0VarE.B(d0Var2)) {
                        i18 = 2048;
                    } else {
                        i18 = 1024;
                    }
                    i16 |= i18;
                }
                if ((i14 & 24576) != 0) {
                    if (o0VarE.r(pVar)) {
                        i19 = 16384;
                    } else {
                        i19 = 8192;
                    }
                    i16 |= i19;
                }
                if ((i16 & 9363) != 9362) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (o0VarE.n(i16 & 1, z14)) {
                    if (i24 != 0) {
                        h4.d.f81522a.getClass();
                        dVar4 = h4.d.a.f81524b;
                    } else {
                        dVar4 = dVar2;
                    }
                    if (i25 != 0) {
                        long j17 = 0;
                        j16 = (j17 & 4294967295L) | (j17 << 32);
                        g6.k.a aVar5 = g6.k.f76003b;
                    } else {
                        j16 = j14;
                    }
                    if (i26 != 0) {
                        aVar4 = null;
                    } else {
                        aVar4 = aVar2;
                    }
                    if (i17 != 0) {
                        d0Var4 = new d0(false, false, false, false, false, 31, (p005kotlin.jvm.internal.j) null);
                    } else {
                        d0Var4 = d0Var2;
                    }
                    x1 x1Var = n.f135158a;
                    int i27 = d0Var4.f103026g;
                    IBinder iBinder = d0Var4.f103027h;
                    if ((i16 & 14) == 4) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    zK = ((i16 & 112) == 32) | z15 | o0VarE.k(i27) | o0VarE.B(iBinder);
                    objQ = o0VarE.q();
                    if (zK) {
                        objQ = new p004k6.a(dVar4, j16, null);
                        o0VarE.K(objQ);
                    } else {
                        m.f135153a.getClass();
                        if (objQ == m.a.f135155b) {
                            objQ = new p004k6.a(dVar4, j16, null);
                            o0VarE.K(objQ);
                        }
                    }
                    a((p004k6.a) objQ, aVar4, d0Var4, pVar, o0VarE, (i16 >> 3) & 8176, 0);
                    dVar3 = dVar4;
                    j15 = j16;
                    aVar3 = aVar4;
                    d0Var3 = d0Var4;
                } else {
                    o0VarE.e();
                    dVar3 = dVar2;
                    j15 = j14;
                    aVar3 = aVar2;
                    d0Var3 = d0Var2;
                }
                p2VarI0 = o0VarE.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new c(dVar3, j15, aVar3, d0Var3, pVar, i14, i15);
                }
            }
            i16 |= 3072;
            d0Var2 = d0Var;
            if ((i14 & 24576) != 0) {
                if (o0VarE.r(pVar)) {
                    i19 = 16384;
                } else {
                    i19 = 8192;
                }
                i16 |= i19;
            }
            if ((i16 & 9363) != 9362) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (o0VarE.n(i16 & 1, z14)) {
                if (i24 != 0) {
                    h4.d.f81522a.getClass();
                    dVar4 = h4.d.a.f81524b;
                } else {
                    dVar4 = dVar2;
                }
                if (i25 != 0) {
                    long j18 = 0;
                    j16 = (j18 & 4294967295L) | (j18 << 32);
                    g6.k.a aVar6 = g6.k.f76003b;
                } else {
                    j16 = j14;
                }
                if (i26 != 0) {
                    aVar4 = null;
                } else {
                    aVar4 = aVar2;
                }
                if (i17 != 0) {
                    d0Var4 = new d0(false, false, false, false, false, 31, (p005kotlin.jvm.internal.j) null);
                } else {
                    d0Var4 = d0Var2;
                }
                x1 x1Var2 = n.f135158a;
                int i28 = d0Var4.f103026g;
                IBinder iBinder2 = d0Var4.f103027h;
                if ((i16 & 14) == 4) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                zK = ((i16 & 112) == 32) | z15 | o0VarE.k(i28) | o0VarE.B(iBinder2);
                objQ = o0VarE.q();
                if (zK) {
                    m.f135153a.getClass();
                    if (objQ == m.a.f135155b) {
                        objQ = new p004k6.a(dVar4, j16, null);
                        o0VarE.K(objQ);
                    }
                } else {
                    objQ = new p004k6.a(dVar4, j16, null);
                    o0VarE.K(objQ);
                }
                a((p004k6.a) objQ, aVar4, d0Var4, pVar, o0VarE, (i16 >> 3) & 8176, 0);
                dVar3 = dVar4;
                j15 = j16;
                aVar3 = aVar4;
                d0Var3 = d0Var4;
            } else {
                o0VarE.e();
                dVar3 = dVar2;
                j15 = j14;
                aVar3 = aVar2;
                d0Var3 = d0Var2;
            }
            p2VarI0 = o0VarE.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new c(dVar3, j15, aVar3, d0Var3, pVar, i14, i15);
            }
        }
        i16 |= 384;
        aVar2 = aVar;
        i17 = i15 & 8;
        if (i17 != 0) {
            if ((i14 & 3072) == 0) {
                d0Var2 = d0Var;
                if (o0VarE.B(d0Var2)) {
                    i18 = 2048;
                } else {
                    i18 = 1024;
                }
                i16 |= i18;
            }
            if ((i14 & 24576) != 0) {
                if (o0VarE.r(pVar)) {
                    i19 = 16384;
                } else {
                    i19 = 8192;
                }
                i16 |= i19;
            }
            if ((i16 & 9363) != 9362) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (o0VarE.n(i16 & 1, z14)) {
                if (i24 != 0) {
                    h4.d.f81522a.getClass();
                    dVar4 = h4.d.a.f81524b;
                } else {
                    dVar4 = dVar2;
                }
                if (i25 != 0) {
                    long j19 = 0;
                    j16 = (j19 & 4294967295L) | (j19 << 32);
                    g6.k.a aVar7 = g6.k.f76003b;
                } else {
                    j16 = j14;
                }
                if (i26 != 0) {
                    aVar4 = null;
                } else {
                    aVar4 = aVar2;
                }
                if (i17 != 0) {
                    d0Var4 = new d0(false, false, false, false, false, 31, (p005kotlin.jvm.internal.j) null);
                } else {
                    d0Var4 = d0Var2;
                }
                x1 x1Var3 = n.f135158a;
                int i29 = d0Var4.f103026g;
                IBinder iBinder3 = d0Var4.f103027h;
                if ((i16 & 14) == 4) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                zK = ((i16 & 112) == 32) | z15 | o0VarE.k(i29) | o0VarE.B(iBinder3);
                objQ = o0VarE.q();
                if (zK) {
                    m.f135153a.getClass();
                    if (objQ == m.a.f135155b) {
                        objQ = new p004k6.a(dVar4, j16, null);
                        o0VarE.K(objQ);
                    }
                } else {
                    objQ = new p004k6.a(dVar4, j16, null);
                    o0VarE.K(objQ);
                }
                a((p004k6.a) objQ, aVar4, d0Var4, pVar, o0VarE, (i16 >> 3) & 8176, 0);
                dVar3 = dVar4;
                j15 = j16;
                aVar3 = aVar4;
                d0Var3 = d0Var4;
            } else {
                o0VarE.e();
                dVar3 = dVar2;
                j15 = j14;
                aVar3 = aVar2;
                d0Var3 = d0Var2;
            }
            p2VarI0 = o0VarE.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new c(dVar3, j15, aVar3, d0Var3, pVar, i14, i15);
            }
        }
        i16 |= 3072;
        d0Var2 = d0Var;
        if ((i14 & 24576) != 0) {
            if (o0VarE.r(pVar)) {
                i19 = 16384;
            } else {
                i19 = 8192;
            }
            i16 |= i19;
        }
        if ((i16 & 9363) != 9362) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (o0VarE.n(i16 & 1, z14)) {
            if (i24 != 0) {
                h4.d.f81522a.getClass();
                dVar4 = h4.d.a.f81524b;
            } else {
                dVar4 = dVar2;
            }
            if (i25 != 0) {
                long j110 = 0;
                j16 = (j110 & 4294967295L) | (j110 << 32);
                g6.k.a aVar8 = g6.k.f76003b;
            } else {
                j16 = j14;
            }
            if (i26 != 0) {
                aVar4 = null;
            } else {
                aVar4 = aVar2;
            }
            if (i17 != 0) {
                d0Var4 = new d0(false, false, false, false, false, 31, (p005kotlin.jvm.internal.j) null);
            } else {
                d0Var4 = d0Var2;
            }
            x1 x1Var4 = n.f135158a;
            int i210 = d0Var4.f103026g;
            IBinder iBinder4 = d0Var4.f103027h;
            if ((i16 & 14) == 4) {
                z15 = true;
            } else {
                z15 = false;
            }
            zK = ((i16 & 112) == 32) | z15 | o0VarE.k(i210) | o0VarE.B(iBinder4);
            objQ = o0VarE.q();
            if (zK) {
                m.f135153a.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new p004k6.a(dVar4, j16, null);
                    o0VarE.K(objQ);
                }
            } else {
                objQ = new p004k6.a(dVar4, j16, null);
                o0VarE.K(objQ);
            }
            a((p004k6.a) objQ, aVar4, d0Var4, pVar, o0VarE, (i16 >> 3) & 8176, 0);
            dVar3 = dVar4;
            j15 = j16;
            aVar3 = aVar4;
            d0Var3 = d0Var4;
        } else {
            o0VarE.e();
            dVar3 = dVar2;
            j15 = j14;
            aVar3 = aVar2;
            d0Var3 = d0Var2;
        }
        p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new c(dVar3, j15, aVar3, d0Var3, pVar, i14, i15);
        }
    }

    public static final boolean c(View view2) {
        ViewGroup.LayoutParams layoutParams = view2.getRootView().getLayoutParams();
        WindowManager.LayoutParams layoutParams2 = layoutParams instanceof WindowManager.LayoutParams ? (WindowManager.LayoutParams) layoutParams : null;
        return (layoutParams2 == null || (layoutParams2.flags & 8192) == 0) ? false : true;
    }
}
