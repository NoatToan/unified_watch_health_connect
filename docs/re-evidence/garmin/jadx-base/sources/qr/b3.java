package qr;

import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lr53/j;", "Lcom/garmin/android/apps/connectmobile/v2;", "Lms1/d;", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.activity.details.presentation.ActivityDetailsViewModel$getLinkedTrail$1", f = "ActivityDetailsViewModel.kt", l = {2025, 2024}, m = "invokeSuspend", v = 2)
public final class b3 extends v13.i implements e23.p<r53.j<? super com.garmin.android.apps.connectmobile.v2<? extends ms1.d>>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public r53.j f146108a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f146109b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f146110c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f146111d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ t f146112e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f146113f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f146114g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b3(t tVar, long j8, long j14, t13.d<? super b3> dVar) {
        super(2, dVar);
        this.f146112e = tVar;
        this.f146113f = j8;
        this.f146114g = j14;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        b3 b3Var = new b3(this.f146112e, this.f146113f, this.f146114g, dVar);
        b3Var.f146111d = obj;
        return b3Var;
    }

    @Override // e23.p
    public final Object invoke(r53.j<? super com.garmin.android.apps.connectmobile.v2<? extends ms1.d>> jVar, t13.d<? super Unit> dVar) {
        return ((b3) create(jVar, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x008a, code lost:
    
        if (r8.emit(r0, r14) == r9) goto L28;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        long userProfilePk;
        Object objC;
        ps.a1 metadataDTO;
        ps.a2 userInfoDto;
        Long userProfilePk2;
        r53.j jVar = (r53.j) this.f146111d;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f146110c;
        if (i14 != 0) {
            if (i14 == 1) {
                long j8 = this.f146109b;
                jVar = this.f146108a;
                o13.r.b(obj);
                userProfilePk = j8;
                objC = obj;
            } else {
                if (i14 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            return Unit.INSTANCE;
        }
        o13.r.b(obj);
        userProfilePk = ((bv.d) KoinJavaComponent.get$default(bv.d.class, null, null, 6, null)).getUserProfilePk();
        t tVar = this.f146112e;
        am.d dVar = tVar.f146544o;
        ps.r value = tVar.W4().getValue();
        boolean z14 = (value == null || (metadataDTO = value.getMetadataDTO()) == null || (userInfoDto = metadataDTO.getUserInfoDto()) == null || (userProfilePk2 = userInfoDto.getUserProfilePk()) == null || userProfilePk != userProfilePk2.longValue()) ? false : true;
        this.f146111d = null;
        this.f146108a = jVar;
        this.f146109b = userProfilePk;
        this.f146110c = 1;
        objC = dVar.C(this.f146113f, this.f146114g, false, z14, this);
        if (objC != aVar) {
        }
        return aVar;
        this.f146111d = null;
        this.f146108a = null;
        this.f146109b = userProfilePk;
        this.f146110c = 2;
    }
}
