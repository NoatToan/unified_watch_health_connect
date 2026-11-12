package com.linecorp.linesdk.auth;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.linecorp.linesdk.LineAccessToken;
import com.linecorp.linesdk.LineApiError;
import com.linecorp.linesdk.LineApiResponseCode;
import com.linecorp.linesdk.LineCredential;
import com.linecorp.linesdk.LineProfile;

/* JADX INFO: loaded from: classes18.dex */
public class LineLoginResult implements Parcelable {
    public static final LineLoginResult CANCEL = new LineLoginResult(LineApiResponseCode.CANCEL, LineApiError.DEFAULT);
    public static final Parcelable.Creator<LineLoginResult> CREATOR = new a();

    @NonNull
    private final LineApiResponseCode a;

    @Nullable
    private final LineProfile b;

    @Nullable
    private final LineCredential c;

    @NonNull
    private final LineApiError d;

    public static class a implements Parcelable.Creator<LineLoginResult> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final LineLoginResult createFromParcel(Parcel parcel) {
            return new LineLoginResult(parcel, (a) null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final LineLoginResult[] newArray(int i) {
            return new LineLoginResult[i];
        }
    }

    public /* synthetic */ LineLoginResult(Parcel parcel, a aVar) {
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
        LineLoginResult lineLoginResult = (LineLoginResult) obj;
        if (this.a != lineLoginResult.a) {
            return false;
        }
        LineProfile lineProfile = this.b;
        if (lineProfile == null ? lineLoginResult.b != null : !lineProfile.equals(lineLoginResult.b)) {
            return false;
        }
        LineCredential lineCredential = this.c;
        if (lineCredential == null ? lineLoginResult.c == null : lineCredential.equals(lineLoginResult.c)) {
            return this.d.equals(lineLoginResult.d);
        }
        return false;
    }

    @NonNull
    public LineApiError getErrorData() {
        return this.d;
    }

    @Nullable
    public LineCredential getLineCredential() {
        return this.c;
    }

    @Nullable
    public LineProfile getLineProfile() {
        return this.b;
    }

    @NonNull
    public LineApiResponseCode getResponseCode() {
        return this.a;
    }

    public int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        LineProfile lineProfile = this.b;
        int iHashCode2 = (iHashCode + (lineProfile != null ? lineProfile.hashCode() : 0)) * 31;
        LineCredential lineCredential = this.c;
        return ((iHashCode2 + (lineCredential != null ? lineCredential.hashCode() : 0)) * 31) + this.d.hashCode();
    }

    public boolean isSuccess() {
        return this.a == LineApiResponseCode.SUCCESS;
    }

    public String toString() {
        return "LineLoginResult{errorData=" + this.d + ", responseCode=" + this.a + ", lineProfile=" + this.b + ", lineCredential=" + this.c + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeSerializable(this.a);
        parcel.writeParcelable(this.b, i);
        parcel.writeParcelable(this.c, i);
        parcel.writeParcelable(this.d, i);
    }

    public LineLoginResult(@NonNull LineProfile lineProfile, @NonNull LineCredential lineCredential) {
        this(LineApiResponseCode.SUCCESS, lineProfile, lineCredential, LineApiError.DEFAULT);
    }

    public LineLoginResult(@NonNull LineApiResponseCode lineApiResponseCode, @NonNull LineApiError lineApiError) {
        this(lineApiResponseCode, null, null, lineApiError);
    }

    @VisibleForTesting
    public LineLoginResult(@NonNull LineApiResponseCode lineApiResponseCode, @Nullable LineProfile lineProfile, @Nullable LineCredential lineCredential, @NonNull LineApiError lineApiError) {
        this.a = lineApiResponseCode;
        this.b = lineProfile;
        this.c = lineCredential;
        this.d = lineApiError;
    }

    private LineLoginResult(@NonNull Parcel parcel) {
        this.a = (LineApiResponseCode) parcel.readSerializable();
        this.b = (LineProfile) parcel.readParcelable(LineProfile.class.getClassLoader());
        this.c = (LineCredential) parcel.readParcelable(LineAccessToken.class.getClassLoader());
        this.d = (LineApiError) parcel.readParcelable(LineApiError.class.getClassLoader());
    }
}
