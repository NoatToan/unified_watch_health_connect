package com.huawei.openalliance.ad;

import com.huawei.openalliance.ad.beans.vast.Vast;
import com.huawei.openalliance.ad.beans.vast.VastContent;
import com.huawei.openalliance.ad.constant.VastTag;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes12.dex */
public abstract class ro {
    public abstract List<VastContent> a(XmlPullParser xmlPullParser);

    protected abstract void a(XmlPullParser xmlPullParser, VastContent vastContent);

    static class a implements rt.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private XmlPullParser f20208a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private VastContent f20209b;

        @Override // com.huawei.openalliance.ad.rt.a
        public void a() throws XmlPullParserException, IOException {
            VastContent vastContent = this.f20209b;
            if (vastContent == null || this.f20208a == null) {
                return;
            }
            hw.b("BaseVastParser", "read inline, %s.", vastContent.a());
            rt.b(this.f20208a, this.f20209b);
        }

        public a(XmlPullParser xmlPullParser, VastContent vastContent) {
            this.f20208a = xmlPullParser;
            this.f20209b = vastContent;
        }
    }

    static class b implements rt.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final XmlPullParser f20210a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final VastContent f20211b;

        @Override // com.huawei.openalliance.ad.rt.a
        public void a() throws XmlPullParserException, IOException {
            VastContent vastContent = this.f20211b;
            if (vastContent == null || this.f20210a == null) {
                return;
            }
            hw.b("BaseVastParser", "read warpper, %s.", vastContent.a());
            rt.a(this.f20210a, this.f20211b);
        }

        public b(XmlPullParser xmlPullParser, VastContent vastContent) {
            this.f20210a = xmlPullParser;
            this.f20211b = vastContent;
        }
    }

    protected static VastContent c(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        xmlPullParser.require(2, VastTag.NAMESPACE, VastTag.AD);
        VastContent vastContent = new VastContent();
        vastContent.a(xmlPullParser.getAttributeValue(VastTag.NAMESPACE, "id"));
        ru.a().a(xmlPullParser, vastContent);
        HashMap map = new HashMap();
        map.put(VastTag.INLINE, new a(xmlPullParser, vastContent));
        map.put(VastTag.WRAPPER, new b(xmlPullParser, vastContent));
        try {
            rt.a(xmlPullParser, map, (List<String>) Collections.EMPTY_LIST);
            return vastContent;
        } catch (Throwable th) {
            hw.c("BaseVastParser", "attribute format error: %s", th.getClass().getSimpleName());
            return vastContent;
        }
    }

    protected static Vast b(final XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        HashMap map = new HashMap();
        final ArrayList arrayList = new ArrayList();
        map.put(VastTag.AD, new rt.a() { // from class: com.huawei.openalliance.ad.ro.1
            @Override // com.huawei.openalliance.ad.rt.a
            public void a() {
                arrayList.add(ro.c(xmlPullParser));
            }
        });
        rt.a(xmlPullParser, map, (List<String>) Collections.EMPTY_LIST);
        return new Vast(arrayList);
    }
}
