package defpackage;

import android.content.Context;
import com.xiaomi.onetrack.Configuration;
import com.xiaomi.onetrack.OneTrack;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class tah {
    public static tah c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f34511a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public OneTrack f34512b;

    public static synchronized tah a(Context context) {
        try {
            if (c == null) {
                tah tahVar = new tah();
                c = tahVar;
                tahVar.f34511a = context.getApplicationContext();
            }
        } catch (Throwable th) {
            throw th;
        }
        return c;
    }

    public void b(String str, String str2, String str3, Map<String, Object> map) {
        jpe.a("OneTrackHelper", "track(): eventId = " + str3 + ", params = " + map);
        OneTrack oneTrackCreateInstance = OneTrack.createInstance(this.f34511a, new Configuration.Builder().setAppId(str).setChannel(str2).setMode(OneTrack.Mode.APP).setAutoTrackActivityAction(false).setExceptionCatcherEnable(true).build());
        this.f34512b = oneTrackCreateInstance;
        oneTrackCreateInstance.track(str3, map);
    }
}
