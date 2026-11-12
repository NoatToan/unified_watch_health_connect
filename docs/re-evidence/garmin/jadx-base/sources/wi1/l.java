package wi1;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import r1.q2;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0015\tB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\"\u0010\u0006\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0010\u001a\u0004\b\u0016\u0010\u0012\"\u0004\b\u0017\u0010\u0014¨\u0006\u0018"}, d2 = {"Lwi1/l;", "Landroid/os/Parcelable;", "", "sleepWindowFrequency", "", "startSleepTimeSecondsFromMidnight", "endSleepTimeSecondsFromMidnight", "<init>", "(Ljava/lang/String;II)V", "a", "Ljava/lang/String;", "f", "()Ljava/lang/String;", "setSleepWindowFrequency", "(Ljava/lang/String;)V", "b", "I", "g", "()I", "setStartSleepTimeSecondsFromMidnight", "(I)V", "c", "d", "setEndSleepTimeSecondsFromMidnight", "gcm-domain-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class l implements Parcelable {
    public static final Parcelable.Creator<l> CREATOR;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("sleepWindowFrequency")
    private String sleepWindowFrequency;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("startSleepTimeSecondsFromMidnight")
    private int startSleepTimeSecondsFromMidnight;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("endSleepTimeSecondsFromMidnight")
    private int endSleepTimeSecondsFromMidnight;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<l> {
        @Override // android.os.Parcelable.Creator
        public final l createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new l(parcel.readString(), parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final l[] newArray(int i14) {
            return new l[i14];
        }
    }

    static {
        new a(null);
        CREATOR = new b();
    }

    public l(String str, int i14, int i15) {
        str.getClass();
        this.sleepWindowFrequency = str;
        this.startSleepTimeSecondsFromMidnight = i14;
        this.endSleepTimeSecondsFromMidnight = i15;
    }

    public final l b() {
        String str = this.sleepWindowFrequency;
        int i14 = this.startSleepTimeSecondsFromMidnight;
        int i15 = this.endSleepTimeSecondsFromMidnight;
        str.getClass();
        return new l(str, i14, i15);
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getEndSleepTimeSecondsFromMidnight() {
        return this.endSleepTimeSecondsFromMidnight;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return s.g(this.sleepWindowFrequency, lVar.sleepWindowFrequency) && this.startSleepTimeSecondsFromMidnight == lVar.startSleepTimeSecondsFromMidnight && this.endSleepTimeSecondsFromMidnight == lVar.endSleepTimeSecondsFromMidnight;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getSleepWindowFrequency() {
        return this.sleepWindowFrequency;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final int getStartSleepTimeSecondsFromMidnight() {
        return this.startSleepTimeSecondsFromMidnight;
    }

    public final int hashCode() {
        return Integer.hashCode(this.endSleepTimeSecondsFromMidnight) + q2.d(this.startSleepTimeSecondsFromMidnight, this.sleepWindowFrequency.hashCode() * 31, 31);
    }

    public final String toString() {
        String str = this.sleepWindowFrequency;
        int i14 = this.startSleepTimeSecondsFromMidnight;
        return am.j.q(androidx.core.view.j.k(i14, "UserSleepWindowDTO(sleepWindowFrequency=", str, ", startSleepTimeSecondsFromMidnight=", ", endSleepTimeSecondsFromMidnight="), this.endSleepTimeSecondsFromMidnight, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.sleepWindowFrequency);
        parcel.writeInt(this.startSleepTimeSecondsFromMidnight);
        parcel.writeInt(this.endSleepTimeSecondsFromMidnight);
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 wi1.l$c[], still in use, count: 1, list:
      (r0v1 wi1.l$c[]) from 0x0040: CONSTRUCTOR (r0v1 wi1.l$c[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] call: w13.c.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
    	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
    	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lwi1/l$c;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "a", "gcm-domain-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c {
        /* JADX INFO: Fake field, exist only in values array */
        MONDAY("MONDAY"),
        /* JADX INFO: Fake field, exist only in values array */
        TUESDAY("TUESDAY"),
        /* JADX INFO: Fake field, exist only in values array */
        WEDNESDAY("WEDNESDAY"),
        /* JADX INFO: Fake field, exist only in values array */
        THURSDAY("THURSDAY"),
        /* JADX INFO: Fake field, exist only in values array */
        FRIDAY("FRIDAY"),
        /* JADX INFO: Fake field, exist only in values array */
        SATURDAY("SATURDAY"),
        /* JADX INFO: Fake field, exist only in values array */
        SUNDAY("SUNDAY");


        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f185582b = new a(null);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ w13.c f185584d = new w13.c(new c[]{new c("MONDAY"), new c("TUESDAY"), new c("WEDNESDAY"), new c("THURSDAY"), new c("FRIDAY"), new c("SATURDAY"), new c("SUNDAY")});

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f185585a;

        static {
        }

        private c(String str) {
            super(str, i);
            this.f185585a = str;
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) f185583c.clone();
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lwi1/l$c$a;", "", "<init>", "()V", "gcm-domain-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class a {
            public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
                this();
            }

            public static c a(String str) {
                Object next;
                str.getClass();
                w13.c cVar = c.f185584d;
                p13.c.b bVarN = com.airbnb.lottie.animation.keyframe.a.n(cVar, cVar);
                while (bVarN.hasNext()) {
                    next = bVarN.next();
                    if (s.g(((c) next).f185585a, str)) {
                        return (c) next;
                    }
                }
                next = null;
                return (c) next;
            }

            private a() {
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lwi1/l$a;", "", "<init>", "()V", "", "SLEEP_WINDOW_FREQUENCY", "Ljava/lang/String;", "START_SLEEP_TIME_SECONDS_FROM_MIDNIGHT", "END_SLEEP_TIME_SECONDS_FROM_MIDNIGHT", "gcm-domain-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
