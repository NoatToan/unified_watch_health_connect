package androidx.camera.core.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e {
    public static boolean a(@NonNull ReadableConfig _this, Config.Option option) {
        return _this.getConfig().containsOption(option);
    }

    public static void b(@NonNull ReadableConfig _this, @NonNull String str, Config.OptionMatcher optionMatcher) {
        _this.getConfig().findOptions(str, optionMatcher);
    }

    @NonNull
    public static Config.OptionPriority c(@NonNull ReadableConfig _this, Config.Option option) {
        return _this.getConfig().getOptionPriority(option);
    }

    @NonNull
    public static Set d(@NonNull ReadableConfig _this, Config.Option option) {
        return _this.getConfig().getPriorities(option);
    }

    @NonNull
    public static Set e(ReadableConfig _this) {
        return _this.getConfig().listOptions();
    }

    @Nullable
    public static Object f(@NonNull ReadableConfig _this, Config.Option option) {
        return _this.getConfig().retrieveOption(option);
    }

    @Nullable
    public static Object g(@NonNull ReadableConfig _this, @Nullable Config.Option option, Object obj) {
        return _this.getConfig().retrieveOption(option, obj);
    }

    @Nullable
    public static Object h(@NonNull ReadableConfig _this, @NonNull Config.Option option, Config.OptionPriority optionPriority) {
        return _this.getConfig().retrieveOptionWithPriority(option, optionPriority);
    }
}
