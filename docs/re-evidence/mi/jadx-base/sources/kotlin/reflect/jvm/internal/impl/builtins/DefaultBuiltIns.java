package kotlin.reflect.jvm.internal.impl.builtins;

import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class DefaultBuiltIns extends KotlinBuiltIns {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private static final Lazy<DefaultBuiltIns> Instance$delegate = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: kotlin.reflect.jvm.internal.impl.builtins.DefaultBuiltIns$$Lambda$0
        @Override // kotlin.jvm.functions.Function0
        public Object invoke() {
            return DefaultBuiltIns.Instance_delegate$lambda$0();
        }
    });

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final DefaultBuiltIns getInstance() {
            return (DefaultBuiltIns) DefaultBuiltIns.Instance$delegate.getValue();
        }
    }

    public DefaultBuiltIns() {
        this(false, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DefaultBuiltIns Instance_delegate$lambda$0() {
        return new DefaultBuiltIns(false, 1, null);
    }

    public DefaultBuiltIns(boolean z) {
        super(new LockBasedStorageManager("DefaultBuiltIns"));
        if (z) {
            createBuiltInsModule(false);
        }
    }

    public /* synthetic */ DefaultBuiltIns(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? true : z);
    }
}
