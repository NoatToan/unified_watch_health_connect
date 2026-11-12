package com.xiaomi.fitness.watch.face.adapter;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.MutableLiveData;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.common.utils.DisplayUtil;
import com.xiaomi.fitness.watch.face.adapter.FaceColorAdapter;
import com.xiaomi.fitness.watch.face.data.FaceManager;
import com.xiaomi.fitness.watch.face.view.ColorView;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001*B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u001c\u0010\u001d\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!H\u0016J\u001c\u0010\"\u001a\u00020#2\n\u0010$\u001a\u00060\u0002R\u00020\u00002\u0006\u0010%\u001a\u00020!H\u0016J\b\u0010&\u001a\u00020!H\u0016J\u0018\u0010'\u001a\u00020(*\u0004\u0018\u00010\u000b2\b\u0010)\u001a\u0004\u0018\u00010\u000bH\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR!\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\"\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0011X\u0086.¢\u0006\u0010\n\u0002\u0010\u0016\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R(\u0010\u0018\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u000b@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c¨\u0006+"}, d2 = {"Lcom/xiaomi/fitness/watch/face/adapter/FaceColorAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/xiaomi/fitness/watch/face/adapter/FaceColorAdapter$ColorHolder;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "getContext", "()Landroid/content/Context;", "color", "Landroidx/lifecycle/MutableLiveData;", "", "getColor", "()Landroidx/lifecycle/MutableLiveData;", "color$delegate", "Lkotlin/Lazy;", "data", "", "getData", "()[Ljava/lang/String;", "setData", "([Ljava/lang/String;)V", "[Ljava/lang/String;", "value", "curColor", "getCurColor", "()Ljava/lang/String;", "setCurColor", "(Ljava/lang/String;)V", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "", "onBindViewHolder", "", "holder", "position", "getItemCount", "equalsIgnoreAlpha", "", "target", "ColorHolder", "watch-face_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nFaceColorAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FaceColorAdapter.kt\ncom/xiaomi/fitness/watch/face/adapter/FaceColorAdapter\n+ 2 Color.kt\nandroidx/core/graphics/ColorKt\n*L\n1#1,66:1\n125#2,17:67\n*S KotlinDebug\n*F\n+ 1 FaceColorAdapter.kt\ncom/xiaomi/fitness/watch/face/adapter/FaceColorAdapter\n*L\n64#1:67,17\n*E\n"})
public final class FaceColorAdapter extends RecyclerView.Adapter<ColorHolder> {

    /* JADX INFO: renamed from: color$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy color;

    @NotNull
    private final Context context;

    @Nullable
    private String curColor;
    public String[] data;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/xiaomi/fitness/watch/face/adapter/FaceColorAdapter$ColorHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "", "colorStr", "", "bindView", "(Ljava/lang/String;)V", "Landroid/view/View;", "view", "Landroid/view/View;", "getView", "()Landroid/view/View;", "<init>", "(Lcom/xiaomi/fitness/watch/face/adapter/FaceColorAdapter;Landroid/view/View;)V", "watch-face_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public final class ColorHolder extends RecyclerView.d0 {
        final /* synthetic */ FaceColorAdapter this$0;

        @NotNull
        private final View view;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ColorHolder(@NotNull FaceColorAdapter faceColorAdapter, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.this$0 = faceColorAdapter;
            this.view = view;
        }

        public final void bindView(@NotNull String colorStr) {
            Intrinsics.checkNotNullParameter(colorStr, "colorStr");
            int validColor = FaceManager.INSTANCE.getValidColor(colorStr);
            this.view.setTag(colorStr);
            View view = this.view;
            Intrinsics.checkNotNull(view, "null cannot be cast to non-null type com.xiaomi.fitness.watch.face.view.ColorView");
            ((ColorView) view).setColor(validColor);
            ColorView colorView = (ColorView) this.view;
            FaceColorAdapter faceColorAdapter = this.this$0;
            colorView.setSelected(faceColorAdapter.equalsIgnoreAlpha(colorStr, faceColorAdapter.getCurColor()));
        }

        @NotNull
        public final View getView() {
            return this.view;
        }
    }

    public FaceColorAdapter(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        this.color = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: jo8
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FaceColorAdapter.color_delegate$lambda$0();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MutableLiveData color_delegate$lambda$0() {
        return new MutableLiveData();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean equalsIgnoreAlpha(String str, String str2) {
        if (str2 == null || str2.length() == 0 || str == null || str.length() == 0) {
            return false;
        }
        FaceManager faceManager = FaceManager.INSTANCE;
        int color = Color.parseColor(faceManager.constrainColor(str));
        int color2 = Color.parseColor(faceManager.constrainColor(str2));
        return ((color >> 16) & 255) == ((color2 >> 16) & 255) && ((color >> 8) & 255) == ((color2 >> 8) & 255) && (color & 255) == (color2 & 255);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreateViewHolder$lambda$1(FaceColorAdapter this$0, ColorView view, View view2) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(view, "$view");
        Object tag = view.getTag();
        Intrinsics.checkNotNull(tag, "null cannot be cast to non-null type kotlin.String");
        this$0.setCurColor((String) tag);
        this$0.notifyDataSetChanged();
        MutableLiveData<String> color = this$0.getColor();
        FaceManager faceManager = FaceManager.INSTANCE;
        String str = this$0.curColor;
        Intrinsics.checkNotNull(str);
        color.setValue(faceManager.constrainColor(str));
    }

    @NotNull
    public final MutableLiveData<String> getColor() {
        return (MutableLiveData) this.color.getValue();
    }

    @NotNull
    public final Context getContext() {
        return this.context;
    }

    @Nullable
    public final String getCurColor() {
        return this.curColor;
    }

    @NotNull
    public final String[] getData() {
        String[] strArr = this.data;
        if (strArr != null) {
            return strArr;
        }
        Intrinsics.throwUninitializedPropertyAccessException("data");
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: getItemCount */
    public int getCount() {
        return getData().length;
    }

    public final void setCurColor(@Nullable String str) {
        this.curColor = str;
        notifyDataSetChanged();
    }

    public final void setData(@NotNull String[] strArr) {
        Intrinsics.checkNotNullParameter(strArr, "<set-?>");
        this.data = strArr;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull ColorHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.bindView(getData()[position]);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public ColorHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        final ColorView colorView = new ColorView(this.context, null, 0, 6, null);
        colorView.setLayoutParams(new RecyclerView.LayoutParams(DisplayUtil.dip2px(50.0f), DisplayUtil.dip2px(50.0f)));
        colorView.setOnClickListener(new View.OnClickListener() { // from class: ko8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FaceColorAdapter.onCreateViewHolder$lambda$1(this.f24038a, colorView, view);
            }
        });
        return new ColorHolder(this, colorView);
    }
}
