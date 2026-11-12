package com.huawei.openalliance.ad;

import com.huawei.openalliance.ad.beans.vast.Tracking;
import com.huawei.openalliance.ad.constant.VastAttribute;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: loaded from: classes12.dex */
public class rs extends rn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Set<String> f20225a = new HashSet(Arrays.asList(VastAttribute.CREATIVE_VIEW, "start", "firstQuartile", "midpoint", "thirdQuartile", "complete", "mute", "unmute", "pause", "resume", "close"));

    @Override // com.huawei.openalliance.ad.rn
    protected void a(XmlPullParser xmlPullParser, List<Tracking> list, Map<String, rt.a> map) {
    }

    @Override // com.huawei.openalliance.ad.rn
    protected Set<String> a() {
        return this.f20225a;
    }
}
