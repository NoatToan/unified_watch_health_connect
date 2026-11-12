package com.huawei.openalliance.ad;

import android.text.TextUtils;
import com.huawei.openalliance.ad.beans.vast.NonLinear;
import com.huawei.openalliance.ad.beans.vast.NonLinearAds;
import com.huawei.openalliance.ad.beans.vast.Tracking;
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
public abstract class rn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final List<String> f20196a = Arrays.asList(VastTag.IFRAME_RESOURCE, VastTag.STATIC_RESOURCE, VastTag.HTML_RESOURCE, VastTag.NON_LINEAR_CLICK_THROUGH);

    protected abstract Set<String> a();

    protected abstract void a(XmlPullParser xmlPullParser, List<Tracking> list, Map<String, rt.a> map);

    public void a(final NonLinearAds nonLinearAds, final XmlPullParser xmlPullParser) {
        if (nonLinearAds == null || xmlPullParser == null) {
            return;
        }
        hw.b("BaseNonLinearParser", "read nonlinearAds start");
        final ArrayList arrayList = new ArrayList();
        HashMap map = new HashMap();
        map.put(VastTag.NON_LINEAR, new rt.a() { // from class: com.huawei.openalliance.ad.rn.1
            @Override // com.huawei.openalliance.ad.rt.a
            public void a() {
                arrayList.add(rn.this.a(xmlPullParser));
            }
        });
        map.put(VastTag.TRACKING_EVENTS, new rt.a() { // from class: com.huawei.openalliance.ad.rn.2
            @Override // com.huawei.openalliance.ad.rt.a
            public void a() {
                nonLinearAds.a(rn.this.b(xmlPullParser));
            }
        });
        rt.a(xmlPullParser, map, (List<String>) Collections.singletonList(VastTag.NON_LINEAR));
        hw.a("BaseNonLinearParser", "nonLinearAds setNonLinears: %s", com.huawei.openalliance.ad.utils.bk.b(arrayList));
        nonLinearAds.a(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, List<Tracking>> b(final XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        if (xmlPullParser == null) {
            return null;
        }
        hw.b("BaseNonLinearParser", "start read tracking events");
        xmlPullParser.require(2, VastTag.NAMESPACE, VastTag.TRACKING_EVENTS);
        final HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        map2.put(VastTag.TRACKING, new rt.a() { // from class: com.huawei.openalliance.ad.rn.3
            @Override // com.huawei.openalliance.ad.rt.a
            public void a() throws XmlPullParserException, IOException {
                String attributeValue = xmlPullParser.getAttributeValue(VastTag.NAMESPACE, "event");
                String strA = rt.a(xmlPullParser);
                if (rn.this.a().contains(attributeValue)) {
                    if (map.get(attributeValue) == null) {
                        map.put(attributeValue, new ArrayList());
                    }
                    ((List) map.get(attributeValue)).add(new Tracking(strA, attributeValue));
                }
            }
        });
        rt.a(xmlPullParser, map2, (List<String>) Collections.EMPTY_LIST);
        if (hw.a()) {
            hw.a("BaseNonLinearParser", "read tracking events finish, trackingEvents: %s", map);
        }
        return map;
    }

    private void a(Map<String, rt.a> map, NonLinear nonLinear, XmlPullParser xmlPullParser) {
        if (map == null) {
            return;
        }
        for (String str : f20196a) {
            map.put(str, new rz(str, nonLinear, xmlPullParser));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public NonLinear a(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        if (xmlPullParser == null) {
            return null;
        }
        xmlPullParser.require(2, VastTag.NAMESPACE, VastTag.NON_LINEAR);
        hw.b("BaseNonLinearParser", "readNonLinear");
        NonLinear nonLinear = new NonLinear();
        nonLinear.a(xmlPullParser.getAttributeValue(VastTag.NAMESPACE, "id"));
        String attributeValue = xmlPullParser.getAttributeValue(VastTag.NAMESPACE, "height");
        String attributeValue2 = xmlPullParser.getAttributeValue(VastTag.NAMESPACE, "width");
        if (TextUtils.isEmpty(attributeValue2) || TextUtils.isEmpty(attributeValue)) {
            hw.c("BaseNonLinearParser", "missing required attribute.");
            return null;
        }
        nonLinear.a(com.huawei.openalliance.ad.utils.dg.j(attributeValue).intValue());
        nonLinear.b(com.huawei.openalliance.ad.utils.dg.j(attributeValue2).intValue());
        HashMap map = new HashMap();
        a(map, nonLinear, xmlPullParser);
        ArrayList arrayList = new ArrayList();
        a(xmlPullParser, arrayList, map);
        rt.a(xmlPullParser, map, (List<String>) Collections.EMPTY_LIST);
        nonLinear.a(arrayList);
        if (hw.a()) {
            hw.a("BaseNonLinearParser", "readNonlinear finish, nonLinear: %s", com.huawei.openalliance.ad.utils.bk.b(nonLinear));
        }
        return nonLinear;
    }
}
