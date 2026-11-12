package qr;

import com.garmin.android.apps.connectmobile.segments.model.SegmentDetailsListDTO;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042*\u0010\u0003\u001a&\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001 \u0002*\u0012\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lfw/m;", "Lcom/garmin/android/apps/connectmobile/segments/model/SegmentDetailsListDTO;", "kotlin.jvm.PlatformType", "result", "", "<anonymous>", "(Lfw/m;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.activity.details.presentation.ActivityDetailsViewModel$getSegments$1", f = "ActivityDetailsViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class p3 extends v13.i implements e23.p<fw.m<? extends SegmentDetailsListDTO>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f146420a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t f146421b;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f146422a;

        static {
            int[] iArr = new int[fw.p.values().length];
            try {
                iArr[fw.p.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[fw.p.ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f146422a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p3(t tVar, t13.d<? super p3> dVar) {
        super(2, dVar);
        this.f146421b = tVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        p3 p3Var = new p3(this.f146421b, dVar);
        p3Var.f146420a = obj;
        return p3Var;
    }

    @Override // e23.p
    public final Object invoke(fw.m<? extends SegmentDetailsListDTO> mVar, t13.d<? super Unit> dVar) {
        return ((p3) create(mVar, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        fw.m mVar = (fw.m) this.f146420a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        int i14 = a.f146422a[mVar.f73769b.ordinal()];
        if (i14 == 1) {
            int i15 = t.A2;
            ((r53.z1) this.f146421b.f146564v1.getValue()).setValue((SegmentDetailsListDTO) mVar.f73770c);
        } else if (i14 != 2) {
            com.garmin.android.apps.connectmobile.a2 a2Var = com.garmin.android.apps.connectmobile.a2.ACTIVITIES;
            com.garmin.android.apps.connectmobile.i2.f36769a.getClass();
            com.garmin.android.apps.connectmobile.i2.a.k(a2Var, "ActivityDetailsViewModel", "Loading activity segments");
        } else {
            com.garmin.android.apps.connectmobile.a2 a2Var2 = com.garmin.android.apps.connectmobile.a2.ACTIVITIES;
            String str = "Error fetching activity segments: " + mVar.f73771d;
            com.garmin.android.apps.connectmobile.i2.f36769a.getClass();
            com.garmin.android.apps.connectmobile.i2.a.f(a2Var2, "ActivityDetailsViewModel", str);
        }
        return Unit.INSTANCE;
    }
}
