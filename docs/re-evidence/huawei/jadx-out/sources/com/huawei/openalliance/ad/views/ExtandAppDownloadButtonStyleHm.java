package com.huawei.openalliance.ad.views;

import android.content.Context;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import com.huawei.openalliance.ad.R;
import com.huawei.openalliance.ad.hw;
import com.huawei.openalliance.ad.utils.as;
import com.huawei.openalliance.ad.utils.dr;

/* JADX INFO: loaded from: classes12.dex */
public class ExtandAppDownloadButtonStyleHm extends AppDownloadButtonStyle {
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public ExtandAppDownloadButtonStyleHm(Context context) {
        AppDownloadButtonStyle.Style style;
        Drawable drawableB;
        super(context);
        boolean zN = as.n(context);
        this.normalStyle.setBackground(context.getResources().getDrawable(zN ? R.drawable.hiad_extand_landing_app_down_btn_normal_hm_elderly : R.drawable.hiad_extand_landing_app_down_btn_normal_hm));
        this.normalStyle.setTextColor(context.getResources().getColor(R.color.hiad_down_btn_white));
        LayerDrawable layerDrawable = (LayerDrawable) dr.b(context, zN ? R.drawable.hiad_extand_app_down_btn_processing_hm_elderly : R.drawable.hiad_extand_app_down_btn_processing_hm);
        Drawable drawableFindDrawableByLayerId = layerDrawable.findDrawableByLayerId(android.R.id.progress);
        if (drawableFindDrawableByLayerId instanceof ClipDrawable) {
            PPSHwRoundRectEclipseClipDrawable pPSHwRoundRectEclipseClipDrawable = new PPSHwRoundRectEclipseClipDrawable(drawableFindDrawableByLayerId, 17, 1);
            layerDrawable.mutate();
            layerDrawable.setDrawableByLayerId(android.R.id.progress, pPSHwRoundRectEclipseClipDrawable);
            drawableB = layerDrawable;
            style = this.processingStyle;
        } else {
            hw.c("ExtandAppDownloadButtonStyleHm", "not clipDrawable");
            int i = zN ? R.drawable.hiad_extand_app_down_btn_processing_elderly : R.drawable.hiad_extand_app_down_btn_processing;
            AppDownloadButtonStyle.Style style2 = this.processingStyle;
            drawableB = dr.b(context, i);
            style = style2;
        }
        style.setBackground(drawableB);
        this.processingStyle.setTextColor(context.getResources().getColor(R.color.hiad_emui_black));
        LayerDrawable layerDrawable2 = (LayerDrawable) dr.b(context, zN ? R.drawable.hiad_extand_app_down_btn_installing_hm_elderly : R.drawable.hiad_extand_app_down_btn_installing_hm);
        if (layerDrawable2.findDrawableByLayerId(android.R.id.progress) instanceof ClipDrawable) {
            PPSFlickerDrawable pPSFlickerDrawable = new PPSFlickerDrawable(as.a(context, zN ? 20 : 18));
            layerDrawable2.mutate();
            layerDrawable2.setDrawableByLayerId(android.R.id.progress, pPSFlickerDrawable);
            this.installingStyle.setBackground(layerDrawable2);
            pPSFlickerDrawable.a();
        } else {
            hw.c("ExtandAppDownloadButtonStyleHm", "not clipDrawable");
            this.installingStyle.setBackground(dr.b(context, zN ? R.drawable.hiad_extand_app_down_btn_installing_elderly : R.drawable.hiad_extand_app_down_btn_installing));
        }
        this.installingStyle.setTextColor(context.getResources().getColor(R.color.hiad_down_btn_white));
        this.f20742a.setBackground(context.getResources().getDrawable(zN ? R.drawable.hiad_linked_app_down_btn_installing_elderly : R.drawable.hiad_linked_app_down_btn_installing));
        this.f20742a.setTextColor(context.getResources().getColor(R.color.hiad_emui_white));
    }
}
