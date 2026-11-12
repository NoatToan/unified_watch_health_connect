package com.huami.healthlabel.ui.custom;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import androidx.annotation.ColorRes;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.exoplayer2.text.ttml.b;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.healthlabel.R;
import com.huami.healthlabel.ui.custom.LabelTextView;
import com.huami.healthlabel.utils.UtilsKt;
import com.huami.healthlabel.utils.ext.NumberExtKt;
import com.huami.healthlabel.utils.ext.ViewExtKt;
import com.huami.tools.analytics.DbUtils;
import com.huami.watch.notification.TransportUri;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u00102\u001a\u000201¢\u0006\u0004\b3\u00104B\u001b\b\u0016\u0012\u0006\u00102\u001a\u000201\u0012\b\u00106\u001a\u0004\u0018\u000105¢\u0006\u0004\b3\u00107B#\b\u0016\u0012\u0006\u00102\u001a\u000201\u0012\b\u00106\u001a\u0004\u0018\u000105\u0012\u0006\u00108\u001a\u00020\u0002¢\u0006\u0004\b3\u00109J\u0012\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H\u0002J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0016J\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0002H\u0016J\u0010\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0002H\u0016J\u0012\u0010\u0011\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016J\u0010\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0017J\u000e\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0014J\u0014\u0010\u001a\u001a\u00020\u00042\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00040\u0018J\u0014\u0010\u001b\u001a\u00020\u00042\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00040\u0018J&\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002R\u0016\u0010\"\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010%\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010'\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010&R\u0016\u0010+\u001a\u00020(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0018\u0010/\u001a\u0004\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u0010$¨\u0006:"}, d2 = {"Lcom/huami/healthlabel/ui/custom/LabelTextView;", "Landroidx/appcompat/widget/AppCompatTextView;", "", b.H, "", "c", "count", "setCount", "", "size", "setTextSize", "pixels", "setHeight", "color", "setBackgroundColor", "Landroid/graphics/drawable/Drawable;", "background", "setBackground", "Landroid/view/MotionEvent;", "event", "", "onTouchEvent", "canClick", "setEnableClick", "Lkotlin/Function0;", TransportUri.ACTION_BLOCK, "click", "longClick", "", "txt", "textColor", "setTextWithCount", "a", "Z", "shouldNotIntercept", "b", LogUtil.I, "clickCount", "Ljava/lang/CharSequence;", "content", "", GoogleApiAvailabilityLight.a, "J", "clickTime", "Lcom/huami/healthlabel/ui/custom/LabelAnimation;", "e", "Lcom/huami/healthlabel/ui/custom/LabelAnimation;", "labelAnimation", "f", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "healthLabel_release"}, k = 1, mv = {1, 5, 1})
public final class LabelTextView extends AppCompatTextView {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private boolean shouldNotIntercept;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private int clickCount;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private CharSequence content;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private long clickTime;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    private LabelAnimation labelAnimation;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private int backgroundColor;

    public LabelTextView(@NotNull Context context) {
        this(context, null);
    }

    private final void c(@ColorRes int backgroundColor) {
        ViewExtKt.setShape(this, Integer.valueOf(ContextCompat.getColor(getContext(), backgroundColor)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(LabelTextView labelTextView, Function0 function0, View view) {
        if (System.currentTimeMillis() - labelTextView.clickTime <= 250) {
            UtilsKt.toast(R.string.health_label_click_too_quick);
            return;
        }
        labelTextView.clickTime = System.currentTimeMillis();
        labelTextView.setTextColor(-1);
        function0.invoke();
        if (labelTextView.clickCount < 100) {
            StringBuilder sb = new StringBuilder();
            sb.append(labelTextView.content);
            sb.append(" +");
            int i = labelTextView.clickCount;
            if (i == 0) {
                i = 1;
            }
            sb.append(i);
            labelTextView.setText(sb);
        }
        if (labelTextView.labelAnimation == null) {
            labelTextView.labelAnimation = new LabelAnimation();
        }
        labelTextView.labelAnimation.playAnimation(labelTextView.getContext(), labelTextView);
        labelTextView.startAnimation(AnimationUtils.loadAnimation(labelTextView.getContext(), R.anim.label_scale));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean e(Function0 function0, View view) {
        function0.invoke();
        return true;
    }

    public final void click(@NotNull final Function0<Unit> block) {
        setOnClickListener(new View.OnClickListener() { // from class: ql4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LabelTextView.d(this.a, block, view);
            }
        });
    }

    public final void longClick(@NotNull final Function0<Unit> block) {
        setOnLongClickListener(new View.OnLongClickListener() { // from class: rl4
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return LabelTextView.e(block, view);
            }
        });
    }

    @Override // android.widget.TextView, android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(@NotNull MotionEvent event) {
        if (this.shouldNotIntercept) {
            return super.onTouchEvent(event);
        }
        if (event.getAction() != 1) {
            return true;
        }
        Function0<Unit> labelTextViewListener = LabelTextViewKt.getLabelTextViewListener();
        if (labelTextViewListener != null) {
            labelTextViewListener.invoke();
        }
        return false;
    }

    @Override // android.view.View
    public void setBackground(@Nullable Drawable background) {
        super.setBackground(background);
        setPadding(NumberExtKt.dp(16), NumberExtKt.dp(7), NumberExtKt.dp(16), NumberExtKt.dp(7));
        try {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams");
            }
            ((RecyclerView.LayoutParams) layoutParams).setMargins(NumberExtKt.dp(5.0f), NumberExtKt.dp(7.5f), NumberExtKt.dp(5.0f), NumberExtKt.dp(7.5f));
        } catch (Exception unused) {
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int color) {
        ViewExtKt.setShape(this, Integer.valueOf(color));
    }

    public final void setCount(int count) {
        this.clickCount = count;
    }

    public final void setEnableClick(boolean canClick) {
        this.shouldNotIntercept = canClick;
    }

    @Override // android.widget.TextView
    public void setHeight(int pixels) {
        super.setHeight(NumberExtKt.dp(35));
    }

    @Override // android.widget.TextView
    public void setTextSize(float size) {
        super.setTextSize(NumberExtKt.sp(15));
    }

    public final void setTextWithCount(@NotNull CharSequence txt, int count, int textColor, int backgroundColor) {
        this.backgroundColor = backgroundColor;
        this.content = txt;
        setTextColor(textColor);
        if (count == 0) {
            setText(txt);
            c(R.color.OF9DA3BA);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(txt);
        sb.append(" +");
        if (count > 99) {
            count = 99;
        }
        sb.append(count);
        setText(sb);
        ViewExtKt.setShape(this, Integer.valueOf(backgroundColor));
    }

    public LabelTextView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public LabelTextView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.content = "";
        this.clickTime = System.currentTimeMillis();
        this.backgroundColor = ContextCompat.getColor(getContext(), R.color.OF9DA3BA);
        int i2 = 0;
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R.styleable.LabelTextView, i, 0);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        if (indexCount > 0) {
            while (true) {
                int i3 = i2 + 1;
                int index = typedArrayObtainStyledAttributes.getIndex(i2);
                if (index == R.styleable.LabelTextView_backgroundColor) {
                    ViewExtKt.setShape(this, Integer.valueOf(typedArrayObtainStyledAttributes.getColor(index, this.backgroundColor)));
                    break;
                } else if (i3 >= indexCount) {
                    break;
                } else {
                    i2 = i3;
                }
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
