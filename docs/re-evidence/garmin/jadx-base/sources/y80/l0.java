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
@v13.e(c = "com.garmin.android.apps.connectmobile.device.setup.data.DeviceStorageRepository$getDevicePairTutorial$2", f = "DeviceStorageRepository.kt", l = {183}, m = "invokeSuspend", v = 2)
public final class l0 extends v13.i implements e23.p<o53.b0, t13.d<? super hv.a>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b0 f195172a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f195173b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public br1.a f195174c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f195175d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ b0 f195176e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ zb0.u0 f195177f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f195178g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ String f195179h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(b0 b0Var, zb0.u0 u0Var, String str, String str2, t13.d<? super l0> dVar) {
        super(2, dVar);
        this.f195176e = b0Var;
        this.f195177f = u0Var;
        this.f195178g = str;
        this.f195179h = str2;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new l0(this.f195176e, this.f195177f, this.f195178g, this.f195179h, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super hv.a> dVar) {
        return ((l0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        b0 b0Var;
        String str;
        br1.a aVar;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f195175d;
        if (i14 == 0) {
            o13.r.b(obj);
            zb0.u0 u0Var = this.f195177f;
            String str2 = this.f195178g;
            b0 b0Var2 = this.f195176e;
            String str3 = this.f195179h;
            br1.a aVarB = b0Var2.b(u0Var, str2, str3);
            if (aVarB != null) {
                String str4 = aVarB.f19574a;
                this.f195172a = b0Var2;
                this.f195173b = str3;
                this.f195174c = aVarB;
                this.f195175d = 1;
                Object objG = b0Var2.g(str4, this);
                if (objG == aVar2) {
                    return aVar2;
                }
                b0Var = b0Var2;
                str = str3;
                aVar = aVarB;
                obj = objG;
            }
            return null;
        }
        if (i14 != 1) {
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        br1.a aVar3 = this.f195174c;
        String str5 = this.f195173b;
        b0Var = this.f195172a;
        o13.r.b(obj);
        aVar = aVar3;
        str = str5;
        er1.a aVar4 = (er1.a) obj;
        if (aVar4 != null) {
            b0 b0Var3 = b0Var;
            a0 a0Var = b0Var3.f195093d;
            Context context = b0Var3.f195090a;
            aVar.getClass();
            List<er1.c> listB = aVar4.b();
            if (listB != null) {
                LinkedHashMap<Pair<Integer, Integer>, Drawable> linkedHashMap = new LinkedHashMap<>();
                r0 r0VarB = a0Var.b(context, aVar, linkedHashMap, listB, str, 0);
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                linkedHashMap2.put(new jt2.a(r0VarB.f195211a, r0VarB.f195213c), r0VarB.f195212b);
                return new hv.a(linkedHashMap2, null, null, linkedHashMap);
            }
        }
        return null;
    }
}
