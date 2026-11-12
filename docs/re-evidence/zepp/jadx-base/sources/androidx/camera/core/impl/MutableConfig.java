package androidx.camera.core.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
public interface MutableConfig extends Config {
    <ValueT> void insertOption(@NonNull Config.Option<ValueT> opt, @NonNull Config.OptionPriority priority, @Nullable ValueT value);

    <ValueT> void insertOption(@NonNull Config.Option<ValueT> opt, @Nullable ValueT value);

    @Nullable
    <ValueT> ValueT removeOption(@NonNull Config.Option<ValueT> opt);
}
