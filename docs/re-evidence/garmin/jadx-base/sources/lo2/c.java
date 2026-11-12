package lo2;

import am.j;
import com.garmin.feature.garminpay.providers.gpay.snowball.exception.UserCancellationException;
import com.google.firebase.messaging.l;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\tB%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Llo2/c;", "", "", "status", "Llo2/d;", "detail", "memo", "<init>", "(Ljava/lang/String;Llo2/d;Ljava/lang/String;)V", "a", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f114046d = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f114047a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f114048b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f114049c;

    public c(String str, d dVar, String str2) {
        this.f114047a = str;
        this.f114048b = dVar;
        this.f114049c = str2;
    }

    public final void a() {
        String str = this.f114047a;
        if (s.g(str, "6001")) {
            throw new UserCancellationException("User cancelled the pay with " + this);
        }
        if (!s.g(str, "9000")) {
            l.n(this, "Failed to pay with AliPay with ");
            return;
        }
        d dVar = this.f114048b;
        if (dVar == null || s.g(dVar.getAliPayTradeAppPayResponse().getCode(), "10000")) {
            return;
        }
        l.n(this, "Failed to pay with AliPay with ");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return s.g(this.f114047a, cVar.f114047a) && s.g(this.f114048b, cVar.f114048b) && s.g(this.f114049c, cVar.f114049c);
    }

    public final int hashCode() {
        String str = this.f114047a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        d dVar = this.f114048b;
        int iHashCode2 = (iHashCode + (dVar == null ? 0 : dVar.hashCode())) * 31;
        String str2 = this.f114049c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("AliPayResult(status=");
        sb3.append(this.f114047a);
        sb3.append(", detail=");
        sb3.append(this.f114048b);
        sb3.append(", memo=");
        return j.o(this.f114049c, ")", sb3);
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Llo2/c$a;", "", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
