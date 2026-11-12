package defpackage;

import android.content.Context;
import com.huawei.android.hicloud.sync.R;
import java.math.BigDecimal;
import java.text.DecimalFormat;

/* JADX INFO: loaded from: classes23.dex */
public class bcy {
    public static String c(Context context, long j) {
        if (j < 0) {
            return "0";
        }
        DecimalFormat decimalFormat = new DecimalFormat();
        decimalFormat.applyPattern("0.##");
        if ((j >> 40) != 0) {
            return context.getString(R.string.hisync_sdk_Emotion_TB, decimalFormat.format((j / 1048576.0f) / 1048576.0f));
        }
        if (((j >> 30) & 1023) != 0) {
            return context.getString(R.string.hisync_sdk_Emotion_GB, decimalFormat.format(j / 1.0737418E9f));
        }
        if (((j >> 20) & 1023) != 0) {
            return context.getString(R.string.hisync_sdk_Emotion_MB, decimalFormat.format(j / 1048576.0f));
        }
        float f = j / 1024.0f;
        return f < 1.0f ? context.getString(R.string.hisync_sdk_Emotion_KB, decimalFormat.format(f)) : context.getString(R.string.hisync_sdk_Emotion_KB, new BigDecimal(f).setScale(0, 4));
    }
}
