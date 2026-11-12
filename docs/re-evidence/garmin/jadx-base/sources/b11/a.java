package b11;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import j20.x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.UUID;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.math.MathKt;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lb11/a;", "Landroid/os/Parcelable;", "<init>", "()V", "a", "b", "c", "Lb11/a$a;", "Lb11/a$b;", "Lb11/a$c;", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class a implements Parcelable {
    public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
        this();
    }

    public a H1() {
        if (this instanceof C0202a) {
            String string = UUID.randomUUID().toString();
            string.getClass();
            return C0202a.d((C0202a) this, string, 0.0d, false, 126);
        }
        if (this instanceof b) {
            String string2 = UUID.randomUUID().toString();
            string2.getClass();
            return b.d((b) this, string2, false, null, null, 510);
        }
        if (!(this instanceof c)) {
            u0.r();
            return null;
        }
        String string3 = UUID.randomUUID().toString();
        string3.getClass();
        return c.d((c) this, string3, 0.0d, false, 126);
    }

    /* JADX INFO: renamed from: T0 */
    public abstract Long getF14237d();

    public final b11.b b() {
        if (this instanceof C0202a) {
            return b11.b.FOOD;
        }
        if (this instanceof b) {
            return b11.b.MEAL;
        }
        if (this instanceof c) {
            return b11.b.RECIPE;
        }
        u0.r();
        return null;
    }

    public abstract Double b4();

    public abstract Double g4();

    /* JADX INFO: renamed from: getImages */
    public abstract t getF14240g();

    public abstract Integer getTotalCalories();

    /* JADX INFO: renamed from: q1 */
    public abstract boolean getF14236c();

    public abstract Double z3();

    private a() {
    }

    /* JADX INFO: renamed from: b11.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002BC\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lb11/a$a;", "Lb11/a;", "Lb11/v;", "", TtmlNode.ATTR_ID, "", "servingQty", "", "isFavorite", "", "mealId", "Lb11/d;", "foodMetadata", "Lb11/s;", "nutritionContent", "Lb11/t;", "images", "<init>", "(Ljava/lang/String;DZLjava/lang/Long;Lb11/d;Lb11/s;Lb11/t;)V", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class C0202a extends a implements v {
        public static final Parcelable.Creator<C0202a> CREATOR = new C0203a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f14218a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final double f14219b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f14220c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Long f14221d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final d f14222e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final s f14223f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final t f14224g;

        /* JADX INFO: renamed from: b11.a$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class C0203a implements Parcelable.Creator<C0202a> {
            @Override // android.os.Parcelable.Creator
            public final C0202a createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new C0202a(parcel.readString(), parcel.readDouble(), parcel.readInt() != 0, parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), d.CREATOR.createFromParcel(parcel), s.CREATOR.createFromParcel(parcel), t.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final C0202a[] newArray(int i14) {
                return new C0202a[i14];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0202a(String str, double d14, boolean z14, Long l14, d dVar, s sVar, t tVar) {
            super(null);
            str.getClass();
            dVar.getClass();
            sVar.getClass();
            tVar.getClass();
            this.f14218a = str;
            this.f14219b = d14;
            this.f14220c = z14;
            this.f14221d = l14;
            this.f14222e = dVar;
            this.f14223f = sVar;
            this.f14224g = tVar;
        }

        public static C0202a d(C0202a c0202a, String str, double d14, boolean z14, int i14) {
            if ((i14 & 1) != 0) {
                str = c0202a.f14218a;
            }
            String str2 = str;
            if ((i14 & 2) != 0) {
                d14 = c0202a.f14219b;
            }
            double d15 = d14;
            if ((i14 & 4) != 0) {
                z14 = c0202a.f14220c;
            }
            Long l14 = c0202a.f14221d;
            d dVar = c0202a.f14222e;
            s sVar = c0202a.f14223f;
            t tVar = c0202a.f14224g;
            c0202a.getClass();
            str2.getClass();
            dVar.getClass();
            sVar.getClass();
            tVar.getClass();
            return new C0202a(str2, d15, z14, l14, dVar, sVar, tVar);
        }

        @Override // b11.v
        public final f E() {
            return this.f14223f.f14375d;
        }

        @Override // b11.v
        public final double G0() {
            return this.f14219b * this.f14223f.f14374c;
        }

        @Override // b11.a, b11.v
        /* JADX INFO: renamed from: T0, reason: from getter */
        public final Long getF14237d() {
            return this.f14221d;
        }

        @Override // b11.a, b11.v
        public final Double b4() {
            Double d14 = this.f14223f.f14375d.f14267b;
            if (d14 != null) {
                return Double.valueOf(d14.doubleValue() * this.f14219b);
            }
            return null;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0202a)) {
                return false;
            }
            C0202a c0202a = (C0202a) obj;
            return p005kotlin.jvm.internal.s.g(this.f14218a, c0202a.f14218a) && Double.compare(this.f14219b, c0202a.f14219b) == 0 && this.f14220c == c0202a.f14220c && p005kotlin.jvm.internal.s.g(this.f14221d, c0202a.f14221d) && p005kotlin.jvm.internal.s.g(this.f14222e, c0202a.f14222e) && p005kotlin.jvm.internal.s.g(this.f14223f, c0202a.f14223f) && p005kotlin.jvm.internal.s.g(this.f14224g, c0202a.f14224g);
        }

        @Override // b11.a, b11.v
        public final Double g4() {
            Double d14 = this.f14223f.f14375d.f14269d;
            if (d14 != null) {
                return Double.valueOf(d14.doubleValue() * this.f14219b);
            }
            return null;
        }

        @Override // b11.v
        /* JADX INFO: renamed from: getId, reason: from getter */
        public final String getF14234a() {
            return this.f14218a;
        }

        @Override // b11.v
        public final String getImageUrl() {
            String str = getF14240g().f14379b;
            if (str != null) {
                return str;
            }
            String str2 = getF14240g().f14380c;
            return str2 == null ? getF14240g().f14378a : str2;
        }

        @Override // b11.a, b11.v
        /* JADX INFO: renamed from: getImages, reason: from getter */
        public final t getF14240g() {
            return this.f14224g;
        }

        @Override // b11.a, b11.v
        public final Integer getTotalCalories() {
            Integer num = this.f14223f.f14375d.f14266a;
            if (num != null) {
                return Integer.valueOf(MathKt.b(((double) num.intValue()) * this.f14219b));
            }
            return null;
        }

        public final int hashCode() {
            int iG = q6.f.g(org.apache.commons.lang3.e.b(this.f14218a.hashCode() * 31, 31, this.f14219b), 31, this.f14220c);
            Long l14 = this.f14221d;
            return this.f14224g.hashCode() + ((this.f14223f.hashCode() + ((this.f14222e.hashCode() + ((iG + (l14 == null ? 0 : l14.hashCode())) * 31)) * 31)) * 31);
        }

        @Override // b11.v
        /* JADX INFO: renamed from: l, reason: from getter */
        public final double getF14235b() {
            return this.f14219b;
        }

        @Override // b11.a, b11.v
        /* JADX INFO: renamed from: q1, reason: from getter */
        public final boolean getF14236c() {
            return this.f14220c;
        }

        public final String toString() {
            return "Food(id=" + this.f14218a + ", servingQty=" + this.f14219b + ", isFavorite=" + this.f14220c + ", mealId=" + this.f14221d + ", foodMetadata=" + this.f14222e + ", nutritionContent=" + this.f14223f + ", images=" + this.f14224g + ")";
        }

        @Override // b11.v
        /* JADX INFO: renamed from: v, reason: from getter */
        public final s getF14239f() {
            return this.f14223f;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i14) {
            parcel.getClass();
            parcel.writeString(this.f14218a);
            parcel.writeDouble(this.f14219b);
            parcel.writeInt(this.f14220c ? 1 : 0);
            Long l14 = this.f14221d;
            if (l14 == null) {
                parcel.writeInt(0);
            } else {
                sn.a.n(parcel, 1, l14);
            }
            this.f14222e.writeToParcel(parcel, i14);
            this.f14223f.writeToParcel(parcel, i14);
            this.f14224g.writeToParcel(parcel, i14);
        }

        @Override // b11.v
        /* JADX INFO: renamed from: x, reason: from getter */
        public final d getF14238e() {
            return this.f14222e;
        }

        @Override // b11.a, b11.v
        public final Double z3() {
            Double d14 = this.f14223f.f14375d.f14268c;
            if (d14 != null) {
                return Double.valueOf(d14.doubleValue() * this.f14219b);
            }
            return null;
        }

        public /* synthetic */ C0202a(String str, double d14, boolean z14, Long l14, d dVar, s sVar, t tVar, int i14, p005kotlin.jvm.internal.j jVar) {
            this((i14 & 1) != 0 ? kg.f.c() : str, d14, z14, l14, dVar, sVar, tVar);
        }
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002BE\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lb11/a$c;", "Lb11/a;", "Lb11/v;", "", TtmlNode.ATTR_ID, "", "servingQty", "", "isFavorite", "", "mealId", "Lb11/d;", "foodMetadata", "Lb11/s;", "nutritionContent", "Lb11/t;", "images", "<init>", "(Ljava/lang/String;DZLjava/lang/Long;Lb11/d;Lb11/s;Lb11/t;)V", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class c extends a implements v {
        public static final Parcelable.Creator<c> CREATOR = new C0205a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f14234a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final double f14235b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f14236c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Long f14237d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final d f14238e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final s f14239f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final t f14240g;

        /* JADX INFO: renamed from: b11.a$c$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class C0205a implements Parcelable.Creator<c> {
            @Override // android.os.Parcelable.Creator
            public final c createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new c(parcel.readString(), parcel.readDouble(), parcel.readInt() != 0, parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), d.CREATOR.createFromParcel(parcel), s.CREATOR.createFromParcel(parcel), t.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final c[] newArray(int i14) {
                return new c[i14];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, double d14, boolean z14, Long l14, d dVar, s sVar, t tVar) {
            super(null);
            str.getClass();
            dVar.getClass();
            sVar.getClass();
            tVar.getClass();
            this.f14234a = str;
            this.f14235b = d14;
            this.f14236c = z14;
            this.f14237d = l14;
            this.f14238e = dVar;
            this.f14239f = sVar;
            this.f14240g = tVar;
        }

        public static c d(c cVar, String str, double d14, boolean z14, int i14) {
            if ((i14 & 1) != 0) {
                str = cVar.f14234a;
            }
            String str2 = str;
            if ((i14 & 2) != 0) {
                d14 = cVar.f14235b;
            }
            double d15 = d14;
            if ((i14 & 4) != 0) {
                z14 = cVar.f14236c;
            }
            Long l14 = cVar.f14237d;
            d dVar = cVar.f14238e;
            s sVar = cVar.f14239f;
            t tVar = cVar.f14240g;
            cVar.getClass();
            str2.getClass();
            dVar.getClass();
            sVar.getClass();
            tVar.getClass();
            return new c(str2, d15, z14, l14, dVar, sVar, tVar);
        }

        @Override // b11.v
        public final f E() {
            return this.f14239f.f14375d;
        }

        @Override // b11.v
        public final double G0() {
            return this.f14235b * this.f14239f.f14374c;
        }

        @Override // b11.a, b11.v
        /* JADX INFO: renamed from: T0, reason: from getter */
        public final Long getF14237d() {
            return this.f14237d;
        }

        @Override // b11.a, b11.v
        public final Double b4() {
            Double d14 = this.f14239f.f14375d.f14267b;
            if (d14 != null) {
                return Double.valueOf(d14.doubleValue() * this.f14235b);
            }
            return null;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return p005kotlin.jvm.internal.s.g(this.f14234a, cVar.f14234a) && Double.compare(this.f14235b, cVar.f14235b) == 0 && this.f14236c == cVar.f14236c && p005kotlin.jvm.internal.s.g(this.f14237d, cVar.f14237d) && p005kotlin.jvm.internal.s.g(this.f14238e, cVar.f14238e) && p005kotlin.jvm.internal.s.g(this.f14239f, cVar.f14239f) && p005kotlin.jvm.internal.s.g(this.f14240g, cVar.f14240g);
        }

        @Override // b11.a, b11.v
        public final Double g4() {
            Double d14 = this.f14239f.f14375d.f14269d;
            if (d14 != null) {
                return Double.valueOf(d14.doubleValue() * this.f14235b);
            }
            return null;
        }

        @Override // b11.v
        /* JADX INFO: renamed from: getId, reason: from getter */
        public final String getF14234a() {
            return this.f14234a;
        }

        @Override // b11.v
        public final String getImageUrl() {
            String str = getF14240g().f14379b;
            if (str != null) {
                return str;
            }
            String str2 = getF14240g().f14380c;
            return str2 == null ? getF14240g().f14378a : str2;
        }

        @Override // b11.a, b11.v
        /* JADX INFO: renamed from: getImages, reason: from getter */
        public final t getF14240g() {
            return this.f14240g;
        }

        @Override // b11.a, b11.v
        public final Integer getTotalCalories() {
            Integer num = this.f14239f.f14375d.f14266a;
            if (num != null) {
                return Integer.valueOf(MathKt.b(((double) num.intValue()) * this.f14235b));
            }
            return null;
        }

        public final int hashCode() {
            int iG = q6.f.g(org.apache.commons.lang3.e.b(this.f14234a.hashCode() * 31, 31, this.f14235b), 31, this.f14236c);
            Long l14 = this.f14237d;
            return this.f14240g.hashCode() + ((this.f14239f.hashCode() + ((this.f14238e.hashCode() + ((iG + (l14 == null ? 0 : l14.hashCode())) * 31)) * 31)) * 31);
        }

        @Override // b11.v
        /* JADX INFO: renamed from: l, reason: from getter */
        public final double getF14235b() {
            return this.f14235b;
        }

        @Override // b11.a, b11.v
        /* JADX INFO: renamed from: q1, reason: from getter */
        public final boolean getF14236c() {
            return this.f14236c;
        }

        public final String toString() {
            return "Recipe(id=" + this.f14234a + ", servingQty=" + this.f14235b + ", isFavorite=" + this.f14236c + ", mealId=" + this.f14237d + ", foodMetadata=" + this.f14238e + ", nutritionContent=" + this.f14239f + ", images=" + this.f14240g + ")";
        }

        @Override // b11.v
        /* JADX INFO: renamed from: v, reason: from getter */
        public final s getF14239f() {
            return this.f14239f;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i14) {
            parcel.getClass();
            parcel.writeString(this.f14234a);
            parcel.writeDouble(this.f14235b);
            parcel.writeInt(this.f14236c ? 1 : 0);
            Long l14 = this.f14237d;
            if (l14 == null) {
                parcel.writeInt(0);
            } else {
                sn.a.n(parcel, 1, l14);
            }
            this.f14238e.writeToParcel(parcel, i14);
            this.f14239f.writeToParcel(parcel, i14);
            this.f14240g.writeToParcel(parcel, i14);
        }

        @Override // b11.v
        /* JADX INFO: renamed from: x, reason: from getter */
        public final d getF14238e() {
            return this.f14238e;
        }

        @Override // b11.a, b11.v
        public final Double z3() {
            Double d14 = this.f14239f.f14375d.f14268c;
            if (d14 != null) {
                return Double.valueOf(d14.doubleValue() * this.f14235b);
            }
            return null;
        }

        public /* synthetic */ c(String str, double d14, boolean z14, Long l14, d dVar, s sVar, t tVar, int i14, p005kotlin.jvm.internal.j jVar) {
            this((i14 & 1) != 0 ? kg.f.c() : str, d14, z14, (i14 & 8) != 0 ? null : l14, dVar, sVar, tVar);
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B_\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lb11/a$b;", "Lb11/a;", "", TtmlNode.ATTR_ID, "", "isFavorite", "", "mealId", "customMealId", "Lb11/f;", "fullNutritionContent", "Lb11/t;", "images", "imageUuid", "name", "Li53/c;", "Lb11/v;", "foods", "<init>", "(Ljava/lang/String;ZLjava/lang/Long;JLb11/f;Lb11/t;Ljava/lang/String;Ljava/lang/String;Li53/c;)V", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class b extends a {
        public static final Parcelable.Creator<b> CREATOR = new C0204a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f14225a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f14226b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Long f14227c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final long f14228d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final f f14229e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final t f14230f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final String f14231g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final String f14232h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final i53.c<v> f14233i;

        /* JADX INFO: renamed from: b11.a$b$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class C0204a implements Parcelable.Creator<b> {
            @Override // android.os.Parcelable.Creator
            public final b createFromParcel(Parcel parcel) {
                parcel.getClass();
                String string = parcel.readString();
                boolean z14 = false;
                int iD = 0;
                if (parcel.readInt() != 0) {
                    z14 = true;
                }
                Long lValueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
                long j8 = parcel.readLong();
                f fVarCreateFromParcel = f.CREATOR.createFromParcel(parcel);
                t tVarCreateFromParcel = t.CREATOR.createFromParcel(parcel);
                Long l14 = lValueOf;
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                int i14 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i14);
                while (iD != i14) {
                    iD = u0.d(b.class, parcel, arrayList, iD, 1);
                }
                return new b(string, z14, l14, j8, fVarCreateFromParcel, tVarCreateFromParcel, string2, string3, i53.a.j(arrayList));
            }

            @Override // android.os.Parcelable.Creator
            public final b[] newArray(int i14) {
                return new b[i14];
            }
        }

        public /* synthetic */ b(String str, boolean z14, Long l14, long j8, f fVar, t tVar, String str2, String str3, i53.c cVar, int i14, p005kotlin.jvm.internal.j jVar) {
            this((i14 & 1) != 0 ? kg.f.c() : str, z14, (i14 & 4) != 0 ? null : l14, j8, fVar, tVar, (i14 & 64) != 0 ? null : str2, str3, cVar);
        }

        public static b d(b bVar, String str, boolean z14, Long l14, i53.c cVar, int i14) {
            if ((i14 & 1) != 0) {
                str = bVar.f14225a;
            }
            String str2 = str;
            if ((i14 & 2) != 0) {
                z14 = bVar.f14226b;
            }
            boolean z15 = z14;
            Long l15 = (i14 & 4) != 0 ? bVar.f14227c : l14;
            long j8 = bVar.f14228d;
            f fVar = bVar.f14229e;
            t tVar = bVar.f14230f;
            String str3 = bVar.f14231g;
            String str4 = bVar.f14232h;
            i53.c cVar2 = (i14 & 256) != 0 ? bVar.f14233i : cVar;
            bVar.getClass();
            str2.getClass();
            fVar.getClass();
            tVar.getClass();
            str4.getClass();
            cVar2.getClass();
            return new b(str2, z15, l15, j8, fVar, tVar, str3, str4, cVar2);
        }

        @Override // b11.a, b11.v
        /* JADX INFO: renamed from: T0, reason: from getter */
        public final Long getF14237d() {
            return this.f14227c;
        }

        @Override // b11.a, b11.v
        public final Double b4() {
            return this.f14229e.f14267b;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return p005kotlin.jvm.internal.s.g(this.f14225a, bVar.f14225a) && this.f14226b == bVar.f14226b && p005kotlin.jvm.internal.s.g(this.f14227c, bVar.f14227c) && this.f14228d == bVar.f14228d && p005kotlin.jvm.internal.s.g(this.f14229e, bVar.f14229e) && p005kotlin.jvm.internal.s.g(this.f14230f, bVar.f14230f) && p005kotlin.jvm.internal.s.g(this.f14231g, bVar.f14231g) && p005kotlin.jvm.internal.s.g(this.f14232h, bVar.f14232h) && p005kotlin.jvm.internal.s.g(this.f14233i, bVar.f14233i);
        }

        @Override // b11.a, b11.v
        public final Double g4() {
            return this.f14229e.f14269d;
        }

        @Override // b11.a, b11.v
        /* JADX INFO: renamed from: getImages, reason: from getter */
        public final t getF14240g() {
            return this.f14230f;
        }

        @Override // b11.a, b11.v
        public final Integer getTotalCalories() {
            return this.f14229e.f14266a;
        }

        public final int hashCode() {
            int iG = q6.f.g(this.f14225a.hashCode() * 31, 31, this.f14226b);
            Long l14 = this.f14227c;
            int iHashCode = (this.f14230f.hashCode() + ((this.f14229e.hashCode() + q6.f.e((iG + (l14 == null ? 0 : l14.hashCode())) * 31, 31, this.f14228d)) * 31)) * 31;
            String str = this.f14231g;
            return this.f14233i.hashCode() + wr.g.j((iHashCode + (str != null ? str.hashCode() : 0)) * 31, 31, this.f14232h);
        }

        @Override // b11.a, b11.v
        /* JADX INFO: renamed from: q1, reason: from getter */
        public final boolean getF14236c() {
            return this.f14226b;
        }

        public final String toString() {
            StringBuilder sbD = zl.a.d("Meal(id=", this.f14225a, ", isFavorite=", this.f14226b, ", mealId=");
            sbD.append(this.f14227c);
            sbD.append(", customMealId=");
            sbD.append(this.f14228d);
            sbD.append(", fullNutritionContent=");
            sbD.append(this.f14229e);
            sbD.append(", images=");
            sbD.append(this.f14230f);
            sn.a.t(sbD, ", imageUuid=", this.f14231g, ", name=", this.f14232h);
            sbD.append(", foods=");
            sbD.append(this.f14233i);
            sbD.append(")");
            return sbD.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i14) {
            parcel.getClass();
            parcel.writeString(this.f14225a);
            parcel.writeInt(this.f14226b ? 1 : 0);
            Long l14 = this.f14227c;
            if (l14 == null) {
                parcel.writeInt(0);
            } else {
                sn.a.n(parcel, 1, l14);
            }
            parcel.writeLong(this.f14228d);
            this.f14229e.writeToParcel(parcel, i14);
            this.f14230f.writeToParcel(parcel, i14);
            parcel.writeString(this.f14231g);
            parcel.writeString(this.f14232h);
            Iterator itG = x.g(this.f14233i, parcel);
            while (itG.hasNext()) {
                parcel.writeParcelable((Parcelable) itG.next(), i14);
            }
        }

        @Override // b11.a, b11.v
        public final Double z3() {
            return this.f14229e.f14268c;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(String str, boolean z14, Long l14, long j8, f fVar, t tVar, String str2, String str3, i53.c<? extends v> cVar) {
            super(null);
            str.getClass();
            fVar.getClass();
            tVar.getClass();
            str3.getClass();
            cVar.getClass();
            this.f14225a = str;
            this.f14226b = z14;
            this.f14227c = l14;
            this.f14228d = j8;
            this.f14229e = fVar;
            this.f14230f = tVar;
            this.f14231g = str2;
            this.f14232h = str3;
            this.f14233i = cVar;
        }
    }
}
