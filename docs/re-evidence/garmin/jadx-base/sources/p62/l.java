package p62;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.workouts.presentation.common.list.SpinnerDialogView;
import java.util.Arrays;
import java.util.Locale;
import org.apache.commons.lang3.StringUtils;
import org.joda.time.DateTimeConstants;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.x0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0017\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lp62/l;", "Lp62/f;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "a", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public class l extends f {
    static {
        new a(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(Context context) {
        super(context);
        context.getClass();
    }

    @Override // p62.r
    public final String a(com.garmin.android.apps.connectmobile.workouts.data.model.j0 j0Var) {
        j0Var.getClass();
        new oi0.h(this.f136225a);
        return oi0.h.e((long) j0Var.f48229n);
    }

    @Override // p62.b
    public String f(com.garmin.android.apps.connectmobile.workouts.data.model.j0 j0Var) {
        j0Var.getClass();
        return k(p());
    }

    @Override // p62.b
    public String g(double d14) {
        int[] iArrQ = q(d14);
        x0 x0Var = x0.f105818a;
        return String.format(Locale.getDefault(), "%02d:%02d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(iArrQ[0]), Integer.valueOf(iArrQ[1]), Integer.valueOf(iArrQ[2])}, 3));
    }

    @Override // p62.b
    public void h(SpinnerDialogView spinnerDialogView, com.garmin.android.apps.connectmobile.workouts.data.model.j0 j0Var) {
        j0Var.getClass();
        spinnerDialogView.setSpinnerCount(3);
        spinnerDialogView.setDelimiters(p13.x.k(":", ":", StringUtils.SPACE));
        int[] iArrQ = q(j0Var.f48229n);
        int i14 = iArrQ[0];
        SpinnerDialogView.f fVar = SpinnerDialogView.f48419r;
        spinnerDialogView.d(0, 0, 23, i14, fVar);
        spinnerDialogView.d(1, 0, 59, iArrQ[1], fVar);
        spinnerDialogView.d(2, 0, 59, iArrQ[2], fVar);
    }

    @Override // p62.b
    public com.garmin.android.apps.connectmobile.workouts.data.model.j0 i(com.garmin.android.apps.connectmobile.workouts.data.model.j0 j0Var, int[] iArr) {
        j0Var.getClass();
        iArr.getClass();
        if (iArr.length == 3) {
            j0Var.f48229n = j(iArr);
            return j0Var;
        }
        vb.h.s("Length of values incorrect");
        return null;
    }

    @Override // p62.f
    public double j(int[] iArr) {
        iArr.getClass();
        return (((double) iArr[1]) * 60.0d) + (((double) iArr[0]) * 3600.0d) + ((double) iArr[2]);
    }

    public final String p() {
        String string = this.f136225a.getString(R.string.common_duration_format_label);
        string.getClass();
        return d53.u.v(d53.u.v(string, "(", "", false), ")", "", false);
    }

    public final int[] q(double d14) {
        int[] iArr = {23, 59, 59};
        if (d14 > j(iArr)) {
            return iArr;
        }
        int i14 = (int) d14;
        int i15 = i14 / DateTimeConstants.SECONDS_PER_HOUR;
        int i16 = i14 % DateTimeConstants.SECONDS_PER_HOUR;
        return new int[]{i15, i16 / 60, i16 % 60};
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lp62/l$a;", "", "<init>", "()V", "", "MAX_HOURS", "I", "MAX_MINUTES", "MAX_SECONDS", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
