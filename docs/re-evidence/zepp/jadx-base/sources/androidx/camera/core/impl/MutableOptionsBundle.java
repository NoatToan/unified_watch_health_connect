package androidx.camera.core.impl;

import android.util.ArrayMap;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
public final class MutableOptionsBundle extends OptionsBundle implements MutableConfig {

    @NonNull
    private static final Config.OptionPriority DEFAULT_PRIORITY = Config.OptionPriority.OPTIONAL;

    private MutableOptionsBundle(TreeMap<Config.Option<?>, Map<Config.OptionPriority, Object>> persistentOptions) {
        super(persistentOptions);
    }

    @NonNull
    public static MutableOptionsBundle create() {
        return new MutableOptionsBundle(new TreeMap(OptionsBundle.ID_COMPARE));
    }

    @NonNull
    public static MutableOptionsBundle from(@NonNull Config otherConfig) {
        TreeMap treeMap = new TreeMap(OptionsBundle.ID_COMPARE);
        for (Config.Option<?> option : otherConfig.listOptions()) {
            Set<Config.OptionPriority> priorities = otherConfig.getPriorities(option);
            ArrayMap arrayMap = new ArrayMap();
            for (Config.OptionPriority optionPriority : priorities) {
                arrayMap.put(optionPriority, otherConfig.retrieveOptionWithPriority(option, optionPriority));
            }
            treeMap.put(option, arrayMap);
        }
        return new MutableOptionsBundle(treeMap);
    }

    @Override // androidx.camera.core.impl.MutableConfig
    public <ValueT> void insertOption(@NonNull Config.Option<ValueT> opt, @Nullable ValueT value) {
        insertOption(opt, DEFAULT_PRIORITY, value);
    }

    @Override // androidx.camera.core.impl.MutableConfig
    @Nullable
    public <ValueT> ValueT removeOption(@NonNull Config.Option<ValueT> option) {
        return (ValueT) this.mOptions.remove(option);
    }

    @Override // androidx.camera.core.impl.MutableConfig
    public <ValueT> void insertOption(@NonNull Config.Option<ValueT> opt, @NonNull Config.OptionPriority priority, @Nullable ValueT value) {
        Map<Config.OptionPriority, Object> map = this.mOptions.get(opt);
        if (map == null) {
            ArrayMap arrayMap = new ArrayMap();
            this.mOptions.put(opt, arrayMap);
            arrayMap.put(priority, value);
            return;
        }
        Config.OptionPriority optionPriority = (Config.OptionPriority) Collections.min(map.keySet());
        if (map.get(optionPriority).equals(value) || !c.a(optionPriority, priority)) {
            map.put(priority, value);
            return;
        }
        throw new IllegalArgumentException("Option values conflicts: " + opt.getId() + ", existing value (" + optionPriority + ")=" + map.get(optionPriority) + ", conflicting (" + priority + ")=" + value);
    }
}
