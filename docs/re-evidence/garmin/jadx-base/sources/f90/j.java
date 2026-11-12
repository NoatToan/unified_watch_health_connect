package f90;

import androidx.room.a0;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import java.util.ArrayList;
import p005kotlin.Metadata;
import p13.x;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lf90/j;", "", "<init>", "()V", "a", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class j {
    static {
        new a(null);
    }

    public static ArrayList a(boolean z14) {
        ArrayList arrayListM = x.m(q92.x.DI_CONNECT_UPLOAD);
        if (z14) {
            arrayListM.add(q92.x.DI_CONNECT_AUTO_ACTIVITY_DETECTION);
        }
        a2 a2Var = a2.DEVICE_SETUP;
        String strK = a0.k("Required consents for device setup flow ", arrayListM);
        i2.f36769a.getClass();
        i2.a.b(a2Var, "GetRequiredConsentsUseCase", strK);
        return arrayListM;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lf90/j$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
