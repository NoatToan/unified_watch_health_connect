package wa;

import androidx.media3.common.e0;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class h extends b {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f183744g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f183745h;

    public h(e0 e0Var, int i14, int i15, int i16, Object obj) {
        super(e0Var, new int[]{i14}, i15);
        this.f183744g = i16;
        this.f183745h = obj;
    }

    @Override // wa.g
    public final void b(long j8, long j14, long j15, List<? extends ua.d> list, ua.e[] eVarArr) {
    }

    @Override // wa.g
    public final int getSelectedIndex() {
        return 0;
    }

    @Override // wa.g
    public final Object getSelectionData() {
        return this.f183745h;
    }

    @Override // wa.g
    public final int getSelectionReason() {
        return this.f183744g;
    }

    public h(e0 e0Var, int i14, int i15) {
        this(e0Var, i14, i15, 0, null);
    }

    public h(e0 e0Var, int i14) {
        this(e0Var, i14, 0);
    }
}
