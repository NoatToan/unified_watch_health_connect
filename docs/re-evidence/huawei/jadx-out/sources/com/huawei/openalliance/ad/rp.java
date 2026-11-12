package com.huawei.openalliance.ad;

import com.huawei.openalliance.ad.beans.vast.LinearCreative;
import com.huawei.openalliance.ad.constant.VastAttribute;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: loaded from: classes12.dex */
public class rp extends rm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Set<String> f20212a = new HashSet(Arrays.asList(VastAttribute.CREATIVE_VIEW, "start", "firstQuartile", "midpoint", "thirdQuartile", "complete", "mute", "unmute", "pause", "resume", VastAttribute.CLOSE_LINEAR, "skip", "progress"));

    @Override // com.huawei.openalliance.ad.rm
    protected void a(LinearCreative linearCreative, XmlPullParser xmlPullParser, Map<String, rt.a> map) {
    }

    @Override // com.huawei.openalliance.ad.rm
    protected Set<String> a() {
        return this.f20212a;
    }
}
