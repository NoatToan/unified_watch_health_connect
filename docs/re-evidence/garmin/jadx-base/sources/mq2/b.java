package mq2;

import com.google.common.base.Optional;
import java.util.List;
import lc.u0;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import sd2.f;
import wr.g;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\n\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lmq2/b;", "", "Lis2/b;", "providerType", "", "displayName", "Lcom/google/common/base/Optional;", "Lsd2/f;", "deviceRecord", "purseId", "", "cardBalance", "Lmq2/c;", "lastTopUpRecord", "", "transactionRecords", "Lorg/joda/time/DateTime;", "lastSyncTime", "<init>", "(Lis2/b;Ljava/lang/String;Lcom/google/common/base/Optional;Ljava/lang/String;SLmq2/c;Ljava/util/List;Lorg/joda/time/DateTime;)V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final is2.b f120220a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f120221b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Optional<f> f120222c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f120223d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final short f120224e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final c f120225f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List<c> f120226g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final DateTime f120227h;

    public b(is2.b bVar, String str, Optional<f> optional, String str2, short s8, c cVar, List<c> list, DateTime dateTime) {
        bVar.getClass();
        str.getClass();
        optional.getClass();
        str2.getClass();
        list.getClass();
        dateTime.getClass();
        this.f120220a = bVar;
        this.f120221b = str;
        this.f120222c = optional;
        this.f120223d = str2;
        this.f120224e = s8;
        this.f120225f = cVar;
        this.f120226g = list;
        this.f120227h = dateTime;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f120220a == bVar.f120220a && this.f120221b.equals(bVar.f120221b) && this.f120222c.equals(bVar.f120222c) && this.f120223d.equals(bVar.f120223d) && this.f120224e == bVar.f120224e && s.g(this.f120225f, bVar.f120225f) && this.f120226g.equals(bVar.f120226g) && this.f120227h.equals(bVar.f120227h);
    }

    public final int hashCode() {
        int iHashCode = (Short.hashCode(this.f120224e) + g.j((this.f120222c.hashCode() + g.j(this.f120220a.hashCode() * 31, 31, this.f120221b)) * 31, 31, this.f120223d)) * 31;
        c cVar = this.f120225f;
        return this.f120227h.hashCode() + u0.b((iHashCode + (cVar == null ? 0 : cVar.hashCode())) * 31, 31, this.f120226g);
    }

    public final String toString() {
        return "PreloadTransitCardViewModel(providerType=" + this.f120220a + ", displayName=" + this.f120221b + ", deviceRecord=" + this.f120222c + ", purseId=" + this.f120223d + ", cardBalance=" + ((int) this.f120224e) + ", lastTopUpRecord=" + this.f120225f + ", transactionRecords=" + this.f120226g + ", lastSyncTime=" + this.f120227h + ")";
    }
}
