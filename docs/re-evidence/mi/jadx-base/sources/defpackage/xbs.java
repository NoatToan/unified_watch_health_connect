package defpackage;

import android.net.NetworkInfo;
import com.huami.bluetooth.profile.channel.module.alarm.AlarmModule;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.HMProSyncDataBaseProfile;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes11.dex */
public class xbs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final NetworkInfo f38954a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap<String, Object> f38955b = new ConcurrentHashMap<>();

    public xbs(NetworkInfo networkInfo) {
        this.f38954a = networkInfo;
    }

    public int a() {
        return ((Integer) d("getType")).intValue();
    }

    public NetworkInfo.DetailedState b() {
        return (NetworkInfo.DetailedState) d("getDetailedState");
    }

    public NetworkInfo.State c() {
        return (NetworkInfo.State) d("getState");
    }

    /* JADX WARN: Code duplicated, block: B:55:0x00bc  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final <T> T d(String str) {
        Object objValueOf;
        byte b2;
        if (this.f38955b.containsKey(str)) {
            return (T) this.f38955b.get(str);
        }
        synchronized (str) {
            try {
                objValueOf = null;
                if (!this.f38955b.contains(str)) {
                    switch (str.hashCode()) {
                        case -1776922004:
                            if (!str.equals("toString")) {
                                b2 = -1;
                            } else {
                                b2 = HMProSyncDataBaseProfile.DATA_TYPE_PAI;
                            }
                            break;
                        case -830707388:
                            if (!str.equals("getSubtype")) {
                                b2 = -1;
                            } else {
                                b2 = 2;
                            }
                            break;
                        case -263236056:
                            if (!str.equals("getExtraInfo")) {
                                b2 = -1;
                            } else {
                                b2 = AlarmModule.CMD_RETURN_CLEAR_ALARM_RESULT;
                            }
                            break;
                        case -117507012:
                            if (!str.equals("isFailover")) {
                                b2 = -1;
                            } else {
                                b2 = 7;
                            }
                            break;
                        case -75106384:
                            if (!str.equals("getType")) {
                                b2 = -1;
                            } else {
                                b2 = 0;
                            }
                            break;
                        case -66906641:
                            if (!str.equals("getSubtypeName")) {
                                b2 = -1;
                            } else {
                                b2 = 3;
                            }
                            break;
                        case 444517567:
                            if (!str.equals("isAvailable")) {
                                b2 = -1;
                            } else {
                                b2 = 6;
                            }
                            break;
                        case 599209215:
                            if (!str.equals("isConnected")) {
                                b2 = -1;
                            } else {
                                b2 = 5;
                            }
                            break;
                        case 711698955:
                            if (!str.equals("getDetailedState")) {
                                b2 = -1;
                            } else {
                                b2 = 10;
                            }
                            break;
                        case 761050426:
                            if (!str.equals("getReason")) {
                                b2 = -1;
                            } else {
                                b2 = 11;
                            }
                            break;
                        case 787194767:
                            if (!str.equals("isRoaming")) {
                                b2 = -1;
                            } else {
                                b2 = 8;
                            }
                            break;
                        case 1401392731:
                            if (!str.equals("getTypeName")) {
                                b2 = -1;
                            } else {
                                b2 = 1;
                            }
                            break;
                        case 1900850074:
                            if (!str.equals("isConnectedOrConnecting")) {
                                b2 = -1;
                            } else {
                                b2 = 4;
                            }
                            break;
                        case 1965583067:
                            if (!str.equals("getState")) {
                                b2 = -1;
                            } else {
                                b2 = 9;
                            }
                            break;
                        default:
                            b2 = -1;
                            break;
                    }
                    switch (b2) {
                        case 0:
                            objValueOf = Integer.valueOf(this.f38954a.getType());
                            break;
                        case 1:
                            objValueOf = this.f38954a.getTypeName();
                            break;
                        case 2:
                            objValueOf = Integer.valueOf(this.f38954a.getSubtype());
                            break;
                        case 3:
                            objValueOf = this.f38954a.getSubtypeName();
                            break;
                        case 4:
                            objValueOf = Boolean.valueOf(this.f38954a.isConnectedOrConnecting());
                            break;
                        case 5:
                            objValueOf = Boolean.valueOf(this.f38954a.isConnected());
                            break;
                        case 6:
                            objValueOf = Boolean.valueOf(this.f38954a.isAvailable());
                            break;
                        case 7:
                            objValueOf = Boolean.valueOf(this.f38954a.isFailover());
                            break;
                        case 8:
                            objValueOf = Boolean.valueOf(this.f38954a.isRoaming());
                            break;
                        case 9:
                            objValueOf = this.f38954a.getState();
                            break;
                        case 10:
                            objValueOf = this.f38954a.getDetailedState();
                            break;
                        case 11:
                            objValueOf = this.f38954a.getReason();
                            break;
                        case 12:
                            objValueOf = this.f38954a.getExtraInfo();
                            break;
                        case 13:
                            objValueOf = this.f38954a.toString();
                            break;
                    }
                    if (objValueOf != null) {
                        this.f38955b.put(str, objValueOf);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return (T) objValueOf;
    }

    public String e() {
        return (String) d("getTypeName");
    }

    public boolean f() {
        return ((Boolean) d("isConnected")).booleanValue();
    }

    public int g() {
        return ((Integer) d("getSubtype")).intValue();
    }

    public String h() {
        return (String) d("getSubtypeName");
    }

    public String i() {
        return (String) d("getExtraInfo");
    }

    public String toString() {
        return (String) d("toString");
    }
}
