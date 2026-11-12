package gn2;

import android.content.Context;
import com.garmin.proto.generated.GDICore;
import com.garmin.proto.generated.WifiSetup;
import java.util.List;
import p005kotlin.Metadata;
import p13.x;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\tB\u0019\b\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lgn2/a;", "Ldt2/c;", "Ldt2/h;", "Landroid/content/Context;", "appContext", "Lt13/g;", "coroutineContext", "<init>", "(Landroid/content/Context;Lt13/g;)V", "a", "wifi_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class a implements dt2.c, dt2.h {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C1575a f78088d = new C1575a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final List<WifiSetup.SecurityType> f78089e = x.k(WifiSetup.SecurityType.OPEN, WifiSetup.SecurityType.WEP, WifiSetup.SecurityType.WPA, WifiSetup.SecurityType.WPA2);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f78090b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t13.g f78091c;

    public a(Context context, t13.g gVar) {
        context.getClass();
        gVar.getClass();
        this.f78090b = context;
        this.f78091c = gVar;
    }

    @Override // dt2.c
    public final void connectionReady(GDICore.ConnectionReadyNotification connectionReadyNotification) {
    }

    /* JADX INFO: renamed from: gn2.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lgn2/a$a;", "", "<init>", "()V", "", "DEFAULT_MAX_NETWORKS", "I", "wifi_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class C1575a {
        public /* synthetic */ C1575a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private C1575a() {
        }
    }
}
