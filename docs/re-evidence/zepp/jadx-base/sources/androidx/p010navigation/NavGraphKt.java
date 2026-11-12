package androidx.p010navigation;

import androidx.annotation.IdRes;
import kotlin.Metadata;
import org.cybergarage.upnp.std.av.server.object.SearchCriteria;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a\u0017\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\b\u0001\u0010\u0002\u001a\u00020\u0001H\u0086\n\u001a\u0017\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\b\b\u0001\u0010\u0002\u001a\u00020\u0001H\u0086\u0002\u001a\u0015\u0010\t\u001a\u00020\b*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0003H\u0086\n\u001a\u0015\u0010\t\u001a\u00020\b*\u00020\u00002\u0006\u0010\n\u001a\u00020\u0000H\u0086\n\u001a\u0015\u0010\u000b\u001a\u00020\b*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0003H\u0086\n¨\u0006\f"}, d2 = {"Landroidx/navigation/NavGraph;", "", "id", "Landroidx/navigation/NavDestination;", "get", "", SearchCriteria.CONTAINS, "node", "", "plusAssign", "other", "minusAssign", "navigation-common-ktx_release"}, k = 2, mv = {1, 4, 0})
public final class NavGraphKt {
    public static final boolean contains(@NotNull NavGraph navGraph, @IdRes int i) {
        return navGraph.findNode(i) != null;
    }

    @NotNull
    public static final NavDestination get(@NotNull NavGraph navGraph, @IdRes int i) {
        NavDestination navDestinationFindNode = navGraph.findNode(i);
        if (navDestinationFindNode != null) {
            return navDestinationFindNode;
        }
        throw new IllegalArgumentException("No destination for " + i + " was found in " + navGraph);
    }

    public static final void minusAssign(@NotNull NavGraph navGraph, @NotNull NavDestination navDestination) {
        navGraph.remove(navDestination);
    }

    public static final void plusAssign(@NotNull NavGraph navGraph, @NotNull NavDestination navDestination) {
        navGraph.addDestination(navDestination);
    }

    public static final void plusAssign(@NotNull NavGraph navGraph, @NotNull NavGraph navGraph2) {
        navGraph.addAll(navGraph2);
    }
}
