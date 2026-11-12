package i3;

import com.garmin.android.gncs.settings.GNCSOptOutSettingsFragment;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Li3/w7;", "", "Lo4/d0;", GNCSOptOutSettingsFragment.EXTRA_TEXT_COLOR, "leadingIconColor", "trailingIconColor", GNCSOptOutSettingsFragment.EXTRA_DISABLED_TEXT_COLOR, "disabledLeadingIconColor", "disabledTrailingIconColor", "<init>", "(JJJJJJLkotlin/jvm/internal/j;)V", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class w7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f90100a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f90101b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f90102c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f90103d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f90104e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f90105f;

    private w7(long j8, long j14, long j15, long j16, long j17, long j18) {
        this.f90100a = j8;
        this.f90101b = j14;
        this.f90102c = j15;
        this.f90103d = j16;
        this.f90104e = j17;
        this.f90105f = j18;
    }

    public static w7 a(w7 w7Var, long j8) {
        return new w7(w7Var.f90100a, w7Var.f90101b, j8 != 16 ? j8 : w7Var.f90102c, w7Var.f90103d, w7Var.f90104e, w7Var.f90105f, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof w7)) {
            return false;
        }
        w7 w7Var = (w7) obj;
        return o4.d0.d(this.f90100a, w7Var.f90100a) && o4.d0.d(this.f90101b, w7Var.f90101b) && o4.d0.d(this.f90102c, w7Var.f90102c) && o4.d0.d(this.f90103d, w7Var.f90103d) && o4.d0.d(this.f90104e, w7Var.f90104e) && o4.d0.d(this.f90105f, w7Var.f90105f);
    }

    public final int hashCode() {
        o4.d0.a aVar = o4.d0.f128823b;
        o13.z.a aVar2 = o13.z.f128618b;
        return Long.hashCode(this.f90105f) + q6.f.e(q6.f.e(q6.f.e(q6.f.e(Long.hashCode(this.f90100a) * 31, 31, this.f90101b), 31, this.f90102c), 31, this.f90103d), 31, this.f90104e);
    }

    public /* synthetic */ w7(long j8, long j14, long j15, long j16, long j17, long j18, p005kotlin.jvm.internal.j jVar) {
        this(j8, j14, j15, j16, j17, j18);
    }
}
