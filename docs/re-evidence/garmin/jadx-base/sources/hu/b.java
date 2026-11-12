package hu;

import androidx.room.a0;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.library.backgroundtaskmanagement.d;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\b\u0007\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001:\u0001\tB\u0019\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lhu/b;", "Lcom/garmin/android/library/backgroundtaskmanagement/b;", "", "Lcom/garmin/android/library/backgroundtaskmanagement/b$a;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "deviceUnitID", "<init>", "(Lcom/garmin/android/library/backgroundtaskmanagement/b$a;J)V", "a", "gcm-domain-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b extends com.garmin.android.library.backgroundtaskmanagement.b<Object> {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final long f85687l;

    /* JADX INFO: renamed from: hu.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"hu/b$b", "Lcom/garmin/android/library/backgroundtaskmanagement/d;", "gcm-domain-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C1700b extends d {
        public C1700b() {
            super(b.this);
        }

        @Override // com.garmin.android.library.backgroundtaskmanagement.f
        public final void a() {
            l80.b bVar = (l80.b) KoinJavaComponent.get$default(l80.b.class, null, null, 6, null);
            b bVar2 = b.this;
            bVar.i(bVar2.f85687l);
            String strF = a0.f(bVar2.f85687l, "Success. deviceUnitID[", "]");
            i2.a aVar = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar.getClass();
            i2.a.b(a2Var, "SettingsModifiedPokeGarminDeviceOperation", strF);
            c(com.garmin.android.library.backgroundtaskmanagement.b.c.SUCCESS);
        }

        @Override // com.garmin.android.library.backgroundtaskmanagement.d
        public final void b() {
        }
    }

    static {
        new a(null);
    }

    public b(com.garmin.android.library.backgroundtaskmanagement.b.a aVar, long j8) {
        super(com.garmin.android.library.backgroundtaskmanagement.b.d.BACKGROUND_PRIORITY, aVar);
        this.f85687l = j8;
        b(new C1700b());
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lhu/b$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-domain-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
