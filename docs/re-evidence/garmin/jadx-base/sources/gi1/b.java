package gi1;

import a6.g;
import c22.w2;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import f12.l;
import o13.q;
import org.apache.commons.lang3.e;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import r53.s;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lgi1/b;", "Lgi1/a;", "Lf12/l;", "userSettings", "<init>", "(Lf12/l;)V", "a", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b implements gi1.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f77485a;

    static {
        new a(null);
    }

    public b(l lVar) {
        lVar.getClass();
        this.f77485a = lVar;
    }

    @Override // gi1.a
    public final r53.b a(long j8) {
        return s.f(new w2(new g(this, j8, 2), this.f77485a, e.e(j8, "device_location_"), null));
    }

    @Override // gi1.a
    public final Object b(long j8, fi1.b bVar) {
        bVar.getClass();
        try {
            n63.b.a aVar = n63.b.f123892d;
            aVar.getClass();
            String strB = aVar.b(fi1.b.INSTANCE.serializer(), bVar);
            this.f77485a.S("device_location_" + j8, strB);
            int i14 = q.f128596b;
            return Unit.INSTANCE;
        } catch (Exception e4) {
            i2.a aVar2 = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar2.getClass();
            i2.a.g(a2Var, "DeviceLocationPreferencesImpl", e4);
            int i15 = q.f128596b;
            return new q.b(e4);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lgi1/b$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "KEY_DEVICE_LOCATION_PREFIX", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
