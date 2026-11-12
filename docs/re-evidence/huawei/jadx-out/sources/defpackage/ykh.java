package defpackage;

import com.huawei.wearengine.p2p.ReceiverCallback;
import java.util.Objects;

/* JADX INFO: loaded from: classes46.dex */
public class ykh {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f53583c;
    private ReceiverCallback d;
    private int e;

    public ykh(int i, int i2, ReceiverCallback receiverCallback) {
        this.f53583c = i;
        this.e = i2;
        this.d = receiverCallback;
    }

    public int d() {
        return this.f53583c;
    }

    public int b() {
        return this.e;
    }

    public ReceiverCallback e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        if (obj instanceof ykh) {
            ykh ykhVar = (ykh) obj;
            return this.f53583c == ykhVar.f53583c && this.e == ykhVar.e;
        }
        return super.equals(obj);
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.f53583c), Integer.valueOf(this.e));
    }
}
