package com.xiaomi.fitness.sport_manager.client.data;

import android.os.Handler;
import android.os.Looper;
import android.util.ArrayMap;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fit.fitness.parser.schema.DailyRecordKey;
import com.xiaomi.fitness.sport_manager.client.data.AppAndDeviceSportStateNotifyCaller;
import com.xiaomi.fitness.sport_manager_export.listener.ISportStateChangedListener;
import defpackage.ixc;
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
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\u0007¢\u0006\u0004\b\u001d\u0010\fJ7\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\fJ\u0017\u0010\u0010\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R+\u0010\u001c\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0016\u0012\u0004\u0012\u00020\u00170\u00158@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001f"}, d2 = {"Lcom/xiaomi/fitness/sport_manager/client/data/AppAndDeviceSportStateNotifyCaller;", "Lixc$a;", "", "code", "startTime", "timeZone", DailyRecordKey.sportType, "sportLaunchType", "", "onSportStarted", "(IIIII)V", "onSportRestarted", "()V", "onSportPaused", "", "validSport", "onSportFinished", "(Z)V", "Landroid/os/Handler;", "handler", "Landroid/os/Handler;", "Landroid/util/ArrayMap;", "Ljava/lang/Class;", "Lcom/xiaomi/fitness/sport_manager_export/listener/ISportStateChangedListener;", "mAppAndDeviceSportStateChangedListenerArrayMap$delegate", "Lkotlin/Lazy;", "getMAppAndDeviceSportStateChangedListenerArrayMap$sport_manager_chinaProductRelease", "()Landroid/util/ArrayMap;", "mAppAndDeviceSportStateChangedListenerArrayMap", "<init>", "Companion", "sport-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nAppAndDeviceSportStateNotifyCaller.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppAndDeviceSportStateNotifyCaller.kt\ncom/xiaomi/fitness/sport_manager/client/data/AppAndDeviceSportStateNotifyCaller\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,73:1\n216#2,2:74\n216#2,2:76\n216#2,2:78\n216#2,2:80\n*S KotlinDebug\n*F\n+ 1 AppAndDeviceSportStateNotifyCaller.kt\ncom/xiaomi/fitness/sport_manager/client/data/AppAndDeviceSportStateNotifyCaller\n*L\n34#1:74,2\n44#1:76,2\n56#1:78,2\n68#1:80,2\n*E\n"})
public final class AppAndDeviceSportStateNotifyCaller extends ixc.a {

    @NotNull
    public static final String TAG = "AppAndDeviceSportStateNotifyListener";

    @NotNull
    public static final String appAndDeviceSportStateChangedListenerName = "AppAndDeviceSportStateNotifyCaller";

    @NotNull
    private final Handler handler = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: mAppAndDeviceSportStateChangedListenerArrayMap$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy mAppAndDeviceSportStateChangedListenerArrayMap = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: he1
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
        Iterator<Map.Entry<Class<?>, ISportStateChangedListener>> it = this$0.getMAppAndDeviceSportStateChangedListenerArrayMap$sport_manager_chinaProductRelease().entrySet().iterator();
        while (it.hasNext()) {
            it.next().getValue().onSportFinished(z, null, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onSportPaused$lambda$6(AppAndDeviceSportStateNotifyCaller this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Iterator<Map.Entry<Class<?>, ISportStateChangedListener>> it = this$0.getMAppAndDeviceSportStateChangedListenerArrayMap$sport_manager_chinaProductRelease().entrySet().iterator();
        while (it.hasNext()) {
            it.next().getValue().onSportPaused();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onSportRestarted$lambda$4(AppAndDeviceSportStateNotifyCaller this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Iterator<Map.Entry<Class<?>, ISportStateChangedListener>> it = this$0.getMAppAndDeviceSportStateChangedListenerArrayMap$sport_manager_chinaProductRelease().entrySet().iterator();
        while (it.hasNext()) {
            it.next().getValue().onSportRestarted();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onSportStarted$lambda$2(AppAndDeviceSportStateNotifyCaller this$0, int i, int i2, int i3, int i4, int i5) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Iterator<Map.Entry<Class<?>, ISportStateChangedListener>> it = this$0.getMAppAndDeviceSportStateChangedListenerArrayMap$sport_manager_chinaProductRelease().entrySet().iterator();
        while (it.hasNext()) {
            it.next().getValue().onSportStarted(i, i2, i3, i4, i5);
        }
    }

    @NotNull
    public final ArrayMap<Class<?>, ISportStateChangedListener> getMAppAndDeviceSportStateChangedListenerArrayMap$sport_manager_chinaProductRelease() {
        return (ArrayMap) this.mAppAndDeviceSportStateChangedListenerArrayMap.getValue();
    }

    @Override // defpackage.ixc
    public void onSportFinished(final boolean validSport) {
        FitnessLogUtils.d("AppAndDeviceSportStateNotifyListener", "onSportFinished callback success, sport validSport " + validSport);
        this.handler.post(new Runnable() { // from class: fe1
            @Override // java.lang.Runnable
            public final void run() {
                AppAndDeviceSportStateNotifyCaller.onSportFinished$lambda$8(this.f17696a, validSport);
            }
        });
    }

    @Override // defpackage.ixc
    public void onSportPaused() {
        FitnessLogUtils.d("AppAndDeviceSportStateNotifyListener", "onSportPaused callback success , mAppAndDeviceSportStateChangedListenerArrayMap :" + getMAppAndDeviceSportStateChangedListenerArrayMap$sport_manager_chinaProductRelease().size() + " , this: " + this);
        this.handler.post(new Runnable() { // from class: je1
            @Override // java.lang.Runnable
            public final void run() {
                AppAndDeviceSportStateNotifyCaller.onSportPaused$lambda$6(this.f22692a);
            }
        });
    }

    @Override // defpackage.ixc
    public void onSportRestarted() {
        FitnessLogUtils.d("AppAndDeviceSportStateNotifyListener", "onSportRestarted callback success");
        this.handler.post(new Runnable() { // from class: de1
            @Override // java.lang.Runnable
            public final void run() {
                AppAndDeviceSportStateNotifyCaller.onSportRestarted$lambda$4(this.f15426a);
            }
        });
    }

    @Override // defpackage.ixc
    public void onSportStarted(final int code, final int startTime, final int timeZone, final int sportType, final int sportLaunchType) {
        FitnessLogUtils.d("AppAndDeviceSportStateNotifyListener", "onSportStarted callback success , startTime : " + startTime + " , timeZone : " + timeZone + " ,sportType : " + sportType + " ,sportLaunchType:" + sportLaunchType);
        this.handler.post(new Runnable() { // from class: le1
            @Override // java.lang.Runnable
            public final void run() {
                AppAndDeviceSportStateNotifyCaller.onSportStarted$lambda$2(this.f24959a, code, startTime, timeZone, sportType, sportLaunchType);
            }
        });
    }
}
