package gk0;

import android.content.Context;
import com.garmin.device.datatypes.DeviceProfile;
import com.garmin.gcsprotos.generated.Auth;

/* JADX INFO: loaded from: classes8.dex */
public interface d {
    DeviceProfile b(long j8);

    void c(Auth.Category category, String str);

    void d(Context context);

    void e();

    String f();

    String g(Auth.Category category);

    String h();
}
