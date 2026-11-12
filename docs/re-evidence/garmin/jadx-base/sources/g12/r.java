package g12;

import am.x0;
import androidx.lifecycle.y0;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.v2;
import java.util.List;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.h0;
import retrofit2.HttpException;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.userprofile.UserProfileViewModel$fetchUserProfileStats$1", f = "UserProfileViewModel.kt", l = {243, 252}, m = "invokeSuspend", v = 2)
public final class r extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public com.garmin.android.apps.connectmobile.repcounting.model.f f74926a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f74927b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.userprofile.i f74928c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c83.d<j12.m> f74929d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(com.garmin.android.apps.connectmobile.userprofile.i iVar, c83.d<j12.m> dVar, t13.d<? super r> dVar2) {
        super(2, dVar2);
        this.f74928c = iVar;
        this.f74929d = dVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new r(this.f74928c, this.f74929d, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((r) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0071 A[Catch: HttpException -> 0x0014, Exception -> 0x0092, TryCatch #2 {HttpException -> 0x0014, Exception -> 0x0092, blocks: (B:7:0x0010, B:25:0x0069, B:27:0x0071, B:29:0x0077, B:31:0x007d, B:32:0x0080, B:21:0x005a), top: B:38:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:29:0x0077 A[Catch: HttpException -> 0x0014, Exception -> 0x0092, TryCatch #2 {HttpException -> 0x0014, Exception -> 0x0092, blocks: (B:7:0x0010, B:25:0x0069, B:27:0x0071, B:29:0x0077, B:31:0x007d, B:32:0x0080, B:21:0x005a), top: B:38:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:30:0x007c  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        com.garmin.android.apps.connectmobile.repcounting.model.f fVarB;
        com.garmin.android.apps.connectmobile.repcounting.model.f fVar;
        j12.m mVar;
        List<j12.f> listG;
        List<j12.f> listM0;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f74927b;
        com.garmin.android.apps.connectmobile.userprofile.i iVar = this.f74928c;
        try {
            if (i14 == 0) {
                o13.r.b(obj);
                ru1.d dVar = (ru1.d) iVar.f46753e.getValue();
                x0 x0Var = x0.f4309n1;
                this.f74927b = 1;
                obj = ru1.d.a(dVar, x0Var, this);
                if (obj != aVar) {
                }
                return aVar;
            }
            if (i14 == 1) {
                o13.r.b(obj);
            } else {
                if (i14 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                fVar = this.f74926a;
                o13.r.b(obj);
            }
            mVar = (j12.m) obj;
            if (mVar.g() != null) {
                listG = mVar.g();
                if (listG != null) {
                    listM0 = h0.M0(listG);
                } else {
                    listM0 = null;
                }
                mVar.q(listM0);
            }
            mVar.o(fVar);
            y0<g3<j12.m>> y0Var = iVar.f46758j;
            g3.f35298f.getClass();
            y0Var.j(g3.a.d(mVar));
            return Unit.INSTANCE;
            v2 v2Var = (v2) obj;
            if (v2Var instanceof v2.b) {
                com.garmin.android.apps.connectmobile.repcounting.model.d.b bVar = com.garmin.android.apps.connectmobile.repcounting.model.d.f41101j;
                String str = (String) ((v2.b) v2Var).f47386a;
                bVar.getClass();
                fVarB = com.garmin.android.apps.connectmobile.repcounting.model.d.b.b(str);
            } else {
                com.garmin.android.apps.connectmobile.repcounting.model.d.f41101j.getClass();
                fVarB = com.garmin.android.apps.connectmobile.repcounting.model.d.b.b("");
            }
            c83.d<j12.m> dVar2 = this.f74929d;
            this.f74926a = fVarB;
            this.f74927b = 2;
            Object objA = c83.m.a(dVar2, this);
            if (objA != aVar) {
                fVar = fVarB;
                obj = objA;
                mVar = (j12.m) obj;
                if (mVar.g() != null) {
                    listG = mVar.g();
                    if (listG != null) {
                        listM0 = h0.M0(listG);
                    } else {
                        listM0 = null;
                    }
                    mVar.q(listM0);
                }
                mVar.o(fVar);
                y0<g3<j12.m>> y0Var2 = iVar.f46758j;
                g3.f35298f.getClass();
                y0Var2.j(g3.a.d(mVar));
                return Unit.INSTANCE;
            }
            return aVar;
        } catch (HttpException e4) {
            iVar.f46758j.j(g3.a.a(g3.f35298f, null, null, null, new Integer(e4.code()), 7));
        } catch (Exception unused) {
            iVar.f46758j.j(g3.a.a(g3.f35298f, null, null, null, null, 15));
        }
    }
}
