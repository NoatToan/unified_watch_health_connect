package com.amap.api.col.p0003sl;

import android.content.Context;
import android.text.TextUtils;
import com.amap.api.services.core.AMapException;
import com.amap.api.services.core.LatLonPoint;
import com.amap.api.services.help.InputtipsQuery;
import com.amap.api.services.help.Tip;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes21.dex */
public final class gb extends fm<InputtipsQuery, ArrayList<Tip>> {
    @Override // com.amap.api.col.p0003sl.fm, com.amap.api.col.p0003sl.fl
    protected final /* synthetic */ Object a(String str) throws AMapException {
        return c(str);
    }

    public gb(Context context, InputtipsQuery inputtipsQuery) {
        super(context, inputtipsQuery);
    }

    private static ArrayList<Tip> c(String str) throws AMapException {
        try {
            return gc.j(new JSONObject(str));
        } catch (JSONException e) {
            fu.a(e, "InputtipsHandler", "paseJSON");
            return null;
        }
    }

    @Override // com.amap.api.col.p0003sl.la
    public final String getURL() {
        return ft.a() + "/assistant/inputtips?";
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.amap.api.col.p0003sl.fm, com.amap.api.col.p0003sl.fl
    protected final String c() {
        StringBuffer stringBuffer = new StringBuffer("output=json");
        String strB = b(((InputtipsQuery) this.f2534b).getKeyword());
        if (!TextUtils.isEmpty(strB)) {
            stringBuffer.append("&keywords=").append(strB);
        }
        String city = ((InputtipsQuery) this.f2534b).getCity();
        if (!gc.i(city)) {
            stringBuffer.append("&city=").append(b(city));
        }
        String type = ((InputtipsQuery) this.f2534b).getType();
        if (!gc.i(type)) {
            stringBuffer.append("&type=").append(b(type));
        }
        if (((InputtipsQuery) this.f2534b).getCityLimit()) {
            stringBuffer.append("&citylimit=true");
        } else {
            stringBuffer.append("&citylimit=false");
        }
        LatLonPoint location = ((InputtipsQuery) this.f2534b).getLocation();
        if (location != null) {
            stringBuffer.append("&location=").append(location.getLongitude()).append(",").append(location.getLatitude());
        }
        stringBuffer.append("&key=").append(il.f(this.i));
        return stringBuffer.toString();
    }
}
