package f;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.BaseGmsClient;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002\u000e\u000fB1\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nB\u0011\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\t\u0010\r¨\u0006\u0010"}, d2 = {"Lf/i;", "Landroid/os/Parcelable;", "Landroid/content/IntentSender;", "intentSender", "Landroid/content/Intent;", "fillInIntent", "", "flagsMask", "flagsValues", "<init>", "(Landroid/content/IntentSender;Landroid/content/Intent;II)V", "Landroid/os/Parcel;", "parcel", "(Landroid/os/Parcel;)V", "a", "c", "activity"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"BanParcelableUsage"})
public final class i implements Parcelable {
    public static final Parcelable.Creator<i> CREATOR;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IntentSender f67609a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Intent f67610b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f67611c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f67612d;

    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"f/i$b", "Landroid/os/Parcelable$Creator;", "Lf/i;", "activity"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<i> {
        @Override // android.os.Parcelable.Creator
        public final i createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new i(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final i[] newArray(int i14) {
            return new i[i14];
        }
    }

    static {
        new c(null);
        CREATOR = new b();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public i(Parcel parcel) {
        parcel.getClass();
        Parcelable parcelable = parcel.readParcelable(IntentSender.class.getClassLoader());
        parcelable.getClass();
        this((IntentSender) parcelable, (Intent) parcel.readParcelable(Intent.class.getClassLoader()), parcel.readInt(), parcel.readInt());
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeParcelable(this.f67609a, i14);
        parcel.writeParcelable(this.f67610b, i14);
        parcel.writeInt(this.f67611c);
        parcel.writeInt(this.f67612d);
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lf/i$c;", "", "<init>", "()V", "activity"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class c {
        public /* synthetic */ c(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private c() {
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\b¨\u0006\t"}, d2 = {"Lf/i$a;", "", "Landroid/content/IntentSender;", "intentSender", "<init>", "(Landroid/content/IntentSender;)V", "Landroid/app/PendingIntent;", BaseGmsClient.KEY_PENDING_INTENT, "(Landroid/app/PendingIntent;)V", "activity"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final IntentSender f67613a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Intent f67614b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f67615c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f67616d;

        /* JADX WARN: Illegal instructions before constructor call */
        public a(PendingIntent pendingIntent) {
            pendingIntent.getClass();
            IntentSender intentSender = pendingIntent.getIntentSender();
            intentSender.getClass();
            this(intentSender);
        }

        public final i a() {
            return new i(this.f67613a, this.f67614b, this.f67615c, this.f67616d);
        }

        public a(IntentSender intentSender) {
            intentSender.getClass();
            this.f67613a = intentSender;
        }
    }

    public /* synthetic */ i(IntentSender intentSender, Intent intent, int i14, int i15, int i16, p005kotlin.jvm.internal.j jVar) {
        this(intentSender, (i16 & 2) != 0 ? null : intent, (i16 & 4) != 0 ? 0 : i14, (i16 & 8) != 0 ? 0 : i15);
    }

    public i(IntentSender intentSender, Intent intent, int i14, int i15) {
        intentSender.getClass();
        this.f67609a = intentSender;
        this.f67610b = intent;
        this.f67611c = i14;
        this.f67612d = i15;
    }
}
