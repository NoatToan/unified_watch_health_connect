package p62;

import android.content.Context;
import android.widget.NumberPicker;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.workouts.presentation.common.list.SpinnerDialogView;
import o62.u0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\nB#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lp62/x;", "Lp62/f;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "mPoolSize", "Lm52/j;", "mPoolLengthUnit", "<init>", "(Landroid/content/Context;Ljava/lang/Double;Lm52/j;)V", "a", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class x extends f {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f136243d = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Double f136244b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m52.j f136245c;

    static {
        new a(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(Context context, Double d14, m52.j jVar) {
        super(context);
        context.getClass();
        this.f136244b = d14;
        this.f136245c = jVar;
    }

    @Override // p62.r
    public final String a(com.garmin.android.apps.connectmobile.workouts.data.model.j0 j0Var) {
        j0Var.getClass();
        boolean zD = zf.b.D(this.f136244b);
        m52.j jVar = this.f136245c;
        Context context = this.f136225a;
        if (!zD) {
            return v52.f.g(context, j0Var.f48229n, jVar);
        }
        return v52.f.g(context, j0Var.f48229n, jVar).concat(u0.g(j0Var.f48228m, context));
    }

    @Override // p62.f, p62.r
    public final com.garmin.android.apps.connectmobile.workouts.data.model.j0 d(m52.k kVar, com.garmin.android.apps.connectmobile.workouts.data.model.j0 j0Var, Object... objArr) {
        kVar.getClass();
        Object obj = objArr[0];
        int iM = (int) f.m(kVar, j0Var, obj instanceof m52.a ? (m52.a) obj : null);
        Double d14 = this.f136244b;
        j0Var.j(d14 != null ? (float) d14.doubleValue() : 1.0f, iM);
        j0Var.f48231p = this.f136245c;
        return j0Var;
    }

    @Override // p62.f, p62.r
    public final SpinnerDialogView.c e(Context context, com.garmin.android.apps.connectmobile.workouts.data.model.j0 j0Var) {
        j0Var.getClass();
        return null;
    }

    @Override // p62.b
    public final String f(com.garmin.android.apps.connectmobile.workouts.data.model.j0 j0Var) {
        j0Var.getClass();
        m52.j jVar = this.f136245c;
        return k(jVar != null ? jVar.b(this.f136225a) : "");
    }

    @Override // p62.b
    public final String g(double d14) {
        return null;
    }

    @Override // p62.b
    public final void h(SpinnerDialogView spinnerDialogView, com.garmin.android.apps.connectmobile.workouts.data.model.j0 j0Var) {
        j0Var.getClass();
        spinnerDialogView.setSpinnerCount(1);
        Double d14 = this.f136244b;
        if (!zf.b.D(d14)) {
            spinnerDialogView.d(0, 1, 9999, (int) j0Var.f48229n, new bi2.j(3));
            return;
        }
        d14.getClass();
        final double dDoubleValue = d14.doubleValue();
        spinnerDialogView.d(0, 1, (int) (((double) 10000) / dDoubleValue), j0Var.f48228m, new NumberPicker.Formatter() { // from class: p62.w
            @Override // android.widget.NumberPicker.Formatter
            public final String format(int i14) {
                int i15 = x.f136243d;
                x xVar = this.f136241a;
                Context context = xVar.f136225a;
                return v52.f.g(context, dDoubleValue * ((double) i14), xVar.f136245c).concat(u0.g(i14, context));
            }
        });
    }

    @Override // p62.b
    public final com.garmin.android.apps.connectmobile.workouts.data.model.j0 i(com.garmin.android.apps.connectmobile.workouts.data.model.j0 j0Var, int[] iArr) {
        j0Var.getClass();
        iArr.getClass();
        if (iArr.length != 1) {
            vb.h.s("Length of values incorrect");
            return null;
        }
        Double d14 = this.f136244b;
        if (zf.b.D(d14)) {
            int i14 = iArr[0];
            d14.getClass();
            j0Var.j((float) d14.doubleValue(), i14);
        } else {
            j0Var.f48229n = iArr[0];
        }
        j0Var.f48231p = this.f136245c;
        return j0Var;
    }

    @Override // p62.f
    public final double j(int[] iArr) {
        iArr.getClass();
        return 0.0d;
    }

    @Override // p62.f
    public final double n(com.garmin.android.apps.connectmobile.workouts.data.model.j0 j0Var) {
        j0Var.getClass();
        return 0.0d;
    }

    @Override // p62.f
    public final double o(com.garmin.android.apps.connectmobile.workouts.data.model.j0 j0Var) {
        j0Var.getClass();
        return 0.0d;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lp62/x$a;", "", "<init>", "()V", "", "MAX_POOL_SIZE", "I", "MAX_UNSPECIFIED_POOL_SIZE", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
