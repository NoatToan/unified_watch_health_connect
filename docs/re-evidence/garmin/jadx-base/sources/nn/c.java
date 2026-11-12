package nn;

import androidx.lifecycle.u1;
import androidx.lifecycle.v1;
import e23.p;
import nn.j;
import nn.k;
import nn.l;
import o13.m;
import o13.r;
import o13.t;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.e2;
import r53.g2;
import r53.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0004*\u00020\u0003*\b\b\u0002\u0010\u0006*\u00020\u00052\u00020\u0007B\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lnn/c;", "Lnn/k;", "Event", "Lnn/l;", "UiState", "Lnn/j;", "Action", "Landroidx/lifecycle/u1;", "<init>", "()V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class c<Event extends k, UiState extends l, Action extends j> extends u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f126657a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f126658b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t f126659c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e2 f126660d = g2.b(0, 0, null, 7);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final q53.b f126661e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final e<Action> f126662f;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.activities.health.BaseViewModel$setEvent$1", f = "BaseViewModel.kt", l = {38}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f126663a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ c<Event, UiState, Action> f126664b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Event f126665c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(c<Event, UiState, Action> cVar, Event event, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f126664b = cVar;
            this.f126665c = event;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f126664b, this.f126665c, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f126663a;
            if (i14 == 0) {
                r.b(obj);
                e2 e2Var = this.f126664b.f126660d;
                this.f126663a = 1;
                if (e2Var.emit(this.f126665c, this) == aVar) {
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

    public c() {
        final int i14 = 0;
        this.f126657a = m.b(new e23.a(this) { // from class: nn.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c f126653b;

            {
                this.f126653b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                switch (i14) {
                    case 0:
                        return this.f126653b.B4();
                    case 1:
                        return new f((l) this.f126653b.f126657a.getValue());
                    default:
                        return this.f126653b.y4();
                }
            }
        });
        final int i15 = 1;
        this.f126658b = m.b(new e23.a(this) { // from class: nn.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c f126653b;

            {
                this.f126653b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                switch (i15) {
                    case 0:
                        return this.f126653b.B4();
                    case 1:
                        return new f((l) this.f126653b.f126657a.getValue());
                    default:
                        return this.f126653b.y4();
                }
            }
        });
        final int i16 = 2;
        this.f126659c = m.b(new e23.a(this) { // from class: nn.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c f126653b;

            {
                this.f126653b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                switch (i16) {
                    case 0:
                        return this.f126653b.B4();
                    case 1:
                        return new f((l) this.f126653b.f126657a.getValue());
                    default:
                        return this.f126653b.y4();
                }
            }
        });
        q53.b bVarA = q53.l.a(0, 7, null);
        this.f126661e = bVarA;
        this.f126662f = new e<>(s.F(bVarA));
        ge1.b.T(v1.a(this), null, null, new d(this, null), 3);
    }

    public final void A4(Event event) {
        event.getClass();
        ge1.b.T(v1.a(this), null, null, new a(this, event, null), 3);
    }

    public abstract UiState B4();

    public final void C4(e23.l<? super UiState, ? extends UiState> lVar) {
        y4().setValue(lVar.invoke(x4().getValue()));
    }

    public final g<UiState> x4() {
        return (g) this.f126659c.getValue();
    }

    public final f<UiState> y4() {
        return (f) this.f126658b.getValue();
    }

    public abstract void z4(Event event);
}
