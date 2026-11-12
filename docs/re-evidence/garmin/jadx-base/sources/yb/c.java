package yb;

import com.google.android.exoplayer2.C;
import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ImmutableList<ea.a> f195638a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f195639b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f195640c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f195641d;

    public c(List<ea.a> list, long j8, long j14) {
        this.f195638a = ImmutableList.copyOf((Collection) list);
        this.f195639b = j8;
        this.f195640c = j14;
        long j15 = C.TIME_UNSET;
        if (j8 != C.TIME_UNSET && j14 != C.TIME_UNSET) {
            j15 = j8 + j14;
        }
        this.f195641d = j15;
    }
}
