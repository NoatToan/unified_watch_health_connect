package defpackage;

import com.huawei.health.device.model.RecordAction;

/* JADX INFO: loaded from: classes12.dex */
class ocz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f44171a;
    private String d;

    ocz(String str, String str2) {
        this.d = str;
        this.f44171a = str2;
    }

    public String e() {
        return this.d;
    }

    public String d() {
        return this.f44171a;
    }

    public String toString() {
        return RecordAction.ACT_NAME_TAG + this.d + ", value=" + this.f44171a;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof ocz) {
            ocz oczVar = (ocz) obj;
            if (c(this.d, oczVar.d) && c(this.f44171a, oczVar.f44171a)) {
                return true;
            }
        }
        return false;
    }

    private boolean c(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }
}
