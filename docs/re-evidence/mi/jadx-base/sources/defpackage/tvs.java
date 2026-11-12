package defpackage;

import android.content.Context;
import com.amap.api.services.core.AMapException;
import com.amap.api.services.core.LatLonPoint;
import com.amap.api.services.nearby.UploadInfo;

/* JADX INFO: loaded from: classes4.dex */
public final class tvs extends kts<UploadInfo, Integer> {
    public Context y;
    public UploadInfo z;

    public tvs(Context context, UploadInfo uploadInfo) {
        super(context, uploadInfo);
        this.y = context;
        this.z = uploadInfo;
    }

    private static Integer t() throws AMapException {
        return 0;
    }

    @Override // defpackage.kts, com.amap.api.col.p0003sl.u
    public final /* synthetic */ Object e(String str) throws AMapException {
        return t();
    }

    @Override // com.amap.api.col.p0003sl.la
    public final String getURL() {
        return wts.e() + "/nearby/data/create";
    }

    @Override // defpackage.kts
    public final String q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("key=");
        stringBuffer.append(e0t.k(this.y));
        stringBuffer.append("&userid=");
        stringBuffer.append(this.z.getUserID());
        LatLonPoint point = this.z.getPoint();
        int longitude = (int) (point.getLongitude() * 1000000.0d);
        int latitude = (int) (point.getLatitude() * 1000000.0d);
        stringBuffer.append("&location=");
        stringBuffer.append(longitude / 1000000.0f);
        stringBuffer.append(",");
        stringBuffer.append(latitude / 1000000.0f);
        stringBuffer.append("&coordtype=");
        stringBuffer.append(this.z.getCoordType());
        return stringBuffer.toString();
    }
}
