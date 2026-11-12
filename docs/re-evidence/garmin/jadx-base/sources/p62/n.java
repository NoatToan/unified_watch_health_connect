package p62;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.workouts.presentation.common.list.SpinnerDialogView;
import java.util.Iterator;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lp62/n;", "Lp62/a0;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lm52/k;", "sportType", "", "isPrimary", "<init>", "(Landroid/content/Context;Lm52/k;Z)V", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class n extends a0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(Context context, m52.k kVar, boolean z14) {
        super(context, kVar, z14);
        context.getClass();
        kVar.getClass();
    }

    @Override // p62.a0, p62.r
    public final String a(com.garmin.android.apps.connectmobile.workouts.data.model.j0 j0Var) {
        j0Var.getClass();
        int i14 = (int) j0Var.f48233r;
        x52.b.f189045c.getClass();
        x52.b bVarA = x52.b.a.a(i14);
        if (bVarA != null) {
            return this.f136215a.getString(bVarA.f189052b);
        }
        return null;
    }

    @Override // p62.r
    public final com.garmin.android.apps.connectmobile.workouts.data.model.j0 d(m52.k kVar, com.garmin.android.apps.connectmobile.workouts.data.model.j0 j0Var, Object... objArr) {
        kVar.getClass();
        j0Var.f48233r = x52.b.EASY.f189051a;
        return j0Var;
    }

    @Override // p62.a0, p62.r
    public final SpinnerDialogView.c e(Context context, com.garmin.android.apps.connectmobile.workouts.data.model.j0 j0Var) {
        j0Var.getClass();
        return null;
    }

    @Override // p62.a0, p62.b
    public final String f(com.garmin.android.apps.connectmobile.workouts.data.model.j0 j0Var) {
        j0Var.getClass();
        String string = this.f136215a.getString(R.string.workout_set_intensity_target);
        string.getClass();
        return string;
    }

    @Override // p62.b
    public final String g(double d14) {
        return null;
    }

    @Override // p62.b
    public final void h(SpinnerDialogView spinnerDialogView, com.garmin.android.apps.connectmobile.workouts.data.model.j0 j0Var) {
        j0Var.getClass();
        x52.b.a aVar = x52.b.f189045c;
        int i14 = (int) j0Var.f48233r;
        aVar.getClass();
        x52.b bVarA = x52.b.a.a(i14);
        spinnerDialogView.setSpinnerCount(1);
        spinnerDialogView.setDelimiters(null);
        Context context = spinnerDialogView.getContext();
        context.getClass();
        String string = context.getString(x52.b.EASY.f189052b);
        string.getClass();
        String string2 = context.getString(x52.b.BRISK.f189052b);
        string2.getClass();
        String string3 = context.getString(x52.b.SPEED.f189052b);
        string3.getClass();
        spinnerDialogView.e(0, (String[]) i53.a.a(string, string2, string3).toArray(new String[0]), bVarA != null ? bVarA.ordinal() : 0);
    }

    @Override // p62.a0, p62.b
    public final com.garmin.android.apps.connectmobile.workouts.data.model.j0 i(com.garmin.android.apps.connectmobile.workouts.data.model.j0 j0Var, int[] iArr) {
        Object next;
        j0Var.getClass();
        iArr.getClass();
        if (iArr.length != 1) {
            vb.h.s("Length of values incorrect");
            return null;
        }
        x52.b.a aVar = x52.b.f189045c;
        int i14 = iArr[0];
        aVar.getClass();
        Iterator<T> it = x52.b.f189050h.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((x52.b) next).ordinal() != i14);
        x52.b bVar = (x52.b) next;
        if (bVar != null) {
            j0Var.f48233r = bVar.f189051a;
        }
        return j0Var;
    }

    @Override // p62.a0
    public final String m(double d14) {
        return null;
    }

    public /* synthetic */ n(Context context, m52.k kVar, boolean z14, int i14, p005kotlin.jvm.internal.j jVar) {
        this(context, kVar, (i14 & 4) != 0 ? true : z14);
    }
}
