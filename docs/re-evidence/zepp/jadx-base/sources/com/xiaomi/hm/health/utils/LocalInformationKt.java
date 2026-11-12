package com.xiaomi.hm.health.utils;

import android.os.Build;
import android.text.BidiFormatter;
import android.text.TextDirectionHeuristics;
import android.text.TextUtils;
import com.huami.network.hmnetwork.config.HMAppConfig;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.baseutil.GlobalConfig;
import com.xiaomi.hm.health.model.account.HMPersonInfo;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0006\u0010\u0001\u001a\u00020\u0000\u001a\b\u0010\u0002\u001a\u0004\u0018\u00010\u0000\u001a\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¨\u0006\u0006"}, d2 = {"", "getLocalInformationStr", "getCurrentTimeZone", "Ljava/util/TimeZone;", "tz", "a", "app_midongPlayRelease"}, k = 2, mv = {1, 5, 1})
public final class LocalInformationKt {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ Throwable a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Throwable th) {
            super(0);
            this.a = th;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            String message = this.a.getMessage();
            if (message == null) {
                message = "";
            }
            return "error msg: " + message;
        }
    }

    private static final String a(TimeZone timeZone) {
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("ZZZZ", Locale.getDefault());
        simpleDateFormat.setTimeZone(timeZone);
        return BidiFormatter.getInstance().unicodeWrap(simpleDateFormat.format(date), TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1 ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR);
    }

    @Nullable
    public static final String getCurrentTimeZone() {
        Calendar calendar = Calendar.getInstance();
        Calendar calendar2 = Calendar.getInstance();
        calendar.setTimeZone(calendar2.getTimeZone());
        calendar.set(calendar2.get(1), 11, 31, 13, 0, 0);
        return a(calendar2.getTimeZone());
    }

    @NotNull
    public static final String getLocalInformationStr() {
        Object objM3845constructorimpl;
        try {
            Result.Companion companion = Result.Companion;
            String str = GlobalConfig.get().isBuildAmazfit() ? "Amazfit" : "Zepp";
            objM3845constructorimpl = Result.m3845constructorimpl("**********app_name=" + str + ";platform=Android;app_version=" + HMAppConfig.getVersionName() + ";app_build=" + HMAppConfig.getVersionCode() + ";device_name=" + Build.MODEL + ";system_version=" + Build.VERSION.RELEASE + ";user_id=" + HMPersonInfo.getInstance().getUserInfo().getUserid() + ";time_zone=" + getCurrentTimeZone() + "**********");
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM3848exceptionOrNullimpl = Result.m3848exceptionOrNullimpl(objM3845constructorimpl);
        if (thM3848exceptionOrNullimpl != null) {
            HMLog.warn$default(null, null, new a(thM3848exceptionOrNullimpl), 3, null);
        }
        if (Result.m3850isFailureimpl(objM3845constructorimpl)) {
            objM3845constructorimpl = "";
        }
        return (String) objM3845constructorimpl;
    }
}
