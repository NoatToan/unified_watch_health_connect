package coil.util;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
public /* synthetic */ class Time$provider$1 extends FunctionReferenceImpl implements Function0<Long> {
    public static final Time$provider$1 INSTANCE = new Time$provider$1();

    public Time$provider$1() {
        super(0, System.class, "currentTimeMillis", "currentTimeMillis()J", 0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final Long invoke() {
        return Long.valueOf(System.currentTimeMillis());
    }
}
