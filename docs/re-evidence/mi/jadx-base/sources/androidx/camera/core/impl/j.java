package androidx.camera.core.impl;

import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public interface j extends p {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Config.a<Integer> f1737k = Config.a.a("camerax.core.imageInput.inputFormat", Integer.TYPE);

    default int m() {
        return ((Integer) a(f1737k)).intValue();
    }
}
