package com.huawei.ui.commonui.marqueetext;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.Layout;
import android.util.AttributeSet;
import android.widget.TextView;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.R;
import defpackage.qoo;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes16.dex */
public class HealthHeadLineMarqueeTextView extends TextView {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f23771b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f23772c;
    private final boolean e;

    public HealthHeadLineMarqueeTextView(Context context) {
        this(context, null);
    }

    public HealthHeadLineMarqueeTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public HealthHeadLineMarqueeTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.HealthHeadLineMarqueeTextView);
        this.f23772c = typedArrayObtainStyledAttributes.getDimension(R.styleable.HealthHeadLineMarqueeTextView_headToTailSpace, 10.0f);
        this.e = typedArrayObtainStyledAttributes.getBoolean(R.styleable.HealthHeadLineMarqueeTextView_isUseHeadToTailSpace, false);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.view.View
    public void invalidate() {
        c();
        super.invalidate();
    }

    private void c() {
        if (this.e && System.currentTimeMillis() - this.f23771b >= 1000) {
            e();
        }
    }

    private void e() {
        Field fieldE;
        Object obj;
        try {
            Class<?> cls = null;
            for (Class<?> cls2 : TextView.class.getDeclaredClasses()) {
                if ("Marquee".equals(cls2.getSimpleName())) {
                    cls = cls2;
                }
            }
            if (cls != null && (fieldE = qoo.e(cls, "mGhostStart", true)) != null) {
                int width = getWidth();
                int compoundPaddingLeft = getCompoundPaddingLeft();
                int compoundPaddingRight = getCompoundPaddingRight();
                Layout layout = getLayout();
                if (layout == null) {
                    return;
                }
                float lineWidth = layout.getLineWidth(0);
                float f = this.f23772c;
                float f2 = (width - compoundPaddingLeft) - compoundPaddingRight;
                float f3 = (lineWidth - f2) + f;
                Field fieldE2 = qoo.e(TextView.class, "mMarquee", true);
                if (fieldE2 != null && (obj = fieldE2.get(this)) != null) {
                    this.f23771b = System.currentTimeMillis();
                    if (Math.abs(((Float) fieldE.get(obj)).floatValue() - f3) > 1.0E-6f) {
                        Field fieldE3 = qoo.e(cls, "mMaxScroll", true);
                        Field fieldE4 = qoo.e(cls, "mGhostOffset", true);
                        Field fieldE5 = qoo.e(cls, "mMaxFadeScroll", true);
                        if (fieldE3 != null && fieldE4 != null && fieldE5 != null) {
                            fieldE.set(obj, Float.valueOf(f3));
                            fieldE3.set(obj, Float.valueOf(f2 + f3));
                            fieldE4.set(obj, Float.valueOf(f + lineWidth));
                            fieldE5.set(obj, Float.valueOf(f3 + lineWidth + lineWidth));
                        }
                    }
                }
            }
        } catch (IllegalAccessException e) {
            LogUtil.e("HealthHeadLineMarqueeTextView", "IllegalAccessException: ", ExceptionUtils.c(e));
        }
    }
}
