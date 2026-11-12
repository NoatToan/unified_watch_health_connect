package com.amap.api.col.p0003sl;

import android.content.Context;
import com.amap.api.services.core.AMapException;
import com.amap.api.services.core.LatLonPoint;
import com.amap.api.services.nearby.UploadInfo;

/* JADX INFO: loaded from: classes21.dex */
public final class gi extends fm<UploadInfo, Integer> {
    private Context k;
    private UploadInfo l;

    @Override // com.amap.api.col.p0003sl.fm, com.amap.api.col.p0003sl.fl
    protected final /* synthetic */ Object a(String str) throws AMapException {
        return f();
    }

    public gi(Context context, UploadInfo uploadInfo) {
        super(context, uploadInfo);
        this.k = context;
        this.l = uploadInfo;
    }

    @Override // com.amap.api.col.p0003sl.fm, com.amap.api.col.p0003sl.fl
    protected final String c() {
        StringBuffer stringBuffer = new StringBuffer("key=");
        stringBuffer.append(il.f(this.k));
        stringBuffer.append("&userid=").append(this.l.getUserID());
        LatLonPoint point = this.l.getPoint();
        stringBuffer.append("&location=").append(((int) (point.getLongitude() * 1000000.0d)) / 1000000.0f).append(",").append(((int) (point.getLatitude() * 1000000.0d)) / 1000000.0f);
        stringBuffer.append("&coordtype=").append(this.l.getCoordType());
        return stringBuffer.toString();
    }

    private static Integer f() throws AMapException {
        return 0;
    }

    @Override // com.amap.api.col.p0003sl.la
    public final String getURL() {
        return ft.d() + "/nearby/data/create";
    }
}
