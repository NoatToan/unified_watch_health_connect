package yl0;

import com.garmin.android.apps.connectmobile.googlehealthconnect.GoogleHealthConnectGsonUtil;
import i3.e5;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import v.e0;
import y8.q0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0017\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\t¨\u0006\n"}, d2 = {"Lyl0/c;", "", "", "keyId", "json", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "Ly8/q0;", "record", "(Ly8/q0;)V", "gcm-google-health-connect_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f197652a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f197653b;

    /* JADX WARN: Illegal instructions before constructor call */
    public c(q0 q0Var) {
        q0Var.getClass();
        em0.a.f64581a.getClass();
        String strG = e5.g(q0Var.getClass().getName(), "-", q0Var.getF195082f().f202971e);
        GoogleHealthConnectGsonUtil.f36011a.getClass();
        String json = GoogleHealthConnectGsonUtil.f36012b.toJson(q0Var, q0.class);
        json.getClass();
        this(strG, json);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return s.g(this.f197652a, cVar.f197652a) && s.g(this.f197653b, cVar.f197653b);
    }

    public final int hashCode() {
        return this.f197653b.hashCode() + (this.f197652a.hashCode() * 31);
    }

    public final String toString() {
        return e0.g("GoogleHealthConnectRecordEntity(keyId=", this.f197652a, ", json=", this.f197653b, ")");
    }

    public c(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f197652a = str;
        this.f197653b = str2;
    }
}
