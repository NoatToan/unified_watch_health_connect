package q21;

import androidx.lifecycle.u1;
import b63.v;
import com.garmin.android.apps.connectmobile.R;
import java.time.LocalTime;
import java.util.List;
import p005kotlin.Metadata;
import p13.j0;
import p13.w;
import r53.b2;
import r53.p2;
import r53.q2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lq21/e;", "Landroidx/lifecycle/u1;", "", "mealName", "Lb63/v;", "startTime", "stopTime", "Ls01/f;", "nutritionSettingsConfigProvider", "<init>", "(Ljava/lang/String;Lb63/v;Lb63/v;Ls01/f;)V", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e extends u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f142233a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p2 f142234b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b2 f142235c;

    public e(String str, v vVar, v vVar2, s01.f fVar) {
        str.getClass();
        vVar.getClass();
        vVar2.getClass();
        fVar.getClass();
        boolean zA = fVar.a();
        this.f142233a = zA;
        boolean zX4 = x4(vVar, vVar2);
        j0 j0Var = j0.f134944a;
        v21.f.f175333a.getClass();
        p2 p2VarA = q2.a(new d(zA, str, vVar, vVar2, zA ? v21.f.w(vVar) : v21.f.u(vVar), null, Integer.valueOf(R.string.msg_updating_your_meal_windows_warning), j0Var, zX4, 32, null));
        this.f142234b = p2VarA;
        this.f142235c = r53.s.d(p2VarA);
    }

    public final boolean x4(v vVar, v vVar2) {
        if (!this.f142233a) {
            return vVar.compareTo(vVar2) < 0;
        }
        v21.f.f175333a.getClass();
        vVar.getClass();
        vVar2.getClass();
        LocalTime localTime = vVar.f16219a;
        int minute = localTime.getMinute() + (localTime.getHour() * 60);
        LocalTime localTime2 = vVar2.f16219a;
        return (localTime2.getMinute() + (localTime2.getHour() * 60)) - minute >= 30;
    }

    public final void y4(v vVar, v vVar2) {
        v vVarU;
        while (true) {
            p2 p2Var = this.f142234b;
            Object value = p2Var.getValue();
            d dVar = (d) value;
            boolean zX4 = x4(vVar, vVar2);
            boolean z14 = this.f142233a;
            int i14 = z14 ? R.string.meal_window_minimum_duration_placeholder_minutes : R.string.start_and_stop_times_warning_msg;
            List listC = z14 ? w.c(30) : j0.f134944a;
            if (z14) {
                v21.f.f175333a.getClass();
                vVarU = v21.f.w(vVar);
            } else {
                v21.f.f175333a.getClass();
                vVarU = v21.f.u(vVar);
            }
            v vVar3 = vVarU;
            Integer numValueOf = Integer.valueOf(i14);
            boolean z15 = dVar.f142224a;
            String str = dVar.f142225b;
            v vVar4 = dVar.f142229f;
            str.getClass();
            vVar4.getClass();
            listC.getClass();
            v vVar5 = vVar;
            v vVar6 = vVar2;
            if (p2Var.b(value, new d(z15, str, vVar5, vVar6, vVar3, vVar4, numValueOf, listC, zX4))) {
                return;
            }
            vVar = vVar5;
            vVar2 = vVar6;
        }
    }
}
