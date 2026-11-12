package defpackage;

import com.github.mikephil.charting.utils.Utils;
import com.huawei.ui.commonui.linechart.view.datarender.HwHealthRenderMode;

/* JADX INFO: loaded from: classes16.dex */
public class qoj implements HwHealthRenderMode.NodeStyle {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f46560b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f46561c;

    public qoj() {
        this(5.0f, 3.0f);
    }

    public qoj(float f, float f2) {
        this.f46561c = Utils.convertDpToPixel(f);
        this.f46560b = Utils.convertDpToPixel(f2);
    }

    @Override // com.huawei.ui.commonui.linechart.view.datarender.HwHealthRenderMode.NodeStyle
    public float getOuterRadius() {
        return this.f46561c;
    }

    @Override // com.huawei.ui.commonui.linechart.view.datarender.HwHealthRenderMode.NodeStyle
    public float getInnerRadius() {
        return this.f46560b;
    }
}
