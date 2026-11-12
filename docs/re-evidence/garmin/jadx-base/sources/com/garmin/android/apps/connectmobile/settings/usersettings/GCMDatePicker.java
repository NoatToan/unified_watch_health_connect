package com.garmin.android.apps.connectmobile.settings.usersettings;

import android.content.Context;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.NumberPicker;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.bic.GCMNumberPicker;
import com.garmin.android.apps.connectmobile.settings.usersettings.GCMDatePicker;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import com.nimbusds.jose.jwk.JWKParameterNames;
import com.roomorama.caldroid.CaldroidFragment;
import d53.u;
import java.text.DateFormat;
import java.text.DateFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import pu.h;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0007\u0018\u00002\u00020\u0001:\u0001\u001fB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000bR$\u0010\u0013\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R$\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00068\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u000bR$\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00068\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001a\u0010\u000bR$\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00068\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u001c\u0010\u0016\u001a\u0004\b\u001d\u0010\u000b¨\u0006 "}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/usersettings/GCMDatePicker;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/util/AttributeSet;", "attrs", "", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "getClosestLimitYear", "()I", "Lcom/garmin/android/apps/connectmobile/settings/usersettings/GCMDatePicker$a;", "d", "Lcom/garmin/android/apps/connectmobile/settings/usersettings/GCMDatePicker$a;", "getOnDateChangedListener", "()Lcom/garmin/android/apps/connectmobile/settings/usersettings/GCMDatePicker$a;", "setOnDateChangedListener", "(Lcom/garmin/android/apps/connectmobile/settings/usersettings/GCMDatePicker$a;)V", "onDateChangedListener", "value", JWKParameterNames.RSA_EXPONENT, "I", "getDayOfMonth", "dayOfMonth", "f", "getMonth", CaldroidFragment.MONTH, "g", "getYear", CaldroidFragment.YEAR, "a", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class GCMDatePicker extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final GCMNumberPicker f44002a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final GCMNumberPicker f44003b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final GCMNumberPicker f44004c;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public a onDateChangedListener;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public int dayOfMonth;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public int month;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public int year;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final LocalDate f44009h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final LocalDate f44010i;

    public interface a {
        void a(Calendar calendar);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GCMDatePicker(Context context, AttributeSet attributeSet, int i14) {
        super(context, attributeSet, i14);
        context.getClass();
        Object systemService = context.getSystemService("layout_inflater");
        systemService.getClass();
        ((LayoutInflater) systemService).inflate(R.layout.gcm3_three_pickers, (ViewGroup) this, true);
        LocalDate localDateMinusYears = LocalDate.now().minusYears(((h) KoinJavaComponent.get$default(h.class, null, null, 6, null)).b());
        localDateMinusYears.getClass();
        this.f44009h = localDateMinusYears;
        LocalDate localDateMinusYears2 = LocalDate.now().minusYears(100);
        localDateMinusYears2.getClass();
        this.f44010i = localDateMinusYears2;
        View viewFindViewById = findViewById(R.id.number_picker_second);
        viewFindViewById.getClass();
        GCMNumberPicker gCMNumberPicker = (GCMNumberPicker) viewFindViewById;
        this.f44002a = gCMNumberPicker;
        final int i15 = 0;
        gCMNumberPicker.setOnValueChangedListener(new NumberPicker.OnValueChangeListener(this) { // from class: pk1.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ GCMDatePicker f138282b;

            {
                this.f138282b = this;
            }

            @Override // android.widget.NumberPicker.OnValueChangeListener
            public final void onValueChange(NumberPicker numberPicker, int i16, int i17) {
                switch (i15) {
                    case 0:
                        GCMDatePicker gCMDatePicker = this.f138282b;
                        gCMDatePicker.dayOfMonth = i17;
                        gCMDatePicker.b();
                        gCMDatePicker.c();
                        break;
                    case 1:
                        GCMDatePicker gCMDatePicker2 = this.f138282b;
                        gCMDatePicker2.month = i17 - 1;
                        gCMDatePicker2.b();
                        Calendar calendar = Calendar.getInstance();
                        calendar.set(1, gCMDatePicker2.year);
                        calendar.set(2, gCMDatePicker2.month);
                        int actualMaximum = calendar.getActualMaximum(5);
                        if (gCMDatePicker2.dayOfMonth > actualMaximum) {
                            gCMDatePicker2.dayOfMonth = actualMaximum;
                        }
                        gCMDatePicker2.c();
                        gCMDatePicker2.e();
                        break;
                    default:
                        GCMDatePicker gCMDatePicker3 = this.f138282b;
                        gCMDatePicker3.year = i17;
                        gCMDatePicker3.b();
                        Calendar calendar2 = Calendar.getInstance();
                        calendar2.set(1, gCMDatePicker3.year);
                        calendar2.set(2, gCMDatePicker3.month);
                        int actualMaximum2 = calendar2.getActualMaximum(5);
                        if (gCMDatePicker3.dayOfMonth > actualMaximum2) {
                            gCMDatePicker3.dayOfMonth = actualMaximum2;
                        }
                        gCMDatePicker3.c();
                        gCMDatePicker3.e();
                        break;
                }
            }
        });
        View viewFindViewById2 = findViewById(R.id.number_picker_first);
        viewFindViewById2.getClass();
        this.f44003b = (GCMNumberPicker) viewFindViewById2;
        String[] months = new DateFormatSymbols().getMonths();
        int i16 = 0;
        String str = months[0];
        str.getClass();
        if (u.y(str, IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE, false)) {
            int length = months.length;
            while (i16 < length) {
                int i17 = i16 + 1;
                months[i16] = String.valueOf(i17);
                i16 = i17;
            }
        }
        this.f44003b.setMinValue(1);
        this.f44003b.setMaxValue(12);
        this.f44003b.setDisplayedValues(months);
        final int i18 = 1;
        this.f44003b.setOnValueChangedListener(new NumberPicker.OnValueChangeListener(this) { // from class: pk1.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ GCMDatePicker f138282b;

            {
                this.f138282b = this;
            }

            @Override // android.widget.NumberPicker.OnValueChangeListener
            public final void onValueChange(NumberPicker numberPicker, int i19, int i110) {
                switch (i18) {
                    case 0:
                        GCMDatePicker gCMDatePicker = this.f138282b;
                        gCMDatePicker.dayOfMonth = i110;
                        gCMDatePicker.b();
                        gCMDatePicker.c();
                        break;
                    case 1:
                        GCMDatePicker gCMDatePicker2 = this.f138282b;
                        gCMDatePicker2.month = i110 - 1;
                        gCMDatePicker2.b();
                        Calendar calendar = Calendar.getInstance();
                        calendar.set(1, gCMDatePicker2.year);
                        calendar.set(2, gCMDatePicker2.month);
                        int actualMaximum = calendar.getActualMaximum(5);
                        if (gCMDatePicker2.dayOfMonth > actualMaximum) {
                            gCMDatePicker2.dayOfMonth = actualMaximum;
                        }
                        gCMDatePicker2.c();
                        gCMDatePicker2.e();
                        break;
                    default:
                        GCMDatePicker gCMDatePicker3 = this.f138282b;
                        gCMDatePicker3.year = i110;
                        gCMDatePicker3.b();
                        Calendar calendar2 = Calendar.getInstance();
                        calendar2.set(1, gCMDatePicker3.year);
                        calendar2.set(2, gCMDatePicker3.month);
                        int actualMaximum2 = calendar2.getActualMaximum(5);
                        if (gCMDatePicker3.dayOfMonth > actualMaximum2) {
                            gCMDatePicker3.dayOfMonth = actualMaximum2;
                        }
                        gCMDatePicker3.c();
                        gCMDatePicker3.e();
                        break;
                }
            }
        });
        View viewFindViewById3 = findViewById(R.id.number_picker_third);
        viewFindViewById3.getClass();
        GCMNumberPicker gCMNumberPicker2 = (GCMNumberPicker) viewFindViewById3;
        this.f44004c = gCMNumberPicker2;
        final int i19 = 2;
        gCMNumberPicker2.setOnValueChangedListener(new NumberPicker.OnValueChangeListener(this) { // from class: pk1.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ GCMDatePicker f138282b;

            {
                this.f138282b = this;
            }

            @Override // android.widget.NumberPicker.OnValueChangeListener
            public final void onValueChange(NumberPicker numberPicker, int i110, int i111) {
                switch (i19) {
                    case 0:
                        GCMDatePicker gCMDatePicker = this.f138282b;
                        gCMDatePicker.dayOfMonth = i111;
                        gCMDatePicker.b();
                        gCMDatePicker.c();
                        break;
                    case 1:
                        GCMDatePicker gCMDatePicker2 = this.f138282b;
                        gCMDatePicker2.month = i111 - 1;
                        gCMDatePicker2.b();
                        Calendar calendar = Calendar.getInstance();
                        calendar.set(1, gCMDatePicker2.year);
                        calendar.set(2, gCMDatePicker2.month);
                        int actualMaximum = calendar.getActualMaximum(5);
                        if (gCMDatePicker2.dayOfMonth > actualMaximum) {
                            gCMDatePicker2.dayOfMonth = actualMaximum;
                        }
                        gCMDatePicker2.c();
                        gCMDatePicker2.e();
                        break;
                    default:
                        GCMDatePicker gCMDatePicker3 = this.f138282b;
                        gCMDatePicker3.year = i111;
                        gCMDatePicker3.b();
                        Calendar calendar2 = Calendar.getInstance();
                        calendar2.set(1, gCMDatePicker3.year);
                        calendar2.set(2, gCMDatePicker3.month);
                        int actualMaximum2 = calendar2.getActualMaximum(5);
                        if (gCMDatePicker3.dayOfMonth > actualMaximum2) {
                            gCMDatePicker3.dayOfMonth = actualMaximum2;
                        }
                        gCMDatePicker3.c();
                        gCMDatePicker3.e();
                        break;
                }
            }
        });
        gCMNumberPicker2.setMinValue(DateTime.now().minusYears(100).getYear());
        gCMNumberPicker2.setMaxValue(DateTime.now().minusYears(((h) KoinJavaComponent.get$default(h.class, null, null, 6, null)).b()).getYear());
        Calendar calendar = Calendar.getInstance();
        int i24 = calendar.get(1);
        int i25 = calendar.get(2);
        int i26 = calendar.get(5);
        this.year = i24;
        this.month = i25;
        this.dayOfMonth = i26;
        this.onDateChangedListener = null;
        f();
        d(months);
    }

    private final int getClosestLimitYear() {
        LocalDate localDate = this.f44009h;
        int iAbs = Math.abs(localDate.getYear() - this.year);
        LocalDate localDate2 = this.f44010i;
        return iAbs < Math.abs(localDate2.getYear() - this.year) ? localDate.getYear() : localDate2.getYear();
    }

    public final void a(LinearLayout linearLayout, GCMNumberPicker gCMNumberPicker) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.setMarginStart(linearLayout.getChildCount() > 0 ? (int) TypedValue.applyDimension(1, 20.0f, getResources().getDisplayMetrics()) : 0);
        gCMNumberPicker.setLayoutParams(layoutParams);
        linearLayout.addView(gCMNumberPicker);
    }

    public final void b() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(this.year, this.month, this.dayOfMonth);
        LocalDate localDateFromCalendarFields = LocalDate.fromCalendarFields(calendar);
        LocalDate localDate = this.f44009h;
        boolean z14 = localDateFromCalendarFields.isBefore(localDate) || localDateFromCalendarFields.isEqual(localDate);
        LocalDate localDate2 = this.f44010i;
        boolean z15 = localDateFromCalendarFields.isAfter(localDate2) || localDateFromCalendarFields.isEqual(localDate2);
        if (!z14 || !z15) {
            this.year = getClosestLimitYear();
            this.month = LocalDate.now().getMonthOfYear() - 1;
            this.dayOfMonth = LocalDate.now().getDayOfMonth();
        }
        f();
    }

    public final void c() {
        if (this.onDateChangedListener != null) {
            Calendar calendar = Calendar.getInstance();
            calendar.set(this.year, this.month, this.dayOfMonth);
            a aVar = this.onDateChangedListener;
            if (aVar != null) {
                aVar.a(calendar);
            }
        }
    }

    public final void d(String[] strArr) {
        String str;
        GCMNumberPicker gCMNumberPicker;
        GCMNumberPicker gCMNumberPicker2;
        GCMNumberPicker gCMNumberPicker3;
        int i14 = 0;
        DateFormat dateFormat = u.y(strArr[0], IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE, false) ? android.text.format.DateFormat.getDateFormat(getContext()) : android.text.format.DateFormat.getMediumDateFormat(getContext());
        if (dateFormat instanceof SimpleDateFormat) {
            str = ((SimpleDateFormat) dateFormat).toPattern();
            str.getClass();
        } else {
            char[] dateFormatOrder = android.text.format.DateFormat.getDateFormatOrder(getContext());
            dateFormatOrder.getClass();
            str = new String(dateFormatOrder);
        }
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.calendar_parent);
        linearLayout.removeAllViews();
        int length = str.length();
        boolean z14 = false;
        boolean z15 = false;
        boolean z16 = false;
        boolean z17 = false;
        while (true) {
            gCMNumberPicker = this.f44004c;
            gCMNumberPicker2 = this.f44003b;
            gCMNumberPicker3 = this.f44002a;
            if (i14 >= length) {
                break;
            }
            char cCharAt = str.charAt(i14);
            if (cCharAt == '\'') {
                z16 = !z16;
            }
            if (!z16) {
                if (cCharAt == 'd' && !z15) {
                    linearLayout.getChildCount();
                    a(linearLayout, gCMNumberPicker3);
                    z15 = true;
                } else if ((cCharAt == 'M' || cCharAt == 'L') && !z14) {
                    a(linearLayout, gCMNumberPicker2);
                    z14 = true;
                } else if (cCharAt == 'y' && !z17) {
                    a(linearLayout, gCMNumberPicker);
                    z17 = true;
                }
            }
            i14++;
        }
        if (!z14) {
            linearLayout.addView(gCMNumberPicker2);
        }
        if (!z15) {
            linearLayout.addView(gCMNumberPicker3);
        }
        if (z17) {
            return;
        }
        linearLayout.addView(gCMNumberPicker);
    }

    public final void e() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(this.year, this.month, this.dayOfMonth);
        int actualMaximum = calendar.getActualMaximum(5);
        GCMNumberPicker gCMNumberPicker = this.f44002a;
        gCMNumberPicker.setMinValue(1);
        gCMNumberPicker.setMaxValue(actualMaximum);
        gCMNumberPicker.setValue(this.dayOfMonth);
    }

    public final void f() {
        e();
        this.f44004c.setValue(this.year);
        this.f44003b.setValue(this.month + 1);
    }

    public final int getDayOfMonth() {
        return this.dayOfMonth;
    }

    public final int getMonth() {
        return this.month;
    }

    public final a getOnDateChangedListener() {
        return this.onDateChangedListener;
    }

    public final int getYear() {
        return this.year;
    }

    public final void setOnDateChangedListener(a aVar) {
        this.onDateChangedListener = aVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GCMDatePicker(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GCMDatePicker(Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }

    public /* synthetic */ GCMDatePicker(Context context, AttributeSet attributeSet, int i14, int i15, j jVar) {
        this(context, (i15 & 2) != 0 ? null : attributeSet, (i15 & 4) != 0 ? 0 : i14);
    }
}
