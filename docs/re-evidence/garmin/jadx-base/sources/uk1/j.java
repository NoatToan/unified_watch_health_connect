package uk1;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import o13.t;
import p005kotlin.Metadata;
import uf2.p0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Luk1/j;", "Lcom/garmin/android/library/backgroundtaskmanagement/a;", "<init>", "()V", "a", "gcm-domain-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class j extends com.garmin.android.library.backgroundtaskmanagement.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f171905b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final t f171906c = o13.m.b(new p0(18));

    private j() {
    }

    public static j M() {
        j jVar = new j();
        a2 a2Var = a2.SETTINGS;
        i2.f36769a.getClass();
        i2.a.b(a2Var, "PowerZonesBizManager", "PowerZonesBizManager created");
        return jVar;
    }

    public static final synchronized j N() {
        return f171905b.a();
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Luk1/j$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-domain-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public final synchronized j a() {
            return (j) j.f171906c.getValue();
        }

        private a() {
        }
    }
}
