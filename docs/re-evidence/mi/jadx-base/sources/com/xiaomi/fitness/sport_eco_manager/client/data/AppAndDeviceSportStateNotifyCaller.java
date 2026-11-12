package com.xiaomi.fitness.sport_eco_manager.client.data;

import android.os.Handler;
import android.os.Looper;
import android.util.ArrayMap;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fit.fitness.parser.schema.DailyRecordKey;
import com.xiaomi.fitness.sport_eco_manager.client.data.AppAndDeviceSportStateNotifyCaller;
import com.xiaomi.fitness.sport_eco_manager_export.listener.ISportStateChangedListener;
import defpackage.esc;
import java.util.Iterator;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u0007¢\u0006\u0004\b\u001e\u0010\u000bJ/\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\f\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0011\u0010\u000bJ\u000f\u0010\u0012\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0012\u0010\u000bR\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R+\u0010\u001d\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0017\u0012\u0004\u0012\u00020\u00180\u00168@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006 "}, d2 = {"Lcom/xiaomi/fitness/sport_eco_manager/client/data/AppAndDeviceSportStateNotifyCaller;", "Lesc$a;", "", "startTime", "timeZone", DailyRecordKey.sportType, "sportLaunchType", "", "onSportStarted", "(IIII)V", "onSportRestarted", "()V", "onSportPaused", "", "validSport", "onSportFinished", "(Z)V", "onSportRested", "onSportShutdown", "Landroid/os/Handler;", "handler", "Landroid/os/Handler;", "Landroid/util/ArrayMap;", "Ljava/lang/Class;", "Lcom/xiaomi/fitness/sport_eco_manager_export/listener/ISportStateChangedListener;", "mAppAndDeviceSportStateChangedListenerArrayMap$delegate", "Lkotlin/Lazy;", "getMAppAndDeviceSportStateChangedListenerArrayMap$sport_eco_manager_chinaProductRelease", "()Landroid/util/ArrayMap;", "mAppAndDeviceSportStateChangedListenerArrayMap", "<init>", "Companion", "sport-eco-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nAppAndDeviceSportStateNotifyCaller.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppAndDeviceSportStateNotifyCaller.kt\ncom/xiaomi/fitness/sport_eco_manager/client/data/AppAndDeviceSportStateNotifyCaller\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,90:1\n216#2,2:91\n216#2,2:93\n216#2,2:95\n216#2,2:97\n216#2,2:99\n216#2,2:101\n*S KotlinDebug\n*F\n+ 1 AppAndDeviceSportStateNotifyCaller.kt\ncom/xiaomi/fitness/sport_eco_manager/client/data/AppAndDeviceSportStateNotifyCaller\n*L\n33#1:91,2\n43#1:93,2\n55#1:95,2\n67#1:97,2\n76#1:99,2\n85#1:101,2\n*E\n"})
public final class AppAndDeviceSportStateNotifyCaller extends esc.a {

    @NotNull
    public static final String TAG = "AppAndDeviceSportStateNotifyListener";

    @NotNull
    public static final String appAndDeviceSportStateChangedListenerName = "AppAndDeviceSportStateNotifyCaller";

    @NotNull
    private final Handler handler = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: mAppAndDeviceSportStateChangedListenerArrayMap$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy mAppAndDeviceSportStateChangedListenerArrayMap = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: ee1
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return AppAndDeviceSportStateNotifyCaller.mAppAndDeviceSportStateChangedListenerArrayMap_delegate$lambda$0();
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final ArrayMap mAppAndDeviceSportStateChangedListenerArrayMap_delegate$lambda$0() {
        return new ArrayMap();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onSportFinished$lambda$8(AppAndDeviceSportStateNotifyCaller this$0, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Iterator<Map.Entry<Class<?>, ISportStateChangedListener>> it = this$0.getMAppAndDeviceSportStateChangedListenerArrayMap$sport_eco_manager_chinaProductRelease().entrySet().iterator();
        while (it.hasNext()) {
            it.next().getValue().onSportFinished(z, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onSportPaused$lambda$6(AppAndDeviceSportStateNotifyCaller this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Iterator<Map.Entry<Class<?>, ISportStateChangedListener>> it = this$0.getMAppAndDeviceSportStateChangedListenerArrayMap$sport_eco_manager_chinaProductRelease().entrySet().iterator();
        while (it.hasNext()) {
            it.next().getValue().onSportPaused();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onSportRestarted$lambda$4(AppAndDeviceSportStateNotifyCaller this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Iterator<Map.Entry<Class<?>, ISportStateChangedListener>> it = this$0.getMAppAndDeviceSportStateChangedListenerArrayMap$sport_eco_manager_chinaProductRelease().entrySet().iterator();
        while (it.hasNext()) {
            it.next().getValue().onSportRestarted();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onSportRested$lambda$10(AppAndDeviceSportStateNotifyCaller this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Iterator<Map.Entry<Class<?>, ISportStateChangedListener>> it = this$0.getMAppAndDeviceSportStateChangedListenerArrayMap$sport_eco_manager_chinaProductRelease().entrySet().iterator();
        while (it.hasNext()) {
            it.next().getValue().onSportRested();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onSportShutdown$lambda$12(AppAndDeviceSportStateNotifyCaller this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Iterator<Map.Entry<Class<?>, ISportStateChangedListener>> it = this$0.getMAppAndDeviceSportStateChangedListenerArrayMap$sport_eco_manager_chinaProductRelease().entrySet().iterator();
        while (it.hasNext()) {
            it.next().getValue().onSportShutdown();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onSportStarted$lambda$2(AppAndDeviceSportStateNotifyCaller this$0, int i, int i2, int i3, int i4) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Iterator<Map.Entry<Class<?>, ISportStateChangedListener>> it = this$0.getMAppAndDeviceSportStateChangedListenerArrayMap$sport_eco_manager_chinaProductRelease().entrySet().iterator();
        while (it.hasNext()) {
            it.next().getValue().onSportStarted(i, i2, i3, i4);
        }
    }

    @NotNull
    public final ArrayMap<Class<?>, ISportStateChangedListener> getMAppAndDeviceSportStateChangedListenerArrayMap$sport_eco_manager_chinaProductRelease() {
        return (ArrayMap) this.mAppAndDeviceSportStateChangedListenerArrayMap.getValue();
    }

    @Override // defpackage.esc
    public void onSportFinished(final boolean validSport) {
        FitnessLogUtils.d("AppAndDeviceSportStateNotifyListener", "onSportFinished callback success, sport validSport " + validSport);
        this.handler.post(new Runnable() { // from class: oe1
            @Override // java.lang.Runnable
            public final void run() {
                AppAndDeviceSportStateNotifyCaller.onSportFinished$lambda$8(this.f29054a, validSport);
            }
        });
    }

    @Override // defpackage.esc
    public void onSportPaused() {
        FitnessLogUtils.d("AppAndDeviceSportStateNotifyListener", "onSportPaused callback success , mAppAndDeviceSportStateChangedListenerArrayMap :" + getMAppAndDeviceSportStateChangedListenerArrayMap$sport_eco_manager_chinaProductRelease().size() + " , this: " + this);
        this.handler.post(new Runnable() { // from class: ne1
            @Override // java.lang.Runnable
            public final void run() {
                AppAndDeviceSportStateNotifyCaller.onSportPaused$lambda$6(this.f27842a);
            }
        });
    }

    @Override // defpackage.esc
    public void onSportRestarted() {
        FitnessLogUtils.d("AppAndDeviceSportStateNotifyListener", "onSportRestarted callback success");
        this.handler.post(new Runnable() { // from class: ie1
            @Override // java.lang.Runnable
            public final void run() {
                AppAndDeviceSportStateNotifyCaller.onSportRestarted$lambda$4(this.f21043a);
            }
        });
    }

    @Override // defpackage.esc
    public void onSportRested() {
        FitnessLogUtils.d("AppAndDeviceSportStateNotifyListener", "onSportRested callback success");
        this.handler.post(new Runnable() { // from class: ge1
            @Override // java.lang.Runnable
            public final void run() {
                AppAndDeviceSportStateNotifyCaller.onSportRested$lambda$10(this.f18879a);
            }
        });
    }

    @Override // defpackage.esc
    public void onSportShutdown() {
        FitnessLogUtils.d("AppAndDeviceSportStateNotifyListener", "onSportShutdown callback success");
        this.handler.post(new Runnable() { // from class: ke1
            @Override // java.lang.Runnable
            public final void run() {
                AppAndDeviceSportStateNotifyCaller.onSportShutdown$lambda$12(this.f23766a);
            }
        });
    }

    @Override // defpackage.esc
    public void onSportStarted(final int startTime, final int timeZone, final int sportType, final int sportLaunchType) {
        FitnessLogUtils.d("AppAndDeviceSportStateNotifyListener", "onSportStarted callback success , startTime : " + startTime + " , timeZone : " + timeZone + " ,sportType : " + sportType + " ,sportLaunchType:" + sportLaunchType);
        this.handler.post(new Runnable() { // from class: me1
            @Override // java.lang.Runnable
            public final void run() {
                AppAndDeviceSportStateNotifyCaller.onSportStarted$lambda$2(this.f26050a, startTime, timeZone, sportType, sportLaunchType);
            }
        });
    }
}
