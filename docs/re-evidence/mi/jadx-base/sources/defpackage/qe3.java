package defpackage;

import android.hardware.camera2.CaptureRequest;
import androidx.annotation.RequiresApi;
import androidx.camera.core.impl.Config;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class qe3<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public zj8<T> f31429a;

    public qe3(zj8<T> zj8Var) {
        this.f31429a = zj8Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <ValueT> qe3<T> a(CaptureRequest.Key<ValueT> key, ValueT valuet) {
        this.f31429a.a().o(pe3.K(key), Config.OptionPriority.ALWAYS_OVERRIDE, valuet);
        return this;
    }
}
