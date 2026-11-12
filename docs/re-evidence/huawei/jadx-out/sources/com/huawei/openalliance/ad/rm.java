package com.huawei.openalliance.ad;

import android.text.TextUtils;
import com.huawei.openalliance.ad.beans.vast.ClickThrough;
import com.huawei.openalliance.ad.beans.vast.LinearCreative;
import com.huawei.openalliance.ad.beans.vast.Tracking;
import com.huawei.openalliance.ad.beans.vast.VastContent;
import com.huawei.openalliance.ad.beans.vast.VastMediaFile;
import com.huawei.openalliance.ad.beans.vast.VideoClicks;
import com.huawei.openalliance.ad.constant.VastAttribute;
import com.huawei.openalliance.ad.constant.VastTag;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes12.dex */
public abstract class rm {
    protected abstract Set<String> a();

    protected abstract void a(LinearCreative linearCreative, XmlPullParser xmlPullParser, Map<String, rt.a> map);

    static class b implements rt.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List<VastMediaFile> f20182a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final XmlPullParser f20183b;

        @Override // com.huawei.openalliance.ad.rt.a
        public void a() {
            List<VastMediaFile> list = this.f20182a;
            if (list != null) {
                list.add(a(this.f20183b));
            }
        }

        private VastMediaFile a(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
            if (xmlPullParser == null) {
                return null;
            }
            hw.a("BaseLinearParser", "start read media file");
            xmlPullParser.require(2, VastTag.NAMESPACE, VastTag.MEDIA_FILE);
            VastMediaFile vastMediaFile = new VastMediaFile();
            vastMediaFile.b(xmlPullParser.getAttributeValue(VastTag.NAMESPACE, VastAttribute.DELIVERY));
            String attributeValue = xmlPullParser.getAttributeValue(VastTag.NAMESPACE, "height");
            String attributeValue2 = xmlPullParser.getAttributeValue(VastTag.NAMESPACE, "width");
            if (TextUtils.isEmpty(attributeValue) || TextUtils.isEmpty(attributeValue2)) {
                hw.b("BaseLinearParser", "media file missing required attribute");
                return null;
            }
            int iA = com.huawei.openalliance.ad.utils.dg.a(attributeValue, 0);
            int iA2 = com.huawei.openalliance.ad.utils.dg.a(attributeValue2, 0);
            if (iA == 0 || iA2 == 0) {
                hw.a("BaseLinearParser", "media file height or width is invalid.");
                return null;
            }
            vastMediaFile.b(iA);
            vastMediaFile.a(iA2);
            vastMediaFile.a(xmlPullParser.getAttributeValue(VastTag.NAMESPACE, "id"));
            vastMediaFile.c(rt.a(xmlPullParser, "type"));
            String strA = rt.a(xmlPullParser);
            if (TextUtils.isEmpty(strA) || strA.trim().isEmpty()) {
                hw.d("BaseLinearParser", "media file url not be empty");
                return null;
            }
            vastMediaFile.d(strA);
            return vastMediaFile;
        }

        public b(List<VastMediaFile> list, XmlPullParser xmlPullParser) {
            this.f20182a = list;
            this.f20183b = xmlPullParser;
        }
    }

    static class c implements rt.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final LinearCreative f20184a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final XmlPullParser f20185b;

        static class a implements rt.a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final XmlPullParser f20186a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final Map<String, List<Tracking>> f20187b;

            @Override // com.huawei.openalliance.ad.rt.a
            public void a() throws XmlPullParserException, IOException {
                XmlPullParser xmlPullParser = this.f20186a;
                if (xmlPullParser == null || this.f20187b == null) {
                    return;
                }
                String attributeValue = xmlPullParser.getAttributeValue(VastTag.NAMESPACE, "event");
                String strA = rt.a(this.f20186a);
                if (ru.c().a().contains(attributeValue)) {
                    if (this.f20187b.get(attributeValue) == null) {
                        this.f20187b.put(attributeValue, new ArrayList());
                    }
                    this.f20187b.get(attributeValue).add(new Tracking(strA, attributeValue));
                }
            }

            public a(XmlPullParser xmlPullParser, Map<String, List<Tracking>> map) {
                this.f20186a = xmlPullParser;
                this.f20187b = map;
            }
        }

        @Override // com.huawei.openalliance.ad.rt.a
        public void a() {
            LinearCreative linearCreative = this.f20184a;
            if (linearCreative != null) {
                linearCreative.a(a(this.f20185b));
            }
        }

        private Map<String, List<Tracking>> a(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
            if (xmlPullParser == null) {
                return null;
            }
            hw.a("BaseLinearParser", "start read tracking events");
            xmlPullParser.require(2, VastTag.NAMESPACE, VastTag.TRACKING_EVENTS);
            HashMap map = new HashMap();
            HashMap map2 = new HashMap();
            map2.put(VastTag.TRACKING, new a(xmlPullParser, map));
            rt.a(xmlPullParser, map2, (List<String>) Collections.EMPTY_LIST);
            hw.a("BaseLinearParser", "read tracking events finish, tracking events: %s", map);
            return map;
        }

        public c(LinearCreative linearCreative, XmlPullParser xmlPullParser) {
            this.f20184a = linearCreative;
            this.f20185b = xmlPullParser;
        }
    }

    static class e implements rt.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final VideoClicks f20190a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final XmlPullParser f20191b;

        @Override // com.huawei.openalliance.ad.rt.a
        public void a() {
            VideoClicks videoClicks = this.f20190a;
            if (videoClicks != null) {
                videoClicks.a(a(this.f20191b));
            }
        }

        private ClickThrough a(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
            if (xmlPullParser == null) {
                return null;
            }
            hw.a("BaseLinearParser", "start read click through");
            xmlPullParser.require(2, VastTag.NAMESPACE, VastTag.CLICK_THROUGH);
            ClickThrough clickThrough = new ClickThrough();
            clickThrough.a(xmlPullParser.getAttributeValue(VastTag.NAMESPACE, "id"));
            clickThrough.b(rt.a(xmlPullParser));
            hw.a("BaseLinearParser", "finish read click trough: %s", clickThrough);
            return clickThrough;
        }

        public e(VideoClicks videoClicks, XmlPullParser xmlPullParser) {
            this.f20190a = videoClicks;
            this.f20191b = xmlPullParser;
        }
    }

    static class f implements rt.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final LinearCreative f20192a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final XmlPullParser f20193b;

        static class a implements rt.a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final XmlPullParser f20194a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final List<Tracking> f20195b;

            @Override // com.huawei.openalliance.ad.rt.a
            public void a() throws XmlPullParserException, IOException {
                XmlPullParser xmlPullParser = this.f20194a;
                if (xmlPullParser == null || this.f20195b == null) {
                    return;
                }
                String attributeValue = xmlPullParser.getAttributeValue(VastTag.NAMESPACE, "id");
                this.f20195b.add(new Tracking(rt.a(this.f20194a), attributeValue));
            }

            public a(XmlPullParser xmlPullParser, List<Tracking> list) {
                this.f20194a = xmlPullParser;
                this.f20195b = list;
            }
        }

        @Override // com.huawei.openalliance.ad.rt.a
        public void a() {
            LinearCreative linearCreative = this.f20192a;
            if (linearCreative != null) {
                linearCreative.a(a(this.f20193b));
            }
        }

        private VideoClicks a(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
            if (xmlPullParser == null) {
                return null;
            }
            hw.a("BaseLinearParser", "start read video clicks");
            xmlPullParser.require(2, VastTag.NAMESPACE, VastTag.VIDEO_CLICKS);
            VideoClicks videoClicks = new VideoClicks();
            ArrayList arrayList = new ArrayList();
            HashMap map = new HashMap();
            map.put(VastTag.CLICK_THROUGH, new e(videoClicks, xmlPullParser));
            map.put("ClickTracking", new a(xmlPullParser, arrayList));
            rt.a(xmlPullParser, map, (List<String>) Collections.EMPTY_LIST);
            videoClicks.a(arrayList);
            hw.a("BaseLinearParser", "finish read video clicks, video clicks: %s", videoClicks);
            return videoClicks;
        }

        public f(LinearCreative linearCreative, XmlPullParser xmlPullParser) {
            this.f20192a = linearCreative;
            this.f20193b = xmlPullParser;
        }
    }

    static class a implements rt.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final LinearCreative f20180a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final XmlPullParser f20181b;

        @Override // com.huawei.openalliance.ad.rt.a
        public void a() {
            LinearCreative linearCreative = this.f20180a;
            if (linearCreative != null) {
                linearCreative.a(com.huawei.openalliance.ad.utils.dg.a(rt.a(rt.a(this.f20181b)), 0));
            }
        }

        public a(LinearCreative linearCreative, XmlPullParser xmlPullParser) {
            this.f20180a = linearCreative;
            this.f20181b = xmlPullParser;
        }
    }

    static class d implements rt.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final XmlPullParser f20188a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final LinearCreative f20189b;

        @Override // com.huawei.openalliance.ad.rt.a
        public void a() throws XmlPullParserException, IOException {
            XmlPullParser xmlPullParser = this.f20188a;
            if (xmlPullParser == null || this.f20189b == null) {
                return;
            }
            xmlPullParser.require(2, VastTag.NAMESPACE, VastTag.MEDIA_FILES);
            ArrayList arrayList = new ArrayList();
            HashMap map = new HashMap();
            map.put(VastTag.MEDIA_FILE, new b(arrayList, this.f20188a));
            rt.a(this.f20188a, map, (List<String>) Collections.singletonList(VastTag.MEDIA_FILE));
            this.f20189b.a(arrayList);
        }

        public d(LinearCreative linearCreative, XmlPullParser xmlPullParser) {
            this.f20188a = xmlPullParser;
            this.f20189b = linearCreative;
        }
    }

    public void a(LinearCreative linearCreative, XmlPullParser xmlPullParser, VastContent vastContent) {
        if (linearCreative == null || xmlPullParser == null || vastContent == null) {
            return;
        }
        hw.a("BaseLinearParser", "start read linear creative");
        xmlPullParser.require(2, VastTag.NAMESPACE, VastTag.LINEAR);
        HashMap map = new HashMap();
        b(linearCreative, xmlPullParser, map);
        rt.a(xmlPullParser, map, (List<String>) (vastContent.g().booleanValue() ? Collections.EMPTY_LIST : Arrays.asList(VastTag.DURATION, VastTag.MEDIA_FILES)));
        hw.a("BaseLinearParser", "read linear creative finish");
    }

    private void b(LinearCreative linearCreative, XmlPullParser xmlPullParser, Map<String, rt.a> map) {
        if (map == null) {
            return;
        }
        map.put(VastTag.DURATION, new a(linearCreative, xmlPullParser));
        map.put(VastTag.MEDIA_FILES, new d(linearCreative, xmlPullParser));
        map.put(VastTag.VIDEO_CLICKS, new f(linearCreative, xmlPullParser));
        map.put(VastTag.TRACKING_EVENTS, new c(linearCreative, xmlPullParser));
        a(linearCreative, xmlPullParser, map);
    }
}
