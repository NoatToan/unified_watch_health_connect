package jx2;

import com.garmin.proto.generated.SaMDEcg;
import com.garmin.samd.exception.GarminDeviceNotCapableException;
import lc.u0;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "Lcom/garmin/proto/generated/SaMDEcg$LaunchResponse$ResponseStatus;", "<anonymous>", "(Lo53/b0;)Lcom/garmin/proto/generated/SaMDEcg$LaunchResponse$ResponseStatus;"}, k = 3, mv = {1, 9, 0})
@v13.e(c = "com.garmin.samd.manager.SaMDDeviceManager$launchFeature$2", f = "SaMDDeviceManager.kt", l = {181}, m = "invokeSuspend")
public final class n extends v13.i implements e23.p<b0, t13.d<? super SaMDEcg.LaunchResponse.ResponseStatus>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f101574a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kx2.a f101575b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r f101576c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f101577d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f101578e;

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f101579a;

        static {
            int[] iArr = new int[kx2.a.values().length];
            try {
                iArr[kx2.a.ECG.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f101579a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(kx2.a aVar, r rVar, long j8, String str, t13.d<? super n> dVar) {
        super(2, dVar);
        this.f101575b = aVar;
        this.f101576c = rVar;
        this.f101577d = j8;
        this.f101578e = str;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new n(this.f101575b, this.f101576c, this.f101577d, this.f101578e, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super SaMDEcg.LaunchResponse.ResponseStatus> dVar) {
        return ((n) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) throws GarminDeviceNotCapableException {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f101574a;
        if (i14 == 0) {
            o13.r.b(obj);
            int[] iArr = a.f101579a;
            kx2.a aVar2 = this.f101575b;
            if (iArr[aVar2.ordinal()] != 1) {
                u0.r();
                return null;
            }
            px2.e eVarI = r.i(this.f101576c, this.f101577d, this.f101578e, aVar2);
            this.f101574a = 1;
            obj = eVarI.f(this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        return (SaMDEcg.LaunchResponse.ResponseStatus) obj;
    }
}
