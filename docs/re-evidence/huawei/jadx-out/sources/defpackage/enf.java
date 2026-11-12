package defpackage;

import android.text.TextUtils;
import com.huawei.profile.coordinator.ProfileRequestConstants;
import com.huawei.profile.profile.DeviceProfile;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class enf {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private DeviceProfile f33223b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Map<String, Object> f33224c;
    private Map<String, Object> d;

    private enf() {
    }

    public DeviceProfile a() {
        return this.f33223b;
    }

    public Map<String, Object> b() {
        return this.f33224c;
    }

    public Map<String, Object> e() {
        return this.d;
    }

    public static class d {
        DeviceProfile e = null;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Map<String, Object> f33225a = null;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Map<String, Object> f33226b = null;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Map<String, Object> f33227c = null;

        public d e(String str) {
            if (this.e == null) {
                this.e = new DeviceProfile();
            }
            this.e.setId(str);
            return this;
        }

        public d m(String str) {
            if (this.f33225a == null) {
                this.f33225a = new HashMap(10);
            }
            this.f33225a.put(ProfileRequestConstants.SWV, str);
            return this;
        }

        public d d(String str) {
            if (this.f33225a == null) {
                this.f33225a = new HashMap(10);
            }
            this.f33225a.put("model", str);
            return this;
        }

        public d i(String str) {
            if (this.f33225a == null) {
                this.f33225a = new HashMap(10);
            }
            this.f33225a.put("devType", str);
            return this;
        }

        public d h(String str) {
            if (this.f33225a == null) {
                this.f33225a = new HashMap(10);
            }
            this.f33225a.put("prodId", str);
            return this;
        }

        public d c(String str) {
            if (this.f33225a == null) {
                this.f33225a = new HashMap(10);
            }
            this.f33225a.put(ProfileRequestConstants.MANU, str);
            return this;
        }

        public d a(long j) {
            if (this.f33225a == null) {
                this.f33225a = new HashMap(10);
            }
            this.f33225a.put("timestamp", Long.valueOf(j));
            return this;
        }

        public d b(String str) {
            if (this.f33225a == null) {
                this.f33225a = new HashMap(10);
            }
            this.f33225a.put(ProfileRequestConstants.HIV, str);
            return this;
        }

        public d g(String str) {
            if (this.f33225a == null) {
                this.f33225a = new HashMap(10);
            }
            this.f33225a.put("deviceName", str);
            return this;
        }

        public d f(String str) {
            if (this.f33225a == null) {
                this.f33225a = new HashMap(10);
            }
            this.f33225a.put("udid", str);
            return this;
        }

        public d a(String str) {
            if (this.f33225a == null) {
                this.f33225a = new HashMap(10);
            }
            this.f33225a.put("mac", str);
            return this;
        }

        public d j(String str) {
            if (this.f33225a == null) {
                this.f33225a = new HashMap(10);
            }
            if (!TextUtils.isEmpty(str)) {
                this.f33225a.put("sn", str);
            }
            return this;
        }

        public d e(int i) {
            if (this.f33225a == null) {
                this.f33225a = new HashMap(10);
            }
            this.f33225a.put(ProfileRequestConstants.PROT_TYPE, Integer.valueOf(i));
            return this;
        }

        public d a(int i) {
            if (this.f33226b == null) {
                this.f33226b = new HashMap(10);
            }
            this.f33226b.put("characteristic.bt.connectionStatus", Integer.valueOf(i));
            return this;
        }

        public d n(String str) {
            if (this.f33227c == null) {
                this.f33227c = new HashMap(10);
            }
            this.f33227c.put("type", str);
            return this;
        }

        public enf b() {
            if (this.e == null || this.f33225a == null || this.f33226b == null || this.f33227c == null) {
                return null;
            }
            enf enfVar = new enf();
            enfVar.f33223b = this.e;
            this.e.setIsNeedCloud(true);
            if (this.f33225a.get("devType") instanceof String) {
                this.e.setType((String) this.f33225a.get("devType"));
            }
            this.e.addEntities(this.f33225a);
            enfVar.f33224c = this.f33226b;
            enfVar.d = this.f33227c;
            return enfVar;
        }
    }
}
