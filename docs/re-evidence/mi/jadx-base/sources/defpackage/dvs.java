package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.amap.api.services.core.AMapException;
import com.amap.api.services.core.LatLonPoint;
import com.amap.api.services.help.InputtipsQuery;
import com.amap.api.services.help.Tip;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class dvs extends kts<InputtipsQuery, ArrayList<Tip>> {
    public dvs(Context context, InputtipsQuery inputtipsQuery) {
        super(context, inputtipsQuery);
    }

    private static ArrayList<Tip> t(String str) throws AMapException {
        try {
            return fvs.u0(new JSONObject(str));
        } catch (JSONException e) {
            xts.i(e, "InputtipsHandler", "paseJSON");
            return null;
        }
    }

    @Override // defpackage.kts, com.amap.api.col.p0003sl.u
    public final /* synthetic */ Object e(String str) throws AMapException {
        return t(str);
    }

    @Override // com.amap.api.col.p0003sl.la
    public final String getURL() {
        return wts.b() + "/assistant/inputtips?";
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.kts
    public final String q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("output=json");
        String strB = kts.b(((InputtipsQuery) this.s).getKeyword());
        if (!TextUtils.isEmpty(strB)) {
            stringBuffer.append("&keywords=");
            stringBuffer.append(strB);
        }
        String city = ((InputtipsQuery) this.s).getCity();
        if (!fvs.s0(city)) {
            String strB2 = kts.b(city);
            stringBuffer.append("&city=");
            stringBuffer.append(strB2);
        }
        String type = ((InputtipsQuery) this.s).getType();
        if (!fvs.s0(type)) {
            String strB3 = kts.b(type);
            stringBuffer.append("&type=");
            stringBuffer.append(strB3);
        }
        if (((InputtipsQuery) this.s).getCityLimit()) {
            stringBuffer.append("&citylimit=true");
        } else {
            stringBuffer.append("&citylimit=false");
        }
        LatLonPoint location = ((InputtipsQuery) this.s).getLocation();
        if (location != null) {
            stringBuffer.append("&location=");
            stringBuffer.append(location.getLongitude());
            stringBuffer.append(",");
            stringBuffer.append(location.getLatitude());
        }
        stringBuffer.append("&key=");
        stringBuffer.append(e0t.k(this.v));
        return stringBuffer.toString();
    }
}
