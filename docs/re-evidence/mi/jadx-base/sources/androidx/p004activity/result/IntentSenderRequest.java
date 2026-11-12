package androidx.p004activity.result;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
public final class IntentSenderRequest implements Parcelable {
    public static final Parcelable.Creator<IntentSenderRequest> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IntentSender f1398a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Intent f1399b;
    public final int c;
    public final int d;

    public class a implements Parcelable.Creator<IntentSenderRequest> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public IntentSenderRequest createFromParcel(Parcel parcel) {
            return new IntentSenderRequest(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public IntentSenderRequest[] newArray(int i) {
            return new IntentSenderRequest[i];
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public IntentSender f1400a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Intent f1401b;
        public int c;
        public int d;

        public b(IntentSender intentSender) {
            this.f1400a = intentSender;
        }

        public IntentSenderRequest a() {
            return new IntentSenderRequest(this.f1400a, this.f1401b, this.c, this.d);
        }

        public b b(Intent intent) {
            this.f1401b = intent;
            return this;
        }

        public b c(int i, int i2) {
            this.d = i;
            this.c = i2;
            return this;
        }
    }

    public IntentSenderRequest(IntentSender intentSender, Intent intent, int i, int i2) {
        this.f1398a = intentSender;
        this.f1399b = intent;
        this.c = i;
        this.d = i2;
    }

    public Intent a() {
        return this.f1399b;
    }

    public int c() {
        return this.c;
    }

    public int d() {
        return this.d;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public IntentSender e() {
        return this.f1398a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f1398a, i);
        parcel.writeParcelable(this.f1399b, i);
        parcel.writeInt(this.c);
        parcel.writeInt(this.d);
    }

    public IntentSenderRequest(Parcel parcel) {
        this.f1398a = (IntentSender) parcel.readParcelable(IntentSender.class.getClassLoader());
        this.f1399b = (Intent) parcel.readParcelable(Intent.class.getClassLoader());
        this.c = parcel.readInt();
        this.d = parcel.readInt();
    }
}
