package com.huami.healthlabel.healthlabelmanager.adapter;

import android.graphics.Color;
import android.graphics.Paint;
import android.text.TextPaint;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.huami.healthlabel.R;
import com.huami.healthlabel.utils.ext.NumberExtKt;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0004\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0015\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0002H\u0014R\u0016\u0010\u000b\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u0010"}, d2 = {"Lcom/huami/healthlabel/healthlabelmanager/adapter/HealthLabelAdapter;", "Lcom/chad/library/adapter/base/BaseQuickAdapter;", "Lcom/huami/healthlabel/healthlabelmanager/adapter/HealthLabelEntity;", "Lcom/chad/library/adapter/base/BaseViewHolder;", "holder", "item", "", "convert", "Landroid/graphics/Paint;", "a", "Landroid/graphics/Paint;", "textPaint", "", "labelDatas", "<init>", "(Ljava/util/List;)V", "healthLabel_release"}, k = 1, mv = {1, 5, 1})
public final class HealthLabelAdapter extends BaseQuickAdapter<HealthLabelEntity, BaseViewHolder> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private Paint textPaint;

    public HealthLabelAdapter(@NotNull List<HealthLabelEntity> list) {
        super(R.layout.item_label_history_day_label, list);
        this.textPaint = new Paint();
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public void convert(@NotNull BaseViewHolder holder, @NotNull HealthLabelEntity item) {
        AppCompatTextView appCompatTextView = (AppCompatTextView) holder.getView(R.id.item_label_history_day_label);
        appCompatTextView.setText(item.getLabelText());
        appCompatTextView.setTextColor(Color.parseColor(item.getLabelColor()));
        TextPaint paint = appCompatTextView.getPaint();
        this.textPaint = paint;
        float fMeasureText = paint.measureText(item.getLabelText()) + NumberExtKt.dp(20);
        ViewGroup.LayoutParams layoutParams = appCompatTextView.getLayoutParams();
        layoutParams.width = ((int) fMeasureText) + 1;
        appCompatTextView.setLayoutParams(layoutParams);
    }
}
