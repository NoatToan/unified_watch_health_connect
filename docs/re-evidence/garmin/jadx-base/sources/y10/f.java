package y10;

import android.net.Uri;
import android.os.CountDownTimer;
import androidx.lifecycle.u1;
import androidx.lifecycle.y0;
import ch.qos.logback.classic.spi.CallerData;
import ch.qos.logback.core.spi.AbstractComponentTracker;
import com.garmin.android.apps.connectmobile.connectiq.p0;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.gfdi.protobuf.eventbus.ConnectIQAppSettingsEvent;
import com.garmin.android.apps.connectmobile.gfdi.protobuf.eventbus.ConnectIQAppSettingsListener;
import com.garmin.android.apps.connectmobile.settings.GCMSettingManager;
import java.util.Arrays;
import java.util.Locale;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONException;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Ly10/f;", "Landroidx/lifecycle/u1;", "Lr10/a;", "connectIQAppSettingsRepo", "<init>", "(Lr10/a;)V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class f extends u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r10.a f193822a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f193823b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public byte[] f193824c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final y0<g3<String>> f193825d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final y0<Boolean> f193826e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final y0<g3<byte[]>> f193827f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final y0 f193828g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final y0<g3<Boolean>> f193829h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final y0 f193830i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final y0<Boolean> f193831j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final y0 f193832k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final y0<g3<String>> f193833l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final y0 f193834m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public fw.p f193835n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f193836o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final c f193837p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final b f193838q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final d f193839r;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"y10/f$b", "Lcom/garmin/android/apps/connectmobile/gfdi/protobuf/eventbus/ConnectIQAppSettingsListener;", "Lcom/garmin/android/apps/connectmobile/gfdi/protobuf/eventbus/ConnectIQAppSettingsEvent;", "connectIQAppSettingsEvent", "", "settingsEventReceived", "(Lcom/garmin/android/apps/connectmobile/gfdi/protobuf/eventbus/ConnectIQAppSettingsEvent;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b extends ConnectIQAppSettingsListener {
        public b() {
        }

        @Override // com.garmin.android.apps.connectmobile.gfdi.protobuf.eventbus.ConnectIQAppSettingsListener
        @l73.k(threadMode = ThreadMode.MAIN)
        public void settingsEventReceived(ConnectIQAppSettingsEvent connectIQAppSettingsEvent) {
            connectIQAppSettingsEvent.getClass();
            f fVar = f.this;
            fVar.f193823b = true;
            y0<g3<String>> y0Var = fVar.f193825d;
            fVar.f193837p.cancel();
            if (Arrays.equals(com.garmin.android.apps.connectmobile.connectiq.b0.e().f31824b, fVar.f193824c)) {
                byte[] bArr = com.garmin.android.apps.connectmobile.connectiq.b0.e().f31825c;
                if (bArr == null) {
                    p92.y.f136664a.getClass();
                    p92.y.a.a("ConnectIQAppSettingsViewModel", "AppSettingsReceiver: no settings");
                    y0Var.m(g3.a.a(g3.f35298f, null, null, null, null, 15));
                    return;
                }
                String str = "";
                if (bArr.length == 0) {
                    p92.y.f136664a.getClass();
                    p92.y.a.a("ConnectIQAppSettingsViewModel", "AppSettingsReceiver: app settings empty ");
                    g3.f35298f.getClass();
                    y0Var.m(g3.a.d(""));
                    return;
                }
                try {
                    String strA = p0.a(bArr);
                    if (strA != null) {
                        str = strA;
                    }
                    p92.y.a aVar = p92.y.f136664a;
                    String strConcat = "AppSettingsReceiver: app settings ".concat(str);
                    aVar.getClass();
                    p92.y.a.a("ConnectIQAppSettingsViewModel", strConcat);
                    g3.f35298f.getClass();
                    y0Var.m(g3.a.d(str));
                } catch (JSONException e4) {
                    p92.y.a aVar2 = p92.y.f136664a;
                    String str2 = "AppSettingsReceiver: " + e4.getMessage();
                    aVar2.getClass();
                    p92.y.a.c("ConnectIQAppSettingsViewModel", str2);
                    y0Var.m(g3.a.a(g3.f35298f, null, null, null, null, 15));
                }
            }
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"y10/f$c", "Landroid/os/CountDownTimer;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c extends CountDownTimer {
        public c() {
            super(AbstractComponentTracker.LINGERING_TIMEOUT, 1000L);
        }

        @Override // android.os.CountDownTimer
        public final void onFinish() {
            f fVar = f.this;
            fVar.f193826e.m(Boolean.valueOf(fVar.f193823b));
        }

        @Override // android.os.CountDownTimer
        public final void onTick(long j8) {
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"y10/f$d", "Lcom/garmin/android/apps/connectmobile/connectiq/b0$j;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class d implements com.garmin.android.apps.connectmobile.connectiq.b0.j {
        public d() {
        }

        @Override // com.garmin.android.apps.connectmobile.connectiq.b0.j
        public final void a() {
            y0<g3<Boolean>> y0Var = f.this.f193829h;
            g3.a aVar = g3.f35298f;
            Boolean bool = Boolean.TRUE;
            aVar.getClass();
            y0Var.m(g3.a.d(bool));
        }

        @Override // com.garmin.android.apps.connectmobile.connectiq.b0.j
        public final void b() {
            f.this.f193829h.m(g3.a.a(g3.f35298f, null, null, Boolean.FALSE, null, 11));
        }
    }

    static {
        new a(null);
    }

    public f(r10.a aVar) {
        aVar.getClass();
        this.f193822a = aVar;
        this.f193825d = new y0<>();
        this.f193826e = new y0<>();
        y0<g3<byte[]>> y0Var = new y0<>();
        this.f193827f = y0Var;
        this.f193828g = y0Var;
        y0<g3<Boolean>> y0Var2 = new y0<>();
        this.f193829h = y0Var2;
        this.f193830i = y0Var2;
        y0<Boolean> y0Var3 = new y0<>();
        this.f193831j = y0Var3;
        this.f193832k = y0Var3;
        y0<g3<String>> y0Var4 = new y0<>();
        this.f193833l = y0Var4;
        this.f193834m = y0Var4;
        this.f193835n = fw.p.SUCCESS;
        this.f193836o = true;
        this.f193837p = new c();
        this.f193838q = new b();
        this.f193839r = new d();
    }

    public final void x4(String str, String str2, boolean z14) {
        y0<Boolean> y0Var = this.f193831j;
        if (!z14) {
            y0Var.j(Boolean.FALSE);
            return;
        }
        int iH = d53.w.H(str, CallerData.NA, 0, false, 6);
        String schemeSpecificPart = Uri.parse(d53.u.v(iH == -1 ? "" : str.substring(0, iH), "android/", "", false)).getSchemeSpecificPart();
        String schemeSpecificPart2 = Uri.parse(str2).getSchemeSpecificPart();
        schemeSpecificPart2.getClass();
        schemeSpecificPart.getClass();
        boolean z15 = d53.w.z(schemeSpecificPart2, schemeSpecificPart, true);
        this.f193836o = z15;
        y0Var.j(Boolean.valueOf(z15));
    }

    public final String y4(String str, String str2, String str3, boolean z14) {
        this.f193822a.f149331a.getClass();
        StringBuilder sb3 = new StringBuilder(fb1.c.n("https://", GCMSettingManager.k().A));
        sb3.append("/" + Locale.getDefault().getLanguage() + "-" + Locale.getDefault().getCountry());
        StringBuilder sb4 = new StringBuilder("/appSettings2/android/");
        sb4.append(str);
        sb3.append(sb4.toString());
        sb3.append("/versions/" + str2);
        sb3.append("/devices/" + str3 + "/edit");
        sb3.append(z14 ? "?theme=dark" : "");
        return sb3.toString();
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Ly10/f$a;", "", "<init>", "()V", "", "DEVICE_APP_SETTINGS_TIMEOUT", "J", "", "TAG", "Ljava/lang/String;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
