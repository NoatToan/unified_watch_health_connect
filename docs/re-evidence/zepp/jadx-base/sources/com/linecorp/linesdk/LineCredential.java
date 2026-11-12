package com.linecorp.linesdk;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public class LineCredential implements Parcelable {
    public static final Parcelable.Creator<LineCredential> CREATOR = new a();

    @NonNull
    private final LineAccessToken a;

    @NonNull
    private final List<String> b;

    public static class a implements Parcelable.Creator<LineCredential> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final LineCredential createFromParcel(Parcel parcel) {
            return new LineCredential(parcel, (a) null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final LineCredential[] newArray(int i) {
            return new LineCredential[i];
        }
    }

    public /* synthetic */ LineCredential(Parcel parcel, a aVar) {
        this(parcel);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        LineCredential lineCredential = (LineCredential) obj;
        if (this.a.equals(lineCredential.a)) {
            return this.b.equals(lineCredential.b);
        }
        return false;
    }

    @NonNull
    public LineAccessToken getAccessToken() {
        return this.a;
    }

    @NonNull
    public List<String> getPermission() {
        return this.b;
    }

    public int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public String toString() {
        return "LineCredential{accessToken=" + ((Object) "#####") + ", permission=" + this.b + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        parcel.writeStringList(this.b);
    }

    public LineCredential(@NonNull LineAccessToken lineAccessToken, @NonNull List<String> list) {
        this.a = lineAccessToken;
        this.b = list;
    }

    private LineCredential(@NonNull Parcel parcel) {
        this.a = (LineAccessToken) parcel.readParcelable(LineAccessToken.class.getClassLoader());
        ArrayList arrayList = new ArrayList(8);
        parcel.readStringList(arrayList);
        this.b = Collections.unmodifiableList(arrayList);
    }
}
