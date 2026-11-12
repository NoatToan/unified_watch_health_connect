package defpackage;

import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.ui.commonui.linechart.view.datarender.HwHealthRenderMode;

/* JADX INFO: loaded from: classes16.dex */
public class qoe implements HwHealthRenderMode.NodeStyle {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f46556a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f46557b;

    public qoe(float f) {
        this.f46557b = f;
        this.f46556a = f - qrs.d(BaseApplication.getContext(), 2.0f);
    }

    @Override // com.huawei.ui.commonui.linechart.view.datarender.HwHealthRenderMode.NodeStyle
    public float getOuterRadius() {
        return this.f46557b;
    }

    @Override // com.huawei.ui.commonui.linechart.view.datarender.HwHealthRenderMode.NodeStyle
    public float getInnerRadius() {
        return this.f46556a;
    }
}
