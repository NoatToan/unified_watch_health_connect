package com.xiaomi.hm.health.device.recorder;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.huami.bluetooth.profile.channel.module.record.RecordModule;
import com.huami.devicerecorder.IRecorderDevice;
import com.huami.devicerecorder.model.RecordFile;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.device.event.HMDeviceConnectionEvent;
import de.greenrobot.event.EventBus;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.text.m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\b\b\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u0019\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0010\u0012\u0006\u0010\u001c\u001a\u00020\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0013\u0010\u0003\u001a\u00020\u0002H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\u0004J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016J\u0010\u0010\f\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016J\u000e\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rR\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0011R\u0016\u0010\u0015\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0017\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0014R\u001c\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\b0\u00188\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006 "}, d2 = {"Lcom/xiaomi/hm/health/device/recorder/RecordDevice;", "Lcom/huami/devicerecorder/IRecorderDevice;", "", "a", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "Lcom/huami/devicerecorder/model/RecordFile;", "getRecorderFiles", "Lcom/huami/devicerecorder/IRecorderDevice$IDeviceStatusListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "registerStatusListener", "unregisterStatusListener", "Lcom/xiaomi/hm/health/device/event/HMDeviceConnectionEvent;", "event", "onEvent", "Lcom/huami/bluetooth/profile/channel/module/record/RecordModule;", "Lcom/huami/bluetooth/profile/channel/module/record/RecordModule;", "module", "b", "Ljava/lang/String;", "recordDirPath", "c", "saveToDir", "", GoogleApiAvailabilityLight.a, "Ljava/util/List;", "deviceStatusListener", "localDirPath", "<init>", "(Lcom/huami/bluetooth/profile/channel/module/record/RecordModule;Ljava/lang/String;)V", "Companion", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class RecordDevice implements IRecorderDevice {

    @NotNull
    private static final String e = "RecordDevice";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private final RecordModule module;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private String recordDirPath = "";

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final String saveToDir;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final List<IRecorderDevice.IDeviceStatusListener> deviceStatusListener;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.recorder.RecordDevice", f = "RecordDevice.kt", i = {0}, l = {38}, m = "getRecorderFiles", n = {"this"}, s = {"L$0"})
    public static final class a extends ContinuationImpl {
        public Object a;
        public /* synthetic */ Object b;
        public int d;

        public a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.b = obj;
            this.d |= Integer.MIN_VALUE;
            return RecordDevice.this.getRecorderFiles(this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.recorder.RecordDevice", f = "RecordDevice.kt", i = {}, l = {27}, m = "lazyInitRecordDirPath", n = {}, s = {})
    public static final class b extends ContinuationImpl {
        public Object a;
        public Object b;
        public /* synthetic */ Object c;
        public int e;

        public b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.c = obj;
            this.e |= Integer.MIN_VALUE;
            return RecordDevice.this.a(this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "path is : " + RecordDevice.this.recordDirPath;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<String> {
        public final /* synthetic */ boolean a;
        public final /* synthetic */ HMDeviceConnectionEvent b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(boolean z, HMDeviceConnectionEvent hMDeviceConnectionEvent) {
            super(0);
            this.a = z;
            this.b = hMDeviceConnectionEvent;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "device connection changed, is connect: " + this.a + "; type is: " + this.b.getDeviceType();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<String> {
        public final /* synthetic */ Exception a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Exception exc) {
            super(0);
            this.a = exc;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "notify connect status failed. " + this.a.getMessage();
        }
    }

    public RecordDevice(@Nullable RecordModule recordModule, @NotNull String str) {
        this.module = recordModule;
        String str2 = File.separator;
        if (!m.endsWith$default(str, str2, false, 2, null)) {
            str = str + str2;
        }
        this.saveToDir = str;
        this.deviceStatusListener = new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:32:0x0080  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Instruction removed from duplicated block: B:32:0x0080, please report this as an issue */
    public final Object a(Continuation<? super String> continuation) {
        b bVar;
        RecordDevice recordDevice;
        RecordDevice recordDevice2;
        String str;
        String str2;
        if (continuation instanceof b) {
            bVar = (b) continuation;
            int i = bVar.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                bVar.e = i - Integer.MIN_VALUE;
            } else {
                bVar = new b(continuation);
            }
        } else {
            bVar = new b(continuation);
        }
        Object objQueryPath = bVar.c;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i2 = bVar.e;
        String str3 = "";
        if (i2 == 0) {
            ResultKt.throwOnFailure(objQueryPath);
            if (this.recordDirPath.length() == 0) {
                RecordModule recordModule = this.module;
                if (recordModule == null) {
                    recordDevice = this;
                    recordDevice2 = recordDevice;
                } else {
                    bVar.a = this;
                    bVar.b = this;
                    bVar.e = 1;
                    objQueryPath = recordModule.queryPath(bVar);
                    if (objQueryPath == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    recordDevice = this;
                    recordDevice2 = recordDevice;
                }
                recordDevice2.recordDirPath = str3;
                HMLog.info(e, recordDevice.new c());
                str = recordDevice.recordDirPath;
                str2 = File.separator;
                if (!m.endsWith$default(str, str2, false, 2, null)) {
                    recordDevice.recordDirPath = recordDevice.recordDirPath + str2;
                }
            } else {
                recordDevice = this;
            }
            return recordDevice.recordDirPath;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        recordDevice2 = (RecordDevice) bVar.b;
        recordDevice = (RecordDevice) bVar.a;
        ResultKt.throwOnFailure(objQueryPath);
        String str4 = (String) objQueryPath;
        if (str4 != null) {
            str3 = str4;
        }
        recordDevice2.recordDirPath = str3;
        HMLog.info(e, recordDevice.new c());
        str = recordDevice.recordDirPath;
        str2 = File.separator;
        if (!m.endsWith$default(str, str2, false, 2, null)) {
            recordDevice.recordDirPath = recordDevice.recordDirPath + str2;
        }
        return recordDevice.recordDirPath;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0055  */
    /* JADX WARN: Code duplicated, block: B:27:0x006a A[LOOP:0: B:25:0x0064->B:27:0x006a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:29:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:32:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Instruction removed from duplicated block: B:27:0x006a, please report this as an issue */
    @Override // com.huami.devicerecorder.IRecorderDevice
    @Nullable
    public Object getRecorderFiles(@NotNull Continuation<? super List<RecordFile>> continuation) {
        a aVar;
        RecordDevice recordDevice;
        List<com.huami.bluetooth.profile.channel.module.record.RecordFile> list;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i = aVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                aVar.d = i - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        } else {
            aVar = new a(continuation);
        }
        Object objQueryRecordFiles = aVar.b;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i2 = aVar.d;
        ArrayList arrayList = null;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objQueryRecordFiles);
            RecordModule recordModule = this.module;
            if (recordModule == null) {
                recordDevice = this;
                list = null;
            } else {
                aVar.a = this;
                aVar.d = 1;
                objQueryRecordFiles = recordModule.queryRecordFiles(aVar);
                if (objQueryRecordFiles == coroutine_suspended) {
                    return coroutine_suspended;
                }
                recordDevice = this;
            }
            if (list != null) {
                arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
                for (com.huami.bluetooth.profile.channel.module.record.RecordFile recordFile : list) {
                    arrayList.add(new RecordFile(recordFile.getCreateTime(), recordFile.getCreateTime(), recordFile.getDuration(), recordDevice.saveToDir + recordFile.getName(), recordFile.getName(), true, false, recordFile.getSize(), null, 256, null));
                }
            }
            if (arrayList == null) {
                return CollectionsKt__CollectionsKt.emptyList();
            }
            return arrayList;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        recordDevice = (RecordDevice) aVar.a;
        ResultKt.throwOnFailure(objQueryRecordFiles);
        list = (List) objQueryRecordFiles;
        if (list != null) {
            arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
            while (r1.hasNext()) {
                arrayList.add(new RecordFile(recordFile.getCreateTime(), recordFile.getCreateTime(), recordFile.getDuration(), recordDevice.saveToDir + recordFile.getName(), recordFile.getName(), true, false, recordFile.getSize(), null, 256, null));
            }
        }
        if (arrayList == null) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        return arrayList;
    }

    public final void onEvent(@NotNull HMDeviceConnectionEvent event) {
        boolean z = event.getDeviceType() == HMDeviceType.MILI;
        boolean zIsConnected = event.isConnected();
        HMLog.info(e, new d(zIsConnected, event));
        if (z) {
            try {
                if (zIsConnected) {
                    Iterator<T> it2 = this.deviceStatusListener.iterator();
                    while (it2.hasNext()) {
                        ((IRecorderDevice.IDeviceStatusListener) it2.next()).onDeviceConnected();
                    }
                } else {
                    Iterator<T> it3 = this.deviceStatusListener.iterator();
                    while (it3.hasNext()) {
                        ((IRecorderDevice.IDeviceStatusListener) it3.next()).onDeviceDisconnected();
                    }
                }
            } catch (Exception e2) {
                HMLog.info(e, new e(e2));
            }
        }
    }

    @Override // com.huami.devicerecorder.IRecorderDevice
    public void registerStatusListener(@NotNull IRecorderDevice.IDeviceStatusListener listener) {
        if (this.deviceStatusListener.isEmpty()) {
            EventBus.getDefault().registerSticky(this);
        }
        if (this.deviceStatusListener.contains(listener)) {
            return;
        }
        this.deviceStatusListener.add(listener);
    }

    @Override // com.huami.devicerecorder.IRecorderDevice
    public void unregisterStatusListener(@NotNull IRecorderDevice.IDeviceStatusListener listener) {
        this.deviceStatusListener.remove(listener);
        if (this.deviceStatusListener.isEmpty()) {
            EventBus.getDefault().unregister(this);
        }
    }
}
