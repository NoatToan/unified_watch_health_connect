package com.garmin.android.apps.connectmobile.courses.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import m63.e0;
import m63.m0;
import m63.m1;
import m63.u1;
import m63.y1;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 \u00172\u00020\u0001:\u0002\u0015\u0011B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003B\u0011\b\u0014\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0002\u0010\u0006B=\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\f\u001a\u00020\u0007\u0012\u0006\u0010\r\u001a\u00020\u0007\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0002\u0010\u0010R\u0016\u0010\t\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\f\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0012R\u0016\u0010\r\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0012¨\u0006\u0018"}, d2 = {"Lcom/garmin/android/apps/connectmobile/courses/model/a;", "Landroid/os/Parcelable;", "<init>", "()V", "Landroid/os/Parcel;", "in", "(Landroid/os/Parcel;)V", "", "seen0", "typeId", "", "typeKey", "parentTypeId", "sortOrder", "Lm63/u1;", "serializationConstructorMarker", "(IILjava/lang/String;IILm63/u1;)V", "a", "I", "b", "Ljava/lang/String;", "c", "d", "Companion", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@i63.h
public final class a implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("typeId")
    public int typeId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("typeKey")
    public String typeKey;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("parentTypeId")
    public int parentTypeId;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("sortOrder")
    public int sortOrder;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<a> CREATOR = new b();

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.courses.model.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/android/apps/connectmobile/courses/model/ActivityTypeDTO.$serializer", "Lm63/e0;", "Lcom/garmin/android/apps/connectmobile/courses/model/a;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @o13.e
    public static final /* synthetic */ class C0539a implements e0<a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0539a f32817a;
        private static final k63.e descriptor;

        static {
            C0539a c0539a = new C0539a();
            f32817a = c0539a;
            m1 m1Var = new m1("com.garmin.android.apps.connectmobile.courses.model.ActivityTypeDTO", c0539a, 4);
            m1Var.j("typeId", true);
            m1Var.j("typeKey", true);
            m1Var.j("parentTypeId", true);
            m1Var.j("sortOrder", true);
            descriptor = m1Var;
        }

        private C0539a() {
        }

        @Override // m63.e0
        public final i63.c<?>[] childSerializers() {
            i63.c<?> cVarD = j63.a.d(y1.f117048a);
            m0 m0Var = m0.f116981a;
            return new i63.c[]{m0Var, cVarD, m0Var, m0Var};
        }

        @Override // i63.b
        public final Object deserialize(l63.e eVar) {
            eVar.getClass();
            k63.e eVar2 = descriptor;
            l63.c cVarC = eVar.c(eVar2);
            int i14 = l63.c.f110557a;
            boolean z14 = true;
            int i15 = 0;
            int iA = 0;
            int iA2 = 0;
            int iA3 = 0;
            String str = null;
            while (z14) {
                int iE = cVarC.e(eVar2);
                if (iE == -1) {
                    z14 = false;
                } else if (iE == 0) {
                    iA = cVarC.A(eVar2, 0);
                    i15 |= 1;
                } else if (iE == 1) {
                    str = (String) cVarC.v(eVar2, 1, y1.f117048a, str);
                    i15 |= 2;
                } else if (iE == 2) {
                    iA2 = cVarC.A(eVar2, 2);
                    i15 |= 4;
                } else {
                    if (iE != 3) {
                        hb.a.o(iE);
                        return null;
                    }
                    iA3 = cVarC.A(eVar2, 3);
                    i15 |= 8;
                }
            }
            cVarC.b(eVar2);
            return new a(i15, iA, str, iA2, iA3, null);
        }

        @Override // i63.i, i63.b
        /* JADX INFO: renamed from: getDescriptor */
        public final k63.e getF158591b() {
            return descriptor;
        }

        @Override // i63.i
        public final void serialize(l63.f fVar, Object obj) {
            a aVar = (a) obj;
            aVar.getClass();
            k63.e eVar = descriptor;
            l63.d dVarC = fVar.c(eVar);
            if (dVarC.C(eVar) || aVar.typeId != 0) {
                dVarC.v(0, aVar.typeId, eVar);
            }
            if (dVarC.C(eVar) || aVar.typeKey != null) {
                dVarC.d(eVar, 1, y1.f117048a, aVar.typeKey);
            }
            if (dVarC.C(eVar) || aVar.parentTypeId != 0) {
                dVarC.v(2, aVar.parentTypeId, eVar);
            }
            if (dVarC.C(eVar) || aVar.sortOrder != 0) {
                dVarC.v(3, aVar.sortOrder, eVar);
            }
            dVarC.b(eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/garmin/android/apps/connectmobile/courses/model/a$b", "Landroid/os/Parcelable$Creator;", "Lcom/garmin/android/apps/connectmobile/courses/model/a;", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<a> {
        @Override // android.os.Parcelable.Creator
        public final a createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final a[] newArray(int i14) {
            return new a[i14];
        }
    }

    public /* synthetic */ a(int i14, int i15, String str, int i16, int i17, u1 u1Var) {
        if ((i14 & 1) == 0) {
            this.typeId = 0;
        } else {
            this.typeId = i15;
        }
        if ((i14 & 2) == 0) {
            this.typeKey = null;
        } else {
            this.typeKey = str;
        }
        if ((i14 & 4) == 0) {
            this.parentTypeId = 0;
        } else {
            this.parentTypeId = i16;
        }
        if ((i14 & 8) == 0) {
            this.sortOrder = 0;
        } else {
            this.sortOrder = i17;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeInt(this.typeId);
        parcel.writeString(this.typeKey);
        parcel.writeInt(this.parentTypeId);
        parcel.writeInt(this.sortOrder);
    }

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.courses.model.a$c, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/courses/model/a$c;", "", "<init>", "()V", "Li63/c;", "Lcom/garmin/android/apps/connectmobile/courses/model/a;", "serializer", "()Li63/c;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public final i63.c<a> serializer() {
            return C0539a.f32817a;
        }

        private Companion() {
        }
    }

    public a() {
    }

    public a(Parcel parcel) {
        parcel.getClass();
        this.typeId = parcel.readInt();
        this.typeKey = parcel.readString();
        this.parentTypeId = parcel.readInt();
        this.sortOrder = parcel.readInt();
    }
}
