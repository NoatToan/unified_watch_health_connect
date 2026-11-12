package o22;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import e23.p;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.a2;
import r53.e2;
import r53.g2;
import r53.s;
import t13.d;
import v13.e;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lo22/b;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lo53/b0;", "coroutineScope", "<init>", "(Landroid/content/Context;Lo53/b0;)V", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f128679a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b0 f128680b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e2 f128681c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a2 f128682d;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @e(c = "com.garmin.android.apps.connectmobile.util.snackbar.domain.SnackbarUseCase$showSnackbarMessage$1", f = "SnackbarUseCase.kt", l = {22}, m = "invokeSuspend", v = 2)
    public static final class a extends i implements p<b0, d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f128683a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ p22.a f128685c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(p22.a aVar, d<? super a> dVar) {
            super(2, dVar);
            this.f128685c = aVar;
        }

        @Override // v13.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return b.this.new a(this.f128685c, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f128683a;
            if (i14 == 0) {
                r.b(obj);
                e2 e2Var = b.this.f128681c;
                this.f128683a = 1;
                if (e2Var.emit(this.f128685c, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public b(Context context, b0 b0Var) {
        context.getClass();
        b0Var.getClass();
        this.f128679a = context;
        this.f128680b = b0Var;
        e2 e2VarB = g2.b(0, 0, null, 7);
        this.f128681c = e2VarB;
        this.f128682d = s.c(e2VarB);
    }

    public final void a() {
        b(new p22.a(this.f128679a.getString(R.string.txt_something_went_wrong_try_again), null, null, 6, null));
    }

    public final void b(p22.a aVar) {
        ge1.b.T(this.f128680b, null, null, new a(aVar, null), 3);
    }
}
