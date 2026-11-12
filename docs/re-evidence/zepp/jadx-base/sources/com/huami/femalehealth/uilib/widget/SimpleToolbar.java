package com.huami.femalehealth.uilib.widget;

import android.content.Context;
import android.graphics.Color;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.alipay.sdk.m.x.d;
import com.huami.femalehealth.uilib.R;
import com.huami.femalehealth.uilib.helper.ResourceHelper;
import com.huami.femalehealth.uilib.widget.SimpleToolbar;
import com.huami.tools.analytics.DbUtils;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 !2\u00020\u0001:\u0001!B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u001a\u0010\u001bB\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b\u001a\u0010\u001eB#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\u0006\u0010\u001f\u001a\u00020\n¢\u0006\u0004\b\u001a\u0010 J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\u0012\u0010\u0006\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\u000e\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0016J\"\u0010\u000f\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\u00072\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\rJ\u0016\u0010\u0010\u001a\u00020\u00042\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\rR\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0017¨\u0006\""}, d2 = {"Lcom/huami/femalehealth/uilib/widget/SimpleToolbar;", "Landroidx/appcompat/widget/Toolbar;", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "c", "setUp", "", "title", d.o, "", "resId", "text", "Lkotlin/Function0;", "onClick", "setRightTextDefaultSetting", "setLeftFinish", "Landroid/widget/ImageView;", "a", "Landroid/widget/ImageView;", "leftImgView", "Landroid/widget/TextView;", "b", "Landroid/widget/TextView;", "centerTextView", "rightTextView", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Companion", "uilib_release"}, k = 1, mv = {1, 5, 1})
public final class SimpleToolbar extends Toolbar {
    private static final float e = 17.0f;
    private static final float f = 15.0f;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private ImageView leftImgView;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private TextView centerTextView;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private TextView rightTextView;
    private static final int d = (int) ResourceHelper.INSTANCE.dp2px(29.0f);
    private static final int g = Color.parseColor("#ff333333");

    public SimpleToolbar(@NotNull Context context) {
        this(context, null);
    }

    private final void c(Context context) {
        if (context == null) {
            return;
        }
        RelativeLayout relativeLayout = new RelativeLayout(context);
        relativeLayout.setGravity(16);
        ImageView imageView = new ImageView(context);
        int i = d;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(i, i);
        layoutParams.setMarginStart((int) ExtKt.dpToPx(imageView, 20.0f));
        layoutParams.addRule(15);
        imageView.setVisibility(4);
        relativeLayout.addView(imageView, layoutParams);
        ExtKt.increaseClickRange(imageView, 50);
        imageView.setImageResource(R.drawable.fh_icon_finish);
        Unit unit = Unit.INSTANCE;
        this.leftImgView = imageView;
        TextView textView = new TextView(context);
        textView.setGravity(17);
        textView.setTextSize(2, e);
        int i2 = g;
        textView.setTextColor(i2);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, i);
        layoutParams2.addRule(13);
        relativeLayout.addView(textView, layoutParams2);
        this.centerTextView = textView;
        TextView textView2 = new TextView(context);
        textView2.setTextSize(2, 15.0f);
        textView2.setGravity(17);
        textView2.setTextColor(i2);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -1);
        layoutParams3.setMarginEnd((int) ExtKt.dpToPx(textView2, 10.0f));
        layoutParams3.addRule(21);
        layoutParams3.addRule(15);
        ExtKt.increaseClickRange(textView2, 50);
        relativeLayout.addView(textView2, layoutParams3);
        this.rightTextView = textView2;
        addView(relativeLayout, new Toolbar.LayoutParams(-1, -1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(Function0 function0, View view) {
        if (function0 == null) {
            return;
        }
        function0.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(Function0 function0, View view) {
        if (function0 == null) {
            return;
        }
        function0.invoke();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void setRightTextDefaultSetting$default(SimpleToolbar simpleToolbar, String str, Function0 function0, int i, Object obj) {
        if ((i & 1) != 0) {
            str = ResourceHelper.INSTANCE.getString(R.string.fh_setting);
        }
        if ((i & 2) != 0) {
            function0 = null;
        }
        simpleToolbar.setRightTextDefaultSetting(str, function0);
    }

    private final void setUp(Context context) {
        if (context == null) {
            return;
        }
        setPadding(getPaddingLeft(), getPaddingTop() + (Build.VERSION.SDK_INT >= 19 ? ExtKt.getStatusBarHeight(context.getResources()) : 0), getPaddingRight(), getPaddingBottom());
    }

    public void _$_clearFindViewByIdCache() {
    }

    public final void setLeftFinish(@Nullable final Function0<Unit> onClick) {
        ImageView imageView = this.leftImgView;
        if (imageView == null) {
            return;
        }
        ExtKt.setVisible(imageView, onClick != null, false);
        imageView.setOnClickListener(new View.OnClickListener() { // from class: lu6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SimpleToolbar.d(onClick, view);
            }
        });
    }

    public final void setRightTextDefaultSetting(@NotNull String text, @Nullable final Function0<Unit> onClick) {
        TextView textView = this.rightTextView;
        if (textView == null) {
            return;
        }
        textView.setText(text);
        textView.setOnClickListener(new View.OnClickListener() { // from class: mu6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SimpleToolbar.e(onClick, view);
            }
        });
    }

    public final void setTitle(@NotNull String title) {
        TextView textView = this.centerTextView;
        if (textView == null) {
            return;
        }
        textView.setText(title);
    }

    public SimpleToolbar(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setTitle(int resId) {
        setTitle(getContext().getString(resId));
    }

    public SimpleToolbar(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setBackgroundColor(-1);
        c(context);
    }
}
