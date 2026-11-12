package com.huami.module.homepage.cards.cardui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import com.huami.module.homepage.R;
import com.huami.module.ktx.GlobalFunctionKt;
import com.huami.module.ktx.I18nKt;
import com.huami.tools.analytics.DbUtils;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\r\u001a\u00020\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\b¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0002J,\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b¨\u0006\u0013"}, d2 = {"Lcom/huami/module/homepage/cards/cardui/I18nNumberView;", "Landroidx/appcompat/widget/AppCompatTextView;", "", "number", "unit", "a", "", "floatType", "", "precision", "", "setNumberAndUnit", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "homePage_release"}, k = 1, mv = {1, 5, 1})
public final class I18nNumberView extends AppCompatTextView {
    @JvmOverloads
    public I18nNumberView(@NotNull Context context) {
        this(context, null, 0, 6, null);
    }

    @JvmOverloads
    public I18nNumberView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ I18nNumberView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    private final String a(String number, String unit) {
        StringBuilder sb;
        if (GlobalFunctionKt.isRtl()) {
            sb = new StringBuilder();
            sb.append(unit);
            sb.append(number);
        } else {
            sb = new StringBuilder();
            sb.append(number);
            sb.append(unit);
        }
        return sb.toString();
    }

    public static /* synthetic */ void setNumberAndUnit$default(I18nNumberView i18nNumberView, String str, String str2, boolean z, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            str2 = "";
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        if ((i2 & 8) != 0) {
            i = 1;
        }
        i18nNumberView.setNumberAndUnit(str, str2, z, i);
    }

    public final void setNumberAndUnit(@NotNull String number, @NotNull String unit, boolean floatType, int precision) {
        try {
            number = floatType ? I18nKt.i18n(Float.parseFloat(number), precision) : I18nKt.i18n(Integer.parseInt(number));
        } catch (Exception unused) {
        }
        setText(a(number, unit));
    }

    @JvmOverloads
    public I18nNumberView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.I18nNumberView);
        String string = typedArrayObtainStyledAttributes.getString(R.styleable.I18nNumberView_numberText);
        string = string == null ? "" : string;
        String string2 = typedArrayObtainStyledAttributes.getString(R.styleable.I18nNumberView_unitText);
        setNumberAndUnit(string, string2 != null ? string2 : "", typedArrayObtainStyledAttributes.getBoolean(R.styleable.I18nNumberView_floatType, false), typedArrayObtainStyledAttributes.getInt(R.styleable.I18nNumberView_precision, 1));
        typedArrayObtainStyledAttributes.recycle();
    }
}
