package bm;

import org.joda.time.DateTimeConstants;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lbm/k0;", "", "", "duration", "hours", "minutes", "seconds", "<init>", "(IIII)V", "gcm-common-util_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f18822a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f18823b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f18824c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f18825d;

    public /* synthetic */ k0(int i14, int i15, int i16, int i17, int i18, p005kotlin.jvm.internal.j jVar) {
        this((i18 & 1) != 0 ? 0 : i14, (i18 & 2) != 0 ? 0 : i15, (i18 & 4) != 0 ? 0 : i16, (i18 & 8) != 0 ? 0 : i17);
    }

    public final void a(int i14) {
        this.f18822a = i14;
        this.f18823b = i14 / DateTimeConstants.SECONDS_PER_HOUR;
        int i15 = i14 % DateTimeConstants.SECONDS_PER_HOUR;
        this.f18824c = i15 / 60;
        this.f18825d = i15 % 60;
    }

    public k0(int i14, int i15, int i16, int i17) {
        this.f18822a = i14;
        this.f18823b = i14 / DateTimeConstants.SECONDS_PER_HOUR;
        int i18 = i14 % DateTimeConstants.SECONDS_PER_HOUR;
        this.f18824c = i18 / 60;
        this.f18825d = i18 % 60;
    }

    public k0() {
        this(0, 0, 0, 0, 15, null);
    }
}
