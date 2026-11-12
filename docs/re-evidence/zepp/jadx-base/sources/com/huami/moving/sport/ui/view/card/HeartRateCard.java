package com.huami.moving.sport.ui.view.card;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.huami.mifit.sportlib.model.HeartRateZone;
import com.huami.moving.sport.ui.R;
import com.huami.moving.sport.ui.common.HrZoneShowRuleConfig;
import com.huami.moving.sport.ui.view.bar.HeartRateBar;
import com.huami.tools.analytics.DbUtils;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\u0006\u0010\u0013\u001a\u00020\t¢\u0006\u0004\b\u0014\u0010\u0015B\u001b\b\u0016\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0014\u0010\u0016B\u0011\b\u0016\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0014\u0010\u0017J\u001c\u0010\b\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u0005J\u0006\u0010\n\u001a\u00020\tR\u0016\u0010\u000e\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0018"}, d2 = {"Lcom/huami/moving/sport/ui/view/card/HeartRateCard;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "", "Lcom/huami/mifit/sportlib/model/HeartRateZone;", "hrZoneList", "Lcom/huami/moving/sport/ui/common/HrZoneShowRuleConfig;", "config", "", "setContent", "", "getContentSize", "Landroid/widget/LinearLayout;", "a", "Landroid/widget/LinearLayout;", "mHrSectionProgress", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "(Landroid/content/Context;)V", "moving-ui_release"}, k = 1, mv = {1, 5, 1})
public final class HeartRateCard extends ConstraintLayout {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private LinearLayout mHrSectionProgress;

    public HeartRateCard(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(R.layout.card_heart_rate, this);
        this.mHrSectionProgress = (LinearLayout) findViewById(R.id.sport_detail_hr_section_progress);
    }

    public void _$_clearFindViewByIdCache() {
    }

    public final int getContentSize() {
        return this.mHrSectionProgress.getChildCount();
    }

    public final void setContent(@NotNull List<HeartRateZone> hrZoneList, @NotNull HrZoneShowRuleConfig config) {
        if (!hrZoneList.isEmpty()) {
            int showSizeForHRR = ((HeartRateZone) CollectionsKt.first((List) hrZoneList)).getZoneType() == 1 ? config.getShowSizeForHRR() : config.getShowSizeForMHR();
            int i = 0;
            for (Object obj : CollectionsKt___CollectionsKt.reversed(hrZoneList)) {
                int i2 = i + 1;
                if (i < 0) {
                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                }
                HeartRateZone heartRateZone = (HeartRateZone) obj;
                if (i > showSizeForHRR - 1) {
                    return;
                }
                HeartRateBar heartRateBar = new HeartRateBar(getContext());
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
                layoutParams.setMargins(0, 0, 0, 0);
                heartRateBar.setContent(i, heartRateZone, config.isEllipsis());
                this.mHrSectionProgress.addView(heartRateBar, layoutParams);
                i = i2;
            }
        }
    }

    public HeartRateCard(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public HeartRateCard(@NotNull Context context) {
        this(context, null);
    }
}
