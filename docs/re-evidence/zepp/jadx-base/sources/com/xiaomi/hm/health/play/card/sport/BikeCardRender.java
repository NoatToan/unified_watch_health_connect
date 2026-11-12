package com.xiaomi.hm.health.play.card.sport;

import android.content.Context;
import android.graphics.Color;
import androidx.p008lifecycle.LifecycleOwner;
import androidx.p008lifecycle.LiveData;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.tools.analytics.DbUtils;
import com.huami.watch.hmwatchmanager.R;
import com.xiaomi.hm.health.play.bean.SportDataBean;
import kotlin.Metadata;
import kotlin.Triple;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 J$\u0010\u0006\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\"\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\n\u001a\u00020\tH\u0016J\u0018\u0010\u000e\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0007H\u0016R$\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u000f8\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0019\u001a\u00020\u00078\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\u001c\u001a\u00020\u00078\u0016@\u0016X\u0096D¢\u0006\f\n\u0004\b\u001a\u0010\u0016\u001a\u0004\b\u001b\u0010\u0018¨\u0006!"}, d2 = {"Lcom/xiaomi/hm/health/play/card/sport/BikeCardRender;", "Lcom/xiaomi/hm/health/play/card/sport/SportCardBaseRender;", "Lcom/xiaomi/hm/health/play/bean/SportDataBean;", "data", "Lkotlin/Triple;", "", "convertToShowData", "", "getDataDesc", "", "showTodayUi", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "days", "showHasHistoryData", "Landroidx/lifecycle/LiveData;", "l", "Landroidx/lifecycle/LiveData;", "getSportLiveData", "()Landroidx/lifecycle/LiveData;", "sportLiveData", "m", LogUtil.I, "getIconColor", "()I", "iconColor", GoogleApiAvailabilityLight.b, "getCardBg", "cardBg", "Landroidx/lifecycle/LifecycleOwner;", "lifecycleOwner", "<init>", "(Landroidx/lifecycle/LifecycleOwner;)V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class BikeCardRender extends SportCardBaseRender {

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @NotNull
    private final LiveData<SportDataBean> sportLiveData;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private final int iconColor;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private final int cardBg;

    public BikeCardRender(@NotNull LifecycleOwner lifecycleOwner) {
        super(lifecycleOwner);
        this.sportLiveData = getSportDataManagerIml().getRecentlyBikeData();
        this.iconColor = Color.parseColor("#F94440");
        this.cardBg = R.drawable.play_icon_bike_bg;
    }

    @Override // com.xiaomi.hm.health.play.card.sport.SportCardBaseRender
    @NotNull
    public Triple<String, String, String> convertToShowData(@NotNull SportDataBean data) {
        if (data.getDataType() != 10) {
            return new Triple<>(formatDistance(data.getDistance(), data.getDataType()), convertToSpeed(data.getPace()), formatTime(data.getCostTime()));
        }
        String strValueOf = String.valueOf(data.getCostCal());
        String avgHr = formatAvgHr(data.getAvgHr());
        if (avgHr == null) {
            avgHr = "--";
        }
        return new Triple<>(strValueOf, avgHr, formatTime(data.getCostTime()));
    }

    @Override // com.xiaomi.hm.health.play.card.sport.SportCardBaseRender
    public int getCardBg() {
        return this.cardBg;
    }

    @Override // com.xiaomi.hm.health.play.card.sport.SportCardBaseRender
    @NotNull
    public Triple<Integer, Integer, Integer> getDataDesc(@NotNull SportDataBean data) {
        int dataType = data.getDataType();
        Integer numValueOf = Integer.valueOf(R.string.running_time_desc);
        return dataType == 10 ? new Triple<>(Integer.valueOf(R.string.app_sort_consume), Integer.valueOf(R.string.heart_rate_average), numValueOf) : new Triple<>(Integer.valueOf(getDistanceUnit()), Integer.valueOf(R.string.data_item_speed), numValueOf);
    }

    @Override // com.xiaomi.hm.health.play.card.sport.SportCardBaseRender
    public int getIconColor() {
        return this.iconColor;
    }

    @Override // com.xiaomi.hm.health.play.card.sport.SportCardBaseRender
    @NotNull
    public LiveData<SportDataBean> getSportLiveData() {
        return this.sportLiveData;
    }

    @Override // com.xiaomi.hm.health.play.card.sport.SportCardBaseRender
    public void showHasHistoryData(@NotNull Context context, int days) {
        getBinding().sportDesc.setText(context.getResources().getQuantityString(R.plurals.play_tool_bike_history, days, Integer.valueOf(days)));
    }

    @Override // com.xiaomi.hm.health.play.card.sport.SportCardBaseRender
    public void showTodayUi() {
        getBinding().sportDesc.setText(R.string.play_tool_bike_today);
    }
}
