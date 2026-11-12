package androidx.lifecycle;

import androidx.annotation.RestrictTo;
import androidx.health.connect.client.records.CervicalMucusRecord;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import defpackage.dvq;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0013\u0010\u000fJ\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\t\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0087\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000bH\u0007¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u0006¢\u0006\u0004\b\u000e\u0010\u000fR \u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Landroidx/lifecycle/ViewModelStore;", "", "", "key", "Ldvq;", "viewModel", "", LifecycleConstantKt.ACTION_PUT, "(Ljava/lang/String;Ldvq;)V", "get", "(Ljava/lang/String;)Ldvq;", "", "keys", "()Ljava/util/Set;", CervicalMucusRecord.Appearance.CLEAR, "()V", "", "map", "Ljava/util/Map;", "<init>", "lifecycle-viewmodel_release"}, k = 1, mv = {1, 8, 0})
public class ViewModelStore {

    @NotNull
    private final Map<String, dvq> map = new LinkedHashMap();

    public final void clear() {
        Iterator<dvq> it = this.map.values().iterator();
        while (it.hasNext()) {
            it.next().clear();
        }
        this.map.clear();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @Nullable
    public final dvq get(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.map.get(key);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @NotNull
    public final Set<String> keys() {
        return new HashSet(this.map.keySet());
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final void put(@NotNull String key, @NotNull dvq viewModel) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        dvq dvqVarPut = this.map.put(key, viewModel);
        if (dvqVarPut != null) {
            dvqVarPut.onCleared();
        }
    }
}
