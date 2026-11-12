package p62;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.workouts.presentation.common.list.SpinnerDialogView;
import java.util.Arrays;
import java.util.Locale;
import org.apache.commons.lang3.StringUtils;
import org.joda.time.DateTimeConstants;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.x0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lp62/y;", "Lp62/l;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "a", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class y extends l {
    static {
        new a(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(Context context) {
        super(context);
        context.getClass();
    }

    @Override // p62.l, p62.b
    public final String f(com.garmin.android.apps.connectmobile.workouts.data.model.j0 j0Var) {
        j0Var.getClass();
        return k("");
    }

    @Override // p62.l, p62.b
    public final String g(double d14) {
        int[] iArr = {59, 59};
        if (d14 <= j(iArr)) {
            int i14 = ((int) d14) % DateTimeConstants.SECONDS_PER_HOUR;
            iArr = new int[]{i14 / 60, i14 % 60};
        }
        x0 x0Var = x0.f105818a;
        return String.format(Locale.getDefault(), "%02d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(iArr[0]), Integer.valueOf(iArr[1])}, 2));
    }

    @Override // p62.l, p62.b
    public final void h(SpinnerDialogView spinnerDialogView, com.garmin.android.apps.connectmobile.workouts.data.model.j0 j0Var) {
        j0Var.getClass();
        spinnerDialogView.setSpinnerCount(2);
        spinnerDialogView.setDelimiters(p13.x.k(":", StringUtils.SPACE));
        double d14 = j0Var.f48229n;
        int[] iArr = {59, 59};
        if (d14 <= j(iArr)) {
            int i14 = ((int) d14) % DateTimeConstants.SECONDS_PER_HOUR;
            iArr = new int[]{i14 / 60, i14 % 60};
        }
        int i15 = iArr[0];
        SpinnerDialogView.f fVar = SpinnerDialogView.f48419r;
        spinnerDialogView.d(0, 0, 59, i15, fVar);
        spinnerDialogView.d(1, 0, 59, iArr[1], fVar);
    }

    @Override // p62.l, p62.b
    public final com.garmin.android.apps.connectmobile.workouts.data.model.j0 i(com.garmin.android.apps.connectmobile.workouts.data.model.j0 j0Var, int[] iArr) {
        j0Var.getClass();
        iArr.getClass();
        if (iArr.length == 2) {
            j0Var.f48229n = j(iArr);
            return j0Var;
        }
        vb.h.s("Length of values incorrect");
        return null;
    }

    @Override // p62.l, p62.f
    public final double j(int[] iArr) {
        iArr.getClass();
        return (((double) iArr[0]) * 60.0d) + ((double) iArr[1]);
    }

    @Override // p62.f
    public final double o(com.garmin.android.apps.connectmobile.workouts.data.model.j0 j0Var) {
        j0Var.getClass();
        return 0.0d;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lp62/y$a;", "", "<init>", "()V", "", "MAX_MINUTES", "I", "MAX_SECONDS", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
