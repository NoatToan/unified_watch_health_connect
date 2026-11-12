package defpackage;

import com.huawei.animationkit.computationalwallpaper.generator.ResolverResult;
import com.huawei.animationkit.computationalwallpaper.template.TemplateSelector;
import java.util.List;

/* JADX INFO: loaded from: classes23.dex */
public class bga implements TemplateSelector {
    @Override // com.huawei.animationkit.computationalwallpaper.template.TemplateSelector
    public List<bfz.d> selectTemplate(ResolverResult resolverResult) throws bdo {
        return bfz.c().a(resolverResult.getAiResult().c().get(0).d());
    }
}
