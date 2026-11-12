package com.huawei.openalliance.ad;

import com.huawei.openalliance.ad.beans.vast.LinearCreative;
import com.huawei.openalliance.ad.beans.vast.VastIcon;
import com.huawei.openalliance.ad.constant.VastAttribute;
import com.huawei.openalliance.ad.constant.VastTag;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes12.dex */
public class rq extends rm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Set<String> f20213a = new HashSet(Arrays.asList(VastAttribute.CREATIVE_VIEW, "start", "firstQuartile", "midpoint", "thirdQuartile", "complete", "mute", "unmute", "pause", "resume", VastAttribute.CLOSE_LINEAR, "skip", "progress"));

    static class a implements rt.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final LinearCreative f20214a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final XmlPullParser f20215b;

        @Override // com.huawei.openalliance.ad.rt.a
        public void a() {
            LinearCreative linearCreative = this.f20214a;
            if (linearCreative != null) {
                linearCreative.b(a(this.f20215b));
            }
        }

        private List<VastIcon> a(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
            if (xmlPullParser == null) {
                return null;
            }
            hw.a("Linear30Parser", "start read icons");
            xmlPullParser.require(2, VastTag.NAMESPACE, VastTag.ICONS);
            ArrayList arrayList = new ArrayList();
            HashMap map = new HashMap();
            map.put(VastTag.ICON, new b(arrayList, xmlPullParser));
            rt.a(xmlPullParser, map, (List<String>) Collections.EMPTY_LIST);
            hw.a("Linear30Parser", "read icons finish");
            return arrayList;
        }

        public a(LinearCreative linearCreative, XmlPullParser xmlPullParser) {
            this.f20214a = linearCreative;
            this.f20215b = xmlPullParser;
        }
    }

    static class b implements rt.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List<VastIcon> f20216a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final XmlPullParser f20217b;

        static class a implements rt.a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final VastIcon f20218a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final XmlPullParser f20219b;

            @Override // com.huawei.openalliance.ad.rt.a
            public void a() {
                VastIcon vastIcon = this.f20218a;
                if (vastIcon != null) {
                    vastIcon.e(rt.a(this.f20219b));
                }
            }

            public a(VastIcon vastIcon, XmlPullParser xmlPullParser) {
                this.f20218a = vastIcon;
                this.f20219b = xmlPullParser;
            }
        }

        /* JADX INFO: renamed from: com.huawei.openalliance.ad.rq$b$b, reason: collision with other inner class name */
        static class C0231b implements rt.a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final VastIcon f20220a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final XmlPullParser f20221b;

            @Override // com.huawei.openalliance.ad.rt.a
            public void a() {
                VastIcon vastIcon = this.f20220a;
                if (vastIcon != null) {
                    vastIcon.d(rt.a(this.f20221b));
                }
            }

            public C0231b(VastIcon vastIcon, XmlPullParser xmlPullParser) {
                this.f20220a = vastIcon;
                this.f20221b = xmlPullParser;
            }
        }

        static class c implements rt.a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final VastIcon f20222a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final XmlPullParser f20223b;

            @Override // com.huawei.openalliance.ad.rt.a
            public void a() {
                VastIcon vastIcon = this.f20222a;
                if (vastIcon != null) {
                    vastIcon.a(rt.b(this.f20223b));
                }
            }

            public c(VastIcon vastIcon, XmlPullParser xmlPullParser) {
                this.f20222a = vastIcon;
                this.f20223b = xmlPullParser;
            }
        }

        @Override // com.huawei.openalliance.ad.rt.a
        public void a() {
            List<VastIcon> list = this.f20216a;
            if (list != null) {
                list.add(a(this.f20217b));
            }
        }

        private VastIcon a(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
            if (xmlPullParser == null) {
                return null;
            }
            hw.a("Linear30Parser", "start read icon");
            xmlPullParser.require(2, VastTag.NAMESPACE, VastTag.ICON);
            VastIcon vastIcon = new VastIcon();
            String attributeValue = xmlPullParser.getAttributeValue(VastTag.NAMESPACE, VastAttribute.PROGRAM);
            if (attributeValue != null) {
                vastIcon.a(attributeValue);
            }
            String attributeValue2 = xmlPullParser.getAttributeValue(VastTag.NAMESPACE, "width");
            String attributeValue3 = xmlPullParser.getAttributeValue(VastTag.NAMESPACE, "height");
            if (attributeValue2 == null || attributeValue3 == null) {
                hw.c("Linear30Parser", "icon width or height is missing.");
                return null;
            }
            vastIcon.b(Integer.parseInt(attributeValue2));
            vastIcon.a(Integer.parseInt(attributeValue3));
            vastIcon.b(rt.a(xmlPullParser, VastAttribute.XPOSITION));
            vastIcon.c(rt.a(xmlPullParser, VastAttribute.YPOSITION));
            HashMap map = new HashMap();
            map.put(VastTag.STATIC_RESOURCE, new c(vastIcon, xmlPullParser));
            map.put(VastTag.IFRAME_RESOURCE, new C0231b(vastIcon, xmlPullParser));
            map.put(VastTag.HTML_RESOURCE, new a(vastIcon, xmlPullParser));
            rt.a(xmlPullParser, map, (List<String>) Collections.EMPTY_LIST);
            hw.a("Linear30Parser", "read icon finish, icon: %s", vastIcon);
            return vastIcon;
        }

        public b(List<VastIcon> list, XmlPullParser xmlPullParser) {
            this.f20216a = list;
            this.f20217b = xmlPullParser;
        }
    }

    @Override // com.huawei.openalliance.ad.rm
    protected void a(LinearCreative linearCreative, XmlPullParser xmlPullParser, Map<String, rt.a> map) {
        if (map != null) {
            map.put(VastTag.ICONS, new a(linearCreative, xmlPullParser));
        }
    }

    @Override // com.huawei.openalliance.ad.rm
    protected Set<String> a() {
        return this.f20213a;
    }
}
