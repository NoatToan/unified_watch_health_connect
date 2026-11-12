package defpackage;

import android.content.Context;
import com.amap.api.services.core.AMapException;

/* JADX INFO: loaded from: classes4.dex */
public final class pvs extends kts<String, Integer> {
    public Context y;
    public String z;

    public pvs(Context context, String str) {
        super(context, str);
        this.y = context;
        this.z = str;
    }

    public static Integer t() throws AMapException {
        return 0;
    }

    @Override // defpackage.kts, com.amap.api.col.p0003sl.u
    public final /* synthetic */ Object e(String str) throws AMapException {
        return t();
    }

    @Override // com.amap.api.col.p0003sl.la
    public final String getURL() {
        return wts.e() + "/nearby/data/delete";
    }

    @Override // defpackage.kts
    public final String q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("key=");
        stringBuffer.append(e0t.k(this.y));
        stringBuffer.append("&userid=");
        stringBuffer.append(this.z);
        return stringBuffer.toString();
    }
}
