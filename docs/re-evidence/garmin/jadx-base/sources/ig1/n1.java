package ig1;

import android.content.Context;
import android.view.View;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import java.util.HashMap;
import org.apache.commons.lang3.text.WordUtils;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lig1/n1;", "Lfb2/z;", "Lcom/garmin/android/apps/connectmobile/devices/model/f;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class n1 extends fb2.z<com.garmin.android.apps.connectmobile.devices.model.f> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n1(Context context) {
        super(context);
        context.getClass();
    }

    @Override // fb2.e
    public final boolean h(Object obj) {
        com.garmin.android.apps.connectmobile.devices.model.f fVar = (com.garmin.android.apps.connectmobile.devices.model.f) obj;
        fVar.getClass();
        HashMap<String, Object> map = fVar.f34132b;
        return map.containsKey("poolLength") && map.containsKey("poolLengthUnit");
    }

    @Override // fb2.z
    public final String q(com.garmin.android.apps.connectmobile.devices.model.f fVar) {
        com.garmin.android.apps.connectmobile.devices.model.f fVar2 = fVar;
        fVar2.getClass();
        am.g2 g2VarA = am.g2.a(fVar2.k0(), fVar2.o0());
        g2VarA.getClass();
        String strCapitalize = WordUtils.capitalize(this.f70343a.getString(g2VarA.f3983b, g2VarA.f3982a));
        strCapitalize.getClass();
        return strCapitalize;
    }

    @Override // fb2.z
    /* JADX INFO: renamed from: s */
    public final int getF93393e() {
        return View.generateViewId();
    }

    @Override // fb2.z
    public final String t() {
        String strB = b(R.string.workout_pool_size);
        strB.getClass();
        return strB;
    }
}
