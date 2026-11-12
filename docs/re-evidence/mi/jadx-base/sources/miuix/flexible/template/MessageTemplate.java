package miuix.flexible.template;

import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import defpackage.bwi;
import defpackage.wsi;

/* JADX INFO: loaded from: classes3.dex */
public class MessageTemplate extends AbstractAreaMappingTemplate {
    @Override // miuix.flexible.template.AbstractAreaMappingTemplate
    public int getTemplateResId() {
        return getLevel() != 1 ? bwi.f4673a : bwi.f4674b;
    }

    @Override // miuix.flexible.template.AbstractAreaMappingTemplate, miuix.flexible.template.IHyperCellTemplate
    public void onFinishInflate(ViewGroup viewGroup) {
        super.onFinishInflate(viewGroup);
    }

    @Override // miuix.flexible.template.AbstractAreaMappingTemplate
    public void onFinishLayoutMapping(ViewGroup viewGroup) {
        super.onFinishLayoutMapping(viewGroup);
        ((ConstraintLayout.LayoutParams) viewGroup.findViewById(wsi.l).getLayoutParams()).setMarginStart(20);
    }
}
