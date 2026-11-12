package com.huami.bloodpressure_ui.ext;

import com.huami.bloodpressure_core.p002const.BloodPressureConst;
import com.huami.tools.log.HMLog;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\b\u0010\u0001\u001a\u00020\u0000H\u0000\u001a\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¨\u0006\u0006"}, d2 = {"", "getSecondsFromGMT", "", "pattern", "Ljava/text/SimpleDateFormat;", "getChinaSDF", "bloodpressure-ui_release"}, k = 2, mv = {1, 5, 1})
public final class TimeZoneExKt {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;
        public final /* synthetic */ Throwable b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, Throwable th) {
            super(0);
            this.a = str;
            this.b = th;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return this.a + " " + this.b;
        }
    }

    @NotNull
    public static final SimpleDateFormat getChinaSDF(@NotNull String str) {
        Object objM3845constructorimpl;
        try {
            Result.Companion companion = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(new SimpleDateFormat(str, Locale.CHINA));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM3848exceptionOrNullimpl = Result.m3848exceptionOrNullimpl(objM3845constructorimpl);
        if (thM3848exceptionOrNullimpl != null) {
            HMLog.info(BloodPressureConst.INSTANCE.getTAG(), new a(str, thM3848exceptionOrNullimpl));
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy", Locale.CHINA);
        if (Result.m3850isFailureimpl(objM3845constructorimpl)) {
            objM3845constructorimpl = simpleDateFormat;
        }
        return (SimpleDateFormat) objM3845constructorimpl;
    }

    public static final int getSecondsFromGMT() {
        return (Calendar.getInstance().get(15) + Calendar.getInstance().get(16)) / 1000;
    }
}
