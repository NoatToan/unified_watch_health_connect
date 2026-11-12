package defpackage;

import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.linechart.common.HwHealthBaseEntry;
import com.huawei.ui.commonui.linechart.view.HwHealthLineDataSet;
import com.huawei.ui.commonui.linechart.view.commonlinechart.IHealthMultiColorMode;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public class qny extends HwHealthLineDataSet {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f46540c;
    private int[] d;
    private float[] e;

    public qny(List<HwHealthBaseEntry> list, String str, String str2, String str3) {
        super(BaseApplication.getContext(), list, str, str2, str3);
        this.f46540c = false;
    }

    public void b(IHealthMultiColorMode iHealthMultiColorMode) {
        if (iHealthMultiColorMode == null || iHealthMultiColorMode.getDataColor().length != iHealthMultiColorMode.getThreshold().length + 1) {
            this.f46540c = false;
            LogUtil.d("HwHealthMultiColorDataSet", "muti color chart mode is invalid");
        } else {
            this.f46540c = true;
            this.e = iHealthMultiColorMode.getThreshold();
            this.d = iHealthMultiColorMode.getDataColor();
        }
    }

    public boolean o() {
        return this.f46540c;
    }

    public float[] k() {
        return this.e;
    }

    public int[] a() {
        return this.d;
    }
}
