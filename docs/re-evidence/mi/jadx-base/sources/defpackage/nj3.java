package defpackage;

import androidx.annotation.RequiresApi;
import androidx.camera.core.impl.f;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class nj3 {

    public static final class a implements mj3 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<f> f27972a;

        public a(List<f> list) {
            if (list == null || list.isEmpty()) {
                throw new IllegalArgumentException("Cannot set an empty CaptureStage list.");
            }
            this.f27972a = Collections.unmodifiableList(new ArrayList(list));
        }

        @Override // defpackage.mj3
        public List<f> a() {
            return this.f27972a;
        }
    }

    public static mj3 a(List<f> list) {
        return new a(list);
    }

    public static mj3 b(f... fVarArr) {
        return new a(Arrays.asList(fVarArr));
    }

    public static mj3 c() {
        return b(new f.a());
    }
}
