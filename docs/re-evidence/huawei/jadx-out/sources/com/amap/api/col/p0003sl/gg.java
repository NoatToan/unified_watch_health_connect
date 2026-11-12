package com.amap.api.col.p0003sl;

import android.content.Context;
import com.amap.api.services.core.AMapException;

/* JADX INFO: loaded from: classes21.dex */
public final class gg extends fm<String, Integer> {
    private Context k;
    private String l;

    @Override // com.amap.api.col.p0003sl.fm, com.amap.api.col.p0003sl.fl
    protected final /* synthetic */ Object a(String str) throws AMapException {
        return f();
    }

    public gg(Context context, String str) {
        super(context, str);
        this.k = context;
        this.l = str;
    }

    @Override // com.amap.api.col.p0003sl.fm, com.amap.api.col.p0003sl.fl
    protected final String c() {
        StringBuffer stringBuffer = new StringBuffer("key=");
        stringBuffer.append(il.f(this.k));
        stringBuffer.append("&userid=").append(this.l);
        return stringBuffer.toString();
    }

    private static Integer f() throws AMapException {
        return 0;
    }

    @Override // com.amap.api.col.p0003sl.la
    public final String getURL() {
        return ft.d() + "/nearby/data/delete";
    }
}
