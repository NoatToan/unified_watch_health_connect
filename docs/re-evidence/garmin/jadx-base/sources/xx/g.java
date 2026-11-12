package xx;

import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lxx/g;", "", "Lbm2/c;", "deviceDTO", "", "mHasDividerView", "mHasFullDividerView", "<init>", "(Lbm2/c;ZZ)V", "gcm-calendar_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bm2.c f192502a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f192503b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f192504c;

    public /* synthetic */ g(bm2.c cVar, boolean z14, boolean z15, int i14, j jVar) {
        this(cVar, (i14 & 2) != 0 ? true : z14, (i14 & 4) != 0 ? true : z15);
    }

    public g(bm2.c cVar, boolean z14) {
        this(cVar, z14, false, 4, null);
    }

    public g(bm2.c cVar, boolean z14, boolean z15) {
        this.f192502a = cVar;
        this.f192503b = z14;
        this.f192504c = z15;
    }

    public g(bm2.c cVar) {
        this(cVar, false, false, 6, null);
    }
}
