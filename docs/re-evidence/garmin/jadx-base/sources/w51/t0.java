package w51;

import com.garmin.android.apps.connectmobile.v2;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.z1;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.pending.activities.presentation.PendingActivityDetailsViewModel$loadById$4", f = "PendingActivityDetailsViewModel.kt", l = {123, 124, 140}, m = "invokeSuspend", v = 2)
public final class t0 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public o53.j0 f182402a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List f182403b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public z51.a f182404c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public z51.h f182405d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public List f182406e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public z1 f182407f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public q0 f182408g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Object f182409h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public p0 f182410i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public z51.d f182411j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f182412k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f182413l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f182414m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f182415n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f182416o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public /* synthetic */ Object f182417p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ q0 f182418q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ String f182419r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ fz0.c f182420t;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "", "Lam/x0;", "<anonymous>", "(Lo53/b0;)Ljava/util/List;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.pending.activities.presentation.PendingActivityDetailsViewModel$loadById$4$noGpsTypesDeferred$1", f = "PendingActivityDetailsViewModel.kt", l = {120}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super List<? extends am.x0>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f182421a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ q0 f182422b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(q0 q0Var, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f182422b = q0Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f182422b, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super List<? extends am.x0>> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f182421a;
            if (i14 == 0) {
                o13.r.b(obj);
                this.f182421a = 1;
                Object objY4 = q0.y4(this.f182422b, this);
                return objY4 == aVar ? aVar : objY4;
            }
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "Lcom/garmin/android/apps/connectmobile/v2;", "Lz51/a;", "<anonymous>", "(Lo53/b0;)Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.pending.activities.presentation.PendingActivityDetailsViewModel$loadById$4$resultDeferred$1", f = "PendingActivityDetailsViewModel.kt", l = {121}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements e23.p<o53.b0, t13.d<? super v2<? extends z51.a>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f182423a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ q0 f182424b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f182425c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ fz0.c f182426d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(q0 q0Var, String str, fz0.c cVar, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f182424b = q0Var;
            this.f182425c = str;
            this.f182426d = cVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new b(this.f182424b, this.f182425c, this.f182426d, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super v2<? extends z51.a>> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f182423a;
            if (i14 != 0) {
                if (i14 == 1) {
                    o13.r.b(obj);
                    return obj;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
            y51.a aVar2 = this.f182424b.f182370a;
            this.f182423a = 1;
            Object objA = aVar2.a(this.f182425c, this.f182426d, this);
            return objA == aVar ? aVar : objA;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(q0 q0Var, String str, fz0.c cVar, t13.d<? super t0> dVar) {
        super(2, dVar);
        this.f182418q = q0Var;
        this.f182419r = str;
        this.f182420t = cVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        t0 t0Var = new t0(this.f182418q, this.f182419r, this.f182420t, dVar);
        t0Var.f182417p = obj;
        return t0Var;
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((t0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01e4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:113:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:53:0x014e  */
    /* JADX WARN: Code duplicated, block: B:54:0x0151  */
    /* JADX WARN: Code duplicated, block: B:57:0x0156  */
    /* JADX WARN: Code duplicated, block: B:60:0x0189  */
    /* JADX WARN: Code duplicated, block: B:63:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:66:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:70:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:74:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:79:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:80:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:83:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:87:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:90:0x0226  */
    /* JADX WARN: Code duplicated, block: B:91:0x023e  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:60:0x0189 -> B:61:0x0192). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:63:0x01a1 -> B:62:0x019e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // v13.a
    public final java.lang.Object invokeSuspend(java.lang.Object r49) {
        /*
            Method dump skipped, instruction units count: 681
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w51.t0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
