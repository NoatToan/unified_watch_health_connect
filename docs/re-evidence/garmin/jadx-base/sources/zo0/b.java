package zo0;

import android.view.View;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r22.m0;
import r22.v0;
import z10.d1;
import zd0.j1;
import zo0.b.C3844b;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\nB#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lzo0/b;", "Lzo0/p;", "Lzo0/q;", "navigator", "Lzd0/j1;", "subscriptionProvider", "La80/a;", "dataPreferences", "<init>", "(Lzo0/q;Lzd0/j1;La80/a;)V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b implements p {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f206089d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f206090a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j1 f206091b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a80.a f206092c;

    /* JADX INFO: renamed from: zo0.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.home.dialogs.ActiveIntelligenceDialogHandler$createDialog$1$1", f = "ActiveIntelligenceDialogHandler.kt", l = {69}, m = "invokeSuspend", v = 2)
    public static final class C3844b extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f206093a;

        public C3844b(t13.d<? super C3844b> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return b.this.new C3844b(dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((C3844b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f206093a;
            if (i14 == 0) {
                o13.r.b(obj);
                q qVar = b.this.f206090a;
                this.f206093a = 1;
                if (qVar.C6(this) == aVar) {
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
    @v13.e(c = "com.garmin.android.apps.connectmobile.home.dialogs.ActiveIntelligenceDialogHandler", f = "ActiveIntelligenceDialogHandler.kt", l = {30}, m = "requestDialogData", v = 2)
    public static final class c extends v13.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f206095a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f206097c;

        public c(t13.d<? super c> dVar) {
            super(dVar);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            this.f206095a = obj;
            this.f206097c |= Integer.MIN_VALUE;
            return b.this.c(this);
        }
    }

    static {
        new a(null);
    }

    public /* synthetic */ b(q qVar, j1 j1Var, a80.a aVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this(qVar, (i14 & 2) != 0 ? (j1) KoinJavaComponent.get$default(j1.class, null, null, 6, null) : j1Var, (i14 & 4) != 0 ? (a80.a) KoinJavaComponent.get$default(a80.a.class, null, null, 6, null) : aVar);
    }

    @Override // zo0.p
    public final v0 b(n nVar) {
        if (!(nVar instanceof n.a)) {
            return null;
        }
        a2 a2Var = a2.SUBSCRIPTIONS;
        i2.f36769a.getClass();
        i2.a.b(a2Var, "ActiveIntelligenceDialogHandler", "Creating dialog");
        final int i14 = 0;
        View.OnClickListener onClickListener = new View.OnClickListener(this) { // from class: zo0.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ b f206081b;

            {
                this.f206081b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i15 = i14;
                b bVar = this.f206081b;
                switch (i15) {
                    case 0:
                        int i16 = b.f206089d;
                        a2 a2Var2 = a2.SUBSCRIPTIONS;
                        i2.f36769a.getClass();
                        i2.a.b(a2Var2, "ActiveIntelligenceDialogHandler", "Closing without updating consent.");
                        androidx.appcompat.app.e.a aVar = new androidx.appcompat.app.e.a(bVar.f206090a.getContext());
                        aVar.setTitle(R.string.opt_in_later);
                        aVar.setMessage(R.string.if_you_want_active_intelligence_later_manage_permission);
                        aVar.setPositiveButton(R.string.lbl_ok, new zo.g(2));
                        aVar.show();
                        break;
                    default:
                        int i17 = b.f206089d;
                        a2 a2Var3 = a2.SUBSCRIPTIONS;
                        i2.f36769a.getClass();
                        i2.a.b(a2Var3, "ActiveIntelligenceDialogHandler", "Navigating to AI Features consent");
                        ge1.b.T(bVar.f206090a.Q7(), null, null, bVar.new C3844b(null), 3);
                        break;
                }
            }
        };
        boolean zA = ((c91.b) KoinJavaComponent.get$default(c91.b.class, null, null, 6, null)).a();
        q qVar = this.f206090a;
        String string = zA ? qVar.u5().getString(R.string.lbl_beta) : null;
        final int i15 = 1;
        return m0.a.d(m0.f149759e, R.drawable.gcplus_large_blue_icon, qVar.u5().getString(R.string.active_intelligence), qVar.u5().getString(R.string.to_provide_active_intelligence), R.string.lbl_manage_permission, new View.OnClickListener(this) { // from class: zo0.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ b f206081b;

            {
                this.f206081b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i16 = i15;
                b bVar = this.f206081b;
                switch (i16) {
                    case 0:
                        int i17 = b.f206089d;
                        a2 a2Var2 = a2.SUBSCRIPTIONS;
                        i2.f36769a.getClass();
                        i2.a.b(a2Var2, "ActiveIntelligenceDialogHandler", "Closing without updating consent.");
                        androidx.appcompat.app.e.a aVar = new androidx.appcompat.app.e.a(bVar.f206090a.getContext());
                        aVar.setTitle(R.string.opt_in_later);
                        aVar.setMessage(R.string.if_you_want_active_intelligence_later_manage_permission);
                        aVar.setPositiveButton(R.string.lbl_ok, new zo.g(2));
                        aVar.show();
                        break;
                    default:
                        int i18 = b.f206089d;
                        a2 a2Var3 = a2.SUBSCRIPTIONS;
                        i2.f36769a.getClass();
                        i2.a.b(a2Var3, "ActiveIntelligenceDialogHandler", "Navigating to AI Features consent");
                        ge1.b.T(bVar.f206090a.Q7(), null, null, bVar.new C3844b(null), 3);
                        break;
                }
            }
        }, R.string.not_now_lbl, onClickListener, string, 1408);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // zo0.p
    public final Object c(t13.d<? super n> dVar) {
        c cVar;
        if (dVar instanceof c) {
            cVar = (c) dVar;
            int i14 = cVar.f206097c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                cVar.f206097c = i14 - Integer.MIN_VALUE;
            } else {
                cVar = new c(dVar);
            }
        } else {
            cVar = new c(dVar);
        }
        Object objL = cVar.f206095a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = cVar.f206097c;
        if (i15 == 0) {
            o13.r.b(objL);
            c80.q qVar = c80.q.MESSAGING_PLUS;
            cVar.f206097c = 1;
            objL = this.f206091b.l(qVar, cVar);
            if (objL == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objL);
        }
        if (!((Boolean) objL).booleanValue() || d1.h(q92.x.DI_CONNECT_AI, false) || this.f206092c.b()) {
            return null;
        }
        return n.a.f206171a;
    }

    @Override // zo0.p
    public final Unit d(n nVar) {
        if (nVar instanceof n.a) {
            this.f206092c.e(true);
        }
        return Unit.INSTANCE;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lzo0/b$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    public b(q qVar, j1 j1Var, a80.a aVar) {
        qVar.getClass();
        j1Var.getClass();
        aVar.getClass();
        this.f206090a = qVar;
        this.f206091b = j1Var;
        this.f206092c = aVar;
    }
}
