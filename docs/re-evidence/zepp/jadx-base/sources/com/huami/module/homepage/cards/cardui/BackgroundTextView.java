package com.huami.module.homepage.cards.cardui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import com.huami.module.homepage.R;
import com.huami.module.ktx.NumberExtKt;
import com.huami.module.ktx.ViewExtKt;
import com.huami.tools.analytics.DbUtils;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005B'\b\u0007\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u000f\u001a\u00020\b¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\"\u0010\f\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n¨\u0006\u0012"}, d2 = {"Lcom/huami/module/homepage/cards/cardui/BackgroundTextView;", "Landroidx/appcompat/widget/AppCompatTextView;", "Landroid/util/AttributeSet;", "attrs", "", "a", "Lcom/huami/module/homepage/cards/cardui/CornerDirection;", "direction", "", "backgroundTintColor", "", "backgroundTintAlpha", "setBackgroundCornerDirection", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "homePage_release"}, k = 1, mv = {1, 5, 1})
public final class BackgroundTextView extends AppCompatTextView {

    @Deprecated
    public static final float CORNER_RADIUS = 6.0f;

    @NotNull
    private static final a a = new a(null);

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CornerDirection.values().length];
            iArr[CornerDirection.ALL.ordinal()] = 1;
            iArr[CornerDirection.LEFT.ordinal()] = 2;
            iArr[CornerDirection.RIGHT.ordinal()] = 3;
            iArr[CornerDirection.BOTTOM.ordinal()] = 4;
            iArr[CornerDirection.TOP.ordinal()] = 5;
            iArr[CornerDirection.NONE.ordinal()] = 6;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"com/huami/module/homepage/cards/cardui/BackgroundTextView$a", "", "", "CORNER_RADIUS", "F", "<init>", "()V", "homePage_release"}, k = 1, mv = {1, 5, 1})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @JvmOverloads
    public BackgroundTextView(@NotNull Context context) {
        this(context, null, 0, 6, null);
    }

    @JvmOverloads
    public BackgroundTextView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ BackgroundTextView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    private final void a(AttributeSet attrs) {
        CornerDirection cornerDirection;
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attrs, R.styleable.BackgroundTextView);
        int i = typedArrayObtainStyledAttributes.getInt(R.styleable.BackgroundTextView_cornerDirection, 0);
        if (i == 1) {
            cornerDirection = CornerDirection.TOP;
        } else if (i == 2) {
            cornerDirection = CornerDirection.LEFT;
        } else if (i != 3) {
            cornerDirection = i != 4 ? CornerDirection.ALL : CornerDirection.RIGHT;
        } else {
            cornerDirection = CornerDirection.BOTTOM;
        }
        float f = typedArrayObtainStyledAttributes.getFloat(R.styleable.BackgroundTextView_backgroundTintAlpha, -1.0f);
        int color = typedArrayObtainStyledAttributes.getColor(R.styleable.BackgroundTextView_backgroundTintColor, ViewExtKt.loadColor(this, R.color.s38));
        typedArrayObtainStyledAttributes.recycle();
        setBackgroundCornerDirection(cornerDirection, color, f);
    }

    public static /* synthetic */ void setBackgroundCornerDirection$default(BackgroundTextView backgroundTextView, CornerDirection cornerDirection, int i, double d, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = ViewExtKt.loadColor(backgroundTextView, R.color.s38);
        }
        if ((i2 & 4) != 0) {
            d = 0.85d;
        }
        backgroundTextView.setBackgroundCornerDirection(cornerDirection, i, d);
    }

    public final void setBackgroundCornerDirection(@NotNull CornerDirection direction, int backgroundTintColor, double backgroundTintAlpha) {
        int iAddAlpha = backgroundTintAlpha >= 0.0d ? NumberExtKt.addAlpha(backgroundTintColor, backgroundTintAlpha) : backgroundTintColor;
        switch (WhenMappings.$EnumSwitchMapping$0[direction.ordinal()]) {
            case 1:
                ViewExtKt.setShape(this, 6.0f, Integer.valueOf(iAddAlpha));
                break;
            case 2:
                ViewExtKt.setShape(this, 6.0f, 0.0f, 0.0f, 6.0f, Integer.valueOf(iAddAlpha));
                break;
            case 3:
                ViewExtKt.setShape(this, 0.0f, 6.0f, 6.0f, 0.0f, Integer.valueOf(iAddAlpha));
                break;
            case 4:
                ViewExtKt.setShape(this, 0.0f, 0.0f, 6.0f, 6.0f, Integer.valueOf(iAddAlpha));
                break;
            case 5:
                ViewExtKt.setShape(this, 6.0f, 6.0f, 0.0f, 0.0f, Integer.valueOf(iAddAlpha));
                break;
            case 6:
                setBackgroundColor(0);
                break;
        }
    }

    @JvmOverloads
    public BackgroundTextView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a(attributeSet);
    }
}
