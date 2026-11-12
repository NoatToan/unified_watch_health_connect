package defpackage;

import androidx.annotation.RequiresApi;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.c;
import androidx.camera.core.impl.n;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public class zf3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f41207a = new a();

    public static final class a implements c {
        public final g2d z = g2d.a(new Object());

        @Override // androidx.camera.core.impl.p
        public Config e() {
            return n.L();
        }

        @Override // androidx.camera.core.impl.c
        public g2d w() {
            return this.z;
        }
    }

    public static c a() {
        return f41207a;
    }
}
