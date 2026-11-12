package yq0;

import com.google.firebase.messaging.Constants;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lyq0/e;", "", "", "isLoading", "Ltq0/l;", "activityDTO", "Ltq0/c;", "demographicDTO", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "<init>", "(ZLtq0/l;Ltq0/c;Z)V", "gcm-insights_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f198742a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final tq0.l f198743b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final tq0.c f198744c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f198745d;

    public /* synthetic */ e(boolean z14, tq0.l lVar, tq0.c cVar, boolean z15, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? false : z14, lVar, (i14 & 4) != 0 ? new tq0.c((tq0.i) null, 1, (p005kotlin.jvm.internal.j) null) : cVar, (i14 & 8) != 0 ? false : z15);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f198742a == eVar.f198742a && s.g(this.f198743b, eVar.f198743b) && s.g(this.f198744c, eVar.f198744c) && this.f198745d == eVar.f198745d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f198745d) + ((this.f198744c.hashCode() + ((this.f198743b.hashCode() + (Boolean.hashCode(this.f198742a) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "InsightsHistogramUiState(isLoading=" + this.f198742a + ", activityDTO=" + this.f198743b + ", demographicDTO=" + this.f198744c + ", error=" + this.f198745d + ")";
    }

    public e(boolean z14, tq0.l lVar, tq0.c cVar, boolean z15) {
        lVar.getClass();
        cVar.getClass();
        this.f198742a = z14;
        this.f198743b = lVar;
        this.f198744c = cVar;
        this.f198745d = z15;
    }
}
