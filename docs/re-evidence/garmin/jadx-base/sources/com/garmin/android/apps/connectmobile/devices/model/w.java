package com.garmin.android.apps.connectmobile.devices.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.gson.annotations.SerializedName;
import m63.e0;
import m63.m0;
import m63.m1;
import m63.u1;
import m63.y1;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0087\b\u0018\u0000 \u00162\u00020\u0001:\u0002\u000e\fB\u001d\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B-\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0006\u0010\u000bR \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010\r\u0012\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010\u0012\u0012\u0004\b\u0015\u0010\u0011\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, d2 = {"Lcom/garmin/android/apps/connectmobile/devices/model/w;", "Landroid/os/Parcelable;", "", TtmlNode.ATTR_ID, "", "name", "<init>", "(ILjava/lang/String;)V", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(IILjava/lang/String;Lm63/u1;)V", "a", "I", "b", "()I", "getId$annotations", "()V", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "getName$annotations", "Companion", "gcm-domain-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@i63.h
public final /* data */ class w implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName(TtmlNode.ATTR_ID)
    private final int id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("name")
    private final String name;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<w> CREATOR = new c();

    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/android/apps/connectmobile/devices/model/LanguageDTO.$serializer", "Lm63/e0;", "Lcom/garmin/android/apps/connectmobile/devices/model/w;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "gcm-domain-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @o13.e
    public static final /* synthetic */ class a implements e0<w> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f34326a;
        private static final k63.e descriptor;

        static {
            a aVar = new a();
            f34326a = aVar;
            m1 m1Var = new m1("com.garmin.android.apps.connectmobile.devices.model.LanguageDTO", aVar, 2);
            m1Var.j(TtmlNode.ATTR_ID, true);
            m1Var.j("name", true);
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
            return new w(i15, iA, str, u1Var);
        }

        @Override // i63.i, i63.b
        /* JADX INFO: renamed from: getDescriptor */
        public final k63.e getF158591b() {
            return descriptor;
        }

        @Override // i63.i
        public final void serialize(l63.f fVar, Object obj) {
            w wVar = (w) obj;
            wVar.getClass();
            k63.e eVar = descriptor;
            l63.d dVarC = fVar.c(eVar);
            w.g(wVar, dVarC, eVar);
            dVarC.b(eVar);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements Parcelable.Creator<w> {
        @Override // android.os.Parcelable.Creator
        public final w createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new w(parcel.readInt(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final w[] newArray(int i14) {
            return new w[i14];
        }
    }

    public /* synthetic */ w(int i14, int i15, String str, u1 u1Var) {
        this.id = (i14 & 1) == 0 ? 0 : i15;
        if ((i14 & 2) == 0) {
            this.name = null;
        } else {
            this.name = str;
        }
    }

    public static final /* synthetic */ void g(w wVar, l63.d dVar, k63.e eVar) {
        if (dVar.C(eVar) || wVar.id != 0) {
            dVar.v(0, wVar.id, eVar);
        }
        if (!dVar.C(eVar) && wVar.name == null) {
            return;
        }
        dVar.d(eVar, 1, y1.f117048a, wVar.name);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getId() {
        return this.id;
    }

    public final String d() {
        int iG;
        String str = this.name;
        return (str == null || str.length() == 0 || (iG = d53.w.G('_', 0, 6, this.name)) == -1 || iG >= this.name.length() + (-1)) ? "" : this.name.substring(iG + 1);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return this.id == wVar.id && p005kotlin.jvm.internal.s.g(this.name, wVar.name);
    }

    public final String f() {
        String str = this.name;
        if (str == null || str.length() == 0) {
            return "";
        }
        int iG = d53.w.G('_', 0, 6, this.name);
        String str2 = this.name;
        if (iG == -1) {
            iG = str2.length();
        }
        return str2.substring(0, iG);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.id) * 31;
        String str = this.name;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return o2.c.e(this.id, "LanguageDTO(id=", ", name=", this.name, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeInt(this.id);
        parcel.writeString(this.name);
    }

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.devices.model.w$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/devices/model/w$b;", "", "<init>", "()V", "Li63/c;", "Lcom/garmin/android/apps/connectmobile/devices/model/w;", "serializer", "()Li63/c;", "", "ISO_CODE_SEPARATOR", "C", "gcm-domain-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public final i63.c<w> serializer() {
            return a.f34326a;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public w() {
        this(0, (String) null, 3, (p005kotlin.jvm.internal.j) (0 == true ? 1 : 0));
    }

    public w(int i14, String str) {
        this.id = i14;
        this.name = str;
    }

    public /* synthetic */ w(int i14, String str, int i15, p005kotlin.jvm.internal.j jVar) {
        this((i15 & 1) != 0 ? 0 : i14, (i15 & 2) != 0 ? null : str);
    }
}
