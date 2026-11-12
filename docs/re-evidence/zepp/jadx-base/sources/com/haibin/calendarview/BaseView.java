package com.haibin.calendarview;

import android.content.Context;
import android.graphics.Paint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.Nullable;
import androidx.core.internal.view.SupportMenu;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public abstract class BaseView extends View implements View.OnClickListener, View.OnLongClickListener {
    public static final int TEXT_SIZE = 14;
    public boolean isClick;
    public Paint mCurDayLunarTextPaint;
    public Paint mCurDayTextPaint;
    public Paint mCurMonthLunarTextPaint;
    public Paint mCurMonthTextPaint;
    public int mCurrentItem;
    public c mDelegate;
    public int mItemHeight;
    public int mItemWidth;
    public List<Calendar> mItems;
    public Paint mOtherMonthLunarTextPaint;
    public Paint mOtherMonthTextPaint;
    public CalendarLayout mParentLayout;
    public Paint mSchemeLunarTextPaint;
    public Paint mSchemePaint;
    public Paint mSchemeTextPaint;
    public Paint mSelectTextPaint;
    public Paint mSelectedLunarTextPaint;
    public Paint mSelectedPaint;
    public float mTextBaseLine;
    public float mX;
    public float mY;

    public BaseView(Context context) {
        this(context, null);
    }

    private void initPaint(Context context) {
        this.mCurMonthTextPaint.setAntiAlias(true);
        this.mCurMonthTextPaint.setTextAlign(Paint.Align.CENTER);
        this.mCurMonthTextPaint.setColor(-15658735);
        this.mCurMonthTextPaint.setFakeBoldText(true);
        this.mCurMonthTextPaint.setTextSize(b.c(context, 14.0f));
        this.mOtherMonthTextPaint.setAntiAlias(true);
        this.mOtherMonthTextPaint.setTextAlign(Paint.Align.CENTER);
        this.mOtherMonthTextPaint.setColor(-1973791);
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

    public final void addSchemesFromMap() {
        Map<String, Calendar> map = this.mDelegate.m0;
        if (map == null || map.size() == 0) {
            return;
        }
        for (Calendar calendar : this.mItems) {
            if (this.mDelegate.m0.containsKey(calendar.toString())) {
                Calendar calendar2 = this.mDelegate.m0.get(calendar.toString());
                if (calendar2 != null) {
                    calendar.setScheme(TextUtils.isEmpty(calendar2.getScheme()) ? this.mDelegate.F() : calendar2.getScheme());
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

    public void initPaint() {
    }

    public final boolean isInRange(Calendar calendar) {
        c cVar = this.mDelegate;
        return cVar != null && b.C(calendar, cVar);
    }

    public boolean isSelected(Calendar calendar) {
        List<Calendar> list = this.mItems;
        return list != null && list.indexOf(calendar) == this.mCurrentItem;
    }

    public final boolean onCalendarIntercept(Calendar calendar) {
        CalendarView.OnCalendarInterceptListener onCalendarInterceptListener = this.mDelegate.n0;
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
            this.mX = motionEvent.getX();
            this.mY = motionEvent.getY();
            this.isClick = true;
        } else if (action == 1) {
            this.mX = motionEvent.getX();
            this.mY = motionEvent.getY();
        } else if (action == 2 && this.isClick) {
            this.isClick = Math.abs(motionEvent.getY() - this.mY) <= 50.0f;
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void removeSchemes() {
        for (Calendar calendar : this.mItems) {
            calendar.setScheme("");
            calendar.setSchemeColor(0);
            calendar.setSchemes(null);
        }
    }

    public final void setup(c cVar) {
        this.mDelegate = cVar;
        updateStyle();
        updateItemHeight();
        initPaint();
    }

    public final void update() {
        Map<String, Calendar> map = this.mDelegate.m0;
        if (map == null || map.size() == 0) {
            removeSchemes();
            invalidate();
        } else {
            addSchemesFromMap();
            invalidate();
        }
    }

    public abstract void updateCurrentDate();

    public void updateItemHeight() {
        this.mItemHeight = this.mDelegate.f();
        Paint.FontMetrics fontMetrics = this.mCurMonthTextPaint.getFontMetrics();
        this.mTextBaseLine = ((this.mItemHeight / 2) - fontMetrics.descent) + ((fontMetrics.bottom - fontMetrics.top) / 2.0f);
    }

    public final void updateStyle() {
        c cVar = this.mDelegate;
        if (cVar == null) {
            return;
        }
        this.mCurDayTextPaint.setColor(cVar.i());
        this.mCurDayLunarTextPaint.setColor(this.mDelegate.h());
        this.mCurMonthTextPaint.setColor(this.mDelegate.l());
        this.mOtherMonthTextPaint.setColor(this.mDelegate.D());
        this.mCurMonthLunarTextPaint.setColor(this.mDelegate.k());
        this.mSelectedLunarTextPaint.setColor(this.mDelegate.K());
        this.mSelectTextPaint.setColor(this.mDelegate.L());
        this.mOtherMonthLunarTextPaint.setColor(this.mDelegate.C());
        this.mSchemeLunarTextPaint.setColor(this.mDelegate.E());
        this.mSchemePaint.setColor(this.mDelegate.H());
        this.mSchemeTextPaint.setColor(this.mDelegate.G());
        this.mCurMonthTextPaint.setTextSize(this.mDelegate.m());
        this.mOtherMonthTextPaint.setTextSize(this.mDelegate.m());
        this.mCurDayTextPaint.setTextSize(this.mDelegate.m());
        this.mSchemeTextPaint.setTextSize(this.mDelegate.m());
        this.mSelectTextPaint.setTextSize(this.mDelegate.m());
        this.mCurMonthLunarTextPaint.setTextSize(this.mDelegate.o());
        this.mSelectedLunarTextPaint.setTextSize(this.mDelegate.o());
        this.mCurDayLunarTextPaint.setTextSize(this.mDelegate.o());
        this.mOtherMonthLunarTextPaint.setTextSize(this.mDelegate.o());
        this.mSchemeLunarTextPaint.setTextSize(this.mDelegate.o());
        this.mSelectedPaint.setStyle(Paint.Style.FILL);
        this.mSelectedPaint.setColor(this.mDelegate.M());
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
        this.isClick = true;
        this.mCurrentItem = -1;
        initPaint(context);
    }
}
