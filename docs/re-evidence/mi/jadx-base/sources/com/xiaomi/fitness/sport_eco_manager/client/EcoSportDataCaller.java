package com.xiaomi.fitness.sport_eco_manager.client;

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
import com.xiaomi.fitness.sport_eco_manager.client.EcoSportDataCaller;
import com.xiaomi.fitness.sport_eco_manager_export.data.EcoSportWrapper;
import com.xiaomi.fitness.sport_eco_manager_export.data.PhoneSportData;
import com.xiaomi.fitness.sport_eco_manager_export.data.SportWrapperKt;
import com.xiaomi.fitness.sport_eco_manager_export.launch.IEcoSportRemoteData;
import com.xiaomi.fitness.sport_eco_manager_export.listener.ISportDataChangedListener;
import defpackage.dsc;
import defpackage.hsc;
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
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\n\u0018\u0000 -2\u00020\u0001:\u0002-.B\t\b\u0007¢\u0006\u0004\b+\u0010,J\u0011\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J!\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ!\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\nJ\u0019\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R/\u0010\u001b\u001a\u0004\u0018\u00010\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00138B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR \u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00070\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0018\u0010 \u001a\u00060\u001fR\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R!\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00100%8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)¨\u0006/"}, d2 = {"Lcom/xiaomi/fitness/sport_eco_manager/client/EcoSportDataCaller;", "Lcom/xiaomi/fitness/sport_eco_manager_export/launch/IEcoSportRemoteData;", "", "addSportDataTask", "()Lkotlin/Unit;", "", "obj", "Lcom/xiaomi/fitness/sport_eco_manager_export/listener/ISportDataChangedListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "addSportDataChangedListener", "(Ljava/lang/Object;Lcom/xiaomi/fitness/sport_eco_manager_export/listener/ISportDataChangedListener;)V", "removeSportDataChangedListener", "Landroid/content/Context;", "context", "init", "(Landroid/content/Context;)V", "", "sportDataChangedListenerName", "Ljava/lang/String;", "Lhsc;", "<set-?>", "mSportData$delegate", "Lcom/xiaomi/fitness/service/BinderDelegate;", "getMSportData", "()Lhsc;", "setMSportData", "(Lhsc;)V", "mSportData", "Landroid/util/ArrayMap;", "mSportDataChangedListenerArrayMap", "Landroid/util/ArrayMap;", "Lcom/xiaomi/fitness/sport_eco_manager/client/EcoSportDataCaller$DataNotifyListener;", "dataChangedListener", "Lcom/xiaomi/fitness/sport_eco_manager/client/EcoSportDataCaller$DataNotifyListener;", "Landroid/os/Handler;", "handler", "Landroid/os/Handler;", "", "delayInvokeList$delegate", "Lkotlin/Lazy;", "getDelayInvokeList", "()Ljava/util/List;", "delayInvokeList", "<init>", "()V", "Companion", "DataNotifyListener", "sport-eco-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nEcoSportDataCaller.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EcoSportDataCaller.kt\ncom/xiaomi/fitness/sport_eco_manager/client/EcoSportDataCaller\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,100:1\n1557#2:101\n1628#2,3:102\n*S KotlinDebug\n*F\n+ 1 EcoSportDataCaller.kt\ncom/xiaomi/fitness/sport_eco_manager/client/EcoSportDataCaller\n*L\n36#1:101\n36#1:102,3\n*E\n"})
public final class EcoSportDataCaller implements IEcoSportRemoteData {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(EcoSportDataCaller.class, "mSportData", "getMSportData()Lcom/xiaomi/fitness/sport_eco_manager_export/launch/IEcoSportRemoteDataApi;", 0))};

    @NotNull
    private static final String TAG = "SportDataCaller";

    @NotNull
    private final String sportDataChangedListenerName = TAG;

    /* JADX INFO: renamed from: mSportData$delegate, reason: from kotlin metadata */
    @NotNull
    private final BinderDelegate mSportData = new BinderDelegate("IEcoSportRemoteDataApi");

    @NotNull
    private final ArrayMap<Object, ISportDataChangedListener> mSportDataChangedListenerArrayMap = new ArrayMap<>();

    @NotNull
    private final DataNotifyListener dataChangedListener = new DataNotifyListener();

    @NotNull
    private final Handler handler = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: delayInvokeList$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy delayInvokeList = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: tx7
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return EcoSportDataCaller.delayInvokeList_delegate$lambda$0();
        }
    });

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/xiaomi/fitness/sport_eco_manager/client/EcoSportDataCaller$DataNotifyListener;", "Ldsc$a;", "Lcom/xiaomi/fitness/sport_eco_manager_export/data/EcoSportWrapper;", "phoneSportData", "", "onPhoneDataChanged", "(Lcom/xiaomi/fitness/sport_eco_manager_export/data/EcoSportWrapper;)V", "<init>", "(Lcom/xiaomi/fitness/sport_eco_manager/client/EcoSportDataCaller;)V", "sport-eco-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    @SourceDebugExtension({"SMAP\nEcoSportDataCaller.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EcoSportDataCaller.kt\ncom/xiaomi/fitness/sport_eco_manager/client/EcoSportDataCaller$DataNotifyListener\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,100:1\n216#2,2:101\n*S KotlinDebug\n*F\n+ 1 EcoSportDataCaller.kt\ncom/xiaomi/fitness/sport_eco_manager/client/EcoSportDataCaller$DataNotifyListener\n*L\n92#1:101,2\n*E\n"})
    public final class DataNotifyListener extends dsc.a {
        public DataNotifyListener() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void onPhoneDataChanged$lambda$1(EcoSportDataCaller this$0, EcoSportWrapper ecoSportWrapper) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Iterator it = this$0.mSportDataChangedListenerArrayMap.entrySet().iterator();
            while (it.hasNext()) {
                ((ISportDataChangedListener) ((Map.Entry) it.next()).getValue()).onPhoneDataChanged((PhoneSportData) SportWrapperKt.asData(ecoSportWrapper));
            }
        }

        @Override // defpackage.dsc
        public void onPhoneDataChanged(@Nullable final EcoSportWrapper phoneSportData) {
            Handler handler = EcoSportDataCaller.this.handler;
            final EcoSportDataCaller ecoSportDataCaller = EcoSportDataCaller.this;
            handler.post(new Runnable() { // from class: com.xiaomi.fitness.sport_eco_manager.client.a
                @Override // java.lang.Runnable
                public final void run() {
                    EcoSportDataCaller.DataNotifyListener.onPhoneDataChanged$lambda$1(ecoSportDataCaller, phoneSportData);
                }
            });
        }
    }

    public EcoSportDataCaller() {
        ServiceConnector.INSTANCE.getBinder(123, new Function1() { // from class: ux7
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return EcoSportDataCaller._init_$lambda$2(this.f36245a, (IBinder) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _init_$lambda$2(EcoSportDataCaller this$0, IBinder iBinder) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Logger.i(TAG, "SportDataCaller getBinder: mSportData");
        this$0.setMSportData(hsc.a.asInterface(iBinder));
        List<String> delayInvokeList = this$0.getDelayInvokeList();
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(delayInvokeList, 10));
        Iterator<T> it = delayInvokeList.iterator();
        while (it.hasNext()) {
            arrayList.add(Intrinsics.areEqual((String) it.next(), String.valueOf(this$0.addSportDataTask())) ? this$0.addSportDataTask() : null);
        }
        return Unit.INSTANCE;
    }

    private final Unit addSportDataTask() throws RemoteException {
        hsc mSportData = getMSportData();
        if (mSportData == null) {
            return null;
        }
        mSportData.addSportDataChangedListener(this.sportDataChangedListenerName, this.dataChangedListener);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ArrayList delayInvokeList_delegate$lambda$0() {
        return new ArrayList();
    }

    private final List<String> getDelayInvokeList() {
        return (List) this.delayInvokeList.getValue();
    }

    private final hsc getMSportData() {
        return (hsc) this.mSportData.getValue((Object) this, $$delegatedProperties[0]);
    }

    private final void setMSportData(hsc hscVar) {
        this.mSportData.setValue((Object) this, $$delegatedProperties[0], hscVar);
    }

    @Override // com.xiaomi.fitness.sport_eco_manager_export.launch.IEcoSportRemoteData
    public synchronized void addSportDataChangedListener(@NotNull Object obj, @Nullable ISportDataChangedListener listener) {
        try {
            Intrinsics.checkNotNullParameter(obj, "obj");
            this.mSportDataChangedListenerArrayMap.put(obj, listener);
            if (this.mSportDataChangedListenerArrayMap.size() == 1) {
                FitnessLogUtils.i(TAG, "binder:" + getMSportData());
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

    @Override // com.alibaba.android.arouter.facade.template.IProvider
    public void init(@Nullable Context context) {
    }

    @Override // com.xiaomi.fitness.sport_eco_manager_export.launch.IEcoSportRemoteData
    public synchronized void removeSportDataChangedListener(@NotNull Object obj, @Nullable ISportDataChangedListener listener) {
        Intrinsics.checkNotNullParameter(obj, "obj");
        this.mSportDataChangedListenerArrayMap.remove(obj);
        this.mSportDataChangedListenerArrayMap.size();
    }
}
