package ig1;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import java.util.ArrayList;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lig1/c1;", "Lig1/j1;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "pageIndex", "fieldIndex", "<init>", "(Landroid/content/Context;II)V", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c1 extends j1 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(Context context, int i14, int i15) {
        super(context, i14, i15);
        context.getClass();
    }

    @Override // ig1.a0, fb2.t
    /* JADX INFO: renamed from: z */
    public final hg1.k[] v(com.garmin.android.apps.connectmobile.devices.model.f fVar) {
        fVar.getClass();
        hg1.k[] kVarArrV = super.v(fVar);
        kVarArrV.getClass();
        ArrayList arrayListL0 = p13.u.l0(kVarArrV);
        arrayListL0.remove(hg1.k.DATA_FIELD_NONE);
        return (hg1.k[]) arrayListL0.toArray(new hg1.k[0]);
    }
}
