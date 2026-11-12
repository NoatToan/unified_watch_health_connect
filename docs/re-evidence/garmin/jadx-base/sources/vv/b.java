package vv;

import android.content.Context;
import android.text.format.DateFormat;
import android.view.View;
import c22.j0;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.view.view_3_0.GCMComplexTwoLineButton;
import java.text.SimpleDateFormat;
import java.util.Locale;
import org.joda.time.DateTime;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lvv/b;", "Lfb2/e;", "Luv/i;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b extends fb2.e<uv.i<?>> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final GCMComplexTwoLineButton f180398d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Context context) {
        super(context);
        context.getClass();
        GCMComplexTwoLineButton gCMComplexTwoLineButton = new GCMComplexTwoLineButton(context);
        gCMComplexTwoLineButton.f47790j.setVisibility(8);
        this.f180398d = gCMComplexTwoLineButton;
    }

    @Override // fb2.e
    public final View a() {
        return this.f180398d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [T, java.lang.Object, uv.i] */
    @Override // fb2.e
    public final boolean g(i.c cVar, uv.i<?> iVar) {
        uv.i<?> iVar2 = iVar;
        cVar.getClass();
        iVar2.getClass();
        this.f70344b = iVar2;
        p();
        return true;
    }

    @Override // fb2.e
    public final boolean h(uv.i<?> iVar) {
        iVar.getClass();
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.Object, uv.i] */
    @Override // fb2.e
    public final boolean k(uv.i<?> iVar) {
        uv.i<?> iVar2 = iVar;
        iVar2.getClass();
        this.f70344b = iVar2;
        p();
        return true;
    }

    @Override // fb2.e
    public final void m(boolean z14) {
        super.m(z14);
        this.f180398d.setVisible(z14);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void p() {
        String strC;
        uv.i iVar = (uv.i) this.f70344b;
        Integer numValueOf = iVar != null ? Integer.valueOf(iVar.f172900c) : null;
        GCMComplexTwoLineButton gCMComplexTwoLineButton = this.f180398d;
        if (numValueOf != null && numValueOf.intValue() == -1) {
            gCMComplexTwoLineButton.setButtonTopLabel(b(R.string.device_settings_vector_battery_status_checking));
            gCMComplexTwoLineButton.e(true);
            gCMComplexTwoLineButton.c(false);
            gCMComplexTwoLineButton.setRightIcon(null);
            return;
        }
        if (numValueOf != null && numValueOf.intValue() == 1) {
            fg1.a aVar = fg1.a.NEW;
            gCMComplexTwoLineButton.setButtonTopLabel(c(R.string.sensor_battery_status, b(aVar.f71390b)));
            Integer num = aVar.f71391c;
            if (num != null) {
                gCMComplexTwoLineButton.setRightIcon(a7.b.getDrawable(gCMComplexTwoLineButton.getContext(), num.intValue()));
            } else {
                gCMComplexTwoLineButton.setRightIcon(null);
            }
        } else if (numValueOf != null && numValueOf.intValue() == 2) {
            fg1.a aVar2 = fg1.a.GOOD;
            gCMComplexTwoLineButton.setButtonTopLabel(c(R.string.sensor_battery_status, b(aVar2.f71390b)));
            Integer num2 = aVar2.f71391c;
            if (num2 != null) {
                gCMComplexTwoLineButton.setRightIcon(a7.b.getDrawable(gCMComplexTwoLineButton.getContext(), num2.intValue()));
            } else {
                gCMComplexTwoLineButton.setRightIcon(null);
            }
        } else if (numValueOf != null && numValueOf.intValue() == 3) {
            fg1.a aVar3 = fg1.a.OK;
            gCMComplexTwoLineButton.setButtonTopLabel(c(R.string.sensor_battery_status, b(aVar3.f71390b)));
            Integer num3 = aVar3.f71391c;
            if (num3 != null) {
                gCMComplexTwoLineButton.setRightIcon(a7.b.getDrawable(gCMComplexTwoLineButton.getContext(), num3.intValue()));
            } else {
                gCMComplexTwoLineButton.setRightIcon(null);
            }
        } else if (numValueOf != null && numValueOf.intValue() == 4) {
            fg1.a aVar4 = fg1.a.LOW;
            gCMComplexTwoLineButton.setButtonTopLabel(c(R.string.sensor_battery_status, b(aVar4.f71390b)));
            Integer num4 = aVar4.f71391c;
            if (num4 != null) {
                gCMComplexTwoLineButton.setRightIcon(a7.b.getDrawable(gCMComplexTwoLineButton.getContext(), num4.intValue()));
            } else {
                gCMComplexTwoLineButton.setRightIcon(null);
            }
        } else if (numValueOf != null && numValueOf.intValue() == 5) {
            fg1.a aVar5 = fg1.a.CRITICAL;
            gCMComplexTwoLineButton.setButtonTopLabel(c(R.string.sensor_battery_status, b(aVar5.f71390b)));
            Integer num5 = aVar5.f71391c;
            if (num5 != null) {
                gCMComplexTwoLineButton.setRightIcon(a7.b.getDrawable(gCMComplexTwoLineButton.getContext(), num5.intValue()));
            } else {
                gCMComplexTwoLineButton.setRightIcon(null);
            }
        } else {
            gCMComplexTwoLineButton.setButtonTopLabel(b(R.string.device_settings_vector_battery_status_unknown));
            gCMComplexTwoLineButton.setRightIcon(null);
        }
        uv.i iVar2 = (uv.i) this.f70344b;
        DateTime dateTime = iVar2 != null ? iVar2.f172901d : null;
        if (dateTime == null) {
            strC = b(R.string.no_value);
        } else {
            j0 j0Var = j0.f23099a;
            DateTime dateTime2 = iVar2 != null ? iVar2.f172901d : null;
            DateTime dateTimeNow = DateTime.now();
            j0Var.getClass();
            if (j0.F(dateTime2, dateTimeNow)) {
                strC = c(R.string.sensor_last_checked, new SimpleDateFormat(DateFormat.is24HourFormat(this.f70343a) ? "HH:mm" : "h:mm a", Locale.getDefault()).format(dateTime.toDate()));
            } else {
                strC = c(R.string.sensor_last_checked, dateTime.toString("M/d/yy HH:mm"));
            }
        }
        gCMComplexTwoLineButton.setButtonBottomLeftLabel(strC);
        gCMComplexTwoLineButton.e(false);
        gCMComplexTwoLineButton.c(true);
    }
}
