package com.xiaomi.fitness.data.valueformatter;

import android.content.Context;
import com.xiaomi.fitness.chart.entrys.RecyclerBarEntry;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.common.utils.TimeUtils;
import defpackage.c0j;
import defpackage.gv5;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011B\u0013\b\u0016\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0010\u0010\rJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R$\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u0013"}, d2 = {"Lcom/xiaomi/fitness/data/valueformatter/DayWeightHighLightMarkValueFormatter;", "Lgv5;", "Lcom/xiaomi/fitness/chart/entrys/RecyclerBarEntry;", "barEntry", "", "getBarLabel", "(Lcom/xiaomi/fitness/chart/entrys/RecyclerBarEntry;)Ljava/lang/String;", "Landroid/content/Context;", "mContext", "Landroid/content/Context;", "getMContext", "()Landroid/content/Context;", "setMContext", "(Landroid/content/Context;)V", "", "digits", "<init>", "(I)V", "context", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class DayWeightHighLightMarkValueFormatter extends gv5 {

    @Nullable
    private Context mContext;

    public DayWeightHighLightMarkValueFormatter(int i) {
        super(i);
    }

    @Override // defpackage.gv5, defpackage.onq
    @NotNull
    public String getBarLabel(@NotNull RecyclerBarEntry barEntry) {
        StringBuilder sb;
        Intrinsics.checkNotNullParameter(barEntry, "barEntry");
        float y = barEntry.getY();
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format(Locale.US, "%.2f", Arrays.copyOf(new Object[]{Float.valueOf(y)}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        String string = AppUtil.getApp().getString(c0j.zp);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        String dateStr = TimeDateUtil.getDateStr(barEntry.timestamp, TimeUtils.FORMAT_H_M);
        if (AppUtil.isRTLDirection()) {
            sb = new StringBuilder();
            sb.append(string);
            sb.append(gv5.CONNECT_VALUE_STR);
            sb.append(str);
        } else {
            sb = new StringBuilder();
            sb.append(str);
            sb.append(gv5.CONNECT_VALUE_STR);
            sb.append(string);
        }
        return barEntry.getY() > 0.0f ? sb.toString() + gv5.CONNECT_STR + dateStr : "";
    }

    @Nullable
    public final Context getMContext() {
        return this.mContext;
    }

    public final void setMContext(@Nullable Context context) {
        this.mContext = context;
    }

    public DayWeightHighLightMarkValueFormatter(@Nullable Context context) {
        this(0);
        this.mContext = context;
    }
}
