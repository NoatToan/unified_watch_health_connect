package tn2;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import java.util.Iterator;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Ltn2/j;", "", "Les2/a;", "walletItemsDAO", "", "deviceId", "<init>", "(Les2/a;J)V", "a", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final es2.a f165578a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f165579b;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u001a\u0010\u0007\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004j\n\u0012\u0004\u0012\u00020\u0005\u0018\u0001`\u0006¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR6\u0010\u0007\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004j\n\u0012\u0004\u0012\u00020\u0005\u0018\u0001`\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Ltn2/j$a;", "Landroid/os/Parcelable;", "Lrn2/i;", "cardInfo", "Las2/b;", "", "Lcom/garmin/feature/garminpay/util/transit/BalanceInfo;", "balanceInfo", "<init>", "(Lrn2/i;Las2/b;)V", "a", "Lrn2/i;", "d", "()Lrn2/i;", "b", "Las2/b;", "()Las2/b;", "setBalanceInfo", "(Las2/b;)V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class a implements Parcelable {
        public static final Parcelable.Creator<a> CREATOR = new C3111a();

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @SerializedName("cardInfo")
        private final rn2.i cardInfo;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @SerializedName("balanceInfo")
        private as2.b<Integer> balanceInfo;

        /* JADX INFO: renamed from: tn2.j$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class C3111a implements Parcelable.Creator<a> {
            @Override // android.os.Parcelable.Creator
            public final a createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new a(rn2.i.CREATOR.createFromParcel(parcel), (as2.b) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final a[] newArray(int i14) {
                return new a[i14];
            }
        }

        public a(rn2.i iVar, as2.b<Integer> bVar) {
            iVar.getClass();
            this.cardInfo = iVar;
            this.balanceInfo = bVar;
        }

        public final as2.b<Integer> b() {
            return this.balanceInfo;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final rn2.i getCardInfo() {
            return this.cardInfo;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return p005kotlin.jvm.internal.s.g(this.cardInfo, aVar.cardInfo) && p005kotlin.jvm.internal.s.g(this.balanceInfo, aVar.balanceInfo);
        }

        public final int hashCode() {
            int iHashCode = this.cardInfo.hashCode() * 31;
            as2.b<Integer> bVar = this.balanceInfo;
            return iHashCode + (bVar == null ? 0 : bVar.hashCode());
        }

        public final String toString() {
            return "FelicaCacheData(cardInfo=" + this.cardInfo + ", balanceInfo=" + this.balanceInfo + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i14) {
            parcel.getClass();
            this.cardInfo.writeToParcel(parcel, i14);
            parcel.writeSerializable(this.balanceInfo);
        }
    }

    public j(es2.a aVar, long j8) {
        aVar.getClass();
        this.f165578a = aVar;
        this.f165579b = j8;
    }

    public final void a(rn2.i iVar, qs2.f fVar, as2.b<Integer> bVar) {
        Object next;
        a aVar;
        iVar.getClass();
        fVar.getClass();
        long j8 = this.f165579b;
        es2.a aVar2 = this.f165578a;
        if (bVar == null) {
            Iterator it = aVar2.j(j8, "FELICA").iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!p005kotlin.jvm.internal.s.g(((fs2.a) next).f73426a, iVar.getCid()));
            fs2.a aVar3 = (fs2.a) next;
            if (aVar3 != null && (aVar = (a) fs2.a.f(aVar3, a.class)) != null) {
                bVar = aVar.b();
            }
        }
        fs2.a aVar4 = new fs2.a();
        aVar4.h(iVar.getCid());
        aVar4.f73427b = is2.b.FELICA;
        aVar4.f73428c = qs2.a.f147386o;
        aVar4.f73429d = "Suica";
        aVar4.f73431f = j8;
        aVar4.f73433h = fVar;
        aVar4.j(iVar.getCid());
        aVar4.f73436k = System.currentTimeMillis();
        fs2.a.k(aVar4, new a(iVar, bVar));
        w13.b.l(aVar2, aVar4);
    }

    public final void b(String str, qs2.f fVar) {
        Object next;
        a aVar;
        str.getClass();
        fVar.getClass();
        Iterator it = this.f165578a.j(this.f165579b, "FELICA").iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!p005kotlin.jvm.internal.s.g(((fs2.a) next).f73426a, str));
        fs2.a aVar2 = (fs2.a) next;
        if (aVar2 == null || (aVar = (a) fs2.a.f(aVar2, a.class)) == null) {
            return;
        }
        a(aVar.getCardInfo(), fVar, aVar.b());
    }
}
