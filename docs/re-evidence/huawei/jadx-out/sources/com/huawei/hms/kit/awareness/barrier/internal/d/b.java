package com.huawei.hms.kit.awareness.barrier.internal.d;

import android.os.Parcel;
import android.os.Parcelable;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

/* JADX INFO: loaded from: classes34.dex */
public class b extends f {
    public static final Parcelable.Creator<b> CREATOR = new Parcelable.Creator<b>() { // from class: com.huawei.hms.kit.awareness.barrier.internal.d.b.1
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public b[] newArray(int i) {
            return new b[i];
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public b createFromParcel(Parcel parcel) {
            return new b(parcel);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f13980a = "BeaconParameter";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<com.huawei.hms.kit.awareness.a.a.b> f13981b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f13982c;
    private String d;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeList(this.f13981b);
        parcel.writeInt(this.f13982c);
    }

    public String toString() {
        if (this.d == null) {
            final StringBuilder sb = new StringBuilder();
            sb.append(this.f13982c);
            this.f13981b.forEach(new Consumer() { // from class: com.huawei.hms.kit.awareness.barrier.internal.d.b$$ExternalSyntheticLambda0
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    b.a(sb, (com.huawei.hms.kit.awareness.a.a.b) obj);
                }
            });
            this.d = new String(com.huawei.hms.kit.awareness.barrier.internal.f.a.a(sb.toString().getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        }
        return this.d;
    }

    public int hashCode() {
        return toString().hashCode();
    }

    @Override // com.huawei.hms.kit.awareness.barrier.internal.d.f
    public boolean g() {
        return c() && d();
    }

    public boolean equals(Object obj) {
        if ((obj instanceof b) && hashCode() == obj.hashCode()) {
            return toString().equals(((b) obj).toString());
        }
        return false;
    }

    public int b() {
        return this.f13982c;
    }

    public List<com.huawei.hms.kit.awareness.a.a.b> a() {
        return this.f13981b;
    }

    private boolean d() {
        int i = this.f13982c;
        if (i == 0 || i == 2 || i == 1) {
            return true;
        }
        com.huawei.hms.kit.awareness.b.a.c.d(f13980a, "beaconType is invalid,the type is:" + this.f13982c, new Object[0]);
        return false;
    }

    private boolean c() {
        Iterator<com.huawei.hms.kit.awareness.a.a.b> it = this.f13981b.iterator();
        while (it.hasNext()) {
            if (!it.next().d()) {
                com.huawei.hms.kit.awareness.b.a.c.d(f13980a, "beaconFilter is invalid.", new Object[0]);
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(StringBuilder sb, com.huawei.hms.kit.awareness.a.a.b bVar) {
        sb.append(bVar.toString());
    }

    public b(List<com.huawei.hms.kit.awareness.a.a.b> list, int i) {
        this.f13981b = list;
        this.f13982c = i;
    }

    private b(Parcel parcel) {
        ArrayList arrayList = new ArrayList();
        this.f13981b = arrayList;
        parcel.readList(arrayList, com.huawei.hms.kit.awareness.a.a.b.class.getClassLoader());
        this.f13982c = parcel.readInt();
    }
}
