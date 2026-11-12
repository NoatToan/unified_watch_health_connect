package com.huami.calendarview;

import android.content.Context;
import android.graphics.Paint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import androidx.core.internal.view.SupportMenu;
import com.huami.femalehealth.uilib.R;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public abstract class BaseView extends View implements View.OnClickListener, View.OnLongClickListener {
    public static final int h = 14;
    public c a;
    public CalendarLayout b;
    public List<Calendar> c;
    public float d;
    public float e;
    public boolean f;
    public int g;
    public Paint mCurDayLunarTextPaint;
    public Paint mCurDayTextPaint;
    public Paint mCurMonthLunarTextPaint;
    public Paint mCurMonthTextPaint;
    public int mItemHeight;
    public int mItemWidth;
    public Paint mOtherMonthLunarTextPaint;
    public Paint mOtherMonthTextPaint;
    public Paint mSchemeLunarTextPaint;
    public Paint mSchemePaint;
    public Paint mSchemeTextPaint;
    public Paint mSelectTextPaint;
    public Paint mSelectedLunarTextPaint;
    public Paint mSelectedPaint;
    public float mTextBaseLine;

    public BaseView(Context context) {
        this(context, null);
    }

    private void b(Context context) {
        this.mCurMonthTextPaint.setAntiAlias(true);
        this.mCurMonthTextPaint.setTextAlign(Paint.Align.CENTER);
        this.mCurMonthTextPaint.setColor(-15658735);
        this.mCurMonthTextPaint.setFakeBoldText(true);
        this.mCurMonthTextPaint.setTextSize(b.c(context, 14.0f));
        this.mOtherMonthTextPaint.setAntiAlias(true);
        this.mOtherMonthTextPaint.setTextAlign(Paint.Align.CENTER);
        this.mOtherMonthTextPaint.setColor(ContextCompat.getColor(context, R.color.s3));
        this.mOtherMonthTextPaint.setFakeBoldText(true);
        this.mOtherMonthTextPaint.setTextSize(b.c(context, 14.0f));
        this.mCurMonthLunarTextPaint.setAntiAlias(true);
        this.mCurMonthLunarTextPaint.setTextAlign(Paint.Align.CENTER);
        this.mSelectedLunarTextPaint.setAntiAlias(true);
        this.mSelectedLunarTextPaint.setTextAlign(Paint.Align.CENTER);
        this.mOtherMonthLunarTextPaint.setAntiAlias(true);
        this.mOtherMonthLunarTextPaint.setTextAlign(Paint.Align.CENTER);
        this.mSchemeLunarTextPaint.setAntiAlias(true);
        this.mSchemeLunarTextPaint.setTextAlign(Paint.Align.CENTER);
        this.mSchemeTextPaint.setAntiAlias(true);
        this.mSchemeTextPaint.setStyle(Paint.Style.FILL);
        this.mSchemeTextPaint.setTextAlign(Paint.Align.CENTER);
        this.mSchemeTextPaint.setColor(-1223853);
        this.mSchemeTextPaint.setFakeBoldText(true);
        this.mSchemeTextPaint.setTextSize(b.c(context, 14.0f));
        this.mSelectTextPaint.setAntiAlias(true);
        this.mSelectTextPaint.setStyle(Paint.Style.FILL);
        this.mSelectTextPaint.setTextAlign(Paint.Align.CENTER);
        this.mSelectTextPaint.setColor(-1223853);
        this.mSelectTextPaint.setFakeBoldText(true);
        this.mSelectTextPaint.setTextSize(b.c(context, 14.0f));
        this.mSchemePaint.setAntiAlias(true);
        this.mSchemePaint.setStyle(Paint.Style.FILL);
        this.mSchemePaint.setStrokeWidth(2.0f);
        this.mSchemePaint.setColor(-1052689);
        this.mCurDayTextPaint.setAntiAlias(true);
        this.mCurDayTextPaint.setTextAlign(Paint.Align.CENTER);
        this.mCurDayTextPaint.setColor(SupportMenu.CATEGORY_MASK);
        this.mCurDayTextPaint.setFakeBoldText(true);
        this.mCurDayTextPaint.setTextSize(b.c(context, 14.0f));
        this.mCurDayLunarTextPaint.setAntiAlias(true);
        this.mCurDayLunarTextPaint.setTextAlign(Paint.Align.CENTER);
        this.mCurDayLunarTextPaint.setColor(SupportMenu.CATEGORY_MASK);
        this.mCurDayLunarTextPaint.setFakeBoldText(true);
        this.mCurDayLunarTextPaint.setTextSize(b.c(context, 14.0f));
        this.mSelectedPaint.setAntiAlias(true);
        this.mSelectedPaint.setStyle(Paint.Style.FILL);
        this.mSelectedPaint.setStrokeWidth(2.0f);
        setOnClickListener(this);
        setOnLongClickListener(this);
    }

    public final void a() {
        Map<String, Calendar> map = this.a.p0;
        if (map == null || map.size() == 0) {
            return;
        }
        for (Calendar calendar : this.c) {
            if (this.a.p0.containsKey(calendar.toString())) {
                Calendar calendar2 = this.a.p0.get(calendar.toString());
                if (calendar2 != null) {
                    calendar.setScheme(TextUtils.isEmpty(calendar2.getScheme()) ? this.a.H() : calendar2.getScheme());
                    calendar.setSchemeColor(calendar2.getSchemeColor());
                    calendar.setSchemes(calendar2.getSchemes());
                }
            } else {
                calendar.setScheme("");
                calendar.setSchemeColor(0);
                calendar.setSchemes(null);
            }
        }
    }

    public final void c() {
        for (Calendar calendar : this.c) {
            calendar.setScheme("");
            calendar.setSchemeColor(0);
            calendar.setSchemes(null);
        }
    }

    public final void d() {
        Map<String, Calendar> map = this.a.p0;
        if (map == null || map.size() == 0) {
            c();
            invalidate();
        } else {
            a();
            invalidate();
        }
    }

    public abstract void e();

    public void f() {
        this.mItemHeight = this.a.f();
        Paint.FontMetrics fontMetrics = this.mCurMonthTextPaint.getFontMetrics();
        this.mTextBaseLine = ((this.mItemHeight / 2) - fontMetrics.descent) + ((fontMetrics.bottom - fontMetrics.top) / 2.0f);
    }

    public final void g() {
        c cVar = this.a;
        if (cVar == null) {
            return;
        }
        this.mCurDayTextPaint.setColor(cVar.i());
        this.mCurDayLunarTextPaint.setColor(this.a.h());
        this.mCurMonthTextPaint.setColor(this.a.l());
        this.mOtherMonthTextPaint.setColor(this.a.F());
        this.mCurMonthLunarTextPaint.setColor(this.a.k());
        this.mSelectedLunarTextPaint.setColor(this.a.M());
        this.mSelectTextPaint.setColor(this.a.N());
        this.mOtherMonthLunarTextPaint.setColor(this.a.E());
        this.mSchemeLunarTextPaint.setColor(this.a.G());
        this.mSchemePaint.setColor(this.a.J());
        this.mSchemeTextPaint.setColor(this.a.I());
        this.mCurMonthTextPaint.setTextSize(this.a.m());
        this.mOtherMonthTextPaint.setTextSize(this.a.m());
        this.mCurDayTextPaint.setTextSize(this.a.m());
        this.mSchemeTextPaint.setTextSize(this.a.m());
        this.mSelectTextPaint.setTextSize(this.a.m());
        this.mCurMonthLunarTextPaint.setTextSize(this.a.q());
        this.mSelectedLunarTextPaint.setTextSize(this.a.q());
        this.mCurDayLunarTextPaint.setTextSize(this.a.q());
        this.mOtherMonthLunarTextPaint.setTextSize(this.a.q());
        this.mSchemeLunarTextPaint.setTextSize(this.a.q());
        this.mSelectedPaint.setStyle(Paint.Style.FILL);
        this.mSelectedPaint.setColor(this.a.O());
    }

    public void initPaint() {
    }

    public final boolean isInRange(Calendar calendar) {
        c cVar = this.a;
        return cVar != null && b.C(calendar, cVar);
    }

    public boolean isSelected(Calendar calendar) {
        List<Calendar> list = this.c;
        return list != null && list.indexOf(calendar) == this.g;
    }

    public final boolean onCalendarIntercept(Calendar calendar) {
        CalendarView.OnCalendarInterceptListener onCalendarInterceptListener = this.a.q0;
        return onCalendarInterceptListener != null && onCalendarInterceptListener.onCalendarIntercept(calendar);
    }

    public abstract void onDestroy();

    public void onPreviewHook() {
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getPointerCount() > 1) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.d = motionEvent.getX();
            this.e = motionEvent.getY();
            this.f = true;
        } else if (action == 1) {
            this.d = motionEvent.getX();
            this.e = motionEvent.getY();
        } else if (action == 2 && this.f) {
            this.f = Math.abs(motionEvent.getY() - this.e) <= 50.0f;
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void setup(c cVar) {
        this.a = cVar;
        g();
        f();
        initPaint();
    }

    public BaseView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mCurMonthTextPaint = new Paint();
        this.mOtherMonthTextPaint = new Paint();
        this.mCurMonthLunarTextPaint = new Paint();
        this.mSelectedLunarTextPaint = new Paint();
        this.mOtherMonthLunarTextPaint = new Paint();
        this.mSchemeLunarTextPaint = new Paint();
        this.mSchemePaint = new Paint();
        this.mSelectedPaint = new Paint();
        this.mSchemeTextPaint = new Paint();
        this.mSelectTextPaint = new Paint();
        this.mCurDayTextPaint = new Paint();
        this.mCurDayLunarTextPaint = new Paint();
        this.f = true;
        this.g = -1;
        b(context);
    }
}
