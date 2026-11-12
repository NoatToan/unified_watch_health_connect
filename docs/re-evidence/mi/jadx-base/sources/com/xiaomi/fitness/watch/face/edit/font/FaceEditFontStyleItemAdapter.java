package com.xiaomi.fitness.watch.face.edit.font;

import android.graphics.Bitmap;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.watch.face.edit.font.FaceEditFontStyleItemAdapter;
import com.xiaomi.fitness.watch.face.export.exportview.FaceIcon;
import defpackage.iki;
import defpackage.j19;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u001aB\u001f\u0012\u0016\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005j\u0002`\u0004¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u0011J\u001c\u0010\u0012\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0006H\u0016J\b\u0010\u0016\u001a\u00020\u0006H\u0016J\u001c\u0010\u0017\u001a\u00020\u00072\n\u0010\u0018\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u0006H\u0016R \u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005j\u0002`\u0004X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\nR\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/xiaomi/fitness/watch/face/edit/font/FaceEditFontStyleItemAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/xiaomi/fitness/watch/face/edit/font/FaceEditFontStyleItemAdapter$FaceEditFontStyleItemHolder;", "onFaceEditFontStyleSelectListener", "Lcom/xiaomi/fitness/watch/face/edit/font/OnFaceEditFontStyleSelectListener;", "Lkotlin/Function1;", "", "", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "Lkotlin/jvm/functions/Function1;", "fontStyleList", "", "Landroid/graphics/Bitmap;", "currentSelect", "setFontStyle", "fontListData", "Lcom/xiaomi/fitness/watch/face/edit/font/FaceEditFontListData;", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "getItemCount", "onBindViewHolder", "holder", "position", "FaceEditFontStyleItemHolder", "watch-face_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FaceEditFontStyleItemAdapter extends RecyclerView.Adapter<FaceEditFontStyleItemHolder> {
    private int currentSelect;

    @NotNull
    private final List<Bitmap> fontStyleList;

    @NotNull
    private final Function1<Integer, Unit> onFaceEditFontStyleSelectListener;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/xiaomi/fitness/watch/face/edit/font/FaceEditFontStyleItemAdapter$FaceEditFontStyleItemHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Landroid/graphics/Bitmap;", "bitmap", "", "bindData", "(Landroid/graphics/Bitmap;)V", "onSelect", "()V", "Lj19;", "binding", "Lj19;", "<init>", "(Lcom/xiaomi/fitness/watch/face/edit/font/FaceEditFontStyleItemAdapter;Lj19;)V", "watch-face_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public final class FaceEditFontStyleItemHolder extends RecyclerView.d0 {

        @NotNull
        private final j19 binding;
        final /* synthetic */ FaceEditFontStyleItemAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FaceEditFontStyleItemHolder(@NotNull FaceEditFontStyleItemAdapter faceEditFontStyleItemAdapter, j19 binding) {
            super(binding.getRoot());
            Intrinsics.checkNotNullParameter(binding, "binding");
            this.this$0 = faceEditFontStyleItemAdapter;
            this.binding = binding;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void onSelect$lambda$0(FaceEditFontStyleItemAdapter this$0, FaceEditFontStyleItemHolder this$1, View view) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(this$1, "this$1");
            this$0.onFaceEditFontStyleSelectListener.invoke2(Integer.valueOf(this$1.getBindingAdapterPosition()));
        }

        public final void bindData(@NotNull Bitmap bitmap) {
            Intrinsics.checkNotNullParameter(bitmap, "bitmap");
            this.binding.C.setImageBitmap(bitmap);
            if (getBindingAdapterPosition() != this.this$0.currentSelect) {
                this.binding.C.setBackground(null);
                return;
            }
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setStroke(ExtUtilsKt.getDp(3), ApplicationExtKt.getApplication().getColor(iki.e));
            gradientDrawable.setCornerRadius(((bitmap.getWidth() * FaceIcon.INFO_RADIUS) / FaceIcon.INFO_WIDTH) + ExtUtilsKt.getDp(6));
            gradientDrawable.setBounds(0, 0, bitmap.getWidth(), bitmap.getHeight());
            this.binding.C.setBackground(gradientDrawable);
        }

        public final void onSelect() {
            View root = this.binding.getRoot();
            final FaceEditFontStyleItemAdapter faceEditFontStyleItemAdapter = this.this$0;
            root.setOnClickListener(new View.OnClickListener() { // from class: zr8
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    FaceEditFontStyleItemAdapter.FaceEditFontStyleItemHolder.onSelect$lambda$0(faceEditFontStyleItemAdapter, this, view);
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FaceEditFontStyleItemAdapter(@NotNull Function1<? super Integer, Unit> onFaceEditFontStyleSelectListener) {
        Intrinsics.checkNotNullParameter(onFaceEditFontStyleSelectListener, "onFaceEditFontStyleSelectListener");
        this.onFaceEditFontStyleSelectListener = onFaceEditFontStyleSelectListener;
        this.fontStyleList = new ArrayList();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: getItemCount */
    public int getCount() {
        return this.fontStyleList.size();
    }

    public final void setFontStyle(@NotNull FaceEditFontListData fontListData) {
        Intrinsics.checkNotNullParameter(fontListData, "fontListData");
        this.currentSelect = fontListData.getSelect();
        if (fontListData.getFontList() != null) {
            this.fontStyleList.clear();
            List<Bitmap> list = this.fontStyleList;
            List<Bitmap> fontList = fontListData.getFontList();
            Intrinsics.checkNotNull(fontList);
            list.addAll(fontList);
            notifyDataSetChanged();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull FaceEditFontStyleItemHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.bindData(this.fontStyleList.get(position));
        holder.onSelect();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public FaceEditFontStyleItemHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        j19 j19VarA0 = j19.A0(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(j19VarA0, "inflate(...)");
        return new FaceEditFontStyleItemHolder(this, j19VarA0);
    }
}
