package com.huami.module.homepage.cards.business.heartrate;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.huami.heartrate.model.AbnormalHeartBeatEntity;
import com.huami.heartrate.service.ChartVo;
import com.huami.heartrate.service.HeartRate;
import com.huami.heartrate.service.HeartRateInfo;
import com.huami.heartrate.service.HeartRateStatisticalInfo;
import com.huami.heartrate.view.AbsHeartRateChartView;
import com.huami.module.homepage.R;
import com.huami.module.homepage.cards.business.heartrate.HeartRateChartView;
import com.huami.module.homepage.cards.service.ServiceManager;
import com.huami.module.homepage.databinding.HomepageItemCardHeartRateChartBinding;
import com.huami.module.homepage.utils.HomeUtils;
import com.huami.module.ktx.I18nKt;
import com.huami.module.ktx.NumberExtKt;
import com.huami.module.ktx.TimeExtKt;
import com.huami.module.utils.HMSpannable;
import com.huami.tools.analytics.DbUtils;
import com.tencent.connect.common.Constants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 .2\u00020\u0001:\u0001\u001fB'\b\u0007\u0012\u0006\u0010(\u001a\u00020'\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010)\u0012\b\b\u0002\u0010+\u001a\u00020\r¢\u0006\u0004\b,\u0010-J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002J\u001a\u0010\t\u001a\u00020\b2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0002J\b\u0010\u000b\u001a\u00020\nH\u0002J\b\u0010\f\u001a\u00020\nH\u0002J\u0017\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0010\u0010\u0011J&\u0010\u0017\u001a\u00020\u000f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00022\u0006\u0010\u0016\u001a\u00020\bJ\u0014\u0010\u001a\u001a\u00020\u000f2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0018J\u000e\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\bJ\u0006\u0010\u001d\u001a\u00020\bR\u0016\u0010!\u001a\u00020\u001e8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010$\u001a\u00020\"8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010#R\u0018\u0010&\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010%¨\u0006/"}, d2 = {"Lcom/huami/module/homepage/cards/business/heartrate/HeartRateChartView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "", "", "c", "", "latestRates", "newRates", "", "b", "", "getContainerWidth", "getContainerHeight", "", "averHeartRate", "", "setAverHeartRate", "(Ljava/lang/Integer;)V", "Lcom/huami/heartrate/service/HeartRateInfo;", "heartRateInfo", "Lcom/huami/heartrate/model/AbnormalHeartBeatEntity;", "abnormalRange", "switchIsOpen", "setHeartRateChart", "Lkotlin/Function0;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setOnClick", "hide", "hideHrSwitchButton", "heartButtonVisible", "Lcom/huami/module/homepage/databinding/HomepageItemCardHeartRateChartBinding;", "a", "Lcom/huami/module/homepage/databinding/HomepageItemCardHeartRateChartBinding;", "binding", "Lcom/huami/heartrate/view/AbsHeartRateChartView;", "Lcom/huami/heartrate/view/AbsHeartRateChartView;", "chartView", "[B", "latestCacheRawRates", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", GoogleApiAvailabilityLight.a, "homePage_release"}, k = 1, mv = {1, 5, 1})
public final class HeartRateChartView extends ConstraintLayout {

    @NotNull
    private static final a d = new a(null);

    @Deprecated
    private static final int e = 1440;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final HomepageItemCardHeartRateChartBinding binding;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final AbsHeartRateChartView chartView;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private byte[] latestCacheRawRates;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"com/huami/module/homepage/cards/business/heartrate/HeartRateChartView$a", "", "", "MAX_HEART_RATE_COUNT", LogUtil.I, "<init>", "()V", "homePage_release"}, k = 1, mv = {1, 5, 1})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @JvmOverloads
    public HeartRateChartView(@NotNull Context context) {
        this(context, null, 0, 6, null);
    }

    @JvmOverloads
    public HeartRateChartView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ HeartRateChartView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    private final boolean b(byte[] latestRates, byte[] newRates) {
        if (latestRates == null || latestRates.length != newRates.length) {
            return false;
        }
        return Arrays.equals(newRates, latestRates);
    }

    private final List<Byte> c() {
        int i = 0;
        List listListOf = CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, -2, 43, 44, 44, 44, 44, 44, 43, 44, 44, 45, 44, 44, 44, 44, 44, 44, 44, 44, 44, 44, 59, 48, 40, 43, 45, 45, 45, 45, -2, 43, 44, 47, 67, 49, 47, 56, 48, 45, 66, 50, 46, 56, 48, 40, 43, 44, 47, 44, 44, 44, 44, 44, 44, 44, 43, 44, 44, -2, 43, 44, 44, 44, 44, 44, 44, 44, 44, 44, 44, 44, 44, 44, 44, 44, 44, 44, 44, 44, -2, 43, 44, 44, 44, 44, 44, 42, 44, 44, 44, 42, 44, 42, 47, 45, 45, 42, 44, 44, 44, 44, 44, 44, 44, 44, 44, 50, 52, 46, 51, 46, 45, 45, 45, 45, 45, 50, 57, 53, 58, 54, 53, 47, 51, 46, 48, 51, 52, 46, 45, 45, 64, 72, 68, 51, 46, 45, 50, 46, 45, 55, 56, 48, 45, 45, 50, 65, 53, 47, 47, 45, 47, 45, 46, 45, 45});
        IntRange intRange = new IntRange(0, 1440);
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(intRange, 10));
        Iterator<Integer> it2 = intRange.iterator();
        while (it2.hasNext()) {
            ((IntIterator) it2).nextInt();
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            arrayList.add(Byte.valueOf((byte) ((Number) listListOf.get(i % listListOf.size())).intValue()));
            i = i2;
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(Function0 function0, View view) {
        function0.invoke();
    }

    private final float getContainerHeight() {
        int measuredHeight = this.binding.chartContainer.getMeasuredHeight();
        int height = this.binding.chartContainer.getHeight();
        if (measuredHeight == 0) {
            return height != 0 ? height : NumberExtKt.getDp(90.0f);
        }
        return measuredHeight;
    }

    private final float getContainerWidth() {
        int measuredWidth = this.binding.chartContainer.getMeasuredWidth();
        int width = this.binding.chartContainer.getWidth();
        if (measuredWidth == 0) {
            return width != 0 ? width : Resources.getSystem().getDisplayMetrics().widthPixels - NumberExtKt.getDp(20.0f);
        }
        return measuredWidth;
    }

    public final boolean heartButtonVisible() {
        return this.binding.openHrDetectButton.getVisibility() == 0;
    }

    public final void hideHrSwitchButton(boolean hide) {
        this.binding.openHrDetectButton.setVisibility(hide ? 8 : 0);
        this.binding.chartMask.setVisibility(hide ? 8 : 0);
    }

    public final void setAverHeartRate(@Nullable Integer averHeartRate) {
        String strI18n;
        String string;
        TextView textView = this.binding.avgHr;
        HMSpannable hMSpannableAddSpaceBlank = HMSpannable.append$default(new HMSpannable(), getContext().getString(R.string.homepage_item_card_average_full_hr), null, null, false, null, null, null, 126, null).addSpaceBlank();
        if (averHeartRate == null || (strI18n = I18nKt.i18n(averHeartRate.intValue())) == null) {
            strI18n = "--";
        }
        HMSpannable hMSpannableAddSpaceBlank2 = HMSpannable.append$default(hMSpannableAddSpaceBlank, strI18n, null, 20, false, null, HomeUtils.getMaisonTypeface(), null, 90, null).addSpaceBlank();
        if (HomeUtils.isChineseLanguage()) {
            string = getContext().getResources().getQuantityString(R.plurals.homepage_item_card_unit_time_per_minute, averHeartRate == null ? 0 : averHeartRate.intValue());
        } else {
            string = getContext().getString(R.string.homepage_item_card_unit_bmp);
        }
        textView.setText(HMSpannable.append$default(hMSpannableAddSpaceBlank2, string, null, null, false, null, null, null, 126, null).build());
    }

    public final void setHeartRateChart(@Nullable HeartRateInfo heartRateInfo, @NotNull List<AbnormalHeartBeatEntity> abnormalRange, boolean switchIsOpen) {
        byte[] mergedRawHeartData;
        int size;
        Pair pair;
        byte[] mergedRawHeartData2;
        HeartRateStatisticalInfo heartRateStatisticalInfo;
        if (switchIsOpen) {
            pair = TuplesKt.to(heartRateInfo, abnormalRange);
        } else {
            if (heartRateInfo == null || (mergedRawHeartData = heartRateInfo.getMergedRawHeartData()) == null) {
                size = 0;
            } else {
                ArrayList arrayList = new ArrayList();
                int length = mergedRawHeartData.length;
                for (int i = 0; i < length; i++) {
                    byte b = mergedRawHeartData[i];
                    if (b > 0) {
                        arrayList.add(Byte.valueOf(b));
                    }
                }
                size = arrayList.size();
            }
            if (size > 480) {
                pair = TuplesKt.to(heartRateInfo, abnormalRange);
            } else {
                List<Byte> listC = c();
                pair = TuplesKt.to(new HeartRateInfo(TimeExtKt.getEndingTime(Calendar.getInstance()).getTime(), new HeartRateStatisticalInfo(0, 0, 0, (int) CollectionsKt___CollectionsKt.averageOfByte(listC), new HeartRate(0, TimeExtKt.getEndingTime(Calendar.getInstance()).getTime())), CollectionsKt___CollectionsKt.toByteArray(listC)), CollectionsKt__CollectionsKt.emptyList());
            }
        }
        HeartRateInfo heartRateInfo2 = (HeartRateInfo) pair.component1();
        List<AbnormalHeartBeatEntity> list = (List) pair.component2();
        if ((heartRateInfo2 == null || (mergedRawHeartData2 = heartRateInfo2.getMergedRawHeartData()) == null || !b(this.latestCacheRawRates, mergedRawHeartData2)) ? false : true) {
            return;
        }
        this.latestCacheRawRates = heartRateInfo2 == null ? null : heartRateInfo2.getMergedRawHeartData();
        this.chartView.refreshLineChart(this.binding.chartContainer, new ChartVo(0.0f, new String[]{"00", "04", "08", "12", Constants.VIA_REPORT_TYPE_START_WAP, "20", Constants.VIA_REPORT_TYPE_CHAT_AIO}, Float.valueOf(getContainerWidth()), Float.valueOf(getContainerHeight()), (heartRateInfo2 == null || (heartRateStatisticalInfo = heartRateInfo2.getHeartRateStatisticalInfo()) == null) ? null : new float[]{heartRateStatisticalInfo.getAvgHeartRate()}), heartRateInfo2, list);
    }

    public final void setOnClick(@NotNull final Function0<Unit> listener) {
        this.binding.openHrDetectButton.setOnClickListener(new View.OnClickListener() { // from class: ny3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HeartRateChartView.d(listener, view);
            }
        });
    }

    @JvmOverloads
    public HeartRateChartView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.binding = HomepageItemCardHeartRateChartBinding.inflate(LayoutInflater.from(context), this, true);
        this.chartView = ServiceManager.INSTANCE.getHeartRateService().buildHeartRateChartView(context);
    }
}
