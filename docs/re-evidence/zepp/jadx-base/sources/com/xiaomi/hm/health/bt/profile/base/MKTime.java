package com.xiaomi.hm.health.bt.profile.base;

import com.google.android.material.timepicker.TimeModel;
import com.xiaomi.hm.health.bt.debug.Debug;
import com.xiaomi.mipush.sdk.Constants;
import java.util.Arrays;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlinx.serialization.json.internal.JsonLexerKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ>\u0010\n\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0002J\u000e\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0002¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/base/MKTime;", "", "", "y", "m", "day", "hour", "minute", "sec", "zoneKey", "mktime", "key", "Ljava/util/TimeZone;", "zoneKeyToTimeZone", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class MKTime {

    @NotNull
    public static final MKTime INSTANCE = new MKTime();

    private MKTime() {
    }

    public final int mktime(int y, int m, int day, int hour, int minute, int sec, int zoneKey) {
        int i = m - 2;
        if (i <= 0) {
            i += 12;
            y--;
        }
        return (((((((((((((y / 4) - (y / 100)) + (y / 400)) + ((i * 367) / 12)) + day) + (y * 365)) - 719499) * 24) + hour) * 60) + minute) * 60) + sec) - ((zoneKey * 15) * 60);
    }

    @NotNull
    public final TimeZone zoneKeyToTimeZone(int key) {
        Object objM3845constructorimpl;
        int iAbs = Math.abs(key) / 4;
        int iAbs2 = (Math.abs(key) % 4) * 15;
        String str = key >= 0 ? "+" : Constants.ACCEPT_TIME_SEPARATOR_SERVER;
        StringBuilder sb = new StringBuilder();
        sb.append("GMT");
        sb.append(str);
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        sb.append(String.format(TimeModel.ZERO_LEADING_NUMBER_FORMAT, Arrays.copyOf(new Object[]{Integer.valueOf(iAbs)}, 1)));
        sb.append(JsonLexerKt.COLON);
        sb.append(String.format(TimeModel.ZERO_LEADING_NUMBER_FORMAT, Arrays.copyOf(new Object[]{Integer.valueOf(iAbs2)}, 1)));
        String string = sb.toString();
        try {
            Result.Companion companion = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(TimeZone.getTimeZone(string));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM3848exceptionOrNullimpl = Result.m3848exceptionOrNullimpl(objM3845constructorimpl);
        if (thM3848exceptionOrNullimpl != null) {
            Debug.fi("MKTime", Intrinsics.stringPlus("Create timezone exception:", thM3848exceptionOrNullimpl));
        }
        TimeZone timeZone = TimeZone.getDefault();
        if (Result.m3850isFailureimpl(objM3845constructorimpl)) {
            objM3845constructorimpl = timeZone;
        }
        return (TimeZone) objM3845constructorimpl;
    }
}
