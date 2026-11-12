package r90;

import android.content.Context;
import android.provider.Settings;
import androidx.core.view.j;
import androidx.room.a0;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.gncs.GNCSListenerService;
import d53.w;
import j22.g;
import java.util.ArrayList;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lr90/b;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lm80/a;", "companionDeviceRepository", "<init>", "(Landroid/content/Context;Lm80/a;)V", "a", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f151356a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m80.a f151357b;

    /* JADX INFO: renamed from: r90.b$b, reason: collision with other inner class name */
    public static final /* synthetic */ class C2847b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f151358a;

        static {
            int[] iArr = new int[r90.a.values().length];
            try {
                iArr[r90.a.f151345c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[r90.a.f151346d.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f151358a = iArr;
        }
    }

    static {
        new a(null);
    }

    public b(Context context, m80.a aVar) {
        context.getClass();
        aVar.getClass();
        this.f151356a = context;
        this.f151357b = aVar;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x004b  */
    public final ArrayList a(List list) {
        ArrayList arrayListL = j.l(list);
        for (Object obj : list) {
            r90.a aVar = (r90.a) obj;
            int i14 = C2847b.f151358a[aVar.ordinal()];
            boolean z14 = false;
            Context context = this.f151356a;
            if (i14 != 1) {
                if (i14 != 2) {
                    g gVar = aVar.f151353a;
                    if (gVar != null) {
                        j22.b.f96736a.getClass();
                        z14 = !j22.b.p(context, gVar);
                    }
                } else {
                    j22.b.f96736a.getClass();
                    if (j22.b.n() && !j22.b.p(context, g.f96765j)) {
                        z14 = true;
                    }
                }
            } else if (this.f151357b.a()) {
                String string = Settings.Secure.getString(context.getContentResolver(), "enabled_notification_listeners");
                if (string != null) {
                    String strD = s0.f105811a.b(GNCSListenerService.class).D();
                    String packageName = context.getPackageName();
                    if (strD == null || !w.z(string, strD, false)) {
                        z14 = true;
                    } else {
                        packageName.getClass();
                        if (!w.z(string, packageName, false)) {
                            z14 = true;
                        }
                    }
                }
            } else {
                a2 a2Var = a2.DEVICE_SETUP;
                i2.f36769a.getClass();
                i2.a.b(a2Var, "GetDeviceSetupDeniedPermissionsUseCase", "shouldRequestNotificationAccess: No devices linked, skipping request");
            }
            if (z14) {
                arrayListL.add(obj);
            }
        }
        a2 a2Var2 = a2.DEVICE_SETUP;
        String strK = a0.k("Permissions that weren't given access yet: ", arrayListL);
        i2.f36769a.getClass();
        i2.a.b(a2Var2, "GetDeviceSetupDeniedPermissionsUseCase", strK);
        return arrayListL;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lr90/b$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
