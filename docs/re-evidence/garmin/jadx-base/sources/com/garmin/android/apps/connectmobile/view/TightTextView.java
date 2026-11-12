package com.garmin.android.apps.connectmobile.view;

import android.content.Context;
import android.text.Layout;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import ch.qos.logback.core.CoreConstants;
import j23.k;
import j23.l;
import j23.t;
import java.util.ArrayList;
import java.util.Iterator;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p13.h0;
import p13.p0;
import p13.y;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/garmin/android/apps/connectmobile/view/TightTextView;", "Landroidx/appcompat/widget/AppCompatTextView;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/util/AttributeSet;", "attrs", "", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "gcm-common-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class TightTextView extends AppCompatTextView {
    public /* synthetic */ TightTextView(Context context, AttributeSet attributeSet, int i14, int i15, j jVar) {
        this(context, (i15 & 2) != 0 ? null : attributeSet, (i15 & 4) != 0 ? 0 : i14);
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public final void onMeasure(int i14, int i15) {
        super.onMeasure(i14, i15);
        if (getLayout() != null) {
            Layout layout = getLayout();
            layout.getClass();
            l lVarO = t.o(0, layout.getLineCount());
            ArrayList arrayList = new ArrayList(y.r(lVarO, 10));
            Iterator<Integer> it = lVarO.iterator();
            while (((k) it).getF96801c()) {
                arrayList.add(Float.valueOf(layout.getLineMax(((p0) it).nextInt())));
            }
            Float fQ0 = h0.q0(arrayList);
            int compoundPaddingRight = getCompoundPaddingRight() + getCompoundPaddingLeft() + ((int) Math.ceil(fQ0 != null ? fQ0.floatValue() : 0.0f));
            if (compoundPaddingRight < getMeasuredWidth()) {
                setMeasuredDimension(compoundPaddingRight, getMeasuredHeight());
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TightTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TightTextView(Context context, AttributeSet attributeSet, int i14) {
        super(context, attributeSet, i14);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TightTextView(Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }
}
