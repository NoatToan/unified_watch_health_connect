package y10;

import com.garmin.proto.generated.GDIConnectIQInstalledApps;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.UUID;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.connectiq.viewmodel.ConnectIQDownloadViewModel$onCIQItemRemoved$1", f = "ConnectIQDownloadViewModel.kt", l = {382}, m = "invokeSuspend", v = 2)
public final class a0 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public o10.b f193770a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f193771b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f193772c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.connectiq.y.a f193773d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ k f193774e;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f193775a;

        static {
            int[] iArr = new int[com.garmin.android.apps.connectmobile.connectiq.l.values().length];
            try {
                iArr[com.garmin.android.apps.connectmobile.connectiq.l.APPS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[com.garmin.android.apps.connectmobile.connectiq.l.WIDGETS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f193775a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(com.garmin.android.apps.connectmobile.connectiq.y.a aVar, k kVar, t13.d<? super a0> dVar) {
        super(2, dVar);
        this.f193773d = aVar;
        this.f193774e = kVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        a0 a0Var = new a0(this.f193773d, this.f193774e, dVar);
        a0Var.f193772c = obj;
        return a0Var;
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((a0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) throws CloneNotSupportedException {
        o10.b bVar;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f193771b;
        k kVar = this.f193774e;
        if (i14 == 0) {
            o13.r.b(obj);
            o10.b bVar2 = this.f193773d.f32092a;
            com.garmin.android.apps.connectmobile.connectiq.l lVar = kVar.f193902a;
            com.garmin.android.apps.connectmobile.connectiq.l lVar2 = kVar.f193902a;
            LinkedHashMap<String, o10.b> linkedHashMap = kVar.f193915n;
            int i15 = a.f193775a[lVar.ordinal()];
            if (i15 == 1) {
                kVar.f193914m.remove(bVar2.f());
                bVar2.H(false);
                Object objClone = linkedHashMap.clone();
                objClone.getClass();
                linkedHashMap.clear();
                linkedHashMap.putAll((HashMap) objClone);
                linkedHashMap.put(bVar2.f(), bVar2);
                kVar.f193917p.m(new n0.b(kVar.E4(), kVar.G4(lVar2), false, null, 12, null));
            } else if (i15 != 2) {
                p92.y.f136664a.getClass();
                p92.y.a.b("onCIQItemAdded action not implemented for app tyoe " + lVar2);
            } else if (kVar.f193922w) {
                bVar2.G(true);
                linkedHashMap.remove(bVar2.f());
                kVar.f193916o.put(bVar2.f(), bVar2);
                kVar.K4(null, new j(kVar, 0));
            } else {
                this.f193772c = null;
                this.f193770a = bVar2;
                this.f193771b = 1;
                Object objZ4 = k.z4(kVar, this);
                if (objZ4 == aVar) {
                    return aVar;
                }
                bVar = bVar2;
                obj = objZ4;
            }
            return Unit.INSTANCE;
        }
        if (i14 != 1) {
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        bVar = this.f193770a;
        o13.r.b(obj);
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        GDIConnectIQInstalledApps.AppType appType = GDIConnectIQInstalledApps.AppType.WIDGET;
        kVar.f193917p.m(n0.f.f193967a);
        UUID uuidFromString = UUID.fromString(bVar.f());
        bVar.G(true);
        kVar.f193906e.a(uuidFromString, appType, new e0(kVar, bVar, zBooleanValue));
        return Unit.INSTANCE;
    }
}
