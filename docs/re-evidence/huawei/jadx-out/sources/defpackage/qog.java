package defpackage;

import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.ui.commonui.linechart.view.datarender.HwHealthRenderMode;

/* JADX INFO: loaded from: classes16.dex */
public class qog implements HwHealthRenderMode.NodeStyle {
    private float d;
    private float e;

    public qog(float f) {
        this.d = f;
        this.e = f - qrs.d(BaseApplication.getContext(), 2.0f);
    }

    @Override // com.huawei.ui.commonui.linechart.view.datarender.HwHealthRenderMode.NodeStyle
    public float getOuterRadius() {
        return this.d;
    }

    @Override // com.huawei.ui.commonui.linechart.view.datarender.HwHealthRenderMode.NodeStyle
    public float getInnerRadius() {
        return this.e;
    }
}
