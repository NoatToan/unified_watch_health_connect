package androidx.navigation;

import com.xiaomi.onetrack.OneTrack;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\b\u0017\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B#\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0001\u0010\u0019\u001a\u00020\u0016\u0012\b\b\u0001\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ%\u0010\u0007\u001a\u00020\u0006\"\b\b\u0000\u0010\u0004*\u00020\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0014\u0010\t\u001a\u00020\u0006*\u00020\u0003H\u0086\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u000f\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0017\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001c"}, d2 = {"Landroidx/navigation/NavGraphBuilder;", "Landroidx/navigation/NavDestinationBuilder;", "Landroidx/navigation/e;", "Landroidx/navigation/d;", "D", "navDestination", "", "destination", "(Landroidx/navigation/NavDestinationBuilder;)V", "unaryPlus", "(Landroidx/navigation/d;)V", "addDestination", OneTrack.Param.BUILD, "()Landroidx/navigation/e;", "", "destinations", "Ljava/util/List;", "Landroidx/navigation/j;", "provider", "Landroidx/navigation/j;", "getProvider", "()Landroidx/navigation/j;", "", "startDestination", "I", "id", "<init>", "(Landroidx/navigation/j;II)V", "navigation-common-ktx_release"}, k = 1, mv = {1, 4, 0})
public class NavGraphBuilder extends NavDestinationBuilder<e> {
    private final List<d> destinations;

    @NotNull
    private final j provider;
    private int startDestination;

    /* JADX WARN: Illegal instructions before constructor call */
    public NavGraphBuilder(@NotNull j jVar, int i, int i2) {
        i iVarD = jVar.d(f.class);
        Intrinsics.checkExpressionValueIsNotNull(iVarD, "getNavigator(clazz.java)");
        super(iVarD, i);
        this.provider = jVar;
        this.startDestination = i2;
        this.destinations = new ArrayList();
    }

    public final void addDestination(@NotNull d destination) {
        this.destinations.add(destination);
    }

    public final <D extends d> void destination(@NotNull NavDestinationBuilder<? extends D> navDestination) {
        this.destinations.add(navDestination.build());
    }

    @NotNull
    public final j getProvider() {
        return this.provider;
    }

    public final void unaryPlus(@NotNull d dVar) {
        addDestination(dVar);
    }

    @Override // androidx.navigation.NavDestinationBuilder
    @NotNull
    public e build() {
        e eVar = (e) super.build();
        eVar.E(this.destinations);
        int i = this.startDestination;
        if (i == 0) {
            throw new IllegalStateException("You must set a startDestination");
        }
        eVar.P(i);
        return eVar;
    }
}
