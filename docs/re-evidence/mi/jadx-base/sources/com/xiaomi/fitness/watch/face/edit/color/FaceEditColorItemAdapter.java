package com.xiaomi.fitness.watch.face.edit.color;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.watch.face.edit.color.FaceEditColorItemAdapter;
import com.xiaomi.fitness.watch.face.edit.utils.DialEditHelper;
import defpackage.h19;
import defpackage.iki;
import defpackage.noi;
import defpackage.p1j;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u001aB\u001f\u0012\u0016\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005j\u0002`\u0004¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u0011J\u001c\u0010\u0012\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0006H\u0016J\b\u0010\u0016\u001a\u00020\u0006H\u0016J\u001c\u0010\u0017\u001a\u00020\u00072\n\u0010\u0018\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u0006H\u0016R \u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005j\u0002`\u0004X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\nR\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/xiaomi/fitness/watch/face/edit/color/FaceEditColorItemAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/xiaomi/fitness/watch/face/edit/color/FaceEditColorItemAdapter$FaceEditColorItemHolder;", "onColorGroupSelectListener", "Lcom/xiaomi/fitness/watch/face/edit/color/OnColorGroupSelectListener;", "Lkotlin/Function1;", "", "", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "Lkotlin/jvm/functions/Function1;", "colorList", "", "", "select", "setColorList", "data", "Lcom/xiaomi/fitness/watch/face/edit/color/FaceEditColorGroupListData;", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "getItemCount", "onBindViewHolder", "holder", "position", "FaceEditColorItemHolder", "watch-face_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FaceEditColorItemAdapter extends RecyclerView.Adapter<FaceEditColorItemHolder> {

    @NotNull
    private final List<String> colorList;

    @NotNull
    private final Function1<Integer, Unit> onColorGroupSelectListener;
    private int select;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/xiaomi/fitness/watch/face/edit/color/FaceEditColorItemAdapter$FaceEditColorItemHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "", "color", "", "bindColor", "(Ljava/lang/String;)V", "onClick", "()V", "Lh19;", "binding", "Lh19;", "<init>", "(Lcom/xiaomi/fitness/watch/face/edit/color/FaceEditColorItemAdapter;Lh19;)V", "watch-face_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public final class FaceEditColorItemHolder extends RecyclerView.d0 {

        @NotNull
        private final h19 binding;
        final /* synthetic */ FaceEditColorItemAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FaceEditColorItemHolder(@NotNull FaceEditColorItemAdapter faceEditColorItemAdapter, h19 binding) {
            super(binding.getRoot());
            Intrinsics.checkNotNullParameter(binding, "binding");
            this.this$0 = faceEditColorItemAdapter;
            this.binding = binding;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void onClick$lambda$1(FaceEditColorItemAdapter this$0, FaceEditColorItemHolder this$1, View view) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(this$1, "this$1");
            this$0.onColorGroupSelectListener.invoke2(Integer.valueOf(this$1.getBindingAdapterPosition()));
        }

        public final void bindColor(@NotNull String color) {
            Intrinsics.checkNotNullParameter(color, "color");
            if (getBindingAdapterPosition() == this.this$0.select) {
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setStroke(ExtUtilsKt.getDp(2), ApplicationExtKt.getApplication().getColor(iki.e));
                gradientDrawable.setCornerRadius(ExtUtilsKt.getDp(25));
                this.binding.getRoot().setBackground(gradientDrawable);
            } else {
                this.binding.getRoot().setBackground(null);
            }
            if (StringsKt__StringsJVMKt.equals(color, "#000001", true)) {
                this.binding.A.setBackgroundResource(noi.j);
                return;
            }
            Drawable background = this.binding.A.getBackground();
            Intrinsics.checkNotNull(background, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
            GradientDrawable gradientDrawable2 = (GradientDrawable) background;
            Integer numSafeColorParse = DialEditHelper.INSTANCE.safeColorParse(color);
            if (numSafeColorParse != null) {
                gradientDrawable2.setColor(numSafeColorParse.intValue());
                this.binding.A.setBackground(gradientDrawable2);
            }
        }

        public final void onClick() {
            View root = this.binding.getRoot();
            final FaceEditColorItemAdapter faceEditColorItemAdapter = this.this$0;
            root.setOnClickListener(new View.OnClickListener() { // from class: xr8
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    FaceEditColorItemAdapter.FaceEditColorItemHolder.onClick$lambda$1(faceEditColorItemAdapter, this, view);
                }
            });
            this.binding.getRoot().setContentDescription(ResourceExtKt.getString(p1j.S) + (getBindingAdapterPosition() + 1));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FaceEditColorItemAdapter(@NotNull Function1<? super Integer, Unit> onColorGroupSelectListener) {
        Intrinsics.checkNotNullParameter(onColorGroupSelectListener, "onColorGroupSelectListener");
        this.onColorGroupSelectListener = onColorGroupSelectListener;
        this.colorList = new ArrayList();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: getItemCount */
    public int getCount() {
        return this.colorList.size();
    }

    public final void setColorList(@NotNull FaceEditColorGroupListData data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.select = data.getSelectIndex();
        if (data.getColorGroupList() != null) {
            this.colorList.clear();
            List<String> list = this.colorList;
            List<String> colorGroupList = data.getColorGroupList();
            Intrinsics.checkNotNull(colorGroupList);
            list.addAll(colorGroupList);
            notifyDataSetChanged();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull FaceEditColorItemHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.bindColor(this.colorList.get(position));
        holder.onClick();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public FaceEditColorItemHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        h19 h19VarA0 = h19.A0(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(h19VarA0, "inflate(...)");
        return new FaceEditColorItemHolder(this, h19VarA0);
    }
}
