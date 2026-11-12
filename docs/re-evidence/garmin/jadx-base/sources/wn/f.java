package wn;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lwn/f;", "Lwn/a;", "Lsn/h;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class f extends a<sn.h> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(Context context) {
        super(context);
        context.getClass();
    }

    @Override // wn.a
    public final g b(int i14, sn.h hVar) {
        Double avgValue;
        Double maxValue;
        sn.h hVar2 = hVar;
        Double dValueOf = null;
        sn.g gVarS = hVar2 != null ? hVar2.s() : null;
        l22.a aVar = this.f186092a;
        String string = aVar.getString(R.string.activities_brpm_common_lbl);
        if (i14 == 1) {
            if (gVarS != null && (avgValue = gVarS.getAvgValue()) != null) {
                dValueOf = Double.valueOf(Math.rint(avgValue.doubleValue()));
            }
            String strA = a(dValueOf);
            return new g(strA, c(strA, string), aVar.getString(R.string.lbl_average));
        }
        if (i14 != 2) {
            return null;
        }
        if (gVarS != null && (maxValue = gVarS.getMaxValue()) != null) {
            dValueOf = Double.valueOf(Math.rint(maxValue.doubleValue()));
        }
        String strA2 = a(dValueOf);
        return new g(strA2, c(strA2, string), aVar.getString(R.string.lbl_highest));
    }
}
