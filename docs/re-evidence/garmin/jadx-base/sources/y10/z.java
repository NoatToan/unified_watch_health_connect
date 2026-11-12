package y10;

import androidx.lifecycle.v1;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.connectiq.viewmodel.ConnectIQDownloadViewModel$onCIQItemAdded$1", f = "ConnectIQDownloadViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class z extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f194018a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.connectiq.y.a f194019b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ k f194020c;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f194021a;

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
            f194021a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(com.garmin.android.apps.connectmobile.connectiq.y.a aVar, k kVar, t13.d<? super z> dVar) {
        super(2, dVar);
        this.f194019b = aVar;
        this.f194020c = kVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        z zVar = new z(this.f194019b, this.f194020c, dVar);
        zVar.f194018a = obj;
        return zVar;
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((z) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        o10.b bVar = this.f194019b.f32092a;
        k kVar = this.f194020c;
        com.garmin.android.apps.connectmobile.connectiq.l lVar = kVar.f193902a;
        com.garmin.android.apps.connectmobile.connectiq.l lVar2 = kVar.f193902a;
        int i14 = a.f194021a[lVar.ordinal()];
        if (i14 == 1) {
            kVar.f193915n.remove(bVar.f());
            bVar.H(true);
            kVar.f193914m.put(bVar.f(), bVar);
            kVar.f193917p.m(new n0.b(kVar.E4(), kVar.G4(lVar2), false, null, 12, null));
        } else if (i14 != 2) {
            p92.y.f136664a.getClass();
            p92.y.a.b("onCIQItemAdded action not implemented for app tyoe " + lVar2);
        } else {
            ge1.b.T(v1.a(kVar), null, null, new v(kVar, bVar, null), 3);
        }
        return Unit.INSTANCE;
    }
}
