package com.xiaomi.yrn.channel.debugui;

import com.xiaomi.yrn.env.entity.YRNBundleInfo;
import defpackage.gur;
import defpackage.k1d;
import defpackage.nxr;
import defpackage.tur;
import defpackage.vwr;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
public class YRNDetailInfoActivity extends YRNBaseInfoActivity {
    @Override // com.xiaomi.yrn.channel.debugui.YRNBaseInfoActivity
    public void a() {
        this.f14491a.setText("YRN SDK 详细信息");
        this.d.clear();
        ConcurrentHashMap<String, gur> concurrentHashMapE = vwr.g().e();
        if (concurrentHashMapE != null) {
            for (Map.Entry<String, gur> entry : concurrentHashMapE.entrySet()) {
                if (entry != null) {
                    String key = entry.getKey();
                    gur value = entry.getValue();
                    this.d.add(new YRNBaseInfoActivity.b("appName:", key));
                    this.d.add(new YRNBaseInfoActivity.b("rnEngineVersion:", value != null ? value.r() : ""));
                    this.d.add(new YRNBaseInfoActivity.b("maxNativeApiLevel:", value != null ? String.valueOf(value.q()) : ""));
                    this.d.add(new YRNBaseInfoActivity.b("devMode:", value != null ? String.valueOf(vwr.g().k()) : ""));
                    this.d.add(new YRNBaseInfoActivity.b("envType:", value != null ? vwr.g().f(key) : ""));
                    this.d.add(new YRNBaseInfoActivity.b("RNInfo:", value != null ? b(value) : ""));
                    for (Map.Entry<String, YRNBundleInfo> entry2 : tur.a().b(key).entrySet()) {
                        if (entry2 != null) {
                            this.d.add(new YRNBaseInfoActivity.b(entry2.getKey(), String.valueOf(entry2.getValue())));
                        }
                    }
                }
            }
        }
        this.c.notifyDataSetChanged();
    }

    public final String b(gur gurVar) {
        k1d k1dVarP;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (gurVar != null && (k1dVarP = gurVar.p()) != null) {
            linkedHashMap.put("enableRN", Boolean.valueOf(k1dVarP.isEnableRN()));
            linkedHashMap.put("preLoadBundle", nxr.f(k1dVarP.getPreLoadBundle()));
            linkedHashMap.put("assetsBuiltinBundleJsonPath", k1dVarP.getAssetsBuiltInBundleJsonPath());
            linkedHashMap.put("commonModuleName", k1dVarP.getCommonModuleName());
            linkedHashMap.put("jsMainModulePath", k1dVarP.getJSMainModulePath());
            linkedHashMap.put("isSingleFullBundle", Boolean.valueOf(k1dVarP.isSingleFullBundle()));
        }
        return nxr.f(linkedHashMap);
    }
}
