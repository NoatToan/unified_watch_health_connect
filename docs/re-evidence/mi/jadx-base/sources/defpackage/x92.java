package defpackage;

import android.content.Context;
import com.xiaomi.smarthome.device.api.DeviceStat;
import com.xiaomi.smarthome.library.MiJiaEnvironment;
import java.io.File;

/* JADX INFO: loaded from: classes5.dex */
public abstract class x92 implements gwc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DeviceStat f38876a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f38877b = MiJiaEnvironment.getAppContext();

    public x92(DeviceStat deviceStat) {
        this.f38876a = deviceStat;
    }

    public static String b(Context context) {
        try {
            try {
                return context.getFilesDir().getPath();
            } catch (Throwable unused) {
                File dir = context.getDir("files", 0);
                dir.mkdirs();
                return dir.getPath();
            }
        } catch (Throwable unused2) {
            StringBuilder sb = new StringBuilder();
            String str = File.separator;
            sb.append(str);
            sb.append("data");
            sb.append(str);
            sb.append("data");
            sb.append(str);
            sb.append(context.getPackageName());
            sb.append(str);
            sb.append("files");
            String string = sb.toString();
            new File(string).mkdirs();
            return string;
        }
    }

    public Context c() {
        return this.f38877b;
    }

    @Override // defpackage.gwc
    public DeviceStat getDevice() {
        return this.f38876a;
    }
}
