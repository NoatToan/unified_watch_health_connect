package com.garmin.androiddynamicsettings.app.baseviews.views;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatEditText;
import ch.qos.logback.core.CoreConstants;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import zh2.e;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/garmin/androiddynamicsettings/app/baseviews/views/StyledEditText;", "Landroidx/appcompat/widget/AppCompatEditText;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Landroid/graphics/Typeface;", "tf", "", "setTypeface", "(Landroid/graphics/Typeface;)V", "androiddynamicsettings_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class StyledEditText extends AppCompatEditText {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StyledEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        if (isInEditMode() || isInEditMode()) {
            return;
        }
        e.f204807a.getClass();
        setTypeface(e.f204812f.f204821h);
    }

    @Override // androidx.appcompat.widget.AppCompatEditText, android.widget.TextView
    public final void setTextAppearance(Context context, int i14) {
        context.getClass();
        super.setTextAppearance(context, i14);
        if (isInEditMode()) {
            return;
        }
        e.f204807a.getClass();
        setTypeface(e.f204812f.f204821h);
    }

    @Override // android.widget.TextView
    public void setTypeface(Typeface tf3) {
        e.f204807a.getClass();
        Typeface typeface = e.f204812f.f204821h;
        if (typeface != null) {
            tf3 = typeface;
        }
        super.setTypeface(tf3);
    }

    public /* synthetic */ StyledEditText(Context context, AttributeSet attributeSet, int i14, j jVar) {
        this(context, (i14 & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public StyledEditText(Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        context.getClass();
    }
}
