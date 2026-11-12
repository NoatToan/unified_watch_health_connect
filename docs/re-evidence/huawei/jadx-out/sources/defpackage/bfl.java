package defpackage;

import com.huawei.animationkit.computationalwallpaper.pattern.UpdateListener;
import java.util.function.Consumer;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class bfl implements Consumer {
    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        ((UpdateListener) obj).onUpdate();
    }
}
