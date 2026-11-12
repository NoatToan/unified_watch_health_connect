package com.huami.healthlabel.healthlabelhistory.adapter;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.chad.library.adapter.base.BaseMultiItemQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.healthlabel.R;
import com.huami.healthlabel.utils.UtilsKt;
import com.huami.healthlabel.utils.ext.DateExtKt;
import com.huami.healthlabel.utils.ext.NumberExtKt;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u001d\u0012\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\u0006\u0010\u0012\u001a\u00020\u0010¢\u0006\u0004\b%\u0010&J\u001e\u0010\t\u001a\u00020\b2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0007\u001a\u00020\u0005H\u0002J\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0002H\u0014J\u000e\u0010\u000f\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u0005R\u0016\u0010\u0012\u001a\u00020\u00108\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0011R\u0016\u0010\u0016\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0018\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0015R\u0016\u0010\u001c\u001a\u00020\u00198\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0018\u0010 \u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u001c\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006'"}, d2 = {"Lcom/huami/healthlabel/healthlabelhistory/adapter/HealthLabelHistoryAdapter;", "Lcom/chad/library/adapter/base/BaseMultiItemQuickAdapter;", "Lcom/huami/healthlabel/healthlabelhistory/adapter/HealthLabelHistoryEntity;", "Lcom/chad/library/adapter/base/BaseViewHolder;", "", "Lcom/huami/healthlabel/healthlabelhistory/adapter/HealthLabelDayEntity;", "arr", "target", "", "a", "holder", "item", "", "convert", "curItemEntry", "deleteData", "Lcom/huami/healthlabel/healthlabelhistory/adapter/ItemClickListener;", "Lcom/huami/healthlabel/healthlabelhistory/adapter/ItemClickListener;", "itemClickListener", "Ljava/text/DateFormat;", "b", "Ljava/text/DateFormat;", "mDateFormat", "c", "mYearFormat", "Landroid/graphics/Paint;", GoogleApiAvailabilityLight.a, "Landroid/graphics/Paint;", "textPaint", "Lcom/huami/healthlabel/healthlabelhistory/adapter/HealthLabelDayAdapter;", "e", "Lcom/huami/healthlabel/healthlabelhistory/adapter/HealthLabelDayAdapter;", "dayAdapter", "f", "Ljava/util/List;", "itemList", "historyDataList", "<init>", "(Ljava/util/List;Lcom/huami/healthlabel/healthlabelhistory/adapter/ItemClickListener;)V", "healthLabel_release"}, k = 1, mv = {1, 5, 1})
public final class HealthLabelHistoryAdapter extends BaseMultiItemQuickAdapter<HealthLabelHistoryEntity, BaseViewHolder> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final ItemClickListener itemClickListener;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private DateFormat mDateFormat;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private DateFormat mYearFormat;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final Paint textPaint;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    private HealthLabelDayAdapter dayAdapter;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final List<HealthLabelDayEntity> itemList;

    public HealthLabelHistoryAdapter(@NotNull List<HealthLabelHistoryEntity> list, @NotNull ItemClickListener itemClickListener) {
        super(list);
        this.itemClickListener = itemClickListener;
        Paint paint = new Paint();
        this.textPaint = paint;
        this.itemList = new ArrayList();
        addItemType(1, R.layout.item_label_history_title);
        addItemType(2, R.layout.item_label_history_day);
        addItemType(3, R.layout.item_label_history_title_year);
        this.mDateFormat = new SimpleDateFormat("M月d日", Locale.getDefault());
        this.mYearFormat = new SimpleDateFormat("yyyy年", Locale.getDefault());
        paint.setTextSize(NumberExtKt.sp(14));
    }

    private final int a(List<HealthLabelDayEntity> arr, HealthLabelDayEntity target) {
        if (arr.size() < 1) {
            return -1;
        }
        int i = 0;
        int size = arr.size() - 1;
        while (i <= size) {
            int i2 = ((size - i) >> 1) + i;
            if (arr.get(i2).getMyItemType() == 1) {
                i2++;
            }
            if (Intrinsics.areEqual(arr.get(i2), target)) {
                return i2;
            }
            if (arr.get(i2).getMLabelDate() > target.getMLabelDate()) {
                i = i2 + 1;
            } else {
                size = i2 - 1;
            }
        }
        return -1;
    }

    public final int deleteData(@NotNull HealthLabelDayEntity curItemEntry) {
        int iA;
        if (this.dayAdapter == null || (iA = a(this.itemList, curItemEntry)) == -1) {
            return 0;
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm", Locale.CHINA);
        String strMillis2String = DateExtKt.millis2String(curItemEntry.getMLabelDate(), simpleDateFormat);
        int i = iA - 1;
        int i2 = 1;
        if (Intrinsics.areEqual(strMillis2String, DateExtKt.millis2String(this.itemList.get(i).getMLabelDate(), simpleDateFormat)) && this.itemList.get(i).getMyItemType() == 1 && (iA == this.itemList.size() - 1 || !Intrinsics.areEqual(strMillis2String, DateExtKt.millis2String(this.itemList.get(iA + 1).getMLabelDate(), simpleDateFormat)))) {
            this.itemList.remove(i);
            i2 = 2;
        }
        this.itemList.remove(curItemEntry);
        return i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [androidx.recyclerview.widget.GridLayoutManager, androidx.recyclerview.widget.RecyclerView$LayoutManager, com.huami.healthlabel.healthlabelhistory.adapter.HealthLabelHistoryAdapter$convert$gridLayoutManager$1] */
    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public void convert(@NotNull BaseViewHolder holder, @NotNull final HealthLabelHistoryEntity item) {
        int itemViewType = holder.getItemViewType();
        if (itemViewType == 1) {
            if (DateExtKt.isToday(item.getMLabelDate())) {
                holder.setText(R.id.item_label_history_date, this.mContext.getResources().getString(R.string.health_label_today));
                return;
            } else {
                holder.setText(R.id.item_label_history_date, DateExtKt.millis2String(item.getMLabelDate(), this.mDateFormat));
                return;
            }
        }
        if (itemViewType != 2) {
            if (itemViewType != 3) {
                return;
            }
            if (DateExtKt.isToday(item.getMLabelDate())) {
                holder.setText(R.id.item_label_year_date, this.mContext.getResources().getString(R.string.health_label_today));
            } else {
                holder.setText(R.id.item_label_year_date, DateExtKt.millis2String(item.getMLabelDate(), this.mDateFormat));
            }
            holder.setText(R.id.item_label_year, DateExtKt.millis2String(item.getMLabelDate(), this.mYearFormat));
            return;
        }
        RecyclerView recyclerView = (RecyclerView) holder.getView(R.id.item_label_history_recycler_view);
        final HealthLabelDayAdapter healthLabelDayAdapter = new HealthLabelDayAdapter(item.getMDayLabelData(), this.itemClickListener);
        this.dayAdapter = healthLabelDayAdapter;
        if (!this.itemList.containsAll(item.getMDayLabelData())) {
            this.itemList.addAll(item.getMDayLabelData());
        }
        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(this.mContext, 1);
        DividerItemDecoration dividerItemDecoration2 = new DividerItemDecoration(this.mContext, 0);
        Drawable drawable = ContextCompat.getDrawable(this.mContext, R.drawable.shape_item_decoration);
        Drawable drawable2 = ContextCompat.getDrawable(this.mContext, R.drawable.shape_item_decoration_horizontal);
        if (recyclerView.getItemDecorationCount() == 0 && drawable != null) {
            dividerItemDecoration.setDrawable(drawable);
            recyclerView.addItemDecoration(dividerItemDecoration);
        }
        if (recyclerView.getItemDecorationCount() == 1 && drawable2 != null) {
            dividerItemDecoration2.setDrawable(drawable2);
            recyclerView.addItemDecoration(dividerItemDecoration2);
        }
        recyclerView.setAdapter(healthLabelDayAdapter);
        final int iScreenWidth = UtilsKt.screenWidth() - NumberExtKt.dp(81);
        final Context context = this.mContext;
        final ?? r1 = new GridLayoutManager(iScreenWidth, context) { // from class: com.huami.healthlabel.healthlabelhistory.adapter.HealthLabelHistoryAdapter$convert$gridLayoutManager$1
            public final /* synthetic */ int a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(context, iScreenWidth);
                this.a = iScreenWidth;
            }

            @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
            public boolean canScrollVertically() {
                return false;
            }
        };
        r1.setSpanSizeLookup(new GridLayoutManager.SpanSizeLookup() { // from class: com.huami.healthlabel.healthlabelhistory.adapter.HealthLabelHistoryAdapter.convert.1
            @Override // androidx.recyclerview.widget.GridLayoutManager.SpanSizeLookup
            public int getSpanSize(int position) {
                int spanCount = getSpanCount();
                int iMeasureText = item.getMDayLabelData().get(position).getMyItemType() == 1 ? iScreenWidth - 1 : (int) (this.textPaint.measureText(((HealthLabelDayEntity) healthLabelDayAdapter.getData().get(position)).getLabelText()) + NumberExtKt.dp(20) + NumberExtKt.dp(10));
                return iMeasureText >= spanCount ? spanCount : iMeasureText + 1;
            }
        });
        recyclerView.setLayoutManager(r1);
    }
}
