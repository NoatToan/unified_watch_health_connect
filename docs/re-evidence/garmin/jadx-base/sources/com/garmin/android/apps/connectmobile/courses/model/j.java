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
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u0000 \u00162\u00020\u0001:\u0002\u0017\u000fB\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003B\u0011\b\u0014\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0002\u0010\u0006B-\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0002\u0010\u000eR\"\u0010\t\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0015¨\u0006\u0018"}, d2 = {"Lcom/garmin/android/apps/connectmobile/courses/model/j;", "Landroid/os/Parcelable;", "<init>", "()V", "Landroid/os/Parcel;", "in", "(Landroid/os/Parcel;)V", "", "seen0", "typeId", "", "typeKey", "Lm63/u1;", "serializationConstructorMarker", "(IILjava/lang/String;Lm63/u1;)V", "a", "I", "b", "()I", "d", "(I)V", "Ljava/lang/String;", "Companion", "c", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@i63.h
public final class j implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("typeId")
    private int typeId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("typeKey")
    private String typeKey;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<j> CREATOR = new b();

    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/android/apps/connectmobile/courses/model/PrivacyRuleDTO.$serializer", "Lm63/e0;", "Lcom/garmin/android/apps/connectmobile/courses/model/j;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @o13.e
    public static final /* synthetic */ class a implements e0<j> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f32988a;
        private static final k63.e descriptor;

        static {
            a aVar = new a();
            f32988a = aVar;
            m1 m1Var = new m1("com.garmin.android.apps.connectmobile.courses.model.PrivacyRuleDTO", aVar, 2);
            m1Var.j("typeId", true);
            m1Var.j("typeKey", true);
            descriptor = m1Var;
        }

        private a() {
        }

        @Override // m63.e0
        public final i63.c<?>[] childSerializers() {
            return new i63.c[]{m0.f116981a, j63.a.d(y1.f117048a)};
        }

        @Override // i63.b
        public final Object deserialize(l63.e eVar) {
            eVar.getClass();
            k63.e eVar2 = descriptor;
            l63.c cVarC = eVar.c(eVar2);
            int i14 = l63.c.f110557a;
            u1 u1Var = null;
            boolean z14 = true;
            int i15 = 0;
            int iA = 0;
            String str = null;
            while (z14) {
                int iE = cVarC.e(eVar2);
                if (iE == -1) {
                    z14 = false;
                } else if (iE == 0) {
                    iA = cVarC.A(eVar2, 0);
                    i15 |= 1;
                } else {
                    if (iE != 1) {
                        hb.a.o(iE);
                        return null;
                    }
                    str = (String) cVarC.v(eVar2, 1, y1.f117048a, str);
                    i15 |= 2;
                }
            }
            cVarC.b(eVar2);
            return new j(i15, iA, str, u1Var);
        }

        @Override // i63.i, i63.b
        /* JADX INFO: renamed from: getDescriptor */
        public final k63.e getF158591b() {
            return descriptor;
        }

        @Override // i63.i
        public final void serialize(l63.f fVar, Object obj) {
            j jVar = (j) obj;
            jVar.getClass();
            k63.e eVar = descriptor;
            l63.d dVarC = fVar.c(eVar);
            j.f(jVar, dVarC, eVar);
            dVarC.b(eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/garmin/android/apps/connectmobile/courses/model/j$b", "Landroid/os/Parcelable$Creator;", "Lcom/garmin/android/apps/connectmobile/courses/model/j;", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<j> {
        @Override // android.os.Parcelable.Creator
        public final j createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new j(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final j[] newArray(int i14) {
            return new j[i14];
        }
    }

    public /* synthetic */ j(int i14, int i15, String str, u1 u1Var) {
        this.typeId = (i14 & 1) == 0 ? 0 : i15;
        if ((i14 & 2) == 0) {
            this.typeKey = null;
        } else {
            this.typeKey = str;
        }
    }

    public static final /* synthetic */ void f(j jVar, l63.d dVar, k63.e eVar) {
        if (dVar.C(eVar) || jVar.typeId != 0) {
            dVar.v(0, jVar.typeId, eVar);
        }
        if (!dVar.C(eVar) && jVar.typeKey == null) {
            return;
        }
        dVar.d(eVar, 1, y1.f117048a, jVar.typeKey);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getTypeId() {
        return this.typeId;
    }

    public final void d(int i14) {
        this.typeId = i14;
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
    }

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.courses.model.j$c, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/courses/model/j$c;", "", "<init>", "()V", "Li63/c;", "Lcom/garmin/android/apps/connectmobile/courses/model/j;", "serializer", "()Li63/c;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public final i63.c<j> serializer() {
            return a.f32988a;
        }

        private Companion() {
        }
    }

    public j() {
    }

    public j(Parcel parcel) {
        parcel.getClass();
        this.typeId = parcel.readInt();
        this.typeKey = parcel.readString();
    }
}
