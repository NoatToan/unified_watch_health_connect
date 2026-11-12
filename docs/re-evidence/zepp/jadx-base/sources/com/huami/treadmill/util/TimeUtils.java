package com.huami.treadmill.util;

import android.content.Context;
import com.huami.tools.analytics.DbUtils;
import com.huami.treadmill.R;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.JsonLexerKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u0016\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004J\u0017\u0010\f\u001a\u00020\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\r¨\u0006\u0010"}, d2 = {"Lcom/huami/treadmill/util/TimeUtils;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Ljava/util/Date;", "date", "", "formatDateTime_ydhm", "formatDateTime_ymd", "formatTime_use_time", "", "sec", "getTimeString", "(Ljava/lang/Integer;)Ljava/lang/String;", "<init>", "()V", "treadmill_release"}, k = 1, mv = {1, 5, 1})
public final class TimeUtils {

    @NotNull
    public static final TimeUtils INSTANCE = new TimeUtils();

    private TimeUtils() {
    }

    @NotNull
    public final String formatDateTime_ydhm(@NotNull Context context, @NotNull Date date) {
        return new SimpleDateFormat(context.getString(R.string.td_date_Mdahhmm_unit_pattern), Locale.getDefault()).format(date);
    }

    @NotNull
    public final String formatDateTime_ymd(@NotNull Context context, @NotNull Date date) {
        return new SimpleDateFormat(context.getString(R.string.td_date_ydm_pattern), Locale.getDefault()).format(date);
    }

    @NotNull
    public final String formatTime_use_time(@NotNull Date date) {
        return new SimpleDateFormat("hh:mm:ss", Locale.getDefault()).format(date);
    }

    @NotNull
    public final String getTimeString(@Nullable Integer sec) {
        int iIntValue = (sec.intValue() / 86400) * 86400;
        int iIntValue2 = (sec.intValue() - iIntValue) / 3600;
        int i = iIntValue2 * 3600;
        int iIntValue3 = ((sec.intValue() - iIntValue) - i) / 60;
        int iIntValue4 = (((sec.intValue() - iIntValue) - i) - (iIntValue3 * 60)) / 1;
        StringBuffer stringBuffer = new StringBuffer();
        if (iIntValue2 > 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(iIntValue2);
            sb.append(JsonLexerKt.COLON);
            stringBuffer.append(sb.toString());
        } else if (iIntValue2 == 0) {
            stringBuffer.append("00:");
        }
        if (iIntValue3 >= 0) {
            if (iIntValue3 < 10) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append('0');
                sb2.append(iIntValue3);
                sb2.append(JsonLexerKt.COLON);
                stringBuffer.append(sb2.toString());
            } else {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(iIntValue3);
                sb3.append(JsonLexerKt.COLON);
                stringBuffer.append(sb3.toString());
            }
        }
        if (iIntValue4 >= 0) {
            if (iIntValue4 < 10) {
                stringBuffer.append(Intrinsics.stringPlus("0", Integer.valueOf(iIntValue4)));
            } else {
                stringBuffer.append(String.valueOf(iIntValue4));
            }
        }
        return stringBuffer.toString();
    }
}
