package uj0;

import c80.q;
import com.garmin.android.gncs.NotificationConstants;
import i3.e5;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import wr.g;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\nB)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Luj0/b;", "", "Lc80/q;", NotificationConstants.KEY_DATA_MIME_TYPE, "", "name", "caption", "version", "<init>", "(Lc80/q;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "a", "gcm-gcplus_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f171475e = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f171476a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f171477b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f171478c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f171479d;

    public b(q qVar, String str, String str2, String str3) {
        qVar.getClass();
        str.getClass();
        str2.getClass();
        this.f171476a = qVar;
        this.f171477b = str;
        this.f171478c = str2;
        this.f171479d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f171476a == bVar.f171476a && this.f171477b.equals(bVar.f171477b) && this.f171478c.equals(bVar.f171478c) && s.g(this.f171479d, bVar.f171479d);
    }

    public final int hashCode() {
        int iJ = g.j(g.j(this.f171476a.hashCode() * 31, 31, this.f171477b), 31, this.f171478c);
        String str = this.f171479d;
        return iJ + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("GCPlusPlanSelectionFeatureContent(type=");
        sb3.append(this.f171476a);
        sb3.append(", name=");
        sb3.append(this.f171477b);
        sb3.append(", caption=");
        return e5.h(sb3, this.f171478c, ", version=", this.f171479d, ")");
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Luj0/b$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-gcplus_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
