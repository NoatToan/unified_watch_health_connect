package p62;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.workouts.presentation.common.list.SpinnerDialogView;
import java.util.Arrays;
import java.util.Locale;
import org.apache.commons.lang3.StringUtils;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.x0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0005\b\u0017\u0018\u00002\u00020\u0001:\u0001\nB#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lp62/o;", "Lp62/f;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "isMetricPoolUnit", "", "poolSize", "<init>", "(Landroid/content/Context;Ljava/lang/Boolean;Ljava/lang/Double;)V", "a", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public class o extends f {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f136234e = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f136235b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f136236c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String[] f136237d;

    static {
        new a(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(Context context, Boolean bool, Double d14) {
        super(context);
        context.getClass();
        this.f136235b = bool != null ? bool.booleanValue() : true;
        this.f136236c = true ^ zf.b.D(d14);
        this.f136237d = new String[]{this.f136225a.getString(R.string.lbl_meter_pool), this.f136225a.getString(R.string.lbl_yard_pool)};
    }

    @Override // p62.r
    public final String a(com.garmin.android.apps.connectmobile.workouts.data.model.j0 j0Var) {
        String strN;
        j0Var.getClass();
        if (this.f136236c) {
            boolean z14 = this.f136235b;
            String[] strArr = this.f136237d;
            strN = fb1.c.n(" - ", z14 ? strArr[0] : strArr[1]);
        } else {
            strN = "";
        }
        new oi0.h(this.f136225a);
        return oi0.h.e((long) j0Var.f48229n).concat(strN);
    }

    @Override // p62.f, p62.r
    public final SpinnerDialogView.c e(Context context, com.garmin.android.apps.connectmobile.workouts.data.model.j0 j0Var) {
        j0Var.getClass();
        return new e(this, 2, j0Var, context);
    }

    @Override // p62.b
    public final String f(com.garmin.android.apps.connectmobile.workouts.data.model.j0 j0Var) {
        j0Var.getClass();
        return k("");
    }

    @Override // p62.b
    public final String g(double d14) {
        int[] iArrP = p(d14);
        x0 x0Var = x0.f105818a;
        return String.format(Locale.getDefault(), "%02d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(iArrP[0]), Integer.valueOf(iArrP[1])}, 2));
    }

    @Override // p62.b
    public final void h(SpinnerDialogView spinnerDialogView, com.garmin.android.apps.connectmobile.workouts.data.model.j0 j0Var) {
        j0Var.getClass();
        boolean z14 = this.f136236c;
        spinnerDialogView.setSpinnerCount(z14 ? 3 : 2);
        spinnerDialogView.setDelimiters(p13.x.k(":", StringUtils.SPACE));
        int[] iArrP = p(j0Var.f48229n);
        int i14 = iArrP[0];
        SpinnerDialogView.f fVar = SpinnerDialogView.f48419r;
        spinnerDialogView.d(0, 0, 59, i14, fVar);
        spinnerDialogView.d(1, 0, 59, iArrP[1], fVar);
        if (z14) {
            spinnerDialogView.e(2, this.f136237d, !this.f136235b ? 1 : 0);
        }
    }

    @Override // p62.b
    public final com.garmin.android.apps.connectmobile.workouts.data.model.j0 i(com.garmin.android.apps.connectmobile.workouts.data.model.j0 j0Var, int[] iArr) {
        j0Var.getClass();
        iArr.getClass();
        int length = iArr.length;
        boolean z14 = this.f136236c;
        if (length != (z14 ? 3 : 2)) {
            vb.h.s("Length of values incorrect");
            return null;
        }
        j0Var.f48229n = j(iArr);
        if (z14) {
            boolean z15 = iArr[2] == 0;
            this.f136235b = z15;
            j0Var.f48231p = z15 ? m52.j.f116747g : m52.j.f116748h;
        }
        return j0Var;
    }

    @Override // p62.f
    public final double j(int[] iArr) {
        iArr.getClass();
        if (this.f136236c) {
            this.f136235b = iArr[2] == 0;
        }
        return (((double) iArr[0]) * 60.0d) + ((double) iArr[1]);
    }

    @Override // p62.f
    public final double o(com.garmin.android.apps.connectmobile.workouts.data.model.j0 j0Var) {
        j0Var.getClass();
        return this.f136235b ? 15.0d : 14.0d;
    }

    public final int[] p(double d14) {
        int i14 = !this.f136235b ? 1 : 0;
        int[] iArr = {59, 59, i14};
        if (d14 > j(iArr)) {
            return iArr;
        }
        int i15 = (int) d14;
        return new int[]{i15 / 60, i15 % 60, i14};
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\n¨\u0006\f"}, d2 = {"Lp62/o$a;", "", "<init>", "()V", "", "MAX_MINUTES", "I", "MAX_SECONDS", "", "MINIMUM_SPINNER_METERS", "D", "MINIMUM_SPINNER_YARDS", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
