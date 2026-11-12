package da2;

import android.text.TextUtils;
import com.garmin.device.datatypes.DeviceProfile;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/* JADX INFO: loaded from: classes7.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Logger f58900a = LoggerFactory.getLogger("HandshakeBroadcaster");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ConcurrentHashMap<String, b> f58901b = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final AtomicReference<b> f58902c = new AtomicReference<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final AtomicReference<Timer> f58903d = new AtomicReference<>(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ConcurrentHashMap<String, TimerTask> f58904e = new ConcurrentHashMap<>();

    public class a extends TimerTask {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f58905a;

        public a(String str) {
            this.f58905a = str;
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public final void run() {
            String str = this.f58905a;
            if (TextUtils.isEmpty(str)) {
                cancel();
                return;
            }
            h.e(str);
            if (TextUtils.isEmpty(str)) {
                vb.h.s("MAC address is required");
                return;
            }
            b bVar = h.f58901b.get(str);
            if (bVar == null) {
                bVar = h.f58902c.get();
            }
            if (bVar != null) {
                bVar.a(str);
            } else {
                com.airbnb.lottie.animation.keyframe.a.A("No listener available for handshakeTimeout ", str, h.f58900a);
            }
        }
    }

    public interface b {
        void a(String str);

        void c(DeviceProfile deviceProfile);

        void f(String str, String str2);
    }

    public static boolean a() {
        AtomicReference<Timer> atomicReference;
        Timer timer = new Timer("GDI_HandshakeWatcher");
        do {
            atomicReference = f58903d;
            if (atomicReference.compareAndSet(null, timer)) {
                return true;
            }
        } while (atomicReference.get() == null);
        return false;
    }

    public static void b(DeviceProfile deviceProfile) {
        if (deviceProfile == null) {
            vb.h.s("Device profile required");
            return;
        }
        e(deviceProfile.getMacAddress());
        b bVar = f58901b.get(deviceProfile.getMacAddress());
        if (bVar == null) {
            bVar = f58902c.get();
        }
        if (bVar != null) {
            bVar.c(deviceProfile);
            return;
        }
        f58900a.warn("No listener available for notifyHandshakeCompleted " + deviceProfile.getF172493a());
    }

    public static void c(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            vb.h.s("MAC address is required");
            return;
        }
        e(str);
        b bVar = f58901b.get(str);
        if (bVar == null) {
            bVar = f58902c.get();
        }
        if (bVar != null) {
            bVar.f(str, str2);
        } else {
            com.airbnb.lottie.animation.keyframe.a.A("No listener available for notifyHandshakeFailure ", str, f58900a);
        }
    }

    public static void d(String str) {
        if (a()) {
            StringBuilder sb3 = new StringBuilder("Handshake timer was not initialized. Has fallback:");
            sb3.append(f58902c.get() != null);
            f58900a.warn(sb3.toString());
        }
        e(str);
        a aVar = new a(str);
        f58904e.put(str, aVar);
        Timer timer = f58903d.get();
        if (timer != null) {
            timer.schedule(aVar, 30000L);
        }
    }

    public static void e(String str) {
        TimerTask timerTaskRemove;
        if (TextUtils.isEmpty(str) || (timerTaskRemove = f58904e.remove(str)) == null) {
            return;
        }
        timerTaskRemove.cancel();
    }
}
