package com.xiaomi.fitness.membership.dialog;

import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.membership.export.data.VipExpiredFaceItem;
import com.xiaomi.fitness.watch.face.db.WatchFaceDataBase;
import com.xiaomi.fitness.watch.face.export.FaceHelper;
import com.xiaomi.fitness.watch.face.export.FaceHelperExtKt;
import com.xiaomi.fitness.watch.face.export.exportview.FaceIcon;
import defpackage.oji;
import defpackage.pof;
import defpackage.uni;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000  2\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0002\u001f B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\u0011\u001a\u00020\u00122\u001a\u0010\u0013\u001a\u0016\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u0015j\n\u0012\u0004\u0012\u00020\u0010\u0018\u0001`\u0014¢\u0006\u0002\u0010\u0016J\u001c\u0010\u0017\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0004H\u0016J\b\u0010\u001b\u001a\u00020\u0004H\u0016J\u001c\u0010\u001c\u001a\u00020\u00122\n\u0010\u001d\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u0004H\u0016R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u0004X\u0082D¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lcom/xiaomi/fitness/membership/dialog/MembershipExpiredFaceAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/xiaomi/fitness/membership/dialog/MembershipExpiredFaceAdapter$MembershipDialogViewHolder;", "shape", "", "hasMore", "", "<init>", "(IZ)V", "getShape", "()I", "getHasMore", "()Z", "SHOW_MAX_NUMS", "faceList", "", "Lcom/xiaomi/fitness/membership/export/data/VipExpiredFaceItem;", "setComboList", "", "list", "Lkotlin/collections/ArrayList;", "Ljava/util/ArrayList;", "(Ljava/util/ArrayList;)V", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "getItemCount", "onBindViewHolder", "holder", "position", "MembershipDialogViewHolder", "Companion", "membership_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MembershipExpiredFaceAdapter extends RecyclerView.Adapter<MembershipDialogViewHolder> {
    public static final int FACE_TYPE_CIRCLE = 1;
    public static final int FACE_TYPE_RECT = 4;
    public static final int FACE_TYPE_RUN_SCREEN = 3;
    public static final int FACE_TYPE_SQUARE = 2;
    private final int SHOW_MAX_NUMS = 7;

    @NotNull
    private final List<VipExpiredFaceItem> faceList = new ArrayList();
    private final boolean hasMore;
    private final int shape;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/fitness/membership/dialog/MembershipExpiredFaceAdapter$MembershipDialogViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "", "position", "", "setFaceMoreUI", "(I)V", "Lcom/xiaomi/fitness/membership/export/data/VipExpiredFaceItem;", WatchFaceDataBase.DB_NAME, "onBind", "(Lcom/xiaomi/fitness/membership/export/data/VipExpiredFaceItem;I)V", "Lpof;", "binding", "Lpof;", "<init>", "(Lcom/xiaomi/fitness/membership/dialog/MembershipExpiredFaceAdapter;Lpof;)V", "membership_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    @SourceDebugExtension({"SMAP\nMembershipExpiredFaceAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MembershipExpiredFaceAdapter.kt\ncom/xiaomi/fitness/membership/dialog/MembershipExpiredFaceAdapter$MembershipDialogViewHolder\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,124:1\n326#2,4:125\n*S KotlinDebug\n*F\n+ 1 MembershipExpiredFaceAdapter.kt\ncom/xiaomi/fitness/membership/dialog/MembershipExpiredFaceAdapter$MembershipDialogViewHolder\n*L\n48#1:125,4\n*E\n"})
    public final class MembershipDialogViewHolder extends RecyclerView.d0 {

        @NotNull
        private final pof binding;
        final /* synthetic */ MembershipExpiredFaceAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MembershipDialogViewHolder(@NotNull MembershipExpiredFaceAdapter membershipExpiredFaceAdapter, pof binding) {
            super(binding.getRoot());
            Intrinsics.checkNotNullParameter(binding, "binding");
            this.this$0 = membershipExpiredFaceAdapter;
            this.binding = binding;
        }

        private final void setFaceMoreUI(int position) {
            if (position != this.this$0.SHOW_MAX_NUMS - 1 || !this.this$0.getHasMore()) {
                ImageView imageView = this.binding.A;
                imageView.setBackground(null);
                Intrinsics.checkNotNull(imageView);
                return;
            }
            this.binding.A.setImageResource(uni.f35950a);
            int shape = this.this$0.getShape();
            if (shape == 1) {
                ImageView imageView2 = this.binding.A;
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setShape(1);
                gradientDrawable.setColor(ExtUtilsKt.getColor(oji.f29221b));
                imageView2.setBackground(gradientDrawable);
                return;
            }
            if (shape == 2) {
                ImageView imageView3 = this.binding.A;
                GradientDrawable gradientDrawable2 = new GradientDrawable();
                gradientDrawable2.setCornerRadius(ExtUtilsKt.getDp(24));
                gradientDrawable2.setColor(ExtUtilsKt.getColor(oji.f29221b));
                imageView3.setBackground(gradientDrawable2);
                return;
            }
            if (shape == 3) {
                ImageView imageView4 = this.binding.A;
                GradientDrawable gradientDrawable3 = new GradientDrawable();
                gradientDrawable3.setCornerRadius(ExtUtilsKt.getDp(24));
                gradientDrawable3.setColor(ExtUtilsKt.getColor(oji.f29221b));
                imageView4.setBackground(gradientDrawable3);
                return;
            }
            if (shape != 4) {
                return;
            }
            ImageView imageView5 = this.binding.A;
            GradientDrawable gradientDrawable4 = new GradientDrawable();
            gradientDrawable4.setCornerRadius(ExtUtilsKt.getDp(15));
            gradientDrawable4.setColor(ExtUtilsKt.getColor(oji.f29221b));
            imageView5.setBackground(gradientDrawable4);
        }

        public final void onBind(@NotNull VipExpiredFaceItem face, int position) {
            Intrinsics.checkNotNullParameter(face, "face");
            int dp = ExtUtilsKt.getDp(100);
            int i = (FaceIcon.INFO_WIDTH * dp) / FaceIcon.INFO_HEIGHT;
            int i2 = (int) ((FaceIcon.INFO_RADIUS * dp) / FaceIcon.INFO_HEIGHT);
            ViewGroup.LayoutParams layoutParams = this.binding.A.getLayoutParams();
            layoutParams.width = i;
            layoutParams.height = dp;
            if (position < this.this$0.SHOW_MAX_NUMS - 1 || !this.this$0.getHasMore()) {
                FaceHelper faceHelperExtKt = FaceHelperExtKt.getInstance(FaceHelper.INSTANCE);
                ImageView ivExpiredFace = this.binding.A;
                Intrinsics.checkNotNullExpressionValue(ivExpiredFace, "ivExpiredFace");
                faceHelperExtKt.loadFace(ivExpiredFace, face.getIcon(), i, dp, i2);
            } else {
                this.binding.A.setImageResource(uni.f35950a);
            }
            setFaceMoreUI(position);
            ImageView ivExpiredFace2 = this.binding.A;
            Intrinsics.checkNotNullExpressionValue(ivExpiredFace2, "ivExpiredFace");
            MembershipExpiredFaceAdapter membershipExpiredFaceAdapter = this.this$0;
            ViewGroup.LayoutParams layoutParams2 = ivExpiredFace2.getLayoutParams();
            if (layoutParams2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams");
            }
            RecyclerView.LayoutParams layoutParams3 = (RecyclerView.LayoutParams) layoutParams2;
            layoutParams3.setMarginStart(ExtUtilsKt.getDp(position == 0 ? 26 : 8));
            layoutParams3.setMarginEnd(ExtUtilsKt.getDp(position == CollectionsKt__CollectionsKt.getLastIndex(membershipExpiredFaceAdapter.faceList) ? 26 : 8));
            ivExpiredFace2.setLayoutParams(layoutParams3);
        }
    }

    public MembershipExpiredFaceAdapter(int i, boolean z) {
        this.shape = i;
        this.hasMore = z;
    }

    public final boolean getHasMore() {
        return this.hasMore;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: getItemCount */
    public int getCount() {
        return Math.min(this.faceList.size(), this.SHOW_MAX_NUMS);
    }

    public final int getShape() {
        return this.shape;
    }

    public final void setComboList(@Nullable ArrayList<VipExpiredFaceItem> list) {
        this.faceList.clear();
        if (list != null) {
            this.faceList.addAll(list);
        }
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull MembershipDialogViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.onBind(this.faceList.get(position), position);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public MembershipDialogViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        pof pofVarA0 = pof.A0(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(pofVarA0, "inflate(...)");
        return new MembershipDialogViewHolder(this, pofVarA0);
    }
}
