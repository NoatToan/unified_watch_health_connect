package com.huawei.health.knit.section.chart;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import androidx.core.view.ViewCompat;
import com.huawei.health.servicesui.R;
import com.huawei.hwcommonmodel.accessibility.AbstractTouchNode;
import com.huawei.hwcommonmodel.accessibility.ChartTouchHelper;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.utils.DateFormatUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.ui.commonui.base.BaseActivity;
import defpackage.fqg;
import defpackage.fra;
import defpackage.ftj;
import defpackage.lrd;
import defpackage.lrm;
import defpackage.lrn;
import defpackage.lsl;
import defpackage.ltb;
import defpackage.njy;
import defpackage.qqf;
import defpackage.qre;
import defpackage.qrs;
import health.compact.a.LanguageUtil;
import health.compact.a.UnitUtil;
import java.lang.ref.WeakReference;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public abstract class BaseSleepDayDetailView extends View {
    private static final int ARRAY_COLLECTION_FOUR_INDEX = 2;
    private static final int ARRAY_COLLECTION_TWO_INDEX = 2;
    private static final String COLON = ":";
    public static final int DATA_TOP = 24;
    private static final int DEFALUT_TIME_VALUE = -1;
    private static final int END_POINT = 1440;
    public static final int FIRST_BED_AND_SLEEP = 2;
    public static final int FIRST_BED_AND_SLEEP_AND_BED = 3;
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
    private static final float HALF_PAST_ONE = 1.5f;
    public static final int HOUR_IN_DAY = 24;
    public static final int LAST_BED_AND_SLEEP_AND_BED = 5;
    public static final int LAST_SLEEP_AND_BED = 4;
    public static final float MINS_IN_DAY = 1440.0f;
    public static final int MINS_IN_HOUR = 60;
    private static final float PRECISION = 1.0E-7f;
    private static final float RTL_EXTRA_BOTTOM_TO_TOP = 2.0f;
    private static final float RTL_EXTRA_LEFT = 4.2f;
    private static final float RTL_EXTRA_TOP_TO_BOTTOM = 2.0f;
    public static final int SLEEP_CHART_COLOR_TYPE = 1;
    public static final int SLEEP_START_END_HOUR = 20;
    private static final String TAG = "BaseSleepDayDetailView";
    private static final String TAG_RELEASE = "R_Sleep_BaseSleepDayDetailView";
    private static final int THREE_TIMES = 3;
    private static final int TWO_TIMES_INT = 2;
    private static final int ZERO_POINT = 0;
    private final a mAccessibilityListerner;
    private String mBedDate;
    private float mBedSleepStartX;
    private String mBedText;
    protected Canvas mCanvas;
    private float mChartBorderWidth;
    private List<String> mChartLabels;
    private int mColorType;
    private Context mContext;
    private List<fra> mCopyOfFitnessDataList;
    private float mCoreSleepEndX;
    private float mCoreSleepStartX;
    private float mCurrentBottom;
    private fra mCurrentData;
    private Date mCurrentDay;
    private float mCursorCenter;
    private float mCursorHeight;
    protected int mCursorInBedState;
    private ArrayList<fqg> mCursorList;
    private int mCursorSleep;
    private long mCursorSleepTime;
    private float mCursorTextHeight;
    private int mCursorWake;
    private long mCursorWakeTime;
    private String[] mDate;
    private float mDiagramHeight;
    private float mDiagramWidth;
    private int mEndConnectionColor;
    private int mEndCyColor;
    private fra mEndData;
    private String mEndDate;
    private int mEndHour;
    private int mEndLineRectColor;
    private int mEndMin;
    private String mEndText;
    private long mFallAsleepTime;
    private List<fra> mFitnessDataList;
    private long mGoBedTime;
    private ChartTouchHelper mHelper;
    private boolean mIsCommonSleep;
    private boolean mIsDayDetailView;
    private boolean mIsDefault;
    protected boolean mIsManual;
    private boolean mIsManualAndIncomplete;
    protected boolean mIsManualAndOnlyBed;
    private boolean mIsMove;
    private boolean mIsMultiSleep;
    private boolean mIsOnlyNoonSleepType;
    private boolean mIsOtherType;
    protected boolean mIsPhone;
    private boolean mIsScienceSleep;
    private boolean mIsSupportBedTime;
    private fra mLastData;
    private int mLastNightEndPoint;
    private ArrayList<fra> mManualCursorList;
    private int mNightEndPoint;
    private int mNightStartPoint;
    private long mOffBedTime;
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
    private String mUpDate;
    private float mUpSleepEndX;
    private String mUpText;
    private float mVerticalLineStartY;
    private float mViewHeight;
    private float mViewWidth;
    private long mWakeUpTime;
    private static final float XAXIS_TEXT_OFFSET_DEFAULT = ftj.d(8.0f);
    private static final float XAXIS_TEXT_OFFSET_TAHITI = ftj.d(16.0f);
    private static final float CURSOR_TEXT_MINIMUM_HEIGHT = ftj.d(4.0f);
    private static final float CURSOR_TEXT_HIGHEST_HEIGHT = ftj.d(11.5f);
    private static final float CURSOR_TEXT_FLOATING_OFFSET = ftj.d(19.0f);
    private static final float CURSOR_WIDTH_OFFSET = ftj.d(36.0f);

    public BaseSleepDayDetailView(Context context) {
        super(context);
        this.mRemSleepTimes = 0;
        this.mNightStartPoint = 0;
        this.mNightEndPoint = 0;
        this.mLastNightEndPoint = 0;
        this.mStartSleepPoint = 0;
        this.mWakeUpTime = 0L;
        this.mFallAsleepTime = 0L;
        this.mGoBedTime = 0L;
        this.mOffBedTime = 0L;
        this.mCoreSleepStartX = 0.0f;
        this.mCoreSleepEndX = 0.0f;
        this.mBedSleepStartX = 0.0f;
        this.mUpSleepEndX = 0.0f;
        this.mStartText = "";
        this.mBedText = "";
        this.mEndText = "";
        this.mUpText = "";
        this.mTimeStringMargin = ftj.d(2.0f);
        this.mChartBorderWidth = ftj.d(24.0f);
        this.mTimeStrY = 45.0f;
        this.mVerticalLineStartY = 20.0f;
        this.mColorType = 0;
        this.mIsDayDetailView = true;
        this.mIsScienceSleep = false;
        this.mIsCommonSleep = false;
        this.mIsDefault = true;
        this.mIsMove = false;
        this.mIsSupportBedTime = false;
        this.mIsMultiSleep = false;
        this.mFitnessDataList = new ArrayList(16);
        this.mCopyOfFitnessDataList = new ArrayList(16);
        this.mCursorList = new ArrayList<>(16);
        this.mManualCursorList = new ArrayList<>(16);
        this.mChartLabels = new ArrayList(16);
        this.mIsOtherType = false;
        this.mCurrentBottom = 0.0f;
        this.mCursorSleep = -1;
        this.mCursorWake = -1;
        this.mCursorSleepTime = -1L;
        this.mCursorWakeTime = -1L;
        this.mCursorInBedState = -1;
        this.mAccessibilityListerner = new a(this);
        this.mContext = context;
    }

    public BaseSleepDayDetailView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mRemSleepTimes = 0;
        this.mNightStartPoint = 0;
        this.mNightEndPoint = 0;
        this.mLastNightEndPoint = 0;
        this.mStartSleepPoint = 0;
        this.mWakeUpTime = 0L;
        this.mFallAsleepTime = 0L;
        this.mGoBedTime = 0L;
        this.mOffBedTime = 0L;
        this.mCoreSleepStartX = 0.0f;
        this.mCoreSleepEndX = 0.0f;
        this.mBedSleepStartX = 0.0f;
        this.mUpSleepEndX = 0.0f;
        this.mStartText = "";
        this.mBedText = "";
        this.mEndText = "";
        this.mUpText = "";
        this.mTimeStringMargin = ftj.d(2.0f);
        this.mChartBorderWidth = ftj.d(24.0f);
        this.mTimeStrY = 45.0f;
        this.mVerticalLineStartY = 20.0f;
        this.mColorType = 0;
        this.mIsDayDetailView = true;
        this.mIsScienceSleep = false;
        this.mIsCommonSleep = false;
        this.mIsDefault = true;
        this.mIsMove = false;
        this.mIsSupportBedTime = false;
        this.mIsMultiSleep = false;
        this.mFitnessDataList = new ArrayList(16);
        this.mCopyOfFitnessDataList = new ArrayList(16);
        this.mCursorList = new ArrayList<>(16);
        this.mManualCursorList = new ArrayList<>(16);
        this.mChartLabels = new ArrayList(16);
        this.mIsOtherType = false;
        this.mCurrentBottom = 0.0f;
        this.mCursorSleep = -1;
        this.mCursorWake = -1;
        this.mCursorSleepTime = -1L;
        this.mCursorWakeTime = -1L;
        this.mCursorInBedState = -1;
        this.mAccessibilityListerner = new a(this);
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

    public List<fra> getFitnessDataList() {
        return this.mFitnessDataList;
    }

    public ArrayList<fqg> getCursorList() {
        return this.mCursorList;
    }

    public ArrayList<fra> getManualCursorList() {
        return this.mManualCursorList;
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

    public fra getLastData() {
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

    public static class c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private float f7459b = 0.0f;
        private float d = 0.0f;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private float f7460c = 0.0f;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private float f7458a = 0.0f;

        public float a() {
            return this.f7459b;
        }
    }

    static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private float f7461a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private float f7462b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private float f7463c;
        private float d;
        private float e;
        private float j;

        private d() {
            this.f7463c = 0.0f;
            this.f7462b = 0.0f;
            this.j = 0.0f;
            this.d = 0.0f;
            this.f7461a = 0.0f;
            this.e = 0.0f;
        }
    }

    public void isSupportBedTime(boolean z) {
        this.mIsSupportBedTime = z;
    }

    public void refreshFitnessDataList(List<fra> list, boolean z, double d2, boolean z2, Date date, boolean z3, boolean z4, boolean z5) {
        LogUtil.a(TAG, "Enter refreshCoreFitness validData:", Double.valueOf(d2));
        LogUtil.a(TAG, "refreshFitnessDataList" + list);
        this.mIsPhone = z3;
        this.mIsManual = z4;
        this.mIsCommonSleep = false;
        this.mIsManualAndOnlyBed = true;
        this.mIsManualAndIncomplete = false;
        if (z4) {
            Iterator<fra> it = list.iterator();
            while (it.hasNext()) {
                if (it.next().a() == 66) {
                    this.mIsManualAndOnlyBed = false;
                    break;
                }
            }
            if (z5) {
                Iterator<fra> it2 = list.iterator();
                while (it2.hasNext()) {
                    if (it2.next().d() == 1440) {
                        this.mIsManualAndIncomplete = true;
                        break;
                    }
                }
            }
        } else {
            this.mIsManualAndOnlyBed = false;
        }
        if (this.mIsDayDetailView) {
            this.mChartBorderWidth = ftj.d(24.0f);
        } else {
            this.mChartBorderWidth = ftj.d(36.0f);
        }
        if (date != null) {
            this.mCurrentDay = (Date) date.clone();
        } else {
            LogUtil.e(TAG_RELEASE, "refreshFitnessDataList mCurrentDay is null ");
            this.mCurrentDay = new Date(System.currentTimeMillis());
        }
        this.mIsScienceSleep = z;
        if (list == null || list.size() == 0) {
            this.mIsScienceSleep = false;
        }
        this.mIsOnlyNoonSleepType = z2;
        initData();
        if (list != null) {
            LogUtil.e(TAG, "refreshCoreFitnessDataList ", list.toString());
        }
        if (list != null && list.size() > 0) {
            this.mFitnessDataList.clear();
            this.mFitnessDataList.addAll(list);
            copyOfFitnessDataList();
            if (!this.mIsScienceSleep && !this.mIsManual && !this.mIsPhone) {
                this.mIsCommonSleep = true;
            }
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
        List<fra> list = this.mFitnessDataList;
        if (list == null) {
            return;
        }
        this.mCopyOfFitnessDataList.addAll(list);
        Iterator<fra> it = this.mFitnessDataList.iterator();
        while (it.hasNext()) {
            getSleepDataForUi(it.next());
        }
        Map<String, Integer> sleepSegmentedMaps = getSleepSegmentedMaps(this.mFitnessDataList, this.mIsPhone);
        if (sleepSegmentedMaps == null) {
            LogUtil.e(TAG_RELEASE, "timeMap is null!");
            return;
        }
        this.mStartSleepPoint = sleepSegmentedMaps.get("core_sleep_start_time_key").intValue();
        this.mLastNightEndPoint = sleepSegmentedMaps.get("core_sleep_end_time_key").intValue();
        if (this.mFitnessDataList.size() == 0) {
            return;
        }
        calStartPoint();
        calEndPoint();
    }

    private void calStartPoint() {
        this.mGoBedTime = -1L;
        this.mStartSleepPoint = -1;
        for (fra fraVar : this.mFitnessDataList) {
            if (fraVar.j != 69 && this.mGoBedTime == -1) {
                this.mGoBedTime = fraVar.e();
            }
            if (fraVar.j != 69 && fraVar.j != 67 && this.mStartSleepPoint == -1) {
                this.mStartSleepPoint = fraVar.g;
                this.mFallAsleepTime = fraVar.e();
            }
            if (this.mGoBedTime != -1 && this.mStartSleepPoint != -1) {
                break;
            }
        }
        LogUtil.a(TAG, " copyOfFitnessDataList mStartSleepPoint = ", Integer.valueOf(this.mStartSleepPoint));
    }

    private void calEndPoint() {
        this.mLastNightEndPoint = -1;
        this.mOffBedTime = -1L;
        for (int size = this.mFitnessDataList.size() - 1; size >= 0; size--) {
            fra fraVar = this.mFitnessDataList.get(size);
            if (fraVar.j != 69 && this.mOffBedTime == -1) {
                this.mOffBedTime = fraVar.c();
            }
            if (fraVar.j != 69 && fraVar.j != 67 && this.mLastNightEndPoint == -1) {
                this.mWakeUpTime = fraVar.c();
                this.mLastNightEndPoint = fraVar.f34430c;
            }
            if (this.mOffBedTime != -1 && this.mLastNightEndPoint != -1) {
                break;
            }
        }
        LogUtil.a(TAG, " copyOfFitnessDataList mNightEndPoint = ", Integer.valueOf(this.mLastNightEndPoint));
    }

    public static Map<String, Integer> getSleepSegmentedMaps(List<fra> list, boolean z) {
        fra fitnessKnitHistogramData;
        if (list == null) {
            return new HashMap(16);
        }
        ArrayList arrayList = new ArrayList(list);
        ArrayList arrayList2 = new ArrayList(16);
        Map map = new HashMap(16);
        for (int i = 0; i < arrayList.size() && (fitnessKnitHistogramData = getFitnessKnitHistogramData(arrayList, arrayList2, map, i)) != null; i++) {
            map = getStringIntegerMap(arrayList, fitnessKnitHistogramData, arrayList2, map, i);
        }
        if (z) {
            return getPhoneMaxSleepData(arrayList2);
        }
        return getMaxSleepData((List<Map<String, Integer>>) arrayList2);
    }

    private static fra getFitnessKnitHistogramData(List<fra> list, List<Map<String, Integer>> list2, Map<String, Integer> map, int i) {
        fra fraVar = list.get(i);
        if (fraVar == null) {
            return null;
        }
        if (map.get("core_sleep_start_time_key") == null && fraVar.a() != 69 && fraVar.a() != 67) {
            map.put("core_sleep_start_time_key", Integer.valueOf(fraVar.b()));
        }
        if (i == list.size() - 1) {
            if (list.size() == 1) {
                map.put("core_sleep_end_time_key", Integer.valueOf(fraVar.d()));
            }
            if (map.get("core_sleep_start_time_key") != null && map.get("core_sleep_end_time_key") != null) {
                list2.add(map);
            }
        }
        if (list.size() <= i + 1) {
            return null;
        }
        return fraVar;
    }

    private static Map<String, Integer> getStringIntegerMap(List<fra> list, fra fraVar, List<Map<String, Integer>> list2, Map<String, Integer> map, int i) {
        int i2 = i + 1;
        fra fraVar2 = !njy.e(list, i2) ? list.get(i2) : null;
        if (fraVar2 != null) {
            if (fraVar2.b() - fraVar.d() > 30 && fraVar.a() != 69) {
                map.put("core_sleep_end_time_key", Integer.valueOf(fraVar.d()));
                if (map.get("core_sleep_start_time_key") != null && map.get("core_sleep_end_time_key") != null) {
                    list2.add(map);
                    return new HashMap(16);
                }
            } else {
                if (fraVar2.a() != 69) {
                    map.put("core_sleep_end_time_key", Integer.valueOf(fraVar2.d()));
                    return map;
                }
                LogUtil.j(TAG, "getSleepSegmentedMaps takeHistogramHeight = 69, i = ", Integer.valueOf(i));
            }
        }
        return map;
    }

    private static Map<String, Integer> getPhoneMaxSleepData(List<Map<String, Integer>> list) {
        HashMap map = new HashMap(16);
        if (njy.e(list)) {
            return null;
        }
        int iIntValue = 0;
        Map<String, Integer> map2 = list.get(0);
        Map<String, Integer> map3 = list.get(list.size() - 1);
        int iIntValue2 = Integer.MAX_VALUE;
        for (Map<String, Integer> map4 : list) {
            if (map4.get("core_sleep_end_time_key").intValue() > iIntValue) {
                iIntValue = map4.get("core_sleep_end_time_key").intValue();
            }
            if (map4.get("core_sleep_start_time_key").intValue() < iIntValue2) {
                iIntValue2 = map4.get("core_sleep_start_time_key").intValue();
            }
        }
        map.put("core_sleep_start_time_key", map2.get("core_sleep_start_time_key"));
        map.put("core_sleep_end_time_key", map3.get("core_sleep_end_time_key"));
        return map;
    }

    private static Map<String, Integer> getMaxSleepData(List<Map<String, Integer>> list) {
        HashMap map = new HashMap(16);
        if (njy.e(list)) {
            return null;
        }
        Map<String, Integer> map2 = list.get(0);
        for (Map<String, Integer> map3 : list) {
            if (map3.get("core_sleep_end_time_key").intValue() - map3.get("core_sleep_start_time_key").intValue() > map2.get("core_sleep_end_time_key").intValue() - map2.get("core_sleep_start_time_key").intValue()) {
                map2 = map3;
            }
        }
        map.put("core_sleep_start_time_key", map2.get("core_sleep_start_time_key"));
        map.put("core_sleep_end_time_key", map2.get("core_sleep_end_time_key"));
        return map;
    }

    private void getSleepDataForUi(fra fraVar) {
        if (fraVar == null) {
            LogUtil.e(TAG, "getSleepDataForUi data is null");
            return;
        }
        if (fraVar.a() == 68) {
            this.mRemSleepTimes += fraVar.f34430c - fraVar.g;
        }
        if (fraVar.a() != 69) {
            if (this.mNightStartPoint == 0 && this.mNightEndPoint == 0) {
                this.mNightStartPoint = fraVar.b();
            }
            this.mNightEndPoint = fraVar.d();
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
        paint.setTextSize(ftj.d(10.0f));
        paint.setAntiAlias(true);
        this.mDate = new String[2];
        if (this.mCurrentDay == null) {
            LogUtil.e(TAG_RELEASE, "getTimeLabel mCurrentDay is null ");
            this.mCurrentDay = new Date(System.currentTimeMillis());
        }
        if ((this.mIsScienceSleep && !this.mIsOnlyNoonSleepType) || ((this.mIsPhone && !this.mIsOnlyNoonSleepType) || this.mIsCommonSleep)) {
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
        this.mStartDate = dateToString(new Date(lsl.u(this.mCurrentDay.getTime())));
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
        float fD;
        float fD2;
        if (this.mIsManual) {
            this.mStartSleepPoint = this.mNightStartPoint;
            this.mLastNightEndPoint = this.mNightEndPoint;
            for (fra fraVar : this.mFitnessDataList) {
                if (fraVar.a() == 66) {
                    this.mCursorSleep = fraVar.b();
                    this.mCursorWake = fraVar.d();
                    this.mCursorSleepTime = fraVar.e();
                    this.mCursorWakeTime = fraVar.c();
                    break;
                }
            }
            getManualBedUpLabel(paint);
        }
        LogUtil.a(TAG, "mStartSleepPoint: ", Integer.valueOf(this.mStartSleepPoint), " mLastNightEndPoint:", Integer.valueOf(this.mLastNightEndPoint), " mStartPoint:", Integer.valueOf(this.mNightStartPoint), " mEndPoint:", Integer.valueOf(this.mNightEndPoint));
        this.mTime = new String[2];
        setStartSleepText();
        String str = this.mStartText;
        float fMeasureText = (int) paint.measureText(str, 0, str.length());
        int i = this.mNightEndPoint;
        int i2 = this.mNightStartPoint;
        float f = 0.0f;
        if (i != i2) {
            fD = ((((this.mStartSleepPoint - i2) / (i - i2)) * (this.mViewWidth - ftj.d(48.0f))) + ftj.d(24.0f)) - (fMeasureText / 2.0f);
            if (fD < 0.0f) {
                fD = ftj.d(16.0f);
            }
        } else {
            fD = ftj.d(24.0f) - (fMeasureText / 2.0f);
        }
        if (LanguageUtil.ba(BaseApplication.getContext())) {
            fD = (this.mViewWidth - fMeasureText) - fD;
            float fD3 = ftj.d(16.0f);
            float f2 = this.mViewWidth;
            if (fD + fMeasureText + fD3 > f2) {
                fD = (f2 - fMeasureText) - ftj.d(16.0f);
            }
        }
        this.mCoreSleepStartX = fD;
        setEndSleepText();
        String str2 = this.mEndText;
        float fMeasureText2 = (int) paint.measureText(str2, 0, str2.length());
        int i3 = this.mNightEndPoint;
        int i4 = this.mNightStartPoint;
        if (i3 != i4) {
            fD2 = ((((this.mLastNightEndPoint - i4) / (i3 - i4)) * (this.mViewWidth - ftj.d(48.0f))) + ftj.d(24.0f)) - (fMeasureText2 / 2.0f);
            float fD4 = ftj.d(16.0f);
            float f3 = this.mViewWidth;
            if (fD2 + fMeasureText2 + fD4 > f3) {
                fD2 = (f3 - fMeasureText2) - ftj.d(16.0f);
            }
        } else {
            fD2 = (this.mViewWidth - fMeasureText2) - ftj.d(16.0f);
        }
        if (LanguageUtil.ba(BaseApplication.getContext())) {
            float f4 = (this.mViewWidth - fD2) - fMeasureText2;
            if (f4 >= 0.0f) {
                f = f4;
            }
        } else {
            f = fD2;
        }
        this.mCoreSleepEndX = f;
        float fD5 = ((fMeasureText + fMeasureText2) / 2.0f) + ftj.d(16.0f);
        if (Math.abs(this.mCoreSleepEndX - this.mCoreSleepStartX) <= fD5) {
            if (this.mCoreSleepEndX + fMeasureText2 + ftj.d(16.0f) > this.mViewWidth) {
                float f5 = this.mCoreSleepStartX;
                this.mCoreSleepStartX = f5 - (fD5 - (this.mCoreSleepEndX - f5));
            } else {
                float f6 = this.mCoreSleepEndX;
                this.mCoreSleepEndX = f6 + (fD5 - (f6 - this.mCoreSleepStartX));
            }
        }
        if (LanguageUtil.ba(BaseApplication.getContext())) {
            float f7 = this.mCoreSleepEndX;
            this.mCoreSleepEndX = this.mCoreSleepStartX;
            this.mCoreSleepStartX = f7;
        }
        dealEndTimeIfStartGreater();
        replaceTextAndDate();
    }

    private void getManualBedUpLabel(Paint paint) {
        float fD;
        float fD2;
        LogUtil.a(TAG, "mCursorSleep: ", Integer.valueOf(this.mCursorSleep), " mCursorWake:", Integer.valueOf(this.mCursorWake));
        setBedText();
        String str = this.mBedText;
        float fMeasureText = (int) paint.measureText(str, 0, str.length());
        int i = this.mNightEndPoint;
        int i2 = this.mNightStartPoint;
        float f = 0.0f;
        if (i != i2) {
            fD = ((((this.mCursorSleep - i2) / (i - i2)) * (this.mViewWidth - ftj.d(48.0f))) + ftj.d(24.0f)) - (fMeasureText / 2.0f);
            if (fD < 0.0f) {
                fD = ftj.d(16.0f);
            }
        } else {
            fD = ftj.d(24.0f) - (fMeasureText / 2.0f);
        }
        if (LanguageUtil.ba(BaseApplication.getContext())) {
            fD = (this.mViewWidth - fMeasureText) - fD;
            float fD3 = ftj.d(16.0f);
            float f2 = this.mViewWidth;
            if (fD + fMeasureText + fD3 > f2) {
                fD = (f2 - fMeasureText) - ftj.d(16.0f);
            }
        }
        this.mBedSleepStartX = fD;
        setUpText();
        String str2 = this.mUpText;
        float fMeasureText2 = (int) paint.measureText(str2, 0, str2.length());
        int i3 = this.mNightEndPoint;
        int i4 = this.mNightStartPoint;
        if (i3 != i4) {
            fD2 = ((((this.mCursorWake - i4) / (i3 - i4)) * (this.mViewWidth - ftj.d(48.0f))) + ftj.d(24.0f)) - (fMeasureText2 / 2.0f);
            float fD4 = ftj.d(16.0f);
            float f3 = this.mViewWidth;
            if (fD2 + fMeasureText2 + fD4 > f3) {
                fD2 = (f3 - fMeasureText2) - ftj.d(16.0f);
            }
        } else {
            fD2 = (this.mViewWidth - fMeasureText2) - ftj.d(16.0f);
        }
        if (LanguageUtil.ba(BaseApplication.getContext())) {
            float f4 = (this.mViewWidth - fD2) - fMeasureText2;
            if (f4 >= 0.0f) {
                f = f4;
            }
        } else {
            f = fD2;
        }
        this.mUpSleepEndX = f;
        float fD5 = ((fMeasureText + fMeasureText2) / 2.0f) + ftj.d(16.0f);
        if (Math.abs(this.mUpSleepEndX - this.mBedSleepStartX) <= fD5) {
            if (this.mUpSleepEndX + fMeasureText2 + ftj.d(16.0f) > this.mViewWidth) {
                float f5 = this.mBedSleepStartX;
                this.mBedSleepStartX = f5 - ((fD5 - Math.abs(this.mUpSleepEndX - f5)) + ftj.d(16.0f));
            } else {
                float f6 = this.mUpSleepEndX;
                this.mUpSleepEndX = f6 + (fD5 - Math.abs(f6 - this.mBedSleepStartX)) + ftj.d(16.0f);
            }
        }
        if (LanguageUtil.ba(BaseApplication.getContext())) {
            float f7 = this.mUpSleepEndX;
            this.mUpSleepEndX = this.mBedSleepStartX;
            this.mBedSleepStartX = f7;
        }
        dealManualEndTimeIfStartGreater();
    }

    private void dealManualEndTimeIfStartGreater() {
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM-dd");
            Date date = simpleDateFormat.parse(this.mBedDate);
            Date date2 = simpleDateFormat.parse(this.mUpDate);
            if (date == null || date2 == null || date.getTime() <= date2.getTime()) {
                return;
            }
            this.mUpDate = this.mBedDate;
            LogUtil.j(TAG, "startTime = ", Long.valueOf(date.getTime()), " endTime = ", Long.valueOf(date2.getTime()));
        } catch (ParseException unused) {
            LogUtil.e(TAG_RELEASE, "simpleDateFormat ParseException ");
        }
    }

    private void setUpText() {
        int[] hourAndMin = getHourAndMin(this.mCursorWakeTime);
        int i = hourAndMin[0];
        int i2 = hourAndMin[1];
        if (i > 20 && i < 24) {
            this.mUpDate = dateToString(new Date(lsl.u(this.mCurrentDay.getTime())));
        } else {
            this.mUpDate = dateToString(this.mCurrentDay);
        }
        this.mUpText = formatTime(getTimeStr(i) + ":" + getTimeStr(i2));
        if (!LanguageUtil.o(BaseApplication.getContext())) {
            this.mUpText = this.mContext.getResources().getString(R.string.IDS_fitness_core_sleep_end_sleep) + " " + this.mUpText;
            return;
        }
        this.mUpText = this.mContext.getResources().getString(R.string.IDS_fitness_core_sleep_end_sleep) + this.mUpText;
    }

    private void setBedText() {
        int[] hourAndMin = getHourAndMin(this.mCursorSleepTime);
        int i = hourAndMin[0];
        int i2 = hourAndMin[1];
        if (i >= 20 && i < 24) {
            this.mBedDate = dateToString(new Date(lsl.u(this.mCurrentDay.getTime())));
        } else {
            this.mBedDate = dateToString(this.mCurrentDay);
        }
        this.mBedText = formatTime(getTimeStr(i) + ":" + getTimeStr(i2));
        if (!LanguageUtil.o(BaseApplication.getContext())) {
            this.mBedText = this.mContext.getResources().getString(R.string.IDS_fitness_core_sleep_start_sleep) + " " + this.mBedText;
            return;
        }
        this.mBedText = this.mContext.getResources().getString(R.string.IDS_fitness_core_sleep_start_sleep) + this.mBedText;
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
        int[] hourAndMin = getHourAndMin(this.mFallAsleepTime);
        int i = hourAndMin[0];
        int i2 = hourAndMin[1];
        if (i2 == 0 && i == 20) {
            this.mStartDate = "";
            this.mStartText = "";
            return;
        }
        if (i >= 20 && i < 24) {
            this.mStartDate = dateToString(new Date(lsl.u(this.mCurrentDay.getTime())));
        } else {
            this.mStartDate = dateToString(this.mCurrentDay);
        }
        this.mStartText = formatTime(getTimeStr(i) + ":" + getTimeStr(i2));
        if (!LanguageUtil.o(BaseApplication.getContext())) {
            this.mStartText = this.mContext.getResources().getString(R.string.IDS_fitness_core_sleep_start_sleep) + " " + this.mStartText;
            return;
        }
        this.mStartText = this.mContext.getResources().getString(R.string.IDS_fitness_core_sleep_start_sleep) + this.mStartText;
    }

    private void setEndSleepText() {
        int[] hourAndMin = getHourAndMin(this.mWakeUpTime);
        int i = hourAndMin[0];
        int i2 = hourAndMin[1];
        if (i2 == 0 && i == 20) {
            this.mEndDate = "";
            this.mEndText = "";
            return;
        }
        if ((i != 20 || i2 != 0) && i >= 20 && i < 24) {
            this.mEndDate = dateToString(new Date(lsl.u(this.mCurrentDay.getTime())));
        } else {
            this.mEndDate = dateToString(this.mCurrentDay);
        }
        this.mEndText = formatTime(getTimeStr(i) + ":" + getTimeStr(i2));
        if (!LanguageUtil.o(BaseApplication.getContext())) {
            this.mEndText = this.mContext.getResources().getString(R.string.IDS_fitness_core_sleep_end_sleep) + " " + this.mEndText;
            return;
        }
        this.mEndText = this.mContext.getResources().getString(R.string.IDS_fitness_core_sleep_end_sleep) + this.mEndText;
    }

    public void drawSleepRect(Canvas canvas) {
        lrn lrnVarA;
        if (canvas == null) {
            return;
        }
        ChartTouchHelper chartTouchHelper = this.mHelper;
        if (chartTouchHelper != null && (lrnVarA = chartTouchHelper.a()) != null) {
            lrnVarA.b();
        }
        if (njy.e(this.mFitnessDataList)) {
            this.mLastData = null;
            return;
        }
        this.mCurrentBottom = this.mDiagramHeight;
        int size = this.mFitnessDataList.size();
        this.mIsMultiSleep = false;
        int i = -1;
        for (int i2 = 0; i2 < size; i2++) {
            fra fraVar = this.mFitnessDataList.get(i2);
            this.mCurrentData = fraVar;
            int iB = fraVar.b();
            int iD = this.mCurrentData.d();
            if (this.mIsOnlyNoonSleepType) {
                drawOnlyNoonSleepRect(canvas, iB, iD, size, i2);
            } else if (this.mCurrentData.a() != 69) {
                if (i != -1 && i2 - i != 1) {
                    this.mIsMultiSleep = true;
                }
                drawCoreSleepRect(canvas, i2);
                i = i2;
            }
        }
    }

    private void setAccsibilityVirtualNode(fra fraVar, c cVar, AbstractTouchNode abstractTouchNode) {
        abstractTouchNode.setDescription(getAccessibilityDesription(fraVar));
        abstractTouchNode.setRect(getAccessibilityRect(cVar));
    }

    private String getAccessibilityDesription(fra fraVar) {
        String strA;
        String strA2 = qre.a(R.string.IDS_hw_health_coresleep_standard_range_1, getDigitTimeStr(fraVar.b()), getDigitTimeStr(fraVar.d()));
        String sleepTypeString = getSleepTypeString(fraVar.a());
        int iD = fraVar.d() - fraVar.b();
        int i = iD / 60;
        int i2 = iD % 60;
        if (i == 0) {
            strA = qre.a(R.string.IDS_hw_show_set_target_sport_time_unit, Integer.valueOf(i2));
        } else {
            strA = qre.a(R.string.IDS_h_min_unit, Integer.valueOf(i), Integer.valueOf(i2));
        }
        return qre.a(R.string.IDS_two_parts, qre.a(R.string.IDS_two_parts, strA2, sleepTypeString), strA);
    }

    private Rect getAccessibilityRect(c cVar) {
        return new Rect((int) cVar.f7460c, (int) cVar.f7459b, (int) cVar.f7458a, (int) cVar.d);
    }

    protected String getSleepTypeString(int i) {
        switch (i) {
            case 65:
                return getBaseContext().getString(R.string.IDS_hw_show_main_health_page_healthdata_sleep_deepsleep);
            case 66:
                return getBaseContext().getString(R.string.IDS_hw_show_main_health_page_healthdata_sleep_shallowsleep);
            case 67:
                return getBaseContext().getString(R.string.IDS_details_sleep_sleep_latency);
            case 68:
                return getBaseContext().getString(R.string.IDS_fitness_core_sleep_rem_sleep);
            case 69:
                return getBaseContext().getString(R.string.IDS_fitness_core_sleep_noontime_sleep);
            default:
                return getBaseContext().getString(R.string.IDS_hw_show_main_health_page_healthdata_sleep_shallowsleep);
        }
    }

    protected String getDigitTimeStr(int i) {
        int i2 = i / 60;
        int i3 = i2 + 20;
        if (i3 >= 24) {
            i3 = i2 - 4;
        }
        return formatTime(getTimeStr(i3) + ":" + getTimeStr(i % 60));
    }

    private void drawOnlyNoonSleepRect(Canvas canvas, int i, int i2, int i3, int i4) {
        if (canvas == null) {
            return;
        }
        c cVar = new c();
        c cVar2 = new c();
        setCurrentValueData(cVar, getOnlyNoonRectSetting(this.mCurrentData.a(), this.mCurrentBottom), i, i2);
        setRtlPosition(cVar);
        getTheLastData(this.mCurrentData);
        int i5 = i4 + 1;
        if (i5 < i3) {
            this.mEndData = this.mFitnessDataList.get(i5);
            cVar2.f7460c = ((i / 1440.0f) * this.mDiagramWidth) + this.mChartBorderWidth;
            cVar2.f7458a = ((i2 / 1440.0f) * this.mDiagramWidth) + this.mChartBorderWidth;
            boolean z = false;
            boolean z2 = Math.abs(cVar.f7458a - cVar2.f7460c) < PRECISION;
            if (LanguageUtil.ba(BaseApplication.getContext())) {
                float f = cVar2.f7460c;
                cVar2.f7460c = this.mViewWidth - cVar2.f7458a;
                cVar2.f7458a = this.mViewWidth - f;
                if (Math.abs(cVar.f7460c - cVar2.f7458a) < PRECISION) {
                    z = true;
                }
            } else {
                z = z2;
            }
            c onlyNoonRectSetting = getOnlyNoonRectSetting(this.mEndData.a(), this.mCurrentBottom);
            cVar2.f7459b = onlyNoonRectSetting.f7459b;
            cVar2.d = onlyNoonRectSetting.d;
            if (!this.mIsOtherType && z) {
                setCurrentRectColor(this.mCurrentData.a());
                setConnectionBlock(canvas, this.mCurrentData, cVar, this.mEndData, cVar2);
            } else if (this.mCurrentData.a() == 69) {
                setCurrentRectColor(710);
            }
        } else if (this.mCurrentData.a() == 69) {
            setCurrentRectColor(710);
        }
        ChartTouchHelper chartTouchHelper = this.mHelper;
        if (chartTouchHelper != null) {
            setAccsibilityVirtualNode(this.mFitnessDataList.get(i4), cVar, chartTouchHelper.a().a(i4));
        }
        drawCyRect(canvas, cVar);
    }

    private void setCurrentValueData(c cVar, c cVar2, int i, int i2) {
        cVar.f7459b = cVar2.f7459b;
        cVar.d = cVar2.d;
        cVar.f7460c = ((i / 1440.0f) * this.mDiagramWidth) + this.mChartBorderWidth;
        cVar.f7458a = ((i2 / 1440.0f) * this.mDiagramWidth) + this.mChartBorderWidth;
    }

    private void drawCoreSleepRect(Canvas canvas, int i) {
        boolean z;
        c cVar = new c();
        c cVar2 = new c();
        int iB = this.mCurrentData.b();
        int i2 = this.mNightStartPoint;
        cVar.f7460c = (((iB - i2) / (this.mNightEndPoint - i2)) * this.mDiagramWidth) + this.mChartBorderWidth;
        int iD = this.mCurrentData.d();
        int i3 = this.mNightStartPoint;
        cVar.f7458a = (((iD - i3) / (this.mNightEndPoint - i3)) * this.mDiagramWidth) + this.mChartBorderWidth;
        if (i == 1) {
            LogUtil.a(TAG, "mCurrentData.getStartPoint() = ", Integer.valueOf(this.mCurrentData.b()), "; mNightStartPoint = ", Integer.valueOf(this.mNightStartPoint), "; mNightEndPoint = ", Integer.valueOf(this.mNightEndPoint), "; mCurrentLeft = ", Float.valueOf(cVar.f7460c), "", "; mViewWidth = ", Float.valueOf(this.mViewWidth), "; mDiagramWidth = ", Float.valueOf(this.mDiagramWidth), "mChartBorderWidth = ", Float.valueOf(this.mChartBorderWidth));
        }
        c currentRectSetting = getCurrentRectSetting(this.mCurrentData.a(), this.mCurrentBottom);
        cVar.f7459b = currentRectSetting.f7459b;
        cVar.d = currentRectSetting.d;
        setCurrentRectColor(this.mCurrentData.a());
        setRtlPosition(cVar);
        getTheLastData(this.mCurrentData);
        int i4 = i + 1;
        if (i4 < this.mFitnessDataList.size()) {
            fra fraVar = this.mFitnessDataList.get(i4);
            this.mEndData = fraVar;
            int iB2 = fraVar.b();
            int i5 = this.mNightStartPoint;
            cVar2.f7460c = (((iB2 - i5) / (this.mNightEndPoint - i5)) * this.mDiagramWidth) + this.mChartBorderWidth;
            int iD2 = this.mEndData.d();
            int i6 = this.mNightStartPoint;
            cVar2.f7458a = (((iD2 - i6) / (this.mNightEndPoint - i6)) * this.mDiagramWidth) + this.mChartBorderWidth;
            boolean z2 = Math.abs(cVar.f7458a - cVar2.f7460c) < PRECISION;
            if (LanguageUtil.ba(BaseApplication.getContext())) {
                float f = cVar2.f7460c;
                cVar2.f7460c = this.mViewWidth - cVar2.f7458a;
                cVar2.f7458a = this.mViewWidth - f;
                z = Math.abs(cVar.f7460c - cVar2.f7458a) < PRECISION;
            } else {
                z = z2;
            }
            c currentRectSetting2 = getCurrentRectSetting(this.mEndData.a(), this.mCurrentBottom);
            cVar2.f7459b = currentRectSetting2.f7459b;
            cVar2.d = currentRectSetting2.d;
            if (!this.mIsOtherType && z) {
                setConnectionBlock(canvas, this.mCurrentData, cVar, this.mEndData, cVar2);
            }
            setMultiSleep(z);
        }
        ChartTouchHelper chartTouchHelper = this.mHelper;
        if (chartTouchHelper != null) {
            setAccsibilityVirtualNode(this.mFitnessDataList.get(i), cVar, chartTouchHelper.a().a(i));
        }
        drawCyRect(canvas, cVar);
    }

    private void drawCommonSleepRect(Canvas canvas, int i, int i2, int i3) {
        LogUtil.e(TAG, "drawCommonSleepRect startPoint is" + i + "endPoint is " + i2 + "size is " + this.mFitnessDataList.size() + "index is" + i3);
        c cVar = new c();
        c cVar2 = new c();
        cVar.f7460c = ((((float) i) / 1440.0f) * this.mDiagramWidth) + this.mChartBorderWidth;
        cVar.f7458a = ((((float) i2) / 1440.0f) * this.mDiagramWidth) + this.mChartBorderWidth;
        c ordinaryRectSetting = getOrdinaryRectSetting(this.mCurrentData.a(), this.mCurrentBottom);
        cVar.f7459b = ordinaryRectSetting.f7459b;
        cVar.d = ordinaryRectSetting.d;
        setCurrentRectColor(this.mCurrentData.a());
        setRtlPosition(cVar);
        getTheLastData(this.mCurrentData);
        boolean z = true;
        int i4 = i3 + 1;
        if (i4 < this.mFitnessDataList.size()) {
            fra fraVar = this.mFitnessDataList.get(i4);
            this.mEndData = fraVar;
            cVar2.f7460c = ((fraVar.b() / 1440.0f) * this.mDiagramWidth) + this.mChartBorderWidth;
            cVar2.f7458a = ((this.mEndData.d() / 1440.0f) * this.mDiagramWidth) + this.mChartBorderWidth;
            boolean z2 = Math.abs(cVar.f7458a - cVar2.f7460c) < PRECISION;
            if (LanguageUtil.ba(BaseApplication.getContext())) {
                float f = cVar2.f7460c;
                cVar2.f7460c = this.mViewWidth - cVar2.f7458a;
                cVar2.f7458a = this.mViewWidth - f;
                if (Math.abs(cVar.f7460c - cVar2.f7458a) >= PRECISION) {
                    z = false;
                }
            } else {
                z = z2;
            }
            c ordinaryRectSetting2 = getOrdinaryRectSetting(this.mEndData.a(), this.mCurrentBottom);
            cVar2.f7459b = ordinaryRectSetting2.f7459b;
            cVar2.d = ordinaryRectSetting2.d;
            if (!this.mIsOtherType && z) {
                setConnectionBlock(canvas, this.mCurrentData, cVar, this.mEndData, cVar2);
            }
            setMultiSleep(z);
        }
        drawCyRect(canvas, cVar);
    }

    private void setMultiSleep(boolean z) {
        if (z || this.mIsMultiSleep || this.mEndData.a() == 69) {
            return;
        }
        this.mIsMultiSleep = true;
        LogUtil.a(TAG, "enddata:", this.mEndData, " startData:", this.mCurrentData);
    }

    private void setRtlPosition(c cVar) {
        if (LanguageUtil.ba(BaseApplication.getContext())) {
            float f = cVar.f7460c;
            cVar.f7460c = this.mViewWidth - cVar.f7458a;
            cVar.f7458a = this.mViewWidth - f;
        }
    }

    public void drawGoOffBedTime(Canvas canvas) {
        if (this.mFitnessDataList.isEmpty()) {
            LogUtil.j(TAG, "mFitnessDataList is empty");
            return;
        }
        if (this.mIsOnlyNoonSleepType) {
            LogUtil.j(TAG, "mIsOnlyNoonSleepType ");
            return;
        }
        boolean z = this.mIsScienceSleep;
        if (z && !this.mIsPhone && !this.mIsManual) {
            LogUtil.j(TAG, "science sleep do not support bedTime");
            return;
        }
        if (!z && !this.mIsPhone && !this.mIsManual) {
            LogUtil.a(TAG, "common sleep do not show go off bed time");
            return;
        }
        String goBedText = getGoBedText();
        String offBedText = getOffBedText();
        Paint paint = new Paint();
        if (this.mColorType == 1) {
            paint.setColor(this.mContext.getResources().getColor(R.color.textColorPrimary));
        } else {
            paint.setColor(this.mContext.getResources().getColor(R.color.textColorSecondary));
        }
        paint.setTextSize(qqf.b(0, this.mContext.getResources().getDimension(R.dimen.emui_text_size_caption)));
        paint.setAntiAlias(true);
        canvas.drawText(goBedText, ftj.d(24.0f), ftj.d(10.0f), paint);
        canvas.drawText(offBedText, (getWidth() - ftj.d(24.0f)) - paint.measureText(offBedText), ftj.d(10.0f), paint);
    }

    private boolean isCrossDay() {
        if (this.mIsManual) {
            return false;
        }
        return lsl.a(this.mGoBedTime, 20, 0) == this.mGoBedTime || lsl.a(this.mOffBedTime, 20, 0) == this.mOffBedTime || lsl.a(this.mFallAsleepTime, 20, 0) == this.mFallAsleepTime || lsl.a(this.mWakeUpTime, 20, 0) == this.mWakeUpTime;
    }

    private String getGoBedText() {
        int[] hourAndMin = getHourAndMin(this.mGoBedTime);
        int i = hourAndMin[0];
        int i2 = hourAndMin[1];
        if (i == 20 && i2 == 0) {
            return "";
        }
        String time = formatTime(getTimeStr(i) + ":" + getTimeStr(i2));
        if (!this.mIsManual) {
            return time;
        }
        if (!LanguageUtil.o(BaseApplication.getContext())) {
            return qre.f(R.string.IDS_manual_sleep_go_to_bed) + " " + time;
        }
        return qre.f(R.string.IDS_manual_sleep_go_to_bed) + time;
    }

    private String getOffBedText() {
        int[] hourAndMin = getHourAndMin(this.mOffBedTime);
        int i = hourAndMin[0];
        int i2 = hourAndMin[1];
        if (i == 20 && i2 == 0) {
            return "";
        }
        String time = formatTime(getTimeStr(i) + ":" + getTimeStr(i2));
        if (!this.mIsManual) {
            return time;
        }
        if (!LanguageUtil.o(BaseApplication.getContext())) {
            return qre.f(R.string.IDS_manual_sleep_get_out_of_bed) + " " + time;
        }
        return qre.f(R.string.IDS_manual_sleep_get_out_of_bed) + time;
    }

    public void drawMaxSleepVerticalLine(Canvas canvas) {
        List<fra> list;
        long jE;
        long jC;
        int i;
        int i2;
        if (canvas == null || (list = this.mCopyOfFitnessDataList) == null || list.size() == 0) {
            return;
        }
        if ((this.mRemSleepTimes <= 0 && (!this.mIsScienceSleep || this.mIsOnlyNoonSleepType)) || this.mIsPhone || this.mIsManual) {
            int i3 = 0;
            if (this.mIsOnlyNoonSleepType) {
                ArrayList<fra> sleepSumList = getSleepSumList();
                LogUtil.a(TAG, "sumSleepList = ", sleepSumList.toString());
                fra maxSleepData = getMaxSleepData(sleepSumList);
                if (maxSleepData == null) {
                    return;
                }
                i = maxSleepData.g;
                i2 = maxSleepData.f34430c;
                jE = maxSleepData.e();
                jC = maxSleepData.c();
            } else {
                LogUtil.e(TAG, "drawMaxSleepVerticalLine mStartSleepPoint is ", Integer.valueOf(this.mStartSleepPoint), " mLastNightEndPoint is ", Integer.valueOf(this.mLastNightEndPoint));
                if (this.mFitnessDataList.isEmpty()) {
                    jE = 0;
                    jC = 0;
                } else {
                    long jE2 = this.mFitnessDataList.get(0).e();
                    List<fra> list2 = this.mFitnessDataList;
                    jC = list2.get(list2.size() - 1).c();
                    jE = jE2;
                }
                i = this.mStartSleepPoint;
                i2 = this.mLastNightEndPoint;
            }
            long j = jE;
            long j2 = jC;
            if (LanguageUtil.ba(BaseApplication.getContext())) {
                int i4 = 1440 - i;
                i = 1440 - i2;
                i2 = i4;
            }
            if ((!this.mIsPhone || this.mIsOnlyNoonSleepType) && !this.mIsManual) {
                i3 = i;
            } else {
                i2 = 1440;
            }
            float f = i3 / 1440.0f;
            float f2 = this.mDiagramWidth;
            float f3 = this.mChartBorderWidth;
            float f4 = (f * f2) + f3;
            float f5 = ((i2 / 1440.0f) * f2) + f3;
            if (this.mIsManual) {
                drawVerticalLine(canvas, f4, 16.0f);
                drawVerticalLine(canvas, f5, 16.0f);
            } else {
                drawStartEndTimeStr(canvas, f4, f5, j, j2);
            }
        }
    }

    public void drawCursorText(Canvas canvas) {
        if (canvas == null || this.mIsMultiSleep) {
            return;
        }
        drawGoOffBedTime(canvas);
        Paint paint = new Paint();
        paint.setStrokeWidth(1.0f);
        paint.setTextSize(ftj.d(10.0f));
        paint.setAntiAlias(true);
        int length = this.mTime.length;
        float[] fArr = new float[length];
        this.mCursorTextHeight = this.mCursorHeight - ftj.d(4.0f);
        for (int i = 0; i < length; i++) {
            paint.setColor(this.mContext.getResources().getColor(R.color.textColorSecondary));
            paint.setTypeface(Typeface.create(this.mContext.getResources().getString(R.string.textFontFamilyRegular), 0));
            int i2 = length - 1;
            String str = this.mTime[i2];
            float fMeasureText = (int) paint.measureText(str, 0, str.length());
            if (TextUtils.isEmpty(this.mTime[i2]) && !TextUtils.isEmpty(this.mTime[0])) {
                String str2 = this.mTime[0];
                fMeasureText = (int) paint.measureText(str2, 0, str2.length());
            }
            float f = fMeasureText;
            setTextTransverseWidth(fArr, f, length, i);
            setFloatText(fArr, f, i);
            LogUtil.e(TAG, "drawCursorText offsets is " + Arrays.toString(fArr));
            float f2 = this.mCursorCenter;
            float fD = ftj.d(36.0f);
            float f3 = fArr[i];
            if (f2 - fD < (f / 2.0f) + f3 && f3 < this.mCursorCenter + ftj.d(36.0f) && this.mIsDayDetailView) {
                paint.setColor(this.mContext.getResources().getColor(R.color.textColorPrimary));
                paint.setTypeface(Typeface.create(this.mContext.getResources().getString(R.string.textFontFamilyMedium), 0));
            }
            setDrawText(i, fArr, canvas, paint, length, f);
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
                    float f9 = CURSOR_TEXT_HIGHEST_HEIGHT * HALF_PAST_ONE;
                    if (f8 > f9) {
                        f8 = f9;
                    }
                    this.mCursorTextHeight = this.mCursorHeight - f8;
                    return;
                }
                if (f2 <= f4 && f4 <= f6) {
                    this.mCursorTextHeight = this.mCursorHeight - (CURSOR_TEXT_HIGHEST_HEIGHT * HALF_PAST_ONE);
                    return;
                }
                if (f5 <= f4 && f4 < f2) {
                    float f10 = CURSOR_TEXT_MINIMUM_HEIGHT + (((f4 - f5) / f3) * CURSOR_TEXT_FLOATING_OFFSET);
                    float f11 = CURSOR_TEXT_HIGHEST_HEIGHT * HALF_PAST_ONE;
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
            } else if (this.mIsManual) {
                fArr[i2] = this.mBedSleepStartX;
                return;
            } else {
                fArr[i2] = ftj.d(16.0f) + f2;
                return;
            }
        }
        int i3 = i - 1;
        if (i2 == i3) {
            if (this.mIsScienceSleep && !this.mIsOnlyNoonSleepType) {
                fArr[i2] = this.mCoreSleepEndX - f2;
                return;
            } else if (this.mIsManual) {
                fArr[i2] = this.mUpSleepEndX;
                return;
            } else {
                fArr[i2] = ((this.mViewWidth - ftj.d(16.0f)) - f) - f2;
                return;
            }
        }
        fArr[i2] = ((((this.mViewWidth - (ftj.d(16.0f) * 2.0f)) - f) / i3) * i2) + ftj.d(16.0f);
    }

    private void setDrawText(int i, float[] fArr, Canvas canvas, Paint paint, int i2, float f) {
        if (i == 0) {
            canvas.drawText(this.mTime[i], fArr[i] + ((Integer) BaseActivity.getSafeRegionWidth().first).intValue(), this.mCursorTextHeight, paint);
        } else if (i == i2 - 1) {
            if (!this.mIsManualAndIncomplete) {
                canvas.drawText(this.mTime[i], fArr[i] - ((Integer) BaseActivity.getSafeRegionWidth().second).intValue(), this.mCursorTextHeight, paint);
            }
        } else {
            canvas.drawText(this.mTime[i], fArr[i], this.mCursorTextHeight, paint);
        }
        String str = this.mStartDate;
        float fMeasureText = (int) paint.measureText(str, 0, str.length());
        String str2 = this.mEndDate;
        float f2 = (f - fMeasureText) / 2.0f;
        float fMeasureText2 = (f - ((int) paint.measureText(str2, 0, str2.length()))) / 2.0f;
        if (i == 0) {
            canvas.drawText(this.mDate[0], fArr[i] + f2 + ((Integer) BaseActivity.getSafeRegionWidth().first).intValue(), this.mCursorTextHeight - ftj.d(12.0f), paint);
        } else {
            if (i == i2 - 1) {
                if (this.mIsManualAndIncomplete) {
                    return;
                }
                canvas.drawText(this.mDate[1], (fArr[i] + fMeasureText2) - ((Integer) BaseActivity.getSafeRegionWidth().second).intValue(), this.mCursorTextHeight - ftj.d(12.0f), paint);
                return;
            }
            LogUtil.a(TAG, "i is not start and end");
        }
    }

    private void drawStartEndTimeStr(Canvas canvas, float f, float f2, long j, long j2) {
        String time;
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j);
        this.mStartHour = calendar.get(11);
        int i = calendar.get(12);
        this.mStartMin = i;
        String time2 = "";
        if (this.mStartHour == 20 && i == 0) {
            time = "";
        } else {
            time = formatTime(getTimeStr(this.mStartHour) + ":" + getTimeStr(this.mStartMin));
        }
        calendar.setTimeInMillis(j2);
        this.mEndHour = calendar.get(11);
        int i2 = calendar.get(12);
        this.mEndMin = i2;
        if (this.mEndHour != 20 || i2 != 0) {
            time2 = formatTime(getTimeStr(this.mEndHour) + ":" + getTimeStr(this.mEndMin));
        }
        Paint paint = new Paint();
        if (this.mColorType == 1) {
            paint.setColor(this.mContext.getResources().getColor(R.color.textColorPrimary));
        } else {
            paint.setColor(this.mContext.getResources().getColor(R.color.textColorSecondary));
        }
        paint.setTextSize(qqf.b(0, this.mContext.getResources().getDimension(R.dimen.emui_text_size_caption)));
        paint.setAntiAlias(true);
        if (this.mIsScienceSleep && !this.mIsOnlyNoonSleepType && !this.mIsPhone) {
            canvas.drawText(time, (f - ((int) Math.max(paint.measureText(time, 0, time.length()), paint.measureText(time2, 0, time2.length())))) - this.mTimeStringMargin, this.mTimeStrY, paint);
            canvas.drawText(time2, f2 + this.mTimeStringMargin, this.mTimeStrY, paint);
        } else if (this.mIsOnlyNoonSleepType) {
            drawOnlyNoonSleepStartEndTime(canvas, paint, f, f2);
        }
    }

    private void drawOnlyNoonSleepStartEndTime(Canvas canvas, Paint paint, float f, float f2) {
        String startEndTimeFormat;
        String startEndTimeFormat2;
        float fD;
        boolean z;
        if (this.mIsPhone && !this.mIsOnlyNoonSleepType) {
            int[] hourAndMin = getHourAndMin(this.mGoBedTime);
            this.mStartHour = hourAndMin[0];
            this.mStartMin = hourAndMin[1];
            int[] hourAndMin2 = getHourAndMin(this.mOffBedTime);
            this.mEndHour = hourAndMin2[0];
            this.mEndMin = hourAndMin2[1];
        }
        if (LanguageUtil.ba(BaseApplication.getContext())) {
            startEndTimeFormat2 = getStartEndTimeFormat(this.mStartHour, this.mStartMin);
            startEndTimeFormat = getStartEndTimeFormat(this.mEndHour, this.mEndMin);
        } else {
            startEndTimeFormat = getStartEndTimeFormat(this.mStartHour, this.mStartMin);
            startEndTimeFormat2 = getStartEndTimeFormat(this.mEndHour, this.mEndMin);
        }
        float fMeasureText = (int) paint.measureText(startEndTimeFormat, 0, startEndTimeFormat.length());
        float f3 = (f - fMeasureText) - this.mTimeStringMargin;
        if (0.0f >= f3 - ftj.d(16.0f)) {
            fD = ftj.d(16.0f);
            z = true;
        } else {
            fD = f3;
            z = false;
        }
        setDrawVerticalLine(canvas, paint, f, f2, fMeasureText, z, false, fD, startEndTimeFormat, startEndTimeFormat2);
    }

    private String getStartEndTimeFormat(int i, int i2) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(lsl.a(), lsl.l(System.currentTimeMillis()), 1, i, i2);
        if (this.mIsPhone && !this.mIsOnlyNoonSleepType) {
            return UnitUtil.a(calendar.getTime(), 129);
        }
        return UnitUtil.a(calendar.getTime(), 1);
    }

    private void setDrawVerticalLine(Canvas canvas, Paint paint, float f, float f2, float f3, boolean z, boolean z2, float f4, String str, String str2) {
        boolean z3;
        boolean z4;
        boolean z5;
        float f5;
        float f6;
        float f7 = this.mTimeStringMargin + f2 + f3;
        float fD = ftj.d(13.0f);
        if (ftj.d(16.0f) + f7 > this.mViewWidth) {
            z3 = true;
        } else {
            f7 = this.mTimeStringMargin + f2;
            z3 = z2;
        }
        if (!this.mIsPhone || this.mIsOnlyNoonSleepType) {
            z4 = z3;
            z5 = z;
        } else {
            z5 = false;
            z4 = false;
        }
        LogUtil.a(TAG, "setDrawVerticalLine tipEndX ", Float.valueOf(f7), " tipStartX ", Float.valueOf(f4), " startTextWidth ", Float.valueOf(f3), " mDiagramWidth ", Float.valueOf(this.mDiagramWidth));
        if (!this.mIsPhone || this.mIsOnlyNoonSleepType) {
            f5 = f4;
        } else {
            float f8 = f3 / 2.0f;
            f5 = f - f8;
            f7 = f2 - f8;
        }
        if (!z5 && !z4) {
            drawVerticalLine(canvas, f, 0.0f);
            canvas.drawText(str, f5, fD, paint);
            drawVerticalLine(canvas, f2, 0.0f);
            canvas.drawText(str2, f7, fD, paint);
        }
        String str3 = str + Constants.LINK + str2;
        if (z4) {
            float f9 = this.mViewWidth;
            float f10 = this.mTimeStringMargin;
            float fMeasureText = (int) paint.measureText(str3, 0, str3.length());
            canvas.drawText(str + Constants.LINK + str2, ((f9 - f10) - fMeasureText) - ftj.d(16.0f), fD, paint);
            f6 = 12.0f;
            drawVerticalLine(canvas, f, 12.0f);
            drawVerticalLine(canvas, f2, 12.0f);
        } else {
            f6 = 12.0f;
        }
        if (z5) {
            drawVerticalLine(canvas, f, f6);
            drawVerticalLine(canvas, f2, f6);
            canvas.drawText(str + Constants.LINK + str2, f5, fD, paint);
        }
    }

    private void drawVerticalLine(Canvas canvas, float f, float f2) {
        float f3;
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
        float fD = ftj.d(f2);
        if (this.mIsPhone) {
            f3 = this.mVerticalLineStartY + fD;
            fD = ftj.d(13.0f);
        } else {
            f3 = this.mVerticalLineStartY;
        }
        path.moveTo(f, f3 + fD);
        path.lineTo(f, this.mTransparentHeight);
        canvas.drawPath(path, paint);
    }

    private ArrayList<fra> getSleepSumList() {
        ArrayList<fra> arrayList = new ArrayList<>(16);
        for (fra fraVar : this.mCopyOfFitnessDataList) {
            if (fraVar.a() != 64) {
                if (arrayList.size() == 0) {
                    arrayList.add(fraVar);
                } else {
                    fra fraVar2 = arrayList.get(arrayList.size() - 1);
                    if (fraVar2.f34430c == fraVar.g) {
                        fraVar2.f34430c = fraVar.f34430c;
                    } else {
                        arrayList.add(fraVar);
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
                if (this.mIsManual) {
                    if (this.mColorType == 1) {
                        this.mEndConnectionColor = this.mContext.getResources().getColor(R.color.manual_bed_time_chart_color_10);
                    } else {
                        this.mEndConnectionColor = this.mContext.getResources().getColor(R.color.manual_bed_time_chart_color);
                    }
                } else if (this.mColorType == 1) {
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
                if (this.mIsManual) {
                    if (this.mColorType == 1) {
                        this.mStartConnectionColor = this.mContext.getResources().getColor(R.color.manual_sleep_time_chart_color_10);
                    } else {
                        this.mStartConnectionColor = this.mContext.getResources().getColor(R.color.manual_sleep_time_chart_color);
                    }
                } else if (this.mColorType == 1) {
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
                    this.mStartLineRectColor = this.mContext.getResources().getColor(R.color.color_05b666fd);
                    this.mEndLineRectColor = this.mContext.getResources().getColor(R.color.color_05b766fb);
                } else {
                    this.mStartLineRectColor = this.mContext.getResources().getColor(R.color.color_ffb666fd);
                    this.mEndLineRectColor = this.mContext.getResources().getColor(R.color.color_ffb766fb);
                }
                break;
            case 67:
                if (this.mIsManual) {
                    if (this.mColorType == 1) {
                        this.mStartLineRectColor = this.mContext.getResources().getColor(R.color.manual_bed_time_chart_color_10);
                        this.mEndLineRectColor = this.mContext.getResources().getColor(R.color.manual_bed_time_chart_color_10);
                    } else {
                        this.mStartLineRectColor = this.mContext.getResources().getColor(R.color.manual_bed_time_chart_color);
                        this.mEndLineRectColor = this.mContext.getResources().getColor(R.color.manual_bed_time_chart_color);
                    }
                } else {
                    setAwakeSleepGradientColor();
                }
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

    private void drawLineArc(Canvas canvas, d dVar) {
        Paint paint = new Paint();
        paint.setColor(getResources().getColor(R.color.colorBackground));
        paint.setStrokeWidth(1.0f);
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        canvas.drawArc(new RectF(dVar.f7463c, dVar.f7462b, dVar.j, dVar.d), dVar.f7461a, dVar.e, true, paint);
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
                if (this.mIsManual) {
                    if (this.mColorType == 1) {
                        this.mStartLineRectColor = this.mContext.getResources().getColor(R.color.manual_sleep_time_chart_color_10);
                        this.mEndLineRectColor = this.mContext.getResources().getColor(R.color.manual_sleep_time_chart_color_10);
                    } else {
                        this.mStartLineRectColor = this.mContext.getResources().getColor(R.color.manual_sleep_time_chart_color);
                        this.mEndLineRectColor = this.mContext.getResources().getColor(R.color.manual_sleep_time_chart_color);
                    }
                } else if (this.mColorType == 1) {
                    this.mStartLineRectColor = this.mContext.getResources().getColor(R.color.color_05d872c2);
                    this.mEndLineRectColor = this.mContext.getResources().getColor(R.color.color_05d671c5);
                } else {
                    this.mStartLineRectColor = this.mContext.getResources().getColor(R.color.color_ffd872c2);
                    this.mEndLineRectColor = this.mContext.getResources().getColor(R.color.color_ffd671c5);
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
        if (this.mIsManual) {
            if (this.mColorType == 1) {
                this.mStartLineRectColor = this.mContext.getResources().getColor(R.color.manual_bed_time_chart_color_10);
                this.mEndLineRectColor = this.mContext.getResources().getColor(R.color.manual_bed_time_chart_color_10);
                return;
            } else {
                this.mStartLineRectColor = this.mContext.getResources().getColor(R.color.manual_bed_time_chart_color);
                this.mEndLineRectColor = this.mContext.getResources().getColor(R.color.manual_bed_time_chart_color);
                return;
            }
        }
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
                if (this.mIsManual) {
                    if (this.mColorType == 1) {
                        this.mEndConnectionColor = this.mContext.getResources().getColor(R.color.manual_sleep_time_chart_color_10);
                    } else {
                        this.mEndConnectionColor = this.mContext.getResources().getColor(R.color.manual_sleep_time_chart_color);
                    }
                } else if (this.mColorType == 1) {
                    this.mEndConnectionColor = this.mContext.getResources().getColor(R.color.color_10ba76f9);
                } else {
                    this.mEndConnectionColor = this.mContext.getResources().getColor(R.color.color_ffba76f9);
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
                    this.mStartConnectionColor = this.mContext.getResources().getColor(R.color.color_10d991e0);
                } else {
                    this.mStartConnectionColor = this.mContext.getResources().getColor(R.color.color_ffd991e0);
                }
                break;
            case 67:
                if (this.mIsManual) {
                    if (this.mColorType == 1) {
                        this.mStartConnectionColor = this.mContext.getResources().getColor(R.color.manual_bed_time_chart_color_10);
                    } else {
                        this.mStartConnectionColor = this.mContext.getResources().getColor(R.color.manual_bed_time_chart_color);
                    }
                } else {
                    setAwakeSleepStartConnectionLineColor();
                }
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
                if (this.mIsManual) {
                    if (this.mColorType == 1) {
                        this.mStartLineRectColor = this.mContext.getResources().getColor(R.color.manual_sleep_time_chart_color_10);
                        this.mEndLineRectColor = this.mContext.getResources().getColor(R.color.manual_sleep_time_chart_color_10);
                    } else {
                        this.mStartLineRectColor = this.mContext.getResources().getColor(R.color.manual_sleep_time_chart_color);
                        this.mEndLineRectColor = this.mContext.getResources().getColor(R.color.manual_sleep_time_chart_color);
                    }
                } else if (this.mColorType == 1) {
                    this.mStartLineRectColor = this.mContext.getResources().getColor(R.color.color_05d671c5);
                    this.mEndLineRectColor = this.mContext.getResources().getColor(R.color.color_05d872c2);
                } else {
                    this.mStartLineRectColor = this.mContext.getResources().getColor(R.color.color_ffd671c5);
                    this.mEndLineRectColor = this.mContext.getResources().getColor(R.color.color_ffd872c2);
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
                    this.mStartLineRectColor = this.mContext.getResources().getColor(R.color.color_05b766fb);
                    this.mEndLineRectColor = this.mContext.getResources().getColor(R.color.color_05b666fd);
                } else {
                    this.mStartLineRectColor = this.mContext.getResources().getColor(R.color.color_ffb766fb);
                    this.mEndLineRectColor = this.mContext.getResources().getColor(R.color.color_ffb666fd);
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

    public c getOnlyNoonRectSetting(int i, float f) {
        float fD = ftj.d(24.0f);
        float f2 = this.mDiagramHeight;
        this.mIsOtherType = false;
        c cVar = new c();
        if (i == 69) {
            cVar.f7459b = ((f2 - fD) * 0.38f) + fD;
            cVar.d = (3.0f * fD) + ((f - fD) * 0.62f);
            return cVar;
        }
        this.mIsOtherType = true;
        return cVar;
    }

    private c getCurrentRectSetting(int i, float f) {
        float fD = ftj.d(24.0f);
        this.mIsOtherType = false;
        c cVar = new c();
        if (this.mIsManualAndOnlyBed) {
            float f2 = fD + ((f - fD) * 0.33f);
            cVar.f7459b = f2;
            cVar.d = f2 + ftj.d(32.0f);
            return cVar;
        }
        if (this.mIsPhone || this.mIsManual) {
            switch (i) {
                case 65:
                    float f3 = fD + ((f - fD) * 0.66f);
                    cVar.f7459b = f3;
                    cVar.d = f3 + ftj.d(32.0f);
                    return cVar;
                case 66:
                    float f4 = fD + ((f - fD) * 0.33f);
                    cVar.f7459b = f4;
                    cVar.d = f4 + ftj.d(32.0f);
                    return cVar;
                case 67:
                    cVar.f7459b = fD;
                    cVar.d = fD + ftj.d(32.0f);
                    return cVar;
                default:
                    this.mIsOtherType = true;
                    return cVar;
            }
        }
        if (!this.mIsScienceSleep) {
            return this.mIsCommonSleep ? getOrdinaryRectSetting(i, f) : cVar;
        }
        switch (i) {
            case 65:
                float f5 = fD + ((f - fD) * 0.75f);
                cVar.f7459b = f5;
                cVar.d = f5 + ftj.d(25.5f);
                return cVar;
            case 66:
                float f6 = fD + ((f - fD) * 0.5f);
                cVar.f7459b = f6;
                cVar.d = f6 + ftj.d(25.5f);
                return cVar;
            case 67:
                cVar.f7459b = fD;
                cVar.d = fD + ftj.d(25.5f);
                return cVar;
            case 68:
                float f7 = fD + ((f - fD) * 0.25f);
                cVar.f7459b = f7;
                cVar.d = f7 + ftj.d(25.5f);
                return cVar;
            default:
                this.mIsOtherType = true;
                return cVar;
        }
    }

    private c getOrdinaryRectSetting(int i, float f) {
        float fD = ftj.d(24.0f);
        this.mIsOtherType = false;
        c cVar = new c();
        switch (i) {
            case 65:
                float f2 = fD + ((f - fD) * 0.66f);
                cVar.f7459b = f2;
                cVar.d = f2 + ftj.d(32.0f);
                break;
            case 66:
                float f3 = fD + ((f - fD) * 0.33f);
                cVar.f7459b = f3;
                cVar.d = f3 + ftj.d(32.0f);
                break;
            case 67:
                cVar.f7459b = fD;
                cVar.d = fD + ftj.d(32.0f);
                break;
            default:
                this.mIsOtherType = true;
                break;
        }
        return cVar;
    }

    private void setConnectionBlock(Canvas canvas, fra fraVar, c cVar, fra fraVar2, c cVar2) {
        if (cVar.d - cVar2.d < 0.0f) {
            setTopToBottomConnectionBlock(canvas, fraVar, cVar, fraVar2, cVar2);
        } else {
            setBottomToTopConnectionBlock(canvas, fraVar, cVar, fraVar2, cVar2);
        }
    }

    private void setBottomToTopConnectionBlock(Canvas canvas, fra fraVar, c cVar, fra fraVar2, c cVar2) {
        float fD;
        float fD2;
        float fD3 = ftj.d(6.0f);
        float fD4 = ftj.d(1.0f);
        if (cVar.f7458a - cVar.f7460c < fD3) {
            fD = (cVar.f7458a - cVar.f7460c) / 2.0f;
        } else {
            fD = ftj.d(3.0f);
        }
        float f = fD;
        setBottomToTopStartColor(fraVar.a());
        if (LanguageUtil.ba(BaseApplication.getContext())) {
            drawLineRect(canvas, cVar.f7460c, (cVar.f7459b - f) + fD4, cVar.f7460c + f, cVar.f7459b + f);
            drawArc5(canvas, cVar, fD4, f);
        } else {
            float f2 = cVar.f7458a;
            drawLineRect(canvas, f2 - f, (cVar.f7459b - f) + fD4, cVar.f7458a, cVar.f7459b + f);
            drawArc6(canvas, cVar, fD4, f);
        }
        if (cVar2.f7458a - cVar2.f7460c < fD3) {
            fD2 = (cVar2.f7458a - cVar2.f7460c) / 2.0f;
        } else {
            fD2 = ftj.d(3.0f);
        }
        float f3 = fD2;
        setBottomToTopEndColor(fraVar2.a());
        setBottomToTopLineStartColor(fraVar.a());
        setBottomToTopLineEndColor(fraVar2.a());
        if (LanguageUtil.ba(BaseApplication.getContext())) {
            float f4 = cVar2.f7458a;
            drawLineRect(canvas, f4 - f3, cVar2.d - f3, cVar2.f7458a, cVar2.d + f3);
            drawArc7(canvas, cVar2, fD4, f3);
            drawConnectionLine(canvas, cVar.f7460c, (cVar.d - f3) - fD4, cVar.f7460c, cVar2.f7459b + f3 + fD4);
            return;
        }
        drawLineRect(canvas, cVar2.f7460c, cVar2.d - f3, cVar2.f7460c + f3, (cVar2.d + f3) - fD4);
        drawArc8(canvas, cVar2, fD4, f3);
        drawConnectionLine(canvas, cVar.f7458a, (cVar.d - f3) - fD4, cVar.f7458a, cVar2.f7459b + f3 + fD4);
    }

    private void drawArc5(Canvas canvas, c cVar, float f, float f2) {
        d dVar = new d();
        dVar.f7463c = cVar.f7460c;
        float f3 = f2 * 2.0f;
        dVar.f7462b = cVar.f7459b - f3;
        dVar.j = cVar.f7460c + f3 + f;
        dVar.d = cVar.f7459b;
        dVar.f7461a = 180.0f;
        dVar.e = -90.0f;
        drawLineArc(canvas, dVar);
    }

    private void drawArc6(Canvas canvas, c cVar, float f, float f2) {
        d dVar = new d();
        float f3 = f2 * 2.0f;
        dVar.f7463c = cVar.f7458a - (f + f3);
        dVar.f7462b = cVar.f7459b - f3;
        dVar.j = cVar.f7458a;
        dVar.d = cVar.f7459b;
        dVar.f7461a = 0.0f;
        dVar.e = 90.0f;
        drawLineArc(canvas, dVar);
    }

    private void drawArc7(Canvas canvas, c cVar, float f, float f2) {
        d dVar = new d();
        float f3 = f2 * 2.0f;
        dVar.f7463c = ((cVar.f7458a - f3) + f) - RTL_EXTRA_LEFT;
        dVar.f7462b = cVar.d;
        dVar.j = cVar.f7458a;
        dVar.d = cVar.d + f3 + 2.0f;
        dVar.f7461a = 0.0f;
        dVar.e = -90.0f;
        drawLineArc(canvas, dVar);
    }

    private void drawArc8(Canvas canvas, c cVar, float f, float f2) {
        d dVar = new d();
        dVar.f7463c = cVar.f7460c;
        dVar.f7462b = cVar.d;
        float f3 = f2 * 2.0f;
        dVar.j = cVar.f7460c + f + f3;
        dVar.d = cVar.d + f3;
        dVar.f7461a = 180.0f;
        dVar.e = 90.0f;
        drawLineArc(canvas, dVar);
    }

    private void setTopToBottomConnectionBlock(Canvas canvas, fra fraVar, c cVar, fra fraVar2, c cVar2) {
        float fD;
        float fD2;
        float fD3 = ftj.d(6.0f);
        float fD4 = ftj.d(1.0f);
        if (cVar.f7458a - cVar.f7460c < fD3) {
            fD = (cVar.f7458a - cVar.f7460c) / 2.0f;
        } else {
            fD = ftj.d(3.0f);
        }
        float f = fD;
        setTopToBottomStartColor(fraVar.a());
        if (LanguageUtil.ba(BaseApplication.getContext())) {
            drawLineRect(canvas, cVar.f7460c, cVar.d - f, cVar.f7460c + f, cVar.d + f);
            drawArc1(canvas, cVar, fD4, f);
        } else {
            float f2 = cVar.f7458a;
            drawLineRect(canvas, f2 - f, cVar.d - f, cVar.f7458a, (cVar.d + f) - fD4);
            drawArc2(canvas, cVar, fD4, f);
        }
        if (cVar2.f7458a - cVar2.f7460c < fD3) {
            fD2 = (cVar2.f7458a - cVar2.f7460c) / 2.0f;
        } else {
            fD2 = ftj.d(3.0f);
        }
        float f3 = fD2;
        setTopToBottomEndColor(fraVar2.a());
        setTopToBottomLineStartColor(fraVar.a());
        setTopToBottomLineEndColor(fraVar2.a());
        if (LanguageUtil.ba(BaseApplication.getContext())) {
            float f4 = cVar2.f7458a;
            drawLineRect(canvas, f4 - f3, (cVar2.f7459b - f3) + fD4, cVar2.f7458a, cVar2.f7459b + f3);
            drawArc3(canvas, cVar2, fD4, f3);
            drawConnectionLine(canvas, cVar.f7460c, cVar.f7459b + f3 + fD4, cVar.f7460c, (cVar2.d - f3) - fD4);
            return;
        }
        drawLineRect(canvas, cVar2.f7460c, (cVar2.f7459b - f3) + fD4, cVar2.f7460c + f3, cVar2.f7459b + f3);
        drawArc4(canvas, cVar2, fD4, f3);
        drawConnectionLine(canvas, cVar.f7458a, cVar.f7459b + f3 + fD4, cVar.f7458a, (cVar2.d - f3) - fD4);
    }

    private void drawArc1(Canvas canvas, c cVar, float f, float f2) {
        d dVar = new d();
        dVar.f7463c = cVar.f7460c;
        dVar.f7462b = cVar.d;
        float f3 = f2 * 2.0f;
        dVar.j = cVar.f7460c + f + f3;
        dVar.d = cVar.d + f3 + 2.0f;
        dVar.f7461a = 180.0f;
        dVar.e = 90.0f;
        drawLineArc(canvas, dVar);
    }

    private void drawArc2(Canvas canvas, c cVar, float f, float f2) {
        d dVar = new d();
        float f3 = f2 * 2.0f;
        dVar.f7463c = cVar.f7458a - (f + f3);
        dVar.f7462b = cVar.d;
        dVar.j = cVar.f7458a;
        dVar.d = cVar.d + f3;
        dVar.f7461a = 0.0f;
        dVar.e = -90.0f;
        drawLineArc(canvas, dVar);
    }

    private void drawArc3(Canvas canvas, c cVar, float f, float f2) {
        d dVar = new d();
        float f3 = f2 * 2.0f;
        dVar.f7463c = cVar.f7458a - (f + f3);
        dVar.f7462b = cVar.f7459b - f3;
        dVar.j = cVar.f7458a;
        dVar.d = cVar.f7459b;
        dVar.f7461a = 0.0f;
        dVar.e = 90.0f;
        drawLineArc(canvas, dVar);
    }

    private void drawArc4(Canvas canvas, c cVar, float f, float f2) {
        d dVar = new d();
        dVar.f7463c = cVar.f7460c;
        float f3 = f2 * 2.0f;
        dVar.f7462b = cVar.f7459b - f3;
        dVar.j = cVar.f7460c + f3 + f;
        dVar.d = cVar.f7459b;
        dVar.f7461a = 180.0f;
        dVar.e = -90.0f;
        drawLineArc(canvas, dVar);
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
                    if (this.mIsManual) {
                        setCurrentRectSleepColor();
                    } else {
                        setCurrentRectLightColor();
                    }
                    break;
                case 67:
                    if (this.mIsManual) {
                        setCurrentRectBedColor();
                    } else {
                        setCurrentRectAwakeColor();
                    }
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

    private void setCurrentRectSleepColor() {
        if (this.mColorType == 1) {
            this.mStartCyColor = this.mContext.getResources().getColor(R.color.manual_sleep_time_chart_color_10);
            this.mEndCyColor = this.mContext.getResources().getColor(R.color.manual_sleep_time_chart_color_10);
        } else {
            this.mStartCyColor = this.mContext.getResources().getColor(R.color.manual_sleep_time_chart_color);
            this.mEndCyColor = this.mContext.getResources().getColor(R.color.manual_sleep_time_chart_color);
        }
    }

    private void setCurrentRectBedColor() {
        if (this.mColorType == 1) {
            this.mStartCyColor = this.mContext.getResources().getColor(R.color.manual_bed_time_chart_color_10);
            this.mEndCyColor = this.mContext.getResources().getColor(R.color.manual_bed_time_chart_color_10);
        } else {
            this.mStartCyColor = this.mContext.getResources().getColor(R.color.manual_bed_time_chart_color);
            this.mEndCyColor = this.mContext.getResources().getColor(R.color.manual_bed_time_chart_color);
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
            this.mStartCyColor = this.mContext.getResources().getColor(R.color.color_10da73c0);
            this.mEndCyColor = this.mContext.getResources().getColor(R.color.color_10b566ff);
        } else {
            this.mStartCyColor = this.mContext.getResources().getColor(R.color.color_ffda73c0);
            this.mEndCyColor = this.mContext.getResources().getColor(R.color.color_ffb566ff);
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

    private void drawCyRect(Canvas canvas, c cVar) {
        Paint paint = new Paint();
        paint.setShader(new LinearGradient(cVar.f7460c, cVar.f7459b, cVar.f7460c, cVar.d, this.mStartCyColor, this.mEndCyColor, Shader.TileMode.MIRROR));
        paint.setAntiAlias(true);
        paint.setStrokeWidth(1.0f);
        canvas.drawRoundRect(new RectF(cVar.f7460c, cVar.f7459b, cVar.f7458a, cVar.d), ftj.d(3.0f), ftj.d(3.0f), paint);
    }

    private fra getMaxSleepData(ArrayList<fra> arrayList) {
        if (arrayList == null || arrayList.size() == 0) {
            return null;
        }
        fra fraVar = arrayList.get(0);
        for (fra fraVar2 : arrayList) {
            if (fraVar2.f34430c - fraVar2.g > fraVar.f34430c - fraVar.g) {
                fraVar = fraVar2;
            }
        }
        return fraVar;
    }

    private void getTheLastData(fra fraVar) {
        boolean z = fraVar.a() == 67 || fraVar.a() == 68;
        boolean z2 = fraVar.a() == 66 || fraVar.a() == 69 || fraVar.a() == 65;
        if (z || z2) {
            this.mLastData = fraVar;
        } else {
            this.mLastData = null;
        }
    }

    private String dateToString(Date date) {
        return DateFormatUtil.d(date.getTime(), DateFormatUtil.DateFormatType.DATE_FORMAT_MONTH_DAY_MD);
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

    private int[] getHourAndMin(long j) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j);
        return new int[]{calendar.get(11), calendar.get(12)};
    }

    private void initAccessibilityHelper() {
        if (lrd.d()) {
            createAccessibilityHelper();
        } else {
            setAccessibilityListener();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void createAccessibilityHelper() {
        ChartTouchHelper chartTouchHelper = new ChartTouchHelper(this, lrm.class);
        this.mHelper = chartTouchHelper;
        ViewCompat.setAccessibilityDelegate(this, chartTouchHelper);
    }

    private void setAccessibilityListener() {
        AccessibilityManager accessibilityManagerA = lrd.a();
        if (accessibilityManagerA == null) {
            LogUtil.j(TAG, "accessibilityManager is ", accessibilityManagerA);
        } else {
            accessibilityManagerA.addTouchExplorationStateChangeListener(this.mAccessibilityListerner);
        }
    }

    static class a implements AccessibilityManager.TouchExplorationStateChangeListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f7457b = true;
        private WeakReference<BaseSleepDayDetailView> e;

        a(BaseSleepDayDetailView baseSleepDayDetailView) {
            this.e = new WeakReference<>(baseSleepDayDetailView);
        }

        @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
        public void onTouchExplorationStateChanged(boolean z) {
            BaseSleepDayDetailView baseSleepDayDetailView = this.e.get();
            if (baseSleepDayDetailView != null && z && this.f7457b) {
                baseSleepDayDetailView.createAccessibilityHelper();
                this.f7457b = false;
            }
        }
    }

    @Override // android.view.View
    protected boolean dispatchHoverEvent(MotionEvent motionEvent) {
        LogUtil.a(TAG, "enter into dispatchHoverEvent");
        ChartTouchHelper chartTouchHelper = this.mHelper;
        if (chartTouchHelper != null && chartTouchHelper.dispatchHoverEvent(motionEvent)) {
            LogUtil.a(TAG, "enter into dispatchHoverEvent != null");
            return true;
        }
        return super.dispatchHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        LogUtil.a(TAG, "enter into dispatchKeyEvent");
        ChartTouchHelper chartTouchHelper = this.mHelper;
        if (chartTouchHelper != null && chartTouchHelper.dispatchKeyEvent(keyEvent)) {
            LogUtil.a(TAG, "enter into dispatchKeyEvent != null");
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        initAccessibilityHelper();
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AccessibilityManager accessibilityManagerA = lrd.a();
        if (accessibilityManagerA == null) {
            LogUtil.j(TAG, "accessibilityManager is ", accessibilityManagerA);
        } else {
            accessibilityManagerA.removeTouchExplorationStateChangeListener(this.mAccessibilityListerner);
        }
    }
}
