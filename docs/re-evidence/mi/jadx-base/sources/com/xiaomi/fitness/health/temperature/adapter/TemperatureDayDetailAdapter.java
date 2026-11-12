package com.xiaomi.fitness.health.temperature.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fit.fitness.export.data.item.TemperatureItem;
import com.xiaomi.fitness.common.recycer.TimeRecordViewHolder;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.common.utils.TimeUtils;
import com.xiaomi.fitness.health.temperature.adapter.TemperatureDayDetailAdapter;
import com.xiaomi.fitness.util.ExtUtilKt;
import com.xiaomi.fitness.util.TemperatureDataUtil;
import defpackage.c0j;
import defpackage.eri;
import defpackage.jui;
import defpackage.uod;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010!\n\u0002\b\r\u0018\u0000 :2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003:;<B\u0007¢\u0006\u0004\b9\u0010\u0005J\u000f\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0004\u0010\u0005J!\u0010\t\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0016\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J'\u0010\u001c\u001a\u00020\u00032\u000e\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u00192\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001e\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\u001e\u0010\fJ+\u0010!\u001a\u00020\u00032\b\b\u0001\u0010\u001f\u001a\u00020\u00122\b\b\u0001\u0010 \u001a\u00020\u00122\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b!\u0010\"J\u001f\u0010&\u001a\u00020\u00022\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020\u0012H\u0016¢\u0006\u0004\b&\u0010'J\u001f\u0010)\u001a\u00020\u00032\u0006\u0010(\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b)\u0010*J\u0017\u0010+\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020\u0012H\u0016¢\u0006\u0004\b-\u0010\u0018R\u001e\u0010.\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u001c\u00101\u001a\b\u0012\u0004\u0012\u00020\u001a008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u0010/R\u0016\u00102\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u0016\u00104\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00103R\u0016\u00105\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00103R\u0016\u00106\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00103R\u0016\u00107\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108¨\u0006="}, d2 = {"Lcom/xiaomi/fitness/health/temperature/adapter/TemperatureDayDetailAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "", "hideFooter", "()V", "", "foldStatus", "notifyImmediate", "showFooter", "(ZZ)V", "notifyDataChangedIfNeed", "(Z)V", "", "tempValue", "", "getResultStr", "(F)Ljava/lang/String;", "", "position", "isHeaderView", "(I)Z", "isFooterView", "getContentItemCount", "()I", "", "Lcom/xiaomi/fit/fitness/export/data/item/TemperatureItem;", "list", "updateDataList", "(Ljava/util/List;Z)V", "hideHeader", "titleResId", "headerImageResId", "showHeader", "(IIZ)V", "Landroid/view/ViewGroup;", "parent", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$d0;", "holder", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$d0;I)V", "getItemViewType", "(I)I", "getItemCount", "srcDataList", "Ljava/util/List;", "", "adapterDataList", "footerCount", "I", "headerCount", "headerImgResId", "headerTitleId", "footerFoldStatus", "Z", "<init>", "Companion", "CommonHeaderViewHolder", "FooterViewHolder", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class TemperatureDayDetailAdapter extends RecyclerView.Adapter<RecyclerView.d0> {
    public static final int ITEM_TYPE_CONTENT = 2;
    public static final int ITEM_TYPE_FOOTER = 3;
    public static final int ITEM_TYPE_HEADER = 1;
    private int footerCount;
    private int headerCount;
    private int headerImgResId;
    private int headerTitleId;

    @Nullable
    private List<TemperatureItem> srcDataList;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final float[] TEMP_NORMAL_RANGE = {35.0f, 37.3f};

    @NotNull
    private List<TemperatureItem> adapterDataList = new ArrayList();
    private boolean footerFoldStatus = true;

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ%\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\"\u0010\n\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\"\u0010\u0011\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\"\u0010\u0017\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u000b\u001a\u0004\b\u0018\u0010\r\"\u0004\b\u0019\u0010\u000f¨\u0006\u001e"}, d2 = {"Lcom/xiaomi/fitness/health/temperature/adapter/TemperatureDayDetailAdapter$CommonHeaderViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "", "resourceId", "titleResId", "arrowVisible", "", "bindData", "(III)V", "Landroid/widget/ImageView;", "headerImageView", "Landroid/widget/ImageView;", "getHeaderImageView", "()Landroid/widget/ImageView;", "setHeaderImageView", "(Landroid/widget/ImageView;)V", "Landroid/widget/TextView;", "headerTxtView", "Landroid/widget/TextView;", "getHeaderTxtView", "()Landroid/widget/TextView;", "setHeaderTxtView", "(Landroid/widget/TextView;)V", "headerImgArrowRight", "getHeaderImgArrowRight", "setHeaderImgArrowRight", "Landroid/view/View;", "itemView", "<init>", "(Landroid/view/View;)V", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public static final class CommonHeaderViewHolder extends RecyclerView.d0 {

        @NotNull
        private ImageView headerImageView;

        @NotNull
        private ImageView headerImgArrowRight;

        @NotNull
        private TextView headerTxtView;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CommonHeaderViewHolder(@NotNull View itemView) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            View viewFindViewById = itemView.findViewById(eri.C7);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            this.headerImageView = (ImageView) viewFindViewById;
            View viewFindViewById2 = itemView.findViewById(eri.Kn);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
            this.headerTxtView = (TextView) viewFindViewById2;
            View viewFindViewById3 = itemView.findViewById(eri.u7);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
            this.headerImgArrowRight = (ImageView) viewFindViewById3;
        }

        public final void bindData(int resourceId, int titleResId, int arrowVisible) {
            if (resourceId != 0) {
                this.headerTxtView.setVisibility(0);
                this.headerImageView.setImageResource(resourceId);
            } else {
                this.headerImageView.setVisibility(8);
            }
            if (titleResId != 0) {
                this.headerTxtView.setVisibility(0);
                this.headerTxtView.setText(ExtUtilKt.getString(titleResId));
            } else {
                this.headerTxtView.setVisibility(8);
            }
            this.headerImgArrowRight.setVisibility(arrowVisible);
        }

        @NotNull
        public final ImageView getHeaderImageView() {
            return this.headerImageView;
        }

        @NotNull
        public final ImageView getHeaderImgArrowRight() {
            return this.headerImgArrowRight;
        }

        @NotNull
        public final TextView getHeaderTxtView() {
            return this.headerTxtView;
        }

        public final void setHeaderImageView(@NotNull ImageView imageView) {
            Intrinsics.checkNotNullParameter(imageView, "<set-?>");
            this.headerImageView = imageView;
        }

        public final void setHeaderImgArrowRight(@NotNull ImageView imageView) {
            Intrinsics.checkNotNullParameter(imageView, "<set-?>");
            this.headerImgArrowRight = imageView;
        }

        public final void setHeaderTxtView(@NotNull TextView textView) {
            Intrinsics.checkNotNullParameter(textView, "<set-?>");
            this.headerTxtView = textView;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/xiaomi/fitness/health/temperature/adapter/TemperatureDayDetailAdapter$Companion;", "", "<init>", "()V", "ITEM_TYPE_HEADER", "", "ITEM_TYPE_CONTENT", "ITEM_TYPE_FOOTER", "TEMP_NORMAL_RANGE", "", "getTEMP_NORMAL_RANGE", "()[F", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final float[] getTEMP_NORMAL_RANGE() {
            return TemperatureDayDetailAdapter.TEMP_NORMAL_RANGE;
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\"\u0010\b\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u0012"}, d2 = {"Lcom/xiaomi/fitness/health/temperature/adapter/TemperatureDayDetailAdapter$FooterViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "", "isFold", "", "bindData", "(Z)V", "Landroid/widget/TextView;", "tvFooter", "Landroid/widget/TextView;", "getTvFooter", "()Landroid/widget/TextView;", "setTvFooter", "(Landroid/widget/TextView;)V", "Landroid/view/View;", "itemView", "<init>", "(Landroid/view/View;)V", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public static final class FooterViewHolder extends RecyclerView.d0 {

        @NotNull
        private TextView tvFooter;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FooterViewHolder(@NotNull View itemView) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            View viewFindViewById = itemView.findViewById(eri.jl);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            this.tvFooter = (TextView) viewFindViewById;
        }

        public final void bindData(boolean isFold) {
            this.tvFooter.setText(ExtUtilKt.getString(isFold ? c0j.F4 : c0j.E4));
        }

        @NotNull
        public final TextView getTvFooter() {
            return this.tvFooter;
        }

        public final void setTvFooter(@NotNull TextView textView) {
            Intrinsics.checkNotNullParameter(textView, "<set-?>");
            this.tvFooter = textView;
        }
    }

    private final int getContentItemCount() {
        return this.adapterDataList.size();
    }

    private final String getResultStr(float tempValue) {
        float[] fArr = TEMP_NORMAL_RANGE;
        if (tempValue <= fArr[0]) {
            return ExtUtilKt.getString(c0j.kn);
        }
        if (tempValue >= fArr[1]) {
            return ExtUtilKt.getString(c0j.in);
        }
        return null;
    }

    private final void hideFooter() {
        this.footerCount = 0;
    }

    public static /* synthetic */ void hideHeader$default(TemperatureDayDetailAdapter temperatureDayDetailAdapter, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        temperatureDayDetailAdapter.hideHeader(z);
    }

    private final boolean isFooterView(int position) {
        return this.footerCount == 1 && position == getCount() - 1;
    }

    private final boolean isHeaderView(int position) {
        int i = this.headerCount;
        return i != 0 && position < i;
    }

    private final void notifyDataChangedIfNeed(boolean notifyImmediate) {
        if (notifyImmediate) {
            notifyDataSetChanged();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onBindViewHolder$lambda$0(TemperatureDayDetailAdapter this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.footerFoldStatus) {
            this$0.adapterDataList.clear();
            List<TemperatureItem> list = this$0.adapterDataList;
            List<TemperatureItem> listEmptyList = this$0.srcDataList;
            if (listEmptyList == null) {
                listEmptyList = Collections.emptyList();
                Intrinsics.checkNotNullExpressionValue(listEmptyList, "emptyList(...)");
            }
            list.addAll(listEmptyList);
            this$0.showFooter(false, true);
            return;
        }
        List<TemperatureItem> list2 = this$0.srcDataList;
        if (list2 == null || list2.size() <= 1) {
            return;
        }
        this$0.adapterDataList.clear();
        List<TemperatureItem> list3 = this$0.adapterDataList;
        List<TemperatureItem> list4 = this$0.srcDataList;
        Intrinsics.checkNotNull(list4);
        list3.addAll(list4.subList(0, 1));
        this$0.showFooter(true, true);
    }

    private final void showFooter(boolean foldStatus, boolean notifyImmediate) {
        this.footerCount = 1;
        this.footerFoldStatus = foldStatus;
        notifyDataChangedIfNeed(notifyImmediate);
    }

    public static /* synthetic */ void showFooter$default(TemperatureDayDetailAdapter temperatureDayDetailAdapter, boolean z, boolean z2, int i, Object obj) {
        if ((i & 2) != 0) {
            z2 = false;
        }
        temperatureDayDetailAdapter.showFooter(z, z2);
    }

    public static /* synthetic */ void showHeader$default(TemperatureDayDetailAdapter temperatureDayDetailAdapter, int i, int i2, boolean z, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            z = false;
        }
        temperatureDayDetailAdapter.showHeader(i, i2, z);
    }

    public static /* synthetic */ void updateDataList$default(TemperatureDayDetailAdapter temperatureDayDetailAdapter, List list, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        temperatureDayDetailAdapter.updateDataList(list, z);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: getItemCount */
    public int getCount() {
        return this.headerCount + this.footerCount + getContentItemCount();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int position) {
        if (isHeaderView(position)) {
            return 1;
        }
        return isFooterView(position) ? 3 : 2;
    }

    public final void hideHeader(boolean notifyImmediate) {
        this.headerCount = 0;
        this.headerTitleId = 0;
        this.headerImgResId = 0;
        notifyDataChangedIfNeed(notifyImmediate);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull RecyclerView.d0 holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        if (holder instanceof CommonHeaderViewHolder) {
            ((CommonHeaderViewHolder) holder).bindData(this.headerImgResId, this.headerTitleId, 8);
            return;
        }
        if (holder instanceof FooterViewHolder) {
            ((FooterViewHolder) holder).bindData(this.footerFoldStatus);
            holder.itemView.setOnClickListener(new View.OnClickListener() { // from class: d3p
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    TemperatureDayDetailAdapter.onBindViewHolder$lambda$0(this.f15055a, view);
                }
            });
            return;
        }
        if (holder instanceof TimeRecordViewHolder) {
            TimeRecordViewHolder timeRecordViewHolder = (TimeRecordViewHolder) holder;
            timeRecordViewHolder.setTopAndBottomLineVisible(position - this.headerCount != 0, (getCount() - this.footerCount) - 1 != position);
            TemperatureItem temperatureItem = this.adapterDataList.get(position - this.headerCount);
            Float bodyTemp = temperatureItem.getBodyTemp();
            float fFloatValue = bodyTemp != null ? bodyTemp.floatValue() : 0.0f;
            Float skinTemp = temperatureItem.getSkinTemp();
            float fFloatValue2 = skinTemp != null ? skinTemp.floatValue() : 0.0f;
            timeRecordViewHolder.updateTimeStr(TimeDateUtil.getDateStr(temperatureItem.getTime(), TimeUtils.FORMAT_H_M));
            String string = ExtUtilKt.getString(c0j.hn);
            if (fFloatValue > 0.0f && fFloatValue2 > 0.0f) {
                timeRecordViewHolder.setSecondViewVisible(true);
                TemperatureDataUtil temperatureDataUtil = TemperatureDataUtil.INSTANCE;
                timeRecordViewHolder.updateFirstView(temperatureDataUtil.formatTemperature(fFloatValue), string, ExtUtilKt.getString(c0j.dn), getResultStr(fFloatValue));
                TimeRecordViewHolder.updateSecondView$default(timeRecordViewHolder, temperatureDataUtil.formatTemperature(fFloatValue2), string, ExtUtilKt.getString(c0j.nn), null, 8, null);
                return;
            }
            timeRecordViewHolder.setSecondViewVisible(false);
            if (fFloatValue > 0.0f) {
                timeRecordViewHolder.updateFirstView(TemperatureDataUtil.INSTANCE.formatTemperature(fFloatValue), string, ExtUtilKt.getString(c0j.dn), getResultStr(fFloatValue));
            } else if (fFloatValue2 > 0.0f) {
                TimeRecordViewHolder.updateFirstView$default(timeRecordViewHolder, TemperatureDataUtil.INSTANCE.formatTemperature(fFloatValue2), string, ExtUtilKt.getString(c0j.nn), null, 8, null);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public RecyclerView.d0 onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(parent.getContext());
        if (viewType == 1) {
            View viewInflate = layoutInflaterFrom.inflate(jui.R6, parent, false);
            Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
            return new CommonHeaderViewHolder(viewInflate);
        }
        if (viewType != 3) {
            uod uodVarA0 = uod.A0(layoutInflaterFrom, parent, false);
            Intrinsics.checkNotNullExpressionValue(uodVarA0, "inflate(...)");
            return new TimeRecordViewHolder(uodVarA0);
        }
        View viewInflate2 = layoutInflaterFrom.inflate(jui.G6, parent, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate2, "inflate(...)");
        return new FooterViewHolder(viewInflate2);
    }

    public final void showHeader(int titleResId, int headerImageResId, boolean notifyImmediate) {
        this.headerCount = 1;
        this.headerTitleId = titleResId;
        this.headerImgResId = headerImageResId;
        notifyDataChangedIfNeed(notifyImmediate);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0040  */
    /* JADX WARN: Code duplicated, block: B:13:0x0049  */
    public final void updateDataList(@Nullable List<TemperatureItem> list, boolean notifyImmediate) {
        List<TemperatureItem> listEmptyList;
        this.srcDataList = list;
        this.adapterDataList.clear();
        List<TemperatureItem> list2 = this.srcDataList;
        if (list2 != null) {
            Intrinsics.checkNotNull(list2);
            if (list2.size() > 5) {
                showFooter$default(this, this.footerFoldStatus, false, 2, null);
                if (this.footerFoldStatus) {
                    List<TemperatureItem> list3 = this.adapterDataList;
                    List<TemperatureItem> list4 = this.srcDataList;
                    Intrinsics.checkNotNull(list4);
                    list3.addAll(list4.subList(0, 1));
                } else {
                    List<TemperatureItem> list5 = this.adapterDataList;
                    List<TemperatureItem> list6 = this.srcDataList;
                    Intrinsics.checkNotNull(list6);
                    list5.addAll(list6);
                }
            } else {
                List<TemperatureItem> list7 = this.adapterDataList;
                listEmptyList = this.srcDataList;
                if (listEmptyList == null) {
                    listEmptyList = Collections.emptyList();
                    Intrinsics.checkNotNullExpressionValue(listEmptyList, "emptyList(...)");
                }
                list7.addAll(listEmptyList);
                hideFooter();
            }
        } else {
            List<TemperatureItem> list8 = this.adapterDataList;
            listEmptyList = this.srcDataList;
            if (listEmptyList == null) {
                listEmptyList = Collections.emptyList();
                Intrinsics.checkNotNullExpressionValue(listEmptyList, "emptyList(...)");
            }
            list8.addAll(listEmptyList);
            hideFooter();
        }
        notifyDataChangedIfNeed(notifyImmediate);
    }
}
