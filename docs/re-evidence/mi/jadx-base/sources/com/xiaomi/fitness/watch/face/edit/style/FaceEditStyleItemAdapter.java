package com.xiaomi.fitness.watch.face.edit.style;

import android.graphics.Bitmap;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import coil.Coil;
import coil.ImageLoader;
import coil.request.ImageRequest;
import coil.transform.RoundedCornersTransformation;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.watch.face.edit.style.FaceEditStyleItemAdapter;
import com.xiaomi.fitness.watch.face.export.exportview.FaceIcon;
import defpackage.iki;
import defpackage.j19;
import defpackage.p1j;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u001cB\u001f\u0012\u0016\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005j\u0002`\u0004¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0013J\u001c\u0010\u0014\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0006H\u0016J\b\u0010\u0018\u001a\u00020\u0006H\u0016J\u001c\u0010\u0019\u001a\u00020\u00072\n\u0010\u001a\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u0006H\u0016R \u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005j\u0002`\u0004X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\nR\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/xiaomi/fitness/watch/face/edit/style/FaceEditStyleItemAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/xiaomi/fitness/watch/face/edit/style/FaceEditStyleItemAdapter$FaceEditStyleItemHolder;", "onStyleSelectListener", "Lcom/xiaomi/fitness/watch/face/edit/style/OnStyleSelectListener;", "Lkotlin/Function1;", "", "", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "Lkotlin/jvm/functions/Function1;", "styleList", "", "Landroid/graphics/Bitmap;", "select", "videoBg", "", "setStyleList", "data", "Lcom/xiaomi/fitness/watch/face/edit/style/FaceEditThemeListData;", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "getItemCount", "onBindViewHolder", "holder", "position", "FaceEditStyleItemHolder", "watch-face_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FaceEditStyleItemAdapter extends RecyclerView.Adapter<FaceEditStyleItemHolder> {

    @NotNull
    private final Function1<Integer, Unit> onStyleSelectListener;
    private int select;

    @NotNull
    private final List<Bitmap> styleList;

    @Nullable
    private String videoBg;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/xiaomi/fitness/watch/face/edit/style/FaceEditStyleItemAdapter$FaceEditStyleItemHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Landroid/graphics/Bitmap;", "bitmap", "", "bindView", "(Landroid/graphics/Bitmap;)V", "onSelect", "()V", "Lj19;", "binding", "Lj19;", "<init>", "(Lcom/xiaomi/fitness/watch/face/edit/style/FaceEditStyleItemAdapter;Lj19;)V", "watch-face_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    @SourceDebugExtension({"SMAP\nFaceEditStyleItemAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FaceEditStyleItemAdapter.kt\ncom/xiaomi/fitness/watch/face/edit/style/FaceEditStyleItemAdapter$FaceEditStyleItemHolder\n+ 2 Extensions.kt\ncoil/-SingletonExtensions\n*L\n1#1,120:1\n54#2,3:121\n24#2:124\n59#2,6:125\n*S KotlinDebug\n*F\n+ 1 FaceEditStyleItemAdapter.kt\ncom/xiaomi/fitness/watch/face/edit/style/FaceEditStyleItemAdapter$FaceEditStyleItemHolder\n*L\n51#1:121,3\n51#1:124\n51#1:125,6\n*E\n"})
    public final class FaceEditStyleItemHolder extends RecyclerView.d0 {

        @NotNull
        private final j19 binding;
        final /* synthetic */ FaceEditStyleItemAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FaceEditStyleItemHolder(@NotNull FaceEditStyleItemAdapter faceEditStyleItemAdapter, j19 binding) {
            super(binding.getRoot());
            Intrinsics.checkNotNullParameter(binding, "binding");
            this.this$0 = faceEditStyleItemAdapter;
            this.binding = binding;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void onSelect$lambda$1(FaceEditStyleItemAdapter this$0, FaceEditStyleItemHolder this$1, View view) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(this$1, "this$1");
            this$0.onStyleSelectListener.invoke2(Integer.valueOf(this$1.getBindingAdapterPosition()));
        }

        public final void bindView(@NotNull Bitmap bitmap) {
            Intrinsics.checkNotNullParameter(bitmap, "bitmap");
            this.binding.C.setImageBitmap(bitmap);
            if (this.this$0.videoBg != null) {
                Logger.i("FaceEditStyleItemHolder", "add video bg");
                if (this.this$0.videoBg != null) {
                    ImageView bg = this.binding.A;
                    Intrinsics.checkNotNullExpressionValue(bg, "bg");
                    String str = this.this$0.videoBg;
                    ImageLoader imageLoader = Coil.imageLoader(bg.getContext());
                    ImageRequest.Builder builderTarget = new ImageRequest.Builder(bg.getContext()).data(str).target(bg);
                    builderTarget.transformations(new RoundedCornersTransformation(bitmap.getWidth() / 2.0f));
                    builderTarget.size(bitmap.getWidth(), bitmap.getHeight());
                    imageLoader.enqueue(builderTarget.build());
                }
            }
            if (getBindingAdapterPosition() != this.this$0.select) {
                this.binding.C.setBackground(null);
                ImageView border = this.binding.B;
                Intrinsics.checkNotNullExpressionValue(border, "border");
                ExtUtilsKt.setVisible(border, false);
                this.binding.B.setImageDrawable(null);
                return;
            }
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setStroke(ExtUtilsKt.getDp(3), ApplicationExtKt.getApplication().getColor(iki.e));
            float width = (bitmap.getWidth() * FaceIcon.INFO_RADIUS) / FaceIcon.INFO_WIDTH;
            if (width <= this.binding.C.getWidth()) {
                gradientDrawable.setCornerRadius(width + ExtUtilsKt.getDp(6));
                gradientDrawable.setBounds(0, 0, bitmap.getWidth(), bitmap.getHeight());
                this.binding.C.setBackground(gradientDrawable);
                ImageView border2 = this.binding.B;
                Intrinsics.checkNotNullExpressionValue(border2, "border");
                ExtUtilsKt.setVisible(border2, false);
                this.binding.B.setImageDrawable(null);
                return;
            }
            gradientDrawable.setCornerRadius((this.binding.C.getWidth() * FaceIcon.INFO_RADIUS) / FaceIcon.INFO_WIDTH);
            int width2 = (this.binding.C.getWidth() * FaceIcon.INFO_HEIGHT) / FaceIcon.INFO_WIDTH;
            gradientDrawable.setBounds(0, 0, this.binding.C.getWidth(), width2);
            if (gradientDrawable.getBounds().width() > 0) {
                ViewGroup.LayoutParams layoutParams = this.binding.B.getLayoutParams();
                layoutParams.width = gradientDrawable.getBounds().width();
                layoutParams.height = width2;
                this.binding.B.setLayoutParams(layoutParams);
                ImageView border3 = this.binding.B;
                Intrinsics.checkNotNullExpressionValue(border3, "border");
                ExtUtilsKt.setVisible(border3, true);
                this.binding.B.setImageDrawable(gradientDrawable);
            }
        }

        public final void onSelect() {
            View root = this.binding.getRoot();
            final FaceEditStyleItemAdapter faceEditStyleItemAdapter = this.this$0;
            root.setOnClickListener(new View.OnClickListener() { // from class: mv8
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    FaceEditStyleItemAdapter.FaceEditStyleItemHolder.onSelect$lambda$1(faceEditStyleItemAdapter, this, view);
                }
            });
            this.binding.getRoot().setContentDescription(ResourceExtKt.getString(p1j.Y) + (getBindingAdapterPosition() + 1));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FaceEditStyleItemAdapter(@NotNull Function1<? super Integer, Unit> onStyleSelectListener) {
        Intrinsics.checkNotNullParameter(onStyleSelectListener, "onStyleSelectListener");
        this.onStyleSelectListener = onStyleSelectListener;
        this.styleList = new ArrayList();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: getItemCount */
    public int getCount() {
        return this.styleList.size();
    }

    public final void setStyleList(@NotNull FaceEditThemeListData data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.select = data.getSelect();
        this.videoBg = data.getVideoBg();
        if (data.getThemeList() != null) {
            this.styleList.clear();
            List<Bitmap> list = this.styleList;
            List<Bitmap> themeList = data.getThemeList();
            Intrinsics.checkNotNull(themeList);
            list.addAll(themeList);
            notifyDataSetChanged();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull FaceEditStyleItemHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.bindView(this.styleList.get(position));
        holder.onSelect();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public FaceEditStyleItemHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        j19 j19VarA0 = j19.A0(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(j19VarA0, "inflate(...)");
        return new FaceEditStyleItemHolder(this, j19VarA0);
    }
}
