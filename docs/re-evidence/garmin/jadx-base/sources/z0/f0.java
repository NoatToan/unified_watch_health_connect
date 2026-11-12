package z0;

import android.util.Size;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public interface f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f200624a = new a();

    public class a implements f0 {
        @Override // z0.f0
        public final Set<b0.b0> a() {
            return new HashSet();
        }

        @Override // z0.f0
        public final ArrayList d(b0.b0 b0Var) {
            return new ArrayList();
        }
    }

    Set<b0.b0> a();

    default b1.i b(Size size, b0.b0 b0Var) {
        return null;
    }

    default b1.i c(u uVar, b0.b0 b0Var) {
        return null;
    }

    ArrayList d(b0.b0 b0Var);
}
