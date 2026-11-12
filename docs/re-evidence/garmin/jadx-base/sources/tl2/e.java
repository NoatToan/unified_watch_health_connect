package tl2;

import android.os.Handler;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import p005kotlin.Metadata;
import r1.q2;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0005\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Ltl2/e;", "", "Ltl2/f;", "delegate", "Lcom/garmin/device/nfc/g;", "dispatcher", "Landroid/os/Handler;", "handler", "", TtmlNode.ATTR_ID, "", "lockId", "<init>", "(Ltl2/f;Lcom/garmin/device/nfc/g;Landroid/os/Handler;IB)V", "nfc_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f165320a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.garmin.device.nfc.g f165321b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Handler f165322c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f165323d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte f165324e;

    public e(f fVar, com.garmin.device.nfc.g gVar, Handler handler, int i14, byte b14) {
        fVar.getClass();
        gVar.getClass();
        handler.getClass();
        this.f165320a = fVar;
        this.f165321b = gVar;
        this.f165322c = handler;
        this.f165323d = i14;
        this.f165324e = b14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f165320a.equals(eVar.f165320a) && this.f165321b.equals(eVar.f165321b) && this.f165322c.equals(eVar.f165322c) && this.f165323d == eVar.f165323d && this.f165324e == eVar.f165324e;
    }

    public final int hashCode() {
        return Byte.hashCode(this.f165324e) + q2.d(this.f165323d, (this.f165322c.hashCode() + ((this.f165321b.hashCode() + (this.f165320a.hashCode() * 31)) * 31)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("NfcTransferData(delegate=");
        sb3.append(this.f165320a);
        sb3.append(", dispatcher=");
        sb3.append(this.f165321b);
        sb3.append(", handler=");
        sb3.append(this.f165322c);
        sb3.append(", id=");
        sb3.append(this.f165323d);
        sb3.append(", lockId=");
        return am.j.q(sb3, this.f165324e, ")");
    }
}
