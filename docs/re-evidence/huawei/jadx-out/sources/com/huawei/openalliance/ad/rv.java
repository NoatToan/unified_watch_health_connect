package com.huawei.openalliance.ad;

import com.huawei.openalliance.ad.beans.vast.VastContent;
import java.util.ArrayList;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: loaded from: classes12.dex */
public class rv extends ro {
    @Override // com.huawei.openalliance.ad.ro
    protected void a(XmlPullParser xmlPullParser, VastContent vastContent) {
    }

    @Override // com.huawei.openalliance.ad.ro
    public List<VastContent> a(XmlPullParser xmlPullParser) {
        ArrayList arrayList = new ArrayList();
        try {
            return b(xmlPullParser).a();
        } catch (Throwable th) {
            hw.c("Vast20Parser", "read vast content error: %s", th.getClass().getSimpleName());
            return arrayList;
        }
    }
}
