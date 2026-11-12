package h8;

import android.graphics.Path;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\b \u0018\u00002\u00020\u0001:\u0001\nB#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lh8/b;", "", "Landroid/graphics/Path;", "path", "Lh8/a;", "conicEvaluation", "", "tolerance", "<init>", "(Landroid/graphics/Path;Lh8/a;F)V", "a", "graphics-path_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class b {
    static {
        new a(null);
        System.loadLibrary("androidx.graphics.path");
    }

    public /* synthetic */ b(Path path, h8.a aVar, float f14, int i14, j jVar) {
        this(path, (i14 & 2) != 0 ? h8.a.AsQuadratics : aVar, (i14 & 4) != 0 ? 0.25f : f14);
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lh8/b$a;", "", "<init>", "()V", "graphics-path_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }

    public b(Path path, h8.a aVar, float f14) {
        path.getClass();
        aVar.getClass();
    }
}
