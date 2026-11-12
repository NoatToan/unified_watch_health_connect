package defpackage;

import com.huawei.health.marketing.views.IViewVisibilityChange;

/* JADX INFO: loaded from: classes9.dex */
public class hqr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private IViewVisibilityChange f37064a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f37065b;

    public boolean d() {
        return this.f37065b;
    }

    public void e(boolean z) {
        this.f37065b = z;
        IViewVisibilityChange iViewVisibilityChange = this.f37064a;
        if (iViewVisibilityChange != null) {
            iViewVisibilityChange.onVisibilityChange(z);
        }
    }

    public void b(IViewVisibilityChange iViewVisibilityChange) {
        this.f37064a = iViewVisibilityChange;
    }
}
