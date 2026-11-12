package hd1;

import com.garmin.device.datatypes.DeviceProfile;
import java.util.Comparator;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final class u<T> implements Comparator {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(T t7, T t14) {
        return r13.a.b(Integer.valueOf(((DeviceProfile) t7).getConnectionType()), Integer.valueOf(((DeviceProfile) t14).getConnectionType()));
    }
}
