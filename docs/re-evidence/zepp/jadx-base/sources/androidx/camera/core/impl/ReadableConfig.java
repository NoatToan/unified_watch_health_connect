package androidx.camera.core.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public interface ReadableConfig extends Config {
    @Override // androidx.camera.core.impl.Config
    boolean containsOption(@NonNull Config.Option<?> id);

    @Override // androidx.camera.core.impl.Config
    void findOptions(@NonNull String idSearchString, @NonNull Config.OptionMatcher matcher);

    @NonNull
    Config getConfig();

    @Override // androidx.camera.core.impl.Config
    @NonNull
    Config.OptionPriority getOptionPriority(@NonNull Config.Option<?> opt);

    @Override // androidx.camera.core.impl.Config
    @NonNull
    Set<Config.OptionPriority> getPriorities(@NonNull Config.Option<?> option);

    @Override // androidx.camera.core.impl.Config
    @NonNull
    Set<Config.Option<?>> listOptions();

    @Override // androidx.camera.core.impl.Config
    @Nullable
    <ValueT> ValueT retrieveOption(@NonNull Config.Option<ValueT> id);

    @Override // androidx.camera.core.impl.Config
    @Nullable
    <ValueT> ValueT retrieveOption(@NonNull Config.Option<ValueT> id, @Nullable ValueT valueIfMissing);

    @Override // androidx.camera.core.impl.Config
    @Nullable
    <ValueT> ValueT retrieveOptionWithPriority(@NonNull Config.Option<ValueT> id, @NonNull Config.OptionPriority priority);
}
