package ir0;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lc.u0;
import m63.u1;
import o13.l;
import o13.m;
import o13.n;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \r2\u00020\u0001:\u0002\u000e\u000fB#\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bB3\b\u0010\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0007\u0010\f¨\u0006\u0010"}, d2 = {"Lir0/c;", "Landroid/os/Parcelable;", "", "weeklyGoal", "", "Lir0/f;", "dailyStats", "<init>", "(ILjava/util/List;)V", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(IILjava/util/List;Lm63/u1;)V", "Companion", "a", "b", "data_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@i63.h
public final /* data */ class c implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f94785a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<f> f94786b;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<c> CREATOR = new C1811c();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final l<i63.c<Object>>[] f94784c = {null, m.a(n.PUBLICATION, new ik2.b(5))};

    /* JADX INFO: renamed from: ir0.c$c, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class C1811c implements Parcelable.Creator<c> {
        @Override // android.os.Parcelable.Creator
        public final c createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            parcel.getClass();
            int i14 = parcel.readInt();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i15 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i15);
                int iD = 0;
                while (iD != i15) {
                    iD = u0.d(c.class, parcel, arrayList2, iD, 1);
                }
                arrayList = arrayList2;
            }
            return new c(i14, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final c[] newArray(int i14) {
            return new c[i14];
        }
    }

    public /* synthetic */ c(int i14, int i15, List list, u1 u1Var) {
        this.f94785a = (i14 & 1) == 0 ? 0 : i15;
        if ((i14 & 2) == 0) {
            this.f94786b = null;
        } else {
            this.f94786b = list;
        }
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
        return this.f94785a == cVar.f94785a && s.g(this.f94786b, cVar.f94786b);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f94785a) * 31;
        List<f> list = this.f94786b;
        return iHashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        return "IntensityMinutesHourlySummaryDTO(weeklyGoal=" + this.f94785a + ", dailyStats=" + this.f94786b + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeInt(this.f94785a);
        List<f> list = this.f94786b;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itO = u0.o(parcel, list, 1);
        while (itO.hasNext()) {
            parcel.writeParcelable((Parcelable) itO.next(), i14);
        }
    }

    /* JADX INFO: renamed from: ir0.c$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lir0/c$b;", "", "<init>", "()V", "Li63/c;", "Lir0/c;", "serializer", "()Li63/c;", "data_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(j jVar) {
            this();
        }

        public final i63.c<c> serializer() {
            return a.f94787a;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c() {
        this(0, (List) null, 3, (j) (0 == true ? 1 : 0));
    }

    public c(int i14, List<f> list) {
        this.f94785a = i14;
        this.f94786b = list;
    }

    public /* synthetic */ c(int i14, List list, int i15, j jVar) {
        this((i15 & 1) != 0 ? 0 : i14, (i15 & 2) != 0 ? null : list);
    }
}
