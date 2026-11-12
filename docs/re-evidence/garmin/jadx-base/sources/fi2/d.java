package fi2;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.x0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lfi2/d;", "Lei2/h;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "androiddynamicsettings_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class d extends ei2.h {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Context context) {
        super(context);
        context.getClass();
    }

    @Override // ei2.h
    public final String f(ii2.b bVar, Map<String, ? extends Object> map) {
        String strD;
        List<Map<String, Object>> listC4 = bVar.C4(map);
        String strD2 = null;
        if (listC4 != null) {
            strD = null;
            for (Map<String, Object> map2 : listC4) {
                mh2.i iVar = mh2.i.ID;
                if (String.valueOf(map2.get(iVar.f118617a)).equals(mh2.m.AUDIO_PROMPT_FREQUENCY.f118678a)) {
                    strD2 = d(bVar, String.valueOf(map2.get(mh2.i.VALUE_ID.f118617a)));
                }
                if (String.valueOf(map2.get(iVar.f118617a)).equals(mh2.m.AUDIO_PROMPT_DURATION.f118678a)) {
                    strD = d(bVar, String.valueOf(map2.get(mh2.i.VALUE_ID.f118617a)));
                }
            }
        } else {
            strD = null;
        }
        if (strD2 == null || strD == null) {
            return "--";
        }
        boolean zEquals = strD2.equals(mh2.m.LAP.f118678a);
        Context context = this.f64388a;
        if (zEquals) {
            String string = context.getString(R.string.lbl_lap);
            string.getClass();
            return string;
        }
        if (!strD2.equals(mh2.m.TIME.f118678a)) {
            return "--";
        }
        x0 x0Var = x0.f105818a;
        String string2 = context.getString(R.string.common_mins_lbl);
        string2.getClass();
        hi2.a.f83879a.getClass();
        return String.format(string2, Arrays.copyOf(new Object[]{String.valueOf(hi2.a.C1658a.h(strD) / 60)}, 1));
    }
}
