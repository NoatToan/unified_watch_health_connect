package s11;

import i3.bc;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ls11/b;", "Li3/bc;", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b implements bc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f155876a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f155877b;

    public b(long j8, long j14) {
        this.f155876a = j8;
        this.f155877b = j14;
    }

    @Override // i3.bc
    public final boolean a(long j8) {
        long millis = new DateTime(j8, DateTimeZone.UTC).withTimeAtStartOfDay().getMillis();
        return this.f155876a <= millis && millis <= this.f155877b;
    }
}
