package com.xiaomi.fitness.data.valueformatter;

import android.app.Application;
import android.content.Context;
import com.xiaomi.fitness.chart.entrys.RecyclerBarEntry;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import defpackage.gv5;
import defpackage.qxi;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rB\u0013\b\u0016\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\f\u0010\u000fJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/fitness/data/valueformatter/MHStrengthHighLightMarkValueFormatter;", "Lgv5;", "Lcom/xiaomi/fitness/chart/entrys/RecyclerBarEntry;", "barEntry", "", "getBarLabel", "(Lcom/xiaomi/fitness/chart/entrys/RecyclerBarEntry;)Ljava/lang/String;", "Landroid/content/Context;", "mContext", "Landroid/content/Context;", "", "digits", "<init>", "(I)V", "context", "(Landroid/content/Context;)V", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class MHStrengthHighLightMarkValueFormatter extends gv5 {

    @Nullable
    private Context mContext;

    public MHStrengthHighLightMarkValueFormatter(int i) {
        super(i);
    }

    @Override // defpackage.gv5, defpackage.onq
    @NotNull
    public String getBarLabel(@NotNull RecyclerBarEntry barEntry) {
        StringBuilder sb;
        Intrinsics.checkNotNullParameter(barEntry, "barEntry");
        Application application = ApplicationExtKt.getApplication();
        int iRound = Math.round(barEntry.getY());
        String quantityString = application.getResources().getQuantityString(qxi.Q1, iRound);
        Intrinsics.checkNotNullExpressionValue(quantityString, "getQuantityString(...)");
        if (AppUtil.isRTLDirection()) {
            sb = new StringBuilder();
            sb.append(quantityString);
            sb.append(gv5.CONNECT_VALUE_STR);
            sb.append(iRound);
        } else {
            sb = new StringBuilder();
            sb.append(iRound);
            sb.append(gv5.CONNECT_VALUE_STR);
            sb.append(quantityString);
        }
        return barEntry.getY() > 0.0f ? sb.toString() + gv5.CONNECT_STR + TimeDateUtil.getDateYYYYMMddLocalFormat(barEntry.localDate) : "";
    }

    public MHStrengthHighLightMarkValueFormatter(@Nullable Context context) {
        this(0);
        this.mContext = context;
    }
}
