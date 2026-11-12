package vk0;

import android.os.Parcel;
import b63.o;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lvk0/i;", "", "Lb63/o;", "<init>", "()V", "gcm-gear_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i f178575a = new i();

    private i() {
    }

    public final o a(Parcel parcel) {
        String string = parcel.readString();
        if (string != null) {
            return o.Companion.b(o.INSTANCE, string);
        }
        return null;
    }

    public final void b(o oVar, Parcel parcel) {
        parcel.writeString(oVar != null ? oVar.toString() : null);
    }
}
