package defpackage;

import com.huawei.animationkit.computationalwallpaper.generator.ResolverResult;
import com.huawei.animationkit.computationalwallpaper.template.TemplateSelector;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes23.dex */
public class bfx implements TemplateSelector {
    private final Map<String, e> e;

    public bfx() {
        HashMap map = new HashMap();
        this.e = map;
        map.put("Color", new e("Color", 5, "Other", 3));
        map.put("Character", new e("Character", 5, "Other", 3));
        map.put("Beeline", new e("Beeline", 5, "Plaid", 3));
    }

    @Override // com.huawei.animationkit.computationalwallpaper.template.TemplateSelector
    public List<bfz.d> selectTemplate(ResolverResult resolverResult) throws bdo {
        String strD = resolverResult.getAiResult().c().get(0).d();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (this.e.containsKey(strD)) {
            e eVar = this.e.get(strD);
            linkedHashSet.addAll(d(eVar.d, eVar.f1072b));
            linkedHashSet.addAll(d(eVar.f1073c, eVar.e));
        } else {
            linkedHashSet.addAll(d(strD, 8));
        }
        if (linkedHashSet.size() < 8) {
            linkedHashSet.addAll(d("Other", 8));
        }
        return new ArrayList(linkedHashSet).subList(0, Math.min(8, linkedHashSet.size()));
    }

    private List<bfz.d> d(String str, int i) throws bdo {
        ArrayList arrayList = new ArrayList(bfz.c().a(str));
        Collections.shuffle(arrayList);
        return arrayList.subList(0, Math.min(i, arrayList.size()));
    }

    static class e {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f1072b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f1073c;
        private final String d;
        private final int e;

        private e(String str, int i, String str2, int i2) {
            this.d = str;
            this.f1073c = str2;
            this.f1072b = i;
            this.e = i2;
        }
    }
}
