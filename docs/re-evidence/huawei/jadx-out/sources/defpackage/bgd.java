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
public class bgd implements TemplateSelector {
    private final Map<String, a> e;

    public bgd() {
        HashMap map = new HashMap();
        this.e = map;
        map.put("Color", new a("Color", 6, "Other", 3));
        map.put("Character", new a("Character", 6, "Other", 3));
        map.put("Beeline", new a("Beeline", 6, "Plaid", 3));
    }

    @Override // com.huawei.animationkit.computationalwallpaper.template.TemplateSelector
    public List<bfz.d> selectTemplate(ResolverResult resolverResult) throws bdo {
        String strD = resolverResult.getAiResult().c().get(0).d();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (this.e.containsKey(strD)) {
            a aVar = this.e.get(strD);
            linkedHashSet.addAll(d(aVar.e, aVar.d));
            linkedHashSet.addAll(d(aVar.f1084c, aVar.f1083a));
        } else {
            linkedHashSet.addAll(d(strD, 9));
        }
        if (linkedHashSet.size() < 9) {
            linkedHashSet.addAll(d("Other", 9));
        }
        return new ArrayList(linkedHashSet).subList(0, Math.min(9, linkedHashSet.size()));
    }

    private List<bfz.d> d(String str, int i) throws bdo {
        ArrayList arrayList = new ArrayList(bfz.c().a(str));
        Collections.shuffle(arrayList);
        return arrayList.subList(0, Math.min(i, arrayList.size()));
    }

    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f1083a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f1084c;
        private final int d;
        private final String e;

        private a(String str, int i, String str2, int i2) {
            this.e = str;
            this.f1084c = str2;
            this.d = i;
            this.f1083a = i2;
        }
    }
}
