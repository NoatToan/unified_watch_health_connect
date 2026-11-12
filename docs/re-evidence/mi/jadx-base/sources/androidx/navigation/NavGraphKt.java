package androidx.navigation;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\u001a\u001e\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\b\u0001\u0010\u0002\u001a\u00020\u0001H\u0086\n¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001e\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\b\b\u0001\u0010\u0002\u001a\u00020\u0001H\u0086\u0002¢\u0006\u0004\b\u0007\u0010\b\u001a\u001c\u0010\u000b\u001a\u00020\n*\u00020\u00002\u0006\u0010\t\u001a\u00020\u0003H\u0086\n¢\u0006\u0004\b\u000b\u0010\f\u001a\u001c\u0010\u000b\u001a\u00020\n*\u00020\u00002\u0006\u0010\r\u001a\u00020\u0000H\u0086\n¢\u0006\u0004\b\u000b\u0010\u000e\u001a\u001c\u0010\u000f\u001a\u00020\n*\u00020\u00002\u0006\u0010\t\u001a\u00020\u0003H\u0086\n¢\u0006\u0004\b\u000f\u0010\f¨\u0006\u0010"}, d2 = {"Landroidx/navigation/e;", "", "id", "Landroidx/navigation/d;", "get", "(Landroidx/navigation/e;I)Landroidx/navigation/d;", "", "contains", "(Landroidx/navigation/e;I)Z", "node", "", "plusAssign", "(Landroidx/navigation/e;Landroidx/navigation/d;)V", "other", "(Landroidx/navigation/e;Landroidx/navigation/e;)V", "minusAssign", "navigation-common-ktx_release"}, k = 2, mv = {1, 4, 0})
public final class NavGraphKt {
    public static final boolean contains(@NotNull e eVar, int i) {
        return eVar.F(i) != null;
    }

    @NotNull
    public static final d get(@NotNull e eVar, int i) {
        d dVarF = eVar.F(i);
        if (dVarF != null) {
            return dVarF;
        }
        throw new IllegalArgumentException("No destination for " + i + " was found in " + eVar);
    }

    public static final void minusAssign(@NotNull e eVar, @NotNull d dVar) {
        eVar.L(dVar);
    }

    public static final void plusAssign(@NotNull e eVar, @NotNull d dVar) {
        eVar.C(dVar);
    }

    public static final void plusAssign(@NotNull e eVar, @NotNull e eVar2) {
        eVar.B(eVar2);
    }
}
