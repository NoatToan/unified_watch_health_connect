package androidx.lifecycle.viewmodel;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\t\b&\u0018\u00002\u00020\u0001:\u0002\u000e\u000fB\t\b\u0000¢\u0006\u0004\b\f\u0010\rJ&\u0010\u0005\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H¦\u0002¢\u0006\u0004\b\u0005\u0010\u0006R,\u0010\b\u001a\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00078\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\u0010"}, d2 = {"Landroidx/lifecycle/viewmodel/CreationExtras;", "", "T", "Landroidx/lifecycle/viewmodel/CreationExtras$a;", "key", "get", "(Landroidx/lifecycle/viewmodel/CreationExtras$a;)Ljava/lang/Object;", "", "map", "Ljava/util/Map;", "getMap$lifecycle_viewmodel_release", "()Ljava/util/Map;", "<init>", "()V", "Empty", PluginDeviceInfo.FMODEL, "lifecycle-viewmodel_release"}, k = 1, mv = {1, 8, 0})
public abstract class CreationExtras {

    @NotNull
    private final Map<a<?>, Object> map = new LinkedHashMap();

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ&\u0010\u0005\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0096\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Landroidx/lifecycle/viewmodel/CreationExtras$Empty;", "Landroidx/lifecycle/viewmodel/CreationExtras;", "T", "Landroidx/lifecycle/viewmodel/CreationExtras$a;", "key", "get", "(Landroidx/lifecycle/viewmodel/CreationExtras$a;)Ljava/lang/Object;", "<init>", "()V", "lifecycle-viewmodel_release"}, k = 1, mv = {1, 8, 0})
    public static final class Empty extends CreationExtras {

        @NotNull
        public static final Empty INSTANCE = new Empty();

        private Empty() {
        }

        @Override // androidx.lifecycle.viewmodel.CreationExtras
        @Nullable
        public <T> T get(@NotNull a<T> key) {
            Intrinsics.checkNotNullParameter(key, "key");
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0003À\u0006\u0001"}, d2 = {"Landroidx/lifecycle/viewmodel/CreationExtras$a;", "T", "", "lifecycle-viewmodel_release"}, k = 1, mv = {1, 8, 0})
    public interface a<T> {
    }

    @Nullable
    public abstract <T> T get(@NotNull a<T> key);

    @NotNull
    public final Map<a<?>, Object> getMap$lifecycle_viewmodel_release() {
        return this.map;
    }
}
