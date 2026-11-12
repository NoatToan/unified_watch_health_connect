package com.chenenyu.router;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class RouteRequest implements Parcelable {
    public static final Parcelable.Creator<RouteRequest> CREATOR = new a();
    private static final int o = -1;
    private Uri a;
    private Bundle b;
    private int c;
    private Uri d;
    private String e;
    private String f;
    private boolean g;
    private boolean h;

    @Nullable
    private Map<String, Boolean> i;

    @Nullable
    private RouteCallback j;
    private int k;
    private int l;
    private int m;

    @Nullable
    private Bundle n;

    public static class a implements Parcelable.Creator<RouteRequest> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public RouteRequest createFromParcel(Parcel parcel) {
            return new RouteRequest(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public RouteRequest[] newArray(int i) {
            return new RouteRequest[i];
        }
    }

    public RouteRequest(Uri uri) {
        this.k = -1;
        this.l = -1;
        this.m = -1;
        this.a = uri;
    }

    public void addFlags(int i) {
        this.c = i | this.c;
    }

    public void addInterceptors(String... strArr) {
        if (strArr == null || strArr.length <= 0) {
            return;
        }
        if (this.i == null) {
            this.i = new LinkedHashMap(strArr.length);
        }
        for (String str : strArr) {
            this.i.put(str, Boolean.TRUE);
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getAction() {
        return this.f;
    }

    @Nullable
    public Bundle getActivityOptionsBundle() {
        return this.n;
    }

    public Uri getData() {
        return this.d;
    }

    public int getEnterAnim() {
        return this.l;
    }

    public int getExitAnim() {
        return this.m;
    }

    public Bundle getExtras() {
        return this.b;
    }

    public int getFlags() {
        return this.c;
    }

    public int getRequestCode() {
        return this.k;
    }

    @Nullable
    public RouteCallback getRouteCallback() {
        return this.j;
    }

    @Nullable
    public Map<String, Boolean> getTempInterceptors() {
        return this.i;
    }

    public String getType() {
        return this.e;
    }

    public Uri getUri() {
        return this.a;
    }

    public boolean isSkipImplicitMatcher() {
        return this.g;
    }

    public boolean isSkipInterceptors() {
        return this.h;
    }

    public void removeInterceptors(String... strArr) {
        if (strArr == null || strArr.length <= 0) {
            return;
        }
        if (this.i == null) {
            this.i = new LinkedHashMap(strArr.length);
        }
        for (String str : strArr) {
            this.i.put(str, Boolean.FALSE);
        }
    }

    public void setAction(String str) {
        this.f = str;
    }

    public void setActivityOptionsBundle(@Nullable Bundle bundle) {
        this.n = bundle;
    }

    public void setData(Uri uri) {
        this.d = uri;
    }

    public void setEnterAnim(int i) {
        if (i < 0) {
            this.l = -1;
        } else {
            this.l = i;
        }
    }

    public void setExitAnim(int i) {
        if (i < 0) {
            this.m = -1;
        } else {
            this.m = i;
        }
    }

    public void setExtras(Bundle bundle) {
        this.b = bundle;
    }

    public void setFlags(int i) {
        this.c = i;
    }

    public void setRequestCode(int i) {
        if (i < 0) {
            this.k = -1;
        } else {
            this.k = i;
        }
    }

    public void setRouteCallback(@Nullable RouteCallback routeCallback) {
        this.j = routeCallback;
    }

    public void setSkipImplicitMatcher(boolean z) {
        this.g = z;
    }

    public void setSkipInterceptors(boolean z) {
        this.h = z;
    }

    public void setType(String str) {
        this.e = str;
    }

    public void setUri(Uri uri) {
        this.a = uri;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        parcel.writeBundle(this.b);
        parcel.writeInt(this.c);
        parcel.writeParcelable(this.d, i);
        parcel.writeString(this.e);
        parcel.writeString(this.f);
        parcel.writeByte(this.h ? (byte) 1 : (byte) 0);
        Map<String, Boolean> map = this.i;
        parcel.writeInt(map == null ? 0 : map.size());
        Map<String, Boolean> map2 = this.i;
        if (map2 != null) {
            for (Map.Entry<String, Boolean> entry : map2.entrySet()) {
                parcel.writeString(entry.getKey());
                parcel.writeValue(entry.getValue());
            }
        }
        parcel.writeSerializable(this.j);
        parcel.writeInt(this.k);
        parcel.writeInt(this.l);
        parcel.writeInt(this.m);
        parcel.writeBundle(this.n);
    }

    public RouteRequest(Parcel parcel) {
        this.k = -1;
        this.l = -1;
        this.m = -1;
        this.a = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.b = parcel.readBundle(Bundle.class.getClassLoader());
        this.c = parcel.readInt();
        this.d = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.e = parcel.readString();
        this.f = parcel.readString();
        this.h = parcel.readByte() != 0;
        int i = parcel.readInt();
        this.i = new LinkedHashMap(i);
        for (int i2 = 0; i2 < i; i2++) {
            this.i.put(parcel.readString(), (Boolean) parcel.readValue(Boolean.class.getClassLoader()));
        }
        this.j = (RouteCallback) parcel.readSerializable();
        this.k = parcel.readInt();
        this.l = parcel.readInt();
        this.m = parcel.readInt();
        this.n = parcel.readBundle(Bundle.class.getClassLoader());
    }
}
