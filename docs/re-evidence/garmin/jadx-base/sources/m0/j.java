package m0;

import android.util.Range;
import androidx.camera.core.impl.e0;
import androidx.camera.core.impl.k0;
import java.util.ArrayList;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
public interface j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f115504a;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"m0/j$a", "Lm0/j;", "camera-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a implements j {
        @Override // m0.j
        public final i a(int i14, k0 k0Var, ArrayList arrayList, ArrayList arrayList2, e0 e0Var, Range range, boolean z14) {
            k0Var.getClass();
            e0Var.getClass();
            range.getClass();
            return new i(null, 0, 3, null);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0001¨\u0006\u0007"}, d2 = {"Lm0/j$b;", "", "<init>", "()V", "Lm0/j;", "NO_OP_STREAM_SPECS_CALCULATOR", "Lm0/j;", "camera-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int f115505a = 0;

        static {
            new b();
        }

        private b() {
        }
    }

    static {
        int i14 = b.f115505a;
        f115504a = new a();
    }

    i a(int i14, k0 k0Var, ArrayList arrayList, ArrayList arrayList2, e0 e0Var, Range range, boolean z14);
}
