package p62;

import android.content.Context;
import c22.l3;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.workouts.presentation.common.list.SpinnerDialogView;
import java.util.LinkedHashMap;
import java.util.Map;
import o62.u0;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Marker;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0006\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lp62/d;", "Lp62/a0;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lm52/k;", "sportType", "Lo13/p;", "", "", "criticalSwimSpeed", "isPrimary", "<init>", "(Landroid/content/Context;Lm52/k;Lo13/p;Z)V", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d extends a0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final o13.p<Boolean, Double> f136219d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Context context, m52.k kVar, o13.p<Boolean, Double> pVar, boolean z14) {
        super(context, kVar, z14);
        context.getClass();
        kVar.getClass();
        this.f136219d = pVar;
    }

    @Override // p62.a0, p62.r
    public final String a(com.garmin.android.apps.connectmobile.workouts.data.model.j0 j0Var) {
        j0Var.getClass();
        return m(j0Var.F);
    }

    @Override // p62.r
    public final com.garmin.android.apps.connectmobile.workouts.data.model.j0 d(m52.k kVar, com.garmin.android.apps.connectmobile.workouts.data.model.j0 j0Var, Object... objArr) {
        kVar.getClass();
        j0Var.F = 0.0d;
        return j0Var;
    }

    @Override // p62.a0, p62.b
    public final String f(com.garmin.android.apps.connectmobile.workouts.data.model.j0 j0Var) {
        j0Var.getClass();
        String string = this.f136215a.getString(R.string.lbl_target_pace);
        string.getClass();
        return string;
    }

    @Override // p62.b
    public final String g(double d14) {
        String str = l3.f23129g.format(d14);
        str.getClass();
        return d53.u.v(str, ".", ":", false);
    }

    @Override // p62.b
    public final void h(SpinnerDialogView spinnerDialogView, com.garmin.android.apps.connectmobile.workouts.data.model.j0 j0Var) {
        j0Var.getClass();
        spinnerDialogView.setSpinnerCount(1);
        spinnerDialogView.setDelimiters(null);
        LinkedHashMap linkedHashMapU = u(j0Var);
        int iF0 = p13.h0.f0(linkedHashMapU.keySet(), Integer.valueOf((int) n(j0Var).f128594a.doubleValue()));
        String[] strArr = (String[]) linkedHashMapU.values().toArray(new String[0]);
        if (iF0 == -1) {
            iF0 = 12;
        }
        String string = this.f136215a.getString(R.string.lbl_css_abbreviated);
        strArr.getClass();
        int length = strArr.length - 1;
        if (spinnerDialogView.f48422d > 0) {
            SpinnerDialogView.e eVar = new SpinnerDialogView.e();
            eVar.f48437b = 0;
            eVar.f48436a = length;
            eVar.f48438c = iF0;
            eVar.f48439d = strArr;
            spinnerDialogView.f48430l.put(0, eVar);
            spinnerDialogView.f48425g = string;
        }
    }

    @Override // p62.a0, p62.b
    public final com.garmin.android.apps.connectmobile.workouts.data.model.j0 i(com.garmin.android.apps.connectmobile.workouts.data.model.j0 j0Var, int[] iArr) {
        j0Var.getClass();
        iArr.getClass();
        s(j0Var, ((Number) ((Map.Entry) p13.h0.W(u(j0Var).entrySet(), iArr[0])).getKey()).intValue(), j0Var.I);
        return j0Var;
    }

    @Override // p62.a0
    public final double j(int[] iArr) {
        return 0.0d;
    }

    @Override // p62.a0
    public final String m(double d14) {
        o13.p<Boolean, Double> pVar = this.f136219d;
        return u0.e(this.f136215a, d14, pVar != null ? pVar.f128594a.booleanValue() : false, pVar != null ? pVar.f128595b : null);
    }

    public final LinkedHashMap u(com.garmin.android.apps.connectmobile.workouts.data.model.j0 j0Var) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int iQ = (int) q(j0Var);
        int i14 = (int) o(j0Var).f189101f;
        if (iQ <= i14) {
            while (true) {
                String str = i14 > 0 ? Marker.ANY_NON_NULL_MARKER : "";
                linkedHashMap.put(Integer.valueOf(i14), str + i14 + StringUtils.SPACE + this.f136215a.getString(R.string.lbl_second));
                if (i14 == iQ) {
                    break;
                }
                i14--;
            }
        }
        return linkedHashMap;
    }

    public /* synthetic */ d(Context context, m52.k kVar, o13.p pVar, boolean z14, int i14, p005kotlin.jvm.internal.j jVar) {
        this(context, kVar, pVar, (i14 & 8) != 0 ? false : z14);
    }
}
