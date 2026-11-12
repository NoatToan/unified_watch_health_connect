package xj;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import bk.i;
import com.dsi.ant.channel.AntCommandFailedException;
import vb.h;
import wj.c;

/* JADX INFO: loaded from: classes7.dex */
public class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f191151a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f191152b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f191153c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final dk.a f191154d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C3558b f191155e;

    public static class a implements Parcelable.Creator<b> {
        @Override // android.os.Parcelable.Creator
        public final b createFromParcel(Parcel parcel) {
            return new b(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final b[] newArray(int i14) {
            return new b[i14];
        }
    }

    static {
        new b(true);
        new b(false);
        new b(c.INVALID_REQUEST);
        CREATOR = new a();
    }

    public b(Parcel parcel) {
        int i14 = 0;
        this.f191151a = false;
        this.f191152b = "Unknown";
        c cVar = c.UNKNOWN;
        this.f191153c = cVar;
        this.f191154d = null;
        this.f191155e = new C3558b(null);
        if (parcel != null) {
            int i15 = parcel.readInt();
            this.f191151a = parcel.readInt() == 1;
            this.f191152b = parcel.readString();
            int i16 = parcel.readInt();
            while (true) {
                c[] cVarArr = c.f185717h;
                if (i14 >= cVarArr.length) {
                    break;
                }
                c cVar2 = cVarArr[i14];
                if (i16 == cVar2.f185719a) {
                    cVar = cVar2;
                    break;
                }
                i14++;
            }
            this.f191153c = cVar;
            this.f191154d = (dk.a) parcel.readParcelable(dk.a.class.getClassLoader());
            if (i15 > 1) {
                Bundle bundle = parcel.readBundle();
                bundle.setClassLoader(C3558b.class.getClassLoader());
                this.f191155e = (C3558b) bundle.getParcelable("com.dsi.ant.channel.ipc.serviceresult.bundledata");
            }
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return this.f191152b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.writeInt(2);
        parcel.writeInt(this.f191151a ? 1 : 0);
        parcel.writeString(this.f191152b);
        parcel.writeInt(this.f191153c.f185719a);
        parcel.writeParcelable(this.f191154d, i14);
        if (vj.a.b()) {
            Bundle bundle = new Bundle();
            bundle.putParcelable("com.dsi.ant.channel.ipc.serviceresult.bundledata", this.f191155e);
            parcel.writeBundle(bundle);
        }
    }

    /* JADX INFO: renamed from: xj.b$b, reason: collision with other inner class name */
    public static final class C3558b implements Parcelable {
        public static final Parcelable.Creator<C3558b> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f191156a;

        /* JADX INFO: renamed from: xj.b$b$a */
        public static class a implements Parcelable.Creator<C3558b> {
            @Override // android.os.Parcelable.Creator
            public final C3558b createFromParcel(Parcel parcel) {
                parcel.readInt();
                C3558b c3558b = new C3558b(null);
                c3558b.f191156a = parcel.readInt() == 1;
                return c3558b;
            }

            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ C3558b[] newArray(int i14) {
                return null;
            }
        }

        private C3558b() {
            this.f191156a = true;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i14) {
            parcel.writeInt(1);
            parcel.writeInt(this.f191156a ? 1 : 0);
        }

        public /* synthetic */ C3558b(a aVar) {
            this();
        }
    }

    public b(c cVar) {
        this.f191151a = false;
        this.f191152b = "Unknown";
        this.f191153c = c.UNKNOWN;
        this.f191154d = null;
        this.f191155e = new C3558b(null);
        if (c.CHANNEL_RESPONSE != cVar) {
            this.f191152b = "ANT Service responded with failure reason: " + cVar;
            this.f191153c = cVar;
            this.f191154d = null;
            return;
        }
        h.s("Channel Response failure type only valid when the response is provided");
        throw null;
    }

    public b(i iVar) {
        this.f191151a = false;
        this.f191152b = "Unknown";
        this.f191153c = c.UNKNOWN;
        this.f191154d = null;
        this.f191155e = new C3558b(null);
        if (iVar != null) {
            StringBuilder sb3 = new StringBuilder("ANT Adapter responded with failure code: ");
            if (iVar == null) {
                sb3.append("<null>");
            } else {
                sb3.append(iVar.f18445c);
            }
            this.f191152b = sb3.toString();
            this.f191153c = c.CHANNEL_RESPONSE;
            this.f191154d = new dk.a(iVar);
            return;
        }
        h.s("Channel Response failure type only valid when the response is provided");
        throw null;
    }

    public b(AntCommandFailedException antCommandFailedException) {
        this.f191151a = false;
        this.f191152b = "Unknown";
        this.f191153c = c.UNKNOWN;
        this.f191154d = null;
        this.f191155e = new C3558b(null);
        this.f191152b = antCommandFailedException.getLocalizedMessage();
        this.f191153c = antCommandFailedException.getFailureReason();
        this.f191154d = antCommandFailedException.getAntMessage();
    }

    private b(boolean z14) {
        this.f191151a = false;
        this.f191152b = "Unknown";
        this.f191153c = c.UNKNOWN;
        this.f191154d = null;
        C3558b c3558b = new C3558b(null);
        this.f191155e = c3558b;
        c3558b.f191156a = z14;
        if (z14) {
            this.f191151a = true;
            this.f191152b = "Success";
        } else {
            this.f191152b = "Channel Does Not Exist";
        }
    }
}
