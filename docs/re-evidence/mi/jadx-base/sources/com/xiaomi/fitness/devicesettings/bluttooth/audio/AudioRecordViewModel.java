package com.xiaomi.fitness.devicesettings.bluttooth.audio;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.xiaomi.fitness.baseui.AbsViewModel;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.utils.ToastUtil;
import com.xiaomi.fitness.device.contact.export.DataHandlerWrapper;
import com.xiaomi.fitness.device.contact.export.DeviceContact;
import com.xiaomi.fitness.device.contact.export.DeviceSyncExtKt;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.devicesettings.bigdata.NormalFileSave;
import com.xiaomi.fitness.devicesettings.bigdata.UploadRecorderForegroundService;
import com.xiaomi.passport.utils.LoginPreferenceConfig;
import com.xiaomi.wearable.hm.BroadcastsKt;
import defpackage.aje;
import defpackage.s7r;
import defpackage.vkf;
import defpackage.wkf;
import defpackage.wzi;
import defpackage.xc6;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0085\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b*\u0001E\u0018\u0000 R2\u00020\u0001:\u0004RSTUB\u0007¢\u0006\u0004\bQ\u0010\bJ\u0019\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\f\u001a\u00020\u00042\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0018\u001a\u00020\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0018\u001a\u00020\u0002¢\u0006\u0004\b\u001b\u0010\u001aJ\u001b\u0010\u001e\u001a\u00020\u00042\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u000e0\u001c¢\u0006\u0004\b\u001e\u0010\u001fR$\u0010!\u001a\u0004\u0018\u00010 8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001d\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00120'8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R<\u0010.\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u000e -*\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010'0'0,8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103RH\u00106\u001a(\u0012$\u0012\"\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u000205 -*\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u000205\u0018\u000104040,8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b6\u0010/\u001a\u0004\b7\u00101\"\u0004\b8\u00103R0\u00109\u001a\u0010\u0012\f\u0012\n -*\u0004\u0018\u00010\u00020\u00020,8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b9\u0010/\u001a\u0004\b:\u00101\"\u0004\b;\u00103R\"\u0010<\u001a\u0002058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR\"\u0010B\u001a\u0002058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bB\u0010=\u001a\u0004\bC\u0010?\"\u0004\bD\u0010AR\u0014\u0010F\u001a\u00020E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u0018\u0010I\u001a\u00060HR\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010JR\u0018\u0010L\u001a\u00060KR\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010MR\u0018\u0010O\u001a\u00060NR\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010P¨\u0006V"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/bluttooth/audio/AudioRecordViewModel;", "Lcom/xiaomi/fitness/baseui/AbsViewModel;", "", "isCancel", "", "checkUploadEnd", "(Z)V", "loadDeviceRecordList", "()V", "", "Lwkf;", "files", "requestFiles", "([Lwkf;)V", "Lcom/xiaomi/fitness/devicesettings/bluttooth/audio/WatchRecordBean;", "mediaFile", "insertDb", "(Lcom/xiaomi/fitness/devicesettings/bluttooth/audio/WatchRecordBean;)V", "Lwkf$a;", "fileId", "askDeviceReceiveFileSuccess", "(Lwkf$a;)V", "Landroid/content/Context;", "context", "isUpload", LoginPreferenceConfig.TYPE_REGISTER, "(Landroid/content/Context;Z)V", "unRegister", "", "recordList", "updateRecordData", "(Ljava/util/List;)V", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "deviceModel", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "getDeviceModel", "()Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "setDeviceModel", "(Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;)V", "", "downLoadIdList", "Ljava/util/List;", "getDownLoadIdList", "()Ljava/util/List;", "Landroidx/lifecycle/MutableLiveData;", "kotlin.jvm.PlatformType", "dataListLiveData", "Landroidx/lifecycle/MutableLiveData;", "getDataListLiveData", "()Landroidx/lifecycle/MutableLiveData;", "setDataListLiveData", "(Landroidx/lifecycle/MutableLiveData;)V", "Lkotlin/Pair;", "", BroadcastsKt.SILENT_PUSHING_PROGRESS, "getProgress", "setProgress", "uploadEnd", "getUploadEnd", "setUploadEnd", "allSize", "I", "getAllSize", "()I", "setAllSize", "(I)V", "currentSize", "getCurrentSize", "setCurrentSize", "com/xiaomi/fitness/devicesettings/bluttooth/audio/AudioRecordViewModel$audioRecordDataHandler$1", "audioRecordDataHandler", "Lcom/xiaomi/fitness/devicesettings/bluttooth/audio/AudioRecordViewModel$audioRecordDataHandler$1;", "Lcom/xiaomi/fitness/devicesettings/bluttooth/audio/AudioRecordViewModel$UploadResultReceiver;", "uploadResultReceiver", "Lcom/xiaomi/fitness/devicesettings/bluttooth/audio/AudioRecordViewModel$UploadResultReceiver;", "Lcom/xiaomi/fitness/devicesettings/bluttooth/audio/AudioRecordViewModel$UploadCancelReceiver;", "uploadCancelReceiver", "Lcom/xiaomi/fitness/devicesettings/bluttooth/audio/AudioRecordViewModel$UploadCancelReceiver;", "Lcom/xiaomi/fitness/devicesettings/bluttooth/audio/AudioRecordViewModel$ProgressReceiver;", "progressReceiver", "Lcom/xiaomi/fitness/devicesettings/bluttooth/audio/AudioRecordViewModel$ProgressReceiver;", "<init>", "Companion", "UploadCancelReceiver", "UploadResultReceiver", "ProgressReceiver", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nAudioRecordViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AudioRecordViewModel.kt\ncom/xiaomi/fitness/devicesettings/bluttooth/audio/AudioRecordViewModel\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,257:1\n11158#2:258\n11493#2,3:259\n11158#2:266\n11493#2,3:267\n37#3:262\n36#3,3:263\n*S KotlinDebug\n*F\n+ 1 AudioRecordViewModel.kt\ncom/xiaomi/fitness/devicesettings/bluttooth/audio/AudioRecordViewModel\n*L\n95#1:258\n95#1:259,3\n98#1:266\n98#1:267,3\n95#1:262\n95#1:263,3\n*E\n"})
public final class AudioRecordViewModel extends AbsViewModel {

    @NotNull
    public static final String sActionProgress = "com.xiaomi.fitness.audioRecordViewModel.progress";

    @NotNull
    public static final String sActionUploadCancel = "com.xiaomi.fitness.audioRecordViewModel.sActionUploadCancel";

    @NotNull
    public static final String sActionUploadResult = "com.xiaomi.fitness.audioRecordViewModel.uploadRecordResult";

    @NotNull
    public static final String sKeyId = "sKeyId";

    @NotNull
    public static final String sKeyIsSuccess = "sKeyIsSuccess";

    @NotNull
    public static final String sKeySize = "sKeySize";
    private int allSize;

    @NotNull
    private final AudioRecordViewModel$audioRecordDataHandler$1 audioRecordDataHandler;
    private int currentSize;

    @NotNull
    private MutableLiveData<Pair<Boolean, Integer>> progress;

    @NotNull
    private final ProgressReceiver progressReceiver;

    @NotNull
    private final UploadCancelReceiver uploadCancelReceiver;

    @NotNull
    private MutableLiveData<Boolean> uploadEnd;

    @NotNull
    private final UploadResultReceiver uploadResultReceiver;

    @Nullable
    private WearableDeviceModel deviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();

    @NotNull
    private final List<wkf.a> downLoadIdList = new ArrayList();

    @NotNull
    private MutableLiveData<List<WatchRecordBean>> dataListLiveData = new MutableLiveData<>(new ArrayList());

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016¨\u0006\n"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/bluttooth/audio/AudioRecordViewModel$ProgressReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "(Lcom/xiaomi/fitness/devicesettings/bluttooth/audio/AudioRecordViewModel;)V", "onReceive", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class ProgressReceiver extends BroadcastReceiver {
        public ProgressReceiver() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(@Nullable Context context, @Nullable Intent intent) {
            int intExtra = intent != null ? intent.getIntExtra(AudioRecordViewModel.sKeySize, 0) : 0;
            AudioRecordViewModel audioRecordViewModel = AudioRecordViewModel.this;
            audioRecordViewModel.setCurrentSize(audioRecordViewModel.getCurrentSize() + intExtra);
            int currentSize = (int) (((((double) AudioRecordViewModel.this.getCurrentSize()) * 1.0d) / ((double) AudioRecordViewModel.this.getAllSize())) * ((double) 100));
            if (currentSize >= 100) {
                currentSize = 99;
            } else {
                Pair<Boolean, Integer> value = AudioRecordViewModel.this.getProgress().getValue();
                Intrinsics.checkNotNull(value);
                int iIntValue = value.getSecond().intValue();
                if (currentSize <= iIntValue) {
                    currentSize = iIntValue;
                }
            }
            xc6.d("ProgressReceiver allSize:" + AudioRecordViewModel.this.getAllSize() + " " + AudioRecordViewModel.this.getCurrentSize() + " " + currentSize);
            AudioRecordViewModel.this.getProgress().postValue(new Pair<>(Boolean.TRUE, Integer.valueOf(currentSize)));
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016¨\u0006\n"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/bluttooth/audio/AudioRecordViewModel$UploadCancelReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "(Lcom/xiaomi/fitness/devicesettings/bluttooth/audio/AudioRecordViewModel;)V", "onReceive", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class UploadCancelReceiver extends BroadcastReceiver {
        public UploadCancelReceiver() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(@Nullable Context context, @Nullable Intent intent) {
            xc6.d("UploadCancelReceiver");
            AudioRecordViewModel.this.getDownLoadIdList().clear();
            AudioRecordViewModel.this.checkUploadEnd(true);
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016¨\u0006\n"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/bluttooth/audio/AudioRecordViewModel$UploadResultReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "(Lcom/xiaomi/fitness/devicesettings/bluttooth/audio/AudioRecordViewModel;)V", "onReceive", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nAudioRecordViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AudioRecordViewModel.kt\ncom/xiaomi/fitness/devicesettings/bluttooth/audio/AudioRecordViewModel$UploadResultReceiver\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,257:1\n1#2:258\n*E\n"})
    public final class UploadResultReceiver extends BroadcastReceiver {
        public UploadResultReceiver() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(@Nullable Context context, @Nullable Intent intent) {
            WatchRecordBean watchRecordBean;
            Object next;
            String id;
            String stringExtra = intent != null ? intent.getStringExtra("sKeyId") : null;
            boolean booleanExtra = intent != null ? intent.getBooleanExtra("sKeyIsSuccess", false) : false;
            xc6.d("UploadResultReceiver id:" + stringExtra + " isSuccess:" + booleanExtra + " " + AudioRecordViewModel.this.uploadResultReceiver);
            if (stringExtra == null) {
                AudioRecordViewModel.checkUploadEnd$default(AudioRecordViewModel.this, false, 1, null);
                return;
            }
            if (!booleanExtra) {
                AudioRecordViewModel.checkUploadEnd$default(AudioRecordViewModel.this, false, 1, null);
                return;
            }
            List<WatchRecordBean> value = AudioRecordViewModel.this.getDataListLiveData().getValue();
            if (value != null) {
                Iterator<T> it = value.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    } else {
                        next = it.next();
                        id = ((WatchRecordBean) next).getFile().c.c;
                        Intrinsics.checkNotNullExpressionValue(id, "id");
                    }
                } while (!StringsKt__StringsJVMKt.endsWith$default(id, stringExtra, false, 2, null));
                watchRecordBean = (WatchRecordBean) next;
            } else {
                watchRecordBean = null;
            }
            if (watchRecordBean == null) {
                xc6.b("UploadResultReceiver not find mediaFile");
                AudioRecordViewModel.checkUploadEnd$default(AudioRecordViewModel.this, false, 1, null);
                return;
            }
            if (AudioRecordViewModel.this.getDownLoadIdList().contains(watchRecordBean.getFile().c)) {
                AudioRecordViewModel.this.getDownLoadIdList().remove(watchRecordBean.getFile().c);
            }
            AudioRecordViewModel audioRecordViewModel = AudioRecordViewModel.this;
            wkf.a identifier = watchRecordBean.getFile().c;
            Intrinsics.checkNotNullExpressionValue(identifier, "identifier");
            audioRecordViewModel.askDeviceReceiveFileSuccess(identifier);
            AudioRecordViewModel.this.insertDb(watchRecordBean);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.bluttooth.audio.AudioRecordViewModel$insertDb$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.devicesettings.bluttooth.audio.AudioRecordViewModel$insertDb$1", f = "AudioRecordViewModel.kt", i = {0}, l = {127, 130}, m = "invokeSuspend", n = {"audioRecordDao"}, s = {"L$0"})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ AudioRecordEntity $audioRecordEntity;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(AudioRecordEntity audioRecordEntity, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$audioRecordEntity = audioRecordEntity;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return AudioRecordViewModel.this.new AnonymousClass1(this.$audioRecordEntity, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            AudioRecordDao audioRecordDao;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i != 0) {
                if (i == 1) {
                    audioRecordDao = (AudioRecordDao) this.L$0;
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                AudioRecordViewModel.checkUploadEnd$default(AudioRecordViewModel.this, false, 1, null);
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            audioRecordDao = AudioRecordDataBase.INSTANCE.getInstance().audioRecordDao();
            WearableDeviceModel deviceModel = AudioRecordViewModel.this.getDeviceModel();
            Intrinsics.checkNotNull(deviceModel);
            String did = deviceModel.getDid();
            String title = this.$audioRecordEntity.getTitle();
            this.L$0 = audioRecordDao;
            this.label = 1;
            obj = audioRecordDao.findById(did, title, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            if (((AudioRecordEntity) obj) == null) {
                xc6.d("AudioRecordViewModel insertDb insert");
                AudioRecordEntity audioRecordEntity = this.$audioRecordEntity;
                this.L$0 = null;
                this.label = 2;
                if (audioRecordDao.add(audioRecordEntity, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                xc6.b("AudioRecordViewModel insertDb db has");
            }
            AudioRecordViewModel.checkUploadEnd$default(AudioRecordViewModel.this, false, 1, null);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [com.xiaomi.fitness.devicesettings.bluttooth.audio.AudioRecordViewModel$audioRecordDataHandler$1] */
    public AudioRecordViewModel() {
        Boolean bool = Boolean.FALSE;
        this.progress = new MutableLiveData<>(new Pair(bool, 0));
        this.uploadEnd = new MutableLiveData<>(bool);
        this.audioRecordDataHandler = new DataHandlerWrapper() { // from class: com.xiaomi.fitness.devicesettings.bluttooth.audio.AudioRecordViewModel$audioRecordDataHandler$1
            @Override // com.xiaomi.fitness.device.contact.export.DataHandlerWrapper, com.xiaomi.fitness.device.contact.export.DataHandler
            public boolean handlePacket(String did, int type, s7r packet) {
                wkf.b bVarO;
                Intrinsics.checkNotNullParameter(did, "did");
                Integer numValueOf = packet != null ? Integer.valueOf(packet.f) : null;
                if (numValueOf == null || numValueOf.intValue() != 16) {
                    return super.handlePacket(did, type, packet);
                }
                vkf vkfVarA = packet.A();
                wkf[] wkfVarArr = (vkfVarA == null || (bVarO = vkfVarA.o()) == null) ? null : bVarO.c;
                xc6.d("loadDeviceRecordList onSuccess list:" + (wkfVarArr != null ? Integer.valueOf(wkfVarArr.length) : null));
                BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this.this$0), null, null, new AudioRecordViewModel$audioRecordDataHandler$1$handlePacket$1(did, wkfVarArr != null ? ArraysKt___ArraysKt.toMutableList(wkfVarArr) : null, this.this$0, null), 3, null);
                return true;
            }
        };
        this.uploadResultReceiver = new UploadResultReceiver();
        this.uploadCancelReceiver = new UploadCancelReceiver();
        this.progressReceiver = new ProgressReceiver();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void checkUploadEnd(boolean isCancel) {
        xc6.b("AudioRecordViewModel checkUploadEnd  isCancel:" + isCancel);
        if (this.downLoadIdList.isEmpty()) {
            if (!isCancel) {
                ToastUtil.INSTANCE.showToast(wzi.t0);
            }
            UploadRecorderForegroundService.INSTANCE.stopForegroundServiceIfNeed(ApplicationExtKt.getApplication());
            loadDeviceRecordList();
            this.uploadEnd.postValue(Boolean.TRUE);
            this.currentSize = 0;
            this.allSize = 0;
            this.progress.postValue(new Pair<>(Boolean.FALSE, 100));
        }
    }

    public static /* synthetic */ void checkUploadEnd$default(AudioRecordViewModel audioRecordViewModel, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        audioRecordViewModel.checkUploadEnd(z);
    }

    public static /* synthetic */ void register$default(AudioRecordViewModel audioRecordViewModel, Context context, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        audioRecordViewModel.register(context, z);
    }

    public static /* synthetic */ void unRegister$default(AudioRecordViewModel audioRecordViewModel, Context context, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        audioRecordViewModel.unRegister(context, z);
    }

    public final void askDeviceReceiveFileSuccess(@NotNull wkf.a fileId) {
        Intrinsics.checkNotNullParameter(fileId, "fileId");
        xc6.b("AudioRecordViewModel askDeviceReceiveFileSuccess " + fileId);
        s7r s7rVar = new s7r();
        s7rVar.e = 18;
        s7rVar.f = 19;
        vkf vkfVar = new vkf();
        vkfVar.y(fileId);
        s7rVar.Y(vkfVar);
        DeviceContact.DefaultImpls.call$default(DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE), s7rVar, false, null, 0, 12, null);
    }

    public final int getAllSize() {
        return this.allSize;
    }

    public final int getCurrentSize() {
        return this.currentSize;
    }

    @NotNull
    public final MutableLiveData<List<WatchRecordBean>> getDataListLiveData() {
        return this.dataListLiveData;
    }

    @Nullable
    public final WearableDeviceModel getDeviceModel() {
        return this.deviceModel;
    }

    @NotNull
    public final List<wkf.a> getDownLoadIdList() {
        return this.downLoadIdList;
    }

    @NotNull
    public final MutableLiveData<Pair<Boolean, Integer>> getProgress() {
        return this.progress;
    }

    @NotNull
    public final MutableLiveData<Boolean> getUploadEnd() {
        return this.uploadEnd;
    }

    public final void insertDb(@NotNull WatchRecordBean mediaFile) {
        Intrinsics.checkNotNullParameter(mediaFile, "mediaFile");
        WearableDeviceModel wearableDeviceModel = this.deviceModel;
        xc6.d("insertDb " + mediaFile + " " + (wearableDeviceModel != null ? wearableDeviceModel.getDid() : null));
        mediaFile.setPull(true);
        if (this.deviceModel != null) {
            long j = mediaFile.getFile().f;
            String id = mediaFile.getFile().c.c;
            Intrinsics.checkNotNullExpressionValue(id, "id");
            String id2 = mediaFile.getFile().c.c;
            Intrinsics.checkNotNullExpressionValue(id2, "id");
            WearableDeviceModel wearableDeviceModel2 = this.deviceModel;
            Intrinsics.checkNotNull(wearableDeviceModel2);
            BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new AnonymousClass1(new AudioRecordEntity(j, id, id2, wearableDeviceModel2.getDid(), mediaFile.getFile().g, 0, 0, null, null, 480, null), null), 3, null);
        }
    }

    public final void loadDeviceRecordList() {
        WearableDeviceModel wearableDeviceModel = this.deviceModel;
        if (wearableDeviceModel == null || !wearableDeviceModel.getIsDeviceConnected()) {
            xc6.d("loadDeviceRecordList deviceModel is not connection");
            return;
        }
        s7r s7rVar = new s7r();
        s7rVar.e = 18;
        s7rVar.f = 15;
        DeviceContact.DefaultImpls.call$default(DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE), s7rVar, false, null, 0, 12, null);
    }

    public final void register(@NotNull Context context, boolean isUpload) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (isUpload) {
            xc6.b("AudioRecordViewModel register  =================");
            aje.b(context).c(this.uploadResultReceiver, new IntentFilter("com.xiaomi.fitness.audioRecordViewModel.uploadRecordResult"));
            aje.b(context).c(this.progressReceiver, new IntentFilter(sActionProgress));
            aje.b(context).c(this.uploadCancelReceiver, new IntentFilter(sActionUploadCancel));
        }
        DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE).addDataHandler(18, this.audioRecordDataHandler);
    }

    public final void requestFiles(@NotNull wkf[] files) {
        Intrinsics.checkNotNullParameter(files, "files");
        WearableDeviceModel wearableDeviceModel = this.deviceModel;
        if (wearableDeviceModel == null || !wearableDeviceModel.getIsDeviceConnected()) {
            ToastUtil.INSTANCE.showToast(wzi.q);
            return;
        }
        if (!(files.length == 0)) {
            UploadRecorderForegroundService.INSTANCE.startForegroundNotificationIfNeed(ApplicationExtKt.getApplication());
            this.currentSize = 0;
            this.progress.postValue(new Pair<>(Boolean.TRUE, 0));
            ArrayList arrayList = new ArrayList(files.length);
            for (wkf wkfVar : files) {
                arrayList.add(wkfVar.c);
            }
            wkf.a[] aVarArr = (wkf.a[]) arrayList.toArray(new wkf.a[0]);
            this.downLoadIdList.clear();
            CollectionsKt__MutableCollectionsKt.addAll(this.downLoadIdList, aVarArr);
            ArrayList arrayList2 = new ArrayList(files.length);
            for (wkf wkfVar2 : files) {
                arrayList2.add(Integer.valueOf(wkfVar2.e));
            }
            this.allSize = CollectionsKt___CollectionsKt.sumOfInt(arrayList2);
            xc6.d("AudioRecordViewModel requestOneFile " + files.length);
            s7r s7rVar = new s7r();
            s7rVar.e = 18;
            s7rVar.f = 18;
            vkf vkfVar = new vkf();
            wkf.a.C1133a c1133a = new wkf.a.C1133a();
            c1133a.c = aVarArr;
            vkfVar.z(c1133a);
            s7rVar.Y(vkfVar);
            DeviceContact.DefaultImpls.call$default(DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE), s7rVar, false, null, 0, 12, null);
            NormalFileSave.INSTANCE.postDelayHandler();
        }
    }

    public final void setAllSize(int i) {
        this.allSize = i;
    }

    public final void setCurrentSize(int i) {
        this.currentSize = i;
    }

    public final void setDataListLiveData(@NotNull MutableLiveData<List<WatchRecordBean>> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.dataListLiveData = mutableLiveData;
    }

    public final void setDeviceModel(@Nullable WearableDeviceModel wearableDeviceModel) {
        this.deviceModel = wearableDeviceModel;
    }

    public final void setProgress(@NotNull MutableLiveData<Pair<Boolean, Integer>> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.progress = mutableLiveData;
    }

    public final void setUploadEnd(@NotNull MutableLiveData<Boolean> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.uploadEnd = mutableLiveData;
    }

    public final void unRegister(@NotNull Context context, boolean isUpload) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (isUpload) {
            aje.b(context).e(this.uploadResultReceiver);
            aje.b(context).e(this.progressReceiver);
            aje.b(context).e(this.uploadCancelReceiver);
        }
        DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE).removeDataHandler(18, this.audioRecordDataHandler);
    }

    public final void updateRecordData(@NotNull List<WatchRecordBean> recordList) {
        Intrinsics.checkNotNullParameter(recordList, "recordList");
        List<WatchRecordBean> value = this.dataListLiveData.getValue();
        if (value != null) {
            value.clear();
        }
        if (value != null) {
            value.addAll(recordList);
        }
        this.dataListLiveData.postValue(value);
    }
}
