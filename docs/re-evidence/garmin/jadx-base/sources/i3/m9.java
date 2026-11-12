package i3;

import com.garmin.android.gncs.settings.GNCSOptOutSettingsFragment;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Li3/m9;", "", "Lo4/d0;", "selectedIconColor", "selectedTextColor", "selectedIndicatorColor", "unselectedIconColor", "unselectedTextColor", "disabledIconColor", GNCSOptOutSettingsFragment.EXTRA_DISABLED_TEXT_COLOR, "<init>", "(JJJJJJJLkotlin/jvm/internal/j;)V", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class m9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f88958a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f88959b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f88960c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f88961d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f88962e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f88963f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f88964g;

    private m9(long j8, long j14, long j15, long j16, long j17, long j18, long j19) {
        this.f88958a = j8;
        this.f88959b = j14;
        this.f88960c = j15;
        this.f88961d = j16;
        this.f88962e = j17;
        this.f88963f = j18;
        this.f88964g = j19;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof m9)) {
            return false;
        }
        m9 m9Var = (m9) obj;
        return o4.d0.d(this.f88958a, m9Var.f88958a) && o4.d0.d(this.f88961d, m9Var.f88961d) && o4.d0.d(this.f88959b, m9Var.f88959b) && o4.d0.d(this.f88962e, m9Var.f88962e) && o4.d0.d(this.f88960c, m9Var.f88960c) && o4.d0.d(this.f88963f, m9Var.f88963f) && o4.d0.d(this.f88964g, m9Var.f88964g);
    }

    public final int hashCode() {
        o4.d0.a aVar = o4.d0.f128823b;
        o13.z.a aVar2 = o13.z.f128618b;
        return Long.hashCode(this.f88964g) + q6.f.e(q6.f.e(q6.f.e(q6.f.e(q6.f.e(Long.hashCode(this.f88958a) * 31, 31, this.f88961d), 31, this.f88959b), 31, this.f88962e), 31, this.f88960c), 31, this.f88963f);
    }

    public /* synthetic */ m9(long j8, long j14, long j15, long j16, long j17, long j18, long j19, p005kotlin.jvm.internal.j jVar) {
        this(j8, j14, j15, j16, j17, j18, j19);
    }
}
