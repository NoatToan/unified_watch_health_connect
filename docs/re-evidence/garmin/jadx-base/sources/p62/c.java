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
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0006\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lp62/c;", "Lp62/f;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lo13/p;", "", "", "criticalSwimSpeed", "<init>", "(Landroid/content/Context;Lo13/p;)V", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c extends f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o13.p<Boolean, Double> f136218b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Context context, o13.p<Boolean, Double> pVar) {
        super(context);
        context.getClass();
        this.f136218b = pVar;
    }

    @Override // p62.r
    public final String a(com.garmin.android.apps.connectmobile.workouts.data.model.j0 j0Var) {
        j0Var.getClass();
        double d14 = j0Var.f48229n;
        o13.p<Boolean, Double> pVar = this.f136218b;
        return u0.e(this.f136225a, d14, pVar != null ? pVar.f128594a.booleanValue() : false, pVar != null ? pVar.f128595b : null);
    }

    @Override // p62.b
    public final String f(com.garmin.android.apps.connectmobile.workouts.data.model.j0 j0Var) {
        j0Var.getClass();
        return k("");
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
        LinkedHashMap linkedHashMapP = p(j0Var);
        int iF0 = p13.h0.f0(linkedHashMapP.keySet(), Integer.valueOf((int) j0Var.f48229n));
        String[] strArr = (String[]) linkedHashMapP.values().toArray(new String[0]);
        if (iF0 == -1) {
            iF0 = 12;
        }
        String string = this.f136225a.getString(R.string.lbl_css_abbreviated);
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

    @Override // p62.b
    public final com.garmin.android.apps.connectmobile.workouts.data.model.j0 i(com.garmin.android.apps.connectmobile.workouts.data.model.j0 j0Var, int[] iArr) {
        j0Var.getClass();
        iArr.getClass();
        j0Var.f48229n = ((Number) ((Map.Entry) p13.h0.W(p(j0Var).entrySet(), iArr[0])).getKey()).intValue();
        return j0Var;
    }

    @Override // p62.f
    public final double j(int[] iArr) {
        iArr.getClass();
        return 0.0d;
    }

    public final LinkedHashMap p(com.garmin.android.apps.connectmobile.workouts.data.model.j0 j0Var) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int iO = (int) o(j0Var);
        int iN = (int) n(j0Var);
        if (iO <= iN) {
            while (true) {
                String str = iN > 0 ? Marker.ANY_NON_NULL_MARKER : "";
                linkedHashMap.put(Integer.valueOf(iN), str + iN + StringUtils.SPACE + this.f136225a.getString(R.string.lbl_second));
                if (iN == iO) {
                    break;
                }
                iN--;
            }
        }
        return linkedHashMap;
    }
}
