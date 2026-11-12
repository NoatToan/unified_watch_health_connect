package com.xiaomi.fitness.devicesettings.bluttooth.music;

import android.app.Service;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.utils.MD5Util;
import com.xiaomi.fitness.common.utils.ToastUtil;
import com.xiaomi.fitness.device.contact.export.DeviceContact;
import com.xiaomi.fitness.device.contact.export.DeviceSyncExtKt;
import com.xiaomi.fitness.device.contact.export.OnSyncCallback;
import com.xiaomi.fitness.device.contact.export.SyncResult;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.devicesettings.bluttooth.music.bean.MusicBean;
import com.xiaomi.wearable.hm.BroadcastsKt;
import defpackage.clf;
import defpackage.im9;
import defpackage.s7r;
import defpackage.suc;
import defpackage.tuc;
import defpackage.vkf;
import defpackage.wzi;
import defpackage.xc6;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000_\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b*\u00018\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010+\u001a\u00020*¢\u0006\u0004\bD\u0010EJ\u001d\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\u000b\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ/\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0015\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J-\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u000f2\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u001a\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0019\u0010\u001f\u001a\u00020\u00052\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 J\u0019\u0010!\u001a\u00020\u00052\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0016¢\u0006\u0004\b!\u0010 J\u001f\u0010\"\u001a\u00020\u00052\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\"\u0010\u0007J\u000f\u0010#\u001a\u00020\u0005H\u0016¢\u0006\u0004\b#\u0010\u0018J\u000f\u0010$\u001a\u00020\u0005H\u0016¢\u0006\u0004\b$\u0010\u0018J\u001f\u0010(\u001a\u00020\u00052\u0006\u0010%\u001a\u00020\u00132\b\u0010'\u001a\u0004\u0018\u00010&¢\u0006\u0004\b(\u0010)R\u0017\u0010+\u001a\u00020*8\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u0017\u0010/\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u001c\u00103\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u001c\u00105\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00104R\u0016\u00106\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u00109\u001a\u0002088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u001a\u0010<\u001a\b\u0012\u0004\u0012\u00020\u001d0;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0018\u0010>\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010?R\u0016\u0010@\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010AR\u0018\u0010B\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010?R\u0016\u0010C\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010A¨\u0006F"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/bluttooth/music/MusicPushImpl;", "Ltuc$a;", "", "Lcom/xiaomi/fitness/devicesettings/bluttooth/music/bean/MusicBean;", "list", "", "nextPush", "(Ljava/util/List;)V", "musicBean", "Ljava/io/File;", "file", "preSendFile", "(Lcom/xiaomi/fitness/devicesettings/bluttooth/music/bean/MusicBean;Ljava/io/File;)V", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "deviceModel", "", "segmentLength", "sendRpkFile", "(Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;Ljava/io/File;ILcom/xiaomi/fitness/devicesettings/bluttooth/music/bean/MusicBean;)V", "", "duplicated", "sendPushRet", "(Lcom/xiaomi/fitness/devicesettings/bluttooth/music/bean/MusicBean;Z)V", "sendLowStorage", "()V", "cmd", BroadcastsKt.SILENT_PUSHING_PROGRESS, "sendCmd", "(ILcom/xiaomi/fitness/devicesettings/bluttooth/music/bean/MusicBean;I)V", "Lsuc;", "musichandler", "addMusicPushHandler", "(Lsuc;)V", "removeMusicPushHandler", "startPush", "flushComplete", BroadcastsKt.SILENT_PUSHING_CANCEL, "isSuccess", "", "id", "onPushDeviceResultSuccess", "(Z[B)V", "Landroid/app/Service;", "service", "Landroid/app/Service;", "getService", "()Landroid/app/Service;", "cacheFile", "Ljava/io/File;", "getCacheFile", "()Ljava/io/File;", "pendingPushMusicList", "Ljava/util/List;", "completeList", "isCancel", "Z", "com/xiaomi/fitness/devicesettings/bluttooth/music/MusicPushImpl$handler$1", "handler", "Lcom/xiaomi/fitness/devicesettings/bluttooth/music/MusicPushImpl$handler$1;", "Landroid/os/RemoteCallbackList;", "musicHandlers", "Landroid/os/RemoteCallbackList;", "currentMusicBean", "Lcom/xiaomi/fitness/devicesettings/bluttooth/music/bean/MusicBean;", "currentPosition", "I", "pendingMusicBean", "currentTaskId", "<init>", "(Landroid/app/Service;)V", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nMusicPushImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MusicPushImpl.kt\ncom/xiaomi/fitness/devicesettings/bluttooth/music/MusicPushImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,417:1\n1#2:418\n*E\n"})
public final class MusicPushImpl extends tuc.a {

    @NotNull
    private final File cacheFile;

    @NotNull
    private List<MusicBean> completeList;

    @Nullable
    private MusicBean currentMusicBean;
    private int currentPosition;
    private int currentTaskId;

    @NotNull
    private final MusicPushImpl$handler$1 handler;
    private boolean isCancel;

    @NotNull
    private final RemoteCallbackList<suc> musicHandlers;

    @Nullable
    private MusicBean pendingMusicBean;

    @NotNull
    private List<MusicBean> pendingPushMusicList;

    @NotNull
    private final Service service;

    /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.bluttooth.music.MusicPushImpl$nextPush$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.devicesettings.bluttooth.music.MusicPushImpl$nextPush$1", f = "MusicPushImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Ref.ObjectRef<MusicBean> $musicBean;
        int label;
        final /* synthetic */ MusicPushImpl this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Ref.ObjectRef<MusicBean> objectRef, MusicPushImpl musicPushImpl, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$musicBean = objectRef;
            this.this$0 = musicPushImpl;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$musicBean, this.this$0, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws RemoteException {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            try {
                im9.U(this.this$0.getCacheFile(), ApplicationExtKt.getApplication().getContentResolver().openInputStream(this.$musicBean.element.getUri()));
                MusicPushImpl musicPushImpl = this.this$0;
                musicPushImpl.preSendFile(this.$musicBean.element, musicPushImpl.getCacheFile());
            } catch (Exception e) {
                xc6.c("MusicPushImpl openInputStream", e);
                MusicPushImpl musicPushImpl2 = this.this$0;
                musicPushImpl2.nextPush(musicPushImpl2.pendingPushMusicList);
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.xiaomi.fitness.devicesettings.bluttooth.music.MusicPushImpl$handler$1] */
    public MusicPushImpl(@NotNull Service service) {
        Intrinsics.checkNotNullParameter(service, "service");
        this.service = service;
        this.cacheFile = new File(ApplicationExtKt.getApplication().getCacheDir(), "tempMusicFile.mp3");
        this.pendingPushMusicList = new ArrayList();
        this.completeList = new ArrayList();
        final Looper mainLooper = Looper.getMainLooper();
        this.handler = new Handler(mainLooper) { // from class: com.xiaomi.fitness.devicesettings.bluttooth.music.MusicPushImpl$handler$1
            @Override // android.os.Handler
            public void handleMessage(Message msg) throws RemoteException {
                Intrinsics.checkNotNullParameter(msg, "msg");
                switch (msg.what) {
                    case -1:
                        Object obj = msg.obj;
                        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.xiaomi.fitness.devicesettings.IMusicPushHandler");
                        this.this$0.musicHandlers.unregister((suc) obj);
                        if (this.this$0.pendingPushMusicList.isEmpty() && this.this$0.currentMusicBean == null && this.this$0.pendingMusicBean == null && this.this$0.completeList.isEmpty()) {
                            xc6.b("stop MusicPushService");
                            this.this$0.getService().stopSelf();
                            break;
                        }
                        break;
                    case 1:
                        Object obj2 = msg.obj;
                        Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type com.xiaomi.fitness.devicesettings.IMusicPushHandler");
                        this.this$0.musicHandlers.register((suc) obj2);
                        if (this.this$0.pendingPushMusicList.isEmpty() && (!this.this$0.completeList.isEmpty())) {
                            MusicPushImpl.sendCmd$default(this.this$0, 2, null, 0, 6, null);
                        } else {
                            xc6.d("MusicPushImpl currentMusicBean:" + this.this$0.currentMusicBean + " " + this.this$0.currentPosition + " pendingMusicBean:" + this.this$0.pendingMusicBean);
                            if (this.this$0.currentMusicBean != null) {
                                MusicPushImpl musicPushImpl = this.this$0;
                                musicPushImpl.sendCmd(1, musicPushImpl.currentMusicBean, this.this$0.currentPosition);
                            } else if (this.this$0.pendingMusicBean != null) {
                                MusicPushImpl musicPushImpl2 = this.this$0;
                                musicPushImpl2.sendCmd(1, musicPushImpl2.pendingMusicBean, 100);
                            }
                        }
                        break;
                    case 10:
                        if (!(!this.this$0.pendingPushMusicList.isEmpty())) {
                            this.this$0.isCancel = false;
                            Object obj3 = msg.obj;
                            Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.collections.MutableList<com.xiaomi.fitness.devicesettings.bluttooth.music.bean.MusicBean>");
                            this.this$0.pendingPushMusicList.addAll(TypeIntrinsics.asMutableList(obj3));
                            sendEmptyMessage(20);
                        } else {
                            xc6.b("MusicPushImpl has task not complete");
                        }
                        break;
                    case 20:
                        MusicPushImpl musicPushImpl3 = this.this$0;
                        musicPushImpl3.nextPush(musicPushImpl3.pendingPushMusicList);
                        break;
                    case 30:
                        if (!this.this$0.isCancel) {
                            Object obj4 = msg.obj;
                            Intrinsics.checkNotNull(obj4, "null cannot be cast to non-null type com.xiaomi.fitness.devicesettings.bluttooth.music.bean.MusicBean");
                            MusicBean musicBean = (MusicBean) obj4;
                            if (!musicBean.getIsDownLoadSuccess()) {
                                this.this$0.completeList.add(musicBean);
                                sendEmptyMessage(20);
                            } else if (msg.arg1 == 1) {
                                this.this$0.completeList.add(musicBean);
                                this.this$0.currentPosition = 0;
                                this.this$0.currentMusicBean = null;
                                sendEmptyMessage(20);
                            } else {
                                this.this$0.pendingMusicBean = musicBean;
                                sendEmptyMessageDelayed(60, 60000L);
                            }
                            this.this$0.currentPosition = 0;
                            this.this$0.currentMusicBean = null;
                        } else {
                            xc6.d("sCodePushRet cancel break");
                        }
                        break;
                    case 40:
                        this.this$0.completeList.clear();
                        break;
                    case 50:
                        if (!this.this$0.isCancel) {
                            removeMessages(60);
                            byte[] bArr = (byte[]) msg.obj;
                            xc6.d("sCodePushDeviceResult deviceId:" + bArr + "  pendingMusicBeanId:" + this.this$0.pendingMusicBean);
                            MusicBean musicBean2 = this.this$0.pendingMusicBean;
                            if (musicBean2 != null) {
                                MusicPushImpl musicPushImpl4 = this.this$0;
                                if (Arrays.equals(musicBean2.getId(), bArr)) {
                                    boolean z = msg.arg1 == 0;
                                    musicBean2.setDownLoadSuccess(z);
                                    if (z) {
                                        ToastUtil.showToast(ResourceExtKt.getString(wzi.v6, musicBean2.getName()));
                                    } else {
                                        ToastUtil.showToast(ResourceExtKt.getString(wzi.u6, musicBean2.getName()));
                                    }
                                }
                                musicPushImpl4.completeList.add(musicBean2);
                            }
                            MusicPushImpl musicPushImpl5 = this.this$0;
                            MusicPushImpl.sendCmd$default(musicPushImpl5, 3, musicPushImpl5.pendingMusicBean, 0, 4, null);
                            this.this$0.pendingMusicBean = null;
                            sendEmptyMessage(20);
                        } else {
                            xc6.d("sCodePushDeviceResult cancel break");
                        }
                        break;
                    case 60:
                        xc6.d("MusicPushImpl sCodePushDeviceTimeOut timeout");
                        MusicBean musicBean3 = this.this$0.pendingMusicBean;
                        if (musicBean3 != null) {
                            MusicPushImpl musicPushImpl6 = this.this$0;
                            musicBean3.setDownLoadSuccess(false);
                            musicPushImpl6.completeList.add(musicBean3);
                        }
                        this.this$0.pendingMusicBean = null;
                        sendEmptyMessage(20);
                        break;
                    case 70:
                        this.this$0.currentTaskId = msg.arg1;
                        break;
                    case 80:
                        this.this$0.isCancel = true;
                        DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE).cancelTask(this.this$0.currentTaskId);
                        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
                        if (wearableDeviceModel != null) {
                            DeviceModelExtKt.cancelMass(wearableDeviceModel);
                        }
                        removeMessages(60);
                        MusicBean musicBean4 = this.this$0.currentMusicBean;
                        if (musicBean4 != null) {
                            MusicPushImpl musicPushImpl7 = this.this$0;
                            musicPushImpl7.completeList.add(musicBean4);
                            musicPushImpl7.currentMusicBean = null;
                            musicPushImpl7.currentPosition = 0;
                        }
                        this.this$0.completeList.addAll(this.this$0.pendingPushMusicList);
                        this.this$0.pendingPushMusicList.clear();
                        sendEmptyMessage(20);
                        this.this$0.getService().stopSelf();
                        break;
                    case 90:
                        xc6.b("sCodeLowStorage");
                        removeMessages(60);
                        MusicBean musicBean5 = this.this$0.currentMusicBean;
                        if (musicBean5 != null) {
                            MusicPushImpl musicPushImpl8 = this.this$0;
                            musicPushImpl8.completeList.add(musicBean5);
                            musicPushImpl8.currentMusicBean = null;
                            musicPushImpl8.currentPosition = 0;
                        }
                        this.this$0.completeList.addAll(this.this$0.pendingPushMusicList);
                        this.this$0.pendingPushMusicList.clear();
                        MusicPushImpl.sendCmd$default(this.this$0, 4, null, 0, 6, null);
                        sendEmptyMessage(20);
                        this.this$0.getService().stopSelf();
                        break;
                }
            }
        };
        this.musicHandlers = new RemoteCallbackList<>();
        this.currentTaskId = -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r10v1, types: [T, java.lang.Object] */
    public final void nextPush(List<MusicBean> list) throws RemoteException {
        if (list.isEmpty()) {
            xc6.b("MusicPushImpl nextPush empty");
            sendCmd$default(this, 2, null, 0, 6, null);
            return;
        }
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        ?? Remove = list.remove(0);
        objectRef.element = Remove;
        this.currentMusicBean = (MusicBean) Remove;
        this.currentPosition = 0;
        sendCmd$default(this, 0, (MusicBean) Remove, 0, 4, null);
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()), null, null, new AnonymousClass1(objectRef, this, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void preSendFile(final MusicBean musicBean, final File file) {
        int length = (int) file.length();
        xc6.b("MusicPushImpl nextPush " + musicBean + " fileSize:" + length);
        final WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (wearableDeviceModel == null) {
            xc6.b("MusicPushImpl prePush deviceModel is null");
            return;
        }
        s7r s7rVar = new s7r();
        s7rVar.e = 18;
        s7rVar.f = 11;
        clf.a aVar = new clf.a();
        clf clfVar = new clf();
        clfVar.c = MD5Util.getFileMD5Bytes(file);
        clfVar.d = musicBean.getName();
        String album = musicBean.getAlbum();
        if (album == null) {
            album = "";
        }
        clfVar.g = album;
        String artist = musicBean.getArtist();
        clfVar.h = artist != null ? artist : "";
        clfVar.f = musicBean.getDuration() / 1000;
        clfVar.e = length;
        musicBean.setId(clfVar.c);
        aVar.c = clfVar;
        vkf vkfVar = new vkf();
        vkfVar.B(aVar);
        s7rVar.Y(vkfVar);
        DeviceContact.DefaultImpls.call$default(DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE), s7rVar, true, new OnSyncCallback() { // from class: com.xiaomi.fitness.devicesettings.bluttooth.music.MusicPushImpl$preSendFile$1$1
            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onError(String did, int type, int code) {
                xc6.b("MusicPushImpl prePush addRequest onError code:" + code);
                musicBean.setDownLoadSuccess(false);
                MusicPushImpl.sendPushRet$default(this.this$0, musicBean, false, 2, null);
            }

            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onSuccess(String did, int type, SyncResult result) {
                s7r packet;
                vkf vkfVarA;
                clf.b bVarR = (result == null || (packet = result.getPacket()) == null || (vkfVarA = packet.A()) == null) ? null : vkfVarA.r();
                xc6.b("MusicPushImpl prePush addRequest onSuccess " + bVarR);
                if (bVarR == null) {
                    xc6.b("MusicPushImpl prePush addRequest onSuccess is null");
                    return;
                }
                MusicPushImpl musicPushImpl = this.this$0;
                WearableDeviceModel wearableDeviceModel2 = wearableDeviceModel;
                File file2 = file;
                MusicBean musicBean2 = musicBean;
                int i = bVarR.c;
                if (i == 0) {
                    musicPushImpl.sendRpkFile(wearableDeviceModel2, file2, bVarR.d, musicBean2);
                    return;
                }
                if (i == 2) {
                    im9.z(musicPushImpl.getCacheFile());
                    xc6.b("MusicPushImpl prePush addRequest onSuccess CommonProtos.DUPLICATED prepareStatus:" + bVarR.c);
                    musicBean2.setDownLoadSuccess(true);
                    musicPushImpl.sendPushRet(musicBean2, true);
                    return;
                }
                if (i == 3) {
                    im9.z(musicPushImpl.getCacheFile());
                    xc6.b("MusicPushImpl prePush addRequest onSuccess CommonProtos.LOW_STORAGE  prepareStatus:" + bVarR.c);
                    musicPushImpl.sendLowStorage();
                    return;
                }
                im9.z(musicPushImpl.getCacheFile());
                xc6.b("MusicPushImpl prePush addRequest onSuccess prepareStatus:" + bVarR.c);
                musicBean2.setDownLoadSuccess(false);
                MusicPushImpl.sendPushRet$default(musicPushImpl, musicBean2, false, 2, null);
            }
        }, 0, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sendCmd(int cmd, MusicBean musicBean, int progress) throws RemoteException {
        int iBeginBroadcast = this.musicHandlers.beginBroadcast();
        xc6.d("sendCmd cmd:" + cmd + " size:" + iBeginBroadcast);
        for (int i = 0; i < iBeginBroadcast; i++) {
            suc sucVar = (suc) this.musicHandlers.getBroadcastItem(i);
            if (sucVar.asBinder().isBinderAlive()) {
                if (cmd == 0) {
                    sucVar.onItemPushStart(musicBean, this.completeList.size() + 1, this.pendingPushMusicList.size() + this.completeList.size() + 1);
                } else if (cmd == 1) {
                    sucVar.onItemPush(musicBean, progress);
                } else if (cmd == 2) {
                    sucVar.onPushEnd(this.completeList);
                } else if (cmd == 3) {
                    sucVar.onItemPushEnd(musicBean);
                } else if (cmd == 4) {
                    sucVar.onLowStorage();
                }
            }
        }
        this.musicHandlers.finishBroadcast();
    }

    public static /* synthetic */ void sendCmd$default(MusicPushImpl musicPushImpl, int i, MusicBean musicBean, int i2, int i3, Object obj) throws RemoteException {
        if ((i3 & 2) != 0) {
            musicBean = null;
        }
        if ((i3 & 4) != 0) {
            i2 = 0;
        }
        musicPushImpl.sendCmd(i, musicBean, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sendLowStorage() {
        Message messageObtain = Message.obtain();
        messageObtain.what = 90;
        sendMessage(messageObtain);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sendPushRet(MusicBean musicBean, boolean duplicated) {
        Message messageObtain = Message.obtain();
        messageObtain.what = 30;
        messageObtain.arg1 = duplicated ? 1 : 0;
        messageObtain.obj = musicBean;
        sendMessage(messageObtain);
    }

    public static /* synthetic */ void sendPushRet$default(MusicPushImpl musicPushImpl, MusicBean musicBean, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        musicPushImpl.sendPushRet(musicBean, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sendRpkFile(WearableDeviceModel deviceModel, File file, int segmentLength, MusicBean musicBean) {
        xc6.b("sendRpkFile start " + file.getAbsolutePath());
        int iSendFile = DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE).sendFile(deviceModel.getDid(), 3, 4, file.getAbsolutePath(), segmentLength, new MusicPushImpl$sendRpkFile$taskId$1(this, musicBean));
        Message messageObtain = Message.obtain();
        messageObtain.what = 70;
        messageObtain.arg1 = iSendFile;
        sendMessage(messageObtain);
    }

    @Override // defpackage.tuc
    public void addMusicPushHandler(@Nullable suc musichandler) {
        if (musichandler == null) {
            xc6.b("MusicPushImpl addMusicPushHandler null");
            return;
        }
        Message messageObtain = Message.obtain();
        messageObtain.what = 1;
        messageObtain.obj = musichandler;
        sendMessage(messageObtain);
    }

    @Override // defpackage.tuc
    public void cancel() {
        xc6.b("MusicPushImpl cancel task");
        sendEmptyMessage(80);
    }

    @Override // defpackage.tuc
    public void flushComplete() {
        xc6.b("MusicPushImpl flushComplete");
        sendEmptyMessage(40);
    }

    @NotNull
    public final File getCacheFile() {
        return this.cacheFile;
    }

    @NotNull
    public final Service getService() {
        return this.service;
    }

    public final void onPushDeviceResultSuccess(boolean isSuccess, @Nullable byte[] id) {
        xc6.d("onPushDeviceSuccess id:" + id);
        Message messageObtain = Message.obtain();
        messageObtain.what = 50;
        messageObtain.obj = id;
        messageObtain.arg1 = isSuccess ? 0 : -1;
        sendMessage(messageObtain);
    }

    @Override // defpackage.tuc
    public void removeMusicPushHandler(@Nullable suc musichandler) {
        if (musichandler == null) {
            xc6.b("MusicPushImpl removeMusicPushHandler null");
            return;
        }
        Message messageObtain = Message.obtain();
        messageObtain.what = -1;
        messageObtain.obj = musichandler;
        sendMessage(messageObtain);
    }

    @Override // defpackage.tuc
    public void startPush(@Nullable List<MusicBean> list) {
        if (list != null) {
            Message messageObtain = Message.obtain();
            messageObtain.what = 10;
            messageObtain.obj = list;
            sendMessage(messageObtain);
        }
    }
}
