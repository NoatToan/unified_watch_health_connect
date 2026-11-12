package com.xiaomi.hm.health.ui.sportfitness.adapter;

import android.widget.ImageView;
import androidx.core.content.ContextCompat;
import com.huami.lib.view.quickadapter.BaseQuickAdapter;
import com.huami.lib.view.quickadapter.BaseViewHolder;
import com.huami.moving.ui.utils.SportRecordAssembleUtil;
import com.huami.watch.hmwatchmanager.R;
import com.xiaomi.hm.health.baseutil.TintUtils;
import com.xiaomi.hm.health.device.introduce.IntroduceShuffleFactoryKt;
import com.xiaomi.hm.health.ui.sportfitness.model.ExerciseStatSportCountData;
import com.xiaomi.hm.health.ui.sportfitness.utils.ExerciseHistoryShareUtils;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0002H\u0002J\u0018\u0010\t\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0002H\u0014¨\u0006\f"}, d2 = {"Lcom/xiaomi/hm/health/ui/sportfitness/adapter/ExerciseHistoryHeaderSportAdapter;", "Lcom/huami/lib/view/quickadapter/BaseQuickAdapter;", "Lcom/xiaomi/hm/health/ui/sportfitness/model/ExerciseStatSportCountData;", "Lcom/huami/lib/view/quickadapter/BaseViewHolder;", "holder", "item", "", "l", "helper", "convert", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class ExerciseHistoryHeaderSportAdapter extends BaseQuickAdapter<ExerciseStatSportCountData, BaseViewHolder> {
    public ExerciseHistoryHeaderSportAdapter() {
        super(R.layout.item_exercise_his_header_sport, null);
    }

    private final void l(BaseViewHolder holder, ExerciseStatSportCountData item) {
        int i;
        int iconNameByType = ExerciseHistoryShareUtils.getIconNameByType(item);
        int[] sportIconColorAndName = SportRecordAssembleUtil.INSTANCE.getSportIconColorAndName(item.getType(), -1, -1);
        int type = item.getType();
        int i2 = R.color.s20;
        if (type == -101) {
            i = R.drawable.ic_more_20;
        } else if (type != -100) {
            i = sportIconColorAndName[0];
            i2 = sportIconColorAndName[1];
        } else {
            i = R.drawable.ic_train_30_s20;
        }
        holder.setImageResource(R.id.iv_sport, i);
        TintUtils.tintDrawable((ImageView) holder.getView(R.id.iv_sport), ContextCompat.getColor(this.mContext, i2));
        holder.getView(R.id.iv_sport).setBackground(TintUtils.tintDrawable(ContextCompat.getDrawable(this.mContext, R.drawable.shape_sport_bg), ContextCompat.getColor(this.mContext, R.color.s4)));
        holder.setText(R.id.tv_sport_name, IntroduceShuffleFactoryKt.getString(iconNameByType) + " x" + item.getCount());
    }

    @Override // com.huami.lib.view.quickadapter.BaseQuickAdapter
    public void convert(@NotNull BaseViewHolder helper, @NotNull ExerciseStatSportCountData item) {
        l(helper, item);
    }
}
