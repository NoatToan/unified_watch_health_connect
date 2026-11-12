package com.xiaomi.fitness.v2.view;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.extensions.ViewExtKt;
import defpackage.qwb;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u00103\u001a\u000202\u0012\n\b\u0002\u00105\u001a\u0004\u0018\u000104¢\u0006\u0004\b6\u00107J!\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J!\u0010\f\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\b¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001d\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u001a\u0010\u0019J)\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u00162\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\u00052\b\b\u0001\u0010\u001d\u001a\u00020\u0002¢\u0006\u0004\b\u001e\u0010\u0014J\u0017\u0010\u001f\u001a\u00020\u00052\b\b\u0001\u0010\u001d\u001a\u00020\u0002¢\u0006\u0004\b\u001f\u0010\u0014J\u0017\u0010 \u001a\u00020\u00052\b\b\u0001\u0010\u001d\u001a\u00020\u0002¢\u0006\u0004\b \u0010\u0014J\u0015\u0010!\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\b¢\u0006\u0004\b!\u0010\"R\u0014\u0010$\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010'\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010*\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010,\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010+R\u0014\u0010-\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010+R\u0014\u0010/\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u00101\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010+¨\u00068"}, d2 = {"Lcom/xiaomi/fitness/v2/view/HomeCardCommonTitleView;", "Landroid/widget/LinearLayout;", "", "bgRes", "stringRes", "", "updateCardBgAndTitle", "(II)V", "", "emptyContent", "Landroid/view/View$OnClickListener;", "onClickListener", "showEmpty", "(Ljava/lang/CharSequence;Landroid/view/View$OnClickListener;)V", "valueContent", "descContent", "showValueAndDesc", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)V", "imgRes", "updateExpandImg", "(I)V", "charSequence", "", "visible", "updateCardValue", "(Ljava/lang/CharSequence;Z)V", "updateCardDesc", "updateCardEmptyDesc", "(Ljava/lang/CharSequence;ZLandroid/view/View$OnClickListener;)V", "resId", "updateCardIconBackGround", "updateCardIconImage", "updateCardTitle", "updateCardTitleStr", "(Ljava/lang/CharSequence;)V", "Lqwb;", "binding", "Lqwb;", "Landroidx/appcompat/widget/AppCompatImageView;", "ivCardIcon", "Landroidx/appcompat/widget/AppCompatImageView;", "Landroid/widget/TextView;", "tvCardTitle", "Landroid/widget/TextView;", "tvCardDesc", "tvCardEmptyDesc", "Landroid/view/View;", "valueLayout", "Landroid/view/View;", "tvCardValue", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class HomeCardCommonTitleView extends LinearLayout {

    @NotNull
    private final qwb binding;

    @NotNull
    private final AppCompatImageView ivCardIcon;

    @NotNull
    private final TextView tvCardDesc;

    @NotNull
    private final TextView tvCardEmptyDesc;

    @NotNull
    private final TextView tvCardTitle;

    @NotNull
    private final TextView tvCardValue;

    @NotNull
    private final View valueLayout;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public HomeCardCommonTitleView(@NotNull Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static /* synthetic */ void showEmpty$default(HomeCardCommonTitleView homeCardCommonTitleView, CharSequence charSequence, View.OnClickListener onClickListener, int i, Object obj) {
        if ((i & 2) != 0) {
            onClickListener = null;
        }
        homeCardCommonTitleView.showEmpty(charSequence, onClickListener);
    }

    public static /* synthetic */ void updateCardEmptyDesc$default(HomeCardCommonTitleView homeCardCommonTitleView, CharSequence charSequence, boolean z, View.OnClickListener onClickListener, int i, Object obj) {
        if ((i & 4) != 0) {
            onClickListener = null;
        }
        homeCardCommonTitleView.updateCardEmptyDesc(charSequence, z, onClickListener);
    }

    public final void showEmpty(@NotNull CharSequence emptyContent, @Nullable View.OnClickListener onClickListener) {
        Intrinsics.checkNotNullParameter(emptyContent, "emptyContent");
        ViewExtKt.setVisible(this.tvCardDesc, false);
        ViewExtKt.setVisible(this.valueLayout, false);
        ViewExtKt.setVisible(this.tvCardEmptyDesc, true);
        this.tvCardEmptyDesc.setText(emptyContent);
        if (onClickListener != null) {
            this.tvCardEmptyDesc.setOnClickListener(onClickListener);
        }
    }

    public final void showValueAndDesc(@NotNull CharSequence valueContent, @NotNull CharSequence descContent) {
        Intrinsics.checkNotNullParameter(valueContent, "valueContent");
        Intrinsics.checkNotNullParameter(descContent, "descContent");
        ViewExtKt.setVisible(this.tvCardDesc, true);
        ViewExtKt.setVisible(this.valueLayout, true);
        ViewExtKt.setVisible(this.tvCardEmptyDesc, false);
        this.tvCardValue.setText(valueContent);
        this.tvCardDesc.setText(descContent);
    }

    public final void updateCardBgAndTitle(int bgRes, int stringRes) {
        this.ivCardIcon.setBackgroundResource(bgRes);
        this.tvCardTitle.setText(stringRes);
    }

    public final void updateCardDesc(@NotNull CharSequence charSequence, boolean visible) {
        Intrinsics.checkNotNullParameter(charSequence, "charSequence");
        this.tvCardDesc.setText(charSequence);
        ViewExtKt.setVisible(this.tvCardDesc, visible);
    }

    public final void updateCardEmptyDesc(@NotNull CharSequence charSequence, boolean visible, @Nullable View.OnClickListener onClickListener) {
        Intrinsics.checkNotNullParameter(charSequence, "charSequence");
        this.tvCardEmptyDesc.setText(charSequence);
        ViewExtKt.setVisible(this.tvCardEmptyDesc, visible);
        if (onClickListener != null) {
            this.tvCardEmptyDesc.setOnClickListener(onClickListener);
        }
    }

    public final void updateCardIconBackGround(int resId) {
        this.ivCardIcon.setBackgroundResource(resId);
    }

    public final void updateCardIconImage(int resId) {
        this.ivCardIcon.setImageResource(resId);
    }

    public final void updateCardTitle(int resId) {
        this.tvCardTitle.setText(resId);
    }

    public final void updateCardTitleStr(@NotNull CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "charSequence");
        this.tvCardTitle.setText(charSequence);
    }

    public final void updateCardValue(@NotNull CharSequence charSequence, boolean visible) {
        Intrinsics.checkNotNullParameter(charSequence, "charSequence");
        this.tvCardValue.setText(charSequence);
        ViewExtKt.setVisible(this.tvCardValue, visible);
    }

    public final void updateExpandImg(int imgRes) {
        if (imgRes != 0) {
            Drawable resourceDrawable = ResourceExtKt.getResourceDrawable(ApplicationExtKt.getApplication(), imgRes);
            if (resourceDrawable != null) {
                resourceDrawable.setBounds(0, 0, ExtUtilsKt.getDp(15), ExtUtilsKt.getDp(15));
            }
            if (AppUtil.isRTLDirection()) {
                this.tvCardValue.setCompoundDrawables(resourceDrawable, null, null, null);
            } else {
                this.tvCardValue.setCompoundDrawables(null, null, resourceDrawable, null);
            }
        }
    }

    public /* synthetic */ HomeCardCommonTitleView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public HomeCardCommonTitleView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        qwb qwbVarA0 = qwb.A0(LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(qwbVarA0, "inflate(...)");
        this.binding = qwbVarA0;
        AppCompatImageView ivHomeCardIcon = qwbVarA0.B;
        Intrinsics.checkNotNullExpressionValue(ivHomeCardIcon, "ivHomeCardIcon");
        this.ivCardIcon = ivHomeCardIcon;
        TextView tvHomeCardTitle = qwbVarA0.F;
        Intrinsics.checkNotNullExpressionValue(tvHomeCardTitle, "tvHomeCardTitle");
        this.tvCardTitle = tvHomeCardTitle;
        TextView tvHomeCardDesc = qwbVarA0.D;
        Intrinsics.checkNotNullExpressionValue(tvHomeCardDesc, "tvHomeCardDesc");
        this.tvCardDesc = tvHomeCardDesc;
        TextView tvHomeCardEmptyDesc = qwbVarA0.E;
        Intrinsics.checkNotNullExpressionValue(tvHomeCardEmptyDesc, "tvHomeCardEmptyDesc");
        this.tvCardEmptyDesc = tvHomeCardEmptyDesc;
        LinearLayout llValueContent = qwbVarA0.C;
        Intrinsics.checkNotNullExpressionValue(llValueContent, "llValueContent");
        this.valueLayout = llValueContent;
        TextView tvHomeCardValue = qwbVarA0.G;
        Intrinsics.checkNotNullExpressionValue(tvHomeCardValue, "tvHomeCardValue");
        this.tvCardValue = tvHomeCardValue;
    }
}
