package com.huami.pai.view;

import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.pai.view.PAINumberRunningTextView;
import com.huami.tools.analytics.DbUtils;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0006¢\u0006\u0004\b\u0017\u0010\u0018J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\"\u0010\r\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\"\u0010\u0011\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\b\u001a\u0004\b\u000f\u0010\n\"\u0004\b\u0010\u0010\f¨\u0006\u0019"}, d2 = {"Lcom/huami/pai/view/PAINumberRunningTextView;", "Landroidx/appcompat/widget/AppCompatTextView;", "", "numStr", "", "playNumAnim", "", "a", LogUtil.I, "getDuration", "()I", "setDuration", "(I)V", "duration", "b", "getMinNum", "setMinNum", "minNum", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "lib_release"}, k = 1, mv = {1, 5, 1})
public final class PAINumberRunningTextView extends AppCompatTextView {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private int duration;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private int minNum;

    @JvmOverloads
    public PAINumberRunningTextView(@NotNull Context context) {
        this(context, null, 0, 6, null);
    }

    @JvmOverloads
    public PAINumberRunningTextView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ PAINumberRunningTextView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? R.attr.textViewStyle : i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(PAINumberRunningTextView pAINumberRunningTextView, ValueAnimator valueAnimator) {
        Object animatedValue = valueAnimator.getAnimatedValue();
        Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        pAINumberRunningTextView.setText(String.valueOf(((Integer) animatedValue).intValue()));
    }

    public final int getDuration() {
        return this.duration;
    }

    public final int getMinNum() {
        return this.minNum;
    }

    public final void playNumAnim(@NotNull String numStr) {
        try {
            int i = Integer.parseInt(numStr);
            if (i < this.minNum) {
                setText(numStr);
                return;
            }
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, i);
            valueAnimatorOfInt.setDuration(this.duration);
            valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: un5
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    PAINumberRunningTextView.b(this.a, valueAnimator);
                }
            });
            valueAnimatorOfInt.start();
        } catch (NumberFormatException e) {
            e.printStackTrace();
            setText(numStr);
        }
    }

    public final void setDuration(int i) {
        this.duration = i;
    }

    public final void setMinNum(int i) {
        this.minNum = i;
    }

    @JvmOverloads
    public PAINumberRunningTextView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.duration = 800;
        this.minNum = 1;
    }
}
