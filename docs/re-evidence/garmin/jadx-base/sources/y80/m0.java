package y80;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.Pair;
import java.util.LinkedHashMap;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "Lhv/a;", "<anonymous>", "(Lo53/b0;)Lhv/a;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.device.setup.data.DeviceStorageRepository$getDeviceSyncTutorial$2", f = "DeviceStorageRepository.kt", l = {221}, m = "invokeSuspend", v = 2)
public final class m0 extends v13.i implements e23.p<o53.b0, t13.d<? super hv.a>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b0 f195180a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public br1.a f195181b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f195182c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b0 f195183d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zb0.u0 f195184e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(b0 b0Var, zb0.u0 u0Var, t13.d<? super m0> dVar) {
        super(2, dVar);
        this.f195183d = b0Var;
        this.f195184e = u0Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new m0(this.f195183d, this.f195184e, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super hv.a> dVar) {
        return ((m0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        b0 b0Var;
        br1.a aVar;
        List<er1.c> listA;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f195182c;
        if (i14 == 0) {
            o13.r.b(obj);
            int i15 = b0.f195089e;
            b0Var = this.f195183d;
            br1.a aVarB = b0Var.b(this.f195184e, null, null);
            if (aVarB != null) {
                String str = aVarB.f19574a;
                this.f195180a = b0Var;
                this.f195181b = aVarB;
                this.f195182c = 1;
                Object objG = b0Var.g(str, this);
                if (objG == aVar2) {
                    return aVar2;
                }
                aVar = aVarB;
                obj = objG;
            }
            return null;
        }
        if (i14 != 1) {
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        br1.a aVar3 = this.f195181b;
        b0Var = this.f195180a;
        o13.r.b(obj);
        aVar = aVar3;
        er1.a aVar4 = (er1.a) obj;
        if (aVar4 != null) {
            a0 a0Var = b0Var.f195093d;
            Context context = b0Var.f195090a;
            aVar.getClass();
            List<er1.b> listC = aVar4.c();
            if (listC != null) {
                LinkedHashMap<Pair<Integer, Integer>, Drawable> linkedHashMap = new LinkedHashMap<>();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                int i16 = 0;
                for (Object obj2 : listC) {
                    int i17 = i16 + 1;
                    if (i16 < 0) {
                        p13.x.q();
                        throw null;
                    }
                    er1.b bVar = (er1.b) obj2;
                    if (bVar != null && (listA = bVar.a()) != null) {
                        r0 r0VarB = a0Var.b(context, aVar, linkedHashMap, listA, null, i16);
                        linkedHashMap2.put(new jt2.a(r0VarB.f195211a, r0VarB.f195213c), r0VarB.f195212b);
                    }
                    i16 = i17;
                }
                return new hv.a(linkedHashMap2, null, null, linkedHashMap);
            }
        }
        return null;
    }
}
