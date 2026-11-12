package yp2;

import c83.a0;
import com.garmin.feature.garminpay.providers.gpay.NewFitPayException;
import com.nimbusds.jose.jwk.JWKParameterNames;
import e23.p;
import fo2.d0;
import o13.r;
import o53.b0;
import o53.s0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import v13.i;
import vb.h;
import zn2.u0;
import zn2.z;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\n\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u001f\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ \u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0004H\u0096@¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0006\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0010\u001a\u0004\b\u0013\u0010\u0012R\u001a\u0010\u0007\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0010\u001a\u0004\b\u0015\u0010\u0012¨\u0006\u0016"}, d2 = {"Lyp2/e;", "Lsy2/a;", "Lyp2/b;", "Lyp2/a;", "", "cardName", "userId", "refundId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "accountId", "accountName", "", "F0", "(Ljava/lang/String;Ljava/lang/String;Lt13/d;)Ljava/lang/Object;", "c", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "getUserId", JWKParameterNames.RSA_EXPONENT, "H0", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e extends sy2.a<b> implements yp2.a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f198701f = 8;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final String cardName;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final String userId;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final String refundId;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.feature.garminpay.providers.gpay.ui.transitrefund.NewFitPayTransitRefundModel$submitAlipayAccount$2", f = "NewFitPayTransitRefundModel.kt", l = {25}, m = "invokeSuspend", v = 2)
    public static final class a extends i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f198705a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f198707c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f198708d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, String str2, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f198707c = str;
            this.f198708d = str2;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return e.this.new a(this.f198707c, this.f198708d, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) throws NewFitPayException {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f198705a;
            if (i14 == 0) {
                r.b(obj);
                u0 u0Var = u0.f205864a;
                e eVar = e.this;
                String userId = eVar.getUserId();
                String refundId = eVar.getRefundId();
                d0 d0Var = new d0(this.f198707c, this.f198708d);
                this.f198705a = 1;
                u0Var.getClass();
                obj = u0.g().D(userId, refundId, d0Var, this);
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
            if (((a0) obj).f25745a.isSuccessful()) {
                return Unit.INSTANCE;
            }
            throw new NewFitPayException("Call new fitpay refund api failed", z.REFUND_FAILED, null, 4, null);
        }
    }

    public e(String str, String str2, String str3) {
        com.airbnb.lottie.animation.keyframe.a.y(str, str2, str3);
        this.cardName = str;
        this.userId = str2;
        this.refundId = str3;
    }

    @Override // yp2.a
    public Object F0(String str, String str2, t13.d<? super Unit> dVar) throws Throwable {
        x53.c cVar = s0.f129406a;
        Object objE0 = ge1.b.e0(x53.b.f189152a, new a(str, str2, null), dVar);
        return objE0 == u13.a.COROUTINE_SUSPENDED ? objE0 : Unit.INSTANCE;
    }

    @Override // yp2.a
    /* JADX INFO: renamed from: H0, reason: from getter */
    public String getRefundId() {
        return this.refundId;
    }

    @Override // yp2.a
    /* JADX INFO: renamed from: d, reason: from getter */
    public String getCardName() {
        return this.cardName;
    }

    @Override // yp2.a
    public String getUserId() {
        return this.userId;
    }
}
