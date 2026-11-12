package com.xiaomi.fitness.sport_manager.client;

import android.content.Context;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.RemoteException;
import android.util.ArrayMap;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.service.BinderDelegate;
import com.xiaomi.fitness.service.ServiceConnector;
import com.xiaomi.fitness.sport_manager.client.SportDataCaller;
import com.xiaomi.fitness.sport_manager_export.data.PhoneSportData;
import com.xiaomi.fitness.sport_manager_export.data.SportLocationResult;
import com.xiaomi.fitness.sport_manager_export.data.SportWrapper;
import com.xiaomi.fitness.sport_manager_export.data.SportWrapperKt;
import com.xiaomi.fitness.sport_manager_export.launch.ISportRemoteData;
import com.xiaomi.fitness.sport_manager_export.listener.ISportDataChangedListener;
import com.xiaomi.fitness.sport_manager_export.listener.ISportSensorDataChangedListener;
import com.xiaomi.fitness.sport_xms.data.WearSensorData;
import defpackage.bzc;
import defpackage.exc;
import defpackage.ywc;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u000b\u0018\u0000 62\u00020\u0001:\u0003678B\t\b\u0007¢\u0006\u0004\b4\u00105J\u0011\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0004J!\u0010\n\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\f\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\f\u0010\u000bJ!\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0010\u0010\u000fJ\u0019\u0010\u0013\u001a\u00020\u00022\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R/\u0010 \u001a\u0004\u0018\u00010\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u00188B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR \u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b0!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R \u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\r0!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010#R\u0018\u0010&\u001a\u00060%R\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0018\u0010)\u001a\u00060(R\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010,\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R!\u00103\u001a\b\u0012\u0004\u0012\u00020\u00150.8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102¨\u00069"}, d2 = {"Lcom/xiaomi/fitness/sport_manager/client/SportDataCaller;", "Lcom/xiaomi/fitness/sport_manager_export/launch/ISportRemoteData;", "", "addSportDataTask", "()Lkotlin/Unit;", "addSportSensorDataTask", "", "obj", "Lcom/xiaomi/fitness/sport_manager_export/listener/ISportDataChangedListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "addSportDataChangedListener", "(Ljava/lang/Object;Lcom/xiaomi/fitness/sport_manager_export/listener/ISportDataChangedListener;)V", "removeSportDataChangedListener", "Lcom/xiaomi/fitness/sport_manager_export/listener/ISportSensorDataChangedListener;", "addSportSensorDataChangedListener", "(Ljava/lang/Object;Lcom/xiaomi/fitness/sport_manager_export/listener/ISportSensorDataChangedListener;)V", "removeSportSensorDataChangedListener", "Landroid/content/Context;", "context", "init", "(Landroid/content/Context;)V", "", "sportDataChangedListenerName", "Ljava/lang/String;", "Lbzc;", "<set-?>", "mSportData$delegate", "Lcom/xiaomi/fitness/service/BinderDelegate;", "getMSportData", "()Lbzc;", "setMSportData", "(Lbzc;)V", "mSportData", "Landroid/util/ArrayMap;", "mSportDataChangedListenerArrayMap", "Landroid/util/ArrayMap;", "mSportSensorDataChangedListenerArrayMap", "Lcom/xiaomi/fitness/sport_manager/client/SportDataCaller$DataNotifyListener;", "dataChangedListener", "Lcom/xiaomi/fitness/sport_manager/client/SportDataCaller$DataNotifyListener;", "Lcom/xiaomi/fitness/sport_manager/client/SportDataCaller$SensorDataNotifyListener;", "sensorDataChangedListener", "Lcom/xiaomi/fitness/sport_manager/client/SportDataCaller$SensorDataNotifyListener;", "Landroid/os/Handler;", "handler", "Landroid/os/Handler;", "", "delayInvokeList$delegate", "Lkotlin/Lazy;", "getDelayInvokeList", "()Ljava/util/List;", "delayInvokeList", "<init>", "()V", "Companion", "DataNotifyListener", "SensorDataNotifyListener", "sport-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nSportDataCaller.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SportDataCaller.kt\ncom/xiaomi/fitness/sport_manager/client/SportDataCaller\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,151:1\n1557#2:152\n1628#2,3:153\n*S KotlinDebug\n*F\n+ 1 SportDataCaller.kt\ncom/xiaomi/fitness/sport_manager/client/SportDataCaller\n*L\n42#1:152\n42#1:153,3\n*E\n"})
public final class SportDataCaller implements ISportRemoteData {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(SportDataCaller.class, "mSportData", "getMSportData()Lcom/xiaomi/fitness/sport_manager_export/launch/ISportRemoteDataApi;", 0))};

    @NotNull
    private static final String TAG = "SportDataCaller";

    @NotNull
    private final String sportDataChangedListenerName = TAG;

    /* JADX INFO: renamed from: mSportData$delegate, reason: from kotlin metadata */
    @NotNull
    private final BinderDelegate mSportData = new BinderDelegate("ISportRemoteDataApi");

    @NotNull
    private final ArrayMap<Object, ISportDataChangedListener> mSportDataChangedListenerArrayMap = new ArrayMap<>();

    @NotNull
    private final ArrayMap<Object, ISportSensorDataChangedListener> mSportSensorDataChangedListenerArrayMap = new ArrayMap<>();

    @NotNull
    private final DataNotifyListener dataChangedListener = new DataNotifyListener();

    @NotNull
    private final SensorDataNotifyListener sensorDataChangedListener = new SensorDataNotifyListener();

    @NotNull
    private final Handler handler = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: delayInvokeList$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy delayInvokeList = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: fdn
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SportDataCaller.delayInvokeList_delegate$lambda$0();
        }
    });

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0006¨\u0006\u000b"}, d2 = {"Lcom/xiaomi/fitness/sport_manager/client/SportDataCaller$DataNotifyListener;", "Lywc$a;", "Lcom/xiaomi/fitness/sport_manager_export/data/SportWrapper;", "phoneSportData", "", "onPhoneDataChanged", "(Lcom/xiaomi/fitness/sport_manager_export/data/SportWrapper;)V", "location", "onLocationChanged", "<init>", "(Lcom/xiaomi/fitness/sport_manager/client/SportDataCaller;)V", "sport-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    @SourceDebugExtension({"SMAP\nSportDataCaller.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SportDataCaller.kt\ncom/xiaomi/fitness/sport_manager/client/SportDataCaller$DataNotifyListener\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,151:1\n216#2,2:152\n216#2,2:154\n*S KotlinDebug\n*F\n+ 1 SportDataCaller.kt\ncom/xiaomi/fitness/sport_manager/client/SportDataCaller$DataNotifyListener\n*L\n126#1:152,2\n134#1:154,2\n*E\n"})
    public final class DataNotifyListener extends ywc.a {
        public DataNotifyListener() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void onLocationChanged$lambda$3(SportDataCaller this$0, SportWrapper sportWrapper) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Iterator it = this$0.mSportDataChangedListenerArrayMap.entrySet().iterator();
            while (it.hasNext()) {
                ((ISportDataChangedListener) ((Map.Entry) it.next()).getValue()).onLocationChanged((SportLocationResult) SportWrapperKt.asData(sportWrapper));
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void onPhoneDataChanged$lambda$1(SportDataCaller this$0, SportWrapper sportWrapper) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Iterator it = this$0.mSportDataChangedListenerArrayMap.entrySet().iterator();
            while (it.hasNext()) {
                ((ISportDataChangedListener) ((Map.Entry) it.next()).getValue()).onPhoneDataChanged((PhoneSportData) SportWrapperKt.asData(sportWrapper));
            }
        }

        @Override // defpackage.ywc
        public void onLocationChanged(@Nullable final SportWrapper location) {
            Handler handler = SportDataCaller.this.handler;
            final SportDataCaller sportDataCaller = SportDataCaller.this;
            handler.post(new Runnable() { // from class: com.xiaomi.fitness.sport_manager.client.a
                @Override // java.lang.Runnable
                public final void run() {
                    SportDataCaller.DataNotifyListener.onLocationChanged$lambda$3(sportDataCaller, location);
                }
            });
        }

        @Override // defpackage.ywc
        public void onPhoneDataChanged(@Nullable final SportWrapper phoneSportData) {
            Handler handler = SportDataCaller.this.handler;
            final SportDataCaller sportDataCaller = SportDataCaller.this;
            handler.post(new Runnable() { // from class: com.xiaomi.fitness.sport_manager.client.b
                @Override // java.lang.Runnable
                public final void run() {
                    SportDataCaller.DataNotifyListener.onPhoneDataChanged$lambda$1(sportDataCaller, phoneSportData);
                }
            });
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/xiaomi/fitness/sport_manager/client/SportDataCaller$SensorDataNotifyListener;", "Lexc$a;", "Lcom/xiaomi/fitness/sport_manager_export/data/SportWrapper;", "wearSensorData", "", "onSensorDataChanged", "(Lcom/xiaomi/fitness/sport_manager_export/data/SportWrapper;)V", "<init>", "(Lcom/xiaomi/fitness/sport_manager/client/SportDataCaller;)V", "sport-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    @SourceDebugExtension({"SMAP\nSportDataCaller.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SportDataCaller.kt\ncom/xiaomi/fitness/sport_manager/client/SportDataCaller$SensorDataNotifyListener\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,151:1\n216#2,2:152\n*S KotlinDebug\n*F\n+ 1 SportDataCaller.kt\ncom/xiaomi/fitness/sport_manager/client/SportDataCaller$SensorDataNotifyListener\n*L\n144#1:152,2\n*E\n"})
    public final class SensorDataNotifyListener extends exc.a {
        public SensorDataNotifyListener() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void onSensorDataChanged$lambda$1(SportDataCaller this$0, SportWrapper sportWrapper) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Iterator it = this$0.mSportSensorDataChangedListenerArrayMap.entrySet().iterator();
            while (it.hasNext()) {
                ((ISportSensorDataChangedListener) ((Map.Entry) it.next()).getValue()).onReceiveWearSensorData((WearSensorData) SportWrapperKt.asData(sportWrapper));
            }
        }

        @Override // defpackage.exc
        public void onSensorDataChanged(@Nullable final SportWrapper wearSensorData) {
            Handler handler = SportDataCaller.this.handler;
            final SportDataCaller sportDataCaller = SportDataCaller.this;
            handler.post(new Runnable() { // from class: com.xiaomi.fitness.sport_manager.client.c
                @Override // java.lang.Runnable
                public final void run() {
                    SportDataCaller.SensorDataNotifyListener.onSensorDataChanged$lambda$1(sportDataCaller, wearSensorData);
                }
            });
        }
    }

    public SportDataCaller() {
        ServiceConnector.INSTANCE.getBinder(23, new Function1() { // from class: gdn
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SportDataCaller._init_$lambda$2(this.f18860a, (IBinder) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _init_$lambda$2(SportDataCaller this$0, IBinder iBinder) throws RemoteException {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Logger.i(TAG, "SportDataCaller getBinder: mSportData");
        this$0.setMSportData(bzc.a.asInterface(iBinder));
        List<String> delayInvokeList = this$0.getDelayInvokeList();
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(delayInvokeList, 10));
        for (String str : delayInvokeList) {
            arrayList.add(Intrinsics.areEqual(str, String.valueOf(this$0.addSportDataTask())) ? this$0.addSportDataTask() : Intrinsics.areEqual(str, String.valueOf(this$0.addSportSensorDataTask())) ? this$0.addSportSensorDataTask() : null);
        }
        return Unit.INSTANCE;
    }

    private final Unit addSportDataTask() throws RemoteException {
        bzc mSportData = getMSportData();
        if (mSportData == null) {
            return null;
        }
        mSportData.addSportDataChangedListener(this.sportDataChangedListenerName, this.dataChangedListener);
        return Unit.INSTANCE;
    }

    private final Unit addSportSensorDataTask() throws RemoteException {
        bzc mSportData = getMSportData();
        if (mSportData == null) {
            return null;
        }
        mSportData.addSportSensorDataChangedListener(this.sportDataChangedListenerName, this.sensorDataChangedListener);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ArrayList delayInvokeList_delegate$lambda$0() {
        return new ArrayList();
    }

    private final List<String> getDelayInvokeList() {
        return (List) this.delayInvokeList.getValue();
    }

    private final bzc getMSportData() {
        return (bzc) this.mSportData.getValue((Object) this, $$delegatedProperties[0]);
    }

    private final void setMSportData(bzc bzcVar) {
        this.mSportData.setValue((Object) this, $$delegatedProperties[0], bzcVar);
    }

    @Override // com.xiaomi.fitness.sport_manager_export.launch.ISportRemoteData
    public synchronized void addSportDataChangedListener(@NotNull Object obj, @Nullable ISportDataChangedListener listener) {
        try {
            Intrinsics.checkNotNullParameter(obj, "obj");
            this.mSportDataChangedListenerArrayMap.put(obj, listener);
            if (this.mSportDataChangedListenerArrayMap.size() == 1) {
                FitnessLogUtils.i(TAG, "addSportDataChangedListener , binder:" + getMSportData());
                if (getMSportData() == null) {
                    getDelayInvokeList().add(String.valueOf(addSportDataTask()));
                } else {
                    addSportDataTask();
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.xiaomi.fitness.sport_manager_export.launch.ISportRemoteData
    public void addSportSensorDataChangedListener(@NotNull Object obj, @Nullable ISportSensorDataChangedListener listener) throws RemoteException {
        Intrinsics.checkNotNullParameter(obj, "obj");
        this.mSportSensorDataChangedListenerArrayMap.put(obj, listener);
        if (this.mSportSensorDataChangedListenerArrayMap.size() == 1) {
            FitnessLogUtils.i(TAG, "addSportSensorDataChangedListener , binder:" + getMSportData());
            if (getMSportData() == null) {
                getDelayInvokeList().add(String.valueOf(addSportSensorDataTask()));
            } else {
                addSportSensorDataTask();
            }
        }
    }

    @Override // com.alibaba.android.arouter.facade.template.IProvider
    public void init(@Nullable Context context) {
    }

    @Override // com.xiaomi.fitness.sport_manager_export.launch.ISportRemoteData
    public synchronized void removeSportDataChangedListener(@NotNull Object obj, @Nullable ISportDataChangedListener listener) {
        Intrinsics.checkNotNullParameter(obj, "obj");
        this.mSportDataChangedListenerArrayMap.remove(obj);
        this.mSportDataChangedListenerArrayMap.size();
    }

    @Override // com.xiaomi.fitness.sport_manager_export.launch.ISportRemoteData
    public void removeSportSensorDataChangedListener(@NotNull Object obj, @Nullable ISportSensorDataChangedListener listener) {
        Intrinsics.checkNotNullParameter(obj, "obj");
    }
}
