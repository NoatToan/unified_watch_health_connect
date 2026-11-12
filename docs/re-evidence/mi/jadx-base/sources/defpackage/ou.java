package defpackage;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.hm.health.bt.profile.base.ProfileUtils;
import java.util.Calendar;
import java.util.GregorianCalendar;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\f\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000¨\u0006\u0003"}, d2 = {"", "Ljava/util/Calendar;", PluginDeviceInfo.FMODEL, "bluetooth_release"}, k = 2, mv = {1, 7, 1})
public final class ou {
    @Nullable
    public static final Calendar a(@NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        if (bArr.length < 8) {
            return null;
        }
        GregorianCalendar gregorianCalendar = new GregorianCalendar(c3.a(bArr, 2, 0, 2, null), c3.a(bArr, 1, 2) - 1, c3.a(bArr, 1, 3), c3.a(bArr, 1, 4), c3.a(bArr, 1, 5), c3.a(bArr, 1, 6));
        gregorianCalendar.setTimeZone(ProfileUtils.getTimezone(bArr[7]));
        return gregorianCalendar;
    }
}
