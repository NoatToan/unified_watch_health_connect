package com.xiaomi.fitness.device.contact.report;

import android.os.Handler;
import android.os.Looper;
import com.example.statistics.export.IOnetrack;
import com.example.statistics.export.OneTrackConstant;
import com.example.statistics.export.OneTrackExtKt;
import com.miui.circulate.api.service.CirculateDeviceInfo;
import com.xiaomi.fitness.common.extensions.AnyExtKt;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.FileUtils;
import com.xiaomi.fitness.device.contact.export.DeviceContact;
import com.xiaomi.fitness.device.contact.export.DeviceSyncExtKt;
import com.xiaomi.fitness.device.contact.export.OnSyncCallback;
import com.xiaomi.fitness.device.contact.export.SyncResult;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.DeviceTool;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.device.manager.export.bean.DeviceRecord;
import com.xiaomi.fitness.device.manager.export.bean.MiWearDeviceOtherEvent;
import com.xiaomi.fitness.device.manager.export.bean.WatchInfo;
import com.xiaomi.fitness.login.region.RegionManagerImpl;
import com.xiaomi.smarthome.framework.api.UserConfig;
import defpackage.eu6;
import defpackage.oxo;
import defpackage.s7r;
import defpackage.txo;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ$\u0010\u000f\u001a\u00020\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0011\u001a\u00020\u000e2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0005H\u0002J\f\u0010\u0013\u001a\u00020\u0014*\u00020\u0005H\u0002J*\u0010\u0015\u001a\u00020\u00142\b\u0010\u0010\u001a\u0004\u0018\u00010\u00052\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0005H\u0082@¢\u0006\u0002\u0010\u0016J(\u0010\u0017\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\b\u0010\u0012\u001a\u0004\u0018\u00010\u0005H\u0002J6\u0010\u001b\u001a\u00020\f2\b\u0010\u001c\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u001d\u001a\u00020\u00052\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082T¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lcom/xiaomi/fitness/device/contact/report/GetDeviceCSVFiles;", "", "<init>", "()V", "CMD_ONETRACK_STR", "", "TAG", "mHandle", "Landroid/os/Handler;", "MAX_LONG_DAYS", "", "sendUploadCsvFilesToApp", "", "deviceModel", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "uploadCsvToWebWithDeviceVersion", "did", "device", "firmwareVersion", "isMatchesNumber", "", "uploadCsvToWeb", "(Ljava/lang/String;Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateEvenRecordToOneTrack", "needUpdateOneTrackList", "", "Lcom/xiaomi/fitness/device/manager/export/bean/DeviceRecord;", "getDeviceRecordByReadCSV", "deviceDid", "path", "needRestoreDatabaseRestoreList", "device-contact_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nGetDeviceCSVFiles.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GetDeviceCSVFiles.kt\ncom/xiaomi/fitness/device/contact/report/GetDeviceCSVFiles\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,347:1\n1863#2:348\n1864#2:350\n1#3:349\n*S KotlinDebug\n*F\n+ 1 GetDeviceCSVFiles.kt\ncom/xiaomi/fitness/device/contact/report/GetDeviceCSVFiles\n*L\n164#1:348\n164#1:350\n*E\n"})
public final class GetDeviceCSVFiles {

    @NotNull
    private static final String CMD_ONETRACK_STR = "onetrack";
    private static final int MAX_LONG_DAYS = 1209600;

    @NotNull
    private static final String TAG = "DeviceActiveTracker";

    @NotNull
    public static final GetDeviceCSVFiles INSTANCE = new GetDeviceCSVFiles();

    @NotNull
    private static final Handler mHandle = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: com.xiaomi.fitness.device.contact.report.GetDeviceCSVFiles$sendUploadCsvFilesToApp$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.device.contact.report.GetDeviceCSVFiles$sendUploadCsvFilesToApp$1", f = "GetDeviceCSVFiles.kt", i = {}, l = {54}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ WearableDeviceModel $deviceModel;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(WearableDeviceModel wearableDeviceModel, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$deviceModel = wearableDeviceModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$deviceModel, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                DeviceTool deviceManagerExtKt = DeviceManagerExtKt.getInstance(DeviceTool.INSTANCE);
                this.label = 1;
                obj = deviceManagerExtKt.deleteDeviceRecordFromDatabaseTimeout(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            Logger.d(GetDeviceCSVFiles.TAG, "sendUploadCsvFilesToApp deleteDeviceRecordFromDatabaseTimeout isRemove = " + ((Boolean) obj).booleanValue());
            s7r s7rVar = new s7r();
            s7rVar.e = 2;
            s7rVar.f = 80;
            txo txoVar = new txo();
            oxo oxoVar = new oxo();
            oxoVar.c = 2;
            txoVar.i0(oxoVar);
            s7rVar.c0(txoVar);
            DeviceContact deviceSyncExtKt = DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE);
            String did = this.$deviceModel.getDeviceInfo().getDid();
            final WearableDeviceModel wearableDeviceModel = this.$deviceModel;
            DeviceContact.DefaultImpls.call$default(deviceSyncExtKt, did, s7rVar, false, new OnSyncCallback() { // from class: com.xiaomi.fitness.device.contact.report.GetDeviceCSVFiles.sendUploadCsvFilesToApp.1.1
                @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
                public void onError(String did2, int type, int code) {
                    Logger.d(GetDeviceCSVFiles.TAG, "sendUploadCsvFilesToApp onError code " + code);
                }

                @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
                public void onSuccess(final String did2, int type, SyncResult result) {
                    Logger.d(GetDeviceCSVFiles.TAG, "sendUploadCsvFilesToApp onSuccess did " + did2 + ", result is " + result);
                    String firmwareVersion = DeviceModelExtKt.getFirmwareVersion(wearableDeviceModel);
                    if (firmwareVersion != null && firmwareVersion.length() != 0) {
                        GetDeviceCSVFiles.INSTANCE.uploadCsvToWebWithDeviceVersion(did2, wearableDeviceModel, firmwareVersion);
                    } else {
                        final WearableDeviceModel wearableDeviceModel2 = wearableDeviceModel;
                        wearableDeviceModel2.readWatchInfo(new eu6<WatchInfo>() { // from class: com.xiaomi.fitness.device.contact.report.GetDeviceCSVFiles$sendUploadCsvFilesToApp$1$1$onSuccess$1
                            @Override // defpackage.eu6
                            public void onError(int errorCode) {
                                GetDeviceCSVFiles.INSTANCE.uploadCsvToWebWithDeviceVersion(did2, wearableDeviceModel2, null);
                            }

                            @Override // defpackage.eu6
                            public void onResult(WatchInfo result2) {
                                Intrinsics.checkNotNullParameter(result2, "result");
                                GetDeviceCSVFiles.INSTANCE.uploadCsvToWebWithDeviceVersion(did2, wearableDeviceModel2, result2.getFirmwareVersion());
                            }
                        });
                    }
                }
            }, 0, 16, (Object) null);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.device.contact.report.GetDeviceCSVFiles$uploadCsvToWeb$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.device.contact.report.GetDeviceCSVFiles$uploadCsvToWeb$2", f = "GetDeviceCSVFiles.kt", i = {0, 0}, l = {147}, m = "invokeSuspend", n = {"needRestoreDatabaseRestoreList", "needUpdateOneTrackList"}, s = {"L$0", "L$1"})
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
        final /* synthetic */ WearableDeviceModel $deviceModel;
        final /* synthetic */ String $did;
        final /* synthetic */ String $firmwareVersion;
        Object L$0;
        Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(String str, WearableDeviceModel wearableDeviceModel, String str2, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$did = str;
            this.$deviceModel = wearableDeviceModel;
            this.$firmwareVersion = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.$did, this.$deviceModel, this.$firmwareVersion, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            List<DeviceRecord> arrayList;
            List list;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            boolean z = true;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                String str = "onetrack/" + this.$did + RegionManagerImpl.LOCALE_REPORTED_SERVER_SEPARATOR + DeviceModelExtKt.getModel(this.$deviceModel);
                File externalFilesDir = ApplicationExtKt.getApplication().getExternalFilesDir(str);
                if (!Intrinsics.areEqual(externalFilesDir != null ? Boxing.boxBoolean(externalFilesDir.exists()) : null, Boxing.boxBoolean(false))) {
                    List<String> fileList = FileUtils.INSTANCE.getFileList(str);
                    Logger.i(GetDeviceCSVFiles.TAG, "uploadCsvToWeb  ONE_TRACK folder file size=" + (fileList != null ? Boxing.boxInt(fileList.size()) : null));
                    List<String> list2 = fileList;
                    if (list2 != null && !list2.isEmpty()) {
                        arrayList = new ArrayList<>();
                        ArrayList arrayList2 = new ArrayList();
                        Iterator<String> it = fileList.iterator();
                        while (it.hasNext()) {
                            GetDeviceCSVFiles.INSTANCE.getDeviceRecordByReadCSV(this.$did, it.next(), arrayList, arrayList2);
                        }
                        GetDeviceCSVFiles.INSTANCE.updateEvenRecordToOneTrack(this.$deviceModel, arrayList2, this.$firmwareVersion);
                        DeviceTool deviceManagerExtKt = DeviceManagerExtKt.getInstance(DeviceTool.INSTANCE);
                        this.L$0 = arrayList;
                        this.L$1 = arrayList2;
                        this.label = 1;
                        if (deviceManagerExtKt.saveDeviceRecordToDatabase(arrayList, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        list = arrayList2;
                    }
                    return Boxing.boxBoolean(z);
                }
                z = false;
                return Boxing.boxBoolean(z);
            }
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            list = (List) this.L$1;
            arrayList = (List) this.L$0;
            ResultKt.throwOnFailure(obj);
            Logger.d(GetDeviceCSVFiles.TAG, "uploadCsvToWeb needRestoreDatabaseRestoreList size = " + arrayList.size() + ",needUpdateOneTrackList size = " + list.size());
            return Boxing.boxBoolean(z);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.device.contact.report.GetDeviceCSVFiles$uploadCsvToWebWithDeviceVersion$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.device.contact.report.GetDeviceCSVFiles$uploadCsvToWebWithDeviceVersion$1", f = "GetDeviceCSVFiles.kt", i = {}, l = {107}, m = "invokeSuspend", n = {}, s = {})
    public static final class C18921 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ WearableDeviceModel $device;
        final /* synthetic */ String $did;
        final /* synthetic */ String $firmwareVersion;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C18921(String str, WearableDeviceModel wearableDeviceModel, String str2, Continuation<? super C18921> continuation) {
            super(2, continuation);
            this.$did = str;
            this.$device = wearableDeviceModel;
            this.$firmwareVersion = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C18921(this.$did, this.$device, this.$firmwareVersion, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                GetDeviceCSVFiles getDeviceCSVFiles = GetDeviceCSVFiles.INSTANCE;
                String str = this.$did;
                WearableDeviceModel wearableDeviceModel = this.$device;
                String str2 = this.$firmwareVersion;
                this.label = 1;
                obj = getDeviceCSVFiles.uploadCsvToWeb(str, wearableDeviceModel, str2, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            boolean zBooleanValue = ((Boolean) obj).booleanValue();
            Logger.i(GetDeviceCSVFiles.TAG, "uploadCsvToWeb update " + zBooleanValue);
            if (zBooleanValue) {
                DeviceManagerExtKt.getInstance(DeviceTool.INSTANCE).reportDeviceActive(this.$firmwareVersion);
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C18921) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    private GetDeviceCSVFiles() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void getDeviceRecordByReadCSV(String deviceDid, String path, List<DeviceRecord> needRestoreDatabaseRestoreList, List<DeviceRecord> needUpdateOneTrackList) {
        File file = new File(path);
        if (file.exists()) {
            try {
                BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
                String line = bufferedReader.readLine();
                if (line == null) {
                    line = "";
                }
                for (String line2 = line; line2.length() > 0; line2 = bufferedReader.readLine()) {
                    try {
                        DeviceRecord deviceRecord = new DeviceRecord();
                        deviceRecord.setDid(deviceDid);
                        deviceRecord.setDeviceRecordValue(line2);
                        List listSplit$default = StringsKt__StringsKt.split$default((CharSequence) line2, new String[]{","}, false, 0, 6, (Object) null);
                        long j = 1000;
                        long jCurrentTimeMillis = System.currentTimeMillis() / j;
                        if (listSplit$default.isEmpty()) {
                            Logger.i(TAG, "getDeviceRecordByReadCSV recordLine empty");
                            break;
                        }
                        if (Intrinsics.areEqual(listSplit$default.get(0), "1")) {
                            deviceRecord.setRecord_time(System.currentTimeMillis() / j);
                            deviceRecord.setNeed_check(0);
                            needRestoreDatabaseRestoreList.add(deviceRecord);
                        } else if (listSplit$default.size() >= 5 && Intrinsics.areEqual(listSplit$default.get(0), "2") && isMatchesNumber(StringsKt__StringsJVMKt.replace$default((String) listSplit$default.get(2), " ", "", false, 4, (Object) null)) && jCurrentTimeMillis - Long.parseLong(StringsKt__StringsJVMKt.replace$default((String) listSplit$default.get(2), " ", "", false, 4, (Object) null)) <= 1209600) {
                            deviceRecord.setRecord_time(Long.parseLong(StringsKt__StringsJVMKt.replace$default((String) listSplit$default.get(2), " ", "", false, 4, (Object) null)));
                            deviceRecord.setNeed_check(1);
                            needRestoreDatabaseRestoreList.add(deviceRecord);
                        } else if (Intrinsics.areEqual(listSplit$default.get(0), "3")) {
                            deviceRecord.setNeed_check(listSplit$default.size() >= 10 ? 1 : 0);
                            if (isMatchesNumber(StringsKt__StringsJVMKt.replace$default((String) listSplit$default.get(2), " ", "", false, 4, (Object) null))) {
                                deviceRecord.setRecord_time(Long.parseLong(StringsKt__StringsJVMKt.replace$default((String) listSplit$default.get(2), " ", "", false, 4, (Object) null)));
                            }
                            needUpdateOneTrackList.add(deviceRecord);
                        } else if (Intrinsics.areEqual(listSplit$default.get(0), UserConfig.KEY_DEVICE_LITE_SORT_GROUP)) {
                            deviceRecord.setNeed_check(listSplit$default.size() >= 10 ? 1 : 0);
                            if (isMatchesNumber(StringsKt__StringsJVMKt.replace$default((String) listSplit$default.get(2), " ", "", false, 4, (Object) null))) {
                                deviceRecord.setRecord_time(Long.parseLong(StringsKt__StringsJVMKt.replace$default((String) listSplit$default.get(2), " ", "", false, 4, (Object) null)));
                            }
                            needUpdateOneTrackList.add(deviceRecord);
                        } else if (Intrinsics.areEqual(listSplit$default.get(0), "6")) {
                            deviceRecord.setNeed_check(listSplit$default.size() >= 10 ? 1 : 0);
                            if (isMatchesNumber(StringsKt__StringsJVMKt.replace$default((String) listSplit$default.get(2), " ", "", false, 4, (Object) null))) {
                                deviceRecord.setRecord_time(Long.parseLong(StringsKt__StringsJVMKt.replace$default((String) listSplit$default.get(2), " ", "", false, 4, (Object) null)));
                            }
                            needUpdateOneTrackList.add(deviceRecord);
                        }
                    } catch (Exception unused) {
                        Logger.i(TAG, "getDeviceRecordByReadCSV End");
                        bufferedReader.close();
                    }
                }
                Logger.i(TAG, "getDeviceRecordByReadCSV file is delete");
                file.delete();
                bufferedReader.close();
            } catch (Throwable th) {
                Logger.e(TAG, "getDeviceRecordByReadCSV Exception!", th);
            }
        }
    }

    private final boolean isMatchesNumber(String str) {
        return new Regex("-?\\d+(\\.\\d+)?").matches(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateEvenRecordToOneTrack(WearableDeviceModel deviceModel, List<DeviceRecord> needUpdateOneTrackList, String firmwareVersion) {
        int i;
        long j;
        int i2;
        long j2;
        int i3;
        long j3;
        Iterator<T> it = needUpdateOneTrackList.iterator();
        while (it.hasNext()) {
            String deviceRecordValue = ((DeviceRecord) it.next()).getDeviceRecordValue();
            List listSplit$default = deviceRecordValue != null ? StringsKt__StringsKt.split$default((CharSequence) deviceRecordValue, new String[]{","}, false, 0, 6, (Object) null) : null;
            List list = listSplit$default;
            if (list != null && !list.isEmpty()) {
                String str = "";
                if (list != null && !list.isEmpty() && listSplit$default.size() >= 10 && Intrinsics.areEqual(listSplit$default.get(0), "3")) {
                    String str2 = (String) listSplit$default.get(1);
                    if (((CharSequence) listSplit$default.get(2)).length() != 0 && INSTANCE.isMatchesNumber(StringsKt__StringsJVMKt.replace$default((String) listSplit$default.get(2), " ", "", false, 4, (Object) null))) {
                        j3 = Long.parseLong(StringsKt__StringsJVMKt.replace$default((String) listSplit$default.get(2), " ", "", false, 4, (Object) null));
                        i3 = 3;
                    } else {
                        i3 = 3;
                        j3 = 0;
                    }
                    int i4 = (((CharSequence) listSplit$default.get(i3)).length() != 0 && INSTANCE.isMatchesNumber(StringsKt__StringsJVMKt.replace$default((String) listSplit$default.get(i3), " ", "", false, 4, (Object) null))) ? Integer.parseInt(StringsKt__StringsJVMKt.replace$default((String) listSplit$default.get(3), " ", "", false, 4, (Object) null)) : 0;
                    CharSequence charSequence = (CharSequence) listSplit$default.get(4);
                    if (charSequence.length() == 0) {
                        charSequence = "none";
                    }
                    String str3 = (String) charSequence;
                    CharSequence charSequence2 = (CharSequence) listSplit$default.get(5);
                    if (charSequence2.length() == 0) {
                        charSequence2 = "none";
                    }
                    String str4 = (String) charSequence2;
                    CharSequence charSequence3 = (CharSequence) listSplit$default.get(6);
                    if (charSequence3.length() == 0) {
                        charSequence3 = "none";
                    }
                    String str5 = (String) charSequence3;
                    CharSequence charSequence4 = (CharSequence) listSplit$default.get(7);
                    if (charSequence4.length() == 0) {
                        charSequence4 = "none";
                    }
                    String str6 = (String) charSequence4;
                    CharSequence charSequence5 = (CharSequence) listSplit$default.get(8);
                    if (charSequence5.length() == 0) {
                        charSequence5 = "none";
                    }
                    String str7 = (String) charSequence5;
                    CharSequence charSequence6 = (CharSequence) listSplit$default.get(9);
                    MiWearDeviceOtherEvent miWearDeviceOtherEvent = new MiWearDeviceOtherEvent(str2, j3, i4, str3, str4, str5, str6, str7, (String) (charSequence6.length() != 0 ? charSequence6 : "none"));
                    IOnetrack oneTrackExtKt = OneTrackExtKt.getInstance(IOnetrack.INSTANCE);
                    Pair[] pairArr = new Pair[15];
                    pairArr[0] = TuplesKt.to("tip", "56.49.3.1.22520");
                    pairArr[1] = TuplesKt.to("device_did", deviceModel.getDid());
                    pairArr[2] = TuplesKt.to(CirculateDeviceInfo.DEVICE_SN, deviceModel.getDeviceInfo().getSn());
                    pairArr[3] = TuplesKt.to("device_model", DeviceModelExtKt.getModel(deviceModel));
                    pairArr[4] = TuplesKt.to("device_name", DeviceModelExtKt.getName(deviceModel));
                    if (firmwareVersion != null && firmwareVersion.length() != 0) {
                        str = firmwareVersion;
                    }
                    pairArr[5] = TuplesKt.to("device_version", str);
                    pairArr[6] = TuplesKt.to("name", miWearDeviceOtherEvent.getName());
                    pairArr[7] = TuplesKt.to("timestamp", Long.valueOf(miWearDeviceOtherEvent.getTimestamp()));
                    pairArr[8] = TuplesKt.to("duration_sec", Integer.valueOf(miWearDeviceOtherEvent.getDuration_sec()));
                    pairArr[9] = TuplesKt.to("miwear_5", miWearDeviceOtherEvent.getMiwear_5());
                    pairArr[10] = TuplesKt.to("miwear_6", miWearDeviceOtherEvent.getMiwear_6());
                    pairArr[11] = TuplesKt.to("miwear_7", miWearDeviceOtherEvent.getMiwear_7());
                    pairArr[12] = TuplesKt.to("miwear_8", miWearDeviceOtherEvent.getMiwear_8());
                    pairArr[13] = TuplesKt.to("miwear_9", miWearDeviceOtherEvent.getMiwear_9());
                    pairArr[14] = TuplesKt.to("miwear_10", miWearDeviceOtherEvent.getMiwear_10());
                    oneTrackExtKt.reportData(OneTrackConstant.EVENT_NAME_CONNECTIVITY_DEVICE, MapsKt__MapsKt.mapOf(pairArr));
                } else if ((!list.isEmpty()) && listSplit$default.size() >= 10 && Intrinsics.areEqual(listSplit$default.get(0), UserConfig.KEY_DEVICE_LITE_SORT_GROUP)) {
                    String str8 = (String) listSplit$default.get(1);
                    if (((CharSequence) listSplit$default.get(2)).length() != 0 && INSTANCE.isMatchesNumber(StringsKt__StringsJVMKt.replace$default((String) listSplit$default.get(2), " ", "", false, 4, (Object) null))) {
                        j2 = Long.parseLong(StringsKt__StringsJVMKt.replace$default((String) listSplit$default.get(2), " ", "", false, 4, (Object) null));
                        i2 = 3;
                    } else {
                        i2 = 3;
                        j2 = 0;
                    }
                    int i5 = (((CharSequence) listSplit$default.get(i2)).length() != 0 && INSTANCE.isMatchesNumber(StringsKt__StringsJVMKt.replace$default((String) listSplit$default.get(i2), " ", "", false, 4, (Object) null))) ? Integer.parseInt(StringsKt__StringsJVMKt.replace$default((String) listSplit$default.get(3), " ", "", false, 4, (Object) null)) : 0;
                    CharSequence charSequence7 = (CharSequence) listSplit$default.get(4);
                    if (charSequence7.length() == 0) {
                        charSequence7 = "none";
                    }
                    String str9 = (String) charSequence7;
                    CharSequence charSequence8 = (CharSequence) listSplit$default.get(5);
                    if (charSequence8.length() == 0) {
                        charSequence8 = "none";
                    }
                    String str10 = (String) charSequence8;
                    CharSequence charSequence9 = (CharSequence) listSplit$default.get(6);
                    if (charSequence9.length() == 0) {
                        charSequence9 = "none";
                    }
                    String str11 = (String) charSequence9;
                    CharSequence charSequence10 = (CharSequence) listSplit$default.get(7);
                    if (charSequence10.length() == 0) {
                        charSequence10 = "none";
                    }
                    String str12 = (String) charSequence10;
                    CharSequence charSequence11 = (CharSequence) listSplit$default.get(8);
                    if (charSequence11.length() == 0) {
                        charSequence11 = "none";
                    }
                    String str13 = (String) charSequence11;
                    CharSequence charSequence12 = (CharSequence) listSplit$default.get(9);
                    MiWearDeviceOtherEvent miWearDeviceOtherEvent2 = new MiWearDeviceOtherEvent(str8, j2, i5, str9, str10, str11, str12, str13, (String) (charSequence12.length() != 0 ? charSequence12 : "none"));
                    IOnetrack oneTrackExtKt2 = OneTrackExtKt.getInstance(IOnetrack.INSTANCE);
                    Pair[] pairArr2 = new Pair[15];
                    pairArr2[0] = TuplesKt.to("tip", "56.0.0.0.33609");
                    pairArr2[1] = TuplesKt.to("device_did", deviceModel.getDid());
                    pairArr2[2] = TuplesKt.to(CirculateDeviceInfo.DEVICE_SN, deviceModel.getDeviceInfo().getSn());
                    pairArr2[3] = TuplesKt.to("device_model", DeviceModelExtKt.getModel(deviceModel));
                    pairArr2[4] = TuplesKt.to("device_name", DeviceModelExtKt.getName(deviceModel));
                    if (firmwareVersion != null && firmwareVersion.length() != 0) {
                        str = firmwareVersion;
                    }
                    pairArr2[5] = TuplesKt.to("device_version", str);
                    pairArr2[6] = TuplesKt.to("name", miWearDeviceOtherEvent2.getName());
                    pairArr2[7] = TuplesKt.to("timestamp", Long.valueOf(miWearDeviceOtherEvent2.getTimestamp()));
                    pairArr2[8] = TuplesKt.to("duration_sec", Integer.valueOf(miWearDeviceOtherEvent2.getDuration_sec()));
                    pairArr2[9] = TuplesKt.to("miwear_5", miWearDeviceOtherEvent2.getMiwear_5());
                    pairArr2[10] = TuplesKt.to("miwear_6", miWearDeviceOtherEvent2.getMiwear_6());
                    pairArr2[11] = TuplesKt.to("miwear_7", miWearDeviceOtherEvent2.getMiwear_7());
                    pairArr2[12] = TuplesKt.to("miwear_8", miWearDeviceOtherEvent2.getMiwear_8());
                    pairArr2[13] = TuplesKt.to("miwear_9", miWearDeviceOtherEvent2.getMiwear_9());
                    pairArr2[14] = TuplesKt.to("miwear_10", miWearDeviceOtherEvent2.getMiwear_10());
                    oneTrackExtKt2.reportData(OneTrackConstant.EVENT_NAME_MIWEAR_DEV_POWER, MapsKt__MapsKt.mapOf(pairArr2));
                } else if ((!list.isEmpty()) && listSplit$default.size() >= 10 && Intrinsics.areEqual(listSplit$default.get(0), "6")) {
                    String str14 = (String) listSplit$default.get(1);
                    if (((CharSequence) listSplit$default.get(2)).length() != 0 && INSTANCE.isMatchesNumber(StringsKt__StringsJVMKt.replace$default((String) listSplit$default.get(2), " ", "", false, 4, (Object) null))) {
                        j = Long.parseLong(StringsKt__StringsJVMKt.replace$default((String) listSplit$default.get(2), " ", "", false, 4, (Object) null));
                        i = 3;
                    } else {
                        i = 3;
                        j = 0;
                    }
                    int i6 = (((CharSequence) listSplit$default.get(i)).length() != 0 && INSTANCE.isMatchesNumber(StringsKt__StringsJVMKt.replace$default((String) listSplit$default.get(i), " ", "", false, 4, (Object) null))) ? Integer.parseInt(StringsKt__StringsJVMKt.replace$default((String) listSplit$default.get(3), " ", "", false, 4, (Object) null)) : 0;
                    CharSequence charSequence13 = (CharSequence) listSplit$default.get(4);
                    if (charSequence13.length() == 0) {
                        charSequence13 = "none";
                    }
                    String str15 = (String) charSequence13;
                    CharSequence charSequence14 = (CharSequence) listSplit$default.get(5);
                    if (charSequence14.length() == 0) {
                        charSequence14 = "none";
                    }
                    String str16 = (String) charSequence14;
                    CharSequence charSequence15 = (CharSequence) listSplit$default.get(6);
                    if (charSequence15.length() == 0) {
                        charSequence15 = "none";
                    }
                    String str17 = (String) charSequence15;
                    CharSequence charSequence16 = (CharSequence) listSplit$default.get(7);
                    if (charSequence16.length() == 0) {
                        charSequence16 = "none";
                    }
                    String str18 = (String) charSequence16;
                    CharSequence charSequence17 = (CharSequence) listSplit$default.get(8);
                    if (charSequence17.length() == 0) {
                        charSequence17 = "none";
                    }
                    String str19 = (String) charSequence17;
                    CharSequence charSequence18 = (CharSequence) listSplit$default.get(9);
                    MiWearDeviceOtherEvent miWearDeviceOtherEvent3 = new MiWearDeviceOtherEvent(str14, j, i6, str15, str16, str17, str18, str19, (String) (charSequence18.length() != 0 ? charSequence18 : "none"));
                    Logger.i(TAG, "updateEvenRecordToOneTrack EVENT_NAME_MIWEAR_DEV_BLUETOOTH " + miWearDeviceOtherEvent3);
                    IOnetrack oneTrackExtKt3 = OneTrackExtKt.getInstance(IOnetrack.INSTANCE);
                    Pair[] pairArr3 = new Pair[15];
                    pairArr3[0] = TuplesKt.to("tip", "56.92.0.1.36456");
                    pairArr3[1] = TuplesKt.to("device_did", deviceModel.getDid());
                    pairArr3[2] = TuplesKt.to(CirculateDeviceInfo.DEVICE_SN, deviceModel.getDeviceInfo().getSn());
                    pairArr3[3] = TuplesKt.to("device_model", DeviceModelExtKt.getModel(deviceModel));
                    pairArr3[4] = TuplesKt.to("device_name", DeviceModelExtKt.getName(deviceModel));
                    if (firmwareVersion != null && firmwareVersion.length() != 0) {
                        str = firmwareVersion;
                    }
                    pairArr3[5] = TuplesKt.to("device_version", str);
                    pairArr3[6] = TuplesKt.to("name", miWearDeviceOtherEvent3.getName());
                    pairArr3[7] = TuplesKt.to("timestamp", Long.valueOf(miWearDeviceOtherEvent3.getTimestamp()));
                    pairArr3[8] = TuplesKt.to("duration_sec", Integer.valueOf(miWearDeviceOtherEvent3.getDuration_sec()));
                    pairArr3[9] = TuplesKt.to("miwear_5", miWearDeviceOtherEvent3.getMiwear_5());
                    pairArr3[10] = TuplesKt.to("miwear_6", miWearDeviceOtherEvent3.getMiwear_6());
                    pairArr3[11] = TuplesKt.to("miwear_7", miWearDeviceOtherEvent3.getMiwear_7());
                    pairArr3[12] = TuplesKt.to("miwear_8", miWearDeviceOtherEvent3.getMiwear_8());
                    pairArr3[13] = TuplesKt.to("miwear_9", miWearDeviceOtherEvent3.getMiwear_9());
                    pairArr3[14] = TuplesKt.to("miwear_10", miWearDeviceOtherEvent3.getMiwear_10());
                    oneTrackExtKt3.reportData(OneTrackConstant.EVENT_NAME_MIWEAR_DEV_BLUETOOTH, MapsKt__MapsKt.mapOf(pairArr3));
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object uploadCsvToWeb(String str, WearableDeviceModel wearableDeviceModel, String str2, Continuation<? super Boolean> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new AnonymousClass2(str, wearableDeviceModel, str2, null), continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void uploadCsvToWebWithDeviceVersion(String did, WearableDeviceModel device, String firmwareVersion) {
        AnyExtKt.io$default(null, new C18921(did, device, firmwareVersion, null), 1, null);
    }

    public final void sendUploadCsvFilesToApp(@NotNull WearableDeviceModel deviceModel) {
        Intrinsics.checkNotNullParameter(deviceModel, "deviceModel");
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (wearableDeviceModel == null || !wearableDeviceModel.getIsDeviceConnected()) {
            return;
        }
        AnyExtKt.io$default(null, new AnonymousClass1(wearableDeviceModel, null), 1, null);
    }
}
