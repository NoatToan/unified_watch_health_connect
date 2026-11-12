package com.garmin.android.apps.connectmobile.pacepro.data.dto;

import android.os.Parcel;
import android.os.Parcelable;
import i63.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kg.f;
import m63.u1;
import o13.l;
import o13.m;
import o13.n;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import p13.j0;
import t41.i;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u000e2\u00020\u0001:\u0002\u000f\u0010B!\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB5\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\r¨\u0006\u0011"}, d2 = {"Lcom/garmin/android/apps/connectmobile/pacepro/data/dto/a;", "Landroid/os/Parcelable;", "", "Lcom/garmin/android/apps/connectmobile/pacepro/data/dto/PaceBandSplitDTO;", "paceBandSplits", "Lcom/garmin/android/apps/connectmobile/pacepro/data/dto/b;", "paceBandSummary", "<init>", "(Ljava/util/List;Lcom/garmin/android/apps/connectmobile/pacepro/data/dto/b;)V", "", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILjava/util/List;Lcom/garmin/android/apps/connectmobile/pacepro/data/dto/b;Lm63/u1;)V", "Companion", "a", "b", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@h
public final /* data */ class a implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<PaceBandSplitDTO> f39759a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f39760b;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<a> CREATOR = new c();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final l<i63.c<Object>>[] f39758c = {m.a(n.PUBLICATION, new pk0.m(26)), null};

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements Parcelable.Creator<a> {
        @Override // android.os.Parcelable.Creator
        public final a createFromParcel(Parcel parcel) {
            parcel.getClass();
            int i14 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i14);
            int iA = 0;
            while (iA != i14) {
                iA = f.a(PaceBandSplitDTO.CREATOR, parcel, arrayList, iA, 1);
            }
            return new a(arrayList, b.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final a[] newArray(int i14) {
            return new a[i14];
        }
    }

    public a(int i14, List list, b bVar, u1 u1Var) {
        this.f39759a = (i14 & 1) == 0 ? j0.f134944a : list;
        if ((i14 & 2) == 0) {
            this.f39760b = new b((Long) null, (String) null, (Long) null, (Long) null, (i) null, (t41.a) null, 0.0d, (Double) null, (Double) null, 0L, 0.0d, (String) null, (String) null, (String) null, false, (Float) null, (Float) null, (Float) null, 262143, (j) null);
        } else {
            this.f39760b = bVar;
        }
    }

    public static a b(a aVar, List list, b bVar, int i14) {
        if ((i14 & 1) != 0) {
            list = aVar.f39759a;
        }
        if ((i14 & 2) != 0) {
            bVar = aVar.f39760b;
        }
        aVar.getClass();
        list.getClass();
        bVar.getClass();
        return new a(list, bVar);
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
        return s.g(this.f39759a, aVar.f39759a) && s.g(this.f39760b, aVar.f39760b);
    }

    public final int hashCode() {
        return this.f39760b.hashCode() + (this.f39759a.hashCode() * 31);
    }

    public final String toString() {
        return "PaceBandDTO(paceBandSplits=" + this.f39759a + ", paceBandSummary=" + this.f39760b + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        Iterator itE = f.e(this.f39759a, parcel);
        while (itE.hasNext()) {
            ((PaceBandSplitDTO) itE.next()).writeToParcel(parcel, i14);
        }
        this.f39760b.writeToParcel(parcel, i14);
    }

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.pacepro.data.dto.a$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/pacepro/data/dto/a$b;", "", "<init>", "()V", "Li63/c;", "Lcom/garmin/android/apps/connectmobile/pacepro/data/dto/a;", "serializer", "()Li63/c;", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(j jVar) {
            this();
        }

        public final i63.c<a> serializer() {
            return C0720a.f39761a;
        }

        private Companion() {
        }
    }

    public a() {
        this((List) null, (b) null, 3, (j) null);
    }

    public a(List<PaceBandSplitDTO> list, b bVar) {
        list.getClass();
        bVar.getClass();
        this.f39759a = list;
        this.f39760b = bVar;
    }

    public a(List list, b bVar, int i14, j jVar) {
        this((i14 & 1) != 0 ? j0.f134944a : list, (i14 & 2) != 0 ? new b((Long) null, (String) null, (Long) null, (Long) null, (i) null, (t41.a) null, 0.0d, (Double) null, (Double) null, 0L, 0.0d, (String) null, (String) null, (String) null, false, (Float) null, (Float) null, (Float) null, 262143, (j) null) : bVar);
    }
}
