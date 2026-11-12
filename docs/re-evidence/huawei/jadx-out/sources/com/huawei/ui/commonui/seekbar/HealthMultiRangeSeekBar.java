package com.huawei.ui.commonui.seekbar;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import com.huawei.ui.commonui.R;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.uikit.phone.hwseekbar.widget.HwSeekBar;
import defpackage.njy;
import defpackage.qrs;
import defpackage.xfs;
import health.compact.a.UnitUtil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes43.dex */
public class HealthMultiRangeSeekBar extends HwSeekBar {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int[] f23881b = {R.color.emuiColor2, R.color.emuiColor4, R.color.emuiColor11, R.color.emuiColor9, R.color.emuiColor8};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f23882a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f23883c;
    private int d;
    private int e;
    private List<OnSeekChangeListener> f;
    private PopupWindow g;
    private boolean h;
    private float i;
    private float j;
    private int k;
    private int l;
    private int m;
    private HealthTextView n;
    private int o;
    private float p;
    private float q;
    private Bitmap r;
    private int s;
    private List<Float> t;

    public interface OnSeekChangeListener {
        void onSeek(int i, float f);
    }

    public HealthMultiRangeSeekBar(Context context) {
        this(context, null);
    }

    public HealthMultiRangeSeekBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.healthMultiRangeSeekBarStyle);
    }

    public HealthMultiRangeSeekBar(Context context, AttributeSet attributeSet, int i) {
        super(b(context, i), attributeSet, i);
        this.o = 30;
        this.e = 100;
        this.s = 50;
        this.f23883c = -1;
        b(context, attributeSet, i);
        c();
    }

    private static Context b(Context context, int i) {
        return xfs.c(context, i, R.style.Theme_Emui_HealthMultiRangeSeekBar);
    }

    private void b() {
        HealthTextView healthTextView = new HealthTextView(getContext());
        this.n = healthTextView;
        healthTextView.setTextColor(-1);
        this.n.setTextSize(1, 13.0f);
        this.n.setTypeface(Typeface.SANS_SERIF);
        this.n.setBackgroundResource(R.drawable.hwseekbar_selector_tip_bubble_emui);
        this.n.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        this.n.setGravity(17);
        this.n.setSingleLine(true);
        PopupWindow popupWindow = new PopupWindow((View) this.n, -2, -2, false);
        this.g = popupWindow;
        popupWindow.setAnimationStyle(com.huawei.uikit.hwseekbar.R.style.Animation_Emui_HwSeekBar_TipsPopupWindow);
    }

    private void a() {
        if (this.f23882a) {
            this.g.showAsDropDown(this, 0, 0, 3);
            i();
        }
    }

    private void g() {
        this.n.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        this.k = this.n.getMeasuredWidth();
        this.m = this.n.getMeasuredHeight();
    }

    private void i() {
        if (njy.e(this.t, this.f23883c)) {
            return;
        }
        this.n.setText(UnitUtil.e(this.t.get(this.f23883c).floatValue(), 1, 0));
        g();
        float fD = d(this.t.get(this.f23883c).floatValue());
        if (isLayoutRtl()) {
            fD = getWidth() - fD;
        }
        float f = this.k / 2.0f;
        float f2 = -this.i;
        float f3 = this.m;
        float paddingBottom = getPaddingBottom();
        this.g.update(this, (int) (fD - f), (int) ((((f2 - f3) - paddingBottom) - this.p) - qrs.d(getContext(), 2.0f)), this.k, this.m);
    }

    private void h() {
        if (this.f23882a) {
            this.g.dismiss();
        }
    }

    private void c() {
        Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(getResources(), R.mipmap.seekbar_btn_drag);
        this.r = bitmapDecodeResource;
        this.p = bitmapDecodeResource.getWidth() / 2.0f;
        this.l = qrs.d(getContext(), 4.0f);
        this.d = getResources().getDimensionPixelSize(R.dimen.health_multirange_seekbar_bar_height) / 2;
        this.q = this.p - qrs.d(getContext(), 1.0f);
        this.f = new ArrayList(1);
        this.t = new ArrayList(5);
        for (int i = 0; i < 5; i++) {
            this.t.add(Float.valueOf(this.s + (i * 10)));
        }
    }

    private void b(Context context, AttributeSet attributeSet, int i) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.HealthMultiRangeSeekBar, i, R.style.Widget_Emui_HealthMultiRangeSeekBar);
        this.o = typedArrayObtainStyledAttributes.getInt(R.styleable.HealthMultiRangeSeekBar_startScale, this.o);
        this.e = typedArrayObtainStyledAttributes.getInt(R.styleable.HealthMultiRangeSeekBar_endScale, this.e);
        this.f23882a = typedArrayObtainStyledAttributes.getBoolean(R.styleable.HealthMultiRangeSeekBar_showPopTip, false);
        this.h = typedArrayObtainStyledAttributes.getBoolean(R.styleable.HealthMultiRangeSeekBar_showThumbs, false);
        typedArrayObtainStyledAttributes.recycle();
        if (this.f23882a) {
            b();
        }
    }

    @Override // com.huawei.uikit.hwseekbar.widget.HwSeekBar, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public void onDraw(Canvas canvas) {
        synchronized (this) {
            d(canvas);
            e(canvas);
            a(canvas);
            if (this.h) {
                g(canvas);
            }
        }
    }

    void d(Canvas canvas) {
        Drawable progressDrawable = getProgressDrawable();
        if (progressDrawable == null || canvas == null) {
            return;
        }
        int iSave = canvas.save();
        if (isLayoutRtl()) {
            canvas.translate(getWidth() - getPaddingRight(), getPaddingTop());
            canvas.scale(-1.0f, 1.0f);
        } else {
            canvas.translate(getPaddingLeft(), getPaddingTop());
        }
        progressDrawable.draw(canvas);
        canvas.restoreToCount(iSave);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        int i5 = this.e - this.o;
        if (i5 > 0) {
            this.j = (((getWidth() - getPaddingStart()) - getPaddingEnd()) - this.q) / i5;
        }
        this.i = ((getHeight() - getPaddingTop()) - getPaddingBottom()) / 2.0f;
    }

    private void a(Canvas canvas) {
        float fD;
        float fD2;
        int iSave = canvas.save();
        canvas.translate(0.0f, getPaddingTop() + this.i);
        if (!this.t.isEmpty() && this.t.size() > 1) {
            int i = this.d;
            float f = -i;
            float f2 = i;
            Paint paint = new Paint();
            Path path = new Path();
            RectF rectF = new RectF();
            for (int i2 = 0; i2 < this.t.size(); i2++) {
                if (i2 == this.t.size() - 1) {
                    List<Float> list = this.t;
                    fD = d(list.get(list.size() - 1).floatValue());
                    fD2 = getWidth() - getPaddingEnd();
                } else {
                    fD = d(this.t.get(i2).floatValue());
                    fD2 = d(this.t.get(i2 + 1).floatValue());
                }
                int width = getWidth() - getPaddingEnd();
                if (isLayoutRtl()) {
                    fD = getWidth() - fD;
                    fD2 = getWidth() - fD2;
                    width = getWidth() - width;
                }
                rectF.set(fD, f, fD2, f2);
                paint.setColor(getResources().getColor(g(i2)));
                if (width == ((int) fD2)) {
                    path.addRect(rectF, Path.Direction.CW);
                    break;
                }
                canvas.drawRect(rectF, paint);
            }
            a(canvas, path, rectF, paint);
        }
        canvas.restoreToCount(iSave);
    }

    private void a(Canvas canvas, Path path, RectF rectF, Paint paint) {
        Path path2 = new Path();
        float paddingStart = getPaddingStart();
        float width = getWidth() - getPaddingEnd();
        if (isLayoutRtl()) {
            paddingStart = getWidth() - paddingStart;
            width = getWidth() - width;
        }
        int i = this.d;
        rectF.set(paddingStart, -i, width, i);
        float fD = qrs.d(getContext(), this.d);
        path2.addRoundRect(rectF, fD, fD, Path.Direction.CW);
        path2.op(path, Path.Op.INTERSECT);
        canvas.drawPath(path2, paint);
    }

    private int g(int i) {
        if (i < 0 || i >= 5) {
            return 0;
        }
        return f23881b[i];
    }

    private void e(Canvas canvas) {
        float fB;
        HealthMultiRangeSeekBar healthMultiRangeSeekBar = this;
        Paint paint = new Paint();
        paint.setColor(getContext().getResources().getColor(R.color.listDivider));
        paint.setAntiAlias(true);
        Paint paint2 = new Paint();
        paint2.setColor(getContext().getResources().getColor(R.color.textColorSecondary));
        paint2.setTextSize(getResources().getDimensionPixelSize(R.dimen.textSizeCaption));
        paint2.setTypeface(Typeface.create(getResources().getString(R.string.emui_text_font_family_regular), 0));
        paint2.setAntiAlias(true);
        int i = (healthMultiRangeSeekBar.e - healthMultiRangeSeekBar.o) / 10;
        int iSave = canvas.save();
        canvas.translate(0.0f, healthMultiRangeSeekBar.i + healthMultiRangeSeekBar.d);
        float paddingTop = getPaddingTop();
        float f = healthMultiRangeSeekBar.l;
        float fD = qrs.d(paint2);
        int i2 = 0;
        while (i2 <= i) {
            int i3 = (i2 * 10) + healthMultiRangeSeekBar.o;
            float fD2 = healthMultiRangeSeekBar.d(i3);
            if (isLayoutRtl()) {
                fD2 = getWidth() - fD2;
            }
            float f2 = fD2;
            if (i2 != i) {
                canvas.drawLine(f2, paddingTop, f2, paddingTop + healthMultiRangeSeekBar.l, paint);
            }
            String strE = UnitUtil.e(i3, 2, 0);
            if (i2 != 0) {
                if (i2 == i) {
                    if (!isLayoutRtl()) {
                        fB = qrs.b(paint2, strE);
                    }
                } else {
                    fB = qrs.b(paint2, strE) / 2.0f;
                }
                f2 -= fB;
            } else if (isLayoutRtl()) {
                fB = qrs.b(paint2, strE);
                f2 -= fB;
            }
            canvas.drawText(strE, f2, f + paddingTop + fD, paint2);
            i2++;
            healthMultiRangeSeekBar = this;
        }
        canvas.restoreToCount(iSave);
    }

    private float d(float f) {
        return ((f - this.o) * this.j) + this.q + getPaddingStart();
    }

    private float e(float f) {
        return (((f - getPaddingStart()) - this.q) / this.j) + this.o;
    }

    private void g(Canvas canvas) {
        int saveCount = canvas.getSaveCount();
        float f = this.p;
        canvas.translate(-f, this.i - f);
        Iterator<Float> it = this.t.iterator();
        while (it.hasNext()) {
            float fD = d(it.next().floatValue());
            if (isLayoutRtl()) {
                fD = getWidth() - fD;
            }
            canvas.drawBitmap(this.r, fD, getPaddingTop(), (Paint) null);
        }
        canvas.restoreToCount(saveCount);
    }

    @Override // com.huawei.uikit.hwseekbar.widget.HwSeekBar
    public boolean isLayoutRtl() {
        return getLayoutDirection() == 1;
    }

    @Override // com.huawei.uikit.hwseekbar.widget.HwSeekBar, android.widget.AbsSeekBar, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.h) {
            return super.onTouchEvent(motionEvent);
        }
        if (motionEvent.getAction() == 0) {
            this.f23883c = -1;
            b(motionEvent);
        }
        if (motionEvent.getAction() == 2) {
            a(motionEvent);
        }
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            d();
        }
        return true;
    }

    private void b(MotionEvent motionEvent) {
        e(motionEvent);
        a();
    }

    private void e(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        for (int i = 0; i < this.t.size(); i++) {
            float fE = e(i);
            float fB = b(i);
            if (isLayoutRtl()) {
                fE = getWidth() - b(i);
                fB = getWidth() - e(i);
            }
            if (Float.compare(x, fE) > 0 && Float.compare(x, fB) < 0) {
                this.f23883c = i;
                return;
            }
        }
    }

    private void a(MotionEvent motionEvent) {
        if (this.f23883c != -1) {
            d(motionEvent);
        }
    }

    private void d(MotionEvent motionEvent) {
        a();
        setThumbPos(motionEvent);
    }

    private void d() {
        h();
        List<OnSeekChangeListener> list = this.f;
        if (list == null || list.isEmpty()) {
            return;
        }
        for (OnSeekChangeListener onSeekChangeListener : this.f) {
            int i = this.f23883c;
            onSeekChangeListener.onSeek(i, this.t.get(i).floatValue());
        }
    }

    private float e(int i) {
        if (i == 0) {
            return 0.0f;
        }
        return (d(this.t.get(i - 1).floatValue()) - this.p) + c(i);
    }

    private float c(int i) {
        if (i == 0 || i == this.t.size()) {
            return 0.0f;
        }
        return (d(this.t.get(i).floatValue()) - d(this.t.get(i - 1).floatValue())) / 2.0f;
    }

    private float b(int i) {
        if (i == this.t.size() - 1) {
            return getWidth();
        }
        int i2 = i + 1;
        return (d(this.t.get(i2).floatValue()) - this.p) - c(i2);
    }

    private float a(int i) {
        float fD;
        int width;
        if (i == 0) {
            fD = this.q;
            width = getPaddingStart();
        } else {
            fD = d(this.t.get(i - 1).floatValue());
            width = this.r.getWidth();
        }
        return fD + width;
    }

    private float d(int i) {
        if (i == this.t.size() - 1) {
            return getWidth() - getPaddingEnd();
        }
        return d(this.t.get(i + 1).floatValue()) - this.r.getWidth();
    }

    private void setThumbPos(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        if (njy.e(this.t, this.f23883c)) {
            return;
        }
        float fA = a(this.f23883c);
        float fD = d(this.f23883c);
        if (isLayoutRtl()) {
            fA = getWidth() - d(this.f23883c);
            fD = getWidth() - a(this.f23883c);
        }
        if (x < fA) {
            x = fA;
        }
        if (x <= fD) {
            fD = x;
        }
        if (isLayoutRtl()) {
            fD = getWidth() - fD;
        }
        this.t.set(this.f23883c, Float.valueOf(e(fD)));
        invalidate();
    }

    @Override // android.widget.ProgressBar, android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.mThumbPositions = this.t;
        return savedState;
    }

    @Override // android.widget.ProgressBar, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            super.onRestoreInstanceState(savedState.getSuperState());
            this.t = savedState.mThumbPositions;
        }
    }

    static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() { // from class: com.huawei.ui.commonui.seekbar.HealthMultiRangeSeekBar.SavedState.5
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        };
        private List<Float> mThumbPositions;

        SavedState(Parcelable parcelable) {
            super(parcelable);
            this.mThumbPositions = new ArrayList(5);
        }

        private SavedState(Parcel parcel) {
            super(parcel);
            ArrayList arrayList = new ArrayList(5);
            this.mThumbPositions = arrayList;
            parcel.readList(arrayList, Float.class.getClassLoader());
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeList(this.mThumbPositions);
        }
    }
}
