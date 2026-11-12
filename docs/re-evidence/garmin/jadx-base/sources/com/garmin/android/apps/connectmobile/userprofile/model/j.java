package com.garmin.android.apps.connectmobile.userprofile.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.JsonAdapter;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s0;

/* JADX INFO: loaded from: classes10.dex */
@JsonAdapter(ProfileImageUrlJsonAdapter.class)
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB\u001d\u0012\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/garmin/android/apps/connectmobile/userprofile/model/j;", "Landroid/os/Parcelable;", "", "Lcom/garmin/android/apps/connectmobile/userprofile/model/k;", "", "profileImageUrlMap", "<init>", "(Ljava/util/Map;)V", "a", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class j implements Parcelable {
    public static final Parcelable.Creator<j> CREATOR;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f46870j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f46871k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map<k, String> f46872a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f46873b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f46874c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f46875d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f46876e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f46877f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f46878g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f46879h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f46880i;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<j> {
        @Override // android.os.Parcelable.Creator
        public final j createFromParcel(Parcel parcel) {
            parcel.getClass();
            int i14 = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(i14);
            for (int i15 = 0; i15 != i14; i15++) {
                linkedHashMap.put(k.valueOf(parcel.readString()), parcel.readString());
            }
            return new j(linkedHashMap);
        }

        @Override // android.os.Parcelable.Creator
        public final j[] newArray(int i14) {
            return new j[i14];
        }
    }

    static {
        new a(null);
        CREATOR = new b();
        f46870j = 8;
        f46871k = s0.f105811a.b(j.class).D();
    }

    public j(Map<k, String> map) {
        map.getClass();
        this.f46872a = map;
        map.get(k.PROFILE);
        this.f46873b = map.get(k.PROFILE_FRIEND);
        this.f46874c = map.get(k.PROFILE_THUMBNAIL);
        this.f46875d = map.get(k.FRAMED_PROFILE);
        this.f46876e = map.get(k.FRAMED_FRIEND);
        this.f46877f = map.get(k.FRAMED_THUMBNAIL);
        this.f46878g = map.get(k.PREMIUM_PROFILE);
        this.f46879h = map.get(k.PREMIUM_FRIEND);
        this.f46880i = map.get(k.PREMIUM_THUMBNAIL);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getF46879h() {
        return this.f46879h;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        Iterator itU = am.j.u(this.f46872a, parcel);
        while (itU.hasNext()) {
            Map.Entry entry = (Map.Entry) itU.next();
            parcel.writeString(((k) entry.getKey()).name());
            parcel.writeString((String) entry.getValue());
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/userprofile/model/j$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
