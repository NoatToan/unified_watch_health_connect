package yp2;

import com.garmin.android.apps.connectmobile.R;
import e23.p;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import tn2.u0;
import v13.i;
import vb.h;
import xa2.g;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lyp2/f;", "Lpo2/b;", "Lyp2/a;", "Lyp2/c;", "Lyp2/b;", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public class f extends po2.b<yp2.a, c> implements yp2.b {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.feature.garminpay.providers.gpay.ui.transitrefund.NewFitPayTransitRefundPresenter$onMVPReady$1", f = "NewFitPayTransitRefundPresenter.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends i implements p<b0, t13.d<? super Unit>, Object> {
        public a(t13.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return f.this.new a(dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            f fVar = f.this;
            c cVar = (c) fVar.getView();
            String string = ((c) fVar.getView()).getF52032a().getString(R.string.wallet_message_unable_to_process_refund, ((yp2.a) fVar.f0()).d());
            string.getClass();
            cVar.h5(string);
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.feature.garminpay.providers.gpay.ui.transitrefund.NewFitPayTransitRefundPresenter$onSubmitClicked$1", f = "NewFitPayTransitRefundPresenter.kt", l = {19}, m = "invokeSuspend", v = 2)
    public static final class b extends i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f198710a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f198712c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f198713d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, String str2, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f198712c = str;
            this.f198713d = str2;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return f.this.new b(this.f198712c, this.f198713d, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f198710a;
            f fVar = f.this;
            try {
                if (i14 == 0) {
                    r.b(obj);
                    vq2.e eVar = (vq2.e) fVar.getView();
                    int i15 = vq2.e.f179461z0;
                    eVar.S5(null, null);
                    yp2.a aVar2 = (yp2.a) fVar.f0();
                    String str = this.f198712c;
                    String str2 = this.f198713d;
                    this.f198710a = 1;
                    if (aVar2.F0(str, str2, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i14 != 1) {
                        h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    r.b(obj);
                }
                ((c) fVar.getView()).hideProgressOverlay();
                ((c) fVar.getView()).Z5(new g(fVar, 24));
                return Unit.INSTANCE;
            } catch (Throwable th3) {
                try {
                    ((c) fVar.getView()).Z5(new u0(th3, 1));
                    return Unit.INSTANCE;
                } finally {
                    ((c) fVar.getView()).hideProgressOverlay();
                }
            }
        }
    }

    @Override // yp2.b
    public final void D(String str, String str2) {
        str.getClass();
        str2.getClass();
        gl.b.I(((c) getView()).getF51710i(), null, new b(str, str2, null), 3);
    }

    @Override // sy2.d
    public final void a0() {
        gl.b.I(((c) getView()).getF51710i(), null, new a(null), 3);
    }
}
