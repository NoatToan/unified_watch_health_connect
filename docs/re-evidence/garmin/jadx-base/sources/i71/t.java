package i71;

import com.garmin.android.apps.connectmobile.dashboard.data.datasource.a2;
import com.garmin.android.apps.connectmobile.i2;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0007B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Li71/t;", "Lcom/garmin/android/apps/connectmobile/dashboard/data/datasource/a2;", "Li71/r;", "lastTrainingStatusDeviceServerDataSource", "lastTrainingStatusDeviceCacheDataSource", "<init>", "(Li71/r;Li71/r;)V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class t implements a2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f91996a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r f91997b;

    static {
        new a(null);
    }

    public t(r rVar, r rVar2) {
        rVar.getClass();
        rVar2.getClass();
        this.f91996a = rVar;
        this.f91997b = rVar2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x006a, code lost:
    
        if (r9 == r1) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0091, code lost:
    
        if (r9 == r1) goto L31;
     */
    @Override // com.garmin.android.apps.connectmobile.dashboard.data.datasource.a2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(boolean z14, v13.c cVar) {
        u uVar;
        String str;
        if (cVar instanceof u) {
            uVar = (u) cVar;
            int i14 = uVar.f92001d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                uVar.f92001d = i14 - Integer.MIN_VALUE;
            } else {
                uVar = new u(this, cVar);
            }
        } else {
            uVar = new u(this, cVar);
        }
        Object objA = uVar.f91999b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = uVar.f92001d;
        if (i15 == 0) {
            o13.r.b(objA);
            uVar.f91998a = z14;
            uVar.f92001d = 1;
            objA = this.f91997b.a(uVar);
            if (objA != aVar) {
            }
            return aVar;
        }
        if (i15 != 1) {
            if (i15 == 2) {
                o13.r.b(objA);
                str = (String) objA;
                com.garmin.android.apps.connectmobile.a2 a2Var = com.garmin.android.apps.connectmobile.a2.DASHBOARD;
                String strM = am.j.m("last TS device used Id = [", str, "]");
                i2.f36769a.getClass();
                i2.a.b(a2Var, "LastTrainingStatusDeviceDataSource", strM);
                return str;
            }
            if (i15 != 3) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objA);
            str = (String) objA;
            com.garmin.android.apps.connectmobile.a2 a2Var2 = com.garmin.android.apps.connectmobile.a2.DASHBOARD;
            String strM2 = am.j.m("last TS device used Id = [", str, "]");
            i2.f36769a.getClass();
            i2.a.b(a2Var2, "LastTrainingStatusDeviceDataSource", strM2);
            return str;
        }
        z14 = uVar.f91998a;
        o13.r.b(objA);
        str = (String) objA;
        r rVar = this.f91996a;
        if (!z14) {
            if (str != null) {
                com.garmin.android.apps.connectmobile.a2 a2Var3 = com.garmin.android.apps.connectmobile.a2.DASHBOARD;
                i2.f36769a.getClass();
                i2.a.b(a2Var3, "LastTrainingStatusDeviceDataSource", "fetch last TS device used from cache");
            } else {
                com.garmin.android.apps.connectmobile.a2 a2Var4 = com.garmin.android.apps.connectmobile.a2.DASHBOARD;
                i2.f36769a.getClass();
                i2.a.b(a2Var4, "LastTrainingStatusDeviceDataSource", "fetch last TS device used from server");
                uVar.f91998a = z14;
                uVar.f92001d = 3;
                objA = rVar.a(uVar);
            }
            com.garmin.android.apps.connectmobile.a2 a2Var5 = com.garmin.android.apps.connectmobile.a2.DASHBOARD;
            String strM3 = am.j.m("last TS device used Id = [", str, "]");
            i2.f36769a.getClass();
            i2.a.b(a2Var5, "LastTrainingStatusDeviceDataSource", strM3);
            return str;
        }
        com.garmin.android.apps.connectmobile.a2 a2Var6 = com.garmin.android.apps.connectmobile.a2.DASHBOARD;
        i2.f36769a.getClass();
        i2.a.b(a2Var6, "LastTrainingStatusDeviceDataSource", "fetch last TS device used from server");
        uVar.f91998a = z14;
        uVar.f92001d = 2;
        objA = rVar.a(uVar);
        return aVar;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Li71/t$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
