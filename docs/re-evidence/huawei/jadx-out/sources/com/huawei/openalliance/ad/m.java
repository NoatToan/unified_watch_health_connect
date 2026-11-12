package com.huawei.openalliance.ad;

import android.text.TextUtils;
import com.huawei.openalliance.ad.constant.Constants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes12.dex */
public class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static m f19513a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final byte[] f19514b = new byte[0];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map<String, g> f19515c = new HashMap();
    private final Map<String, Class<? extends g>> d;
    private final List<String> e;

    public g a(String str) throws IllegalAccessException, InstantiationException {
        StringBuilder sb;
        String string;
        if (!TextUtils.isEmpty(str)) {
            g gVarNewInstance = this.f19515c.get(str);
            if (gVarNewInstance == null) {
                hw.a("JsbCmdManager", "create action %s", str);
                Class<? extends g> cls = this.d.get(str);
                if (cls == null) {
                    sb = new StringBuilder("no class found for cmd: ");
                } else {
                    try {
                        gVarNewInstance = cls.newInstance();
                    } catch (InstantiationException unused) {
                        hw.c("JsbCmdManager", "get cmd %s InstantiationException", str);
                    } catch (Throwable th) {
                        hw.c("JsbCmdManager", "get cmd %s: %s", str, th.getClass().getSimpleName());
                    }
                    if (gVarNewInstance == null) {
                        sb = new StringBuilder("no instance created for cmd: ");
                    } else {
                        this.f19515c.put(str, gVarNewInstance);
                    }
                }
                sb.append(str);
                string = sb.toString();
            }
            return gVarNewInstance;
        }
        string = "get cmd, method is empty";
        hw.c("JsbCmdManager", string);
        return null;
    }

    public static m a() {
        m mVar;
        synchronized (f19514b) {
            if (f19513a == null) {
                f19513a = new m();
            }
            mVar = f19513a;
        }
        return mVar;
    }

    private m() {
        HashMap map = new HashMap();
        this.d = map;
        ArrayList arrayList = new ArrayList();
        this.e = arrayList;
        map.put("pps.native.request", x.class);
        map.put("pps.reward.request", z.class);
        map.put("pps.interstitial.request", w.class);
        map.put("pps.placement.request", y.class);
        map.put("pps.action.click", h.class);
        map.put("pps.download.progress", ax.class);
        map.put("pps.download.status", ay.class);
        map.put("pps.download.reserveapp", az.class);
        map.put("pps.download.start", bb.class);
        map.put("pps.click.complianceele", k.class);
        map.put("pps.click.share", l.class);
        map.put("pps.download.resume", ba.class);
        map.put("pps.download.pause", aw.class);
        map.put("pps.download.cancel", aj.class);
        map.put("pps.listener.appstatus", ar.class);
        map.put("pps.listener.offDownloadChange", ak.class);
        map.put("pps.listener.browserappstatus", an.class);
        map.put("pps.listener.appprogress", aq.class);
        map.put("pps.listener.appopen", am.class);
        map.put("pps.listener.downloadcancel", ao.class);
        map.put("pps.activity.reward", ae.class);
        map.put("pps.activity.interstitial", ad.class);
        map.put("pps.advertiserinfo.show", ac.class);
        map.put("pps.feedback.click", o.class);
        map.put("pps.feedback.toggle", p.class);
        map.put("pps.common.report", bf.class);
        map.put("pps.common.analysis", n.class);
        map.put("pps.query.dsl", v.class);
        map.put("pps.listener.webopen", av.class);
        map.put("pps.listener.webclose", at.class);
        map.put("pps.listener.webloadfinish", au.class);
        map.put("pps.event.showstart", bn.class);
        map.put("pps.event.praise", bl.class);
        map.put("pps.event.show", bm.class);
        map.put("pps.event.click", bd.class);
        map.put("pps.event.close", be.class);
        map.put("pps.event.playtime", bk.class);
        map.put("pps.event.playstart", bj.class);
        map.put("pps.event.playpause", bh.class);
        map.put("pps.event.playresume", bi.class);
        map.put("pps.event.playend", bg.class);
        map.put("pps.settings", aa.class);
        map.put("pps.process.whythisad", t.class);
        map.put("pps.listener.appreservestatus", al.class);
        if (com.huawei.openalliance.ad.utils.cr.c(Constants.CONSENT_SDK)) {
            map.put("pps.consent.query", af.class);
            map.put("pps.set.consentstatus", ah.class);
            map.put("pps.set.consentpromise", ag.class);
        }
        map.put("pps.api.req.getbody", q.class);
        map.put("pps.api.parse.ad", s.class);
        map.put("pps.query.cfg", u.class);
        arrayList.add("pps.action.click");
        arrayList.add("pps.activity.reward");
        arrayList.add("pps.activity.interstitial");
    }
}
