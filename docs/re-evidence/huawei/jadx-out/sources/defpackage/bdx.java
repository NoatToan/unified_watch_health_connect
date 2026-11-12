package defpackage;

import android.graphics.Bitmap;
import com.huawei.animationkit.computationalwallpaper.coloranalysis.ColorResult;

/* JADX INFO: loaded from: classes23.dex */
public class bdx {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final bdw f1051b = new bdw();
    private final bed d;

    public bdx(bed bedVar) {
        this.d = bedVar;
    }

    public ColorResult e(Bitmap bitmap) {
        return this.d.a(this.f1051b.a(bitmap));
    }
}
