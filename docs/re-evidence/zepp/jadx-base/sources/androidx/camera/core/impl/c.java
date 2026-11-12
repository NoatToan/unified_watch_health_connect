package androidx.camera.core.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c {
    public static boolean a(@NonNull Config.OptionPriority priority1, @NonNull Config.OptionPriority priority2) {
        Config.OptionPriority optionPriority = Config.OptionPriority.ALWAYS_OVERRIDE;
        if (priority1 == optionPriority && priority2 == optionPriority) {
            return true;
        }
        Config.OptionPriority optionPriority2 = Config.OptionPriority.REQUIRED;
        return priority1 == optionPriority2 && priority2 == optionPriority2;
    }

    @NonNull
    public static Config b(@Nullable Config extendedConfig, @Nullable Config baseConfig) {
        if (extendedConfig == null && baseConfig == null) {
            return OptionsBundle.emptyBundle();
        }
        MutableOptionsBundle mutableOptionsBundleFrom = baseConfig != null ? MutableOptionsBundle.from(baseConfig) : MutableOptionsBundle.create();
        if (extendedConfig != null) {
            for (Config.Option<?> option : extendedConfig.listOptions()) {
                mutableOptionsBundleFrom.insertOption(option, extendedConfig.getOptionPriority(option), extendedConfig.retrieveOption(option));
            }
        }
        return OptionsBundle.from(mutableOptionsBundleFrom);
    }
}
