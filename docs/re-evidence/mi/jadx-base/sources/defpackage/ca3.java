package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import com.google.android.material.datepicker.MaterialCalendar;

/* JADX INFO: loaded from: classes5.dex */
public final class ca3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w93 f5102a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w93 f5103b;
    public final w93 c;
    public final w93 d;
    public final w93 e;
    public final w93 f;
    public final w93 g;
    public final Paint h;

    public ca3(Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(e8f.d(context, pii.F, MaterialCalendar.class.getCanonicalName()), b4j.r4);
        this.f5102a = w93.a(context, typedArrayObtainStyledAttributes.getResourceId(b4j.u4, 0));
        this.g = w93.a(context, typedArrayObtainStyledAttributes.getResourceId(b4j.s4, 0));
        this.f5103b = w93.a(context, typedArrayObtainStyledAttributes.getResourceId(b4j.t4, 0));
        this.c = w93.a(context, typedArrayObtainStyledAttributes.getResourceId(b4j.v4, 0));
        ColorStateList colorStateListB = k8f.b(context, typedArrayObtainStyledAttributes, b4j.w4);
        this.d = w93.a(context, typedArrayObtainStyledAttributes.getResourceId(b4j.y4, 0));
        this.e = w93.a(context, typedArrayObtainStyledAttributes.getResourceId(b4j.x4, 0));
        this.f = w93.a(context, typedArrayObtainStyledAttributes.getResourceId(b4j.z4, 0));
        Paint paint = new Paint();
        this.h = paint;
        paint.setColor(colorStateListB.getDefaultColor());
        typedArrayObtainStyledAttributes.recycle();
    }
}
