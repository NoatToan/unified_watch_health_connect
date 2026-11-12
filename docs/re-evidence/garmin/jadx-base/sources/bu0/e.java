package bu0;

import android.content.Context;
import android.content.Intent;
import au0.z;
import c22.g2;
import c22.x0;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.vo2.reports.presentation.activity.VO2MaxReportsActivity;
import com.garmin.android.livesessionview.LiveActivityActivity;
import o13.r;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lbu0/e;", "", "Lau0/z;", "liveActivityRepositoryWrapper", "Lc22/o;", "appUtilDelegate", "<init>", "(Lau0/z;Lc22/o;)V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z f21195a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c22.o f21196b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final yf2.a f21197c;

    static {
        new a(null);
    }

    public e(z zVar, c22.o oVar) {
        zVar.getClass();
        oVar.getClass();
        this.f21195a = zVar;
        this.f21196b = oVar;
        this.f21197c = yf2.a.VO2_MAX;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x008a  */
    /* JADX WARN: Code duplicated, block: B:27:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:30:0x00be  */
    /* JADX WARN: Code duplicated, block: B:32:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:34:0x0113  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0059, code lost:
    
        if (r14 == r1) goto L26;
     */
    /* JADX WARN: Instruction removed from duplicated block: B:24:0x008a, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:30:0x00be, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:32:0x00f9, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:34:0x0113, please report this as an issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Context context, Long l14, v13.c cVar) {
        f fVar;
        boolean zBooleanValue;
        long jLongValue;
        Context context2;
        Long l15;
        if (cVar instanceof f) {
            fVar = (f) cVar;
            int i14 = fVar.f21202e;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                fVar.f21202e = i14 - Integer.MIN_VALUE;
            } else {
                fVar = new f(this, cVar);
            }
        } else {
            fVar = new f(this, cVar);
        }
        Object objH = fVar.f21200c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = fVar.f21202e;
        yf2.a aVar2 = this.f21197c;
        z zVar = this.f21195a;
        if (i15 != 0) {
            if (i15 == 1) {
                l14 = fVar.f21199b;
                context = fVar.f21198a;
                r.b(objH);
            } else {
                if (i15 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                l15 = fVar.f21199b;
                context2 = fVar.f21198a;
                r.b(objH);
            }
            if (!this.f21196b.i()) {
                i2.a aVar3 = i2.f36769a;
                a2 a2Var = a2.GENERAL;
                aVar3.getClass();
                i2.a.b(a2Var, "GetVo2MaxNotificationDetailsUseCase", "Application is in foreground for deviceUnitId: " + l15);
                return null;
            }
            i2.a aVar4 = i2.f36769a;
            a2 a2Var2 = a2.GENERAL;
            aVar4.getClass();
            i2.a.b(a2Var2, "GetVo2MaxNotificationDetailsUseCase", "Application is in background for deviceUnitId: " + l15);
            x0.f23314a.getClass();
            String strD = dh.b.D(context2, x0.f23611rb);
            String str = x0.Cb;
            str.getClass();
            String strF = g2.f(str);
            LiveActivityActivity.f50544d.getClass();
            return new o(strD, strF, LiveActivityActivity.a.a(context2));
        }
        r.b(objH);
        if (l14 != null) {
            long jLongValue2 = l14.longValue();
            fVar.f21198a = context;
            fVar.f21199b = l14;
            fVar.f21202e = 1;
            objH = zVar.f13003b.h(jLongValue2, aVar2, fVar);
        } else {
            zBooleanValue = false;
            if (zBooleanValue) {
                i2.a aVar5 = i2.f36769a;
                a2 a2Var3 = a2.GENERAL;
                aVar5.getClass();
                i2.a.b(a2Var3, "GetVo2MaxNotificationDetailsUseCase", "Vo2Max value estimation session is not active for deviceUnitId: " + l14);
                String string = context.getString(R.string.lbl_vo2max);
                return new o(string, p6.b.d(context, R.string.msg_vo2max, string), new Intent(context, (Class<?>) VO2MaxReportsActivity.class));
            }
            i2.a aVar6 = i2.f36769a;
            a2 a2Var4 = a2.GENERAL;
            aVar6.getClass();
            i2.a.b(a2Var4, "GetVo2MaxNotificationDetailsUseCase", "Vo2Max value estimation session is active for deviceUnitId: " + l14);
            jLongValue = l14.longValue();
            fVar.f21198a = context;
            fVar.f21199b = l14;
            fVar.f21202e = 2;
            if (zVar.b(jLongValue, aVar2, fVar) != aVar) {
                Long l16 = l14;
                context2 = context;
                l15 = l16;
                if (!this.f21196b.i()) {
                    i2.a aVar7 = i2.f36769a;
                    a2 a2Var5 = a2.GENERAL;
                    aVar7.getClass();
                    i2.a.b(a2Var5, "GetVo2MaxNotificationDetailsUseCase", "Application is in foreground for deviceUnitId: " + l15);
                    return null;
                }
                i2.a aVar8 = i2.f36769a;
                a2 a2Var6 = a2.GENERAL;
                aVar8.getClass();
                i2.a.b(a2Var6, "GetVo2MaxNotificationDetailsUseCase", "Application is in background for deviceUnitId: " + l15);
                x0.f23314a.getClass();
                String strD2 = dh.b.D(context2, x0.f23611rb);
                String str2 = x0.Cb;
                str2.getClass();
                String strF2 = g2.f(str2);
                LiveActivityActivity.f50544d.getClass();
                return new o(strD2, strF2, LiveActivityActivity.a.a(context2));
            }
        }
        return aVar;
        Boolean bool = (Boolean) objH;
        String str3 = "isVo2MaxValueEstimationSessionActive: " + bool.booleanValue() + " for deviceUnitId: " + l14;
        i2.a aVar9 = i2.f36769a;
        a2 a2Var7 = a2.GENERAL;
        aVar9.getClass();
        i2.a.b(a2Var7, "GetVo2MaxNotificationDetailsUseCase", str3);
        zBooleanValue = bool.booleanValue();
        if (zBooleanValue) {
            i2.a aVar10 = i2.f36769a;
            a2 a2Var8 = a2.GENERAL;
            aVar10.getClass();
            i2.a.b(a2Var8, "GetVo2MaxNotificationDetailsUseCase", "Vo2Max value estimation session is not active for deviceUnitId: " + l14);
            String string2 = context.getString(R.string.lbl_vo2max);
            return new o(string2, p6.b.d(context, R.string.msg_vo2max, string2), new Intent(context, (Class<?>) VO2MaxReportsActivity.class));
        }
        i2.a aVar11 = i2.f36769a;
        a2 a2Var9 = a2.GENERAL;
        aVar11.getClass();
        i2.a.b(a2Var9, "GetVo2MaxNotificationDetailsUseCase", "Vo2Max value estimation session is active for deviceUnitId: " + l14);
        jLongValue = l14.longValue();
        fVar.f21198a = context;
        fVar.f21199b = l14;
        fVar.f21202e = 2;
        if (zVar.b(jLongValue, aVar2, fVar) != aVar) {
            Long l17 = l14;
            context2 = context;
            l15 = l17;
            if (!this.f21196b.i()) {
                i2.a aVar12 = i2.f36769a;
                a2 a2Var10 = a2.GENERAL;
                aVar12.getClass();
                i2.a.b(a2Var10, "GetVo2MaxNotificationDetailsUseCase", "Application is in foreground for deviceUnitId: " + l15);
                return null;
            }
            i2.a aVar13 = i2.f36769a;
            a2 a2Var11 = a2.GENERAL;
            aVar13.getClass();
            i2.a.b(a2Var11, "GetVo2MaxNotificationDetailsUseCase", "Application is in background for deviceUnitId: " + l15);
            x0.f23314a.getClass();
            String strD3 = dh.b.D(context2, x0.f23611rb);
            String str4 = x0.Cb;
            str4.getClass();
            String strF3 = g2.f(str4);
            LiveActivityActivity.f50544d.getClass();
            return new o(strD3, strF3, LiveActivityActivity.a.a(context2));
        }
        return aVar;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lbu0/e$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
