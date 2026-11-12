package lm;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kg.f;
import lc.u0;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import ps.x1;
import qs.x;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Llm/d;", "Llm/c;", "", "chartType", "", "Lqs/x;", "supportedSplitTypes", "Lps/x1;", "typedSplits", "Lorg/joda/time/DateTime;", "recordsStartTime", "<init>", "(ILjava/util/List;Ljava/util/List;Lorg/joda/time/DateTime;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d extends c {
    public static final Parcelable.Creator<d> CREATOR = new a();
    public int B1;
    public final List<x> C1;
    public final List<x1> D1;
    public final DateTime E1;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<d> {
        @Override // android.os.Parcelable.Creator
        public final d createFromParcel(Parcel parcel) {
            parcel.getClass();
            int i14 = parcel.readInt();
            int i15 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i15);
            int iD = 0;
            for (int i16 = 0; i16 != i15; i16++) {
                arrayList.add(x.valueOf(parcel.readString()));
            }
            int i17 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i17);
            while (iD != i17) {
                iD = u0.d(d.class, parcel, arrayList2, iD, 1);
            }
            return new d(i14, arrayList, arrayList2, (DateTime) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final d[] newArray(int i14) {
            return new d[i14];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d(int i14, List<? extends x> list, List<x1> list2, DateTime dateTime) {
        list.getClass();
        list2.getClass();
        new km.b();
        super(i14, km.b.a(i14, null), list2);
        this.B1 = i14;
        this.C1 = list;
        this.D1 = list2;
        this.E1 = dateTime;
    }

    @Override // lm.c, im.b, zm.p
    /* JADX INFO: renamed from: g1, reason: from getter */
    public final int getB1() {
        return this.B1;
    }

    @Override // lm.c, im.b
    public final void o(int i14) {
        this.B1 = i14;
    }

    @Override // lm.c, im.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeInt(this.B1);
        Iterator itE = f.e(this.C1, parcel);
        while (itE.hasNext()) {
            parcel.writeString(((x) itE.next()).name());
        }
        Iterator itE2 = f.e(this.D1, parcel);
        while (itE2.hasNext()) {
            parcel.writeParcelable((Parcelable) itE2.next(), i14);
        }
        parcel.writeSerializable(this.E1);
    }

    public /* synthetic */ d(int i14, List list, List list2, DateTime dateTime, int i15, j jVar) {
        this(i14, list, list2, (i15 & 8) != 0 ? null : dateTime);
    }
}
