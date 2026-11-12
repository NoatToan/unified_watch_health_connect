package h31;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import j31.z0;
import org.koin.core.qualifier.QualifierKt;
import org.koin.java.KoinJavaComponent;

/* JADX INFO: loaded from: classes9.dex */
public final class d {
    public static final z0 a(d31.d dVar) {
        dVar.getClass();
        try {
            return (z0) KoinJavaComponent.get$default(z0.class, QualifierKt.named(dVar), null, 4, null);
        } catch (Exception e4) {
            i2.a aVar = i2.f36769a;
            aVar.getClass();
            i2.a.o(a2.DASHBOARD, "Failed to get onboarding item handler: " + dVar + " -> " + e4);
            return null;
        }
    }
}
