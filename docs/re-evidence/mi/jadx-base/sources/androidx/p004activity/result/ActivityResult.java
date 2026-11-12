package androidx.p004activity.result;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
public final class ActivityResult implements Parcelable {
    public static final Parcelable.Creator<ActivityResult> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f1384a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Intent f1385b;

    public class a implements Parcelable.Creator<ActivityResult> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ActivityResult createFromParcel(Parcel parcel) {
            return new ActivityResult(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public ActivityResult[] newArray(int i) {
            return new ActivityResult[i];
        }
    }

    public ActivityResult(int i, Intent intent) {
        this.f1384a = i;
        this.f1385b = intent;
    }

    public static String d(int i) {
        if (i != -1) {
            return i != 0 ? String.valueOf(i) : "RESULT_CANCELED";
        }
        return "RESULT_OK";
    }

    public Intent a() {
        return this.f1385b;
    }

    public int c() {
        return this.f1384a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "ActivityResult{resultCode=" + d(this.f1384a) + ", data=" + this.f1385b + AbstractJsonLexerKt.END_OBJ;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f1384a);
        parcel.writeInt(this.f1385b == null ? 0 : 1);
        Intent intent = this.f1385b;
        if (intent != null) {
            intent.writeToParcel(parcel, i);
        }
    }

    public ActivityResult(Parcel parcel) {
        this.f1384a = parcel.readInt();
        this.f1385b = parcel.readInt() == 0 ? null : (Intent) Intent.CREATOR.createFromParcel(parcel);
    }
}
