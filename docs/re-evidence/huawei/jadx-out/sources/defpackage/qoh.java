package defpackage;

import com.huawei.ui.commonui.linechart.view.datarender.HwHealthRenderMode;

/* JADX INFO: loaded from: classes16.dex */
public class qoh implements HwHealthRenderMode.NodeStyle {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f46558c;
    private float d;

    public qoh(float f) {
        this.d = f;
        this.f46558c = f / 2.0f;
    }

    @Override // com.huawei.ui.commonui.linechart.view.datarender.HwHealthRenderMode.NodeStyle
    public float getOuterRadius() {
        return this.d;
    }

    @Override // com.huawei.ui.commonui.linechart.view.datarender.HwHealthRenderMode.NodeStyle
    public float getInnerRadius() {
        return this.f46558c;
    }
}
