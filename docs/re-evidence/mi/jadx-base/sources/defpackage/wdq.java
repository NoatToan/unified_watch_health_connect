package defpackage;

import androidx.annotation.RequiresApi;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.p;
import androidx.camera.core.s;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public interface wdq extends p {
    public static final Config.a<s.b> e = Config.a.a("camerax.core.useCaseEventCallback", s.b.class);

    default s.b H(s.b bVar) {
        return (s.b) d(e, bVar);
    }
}
