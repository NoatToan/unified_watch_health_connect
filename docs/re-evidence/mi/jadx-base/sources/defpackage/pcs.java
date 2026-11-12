package defpackage;

import com.google.android.play.core.assetpacks.AssetPackState;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class pcs extends vk1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f30271a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f30272b;

    public pcs(long j, Map map) {
        this.f30271a = j;
        this.f30272b = map;
    }

    @Override // defpackage.vk1
    public final Map<String, AssetPackState> c() {
        return this.f30272b;
    }

    @Override // defpackage.vk1
    public final long d() {
        return this.f30271a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof vk1) {
            vk1 vk1Var = (vk1) obj;
            if (this.f30271a == vk1Var.d() && this.f30272b.equals(vk1Var.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f30271a;
        return ((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.f30272b.hashCode();
    }

    public final String toString() {
        return "AssetPackStates{totalBytes=" + this.f30271a + ", packStates=" + this.f30272b.toString() + "}";
    }
}
