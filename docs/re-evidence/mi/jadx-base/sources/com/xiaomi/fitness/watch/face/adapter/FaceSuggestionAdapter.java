package com.xiaomi.fitness.watch.face.adapter;

import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.watch.face.FaceDetailFragment;
import com.xiaomi.fitness.watch.face.adapter.FaceSuggestionAdapter;
import com.xiaomi.fitness.watch.face.export.data.FaceData;
import com.xiaomi.fitness.watch.face.export.exportview.FaceIcon;
import com.xiaomi.fitness.watch.face.export.exportview.FaceSizeConstant;
import com.xiaomi.fitness.watch.face.helper.FaceOneTrackUtil;
import com.xiaomi.fitness.watch.face.helper.ImageLoadUtil;
import com.xiaomi.onetrack.OneTrack;
import defpackage.iki;
import defpackage.j39;
import defpackage.p1j;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000  2\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0002\u001f BE\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u001c\u0010\n\u001a\u0018\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\fj\u0002`\u000b¢\u0006\u0004\b\u000f\u0010\u0010J\u0014\u0010\u0014\u001a\u00020\u000e2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\r0\u0016J\u001c\u0010\u0017\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\bH\u0016J\b\u0010\u001b\u001a\u00020\bH\u0016J\u001c\u0010\u001c\u001a\u00020\u000e2\n\u0010\u001d\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u001e\u001a\u00020\bH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R&\u0010\n\u001a\u0018\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\fj\u0002`\u000bX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0011R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\r0\u0013X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lcom/xiaomi/fitness/watch/face/adapter/FaceSuggestionAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/xiaomi/fitness/watch/face/adapter/FaceSuggestionAdapter$FaceSuggestionHolder;", "showWatchFacePrice", "", "pageName", "", "source", "", "utmSource", "onClickSuggestionFace", "Lcom/xiaomi/fitness/watch/face/adapter/OnClickSuggestionFace;", "Lkotlin/Function2;", "Lcom/xiaomi/fitness/watch/face/export/data/FaceData;", "", "<init>", "(ZLjava/lang/String;IILkotlin/jvm/functions/Function2;)V", "Lkotlin/jvm/functions/Function2;", "suggestionList", "", "setDataList", "list", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "getItemCount", "onBindViewHolder", "holder", "position", "FaceSuggestionHolder", "Companion", "watch-face_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FaceSuggestionAdapter extends RecyclerView.Adapter<FaceSuggestionHolder> {
    private static final double SCALE = 0.58d;

    @NotNull
    private final Function2<Integer, FaceData, Unit> onClickSuggestionFace;

    @NotNull
    private final String pageName;
    private final boolean showWatchFacePrice;
    private final int source;

    @NotNull
    private final List<FaceData> suggestionList;
    private final int utmSource;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lcom/xiaomi/fitness/watch/face/adapter/FaceSuggestionAdapter$FaceSuggestionHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "", "position", "", "onBind", "(I)V", "onClick", "Lj39;", "binding", "Lj39;", "<init>", "(Lcom/xiaomi/fitness/watch/face/adapter/FaceSuggestionAdapter;Lj39;)V", "watch-face_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    @SourceDebugExtension({"SMAP\nFaceSuggestionAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FaceSuggestionAdapter.kt\ncom/xiaomi/fitness/watch/face/adapter/FaceSuggestionAdapter$FaceSuggestionHolder\n+ 2 View.kt\nandroidx/core/view/ViewKt\n+ 3 ViewGroup.kt\nandroidx/core/view/ViewGroupKt\n*L\n1#1,133:1\n326#2,2:134\n328#2,2:144\n193#3,8:136\n*S KotlinDebug\n*F\n+ 1 FaceSuggestionAdapter.kt\ncom/xiaomi/fitness/watch/face/adapter/FaceSuggestionAdapter$FaceSuggestionHolder\n*L\n64#1:134,2\n64#1:144,2\n65#1:136,8\n*E\n"})
    public final class FaceSuggestionHolder extends RecyclerView.d0 {

        @NotNull
        private final j39 binding;
        final /* synthetic */ FaceSuggestionAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FaceSuggestionHolder(@NotNull FaceSuggestionAdapter faceSuggestionAdapter, j39 binding) {
            super(binding.getRoot());
            Intrinsics.checkNotNullParameter(binding, "binding");
            this.this$0 = faceSuggestionAdapter;
            this.binding = binding;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void onClick$lambda$1(FaceSuggestionAdapter this$0, int i, FaceData faceData, View view) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(faceData, "$faceData");
            this$0.onClickSuggestionFace.invoke(Integer.valueOf(i), faceData);
        }

        public final void onBind(int position) {
            int dp;
            int dp2;
            FaceData faceData = (FaceData) this.this$0.suggestionList.get(position);
            int currentType = FaceSizeConstant.INSTANCE.getCurrentType();
            if (currentType == 1 || currentType == 2) {
                dp = ExtUtilsKt.getDp(Double.valueOf(113.3d));
            } else if (currentType != 3) {
                dp = currentType != 4 ? 0 : ExtUtilsKt.getDp(120);
            } else {
                dp = ExtUtilsKt.getDp(Double.valueOf(133.3d));
            }
            if (currentType == 1) {
                dp2 = ExtUtilsKt.getDp(20);
            } else if (currentType == 2) {
                dp2 = ExtUtilsKt.getDp(Double.valueOf(20.7d));
            } else if (currentType != 3) {
                dp2 = currentType != 4 ? 0 : ExtUtilsKt.getDp(Double.valueOf(17.3d));
            } else {
                dp2 = ExtUtilsKt.getDp(Double.valueOf(10.7d));
            }
            int i = (FaceIcon.INFO_WIDTH * dp) / FaceIcon.INFO_HEIGHT;
            int i2 = (int) ((dp * FaceIcon.INFO_RADIUS) / FaceIcon.INFO_HEIGHT);
            ImageLoadUtil imageLoadUtil = ImageLoadUtil.INSTANCE;
            ImageView mImageView = this.binding.B;
            Intrinsics.checkNotNullExpressionValue(mImageView, "mImageView");
            ImageLoadUtil.load$default(imageLoadUtil, mImageView, faceData.getIcon(), i, dp, i2, null, 32, null);
            ImageView mImageView2 = this.binding.B;
            Intrinsics.checkNotNullExpressionValue(mImageView2, "mImageView");
            ViewGroup.LayoutParams layoutParams = mImageView2.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.setMargins(marginLayoutParams.leftMargin, dp2, marginLayoutParams.rightMargin, dp2);
            mImageView2.setLayoutParams(marginLayoutParams);
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setStroke(ExtUtilsKt.getDp(2), ApplicationExtKt.getApplication().getColor(iki.g));
            gradientDrawable.setCornerRadius(((ExtUtilsKt.getDp(124) * FaceIcon.INFO_RADIUS) / FaceIcon.INFO_HEIGHT) + ExtUtilsKt.getDp(4));
            gradientDrawable.setBounds(0, 0, i, dp);
            this.binding.B.setBackground(gradientDrawable);
            this.binding.C.setText(faceData.getDisplay_name());
            TextView size = this.binding.E;
            Intrinsics.checkNotNullExpressionValue(size, "size");
            ViewExtKt.visible(size);
            if (!this.this$0.showWatchFacePrice) {
                TextView size2 = this.binding.E;
                Intrinsics.checkNotNullExpressionValue(size2, "size");
                ViewExtKt.gone(size2);
            } else if (faceData.isPurchaseFace()) {
                this.binding.E.setText(ResourceExtKt.getString(p1j.r0, Float.valueOf(faceData.getPrice() / 100.0f)));
            } else {
                this.binding.E.setText(ResourceExtKt.getString(p1j.m));
            }
            this.binding.B.setTag(FaceOneTrackUtil.buildTrackContent$default(FaceOneTrackUtil.INSTANCE, faceData.getId(), "expose_v3", MapsKt__MapsKt.mapOf(TuplesKt.to("tip", "56.0.0.0.39956"), TuplesKt.to("name", "watchface_single"), TuplesKt.to("asset_id", faceData.getId()), TuplesKt.to(OneTrack.Param.ASSET_NAME, faceData.getDisplay_name()), TuplesKt.to(FaceDetailFragment.PAGE_NAME, this.this$0.pageName), TuplesKt.to("source", Integer.valueOf(this.this$0.source)), TuplesKt.to("utm_source", Integer.valueOf(this.this$0.utmSource)), TuplesKt.to("watchface_position_id", Integer.valueOf(position + 1))), 0.0f, 8, null));
        }

        public final void onClick(final int position) {
            final FaceData faceData = (FaceData) this.this$0.suggestionList.get(position);
            View root = this.binding.getRoot();
            final FaceSuggestionAdapter faceSuggestionAdapter = this.this$0;
            root.setOnClickListener(new View.OnClickListener() { // from class: s59
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    FaceSuggestionAdapter.FaceSuggestionHolder.onClick$lambda$1(faceSuggestionAdapter, position, faceData, view);
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FaceSuggestionAdapter(boolean z, @NotNull String pageName, int i, int i2, @NotNull Function2<? super Integer, ? super FaceData, Unit> onClickSuggestionFace) {
        Intrinsics.checkNotNullParameter(pageName, "pageName");
        Intrinsics.checkNotNullParameter(onClickSuggestionFace, "onClickSuggestionFace");
        this.showWatchFacePrice = z;
        this.pageName = pageName;
        this.source = i;
        this.utmSource = i2;
        this.onClickSuggestionFace = onClickSuggestionFace;
        this.suggestionList = new ArrayList();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: getItemCount */
    public int getCount() {
        return this.suggestionList.size();
    }

    public final void setDataList(@NotNull List<FaceData> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        this.suggestionList.clear();
        this.suggestionList.addAll(list);
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull FaceSuggestionHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.onBind(position);
        holder.onClick(position);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public FaceSuggestionHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        j39 j39VarA0 = j39.A0(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(j39VarA0, "inflate(...)");
        return new FaceSuggestionHolder(this, j39VarA0);
    }
}
