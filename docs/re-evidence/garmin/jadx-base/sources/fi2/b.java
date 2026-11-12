package fi2;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import java.util.List;
import java.util.Map;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lfi2/b;", "Lei2/h;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "androiddynamicsettings_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class b extends ei2.h {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Context context) {
        super(context);
        context.getClass();
    }

    @Override // ei2.h
    public final String f(ii2.b bVar, Map<String, ? extends Object> map) {
        boolean z14;
        List<Map<String, Object>> listC4 = bVar.C4(map);
        boolean zF = false;
        if (listC4 != null) {
            boolean zF2 = false;
            for (Map<String, Object> map2 : listC4) {
                mh2.i iVar = mh2.i.ID;
                if (String.valueOf(map2.get(iVar.f118617a)).equals(mh2.m.SOUNDS_IN_APP_ONLY_ENABLED.f118678a)) {
                    hi2.a.C1658a c1658a = hi2.a.f83879a;
                    String strD = d(bVar, String.valueOf(map2.get(mh2.i.VALUE_ID.f118617a)));
                    c1658a.getClass();
                    zF = hi2.a.C1658a.f(strD);
                }
                if (String.valueOf(map2.get(iVar.f118617a)).equals(mh2.m.ALERT_TONES_ENABLED.f118678a)) {
                    hi2.a.C1658a c1658a2 = hi2.a.f83879a;
                    String strD2 = d(bVar, String.valueOf(map2.get(mh2.i.VALUE_ID.f118617a)));
                    c1658a2.getClass();
                    zF2 = hi2.a.C1658a.f(strD2);
                }
            }
            z14 = zF;
            zF = zF2;
        } else {
            z14 = false;
        }
        Context context = this.f64388a;
        if (zF) {
            String string = context.getString(R.string.lbl_on);
            string.getClass();
            return string;
        }
        if (z14) {
            String string2 = context.getString(R.string.device_settings_during_activity);
            string2.getClass();
            return string2;
        }
        String string3 = context.getString(R.string.lbl_off);
        string3.getClass();
        return string3;
    }
}
