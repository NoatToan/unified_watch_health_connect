package com.huawei.hms.kit.awareness.b;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.function.Consumer;

/* JADX INFO: loaded from: classes34.dex */
public class c implements Parcelable {
    public static final Parcelable.Creator<c> CREATOR = new Parcelable.Creator<c>() { // from class: com.huawei.hms.kit.awareness.b.c.1
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public c[] newArray(int i) {
            return new c[i];
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public c createFromParcel(Parcel parcel) {
            return new c(parcel);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f13896a = "BeaconFilterRequest";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f13897b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<com.huawei.hms.kit.awareness.a.a.b> f13898c;
    private e d;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f13897b);
        parcel.writeList(this.f13898c);
        parcel.writeParcelable(this.d, i);
    }

    public boolean d() {
        List<com.huawei.hms.kit.awareness.a.a.b> list;
        if (this.f13897b == null || (list = this.f13898c) == null || this.d == null) {
            com.huawei.hms.kit.awareness.b.a.c.d(f13896a, "request object is invalid", new Object[0]);
            return false;
        }
        Iterator<com.huawei.hms.kit.awareness.a.a.b> it = list.iterator();
        while (it.hasNext()) {
            if (!it.next().d()) {
                com.huawei.hms.kit.awareness.b.a.c.d(f13896a, "beacon filter is invalid", new Object[0]);
                return false;
            }
        }
        return true;
    }

    public e c() {
        return this.d;
    }

    public List<com.huawei.hms.kit.awareness.a.a.b> b() {
        return Collections.unmodifiableList(this.f13898c);
    }

    public String a() {
        return this.f13897b;
    }

    private void e() {
        if (this.f13898c == null) {
            this.f13898c = new ArrayList();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(List list, com.huawei.hms.kit.awareness.a.a.b bVar) {
        list.add(com.huawei.hms.kit.awareness.a.a.b.a(bVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(List<com.huawei.hms.kit.awareness.a.a.b> list) {
        e();
        final ArrayList arrayList = new ArrayList();
        list.forEach(new Consumer() { // from class: com.huawei.hms.kit.awareness.b.c$$ExternalSyntheticLambda0
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                c.a(arrayList, (com.huawei.hms.kit.awareness.a.a.b) obj);
            }
        });
        this.f13898c.addAll(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(e eVar) {
        this.d = eVar;
    }

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final c f13899a = new c(UUID.randomUUID().toString());

        public c a() {
            com.huawei.hms.kit.awareness.barrier.internal.f.b.a(this.f13899a.f13897b);
            com.huawei.hms.kit.awareness.barrier.internal.f.b.a(this.f13899a.f13898c);
            com.huawei.hms.kit.awareness.barrier.internal.f.b.a(this.f13899a.d);
            return this.f13899a;
        }

        public a a(List<com.huawei.hms.kit.awareness.a.a.b> list) {
            this.f13899a.a(list);
            return this;
        }

        public a a(e eVar) {
            this.f13899a.a(eVar);
            return this;
        }
    }

    private c(String str) {
        this.f13898c = new ArrayList();
        this.f13897b = str;
    }

    private c(Parcel parcel) {
        this.f13898c = new ArrayList();
        this.f13897b = parcel.readString();
        parcel.readList(this.f13898c, com.huawei.hms.kit.awareness.a.a.b.class.getClassLoader());
        this.d = (e) parcel.readParcelable(e.class.getClassLoader());
    }
}
