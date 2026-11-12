package com.huami.healthlabel.healthlabelhistory.adapter;

import android.graphics.Color;
import android.graphics.Paint;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import com.chad.library.adapter.base.BaseMultiItemQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.huami.healthlabel.R;
import com.huami.healthlabel.healthlabelhistory.adapter.HealthLabelDayAdapter;
import com.huami.healthlabel.utils.ext.ColorExtKt;
import com.huami.healthlabel.utils.ext.DateExtKt;
import com.huami.healthlabel.utils.ext.NumberExtKt;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0004\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B!\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u0010\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0002H\u0014R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0016\u0010\u000f\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0014"}, d2 = {"Lcom/huami/healthlabel/healthlabelhistory/adapter/HealthLabelDayAdapter;", "Lcom/chad/library/adapter/base/BaseMultiItemQuickAdapter;", "Lcom/huami/healthlabel/healthlabelhistory/adapter/HealthLabelDayEntity;", "Lcom/chad/library/adapter/base/BaseViewHolder;", "holder", "item", "", "convert", "Lcom/huami/healthlabel/healthlabelhistory/adapter/ItemClickListener;", "a", "Lcom/huami/healthlabel/healthlabelhistory/adapter/ItemClickListener;", "itemClickListener", "Landroid/graphics/Paint;", "b", "Landroid/graphics/Paint;", "textPaint", "", "historyDataList", "<init>", "(Ljava/util/List;Lcom/huami/healthlabel/healthlabelhistory/adapter/ItemClickListener;)V", "healthLabel_release"}, k = 1, mv = {1, 5, 1})
public final class HealthLabelDayAdapter extends BaseMultiItemQuickAdapter<HealthLabelDayEntity, BaseViewHolder> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private final ItemClickListener itemClickListener;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private Paint textPaint;

    public /* synthetic */ HealthLabelDayAdapter(List list, ItemClickListener itemClickListener, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i & 2) != 0 ? null : itemClickListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(HealthLabelDayAdapter healthLabelDayAdapter, HealthLabelDayEntity healthLabelDayEntity, View view) {
        ItemClickListener itemClickListener = healthLabelDayAdapter.itemClickListener;
        if (itemClickListener == null) {
            return;
        }
        itemClickListener.onItemClick(healthLabelDayEntity);
    }

    public HealthLabelDayAdapter(@NotNull List<HealthLabelDayEntity> list, @Nullable ItemClickListener itemClickListener) {
        super(list);
        this.itemClickListener = itemClickListener;
        this.textPaint = new Paint();
        addItemType(1, R.layout.item_label_history_day_title);
        addItemType(2, R.layout.item_label_history_day_label);
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public void convert(@NotNull BaseViewHolder holder, @NotNull final HealthLabelDayEntity item) {
        int itemViewType = holder.getItemViewType();
        if (itemViewType == 1) {
            holder.setText(R.id.item_label_history_day_title, DateExtKt.millis2String(item.getMLabelDate(), new SimpleDateFormat("HH:mm", Locale.getDefault())));
            return;
        }
        if (itemViewType != 2) {
            return;
        }
        AppCompatTextView appCompatTextView = (AppCompatTextView) holder.getView(R.id.item_label_history_day_label);
        appCompatTextView.setText(item.getLabelText());
        appCompatTextView.setTextColor(Color.parseColor(ColorExtKt.getTextColorChange(item.getLabelColor())));
        TextPaint paint = appCompatTextView.getPaint();
        this.textPaint = paint;
        float fMeasureText = paint.measureText(item.getLabelText()) + NumberExtKt.dp(20);
        ViewGroup.LayoutParams layoutParams = appCompatTextView.getLayoutParams();
        layoutParams.width = ((int) fMeasureText) + 1;
        appCompatTextView.setLayoutParams(layoutParams);
        appCompatTextView.setOnClickListener(new View.OnClickListener() { // from class: aw3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HealthLabelDayAdapter.b(this.a, item, view);
            }
        });
    }
}
