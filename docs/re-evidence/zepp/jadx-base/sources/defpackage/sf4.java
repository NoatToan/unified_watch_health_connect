package defpackage;

import com.google.accompanist.insets.ImmutableInsets;
import com.google.accompanist.insets.Insets;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class sf4 {
    static {
        Insets.Companion companion = Insets.INSTANCE;
    }

    @NotNull
    public static Insets a(Insets _this, int i, int i2, int i3, int i4) {
        return new ImmutableInsets(i, i2, i3, i4);
    }

    @NotNull
    public static Insets b(@NotNull Insets _this, Insets insets) {
        return _this.copy(_this.getLeft() - insets.getLeft(), _this.getTop() - insets.getTop(), _this.getRight() - insets.getRight(), _this.getBottom() - insets.getBottom());
    }

    @NotNull
    public static Insets c(@NotNull Insets _this, Insets insets) {
        return _this.copy(_this.getLeft() + insets.getLeft(), _this.getTop() + insets.getTop(), _this.getRight() + insets.getRight(), _this.getBottom() + insets.getBottom());
    }

    public static /* synthetic */ Insets d(Insets insets, int i, int i2, int i3, int i4, int i5, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: copy");
        }
        if ((i5 & 1) != 0) {
            i = insets.getLeft();
        }
        if ((i5 & 2) != 0) {
            i2 = insets.getTop();
        }
        if ((i5 & 4) != 0) {
            i3 = insets.getRight();
        }
        if ((i5 & 8) != 0) {
            i4 = insets.getBottom();
        }
        return insets.copy(i, i2, i3, i4);
    }
}
