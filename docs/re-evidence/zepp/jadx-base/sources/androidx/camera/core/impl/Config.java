package androidx.camera.core.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.auto.value.AutoValue;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public interface Config {

    @AutoValue
    public static abstract class Option<T> {
        @NonNull
        public static <T> Option<T> create(@NonNull String id, @NonNull Class<?> valueClass) {
            return create(id, valueClass, null);
        }

        @NonNull
        public abstract String getId();

        @Nullable
        public abstract Object getToken();

        @NonNull
        public abstract Class<T> getValueClass();

        @NonNull
        public static <T> Option<T> create(@NonNull String id, @NonNull Class<?> valueClass, @Nullable Object token) {
            return new AutoValue_Config_Option(id, valueClass, token);
        }
    }

    public interface OptionMatcher {
        boolean onOptionMatched(@NonNull Option<?> option);
    }

    public enum OptionPriority {
        ALWAYS_OVERRIDE,
        REQUIRED,
        OPTIONAL
    }

    boolean containsOption(@NonNull Option<?> id);

    void findOptions(@NonNull String idSearchString, @NonNull OptionMatcher matcher);

    @NonNull
    OptionPriority getOptionPriority(@NonNull Option<?> opt);

    @NonNull
    Set<OptionPriority> getPriorities(@NonNull Option<?> option);

    @NonNull
    Set<Option<?>> listOptions();

    @Nullable
    <ValueT> ValueT retrieveOption(@NonNull Option<ValueT> id);

    @Nullable
    <ValueT> ValueT retrieveOption(@NonNull Option<ValueT> id, @Nullable ValueT valueIfMissing);

    @Nullable
    <ValueT> ValueT retrieveOptionWithPriority(@NonNull Option<ValueT> id, @NonNull OptionPriority priority);
}
