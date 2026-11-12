package defpackage;

import android.text.TextUtils;
import com.huawei.unitedevice.p2p.P2pReceiver;
import java.util.Objects;

/* JADX INFO: loaded from: classes20.dex */
public class xiy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f53090a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private P2pReceiver f53091b;
    private String d;
    private String e;

    public xiy(String str, String str2, String str3, P2pReceiver p2pReceiver) {
        this.e = str;
        this.f53090a = str2;
        this.d = str3;
        this.f53091b = p2pReceiver;
    }

    public String b() {
        return this.e;
    }

    public P2pReceiver d() {
        return this.f53091b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        if (obj instanceof xiy) {
            xiy xiyVar = (xiy) obj;
            boolean zEquals = TextUtils.isEmpty(this.e) ? true : this.e.equals(xiyVar.e);
            if (zEquals && !TextUtils.isEmpty(this.f53090a)) {
                zEquals = this.f53090a.equals(xiyVar.f53090a);
            }
            return (!zEquals || TextUtils.isEmpty(this.d)) ? zEquals : this.f53090a.equals(xiyVar.f53090a);
        }
        return super.equals(obj);
    }

    public int hashCode() {
        return Objects.hash(this.e, this.f53090a, this.d);
    }
}
