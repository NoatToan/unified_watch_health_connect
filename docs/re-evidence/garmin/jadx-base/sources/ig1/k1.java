package ig1;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lig1/k1;", "Lig1/b0;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "pageIndex", "maxNumberOfFieldsPerPage", "<init>", "(Landroid/content/Context;II)V", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class k1 extends b0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1(Context context, int i14, int i15) {
        super(context);
        context.getClass();
        this.f93286e = i14;
        this.f93285d = new a0[i15];
        for (int i16 = 0; i16 < i15; i16++) {
            j1 j1Var = new j1(context, i14, i16);
            j1Var.addObserver(this);
            this.f93285d[i16] = j1Var;
        }
    }
}
