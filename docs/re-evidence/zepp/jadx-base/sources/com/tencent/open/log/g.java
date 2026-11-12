package com.tencent.open.log;

import android.text.format.Time;
import android.util.Log;
import androidx.exifinterface.media.ExifInterface;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.xiaomi.mipush.sdk.Constants;
import io.netty.util.internal.StringUtil;
import kotlinx.serialization.json.internal.JsonLexerKt;
import org.acra.ACRAConstants;

/* JADX INFO: loaded from: classes18.dex */
public final class g {
    public static final g a = new g();

    public final String a(int i) {
        if (i == 1) {
            return "V";
        }
        if (i == 2) {
            return LogUtil.D;
        }
        if (i == 4) {
            return LogUtil.I;
        }
        if (i == 8) {
            return "W";
        }
        if (i != 16) {
            return i != 32 ? Constants.ACCEPT_TIME_SEPARATOR_SERVER : ExifInterface.GPS_MEASUREMENT_IN_PROGRESS;
        }
        return "E";
    }

    public String a(int i, Thread thread, long j, String str, String str2, Throwable th) {
        long j2 = j % 1000;
        Time time = new Time();
        time.set(j);
        StringBuilder sb = new StringBuilder();
        sb.append(a(i));
        sb.append('/');
        sb.append(time.format("%Y-%m-%d %H:%M:%S"));
        sb.append('.');
        if (j2 < 10) {
            sb.append("00");
        } else if (j2 < 100) {
            sb.append('0');
        }
        sb.append(j2);
        sb.append(StringUtil.SPACE);
        sb.append(JsonLexerKt.BEGIN_LIST);
        if (thread == null) {
            sb.append(ACRAConstants.NOT_AVAILABLE);
        } else {
            sb.append(thread.getName());
        }
        sb.append(JsonLexerKt.END_LIST);
        sb.append(JsonLexerKt.BEGIN_LIST);
        sb.append(str);
        sb.append(JsonLexerKt.END_LIST);
        sb.append(StringUtil.SPACE);
        sb.append(str2);
        sb.append('\n');
        if (th != null) {
            sb.append("* Exception : \n");
            sb.append(Log.getStackTraceString(th));
            sb.append('\n');
        }
        return sb.toString();
    }
}
