package wn;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lwn/e;", "Lwn/a;", "Lsn/h;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e extends a<sn.h> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(Context context) {
        super(context);
        context.getClass();
    }

    @Override // wn.a
    public final g b(int i14, sn.h hVar) {
        sn.h hVar2 = hVar;
        sn.g gVarR = hVar2 != null ? hVar2.r() : null;
        l22.a aVar = this.f186092a;
        if (i14 == 1) {
            String strA = a(gVarR != null ? gVarR.getAvgValue() : null);
            return new g(strA, c(strA, "%"), aVar.getString(R.string.lbl_average));
        }
        if (i14 != 2) {
            return null;
        }
        String strA2 = a(gVarR != null ? gVarR.getMinValue() : null);
        return new g(strA2, c(strA2, "%"), aVar.getString(R.string.lbl_lowest));
    }
}
