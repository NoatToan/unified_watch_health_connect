package mq2;

import androidx.core.view.j;
import org.joda.time.DateTime;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\nB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lmq2/a;", "", "", "imageUrl", "", "balance", "Lorg/joda/time/DateTime;", "lastSyncTime", "<init>", "(Ljava/lang/String;SLorg/joda/time/DateTime;)V", "a", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C2282a f120216d = new C2282a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f120217a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final short f120218b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final DateTime f120219c;

    public a(String str, short s8, DateTime dateTime) {
        str.getClass();
        dateTime.getClass();
        this.f120217a = str;
        this.f120218b = s8;
        this.f120219c = dateTime;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f120217a.equals(aVar.f120217a) && this.f120218b == aVar.f120218b && this.f120219c.equals(aVar.f120219c);
    }

    public final int hashCode() {
        return this.f120219c.hashCode() + ((Short.hashCode(this.f120218b) + (this.f120217a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sbK = j.k(this.f120218b, "CardSummaryItemModel(imageUrl=", this.f120217a, ", balance=", ", lastSyncTime=");
        sbK.append(this.f120219c);
        sbK.append(")");
        return sbK.toString();
    }

    /* JADX INFO: renamed from: mq2.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lmq2/a$a;", "", "<init>", "()V", "", "PAYLOAD_IMAGE_URL", "I", "PAYLOAD_BALANCE", "PAYLOAD_DATE_TIME", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C2282a {
        public /* synthetic */ C2282a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private C2282a() {
        }
    }
}
