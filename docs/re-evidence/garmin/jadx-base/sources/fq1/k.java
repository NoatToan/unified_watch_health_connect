package fq1;

import android.content.Context;
import android.content.IntentFilter;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.gncs.GNCSListenerService;
import com.garmin.android.gncs.GNCSListenerServiceConfig;
import com.garmin.android.music.MusicManager;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lfq1/k;", "Lfq1/s;", "<init>", "()V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class k implements s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f73265a = new a(null);

    @Override // fq1.s
    public final Object b(Context context, t13.d<? super Unit> dVar) {
        i2.a aVar = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar.getClass();
        i2.a.b(a2Var, "GNCSInitializer", "Executing GNCS initialization");
        if (!((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).p()) {
            f73265a.getClass();
            a.a(context);
        }
        return Unit.INSTANCE;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lfq1/k$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static void a(Context context) {
            context.getClass();
            if (!GNCSListenerService.isNotificationAccessAllowed(context)) {
                i2.a aVar = i2.f36769a;
                a2 a2Var = a2.GENERAL;
                aVar.getClass();
                i2.a.p(a2Var, "GNCSInitializer", "initGNCS: impossible, this is a low RAM Android device, see https://developer.android.com/reference/android/service/notification/NotificationListenerService");
                return;
            }
            GNCSListenerServiceConfig.GNCSListenerServiceConfigBuilder gNCSListenerServiceConfigBuilderContext = new GNCSListenerServiceConfig.GNCSListenerServiceConfigBuilder().context(context);
            com.garmin.android.apps.connectmobile.l.g().getClass();
            GNCSListenerService.init(gNCSListenerServiceConfigBuilderContext.remoteConfig(gh2.i.f77458c.a()).appCallback(wk0.a.f185803a).smartNotificationsSupported(true).musicControlsSupported(true));
            MusicManager.getInstance().registerOnDeviceSubscribedListener(new vn1.e(context));
            com.garmin.android.apps.connectmobile.permissions.a aVar2 = com.garmin.android.apps.connectmobile.permissions.a.f40304a;
            aVar2.getClass();
            if (!com.garmin.android.apps.connectmobile.permissions.a.f40307d) {
                a7.b.registerReceiver(context, aVar2, new IntentFilter(tn.k.g(context.getApplicationContext().getPackageName(), "/com.garmin.android.gncs.NOTIFICATION_REQUIRES_PERMISSION")), 2);
                com.garmin.android.apps.connectmobile.permissions.a.f40307d = true;
            }
            i2.a aVar3 = i2.f36769a;
            a2 a2Var2 = a2.GENERAL;
            aVar3.getClass();
            i2.a.b(a2Var2, "GNCSInitializer", "GNCS initialized");
        }

        private a() {
        }
    }
}
