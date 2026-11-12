package b0;

import com.google.auto.value.AutoValue;

/* JADX INFO: loaded from: classes.dex */
@AutoValue
public abstract class u {

    @AutoValue
    public static abstract class a {
        public abstract Throwable a();

        public abstract int b();
    }

    public enum b {
        PENDING_OPEN,
        OPENING,
        OPEN,
        CLOSING,
        CLOSED
    }

    public abstract a a();

    public abstract b b();
}
