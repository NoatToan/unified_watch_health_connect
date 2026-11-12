package com.xiaomi.fitness.eco.device.manager.remote;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.text.TextUtils;
import androidx.health.connect.client.records.CervicalMucusRecord;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.xiaomi.fit.data.common.util.FitnessFilePathUtils;
import com.xiaomi.fit.eco.device.EcoDeviceFactory;
import com.xiaomi.fit.eco.device.extensions.EcoDeviceModelExtKt;
import com.xiaomi.fitness.common.extensions.AnyExtKt;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.connect.export.EcoConnectStateObserver;
import com.xiaomi.fitness.device.manager.l;
import com.xiaomi.fitness.eco.device.manager.b;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceManager;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceManagerExtKt;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceStatus;
import com.xiaomi.fitness.eco.device.manager.export.bean.EcoDevice;
import com.xiaomi.fitness.eco.device.manager.export.bean.EcoDeviceInfo;
import com.xiaomi.fitness.eco.device.manager.export.bean.EcoLocalDevice;
import com.xiaomi.fitness.eco.device.manager.export.bean.EcoProduct;
import com.xiaomi.fitness.eco.device.manager.extensions.EcoBluetoothExtKt;
import com.xiaomi.fitness.eco.device.manager.extensions.EcoDeviceExtKt;
import com.xiaomi.fitness.eco.device.manager.extensions.EcoOhterExtKt;
import com.xiaomi.fitness.eco.device.manager.remote.EcoDeviceManagerRemoteImpl;
import com.xiaomi.fitness.eco.device.model.api.EcoDeviceBinder;
import com.xiaomi.fitness.eco.device.model.api.EcoDeviceManagerInternal;
import com.xiaomi.fitness.eco.device.model.api.EcoDeviceManagerInternalRemote;
import com.xiaomi.fitness.eco.device.model.api.EcoProductManagerRemoteInternal;
import com.xiaomi.fitness.net.extensions.ScopeExtKt;
import com.xiaomi.fitness.net.response.ApiException;
import com.xiaomi.fitness.net.scope.AndroidScope;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.SportSummary;
import defpackage.g8h;
import defpackage.hbk;
import defpackage.ms7;
import defpackage.s33;
import defpackage.sh7;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000È\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\b\t*\u0002\u0090\u0001\b\u0007\u0018\u0000 \u0097\u00012\u00020\u0001:\u0002\u0097\u0001B\u0013\b\u0007\u0012\u0006\u0010~\u001a\u00020}¢\u0006\u0006\b\u0095\u0001\u0010\u0096\u0001J\u001b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0010\u001a\u00020\b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0014\u001a\u00020\b2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\rH\u0002¢\u0006\u0004\b\u0014\u0010\u0011J\u001f\u0010\u0016\u001a\u00020\b2\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\rH\u0002¢\u0006\u0004\b\u0016\u0010\u0011J\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0017\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J#\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00150\r2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001e\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJi\u0010(\u001a\u0004\u0018\u00010'2\u0006\u0010 \u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00022\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b(\u0010)J\u0019\u0010(\u001a\u0004\u0018\u00010'2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b(\u0010*J\u0017\u0010+\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b+\u0010\nJ\u0019\u0010,\u001a\u00020\u001c2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b,\u0010-J\u0019\u0010/\u001a\u00020.2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b/\u00100J!\u00102\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u00101\u001a\u00020.H\u0016¢\u0006\u0004\b2\u00103J\u001b\u00104\u001a\u0004\u0018\u00010\u00152\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b4\u00105J\u0017\u00107\u001a\u00020\b2\u0006\u00106\u001a\u00020\u0015H\u0016¢\u0006\u0004\b7\u00108J\u001f\u0010:\u001a\u00020\b2\u0006\u00109\u001a\u00020\u001c2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b:\u0010;J\u0019\u0010<\u001a\u00020\u001c2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b<\u0010-J\u0019\u0010=\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b=\u0010\nJ\u0019\u0010>\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b>\u0010\nJ\u0017\u0010?\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b?\u0010\nJ\u0015\u0010A\u001a\b\u0012\u0004\u0012\u00020@0\rH\u0016¢\u0006\u0004\bA\u0010BJ\u0017\u0010E\u001a\u00020\b2\u0006\u0010D\u001a\u00020CH\u0016¢\u0006\u0004\bE\u0010FJ\u0017\u0010G\u001a\u00020\b2\u0006\u0010D\u001a\u00020CH\u0016¢\u0006\u0004\bG\u0010FJ\u0010\u0010H\u001a\u00020\bH\u0096@¢\u0006\u0004\bH\u0010IJ\u0015\u0010J\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\bJ\u0010\nJ\u0019\u0010K\u001a\u0004\u0018\u00010@2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\bK\u0010LJ\u000f\u0010M\u001a\u00020\bH\u0016¢\u0006\u0004\bM\u0010\fJ\u0015\u0010N\u001a\b\u0012\u0004\u0012\u00020\u00150\rH\u0016¢\u0006\u0004\bN\u0010BJ\u0019\u0010O\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\bO\u00105J\u001b\u0010P\u001a\u0004\u0018\u00010@2\b\u0010 \u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\bP\u0010LJ\u0019\u0010S\u001a\u0004\u0018\u00010R2\u0006\u0010Q\u001a\u00020\u0002H\u0016¢\u0006\u0004\bS\u0010TJ\u0019\u0010U\u001a\u0004\u0018\u00010@2\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\bU\u0010LJY\u0010\\\u001a\u00020\b2,\u0010X\u001a(\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0004\u0012\u00020\b\u0018\u00010Vj\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0018\u0001`W2\u001a\u0010[\u001a\u0016\u0012\u0004\u0012\u00020Y\u0012\u0004\u0012\u00020\b\u0018\u00010Vj\u0004\u0018\u0001`ZH\u0016¢\u0006\u0004\b\\\u0010]J\u0017\u0010_\u001a\u00020\b2\u0006\u0010^\u001a\u00020\u0015H\u0016¢\u0006\u0004\b_\u00108J\u0017\u0010`\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b`\u0010\nJ\u0017\u0010a\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u000eH\u0016¢\u0006\u0004\ba\u0010bJ%\u0010d\u001a\u0004\u0018\u00010\u00042\u0012\u0010c\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u001c0VH\u0016¢\u0006\u0004\bd\u0010eJe\u0010h\u001a\u00020\b2\u0006\u0010 \u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00022\b\u0010!\u001a\u0004\u0018\u00010\u00022\b\u0010\"\u001a\u0004\u0018\u00010\u00022\b\u0010#\u001a\u0004\u0018\u00010\u00022\b\u0010$\u001a\u0004\u0018\u00010\u00022\b\u0010%\u001a\u0004\u0018\u00010\u00022\b\u0010&\u001a\u0004\u0018\u00010\u00022\b\u0010g\u001a\u0004\u0018\u00010fH\u0016¢\u0006\u0004\bh\u0010iJ!\u0010k\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010g\u001a\u0004\u0018\u00010jH\u0016¢\u0006\u0004\bk\u0010lJ!\u0010m\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010g\u001a\u0004\u0018\u00010jH\u0016¢\u0006\u0004\bm\u0010lJ\u0017\u0010n\u001a\u00020\b2\u0006\u0010 \u001a\u00020\u0002H\u0016¢\u0006\u0004\bn\u0010\nJ\u001b\u0010d\u001a\u0004\u0018\u00010@2\b\u0010p\u001a\u0004\u0018\u00010oH\u0016¢\u0006\u0004\bd\u0010qJ\u000f\u0010r\u001a\u00020\bH\u0016¢\u0006\u0004\br\u0010\fJ\u001f\u0010t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010s\u001a\u00020\u001cH\u0016¢\u0006\u0004\bt\u0010\u001fJ\u001f\u0010u\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\bu\u0010\u001fJ\u001f\u0010w\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010v\u001a\u00020\u001cH\u0016¢\u0006\u0004\bw\u0010\u001fJ\u000f\u0010x\u001a\u00020.H\u0016¢\u0006\u0004\bx\u0010yJ\u0019\u0010{\u001a\u00020\b2\b\u0010g\u001a\u0004\u0018\u00010zH\u0016¢\u0006\u0004\b{\u0010|R\u0014\u0010~\u001a\u00020}8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b~\u0010\u007fR\u001e\u0010\u0081\u0001\u001a\t\u0012\u0004\u0012\u00020C0\u0080\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0081\u0001\u0010\u0082\u0001R$\u0010\u0084\u0001\u001a\u000f\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u0083\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0084\u0001\u0010\u0085\u0001R\u0018\u0010\u0087\u0001\u001a\u00030\u0086\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0087\u0001\u0010\u0088\u0001R$\u0010\u0089\u0001\u001a\u000f\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u0083\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0089\u0001\u0010\u0085\u0001R$\u0010\u008a\u0001\u001a\u000f\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u0083\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008a\u0001\u0010\u0085\u0001R(\u0010\u008b\u0001\u001a\u00020.8\u0016@\u0016X\u0096\u000e¢\u0006\u0017\n\u0006\b\u008b\u0001\u0010\u008c\u0001\u001a\u0005\b\u008d\u0001\u0010y\"\u0006\b\u008e\u0001\u0010\u008f\u0001R\u0018\u0010\u0091\u0001\u001a\u00030\u0090\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0091\u0001\u0010\u0092\u0001R\u001c\u0010\u0094\u0001\u001a\b\u0012\u0004\u0012\u00020\u00040\r8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u0093\u0001\u0010B¨\u0006\u0098\u0001"}, d2 = {"Lcom/xiaomi/fitness/eco/device/manager/remote/EcoDeviceManagerRemoteImpl;", "Lcom/xiaomi/fitness/eco/device/model/api/EcoDeviceManagerInternalRemote;", "", "did", "Lms7;", "getDeviceModelInternal", "(Ljava/lang/String;)Lms7;", "model", "", "cleanActiveDeviceModel", "(Ljava/lang/String;)V", "clearAllModel", "()V", "", "Lcom/xiaomi/fitness/eco/device/manager/export/bean/EcoDevice;", "devices", "onRequestDeviceListSuccess", "(Ljava/util/List;)V", "Lcom/xiaomi/fitness/eco/device/manager/export/bean/EcoLocalDevice;", "localDeviceList", "onLoadEcoLocalDeviceSuccess", "Lcom/xiaomi/fitness/eco/device/manager/export/bean/EcoDeviceInfo;", "initDeviceModels", "device", "initDeviceModel", "(Lcom/xiaomi/fitness/eco/device/manager/export/bean/EcoDeviceInfo;)Lms7;", "getDeviceInfos", "(Ljava/util/List;)Ljava/util/List;", "", "isRemoved", "releaseByDeviceModel", "(Ljava/lang/String;Z)V", "mac", "bleName", "oob", "shareId", "shareUserId", "shareDid", "shareModel", "Lcom/xiaomi/fitness/eco/device/model/api/EcoDeviceBinder;", "getDeviceBinder", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/xiaomi/fitness/eco/device/model/api/EcoDeviceBinder;", "(Ljava/lang/String;)Lcom/xiaomi/fitness/eco/device/model/api/EcoDeviceBinder;", "removeDevice", "isConnected", "(Ljava/lang/String;)Z", "", "getDeviceStatus", "(Ljava/lang/String;)I", "status", "setDeviceStatus", "(Ljava/lang/String;I)V", "getDeviceInfo", "(Ljava/lang/String;)Lcom/xiaomi/fitness/eco/device/manager/export/bean/EcoDeviceInfo;", "info", "setDeviceInfo", "(Lcom/xiaomi/fitness/eco/device/manager/export/bean/EcoDeviceInfo;)V", "openBluetooth", "ecoConnectDeviceByDid", "(ZLjava/lang/String;)V", "isConnectActive", "connectLocalDevice", "disconnectDevice", "removeDeviceModel", "Lcom/xiaomi/fitness/eco/device/manager/remote/EcoDeviceModelRemote;", "getDeviceModels", "()Ljava/util/List;", "Lg8h;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "addDeviceStatusListener", "(Lg8h;)V", "removeDeviceStatusListener", "initDeviceModelsByCache", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "connect", "getDeviceModel", "(Ljava/lang/String;)Lcom/xiaomi/fitness/eco/device/manager/remote/EcoDeviceModelRemote;", "ecoFetchDeviceInfoList", "getDeviceInfoList", "getDeviceInfoInAll", "getDeviceModelByMac", "mode", "Lcom/xiaomi/fitness/eco/device/manager/export/bean/EcoProduct;", "getProduct", "(Ljava/lang/String;)Lcom/xiaomi/fitness/eco/device/manager/export/bean/EcoProduct;", "getLocalDeviceModel", "Lkotlin/Function1;", "Lcom/xiaomi/fitness/net/extensions/OnSuccess;", "onSuccess", "Lcom/xiaomi/fitness/net/response/ApiException;", "Lcom/xiaomi/fitness/net/extensions/OnFail;", "onFail", "requestDeviceList", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "deviceInfo", "addLocalDevice", "removeLocalDevice", "updateDevice", "(Lcom/xiaomi/fitness/eco/device/manager/export/bean/EcoDevice;)V", "predicate", "findDeviceModel", "(Lkotlin/jvm/functions/Function1;)Lms7;", "Lsh7;", "callback", "bindDevice", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lsh7;)V", "Lcom/xiaomi/fitness/device/manager/l;", "deauthorize", "(Ljava/lang/String;Lcom/xiaomi/fitness/device/manager/l;)V", "unbindDevice", "cancelBind", "Lcom/xiaomi/fitness/eco/device/manager/b;", FitnessFilePathUtils.TimeZoneConstant.POSITIVE, "(Lcom/xiaomi/fitness/eco/device/manager/b;)Lcom/xiaomi/fitness/eco/device/manager/remote/EcoDeviceModelRemote;", CervicalMucusRecord.Appearance.CLEAR, "isReadded", "notifyDeviceInit", "notifyDeviceDestroy", "isRebind", "notifyDeviceBind", "getEcoDeviceSize", "()I", "Lhbk;", "refreshEcoList", "(Lhbk;)V", "Lcom/xiaomi/fitness/eco/device/model/api/EcoProductManagerRemoteInternal;", "mEcoProductManager", "Lcom/xiaomi/fitness/eco/device/model/api/EcoProductManagerRemoteInternal;", "Landroid/os/RemoteCallbackList;", "mDeviceStatusListeners", "Landroid/os/RemoteCallbackList;", "Ljava/util/concurrent/ConcurrentHashMap;", "mDeviceModels", "Ljava/util/concurrent/ConcurrentHashMap;", "Lcom/xiaomi/fitness/eco/device/manager/remote/EcoDeviceContainer;", "mEcoDeviceContainer", "Lcom/xiaomi/fitness/eco/device/manager/remote/EcoDeviceContainer;", "mEcoLocalDeviceModels", "mActiveLocalDeviceModel", "requestStatus", "I", "getRequestStatus", "setRequestStatus", "(I)V", "com/xiaomi/fitness/eco/device/manager/remote/EcoDeviceManagerRemoteImpl$mDeviceConnectStateListener$1", "mDeviceConnectStateListener", "Lcom/xiaomi/fitness/eco/device/manager/remote/EcoDeviceManagerRemoteImpl$mDeviceConnectStateListener$1;", "getAllDeviceModels", "allDeviceModels", "<init>", "(Lcom/xiaomi/fitness/eco/device/model/api/EcoProductManagerRemoteInternal;)V", "Companion", "eco-device-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nEcoDeviceManagerRemoteImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EcoDeviceManagerRemoteImpl.kt\ncom/xiaomi/fitness/eco/device/manager/remote/EcoDeviceManagerRemoteImpl\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 ListExt.kt\ncom/xiaomi/fitness/common/extensions/ListExtKt\n*L\n1#1,768:1\n216#2,2:769\n216#2,2:771\n216#2,2:836\n1863#3,2:773\n1863#3,2:775\n1863#3,2:777\n90#4,19:779\n90#4,19:798\n90#4,19:817\n*S KotlinDebug\n*F\n+ 1 EcoDeviceManagerRemoteImpl.kt\ncom/xiaomi/fitness/eco/device/manager/remote/EcoDeviceManagerRemoteImpl\n*L\n346#1:769,2\n377#1:771,2\n740#1:836,2\n445#1:773,2\n466#1:775,2\n507#1:777,2\n523#1:779,19\n720#1:798,19\n732#1:817,19\n*E\n"})
public final class EcoDeviceManagerRemoteImpl extends EcoDeviceManagerInternalRemote {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int KEY_DEVICE_MANAGER_BINDER = 7;

    @NotNull
    private static final String TAG = "EcoDeviceManagerRemoteImpl";

    @NotNull
    private final ConcurrentHashMap<String, ms7> mActiveLocalDeviceModel;

    @NotNull
    private final EcoDeviceManagerRemoteImpl$mDeviceConnectStateListener$1 mDeviceConnectStateListener;

    @NotNull
    private final ConcurrentHashMap<String, ms7> mDeviceModels;

    @NotNull
    private final RemoteCallbackList<g8h> mDeviceStatusListeners;

    @NotNull
    private final EcoDeviceContainer mEcoDeviceContainer;

    @NotNull
    private final ConcurrentHashMap<String, ms7> mEcoLocalDeviceModels;

    @NotNull
    private final EcoProductManagerRemoteInternal mEcoProductManager;
    private volatile int requestStatus;

    /* JADX INFO: renamed from: com.xiaomi.fitness.eco.device.manager.remote.EcoDeviceManagerRemoteImpl$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.eco.device.manager.remote.EcoDeviceManagerRemoteImpl$1", f = "EcoDeviceManagerRemoteImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return EcoDeviceManagerRemoteImpl.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            EcoConnectStateObserver.INSTANCE.addConnectResultListener(EcoDeviceManagerRemoteImpl.this.mDeviceConnectStateListener);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/xiaomi/fitness/eco/device/manager/remote/EcoDeviceManagerRemoteImpl$Companion;", "", "<init>", "()V", "KEY_DEVICE_MANAGER_BINDER", "", "TAG", "", "eco-device-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.eco.device.manager.remote.EcoDeviceManagerRemoteImpl$deauthorize$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.eco.device.manager.remote.EcoDeviceManagerRemoteImpl$deauthorize$1", f = "EcoDeviceManagerRemoteImpl.kt", i = {}, l = {619}, m = "invokeSuspend", n = {}, s = {})
    public static final class C22771 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ l $callback;
        final /* synthetic */ String $did;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C22771(String str, l lVar, Continuation<? super C22771> continuation) {
            super(2, continuation);
            this.$did = str;
            this.$callback = lVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return EcoDeviceManagerRemoteImpl.this.new C22771(this.$did, this.$callback, continuation);
        }

        /* JADX WARN: Code duplicated, block: B:39:0x0073  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws RemoteException {
            Integer num;
            l lVar;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                EcoDeviceBinder deviceBinder = EcoDeviceManagerRemoteImpl.this.getDeviceBinder(this.$did);
                if (deviceBinder != null) {
                    this.label = 1;
                    obj = deviceBinder.revokeAuthorization(this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    num = null;
                }
                if ((num == null && num.intValue() == 0) || (num != null && num.intValue() == -1)) {
                    EcoDeviceManagerRemoteImpl.this.removeDevice(this.$did);
                    lVar = this.$callback;
                    if (lVar != null) {
                        lVar.onSuccess();
                    }
                } else if (num != null && num.intValue() == -2) {
                    l lVar2 = this.$callback;
                    if (lVar2 != null) {
                        lVar2.onSuccess();
                    }
                } else {
                    l lVar3 = this.$callback;
                    if (lVar3 != null) {
                        lVar3.onFail(num != null ? num.intValue() : -10);
                    }
                }
                return Unit.INSTANCE;
            }
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            num = (Integer) obj;
            if (num == null) {
                EcoDeviceManagerRemoteImpl.this.removeDevice(this.$did);
                lVar = this.$callback;
                if (lVar != null) {
                    lVar.onSuccess();
                }
            } else {
                EcoDeviceManagerRemoteImpl.this.removeDevice(this.$did);
                lVar = this.$callback;
                if (lVar != null) {
                    lVar.onSuccess();
                }
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C22771) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.eco.device.manager.remote.EcoDeviceManagerRemoteImpl$initDeviceModelsByCache$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.eco.device.manager.remote.EcoDeviceManagerRemoteImpl", f = "EcoDeviceManagerRemoteImpl.kt", i = {0, 1, 2, 2}, l = {SportSummary.VERSION_103, 260, SportSummary.VERSION_105, 266}, m = "initDeviceModelsByCache", n = {"this", "this", "this", "bindDevices"}, s = {"L$0", "L$0", "L$0", "L$1"})
    public static final class C22781 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C22781(Continuation<? super C22781> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return EcoDeviceManagerRemoteImpl.this.initDeviceModelsByCache(this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.eco.device.manager.remote.EcoDeviceManagerRemoteImpl$initDeviceModelsByCache$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.eco.device.manager.remote.EcoDeviceManagerRemoteImpl$initDeviceModelsByCache$2", f = "EcoDeviceManagerRemoteImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ List<EcoDevice> $bindDevices;
        final /* synthetic */ List<EcoLocalDevice> $localDeviceList;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(List<? extends EcoDevice> list, List<EcoLocalDevice> list2, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$bindDevices = list;
            this.$localDeviceList = list2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return EcoDeviceManagerRemoteImpl.this.new AnonymousClass2(this.$bindDevices, this.$localDeviceList, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            EcoDeviceManagerRemoteImpl.this.onRequestDeviceListSuccess(this.$bindDevices);
            EcoDeviceManagerRemoteImpl.this.onLoadEcoLocalDeviceSuccess(this.$localDeviceList);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.eco.device.manager.remote.EcoDeviceManagerRemoteImpl$refreshEcoList$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.eco.device.manager.remote.EcoDeviceManagerRemoteImpl$refreshEcoList$1", f = "EcoDeviceManagerRemoteImpl.kt", i = {}, l = {753}, m = "invokeSuspend", n = {}, s = {})
    public static final class C22791 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ hbk $callback;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C22791(hbk hbkVar, Continuation<? super C22791> continuation) {
            super(2, continuation);
            this.$callback = hbkVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return EcoDeviceManagerRemoteImpl.this.new C22791(this.$callback, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws RemoteException {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                EcoDeviceContainer ecoDeviceContainer = EcoDeviceManagerRemoteImpl.this.mEcoDeviceContainer;
                this.label = 1;
                obj = ecoDeviceContainer.requestEcoBindDeviceList(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            EcoDeviceManagerRemoteImpl.this.onRequestDeviceListSuccess((List) obj);
            hbk hbkVar = this.$callback;
            if (hbkVar != null) {
                hbkVar.onSuccess();
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C22791) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.eco.device.manager.remote.EcoDeviceManagerRemoteImpl$requestDeviceList$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.eco.device.manager.remote.EcoDeviceManagerRemoteImpl$requestDeviceList$1", f = "EcoDeviceManagerRemoteImpl.kt", i = {}, l = {362, 363}, m = "invokeSuspend", n = {}, s = {})
    public static final class C22801 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function1<List<? extends EcoDevice>, Unit> $onSuccess;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C22801(Function1<? super List<? extends EcoDevice>, Unit> function1, Continuation<? super C22801> continuation) {
            super(2, continuation);
            this.$onSuccess = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return EcoDeviceManagerRemoteImpl.this.new C22801(this.$onSuccess, continuation);
        }

        /* JADX WARN: Code duplicated, block: B:18:0x004f  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            List<? extends EcoDevice> list;
            Function1<List<? extends EcoDevice>, Unit> function1;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i != 0) {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                list = (List) obj;
                EcoDeviceManagerRemoteImpl.this.setRequestStatus(2);
                EcoDeviceManagerRemoteImpl.this.onRequestDeviceListSuccess(list);
                function1 = this.$onSuccess;
                if (function1 != null) {
                    function1.invoke2(list);
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            EcoProductManagerRemoteInternal ecoProductManagerRemoteInternal = EcoDeviceManagerRemoteImpl.this.mEcoProductManager;
            this.label = 1;
            if (ecoProductManagerRemoteInternal.update(this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            EcoDeviceContainer ecoDeviceContainer = EcoDeviceManagerRemoteImpl.this.mEcoDeviceContainer;
            this.label = 2;
            obj = ecoDeviceContainer.requestEcoBindDeviceList(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            list = (List) obj;
            EcoDeviceManagerRemoteImpl.this.setRequestStatus(2);
            EcoDeviceManagerRemoteImpl.this.onRequestDeviceListSuccess(list);
            function1 = this.$onSuccess;
            if (function1 != null) {
                function1.invoke2(list);
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C22801) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.eco.device.manager.remote.EcoDeviceManagerRemoteImpl$unbindDevice$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.eco.device.manager.remote.EcoDeviceManagerRemoteImpl$unbindDevice$1", f = "EcoDeviceManagerRemoteImpl.kt", i = {}, l = {643, 647}, m = "invokeSuspend", n = {}, s = {})
    public static final class C22811 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ l $callback;
        final /* synthetic */ String $did;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C22811(String str, l lVar, Continuation<? super C22811> continuation) {
            super(2, continuation);
            this.$did = str;
            this.$callback = lVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return EcoDeviceManagerRemoteImpl.this.new C22811(this.$did, this.$callback, continuation);
        }

        /* JADX WARN: Code duplicated, block: B:42:0x00ae A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:45:0x00ba  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws RemoteException {
            Integer num;
            l lVar;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i != 0) {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                EcoDeviceManagerRemoteImpl.this.removeDevice(this.$did);
                lVar = this.$callback;
                if (lVar != null) {
                    lVar.onSuccess();
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            EcoDeviceBinder deviceBinder = EcoDeviceManagerRemoteImpl.this.getDeviceBinder(this.$did);
            if (deviceBinder != null) {
                this.label = 1;
                obj = deviceBinder.unbind(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                num = null;
            }
            EcoDeviceModelExtKt.logi("unbind " + this.$did + " from server, and result is " + num);
            if ((num == null && num.intValue() == 0) || (num != null && num.intValue() == -1)) {
                EcoDeviceManagerExtKt.getInstance(EcoDeviceManager.INSTANCE).disconnectDevice(this.$did);
                this.label = 2;
                if (DelayKt.delay(1500L, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                EcoDeviceManagerRemoteImpl.this.removeDevice(this.$did);
                lVar = this.$callback;
                if (lVar != null) {
                    lVar.onSuccess();
                }
            } else if (num != null && num.intValue() == -2) {
                EcoDeviceManagerExtKt.getInstance(EcoDeviceManager.INSTANCE).disconnectDevice(this.$did);
                l lVar2 = this.$callback;
                if (lVar2 != null) {
                    lVar2.onSuccess();
                }
            } else {
                l lVar3 = this.$callback;
                if (lVar3 != null) {
                    lVar3.onFail(num != null ? num.intValue() : -10);
                }
            }
            return Unit.INSTANCE;
            num = (Integer) obj;
            EcoDeviceModelExtKt.logi("unbind " + this.$did + " from server, and result is " + num);
            if (num == null) {
                EcoDeviceManagerExtKt.getInstance(EcoDeviceManager.INSTANCE).disconnectDevice(this.$did);
                this.label = 2;
                if (DelayKt.delay(1500L, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                EcoDeviceManagerRemoteImpl.this.removeDevice(this.$did);
                lVar = this.$callback;
                if (lVar != null) {
                    lVar.onSuccess();
                }
            } else {
                EcoDeviceManagerExtKt.getInstance(EcoDeviceManager.INSTANCE).disconnectDevice(this.$did);
                this.label = 2;
                if (DelayKt.delay(1500L, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                EcoDeviceManagerRemoteImpl.this.removeDevice(this.$did);
                lVar = this.$callback;
                if (lVar != null) {
                    lVar.onSuccess();
                }
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C22811) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public EcoDeviceManagerRemoteImpl(@NotNull EcoProductManagerRemoteInternal mEcoProductManager) {
        Intrinsics.checkNotNullParameter(mEcoProductManager, "mEcoProductManager");
        this.mEcoProductManager = mEcoProductManager;
        this.mDeviceStatusListeners = new RemoteCallbackList<>();
        this.mDeviceModels = new ConcurrentHashMap<>();
        this.mEcoDeviceContainer = new EcoDeviceContainer();
        this.mEcoLocalDeviceModels = new ConcurrentHashMap<>();
        this.mActiveLocalDeviceModel = new ConcurrentHashMap<>();
        this.mDeviceConnectStateListener = new EcoDeviceManagerRemoteImpl$mDeviceConnectStateListener$1(this);
        AnyExtKt.main$default(null, new AnonymousClass1(null), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean cancelBind$lambda$16(String mac, ms7 it) {
        Intrinsics.checkNotNullParameter(mac, "$mac");
        Intrinsics.checkNotNullParameter(it, "it");
        return Intrinsics.areEqual(com.xiaomi.fitness.eco.device.manager.export.EcoDeviceModelExtKt.getMac(it), mac);
    }

    private final void cleanActiveDeviceModel(String model) {
        EcoDeviceModelExtKt.logi("clean active device model = " + model + ", active device count = " + this.mActiveLocalDeviceModel.size());
        for (Map.Entry<String, ms7> entry : this.mActiveLocalDeviceModel.entrySet()) {
            if (Intrinsics.areEqual(com.xiaomi.fitness.eco.device.manager.export.EcoDeviceModelExtKt.getModel(entry.getValue()), model)) {
                EcoDeviceModelExtKt.logi("clean active device " + com.xiaomi.fitness.eco.device.manager.export.EcoDeviceModelExtKt.getMac(entry.getValue()));
                this.mActiveLocalDeviceModel.remove(entry.getKey());
            }
        }
    }

    private final void clearAllModel() {
        EcoDeviceModelExtKt.logi(TAG, "clearAllModel() called");
        Iterator<Map.Entry<String, ms7>> it = this.mDeviceModels.entrySet().iterator();
        while (it.hasNext()) {
            it.next().getValue().destroy(false);
            it.remove();
        }
        this.mDeviceModels.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit deauthorize$lambda$14(l lVar, AndroidScope androidScope, Throwable it) throws RemoteException {
        IBinder iBinderAsBinder;
        Intrinsics.checkNotNullParameter(androidScope, "$this$catch");
        Intrinsics.checkNotNullParameter(it, "it");
        EcoDeviceModelExtKt.loge(TAG, "revoke device fail because " + it);
        if (lVar != null && (iBinderAsBinder = lVar.asBinder()) != null && iBinderAsBinder.isBinderAlive()) {
            if (it instanceof ApiException) {
                lVar.onFail(((ApiException) it).getErrorCode());
            } else {
                lVar.onFail(-10);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean disconnectDevice$lambda$2(String str, ms7 it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Intrinsics.areEqual(it.getDid(), str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ecoConnectDeviceByDid$lambda$0(EcoDeviceManagerRemoteImpl this$0, String did) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(did, "$did");
        Logger.i("Bluetooth is enabled", new Object[0]);
        this$0.connect(did);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ecoConnectDeviceByDid$lambda$1(EcoDeviceManagerRemoteImpl this$0, String did, int i) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(did, "$did");
        this$0.mDeviceConnectStateListener.onConnectFailure(did, "", 109, 0);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean findDeviceModel$lambda$17(b bVar, ms7 it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return bVar.predicate(it.getRemote());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final EcoDeviceBinder getDeviceBinder(String mac, String model, String bleName, String oob, String shareId, String shareUserId, String shareDid, String shareModel) {
        EcoDeviceModelExtKt.logi(TAG, "getDeviceBinder...");
        EcoProduct product = getProduct(model);
        if (product == null) {
            EcoDeviceModelExtKt.loge(TAG, "Cannot find product with model(" + model + ")");
            return null;
        }
        EcoDevice ecoDevice = new EcoDevice(null, 0, null, null, null, null, null, 0, null, 0, false, null, null, null, 16383, null);
        ecoDevice.setProductId(product.getProductId());
        ecoDevice.setModel(model);
        String productName = product.getProductName();
        if (productName == null) {
            productName = "";
        }
        ecoDevice.setName(productName);
        ecoDevice.setOwner(TextUtils.isEmpty(shareId));
        ecoDevice.setMac(mac);
        EcoDeviceInfo ecoDeviceInfo = new EcoDeviceInfo();
        ecoDeviceInfo.device = ecoDevice;
        ecoDeviceInfo.setProduct(product);
        ecoDeviceInfo.setBleName(bleName);
        ecoDeviceInfo.setOob(oob);
        ecoDeviceInfo.setShareId(shareId);
        ecoDeviceInfo.setShareUserId(shareUserId);
        ecoDeviceInfo.setShareDid(shareDid);
        ecoDeviceInfo.setShareModel(shareModel);
        ecoDeviceInfo.setPrivateUUID(EcoDeviceExtKt.convertUuid(product));
        return EcoDeviceFactory.INSTANCE.getDeviceBinder(ecoDeviceInfo);
    }

    private final synchronized List<EcoDeviceInfo> getDeviceInfos(List<? extends EcoDevice> devices) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        EcoDeviceModelExtKt.logi("all product is " + EcoDeviceExtKt.getProductDetails(this.mEcoProductManager));
        for (EcoDevice ecoDevice : devices) {
            EcoProduct productDetail = EcoDeviceExtKt.getProductDetail(this.mEcoProductManager, ecoDevice.getModel());
            if (productDetail != null) {
                EcoDeviceInfo ecoDeviceInfo = new EcoDeviceInfo();
                ecoDeviceInfo.device = ecoDevice;
                ecoDeviceInfo.setProduct(productDetail);
                ecoDeviceInfo.setPrivateUUID(EcoDeviceExtKt.convertUuid(productDetail));
                arrayList.add(ecoDeviceInfo);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean getDeviceModelByMac$lambda$4(String str, ms7 it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Intrinsics.areEqual(com.xiaomi.fitness.eco.device.manager.export.EcoDeviceModelExtKt.getMac(it), str);
    }

    private final synchronized ms7 getDeviceModelInternal(String did) {
        EcoDeviceModelExtKt.logi(TAG, "getDeviceModelInternal...");
        if (did != null && did.length() != 0) {
            ms7 ms7Var = this.mDeviceModels.get(did);
            if (ms7Var == null) {
                ms7Var = this.mEcoLocalDeviceModels.get(did);
            }
            return ms7Var;
        }
        return null;
    }

    private final synchronized ms7 initDeviceModel(EcoDeviceInfo device) {
        ms7 deviceModelInternal;
        EcoDeviceModelExtKt.logi(TAG, "initDeviceModel() called with: device = " + device);
        deviceModelInternal = getDeviceModelInternal(device.getDid());
        EcoDeviceModelExtKt.logi(TAG, "initDeviceModel() called with: deviceModel = " + deviceModelInternal);
        if (deviceModelInternal == null) {
            try {
                deviceModelInternal = EcoDeviceFactory.createDeviceModel(device);
            } catch (Exception e) {
                e.printStackTrace();
                EcoDeviceModelExtKt.logi(TAG, "initDeviceModel,error: " + e.getMessage());
                return null;
            }
        } else {
            deviceModelInternal.initByModelDevice(device);
        }
        return deviceModelInternal;
    }

    private final synchronized void initDeviceModels(List<EcoDeviceInfo> devices) {
        Integer numValueOf;
        if (devices != null) {
            try {
                numValueOf = Integer.valueOf(devices.size());
            } catch (Throwable th) {
                throw th;
            }
        } else {
            numValueOf = null;
        }
        EcoDeviceModelExtKt.logi(TAG, "init DeviceModels by devices(size=" + numValueOf + ")");
        List<EcoDeviceInfo> list = devices;
        if (list == null || list.isEmpty()) {
            clearAllModel();
        } else {
            HashMap map = new HashMap();
            for (EcoDeviceInfo ecoDeviceInfo : devices) {
                if (!ecoDeviceInfo.isLocalDevice()) {
                    this.mDeviceModels.remove(ecoDeviceInfo.getDid());
                    ms7 ms7VarInitDeviceModel = initDeviceModel(ecoDeviceInfo);
                    if (ms7VarInitDeviceModel != null) {
                        map.put(ecoDeviceInfo.getDid(), ms7VarInitDeviceModel);
                    }
                }
            }
            clearAllModel();
            this.mDeviceModels.putAll(map);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onLoadEcoLocalDeviceSuccess(List<EcoLocalDevice> localDeviceList) {
        EcoDeviceModelExtKt.logi(TAG, "onLoadEcoLocalDeviceSuccess...");
        List<EcoDeviceInfo> deviceInfos = getDeviceInfos(localDeviceList);
        HashMap map = new HashMap();
        for (EcoDeviceInfo ecoDeviceInfo : deviceInfos) {
            ms7 ms7VarInitDeviceModel = initDeviceModel(ecoDeviceInfo);
            this.mEcoLocalDeviceModels.remove(ecoDeviceInfo.getDid());
            if (ms7VarInitDeviceModel != null) {
                map.put(ecoDeviceInfo.getDid(), ms7VarInitDeviceModel);
            }
        }
        this.mEcoLocalDeviceModels.putAll(map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void onRequestDeviceListSuccess(List<? extends EcoDevice> devices) {
        try {
            EcoDeviceModelExtKt.logi(TAG, "request device list success " + devices.size());
            if (!devices.isEmpty()) {
                initDeviceModels(getDeviceInfos(devices));
            } else {
                clearAllModel();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit refreshEcoList$lambda$21(hbk hbkVar, AndroidScope androidScope, Throwable it) throws RemoteException {
        Intrinsics.checkNotNullParameter(androidScope, "$this$catch");
        Intrinsics.checkNotNullParameter(it, "it");
        EcoDeviceModelExtKt.loge(TAG, "refreshEcoList fail with " + it);
        ApiException apiException = new ApiException(it);
        EcoDeviceModelExtKt.loge(TAG, "refreshEcoList fail errorCode : " + apiException.getErrorCode() + ", message : " + apiException.getMessage() + " ");
        if (hbkVar != null) {
            hbkVar.onFail(apiException.getErrorCode(), apiException.getMessage());
        }
        return Unit.INSTANCE;
    }

    private final void releaseByDeviceModel(String did, boolean isRemoved) {
        EcoDeviceModelExtKt.logi(TAG, "releaseByDeviceModel...");
        RemoteCallbackList<g8h> remoteCallbackList = this.mDeviceStatusListeners;
        try {
            try {
                try {
                    int iBeginBroadcast = remoteCallbackList.beginBroadcast();
                    for (int i = 0; i < iBeginBroadcast; i++) {
                        try {
                            IInterface broadcastItem = remoteCallbackList.getBroadcastItem(i);
                            Intrinsics.checkNotNullExpressionValue(broadcastItem, "getBroadcastItem(...)");
                            ((g8h) broadcastItem).onDestroy(did, isRemoved);
                        } catch (Exception e) {
                            Logger.e("action(" + remoteCallbackList.getBroadcastItem(i) + ") throw exception", e);
                        }
                    }
                    remoteCallbackList.finishBroadcast();
                } catch (Throwable th) {
                    try {
                        remoteCallbackList.finishBroadcast();
                    } catch (Exception e2) {
                        Logger.e("An exception occurred when finishBroadcast", e2);
                    }
                    throw th;
                }
            } catch (Exception e3) {
                Logger.e("An exception occurred during RemoteCallbackList forEach", e3);
                remoteCallbackList.finishBroadcast();
            }
        } catch (Exception e4) {
            Logger.e("An exception occurred when finishBroadcast", e4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void removeDevice(String did) {
        EcoDeviceModelExtKt.logi(TAG, "removeDevice...");
        this.mEcoDeviceContainer.removeEcoDevice(did);
        ms7 ms7VarRemove = this.mDeviceModels.remove(did);
        if (ms7VarRemove == null) {
            return;
        }
        EcoDeviceExtKt.resetOnRemoveDevice(ms7VarRemove);
        ms7VarRemove.destroy(true);
        EcoDeviceFactory.INSTANCE.removeDeviceBinder(com.xiaomi.fitness.eco.device.manager.export.EcoDeviceModelExtKt.getMac(ms7VarRemove));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit requestDeviceList$lambda$6(EcoDeviceManagerRemoteImpl this$0, Function1 function1, AndroidScope androidScope, Throwable it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(androidScope, "$this$catch");
        Intrinsics.checkNotNullParameter(it, "it");
        EcoDeviceModelExtKt.loge(TAG, "requestDeviceList fail with " + it);
        this$0.setRequestStatus(0);
        if (function1 != null) {
            function1.invoke2(new ApiException(it));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit unbindDevice$lambda$15(l lVar, EcoDeviceManagerRemoteImpl this$0, String did, AndroidScope androidScope, Throwable it) throws RemoteException {
        IBinder iBinderAsBinder;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(did, "$did");
        Intrinsics.checkNotNullParameter(androidScope, "$this$catch");
        Intrinsics.checkNotNullParameter(it, "it");
        it.printStackTrace();
        EcoDeviceModelExtKt.loge(TAG, "unboundDevice fail because " + it);
        if (lVar != null && (iBinderAsBinder = lVar.asBinder()) != null && iBinderAsBinder.isBinderAlive()) {
            if (it instanceof ApiException) {
                ApiException apiException = (ApiException) it;
                if (apiException.getErrorCode() == -1) {
                    this$0.removeDevice(did);
                    lVar.onSuccess();
                } else {
                    lVar.onFail(apiException.getErrorCode());
                }
            } else {
                lVar.onFail(-10);
            }
        }
        return Unit.INSTANCE;
    }

    @Override // com.xiaomi.fitness.eco.device.model.api.EcoDeviceManagerInternalRemote, com.xiaomi.fitness.eco.device.manager.a.AbstractBinderC0549a, com.xiaomi.fitness.eco.device.manager.a
    public void addDeviceStatusListener(@NotNull g8h listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        EcoDeviceModelExtKt.logi(TAG, "addDeviceStatusListener...");
        this.mDeviceStatusListeners.register(listener);
    }

    @Override // com.xiaomi.fitness.eco.device.model.api.EcoDeviceManagerInternal
    public void addLocalDevice(@NotNull EcoDeviceInfo deviceInfo) {
        Intrinsics.checkNotNullParameter(deviceInfo, "deviceInfo");
        EcoDeviceModelExtKt.logi(TAG, "addLocalDevice...");
        EcoDevice ecoDevice = (EcoDevice) deviceInfo.device;
        if ((ecoDevice != null ? ecoDevice.getMac() : null) == null) {
            return;
        }
        ms7 ms7VarInitDeviceModel = initDeviceModel(deviceInfo);
        EcoDevice ecoDevice2 = (EcoDevice) deviceInfo.device;
        EcoDeviceModelExtKt.logi("add local device " + ms7VarInitDeviceModel + ", mac = " + (ecoDevice2 != null ? ecoDevice2.getMac() : null));
        if (ms7VarInitDeviceModel == null) {
            return;
        }
        cleanActiveDeviceModel(deviceInfo.getModel());
        this.mActiveLocalDeviceModel.put(deviceInfo.getDid(), ms7VarInitDeviceModel);
        this.mEcoLocalDeviceModels.put(deviceInfo.getDid(), ms7VarInitDeviceModel);
        T t = deviceInfo.device;
        Intrinsics.checkNotNull(t, "null cannot be cast to non-null type com.xiaomi.fitness.eco.device.manager.export.bean.EcoLocalDevice");
        EcoLocalDevice ecoLocalDevice = (EcoLocalDevice) t;
        EcoDeviceModelExtKt.logi("add local device info " + ecoLocalDevice);
        this.mEcoDeviceContainer.saveLocalDevice(ecoLocalDevice);
    }

    @Override // com.xiaomi.fitness.eco.device.model.api.EcoDeviceManagerInternalRemote, com.xiaomi.fitness.eco.device.manager.a
    public void bindDevice(@NotNull String mac, @NotNull String model, @Nullable String bleName, @Nullable String oob, @Nullable String shareId, @Nullable String shareUserId, @Nullable String shareDid, @Nullable String shareModel, @Nullable sh7 callback) throws RemoteException {
        Intrinsics.checkNotNullParameter(mac, "mac");
        Intrinsics.checkNotNullParameter(model, "model");
        EcoDeviceBinder deviceBinder = getDeviceBinder(mac, model, bleName, oob, shareId, shareUserId, shareDid, shareModel);
        Logger.e(TAG, "bindDevice deviceBinder : " + deviceBinder);
        if (deviceBinder == null) {
            EcoDeviceModelExtKt.loge(TAG, "Cannot find DeviceBinder when bind device");
            if (callback != null) {
                callback.onConnectFailure(-1);
                return;
            }
            return;
        }
        EcoDeviceModelExtKt.logi("bindDevice() called with: mac = " + mac + ", model = " + model + ", bleName = " + bleName);
        deviceBinder.bind(callback);
    }

    @Override // com.xiaomi.fitness.eco.device.model.api.EcoDeviceManagerInternalRemote, com.xiaomi.fitness.eco.device.manager.a
    public void cancelBind(@NotNull final String mac) {
        Intrinsics.checkNotNullParameter(mac, "mac");
        EcoDeviceModelExtKt.logi(TAG, "cancelBind...");
        ms7 ms7VarFindDeviceModel = findDeviceModel(new Function1() { // from class: fs7
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return Boolean.valueOf(EcoDeviceManagerRemoteImpl.cancelBind$lambda$16(mac, (ms7) obj));
            }
        });
        Logger.i(TAG, "cancelBind: dm = " + ms7VarFindDeviceModel + ", did = " + (ms7VarFindDeviceModel != null ? ms7VarFindDeviceModel.getDid() : null));
        if (ms7VarFindDeviceModel == null || TextUtils.isEmpty(ms7VarFindDeviceModel.getDid())) {
            EcoDeviceFactory ecoDeviceFactory = EcoDeviceFactory.INSTANCE;
            EcoDeviceBinder deviceBinder = ecoDeviceFactory.getDeviceBinder(mac);
            if (deviceBinder != null) {
                deviceBinder.cancel();
            }
            ecoDeviceFactory.destroyEcoApiCall(mac);
        } else if (ms7VarFindDeviceModel != null) {
            ms7VarFindDeviceModel.disconnectDevice();
        }
        EcoDeviceFactory.INSTANCE.removeDeviceBinder(mac);
    }

    @Override // com.xiaomi.fitness.eco.device.model.api.EcoDeviceManagerInternal
    public void clear() {
        EcoDeviceModelExtKt.logi(TAG, "clear...");
        this.mEcoDeviceContainer.clearEcoAll();
        clearAllModel();
    }

    public final void connect(@NotNull String did) {
        Intrinsics.checkNotNullParameter(did, "did");
        EcoDeviceModelExtKt.logi(TAG, "connect...");
        ms7 deviceModelInternal = getDeviceModelInternal(did);
        if (deviceModelInternal == null) {
            EcoDeviceModelExtKt.loge(TAG, "Current deviceModel is null");
            return;
        }
        Logger.e(TAG, "connect device Model : " + deviceModelInternal);
        deviceModelInternal.connectDevice();
    }

    @Override // com.xiaomi.fitness.eco.device.model.api.EcoDeviceManagerInternalRemote, com.xiaomi.fitness.eco.device.manager.a
    public void connectLocalDevice(@Nullable String did) {
        EcoDeviceModelExtKt.logi(TAG, "connectLocalDevice() called with: did = " + did);
        ms7 ms7Var = this.mActiveLocalDeviceModel.get(did);
        if (ms7Var == null) {
            ms7Var = this.mEcoLocalDeviceModels.get(did);
            if (ms7Var == null) {
                EcoDeviceModelExtKt.logi(TAG, "connectLocalDevice: no local device error");
                return;
            }
            EcoDeviceModelExtKt.logi(TAG, "connectLocalDevice: find in all local device");
            cleanActiveDeviceModel(com.xiaomi.fitness.eco.device.manager.export.EcoDeviceModelExtKt.getModel(ms7Var));
            ConcurrentHashMap<String, ms7> concurrentHashMap = this.mActiveLocalDeviceModel;
            Intrinsics.checkNotNull(did);
            concurrentHashMap.put(did, ms7Var);
        } else {
            EcoDeviceModelExtKt.logi("connectLocalDevice: find in active");
        }
        ms7Var.connectDevice();
    }

    @Override // com.xiaomi.fitness.eco.device.model.api.EcoDeviceManagerInternalRemote, com.xiaomi.fitness.eco.device.manager.a
    public void deauthorize(@NotNull String did, @Nullable final l callback) {
        Intrinsics.checkNotNullParameter(did, "did");
        EcoDeviceModelExtKt.logi(TAG, "deauthorize...");
        ScopeExtKt.scopeNet$default(null, new C22771(did, callback, null), 1, null).m503catch(new Function2() { // from class: gs7
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return EcoDeviceManagerRemoteImpl.deauthorize$lambda$14(callback, (AndroidScope) obj, (Throwable) obj2);
            }
        });
    }

    @Override // com.xiaomi.fitness.eco.device.model.api.EcoDeviceManagerInternalRemote, com.xiaomi.fitness.eco.device.manager.a
    public void disconnectDevice(@Nullable final String did) {
        EcoDeviceModelExtKt.logi(TAG, "disconnectDevice...did is " + did);
        if (did == null || did.length() != 0) {
            ms7 ms7VarFindDeviceModel = findDeviceModel(new Function1() { // from class: cs7
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return Boolean.valueOf(EcoDeviceManagerRemoteImpl.disconnectDevice$lambda$2(did, (ms7) obj));
                }
            });
            EcoDeviceModelExtKt.logi(TAG, "disconnectDevice: " + ms7VarFindDeviceModel);
            if (ms7VarFindDeviceModel != null) {
                ms7VarFindDeviceModel.disconnectDevice();
                return;
            }
            return;
        }
        Iterator<Map.Entry<String, ms7>> it = this.mEcoLocalDeviceModels.entrySet().iterator();
        while (it.hasNext()) {
            ms7 value = it.next().getValue();
            if (value.getIsDeviceConnected()) {
                EcoDeviceModelExtKt.logi(TAG, "disconnectDevice: " + value);
                value.disconnectDevice();
            }
        }
    }

    @Override // com.xiaomi.fitness.eco.device.model.api.EcoDeviceManagerInternalRemote, com.xiaomi.fitness.eco.device.manager.a
    public void ecoConnectDeviceByDid(boolean openBluetooth, @NotNull final String did) {
        Intrinsics.checkNotNullParameter(did, "did");
        EcoDeviceModelExtKt.logi(TAG, "ecoConnectDeviceByDid...");
        if (openBluetooth) {
            EcoBluetoothExtKt.openBluetooth(new Function0() { // from class: is7
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return EcoDeviceManagerRemoteImpl.ecoConnectDeviceByDid$lambda$0(this.f22041a, did);
                }
            }, new Function1() { // from class: js7
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return EcoDeviceManagerRemoteImpl.ecoConnectDeviceByDid$lambda$1(this.f23086a, did, ((Integer) obj).intValue());
                }
            });
        } else if (!s33.e()) {
            this.mDeviceConnectStateListener.onConnectFailure(did, "", 109, 0);
        } else {
            Logger.i("Bluetooth is enabled", new Object[0]);
            connect(did);
        }
    }

    @Override // com.xiaomi.fitness.eco.device.model.api.EcoDeviceManagerInternalRemote, com.xiaomi.fitness.eco.device.manager.a
    public void ecoFetchDeviceInfoList() {
        EcoDeviceModelExtKt.logd(TAG, "ecoFetchDeviceInfoList");
        EcoDeviceManagerInternal.DefaultImpls.requestDeviceList$default(this, null, null, 3, null);
    }

    @Override // com.xiaomi.fitness.eco.device.model.api.EcoDeviceManagerInternal
    @Nullable
    public ms7 findDeviceModel(@NotNull Function1<? super ms7, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        EcoDeviceModelExtKt.logi(TAG, "findDeviceModel...");
        Iterator<Map.Entry<String, ms7>> it = this.mDeviceModels.entrySet().iterator();
        while (it.hasNext()) {
            ms7 value = it.next().getValue();
            if (predicate.invoke2(value).booleanValue()) {
                return value;
            }
        }
        Iterator<Map.Entry<String, ms7>> it2 = this.mEcoLocalDeviceModels.entrySet().iterator();
        while (it2.hasNext()) {
            ms7 value2 = it2.next().getValue();
            if (predicate.invoke2(value2).booleanValue()) {
                return value2;
            }
        }
        return null;
    }

    @Override // com.xiaomi.fitness.eco.device.model.api.EcoDeviceManagerInternal
    @NotNull
    public List<ms7> getAllDeviceModels() {
        Collection<ms7> collectionValues = this.mDeviceModels.values();
        Intrinsics.checkNotNullExpressionValue(collectionValues, "<get-values>(...)");
        return CollectionsKt___CollectionsKt.toList(collectionValues);
    }

    @Override // com.xiaomi.fitness.eco.device.model.api.EcoDeviceManagerInternalRemote, com.xiaomi.fitness.eco.device.manager.a
    @Nullable
    public EcoDeviceInfo getDeviceInfo(@Nullable String did) {
        EcoDeviceModelExtKt.logi(TAG, "getDeviceInfo...");
        ms7 deviceModelInternal = getDeviceModelInternal(did);
        if (deviceModelInternal != null) {
            return deviceModelInternal.getDeviceInfo();
        }
        return null;
    }

    @Override // com.xiaomi.fitness.eco.device.model.api.EcoDeviceManagerInternalRemote, com.xiaomi.fitness.eco.device.manager.a
    @Nullable
    public EcoDeviceInfo getDeviceInfoInAll(@NotNull String did) throws RemoteException {
        Object next;
        Intrinsics.checkNotNullParameter(did, "did");
        EcoDeviceModelExtKt.logi(TAG, "getDeviceInfoInAll...");
        Iterator<T> it = this.mEcoDeviceContainer.getEcoAllDeviceList().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!Intrinsics.areEqual(((EcoDevice) next).getDid(), did));
        EcoDevice ecoDevice = (EcoDevice) next;
        if (ecoDevice == null) {
            EcoDeviceModelExtKt.logi("Couldn't find device from all device list with " + did);
            return null;
        }
        EcoProduct productByModel = this.mEcoProductManager.getProductByModel(ecoDevice.getModel());
        if (productByModel != null) {
            EcoDeviceInfo ecoDeviceInfo = new EcoDeviceInfo();
            ecoDeviceInfo.device = ecoDevice;
            ecoDeviceInfo.setProduct(productByModel);
            ecoDeviceInfo.setPrivateUUID(EcoDeviceExtKt.convertUuid(productByModel));
            return ecoDeviceInfo;
        }
        EcoDeviceModelExtKt.logi("Couldn't find product with model(" + ecoDevice.getModel() + ")");
        return null;
    }

    @Override // com.xiaomi.fitness.eco.device.model.api.EcoDeviceManagerInternalRemote, com.xiaomi.fitness.eco.device.manager.a
    @NotNull
    public List<EcoDeviceInfo> getDeviceInfoList() {
        EcoDeviceModelExtKt.logi(TAG, "getDeviceInfoList...");
        return getDeviceInfos(this.mEcoDeviceContainer.getEcoAllDeviceList());
    }

    @Override // com.xiaomi.fitness.eco.device.model.api.EcoDeviceManagerInternalRemote, com.xiaomi.fitness.eco.device.manager.a
    @Nullable
    public EcoDeviceModelRemote getDeviceModel(@NotNull String did) {
        Intrinsics.checkNotNullParameter(did, "did");
        EcoDeviceModelExtKt.logi(TAG, "getDeviceModel...");
        ms7 deviceModelInternal = getDeviceModelInternal(did);
        if (deviceModelInternal != null) {
            return deviceModelInternal.getRemote();
        }
        return null;
    }

    @Override // com.xiaomi.fitness.eco.device.model.api.EcoDeviceManagerInternalRemote, com.xiaomi.fitness.eco.device.manager.a
    @Nullable
    public synchronized EcoDeviceModelRemote getDeviceModelByMac(@Nullable final String mac) {
        ms7 ms7VarFindDeviceModel;
        EcoDeviceModelExtKt.logi(TAG, "getDeviceModelByMac...");
        ms7VarFindDeviceModel = findDeviceModel(new Function1() { // from class: ls7
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return Boolean.valueOf(EcoDeviceManagerRemoteImpl.getDeviceModelByMac$lambda$4(mac, (ms7) obj));
            }
        });
        return ms7VarFindDeviceModel != null ? ms7VarFindDeviceModel.getRemote() : null;
    }

    @Override // com.xiaomi.fitness.eco.device.model.api.EcoDeviceManagerInternalRemote, com.xiaomi.fitness.eco.device.manager.a
    @NotNull
    public List<EcoDeviceModelRemote> getDeviceModels() {
        EcoDeviceModelExtKt.logi(TAG, "getDeviceModels...");
        ArrayList arrayList = new ArrayList();
        Iterator<Map.Entry<String, ms7>> it = this.mDeviceModels.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getValue().getRemote());
        }
        return arrayList;
    }

    @Override // com.xiaomi.fitness.eco.device.model.api.EcoDeviceManagerInternalRemote, com.xiaomi.fitness.eco.device.manager.a
    public synchronized int getDeviceStatus(@Nullable String did) {
        Integer numValueOf;
        try {
            EcoDeviceModelExtKt.logi(TAG, "getDeviceStatus...");
            ms7 deviceModelInternal = getDeviceModelInternal(did);
            numValueOf = deviceModelInternal != null ? Integer.valueOf(deviceModelInternal.getDeviceStatus()) : null;
            EcoDeviceModelExtKt.logi((deviceModelInternal != null ? com.xiaomi.fitness.eco.device.manager.export.EcoDeviceModelExtKt.getName(deviceModelInternal) : null) + "(" + did + ")'s status is " + numValueOf);
        } catch (Throwable th) {
            throw th;
        }
        return numValueOf != null ? numValueOf.intValue() : -1;
    }

    @Override // com.xiaomi.fitness.eco.device.manager.a
    public int getEcoDeviceSize() {
        EcoDeviceModelExtKt.logi(TAG, "getEcoDeviceSize...");
        int i = 0;
        for (Map.Entry<String, ms7> entry : this.mDeviceModels.entrySet()) {
            EcoDeviceModelExtKt.logi("getEcoDeviceSize() name : " + entry.getValue().getDeviceInfo().getName());
            if (com.xiaomi.fitness.eco.device.manager.export.EcoDeviceModelExtKt.isEco(entry.getValue())) {
                i++;
            }
        }
        EcoDeviceModelExtKt.logi("getEcoDeviceSize() : " + i + " , mDeviceModels size : " + this.mDeviceModels.size());
        return i;
    }

    @Override // com.xiaomi.fitness.eco.device.model.api.EcoDeviceManagerInternalRemote, com.xiaomi.fitness.eco.device.manager.a
    @Nullable
    public EcoDeviceModelRemote getLocalDeviceModel(@NotNull String model) {
        Intrinsics.checkNotNullParameter(model, "model");
        EcoDeviceModelExtKt.logi(TAG, "getLocalDeviceModel...");
        for (Map.Entry<String, ms7> entry : this.mActiveLocalDeviceModel.entrySet()) {
            if (Intrinsics.areEqual(com.xiaomi.fitness.eco.device.manager.export.EcoDeviceModelExtKt.getModel(entry.getValue()), model)) {
                return entry.getValue().getRemote();
            }
        }
        return null;
    }

    @Override // com.xiaomi.fitness.eco.device.model.api.EcoDeviceManagerInternalRemote, com.xiaomi.fitness.eco.device.manager.a
    @Nullable
    public EcoProduct getProduct(@NotNull String mode) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        EcoDeviceModelExtKt.logi(TAG, "getProduct...");
        return this.mEcoProductManager.getProductByModel(mode);
    }

    @Override // com.xiaomi.fitness.eco.device.model.api.EcoDeviceManagerInternal
    public int getRequestStatus() {
        return this.requestStatus;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x008c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:30:0x008d  */
    /* JADX WARN: Code duplicated, block: B:33:0x00aa A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.xiaomi.fitness.eco.device.model.api.EcoDeviceManagerInternal
    @Nullable
    public Object initDeviceModelsByCache(@NotNull Continuation<? super Unit> continuation) {
        C22781 c22781;
        EcoDeviceManagerRemoteImpl ecoDeviceManagerRemoteImpl;
        List list;
        Object objLoadLocalDeviceList;
        List list2;
        EcoDeviceManagerRemoteImpl ecoDeviceManagerRemoteImpl2;
        EcoDeviceContainer ecoDeviceContainer;
        if (continuation instanceof C22781) {
            c22781 = (C22781) continuation;
            int i = c22781.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c22781.label = i - Integer.MIN_VALUE;
            } else {
                c22781 = new C22781(continuation);
            }
        } else {
            c22781 = new C22781(continuation);
        }
        Object objLoadEcoBindDeviceList = c22781.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c22781.label;
        if (i2 != 0) {
            if (i2 == 1) {
                ecoDeviceManagerRemoteImpl = (EcoDeviceManagerRemoteImpl) c22781.L$0;
                ResultKt.throwOnFailure(objLoadEcoBindDeviceList);
            } else if (i2 == 2) {
                ecoDeviceManagerRemoteImpl = (EcoDeviceManagerRemoteImpl) c22781.L$0;
                ResultKt.throwOnFailure(objLoadEcoBindDeviceList);
                list = (List) objLoadEcoBindDeviceList;
                EcoDeviceContainer ecoDeviceContainer2 = ecoDeviceManagerRemoteImpl.mEcoDeviceContainer;
                c22781.L$0 = ecoDeviceManagerRemoteImpl;
                c22781.L$1 = list;
                c22781.label = 3;
                objLoadLocalDeviceList = ecoDeviceContainer2.loadLocalDeviceList(c22781);
                if (objLoadLocalDeviceList == coroutine_suspended) {
                    return coroutine_suspended;
                }
                EcoDeviceManagerRemoteImpl ecoDeviceManagerRemoteImpl3 = ecoDeviceManagerRemoteImpl;
                list2 = list;
                objLoadEcoBindDeviceList = objLoadLocalDeviceList;
                ecoDeviceManagerRemoteImpl2 = ecoDeviceManagerRemoteImpl3;
                AnyExtKt.main$default(null, ecoDeviceManagerRemoteImpl2.new AnonymousClass2(list2, (List) objLoadEcoBindDeviceList, null), 1, null);
                ecoDeviceContainer = ecoDeviceManagerRemoteImpl2.mEcoDeviceContainer;
                c22781.L$0 = null;
                c22781.L$1 = null;
                c22781.label = 4;
                if (ecoDeviceContainer.loadEcoUnbindDeviceList(c22781) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (i2 == 3) {
                list2 = (List) c22781.L$1;
                ecoDeviceManagerRemoteImpl2 = (EcoDeviceManagerRemoteImpl) c22781.L$0;
                ResultKt.throwOnFailure(objLoadEcoBindDeviceList);
                AnyExtKt.main$default(null, ecoDeviceManagerRemoteImpl2.new AnonymousClass2(list2, (List) objLoadEcoBindDeviceList, null), 1, null);
                ecoDeviceContainer = ecoDeviceManagerRemoteImpl2.mEcoDeviceContainer;
                c22781.L$0 = null;
                c22781.L$1 = null;
                c22781.label = 4;
                if (ecoDeviceContainer.loadEcoUnbindDeviceList(c22781) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objLoadEcoBindDeviceList);
            }
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(objLoadEcoBindDeviceList);
        EcoDeviceModelExtKt.logi(TAG, "initDeviceModelsByCache...");
        EcoProductManagerRemoteInternal ecoProductManagerRemoteInternal = this.mEcoProductManager;
        c22781.L$0 = this;
        c22781.label = 1;
        if (ecoProductManagerRemoteInternal.load(c22781) == coroutine_suspended) {
            return coroutine_suspended;
        }
        ecoDeviceManagerRemoteImpl = this;
        EcoDeviceContainer ecoDeviceContainer3 = ecoDeviceManagerRemoteImpl.mEcoDeviceContainer;
        c22781.L$0 = ecoDeviceManagerRemoteImpl;
        c22781.label = 2;
        objLoadEcoBindDeviceList = ecoDeviceContainer3.loadEcoBindDeviceList(c22781);
        if (objLoadEcoBindDeviceList == coroutine_suspended) {
            return coroutine_suspended;
        }
        list = (List) objLoadEcoBindDeviceList;
        EcoDeviceContainer ecoDeviceContainer4 = ecoDeviceManagerRemoteImpl.mEcoDeviceContainer;
        c22781.L$0 = ecoDeviceManagerRemoteImpl;
        c22781.L$1 = list;
        c22781.label = 3;
        objLoadLocalDeviceList = ecoDeviceContainer4.loadLocalDeviceList(c22781);
        if (objLoadLocalDeviceList == coroutine_suspended) {
            return coroutine_suspended;
        }
        EcoDeviceManagerRemoteImpl ecoDeviceManagerRemoteImpl4 = ecoDeviceManagerRemoteImpl;
        list2 = list;
        objLoadEcoBindDeviceList = objLoadLocalDeviceList;
        ecoDeviceManagerRemoteImpl2 = ecoDeviceManagerRemoteImpl4;
        AnyExtKt.main$default(null, ecoDeviceManagerRemoteImpl2.new AnonymousClass2(list2, (List) objLoadEcoBindDeviceList, null), 1, null);
        ecoDeviceContainer = ecoDeviceManagerRemoteImpl2.mEcoDeviceContainer;
        c22781.L$0 = null;
        c22781.L$1 = null;
        c22781.label = 4;
        if (ecoDeviceContainer.loadEcoUnbindDeviceList(c22781) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }

    @Override // com.xiaomi.fitness.eco.device.model.api.EcoDeviceManagerInternalRemote, com.xiaomi.fitness.eco.device.manager.a
    public boolean isConnectActive(@Nullable String did) {
        EcoDeviceModelExtKt.logi(TAG, "isConnectActive...");
        ms7 deviceModelInternal = getDeviceModelInternal(did);
        if (deviceModelInternal != null) {
            return deviceModelInternal.getIsConnectActive();
        }
        return false;
    }

    @Override // com.xiaomi.fitness.eco.device.model.api.EcoDeviceManagerInternalRemote, com.xiaomi.fitness.eco.device.manager.a
    public synchronized boolean isConnected(@Nullable String did) {
        boolean z;
        EcoDeviceModelExtKt.logi(TAG, "isConnected...");
        ms7 deviceModelInternal = getDeviceModelInternal(did);
        z = false;
        if (deviceModelInternal != null && deviceModelInternal.getIsDeviceConnected()) {
            z = true;
        }
        return z;
    }

    @Override // com.xiaomi.fitness.eco.device.model.api.EcoDeviceManagerInternal
    public void notifyDeviceBind(@NotNull String did, boolean isRebind) {
        Intrinsics.checkNotNullParameter(did, "did");
        EcoDeviceModelExtKt.logi(TAG, "notifyDeviceBind...");
        RemoteCallbackList<g8h> remoteCallbackList = this.mDeviceStatusListeners;
        try {
            try {
                try {
                    int iBeginBroadcast = remoteCallbackList.beginBroadcast();
                    for (int i = 0; i < iBeginBroadcast; i++) {
                        try {
                            IInterface broadcastItem = remoteCallbackList.getBroadcastItem(i);
                            Intrinsics.checkNotNullExpressionValue(broadcastItem, "getBroadcastItem(...)");
                            ((g8h) broadcastItem).onBind(did, isRebind);
                        } catch (Exception e) {
                            Logger.e("action(" + remoteCallbackList.getBroadcastItem(i) + ") throw exception", e);
                        }
                    }
                    remoteCallbackList.finishBroadcast();
                } catch (Exception e2) {
                    Logger.e("An exception occurred when finishBroadcast", e2);
                }
            } catch (Exception e3) {
                Logger.e("An exception occurred during RemoteCallbackList forEach", e3);
                remoteCallbackList.finishBroadcast();
            }
        } catch (Throwable th) {
            try {
                remoteCallbackList.finishBroadcast();
            } catch (Exception e4) {
                Logger.e("An exception occurred when finishBroadcast", e4);
            }
            throw th;
        }
    }

    @Override // com.xiaomi.fitness.eco.device.model.api.EcoDeviceManagerInternal
    public void notifyDeviceDestroy(@NotNull String did, boolean isRemoved) {
        Intrinsics.checkNotNullParameter(did, "did");
        EcoDeviceModelExtKt.logi(TAG, "notifyDeviceDestroy...");
        releaseByDeviceModel(did, isRemoved);
    }

    @Override // com.xiaomi.fitness.eco.device.model.api.EcoDeviceManagerInternal
    public void notifyDeviceInit(@NotNull String did, boolean isReadded) {
        Intrinsics.checkNotNullParameter(did, "did");
        EcoDeviceModelExtKt.logi(TAG, "notifyDeviceInit...");
        RemoteCallbackList<g8h> remoteCallbackList = this.mDeviceStatusListeners;
        try {
            try {
                try {
                    int iBeginBroadcast = remoteCallbackList.beginBroadcast();
                    for (int i = 0; i < iBeginBroadcast; i++) {
                        try {
                            IInterface broadcastItem = remoteCallbackList.getBroadcastItem(i);
                            Intrinsics.checkNotNullExpressionValue(broadcastItem, "getBroadcastItem(...)");
                            ((g8h) broadcastItem).onInIt(did, isReadded);
                        } catch (Exception e) {
                            Logger.e("action(" + remoteCallbackList.getBroadcastItem(i) + ") throw exception", e);
                        }
                    }
                    remoteCallbackList.finishBroadcast();
                } catch (Exception e2) {
                    Logger.e("An exception occurred when finishBroadcast", e2);
                }
            } catch (Exception e3) {
                Logger.e("An exception occurred during RemoteCallbackList forEach", e3);
                remoteCallbackList.finishBroadcast();
            }
        } catch (Throwable th) {
            try {
                remoteCallbackList.finishBroadcast();
            } catch (Exception e4) {
                Logger.e("An exception occurred when finishBroadcast", e4);
            }
            throw th;
        }
    }

    @Override // com.xiaomi.fitness.eco.device.model.api.EcoDeviceManagerInternalRemote, com.xiaomi.fitness.eco.device.manager.a
    public void refreshEcoList(@Nullable final hbk callback) {
        EcoDeviceModelExtKt.logi(TAG, "refreshEcoList...");
        ScopeExtKt.scopeNet$default(null, new C22791(callback, null), 1, null).m503catch(new Function2() { // from class: hs7
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return EcoDeviceManagerRemoteImpl.refreshEcoList$lambda$21(callback, (AndroidScope) obj, (Throwable) obj2);
            }
        });
    }

    @Override // com.xiaomi.fitness.eco.device.model.api.EcoDeviceManagerInternalRemote, com.xiaomi.fitness.eco.device.manager.a
    public void removeDeviceModel(@NotNull String did) {
        Intrinsics.checkNotNullParameter(did, "did");
        EcoDeviceModelExtKt.logi(TAG, "removeDeviceModel...");
        this.mDeviceModels.remove(did);
        this.mEcoDeviceContainer.removeEcoDevice(did);
    }

    @Override // com.xiaomi.fitness.eco.device.model.api.EcoDeviceManagerInternalRemote, com.xiaomi.fitness.eco.device.manager.a.AbstractBinderC0549a, com.xiaomi.fitness.eco.device.manager.a
    public void removeDeviceStatusListener(@NotNull g8h listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        EcoDeviceModelExtKt.logi(TAG, "removeDeviceStatusListener...");
        this.mDeviceStatusListeners.unregister(listener);
    }

    @Override // com.xiaomi.fitness.eco.device.model.api.EcoDeviceManagerInternal
    public void removeLocalDevice(@NotNull String did) {
        Intrinsics.checkNotNullParameter(did, "did");
        EcoDeviceModelExtKt.logi(TAG, "removeLocalDevice() called with: did = " + did);
        this.mEcoDeviceContainer.removeLocalDevice(did);
        this.mActiveLocalDeviceModel.remove(did);
        ms7 ms7VarRemove = this.mEcoLocalDeviceModels.remove(did);
        if (ms7VarRemove != null) {
            ms7VarRemove.destroy(true);
            EcoDeviceFactory.INSTANCE.removeDeviceBinder(com.xiaomi.fitness.eco.device.manager.export.EcoDeviceModelExtKt.getMac(ms7VarRemove));
        }
    }

    @Override // com.xiaomi.fitness.eco.device.model.api.EcoDeviceManagerInternal
    public void requestDeviceList(@Nullable Function1<? super List<? extends EcoDevice>, Unit> onSuccess, @Nullable final Function1<? super ApiException, Unit> onFail) {
        EcoDeviceModelExtKt.logi(TAG, "requestDeviceList...");
        if (getRequestStatus() == 1) {
            EcoDeviceModelExtKt.loge(TAG, "requesting device list now");
        } else {
            setRequestStatus(1);
            ScopeExtKt.scopeNet$default(null, new C22801(onSuccess, null), 1, null).m503catch(new Function2() { // from class: es7
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return EcoDeviceManagerRemoteImpl.requestDeviceList$lambda$6(this.f17015a, onFail, (AndroidScope) obj, (Throwable) obj2);
                }
            });
        }
    }

    @Override // com.xiaomi.fitness.eco.device.model.api.EcoDeviceManagerInternalRemote, com.xiaomi.fitness.eco.device.manager.a
    public void setDeviceInfo(@NotNull EcoDeviceInfo info) {
        Intrinsics.checkNotNullParameter(info, "info");
        EcoDeviceModelExtKt.logi(TAG, "setDeviceInfo...");
        ms7 deviceModelInternal = getDeviceModelInternal(info.getDid());
        if (deviceModelInternal != null) {
            deviceModelInternal.setDeviceInfo(info);
        }
    }

    @Override // com.xiaomi.fitness.eco.device.model.api.EcoDeviceManagerInternalRemote, com.xiaomi.fitness.eco.device.manager.a
    public synchronized void setDeviceStatus(@Nullable String did, int status) {
        try {
            EcoDeviceModelExtKt.logi(TAG, "update device(did=" + did + ") to status " + EcoDeviceStatus.INSTANCE.statusToString(status));
            ms7 deviceModelInternal = getDeviceModelInternal(did);
            if (deviceModelInternal == null || com.xiaomi.fitness.eco.device.manager.export.EcoDeviceModelExtKt.isLocalDevice(deviceModelInternal) || !EcoOhterExtKt.isAppAbandon(ApplicationExtKt.getApplication())) {
                if (status != 3 && status != 6 && status != 7 && deviceModelInternal != null && !deviceModelInternal.getIsConnectActive()) {
                    deviceModelInternal.setDeviceStatus(9);
                } else if (deviceModelInternal != null) {
                    deviceModelInternal.setDeviceStatus(status);
                }
            } else if (deviceModelInternal != null) {
                deviceModelInternal.setDeviceStatus(8);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.xiaomi.fitness.eco.device.model.api.EcoDeviceManagerInternal
    public void setRequestStatus(int i) {
        this.requestStatus = i;
    }

    @Override // com.xiaomi.fitness.eco.device.model.api.EcoDeviceManagerInternalRemote, com.xiaomi.fitness.eco.device.manager.a
    public void unbindDevice(@NotNull final String did, @Nullable final l callback) {
        Intrinsics.checkNotNullParameter(did, "did");
        EcoDeviceModelExtKt.logi(TAG, "unbindDevice...");
        ScopeExtKt.scopeNet$default(null, new C22811(did, callback, null), 1, null).m503catch(new Function2() { // from class: ks7
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return EcoDeviceManagerRemoteImpl.unbindDevice$lambda$15(callback, this, did, (AndroidScope) obj, (Throwable) obj2);
            }
        });
    }

    @Override // com.xiaomi.fitness.eco.device.model.api.EcoDeviceManagerInternal
    public void updateDevice(@NotNull EcoDevice device) {
        Intrinsics.checkNotNullParameter(device, "device");
        EcoDeviceModelExtKt.logi(TAG, "updateDevice...");
        this.mEcoDeviceContainer.updateEcoDeviceInfo(device);
    }

    @Override // com.xiaomi.fitness.eco.device.model.api.EcoDeviceManagerInternalRemote, com.xiaomi.fitness.eco.device.manager.a
    @Nullable
    public EcoDeviceModelRemote findDeviceModel(@Nullable final b p) {
        ms7 ms7VarFindDeviceModel;
        EcoDeviceModelExtKt.logi(TAG, "findDeviceModel...");
        if (p == null || (ms7VarFindDeviceModel = findDeviceModel(new Function1() { // from class: ds7
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return Boolean.valueOf(EcoDeviceManagerRemoteImpl.findDeviceModel$lambda$17(p, (ms7) obj));
            }
        })) == null) {
            return null;
        }
        return ms7VarFindDeviceModel.getRemote();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final EcoDeviceBinder getDeviceBinder(String did) {
        EcoDeviceModelExtKt.logi(TAG, "getDeviceBinder did ...");
        ms7 deviceModelInternal = getDeviceModelInternal(did);
        EcoDeviceInfo deviceInfo = deviceModelInternal != null ? deviceModelInternal.getDeviceInfo() : null;
        EcoDeviceBinder deviceBinder = deviceInfo != null ? EcoDeviceFactory.INSTANCE.getDeviceBinder(deviceInfo) : null;
        if (deviceBinder == null) {
            EcoDeviceModelExtKt.loge(TAG, "Cannot find DeviceBinder(" + did + ") when unbound device");
        }
        return deviceBinder;
    }
}
