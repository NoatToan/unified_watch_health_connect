package com.xiaomi.fitness.health.bloodglucose.holder;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.widget.view.DurationTextView;
import defpackage.eri;
import defpackage.jui;
import defpackage.qpo;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001aB\u001d\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0011\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u001b"}, d2 = {"Lcom/xiaomi/fitness/health/bloodglucose/holder/BloodGlucoseContentAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$d0;", "getItemCount", "()I", "holder", "position", "", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$d0;I)V", "Landroid/content/Context;", "context", "Landroid/content/Context;", "", "Lqpo;", "mDataList", "Ljava/util/List;", "contentDataList", "<init>", "(Landroid/content/Context;Ljava/util/List;)V", "BloodGlucoseContentHolder", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class BloodGlucoseContentAdapter extends RecyclerView.Adapter<RecyclerView.d0> {

    @NotNull
    private Context context;

    @NotNull
    private List<? extends qpo> mDataList;

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0014\u0010\u000b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\tR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\tR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\t¨\u0006\u0018"}, d2 = {"Lcom/xiaomi/fitness/health/bloodglucose/holder/BloodGlucoseContentAdapter$BloodGlucoseContentHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Lqpo;", "model", "", "bindData", "(Lqpo;)V", "Landroid/widget/TextView;", "titleTxtView", "Landroid/widget/TextView;", "valueTxtView", "unitTxtView", "Lcom/xiaomi/fitness/widget/view/DurationTextView;", "durationTextView", "Lcom/xiaomi/fitness/widget/view/DurationTextView;", "abnormalTxtView", "Landroid/widget/ImageView;", "ivJump", "Landroid/widget/ImageView;", "txtBeforeDesc", "Landroid/view/View;", "itemView", "<init>", "(Lcom/xiaomi/fitness/health/bloodglucose/holder/BloodGlucoseContentAdapter;Landroid/view/View;)V", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public final class BloodGlucoseContentHolder extends RecyclerView.d0 {

        @NotNull
        private final TextView abnormalTxtView;

        @NotNull
        private final DurationTextView durationTextView;

        @NotNull
        private final ImageView ivJump;
        final /* synthetic */ BloodGlucoseContentAdapter this$0;

        @NotNull
        private final TextView titleTxtView;

        @NotNull
        private final TextView txtBeforeDesc;

        @NotNull
        private final TextView unitTxtView;

        @NotNull
        private final TextView valueTxtView;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BloodGlucoseContentHolder(@NotNull BloodGlucoseContentAdapter bloodGlucoseContentAdapter, View itemView) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            this.this$0 = bloodGlucoseContentAdapter;
            this.titleTxtView = (TextView) itemView.findViewById(eri.f442do);
            this.valueTxtView = (TextView) itemView.findViewById(eri.ho);
            this.unitTxtView = (TextView) itemView.findViewById(eri.fo);
            this.durationTextView = (DurationTextView) itemView.findViewById(eri.p4);
            this.abnormalTxtView = (TextView) itemView.findViewById(eri.Uj);
            this.ivJump = (ImageView) itemView.findViewById(eri.Z8);
            this.txtBeforeDesc = (TextView) itemView.findViewById(eri.Bn);
        }

        public final void bindData(@NotNull qpo model) {
            Intrinsics.checkNotNullParameter(model, "model");
            if (model.e) {
                this.durationTextView.setVisibility(0);
                this.durationTextView.setDuration(model.f);
                this.valueTxtView.setText("");
            } else {
                this.durationTextView.setVisibility(8);
                this.valueTxtView.setText(model.f31728b);
            }
            if (TextUtils.isEmpty(model.d)) {
                this.abnormalTxtView.setVisibility(8);
            } else {
                Drawable drawable = model.i;
                if (drawable != null) {
                    this.abnormalTxtView.setBackground(drawable);
                }
                int i = model.h;
                if (i != 0) {
                    this.abnormalTxtView.setTextColor(i);
                }
                this.abnormalTxtView.setVisibility(0);
                this.abnormalTxtView.setText(model.d);
            }
            this.titleTxtView.setText(model.f31727a);
            this.unitTxtView.setText(model.c);
            if (model.f31729k != null) {
                this.txtBeforeDesc.setVisibility(0);
                this.txtBeforeDesc.setText(model.f31729k);
            }
            if (model.g) {
                this.ivJump.setVisibility(0);
            } else {
                this.ivJump.setVisibility(8);
            }
        }
    }

    public BloodGlucoseContentAdapter(@NotNull Context context, @NotNull List<? extends qpo> contentDataList) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(contentDataList, "contentDataList");
        this.context = context;
        this.mDataList = contentDataList;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.mDataList.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull RecyclerView.d0 holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        if (holder instanceof BloodGlucoseContentHolder) {
            ((BloodGlucoseContentHolder) holder).bindData(this.mDataList.get(position));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public RecyclerView.d0 onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewInflate = LayoutInflater.from(this.context).inflate(jui.y6, parent, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return new BloodGlucoseContentHolder(this, viewInflate);
    }
}
