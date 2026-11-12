package com.linecorp.linesdk;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.PrintWriter;
import java.io.StringWriter;

/* JADX INFO: loaded from: classes18.dex */
public class LineApiError implements Parcelable {
    public static final Parcelable.Creator<LineApiError> CREATOR = new a();
    public static final LineApiError DEFAULT = new LineApiError(-1, "");
    private static final int c = -1;
    private final int a;

    @Nullable
    private final String b;

    public static class a implements Parcelable.Creator<LineApiError> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final LineApiError createFromParcel(Parcel parcel) {
            return new LineApiError(parcel, (a) null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final LineApiError[] newArray(int i) {
            return new LineApiError[i];
        }
    }

    public /* synthetic */ LineApiError(Parcel parcel, a aVar) {
        this(parcel);
    }

    @Nullable
    private static String a(@Nullable Exception exc) {
        if (exc == null) {
            return null;
        }
        StringWriter stringWriter = new StringWriter();
        exc.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            LineApiError lineApiError = (LineApiError) obj;
            if (this.a != lineApiError.a) {
                return false;
            }
            String str = this.b;
            String str2 = lineApiError.b;
            if (str != null) {
                return str.equals(str2);
            }
            if (str2 == null) {
                return true;
            }
        }
        return false;
    }

    public int getHttpResponseCode() {
        return this.a;
    }

    @Nullable
    public String getMessage() {
        return this.b;
    }

    public int hashCode() {
        int i = this.a * 31;
        String str = this.b;
        return i + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "LineApiError{httpResponseCode=" + this.a + ", message='" + this.b + "'}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeString(this.b);
    }

    public LineApiError(@Nullable Exception exc) {
        this(-1, a(exc));
    }

    public LineApiError(@Nullable String str) {
        this(-1, str);
    }

    public LineApiError(int i, @Nullable Exception exc) {
        this(i, a(exc));
    }

    public LineApiError(int i, @Nullable String str) {
        this.a = i;
        this.b = str;
    }

    private LineApiError(@NonNull Parcel parcel) {
        this.a = parcel.readInt();
        this.b = parcel.readString();
    }
}
