package androidx.camera.core.impl;

import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public interface f {

    public static final class a implements f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final e f1734a = new e.a().h();

        @Override // androidx.camera.core.impl.f
        public e a() {
            return this.f1734a;
        }

        @Override // androidx.camera.core.impl.f
        public int getId() {
            return 0;
        }
    }

    e a();

    int getId();
}
