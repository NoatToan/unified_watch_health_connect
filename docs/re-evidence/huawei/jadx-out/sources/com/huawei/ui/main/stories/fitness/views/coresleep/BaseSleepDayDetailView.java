package com.huawei.ui.main.stories.fitness.views.coresleep;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.text.format.DateFormat;
import android.util.AttributeSet;
import android.view.View;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.main.R;
import defpackage.ltb;
import defpackage.qqf;
import defpackage.qrs;
import defpackage.uig;
import defpackage.uje;
import defpackage.ukg;
import defpackage.wud;
import health.compact.a.LanguageUtil;
import health.compact.a.UnitUtil;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes43.dex */
public abstract class BaseSleepDayDetailView extends View {
    private static final int ARRAY_COLLECTION_FOUR_INDEX = 2;
    private static final int ARRAY_COLLECTION_TWO_INDEX = 2;
    private static final String COLON = ":";
    public static final int FITNESS_SLEEP_TYPE_AWAKE_SLEEP = 67;
    public static final int FITNESS_SLEEP_TYPE_AWAKE_SLEEP_CONNECTION = 700;
    public static final int FITNESS_SLEEP_TYPE_DEEP_SLEEP = 65;
    public static final int FITNESS_SLEEP_TYPE_NOON_SLEEP = 69;
    public static final int FITNESS_SLEEP_TYPE_NOON_SLEEP_CONNECTION = 710;
    private static final int FITNESS_SLEEP_TYPE_NO_SLEEP = 64;
    public static final int FITNESS_SLEEP_TYPE_SHALLOW_SLEEP = 66;
    public static final int FITNESS_SLEEP_TYPE_SLUMBER_SLEEP = 68;
    private static final float HALF_FLOAT = 2.0f;
    private static final int HALF_INT = 2;
    public static final int HOUR_IN_DAY = 24;
    public static final float MINS_IN_DAY = 1440.0f;
    public static final int MINS_IN_HOUR = 60;
    private static final float PRECISION = 1.0E-7f;
    public static final int SLEEP_CHART_COLOR_TYPE = 1;
    public static final int SLEEP_START_END_HOUR = 20;
    private static final String TAG = "BaseSleepDayDetailView";
    private static final String TAG_RELEASE = "R_Sleep_BaseSleepDayDetailView";
    private static final int THREE_TIMES = 3;
    private static final int TWO_TIMES_INT = 2;
    protected Canvas mCanvas;
    private float mChartBorderWidth;
    private List<String> mChartLabels;
    private int mColorType;
    private Context mContext;
    private List<uig> mCopyOfFitnessDataList;
    private float mCoreSleepEndX;
    private float mCoreSleepStartX;
    private float mCurrentBottom;
    private uig mCurrentData;
    private Date mCurrentDay;
    private float mCursorCenter;
    private float mCursorHeight;
    private ArrayList<ukg> mCursorList;
    private float mCursorTextHeight;
    private String[] mDate;
    private float mDiagramHeight;
    private float mDiagramWidth;
    private int mEndConnectionColor;
    private int mEndCyColor;
    private uig mEndData;
    private String mEndDate;
    private int mEndHour;
    private int mEndLineRectColor;
    private int mEndMin;
    private String mEndText;
    private List<uig> mFitnessDataList;
    private boolean mIsDayDetailView;
    private boolean mIsDefault;
    private boolean mIsMove;
    private boolean mIsOnlyNoonSleepType;
    private boolean mIsOtherType;
    private boolean mIsScienceSleep;
    private uig mLastData;
    private int mLastNightEndPoint;
    private int mNightEndPoint;
    private int mNightStartPoint;
    private int mRemSleepTimes;
    private int mStartConnectionColor;
    private int mStartCyColor;
    private String mStartDate;
    private int mStartHour;
    private int mStartLineRectColor;
    private int mStartMin;
    private int mStartSleepPoint;
    private String mStartText;
    private String[] mTime;
    private float mTimeStrY;
    private float mTimeStringMargin;
    private float mTransparentHeight;
    private float mVerticalLineStartY;
    private float mViewHeight;
    private float mViewWidth;
    private static final float XAXIS_TEXT_OFFSET_DEFAULT = wud.b(8.0f);
    private static final float XAXIS_TEXT_OFFSET_TAHITI = wud.b(16.0f);
    private static final float CURSOR_TEXT_MINIMUM_HEIGHT = wud.b(4.0f);
    private static final float CURSOR_TEXT_HIGHEST_HEIGHT = wud.b(11.5f);
    private static final float CURSOR_TEXT_FLOATING_OFFSET = wud.b(19.0f);
    private static final float CURSOR_WIDTH_OFFSET = wud.b(36.0f);

    public BaseSleepDayDetailView(Context context) {
        super(context);
        this.mRemSleepTimes = 0;
        this.mNightStartPoint = 0;
        this.mNightEndPoint = 0;
        this.mLastNightEndPoint = 0;
        this.mStartSleepPoint = 0;
        this.mCoreSleepStartX = 0.0f;
        this.mCoreSleepEndX = 0.0f;
        this.mStartText = "";
        this.mEndText = "";
        this.mTimeStringMargin = wud.b(2.0f);
        this.mChartBorderWidth = wud.b(40.0f);
        this.mTimeStrY = 45.0f;
        this.mVerticalLineStartY = 20.0f;
        this.mColorType = 0;
        this.mIsDayDetailView = true;
        this.mIsScienceSleep = false;
        this.mIsDefault = true;
        this.mIsMove = false;
        this.mFitnessDataList = new ArrayList(16);
        this.mCopyOfFitnessDataList = new ArrayList(16);
        this.mCursorList = new ArrayList<>(16);
        this.mChartLabels = new ArrayList(16);
        this.mIsOtherType = false;
        this.mCurrentBottom = 0.0f;
        this.mContext = context;
    }

    public BaseSleepDayDetailView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mRemSleepTimes = 0;
        this.mNightStartPoint = 0;
        this.mNightEndPoint = 0;
        this.mLastNightEndPoint = 0;
        this.mStartSleepPoint = 0;
        this.mCoreSleepStartX = 0.0f;
        this.mCoreSleepEndX = 0.0f;
        this.mStartText = "";
        this.mEndText = "";
        this.mTimeStringMargin = wud.b(2.0f);
        this.mChartBorderWidth = wud.b(40.0f);
        this.mTimeStrY = 45.0f;
        this.mVerticalLineStartY = 20.0f;
        this.mColorType = 0;
        this.mIsDayDetailView = true;
        this.mIsScienceSleep = false;
        this.mIsDefault = true;
        this.mIsMove = false;
        this.mFitnessDataList = new ArrayList(16);
        this.mCopyOfFitnessDataList = new ArrayList(16);
        this.mCursorList = new ArrayList<>(16);
        this.mChartLabels = new ArrayList(16);
        this.mIsOtherType = false;
        this.mCurrentBottom = 0.0f;
    }

    public void setDayDetailView(boolean z) {
        this.mIsDayDetailView = z;
    }

    public Context getBaseContext() {
        return this.mContext;
    }

    public void setBaseContext(Context context) {
        this.mContext = context;
    }

    public void setColorType(int i) {
        this.mColorType = i;
    }

    public int getColorType() {
        return this.mColorType;
    }

    public int getNightStartPoint() {
        return this.mNightStartPoint;
    }

    public int getNightEndPoint() {
        return this.mNightEndPoint;
    }

    public float getChartBorderWidth() {
        return this.mChartBorderWidth;
    }

    public boolean getIsScienceSleep() {
        return this.mIsScienceSleep;
    }

    public boolean getIsOnlyNoonSleepType() {
        return this.mIsOnlyNoonSleepType;
    }

    public boolean getIsDefault() {
        return this.mIsDefault;
    }

    public void setIsDefault(boolean z) {
        this.mIsDefault = z;
    }

    public boolean getIsMove() {
        return this.mIsMove;
    }

    public void setIsMove(boolean z) {
        this.mIsMove = z;
    }

    public List<uig> getFitnessDataList() {
        return this.mFitnessDataList;
    }

    public ArrayList<ukg> getCursorList() {
        return this.mCursorList;
    }

    public float getViewWidth() {
        return this.mViewWidth;
    }

    public void setViewWidth(float f) {
        this.mViewWidth = f;
    }

    public float getViewHeight() {
        return this.mViewHeight;
    }

    public void setViewHeight(float f) {
        this.mViewHeight = f;
    }

    public uig getLastData() {
        return this.mLastData;
    }

    public float getDiagramWidth() {
        return this.mDiagramWidth;
    }

    public void setDiagramWidth(float f) {
        this.mDiagramWidth = f;
    }

    public float getDiagramHeight() {
        return this.mDiagramHeight;
    }

    public void setDiagramHeight(float f) {
        this.mDiagramHeight = f;
    }

    public void setIsOtherType(boolean z) {
        this.mIsOtherType = z;
    }

    public float getTransparentHeight() {
        return this.mTransparentHeight;
    }

    public void setTransparentHeight(float f) {
        this.mTransparentHeight = f;
    }

    public float getCursorHeight() {
        return this.mCursorHeight;
    }

    public void setCursorHeight(float f) {
        this.mCursorHeight = f;
    }

    public float getCursorCenter() {
        return this.mCursorCenter;
    }

    public void setCursorCenter(float f) {
        this.mCursorCenter = f;
    }

    public static class b {
        private float e = 0.0f;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private float f27237b = 0.0f;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private float f27236a = 0.0f;
        private float d = 0.0f;

        public float b() {
            return this.e;
        }
    }

    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private float f27233a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private float f27234b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private float f27235c;
        private float d;
        private float e;
        private float i;

        private a() {
            this.f27235c = 0.0f;
            this.d = 0.0f;
            this.i = 0.0f;
            this.e = 0.0f;
            this.f27233a = 0.0f;
            this.f27234b = 0.0f;
        }
    }

    public void refreshFitnessDataList(List<uig> list, boolean z, double d, boolean z2, Date date) {
        LogUtil.a(TAG, "Enter refreshCoreFitness validData:", Double.valueOf(d));
        if (this.mIsDayDetailView) {
            this.mChartBorderWidth = wud.b(40.0f);
        } else {
            this.mChartBorderWidth = wud.b(36.0f);
        }
        if (date != null) {
            this.mCurrentDay = (Date) date.clone();
        } else {
            LogUtil.e(TAG_RELEASE, "refreshFitnessDataList mCurrentDay is null ");
            this.mCurrentDay = ltb.b();
        }
        this.mIsScienceSleep = z;
        if (list == null || list.size() == 0) {
            this.mIsScienceSleep = false;
        }
        this.mIsOnlyNoonSleepType = z2;
        initData();
        if (list != null) {
            LogUtil.a(TAG, "refreshCoreFitnessDataList ", list.toString());
        }
        if (list != null && list.size() > 0) {
            this.mFitnessDataList.addAll(list);
            copyOfFitnessDataList();
        }
        invalidate();
        LogUtil.a(TAG, "Leave refreshCoreFitnessDataList");
    }

    public void onConfigurationChanged() {
        drawCursorText(this.mCanvas);
    }

    private void initData() {
        this.mIsDefault = true;
        this.mIsMove = false;
        this.mFitnessDataList.clear();
        this.mCopyOfFitnessDataList.clear();
        this.mCursorList.clear();
        this.mChartLabels.clear();
        this.mRemSleepTimes = 0;
        this.mNightStartPoint = 0;
        this.mNightEndPoint = 0;
    }

    private void copyOfFitnessDataList() {
        resetCopyData();
        List<uig> list = this.mFitnessDataList;
        if (list == null) {
            return;
        }
        this.mCopyOfFitnessDataList.addAll(list);
        Iterator<uig> it = this.mFitnessDataList.iterator();
        while (it.hasNext()) {
            getSleepDataForUi(it.next());
        }
        Map<String, Integer> mapE = uje.e(this.mFitnessDataList);
        if (mapE == null) {
            LogUtil.e(TAG_RELEASE, "timeMap is null!");
            return;
        }
        this.mStartSleepPoint = mapE.get("core_sleep_start_time_key").intValue();
        this.mLastNightEndPoint = mapE.get("core_sleep_end_time_key").intValue();
        LogUtil.a(TAG, " copyOfFitnessDataList mStartSleepPoint = ", Integer.valueOf(this.mStartSleepPoint));
        LogUtil.a(TAG, " copyOfFitnessDataList mNightEndPoint = ", Integer.valueOf(this.mLastNightEndPoint));
    }

    private void getSleepDataForUi(uig uigVar) {
        if (uigVar == null) {
            LogUtil.e(TAG, "getSleepDataForUi data is null");
            return;
        }
        if (uigVar.e() == 68) {
            this.mRemSleepTimes += uigVar.f50129a - uigVar.n;
        }
        if (uigVar.e() != 69) {
            if (this.mNightStartPoint == 0 && this.mNightEndPoint == 0) {
                if (uigVar.e() != 67) {
                    this.mNightStartPoint = uigVar.b();
                } else if (this.mFitnessDataList.size() > 1) {
                    this.mNightStartPoint = this.mFitnessDataList.get(1).b();
                }
            }
            this.mNightEndPoint = uigVar.c();
        }
    }

    private void resetCopyData() {
        this.mCopyOfFitnessDataList.clear();
        this.mRemSleepTimes = 0;
        this.mStartSleepPoint = 0;
        this.mLastNightEndPoint = 0;
        this.mNightStartPoint = 0;
        this.mNightEndPoint = 0;
    }

    public void getTimeLabel() {
        String str;
        Paint paint = new Paint();
        paint.setTextSize(wud.b(10.0f));
        paint.setAntiAlias(true);
        this.mDate = new String[2];
        if (this.mCurrentDay == null) {
            LogUtil.e(TAG_RELEASE, "getTimeLabel mCurrentDay is null ");
            this.mCurrentDay = ltb.b();
        }
        if (this.mIsScienceSleep && !this.mIsOnlyNoonSleepType) {
            getCoreSleepTimeLabel(paint);
            return;
        }
        List<String> chartLabels = getChartLabels();
        this.mChartLabels = chartLabels;
        this.mTime = new String[chartLabels.size()];
        for (int i = 0; i < this.mChartLabels.size(); i++) {
            if (LanguageUtil.ba(BaseApplication.getContext())) {
                List<String> list = this.mChartLabels;
                str = list.get((list.size() - i) - 1);
            } else {
                str = this.mChartLabels.get(i);
            }
            this.mTime[i] = str;
        }
        this.mStartDate = dateToString(ltb.p(this.mCurrentDay));
        String strDateToString = dateToString(this.mCurrentDay);
        this.mEndDate = strDateToString;
        String[] strArr = this.mDate;
        strArr[0] = this.mStartDate;
        strArr[1] = strDateToString;
        if (LanguageUtil.ba(BaseApplication.getContext())) {
            String[] strArr2 = this.mDate;
            strArr2[0] = this.mEndDate;
            strArr2[1] = this.mStartDate;
        }
    }

    private void getCoreSleepTimeLabel(Paint paint) {
        float fB;
        float fB2;
        LogUtil.a(TAG, "mStartSleepPoint: ", Integer.valueOf(this.mStartSleepPoint), " mLastNightEndPoint:", Integer.valueOf(this.mLastNightEndPoint), " mStartPoint:", Integer.valueOf(this.mNightStartPoint), " mEndPoint:", Integer.valueOf(this.mNightEndPoint));
        this.mTime = new String[2];
        setStartSleepText();
        String str = this.mStartText;
        float fMeasureText = (int) paint.measureText(str, 0, str.length());
        int i = this.mNightEndPoint;
        int i2 = this.mNightStartPoint;
        float f = 0.0f;
        if (i != i2) {
            fB = ((((this.mStartSleepPoint - i2) / (i - i2)) * (this.mViewWidth - wud.b(80.0f))) + wud.b(40.0f)) - (fMeasureText / 2.0f);
            if (fB < 0.0f) {
                fB = wud.b(16.0f);
            }
        } else {
            fB = wud.b(40.0f) - (fMeasureText / 2.0f);
        }
        if (LanguageUtil.ba(BaseApplication.getContext())) {
            fB = (this.mViewWidth - fMeasureText) - fB;
            float fB3 = wud.b(16.0f);
            float f2 = this.mViewWidth;
            if (fB + fMeasureText + fB3 > f2) {
                fB = (f2 - fMeasureText) - wud.b(16.0f);
            }
        }
        this.mCoreSleepStartX = fB;
        setEndSleepText();
        String str2 = this.mEndText;
        float fMeasureText2 = (int) paint.measureText(str2, 0, str2.length());
        int i3 = this.mNightEndPoint;
        int i4 = this.mNightStartPoint;
        if (i3 != i4) {
            fB2 = ((((this.mLastNightEndPoint - i4) / (i3 - i4)) * (this.mViewWidth - wud.b(80.0f))) + wud.b(40.0f)) - (fMeasureText2 / 2.0f);
            float fB4 = wud.b(16.0f);
            float f3 = this.mViewWidth;
            if (fB2 + fMeasureText2 + fB4 > f3) {
                fB2 = (f3 - fMeasureText2) - wud.b(16.0f);
            }
        } else {
            fB2 = (this.mViewWidth - fMeasureText2) - wud.b(16.0f);
        }
        if (LanguageUtil.ba(BaseApplication.getContext())) {
            float f4 = (this.mViewWidth - fB2) - fMeasureText2;
            if (f4 >= 0.0f) {
                f = f4;
            }
        } else {
            f = fB2;
        }
        this.mCoreSleepEndX = f;
        dealEndTimeIfStartGreater();
        replaceTextAndDate();
    }

    private void dealEndTimeIfStartGreater() {
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM-dd");
            Date date = simpleDateFormat.parse(this.mStartDate);
            Date date2 = simpleDateFormat.parse(this.mEndDate);
            if (date == null || date2 == null || date.getTime() <= date2.getTime()) {
                return;
            }
            this.mEndDate = this.mStartDate;
            LogUtil.j(TAG, "startTime = ", Long.valueOf(date.getTime()), " endTime = ", Long.valueOf(date2.getTime()));
        } catch (ParseException unused) {
            LogUtil.e(TAG_RELEASE, "simpleDateFormat ParseException ");
        }
    }

    private void replaceTextAndDate() {
        if (LanguageUtil.ba(BaseApplication.getContext())) {
            String[] strArr = this.mTime;
            strArr[0] = this.mEndText;
            strArr[1] = this.mStartText;
            String[] strArr2 = this.mDate;
            strArr2[0] = this.mEndDate;
            strArr2[1] = this.mStartDate;
            return;
        }
        String[] strArr3 = this.mTime;
        strArr3[0] = this.mStartText;
        strArr3[1] = this.mEndText;
        String[] strArr4 = this.mDate;
        strArr4[0] = this.mStartDate;
        strArr4[1] = this.mEndDate;
    }

    private void setStartSleepText() {
        int i = this.mStartSleepPoint;
        int i2 = i / 60;
        int i3 = i2 + 20;
        if (i3 >= 24) {
            i3 = i2 - 4;
        }
        if (i3 >= 20 && i3 < 24) {
            this.mStartDate = dateToString(ltb.p(this.mCurrentDay));
        } else {
            this.mStartDate = dateToString(this.mCurrentDay);
        }
        this.mStartText = formatTime(getTimeStr(i3) + ":" + getTimeStr(i % 60));
        if (!LanguageUtil.o(BaseApplication.getContext())) {
            this.mStartText = this.mContext.getResources().getString(R.string.IDS_fitness_core_sleep_start_sleep) + " " + this.mStartText;
            return;
        }
        this.mStartText = this.mContext.getResources().getString(R.string.IDS_fitness_core_sleep_start_sleep) + this.mStartText;
    }

    private void setEndSleepText() {
        int i = this.mLastNightEndPoint;
        int i2 = i / 60;
        int i3 = i2 + 20;
        if (i3 >= 24) {
            i3 = i2 - 4;
        }
        if (i3 > 20 && i3 < 24) {
            this.mEndDate = dateToString(ltb.p(this.mCurrentDay));
        } else {
            this.mEndDate = dateToString(this.mCurrentDay);
        }
        this.mEndText = formatTime(getTimeStr(i3) + ":" + getTimeStr(i % 60));
        if (!LanguageUtil.o(BaseApplication.getContext())) {
            this.mEndText = this.mContext.getResources().getString(R.string.IDS_fitness_core_sleep_end_sleep) + " " + this.mEndText;
            return;
        }
        this.mEndText = this.mContext.getResources().getString(R.string.IDS_fitness_core_sleep_end_sleep) + this.mEndText;
    }

    public void drawSleepRect(Canvas canvas) {
        if (canvas == null) {
            return;
        }
        List<uig> list = this.mFitnessDataList;
        if (list == null || list.size() == 0) {
            this.mLastData = null;
            return;
        }
        this.mCurrentBottom = this.mDiagramHeight;
        int size = this.mFitnessDataList.size();
        for (int i = 0; i < size; i++) {
            uig uigVar = this.mFitnessDataList.get(i);
            this.mCurrentData = uigVar;
            int iB = uigVar.b();
            int iC = this.mCurrentData.c();
            if (this.mIsOnlyNoonSleepType) {
                drawOnlyNoonSleepRect(canvas, iB, iC, size, i);
            } else if (this.mIsScienceSleep) {
                if (this.mCurrentData.e() != 69) {
                    drawCoreSleepRect(canvas, size, i);
                }
            } else if (this.mCurrentData.e() != 69) {
                drawCommonSleepRect(canvas, iB, iC, size, i);
            }
        }
    }

    private void drawOnlyNoonSleepRect(Canvas canvas, int i, int i2, int i3, int i4) {
        if (canvas == null) {
            return;
        }
        b bVar = new b();
        b bVar2 = new b();
        setCurrentValueData(bVar, getOnlyNoonRectSetting(this.mCurrentData.e(), this.mCurrentBottom), i, i2);
        setRtlPosition(bVar);
        getTheLastData(this.mCurrentData);
        boolean z = true;
        int i5 = i4 + 1;
        if (i5 < i3) {
            this.mEndData = this.mFitnessDataList.get(i5);
            bVar2.f27236a = ((i / 1440.0f) * this.mDiagramWidth) + this.mChartBorderWidth;
            bVar2.d = ((i2 / 1440.0f) * this.mDiagramWidth) + this.mChartBorderWidth;
            boolean z2 = Math.abs(bVar.d - bVar2.f27236a) < PRECISION;
            if (LanguageUtil.ba(BaseApplication.getContext())) {
                float f = bVar2.f27236a;
                bVar2.f27236a = this.mViewWidth - bVar2.d;
                bVar2.d = this.mViewWidth - f;
                if (Math.abs(bVar.f27236a - bVar2.d) >= PRECISION) {
                    z = false;
                }
            } else {
                z = z2;
            }
            b onlyNoonRectSetting = getOnlyNoonRectSetting(this.mEndData.e(), this.mCurrentBottom);
            bVar2.e = onlyNoonRectSetting.e;
            bVar2.f27237b = onlyNoonRectSetting.f27237b;
            if (!this.mIsOtherType && z) {
                setCurrentRectColor(this.mCurrentData.e());
                setConnectionBlock(canvas, this.mCurrentData, bVar, this.mEndData, bVar2);
            } else if (this.mCurrentData.e() == 69) {
                setCurrentRectColor(710);
            } else {
                setCurrentRectColor(700);
            }
        } else if (this.mCurrentData.e() == 69) {
            setCurrentRectColor(710);
        } else {
            setCurrentRectColor(700);
        }
        drawCyRect(canvas, bVar);
    }

    private void setCurrentValueData(b bVar, b bVar2, int i, int i2) {
        bVar.e = bVar2.e;
        bVar.f27237b = bVar2.f27237b;
        bVar.f27236a = ((i / 1440.0f) * this.mDiagramWidth) + this.mChartBorderWidth;
        bVar.d = ((i2 / 1440.0f) * this.mDiagramWidth) + this.mChartBorderWidth;
    }

    private void drawCoreSleepRect(Canvas canvas, int i, int i2) {
        b bVar = new b();
        b bVar2 = new b();
        int iB = this.mCurrentData.b();
        int i3 = this.mNightStartPoint;
        bVar.f27236a = (((iB - i3) / (this.mNightEndPoint - i3)) * this.mDiagramWidth) + this.mChartBorderWidth;
        int iC = this.mCurrentData.c();
        int i4 = this.mNightStartPoint;
        bVar.d = (((iC - i4) / (this.mNightEndPoint - i4)) * this.mDiagramWidth) + this.mChartBorderWidth;
        boolean z = true;
        if (i2 == 1) {
            LogUtil.a(TAG, "mCurrentData.getStartPoint() = ", Integer.valueOf(this.mCurrentData.b()), "; mNightStartPoint = ", Integer.valueOf(this.mNightStartPoint), "; mNightEndPoint = ", Integer.valueOf(this.mNightEndPoint), "; mCurrentLeft = ", Float.valueOf(bVar.f27236a), "", "; mViewWidth = ", Float.valueOf(this.mViewWidth), "; mDiagramWidth = ", Float.valueOf(this.mDiagramWidth), "mChartBorderWidth = ", Float.valueOf(this.mChartBorderWidth));
        }
        b currentRectSetting = getCurrentRectSetting(this.mCurrentData.e(), this.mCurrentBottom);
        bVar.e = currentRectSetting.e;
        bVar.f27237b = currentRectSetting.f27237b;
        setCurrentRectColor(this.mCurrentData.e());
        setRtlPosition(bVar);
        getTheLastData(this.mCurrentData);
        int i5 = i2 + 1;
        if (i5 < i) {
            uig uigVar = this.mFitnessDataList.get(i5);
            this.mEndData = uigVar;
            int iB2 = uigVar.b();
            int i6 = this.mNightStartPoint;
            bVar2.f27236a = (((iB2 - i6) / (this.mNightEndPoint - i6)) * this.mDiagramWidth) + this.mChartBorderWidth;
            int iC2 = this.mEndData.c();
            int i7 = this.mNightStartPoint;
            bVar2.d = (((iC2 - i7) / (this.mNightEndPoint - i7)) * this.mDiagramWidth) + this.mChartBorderWidth;
            boolean z2 = Math.abs(bVar.d - bVar2.f27236a) < PRECISION;
            if (LanguageUtil.ba(BaseApplication.getContext())) {
                float f = bVar2.f27236a;
                bVar2.f27236a = this.mViewWidth - bVar2.d;
                bVar2.d = this.mViewWidth - f;
                if (Math.abs(bVar.f27236a - bVar2.d) >= PRECISION) {
                    z = false;
                }
            } else {
                z = z2;
            }
            b currentRectSetting2 = getCurrentRectSetting(this.mEndData.e(), this.mCurrentBottom);
            bVar2.e = currentRectSetting2.e;
            bVar2.f27237b = currentRectSetting2.f27237b;
            if (!this.mIsOtherType && z) {
                setConnectionBlock(canvas, this.mCurrentData, bVar, this.mEndData, bVar2);
            }
        }
        drawCyRect(canvas, bVar);
    }

    private void drawCommonSleepRect(Canvas canvas, int i, int i2, int i3, int i4) {
        b bVar = new b();
        b bVar2 = new b();
        bVar.f27236a = ((i / 1440.0f) * this.mDiagramWidth) + this.mChartBorderWidth;
        bVar.d = ((i2 / 1440.0f) * this.mDiagramWidth) + this.mChartBorderWidth;
        b ordinaryRectSetting = getOrdinaryRectSetting(this.mCurrentData.e(), this.mCurrentBottom);
        bVar.e = ordinaryRectSetting.e;
        bVar.f27237b = ordinaryRectSetting.f27237b;
        setCurrentRectColor(this.mCurrentData.e());
        setRtlPosition(bVar);
        getTheLastData(this.mCurrentData);
        boolean z = true;
        int i5 = i4 + 1;
        if (i5 < i3) {
            uig uigVar = this.mFitnessDataList.get(i5);
            this.mEndData = uigVar;
            bVar2.f27236a = ((uigVar.b() / 1440.0f) * this.mDiagramWidth) + this.mChartBorderWidth;
            bVar2.d = ((this.mEndData.c() / 1440.0f) * this.mDiagramWidth) + this.mChartBorderWidth;
            boolean z2 = Math.abs(bVar.d - bVar2.f27236a) < PRECISION;
            if (LanguageUtil.ba(BaseApplication.getContext())) {
                float f = bVar2.f27236a;
                bVar2.f27236a = this.mViewWidth - bVar2.d;
                bVar2.d = this.mViewWidth - f;
                if (Math.abs(bVar.f27236a - bVar2.d) >= PRECISION) {
                    z = false;
                }
            } else {
                z = z2;
            }
            b ordinaryRectSetting2 = getOrdinaryRectSetting(this.mEndData.e(), this.mCurrentBottom);
            bVar2.e = ordinaryRectSetting2.e;
            bVar2.f27237b = ordinaryRectSetting2.f27237b;
            if (!this.mIsOtherType && z) {
                setConnectionBlock(canvas, this.mCurrentData, bVar, this.mEndData, bVar2);
            }
        }
        drawCyRect(canvas, bVar);
    }

    private void setRtlPosition(b bVar) {
        if (LanguageUtil.ba(BaseApplication.getContext())) {
            float f = bVar.f27236a;
            bVar.f27236a = this.mViewWidth - bVar.d;
            bVar.d = this.mViewWidth - f;
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0086  */
    /* JADX WARN: Code duplicated, block: B:30:0x008d  */
    public void drawMaxSleepVerticalLine(Canvas canvas) {
        List<uig> list;
        int i;
        int i2;
        long j;
        long j2;
        long jD;
        long jA;
        int i3;
        int i4;
        if (canvas == null || (list = this.mCopyOfFitnessDataList) == null || list.size() == 0 || this.mRemSleepTimes > 0) {
            return;
        }
        if (!this.mIsScienceSleep || this.mIsOnlyNoonSleepType) {
            if (this.mIsOnlyNoonSleepType) {
                ArrayList<uig> sleepSumList = getSleepSumList();
                LogUtil.d(TAG, "sumSleepList = ", sleepSumList.toString());
                uig maxSleepData = getMaxSleepData(sleepSumList);
                if (maxSleepData == null) {
                    return;
                }
                i = maxSleepData.n;
                i2 = maxSleepData.f50129a;
                jD = maxSleepData.d();
                jA = maxSleepData.a();
            } else {
                i = this.mStartSleepPoint;
                i2 = this.mLastNightEndPoint;
                if (this.mFitnessDataList.isEmpty()) {
                    j = 0;
                    j2 = 0;
                } else {
                    jD = this.mFitnessDataList.get(0).d();
                    List<uig> list2 = this.mFitnessDataList;
                    jA = list2.get(list2.size() - 1).a();
                }
                if (LanguageUtil.ba(BaseApplication.getContext())) {
                    i4 = 1440 - i;
                    i3 = 1440 - i2;
                } else {
                    i3 = i;
                    i4 = i2;
                }
                float f = this.mDiagramWidth;
                float f2 = this.mChartBorderWidth;
                drawStartEndTimeStr(canvas, i3, i4, ((i3 / 1440.0f) * f) + f2, ((i4 / 1440.0f) * f) + f2, j, j2);
            }
            j = jD;
            j2 = jA;
            if (LanguageUtil.ba(BaseApplication.getContext())) {
                i4 = 1440 - i;
                i3 = 1440 - i2;
            } else {
                i3 = i;
                i4 = i2;
            }
            float f3 = this.mDiagramWidth;
            float f4 = this.mChartBorderWidth;
            drawStartEndTimeStr(canvas, i3, i4, ((i3 / 1440.0f) * f3) + f4, ((i4 / 1440.0f) * f3) + f4, j, j2);
        }
    }

    public void drawCursorText(Canvas canvas) {
        if (canvas == null) {
            return;
        }
        Paint paint = new Paint();
        paint.setStrokeWidth(1.0f);
        paint.setTextSize(wud.b(10.0f));
        paint.setAntiAlias(true);
        int length = this.mTime.length;
        float[] fArr = new float[length];
        this.mCursorTextHeight = this.mCursorHeight - wud.b(4.0f);
        for (int i = 0; i < length; i++) {
            paint.setColor(this.mContext.getResources().getColor(R.color.textColorSecondary));
            paint.setTypeface(Typeface.create(this.mContext.getResources().getString(R.string.textFontFamilyRegular), 0));
            int i2 = length - 1;
            String str = this.mTime[i2];
            float fMeasureText = (int) paint.measureText(str, 0, str.length());
            setTextTransverseWidth(fArr, fMeasureText, length, i);
            setFloatText(fArr, fMeasureText, i);
            float f = this.mCursorCenter;
            float fB = wud.b(36.0f);
            float f2 = fArr[i];
            if (f - fB < (fMeasureText / 2.0f) + f2 && f2 < this.mCursorCenter + wud.b(36.0f) && this.mIsDayDetailView) {
                paint.setColor(this.mContext.getResources().getColor(R.color.textColorPrimary));
                paint.setTypeface(Typeface.create(this.mContext.getResources().getString(R.string.textFontFamilyMedium), 0));
            }
            drawCursorTextExtra(i, fArr, canvas, paint, length);
            String str2 = this.mStartDate;
            float fMeasureText2 = (int) paint.measureText(str2, 0, str2.length());
            String str3 = this.mEndDate;
            float f3 = (fMeasureText - fMeasureText2) / 2.0f;
            float fMeasureText3 = (fMeasureText - ((int) paint.measureText(str3, 0, str3.length()))) / 2.0f;
            if (i == 0) {
                canvas.drawText(this.mDate[0], fArr[i] + f3 + ((Integer) BaseActivity.getSafeRegionWidth().first).intValue(), this.mCursorTextHeight - wud.b(10.0f), paint);
            } else if (i == i2) {
                canvas.drawText(this.mDate[1], (fArr[i] + fMeasureText3) - ((Integer) BaseActivity.getSafeRegionWidth().second).intValue(), this.mCursorTextHeight - wud.b(10.0f), paint);
            } else {
                LogUtil.a(TAG, "i is not start and end");
            }
        }
    }

    private void drawCursorTextExtra(int i, float[] fArr, Canvas canvas, Paint paint, int i2) {
        if (i == 0) {
            canvas.drawText(this.mTime[i], fArr[i] + ((Integer) BaseActivity.getSafeRegionWidth().first).intValue(), this.mCursorTextHeight, paint);
        } else if (i == i2 - 1) {
            canvas.drawText(this.mTime[i], fArr[i] - ((Integer) BaseActivity.getSafeRegionWidth().second).intValue(), this.mCursorTextHeight, paint);
        } else {
            canvas.drawText(this.mTime[i], fArr[i], this.mCursorTextHeight, paint);
        }
    }

    private void setFloatText(float[] fArr, float f, int i) {
        if (i < 0) {
            return;
        }
        float f2 = fArr[i];
        float f3 = CURSOR_WIDTH_OFFSET;
        float f4 = this.mCursorCenter;
        float f5 = f2 - f3;
        if (f5 <= f4) {
            float f6 = f + f2;
            float f7 = f6 + f3;
            if (f4 <= f7 && this.mIsDayDetailView) {
                if (f6 < f4 && f4 <= f7) {
                    float f8 = CURSOR_TEXT_MINIMUM_HEIGHT + (((f7 - f4) / f3) * CURSOR_TEXT_FLOATING_OFFSET);
                    float f9 = CURSOR_TEXT_HIGHEST_HEIGHT * 2.0f;
                    if (f8 > f9) {
                        f8 = f9;
                    }
                    this.mCursorTextHeight = this.mCursorHeight - f8;
                    return;
                }
                if (f2 <= f4 && f4 <= f6) {
                    this.mCursorTextHeight = this.mCursorHeight - (CURSOR_TEXT_HIGHEST_HEIGHT * 2.0f);
                    return;
                }
                if (f5 <= f4 && f4 < f2) {
                    float f10 = CURSOR_TEXT_MINIMUM_HEIGHT + (((f4 - f5) / f3) * CURSOR_TEXT_FLOATING_OFFSET);
                    float f11 = CURSOR_TEXT_HIGHEST_HEIGHT * 2.0f;
                    if (f10 > f11) {
                        f10 = f11;
                    }
                    this.mCursorTextHeight = this.mCursorHeight - f10;
                    return;
                }
                this.mCursorTextHeight = this.mCursorHeight - CURSOR_TEXT_MINIMUM_HEIGHT;
                return;
            }
        }
        this.mCursorTextHeight = this.mCursorHeight - CURSOR_TEXT_MINIMUM_HEIGHT;
    }

    private void setTextTransverseWidth(float[] fArr, float f, int i, int i2) {
        float f2 = qrs.af(this.mContext) ? XAXIS_TEXT_OFFSET_TAHITI : XAXIS_TEXT_OFFSET_DEFAULT;
        if (i2 == 0) {
            if (this.mIsScienceSleep && !this.mIsOnlyNoonSleepType) {
                fArr[i2] = this.mCoreSleepStartX + f2;
                return;
            } else {
                fArr[i2] = wud.b(16.0f) + f2;
                return;
            }
        }
        int i3 = i - 1;
        if (i2 == i3) {
            if (this.mIsScienceSleep && !this.mIsOnlyNoonSleepType) {
                fArr[i2] = this.mCoreSleepEndX - f2;
                return;
            } else {
                fArr[i2] = ((this.mViewWidth - wud.b(16.0f)) - f) - f2;
                return;
            }
        }
        fArr[i2] = ((((this.mViewWidth - (wud.b(16.0f) * 2.0f)) - f) / i3) * i2) + wud.b(16.0f);
    }

    private void drawStartEndTimeStr(Canvas canvas, int i, int i2, float f, float f2, long j, long j2) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j);
        this.mStartHour = calendar.get(11);
        this.mStartMin = calendar.get(12);
        String time = formatTime(getTimeStr(this.mStartHour) + ":" + getTimeStr(this.mStartMin));
        calendar.setTimeInMillis(j2);
        this.mEndHour = calendar.get(11);
        this.mEndMin = calendar.get(12);
        String time2 = formatTime(getTimeStr(this.mEndHour) + ":" + getTimeStr(this.mEndMin));
        Paint paint = new Paint();
        if (this.mColorType == 1) {
            paint.setColor(this.mContext.getResources().getColor(R.color.textColorPrimary));
        } else {
            paint.setColor(this.mContext.getResources().getColor(R.color.textColorSecondary));
        }
        paint.setTextSize(qqf.b(0, this.mContext.getResources().getDimension(R.dimen.emui_text_size_caption)));
        paint.setAntiAlias(true);
        if (this.mIsScienceSleep && !this.mIsOnlyNoonSleepType) {
            canvas.drawText(time, (f - ((int) paint.measureText(time, 0, time.length()))) - this.mTimeStringMargin, this.mTimeStrY, paint);
            canvas.drawText(time2, f2 + this.mTimeStringMargin, this.mTimeStrY, paint);
        } else {
            drawCommonSleepStartEndTimeStr(canvas, paint, f, f2);
        }
    }

    private void drawCommonSleepStartEndTimeStr(Canvas canvas, Paint paint, float f, float f2) {
        String startEndTimeFormat;
        String startEndTimeFormat2;
        boolean z;
        boolean z2;
        float f3;
        if (LanguageUtil.ba(BaseApplication.getContext())) {
            startEndTimeFormat2 = getStartEndTimeFormat(this.mStartHour, this.mStartMin);
            startEndTimeFormat = getStartEndTimeFormat(this.mEndHour, this.mEndMin);
        } else {
            startEndTimeFormat = getStartEndTimeFormat(this.mStartHour, this.mStartMin);
            startEndTimeFormat2 = getStartEndTimeFormat(this.mEndHour, this.mEndMin);
        }
        float fMeasureText = (int) paint.measureText(startEndTimeFormat, 0, startEndTimeFormat.length());
        float fB = (f - fMeasureText) - this.mTimeStringMargin;
        if (0.0f >= fB - wud.b(16.0f)) {
            fB = wud.b(16.0f);
            z = true;
        } else {
            z = false;
        }
        float f4 = this.mTimeStringMargin + f2 + fMeasureText;
        if (wud.b(16.0f) + f4 > this.mViewWidth) {
            z2 = true;
        } else {
            f4 = f2 + this.mTimeStringMargin;
            z2 = false;
        }
        LogUtil.a(TAG, " tipEndX = ", Float.valueOf(f4), " tipStartX = ", Float.valueOf(fB), " startTextWidth = ", Float.valueOf(fMeasureText), " mDiagramWidth = ", Float.valueOf(this.mDiagramWidth));
        if (!z && !z2) {
            drawVerticalLine(canvas, f, 0.0f);
            drawVerticalLine(canvas, f2, 0.0f);
            canvas.drawText(startEndTimeFormat, fB, this.mTimeStrY, paint);
            canvas.drawText(startEndTimeFormat2, f4, this.mTimeStrY, paint);
        }
        String str = startEndTimeFormat + Constants.LINK + startEndTimeFormat2;
        if (z2) {
            float f5 = this.mViewWidth;
            float f6 = this.mTimeStringMargin;
            float fMeasureText2 = (int) paint.measureText(str, 0, str.length());
            canvas.drawText(startEndTimeFormat + Constants.LINK + startEndTimeFormat2, ((f5 - f6) - fMeasureText2) - wud.b(16.0f), this.mTimeStrY, paint);
            f3 = 12.0f;
            drawVerticalLine(canvas, f, 12.0f);
            drawVerticalLine(canvas, f2, 12.0f);
        } else {
            f3 = 12.0f;
        }
        if (z) {
            drawVerticalLine(canvas, f, f3);
            drawVerticalLine(canvas, f2, f3);
            canvas.drawText(startEndTimeFormat + Constants.LINK + startEndTimeFormat2, fB, this.mTimeStrY, paint);
        }
    }

    private void drawVerticalLine(Canvas canvas, float f, float f2) {
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setAntiAlias(true);
        paint.setStrokeWidth(1.0f);
        if (this.mColorType == 1) {
            paint.setColor(this.mContext.getResources().getColor(R.color.color_10a6a6a6));
        } else {
            paint.setColor(this.mContext.getResources().getColor(R.color.color_ffa6a6a6));
        }
        paint.setPathEffect(new DashPathEffect(new float[]{2.0f, 2.0f}, 0.0f));
        Path path = new Path();
        path.moveTo(f, this.mVerticalLineStartY + wud.b(f2));
        path.lineTo(f, this.mTransparentHeight);
        canvas.drawPath(path, paint);
    }

    private String getStartEndTimeFormat(int i, int i2) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(ltb.e(), ltb.c(), 1, i, i2);
        return UnitUtil.a(calendar.getTime(), 1);
    }

    private ArrayList<uig> getSleepSumList() {
        ArrayList<uig> arrayList = new ArrayList<>(16);
        for (uig uigVar : this.mCopyOfFitnessDataList) {
            if (uigVar.e() != 64) {
                if (arrayList.size() == 0) {
                    arrayList.add(uigVar);
                } else {
                    uig uigVar2 = arrayList.get(arrayList.size() - 1);
                    if (uigVar2.f50129a == uigVar.n) {
                        uigVar2.f50129a = uigVar.f50129a;
                    } else {
                        arrayList.add(uigVar);
                    }
                }
            }
        }
        return arrayList;
    }

    private void setBottomToTopLineEndColor(int i) {
        switch (i) {
            case 65:
                if (this.mColorType == 1) {
                    this.mEndConnectionColor = this.mContext.getResources().getColor(R.color.color_108e31f2);
                } else {
                    this.mEndConnectionColor = this.mContext.getResources().getColor(R.color.color_ff8e31f2);
                }
                break;
            case 66:
                if (this.mColorType == 1) {
                    this.mEndConnectionColor = this.mContext.getResources().getColor(R.color.color_10d53bcb);
                } else {
                    this.mEndConnectionColor = this.mContext.getResources().getColor(R.color.color_ffd53bcb);
                }
                break;
            case 67:
                if (this.mColorType == 1) {
                    this.mEndConnectionColor = this.mContext.getResources().getColor(R.color.color_10fdc221);
                } else {
                    this.mEndConnectionColor = this.mContext.getResources().getColor(R.color.color_fffdc221);
                }
                break;
            case 68:
                if (this.mColorType == 1) {
                    this.mEndConnectionColor = this.mContext.getResources().getColor(R.color.color_10fc877b);
                } else {
                    this.mEndConnectionColor = this.mContext.getResources().getColor(R.color.color_fffc877b);
                }
                break;
            case 69:
                setNoonSleepEndConnectionLineColor();
                break;
        }
    }

    private void setBottomToTopLineStartColor(int i) {
        switch (i) {
            case 65:
                if (this.mColorType == 1) {
                    this.mStartConnectionColor = this.mContext.getResources().getColor(R.color.color_108e31f2);
                } else {
                    this.mStartConnectionColor = this.mContext.getResources().getColor(R.color.color_ff8e31f2);
                }
                break;
            case 66:
                if (this.mColorType == 1) {
                    this.mStartConnectionColor = this.mContext.getResources().getColor(R.color.color_10cb2cdd);
                } else {
                    this.mStartConnectionColor = this.mContext.getResources().getColor(R.color.color_ffcb2cdd);
                }
                break;
            case 67:
                setAwakeSleepStartConnectionLineColor();
                break;
            case 68:
                if (this.mColorType == 1) {
                    this.mStartConnectionColor = this.mContext.getResources().getColor(R.color.color_10f4748f);
                } else {
                    this.mStartConnectionColor = this.mContext.getResources().getColor(R.color.color_fff4748f);
                }
                break;
            case 69:
                setNoonSleepStartConnectionLineColor();
                break;
        }
    }

    private void setAwakeSleepStartConnectionLineColor() {
        if (this.mColorType == 1) {
            this.mStartConnectionColor = this.mContext.getResources().getColor(R.color.color_10fdc221);
        } else {
            this.mStartConnectionColor = this.mContext.getResources().getColor(R.color.color_fffdc221);
        }
    }

    private void setNoonSleepStartConnectionLineColor() {
        if (this.mColorType == 1) {
            this.mStartConnectionColor = this.mContext.getResources().getColor(R.color.color_104490c4);
        } else {
            this.mStartConnectionColor = this.mContext.getResources().getColor(R.color.color_ff4490c4);
        }
    }

    private void setBottomToTopEndColor(int i) {
        switch (i) {
            case 65:
                setDeepSleepGradientColor();
                break;
            case 66:
                if (this.mColorType == 1) {
                    this.mStartLineRectColor = this.mContext.getResources().getColor(R.color.color_05c12de0);
                    this.mEndLineRectColor = this.mContext.getResources().getColor(R.color.color_05cb2cdd);
                } else {
                    this.mStartLineRectColor = this.mContext.getResources().getColor(R.color.color_ffc12de0);
                    this.mEndLineRectColor = this.mContext.getResources().getColor(R.color.pie_sector_shallow_sleep_color_end);
                }
                break;
            case 67:
                setAwakeSleepGradientColor();
                break;
            case 68:
                if (this.mColorType == 1) {
                    this.mStartLineRectColor = this.mContext.getResources().getColor(R.color.color_05f06c9a);
                    this.mEndLineRectColor = this.mContext.getResources().getColor(R.color.color_05f4748f);
                } else {
                    this.mStartLineRectColor = this.mContext.getResources().getColor(R.color.color_fff06c9a);
                    this.mEndLineRectColor = this.mContext.getResources().getColor(R.color.color_fff4748f);
                }
                break;
            case 69:
                setNoonSleepGradientColor();
                break;
            default:
                setDefaultLineRectColor();
                break;
        }
    }

    private void setDefaultLineRectColor() {
        this.mStartLineRectColor = this.mContext.getResources().getColor(R.color.common_transparent);
        this.mEndLineRectColor = this.mContext.getResources().getColor(R.color.common_transparent);
    }

    private void setAwakeSleepGradientColor() {
        if (this.mColorType == 1) {
            this.mStartLineRectColor = this.mContext.getResources().getColor(R.color.color_05fdb239);
            this.mEndLineRectColor = this.mContext.getResources().getColor(R.color.color_05fdba2b);
        } else {
            this.mStartLineRectColor = this.mContext.getResources().getColor(R.color.color_fffdb239);
            this.mEndLineRectColor = this.mContext.getResources().getColor(R.color.color_fffdba2b);
        }
    }

    private void drawConnectionLine(Canvas canvas, float f, float f2, float f3, float f4) {
        Paint paint = new Paint();
        LinearGradient linearGradient = new LinearGradient(f, f2, f, f4, this.mStartConnectionColor, this.mEndConnectionColor, Shader.TileMode.MIRROR);
        paint.setStrokeWidth(1.0f);
        paint.setShader(linearGradient);
        paint.setAntiAlias(true);
        canvas.drawLine(f, f2, f3, f4, paint);
    }

    private void drawLineArc(Canvas canvas, a aVar) {
        Paint paint = new Paint();
        paint.setColor(getResources().getColor(R.color.colorBackground));
        paint.setStrokeWidth(1.0f);
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        canvas.drawArc(new RectF(aVar.f27235c, aVar.d, aVar.i, aVar.e), aVar.f27233a, aVar.f27234b, true, paint);
    }

    private void setBottomToTopStartColor(int i) {
        switch (i) {
            case 65:
                if (this.mColorType == 1) {
                    this.mStartLineRectColor = this.mContext.getResources().getColor(R.color.color_059330f0);
                    this.mEndLineRectColor = this.mContext.getResources().getColor(R.color.color_059d30ed);
                } else {
                    this.mStartLineRectColor = this.mContext.getResources().getColor(R.color.color_ff9330f0);
                    this.mEndLineRectColor = this.mContext.getResources().getColor(R.color.color_ff9d30ed);
                }
                break;
            case 66:
                if (this.mColorType == 1) {
                    this.mStartLineRectColor = this.mContext.getResources().getColor(R.color.color_05d53bcb);
                    this.mEndLineRectColor = this.mContext.getResources().getColor(R.color.color_05db45c2);
                } else {
                    this.mStartLineRectColor = this.mContext.getResources().getColor(R.color.color_ffd53bcb);
                    this.mEndLineRectColor = this.mContext.getResources().getColor(R.color.color_ffdb45c2);
                }
                break;
            case 67:
                setAwakeSleepRoundGradientColor();
                break;
            case 68:
                if (this.mColorType == 1) {
                    this.mStartLineRectColor = this.mContext.getResources().getColor(R.color.color_05fc877b);
                    this.mEndLineRectColor = this.mContext.getResources().getColor(R.color.color_05fc8f6e);
                } else {
                    this.mStartLineRectColor = this.mContext.getResources().getColor(R.color.color_fffc877b);
                    this.mEndLineRectColor = this.mContext.getResources().getColor(R.color.color_fffc8f6e);
                }
                break;
            case 69:
                setNoonSleepGradientColor();
                break;
            default:
                setDefaultLineRectColor();
                break;
        }
    }

    private void setAwakeSleepRoundGradientColor() {
        if (this.mColorType == 1) {
            this.mStartLineRectColor = this.mContext.getResources().getColor(R.color.color_05fdba2b);
            this.mEndLineRectColor = this.mContext.getResources().getColor(R.color.color_05fdb239);
        } else {
            this.mStartLineRectColor = this.mContext.getResources().getColor(R.color.color_fffdba2b);
            this.mEndLineRectColor = this.mContext.getResources().getColor(R.color.color_fffdb239);
        }
    }

    private void setTopToBottomLineEndColor(int i) {
        switch (i) {
            case 65:
                if (this.mColorType == 1) {
                    this.mEndConnectionColor = this.mContext.getResources().getColor(R.color.color_109d30ed);
                } else {
                    this.mEndConnectionColor = this.mContext.getResources().getColor(R.color.color_ff9d30ed);
                }
                break;
            case 66:
                if (this.mColorType == 1) {
                    this.mEndConnectionColor = this.mContext.getResources().getColor(R.color.color_10cb2cdd);
                } else {
                    this.mEndConnectionColor = this.mContext.getResources().getColor(R.color.color_ffcb2cdd);
                }
                break;
            case 67:
                if (this.mColorType == 1) {
                    this.mEndConnectionColor = this.mContext.getResources().getColor(R.color.color_10fdb632);
                } else {
                    this.mEndConnectionColor = this.mContext.getResources().getColor(R.color.color_fffdb632);
                }
                break;
            case 68:
                if (this.mColorType == 1) {
                    this.mEndConnectionColor = this.mContext.getResources().getColor(R.color.color_10f4748f);
                } else {
                    this.mEndConnectionColor = this.mContext.getResources().getColor(R.color.color_fff4748f);
                }
                break;
            case 69:
                setNoonSleepEndConnectionLineColor();
                break;
        }
    }

    private void setNoonSleepEndConnectionLineColor() {
        if (this.mColorType == 1) {
            this.mEndConnectionColor = this.mContext.getResources().getColor(R.color.color_10008fff);
        } else {
            this.mEndConnectionColor = this.mContext.getResources().getColor(R.color.color_ff008fff);
        }
    }

    private void setTopToBottomLineStartColor(int i) {
        switch (i) {
            case 65:
                if (this.mColorType == 1) {
                    this.mStartConnectionColor = this.mContext.getResources().getColor(R.color.color_109831ef);
                } else {
                    this.mStartConnectionColor = this.mContext.getResources().getColor(R.color.color_ff9831ef);
                }
                break;
            case 66:
                if (this.mColorType == 1) {
                    this.mStartConnectionColor = this.mContext.getResources().getColor(R.color.color_10d53bcb);
                } else {
                    this.mStartConnectionColor = this.mContext.getResources().getColor(R.color.color_ffd53bcb);
                }
                break;
            case 67:
                setAwakeSleepStartConnectionLineColor();
                break;
            case 68:
                if (this.mColorType == 1) {
                    this.mStartConnectionColor = this.mContext.getResources().getColor(R.color.color_10fc877b);
                } else {
                    this.mStartConnectionColor = this.mContext.getResources().getColor(R.color.color_fffc877b);
                }
                break;
            case 69:
                setNoonSleepStartConnectionLineColor();
                break;
        }
    }

    private void setTopToBottomEndColor(int i) {
        switch (i) {
            case 65:
                setDeepSleepGradientColor();
                break;
            case 66:
                if (this.mColorType == 1) {
                    this.mStartLineRectColor = this.mContext.getResources().getColor(R.color.color_05db45c2);
                    this.mEndLineRectColor = this.mContext.getResources().getColor(R.color.color_05d53bcb);
                } else {
                    this.mStartLineRectColor = this.mContext.getResources().getColor(R.color.color_ffdb45c2);
                    this.mEndLineRectColor = this.mContext.getResources().getColor(R.color.color_ffd53bcb);
                }
                break;
            case 67:
                setAwakeSleepGradientColor();
                break;
            case 68:
                if (this.mColorType == 1) {
                    this.mStartLineRectColor = this.mContext.getResources().getColor(R.color.color_05fc8f6e);
                    this.mEndLineRectColor = this.mContext.getResources().getColor(R.color.color_05fc877b);
                } else {
                    this.mStartLineRectColor = this.mContext.getResources().getColor(R.color.color_fffc8f6e);
                    this.mEndLineRectColor = this.mContext.getResources().getColor(R.color.color_fffc877b);
                }
                break;
            case 69:
                setNoonSleepGradientColor();
                break;
            default:
                setDefaultLineRectColor();
                break;
        }
    }

    private void setNoonSleepGradientColor() {
        if (this.mColorType == 1) {
            this.mStartLineRectColor = this.mContext.getResources().getColor(R.color.color_054490c4);
            this.mEndLineRectColor = this.mContext.getResources().getColor(R.color.color_05008fff);
        } else {
            this.mStartLineRectColor = this.mContext.getResources().getColor(R.color.color_ff4490c4);
            this.mEndLineRectColor = this.mContext.getResources().getColor(R.color.color_ff008fff);
        }
    }

    private void setDeepSleepGradientColor() {
        if (this.mColorType == 1) {
            this.mStartLineRectColor = this.mContext.getResources().getColor(R.color.color_059d30ed);
            this.mEndLineRectColor = this.mContext.getResources().getColor(R.color.color_059330f0);
        } else {
            this.mStartLineRectColor = this.mContext.getResources().getColor(R.color.color_ff9d30ed);
            this.mEndLineRectColor = this.mContext.getResources().getColor(R.color.color_ff9330f0);
        }
    }

    private void drawLineRect(Canvas canvas, float f, float f2, float f3, float f4) {
        Paint paint = new Paint();
        LinearGradient linearGradient = new LinearGradient(f, f3, f, f4, this.mStartLineRectColor, this.mEndLineRectColor, Shader.TileMode.MIRROR);
        paint.setStrokeWidth(1.0f);
        paint.setAntiAlias(true);
        paint.setShader(linearGradient);
        canvas.drawRect(f, f2, f3, f4, paint);
    }

    private void setTopToBottomStartColor(int i) {
        switch (i) {
            case 65:
                setDeepSleepGradientColor();
                break;
            case 66:
                if (this.mColorType == 1) {
                    this.mStartLineRectColor = this.mContext.getResources().getColor(R.color.color_05cb2cdd);
                    this.mEndLineRectColor = this.mContext.getResources().getColor(R.color.color_05c12de0);
                } else {
                    this.mStartLineRectColor = this.mContext.getResources().getColor(R.color.color_ffcb2cdd);
                    this.mEndLineRectColor = this.mContext.getResources().getColor(R.color.pie_sector_shallow_sleep_color_end);
                }
                break;
            case 67:
                setAwakeSleepRoundGradientColor();
                break;
            case 68:
                if (this.mColorType == 1) {
                    this.mStartLineRectColor = this.mContext.getResources().getColor(R.color.color_05f4748f);
                    this.mEndLineRectColor = this.mContext.getResources().getColor(R.color.color_05f06c9a);
                } else {
                    this.mStartLineRectColor = this.mContext.getResources().getColor(R.color.color_fff4748f);
                    this.mEndLineRectColor = this.mContext.getResources().getColor(R.color.color_fff06c9a);
                }
                break;
            case 69:
                setNoonSleepGradientColor();
                break;
            default:
                setDefaultLineRectColor();
                break;
        }
    }

    public b getOnlyNoonRectSetting(int i, float f) {
        float fB = wud.b(20.0f);
        float fB2 = this.mDiagramHeight - wud.b(20.0f);
        this.mIsOtherType = false;
        b bVar = new b();
        if (i == 67) {
            bVar.e = fB;
            bVar.f27237b = fB + (fB2 * 0.19f);
            return bVar;
        }
        if (i == 69) {
            bVar.e = wud.b(20.0f) + (fB2 * 0.38f);
            bVar.f27237b = (wud.b(20.0f) * 3.0f) + ((f - fB) * 0.62f);
            return bVar;
        }
        this.mIsOtherType = true;
        return bVar;
    }

    private b getCurrentRectSetting(int i, float f) {
        float fB = wud.b(6.8f);
        this.mIsOtherType = false;
        b bVar = new b();
        switch (i) {
            case 65:
                float f2 = fB + ((f - fB) * 0.75f);
                bVar.e = f2;
                bVar.f27237b = f2 + wud.b(25.5f);
                break;
            case 66:
                float f3 = fB + ((f - fB) * 0.5f);
                bVar.e = f3;
                bVar.f27237b = f3 + wud.b(25.5f);
                break;
            case 67:
                bVar.e = fB;
                bVar.f27237b = fB + wud.b(25.5f);
                break;
            case 68:
                float f4 = fB + ((f - fB) * 0.25f);
                bVar.e = f4;
                bVar.f27237b = f4 + wud.b(25.5f);
                break;
            default:
                this.mIsOtherType = true;
                break;
        }
        return bVar;
    }

    private b getOrdinaryRectSetting(int i, float f) {
        float fB = wud.b(20.0f);
        this.mIsOtherType = false;
        b bVar = new b();
        switch (i) {
            case 65:
                float f2 = fB + ((f - fB) * 0.66f);
                bVar.e = f2;
                bVar.f27237b = f2 + wud.b(32.0f);
                break;
            case 66:
                float f3 = fB + ((f - fB) * 0.33f);
                bVar.e = f3;
                bVar.f27237b = f3 + wud.b(32.0f);
                break;
            case 67:
                bVar.e = fB;
                bVar.f27237b = fB + wud.b(32.0f);
                break;
            default:
                this.mIsOtherType = true;
                break;
        }
        return bVar;
    }

    private void setConnectionBlock(Canvas canvas, uig uigVar, b bVar, uig uigVar2, b bVar2) {
        if (bVar.f27237b - bVar2.f27237b < 0.0f) {
            setTopToBottomConnectionBlock(canvas, uigVar, bVar, uigVar2, bVar2);
        } else {
            setBottomToTopConnectionBlock(canvas, uigVar, bVar, uigVar2, bVar2);
        }
    }

    private void setBottomToTopConnectionBlock(Canvas canvas, uig uigVar, b bVar, uig uigVar2, b bVar2) {
        float fB;
        float fB2;
        float fB3 = wud.b(6.0f);
        float fB4 = wud.b(1.0f);
        if (bVar.d - bVar.f27236a < fB3) {
            fB = (bVar.d - bVar.f27236a) / 2.0f;
        } else {
            fB = wud.b(3.0f);
        }
        float f = fB;
        setBottomToTopStartColor(uigVar.e());
        if (LanguageUtil.ba(BaseApplication.getContext())) {
            drawLineRect(canvas, bVar.f27236a, (bVar.e - f) + fB4, bVar.f27236a + f, bVar.e + f);
            drawArc5(canvas, bVar, fB4, f);
        } else {
            float f2 = bVar.d;
            drawLineRect(canvas, f2 - f, (bVar.e - f) + fB4, bVar.d, bVar.e + f);
            drawArc6(canvas, bVar, fB4, f);
        }
        if (bVar2.d - bVar2.f27236a < fB3) {
            fB2 = (bVar2.d - bVar2.f27236a) / 2.0f;
        } else {
            fB2 = wud.b(3.0f);
        }
        float f3 = fB2;
        setBottomToTopEndColor(uigVar2.e());
        setBottomToTopLineStartColor(uigVar.e());
        setBottomToTopLineEndColor(uigVar2.e());
        if (LanguageUtil.ba(BaseApplication.getContext())) {
            float f4 = bVar2.d;
            drawLineRect(canvas, f4 - f3, bVar2.f27237b - f3, bVar2.d, bVar2.f27237b + f3);
            drawArc7(canvas, bVar2, fB4, f3);
            drawConnectionLine(canvas, bVar.f27236a, (bVar.f27237b - f3) - fB4, bVar.f27236a, bVar2.e + f3 + fB4);
            return;
        }
        drawLineRect(canvas, bVar2.f27236a, bVar2.f27237b - f3, bVar2.f27236a + f3, (bVar2.f27237b + f3) - fB4);
        drawArc8(canvas, bVar2, fB4, f3);
        drawConnectionLine(canvas, bVar.d, (bVar.f27237b - f3) - fB4, bVar.d, bVar2.e + f3 + fB4);
    }

    private void drawArc5(Canvas canvas, b bVar, float f, float f2) {
        a aVar = new a();
        aVar.f27235c = bVar.f27236a;
        float f3 = f2 * 2.0f;
        aVar.d = bVar.e - f3;
        aVar.i = bVar.f27236a + f3 + f;
        aVar.e = bVar.e;
        aVar.f27233a = 180.0f;
        aVar.f27234b = -90.0f;
        drawLineArc(canvas, aVar);
    }

    private void drawArc6(Canvas canvas, b bVar, float f, float f2) {
        a aVar = new a();
        float f3 = f2 * 2.0f;
        aVar.f27235c = bVar.d - (f + f3);
        aVar.d = bVar.e - f3;
        aVar.i = bVar.d;
        aVar.e = bVar.e;
        aVar.f27233a = 0.0f;
        aVar.f27234b = 90.0f;
        drawLineArc(canvas, aVar);
    }

    private void drawArc7(Canvas canvas, b bVar, float f, float f2) {
        a aVar = new a();
        float f3 = f2 * 2.0f;
        aVar.f27235c = (bVar.d - f3) + f;
        aVar.d = bVar.f27237b;
        aVar.i = bVar.d;
        aVar.e = bVar.f27237b + f3;
        aVar.f27233a = 0.0f;
        aVar.f27234b = -90.0f;
        drawLineArc(canvas, aVar);
    }

    private void drawArc8(Canvas canvas, b bVar, float f, float f2) {
        a aVar = new a();
        aVar.f27235c = bVar.f27236a;
        aVar.d = bVar.f27237b;
        float f3 = f2 * 2.0f;
        aVar.i = bVar.f27236a + f + f3;
        aVar.e = bVar.f27237b + f3;
        aVar.f27233a = 180.0f;
        aVar.f27234b = 90.0f;
        drawLineArc(canvas, aVar);
    }

    private void setTopToBottomConnectionBlock(Canvas canvas, uig uigVar, b bVar, uig uigVar2, b bVar2) {
        float fB;
        float fB2;
        float fB3 = wud.b(6.0f);
        float fB4 = wud.b(1.0f);
        if (bVar.d - bVar.f27236a < fB3) {
            fB = (bVar.d - bVar.f27236a) / 2.0f;
        } else {
            fB = wud.b(3.0f);
        }
        float f = fB;
        setTopToBottomStartColor(uigVar.e());
        if (LanguageUtil.ba(BaseApplication.getContext())) {
            drawLineRect(canvas, bVar.f27236a, bVar.f27237b - f, bVar.f27236a + f, bVar.f27237b + f);
            drawArc1(canvas, bVar, fB4, f);
        } else {
            float f2 = bVar.d;
            drawLineRect(canvas, f2 - f, bVar.f27237b - f, bVar.d, (bVar.f27237b + f) - fB4);
            drawArc2(canvas, bVar, fB4, f);
        }
        if (bVar2.d - bVar2.f27236a < fB3) {
            fB2 = (bVar2.d - bVar2.f27236a) / 2.0f;
        } else {
            fB2 = wud.b(3.0f);
        }
        float f3 = fB2;
        setTopToBottomEndColor(uigVar2.e());
        setTopToBottomLineStartColor(uigVar.e());
        setTopToBottomLineEndColor(uigVar2.e());
        if (LanguageUtil.ba(BaseApplication.getContext())) {
            float f4 = bVar2.d;
            drawLineRect(canvas, f4 - f3, (bVar2.e - f3) + fB4, bVar2.d, bVar2.e + f3);
            drawArc3(canvas, bVar2, fB4, f3);
            drawConnectionLine(canvas, bVar.f27236a, bVar.e + f3 + fB4, bVar.f27236a, (bVar2.f27237b - f3) - fB4);
            return;
        }
        drawLineRect(canvas, bVar2.f27236a, (bVar2.e - f3) + fB4, bVar2.f27236a + f3, bVar2.e + f3);
        drawArc4(canvas, bVar2, fB4, f3);
        drawConnectionLine(canvas, bVar.d, bVar.e + f3 + fB4, bVar.d, (bVar2.f27237b - f3) - fB4);
    }

    private void drawArc1(Canvas canvas, b bVar, float f, float f2) {
        a aVar = new a();
        aVar.f27235c = bVar.f27236a;
        aVar.d = bVar.f27237b;
        float f3 = f2 * 2.0f;
        aVar.i = bVar.f27236a + f + f3;
        aVar.e = bVar.f27237b + f3;
        aVar.f27233a = 180.0f;
        aVar.f27234b = 90.0f;
        drawLineArc(canvas, aVar);
    }

    private void drawArc2(Canvas canvas, b bVar, float f, float f2) {
        a aVar = new a();
        float f3 = f2 * 2.0f;
        aVar.f27235c = bVar.d - (f + f3);
        aVar.d = bVar.f27237b;
        aVar.i = bVar.d;
        aVar.e = bVar.f27237b + f3;
        aVar.f27233a = 0.0f;
        aVar.f27234b = -90.0f;
        drawLineArc(canvas, aVar);
    }

    private void drawArc3(Canvas canvas, b bVar, float f, float f2) {
        a aVar = new a();
        float f3 = f2 * 2.0f;
        aVar.f27235c = bVar.d - (f + f3);
        aVar.d = bVar.e - f3;
        aVar.i = bVar.d;
        aVar.e = bVar.e;
        aVar.f27233a = 0.0f;
        aVar.f27234b = 90.0f;
        drawLineArc(canvas, aVar);
    }

    private void drawArc4(Canvas canvas, b bVar, float f, float f2) {
        a aVar = new a();
        aVar.f27235c = bVar.f27236a;
        float f3 = f2 * 2.0f;
        aVar.d = bVar.e - f3;
        aVar.i = bVar.f27236a + f3 + f;
        aVar.e = bVar.e;
        aVar.f27233a = 180.0f;
        aVar.f27234b = -90.0f;
        drawLineArc(canvas, aVar);
    }

    private void setCurrentRectColor(int i) {
        if (i == 700) {
            if (this.mColorType == 1) {
                this.mStartCyColor = this.mContext.getResources().getColor(R.color.color_10fdc221);
                this.mEndCyColor = this.mContext.getResources().getColor(R.color.color_10fdc221);
                return;
            } else {
                this.mStartCyColor = this.mContext.getResources().getColor(R.color.color_fffdc221);
                this.mEndCyColor = this.mContext.getResources().getColor(R.color.color_fffdc221);
                return;
            }
        }
        if (i != 710) {
            switch (i) {
                case 65:
                    setCurrentRectDeepColor();
                    break;
                case 66:
                    setCurrentRectLightColor();
                    break;
                case 67:
                    setCurrentRectAwakeColor();
                    break;
                case 68:
                    setCurrentRectRemColor();
                    break;
                case 69:
                    if (this.mColorType == 1) {
                        this.mStartCyColor = this.mContext.getResources().getColor(R.color.color_104490c4);
                        this.mEndCyColor = this.mContext.getResources().getColor(R.color.color_10008fff);
                    } else {
                        this.mStartCyColor = this.mContext.getResources().getColor(R.color.color_ff4490c4);
                        this.mEndCyColor = this.mContext.getResources().getColor(R.color.color_ff008fff);
                    }
                    break;
                default:
                    this.mStartCyColor = this.mContext.getResources().getColor(R.color.common_transparent);
                    this.mEndCyColor = this.mContext.getResources().getColor(R.color.common_transparent);
                    break;
            }
            return;
        }
        if (this.mColorType == 1) {
            this.mStartCyColor = this.mContext.getResources().getColor(R.color.color_10008fff);
            this.mEndCyColor = this.mContext.getResources().getColor(R.color.color_10008fff);
        } else {
            this.mStartCyColor = this.mContext.getResources().getColor(R.color.color_ff008fff);
            this.mEndCyColor = this.mContext.getResources().getColor(R.color.color_ff008fff);
        }
    }

    private void setCurrentRectDeepColor() {
        if (this.mColorType == 1) {
            this.mStartCyColor = this.mContext.getResources().getColor(R.color.color_109831ef);
            this.mEndCyColor = this.mContext.getResources().getColor(R.color.color_108e31f2);
        } else {
            this.mStartCyColor = this.mContext.getResources().getColor(R.color.color_ff9831ef);
            this.mEndCyColor = this.mContext.getResources().getColor(R.color.color_ff8e31f2);
        }
    }

    private void setCurrentRectLightColor() {
        if (this.mColorType == 1) {
            this.mStartCyColor = this.mContext.getResources().getColor(R.color.color_10d840c7);
            this.mEndCyColor = this.mContext.getResources().getColor(R.color.color_10c62cde);
        } else {
            this.mStartCyColor = this.mContext.getResources().getColor(R.color.color_ffd840c7);
            this.mEndCyColor = this.mContext.getResources().getColor(R.color.pie_sector_shallow_sleep_color_end);
        }
    }

    private void setCurrentRectRemColor() {
        if (this.mColorType == 1) {
            this.mStartCyColor = this.mContext.getResources().getColor(R.color.color_10fd8b75);
            this.mEndCyColor = this.mContext.getResources().getColor(R.color.color_10f27095);
        } else {
            this.mStartCyColor = this.mContext.getResources().getColor(R.color.color_fffd8b75);
            this.mEndCyColor = this.mContext.getResources().getColor(R.color.color_fff27095);
        }
    }

    private void setCurrentRectAwakeColor() {
        if (this.mColorType == 1) {
            this.mStartCyColor = this.mContext.getResources().getColor(R.color.color_10fdc221);
            this.mEndCyColor = this.mContext.getResources().getColor(R.color.color_10fdb632);
        } else {
            this.mStartCyColor = this.mContext.getResources().getColor(R.color.color_fffdc221);
            this.mEndCyColor = this.mContext.getResources().getColor(R.color.color_fffdb632);
        }
    }

    private void drawCyRect(Canvas canvas, b bVar) {
        Paint paint = new Paint();
        paint.setShader(new LinearGradient(bVar.f27236a, bVar.e, bVar.f27236a, bVar.f27237b, this.mStartCyColor, this.mEndCyColor, Shader.TileMode.MIRROR));
        paint.setAntiAlias(true);
        paint.setStrokeWidth(1.0f);
        canvas.drawRoundRect(new RectF(bVar.f27236a, bVar.e, bVar.d, bVar.f27237b), wud.b(3.0f), wud.b(3.0f), paint);
    }

    private uig getMaxSleepData(ArrayList<uig> arrayList) {
        if (arrayList == null || arrayList.size() == 0) {
            return null;
        }
        uig uigVar = arrayList.get(0);
        for (uig uigVar2 : arrayList) {
            if (uigVar2.f50129a - uigVar2.n > uigVar.f50129a - uigVar.n) {
                uigVar = uigVar2;
            }
        }
        return uigVar;
    }

    private void getTheLastData(uig uigVar) {
        boolean z = uigVar.e() == 67 || uigVar.e() == 68;
        boolean z2 = uigVar.e() == 66 || uigVar.e() == 69 || uigVar.e() == 65;
        if (z || z2) {
            this.mLastData = uigVar;
        } else {
            this.mLastData = null;
        }
    }

    private String dateToString(Date date) {
        return new SimpleDateFormat(DateFormat.getBestDateTimePattern(Locale.getDefault(), "MM/dd")).format(date);
    }

    public String formatTime(String str) {
        try {
            return UnitUtil.a(new SimpleDateFormat("HH:mm").parse(str), 129);
        } catch (ParseException unused) {
            LogUtil.a(TAG, "formatTime.ParseException");
            return str;
        }
    }

    public String getTimeStr(int i) {
        if (i >= 10) {
            return Integer.toString(i);
        }
        return "0" + Integer.toString(i);
    }

    private List<String> getChartLabels() {
        ArrayList arrayList = new ArrayList(5);
        Calendar calendar = Calendar.getInstance();
        calendar.set(ltb.e(), ltb.c(), 1, 20, 0);
        arrayList.add(UnitUtil.a(calendar.getTime(), 129));
        calendar.set(ltb.e(), ltb.c(), 1, 2, 0);
        arrayList.add(UnitUtil.a(calendar.getTime(), 129));
        calendar.set(ltb.e(), ltb.c(), 1, 8, 0);
        arrayList.add(UnitUtil.a(calendar.getTime(), 129));
        calendar.set(ltb.e(), ltb.c(), 1, 14, 0);
        arrayList.add(UnitUtil.a(calendar.getTime(), 129));
        calendar.set(ltb.e(), ltb.c(), 1, 20, 0);
        arrayList.add(UnitUtil.a(calendar.getTime(), 129));
        return arrayList;
    }
}
