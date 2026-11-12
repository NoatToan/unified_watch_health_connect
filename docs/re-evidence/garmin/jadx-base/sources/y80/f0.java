package y80;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.Pair;
import com.google.mlkit.common.MlKitException;
import java.util.LinkedHashMap;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "Lhv/a;", "<anonymous>", "(Lo53/b0;)Lhv/a;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.device.setup.data.DeviceStorageRepository$getDeviceGestureTutorial$2", f = "DeviceStorageRepository.kt", l = {MlKitException.CODE_SCANNER_APP_NAME_UNAVAILABLE}, m = "invokeSuspend", v = 2)
public final class f0 extends v13.i implements e23.p<o53.b0, t13.d<? super hv.a>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b0 f195119a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f195120b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public br1.a f195121c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f195122d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f195123e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ b0 f195124f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ zb0.u0 f195125g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ String f195126h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f195127i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(b0 b0Var, zb0.u0 u0Var, String str, boolean z14, t13.d<? super f0> dVar) {
        super(2, dVar);
        this.f195124f = b0Var;
        this.f195125g = u0Var;
        this.f195126h = str;
        this.f195127i = z14;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new f0(this.f195124f, this.f195125g, this.f195126h, this.f195127i, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super hv.a> dVar) {
        return ((f0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        b0 b0Var;
        br1.a aVarB;
        Object objG;
        String str;
        boolean z14;
        a0 a0Var;
        List<er1.c> listA;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f195123e;
        int i15 = 1;
        if (i14 == 0) {
            o13.r.b(obj);
            int i16 = b0.f195089e;
            b0Var = this.f195124f;
            aVarB = b0Var.b(this.f195125g, null, null);
            if (aVarB != null) {
                String str2 = aVarB.f19574a;
                this.f195119a = b0Var;
                String str3 = this.f195126h;
                this.f195120b = str3;
                this.f195121c = aVarB;
                boolean z15 = this.f195127i;
                this.f195122d = z15;
                this.f195123e = 1;
                objG = b0Var.g(str2, this);
                if (objG == aVar) {
                    return aVar;
                }
                str = str3;
                z14 = z15;
            }
            return null;
        }
        if (i14 != 1) {
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        z14 = this.f195122d;
        aVarB = this.f195121c;
        String str4 = this.f195120b;
        b0Var = this.f195119a;
        o13.r.b(obj);
        str = str4;
        objG = obj;
        br1.a aVar2 = aVarB;
        er1.a aVar3 = (er1.a) objG;
        if (aVar3 != null) {
            a0 a0Var2 = b0Var.f195093d;
            Context context = b0Var.f195090a;
            aVar2.getClass();
            List<er1.b> listA2 = aVar3.a();
            if (listA2 != null) {
                LinkedHashMap<Pair<Integer, Integer>, Drawable> linkedHashMap = new LinkedHashMap<>();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                int i17 = 0;
                for (Object obj2 : listA2) {
                    int i18 = i17 + 1;
                    if (i17 < 0) {
                        p13.x.q();
                        throw null;
                    }
                    er1.b bVar = (er1.b) obj2;
                    if (bVar == null || (listA = bVar.a()) == null) {
                        a0Var = a0Var2;
                    } else {
                        a0Var = a0Var2;
                        r0 r0VarB = a0Var.b(context, aVar2, linkedHashMap, listA, str, i17);
                        List<er1.b> listA3 = aVar3.a();
                        Object objValueOf = listA3 != null ? Integer.valueOf(listA3.size() - i15) : Boolean.FALSE;
                        if (!(objValueOf instanceof Integer) || i17 != ((Number) objValueOf).intValue() || !z14) {
                            linkedHashMap2.put(new jt2.a(r0VarB.f195211a, r0VarB.f195213c), r0VarB.f195212b);
                        }
                    }
                    a0Var2 = a0Var;
                    i17 = i18;
                    i15 = 1;
                }
                return new hv.a(linkedHashMap2, null, null, linkedHashMap);
            }
        }
        return null;
    }
}
