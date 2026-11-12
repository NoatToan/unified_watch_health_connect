package v80;

import am.j;
import android.util.Pair;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import d53.u;
import e23.p;
import java.util.Iterator;
import java.util.List;
import o13.r;
import o53.b0;
import o53.z;
import org.apache.commons.lang3.StringUtils;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.device.passcode.domain.SendRegionRequiresPasscodeNotificationUseCase$invoke$1", f = "SendRegionRequiresPasscodeNotificationUseCase.kt", l = {28, 32}, m = "invokeSuspend", v = 2)
public final class e extends i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f176212a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f176213b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f176214c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c f176215d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f176216e;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.device.passcode.domain.SendRegionRequiresPasscodeNotificationUseCase$invoke$1$2", f = "SendRegionRequiresPasscodeNotificationUseCase.kt", l = {36}, m = "invokeSuspend", v = 2)
    public static final class a extends i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f176217a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f176218b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f176219c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f176220d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ c f176221e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, c cVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f176220d = str;
            this.f176221e = cVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            a aVar = new a(this.f176220d, this.f176221e, dVar);
            aVar.f176219c = obj;
            return aVar;
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            String str;
            b0 b0Var = (b0) this.f176219c;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f176218b;
            if (i14 == 0) {
                r.b(obj);
                StringBuilder sb3 = new StringBuilder("Send RegionRequiresPasscodeNotification to device macAddress=");
                String str2 = this.f176220d;
                sb3.append(str2);
                String string = sb3.toString();
                i2.a aVar2 = i2.f36769a;
                a2 a2Var = a2.GENERAL;
                aVar2.getClass();
                i2.a.b(a2Var, "RegionRequiresPasscodeNotification", string);
                y92.b bVar = (y92.b) this.f176221e.f176204a.getCapability(str2, y92.b.class);
                if (bVar != null) {
                    try {
                        this.f176219c = b0Var;
                        this.f176217a = str2;
                        this.f176218b = 1;
                        if (bVar.d(this) == aVar) {
                            return aVar;
                        }
                        str = str2;
                    } catch (Exception e4) {
                        e = e4;
                        str = str2;
                        String str3 = "Failed to send RegionRequiresPasscodeNotification to device macAddress=" + str + StringUtils.SPACE + e;
                        i2.a aVar3 = i2.f36769a;
                        a2 a2Var2 = a2.GENERAL;
                        aVar3.getClass();
                        i2.a.f(a2Var2, "RegionRequiresPasscodeNotification", str3);
                    }
                } else {
                    i2.a.f(a2Var, "RegionRequiresPasscodeNotification", "DevicePasscodeProtobufHandler not found for device to device macAddress=" + str2);
                }
                return Unit.INSTANCE;
            }
            if (i14 != 1) {
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str = this.f176217a;
            try {
                r.b(obj);
            } catch (Exception e14) {
                e = e14;
                String str4 = "Failed to send RegionRequiresPasscodeNotification to device macAddress=" + str + StringUtils.SPACE + e;
                i2.a aVar4 = i2.f36769a;
                a2 a2Var3 = a2.GENERAL;
                aVar4.getClass();
                i2.a.f(a2Var3, "RegionRequiresPasscodeNotification", str4);
            }
            i2.a aVar5 = i2.f36769a;
            a2 a2Var4 = a2.GENERAL;
            aVar5.getClass();
            i2.a.b(a2Var4, "RegionRequiresPasscodeNotification", "RegionRequiresPasscodeNotification sent to device macAddress=" + str);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(c cVar, String str, t13.d<? super e> dVar) {
        super(2, dVar);
        this.f176215d = cVar;
        this.f176216e = str;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        e eVar = new e(this.f176215d, this.f176216e, dVar);
        eVar.f176214c = obj;
        return eVar;
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((e) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00ae, code lost:
    
        if (ge1.b.e0(r11, r0, r10) == r1) goto L30;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        String str;
        b0 b0Var = (b0) this.f176214c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f176213b;
        c cVar = this.f176215d;
        if (i14 != 0) {
            if (i14 == 1) {
                str = this.f176212a;
                r.b(obj);
            } else {
                if (i14 != 2) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            return Unit.INSTANCE;
        }
        r.b(obj);
        Pair<String, Long> pairU0 = cVar.f176206c.U0();
        String str2 = pairU0 != null ? (String) pairU0.first : null;
        this.f176214c = b0Var;
        this.f176212a = str2;
        this.f176213b = 1;
        Object objA = c.a(cVar, this);
        if (objA != aVar) {
            str = str2;
            obj = objA;
        }
        return aVar;
        List list = (List) obj;
        i2.a aVar2 = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar2.getClass();
        i2.a.b(a2Var, "RegionRequiresPasscodeNotification", "User location country code: " + str + " Countries requiring passcode: " + list);
        if (list == null || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (u.q((String) it.next(), str, true)) {
                    String strM = j.m("User location country code ", str, " requires passcode");
                    i2.a aVar3 = i2.f36769a;
                    a2 a2Var2 = a2.GENERAL;
                    aVar3.getClass();
                    i2.a.b(a2Var2, "RegionRequiresPasscodeNotification", strM);
                    z zVar = cVar.f176207d;
                    a aVar4 = new a(this.f176216e, cVar, null);
                    this.f176214c = null;
                    this.f176212a = null;
                    this.f176213b = 2;
                }
            }
        }
        String strM2 = j.m("User location country code ", str, " does not require passcode");
        i2.a aVar5 = i2.f36769a;
        a2 a2Var3 = a2.GENERAL;
        aVar5.getClass();
        i2.a.b(a2Var3, "RegionRequiresPasscodeNotification", strM2);
        return Unit.INSTANCE;
    }
}
