package com.xiaomi.fitness.data.valueformatter;

import android.content.Context;
import com.xiaomi.fitness.chart.entrys.RecyclerBarEntry;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.common.utils.TimeUtils;
import com.xiaomi.fitness.repo.RepositoryManager;
import defpackage.gv5;
import defpackage.qxi;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011B\u0013\b\u0016\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0010\u0010\rJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R$\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u0013"}, d2 = {"Lcom/xiaomi/fitness/data/valueformatter/DayStepHighLightMarkValueFormatter;", "Lgv5;", "Lcom/xiaomi/fitness/chart/entrys/RecyclerBarEntry;", "barEntry", "", "getBarLabel", "(Lcom/xiaomi/fitness/chart/entrys/RecyclerBarEntry;)Ljava/lang/String;", "Landroid/content/Context;", "mContext", "Landroid/content/Context;", "getMContext", "()Landroid/content/Context;", "setMContext", "(Landroid/content/Context;)V", "", "digits", "<init>", "(I)V", "context", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class DayStepHighLightMarkValueFormatter extends gv5 {

    @Nullable
    private Context mContext;

    public DayStepHighLightMarkValueFormatter(int i) {
        super(i);
    }

    @Override // defpackage.gv5, defpackage.onq
    @NotNull
    public String getBarLabel(@NotNull RecyclerBarEntry barEntry) {
        String str;
        String str2;
        Intrinsics.checkNotNullParameter(barEntry, "barEntry");
        int iRound = Math.round(barEntry.getY());
        Context context = this.mContext;
        Intrinsics.checkNotNull(context);
        String quantityString = context.getResources().getQuantityString(qxi.u, iRound);
        Intrinsics.checkNotNullExpressionValue(quantityString, "getQuantityString(...)");
        if (AppUtil.isRTLDirection()) {
            str = quantityString + gv5.CONNECT_VALUE_STR + iRound;
        } else {
            str = iRound + gv5.CONNECT_VALUE_STR + quantityString;
        }
        String dateStr = TimeDateUtil.getDateStr(barEntry.timestamp, TimeUtils.FORMAT_H_M);
        String dateStr2 = TimeDateUtil.getDateStr(barEntry.timestamp + RepositoryManager.GAP_X_MINUTE, TimeUtils.FORMAT_H_M);
        if (AppUtil.isRTLDirection()) {
            str2 = dateStr2 + "-" + dateStr;
        } else {
            str2 = dateStr + "-" + dateStr2;
        }
        return barEntry.getY() > 0.0f ? str + gv5.CONNECT_STR + str2 : "";
    }

    @Nullable
    public final Context getMContext() {
        return this.mContext;
    }

    public final void setMContext(@Nullable Context context) {
        this.mContext = context;
    }

    public DayStepHighLightMarkValueFormatter(@Nullable Context context) {
        this(0);
        this.mContext = context;
    }
}
