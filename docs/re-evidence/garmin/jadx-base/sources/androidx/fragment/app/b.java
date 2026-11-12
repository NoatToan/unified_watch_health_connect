package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
public final class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f7130a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList<String> f7131b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int[] f7132c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int[] f7133d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f7134e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f7135f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f7136g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f7137h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final CharSequence f7138i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f7139j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final CharSequence f7140k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ArrayList<String> f7141l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ArrayList<String> f7142m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f7143n;

    public class a implements Parcelable.Creator<b> {
        @Override // android.os.Parcelable.Creator
        public final b createFromParcel(Parcel parcel) {
            return new b(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final b[] newArray(int i14) {
            return new b[i14];
        }
    }

    public b(androidx.fragment.app.a aVar) {
        int size = aVar.f7235c.size();
        this.f7130a = new int[size * 6];
        if (!aVar.f7241i) {
            vb.h.z("Not on back stack");
            throw null;
        }
        this.f7131b = new ArrayList<>(size);
        this.f7132c = new int[size];
        this.f7133d = new int[size];
        int i14 = 0;
        for (int i15 = 0; i15 < size; i15++) {
            g0.a aVar2 = aVar.f7235c.get(i15);
            int i16 = i14 + 1;
            this.f7130a[i14] = aVar2.f7252a;
            ArrayList<String> arrayList = this.f7131b;
            Fragment fragment = aVar2.f7253b;
            arrayList.add(fragment != null ? fragment.mWho : null);
            int[] iArr = this.f7130a;
            iArr[i16] = aVar2.f7254c ? 1 : 0;
            iArr[i14 + 2] = aVar2.f7255d;
            iArr[i14 + 3] = aVar2.f7256e;
            int i17 = i14 + 5;
            iArr[i14 + 4] = aVar2.f7257f;
            i14 += 6;
            iArr[i17] = aVar2.f7258g;
            this.f7132c[i15] = aVar2.f7259h.ordinal();
            this.f7133d[i15] = aVar2.f7260i.ordinal();
        }
        this.f7134e = aVar.f7240h;
        this.f7135f = aVar.f7243k;
        this.f7136g = aVar.f7128v;
        this.f7137h = aVar.f7244l;
        this.f7138i = aVar.f7245m;
        this.f7139j = aVar.f7246n;
        this.f7140k = aVar.f7247o;
        this.f7141l = aVar.f7248p;
        this.f7142m = aVar.f7249q;
        this.f7143n = aVar.f7250r;
    }

    public final void b(androidx.fragment.app.a aVar) {
        int i14 = 0;
        int i15 = 0;
        while (true) {
            int[] iArr = this.f7130a;
            boolean z14 = true;
            if (i14 >= iArr.length) {
                aVar.f7240h = this.f7134e;
                aVar.f7243k = this.f7135f;
                aVar.f7241i = true;
                aVar.f7244l = this.f7137h;
                aVar.f7245m = this.f7138i;
                aVar.f7246n = this.f7139j;
                aVar.f7247o = this.f7140k;
                aVar.f7248p = this.f7141l;
                aVar.f7249q = this.f7142m;
                aVar.f7250r = this.f7143n;
                return;
            }
            g0.a aVar2 = new g0.a();
            int i16 = i14 + 1;
            aVar2.f7252a = iArr[i14];
            if (v.R(2)) {
                Objects.toString(aVar);
                int i17 = iArr[i16];
            }
            aVar2.f7259h = androidx.lifecycle.b0.b.values()[this.f7132c[i15]];
            aVar2.f7260i = androidx.lifecycle.b0.b.values()[this.f7133d[i15]];
            int i18 = i14 + 2;
            if (iArr[i16] == 0) {
                z14 = false;
            }
            aVar2.f7254c = z14;
            int i19 = iArr[i18];
            aVar2.f7255d = i19;
            int i24 = iArr[i14 + 3];
            aVar2.f7256e = i24;
            int i25 = i14 + 5;
            int i26 = iArr[i14 + 4];
            aVar2.f7257f = i26;
            i14 += 6;
            int i27 = iArr[i25];
            aVar2.f7258g = i27;
            aVar.f7236d = i19;
            aVar.f7237e = i24;
            aVar.f7238f = i26;
            aVar.f7239g = i27;
            aVar.c(aVar2);
            i15++;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.writeIntArray(this.f7130a);
        parcel.writeStringList(this.f7131b);
        parcel.writeIntArray(this.f7132c);
        parcel.writeIntArray(this.f7133d);
        parcel.writeInt(this.f7134e);
        parcel.writeString(this.f7135f);
        parcel.writeInt(this.f7136g);
        parcel.writeInt(this.f7137h);
        TextUtils.writeToParcel(this.f7138i, parcel, 0);
        parcel.writeInt(this.f7139j);
        TextUtils.writeToParcel(this.f7140k, parcel, 0);
        parcel.writeStringList(this.f7141l);
        parcel.writeStringList(this.f7142m);
        parcel.writeInt(this.f7143n ? 1 : 0);
    }

    public b(Parcel parcel) {
        this.f7130a = parcel.createIntArray();
        this.f7131b = parcel.createStringArrayList();
        this.f7132c = parcel.createIntArray();
        this.f7133d = parcel.createIntArray();
        this.f7134e = parcel.readInt();
        this.f7135f = parcel.readString();
        this.f7136g = parcel.readInt();
        this.f7137h = parcel.readInt();
        Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.f7138i = (CharSequence) creator.createFromParcel(parcel);
        this.f7139j = parcel.readInt();
        this.f7140k = (CharSequence) creator.createFromParcel(parcel);
        this.f7141l = parcel.createStringArrayList();
        this.f7142m = parcel.createStringArrayList();
        this.f7143n = parcel.readInt() != 0;
    }
}
