package jm2;

import com.google.firebase.messaging.Constants;
import com.google.gson.annotations.SerializedName;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\t"}, d2 = {"Ljm2/d;", "", "Ljm2/e;", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "<init>", "(Ljm2/e;)V", "a", "Ljm2/e;", "()Ljm2/e;", "device-pairing-retrofit_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName(Constants.IPC_BUNDLE_KEY_SEND_ERROR)
    private final e error;

    public /* synthetic */ d(e eVar, int i14, j jVar) {
        this((i14 & 1) != 0 ? null : eVar);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final e getError() {
        return this.error;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && s.g(this.error, ((d) obj).error);
    }

    public final int hashCode() {
        e eVar = this.error;
        if (eVar == null) {
            return 0;
        }
        return eVar.hashCode();
    }

    public final String toString() {
        return "RegistrationErrorDTO(error=" + this.error + ")";
    }

    public d(e eVar) {
        this.error = eVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
