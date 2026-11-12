package hy;

import am.x0;
import am.z0;
import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import aq.b0;
import c22.l3;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.calendar.model.CalendarItemDTO;
import com.garmin.android.apps.connectmobile.f1;
import java.text.NumberFormat;
import java.util.ArrayList;
import ns.a3;
import org.apache.commons.lang3.StringUtils;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lhy/r;", "Lcom/garmin/android/apps/connectmobile/f1;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lkotlin/Function1;", "Lcom/garmin/android/apps/connectmobile/calendar/model/CalendarItemDTO;", "", "onItemSelected", "<init>", "(Landroid/content/Context;Le23/l;)V", "gcm-calendar_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class r extends f1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f86356c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e23.l<CalendarItemDTO, Unit> f86357d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final LayoutInflater f86358e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f86359f;

    /* JADX WARN: Multi-variable type inference failed */
    public r(Context context, e23.l<? super CalendarItemDTO, Unit> lVar) {
        context.getClass();
        this.f86356c = context;
        this.f86357d = lVar;
        this.f86358e = LayoutInflater.from(context);
        this.f86359f = new ArrayList();
    }

    @Override // com.garmin.android.apps.connectmobile.f1
    public final int u() {
        return this.f86359f.size();
    }

    /* JADX WARN: Code duplicated, block: B:146:0x0471  */
    /* JADX WARN: Code duplicated, block: B:171:0x04e1  */
    /* JADX WARN: Code duplicated, block: B:175:0x04eb  */
    /* JADX WARN: Code duplicated, block: B:177:0x04ee  */
    /* JADX WARN: Code duplicated, block: B:180:0x04f7  */
    /* JADX WARN: Code duplicated, block: B:64:0x01d6 A[PHI: r11 r20
      0x01d6: PHI (r11v18 hy.q) = (r11v15 hy.q), (r11v19 hy.q), (r11v19 hy.q) binds: [B:81:0x0257, B:59:0x01bd, B:61:0x01c3] A[DONT_GENERATE, DONT_INLINE]
      0x01d6: PHI (r20v17 android.widget.TextView) = (r20v14 android.widget.TextView), (r20v18 android.widget.TextView), (r20v18 android.widget.TextView) binds: [B:81:0x0257, B:59:0x01bd, B:61:0x01c3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.garmin.android.apps.connectmobile.f1
    public final void x(int i14, RecyclerView.f0 f0Var) {
        String string;
        TextView textView;
        q qVar;
        Drawable drawableA;
        Drawable drawable;
        boolean z14;
        boolean z15;
        boolean z16;
        Drawable drawableMutate;
        if (f0Var == null || !(f0Var instanceof q)) {
            return;
        }
        q qVar2 = (q) f0Var;
        CalendarItemDTO calendarItemDTO = (CalendarItemDTO) this.f86359f.get(i14);
        TextView textView2 = qVar2.f86355f;
        ImageView imageView = qVar2.f86354e;
        ImageView imageView2 = qVar2.f86351b;
        TextView textView3 = qVar2.f86353d;
        calendarItemDTO.getClass();
        TextView textView4 = qVar2.f86352c;
        fy.f fVar = qVar2.f86350a;
        vx.f fVar2 = fVar.f73876c;
        l22.a aVar = fVar.f73877d;
        Context context = fVar.f73874a;
        CalendarItemDTO.b bVar = calendarItemDTO.f30973d;
        switch (bVar == null ? -1 : fy.f.a.f73878a[bVar.ordinal()]) {
            case 1:
                string = context.getString(R.string.card_weight_title);
                break;
            case 2:
                string = context.getString(R.string.steps_steps);
                break;
            case 3:
                string = context.getString(R.string.lbl_pushes);
                break;
            case 4:
                string = context.getString(R.string.sleep_lbl_sleep);
                break;
            case 5:
                string = context.getString(R.string.lbl_sleep_score);
                break;
            case 6:
                string = context.getString(R.string.sleep_lbl_nap);
                break;
            case 7:
                string = context.getString(R.string.lbl_sleep_coach);
                break;
            case 8:
                string = fVar2.F(context, calendarItemDTO.M1);
                break;
            case 9:
                string = context.getString(R.string.lbl_heart_rate_cap);
                break;
            case 10:
                string = context.getString(R.string.ohrv_status);
                break;
            case 11:
                string = context.getString(R.string.lbl_blood_pressure);
                break;
            case 12:
                string = zx0.m.b(context, calendarItemDTO.C(), calendarItemDTO.S0, calendarItemDTO.f30977f, 0);
                break;
            case 13:
                string = zx0.m.b(context, calendarItemDTO.C(), calendarItemDTO.S0, calendarItemDTO.f30977f, 1);
                break;
            case 14:
                string = context.getString(R.string.title_stress);
                break;
            case 15:
                string = context.getString(R.string.gcm_body_battery_lbl_body_battery);
                break;
            case 16:
                int i15 = calendarItemDTO.f30999p1;
                if (i15 == 1) {
                    string = context.getString(R.string.mct_period_day_number, NumberFormat.getIntegerInstance().format(calendarItemDTO.f31001q1));
                    string.getClass();
                } else if (i15 > 4) {
                    string = context.getString(R.string.pregnancy_title);
                    string.getClass();
                } else {
                    string = context.getString(R.string.mct_cycle_day_number, NumberFormat.getIntegerInstance().format(calendarItemDTO.f31001q1));
                    string.getClass();
                }
                break;
            case 17:
                string = fVar2.i(context, calendarItemDTO);
                break;
            case 18:
            case 19:
            case 20:
            case 21:
                String str = calendarItemDTO.f30977f;
                string = (str != null && str.length() > 0) ? calendarItemDTO.f30977f : context.getString(R.string.txt_untitle);
                break;
            default:
                String str2 = calendarItemDTO.f30977f;
                string = (str2 != null && str2.length() > 0) ? calendarItemDTO.f30977f : context.getString(R.string.txt_untitle);
                break;
        }
        textView4.setText(string);
        String strO = fVar.f73875b;
        CalendarItemDTO.b bVar2 = calendarItemDTO.f30973d;
        switch (bVar2 == null ? -1 : fy.f.a.f73878a[bVar2.ordinal()]) {
            case 1:
                textView = textView4;
                qVar = qVar2;
                strO = fVar2.o(context, calendarItemDTO);
                break;
            case 2:
                textView = textView4;
                qVar = qVar2;
                strO = fVar2.H(context, calendarItemDTO);
                break;
            case 3:
                textView = textView4;
                qVar = qVar2;
                strO = fVar2.q(context, calendarItemDTO);
                break;
            case 4:
                textView = textView4;
                qVar = qVar2;
                strO = fVar2.w((int) calendarItemDTO.D, context);
                break;
            case 5:
                textView = textView4;
                qVar = qVar2;
                strO = fVar2.E(context, calendarItemDTO);
                break;
            case 6:
                textView = textView4;
                qVar = qVar2;
                strO = fVar2.N(context, calendarItemDTO);
                break;
            case 7:
                textView = textView4;
                qVar = qVar2;
                strO = fVar2.j(context, calendarItemDTO);
                break;
            case 8:
            default:
                textView = textView4;
                strO = "";
                qVar = qVar2;
                break;
            case 9:
                textView = textView4;
                qVar = qVar2;
                strO = fVar2.P(context, calendarItemDTO);
                break;
            case 10:
                textView = textView4;
                qVar = qVar2;
                strO = fVar2.t(context, calendarItemDTO);
                break;
            case 11:
                textView = textView4;
                qVar = qVar2;
                strO = fVar2.z(context, calendarItemDTO);
                break;
            case 12:
                textView = textView4;
                qVar = qVar2;
                strO = fVar2.c(context, ly.a.a(calendarItemDTO));
                break;
            case 13:
                textView = textView4;
                qVar = qVar2;
                double dF = calendarItemDTO.F();
                strO.getClass();
                l3.f23124b.getClass();
                strO = l3.a.f1((long) dF, strO);
                break;
            case 14:
                textView = textView4;
                qVar = qVar2;
                if (calendarItemDTO.O0 > -1) {
                    l3.f23124b.getClass();
                    strO = context.getString(R.string.alldaystress_avg_level_with_placeholder, l3.f23131i.format(calendarItemDTO.O0));
                    strO.getClass();
                }
                break;
            case 15:
                textView = textView4;
                qVar = qVar2;
                strO = fVar2.D(context, calendarItemDTO);
                break;
            case 16:
                textView = textView4;
                qVar = qVar2;
                int i16 = calendarItemDTO.f30999p1;
                if (i16 <= 4) {
                    strO = "";
                } else {
                    strO = fVar2.s(calendarItemDTO.f31001q1, i16, context).toString();
                }
                break;
            case 17:
                textView = textView4;
                qVar = qVar2;
                strO = ss.k.b(ls.e.AVERAGE_HEART_RATE, aVar, Double.valueOf(calendarItemDTO.Z), 73);
                break;
            case 18:
                textView = textView4;
                qVar = qVar2;
                fg0.d dVar = calendarItemDTO.N1;
                if (dVar == null) {
                    strO = null;
                } else {
                    if (dVar.m()) {
                        double d14 = dVar.d();
                        og0.a.f131967a.getClass();
                        strO = d14 + StringUtils.SPACE + og0.a.q(context);
                    } else {
                        l3.a aVar2 = l3.f23124b;
                        Double dG = dVar.g();
                        Long lValueOf = dG != null ? Long.valueOf((long) dG.doubleValue()) : null;
                        aVar2.getClass();
                        strO = l3.a.g1(lValueOf);
                    }
                    if (calendarItemDTO.J1) {
                        strO = context.getString(R.string.string_space_bullet_string_pattern, strO, context.getString(R.string.primary_event));
                    }
                }
                break;
            case 19:
            case 20:
            case 21:
                textView = textView4;
                qVar = qVar2;
                double dF2 = calendarItemDTO.F();
                if (Double.isNaN(dF2) || dF2 == 0.0d) {
                    strO = "";
                } else {
                    l3.a aVar3 = l3.f23124b;
                    int iF = (int) calendarItemDTO.F();
                    aVar3.getClass();
                    strO = l3.a.h1(iF, context);
                }
                break;
            case 22:
                String str3 = calendarItemDTO.X0;
                String string2 = new LocalDateTime(str3 != null ? d53.t.j(str3) : null).toString();
                string2.getClass();
                textView = textView4;
                qVar = qVar2;
                strO = context.getString(R.string.string_space_bullet_string_pattern, u00.b.c(new a3(aVar, null, 2, null), string2, 0, 6), (String) new w00.b(aVar).i(Double.valueOf(calendarItemDTO.Z)).f128594a);
                strO.getClass();
                break;
        }
        textView3.setText(strO);
        CalendarItemDTO.b bVar3 = calendarItemDTO.f30973d;
        String strM = (bVar3 == null ? -1 : fy.f.a.f73878a[bVar3.ordinal()]) == 6 ? fVar2.m(context, calendarItemDTO) : null;
        if (strM != null) {
            strO = strM;
        }
        textView3.setContentDescription(strO);
        v22.e.r(textView3, !TextUtils.isEmpty(textView3.getText()));
        CalendarItemDTO.b bVar4 = calendarItemDTO.f30973d;
        switch (bVar4 == null ? -1 : fy.f.a.f73878a[bVar4.ordinal()]) {
            case 1:
                drawableA = fy.f.a(fVar, R.drawable.weight, R.color.gcm_weight_color);
                break;
            case 2:
                drawableA = fy.f.a(fVar, R.drawable.steps, R.color.gcm_steps_color);
                break;
            case 3:
                drawableA = fy.f.a(fVar, R.drawable.push_walk, R.color.gcm_steps_color);
                break;
            case 4:
            case 6:
                drawableA = fy.f.a(fVar, R.drawable.sleep, R.color.gcm_calendar_sleep_color);
                break;
            case 5:
                drawableA = fy.f.a(fVar, R.drawable.sleep_score, R.color.gcm_calendar_sleep_color);
                break;
            case 7:
                drawableA = fy.f.a(fVar, R.drawable.sleep_coach, R.color.gcm_calendar_sleep_color);
                break;
            case 8:
                drawableA = a7.b.getDrawable(context, R.drawable.calendar_list_icon_jetlag);
                break;
            case 9:
                drawableA = a7.b.getDrawable(context, R.drawable.gcm3_calendar_list_icon_hr);
                break;
            case 10:
                drawableA = fy.f.a(fVar, R.drawable.hrv, R.color.gcm_hrv_status_color);
                break;
            case 11:
                drawableA = fy.f.a(fVar, R.drawable.bloodpressure, R.color.gcm_blood_pressure_color);
                break;
            case 12:
                drawableA = zx0.m.d(context, calendarItemDTO.C(), calendarItemDTO.S0, 0);
                break;
            case 13:
                drawableA = zx0.m.d(context, calendarItemDTO.C(), calendarItemDTO.S0, 1);
                break;
            case 14:
                drawableA = fy.f.a(fVar, R.drawable.stress, R.color.gcm_stress_color);
                break;
            case 15:
                drawableA = fy.f.a(fVar, R.drawable.body_battery, R.color.gcm_calendar_body_battery_color);
                break;
            case 16:
                drawableA = calendarItemDTO.f30999p1 <= 4 ? fy.f.a(fVar, R.drawable.wh_menstrual_tracking, R.color.gds_data_viz_violet_secondary) : fy.f.a(fVar, R.drawable.pregnancy, R.color.gcm_pregnancy_icon_color);
                break;
            case 17:
                drawableA = fy.f.a(fVar, R.drawable.health_snapshot, R.color.gcm_calendar_health_snapshot_color);
                break;
            case 18:
                drawableA = a7.b.getDrawable(context, R.drawable.gcm3_calendar_list_icon_events);
                break;
            case 19:
            case 20:
                drawableA = a7.b.getDrawable(context, R.drawable.gcm3_calendar_list_icon_workouts);
                break;
            case 21:
                drawableA = a7.b.getDrawable(context, R.drawable.gcm3_calendar_list_icon_trainingplans);
                break;
            case 22:
                drawableA = a7.b.getDrawable(context, R.drawable.ecg_intro_icon);
                break;
            default:
                drawableA = a7.b.getDrawable(context, R.drawable.gcm3_calendar_list_icon_events);
                break;
        }
        imageView2.setImageDrawable(drawableA);
        imageView2.setVisibility(0);
        if (z0.b(x0.D, calendarItemDTO.C().f4358a)) {
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.icon_small);
            Drawable drawable2 = a7.b.getDrawable(context, R.drawable.exterior_link);
            if (drawable2 == null || (drawableMutate = drawable2.mutate()) == null) {
                drawable = null;
            } else {
                drawableMutate.setTint(a7.b.getColor(context, R.color.gcm_icon_secondary));
                drawable = new BitmapDrawable(context.getResources(), d7.b.b(drawableMutate, dimensionPixelSize, dimensionPixelSize, 4));
            }
        } else if (calendarItemDTO.f30973d != CalendarItemDTO.b.HEART_RATE || calendarItemDTO.f30988k0 <= 0) {
            drawable = null;
        } else {
            drawable = a7.b.getDrawable(context, 2131232636);
        }
        imageView.setImageDrawable(drawable);
        imageView.setVisibility(0);
        int i17 = calendarItemDTO.f30988k0;
        textView2.setText((calendarItemDTO.f30973d != CalendarItemDTO.b.HEART_RATE || i17 <= 0) ? null : new w00.b(aVar).a(i17));
        v22.e.r(textView2, !TextUtils.isEmpty(textView2.getText()));
        CalendarItemDTO.b bVar5 = calendarItemDTO.f30973d;
        if ((bVar5 == null ? -1 : fy.f.a.f73878a[bVar5.ordinal()]) == 8) {
            LocalDate localDateNow = LocalDate.now();
            LocalDate localDate = calendarItemDTO.D().toLocalDate();
            if (localDate != null) {
                z14 = true;
                z15 = localDate.isEqual(localDateNow);
                if (z15) {
                    if (localDate == null && localDate.isBefore(localDateNow) == z14) {
                        z16 = z14;
                    } else {
                        z16 = false;
                    }
                    if (z16) {
                        z14 = false;
                    } else if (calendarItemDTO.L1 <= 0) {
                        z14 = false;
                    }
                } else if (calendarItemDTO.L1 <= 0) {
                    z14 = false;
                }
            } else {
                z14 = true;
            }
            if (z15) {
                if (localDate == null) {
                    z16 = false;
                } else {
                    z16 = false;
                }
                if (z16) {
                    z14 = false;
                } else if (calendarItemDTO.L1 <= 0) {
                    z14 = false;
                }
            } else if (calendarItemDTO.L1 <= 0) {
                z14 = false;
            }
        } else {
            z14 = true;
        }
        float f14 = z14 ? 1.0f : 0.5f;
        imageView2.setAlpha(f14);
        imageView.setAlpha(f14);
        qVar.itemView.setEnabled(z14);
        textView.setEnabled(z14);
        textView3.setEnabled(z14);
        textView2.setEnabled(z14);
        f0Var.itemView.setOnClickListener(new b0(this, i14, 7));
    }

    @Override // com.garmin.android.apps.connectmobile.f1
    public final RecyclerView.f0 z(ViewGroup viewGroup, int i14) {
        View viewInflate = this.f86358e.inflate(R.layout.gcm_list_item_wrap_with_icon, viewGroup, false);
        viewInflate.getClass();
        return new q(this.f86356c, viewInflate);
    }
}
