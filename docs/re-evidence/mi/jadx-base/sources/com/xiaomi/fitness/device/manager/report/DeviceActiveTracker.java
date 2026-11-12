package com.xiaomi.fitness.device.manager.report;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Base64;
import com.example.statistics.export.IOnetrack;
import com.example.statistics.export.OneTrackExtKt;
import com.example.statistics.export.OneTrackStatBean;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.miui.circulate.device.api.Column;
import com.miui.tsmclient.model.ErrorCode;
import com.xiaomi.fit.fitness.parser.sport.base.SportReportBaseParser;
import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.manager.AccountManager;
import com.xiaomi.fitness.account.user.UserInfoManager;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.concurrent.ExecutorHelper;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.DeviceUtil;
import com.xiaomi.fitness.common.utils.MD5Util;
import com.xiaomi.fitness.common.utils.RomUtils;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.api.DeviceRequest;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.FoundDeviceCallback;
import com.xiaomi.fitness.device.manager.export.HuamiApiCaller;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.device.manager.export.WearableProductManager;
import com.xiaomi.fitness.device.manager.export.bean.AppVersionBean;
import com.xiaomi.fitness.device.manager.export.bean.DeviceActive;
import com.xiaomi.fitness.device.manager.export.bean.DeviceActiveBean;
import com.xiaomi.fitness.device.manager.export.bean.DeviceActiveKt;
import com.xiaomi.fitness.device.manager.export.bean.DeviceInfoData;
import com.xiaomi.fitness.device.manager.export.bean.DeviceRecord;
import com.xiaomi.fitness.device.manager.export.bean.EventData;
import com.xiaomi.fitness.device.manager.export.bean.HuamiTrackUpData;
import com.xiaomi.fitness.device.manager.export.bean.MiwearActiveDataJson;
import com.xiaomi.fitness.device.manager.export.bean.MiwearUsageDataJson;
import com.xiaomi.fitness.device.manager.export.bean.WearableProduct;
import com.xiaomi.fitness.device.manager.export.scan.BleDevice;
import com.xiaomi.fitness.device.manager.export.scan.ScannedDeviceInfo;
import com.xiaomi.fitness.device.manager.extensions.DeviceExtKt;
import com.xiaomi.fitness.device.manager.h;
import com.xiaomi.fitness.device.manager.report.DeviceActiveResult;
import com.xiaomi.fitness.device.manager.report.DeviceActiveTracker;
import com.xiaomi.fitness.device.manager.ui.scan.ScanManager;
import com.xiaomi.fitness.device.manager.ui.scan.SearchCallback;
import com.xiaomi.fitness.login.region.RegionManagerImpl;
import com.xiaomi.fitness.net.extensions.ScopeExtKt;
import com.xiaomi.fitness.net.response.ApiException;
import com.xiaomi.fitness.net.scope.AndroidScope;
import com.xiaomi.fitness.relative.ui.util.RelativeCareConstants;
import com.xiaomi.hm.health.bt.sdk.DeviceInfoExt;
import com.xiaomi.onetrack.OneTrack;
import com.xiaomi.onetrack.c.i;
import com.xiaomi.smarthome.plugin.update.PluginPackageConstant;
import defpackage.g1s;
import defpackage.xpd;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Charsets;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000¸\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\n\b\u0002¢\u0006\u0005\b\u0085\u0001\u0010bJ'\u0010\n\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ(\u0010\u0010\u001a\u00020\t2\u0016\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\r0\fj\b\u0012\u0004\u0012\u00020\r`\u000eH\u0082@¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0013\u001a\u00020\u0012*\u00020\u0007H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J5\u0010\u001b\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u00152\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\r0\u00172\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0016\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\r0\u001dH\u0082@¢\u0006\u0004\b\u001e\u0010\u001fJ'\u0010#\u001a\u00020\t2\u0006\u0010 \u001a\u00020\u00072\u0006\u0010!\u001a\u00020\u00122\u0006\u0010\"\u001a\u00020\u0007H\u0002¢\u0006\u0004\b#\u0010$J\u0019\u0010%\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b%\u0010&J\u001a\u0010(\u001a\u0004\u0018\u00010'2\u0006\u0010\u0004\u001a\u00020\u0003H\u0082@¢\u0006\u0004\b(\u0010)J.\u0010/\u001a\u00020\t2\u0006\u0010+\u001a\u00020*2\u0006\u0010-\u001a\u00020,2\f\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00070\u0017H\u0082@¢\u0006\u0004\b/\u00100J\u001f\u00104\u001a\u00020\t2\u0006\u00101\u001a\u00020\u00072\u0006\u00103\u001a\u000202H\u0016¢\u0006\u0004\b4\u00105J\u0019\u00104\u001a\u00020\t2\b\u00106\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b4\u0010&J\u001e\u00108\u001a\u00020\t2\f\u00107\u001a\b\u0012\u0004\u0012\u00020\r0\u0017H\u0096@¢\u0006\u0004\b8\u00109J\u0010\u0010:\u001a\u00020\u0012H\u0096@¢\u0006\u0004\b:\u0010\u001fJV\u0010B\u001a\u00020\t2\f\u0010;\u001a\b\u0012\u0004\u0012\u00020\u00070\u00172\u000e\u0010<\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00172\u000e\u0010=\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00172\u0017\u0010A\u001a\u0013\u0012\u0004\u0012\u00020?\u0012\u0004\u0012\u00020\t0>¢\u0006\u0002\b@H\u0016¢\u0006\u0004\bB\u0010CJ!\u0010E\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010D\u001a\u00020\u0012H\u0016¢\u0006\u0004\bE\u0010FJ!\u0010H\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010G\u001a\u00020\u0012H\u0016¢\u0006\u0004\bH\u0010FJ!\u0010J\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010I\u001a\u00020\u0012H\u0016¢\u0006\u0004\bJ\u0010FJ\u0019\u0010K\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\bK\u0010&J)\u0010N\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010L\u001a\u00020\u00152\u0006\u0010M\u001a\u00020\u0015H\u0016¢\u0006\u0004\bN\u0010OJ\u0019\u0010P\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\bP\u0010&J\u0019\u0010Q\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\bQ\u0010&J#\u0010S\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010R\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\bS\u0010TJ#\u0010U\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010R\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\bU\u0010TJ#\u0010V\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010R\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\bV\u0010TJ+\u0010W\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010R\u001a\u0004\u0018\u00010\u00072\u0006\u0010L\u001a\u00020\u0015H\u0016¢\u0006\u0004\bW\u0010XJ\u0015\u0010Z\u001a\u00020\u00072\u0006\u0010Y\u001a\u00020\u0019¢\u0006\u0004\bZ\u0010[J5\u0010_\u001a\u00020\t2\b\u0010+\u001a\u0004\u0018\u00010\u00072\b\u0010\\\u001a\u0004\u0018\u00010\u00072\u0006\u0010]\u001a\u00020\u00152\b\u0010^\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b_\u0010`J\r\u0010a\u001a\u00020\t¢\u0006\u0004\ba\u0010bR\u0017\u0010d\u001a\u00020c8\u0006¢\u0006\f\n\u0004\bd\u0010e\u001a\u0004\bf\u0010gR\u0017\u0010i\u001a\u00020h8\u0006¢\u0006\f\n\u0004\bi\u0010j\u001a\u0004\bk\u0010lR\u0014\u0010m\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\bm\u0010nR\u0014\u0010p\u001a\u00020o8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bp\u0010qR\u0014\u0010r\u001a\u00020\u00158\u0002X\u0082T¢\u0006\u0006\n\u0004\br\u0010sR\u0014\u0010t\u001a\u00020\u00158\u0002X\u0082T¢\u0006\u0006\n\u0004\bt\u0010sR\u0016\u0010u\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bu\u0010sR\u0014\u0010w\u001a\u00020v8\u0002X\u0082T¢\u0006\u0006\n\u0004\bw\u0010xR\u001b\u0010~\u001a\u00020y8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bz\u0010{\u001a\u0004\b|\u0010}R\u0017\u0010\u007f\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u007f\u0010\u0080\u0001R\u001a\u0010\u0081\u0001\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0081\u0001\u0010nR\u001e\u0010\u0083\u0001\u001a\t\u0012\u0004\u0012\u00020\t0\u0082\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0083\u0001\u0010\u0084\u0001¨\u0006\u0086\u0001"}, d2 = {"Lcom/xiaomi/fitness/device/manager/report/DeviceActiveTracker;", "Lcom/xiaomi/fitness/device/manager/report/DeviceTracker;", "Lcom/xiaomi/fitness/device/manager/h$a;", "Lcom/xiaomi/fitness/device/manager/export/bean/DeviceActive;", "deviceActive", "Lcom/xiaomi/fitness/device/manager/export/bean/EventData;", "eventData", "", "did", "", "handleDeviceRecordDataFromDatabase", "(Lcom/xiaomi/fitness/device/manager/export/bean/DeviceActive;Lcom/xiaomi/fitness/device/manager/export/bean/EventData;Ljava/lang/String;)V", "Ljava/util/ArrayList;", "Lcom/xiaomi/fitness/device/manager/export/bean/DeviceRecord;", "Lkotlin/collections/ArrayList;", "tempSuccessList", "deleteDeviceRecordDatabase", "(Ljava/util/ArrayList;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "isMatchesNumber", "(Ljava/lang/String;)Z", "", "index", "", "deviceRecord", "Lcom/google/gson/JsonArray;", "jsonArray", "splitDeviceRecordData", "(ILjava/util/List;Lcom/google/gson/JsonArray;Lcom/xiaomi/fitness/device/manager/export/bean/EventData;)V", "", "getTimeOutDeviceRecord", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "name", "result", "reason", "reportResult", "(Ljava/lang/String;ZLjava/lang/String;)V", "reportConnectActive", "(Ljava/lang/String;)V", "Lcom/xiaomi/fitness/device/manager/report/DeviceActiveResult;", "reqDeviceActiveArray", "(Lcom/xiaomi/fitness/device/manager/export/bean/DeviceActive;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "deviceModel", "Lcom/xiaomi/fitness/device/manager/export/HuamiApiCaller;", "huamiApiCaller", "defaultEncodeStringList1", "upHuamiTrackData", "(Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;Lcom/xiaomi/fitness/device/manager/export/HuamiApiCaller;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", i.d, "Lcom/xiaomi/fitness/device/manager/export/bean/DeviceActiveBean;", "eventValue", "reportDeviceActive", "(Ljava/lang/String;Lcom/xiaomi/fitness/device/manager/export/bean/DeviceActiveBean;)V", "firmwareVersion", "recordList", "saveDeviceRecordToDatabase", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteDeviceRecordFromDatabaseTimeout", "namePrefixList", "wearProductIdList", "localProductIdList", "Lkotlin/Function1;", "Lcom/xiaomi/fitness/device/manager/export/FoundDeviceCallback;", "Lkotlin/ExtensionFunctionType;", "callback", "foundDeviceByScanBluetooth", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Lkotlin/jvm/functions/Function1;)V", "isReadded", "onInIt", "(Ljava/lang/String;Z)V", "isRebind", "onBind", "isRemoved", LifecycleConstantKt.ON_DESTROY, "onConnectStart", "errorCode", "retryTimes", "onConnectFailure", "(Ljava/lang/String;II)V", "onConnectSuccess", "onDisconnect", "model", "onSpecificDeviceConnectStart", "(Ljava/lang/String;Ljava/lang/String;)V", "onSpecificDeviceConnectSuccess", "onSpecificDeviceDisconnect", "onSpecificDeviceConnectFailure", "(Ljava/lang/String;Ljava/lang/String;I)V", "deviceRecordJsonArray", "compressByZlib", "(Lcom/google/gson/JsonArray;)Ljava/lang/String;", "deviceVersion", Column.BATTERY, "info", "reportBatteryValue", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V", "syncHuamiStatisticData", "()V", "Lcom/xiaomi/fitness/device/manager/ui/scan/ScanManager;", "mScanManager", "Lcom/xiaomi/fitness/device/manager/ui/scan/ScanManager;", "getMScanManager", "()Lcom/xiaomi/fitness/device/manager/ui/scan/ScanManager;", "Lcom/xiaomi/fitness/device/manager/report/DeviceActiveRequest;", "request", "Lcom/xiaomi/fitness/device/manager/report/DeviceActiveRequest;", "getRequest", "()Lcom/xiaomi/fitness/device/manager/report/DeviceActiveRequest;", "TAG", "Ljava/lang/String;", "Landroid/os/Handler;", "mHandler", "Landroid/os/Handler;", "MAX_LIST_SIZE", "I", "MAX_DEVICE_RECORD_DATABASE_SIZE", "mOnceReportDeviceRecordSize", "", "MAX_LONG_DAYS", "J", "Lcom/xiaomi/fitness/device/manager/api/DeviceRequest;", "mDeviceRequest$delegate", "Lkotlin/Lazy;", "getMDeviceRequest", "()Lcom/xiaomi/fitness/device/manager/api/DeviceRequest;", "mDeviceRequest", "mSyncFlag", "Z", "mDid", "Lkotlin/Function0;", "mRunnable", "Lkotlin/jvm/functions/Function0;", "<init>", "device-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nDeviceActiveTracker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeviceActiveTracker.kt\ncom/xiaomi/fitness/device/manager/report/DeviceActiveTracker\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,592:1\n37#2:593\n36#2,3:594\n*S KotlinDebug\n*F\n+ 1 DeviceActiveTracker.kt\ncom/xiaomi/fitness/device/manager/report/DeviceActiveTracker\n*L\n562#1:593\n562#1:594,3\n*E\n"})
public final class DeviceActiveTracker extends h.a implements DeviceTracker {
    private static final int MAX_DEVICE_RECORD_DATABASE_SIZE = 20000;
    private static final int MAX_LIST_SIZE = 100;
    private static final long MAX_LONG_DAYS = 1209600;

    @NotNull
    private static final String TAG = "DeviceActiveTracker";

    @Nullable
    private static String mDid;
    private static boolean mSyncFlag;

    @NotNull
    public static final DeviceActiveTracker INSTANCE = new DeviceActiveTracker();

    @NotNull
    private static final ScanManager mScanManager = new ScanManager();

    @NotNull
    private static final DeviceActiveRequest request = new DeviceActiveRequest();

    @NotNull
    private static final Handler mHandler = new Handler(Looper.getMainLooper());
    private static int mOnceReportDeviceRecordSize = 100;

    /* JADX INFO: renamed from: mDeviceRequest$delegate, reason: from kotlin metadata */
    @NotNull
    private static final Lazy mDeviceRequest = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: f16
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return DeviceActiveTracker.mDeviceRequest_delegate$lambda$0();
        }
    });

    @NotNull
    private static final Function0<Unit> mRunnable = new Function0() { // from class: u06
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return DeviceActiveTracker.mRunnable$lambda$11();
        }
    };

    /* JADX INFO: renamed from: com.xiaomi.fitness.device.manager.report.DeviceActiveTracker$deleteDeviceRecordDatabase$1, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.device.manager.report.DeviceActiveTracker", f = "DeviceActiveTracker.kt", i = {0, 0, 0}, l = {SportReportBaseParser.ReportType.avgFreq, ErrorCode.ERROR_SP_NOTICE_NOT_READY}, m = "deleteDeviceRecordDatabase", n = {"deleteDeviceRecord", "startID", "endID"}, s = {"L$0", "I$0", "I$1"})
    public static final class AnonymousClass1 extends ContinuationImpl {
        int I$0;
        int I$1;
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DeviceActiveTracker.this.deleteDeviceRecordDatabase(null, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.device.manager.report.DeviceActiveTracker$deleteDeviceRecordFromDatabaseTimeout$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.device.manager.report.DeviceActiveTracker", f = "DeviceActiveTracker.kt", i = {}, l = {305, 310}, m = "deleteDeviceRecordFromDatabaseTimeout", n = {}, s = {})
    public static final class C19601 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C19601(Continuation<? super C19601> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DeviceActiveTracker.this.deleteDeviceRecordFromDatabaseTimeout(this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.device.manager.report.DeviceActiveTracker$getTimeOutDeviceRecord$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "Lcom/xiaomi/fitness/device/manager/export/bean/DeviceRecord;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.device.manager.report.DeviceActiveTracker$getTimeOutDeviceRecord$2", f = "DeviceActiveTracker.kt", i = {0, 0}, l = {366}, m = "invokeSuspend", n = {"queryDeviceRecordOverTime", "systemTime"}, s = {"L$0", "J$0"})
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<DeviceRecord>>, Object> {
        long J$0;
        Object L$0;
        int label;

        public AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(continuation);
        }

        /* JADX WARN: Code duplicated, block: B:16:0x0055 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:19:0x0066 A[Catch: all -> 0x0018, TryCatch #0 {all -> 0x0018, blocks: (B:6:0x0013, B:17:0x0056, B:19:0x0066, B:20:0x006c, B:14:0x0039, B:22:0x0075, B:13:0x0033), top: B:26:0x0009 }] */
        /* JADX WARN: Code duplicated, block: B:22:0x0075 A[Catch: all -> 0x0018, TRY_LEAVE, TryCatch #0 {all -> 0x0018, blocks: (B:6:0x0013, B:17:0x0056, B:19:0x0066, B:20:0x006c, B:14:0x0039, B:22:0x0075, B:13:0x0033), top: B:26:0x0009 }] */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v0, types: [int] */
        /* JADX WARN: Type inference failed for: r1v1 */
        /* JADX WARN: Type inference failed for: r1v10 */
        /* JADX WARN: Type inference failed for: r1v11 */
        /* JADX WARN: Type inference failed for: r1v12 */
        /* JADX WARN: Type inference failed for: r1v13 */
        /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, java.util.List] */
        /* JADX WARN: Type inference failed for: r1v5, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r1v8 */
        /* JADX WARN: Type inference failed for: r1v9 */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0053 -> B:17:0x0056). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:0:?
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r15) {
            /*
                r14 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r14.label
                java.lang.String r2 = "DeviceActiveTracker"
                r3 = 1
                if (r1 == 0) goto L23
                if (r1 != r3) goto L1b
                long r4 = r14.J$0
                java.lang.Object r1 = r14.L$0
                java.util.List r1 = (java.util.List) r1
                kotlin.ResultKt.throwOnFailure(r15)     // Catch: java.lang.Throwable -> L18
                r12 = r4
                goto L56
            L18:
                r15 = move-exception
                goto L8e
            L1b:
                java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r15.<init>(r0)
                throw r15
            L23:
                kotlin.ResultKt.throwOnFailure(r15)
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                long r4 = java.lang.System.currentTimeMillis()
                r15 = 1000(0x3e8, float:1.401E-42)
                long r6 = (long) r15
                long r4 = r4 / r6
                java.util.ArrayList r15 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L18
                r15.<init>()     // Catch: java.lang.Throwable -> L18
                r12 = r4
            L39:
                com.xiaomi.fitness.device.manager.report.DeviceRecordReport r4 = new com.xiaomi.fitness.device.manager.report.DeviceRecordReport     // Catch: java.lang.Throwable -> L18
                r4.<init>()     // Catch: java.lang.Throwable -> L18
                int r10 = r1.size()     // Catch: java.lang.Throwable -> L18
                r14.L$0 = r1     // Catch: java.lang.Throwable -> L18
                r14.J$0 = r12     // Catch: java.lang.Throwable -> L18
                r14.label = r3     // Catch: java.lang.Throwable -> L18
                r7 = 1209600(0x127500, double:5.97622E-318)
                r9 = 500(0x1f4, float:7.0E-43)
                r5 = r12
                r11 = r14
                java.lang.Object r15 = r4.queryPagedDeviceRecordOverTime(r5, r7, r9, r10, r11)     // Catch: java.lang.Throwable -> L18
                if (r15 != r0) goto L56
                return r0
            L56:
                java.util.Collection r15 = (java.util.Collection) r15     // Catch: java.lang.Throwable -> L18
                java.util.List r15 = kotlin.collections.CollectionsKt.toMutableList(r15)     // Catch: java.lang.Throwable -> L18
                r4 = r15
                java.util.Collection r4 = (java.util.Collection) r4     // Catch: java.lang.Throwable -> L18
                boolean r4 = r4.isEmpty()     // Catch: java.lang.Throwable -> L18
                r4 = r4 ^ r3
                if (r4 == 0) goto L6c
                r4 = r15
                java.util.Collection r4 = (java.util.Collection) r4     // Catch: java.lang.Throwable -> L18
                r1.addAll(r4)     // Catch: java.lang.Throwable -> L18
            L6c:
                java.util.Collection r15 = (java.util.Collection) r15     // Catch: java.lang.Throwable -> L18
                boolean r15 = r15.isEmpty()     // Catch: java.lang.Throwable -> L18
                r15 = r15 ^ r3
                if (r15 != 0) goto L39
                int r15 = r1.size()     // Catch: java.lang.Throwable -> L18
                java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L18
                r0.<init>()     // Catch: java.lang.Throwable -> L18
                java.lang.String r3 = "getTimeOutDeviceRecord size = "
                r0.append(r3)     // Catch: java.lang.Throwable -> L18
                r0.append(r15)     // Catch: java.lang.Throwable -> L18
                java.lang.String r15 = r0.toString()     // Catch: java.lang.Throwable -> L18
                com.xiaomi.fitness.common.log.Logger.i(r2, r15)     // Catch: java.lang.Throwable -> L18
                goto La2
            L8e:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r3 = "deleteDeviceRecordDatabaseOverrideDay deleteDeviceRecord"
                r0.append(r3)
                r0.append(r15)
                java.lang.String r15 = r0.toString()
                com.xiaomi.fitness.common.log.Logger.e(r2, r15)
            La2:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.fitness.device.manager.report.DeviceActiveTracker.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super List<DeviceRecord>> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.device.manager.report.DeviceActiveTracker$handleDeviceRecordDataFromDatabase$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.device.manager.report.DeviceActiveTracker$handleDeviceRecordDataFromDatabase$1", f = "DeviceActiveTracker.kt", i = {0, 0, 0, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2}, l = {148, SportReportBaseParser.ReportType.divingOTU, 200}, m = "invokeSuspend", n = {"deviceRecordJsonArray", "deviceRecordList", "deviceRecordListFromDataBase", "deviceRecordJsonArray", "deviceRecordList", "deviceRecordListFromDataBase", "handleMax", "rate", "index", "deviceRecordListFromDataBase", "handleMax", "rate", "index"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "I$0", "I$1", "I$2", "L$0", "I$0", "I$1", "I$2"})
    public static final class C19611 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ DeviceActive $deviceActive;
        final /* synthetic */ String $did;
        final /* synthetic */ EventData $eventData;
        int I$0;
        int I$1;
        int I$2;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C19611(String str, EventData eventData, DeviceActive deviceActive, Continuation<? super C19611> continuation) {
            super(2, continuation);
            this.$did = str;
            this.$eventData = eventData;
            this.$deviceActive = deviceActive;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C19611(this.$did, this.$eventData, this.$deviceActive, continuation);
        }

        /* JADX WARN: Code duplicated, block: B:23:0x00ca A[ADDED_TO_REGION] */
        /* JADX WARN: Code duplicated, block: B:28:0x00e2  */
        /* JADX WARN: Code duplicated, block: B:30:0x00f0  */
        /* JADX WARN: Code duplicated, block: B:32:0x00f5  */
        /* JADX WARN: Code duplicated, block: B:36:0x0110  */
        /* JADX WARN: Code duplicated, block: B:38:0x0193 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:39:0x0194  */
        /* JADX WARN: Code duplicated, block: B:42:0x01a0  */
        /* JADX WARN: Code duplicated, block: B:43:0x01a5  */
        /* JADX WARN: Code duplicated, block: B:46:0x01bc  */
        /* JADX WARN: Code duplicated, block: B:47:0x01c1  */
        /* JADX WARN: Code duplicated, block: B:50:0x01cb  */
        /* JADX WARN: Code duplicated, block: B:52:0x01e2 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:53:0x01e3  */
        /* JADX WARN: Code duplicated, block: B:56:0x01fc  */
        /* JADX WARN: Code duplicated, block: B:57:0x0206  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0090 -> B:16:0x0093). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:53:0x01e3 -> B:54:0x01e5). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:56:0x01fc -> B:55:0x01f4). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:57:0x0206 -> B:58:0x020a). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r18) {
            /*
                Method dump skipped, instruction units count: 554
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.fitness.device.manager.report.DeviceActiveTracker.C19611.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C19611) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.device.manager.report.DeviceActiveTracker$syncHuamiStatisticData$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.device.manager.report.DeviceActiveTracker$syncHuamiStatisticData$1", f = "DeviceActiveTracker.kt", i = {0, 0}, l = {551}, m = "invokeSuspend", n = {"deviceModel", "huamiApiCaller"}, s = {"L$0", "L$1"})
    @SourceDebugExtension({"SMAP\nDeviceActiveTracker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeviceActiveTracker.kt\ncom/xiaomi/fitness/device/manager/report/DeviceActiveTracker$syncHuamiStatisticData$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,592:1\n1863#2,2:593\n1863#2,2:595\n*S KotlinDebug\n*F\n+ 1 DeviceActiveTracker.kt\ncom/xiaomi/fitness/device/manager/report/DeviceActiveTracker$syncHuamiStatisticData$1\n*L\n543#1:593,2\n550#1:595,2\n*E\n"})
    public static final class C19621 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;

        public C19621(Continuation<? super C19621> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C19621(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            HuamiApiCaller huaMiApiCaller;
            WearableDeviceModel wearableDeviceModel;
            Iterator it;
            HuamiApiCaller huamiApiCaller;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                WearableDeviceManager.Companion companion = WearableDeviceManager.INSTANCE;
                WearableDeviceModel wearableDeviceModel2 = (WearableDeviceModel) DeviceManagerExtKt.getInstance(companion).getCurrentDeviceModel();
                if (wearableDeviceModel2 != null && (huaMiApiCaller = DeviceManagerExtKt.getInstance(companion).getHuaMiApiCaller(DeviceModelExtKt.getMac(wearableDeviceModel2))) != null) {
                    List<byte[]> listSyncStatisticData = huaMiApiCaller.syncStatisticData();
                    if (listSyncStatisticData.isEmpty()) {
                        return Unit.INSTANCE;
                    }
                    ArrayList arrayList = new ArrayList();
                    if (!listSyncStatisticData.isEmpty()) {
                        Iterator<T> it2 = listSyncStatisticData.iterator();
                        while (it2.hasNext()) {
                            String strEncodeToString = Base64.encodeToString((byte[]) it2.next(), 0);
                            Intrinsics.checkNotNull(strEncodeToString);
                            arrayList.add(strEncodeToString);
                        }
                    }
                    Iterator it3 = CollectionsKt___CollectionsKt.chunked(arrayList, 10).iterator();
                    wearableDeviceModel = wearableDeviceModel2;
                    it = it3;
                    huamiApiCaller = huaMiApiCaller;
                }
                return Unit.INSTANCE;
            }
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = (Iterator) this.L$2;
            huamiApiCaller = (HuamiApiCaller) this.L$1;
            wearableDeviceModel = (WearableDeviceModel) this.L$0;
            ResultKt.throwOnFailure(obj);
            while (it.hasNext()) {
                List list = (List) it.next();
                DeviceActiveTracker deviceActiveTracker = DeviceActiveTracker.INSTANCE;
                this.L$0 = wearableDeviceModel;
                this.L$1 = huamiApiCaller;
                this.L$2 = it;
                this.label = 1;
                if (deviceActiveTracker.upHuamiTrackData(wearableDeviceModel, huamiApiCaller, list, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C19621) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    private DeviceActiveTracker() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:19:0x0085 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:22:0x0095  */
    /* JADX WARN: Code duplicated, block: B:25:0x009f  */
    /* JADX WARN: Code duplicated, block: B:27:0x00af A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0083 -> B:20:0x0086). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:15:0x0035
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object deleteDeviceRecordDatabase(java.util.ArrayList<com.xiaomi.fitness.device.manager.export.bean.DeviceRecord> r13, kotlin.coroutines.Continuation<? super kotlin.Unit> r14) {
        /*
            r12 = this;
            boolean r0 = r14 instanceof com.xiaomi.fitness.device.manager.report.DeviceActiveTracker.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r14
            com.xiaomi.fitness.device.manager.report.DeviceActiveTracker$deleteDeviceRecordDatabase$1 r0 = (com.xiaomi.fitness.device.manager.report.DeviceActiveTracker.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.xiaomi.fitness.device.manager.report.DeviceActiveTracker$deleteDeviceRecordDatabase$1 r0 = new com.xiaomi.fitness.device.manager.report.DeviceActiveTracker$deleteDeviceRecordDatabase$1
            r0.<init>(r14)
        L18:
            java.lang.Object r14 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L41
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            kotlin.ResultKt.throwOnFailure(r14)
            goto Lb0
        L2d:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L35:
            int r13 = r0.I$1
            int r2 = r0.I$0
            java.lang.Object r5 = r0.L$0
            java.util.List r5 = (java.util.List) r5
            kotlin.ResultKt.throwOnFailure(r14)
            goto L86
        L41:
            kotlin.ResultKt.throwOnFailure(r14)
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            r2 = 0
            java.lang.Object r2 = r13.get(r2)
            com.xiaomi.fitness.device.manager.export.bean.DeviceRecord r2 = (com.xiaomi.fitness.device.manager.export.bean.DeviceRecord) r2
            int r2 = r2.getDeviceRecordId()
            int r5 = r13.size()
            int r5 = r5 - r4
            java.lang.Object r13 = r13.get(r5)
            com.xiaomi.fitness.device.manager.export.bean.DeviceRecord r13 = (com.xiaomi.fitness.device.manager.export.bean.DeviceRecord) r13
            int r13 = r13.getDeviceRecordId()
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r5 = r14
        L69:
            com.xiaomi.fitness.device.manager.report.DeviceRecordReport r6 = new com.xiaomi.fitness.device.manager.report.DeviceRecordReport
            r6.<init>()
            int r10 = r5.size()
            r0.L$0 = r5
            r0.I$0 = r2
            r0.I$1 = r13
            r0.label = r4
            r9 = 500(0x1f4, float:7.0E-43)
            r7 = r2
            r8 = r13
            r11 = r0
            java.lang.Object r14 = r6.queryRecordByDeviceId(r7, r8, r9, r10, r11)
            if (r14 != r1) goto L86
            return r1
        L86:
            java.util.Collection r14 = (java.util.Collection) r14
            java.util.List r14 = kotlin.collections.CollectionsKt.toMutableList(r14)
            java.util.Collection r14 = (java.util.Collection) r14
            boolean r6 = r14.isEmpty()
            r6 = r6 ^ r4
            if (r6 == 0) goto L98
            r5.addAll(r14)
        L98:
            boolean r14 = r14.isEmpty()
            r14 = r14 ^ r4
            if (r14 != 0) goto L69
            com.xiaomi.fitness.device.manager.report.DeviceRecordReport r13 = new com.xiaomi.fitness.device.manager.report.DeviceRecordReport
            r13.<init>()
            r14 = 0
            r0.L$0 = r14
            r0.label = r3
            java.lang.Object r13 = r13.deleteDeviceRecordList(r5, r0)
            if (r13 != r1) goto Lb0
            return r1
        Lb0:
            kotlin.Unit r13 = kotlin.Unit.INSTANCE
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.fitness.device.manager.report.DeviceActiveTracker.deleteDeviceRecordDatabase(java.util.ArrayList, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit foundDeviceByScanBluetooth$lambda$10(final FoundDeviceCallback block, SearchCallback searchCallback) {
        Intrinsics.checkNotNullParameter(block, "$block");
        Intrinsics.checkNotNullParameter(searchCallback, "<this>");
        searchCallback.setOnFound(new Function1() { // from class: a16
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DeviceActiveTracker.foundDeviceByScanBluetooth$lambda$10$lambda$7(block, (BleDevice) obj);
            }
        });
        searchCallback.setOnFailed(new Function1() { // from class: b16
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DeviceActiveTracker.foundDeviceByScanBluetooth$lambda$10$lambda$8(block, ((Integer) obj).intValue());
            }
        });
        searchCallback.setOnStop(new Function0() { // from class: c16
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DeviceActiveTracker.foundDeviceByScanBluetooth$lambda$10$lambda$9(block);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit foundDeviceByScanBluetooth$lambda$10$lambda$7(final FoundDeviceCallback block, final BleDevice device) {
        Intrinsics.checkNotNullParameter(block, "$block");
        Intrinsics.checkNotNullParameter(device, "device");
        Logger.i(TAG, "scan device " + device);
        if (device.getProductId() == 0) {
            Logger.i(device + " is invalid ble device", new Object[0]);
        } else {
            final WearableProduct wearableProduct = (WearableProduct) DeviceManagerExtKt.getInstance(WearableProductManager.INSTANCE).getProductByModel(device.getModel());
            if (wearableProduct != null) {
                Logger.e(TAG, "onFound " + device.getAddress());
                ExecutorHelper.INSTANCE.runInMain(new Runnable() { // from class: w06
                    @Override // java.lang.Runnable
                    public final void run() {
                        DeviceActiveTracker.foundDeviceByScanBluetooth$lambda$10$lambda$7$lambda$6(wearableProduct, device, block);
                    }
                });
            } else {
                Logger.e(TAG, "onFound " + device.getAddress() + " product is null");
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void foundDeviceByScanBluetooth$lambda$10$lambda$7$lambda$6(WearableProduct wearableProduct, BleDevice device, FoundDeviceCallback block) {
        Intrinsics.checkNotNullParameter(device, "$device");
        Intrinsics.checkNotNullParameter(block, "$block");
        ScannedDeviceInfo scannedDeviceInfo = new ScannedDeviceInfo(device, DeviceExtKt.toDeviceInfo(wearableProduct), null, 4, null);
        if (scannedDeviceInfo.isEarPhone()) {
            Logger.i(TAG, "foundDeviceByScanBluetooth isEarPhone,and stop search");
            mScanManager.stopSearch();
            block.getOnFound().invoke2(scannedDeviceInfo);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit foundDeviceByScanBluetooth$lambda$10$lambda$8(FoundDeviceCallback block, int i) {
        Intrinsics.checkNotNullParameter(block, "$block");
        com.xiaomi.fit.device.extensions.DeviceModelExtKt.loge("fail to scan, code=" + i);
        mScanManager.stopSearch();
        block.getOnFailed();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit foundDeviceByScanBluetooth$lambda$10$lambda$9(FoundDeviceCallback block) {
        Intrinsics.checkNotNullParameter(block, "$block");
        com.xiaomi.fit.device.extensions.DeviceModelExtKt.loge("bluetooth stop scan");
        mScanManager.stopSearch();
        block.getOnStop();
        return Unit.INSTANCE;
    }

    private final DeviceRequest getMDeviceRequest() {
        return (DeviceRequest) mDeviceRequest.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object getTimeOutDeviceRecord(Continuation<? super List<DeviceRecord>> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new AnonymousClass2(null), continuation);
    }

    private final void handleDeviceRecordDataFromDatabase(DeviceActive deviceActive, EventData eventData, String did) {
        ScopeExtKt.scopeNet(Dispatchers.getIO(), new C19611(did, eventData, deviceActive, null)).m503catch(new Function2() { // from class: d16
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return DeviceActiveTracker.handleDeviceRecordDataFromDatabase$lambda$5((AndroidScope) obj, (Throwable) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit handleDeviceRecordDataFromDatabase$lambda$5(AndroidScope androidScope, Throwable it) {
        Intrinsics.checkNotNullParameter(androidScope, "$this$catch");
        Intrinsics.checkNotNullParameter(it, "it");
        mSyncFlag = false;
        return Unit.INSTANCE;
    }

    private final boolean isMatchesNumber(String str) {
        return new Regex("-?\\d+(\\.\\d+)?").matches(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceRequest mDeviceRequest_delegate$lambda$0() {
        return new DeviceRequest();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit mRunnable$lambda$11() {
        Logger.i(TAG, "reportConnectActive: " + mDid);
        INSTANCE.reportConnectActive(mDid);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onDisconnect$lambda$13(Function0 tmp0) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke();
    }

    private final void reportConnectActive(String did) {
        WearableDeviceModel wearableDeviceModel;
        if (did == null || (wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getDeviceModel(did)) == null) {
            return;
        }
        DeviceManagerExtKt.reportDeviceActive(wearableDeviceModel, DeviceActiveKt.DEVICE_CONNECT_ACTIVATION);
        if (wearableDeviceModel.getIsCurrent()) {
            mDid = did;
            Handler handler = mHandler;
            final Function0<Unit> function0 = mRunnable;
            handler.postDelayed(new Runnable() { // from class: v06
                @Override // java.lang.Runnable
                public final void run() {
                    DeviceActiveTracker.reportConnectActive$lambda$12(function0);
                }
            }, 86400000L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void reportConnectActive$lambda$12(Function0 tmp0) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit reportDeviceActive$lambda$1(String eventName, DeviceActiveResult it) {
        Intrinsics.checkNotNullParameter(eventName, "$eventName");
        Intrinsics.checkNotNullParameter(it, "it");
        com.xiaomi.fit.device.extensions.DeviceModelExtKt.logi("reportDeviceActive success " + it.getMessage());
        INSTANCE.reportResult(eventName, true, "");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit reportDeviceActive$lambda$2(String eventName, ApiException it) {
        Intrinsics.checkNotNullParameter(eventName, "$eventName");
        Intrinsics.checkNotNullParameter(it, "it");
        com.xiaomi.fit.device.extensions.DeviceModelExtKt.logi("reportDeviceActive fail");
        INSTANCE.reportResult(eventName, false, String.valueOf(it.getMessage()));
        it.printStackTrace();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit reportDeviceActive$lambda$4$lambda$3(WearableDeviceModel it, String sku, String version) {
        Intrinsics.checkNotNullParameter(it, "$it");
        Intrinsics.checkNotNullParameter(sku, "$sku");
        Intrinsics.checkNotNullParameter(version, "version");
        String name = DeviceModelExtKt.getName(it);
        String subcategory = it.getProduct().getSubcategory();
        String str = subcategory == null ? "" : subcategory;
        String did = it.getDid();
        String model = DeviceModelExtKt.getModel(it);
        String sn = it.getDeviceInfo().getSn();
        INSTANCE.handleDeviceRecordDataFromDatabase(new DeviceActive(null, xpd.b(new DeviceInfoData(name, str, did, sn == null ? "" : sn, sku, model, version)), null, null, null, 29, null), new EventData(0, null, null, null, 15, null), it.getDid());
        return Unit.INSTANCE;
    }

    private final void reportResult(String name, boolean result, String reason) {
        try {
            OneTrackExtKt.getInstance(IOnetrack.INSTANCE).reportData(new OneTrackStatBean(RelativeCareConstants.RELATIVE_CARE_EVENT_V3, "56.45.1.1.19264"), "name", name, "result", Boolean.valueOf(result), "error_info", reason);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object reqDeviceActiveArray(DeviceActive deviceActive, Continuation<? super DeviceActiveResult> continuation) {
        com.xiaomi.fit.device.extensions.DeviceModelExtKt.logi(" reqDeviceActiveArray is " + (deviceActive != null ? deviceActive.getEventData() : null));
        return getMDeviceRequest().deviceActiveArray(deviceActive, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void splitDeviceRecordData(int index, List<DeviceRecord> deviceRecord, JsonArray jsonArray, EventData eventData) {
        String deviceRecordValue = deviceRecord.get(index).getDeviceRecordValue();
        List listSplit$default = deviceRecordValue != null ? StringsKt__StringsKt.split$default((CharSequence) deviceRecordValue, new String[]{","}, false, 0, 6, (Object) null) : null;
        if (jsonArray.size() < mOnceReportDeviceRecordSize) {
            List list = listSplit$default;
            if (list == null || list.isEmpty()) {
                Logger.i(TAG, "recordValue == null ? strs empty : ");
                return;
            }
            if (listSplit$default.size() >= 4 && Intrinsics.areEqual(listSplit$default.get(0), "1") && isMatchesNumber(StringsKt__StringsJVMKt.replace$default((String) listSplit$default.get(1), " ", "", false, 4, (Object) null)) && isMatchesNumber(StringsKt__StringsJVMKt.replace$default((String) listSplit$default.get(2), " ", "", false, 4, (Object) null)) && isMatchesNumber(StringsKt__StringsJVMKt.replace$default((String) listSplit$default.get(3), " ", "", false, 4, (Object) null))) {
                eventData.setValue(new Gson().toJson(new MiwearActiveDataJson(Integer.parseInt(StringsKt__StringsJVMKt.replace$default((String) listSplit$default.get(1), " ", "", false, 4, (Object) null)), Integer.parseInt(StringsKt__StringsJVMKt.replace$default((String) listSplit$default.get(3), " ", "", false, 4, (Object) null)))));
                eventData.setKey("miwear_dev_active");
                eventData.setTime(Integer.parseInt(StringsKt__StringsJVMKt.replace$default((String) listSplit$default.get(2), " ", "", false, 4, (Object) null)));
            } else if (listSplit$default.size() >= 5 && Intrinsics.areEqual(listSplit$default.get(0), "2") && isMatchesNumber(StringsKt__StringsJVMKt.replace$default((String) listSplit$default.get(2), " ", "", false, 4, (Object) null)) && isMatchesNumber(StringsKt__StringsJVMKt.replace$default((String) listSplit$default.get(3), " ", "", false, 4, (Object) null)) && isMatchesNumber(StringsKt__StringsJVMKt.replace$default((String) listSplit$default.get(4), " ", "", false, 4, (Object) null))) {
                eventData.setValue(new Gson().toJson(new MiwearUsageDataJson((String) listSplit$default.get(1), Integer.parseInt(StringsKt__StringsJVMKt.replace$default((String) listSplit$default.get(3), " ", "", false, 4, (Object) null)), Integer.parseInt(StringsKt__StringsJVMKt.replace$default((String) listSplit$default.get(4), " ", "", false, 4, (Object) null)))));
                eventData.setKey("miwear_dev_app_usage");
                eventData.setTime(Integer.parseInt(StringsKt__StringsJVMKt.replace$default((String) listSplit$default.get(2), " ", "", false, 4, (Object) null)));
            } else {
                eventData.setKey((String) listSplit$default.get(0));
            }
            eventData.setExtra(xpd.a(new AppVersionBean(null, 1, null)));
            new JsonObject();
            jsonArray.add(xpd.b(new EventData(eventData.getTime(), eventData.getKey(), eventData.getValue(), eventData.getExtra())));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object upHuamiTrackData(WearableDeviceModel wearableDeviceModel, HuamiApiCaller huamiApiCaller, List<String> list, Continuation<? super Unit> continuation) {
        String[] strArr = (String[]) list.toArray(new String[0]);
        String string = Arrays.toString(strArr);
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        Logger.i(TAG, "syncHuamiStatisticData defaultEncodeArray = " + string);
        String json = new Gson().toJson(strArr);
        Logger.i(TAG, "syncHuamiStatisticData defaultEncodeJson = " + json);
        Intrinsics.checkNotNull(json);
        byte[] bytes = json.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        String strEncodeToString = Base64.encodeToString(g1s.a(bytes), 8);
        String did = wearableDeviceModel.getDid();
        String sn = wearableDeviceModel.getDeviceInfo().getSn();
        String str = sn == null ? "" : sn;
        String model = DeviceModelExtKt.getModel(wearableDeviceModel);
        String firmwareVersion = wearableDeviceModel.getDeviceInfo().getFirmwareVersion();
        String str2 = firmwareVersion == null ? "" : firmwareVersion;
        DeviceInfoExt deviceInfo = huamiApiCaller.getDeviceInfo();
        String strValueOf = String.valueOf(deviceInfo != null ? Boxing.boxInt(deviceInfo.getDeviceSource()) : null);
        String str3 = RomUtils.INSTANCE.getRomInfo().getName() + RegionManagerImpl.LOCALE_REPORTED_SERVER_SEPARATOR + Build.MODEL;
        String instanceID = OneTrackExtKt.getInstance(IOnetrack.INSTANCE).getInstanceID();
        String oaid = DeviceUtil.INSTANCE.getOAID(ApplicationExtKt.getApplication());
        String str4 = oaid == null ? "" : oaid;
        String str5 = RomUtils.isXiaomi() ? OneTrack.Param.MIUI : PluginPackageConstant.RN_DIR_A;
        String versionName = AppUtil.getVersionName();
        String strMD5 = MD5Util.MD5(AccountManagerExtKt.getInstance(UserInfoManager.INSTANCE).getUserId());
        Intrinsics.checkNotNull(strEncodeToString);
        Object objUpHuamiTrackData = getMDeviceRequest().upHuamiTrackData(new HuamiTrackUpData(did, str, model, str2, strValueOf, str3, instanceID, str4, str5, versionName, strMD5, strEncodeToString, 0), continuation);
        return objUpHuamiTrackData == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objUpHuamiTrackData : Unit.INSTANCE;
    }

    @NotNull
    public final String compressByZlib(@NotNull JsonArray deviceRecordJsonArray) {
        Intrinsics.checkNotNullParameter(deviceRecordJsonArray, "deviceRecordJsonArray");
        Logger.d(TAG, "compressByZlib is " + deviceRecordJsonArray);
        String string = deviceRecordJsonArray.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        byte[] bytes = string.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        String strEncodeToString = Base64.encodeToString(g1s.a(bytes), 8);
        Intrinsics.checkNotNull(strEncodeToString);
        return strEncodeToString;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.xiaomi.fitness.device.manager.report.DeviceTracker
    @Nullable
    public Object deleteDeviceRecordFromDatabaseTimeout(@NotNull Continuation<? super Boolean> continuation) {
        C19601 c19601;
        if (continuation instanceof C19601) {
            c19601 = (C19601) continuation;
            int i = c19601.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c19601.label = i - Integer.MIN_VALUE;
            } else {
                c19601 = new C19601(continuation);
            }
        } else {
            c19601 = new C19601(continuation);
        }
        Object timeOutDeviceRecord = c19601.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c19601.label;
        if (i2 != 0) {
            if (i2 == 1) {
                ResultKt.throwOnFailure(timeOutDeviceRecord);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(timeOutDeviceRecord);
            }
            return Boxing.boxBoolean(true);
        }
        ResultKt.throwOnFailure(timeOutDeviceRecord);
        c19601.label = 1;
        timeOutDeviceRecord = getTimeOutDeviceRecord(c19601);
        if (timeOutDeviceRecord == coroutine_suspended) {
            return coroutine_suspended;
        }
        List<DeviceRecord> list = (List) timeOutDeviceRecord;
        Logger.i(TAG, "deleteDeviceRecordFromDatabaseTimeout deleteDeviceRecord size is " + list.size() + "}");
        DeviceRecordReport deviceRecordReport = new DeviceRecordReport();
        c19601.label = 2;
        if (deviceRecordReport.deleteDeviceRecordList(list, c19601) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Boxing.boxBoolean(true);
    }

    @Override // com.xiaomi.fitness.device.manager.report.DeviceTracker
    public void foundDeviceByScanBluetooth(@NotNull List<String> namePrefixList, @Nullable List<Integer> wearProductIdList, @Nullable List<Integer> localProductIdList, @NotNull Function1<? super FoundDeviceCallback, Unit> callback) {
        Intrinsics.checkNotNullParameter(namePrefixList, "namePrefixList");
        Intrinsics.checkNotNullParameter(callback, "callback");
        final FoundDeviceCallback foundDeviceCallback = new FoundDeviceCallback();
        callback.invoke2(foundDeviceCallback);
        Function1<? super SearchCallback, Unit> function1 = new Function1() { // from class: x06
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DeviceActiveTracker.foundDeviceByScanBluetooth$lambda$10(foundDeviceCallback, (SearchCallback) obj);
            }
        };
        Logger.i(TAG, "foundDeviceByScanBluetooth namePrefixList = " + namePrefixList);
        mScanManager.searchBleByNamePrefixOrMiBeaconOnlyWear(namePrefixList, wearProductIdList, localProductIdList, function1);
    }

    @NotNull
    public final ScanManager getMScanManager() {
        return mScanManager;
    }

    @NotNull
    public final DeviceActiveRequest getRequest() {
        return request;
    }

    @Override // com.xiaomi.fitness.device.manager.h
    public void onBind(@Nullable String did, boolean isRebind) {
    }

    @Override // com.xiaomi.fitness.device.manager.h
    public void onConnectFailure(@Nullable String did, int errorCode, int retryTimes) {
    }

    @Override // com.xiaomi.fitness.device.manager.h
    public void onConnectStart(@Nullable String did) {
    }

    @Override // com.xiaomi.fitness.device.manager.h
    public void onConnectSuccess(@Nullable String did) {
        reportConnectActive(did);
    }

    @Override // com.xiaomi.fitness.device.manager.h
    public void onDestroy(@Nullable String did, boolean isRemoved) {
    }

    @Override // com.xiaomi.fitness.device.manager.h
    public void onDisconnect(@Nullable String did) {
        WearableDeviceModel wearableDeviceModel;
        if (did == null || (wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getDeviceModel(did)) == null || !wearableDeviceModel.getIsCurrent()) {
            return;
        }
        Handler handler = mHandler;
        final Function0<Unit> function0 = mRunnable;
        handler.removeCallbacks(new Runnable() { // from class: t06
            @Override // java.lang.Runnable
            public final void run() {
                DeviceActiveTracker.onDisconnect$lambda$13(function0);
            }
        });
        mDid = null;
    }

    @Override // com.xiaomi.fitness.device.manager.h
    public void onInIt(@Nullable String did, boolean isReadded) {
    }

    @Override // com.xiaomi.fitness.device.manager.h
    public void onSpecificDeviceConnectFailure(@Nullable String did, @Nullable String model, int errorCode) {
    }

    @Override // com.xiaomi.fitness.device.manager.h
    public void onSpecificDeviceConnectStart(@Nullable String did, @Nullable String model) {
    }

    @Override // com.xiaomi.fitness.device.manager.h
    public void onSpecificDeviceConnectSuccess(@Nullable String did, @Nullable String model) {
    }

    @Override // com.xiaomi.fitness.device.manager.h
    public void onSpecificDeviceDisconnect(@Nullable String did, @Nullable String model) {
    }

    @Override // com.xiaomi.fitness.device.manager.report.DeviceTracker
    public void reportBatteryValue(@Nullable String deviceModel, @Nullable String deviceVersion, int battery, @Nullable String info) {
        if (deviceModel == null) {
            return;
        }
        IOnetrack oneTrackExtKt = OneTrackExtKt.getInstance(IOnetrack.INSTANCE);
        OneTrackStatBean oneTrackStatBean = new OneTrackStatBean("c_user_profile_v3", "56.49.1.1.20869");
        Object[] objArr = new Object[8];
        objArr[0] = "device_model";
        objArr[1] = deviceModel;
        objArr[2] = "device_version";
        if (deviceVersion == null) {
            deviceVersion = "";
        }
        objArr[3] = deviceVersion;
        objArr[4] = "charge_per";
        objArr[5] = Integer.valueOf(battery);
        objArr[6] = "charge_info";
        if (info == null) {
            info = "";
        }
        objArr[7] = info;
        oneTrackExtKt.reportData(oneTrackStatBean, objArr);
    }

    @Override // com.xiaomi.fitness.device.manager.report.DeviceTracker
    public void reportDeviceActive(@NotNull final String eventName, @NotNull DeviceActiveBean eventValue) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        Intrinsics.checkNotNullParameter(eventValue, "eventValue");
        com.xiaomi.fit.device.extensions.DeviceModelExtKt.logi("reportDeviceActive() called with: eventName = " + eventName + ", eventValue = " + eventValue);
        if (AccountManagerExtKt.getInstance(AccountManager.INSTANCE).isLogin()) {
            getMDeviceRequest().deviceActive(eventName, eventValue, new Function1() { // from class: y06
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return DeviceActiveTracker.reportDeviceActive$lambda$1(eventName, (DeviceActiveResult) obj);
                }
            }, new Function1() { // from class: z06
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return DeviceActiveTracker.reportDeviceActive$lambda$2(eventName, (ApiException) obj);
                }
            });
        } else {
            com.xiaomi.fit.device.extensions.DeviceModelExtKt.logi("reportDeviceActive no login, return");
        }
    }

    @Override // com.xiaomi.fitness.device.manager.report.DeviceTracker
    @Nullable
    public Object saveDeviceRecordToDatabase(@NotNull List<DeviceRecord> list, @NotNull Continuation<? super Unit> continuation) {
        Object objSaveAllDeviceRecord = new DeviceRecordReport().saveAllDeviceRecord(list, continuation);
        return objSaveAllDeviceRecord == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objSaveAllDeviceRecord : Unit.INSTANCE;
    }

    public final void syncHuamiStatisticData() {
        ScopeExtKt.scopeNet(Dispatchers.getIO(), new C19621(null));
    }

    @Override // com.xiaomi.fitness.device.manager.report.DeviceTracker
    public void reportDeviceActive(@Nullable String firmwareVersion) {
        final String strValueOf;
        DeviceInfoExt deviceInfo;
        if (mSyncFlag) {
            Logger.i(TAG, "reportDeviceActive is doing");
            return;
        }
        mSyncFlag = true;
        WearableDeviceManager.Companion companion = WearableDeviceManager.INSTANCE;
        final WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(companion).getCurrentDeviceModel();
        if (wearableDeviceModel != null) {
            if (DeviceModelExtKt.isHuaMi(wearableDeviceModel)) {
                HuamiApiCaller huaMiApiCaller = DeviceManagerExtKt.getInstance(companion).getHuaMiApiCaller(DeviceModelExtKt.getMac(wearableDeviceModel));
                strValueOf = String.valueOf((huaMiApiCaller == null || (deviceInfo = huaMiApiCaller.getDeviceInfo()) == null) ? null : Integer.valueOf(deviceInfo.getDeviceSource()));
            } else {
                strValueOf = "";
            }
            Function1 function1 = new Function1() { // from class: e16
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return DeviceActiveTracker.reportDeviceActive$lambda$4$lambda$3(wearableDeviceModel, strValueOf, (String) obj);
                }
            };
            if (firmwareVersion == null) {
                firmwareVersion = "";
            }
            function1.invoke2(firmwareVersion);
        }
    }
}
