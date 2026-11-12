package defpackage;

import com.huawei.animationkit.computationalwallpaper.coloranalysis.ColorResult;
import java.util.function.Function;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class bee implements Function {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ColorResult f1053b;

    public /* synthetic */ bee(ColorResult colorResult) {
        this.f1053b = colorResult;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        return this.f1053b.formatColor((bdu) obj);
    }
}
