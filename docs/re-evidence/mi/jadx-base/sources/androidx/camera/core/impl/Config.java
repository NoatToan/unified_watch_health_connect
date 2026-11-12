package androidx.camera.core.impl;

import androidx.annotation.RequiresApi;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public interface Config {

    public enum OptionPriority {
        ALWAYS_OVERRIDE,
        REQUIRED,
        OPTIONAL
    }

    public static abstract class a<T> {
        public static <T> a<T> a(String str, Class<?> cls) {
            return b(str, cls, null);
        }

        public static <T> a<T> b(String str, Class<?> cls, Object obj) {
            return new androidx.camera.core.impl.a(str, cls, obj);
        }

        public abstract String c();

        public abstract Object d();

        public abstract Class<T> e();
    }

    public interface b {
        boolean a(a<?> aVar);
    }

    static boolean D(OptionPriority optionPriority, OptionPriority optionPriority2) {
        OptionPriority optionPriority3 = OptionPriority.ALWAYS_OVERRIDE;
        if (optionPriority == optionPriority3 && optionPriority2 == optionPriority3) {
            return true;
        }
        OptionPriority optionPriority4 = OptionPriority.REQUIRED;
        return optionPriority == optionPriority4 && optionPriority2 == optionPriority4;
    }

    static Config G(Config config, Config config2) {
        if (config == null && config2 == null) {
            return n.L();
        }
        m mVarP = config2 != null ? m.P(config2) : m.O();
        if (config != null) {
            for (a<?> aVar : config.h()) {
                mVarP.o(aVar, config.i(aVar), config.a(aVar));
            }
        }
        return n.M(mVarP);
    }

    <ValueT> ValueT a(a<ValueT> aVar);

    void b(String str, b bVar);

    Set<OptionPriority> c(a<?> aVar);

    <ValueT> ValueT d(a<ValueT> aVar, ValueT valuet);

    boolean f(a<?> aVar);

    <ValueT> ValueT g(a<ValueT> aVar, OptionPriority optionPriority);

    Set<a<?>> h();

    OptionPriority i(a<?> aVar);
}
