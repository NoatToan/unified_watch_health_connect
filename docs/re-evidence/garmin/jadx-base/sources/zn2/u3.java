package zn2;

import android.os.Parcel;
import android.os.Parcelable;
import com.garmin.feature.garminpay.providers.gpay.model.Product;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\rB1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lzn2/u3;", "Lms2/f;", "Lcom/garmin/feature/garminpay/providers/gpay/model/Product;", "productDto", "Lqs2/a;", "businessOperator", "Lms2/a;", "cardIcon", "", "displayName", "hint", "<init>", "(Lcom/garmin/feature/garminpay/providers/gpay/model/Product;Lqs2/a;Lms2/a;Ljava/lang/String;Ljava/lang/String;)V", "a", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class u3 implements ms2.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Product f205880a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qs2.a f205881b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ms2.a f205882c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f205883d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f205884e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f205879f = new a(null);
    public static final Parcelable.Creator<u3> CREATOR = new b();

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<u3> {
        @Override // android.os.Parcelable.Creator
        public final u3 createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new u3(Product.CREATOR.createFromParcel(parcel), qs2.a.valueOf(parcel.readString()), (ms2.a) parcel.readParcelable(u3.class.getClassLoader()), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final u3[] newArray(int i14) {
            return new u3[i14];
        }
    }

    public u3(Product product, qs2.a aVar, ms2.a aVar2, String str, String str2) {
        product.getClass();
        aVar.getClass();
        aVar2.getClass();
        str.getClass();
        this.f205880a = product;
        this.f205881b = aVar;
        this.f205882c = aVar2;
        this.f205883d = str;
        this.f205884e = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // ms2.f
    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getF205884e() {
        return this.f205884e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u3)) {
            return false;
        }
        u3 u3Var = (u3) obj;
        return this.f205880a.equals(u3Var.f205880a) && this.f205881b == u3Var.f205881b && this.f205882c.equals(u3Var.f205882c) && this.f205883d.equals(u3Var.f205883d) && p005kotlin.jvm.internal.s.g(this.f205884e, u3Var.f205884e);
    }

    @Override // ms2.f
    /* JADX INFO: renamed from: getDisplayName, reason: from getter */
    public final String getF205883d() {
        return this.f205883d;
    }

    public final int hashCode() {
        int iJ = wr.g.j((this.f205882c.hashCode() + ((this.f205881b.hashCode() + (this.f205880a.hashCode() * 31)) * 31)) * 31, 31, this.f205883d);
        String str = this.f205884e;
        return iJ + (str == null ? 0 : str.hashCode());
    }

    @Override // ms2.f
    /* JADX INFO: renamed from: n, reason: from getter */
    public final qs2.a getF205881b() {
        return this.f205881b;
    }

    @Override // ms2.f
    /* JADX INFO: renamed from: p, reason: from getter */
    public final ms2.a getF205882c() {
        return this.f205882c;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ServerBasedProduct(productDto=");
        sb3.append(this.f205880a);
        sb3.append(", businessOperator=");
        sb3.append(this.f205881b);
        sb3.append(", cardIcon=");
        sb3.append(this.f205882c);
        sb3.append(", displayName=");
        sb3.append(this.f205883d);
        sb3.append(", hint=");
        return am.j.o(this.f205884e, ")", sb3);
    }

    @Override // ms2.f
    public final boolean w2() {
        Object bVar;
        try {
            int i14 = o13.q.f128596b;
            this.f205880a.r(fo2.q.ISSUE);
            bVar = Unit.INSTANCE;
        } catch (Throwable th3) {
            int i15 = o13.q.f128596b;
            bVar = new o13.q.b(th3);
        }
        if (o13.q.b(bVar) != null) {
            return true;
        }
        return false;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        this.f205880a.writeToParcel(parcel, i14);
        parcel.writeString(this.f205881b.name());
        parcel.writeParcelable(this.f205882c, i14);
        parcel.writeString(this.f205883d);
        parcel.writeString(this.f205884e);
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lzn2/u3$a;", "", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static u3 a(Product product) {
            String strB;
            Object next;
            fo2.m mVar;
            product.getClass();
            w13.c cVar = qs2.a.A;
            p13.c.b bVarN = com.airbnb.lottie.animation.keyframe.a.n(cVar, cVar);
            do {
                strB = null;
                if (!bVarN.hasNext()) {
                    next = null;
                    break;
                }
                next = bVarN.next();
            } while (!p005kotlin.jvm.internal.s.g(((qs2.a) next).f147399d, product.getCardType()));
            qs2.a aVar = (qs2.a) next;
            if (aVar == null) {
                org.apache.commons.lang3.e.m("Unknown cardType ", product.getCardType(), " from ", product);
                return null;
            }
            List<fo2.m> listB = product.getCardMetaData().b();
            if (listB != null && (mVar = (fo2.m) p13.h0.d0(listB)) != null) {
                strB = mVar.b();
            }
            if (strB == null) {
                strB = "";
            }
            return new u3(product, aVar, new ms2.a.b(strB), product.getProductName(), null);
        }

        private a() {
        }
    }
}
