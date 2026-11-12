package defpackage;

import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.utils.Utils;

/* JADX INFO: loaded from: classes16.dex */
public class qmn extends XAxis {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f46490b = false;

    public qmn() {
        this.mYOffset = Utils.convertDpToPixel(0.0f);
    }

    public void b(boolean z) {
        this.f46490b = z;
    }

    public boolean d() {
        return this.f46490b;
    }
}
