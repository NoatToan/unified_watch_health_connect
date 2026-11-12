package defpackage;

import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@ApiStatus.Internal
public final class sqh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public lpf f33886a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public m05 f33887b = null;

    public void a(@Nullable m05 m05Var) {
        if (m05Var != null) {
            this.f33887b = m05Var;
        }
    }

    public void b(@Nullable lpf lpfVar) {
        if (lpfVar != null) {
            this.f33886a = lpfVar;
        }
    }

    @Nullable
    public m05 c() {
        return this.f33887b;
    }

    @Nullable
    public lpf d() {
        return this.f33886a;
    }
}
