package com.xiaomi.fitness.health.threetarget.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.fragment.app.FragmentActivity;
import com.xiaomi.fit.fitness.export.data.aggregation.GoalItem;
import com.xiaomi.fit.fitness.parser.schema.DailyRecordKey;
import com.xiaomi.fitness.baseui.widget.SportDetailItemView;
import com.xiaomi.fitness.chart.barchart.SpeedRatioLayoutManager;
import com.xiaomi.fitness.chart.entrys.RecyclerBarEntry;
import com.xiaomi.fitness.chart.view.BarChartRecyclerView;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.SettingsPropertiesUtil;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.common.utils.UIUtils;
import com.xiaomi.fitness.data.valueformatter.XAxisTargetFormatter;
import com.xiaomi.fitness.health.threetarget.view.TargetItemChartView;
import com.xiaomi.fitness.util.ExtUtilKt;
import com.xiaomi.fitness.util.HealthUtil;
import com.xiaomi.fitness.widget.view.DataTitleSimpleView;
import defpackage.c0j;
import defpackage.eri;
import defpackage.hak;
import defpackage.iji;
import defpackage.jui;
import defpackage.n4j;
import defpackage.onq;
import defpackage.pni;
import defpackage.pz9;
import defpackage.q02;
import defpackage.qxi;
import defpackage.r02;
import defpackage.rtr;
import defpackage.rz5;
import defpackage.s02;
import defpackage.vnq;
import defpackage.vqr;
import defpackage.x44;
import defpackage.xcm;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt___RangesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000²\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010w\u001a\u00020v\u0012\b\u0010y\u001a\u0004\u0018\u00010x\u0012\u0006\u0010z\u001a\u00020\u0002¢\u0006\u0004\b{\u0010|B\u0019\b\u0016\u0012\u0006\u0010w\u001a\u00020v\u0012\u0006\u0010y\u001a\u00020x¢\u0006\u0004\b{\u0010}B\u0011\b\u0016\u0012\u0006\u0010w\u001a\u00020v¢\u0006\u0004\b{\u0010~J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\f\u0010\u000bJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0011\u0010\u000fJ\u000f\u0010\u0012\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0012\u0010\u000bJ\u000f\u0010\u0013\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0013\u0010\u000bJ\u000f\u0010\u0014\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0014\u0010\u000bJ\u0017\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0019\u0010\u000fJ\u000f\u0010\u001a\u001a\u00020\rH\u0002¢\u0006\u0004\b\u001a\u0010\u000fJ\u000f\u0010\u001b\u001a\u00020\rH\u0002¢\u0006\u0004\b\u001b\u0010\u000fJ\u000f\u0010\u001c\u001a\u00020\rH\u0002¢\u0006\u0004\b\u001c\u0010\u000fJ\u000f\u0010\u001d\u001a\u00020\rH\u0002¢\u0006\u0004\b\u001d\u0010\u000fJ\u000f\u0010\u001e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u001e\u0010\u000fJ\u000f\u0010\u001f\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u001f\u0010\tJ\u0017\u0010!\u001a\u00020\u00072\u0006\u0010 \u001a\u00020\u0002H\u0002¢\u0006\u0004\b!\u0010\"J\u001f\u0010&\u001a\u00020#2\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020#H\u0002¢\u0006\u0004\b&\u0010'J1\u0010.\u001a\b\u0012\u0004\u0012\u00020-0,2\u0006\u0010(\u001a\u00020\u00152\u0012\u0010+\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020*0)H\u0002¢\u0006\u0004\b.\u0010/J1\u00100\u001a\u00020\u00072\u0006\u0010(\u001a\u00020\u00152\u0012\u0010+\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020*0)2\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b0\u00101J\u0015\u00103\u001a\u00020\u00072\u0006\u00102\u001a\u00020\u0002¢\u0006\u0004\b3\u0010\"J\u0015\u00105\u001a\u00020\u00072\u0006\u00104\u001a\u00020\u0002¢\u0006\u0004\b5\u0010\"R$\u00106\u001a\u0004\u0018\u00010\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b6\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R$\u0010=\u001a\u0004\u0018\u00010<8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR$\u0010D\u001a\u0004\u0018\u00010C8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bD\u0010E\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR$\u0010K\u001a\u0004\u0018\u00010J8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bK\u0010L\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR$\u0010Q\u001a\u0004\u0018\u00010J8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bQ\u0010L\u001a\u0004\bR\u0010N\"\u0004\bS\u0010PR$\u0010U\u001a\u0004\u0018\u00010T8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bU\u0010V\u001a\u0004\bW\u0010X\"\u0004\bY\u0010ZR\"\u0010[\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b[\u0010\\\u001a\u0004\b]\u0010\u000b\"\u0004\b^\u0010\"R\u001e\u0010`\u001a\n\u0012\u0004\u0012\u00020-\u0018\u00010_8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b`\u0010aR\u0018\u0010c\u001a\u0004\u0018\u00010b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bc\u0010dR\u0018\u0010f\u001a\u0004\u0018\u00010e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bf\u0010gR\u0018\u0010i\u001a\u0004\u0018\u00010h8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bi\u0010jR\u0018\u0010l\u001a\u0004\u0018\u00010k8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bl\u0010mR\u0018\u0010o\u001a\u0004\u0018\u00010n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bo\u0010pR\u001e\u0010r\u001a\n\u0012\u0004\u0012\u00020-\u0018\u00010q8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\br\u0010sR\u0016\u0010t\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bt\u0010\\R\u0016\u0010u\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bu\u0010\\¨\u0006\u007f"}, d2 = {"Lcom/xiaomi/fitness/health/threetarget/view/TargetItemChartView;", "Landroid/widget/LinearLayout;", "", DailyRecordKey.sportType, "", "needCheckUserInfo", "(I)Z", "", "initView", "()V", "getSportType", "()I", "getTitleIconRes", "", "getTitleString", "()Ljava/lang/String;", "getItem1String", "getItem2String", "getCharColor", "getTargetLineColor", "getTipsBg", "Lorg/joda/time/LocalDate;", "selectedDate", "getTipsTxt", "(Lorg/joda/time/LocalDate;)Ljava/lang/String;", "getTargetTipsFarLessThanLastWeek", "getTargetTipsFarMoreThanLastWeek", "getTargetTipsLessThanLastWeek", "getTargetTipsEqualThanLastWeek", "getTargetTipsMoreThanLastWeek", "getTargetTipsWillDone", "initChartView", "scrollPosition", "reSizeYAxis", "(I)V", "", "yAxisMaximum", "yAxisMaxTarget", "getMaxYAxis", "(FF)F", "startLocalDate", "", "Lcom/xiaomi/fit/fitness/export/data/aggregation/GoalItem;", "itemMap", "", "Lcom/xiaomi/fitness/chart/entrys/RecyclerBarEntry;", "createWeekEntries", "(Lorg/joda/time/LocalDate;Ljava/util/Map;)Ljava/util/List;", "showChartRecord", "(Lorg/joda/time/LocalDate;Ljava/util/Map;Lorg/joda/time/LocalDate;)V", "dayValue", "showLeftDaySummary", "lastWeekAvgValue", "showRightLastWeekSummary", "itemViewContainer", "Landroid/widget/LinearLayout;", "getItemViewContainer", "()Landroid/widget/LinearLayout;", "setItemViewContainer", "(Landroid/widget/LinearLayout;)V", "Landroidx/appcompat/widget/LinearLayoutCompat;", "tipsContainer", "Landroidx/appcompat/widget/LinearLayoutCompat;", "getTipsContainer", "()Landroidx/appcompat/widget/LinearLayoutCompat;", "setTipsContainer", "(Landroidx/appcompat/widget/LinearLayoutCompat;)V", "Landroid/widget/TextView;", "tipsTv", "Landroid/widget/TextView;", "getTipsTv", "()Landroid/widget/TextView;", "setTipsTv", "(Landroid/widget/TextView;)V", "Lcom/xiaomi/fitness/baseui/widget/SportDetailItemView;", "itemView1", "Lcom/xiaomi/fitness/baseui/widget/SportDetailItemView;", "getItemView1", "()Lcom/xiaomi/fitness/baseui/widget/SportDetailItemView;", "setItemView1", "(Lcom/xiaomi/fitness/baseui/widget/SportDetailItemView;)V", "itemView2", "getItemView2", "setItemView2", "Lcom/xiaomi/fitness/chart/view/BarChartRecyclerView;", "recyclerChartView", "Lcom/xiaomi/fitness/chart/view/BarChartRecyclerView;", "getRecyclerChartView", "()Lcom/xiaomi/fitness/chart/view/BarChartRecyclerView;", "setRecyclerChartView", "(Lcom/xiaomi/fitness/chart/view/BarChartRecyclerView;)V", "mLastWeekAvgValue", "I", "getMLastWeekAvgValue", "setMLastWeekAvgValue", "Lq02;", "mChartAdapter", "Lq02;", "Ls02;", "itemDecoration", "Ls02;", "Lr02;", "mChartAttrs", "Lr02;", "Lrtr;", "mYAxis", "Lrtr;", "Lvqr;", "mXAxis", "Lvqr;", "Lonq;", "valueFormatter", "Lonq;", "", "mEntries", "Ljava/util/List;", "displayNumber", "goalType", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "(Landroid/content/Context;)V", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nTargetItemChartView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TargetItemChartView.kt\ncom/xiaomi/fitness/health/threetarget/view/TargetItemChartView\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,479:1\n774#2:480\n865#2,2:481\n*S KotlinDebug\n*F\n+ 1 TargetItemChartView.kt\ncom/xiaomi/fitness/health/threetarget/view/TargetItemChartView\n*L\n205#1:480\n205#1:481,2\n*E\n"})
public final class TargetItemChartView extends LinearLayout {
    private int displayNumber;
    private int goalType;

    @Nullable
    private s02 itemDecoration;

    @Nullable
    private SportDetailItemView itemView1;

    @Nullable
    private SportDetailItemView itemView2;

    @Nullable
    private LinearLayout itemViewContainer;

    @Nullable
    private q02<RecyclerBarEntry> mChartAdapter;

    @Nullable
    private r02 mChartAttrs;

    @Nullable
    private List<RecyclerBarEntry> mEntries;
    private int mLastWeekAvgValue;

    @Nullable
    private vqr mXAxis;

    @Nullable
    private rtr mYAxis;

    @Nullable
    private BarChartRecyclerView recyclerChartView;

    @Nullable
    private LinearLayoutCompat tipsContainer;

    @Nullable
    private TextView tipsTv;

    @Nullable
    private onq valueFormatter;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TargetItemChartView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        LayoutInflater.from(context).inflate(jui.V7, this);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, n4j.Z5, i, 0);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        this.goalType = typedArrayObtainStyledAttributes.getInt(n4j.a6, 0);
        typedArrayObtainStyledAttributes.recycle();
        initView();
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0030  */
    private final List<RecyclerBarEntry> createWeekEntries(LocalDate startLocalDate, Map<LocalDate, GoalItem> itemMap) {
        int achievedValue;
        LocalDate localDatePlusDays = startLocalDate.plusDays(6);
        LinkedList linkedList = new LinkedList();
        int i = 0;
        while (!localDatePlusDays.isBefore(startLocalDate)) {
            Intrinsics.checkNotNull(localDatePlusDays);
            long jChangZeroOfTheDay = TimeDateUtil.changZeroOfTheDay(localDatePlusDays);
            GoalItem goalItem = itemMap.get(localDatePlusDays);
            if (goalItem != null) {
                Intrinsics.checkNotNull(localDatePlusDays);
                if (TimeDateUtil.isFuture(localDatePlusDays)) {
                    achievedValue = 0;
                } else {
                    achievedValue = goalItem.getAchievedValue();
                }
            } else {
                achievedValue = 0;
            }
            RecyclerBarEntry recyclerBarEntry = new RecyclerBarEntry(i, achievedValue, jChangZeroOfTheDay, RecyclerBarEntry.INSTANCE.getWeekBarEntryType(localDatePlusDays));
            recyclerBarEntry.localDate = localDatePlusDays;
            recyclerBarEntry.setGoalValue(goalItem != null ? goalItem.getGoalValue() : 0);
            linkedList.add(recyclerBarEntry);
            localDatePlusDays = localDatePlusDays.minusDays(1);
            i++;
        }
        return linkedList;
    }

    private final int getCharColor() {
        int i = this.goalType;
        if (i == 1) {
            return iji.j2;
        }
        if (i != 3) {
            return i != 4 ? iji.T : iji.B0;
        }
        return iji.h2;
    }

    private final String getItem1String() {
        int i;
        int i2 = this.goalType;
        if (i2 == 1) {
            i = c0j.hm;
        } else if (i2 != 3) {
            i = i2 != 4 ? c0j.em : c0j.fm;
        } else {
            i = c0j.gm;
        }
        String string = getContext().getString(i);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return string;
    }

    private final String getItem2String() {
        int i;
        int i2 = this.goalType;
        if (i2 == 1) {
            i = c0j.pm;
        } else if (i2 != 3) {
            i = i2 != 4 ? c0j.mm : c0j.nm;
        } else {
            i = c0j.om;
        }
        String string = getContext().getString(i);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return string;
    }

    private final float getMaxYAxis(float yAxisMaximum, float yAxisMaxTarget) {
        int i;
        float f;
        float fCoerceAtLeast = RangesKt___RangesKt.coerceAtLeast(yAxisMaximum, yAxisMaxTarget);
        int i2 = this.goalType;
        if (i2 != 1) {
            if (i2 != 3) {
                i = i2 != 4 ? 200 : 20;
            } else {
                f = 4;
            }
            return fCoerceAtLeast + (f - (fCoerceAtLeast % f));
        }
        i = 2000;
        f = i;
        return fCoerceAtLeast + (f - (fCoerceAtLeast % f));
    }

    private final int getSportType() {
        int i = this.goalType;
        if (i == 1) {
            return 3;
        }
        if (i != 3) {
            return i != 4 ? 2 : 15;
        }
        return 5;
    }

    private final int getTargetLineColor() {
        int i = this.goalType;
        if (i == 1) {
            return iji.k2;
        }
        if (i != 3) {
            return i != 4 ? iji.U : iji.C0;
        }
        return iji.i2;
    }

    private final String getTargetTipsEqualThanLastWeek() {
        int i = this.goalType;
        if (i == 1) {
            String string = getResources().getString(c0j.Em);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            return string;
        }
        if (i != 4) {
            String string2 = getResources().getString(c0j.Cm);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            return string2;
        }
        String string3 = getResources().getString(c0j.Dm);
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        return string3;
    }

    private final String getTargetTipsFarLessThanLastWeek() {
        int i = this.goalType;
        if (i == 1) {
            String string = getResources().getString(c0j.Hm);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            return string;
        }
        if (i != 4) {
            String string2 = getResources().getString(c0j.Fm);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            return string2;
        }
        String string3 = getResources().getString(c0j.Gm);
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        return string3;
    }

    private final String getTargetTipsFarMoreThanLastWeek() {
        int i = this.goalType;
        if (i == 1) {
            String string = getResources().getString(c0j.Km);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            return string;
        }
        if (i != 4) {
            String string2 = getResources().getString(c0j.Im);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            return string2;
        }
        String string3 = getResources().getString(c0j.Jm);
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        return string3;
    }

    private final String getTargetTipsLessThanLastWeek() {
        int i = this.goalType;
        if (i == 1) {
            String string = getResources().getString(c0j.Om);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            return string;
        }
        if (i != 4) {
            String string2 = getResources().getString(c0j.Mm);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            return string2;
        }
        String string3 = getResources().getString(c0j.Nm);
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        return string3;
    }

    private final String getTargetTipsMoreThanLastWeek() {
        int i = this.goalType;
        if (i == 1) {
            String string = getResources().getString(c0j.Rm);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            return string;
        }
        if (i != 4) {
            String string2 = getResources().getString(c0j.Pm);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            return string2;
        }
        String string3 = getResources().getString(c0j.Qm);
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        return string3;
    }

    private final String getTargetTipsWillDone() {
        int i = this.goalType;
        if (i == 1) {
            String string = getResources().getString(c0j.Wm);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            return string;
        }
        if (i != 4) {
            String string2 = getResources().getString(c0j.Um);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            return string2;
        }
        String string3 = getResources().getString(c0j.Vm);
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        return string3;
    }

    private final int getTipsBg() {
        int i = this.goalType;
        if (i == 1) {
            return pni.X2;
        }
        if (i != 3) {
            return i != 4 ? pni.U2 : pni.V2;
        }
        return pni.W2;
    }

    private final String getTipsTxt(LocalDate selectedDate) {
        ArrayList arrayList;
        int i;
        List<RecyclerBarEntry> list = this.mEntries;
        RecyclerBarEntry recyclerBarEntry = null;
        if (list != null) {
            arrayList = new ArrayList();
            i = 0;
            for (Object obj : list) {
                RecyclerBarEntry recyclerBarEntry2 = (RecyclerBarEntry) obj;
                if (recyclerBarEntry2.getY() >= recyclerBarEntry2.getGoalValue() && recyclerBarEntry2.getGoalValue() > 0) {
                    i++;
                }
                LocalDate localDate = recyclerBarEntry2.localDate;
                if (localDate != null && TimeDateUtil.isToday(localDate)) {
                    arrayList.add(obj);
                }
            }
        } else {
            arrayList = null;
            i = 0;
        }
        if (arrayList != null && (!arrayList.isEmpty())) {
            recyclerBarEntry = (RecyclerBarEntry) arrayList.get(0);
        }
        if (recyclerBarEntry != null) {
            if (this.goalType == 3) {
                if (TimeDateUtil.isToday(selectedDate)) {
                    if (i == 0 && selectedDate.getDayOfWeek() > 2) {
                        return ExtUtilKt.getString(c0j.Sm);
                    }
                    float y = recyclerBarEntry.getY() / recyclerBarEntry.getGoalValue();
                    boolean z = recyclerBarEntry.getY() >= ((float) recyclerBarEntry.getGoalValue());
                    float goalValue = recyclerBarEntry.getGoalValue() - recyclerBarEntry.getY();
                    int i2 = 21 - Calendar.getInstance().get(11);
                    if (z || y <= 0.5d || i2 <= goalValue) {
                        return ExtUtilKt.getString(c0j.Tm);
                    }
                    String quantityString = ApplicationExtKt.getApplication().getResources().getQuantityString(qxi.k1, i2, Integer.valueOf(i2));
                    Intrinsics.checkNotNull(quantityString);
                    return quantityString;
                }
            } else if (TimeDateUtil.isToday(selectedDate) && recyclerBarEntry.getGoalValue() > 0) {
                if (Calendar.getInstance().get(11) < 22) {
                    float y2 = recyclerBarEntry.getY() / recyclerBarEntry.getGoalValue();
                    if (y2 >= 1.0f) {
                        return "";
                    }
                    double d = y2;
                    if (d >= 0.9d) {
                        return getTargetTipsWillDone();
                    }
                    if (d < 0.9d && d >= 0.7d) {
                        int goalValue2 = (int) (recyclerBarEntry.getGoalValue() - recyclerBarEntry.getY());
                        int i3 = this.goalType;
                        if (i3 == 1) {
                            String quantityString2 = getResources().getQuantityString(qxi.g1, goalValue2, Integer.valueOf(goalValue2));
                            Intrinsics.checkNotNullExpressionValue(quantityString2, "getQuantityString(...)");
                            return quantityString2;
                        }
                        if (i3 == 2) {
                            String quantityString3 = getResources().getQuantityString(qxi.e1, goalValue2, Integer.valueOf(goalValue2));
                            Intrinsics.checkNotNullExpressionValue(quantityString3, "getQuantityString(...)");
                            return quantityString3;
                        }
                        if (i3 == 4) {
                            String quantityString4 = getResources().getQuantityString(qxi.f1, goalValue2, Integer.valueOf(goalValue2));
                            Intrinsics.checkNotNullExpressionValue(quantityString4, "getQuantityString(...)");
                            return quantityString4;
                        }
                    } else {
                        if (d < 0.7d && d >= 0.5d) {
                            String string = getResources().getString(c0j.Lm);
                            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                            return string;
                        }
                        if (d < 0.5d) {
                            int goalValue3 = (int) (recyclerBarEntry.getGoalValue() - recyclerBarEntry.getY());
                            int i4 = this.goalType;
                            if (i4 == 1) {
                                String quantityString5 = getResources().getQuantityString(qxi.j1, goalValue3, Integer.valueOf(goalValue3));
                                Intrinsics.checkNotNullExpressionValue(quantityString5, "getQuantityString(...)");
                                return quantityString5;
                            }
                            if (i4 == 2) {
                                String quantityString6 = getResources().getQuantityString(qxi.h1, goalValue3, Integer.valueOf(goalValue3));
                                Intrinsics.checkNotNullExpressionValue(quantityString6, "getQuantityString(...)");
                                return quantityString6;
                            }
                            if (i4 == 4) {
                                String quantityString7 = getResources().getQuantityString(qxi.i1, goalValue3, Integer.valueOf(goalValue3));
                                Intrinsics.checkNotNullExpressionValue(quantityString7, "getQuantityString(...)");
                                return quantityString7;
                            }
                        }
                    }
                } else if (this.mLastWeekAvgValue > 0) {
                    float y3 = recyclerBarEntry.getY();
                    int i5 = this.mLastWeekAvgValue;
                    float f = (y3 - i5) / i5;
                    float fAbs = Math.abs(f);
                    Logger.i("TargetItemChart", "avgRate:" + f + " abs(avsRate):" + fAbs);
                    double d2 = (double) fAbs;
                    if (d2 <= 0.1d) {
                        return getTargetTipsEqualThanLastWeek();
                    }
                    if (d2 <= 0.4d) {
                        return f > 0.0f ? getTargetTipsMoreThanLastWeek() : getTargetTipsLessThanLastWeek();
                    }
                    double d3 = f;
                    if (d3 >= 0.4d) {
                        return getTargetTipsFarMoreThanLastWeek();
                    }
                    if (d3 <= -0.4d) {
                        return getTargetTipsFarLessThanLastWeek();
                    }
                }
            }
        }
        return "";
    }

    private final int getTitleIconRes() {
        int i = this.goalType;
        if (i == 1) {
            return pni.Z;
        }
        if (i != 3) {
            return i != 4 ? pni.L : pni.J3;
        }
        return pni.X;
    }

    private final String getTitleString() {
        int i;
        int i2 = this.goalType;
        if (i2 == 1) {
            i = c0j.ym;
        } else if (i2 != 3) {
            i = i2 != 4 ? c0j.C4 : c0j.vm;
        } else {
            i = c0j.wm;
        }
        String string = getContext().getString(i);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return string;
    }

    private final void initChartView() {
        this.mEntries = new ArrayList();
        BarChartRecyclerView barChartRecyclerView = this.recyclerChartView;
        Intrinsics.checkNotNull(barChartRecyclerView);
        r02 r02Var = (r02) barChartRecyclerView.mAttrs;
        this.mChartAttrs = r02Var;
        if (r02Var != null) {
            r02Var.g0 = x44.a(getCharColor());
        }
        r02 r02Var2 = this.mChartAttrs;
        if (r02Var2 != null) {
            r02Var2.G0 = x44.a(getTargetLineColor());
        }
        r02 r02Var3 = this.mChartAttrs;
        if (r02Var3 != null) {
            r02Var3.H0 = ExtUtilKt.getString(c0j.lm);
        }
        r02 r02Var4 = this.mChartAttrs;
        Intrinsics.checkNotNull(r02Var4);
        this.displayNumber = r02Var4.c;
        this.valueFormatter = new XAxisTargetFormatter();
        this.mYAxis = vnq.o(this.mChartAttrs, 30.0f);
        vqr vqrVar = new vqr(this.mChartAttrs, this.displayNumber);
        this.mXAxis = vqrVar;
        vqrVar.setValueFormatter(this.valueFormatter);
        vqr vqrVar2 = this.mXAxis;
        if (vqrVar2 != null) {
            vqrVar2.setTextColor(x44.a(iji.q3));
        }
        this.itemDecoration = new s02(this.mYAxis, this.mXAxis, this.mChartAttrs);
        TargetHighLightMarkValueFormatter targetHighLightMarkValueFormatter = new TargetHighLightMarkValueFormatter(0, this.goalType);
        s02 s02Var = this.itemDecoration;
        Intrinsics.checkNotNull(s02Var);
        s02Var.setHighLightValueFormatter(targetHighLightMarkValueFormatter);
        this.mChartAdapter = new q02<>(getContext(), this.mEntries, this.recyclerChartView, this.mXAxis, this.mChartAttrs, targetHighLightMarkValueFormatter);
        SpeedRatioLayoutManager speedRatioLayoutManager = new SpeedRatioLayoutManager(getContext(), this.mChartAttrs);
        BarChartRecyclerView barChartRecyclerView2 = this.recyclerChartView;
        Intrinsics.checkNotNull(barChartRecyclerView2);
        barChartRecyclerView2.setLayoutManager(speedRatioLayoutManager);
        BarChartRecyclerView barChartRecyclerView3 = this.recyclerChartView;
        Intrinsics.checkNotNull(barChartRecyclerView3);
        s02 s02Var2 = this.itemDecoration;
        Intrinsics.checkNotNull(s02Var2);
        barChartRecyclerView3.addItemDecoration(s02Var2);
        BarChartRecyclerView barChartRecyclerView4 = this.recyclerChartView;
        Intrinsics.checkNotNull(barChartRecyclerView4);
        barChartRecyclerView4.setAdapter(this.mChartAdapter);
        BarChartRecyclerView barChartRecyclerView5 = this.recyclerChartView;
        Intrinsics.checkNotNull(barChartRecyclerView5);
        barChartRecyclerView5.setNestedScrollingEnabled(false);
        hak hakVar = new hak(getContext(), this.recyclerChartView, new xcm() { // from class: com.xiaomi.fitness.health.threetarget.view.TargetItemChartView$initChartView$gestureListener$1
            @Override // defpackage.xcm, defpackage.u8h
            public void onItemSelected(RecyclerBarEntry barEntry, int position) {
                if (barEntry == null || !barEntry.isSelected()) {
                    LinearLayout itemViewContainer = this.this$0.getItemViewContainer();
                    if (itemViewContainer != null) {
                        itemViewContainer.setVisibility(0);
                        return;
                    }
                    return;
                }
                if (!SettingsPropertiesUtil.INSTANCE.isFoldDisplayAndNotFolded()) {
                    UIUtils uIUtils = UIUtils.INSTANCE;
                    Context context = this.this$0.getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                    if (!uIUtils.isTabletAndLandscape(context)) {
                        LinearLayout itemViewContainer2 = this.this$0.getItemViewContainer();
                        if (itemViewContainer2 != null) {
                            itemViewContainer2.setVisibility(4);
                            return;
                        }
                        return;
                    }
                }
                LinearLayout itemViewContainer3 = this.this$0.getItemViewContainer();
                if (itemViewContainer3 != null) {
                    itemViewContainer3.setVisibility(0);
                }
            }
        });
        hakVar.m(true);
        BarChartRecyclerView barChartRecyclerView6 = this.recyclerChartView;
        Intrinsics.checkNotNull(barChartRecyclerView6);
        barChartRecyclerView6.addOnItemTouchListener(hakVar);
        pz9.a(getContext());
    }

    private final void initView() {
        View viewFindViewById = findViewById(eri.F2);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        DataTitleSimpleView dataTitleSimpleView = (DataTitleSimpleView) viewFindViewById;
        dataTitleSimpleView.bindData(getTitleIconRes(), getTitleString());
        dataTitleSimpleView.showRightArrow();
        Context context = getContext();
        final FragmentActivity fragmentActivity = context instanceof FragmentActivity ? (FragmentActivity) context : null;
        dataTitleSimpleView.setOnClickListener(new View.OnClickListener() { // from class: z0p
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) throws Throwable {
                TargetItemChartView.initView$lambda$1(fragmentActivity, this, view);
            }
        });
        this.itemViewContainer = (LinearLayout) findViewById(eri.j8);
        this.tipsContainer = (LinearLayoutCompat) findViewById(eri.bj);
        this.tipsTv = (TextView) findViewById(eri.aj);
        LinearLayoutCompat linearLayoutCompat = this.tipsContainer;
        if (linearLayoutCompat != null) {
            linearLayoutCompat.setBackgroundResource(getTipsBg());
        }
        this.itemView1 = (SportDetailItemView) findViewById(eri.q3);
        this.itemView2 = (SportDetailItemView) findViewById(eri.r3);
        SportDetailItemView sportDetailItemView = this.itemView1;
        if (sportDetailItemView != null) {
            sportDetailItemView.setElementValueTxtColor(iji.p3);
        }
        SportDetailItemView sportDetailItemView2 = this.itemView2;
        if (sportDetailItemView2 != null) {
            sportDetailItemView2.setElementValueTxtColor(iji.p3);
        }
        this.recyclerChartView = (BarChartRecyclerView) findViewById(eri.e0);
        initChartView();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$1(FragmentActivity fragmentActivity, TargetItemChartView this$0, View view) throws Throwable {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (fragmentActivity != null) {
            int sportType = this$0.getSportType();
            Bundle bundle = new Bundle();
            bundle.putInt("sport_type", sportType);
            if (this$0.needCheckUserInfo(sportType)) {
                HealthUtil.INSTANCE.goDataPageCheckUserInfo(this$0.getContext(), sportType, bundle, null, HealthUtil.ORIGIN_HOME_CARD);
            } else {
                HealthUtil.INSTANCE.goDataPage(fragmentActivity, this$0.getContext(), sportType, bundle, null, HealthUtil.ORIGIN_HOME_CARD);
            }
        }
    }

    private final boolean needCheckUserInfo(int sportType) {
        return sportType == 3 || sportType == 2 || sportType == 15 || sportType == 4 || sportType == 1;
    }

    private final void reSizeYAxis(int scrollPosition) {
        List<RecyclerBarEntry> list = this.mEntries;
        Intrinsics.checkNotNull(list);
        if (list.size() == 0) {
            return;
        }
        int i = this.displayNumber;
        List<RecyclerBarEntry> list2 = this.mEntries;
        Intrinsics.checkNotNull(list2);
        int iMin = Math.min(i, list2.size());
        BarChartRecyclerView barChartRecyclerView = this.recyclerChartView;
        Intrinsics.checkNotNull(barChartRecyclerView);
        barChartRecyclerView.scrollToPosition(scrollPosition);
        List<RecyclerBarEntry> list3 = this.mEntries;
        Intrinsics.checkNotNull(list3);
        List<RecyclerBarEntry> listSubList = list3.subList(scrollPosition, iMin + scrollPosition);
        float maxYAxis = getMaxYAxis(HealthUtil.getTheMaxNumber(listSubList), HealthUtil.INSTANCE.getTheMaxTarget(listSubList));
        rtr rtrVar = this.mYAxis;
        Intrinsics.checkNotNull(rtrVar);
        rtr rtrVarJ = rtrVar.j(this.mYAxis, maxYAxis);
        q02<RecyclerBarEntry> q02Var = this.mChartAdapter;
        Intrinsics.checkNotNull(q02Var);
        q02Var.notifyDataSetChanged();
        if (rtrVarJ != null) {
            this.mYAxis = rtrVarJ;
            s02 s02Var = this.itemDecoration;
            Intrinsics.checkNotNull(s02Var);
            s02Var.setYAxis(this.mYAxis);
            q02<RecyclerBarEntry> q02Var2 = this.mChartAdapter;
            Intrinsics.checkNotNull(q02Var2);
            q02Var2.setYAxis(this.mYAxis);
        }
    }

    @Nullable
    public final SportDetailItemView getItemView1() {
        return this.itemView1;
    }

    @Nullable
    public final SportDetailItemView getItemView2() {
        return this.itemView2;
    }

    @Nullable
    public final LinearLayout getItemViewContainer() {
        return this.itemViewContainer;
    }

    public final int getMLastWeekAvgValue() {
        return this.mLastWeekAvgValue;
    }

    @Nullable
    public final BarChartRecyclerView getRecyclerChartView() {
        return this.recyclerChartView;
    }

    @Nullable
    public final LinearLayoutCompat getTipsContainer() {
        return this.tipsContainer;
    }

    @Nullable
    public final TextView getTipsTv() {
        return this.tipsTv;
    }

    public final void setItemView1(@Nullable SportDetailItemView sportDetailItemView) {
        this.itemView1 = sportDetailItemView;
    }

    public final void setItemView2(@Nullable SportDetailItemView sportDetailItemView) {
        this.itemView2 = sportDetailItemView;
    }

    public final void setItemViewContainer(@Nullable LinearLayout linearLayout) {
        this.itemViewContainer = linearLayout;
    }

    public final void setMLastWeekAvgValue(int i) {
        this.mLastWeekAvgValue = i;
    }

    public final void setRecyclerChartView(@Nullable BarChartRecyclerView barChartRecyclerView) {
        this.recyclerChartView = barChartRecyclerView;
    }

    public final void setTipsContainer(@Nullable LinearLayoutCompat linearLayoutCompat) {
        this.tipsContainer = linearLayoutCompat;
    }

    public final void setTipsTv(@Nullable TextView textView) {
        this.tipsTv = textView;
    }

    public final void showChartRecord(@NotNull LocalDate startLocalDate, @NotNull Map<LocalDate, GoalItem> itemMap, @NotNull LocalDate selectedDate) {
        Intrinsics.checkNotNullParameter(startLocalDate, "startLocalDate");
        Intrinsics.checkNotNullParameter(itemMap, "itemMap");
        Intrinsics.checkNotNullParameter(selectedDate, "selectedDate");
        List<RecyclerBarEntry> listCreateWeekEntries = createWeekEntries(startLocalDate, itemMap);
        List<RecyclerBarEntry> list = this.mEntries;
        Intrinsics.checkNotNull(list);
        list.clear();
        List<RecyclerBarEntry> list2 = this.mEntries;
        Intrinsics.checkNotNull(list2);
        list2.addAll(listCreateWeekEntries);
        q02<RecyclerBarEntry> q02Var = this.mChartAdapter;
        Intrinsics.checkNotNull(q02Var);
        q02Var.notifyDataSetChanged();
        reSizeYAxis(0);
        String tipsTxt = getTipsTxt(selectedDate);
        if (tipsTxt == null || tipsTxt.length() == 0) {
            LinearLayoutCompat linearLayoutCompat = this.tipsContainer;
            if (linearLayoutCompat != null) {
                ExtUtilKt.gone(linearLayoutCompat);
                return;
            }
            return;
        }
        LinearLayoutCompat linearLayoutCompat2 = this.tipsContainer;
        if (linearLayoutCompat2 != null) {
            ExtUtilKt.visible(linearLayoutCompat2);
        }
        TextView textView = this.tipsTv;
        if (textView != null) {
            textView.setText(tipsTxt);
        }
    }

    public final void showLeftDaySummary(int dayValue) {
        rz5 rz5Var = new rz5(getItem1String(), String.valueOf(dayValue));
        SportDetailItemView sportDetailItemView = this.itemView1;
        if (sportDetailItemView != null) {
            sportDetailItemView.bindData(rz5Var, false);
        }
    }

    public final void showRightLastWeekSummary(int lastWeekAvgValue) {
        this.mLastWeekAvgValue = lastWeekAvgValue;
        rz5 rz5Var = new rz5(getItem2String(), String.valueOf(lastWeekAvgValue));
        SportDetailItemView sportDetailItemView = this.itemView2;
        if (sportDetailItemView != null) {
            sportDetailItemView.bindData(rz5Var, false);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TargetItemChartView(@NotNull Context context, @NotNull AttributeSet attrs) {
        this(context, attrs, 0);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TargetItemChartView(@NotNull Context context) {
        this(context, null, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
