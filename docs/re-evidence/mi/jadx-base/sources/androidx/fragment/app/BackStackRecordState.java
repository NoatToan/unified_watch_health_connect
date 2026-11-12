package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.lifecycle.Lifecycle;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
final class BackStackRecordState implements Parcelable {
    public static final Parcelable.Creator<BackStackRecordState> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f2308a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList<String> f2309b;
    public final int[] c;
    public final int[] d;
    public final int e;
    public final String f;
    public final int g;
    public final int h;
    public final CharSequence i;
    public final int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final CharSequence f2310k;
    public final ArrayList<String> l;
    public final ArrayList<String> m;
    public final boolean n;

    public class a implements Parcelable.Creator<BackStackRecordState> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public BackStackRecordState createFromParcel(Parcel parcel) {
            return new BackStackRecordState(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public BackStackRecordState[] newArray(int i) {
            return new BackStackRecordState[i];
        }
    }

    public BackStackRecordState(androidx.fragment.app.a aVar) {
        int size = aVar.c.size();
        this.f2308a = new int[size * 6];
        if (!aVar.i) {
            throw new IllegalStateException("Not on back stack");
        }
        this.f2309b = new ArrayList<>(size);
        this.c = new int[size];
        this.d = new int[size];
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            k.a aVar2 = aVar.c.get(i2);
            int i3 = i + 1;
            this.f2308a[i] = aVar2.f2427a;
            ArrayList<String> arrayList = this.f2309b;
            Fragment fragment = aVar2.f2428b;
            arrayList.add(fragment != null ? fragment.mWho : null);
            int[] iArr = this.f2308a;
            iArr[i3] = aVar2.c ? 1 : 0;
            iArr[i + 2] = aVar2.d;
            iArr[i + 3] = aVar2.e;
            int i4 = i + 5;
            iArr[i + 4] = aVar2.f;
            i += 6;
            iArr[i4] = aVar2.g;
            this.c[i2] = aVar2.h.ordinal();
            this.d[i2] = aVar2.i.ordinal();
        }
        this.e = aVar.h;
        this.f = aVar.f2425k;
        this.g = aVar.v;
        this.h = aVar.l;
        this.i = aVar.m;
        this.j = aVar.n;
        this.f2310k = aVar.o;
        this.l = aVar.p;
        this.m = aVar.q;
        this.n = aVar.f2426r;
    }

    public final void a(androidx.fragment.app.a aVar) {
        int i = 0;
        int i2 = 0;
        while (true) {
            boolean z = true;
            if (i >= this.f2308a.length) {
                aVar.h = this.e;
                aVar.f2425k = this.f;
                aVar.i = true;
                aVar.l = this.h;
                aVar.m = this.i;
                aVar.n = this.j;
                aVar.o = this.f2310k;
                aVar.p = this.l;
                aVar.q = this.m;
                aVar.f2426r = this.n;
                return;
            }
            k.a aVar2 = new k.a();
            int i3 = i + 1;
            aVar2.f2427a = this.f2308a[i];
            if (FragmentManager.M0(2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Instantiate ");
                sb.append(aVar);
                sb.append(" op #");
                sb.append(i2);
                sb.append(" base fragment #");
                sb.append(this.f2308a[i3]);
            }
            aVar2.h = Lifecycle.State.values()[this.c[i2]];
            aVar2.i = Lifecycle.State.values()[this.d[i2]];
            int[] iArr = this.f2308a;
            int i4 = i + 2;
            if (iArr[i3] == 0) {
                z = false;
            }
            aVar2.c = z;
            int i5 = iArr[i4];
            aVar2.d = i5;
            int i6 = iArr[i + 3];
            aVar2.e = i6;
            int i7 = i + 5;
            int i8 = iArr[i + 4];
            aVar2.f = i8;
            i += 6;
            int i9 = iArr[i7];
            aVar2.g = i9;
            aVar.d = i5;
            aVar.e = i6;
            aVar.f = i8;
            aVar.g = i9;
            aVar.h(aVar2);
            i2++;
        }
    }

    public androidx.fragment.app.a c(FragmentManager fragmentManager) {
        androidx.fragment.app.a aVar = new androidx.fragment.app.a(fragmentManager);
        a(aVar);
        aVar.v = this.g;
        for (int i = 0; i < this.f2309b.size(); i++) {
            String str = this.f2309b.get(i);
            if (str != null) {
                aVar.c.get(i).f2428b = fragmentManager.h0(str);
            }
        }
        aVar.G(1);
        return aVar;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeIntArray(this.f2308a);
        parcel.writeStringList(this.f2309b);
        parcel.writeIntArray(this.c);
        parcel.writeIntArray(this.d);
        parcel.writeInt(this.e);
        parcel.writeString(this.f);
        parcel.writeInt(this.g);
        parcel.writeInt(this.h);
        TextUtils.writeToParcel(this.i, parcel, 0);
        parcel.writeInt(this.j);
        TextUtils.writeToParcel(this.f2310k, parcel, 0);
        parcel.writeStringList(this.l);
        parcel.writeStringList(this.m);
        parcel.writeInt(this.n ? 1 : 0);
    }

    public BackStackRecordState(Parcel parcel) {
        this.f2308a = parcel.createIntArray();
        this.f2309b = parcel.createStringArrayList();
        this.c = parcel.createIntArray();
        this.d = parcel.createIntArray();
        this.e = parcel.readInt();
        this.f = parcel.readString();
        this.g = parcel.readInt();
        this.h = parcel.readInt();
        Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.i = (CharSequence) creator.createFromParcel(parcel);
        this.j = parcel.readInt();
        this.f2310k = (CharSequence) creator.createFromParcel(parcel);
        this.l = parcel.createStringArrayList();
        this.m = parcel.createStringArrayList();
        this.n = parcel.readInt() != 0;
    }
}
