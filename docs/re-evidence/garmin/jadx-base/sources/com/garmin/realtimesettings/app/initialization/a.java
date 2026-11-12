package com.garmin.realtimesettings.app.initialization;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.garmin.proto.generated.GDIRealtimeSettingsProto;
import cx2.g;
import cx2.h;
import iw2.k;
import iw2.w;
import java.io.File;
import o13.r;
import o53.s0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import v13.c;
import vw2.d;
import vw2.e;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/garmin/realtimesettings/app/initialization/a;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "deviceUnitId", "", "bleMacAddress", "<init>", "(Landroid/content/Context;JLjava/lang/String;)V", "real-time-settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f52585a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f52586b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f52587c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final h f52588d;

    public a(Context context, long j8, String str) {
        context.getClass();
        str.getClass();
        this.f52585a = context;
        this.f52586b = j8;
        this.f52587c = str;
        this.f52588d = new h("InitializerCoordinator", null, 2, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(c cVar) throws Throwable {
        d dVar;
        if (cVar instanceof d) {
            dVar = (d) cVar;
            int i14 = dVar.f180594c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                dVar.f180594c = i14 - Integer.MIN_VALUE;
            } else {
                dVar = new d(this, cVar);
            }
        } else {
            dVar = new d(this, cVar);
        }
        Object objE0 = dVar.f180592a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = dVar.f180594c;
        if (i15 == 0) {
            r.b(objE0);
            w wVar = w.f95547a;
            dVar.f180594c = 1;
            wVar.getClass();
            x53.c cVar2 = s0.f129406a;
            objE0 = ge1.b.e0(x53.b.f189152a, new k(this.f52585a, this.f52586b, GDIRealtimeSettingsProto.WellKnownCompositionId.DEVICE_SETTINGS_HOME_VALUE, null), dVar);
            if (objE0 == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(objE0);
        }
        return Boolean.valueOf(((File) objE0).exists());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(int i14, boolean z14, c cVar) throws Throwable {
        e eVar;
        int i15;
        boolean z15;
        if (cVar instanceof e) {
            eVar = (e) cVar;
            int i16 = eVar.f180600f;
            if ((i16 & Integer.MIN_VALUE) != 0) {
                eVar.f180600f = i16 - Integer.MIN_VALUE;
            } else {
                eVar = new e(this, cVar);
            }
        } else {
            eVar = new e(this, cVar);
        }
        Object obj = eVar.f180598d;
        Object obj2 = u13.a.COROUTINE_SUSPENDED;
        int i17 = eVar.f180600f;
        Context context = this.f52585a;
        h hVar = this.f52588d;
        if (i17 == 0) {
            r.b(obj);
            hVar.getClass();
            boolean zD = g.d(context, this.f52587c);
            eVar.f180595a = i14;
            eVar.f180596b = z14;
            eVar.f180597c = zD;
            eVar.f180600f = 1;
            Object objA = a(eVar);
            if (objA == obj2) {
                return obj2;
            }
            i15 = i14;
            z15 = zD;
            obj = objA;
        } else {
            if (i17 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z15 = eVar.f180597c;
            z14 = eVar.f180596b;
            i15 = eVar.f180595a;
            r.b(obj);
        }
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        if (z15) {
            hVar.getClass();
            RealTimeSettingsInitializerActivity.a.a(RealTimeSettingsInitializerActivity.f52581r, context, i15, !z14, 4);
            b.f52589a.getClass();
            b.a().a();
        } else if (zBooleanValue) {
            hVar.getClass();
            RealTimeSettingsInitializerActivity.a.a(RealTimeSettingsInitializerActivity.f52581r, context, GDIRealtimeSettingsProto.WellKnownCompositionId.DEVICE_SETTINGS_HOME_VALUE, !z14, 4);
            b.f52589a.getClass();
            b.a().a();
        } else {
            hVar.getClass();
            RealTimeSettingsInitializerActivity.a.a(RealTimeSettingsInitializerActivity.f52581r, context, GDIRealtimeSettingsProto.WellKnownCompositionId.APP_DEFAULT_SETTINGS_VALUE, !z14, 4);
            b.f52589a.getClass();
            b.a().a();
        }
        return Unit.INSTANCE;
    }
}
