package zn2;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0017B]\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lzn2/t3;", "Lms2/e;", "Lfo2/w;", "operatorDto", "Lis2/b;", "serviceProviderType", "", "Lqs2/e;", "categories", "", "displayName", "Lms2/a;", "cardIcon", "hint", "", "displayOrder", "", "alwaysShowProductList", "", "Lqs2/b;", "restrictions", "<init>", "(Lfo2/w;Lis2/b;[Lqs2/e;Ljava/lang/String;Lms2/a;Ljava/lang/String;IZLjava/util/List;)V", "a", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class t3 implements ms2.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fo2.w f205850a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final is2.b f205851b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final qs2.e[] f205852c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f205853d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ms2.a f205854e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f205855f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f205856g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f205857h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final List<qs2.b> f205858i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final a f205847j = new a(null);
    public static final Parcelable.Creator<t3> CREATOR = new b();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final o13.t f205848k = o13.m.b(new zd0.r0(20));

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final o13.t f205849l = o13.m.b(new zd0.r0(21));

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<t3> {
        @Override // android.os.Parcelable.Creator
        public final t3 createFromParcel(Parcel parcel) {
            parcel.getClass();
            fo2.w wVarCreateFromParcel = fo2.w.CREATOR.createFromParcel(parcel);
            is2.b bVarValueOf = is2.b.valueOf(parcel.readString());
            int i14 = parcel.readInt();
            qs2.e[] eVarArr = new qs2.e[i14];
            for (int i15 = 0; i15 != i14; i15++) {
                eVarArr[i15] = qs2.e.valueOf(parcel.readString());
            }
            String string = parcel.readString();
            ms2.a aVar = (ms2.a) parcel.readParcelable(t3.class.getClassLoader());
            String string2 = parcel.readString();
            int i16 = parcel.readInt();
            boolean z14 = parcel.readInt() != 0;
            int i17 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i17);
            for (int i18 = 0; i18 != i17; i18++) {
                arrayList.add(qs2.b.valueOf(parcel.readString()));
            }
            return new t3(wVarCreateFromParcel, bVarValueOf, eVarArr, string, aVar, string2, i16, z14, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final t3[] newArray(int i14) {
            return new t3[i14];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public t3(fo2.w wVar, is2.b bVar, qs2.e[] eVarArr, String str, ms2.a aVar, String str2, int i14, boolean z14, List<? extends qs2.b> list) {
        wVar.getClass();
        bVar.getClass();
        eVarArr.getClass();
        str.getClass();
        aVar.getClass();
        list.getClass();
        this.f205850a = wVar;
        this.f205851b = bVar;
        this.f205852c = eVarArr;
        this.f205853d = str;
        this.f205854e = aVar;
        this.f205855f = str2;
        this.f205856g = i14;
        this.f205857h = z14;
        this.f205858i = list;
    }

    @Override // ms2.e
    /* JADX INFO: renamed from: B, reason: from getter */
    public final qs2.e[] getF205852c() {
        return this.f205852c;
    }

    @Override // ms2.e
    /* JADX INFO: renamed from: L3, reason: from getter */
    public final int getF205856g() {
        return this.f205856g;
    }

    @Override // ms2.e
    /* JADX INFO: renamed from: X2, reason: from getter */
    public final boolean getF205857h() {
        return this.f205857h;
    }

    @Override // ms2.e
    public final List<qs2.b> Z3() {
        return this.f205858i;
    }

    @Override // ms2.e
    /* JADX INFO: renamed from: a, reason: from getter */
    public final is2.b getF205851b() {
        return this.f205851b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // ms2.e
    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getF205855f() {
        return this.f205855f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t3)) {
            return false;
        }
        t3 t3Var = (t3) obj;
        return this.f205850a.equals(t3Var.f205850a) && this.f205851b == t3Var.f205851b && this.f205852c.equals(t3Var.f205852c) && this.f205853d.equals(t3Var.f205853d) && this.f205854e.equals(t3Var.f205854e) && p005kotlin.jvm.internal.s.g(this.f205855f, t3Var.f205855f) && this.f205856g == t3Var.f205856g && this.f205857h == t3Var.f205857h && this.f205858i.equals(t3Var.f205858i);
    }

    @Override // ms2.e
    /* JADX INFO: renamed from: getDisplayName, reason: from getter */
    public final String getF205853d() {
        return this.f205853d;
    }

    public final int hashCode() {
        int iHashCode = (this.f205854e.hashCode() + wr.g.j((((this.f205851b.hashCode() + (this.f205850a.hashCode() * 31)) * 31) + Arrays.hashCode(this.f205852c)) * 31, 31, this.f205853d)) * 31;
        String str = this.f205855f;
        return this.f205858i.hashCode() + q6.f.g(r1.q2.d(this.f205856g, (iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31), 31, this.f205857h);
    }

    @Override // ms2.e
    /* JADX INFO: renamed from: p, reason: from getter */
    public final ms2.a getF205854e() {
        return this.f205854e;
    }

    public final String toString() {
        String string = Arrays.toString(this.f205852c);
        StringBuilder sb3 = new StringBuilder("ServerBasedOperator(operatorDto=");
        sb3.append(this.f205850a);
        sb3.append(", serviceProviderType=");
        sb3.append(this.f205851b);
        sb3.append(", categories=");
        sn.a.t(sb3, string, ", displayName=", this.f205853d, ", cardIcon=");
        sb3.append(this.f205854e);
        sb3.append(", hint=");
        sb3.append(this.f205855f);
        sb3.append(", displayOrder=");
        fb1.c.x(sb3, this.f205856g, ", alwaysShowProductList=", this.f205857h, ", restrictions=");
        return u62.z.c(sb3, this.f205858i, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        this.f205850a.writeToParcel(parcel, i14);
        parcel.writeString(this.f205851b.name());
        qs2.e[] eVarArr = this.f205852c;
        int length = eVarArr.length;
        parcel.writeInt(length);
        for (int i15 = 0; i15 != length; i15++) {
            parcel.writeString(eVarArr[i15].name());
        }
        parcel.writeString(this.f205853d);
        parcel.writeParcelable(this.f205854e, i14);
        parcel.writeString(this.f205855f);
        parcel.writeInt(this.f205856g);
        parcel.writeInt(this.f205857h ? 1 : 0);
        Iterator itE = kg.f.e(this.f205858i, parcel);
        while (itE.hasNext()) {
            parcel.writeString(((qs2.b) itE.next()).name());
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007²\u0006\u0012\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\nX\u008a\u0084\u0002"}, d2 = {"Lzn2/t3$a;", "", "<init>", "()V", "", "Lqs2/e;", "fallback", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static t3 a(fo2.w wVar, ArrayList arrayList) {
            qs2.e[] eVarArr;
            int i14;
            fo2.m mVar;
            wVar.getClass();
            arrayList.getClass();
            is2.b bVar = is2.b.FITPAY;
            o13.t tVarB = o13.m.b(new zd0.r0(22));
            String upperCase = wVar.getOperatorType().toUpperCase(Locale.ROOT);
            upperCase.getClass();
            if (upperCase.equals("TRANSIT")) {
                eVarArr = new qs2.e[]{qs2.e.TRANSIT};
            } else {
                t3.f205847j.getClass();
                Logger logger = (Logger) t3.f205848k.getValue();
                String operatorType = wVar.getOperatorType();
                qs2.e[] eVarArr2 = (qs2.e[]) tVarB.getValue();
                StringBuilder sbL = hb.a.l("Unknown operatorType ", operatorType, ", treat it as ");
                sbL.append(eVarArr2);
                logger.warn(sbL.toString());
                eVarArr = null;
            }
            if (eVarArr == null) {
                eVarArr = (qs2.e[]) tVarB.getValue();
            }
            String strB = null;
            String displayName = wVar.getDisplayName();
            List<fo2.m> listB = wVar.getCardMetaData().b();
            if (listB != null && (mVar = (fo2.m) p13.h0.d0(listB)) != null) {
                strB = mVar.b();
            }
            if (strB == null) {
                strB = "";
            }
            ms2.a.b bVar2 = new ms2.a.b(strB);
            int iIntValue = ((Number) t3.f205849l.getValue()).intValue();
            if (p005kotlin.jvm.internal.s.g(wVar.getOperatorKey(), "CHINA_T_UNION")) {
                i14 = iIntValue + 1;
            } else {
                t3.f205847j.getClass();
                ds.e0.u("Unknown operatorKey ", wVar.getOperatorKey(), ", treat it as the last item", (Logger) t3.f205848k.getValue());
                Unit unit = Unit.INSTANCE;
                i14 = Integer.MAX_VALUE;
            }
            return new t3(wVar, bVar, eVarArr, displayName, bVar2, null, i14, wVar.getAlwaysShowProductList(), arrayList);
        }

        private a() {
        }
    }
}
