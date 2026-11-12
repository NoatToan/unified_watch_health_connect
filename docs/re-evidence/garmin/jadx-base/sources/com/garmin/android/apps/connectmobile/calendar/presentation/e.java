package com.garmin.android.apps.connectmobile.calendar.presentation;

import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import c22.j0;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.calendar.model.CalendarItemDTO;
import com.garmin.android.apps.connectmobile.k1;
import com.roomorama.caldroid.CaldroidGridAdapter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormatter;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.x0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/garmin/android/apps/connectmobile/calendar/presentation/e;", "Lg22/c;", "Ljava/lang/Void;", "gcm-calendar_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e extends g22.c<Void, Void> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f31212c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f31213d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f31214e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ h03.a f31215f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ d f31216g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ d.c f31217h;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f31218a;

        static {
            int[] iArr = new int[CalendarItemDTO.b.values().length];
            try {
                iArr[CalendarItemDTO.b.WEIGHT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CalendarItemDTO.b.STEPS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CalendarItemDTO.b.PUSHES.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CalendarItemDTO.b.SLEEP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[CalendarItemDTO.b.SLEEP_AND_SCORE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[CalendarItemDTO.b.NAP.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[CalendarItemDTO.b.SLEEP_COACH.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[CalendarItemDTO.b.JET_LAG_TRIP.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[CalendarItemDTO.b.ACTIVITY.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[CalendarItemDTO.b.HEALTH_SNAPSHOT.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[CalendarItemDTO.b.ECG.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[CalendarItemDTO.b.MOVE_IQ_EVENT.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[CalendarItemDTO.b.HEART_RATE.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[CalendarItemDTO.b.HRV_STATUS.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[CalendarItemDTO.b.BLOOD_PRESSURE.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[CalendarItemDTO.b.EVENT.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[CalendarItemDTO.b.WORKOUT.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[CalendarItemDTO.b.FBT_ADAPTIVE_WORKOUT.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[CalendarItemDTO.b.TRAINING_PLAN.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[CalendarItemDTO.b.STRESS.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[CalendarItemDTO.b.BODY_BATTERY.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[CalendarItemDTO.b.MENSTRUAL_CYCLE.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            f31218a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(h03.a aVar, d dVar, d.c cVar) {
        super(null, 1, null);
        this.f31215f = aVar;
        this.f31216g = dVar;
        this.f31217h = cVar;
        this.f31213d = new ArrayList();
    }

    public static void e(List list, d.a aVar, int i14) {
        for (int i15 = 0; i15 < i14; i15++) {
            list.add(aVar);
        }
    }

    @Override // g22.c
    public final Void b(Void[] voidArr) {
        boolean z14;
        h03.a aVar = this.f31215f;
        aVar.g();
        Integer num = aVar.f80660c;
        d dVar = this.f31216g;
        int iF = dVar.f();
        b bVar = dVar.f31163l;
        if (num != null && num.intValue() == iF) {
            Calendar calendar = Calendar.getInstance();
            aVar.g();
            Integer num2 = aVar.f80659b;
            num2.getClass();
            int iIntValue = num2.intValue();
            aVar.g();
            int iIntValue2 = aVar.f80660c.intValue() - 1;
            aVar.g();
            Integer num3 = aVar.f80661d;
            num3.getClass();
            calendar.set(iIntValue, iIntValue2, num3.intValue());
            DateTime dateTime = new DateTime(calendar.getTime());
            DateTimeFormatter dateTimeFormatter = d.f31149t;
            dateTimeFormatter.getClass();
            String strH = j0.h(dateTime, dateTimeFormatter);
            if (bVar != null) {
                LinkedHashMap linkedHashMap = dVar.f31166o;
                ArrayList arrayListA = b.a(linkedHashMap != null ? (List) linkedHashMap.get(strH) : null);
                if (arrayListA != null) {
                    ArrayList arrayListC = b.c(arrayListA, CalendarItemDTO.b.STEPS);
                    ArrayList arrayListC2 = b.c(arrayListA, CalendarItemDTO.b.PUSHES);
                    bv.b.f21239a.getClass();
                    bv.b.a();
                    k1 k1Var = k1.f37122a;
                    boolean zW = k1Var.W();
                    int size = arrayListA.size();
                    boolean z15 = true;
                    int i14 = 0;
                    int i15 = 0;
                    int i16 = 0;
                    int i17 = 0;
                    int i18 = 0;
                    int i19 = 0;
                    int i24 = 0;
                    int i25 = 0;
                    int i26 = 0;
                    int i27 = 0;
                    int i28 = 0;
                    int i29 = 0;
                    int i30 = 0;
                    boolean z16 = false;
                    boolean z17 = false;
                    boolean z18 = false;
                    boolean z19 = false;
                    while (i18 < size) {
                        boolean z24 = zW;
                        CalendarItemDTO.b bVar2 = ((CalendarItemDTO) arrayListA.get(i18)).f30973d;
                        switch (bVar2 == null ? -1 : a.f31218a[bVar2.ordinal()]) {
                            case 1:
                                z14 = z15;
                                this.f31212c = z14;
                                continue;
                                i18++;
                                z15 = z14;
                                zW = z24;
                                break;
                            case 2:
                                arrayListC.add(arrayListA.get(i18));
                                break;
                            case 3:
                                arrayListC2.add(arrayListA.get(i18));
                                break;
                            case 4:
                            case 5:
                                z14 = z15;
                                z16 = z14;
                                continue;
                                i18++;
                                z15 = z14;
                                zW = z24;
                                break;
                            case 6:
                                i19++;
                                break;
                            case 7:
                                z14 = z15;
                                z19 = z14;
                                continue;
                                i18++;
                                z15 = z14;
                                zW = z24;
                                break;
                            case 8:
                                z14 = z15;
                                z17 = z14;
                                continue;
                                i18++;
                                z15 = z14;
                                zW = z24;
                                break;
                            case 9:
                                i24++;
                                break;
                            case 10:
                                i25++;
                                break;
                            case 11:
                                i26++;
                                break;
                            case 12:
                                i27++;
                                break;
                            case 13:
                                i15++;
                                break;
                            case 14:
                                i17++;
                                break;
                            case 15:
                                z14 = z15;
                                z18 = z14;
                                continue;
                                i18++;
                                z15 = z14;
                                zW = z24;
                                break;
                            case 16:
                                i28++;
                                break;
                            case 17:
                            case 18:
                                i29++;
                                break;
                            case 19:
                                i30++;
                                break;
                            case 20:
                                i16++;
                                break;
                            case 21:
                                i14++;
                                break;
                            case 22:
                                break;
                            default:
                                this.f31214e++;
                                break;
                        }
                        z14 = z15;
                        i18++;
                        z15 = z14;
                        zW = z24;
                    }
                    boolean z25 = zW;
                    boolean zL0 = k1Var.l0();
                    ArrayList arrayList = this.f31213d;
                    if (zL0) {
                        if (!arrayListC2.isEmpty()) {
                            arrayList.add(((CalendarItemDTO) arrayListC2.get(0)).B >= ((CalendarItemDTO) arrayListC2.get(0)).C ? d.a.STEPS : d.a.STEPS_GOAL_NOT_REACHED);
                        }
                        if (!arrayListC.isEmpty()) {
                            arrayList.add(((CalendarItemDTO) arrayListC.get(0)).f31016z >= ((CalendarItemDTO) arrayListC.get(0)).A ? d.a.STEPS : d.a.STEPS_GOAL_NOT_REACHED);
                        }
                    } else {
                        if (!arrayListC.isEmpty()) {
                            arrayList.add(((CalendarItemDTO) arrayListC.get(0)).f31016z >= ((CalendarItemDTO) arrayListC.get(0)).A ? d.a.STEPS : d.a.STEPS_GOAL_NOT_REACHED);
                        }
                        if (!arrayListC2.isEmpty()) {
                            arrayList.add(((CalendarItemDTO) arrayListC2.get(0)).B >= ((CalendarItemDTO) arrayListC2.get(0)).C ? d.a.STEPS : d.a.STEPS_GOAL_NOT_REACHED);
                        }
                    }
                    e(arrayList, d.a.ACTIVITIES, i24);
                    if (z25) {
                        e(arrayList, d.a.ECG, i26);
                    }
                    if (k1Var.Q()) {
                        e(arrayList, d.a.HEALTH_SNAPSHOT, i25);
                    }
                    e(arrayList, d.a.MOVE_IQ_EVENT, i27);
                    if (z16) {
                        if (k1Var.o()) {
                            arrayList.add(d.a.SLEEP_WITH_SLEEP_SCORE);
                        } else {
                            arrayList.add(d.a.SLEEP);
                        }
                    }
                    e(arrayList, d.a.NAP, i19);
                    if (z19 && k1Var.n()) {
                        arrayList.add(d.a.SLEEP_COACH);
                    }
                    e(arrayList, d.a.HEART_RATE, i15);
                    e(arrayList, d.a.HRV_STATUS, i17);
                    if (z18) {
                        arrayList.add(d.a.BLOOD_PRESSURE);
                    }
                    e(arrayList, d.a.STRESS, i16);
                    e(arrayList, d.a.BODY_BATTERY, i14);
                    e(arrayList, d.a.EVENTS, i28 + i29 + i30);
                    if (!z17 || !k1Var.Y()) {
                        return null;
                    }
                    arrayList.add(d.a.JET_LAG_TRIP);
                    return null;
                }
            }
        }
        return null;
    }

    @Override // g22.c
    public final void d(Void r17) {
        d.b bVar = d.f31148r;
        d dVar = this.f31216g;
        d.c cVar = this.f31217h;
        h03.a aVar = this.f31215f;
        dVar.h(cVar, aVar);
        aVar.g();
        Integer num = aVar.f80660c;
        int iF = dVar.f();
        if (num != null && num.intValue() == iF) {
            float dimension = ((CaldroidGridAdapter) dVar).resources.getDimension(R.dimen.gcm_calendar_bar_height);
            float f14 = 0.5f * dimension;
            float f15 = dVar.f31164m;
            int i14 = f15 > dimension ? ((int) ((f15 - dimension) / (dimension + f14))) + 1 : 1;
            float f16 = i14;
            float f17 = dimension + f14;
            float f18 = f15 - ((f16 * f17) - f14);
            if (f18 >= dimension) {
                i14++;
                float f19 = i14;
                f14 += (f15 - ((f17 * f19) - f14)) / f16;
                f18 = f15 - (((dimension + f14) * f19) - f14);
            }
            LinearLayout linearLayout = cVar.f31193f;
            if (linearLayout != null) {
                int i15 = (int) (f18 / 2);
                linearLayout.setPadding(0, i15, 0, i15);
            }
            ArrayList arrayList = this.f31213d;
            int size = arrayList.size();
            int i16 = 0;
            for (int i17 = 0; i17 < size; i17++) {
                d.a aVar2 = (d.a) arrayList.get(i17);
                if (i16 >= i14) {
                    break;
                }
                ImageView imageView = new ImageView(((CaldroidGridAdapter) dVar).context);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, (int) dimension);
                if (i17 != 0) {
                    layoutParams.setMargins(0, (int) f14, 0, 0);
                }
                imageView.setLayoutParams(layoutParams);
                imageView.setScaleType(ImageView.ScaleType.FIT_XY);
                if (aVar2 == d.a.STEPS_GOAL_NOT_REACHED) {
                    imageView.setImageResource(aVar2.f31187a);
                    imageView.setBackgroundColor(a7.b.getColor(((CaldroidGridAdapter) dVar).context, android.R.color.transparent));
                } else {
                    imageView.setBackgroundColor(a7.b.getColor(((CaldroidGridAdapter) dVar).context, aVar2.f31187a));
                    imageView.setImageDrawable(null);
                }
                LinearLayout linearLayout2 = cVar.f31193f;
                if (linearLayout2 != null) {
                    linearLayout2.addView(imageView);
                }
                i16++;
            }
            int size2 = arrayList.size() + this.f31214e;
            LinearLayout linearLayout3 = cVar.f31193f;
            Integer numValueOf = linearLayout3 != null ? Integer.valueOf(linearLayout3.getChildCount()) : null;
            if (numValueOf == null || size2 <= numValueOf.intValue()) {
                TextView textView = cVar.f31190c;
                if (textView != null) {
                    textView.setVisibility(4);
                }
            } else {
                TextView textView2 = cVar.f31190c;
                if (textView2 != null) {
                    x0 x0Var = x0.f105818a;
                    Locale locale = Locale.getDefault();
                    String string = ((CaldroidGridAdapter) dVar).context.getString(R.string.plus_decimal_pattern);
                    string.getClass();
                    textView2.setText(String.format(locale, string, Arrays.copyOf(new Object[]{Integer.valueOf(size2 - numValueOf.intValue())}, 1)));
                }
                TextView textView3 = cVar.f31190c;
                if (textView3 != null) {
                    textView3.setVisibility(0);
                }
            }
            LinearLayout linearLayout4 = cVar.f31193f;
            if (size2 == 1) {
                if (linearLayout4 != null) {
                    linearLayout4.setContentDescription(((CaldroidGridAdapter) dVar).context.getString(R.string.lbl_common_one_activity));
                }
            } else if (linearLayout4 != null) {
                linearLayout4.setContentDescription(((CaldroidGridAdapter) dVar).context.getString(R.string.lbl_common_number_of_activities, String.valueOf(size2)));
            }
            boolean z14 = this.f31212c;
            ImageView imageView2 = cVar.f31189b;
            if (imageView2 != null) {
                imageView2.setVisibility(z14 ? 0 : 4);
            }
            ImageView imageView3 = cVar.f31191d;
            if (imageView3 != null) {
                imageView3.setVisibility(8);
            }
        }
    }
}
