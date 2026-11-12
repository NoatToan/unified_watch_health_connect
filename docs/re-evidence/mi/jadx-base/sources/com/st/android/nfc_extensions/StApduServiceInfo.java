package com.st.android.nfc_extensions;

import android.content.ComponentName;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
public final class StApduServiceInfo implements Parcelable {
    public static final Parcelable.Creator<StApduServiceInfo> CREATOR = new a();
    public static final int SECURE_ELEMENT_ROUTE_ESE = 1;
    public static final int SECURE_ELEMENT_ROUTE_UICC = 2;
    public static final int SECURE_ELEMENT_ROUTE_UICC2 = 4;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ResolveInfo f10617a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f10618b;
    public final boolean c;
    public String d;
    public final String e;
    public final HashMap<String, StAidGroup> f;
    public final HashMap<String, StAidGroup> g;
    public final boolean h;
    public final int i;
    public final int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f10619k;
    public final Drawable l;
    public int m;
    public boolean n;

    public class a implements Parcelable.Creator<StApduServiceInfo> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public StApduServiceInfo createFromParcel(Parcel parcel) {
            Bitmap bitmap;
            ResolveInfo resolveInfo = (ResolveInfo) ResolveInfo.CREATOR.createFromParcel(parcel);
            String string = parcel.readString();
            boolean z = parcel.readInt() != 0;
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            ArrayList arrayList = new ArrayList();
            if (parcel.readInt() > 0) {
                parcel.readTypedList(arrayList, StAidGroup.CREATOR);
            }
            ArrayList arrayList2 = new ArrayList();
            if (parcel.readInt() > 0) {
                parcel.readTypedList(arrayList2, StAidGroup.CREATOR);
            }
            StApduServiceInfo stApduServiceInfo = new StApduServiceInfo(resolveInfo, z, string, arrayList, arrayList2, parcel.readInt() != 0, parcel.readInt(), parcel.readInt(), parcel.readString(), string2, string3, (getClass().getClassLoader() == null || (bitmap = (Bitmap) parcel.readParcelable(getClass().getClassLoader())) == null) ? null : new BitmapDrawable(bitmap));
            stApduServiceInfo.c("other", parcel.readInt());
            return stApduServiceInfo;
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public StApduServiceInfo[] newArray(int i) {
            return new StApduServiceInfo[i];
        }
    }

    public StApduServiceInfo(ResolveInfo resolveInfo, boolean z, String str, ArrayList<StAidGroup> arrayList, ArrayList<StAidGroup> arrayList2, boolean z2, int i, int i2, String str2, String str3, String str4, Drawable drawable) {
        StringBuilder sb = new StringBuilder();
        sb.append("Constructor - offHost: ");
        sb.append(str3);
        sb.append(", description: ");
        sb.append(str);
        sb.append(", nb of staticStAidGroups: ");
        sb.append(arrayList.size());
        sb.append(", nb of dynamicStAidGroups: ");
        sb.append(arrayList2.size());
        this.f10617a = resolveInfo;
        this.f10618b = str;
        this.f = new HashMap<>();
        this.g = new HashMap<>();
        this.d = str3;
        this.e = str4;
        this.c = z;
        this.h = z2;
        this.l = drawable;
        this.m = 2;
        this.n = true;
        for (StAidGroup stAidGroup : arrayList) {
            this.f.put(stAidGroup.a(), stAidGroup);
        }
        for (StAidGroup stAidGroup2 : arrayList2) {
            this.g.put(stAidGroup2.a(), stAidGroup2);
        }
        this.i = i;
        this.j = i2;
        this.f10619k = str2;
    }

    public ComponentName a() {
        ServiceInfo serviceInfo = this.f10617a.serviceInfo;
        return new ComponentName(serviceInfo.packageName, serviceInfo.name);
    }

    public int c(String str, int i) {
        if (str != "other") {
            return 1;
        }
        this.m = i;
        return i;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof StApduServiceInfo) {
            return ((StApduServiceInfo) obj).a().equals(a());
        }
        return false;
    }

    public int hashCode() {
        return a().hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("StApduService: ");
        sb.append(a());
        sb.append(", description: " + this.f10618b);
        sb.append(", Static AID Groups: ");
        Iterator<StAidGroup> it = this.f.values().iterator();
        while (it.hasNext()) {
            sb.append(it.next().toString());
        }
        sb.append(", Dynamic AID Groups: ");
        Iterator<StAidGroup> it2 = this.g.values().iterator();
        while (it2.hasNext()) {
            sb.append(it2.next().toString());
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        this.f10617a.writeToParcel(parcel, i);
        parcel.writeString(this.f10618b);
        parcel.writeInt(this.c ? 1 : 0);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        parcel.writeInt(this.f.size());
        if (this.f.size() > 0) {
            parcel.writeTypedList(new ArrayList(this.f.values()));
        }
        parcel.writeInt(this.g.size());
        if (this.g.size() > 0) {
            parcel.writeTypedList(new ArrayList(this.g.values()));
        }
        parcel.writeInt(this.h ? 1 : 0);
        parcel.writeInt(this.i);
        parcel.writeInt(this.j);
        parcel.writeString(this.f10619k);
        Drawable drawable = this.l;
        if (drawable != null) {
            parcel.writeParcelable(((BitmapDrawable) drawable).getBitmap(), i);
        } else {
            parcel.writeParcelable(null, i);
        }
        parcel.writeInt(this.m);
    }
}
