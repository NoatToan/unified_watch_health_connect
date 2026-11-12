package com.xiaomi.yrn.channel.debugui;

import com.xiaomi.yrn.env.entity.YRNBundleInfo;
import defpackage.gur;
import defpackage.tur;
import defpackage.vwr;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
public class YRNSimpleInfoActivity extends YRNBaseInfoActivity {
    @Override // com.xiaomi.yrn.channel.debugui.YRNBaseInfoActivity
    public void a() {
        this.f14491a.setText("YRN SDK 简要信息");
        this.d.clear();
        ConcurrentHashMap<String, gur> concurrentHashMapE = vwr.g().e();
        if (concurrentHashMapE != null) {
            Iterator<Map.Entry<String, gur>> it = concurrentHashMapE.entrySet().iterator();
            while (it.hasNext()) {
                String key = it.next().getKey();
                HashMap<String, YRNBundleInfo> mapB = tur.a().b(key);
                if (mapB != null && mapB.size() > 0) {
                    this.d.add(new YRNBaseInfoActivity.b("appName:", key));
                    for (Map.Entry<String, YRNBundleInfo> entry : mapB.entrySet()) {
                        YRNBundleInfo value = entry.getValue();
                        if (value != null) {
                            String maketime = value.getMaketime();
                            List<YRNBaseInfoActivity.b> list = this.d;
                            String str = entry.getKey() + ":";
                            StringBuilder sb = new StringBuilder();
                            sb.append(maketime);
                            sb.append("   ");
                            sb.append(value.isResidentMemory() ? "常驻" : "非常驻");
                            list.add(new YRNBaseInfoActivity.b(str, sb.toString()));
                        }
                    }
                }
            }
        }
        this.c.notifyDataSetChanged();
    }
}
