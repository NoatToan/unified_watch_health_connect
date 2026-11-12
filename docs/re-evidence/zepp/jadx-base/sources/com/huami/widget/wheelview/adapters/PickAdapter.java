package com.huami.widget.wheelview.adapters;

import android.content.Context;
import android.database.DataSetObserver;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.google.android.material.timepicker.TimeModel;
import com.google.firebase.crashlytics.internal.common.IdManager;
import com.huami.widget.wheelview.Constant;
import com.huami.widget.wheelview.HMTimeChooseView;
import com.huami.widget.wheelview.R;
import com.huami.widget.wheelview.WheelView;
import com.huami.widget.wheelview.event.Event12HourUpdate;
import com.huami.widget.wheelview.event.EventAmPmUpdate;
import com.xiaomi.hm.health.baseutil.StringConvertUtils;
import com.xiaomi.hm.health.baseutil.TimeUtils;
import de.greenrobot.event.EventBus;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Calendar;
import java.util.Locale;

/* JADX INFO: loaded from: classes17.dex */
public class PickAdapter implements WheelViewAdapter {
    private static final String D = "PickAdapter";
    private static final int E = 16777215;
    private static final String F = "--";
    public static final int INDEX_TODAY = 10000000;
    public static final int MIDDLE_LARGE_NUM = 8388607;
    public static final String STYLE_MI_UI = "miui";
    public static final String STYLE_NORMAL = "normal";
    public static final int TYPEFACE_DEFAULT = 0;
    public static final int TYPEFACE_DIN_MED = 1;
    public static final int TYPEFACE_KM = 3;
    public static final int TYPEFACE_PT_DIN = 2;
    private int A;
    private HMTimeChooseView.UpdateAmPmListener B;
    private HMTimeChooseView.UpdateHourListener C;
    private int a;
    private boolean b;
    private float c;
    private float d;
    private float e;
    private int f;
    private float g;
    private int h;
    private int i;
    private boolean j;
    private int k;
    private int l;
    private int m;
    private int n;
    private WheelView o;
    private LayoutInflater p;
    private Context q;
    private int r;
    private int s;
    private String t;
    private int u;
    private String v;
    private String w;
    private String[] x;
    private boolean y;
    private boolean z;

    public class b {
        public TextView a;

        private b() {
        }
    }

    public PickAdapter(Context context, int i, int i2, WheelView wheelView, int i3, int i4) {
        this(context, i, i2, wheelView, i3, i4, false);
    }

    private String a(int i) {
        Calendar calendar = Calendar.getInstance();
        calendar.add(5, i - 10000000);
        StringBuilder sb = new StringBuilder();
        sb.append(TimeUtils.formatDate_no_y(this.q, calendar.getTime(), false));
        sb.append(" ");
        if (i == 10000000) {
            return this.q.getString(R.string.today);
        }
        switch (calendar.get(7)) {
            case 1:
                sb.append(this.q.getString(R.string.sunday));
                break;
            case 2:
                sb.append(this.q.getString(R.string.monday));
                break;
            case 3:
                sb.append(this.q.getString(R.string.tuesday));
                break;
            case 4:
                sb.append(this.q.getString(R.string.wednesday));
                break;
            case 5:
                sb.append(this.q.getString(R.string.thursday));
                break;
            case 6:
                sb.append(this.q.getString(R.string.friday));
                break;
            case 7:
                sb.append(this.q.getString(R.string.saturday));
                break;
            default:
                return null;
        }
        return sb.toString();
    }

    private static String b(String str) {
        try {
            return new DecimalFormat("#,###").format(StringConvertUtils.INSTANCE.stringConvertInt(str));
        } catch (Exception unused) {
            return str;
        }
    }

    private void c() {
        if (this.y) {
            this.h = (this.m - this.n) + 2;
        } else {
            this.h = (this.m - this.n) + 1;
        }
        int i = this.h;
        if (i == 0) {
            this.i = 8388607;
        } else {
            this.i = i * (8388607 / i);
        }
    }

    @Override // com.huami.widget.wheelview.adapters.WheelViewAdapter
    public int getBASE_BUNDLE() {
        return this.h;
    }

    @Override // com.huami.widget.wheelview.adapters.WheelViewAdapter
    public View getEmptyItem(View view, ViewGroup viewGroup) {
        return null;
    }

    @Override // com.huami.widget.wheelview.adapters.WheelViewAdapter
    public int getInitLoopBase() {
        return this.i;
    }

    @Override // com.huami.widget.wheelview.adapters.WheelViewAdapter
    public View getItem(int i, View view, ViewGroup viewGroup) {
        RelativeLayout relativeLayout = (RelativeLayout) view;
        int i2 = i % this.h;
        if (relativeLayout == null) {
            int i3 = this.a;
            if (i3 == 1) {
                relativeLayout = (RelativeLayout) this.p.inflate(R.layout.wheel_item_din_med, viewGroup, false);
            } else if (i3 == 2) {
                relativeLayout = (RelativeLayout) this.p.inflate(R.layout.wheel_item_pt_din, viewGroup, false);
            } else {
                relativeLayout = i3 == 3 ? (RelativeLayout) this.p.inflate(R.layout.wheel_item_km, viewGroup, false) : (RelativeLayout) this.p.inflate(R.layout.wheel_item_normal, viewGroup, false);
            }
            b bVar = new b();
            TextView textView = (TextView) relativeLayout.findViewById(R.id.content_txt);
            bVar.a = textView;
            ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
            layoutParams.height = (int) this.g;
            ((RelativeLayout.LayoutParams) layoutParams).addRule(this.A);
            relativeLayout.setTag(bVar);
        }
        TextView textView2 = ((b) relativeLayout.getTag()).a;
        String strB = !TextUtils.isEmpty(this.v) ? String.format(this.v, Integer.valueOf((this.n + i2) * this.r)) : String.format(Locale.getDefault(), TimeModel.ZERO_LEADING_NUMBER_FORMAT, Integer.valueOf((this.n + i2) * this.r));
        int realCurrentItem = this.o.getRealCurrentItem();
        int i4 = this.s;
        if (i4 == 9) {
            int i5 = this.n + i2;
            if (i5 < 0) {
                i5 += 24;
            }
            strB = String.format(Locale.getDefault(), TimeModel.ZERO_LEADING_NUMBER_FORMAT, Integer.valueOf(i5));
        } else if (i4 == 24) {
            strB = a(i2);
        } else if (i4 != 25) {
            switch (i4) {
                case 16:
                    int i6 = this.n + i2;
                    if (i6 == 0) {
                        strB = "12";
                    } else if (i6 > 12) {
                        strB = String.format(Locale.getDefault(), TimeModel.ZERO_LEADING_NUMBER_FORMAT, Integer.valueOf(i6 - 12));
                    }
                    if (realCurrentItem == i) {
                        EventBus.getDefault().post(new Event12HourUpdate(i6));
                        HMTimeChooseView.UpdateHourListener updateHourListener = this.C;
                        if (updateHourListener != null) {
                            updateHourListener.updateHour(i6);
                        }
                    }
                    break;
                case 17:
                    strB = i2 == 0 ? this.q.getString(R.string.am) : this.q.getString(R.string.pm);
                    if (i == realCurrentItem) {
                        EventBus.getDefault().post(new EventAmPmUpdate(i2));
                        HMTimeChooseView.UpdateAmPmListener updateAmPmListener = this.B;
                        if (updateAmPmListener != null) {
                            updateAmPmListener.updateAmPm(i2);
                        }
                    }
                    break;
                case 18:
                    strB = i != 0 ? String.format(Locale.getDefault(), TimeModel.NUMBER_FORMAT, Integer.valueOf((this.n + i2) * this.r)) + this.q.getString(this.u) : this.q.getString(R.string.state_close);
                    break;
                case 19:
                    NumberFormat numberInstance = NumberFormat.getNumberInstance();
                    numberInstance.setMaximumIntegerDigits(0);
                    numberInstance.setMaximumFractionDigits(1);
                    numberInstance.setMinimumFractionDigits(1);
                    strB = numberInstance.format((this.n + i2) / 10.0f);
                    break;
                default:
                    switch (i4) {
                        case 32:
                            strB = String.format(Locale.getDefault(), TimeModel.NUMBER_FORMAT, Integer.valueOf((this.n + i2) * this.r)) + this.q.getString(this.u);
                            break;
                        case 33:
                            strB = new DecimalFormat(IdManager.DEFAULT_VERSION_NAME).format((this.n + i2) / 10.0f);
                            break;
                        case 34:
                            String[] strArr = this.x;
                            if (strArr != null && strArr.length > i2) {
                                strB = strArr[i2];
                            }
                            break;
                    }
                    break;
            }
        } else {
            strB = String.format(Locale.getDefault(), ":%d", Integer.valueOf(this.n + i2));
        }
        if (this.b) {
            strB = b(strB);
        }
        if (!TextUtils.isEmpty(this.w)) {
            strB = strB + this.w;
        }
        if (this.y && i2 == this.h - 1) {
            strB = "--";
        }
        textView2.setText(strB);
        int i7 = (int) this.c;
        if (i == realCurrentItem) {
            textView2.setTextColor(this.k);
            if (this.z) {
                textView2.setTypeface(Typeface.DEFAULT_BOLD);
            }
        } else if (i == realCurrentItem - 1 || i == realCurrentItem + 1) {
            i7 = (int) this.d;
            textView2.setTextColor(this.l);
            textView2.setTypeface(Typeface.DEFAULT);
        } else {
            i7 = (int) this.e;
            textView2.setTextColor(this.f);
            textView2.setTypeface(Typeface.DEFAULT);
        }
        textView2.setTextSize(i7);
        return relativeLayout;
    }

    @Override // com.huami.widget.wheelview.adapters.WheelViewAdapter
    public int getItemsCount() {
        if (this.j) {
            return 16777215;
        }
        return this.h;
    }

    public boolean isContainUnselectedValue() {
        return this.y;
    }

    @Override // com.huami.widget.wheelview.adapters.WheelViewAdapter
    public boolean isNeedLoop() {
        return this.j;
    }

    @Override // com.huami.widget.wheelview.adapters.WheelViewAdapter
    public void registerDataSetObserver(DataSetObserver dataSetObserver) {
    }

    public void setAppendTxt(int i) {
        this.u = i;
    }

    public void setContainUnselectedValue(boolean z) {
        this.y = z;
        c();
    }

    public void setEndValue(int i) {
        this.m = i;
        c();
    }

    public void setFormatStr(String str) {
        this.v = str;
    }

    public void setHMTimeChooseAmPmListener(HMTimeChooseView.UpdateAmPmListener updateAmPmListener) {
        this.B = updateAmPmListener;
    }

    public void setHMTimeChooseHourListener(HMTimeChooseView.UpdateHourListener updateHourListener) {
        this.C = updateHourListener;
    }

    public void setItemTextAlignment(int i) {
        this.A = i;
    }

    public void setMode(int i) {
        this.s = i;
    }

    public void setSelectItemTextBold(boolean z) {
        this.z = z;
    }

    public void setStartValue(int i) {
        this.n = i;
    }

    public void setSuffixStr(String str) {
        this.w = str;
    }

    public void setThousandsSeparators(boolean z) {
        this.b = z;
    }

    public void setTypeface(int i) {
        this.a = i;
    }

    public void setUIStyle(String str) {
        this.t = str;
    }

    public void setValueGap(int i) {
        this.r = i;
    }

    @Override // com.huami.widget.wheelview.adapters.WheelViewAdapter
    public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
    }

    public PickAdapter(Context context, int i, int i2, WheelView wheelView, int i3, int i4, boolean z) {
        this(context, i, i2, wheelView, i3, i4, -2003199591, z, 32, 12, 11, 9, 1);
    }

    public PickAdapter(Context context, String[] strArr, WheelView wheelView, boolean z) {
        this(context, strArr, wheelView, ContextCompat.getColor(context, Constant.CENTER_TEXT_COLOR), ContextCompat.getColor(context, Constant.SECOND_TEXT_COLOR), ContextCompat.getColor(context, Constant.THIRD_TEXT_COLOR), z, 52, 20, 18, 16);
    }

    public PickAdapter(Context context, String[] strArr, WheelView wheelView, int i, int i2, boolean z) {
        this(context, strArr, wheelView, i, i2, -2003199591, z, 32, 12, 11, 9);
    }

    public PickAdapter(Context context, int i, int i2, WheelView wheelView, int i3, int i4, int i5, boolean z, int i6, int i7, int i8, int i9) {
        this(context, i, i2, wheelView, i3, i4, i5, z, i6, i7, i8, i9, 1);
    }

    public PickAdapter(Context context, String[] strArr, WheelView wheelView, int i, int i2, int i3, boolean z, int i4, int i5, int i6, int i7) {
        this(context, 0, strArr.length - 1, wheelView, i, i2, i3, z, i4, i5, i6, i7, 1);
        this.x = strArr;
        this.s = 34;
    }

    public PickAdapter(Context context, int i, int i2, WheelView wheelView, int i3, int i4, int i5, boolean z, int i6, int i7, int i8, int i9, int i10) {
        this(context, i, i2, wheelView, i3, i4, i5, z, i6, i7, i8, i9, i10, 3);
    }

    public PickAdapter(Context context, int i, int i2, WheelView wheelView, int i3, int i4, int i5, boolean z, int i6, int i7, int i8, int i9, int i10, int i11, boolean z2) {
        this(context, i, i2, wheelView, i3, i4, i5, z, i6, i7, i8, i9, i10, i11);
        this.y = z2;
    }

    public PickAdapter(Context context, int i, int i2, WheelView wheelView, int i3, int i4, int i5, boolean z, int i6, int i7, int i8, int i9, int i10, int i11) {
        this.a = 3;
        this.b = false;
        this.h = 0;
        this.r = 1;
        this.y = false;
        this.z = false;
        this.A = 13;
        this.q = context;
        this.n = i;
        this.m = i2;
        this.o = wheelView;
        this.p = LayoutInflater.from(context);
        this.k = i3;
        this.l = i4;
        this.f = i5;
        this.j = z;
        this.g = TypedValue.applyDimension(1, i6, context.getResources().getDisplayMetrics());
        this.c = i7;
        this.d = i8;
        this.e = i9;
        setValueGap(i10);
        c();
        this.a = i11;
    }
}
