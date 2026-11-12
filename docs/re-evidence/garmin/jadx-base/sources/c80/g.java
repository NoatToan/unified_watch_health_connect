package c80;

import m63.q1;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lc80/g;", "Li63/c;", "Lc80/f;", "<init>", "()V", "gcm-domain-subscription_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class g implements i63.c<f> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f25372a = new g();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final q1 f25373b = k63.k.a("com.garmin.android.apps.connectmobile.data.model.CustomerAction", k63.d.f.f103229a);

    private g() {
    }

    @Override // i63.b
    public final Object deserialize(l63.e eVar) {
        eVar.getClass();
        int iU = eVar.u();
        w13.c cVar = f.f25366e;
        return (f) ((iU < 0 || iU >= cVar.getF134922d()) ? f.UNKNOWN : cVar.get(iU));
    }

    @Override // i63.i, i63.b
    /* JADX INFO: renamed from: getDescriptor */
    public final k63.e getF116204b() {
        return f25373b;
    }

    @Override // i63.i
    public final void serialize(l63.f fVar, Object obj) {
        f fVar2 = (f) obj;
        fVar2.getClass();
        fVar.o(fVar2.ordinal());
    }
}
