package com.huawei.openalliance.ad;

import com.huawei.openalliance.ad.beans.vast.Creative;
import com.huawei.openalliance.ad.beans.vast.LinearCreative;
import com.huawei.openalliance.ad.beans.vast.NonLinearAds;
import com.huawei.openalliance.ad.beans.vast.VastContent;
import com.huawei.openalliance.ad.constant.VastAttribute;
import com.huawei.openalliance.ad.constant.VastTag;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes12.dex */
public class rx implements rt.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private VastContent f20231a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private XmlPullParser f20232b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<Creative> f20233c;

    static class a implements rt.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final XmlPullParser f20234a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Creative f20235b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final VastContent f20236c;

        @Override // com.huawei.openalliance.ad.rt.a
        public void a() {
            if (this.f20235b == null) {
                return;
            }
            LinearCreative linearCreative = new LinearCreative();
            ru.c().a(linearCreative, this.f20234a, this.f20236c);
            this.f20235b.a(linearCreative);
        }

        public a(XmlPullParser xmlPullParser, VastContent vastContent, Creative creative) {
            this.f20234a = xmlPullParser;
            this.f20236c = vastContent;
            this.f20235b = creative;
        }
    }

    static class b implements rt.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final XmlPullParser f20237a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Creative f20238b;

        @Override // com.huawei.openalliance.ad.rt.a
        public void a() {
            if (this.f20238b == null) {
                return;
            }
            NonLinearAds nonLinearAds = new NonLinearAds();
            ru.b().a(nonLinearAds, this.f20237a);
            this.f20238b.a(nonLinearAds);
        }

        public b(XmlPullParser xmlPullParser, Creative creative) {
            this.f20237a = xmlPullParser;
            this.f20238b = creative;
        }
    }

    @Override // com.huawei.openalliance.ad.rt.a
    public void a() {
        List<Creative> list = this.f20233c;
        if (list != null) {
            list.add(a(this.f20232b, this.f20231a));
        }
    }

    private Creative a(XmlPullParser xmlPullParser, VastContent vastContent) throws XmlPullParserException, IOException {
        if (xmlPullParser == null || vastContent == null) {
            return null;
        }
        hw.a("CreativeTagHandle", "start read creative, ad id: %s", vastContent.a());
        xmlPullParser.require(2, VastTag.NAMESPACE, VastTag.CREATIVE);
        String attributeValue = xmlPullParser.getAttributeValue(VastTag.NAMESPACE, VastAttribute.AD_ID);
        String attributeValue2 = xmlPullParser.getAttributeValue(VastTag.NAMESPACE, "id");
        if (attributeValue2 == null) {
            attributeValue2 = com.huawei.openalliance.ad.utils.cp.a(8);
        }
        String attributeValue3 = xmlPullParser.getAttributeValue(VastTag.NAMESPACE, VastAttribute.SEQUENCE);
        Creative creative = new Creative(attributeValue2, attributeValue3 != null ? Integer.valueOf(attributeValue3) : null, attributeValue);
        HashMap map = new HashMap();
        map.put(VastTag.LINEAR, new a(xmlPullParser, vastContent, creative));
        map.put(VastTag.NON_LINEAR_ADS, new b(xmlPullParser, creative));
        rt.a(xmlPullParser, map, (List<String>) Arrays.asList(VastTag.LINEAR, VastTag.NON_LINEAR_ADS));
        return creative;
    }

    public rx(VastContent vastContent, XmlPullParser xmlPullParser, List<Creative> list) {
        this.f20231a = vastContent;
        this.f20232b = xmlPullParser;
        this.f20233c = list;
    }
}
