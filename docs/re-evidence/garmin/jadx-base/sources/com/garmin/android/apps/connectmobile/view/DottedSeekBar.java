package com.garmin.android.apps.connectmobile.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import androidx.appcompat.widget.t;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p13.h0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u000eB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\f\u001a\u00020\u000b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lcom/garmin/android/apps/connectmobile/view/DottedSeekBar;", "Landroidx/appcompat/widget/t;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/util/AttributeSet;", "attrSet", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "", "positions", "", "setDotPositions", "(Ljava/util/List;)V", "a", "gcm-common-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class DottedSeekBar extends t {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f47397b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Paint f47398c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f47399d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f47400e;

    static {
        new a(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DottedSeekBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        attributeSet.getClass();
        this.f47397b = new ArrayList();
        Paint paint = new Paint();
        this.f47398c = paint;
        paint.setColor(a7.b.getColor(context, R.color.gcm_icon_secondary));
    }

    @Override // androidx.appcompat.widget.t, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.getClass();
        super.onDraw(canvas);
        Iterator it = this.f47397b.iterator();
        while (it.hasNext()) {
            float fIntValue = (((Number) it.next()).intValue() * this.f47399d) + (getThumb().getIntrinsicWidth() * 0.625f);
            float f14 = this.f47400e;
            canvas.drawOval(fIntValue - 3.0f, f14 - 3.0f, fIntValue + 3.0f, f14 + 3.0f, this.f47398c);
        }
        if (getThumb() != null) {
            int iSave = canvas.save();
            canvas.translate(getPaddingStart() - getThumbOffset(), getPaddingTop());
            getThumb().draw(canvas);
            canvas.restoreToCount(iSave);
        }
    }

    @Override // android.view.View
    public final void onLayout(boolean z14, int i14, int i15, int i16, int i17) {
        super.onLayout(z14, i14, i15, i16, i17);
        this.f47399d = (getMeasuredWidth() - (getThumb().getIntrinsicWidth() * 1.25f)) / getMax();
        this.f47400e = getMeasuredHeight() / 2.0f;
    }

    public final void setDotPositions(List<Integer> positions) {
        positions.getClass();
        ArrayList arrayList = this.f47397b;
        arrayList.clear();
        arrayList.addAll(h0.M0(positions));
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/view/DottedSeekBar$a;", "", "<init>", "()V", "", "THUMB_WIDTH_MULTIPLIER", "F", "DOT_RADIUS", "gcm-common-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
