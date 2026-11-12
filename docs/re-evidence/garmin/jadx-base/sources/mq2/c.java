package mq2;

import java.util.concurrent.TimeUnit;
import jq2.e;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import wr.g;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u000fB9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lmq2/c;", "", "Ljq2/a;", "iconType", "Ljq2/e;", "transactionType", "", "systemName", "locationName", "", "amount", "Lorg/joda/time/DateTime;", "dateTime", "<init>", "(Ljq2/a;Ljq2/e;Ljava/lang/String;Ljava/lang/String;SLorg/joda/time/DateTime;)V", "a", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class c {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f120228g = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jq2.a f120229a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f120230b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f120231c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f120232d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final short f120233e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final DateTime f120234f;

    public c(jq2.a aVar, e eVar, String str, String str2, short s8, DateTime dateTime) {
        aVar.getClass();
        eVar.getClass();
        str2.getClass();
        dateTime.getClass();
        this.f120229a = aVar;
        this.f120230b = eVar;
        this.f120231c = str;
        this.f120232d = str2;
        this.f120233e = s8;
        this.f120234f = dateTime;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f120229a == cVar.f120229a && this.f120230b == cVar.f120230b && s.g(this.f120231c, cVar.f120231c) && this.f120232d.equals(cVar.f120232d) && this.f120233e == cVar.f120233e && this.f120234f.equals(cVar.f120234f);
    }

    public final int hashCode() {
        int iHashCode = (this.f120230b.hashCode() + (this.f120229a.hashCode() * 31)) * 31;
        String str = this.f120231c;
        return this.f120234f.hashCode() + ((Short.hashCode(this.f120233e) + g.j((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f120232d)) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("PreloadTransitTransactionModel(iconType=");
        sb3.append(this.f120229a);
        sb3.append(", transactionType=");
        sb3.append(this.f120230b);
        sb3.append(", systemName=");
        sn.a.t(sb3, this.f120231c, ", locationName=", this.f120232d, ", amount=");
        sb3.append((int) this.f120233e);
        sb3.append(", dateTime=");
        sb3.append(this.f120234f);
        sb3.append(")");
        return sb3.toString();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lmq2/c$a;", "", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        public static c a(iq2.c cVar, jq2.c cVar2) {
            cVar.getClass();
            jq2.a aVarA = cVar2.a(cVar);
            e eVarD = cVar2.d(cVar);
            String strC = cVar2.c(cVar);
            String strB = cVar2.b(cVar);
            short s8 = cVar.f94740d;
            DateTime dateTimeWithZone = new DateTime(TimeUnit.SECONDS.toMillis(cVar.f94738b), DateTimeZone.UTC).withZone(DateTimeZone.getDefault());
            dateTimeWithZone.getClass();
            return new c(aVarA, eVarD, strC, strB, s8, dateTimeWithZone);
        }

        private a() {
        }
    }
}
