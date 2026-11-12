package ch1;

import android.content.Context;
import com.garmin.android.apps.connectmobile.R;
import java.text.NumberFormat;

/* JADX INFO: loaded from: classes10.dex */
public class y4 extends xg1.r<Integer> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ z4 f27505a;

    public y4(z4 z4Var) {
        this.f27505a = z4Var;
    }

    @Override // xg1.r
    public final String a(Integer num) {
        Integer num2 = num;
        z4 z4Var = this.f27505a;
        if (num2 == null || num2.intValue() < 0) {
            int i14 = z4.f27514f;
            return z4Var.b(R.string.no_value);
        }
        int i15 = z4.f27514f;
        return z4Var.f70343a.getString(R.string.format_vo2_max, NumberFormat.getInstance().format(num2));
    }

    @Override // xg1.r
    public final String b(Context context, Integer num) {
        return oi0.d.a(context, super.b(context, num), new cg1.e(12));
    }
}
