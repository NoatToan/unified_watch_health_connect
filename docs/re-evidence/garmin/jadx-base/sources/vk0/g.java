package vk0;

import android.os.Parcel;
import b63.o;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lvk0/g;", "", "Lb63/o;", "<init>", "()V", "gcm-gear_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f178573a = new g();

    private g() {
    }

    public final o a(Parcel parcel) {
        o.Companion companion = o.INSTANCE;
        String string = parcel.readString();
        if (string != null) {
            return o.Companion.b(companion, string);
        }
        vb.h.z("LocalDate string not written");
        return null;
    }

    public final void b(o oVar, Parcel parcel) {
        oVar.getClass();
        parcel.writeString(oVar.toString());
    }
}
