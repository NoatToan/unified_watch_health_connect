package defpackage;

import com.huawei.multisimsdk.attacheddevicemanager.common.IAttachedDeviceManagerCallback;
import com.huawei.multisimservice.model.SimInfo;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class obc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f44032a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f44033b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f44034c;
    private List<SimInfo> d;
    private IAttachedDeviceManagerCallback e;
    private int g;

    public IAttachedDeviceManagerCallback e() {
        return this.e;
    }

    public int c() {
        return this.g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            obc obcVar = (obc) obj;
            if (this.g != obcVar.g) {
                return false;
            }
            IAttachedDeviceManagerCallback iAttachedDeviceManagerCallback = this.e;
            if (iAttachedDeviceManagerCallback == null ? obcVar.e != null : !iAttachedDeviceManagerCallback.equals(obcVar.e)) {
                return false;
            }
            String str = this.f44033b;
            if (str == null ? obcVar.f44033b != null : !str.equals(obcVar.f44033b)) {
                return false;
            }
            String str2 = this.f44032a;
            if (str2 == null ? obcVar.f44032a != null : !str2.equals(obcVar.f44032a)) {
                return false;
            }
            String str3 = this.f44034c;
            if (str3 == null ? obcVar.f44034c != null : !str3.equals(obcVar.f44034c)) {
                return false;
            }
            List<SimInfo> list = this.d;
            if (list != null) {
                return list.equals(obcVar.d);
            }
            if (obcVar.d == null) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = this.g;
        IAttachedDeviceManagerCallback iAttachedDeviceManagerCallback = this.e;
        if (iAttachedDeviceManagerCallback != null) {
            iHashCode = (iHashCode * 31) + iAttachedDeviceManagerCallback.hashCode();
        }
        String str = this.f44033b;
        if (str != null) {
            iHashCode = (iHashCode * 31) + str.hashCode();
        }
        String str2 = this.f44032a;
        if (str2 != null) {
            iHashCode = (iHashCode * 31) + str2.hashCode();
        }
        String str3 = this.f44034c;
        if (str3 != null) {
            iHashCode = (iHashCode * 31) + str3.hashCode();
        }
        List<SimInfo> list = this.d;
        return list != null ? (iHashCode * 31) + list.hashCode() : iHashCode;
    }
}
