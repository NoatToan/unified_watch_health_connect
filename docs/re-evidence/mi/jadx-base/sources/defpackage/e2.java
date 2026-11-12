package defpackage;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u001b\u0010\u0007\u001a\u00020\u00028FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\f"}, d2 = {"Le2;", "Lb2;", "", "logInfo$delegate", "Lkotlin/Lazy;", PluginDeviceInfo.FMODEL, "()Ljava/lang/String;", "logInfo", "Lkotlin/Function0;", "log", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final class e2 extends b2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Function0<String> f16177b;

    @NotNull
    public final Lazy c;

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", PluginDeviceInfo.FMODEL, "()Ljava/lang/String;"}, k = 3, mv = {1, 7, 1})
    public static final class a extends Lambda implements Function0<String> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return (String) e2.this.f16177b.invoke();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e2(@NotNull Function0<String> log) {
        super(1);
        Intrinsics.checkNotNullParameter(log, "log");
        this.f16177b = log;
        this.c = LazyKt__LazyJVMKt.lazy(new a());
    }

    @NotNull
    public final String a() {
        return (String) this.c.getValue();
    }
}
