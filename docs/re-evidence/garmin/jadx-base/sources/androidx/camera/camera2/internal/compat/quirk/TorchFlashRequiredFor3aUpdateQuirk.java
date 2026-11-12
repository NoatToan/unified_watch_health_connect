package androidx.camera.camera2.internal.compat.quirk;

import androidx.camera.camera2.internal.compat.h;
import androidx.camera.core.impl.e2;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class TorchFlashRequiredFor3aUpdateQuirk implements e2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final List<String> f5404b = Arrays.asList("PIXEL 6A", "PIXEL 6 PRO", "PIXEL 7", "PIXEL 7A", "PIXEL 7 PRO", "PIXEL 8", "PIXEL 8 PRO");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f5405a;

    public TorchFlashRequiredFor3aUpdateQuirk(h hVar) {
        this.f5405a = hVar;
    }
}
