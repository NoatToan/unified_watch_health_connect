package vg1;

import com.garmin.android.apps.connectmobile.settings.devices.common.BikeAlarmSettingActivity;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.settings.devices.common.BikeAlarmSettingActivity$startCheckPasscodePolling$1", f = "BikeAlarmSettingActivity.kt", l = {TsExtractor.TS_PACKET_SIZE}, m = "invokeSuspend", v = 2)
public final class e extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f178095a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f178096b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ BikeAlarmSettingActivity f178097c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(BikeAlarmSettingActivity bikeAlarmSettingActivity, t13.d<? super e> dVar) {
        super(2, dVar);
        this.f178097c = bikeAlarmSettingActivity;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        e eVar = new e(this.f178097c, dVar);
        eVar.f178096b = obj;
        return eVar;
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((e) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0021  */
    /* JADX WARN: Code duplicated, block: B:13:0x002d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:16:0x0034  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x002b -> B:14:0x002e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:13:0x002d
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // v13.a
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Object r0 = r6.f178096b
            o53.b0 r0 = (o53.b0) r0
            u13.a r1 = u13.a.COROUTINE_SUSPENDED
            int r2 = r6.f178095a
            r3 = 1
            if (r2 == 0) goto L18
            if (r2 != r3) goto L11
            o13.r.b(r7)
            goto L2e
        L11:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            vb.h.z(r7)
            r7 = 0
            return r7
        L18:
            o13.r.b(r7)
        L1b:
            boolean r7 = o53.c0.g(r0)
            if (r7 == 0) goto L38
            r6.f178096b = r0
            r6.f178095a = r3
            r4 = 1000(0x3e8, double:4.94E-321)
            java.lang.Object r7 = o53.m0.b(r4, r6)
            if (r7 != r1) goto L2e
            return r1
        L2e:
            com.garmin.android.apps.connectmobile.settings.devices.common.BikeAlarmSettingActivity r7 = r6.f178097c
            com.garmin.android.apps.connectmobile.settings.devices.common.c r7 = r7.f42585a
            if (r7 == 0) goto L1b
            r7.a()
            goto L1b
        L38:
            kotlin.Unit r7 = p005kotlin.Unit.INSTANCE
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: vg1.e.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
