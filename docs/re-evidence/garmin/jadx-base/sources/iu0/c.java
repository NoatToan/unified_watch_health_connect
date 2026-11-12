package iu0;

import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import r1.q2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Liu0/c;", "", "Lsd2/f;", "deviceDatabaseRecord", "", "isLiveEventSharingON", "", "recipientsCount", "showRecipientsWarning", "Liu0/e;", "msgContent", "<init>", "(Lsd2/f;ZIZLiu0/e;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sd2.f f95013a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f95014b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f95015c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f95016d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final e f95017e;

    public /* synthetic */ c(sd2.f fVar, boolean z14, int i14, boolean z15, e eVar, int i15, j jVar) {
        this((i15 & 1) != 0 ? null : fVar, (i15 & 2) != 0 ? false : z14, (i15 & 4) != 0 ? 0 : i14, (i15 & 8) != 0 ? false : z15, (i15 & 16) != 0 ? null : eVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return s.g(this.f95013a, cVar.f95013a) && this.f95014b == cVar.f95014b && this.f95015c == cVar.f95015c && this.f95016d == cVar.f95016d && s.g(this.f95017e, cVar.f95017e);
    }

    public final int hashCode() {
        sd2.f fVar = this.f95013a;
        int iG = q6.f.g(q2.d(this.f95015c, q6.f.g((fVar == null ? 0 : fVar.hashCode()) * 31, 31, this.f95014b), 31), 31, this.f95016d);
        e eVar = this.f95017e;
        return iG + (eVar != null ? eVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("LiveEventSharingMainUIModel(deviceDatabaseRecord=");
        sb3.append(this.f95013a);
        sb3.append(", isLiveEventSharingON=");
        sb3.append(this.f95014b);
        sb3.append(", recipientsCount=");
        fb1.c.x(sb3, this.f95015c, ", showRecipientsWarning=", this.f95016d, ", msgContent=");
        sb3.append(this.f95017e);
        sb3.append(")");
        return sb3.toString();
    }

    public c(sd2.f fVar, boolean z14, int i14, boolean z15, e eVar) {
        this.f95013a = fVar;
        this.f95014b = z14;
        this.f95015c = i14;
        this.f95016d = z15;
        this.f95017e = eVar;
    }

    public c() {
        this(null, false, 0, false, null, 31, null);
    }
}
