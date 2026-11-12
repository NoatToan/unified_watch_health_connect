package yo0;

import androidx.lifecycle.v1;
import androidx.lifecycle.y0;
import e23.p;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedDeque;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r22.m0;
import r22.u0;
import r22.v0;
import zo0.q;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.home.HomeDialogsViewModel$checkSubscriptionDialogs$1", f = "HomeDialogsViewModel.kt", l = {102}, m = "invokeSuspend", v = 2)
public final class h extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Iterator f198377a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public zo0.p f198378b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f198379c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i f198380d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ q f198381e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ y0<v0> f198382f;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"yo0/h$a", "Lr22/u0;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a implements u0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ i f198383a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ v0 f198384b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ zo0.p f198385c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ zo0.n f198386d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ y0<v0> f198387e;

        /* JADX INFO: renamed from: yo0.h$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"yo0/h$a$a", "Lr22/u0;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class C3715a implements u0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ i f198388a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ v0 f198389b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ y0<v0> f198390c;

            public C3715a(i iVar, v0 v0Var, y0<v0> y0Var) {
                this.f198388a = iVar;
                this.f198389b = v0Var;
                this.f198390c = y0Var;
            }

            @Override // r22.u0
            public final void a() {
            }

            @Override // r22.u0
            public final void onDismiss() {
                i iVar = this.f198388a;
                iVar.f198400g.remove(this.f198389b);
                boolean zIsEmpty = iVar.f198400g.isEmpty();
                y0<v0> y0Var = this.f198390c;
                if (zIsEmpty) {
                    y0Var.j(null);
                } else {
                    y0Var.j(iVar.f198400g.peek());
                }
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.home.HomeDialogsViewModel$checkSubscriptionDialogs$1$1$onShow$1", f = "HomeDialogsViewModel.kt", l = {142}, m = "invokeSuspend", v = 2)
        public static final class b extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f198391a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ zo0.p f198392b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ zo0.n f198393c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(zo0.p pVar, zo0.n nVar, t13.d<? super b> dVar) {
                super(2, dVar);
                this.f198392b = pVar;
                this.f198393c = nVar;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new b(this.f198392b, this.f198393c, dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
                return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f198391a;
                if (i14 == 0) {
                    r.b(obj);
                    this.f198391a = 1;
                    if (this.f198392b.d(this.f198393c) == aVar) {
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

        public a(i iVar, v0 v0Var, zo0.p pVar, zo0.n nVar, y0<v0> y0Var) {
            this.f198383a = iVar;
            this.f198384b = v0Var;
            this.f198385c = pVar;
            this.f198386d = nVar;
            this.f198387e = y0Var;
        }

        @Override // r22.u0
        public final void a() {
            i iVar = this.f198383a;
            ge1.b.T(v1.a(iVar), iVar.f198396c, null, new b(this.f198385c, this.f198386d, null), 2);
        }

        @Override // r22.u0
        public final void onDismiss() {
            m0 m0VarA;
            i iVar = this.f198383a;
            ConcurrentLinkedDeque<v0> concurrentLinkedDeque = iVar.f198400g;
            ConcurrentLinkedDeque<v0> concurrentLinkedDeque2 = iVar.f198400g;
            concurrentLinkedDeque.remove(this.f198384b);
            zo0.p pVar = this.f198385c;
            boolean z14 = pVar instanceof zo0.r;
            y0<v0> y0Var = this.f198387e;
            if (z14 && (m0VarA = ((zo0.r) pVar).a(this.f198386d)) != null) {
                m0VarA.f149762c = new C3715a(iVar, m0VarA, y0Var);
                concurrentLinkedDeque2.addFirst(m0VarA);
            }
            if (concurrentLinkedDeque2.isEmpty()) {
                y0Var.j(null);
            } else {
                y0Var.j(concurrentLinkedDeque2.peek());
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i iVar, q qVar, y0<v0> y0Var, t13.d<? super h> dVar) {
        super(2, dVar);
        this.f198380d = iVar;
        this.f198381e = qVar;
        this.f198382f = y0Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new h(this.f198380d, this.f198381e, this.f198382f, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((h) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0032  */
    /* JADX WARN: Code duplicated, block: B:14:0x0045 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:17:0x004b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0043 -> B:6:0x0012). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:17:0x004b
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // v13.a
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            u13.a r0 = u13.a.COROUTINE_SUSPENDED
            int r1 = r10.f198379c
            r2 = 1
            yo0.i r3 = r10.f198380d
            if (r1 == 0) goto L1c
            if (r1 != r2) goto L15
            zo0.p r1 = r10.f198378b
            java.util.Iterator r4 = r10.f198377a
            o13.r.b(r11)
        L12:
            r7 = r1
            r1 = r4
            goto L46
        L15:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            vb.h.z(r11)
            r11 = 0
            return r11
        L1c:
            o13.r.b(r11)
            zo0.o r11 = r3.f198395b
            zo0.q r1 = r10.f198381e
            java.util.List r11 = r11.a(r1)
            java.util.Iterator r11 = r11.iterator()
            r4 = r11
        L2c:
            boolean r11 = r4.hasNext()
            if (r11 == 0) goto L64
            java.lang.Object r11 = r4.next()
            r1 = r11
            zo0.p r1 = (zo0.p) r1
            r10.f198377a = r4
            r10.f198378b = r1
            r10.f198379c = r2
            java.lang.Object r11 = r1.c(r10)
            if (r11 != r0) goto L12
            return r0
        L46:
            r8 = r11
            zo0.n r8 = (zo0.n) r8
            if (r8 == 0) goto L62
            r22.v0 r6 = r7.b(r8)
            if (r6 == 0) goto L62
            yo0.h$a r4 = new yo0.h$a
            yo0.i r5 = r10.f198380d
            androidx.lifecycle.y0<r22.v0> r9 = r10.f198382f
            r4.<init>(r5, r6, r7, r8, r9)
            r6.L3(r4)
            java.util.concurrent.ConcurrentLinkedDeque<r22.v0> r11 = r3.f198400g
            r11.offer(r6)
        L62:
            r4 = r1
            goto L2c
        L64:
            java.util.concurrent.ConcurrentLinkedDeque<r22.v0> r11 = r3.f198400g
            boolean r11 = r11.isEmpty()
            androidx.lifecycle.y0<r22.v0> r0 = r10.f198382f
            if (r11 != 0) goto L78
            java.util.concurrent.ConcurrentLinkedDeque<r22.v0> r11 = r3.f198400g
            java.lang.Object r11 = r11.peek()
            r0.j(r11)
            goto L7c
        L78:
            r11 = 0
            r0.j(r11)
        L7c:
            kotlin.Unit r11 = p005kotlin.Unit.INSTANCE
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: yo0.h.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
