package com.xiaomi.fitness.watch.face.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.MutableLiveData;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.DisplayUtil;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.watch.face.adapter.FaceColorAdapter;
import com.xiaomi.fitness.watch.face.view.FaceColorPickView;
import defpackage.gak;
import defpackage.isi;
import defpackage.ovi;
import java.util.Arrays;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 $2\u00020\u0001:\u0001$B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ-\u0010\u0017\u001a\u00020\u00182\u000e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001a2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001d\u001a\u00020\u001e¢\u0006\u0002\u0010\u001fJ\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001b0!J\u000e\u0010\"\u001a\u00020\u00182\u0006\u0010#\u001a\u00020\u001bR\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006%"}, d2 = {"Lcom/xiaomi/fitness/watch/face/view/FaceColorPickView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attr", "Landroid/util/AttributeSet;", "def", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "mDividerView", "Landroid/view/View;", "getMDividerView", "()Landroid/view/View;", "mDividerView$delegate", "Lkotlin/Lazy;", "mColorAdapter", "Lcom/xiaomi/fitness/watch/face/adapter/FaceColorAdapter;", "getMColorAdapter", "()Lcom/xiaomi/fitness/watch/face/adapter/FaceColorAdapter;", "mColorAdapter$delegate", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "setData", "", "data", "", "", "curColor", "showDivider", "", "([Ljava/lang/String;Ljava/lang/String;Z)V", "getColor", "Landroidx/lifecycle/MutableLiveData;", "setCurColor", "color", "Companion", "watch-face_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FaceColorPickView extends ConstraintLayout {

    @NotNull
    public static final String TAG = "FaceColorPickView";

    /* JADX INFO: renamed from: mColorAdapter$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy mColorAdapter;

    /* JADX INFO: renamed from: mDividerView$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy mDividerView;

    @NotNull
    private RecyclerView recyclerView;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public FaceColorPickView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final FaceColorAdapter getMColorAdapter() {
        return (FaceColorAdapter) this.mColorAdapter.getValue();
    }

    private final View getMDividerView() {
        return (View) this.mDividerView.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FaceColorAdapter mColorAdapter_delegate$lambda$1(Context context) {
        Intrinsics.checkNotNullParameter(context, "$context");
        return new FaceColorAdapter(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View mDividerView_delegate$lambda$0(Context context) {
        Intrinsics.checkNotNullParameter(context, "$context");
        return FaceColorPickViewKt.getDivider(context);
    }

    @NotNull
    public final MutableLiveData<String> getColor() {
        RecyclerView.Adapter adapter = this.recyclerView.getAdapter();
        Intrinsics.checkNotNull(adapter, "null cannot be cast to non-null type com.xiaomi.fitness.watch.face.adapter.FaceColorAdapter");
        return ((FaceColorAdapter) adapter).getColor();
    }

    public final void setCurColor(@NotNull String color) {
        Intrinsics.checkNotNullParameter(color, "color");
        getMColorAdapter().setCurColor(color);
    }

    public final void setData(@Nullable String[] data, @Nullable String curColor, boolean showDivider) {
        String string = Arrays.toString(data);
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        Logger.d(TAG, "data: " + string + " curColor: " + curColor + " showDivider: " + showDivider);
        getMDividerView().setVisibility(showDivider ? 0 : 8);
        if (data == null || data.length == 0) {
            ViewExtKt.gone(this.recyclerView);
        } else {
            getMColorAdapter().setData(data);
        }
        if (curColor != null && curColor.length() != 0) {
            setCurColor(curColor);
        }
        this.recyclerView.setAdapter(getMColorAdapter());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public FaceColorPickView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public FaceColorPickView(@NotNull final Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.mDividerView = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: lo8
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FaceColorPickView.mDividerView_delegate$lambda$0(context);
            }
        });
        this.mColorAdapter = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: mo8
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FaceColorPickView.mColorAdapter_delegate$lambda$1(context);
            }
        });
        LayoutInflater.from(context).inflate(ovi.l, (ViewGroup) this, true);
        RecyclerView recyclerView = (RecyclerView) findViewById(isi.O1);
        this.recyclerView = recyclerView;
        recyclerView.addItemDecoration(new gak(DisplayUtil.dip2px(3.0f)));
    }

    public /* synthetic */ FaceColorPickView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
