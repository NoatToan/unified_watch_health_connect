package vu;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u0001:\u0001\u0007B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003B\u0011\b\u0014\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0002\u0010\u0006¨\u0006\b"}, d2 = {"Lvu/b;", "Landroid/os/Parcelable;", "<init>", "()V", "Landroid/os/Parcel;", "in", "(Landroid/os/Parcel;)V", "b", "gcm-badges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public com.garmin.android.apps.connectmobile.badges.service.model.d[] f180212a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public com.garmin.android.apps.connectmobile.badges.service.model.b[] f180213b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f180214c;

    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"vu/b$a", "Landroid/os/Parcelable$Creator;", "Lvu/b;", "gcm-badges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<b> {
        @Override // android.os.Parcelable.Creator
        public final b createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new b(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final b[] newArray(int i14) {
            return new b[i14];
        }
    }

    static {
        new C3361b(null);
        CREATOR = new a();
    }

    public b(Parcel parcel) {
        com.garmin.android.apps.connectmobile.badges.service.model.b bVar;
        parcel.getClass();
        this.f180214c = new ArrayList();
        int[] iArrCreateIntArray = parcel.createIntArray();
        if (iArrCreateIntArray != null) {
            ArrayList arrayList = new ArrayList();
            for (int i14 : iArrCreateIntArray) {
                com.garmin.android.apps.connectmobile.badges.service.model.d dVarA = com.garmin.android.apps.connectmobile.badges.service.model.d.a(i14);
                dVarA.getClass();
                arrayList.add(dVarA);
            }
            this.f180212a = (com.garmin.android.apps.connectmobile.badges.service.model.d[]) arrayList.toArray(new com.garmin.android.apps.connectmobile.badges.service.model.d[0]);
        }
        int[] iArrCreateIntArray2 = parcel.createIntArray();
        if (iArrCreateIntArray2 != null) {
            ArrayList arrayList2 = new ArrayList();
            for (int i15 : iArrCreateIntArray2) {
                com.garmin.android.apps.connectmobile.badges.service.model.b.f30552d.getClass();
                com.garmin.android.apps.connectmobile.badges.service.model.b[] bVarArrValues = com.garmin.android.apps.connectmobile.badges.service.model.b.values();
                int length = bVarArrValues.length;
                int i16 = 0;
                while (true) {
                    if (i16 >= length) {
                        bVar = null;
                        break;
                    }
                    bVar = bVarArrValues[i16];
                    if (bVar.f30556a == i15) {
                        break;
                    } else {
                        i16++;
                    }
                }
                if (bVar == null) {
                    bVar = com.garmin.android.apps.connectmobile.badges.service.model.b.STEPS;
                }
                arrayList2.add(bVar);
            }
            this.f180213b = (com.garmin.android.apps.connectmobile.badges.service.model.b[]) arrayList2.toArray(new com.garmin.android.apps.connectmobile.badges.service.model.b[0]);
        }
        int[] iArrCreateIntArray3 = parcel.createIntArray();
        if (iArrCreateIntArray3 != null) {
            ArrayList arrayList3 = new ArrayList();
            for (int i17 : iArrCreateIntArray3) {
                com.garmin.android.apps.connectmobile.badges.service.model.d dVarA2 = com.garmin.android.apps.connectmobile.badges.service.model.d.a(i17);
                dVarA2.getClass();
                arrayList3.add(dVarA2);
            }
            this.f180214c = arrayList3;
        }
    }

    public final boolean b() {
        com.garmin.android.apps.connectmobile.badges.service.model.d[] dVarArr = this.f180212a;
        if (dVarArr != null) {
            dVarArr.getClass();
            if (dVarArr.length != 0) {
                return false;
            }
        }
        com.garmin.android.apps.connectmobile.badges.service.model.b[] bVarArr = this.f180213b;
        if (bVarArr == null) {
            return true;
        }
        bVarArr.getClass();
        return bVarArr.length == 0;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !getClass().equals(obj.getClass())) {
            return false;
        }
        b bVar = (b) obj;
        if (Arrays.equals(this.f180212a, bVar.f180212a)) {
            return Arrays.equals(this.f180213b, bVar.f180213b);
        }
        return false;
    }

    public final int hashCode() {
        return (Arrays.hashCode(this.f180212a) * 31) + Arrays.hashCode(this.f180213b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        int[] iArr;
        parcel.getClass();
        com.garmin.android.apps.connectmobile.badges.service.model.d[] dVarArr = this.f180212a;
        int[] iArr2 = null;
        if (dVarArr != null) {
            iArr = new int[dVarArr.length];
            dVarArr.getClass();
            int length = dVarArr.length;
            for (int i15 = 0; i15 < length; i15++) {
                com.garmin.android.apps.connectmobile.badges.service.model.d[] dVarArr2 = this.f180212a;
                dVarArr2.getClass();
                iArr[i15] = dVarArr2[i15].f30563a;
            }
        } else {
            iArr = null;
        }
        parcel.writeIntArray(iArr);
        com.garmin.android.apps.connectmobile.badges.service.model.b[] bVarArr = this.f180213b;
        if (bVarArr != null) {
            iArr2 = new int[bVarArr.length];
            bVarArr.getClass();
            int length2 = bVarArr.length;
            for (int i16 = 0; i16 < length2; i16++) {
                com.garmin.android.apps.connectmobile.badges.service.model.b[] bVarArr2 = this.f180213b;
                bVarArr2.getClass();
                iArr2[i16] = bVarArr2[i16].f30556a;
            }
        }
        parcel.writeIntArray(iArr2);
        ArrayList arrayList = this.f180214c;
        int[] iArr3 = new int[arrayList.size()];
        int size = arrayList.size();
        for (int i17 = 0; i17 < size; i17++) {
            iArr3[i17] = ((com.garmin.android.apps.connectmobile.badges.service.model.d) arrayList.get(i17)).f30563a;
        }
        parcel.writeIntArray(iArr3);
    }

    /* JADX INFO: renamed from: vu.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lvu/b$b;", "", "<init>", "()V", "Landroid/os/Parcelable$Creator;", "Lvu/b;", "CREATOR", "Landroid/os/Parcelable$Creator;", "gcm-badges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C3361b {
        public /* synthetic */ C3361b(j jVar) {
            this();
        }

        private C3361b() {
        }
    }

    public b() {
        this.f180214c = new ArrayList();
    }
}
