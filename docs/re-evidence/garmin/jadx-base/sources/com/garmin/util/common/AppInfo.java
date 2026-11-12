package com.garmin.util.common;

import com.google.firebase.remoteconfig.RemoteConfigConstants;
import i63.c;
import i63.h;
import l63.d;
import l63.f;
import m63.e0;
import m63.k1;
import m63.m1;
import m63.u1;
import m63.y1;
import o13.e;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import p6.b;
import wr.g;
import zy2.i;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u000e2\u00020\u0001:\u0002\u000f\u0010B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB9\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\r¨\u0006\u0011"}, d2 = {"Lcom/garmin/util/common/AppInfo;", "", "", RemoteConfigConstants.RequestFieldKey.PACKAGE_NAME, "version", "Lzy2/h;", "versionCode", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lzy2/h;)V", "", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lzy2/h;Lm63/u1;)V", "Companion", "a", "b", "util-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@h
public final /* data */ class AppInfo {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f52811a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f52812b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final zy2.h f52813c;

    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/util/common/AppInfo.$serializer", "Lm63/e0;", "Lcom/garmin/util/common/AppInfo;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "util-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @e
    public /* synthetic */ class a implements e0<AppInfo> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f52814a;
        private static final k63.e descriptor;

        static {
            a aVar = new a();
            f52814a = aVar;
            m1 m1Var = new m1("com.garmin.util.common.AppInfo", aVar, 3);
            m1Var.j(RemoteConfigConstants.RequestFieldKey.PACKAGE_NAME, false);
            m1Var.j("version", false);
            m1Var.j("versionCode", false);
            descriptor = m1Var;
        }

        private a() {
        }

        @Override // m63.e0
        public final c<?>[] childSerializers() {
            c<?> cVarD = j63.a.d(i.f207531a);
            y1 y1Var = y1.f117048a;
            return new c[]{y1Var, y1Var, cVarD};
        }

        @Override // i63.b
        public final Object deserialize(l63.e eVar) {
            eVar.getClass();
            k63.e eVar2 = descriptor;
            l63.c cVarC = eVar.c(eVar2);
            int i14 = l63.c.f110557a;
            boolean z14 = true;
            int i15 = 0;
            String strR = null;
            String strR2 = null;
            zy2.h hVar = null;
            while (z14) {
                int iE = cVarC.e(eVar2);
                if (iE == -1) {
                    z14 = false;
                } else if (iE == 0) {
                    strR = cVarC.r(eVar2, 0);
                    i15 |= 1;
                } else if (iE == 1) {
                    strR2 = cVarC.r(eVar2, 1);
                    i15 |= 2;
                } else {
                    if (iE != 2) {
                        hb.a.o(iE);
                        return null;
                    }
                    hVar = (zy2.h) cVarC.v(eVar2, 2, i.f207531a, hVar);
                    i15 |= 4;
                }
            }
            cVarC.b(eVar2);
            return new AppInfo(i15, strR, strR2, hVar, null);
        }

        @Override // i63.i, i63.b
        /* JADX INFO: renamed from: getDescriptor */
        public final k63.e getF158591b() {
            return descriptor;
        }

        @Override // i63.i
        public final void serialize(f fVar, Object obj) {
            AppInfo appInfo = (AppInfo) obj;
            appInfo.getClass();
            k63.e eVar = descriptor;
            d dVarC = fVar.c(eVar);
            dVarC.k(eVar, 0, appInfo.f52811a);
            dVarC.k(eVar, 1, appInfo.f52812b);
            dVarC.d(eVar, 2, i.f207531a, appInfo.f52813c);
            dVarC.b(eVar);
        }
    }

    public /* synthetic */ AppInfo(int i14, String str, String str2, zy2.h hVar, u1 u1Var) {
        if (7 != (i14 & 7)) {
            k1.h(i14, 7, a.f52814a.getF158591b());
            throw null;
        }
        this.f52811a = str;
        this.f52812b = str2;
        this.f52813c = hVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppInfo)) {
            return false;
        }
        AppInfo appInfo = (AppInfo) obj;
        return s.g(this.f52811a, appInfo.f52811a) && s.g(this.f52812b, appInfo.f52812b) && s.g(this.f52813c, appInfo.f52813c);
    }

    public final int hashCode() {
        int iJ = g.j(this.f52811a.hashCode() * 31, 31, this.f52812b);
        zy2.h hVar = this.f52813c;
        return iJ + (hVar == null ? 0 : Long.hashCode(hVar.f207530a));
    }

    public final String toString() {
        StringBuilder sbI = b.i("AppInfo(packageName='", this.f52811a, "', version='", this.f52812b, "', versionCode=");
        sbI.append(this.f52813c);
        sbI.append(")");
        return sbI.toString();
    }

    /* JADX INFO: renamed from: com.garmin.util.common.AppInfo$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/garmin/util/common/AppInfo$b;", "", "<init>", "()V", "Li63/c;", "Lcom/garmin/util/common/AppInfo;", "serializer", "()Li63/c;", "util-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final c<AppInfo> serializer() {
            return a.f52814a;
        }

        public /* synthetic */ Companion(j jVar) {
            this();
        }
    }

    public AppInfo(String str, String str2, zy2.h hVar) {
        str.getClass();
        str2.getClass();
        this.f52811a = str;
        this.f52812b = str2;
        this.f52813c = hVar;
    }
}
