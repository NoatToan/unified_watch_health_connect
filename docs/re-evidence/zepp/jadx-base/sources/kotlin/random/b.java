package kotlin.random;

import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
final class b extends AbstractPlatformRandom implements Serializable {

    @NotNull
    private static final a c = new a(null);

    @Deprecated
    private static final long serialVersionUID = 0;

    @NotNull
    private final java.util.Random b;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public b(@NotNull java.util.Random random) {
        this.b = random;
    }

    @Override // kotlin.random.AbstractPlatformRandom
    @NotNull
    public java.util.Random getImpl() {
        return this.b;
    }
}
