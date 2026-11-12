package com.xiaomi.fitness.health.sleep.ui.adapter;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.style.RelativeSizeSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.timepicker.TimeModel;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.common.utils.UIUtils;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.health.sleep.utils.SleepStageExtKt;
import com.xiaomi.fitness.util.ExtUtilKt;
import defpackage.c0j;
import defpackage.eri;
import defpackage.jui;
import defpackage.n9f;
import defpackage.qxi;
import defpackage.uz6;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u00182\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0018\u0019B\u0015\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u001a"}, d2 = {"Lcom/xiaomi/fitness/health/sleep/ui/adapter/SleepStageDetailAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$d0;", "getItemCount", "()I", "holder", "position", "", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$d0;I)V", "", "Luz6;", "dataList", "Ljava/util/List;", "getDataList", "()Ljava/util/List;", "<init>", "(Ljava/util/List;)V", "Companion", "DetailItemViewHolder", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class SleepStageDetailAdapter extends RecyclerView.Adapter<RecyclerView.d0> {

    @NotNull
    public static final String TAG = "SleepStageDetailAdapter";

    @NotNull
    private final List<uz6> dataList;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u000f¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001c\u0010\t\u001a\n \b*\u0004\u0018\u00010\u00070\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u001c\u0010\u000b\u001a\n \b*\u0004\u0018\u00010\u00070\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\nR\u001c\u0010\f\u001a\n \b*\u0004\u0018\u00010\u00070\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\nR\u001c\u0010\r\u001a\n \b*\u0004\u0018\u00010\u00070\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\nR\u001c\u0010\u000e\u001a\n \b*\u0004\u0018\u00010\u00070\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\nR\u001c\u0010\u0010\u001a\n \b*\u0004\u0018\u00010\u000f0\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"Lcom/xiaomi/fitness/health/sleep/ui/adapter/SleepStageDetailAdapter$DetailItemViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Luz6;", "model", "", "bindData", "(Luz6;)V", "Landroid/widget/TextView;", "kotlin.jvm.PlatformType", "titleTv", "Landroid/widget/TextView;", "durationTv", "percentageTv", "evaluationTag", "referenceRangeTv", "Landroid/view/View;", "stageDivideLine", "Landroid/view/View;", "itemView", "<init>", "(Lcom/xiaomi/fitness/health/sleep/ui/adapter/SleepStageDetailAdapter;Landroid/view/View;)V", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    @SourceDebugExtension({"SMAP\nSleepStageDetailAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SleepStageDetailAdapter.kt\ncom/xiaomi/fitness/health/sleep/ui/adapter/SleepStageDetailAdapter$DetailItemViewHolder\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,126:1\n1557#2:127\n1628#2,3:128\n*S KotlinDebug\n*F\n+ 1 SleepStageDetailAdapter.kt\ncom/xiaomi/fitness/health/sleep/ui/adapter/SleepStageDetailAdapter$DetailItemViewHolder\n*L\n104#1:127\n104#1:128,3\n*E\n"})
    public final class DetailItemViewHolder extends RecyclerView.d0 {
        private final TextView durationTv;
        private final TextView evaluationTag;
        private final TextView percentageTv;
        private final TextView referenceRangeTv;
        private final View stageDivideLine;
        final /* synthetic */ SleepStageDetailAdapter this$0;
        private final TextView titleTv;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DetailItemViewHolder(@NotNull SleepStageDetailAdapter sleepStageDetailAdapter, View itemView) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            this.this$0 = sleepStageDetailAdapter;
            this.titleTv = (TextView) itemView.findViewById(eri.cj);
            this.durationTv = (TextView) itemView.findViewById(eri.n4);
            this.percentageTv = (TextView) itemView.findViewById(eri.Hc);
            this.evaluationTag = (TextView) itemView.findViewById(eri.T4);
            this.referenceRangeTv = (TextView) itemView.findViewById(eri.Rd);
            this.stageDivideLine = itemView.findViewById(eri.bh);
        }

        public final void bindData(@NotNull uz6 model) {
            String string;
            Intrinsics.checkNotNullParameter(model, "model");
            if (model.e() == 0) {
                View stageDivideLine = this.stageDivideLine;
                Intrinsics.checkNotNullExpressionValue(stageDivideLine, "stageDivideLine");
                ExtUtilKt.visible(stageDivideLine);
            } else {
                View stageDivideLine2 = this.stageDivideLine;
                Intrinsics.checkNotNullExpressionValue(stageDivideLine2, "stageDivideLine");
                ExtUtilKt.gone(stageDivideLine2);
            }
            this.titleTv.setText(SleepStageExtKt.getNameByType(model.e()));
            Drawable itemDrawableByType = SleepStageExtKt.getItemDrawableByType(model.e());
            if (UIUtils.INSTANCE.isRtl()) {
                itemDrawableByType = null;
            }
            if (itemDrawableByType != null) {
                itemDrawableByType.setBounds(0, 0, ExtUtilsKt.getDp(4), ExtUtilsKt.getDp(14));
            }
            this.titleTv.setCompoundDrawables(itemDrawableByType, null, null, null);
            this.durationTv.setText(TimeDateUtil.getHHmmDurationSpannableWithMin((int) (model.f36300k / ((long) 60000)), 1.67f));
            TextView durationTv = this.durationTv;
            Intrinsics.checkNotNullExpressionValue(durationTv, "durationTv");
            ExtUtilKt.visible(durationTv);
            RelativeSizeSpan relativeSizeSpan = new RelativeSizeSpan(1.67f);
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String str = String.format(Locale.getDefault(), TimeModel.NUMBER_FORMAT, Arrays.copyOf(new Object[]{Integer.valueOf(model.f39601a)}, 1));
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
            if (model.e() == 0) {
                Resources resources = AppUtil.getApp().getResources();
                int i = qxi.v0;
                int i2 = model.f39601a;
                string = resources.getQuantityString(i, i2, Integer.valueOf(i2));
            } else {
                string = ResourceExtKt.getString(c0j.xf, Integer.valueOf(model.f39601a));
            }
            String str2 = string;
            Intrinsics.checkNotNull(str2);
            SpannableString spannableString = new SpannableString(str2);
            int iIndexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) str2, str, 0, false, 6, (Object) null);
            spannableString.setSpan(relativeSizeSpan, iIndexOf$default, str.length() + iIndexOf$default, 17);
            this.percentageTv.setText(spannableString);
            List<uz6> dataList = this.this$0.getDataList();
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(dataList, 10));
            Iterator<T> it = dataList.iterator();
            while (it.hasNext()) {
                arrayList.add(Integer.valueOf(((uz6) it.next()).e()));
            }
            n9f normaValueByType = SleepStageExtKt.getNormaValueByType(model.e(), arrayList.contains(1));
            this.referenceRangeTv.setText(ResourceExtKt.getString(c0j.xq, model.e() == 0 ? ResourceExtKt.getString(c0j.yf) : ResourceExtKt.getString(c0j.wf, Integer.valueOf((int) normaValueByType.f27682b), Integer.valueOf((int) normaValueByType.f27681a))));
            int i3 = model.f39601a;
            if (i3 > normaValueByType.f27681a) {
                this.evaluationTag.setText(AppUtil.getApp().getString(c0j.Eh));
            } else {
                if (i3 < normaValueByType.f27682b) {
                    this.evaluationTag.setText(AppUtil.getApp().getString(c0j.Nh));
                    return;
                }
                TextView evaluationTag = this.evaluationTag;
                Intrinsics.checkNotNullExpressionValue(evaluationTag, "evaluationTag");
                ViewExtKt.setVisible(evaluationTag, false);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SleepStageDetailAdapter(@NotNull List<? extends uz6> dataList) {
        Intrinsics.checkNotNullParameter(dataList, "dataList");
        this.dataList = dataList;
    }

    @NotNull
    public final List<uz6> getDataList() {
        return this.dataList;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: getItemCount */
    public int getCount() {
        return this.dataList.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull RecyclerView.d0 holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        if (holder instanceof DetailItemViewHolder) {
            ((DetailItemViewHolder) holder).bindData(this.dataList.get(position));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public RecyclerView.d0 onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewInflate = LayoutInflater.from(parent.getContext()).inflate(jui.e4, parent, false);
        Intrinsics.checkNotNull(viewInflate);
        return new DetailItemViewHolder(this, viewInflate);
    }
}
