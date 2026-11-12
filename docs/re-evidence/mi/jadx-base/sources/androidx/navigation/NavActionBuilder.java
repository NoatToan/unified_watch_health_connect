package androidx.navigation;

import android.os.Bundle;
import androidx.core.os.BundleKt;
import com.xiaomi.onetrack.OneTrack;
import defpackage.cig;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.collections.MapsKt___MapsKt;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ&\u0010\u0007\u001a\u00020\u00042\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0002\b\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\f\u001a\u00020\tH\u0000¢\u0006\u0004\b\n\u0010\u000bR\"\u0010\u000e\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R%\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00148\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u001b¨\u0006\u001e"}, d2 = {"Landroidx/navigation/NavActionBuilder;", "", "Lkotlin/Function1;", "Landroidx/navigation/NavOptionsBuilder;", "", "Lkotlin/ExtensionFunctionType;", "optionsBuilder", "navOptions", "(Lkotlin/jvm/functions/Function1;)V", "Lcig;", "build$navigation_common_ktx_release", "()Lcig;", OneTrack.Param.BUILD, "", "destinationId", "I", "getDestinationId", "()I", "setDestinationId", "(I)V", "", "", "defaultArguments", "Ljava/util/Map;", "getDefaultArguments", "()Ljava/util/Map;", "Landroidx/navigation/h;", "Landroidx/navigation/h;", "<init>", "()V", "navigation-common-ktx_release"}, k = 1, mv = {1, 4, 0})
public final class NavActionBuilder {

    @NotNull
    private final Map<String, Object> defaultArguments = new LinkedHashMap();
    private int destinationId;
    private h navOptions;

    @NotNull
    public final cig build$navigation_common_ktx_release() {
        Bundle bundleBundleOf;
        int i = this.destinationId;
        h hVar = this.navOptions;
        if (this.defaultArguments.isEmpty()) {
            bundleBundleOf = null;
        } else {
            Object[] array = MapsKt___MapsKt.toList(this.defaultArguments).toArray(new Pair[0]);
            if (array == null) {
                throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
            }
            Pair[] pairArr = (Pair[]) array;
            bundleBundleOf = BundleKt.bundleOf((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
        }
        return new cig(i, hVar, bundleBundleOf);
    }

    @NotNull
    public final Map<String, Object> getDefaultArguments() {
        return this.defaultArguments;
    }

    public final int getDestinationId() {
        return this.destinationId;
    }

    public final void navOptions(@NotNull Function1<? super NavOptionsBuilder, Unit> optionsBuilder) {
        NavOptionsBuilder navOptionsBuilder = new NavOptionsBuilder();
        optionsBuilder.invoke2(navOptionsBuilder);
        this.navOptions = navOptionsBuilder.build$navigation_common_ktx_release();
    }

    public final void setDestinationId(int i) {
        this.destinationId = i;
    }
}
