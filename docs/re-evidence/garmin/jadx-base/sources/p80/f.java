package p80;

import android.content.Context;
import android.content.IntentSender;
import androidx.lifecycle.u1;
import androidx.lifecycle.v1;
import e23.p;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.b2;
import r53.j;
import r53.k2;
import r53.p2;
import r53.q2;
import r53.s;
import r53.v;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lp80/f;", "Landroidx/lifecycle/u1;", "Ln80/a;", "device", "", "deviceSetupFlow", "Lm80/a;", "companionDeviceRepository", "Lic0/b;", "deviceInfoRepository", "<init>", "(Ln80/a;ZLm80/a;Lic0/b;)V", "gcm-domain-device_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class f extends u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n80.a f136368a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f136369b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m80.a f136370c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ic0.b f136371d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p2 f136372e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final b2 f136373f;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.device.companion.presentation.CompanionDeviceLinkViewModel$linkDevice$1", f = "CompanionDeviceLinkViewModel.kt", l = {53}, m = "invokeSuspend", v = 2)
    public static final class a extends i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f136374a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Context f136376c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f136376c = context;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return f.this.new a(this.f136376c, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            Object value;
            Object value2;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f136374a;
            f fVar = f.this;
            if (i14 == 0) {
                r.b(obj);
                p2 p2Var = fVar.f136372e;
                do {
                    value = p2Var.getValue();
                } while (!p2Var.b(value, d.a((d) value, null, true, false, 0, 27)));
                m80.a aVar2 = fVar.f136370c;
                n80.a aVar3 = fVar.f136368a;
                String str = aVar3.f124927a;
                String str2 = aVar3.f124929c;
                boolean z14 = aVar3.f124930d;
                this.f136374a = 1;
                obj = aVar2.f(this.f136376c, str, str2, z14, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            IntentSender intentSender = (IntentSender) obj;
            p2 p2Var2 = fVar.f136372e;
            do {
                value2 = p2Var2.getValue();
            } while (!p2Var2.b(value2, d.a((d) value2, intentSender, false, intentSender == null, 0, 17)));
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lr53/j;", "Lp80/d;", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.device.companion.presentation.CompanionDeviceLinkViewModel$uiState$1", f = "CompanionDeviceLinkViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class b extends i implements p<j<? super d>, t13.d<? super Unit>, Object> {
        public b(t13.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return f.this.new b(dVar);
        }

        @Override // e23.p
        public final Object invoke(j<? super d> jVar, t13.d<? super Unit> dVar) {
            return ((b) create(jVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            Object value;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            f fVar = f.this;
            e eVar = fVar.f136371d.e(fVar.f136368a.f124929c) ? e.SCREENLESS : e.DEFAULT;
            p2 p2Var = fVar.f136372e;
            do {
                value = p2Var.getValue();
            } while (!p2Var.b(value, d.a((d) value, null, false, false, fVar.f136369b ? eVar.f136367b : eVar.f136366a, 15)));
            return Unit.INSTANCE;
        }
    }

    public f(n80.a aVar, boolean z14, m80.a aVar2, ic0.b bVar) {
        aVar.getClass();
        aVar2.getClass();
        bVar.getClass();
        this.f136368a = aVar;
        this.f136369b = z14;
        this.f136370c = aVar2;
        this.f136371d = bVar;
        p2 p2VarA = q2.a(new d(aVar, null, false, false, 0, 30, null));
        this.f136372e = p2VarA;
        this.f136373f = s.K(new v(new b(null), p2VarA), v1.a(this), k2.a.a(k2.f150703a, 2), p2VarA.getValue());
    }

    public final void x4(Context context) {
        context.getClass();
        ge1.b.T(v1.a(this), null, null, new a(context, null), 3);
    }
}
