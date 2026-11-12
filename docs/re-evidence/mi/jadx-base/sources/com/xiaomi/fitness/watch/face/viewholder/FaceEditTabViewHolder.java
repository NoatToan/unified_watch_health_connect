package com.xiaomi.fitness.watch.face.viewholder;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.watch.face.viewholder.FaceEditTabViewHolder;
import defpackage.iki;
import defpackage.j29;
import defpackage.p1j;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\u000e\u001a\u00020\t2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t0\f¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, d2 = {"Lcom/xiaomi/fitness/watch/face/viewholder/FaceEditTabViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "", "type", "", "getName", "(I)Ljava/lang/String;", "", "select", "", "bindData", "(IZ)V", "Lkotlin/Function1;", "position", "onSelect", "(Lkotlin/jvm/functions/Function1;)V", "Lj29;", "binding", "Lj29;", "<init>", "(Lj29;)V", "watch-face_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class FaceEditTabViewHolder extends RecyclerView.d0 {

    @NotNull
    private final j29 binding;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FaceEditTabViewHolder(@NotNull j29 binding) {
        super(binding.getRoot());
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.binding = binding;
    }

    private final String getName(int type) {
        switch (type) {
            case 1:
            case 10:
                String string = ApplicationExtKt.getApplication().getString(p1j.U);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                return string;
            case 2:
                String string2 = ApplicationExtKt.getApplication().getString(p1j.Y);
                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                return string2;
            case 3:
            default:
                return "";
            case 4:
                String string3 = ApplicationExtKt.getApplication().getString(p1j.V);
                Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
                return string3;
            case 5:
                String string4 = ApplicationExtKt.getApplication().getString(p1j.T);
                Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
                return string4;
            case 6:
                String string5 = ApplicationExtKt.getApplication().getString(p1j.S);
                Intrinsics.checkNotNullExpressionValue(string5, "getString(...)");
                return string5;
            case 7:
                String string6 = ApplicationExtKt.getApplication().getString(p1j.W);
                Intrinsics.checkNotNullExpressionValue(string6, "getString(...)");
                return string6;
            case 8:
                String string7 = ApplicationExtKt.getApplication().getString(p1j.X);
                Intrinsics.checkNotNullExpressionValue(string7, "getString(...)");
                return string7;
            case 9:
                String string8 = ApplicationExtKt.getApplication().getString(p1j.Z);
                Intrinsics.checkNotNullExpressionValue(string8, "getString(...)");
                return string8;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onSelect$lambda$0(Function1 position, FaceEditTabViewHolder this$0, View view) {
        Intrinsics.checkNotNullParameter(position, "$position");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        position.invoke2(Integer.valueOf(this$0.getBindingAdapterPosition()));
    }

    public final void bindData(int type, boolean select) {
        this.binding.A.setText(getName(type));
        this.binding.A.setTextColor(ExtUtilsKt.getColor(select ? iki.l : iki.m));
        if (select) {
            this.binding.A.setContentDescription(AppUtil.getApp().getString(p1j.J5, getName(type)));
        } else {
            this.binding.A.setContentDescription(AppUtil.getApp().getString(p1j.K5, getName(type)));
        }
    }

    public final void onSelect(@NotNull final Function1<? super Integer, Unit> position) {
        Intrinsics.checkNotNullParameter(position, "position");
        this.binding.getRoot().setOnClickListener(new View.OnClickListener() { // from class: ov8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FaceEditTabViewHolder.onSelect$lambda$0(position, this, view);
            }
        });
    }
}
