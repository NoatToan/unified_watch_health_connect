package km0;

import android.location.Location;
import e23.p;
import o13.r;
import o53.b0;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.p2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.group.create.GroupCreationViewModel$requestLocation$1", f = "GroupCreationViewModel.kt", l = {295, 297}, m = "invokeSuspend", v = 2)
public final class j extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f105381a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f105382b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.a<Unit> f105383c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(i iVar, e23.a<Unit> aVar, t13.d<? super j> dVar) {
        super(2, dVar);
        this.f105382b = iVar;
        this.f105383c = aVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new j(this.f105382b, this.f105383c, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((j) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0066, code lost:
    
        if (r0 == r6) goto L22;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        p2 p2Var;
        Object value;
        Object value2;
        Object objD;
        Object objT;
        String str;
        p2 p2Var2;
        Object value3;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f105381a;
        i iVar = this.f105382b;
        try {
            if (i14 == 0) {
                r.b(obj);
                p2 p2Var3 = iVar.f105339f;
                do {
                    value2 = p2Var3.getValue();
                } while (!q6.f.z(((Number) value2).intValue() + 1, p2Var3, value2));
                mv0.e eVar = iVar.f105334a;
                this.f105381a = 1;
                objD = eVar.d("GroupCreationViewModel", (4 & 2) != 0 ? 102 : 100, (4 & 4) != 0 ? 30000L : 60000L, this);
                if (objD == aVar) {
                }
                return aVar;
            }
            if (i14 == 1) {
                r.b(obj);
                objD = obj;
            } else {
                if (i14 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
                objT = obj;
            }
            o13.p pVar = (o13.p) objT;
            String str2 = (String) pVar.f128594a;
            String str3 = (String) pVar.f128595b;
            if (str3 == null || str2 == null) {
                if (str2 == null) {
                    if (str3 == null) {
                        throw new Exception("Unable to locate coordinate");
                    }
                    str = str3;
                }
                p2Var2 = iVar.f105337d;
                do {
                    value3 = p2Var2.getValue();
                } while (!p2Var2.b(value3, b.a((b) value3, null, null, null, str, null, null, null, null, null, null, null, 2039)));
                p2Var = iVar.f105339f;
                do {
                    value = p2Var.getValue();
                } while (!q6.f.z(((Number) value).intValue() - 1, p2Var, value));
                return Unit.INSTANCE;
            }
            str2 = str3 + ", " + str2;
            str = str2;
            p2Var2 = iVar.f105337d;
            do {
                value3 = p2Var2.getValue();
            } while (!p2Var2.b(value3, b.a((b) value3, null, null, null, str, null, null, null, null, null, null, null, 2039)));
            p2Var = iVar.f105339f;
            do {
                value = p2Var.getValue();
            } while (!q6.f.z(((Number) value).intValue() - 1, p2Var, value));
            return Unit.INSTANCE;
            Location location = (Location) objD;
            if (location == null) {
                throw new Exception("Location not found");
            }
            jm0.b bVar = (jm0.b) KoinJavaComponent.get$default(jm0.b.class, null, null, 6, null);
            double latitude = location.getLatitude();
            double longitude = location.getLongitude();
            this.f105381a = 2;
            objT = bVar.t(latitude, longitude, this);
        } catch (Exception unused) {
            this.f105383c.invoke();
        }
    }
}
