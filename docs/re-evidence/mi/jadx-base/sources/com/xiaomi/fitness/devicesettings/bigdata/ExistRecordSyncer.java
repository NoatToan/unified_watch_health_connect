package com.xiaomi.fitness.devicesettings.bigdata;

import com.facebook.react.bridge.BaseJavaModule;
import com.xiaomi.fitness.common.extensions.AnyExtKt;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.RomUtils;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.devicesettings.bluttooth.audio.util.RecorderSyncHelper;
import com.xiaomi.fitness.devicesettings.export.DeviceSettingCapabilityConstants;
import com.xiaomi.fitness.login.region.RegionManagerImpl;
import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.IndexedValue;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.FilesKt__UtilsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0005J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/bigdata/ExistRecordSyncer;", "", "<init>", "()V", "sTag", "", BaseJavaModule.METHOD_TYPE_SYNC, "", "did", "getRecordTime", "", "input", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ExistRecordSyncer {

    @NotNull
    public static final ExistRecordSyncer INSTANCE = new ExistRecordSyncer();

    @NotNull
    public static final String sTag = "ExistRecordSyncer";

    /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.bigdata.ExistRecordSyncer$sync$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.devicesettings.bigdata.ExistRecordSyncer$sync$1", f = "ExistRecordSyncer.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $did;
        final /* synthetic */ File[] $files;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(File[] fileArr, String str, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$files = fileArr;
            this.$did = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$files, this.$did, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            int length;
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            for (IndexedValue indexedValue : ArraysKt___ArraysKt.withIndex(this.$files)) {
                indexedValue.component1();
                File file = (File) indexedValue.component2();
                try {
                    Logger.i(ExistRecordSyncer.sTag, "sync file " + file.getPath());
                    String name = file.getName();
                    Intrinsics.checkNotNull(name);
                    if (StringsKt__StringsKt.contains$default((CharSequence) name, (CharSequence) "_(", false, 2, (Object) null)) {
                        Intrinsics.checkNotNull(name);
                        length = StringsKt__StringsKt.indexOf$default((CharSequence) name, "_(", 0, false, 6, (Object) null);
                    } else {
                        Intrinsics.checkNotNull(name);
                        if (StringsKt__StringsKt.contains$default((CharSequence) name, (CharSequence) ".", false, 2, (Object) null)) {
                            Intrinsics.checkNotNull(name);
                            length = StringsKt__StringsKt.lastIndexOf$default((CharSequence) name, ".", 0, false, 6, (Object) null);
                        } else {
                            length = name.length();
                        }
                    }
                    Intrinsics.checkNotNull(name);
                    String strSubstring = name.substring(0, length);
                    Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                    SyncFileSave syncFileSave = SyncFileSave.INSTANCE;
                    String dateTime = syncFileSave.formatDateTime(strSubstring);
                    Intrinsics.checkNotNull(name);
                    String strSubstring2 = name.substring(length);
                    Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
                    long recordTime = syncFileSave.getRecordTime(strSubstring);
                    File file2 = new File(ApplicationExtKt.getApplication().getExternalFilesDir(RecordConstant.RECORD_SYNC_DIR + this.$did), StringsKt__StringsJVMKt.replace$default(dateTime + strSubstring2, RegionManagerImpl.LOCALE_REPORTED_SERVER_SEPARATOR, "", false, 4, (Object) null));
                    Intrinsics.checkNotNull(file);
                    FilesKt__UtilsKt.copyTo$default(file, file2, true, 0, 4, null);
                    RecorderSyncHelper.INSTANCE.insertRecorderDb(file2.getPath(), RecordConstant.RECORD_SAVE_DIR + this.$did, recordTime, 0);
                    Boxing.boxBoolean(file.delete());
                } catch (Exception e) {
                    Logger.e(ExistRecordSyncer.sTag, "sync exist file error " + e.getMessage());
                }
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    private ExistRecordSyncer() {
    }

    public final long getRecordTime(@NotNull String input) throws ParseException {
        Intrinsics.checkNotNullParameter(input, "input");
        Date date = new SimpleDateFormat("yyyy年M月d日_HH:mm", Locale.getDefault()).parse(input);
        return date != null ? date.getTime() : System.currentTimeMillis();
    }

    public final void sync(@NotNull String did) {
        File[] fileArrListFiles;
        Intrinsics.checkNotNullParameter(did, "did");
        if (RomUtils.INSTANCE.isAtLeastHyperOS2(ApplicationExtKt.getApplication())) {
            boolean z = (DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getDeviceCapabilityV2(did) & 524288) != 0;
            Logger.i(sTag, "isSupportSyncRecord " + z);
            if (z) {
                try {
                    if (DeviceSettingCapabilityConstants.INSTANCE.isSupportRecorderSync()) {
                        File externalFilesDir = ApplicationExtKt.getApplication().getExternalFilesDir(RecordConstant.RECORD_SAVE_DIR + did);
                        if (externalFilesDir == null || !externalFilesDir.exists() || (fileArrListFiles = externalFilesDir.listFiles()) == null) {
                            return;
                        }
                        AnyExtKt.io$default(null, new AnonymousClass1(fileArrListFiles, did, null), 1, null);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                    Logger.i(sTag, "recorder not support " + e.getMessage());
                }
            }
        }
    }
}
