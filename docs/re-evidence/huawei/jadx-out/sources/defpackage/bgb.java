package defpackage;

import com.huawei.animationkit.computationalwallpaper.generator.ResolverResult;
import com.huawei.animationkit.computationalwallpaper.template.TemplateSelector;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes23.dex */
public class bgb implements TemplateSelector {
    @Override // com.huawei.animationkit.computationalwallpaper.template.TemplateSelector
    public List<bfz.d> selectTemplate(ResolverResult resolverResult) throws bdo {
        List<bfz.d> listD = d(resolverResult.getAiResult().c().get(0).d(), 6);
        if (listD.size() < 6) {
            listD.addAll(d("Other", 6 - listD.size()));
        }
        return listD;
    }

    private List<bfz.d> d(String str, int i) throws bdo {
        List<bfz.d> listA = bfz.c().a(str);
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < listA.size(); i2++) {
            arrayList.add(Integer.valueOf(i2));
        }
        Collections.shuffle(arrayList);
        ArrayList arrayList2 = new ArrayList();
        for (int i3 = 0; i3 < i && i3 < arrayList.size(); i3++) {
            arrayList2.add(listA.get(((Integer) arrayList.get(i3)).intValue()));
        }
        return arrayList2;
    }
}
