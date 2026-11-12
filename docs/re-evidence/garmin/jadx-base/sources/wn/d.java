package wn;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lwn/d;", "Lwn/a;", "Lsn/h;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d extends a<sn.h> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f186098c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f186099d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Context context) {
        super(context);
        context.getClass();
        this.f186098c = this.f186092a.getString(R.string.lbl_bpm);
        this.f186099d = this.f186092a.getString(R.string.lbl_ms);
    }

    @Override // wn.a
    public final g b(int i14, sn.h hVar) {
        List<sn.g> listA;
        Object next;
        List<sn.g> listA2;
        Object next2;
        sn.h hVar2 = hVar;
        Double avgValue = null;
        sn.g gVarM = hVar2 != null ? hVar2.m() : null;
        String str = this.f186098c;
        l22.a aVar = this.f186092a;
        if (i14 == 1) {
            String strA = a(gVarM != null ? gVarM.getAvgValue() : null);
            return new g(strA, c(strA, str), aVar.getString(R.string.lbl_average));
        }
        if (i14 == 2) {
            String strA2 = a(gVarM != null ? gVarM.getMaxValue() : null);
            return new g(strA2, c(strA2, str), aVar.getString(R.string.lbl_highest));
        }
        String str2 = this.f186099d;
        if (i14 == 3) {
            if (hVar2 != null && (listA = hVar2.A()) != null) {
                Iterator<T> it = listA.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!((sn.g) next).i());
                sn.g gVar = (sn.g) next;
                if (gVar != null) {
                    avgValue = gVar.getAvgValue();
                }
            }
            String string = aVar.getString(R.string.lbl_abbreviated_mean_square_successive_heart_beats);
            String strA3 = a(avgValue);
            return new g(strA3, c(strA3, str2), aVar.a(R.string.lbl_heart_rate_variability_average_type, string));
        }
        if (i14 != 4) {
            return null;
        }
        if (hVar2 != null && (listA2 = hVar2.A()) != null) {
            Iterator<T> it3 = listA2.iterator();
            do {
                if (!it3.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it3.next();
            } while (!((sn.g) next2).j());
            sn.g gVar2 = (sn.g) next2;
            if (gVar2 != null) {
                avgValue = gVar2.getAvgValue();
            }
        }
        String string2 = aVar.getString(R.string.lbl_abbreviated_standard_deviation_between_heart_beats);
        String strA4 = a(avgValue);
        return new g(strA4, c(strA4, str2), aVar.a(R.string.lbl_heart_rate_variability_average_type, string2));
    }
}
