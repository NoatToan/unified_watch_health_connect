package com.xiaomi.fitness.data.valueformatter;

import android.content.Context;
import com.xiaomi.fitness.chart.entrys.MultiBarEntry;
import com.xiaomi.fitness.chart.entrys.RecyclerBarEntry;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import defpackage.c0j;
import defpackage.gv5;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rB\u0013\b\u0016\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\f\u0010\u000fJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/fitness/data/valueformatter/HearingHighLightMarkValueFormatter;", "Lgv5;", "Lcom/xiaomi/fitness/chart/entrys/RecyclerBarEntry;", "barEntry", "", "getBarLabel", "(Lcom/xiaomi/fitness/chart/entrys/RecyclerBarEntry;)Ljava/lang/String;", "Landroid/content/Context;", "mContext", "Landroid/content/Context;", "", "digits", "<init>", "(I)V", "context", "(Landroid/content/Context;)V", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class HearingHighLightMarkValueFormatter extends gv5 {

    @Nullable
    private Context mContext;

    public HearingHighLightMarkValueFormatter(int i) {
        super(i);
    }

    @Override // defpackage.gv5, defpackage.onq
    @NotNull
    public String getBarLabel(@NotNull RecyclerBarEntry barEntry) {
        String string;
        StringBuilder sb;
        Intrinsics.checkNotNullParameter(barEntry, "barEntry");
        List<MultiBarEntry.a> listA = ((MultiBarEntry) barEntry).a();
        if (listA == null || listA.size() != 2) {
            string = "";
        } else {
            MultiBarEntry.a aVar = listA.get(0);
            MultiBarEntry.a aVar2 = listA.get(1);
            Context context = this.mContext;
            Intrinsics.checkNotNull(context);
            String hMFormatInMinutes = TimeDateUtil.getHMFormatInMinutes(context, aVar.f11757b);
            Context context2 = this.mContext;
            Intrinsics.checkNotNull(context2);
            String hMFormatInMinutes2 = TimeDateUtil.getHMFormatInMinutes(context2, aVar2.f11757b);
            Context context3 = this.mContext;
            Intrinsics.checkNotNull(context3);
            String string2 = context3.getString(c0j.L8);
            Context context4 = this.mContext;
            Intrinsics.checkNotNull(context4);
            String str = string2 + "," + context4.getString(c0j.M8) + hMFormatInMinutes2;
            if (AppUtil.isRTLDirection()) {
                sb = new StringBuilder();
                sb.append(str);
                sb.append(gv5.CONNECT_VALUE_STR);
                sb.append(hMFormatInMinutes);
            } else {
                sb = new StringBuilder();
                sb.append(hMFormatInMinutes);
                sb.append(gv5.CONNECT_VALUE_STR);
                sb.append(str);
            }
            string = sb.toString();
        }
        LocalDate localDate = barEntry.localDate;
        Intrinsics.checkNotNull(localDate);
        long jLocalDateToTimestamp = TimeDateUtil.localDateToTimestamp(localDate) * ((long) 1000);
        Context context5 = this.mContext;
        Intrinsics.checkNotNull(context5);
        return barEntry.getY() > 0.0f ? string + gv5.CONNECT_STR + TimeDateUtil.getDateFormated(jLocalDateToTimestamp, context5.getString(c0j.l)) : "";
    }

    public HearingHighLightMarkValueFormatter(@Nullable Context context) {
        this(0);
        this.mContext = context;
    }
}
