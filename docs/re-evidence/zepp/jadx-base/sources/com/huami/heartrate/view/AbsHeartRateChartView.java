package com.huami.heartrate.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.huami.heartrate.model.AbnormalHeartBeatEntity;
import com.huami.heartrate.service.ChartVo;
import com.huami.heartrate.service.HeartRateInfo;
import com.huami.tools.analytics.DbUtils;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J:\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bH&¨\u0006\u0015"}, d2 = {"Lcom/huami/heartrate/view/AbsHeartRateChartView;", "Landroid/view/View;", "Landroid/view/ViewGroup;", "container", "Lcom/huami/heartrate/service/ChartVo;", "chartVo", "Lcom/huami/heartrate/service/HeartRateInfo;", "heartRateInfo", "", "Lcom/huami/heartrate/model/AbnormalHeartBeatEntity;", "abnormalHeartBeatEntityList", "", "refreshLineChart", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "heartrate-service_release"}, k = 1, mv = {1, 5, 1})
public abstract class AbsHeartRateChartView extends View {
    @JvmOverloads
    public AbsHeartRateChartView(@NotNull Context context) {
        this(context, null, 0, 6, null);
    }

    @JvmOverloads
    public AbsHeartRateChartView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ AbsHeartRateChartView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void refreshLineChart$default(AbsHeartRateChartView absHeartRateChartView, ViewGroup viewGroup, ChartVo chartVo, HeartRateInfo heartRateInfo, List list, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: refreshLineChart");
        }
        if ((i & 2) != 0) {
            chartVo = null;
        }
        if ((i & 4) != 0) {
            heartRateInfo = null;
        }
        if ((i & 8) != 0) {
            list = null;
        }
        absHeartRateChartView.refreshLineChart(viewGroup, chartVo, heartRateInfo, list);
    }

    public void _$_clearFindViewByIdCache() {
    }

    public abstract void refreshLineChart(@NotNull ViewGroup container, @Nullable ChartVo chartVo, @Nullable HeartRateInfo heartRateInfo, @Nullable List<AbnormalHeartBeatEntity> abnormalHeartBeatEntityList);

    @JvmOverloads
    public AbsHeartRateChartView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
