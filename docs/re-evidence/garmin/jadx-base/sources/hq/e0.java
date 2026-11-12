package hq;

import c22.l3;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.z1;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final /* synthetic */ class e0 extends p005kotlin.jvm.internal.q implements e23.l<Integer, Unit> {
    public e0(Object obj) {
        super(1, obj, d0.class, "onFilteredResultCountChanged", "onFilteredResultCountChanged(I)V", 0);
    }

    @Override // e23.l
    public final Unit invoke(Integer num) {
        int iIntValue = num.intValue();
        d0 d0Var = (d0) this.receiver;
        int i14 = d0.f84988c;
        androidx.fragment.app.m mVarRequireActivity = d0Var.requireActivity();
        z1 z1Var = mVarRequireActivity instanceof z1 ? (z1) mVarRequireActivity : null;
        if (z1Var != null) {
            if (iIntValue == 0) {
                z1Var.setSubtitle(d0Var.getString(R.string.common_no_results_lbl));
            } else if (iIntValue != 1) {
                l3.f23124b.getClass();
                z1Var.setSubtitle(d0Var.getString(R.string.lbl_filter_results, l3.f23131i.format(Integer.valueOf(iIntValue))));
            } else {
                z1Var.setSubtitle(d0Var.getString(R.string.lbl_filter_single_result));
            }
        }
        return Unit.INSTANCE;
    }
}
