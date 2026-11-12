package com.garmin.android.apps.connectmobile.device.setup.domain.model;

import am.j;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import r1.q2;
import w13.c;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\fB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/garmin/android/apps/connectmobile/device/setup/domain/model/a;", "Landroid/os/Parcelable;", "Lcom/garmin/android/apps/connectmobile/device/setup/domain/model/a$b;", "jobStatus", "", "activityType", "", "targetExecutionDate", "<init>", "(Lcom/garmin/android/apps/connectmobile/device/setup/domain/model/a$b;ILjava/lang/String;)V", "a", "Lcom/garmin/android/apps/connectmobile/device/setup/domain/model/a$b;", "b", "()Lcom/garmin/android/apps/connectmobile/device/setup/domain/model/a$b;", "I", "getActivityType", "()I", "c", "Ljava/lang/String;", "getTargetExecutionDate", "()Ljava/lang/String;", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C0570a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("JobStatus")
    @JsonAdapter(JobStatusDeserializer.class)
    private final b jobStatus;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("ActivityType")
    private final int activityType;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("TargetExecutionDate")
    private final String targetExecutionDate;

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.device.setup.domain.model.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class C0570a implements Parcelable.Creator<a> {
        @Override // android.os.Parcelable.Creator
        public final a createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new a(b.valueOf(parcel.readString()), parcel.readInt(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final a[] newArray(int i14) {
            return new a[i14];
        }
    }

    public a(b bVar, int i14, String str) {
        bVar.getClass();
        str.getClass();
        this.jobStatus = bVar;
        this.activityType = i14;
        this.targetExecutionDate = str;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final b getJobStatus() {
        return this.jobStatus;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.jobStatus == aVar.jobStatus && this.activityType == aVar.activityType && s.g(this.targetExecutionDate, aVar.targetExecutionDate);
    }

    public final int hashCode() {
        return this.targetExecutionDate.hashCode() + q2.d(this.activityType, this.jobStatus.hashCode() * 31, 31);
    }

    public final String toString() {
        b bVar = this.jobStatus;
        int i14 = this.activityType;
        String str = this.targetExecutionDate;
        StringBuilder sb3 = new StringBuilder("UserJobStatusDTO(jobStatus=");
        sb3.append(bVar);
        sb3.append(", activityType=");
        sb3.append(i14);
        sb3.append(", targetExecutionDate=");
        return j.o(str, ")", sb3);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.jobStatus.name());
        parcel.writeInt(this.activityType);
        parcel.writeString(this.targetExecutionDate);
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 com.garmin.android.apps.connectmobile.device.setup.domain.model.a$b[], still in use, count: 1, list:
      (r0v1 com.garmin.android.apps.connectmobile.device.setup.domain.model.a$b[]) from 0x003b: CONSTRUCTOR (r0v1 com.garmin.android.apps.connectmobile.device.setup.domain.model.a$b[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] call: w13.c.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/device/setup/domain/model/a$b;", "", "", "value", "<init>", "(Ljava/lang/String;II)V", "a", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b {
        UNKNOWN(-1),
        PROCESSING(0),
        FAILED(1),
        FINISHED(2),
        READY(3);


        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final C0571a f33773b = new C0571a(null);

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final /* synthetic */ c f33780i;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f33781a;

        static {
            f33780i = new c(new b[]{r0, r1, r2, r3, r4});
        }

        private b(int i14) {
            super(str, i);
            this.f33781a = i14;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f33779h.clone();
        }

        /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.device.setup.domain.model.a$b$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/device/setup/domain/model/a$b$a;", "", "<init>", "()V", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class C0571a {
            public /* synthetic */ C0571a(p005kotlin.jvm.internal.j jVar) {
                this();
            }

            private C0571a() {
            }
        }
    }
}
