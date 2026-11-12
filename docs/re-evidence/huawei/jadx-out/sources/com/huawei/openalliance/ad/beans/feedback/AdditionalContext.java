package com.huawei.openalliance.ad.beans.feedback;

import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.openalliance.ad.utils.bm;
import com.huawei.openalliance.ad.utils.dg;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class AdditionalContext {
    private String advertiseTitle = null;
    private String creativeId = "";
    private String slotId = "";
    private String landingPageUrl = null;
    private List<String> imageUrl = null;
    private List<String> videoUrl = null;
    private String advertiseId = null;
    private String advertiseURL = null;

    public String toString() {
        return this.advertiseId + Constants.LINK + this.advertiseTitle + Constants.LINK + this.creativeId + Constants.LINK + this.slotId + Constants.LINK + a() + b() + c() + d();
    }

    public void f(String str) {
        this.advertiseId = str;
    }

    public void e(String str) {
        this.advertiseURL = str;
    }

    public void d(String str) {
        this.landingPageUrl = str;
    }

    public void c(String str) {
        this.slotId = str;
    }

    public void b(List<String> list) {
        this.videoUrl = list;
    }

    public void b(String str) {
        this.creativeId = str;
    }

    public void a(List<String> list) {
        this.imageUrl = list;
    }

    public void a(String str) {
        this.advertiseTitle = str;
    }

    private String d() {
        if (!dg.d(this.advertiseURL)) {
            return "";
        }
        return "advertiseURL:-" + dg.h(this.advertiseURL);
    }

    private String c() {
        if (!dg.d(this.landingPageUrl)) {
            return "";
        }
        return "clickUrl:-" + dg.h(this.landingPageUrl);
    }

    private String b() {
        if (bm.a(this.videoUrl)) {
            return "";
        }
        StringBuilder sb = new StringBuilder("videoUrl:");
        for (String str : this.videoUrl) {
            sb.append(Constants.LINK);
            sb.append(dg.h(str));
        }
        return sb.toString();
    }

    private String a() {
        if (bm.a(this.imageUrl)) {
            return "";
        }
        StringBuilder sb = new StringBuilder("imageUrl");
        for (String str : this.imageUrl) {
            sb.append(Constants.LINK);
            sb.append(dg.h(str));
        }
        return sb.toString();
    }
}
