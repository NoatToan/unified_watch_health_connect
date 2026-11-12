package io.sentry;

import com.tencent.wcdb.database.SQLiteDatabase;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class SentryReplayOptions {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public Double f21353a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public Double f21354b;
    public Set<String> c = new CopyOnWriteArraySet();
    public Set<String> d = new CopyOnWriteArraySet();

    @Nullable
    public String e = null;

    @Nullable
    public String f = null;
    public SentryReplayQuality g = SentryReplayQuality.MEDIUM;
    public int h = 1;
    public long i = 30000;
    public long j = 5000;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f21355k = 3600000;

    public enum SentryReplayQuality {
        LOW(0.8f, SQLiteDatabase.SQLITE_MAX_LIKE_PATTERN_LENGTH),
        MEDIUM(1.0f, 75000),
        HIGH(1.0f, 100000);

        public final int bitRate;
        public final float sizeScale;

        SentryReplayQuality(float f, int i) {
            this.sizeScale = f;
            this.bitRate = i;
        }
    }

    public SentryReplayOptions(boolean z) {
        if (z) {
            return;
        }
        q(true);
        p(true);
        this.c.add("android.webkit.WebView");
        this.c.add("android.widget.VideoView");
        this.c.add("androidx.media3.ui.PlayerView");
        this.c.add("com.google.android.exoplayer2.ui.PlayerView");
        this.c.add("com.google.android.exoplayer2.ui.StyledPlayerView");
    }

    public void a(@NotNull String str) {
        this.c.add(str);
    }

    public void b(@NotNull String str) {
        this.d.add(str);
    }

    @ApiStatus.Internal
    public long c() {
        return this.i;
    }

    @ApiStatus.Internal
    public int d() {
        return this.h;
    }

    @NotNull
    public Set<String> e() {
        return this.c;
    }

    @ApiStatus.Internal
    @Nullable
    public String f() {
        return this.e;
    }

    @Nullable
    public Double g() {
        return this.f21354b;
    }

    @ApiStatus.Internal
    @NotNull
    public SentryReplayQuality h() {
        return this.g;
    }

    @ApiStatus.Internal
    public long i() {
        return this.f21355k;
    }

    @Nullable
    public Double j() {
        return this.f21353a;
    }

    @ApiStatus.Internal
    public long k() {
        return this.j;
    }

    @NotNull
    public Set<String> l() {
        return this.d;
    }

    @ApiStatus.Internal
    @Nullable
    public String m() {
        return this.f;
    }

    public boolean n() {
        return j() != null && j().doubleValue() > 0.0d;
    }

    public boolean o() {
        return g() != null && g().doubleValue() > 0.0d;
    }

    public void p(boolean z) {
        if (z) {
            a("android.widget.ImageView");
            this.d.remove("android.widget.ImageView");
        } else {
            b("android.widget.ImageView");
            this.c.remove("android.widget.ImageView");
        }
    }

    public void q(boolean z) {
        if (z) {
            a("android.widget.TextView");
            this.d.remove("android.widget.TextView");
        } else {
            b("android.widget.TextView");
            this.c.remove("android.widget.TextView");
        }
    }

    public void r(@Nullable Double d) {
        if (io.sentry.util.s.c(d)) {
            this.f21354b = d;
            return;
        }
        throw new IllegalArgumentException("The value " + d + " is not valid. Use null to disable or values >= 0.0 and <= 1.0.");
    }

    public void s(@Nullable Double d) {
        if (io.sentry.util.s.c(d)) {
            this.f21353a = d;
            return;
        }
        throw new IllegalArgumentException("The value " + d + " is not valid. Use null to disable or values >= 0.0 and <= 1.0.");
    }
}
