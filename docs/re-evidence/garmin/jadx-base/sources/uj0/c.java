package uj0;

import am.j;
import com.garmin.android.gncs.NotificationConstants;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.nimbusds.jose.HeaderParameterNames;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import wr.g;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\nB3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Luj0/c;", "", "", TtmlNode.ATTR_ID, NotificationConstants.KEY_DATA_MIME_TYPE, HeaderParameterNames.AUTHENTICATION_TAG, "title", "detail", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "a", "gcm-gcplus_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f171480f = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f171481a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f171482b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f171483c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f171484d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f171485e;

    public c(String str, String str2, String str3, String str4, String str5) {
        com.airbnb.lottie.animation.keyframe.a.y(str, str2, str4);
        this.f171481a = str;
        this.f171482b = str2;
        this.f171483c = str3;
        this.f171484d = str4;
        this.f171485e = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f171481a.equals(cVar.f171481a) && this.f171482b.equals(cVar.f171482b) && s.g(this.f171483c, cVar.f171483c) && this.f171484d.equals(cVar.f171484d) && s.g(this.f171485e, cVar.f171485e);
    }

    public final int hashCode() {
        int iJ = g.j(this.f171481a.hashCode() * 31, 31, this.f171482b);
        String str = this.f171483c;
        int iJ2 = g.j((iJ + (str == null ? 0 : str.hashCode())) * 31, 31, this.f171484d);
        String str2 = this.f171485e;
        return iJ2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbI = p6.b.i("GCPlusSubscriptionPlanContent(id=", this.f171481a, ", type=", this.f171482b, ", tag=");
        sn.a.t(sbI, this.f171483c, ", title=", this.f171484d, ", detail=");
        return j.o(this.f171485e, ")", sbI);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Luj0/c$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-gcplus_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
