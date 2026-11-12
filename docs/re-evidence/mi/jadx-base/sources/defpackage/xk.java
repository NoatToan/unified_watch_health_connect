package defpackage;

import com.google.android.material.timepicker.TimeModel;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import java.util.Arrays;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Marker;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ>\u0010\n\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0002J\u000e\u0010\n\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0002¨\u0006\u000f"}, d2 = {"Lxk;", "", "", "y", "m", "day", "hour", "minute", "sec", "zoneKey", PluginDeviceInfo.FMODEL, "key", "Ljava/util/TimeZone;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final class xk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final xk f39201a = new xk();

    public final int a(int y, int m, int day, int hour, int minute, int sec, int zoneKey) {
        int i = m - 2;
        if (i <= 0) {
            i = m + 10;
            y--;
        }
        return (((((((((((((y / 4) - (y / 100)) + (y / 400)) + ((i * 367) / 12)) + day) + (y * 365)) - 719499) * 24) + hour) * 60) + minute) * 60) + sec) - (zoneKey * 900);
    }

    @NotNull
    public final TimeZone a(int key) {
        Object objM886constructorimpl;
        int iAbs = Math.abs(key) / 4;
        int iAbs2 = (Math.abs(key) % 4) * 15;
        String str = key >= 0 ? Marker.ANY_NON_NULL_MARKER : "-";
        StringBuilder sb = new StringBuilder();
        sb.append("GMT");
        sb.append(str);
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str2 = String.format(TimeModel.ZERO_LEADING_NUMBER_FORMAT, Arrays.copyOf(new Object[]{Integer.valueOf(iAbs)}, 1));
        Intrinsics.checkNotNullExpressionValue(str2, "format(format, *args)");
        sb.append(str2);
        sb.append(AbstractJsonLexerKt.COLON);
        String str3 = String.format(TimeModel.ZERO_LEADING_NUMBER_FORMAT, Arrays.copyOf(new Object[]{Integer.valueOf(iAbs2)}, 1));
        Intrinsics.checkNotNullExpressionValue(str3, "format(format, *args)");
        sb.append(str3);
        String string = sb.toString();
        try {
            Result.Companion companion = Result.Companion;
            objM886constructorimpl = Result.m886constructorimpl(TimeZone.getTimeZone(string));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM886constructorimpl = Result.m886constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM889exceptionOrNullimpl = Result.m889exceptionOrNullimpl(objM886constructorimpl);
        if (thM889exceptionOrNullimpl != null) {
            t5t.d("MKTime", "Create timezone exception:" + thM889exceptionOrNullimpl);
        }
        TimeZone timeZone = TimeZone.getDefault();
        if (Result.m892isFailureimpl(objM886constructorimpl)) {
            objM886constructorimpl = timeZone;
        }
        Intrinsics.checkNotNullExpressionValue(objM886constructorimpl, "runCatching { TimeZone.g…lt(TimeZone.getDefault())");
        return (TimeZone) objM886constructorimpl;
    }
}
