package defpackage;

import com.huawei.ui.commonui.linechart.view.datarender.HwHealthRenderMode;

/* JADX INFO: loaded from: classes16.dex */
public class qof implements HwHealthRenderMode.NodeStyle {
    private float d;

    public qof(float f) {
        this.d = f;
    }

    @Override // com.huawei.ui.commonui.linechart.view.datarender.HwHealthRenderMode.NodeStyle
    public float getOuterRadius() {
        return this.d;
    }

    @Override // com.huawei.ui.commonui.linechart.view.datarender.HwHealthRenderMode.NodeStyle
    public float getInnerRadius() {
        return this.d;
    }
}
