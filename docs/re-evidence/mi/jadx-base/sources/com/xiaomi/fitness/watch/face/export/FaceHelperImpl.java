package com.xiaomi.fitness.watch.face.export;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.miui.tsmclient.util.Constants;
import com.xiaomi.fit.fitness.parser.schema.FitnessReportKey;
import com.xiaomi.fitness.common.app.AppManager;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.NetworkExtKt;
import com.xiaomi.fitness.common.extensions.ToastExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.contact.export.DeviceContact;
import com.xiaomi.fitness.device.contact.export.DeviceSyncExtKt;
import com.xiaomi.fitness.device.contact.export.OnSyncCallback;
import com.xiaomi.fitness.device.contact.export.SyncResult;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.device.manager.export.bean.Feature;
import com.xiaomi.fitness.device.manager.export.bean.WatchInfo;
import com.xiaomi.fitness.main.export.ConfigPreference;
import com.xiaomi.fitness.net.extensions.ScopeExtKt;
import com.xiaomi.fitness.net.response.ApiException;
import com.xiaomi.fitness.watch.face.FaceInfoBase;
import com.xiaomi.fitness.watch.face.data.FaceDeviceConfig;
import com.xiaomi.fitness.watch.face.data.FaceEntranceRespV4;
import com.xiaomi.fitness.watch.face.data.FaceManager;
import com.xiaomi.fitness.watch.face.db.FaceBleMultiPhoto;
import com.xiaomi.fitness.watch.face.db.FaceCommonEntity;
import com.xiaomi.fitness.watch.face.db.WatchFaceDao;
import com.xiaomi.fitness.watch.face.db.WatchFaceDataBase;
import com.xiaomi.fitness.watch.face.event.FaceDeleteEvent;
import com.xiaomi.fitness.watch.face.event.FaceInstallEvent;
import com.xiaomi.fitness.watch.face.event.FaceReSycEvent;
import com.xiaomi.fitness.watch.face.export.FaceHelperImpl;
import com.xiaomi.fitness.watch.face.export.data.FaceData;
import com.xiaomi.fitness.watch.face.export.data.FaceDownloadResultV2;
import com.xiaomi.fitness.watch.face.export.data.WatchFace;
import com.xiaomi.fitness.watch.face.export.exportview.FaceIcon;
import com.xiaomi.fitness.watch.face.export.exportview.FaceInfoView;
import com.xiaomi.fitness.watch.face.export.exportview.FaceSizeConstant;
import com.xiaomi.fitness.watch.face.ext.FaceExtKt;
import com.xiaomi.fitness.watch.face.helper.FacePreference;
import com.xiaomi.fitness.watch.face.helper.ImageLoadUtil;
import com.xiaomi.fitness.watch.face.impl.Callback;
import com.xiaomi.fitness.watch.face.install.FaceInstallBaseImpl;
import com.xiaomi.fitness.watch.face.install.FaceInstallBleV1Impl;
import com.xiaomi.fitness.watch.face.install.FaceInstallBleV2Impl;
import com.xiaomi.fitness.watch.face.install.FaceInstallHuamiImpl;
import com.xiaomi.fitness.watch.face.market.DeviceFaceMarketPageManager;
import com.xiaomi.fitness.watch.face.request.FaceApiRequestV2;
import com.xiaomi.fitness.watch.face.request.FaceDetailResultV2;
import com.xiaomi.fitness.watch.face.request.FaceUnavailableListResponse;
import com.xiaomi.fitness.yrn_config.YRNConstants;
import com.xiaomi.wearable.yrn.export.YRNHelper;
import com.xiaomi.wearable.yrn.export.YRNHelperExtKt;
import defpackage.eu6;
import defpackage.ld8;
import defpackage.orf;
import defpackage.p1j;
import defpackage.qxg;
import defpackage.rxg;
import defpackage.s7r;
import defpackage.t5d;
import defpackage.uno;
import defpackage.v5r;
import defpackage.y5r;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt___RangesKt;
import kotlinx.coroutines.CoroutineScope;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000®\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\b\t\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0007\u0018\u00002\u00020\u0001B\n\b\u0007¢\u0006\u0005\b\u008f\u0001\u0010\u001bJG\u0010\f\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\b0\u0006H\u0002¢\u0006\u0004\b\f\u0010\rJ+\u0010\u0010\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u00022\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\b0\u0006H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J;\u0010\u0018\u001a\u00020\b2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\u00122\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00122\u000e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0012H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\bH\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u001d\u0010 \u001a\u00020\b2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0012H\u0002¢\u0006\u0004\b \u0010!J%\u0010%\u001a\u00020\b2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00040\u00122\u0006\u0010$\u001a\u00020#H\u0002¢\u0006\u0004\b%\u0010&J\u001f\u0010*\u001a\u00020\b2\u0006\u0010(\u001a\u00020'2\u0006\u0010)\u001a\u00020'H\u0002¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020\bH\u0002¢\u0006\u0004\b,\u0010\u001bJ7\u0010/\u001a\u00020\b2\u0006\u0010(\u001a\u00020'2\u0006\u0010)\u001a\u00020'2\u0006\u0010-\u001a\u00020\u00162\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010.\u001a\u00020\u0014H\u0002¢\u0006\u0004\b/\u00100J\u001f\u00103\u001a\u00020\b2\u0006\u00101\u001a\u00020'2\u0006\u00102\u001a\u00020'H\u0016¢\u0006\u0004\b3\u0010+J7\u00103\u001a\u00020\b2\u0006\u00105\u001a\u0002042\u0006\u00106\u001a\u00020\u00042\u0006\u00107\u001a\u00020#2\u0006\u00108\u001a\u00020#2\u0006\u00109\u001a\u00020#H\u0016¢\u0006\u0004\b3\u0010:J\u0017\u0010=\u001a\u00020\b2\u0006\u0010<\u001a\u00020;H\u0016¢\u0006\u0004\b=\u0010>J\u0017\u0010?\u001a\u00020\b2\u0006\u0010<\u001a\u00020;H\u0016¢\u0006\u0004\b?\u0010>J\u001f\u0010C\u001a\u00020\b2\u0006\u0010A\u001a\u00020@2\u0006\u0010B\u001a\u00020\u0004H\u0016¢\u0006\u0004\bC\u0010DJ!\u0010F\u001a\u00020\b2\b\u0010E\u001a\u0004\u0018\u00010\u00042\u0006\u00105\u001a\u00020'H\u0016¢\u0006\u0004\bF\u0010GJ?\u0010I\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u00022\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020H\u0012\u0004\u0012\u00020\b0\u00062\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\b0\u0006H\u0016¢\u0006\u0004\bI\u0010JJ'\u0010L\u001a\u00020\b2\u0006\u0010A\u001a\u00020@2\u0006\u0010-\u001a\u00020\u00162\u0006\u0010K\u001a\u00020#H\u0016¢\u0006\u0004\bL\u0010MJ/\u0010Q\u001a\u00020\b2\u0006\u0010A\u001a\u00020@2\u0006\u0010N\u001a\u00020\u00042\u0006\u0010O\u001a\u00020\u00042\u0006\u0010P\u001a\u00020\u0004H\u0016¢\u0006\u0004\bQ\u0010RJC\u0010V\u001a\u00020\b2\b\u0010S\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010O\u001a\u00020\u00042\u0006\u0010T\u001a\u00020#2\u0006\u0010U\u001a\u00020\u00042\u0006\u0010P\u001a\u00020\u0004H\u0016¢\u0006\u0004\bV\u0010WJ\u0019\u0010Y\u001a\u00020\b2\b\u0010X\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\bY\u0010ZJ\u0019\u0010[\u001a\u00020\b2\b\u0010X\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b[\u0010ZJ\u0017\u0010^\u001a\u00020\b2\b\u0010]\u001a\u0004\u0018\u00010\\¢\u0006\u0004\b^\u0010_J\r\u0010`\u001a\u00020\b¢\u0006\u0004\b`\u0010\u001bJ\u0017\u0010c\u001a\u00020\b2\u0006\u0010b\u001a\u00020aH\u0007¢\u0006\u0004\bc\u0010dJ\u0017\u0010g\u001a\u00020f2\u0006\u0010e\u001a\u00020\u0004H\u0016¢\u0006\u0004\bg\u0010hJ\u001f\u0010k\u001a\u00020\b2\u0006\u0010e\u001a\u00020\u00042\u0006\u0010j\u001a\u00020iH\u0016¢\u0006\u0004\bk\u0010lJ\u0017\u0010m\u001a\u00020i2\u0006\u0010e\u001a\u00020\u0004H\u0016¢\u0006\u0004\bm\u0010nJ\u001b\u0010p\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00140oH\u0016¢\u0006\u0004\bp\u0010qJ\u0017\u0010r\u001a\u00020\b2\u0006\u0010j\u001a\u00020iH\u0016¢\u0006\u0004\br\u0010sJ\u000f\u0010t\u001a\u00020iH\u0016¢\u0006\u0004\bt\u0010uJ\u000f\u0010v\u001a\u00020\bH\u0016¢\u0006\u0004\bv\u0010\u001bR\u0014\u0010w\u001a\u00020\u00048\u0002X\u0082D¢\u0006\u0006\n\u0004\bw\u0010xR\u001a\u0010z\u001a\b\u0012\u0004\u0012\u00020;0y8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bz\u0010{R%\u0010}\u001a\u00020|8\u0006@\u0006X\u0087.¢\u0006\u0015\n\u0004\b}\u0010~\u001a\u0005\b\u007f\u0010\u0080\u0001\"\u0006\b\u0081\u0001\u0010\u0082\u0001R'\u0010\u0083\u0001\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0016\n\u0005\b\u0083\u0001\u0010x\u001a\u0006\b\u0084\u0001\u0010\u0085\u0001\"\u0005\b\u0086\u0001\u0010ZR'\u0010\u0087\u0001\u001a\u00020i8\u0006@\u0006X\u0086\u000e¢\u0006\u0016\n\u0006\b\u0087\u0001\u0010\u0088\u0001\u001a\u0005\b\u0089\u0001\u0010u\"\u0005\b\u008a\u0001\u0010sR\u0019\u0010\u008b\u0001\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008b\u0001\u0010\u008c\u0001R%\u0010r\u001a\u00020i8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\br\u0010\u0088\u0001\u001a\u0005\b\u008d\u0001\u0010u\"\u0005\b\u008e\u0001\u0010s¨\u0006\u0090\u0001"}, d2 = {"Lcom/xiaomi/fitness/watch/face/export/FaceHelperImpl;", "Lcom/xiaomi/fitness/watch/face/export/FaceHelper;", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "device", "", "id", "Lkotlin/Function1;", "Lcom/xiaomi/fitness/watch/face/request/FaceDetailResultV2;", "", "success", "Lcom/xiaomi/fitness/net/response/ApiException;", "fail", "requestFaceDetail", "(Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "deviceModel", "firmwareVersion", "getFirmwareVersion", "(Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;Lkotlin/jvm/functions/Function1;)V", "", "unavailableIds", "Lcom/xiaomi/fitness/watch/face/export/data/WatchFace;", "localList", "Lcom/xiaomi/fitness/watch/face/export/data/FaceData;", "watchfaceList", "removeUnavailableFaces", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "pushExpiredMessageToDevice", "()V", "Lrxg;", "createBasicNotifyData", "()Lrxg;", "notifyData", "sendNotificationsToDevice", "(Ljava/util/List;)V", "ids", "", "groupIndex", "removeUnavailableFacesByGroup", "(Ljava/util/List;I)V", "Lcom/xiaomi/fitness/watch/face/export/exportview/FaceInfoView;", "bgView", "upView", "resetState", "(Lcom/xiaomi/fitness/watch/face/export/exportview/FaceInfoView;Lcom/xiaomi/fitness/watch/face/export/exportview/FaceInfoView;)V", "showHuamiFace", "faceData", "curFace", "showBleFace", "(Lcom/xiaomi/fitness/watch/face/export/exportview/FaceInfoView;Lcom/xiaomi/fitness/watch/face/export/exportview/FaceInfoView;Lcom/xiaomi/fitness/watch/face/export/data/FaceData;Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;Lcom/xiaomi/fitness/watch/face/export/data/WatchFace;)V", "bottomIcon", "topIcon", "loadFace", "Landroid/widget/ImageView;", "view", "url", Constants.DEVICE_TYPE_WEAR, "h", "radius", "(Landroid/widget/ImageView;Ljava/lang/String;III)V", "Lcom/xiaomi/fitness/watch/face/export/IFaceListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "addFaceEventListener", "(Lcom/xiaomi/fitness/watch/face/export/IFaceListener;)V", "removeFaceEventListener", "Landroid/content/Context;", "context", "newRoute", "gotoFacePage", "(Landroid/content/Context;Ljava/lang/String;)V", "icon", "loadFaceEntranceImg", "(Ljava/lang/String;Lcom/xiaomi/fitness/watch/face/export/exportview/FaceInfoView;)V", "Lcom/xiaomi/fitness/watch/face/data/FaceEntranceRespV4;", "requestLoadFaceEntranceV4", "(Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "position", "gotoFaceFromDeviceTab", "(Landroid/content/Context;Lcom/xiaomi/fitness/watch/face/export/data/FaceData;I)V", "tabId", "source", "exposeSource", "gotoFaceTabList", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "model", "positionId", "contentSource", "gotoFaceDetail", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", FaceInfoBase.FACE_ID, "notifyFaceChanged", "(Ljava/lang/String;)V", "signWatchFace", "Ls7r;", "packet", "onSyncFaceFinish", "(Ls7r;)V", "syncLocalFace", "Lorf;", "event", "onFaceSetEvent", "(Lorf;)V", "did", "", "getEnterFaceEntranceTime", "(Ljava/lang/String;)J", "", "show", "setFaceEntranceRedPoint", "(Ljava/lang/String;Z)V", "getFaceEntranceRedPoint", "(Ljava/lang/String;)Z", "", "getFaceList", "()Ljava/util/Map;", "showOldMarket", "(Z)V", "supportImageSegment", "()Z", "testDeleteAll", "TAG", "Ljava/lang/String;", "", "mFaceListeners", "Ljava/util/List;", "Lcom/xiaomi/fitness/watch/face/request/FaceApiRequestV2;", "faceApiRequestV2", "Lcom/xiaomi/fitness/watch/face/request/FaceApiRequestV2;", "getFaceApiRequestV2", "()Lcom/xiaomi/fitness/watch/face/request/FaceApiRequestV2;", "setFaceApiRequestV2", "(Lcom/xiaomi/fitness/watch/face/request/FaceApiRequestV2;)V", "currentFaceId", "getCurrentFaceId", "()Ljava/lang/String;", "setCurrentFaceId", "removeInvalidFaces", "Z", "getRemoveInvalidFaces", "setRemoveInvalidFaces", FitnessReportKey.groupCount, "I", "getShowOldMarket", "setShowOldMarket", "<init>", "watch-face_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nFaceHelperImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FaceHelperImpl.kt\ncom/xiaomi/fitness/watch/face/export/FaceHelperImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,639:1\n1#2:640\n37#3:641\n36#3,3:642\n1863#4,2:645\n126#5:647\n153#5,3:648\n*S KotlinDebug\n*F\n+ 1 FaceHelperImpl.kt\ncom/xiaomi/fitness/watch/face/export/FaceHelperImpl\n*L\n419#1:641\n419#1:642,3\n442#1:645,2\n628#1:647\n628#1:648,3\n*E\n"})
public final class FaceHelperImpl implements FaceHelper {
    public FaceApiRequestV2 faceApiRequestV2;
    private boolean removeInvalidFaces;
    private boolean showOldMarket;

    @NotNull
    private final String TAG = "FaceHelperImpl";

    @NotNull
    private final List<IFaceListener> mFaceListeners = new ArrayList();

    @NotNull
    private String currentFaceId = "";
    private int groupCount = 5;

    /* JADX INFO: renamed from: com.xiaomi.fitness.watch.face.export.FaceHelperImpl$notifyFaceChanged$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.watch.face.export.FaceHelperImpl$notifyFaceChanged$1", f = "FaceHelperImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nFaceHelperImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FaceHelperImpl.kt\ncom/xiaomi/fitness/watch/face/export/FaceHelperImpl$notifyFaceChanged$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,639:1\n1863#2,2:640\n*S KotlinDebug\n*F\n+ 1 FaceHelperImpl.kt\ncom/xiaomi/fitness/watch/face/export/FaceHelperImpl$notifyFaceChanged$1\n*L\n288#1:640,2\n*E\n"})
    public static final class C33751 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $faceId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C33751(String str, Continuation<? super C33751> continuation) {
            super(2, continuation);
            this.$faceId = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return FaceHelperImpl.this.new C33751(this.$faceId, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            List list = FaceHelperImpl.this.mFaceListeners;
            String str = this.$faceId;
            FaceHelperImpl faceHelperImpl = FaceHelperImpl.this;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((IFaceListener) it.next()).onFaceChanged(str == null ? faceHelperImpl.getCurrentFaceId() : str);
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C33751) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.watch.face.export.FaceHelperImpl$onSyncFaceFinish$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.watch.face.export.FaceHelperImpl$onSyncFaceFinish$1", f = "FaceHelperImpl.kt", i = {0, 0}, l = {336, 357}, m = "invokeSuspend", n = {"list", "watchFace"}, s = {"L$0", "L$2"})
    @SourceDebugExtension({"SMAP\nFaceHelperImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FaceHelperImpl.kt\ncom/xiaomi/fitness/watch/face/export/FaceHelperImpl$onSyncFaceFinish$1\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,639:1\n37#2:640\n36#2,3:641\n*S KotlinDebug\n*F\n+ 1 FaceHelperImpl.kt\ncom/xiaomi/fitness/watch/face/export/FaceHelperImpl$onSyncFaceFinish$1\n*L\n358#1:640\n358#1:641,3\n*E\n"})
    public static final class C33761 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ WearableDeviceModel $device;
        final /* synthetic */ y5r[] $faceList;
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        final /* synthetic */ FaceHelperImpl this$0;

        /* JADX INFO: renamed from: com.xiaomi.fitness.watch.face.export.FaceHelperImpl$onSyncFaceFinish$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.xiaomi.fitness.watch.face.export.FaceHelperImpl$onSyncFaceFinish$1$1", f = "FaceHelperImpl.kt", i = {}, l = {345}, m = "invokeSuspend", n = {}, s = {})
        @SourceDebugExtension({"SMAP\nFaceHelperImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FaceHelperImpl.kt\ncom/xiaomi/fitness/watch/face/export/FaceHelperImpl$onSyncFaceFinish$1$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,639:1\n1557#2:640\n1628#2,3:641\n*S KotlinDebug\n*F\n+ 1 FaceHelperImpl.kt\ncom/xiaomi/fitness/watch/face/export/FaceHelperImpl$onSyncFaceFinish$1$1\n*L\n345#1:640\n345#1:641,3\n*E\n"})
        public static final class C08081 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ WearableDeviceModel $device;
            final /* synthetic */ List<WatchFace> $list;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C08081(WearableDeviceModel wearableDeviceModel, List<WatchFace> list, Continuation<? super C08081> continuation) {
                super(2, continuation);
                this.$device = wearableDeviceModel;
                this.$list = list;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C08081(this.$device, this.$list, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    WatchFaceDao watchFaceDao = WatchFaceDataBase.INSTANCE.getInstance().watchFaceDao();
                    String did = this.$device.getDid();
                    List<WatchFace> list = this.$list;
                    ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((WatchFace) it.next()).getId());
                    }
                    this.label = 1;
                    if (watchFaceDao.deleteOtherWatchFace(did, arrayList, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C08081) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C33761(y5r[] y5rVarArr, FaceHelperImpl faceHelperImpl, WearableDeviceModel wearableDeviceModel, Continuation<? super C33761> continuation) {
            super(2, continuation);
            this.$faceList = y5rVarArr;
            this.this$0 = faceHelperImpl;
            this.$device = wearableDeviceModel;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$0(FaceHelperImpl faceHelperImpl, List list, FaceUnavailableListResponse faceUnavailableListResponse) {
            String str = faceHelperImpl.TAG;
            List<String> unavailable_id_list = faceUnavailableListResponse.getUnavailable_id_list();
            String string = Arrays.toString(unavailable_id_list != null ? (String[]) unavailable_id_list.toArray(new String[0]) : null);
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            Logger.i(str, "checkFaceUnavailable success: " + string);
            List<String> unavailable_id_list2 = faceUnavailableListResponse.getUnavailable_id_list();
            if (unavailable_id_list2 != null && !unavailable_id_list2.isEmpty()) {
                faceHelperImpl.removeUnavailableFaces(faceUnavailableListResponse.getUnavailable_id_list(), list, faceUnavailableListResponse.getWatchface_list());
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$1(FaceHelperImpl faceHelperImpl, ApiException apiException) {
            Logger.i(faceHelperImpl.TAG, "checkFaceUnavailable fail: " + apiException);
            return Unit.INSTANCE;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C33761(this.$faceList, this.this$0, this.$device, continuation);
        }

        /* JADX WARN: Code duplicated, block: B:12:0x0041  */
        /* JADX WARN: Code duplicated, block: B:14:0x0073  */
        /* JADX WARN: Code duplicated, block: B:16:0x009c A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:19:0x00a1  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0071 -> B:20:0x00af). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x009a -> B:17:0x009d). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                Method dump skipped, instruction units count: 344
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.fitness.watch.face.export.FaceHelperImpl.C33761.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C33761) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.watch.face.export.FaceHelperImpl$showBleFace$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.watch.face.export.FaceHelperImpl$showBleFace$1", f = "FaceHelperImpl.kt", i = {}, l = {532, 565}, m = "invokeSuspend", n = {}, s = {})
    public static final class C33771 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ FaceInfoView $bgView;
        final /* synthetic */ WatchFace $curFace;
        final /* synthetic */ WearableDeviceModel $device;
        final /* synthetic */ FaceData.BleExt $ext;
        final /* synthetic */ FaceData $faceData;
        final /* synthetic */ Ref.ObjectRef<String> $styleUrl;
        final /* synthetic */ FaceInfoView $upView;
        int label;
        final /* synthetic */ FaceHelperImpl this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C33771(WearableDeviceModel wearableDeviceModel, WatchFace watchFace, FaceInfoView faceInfoView, FaceData.BleExt bleExt, FaceData faceData, FaceHelperImpl faceHelperImpl, Ref.ObjectRef<String> objectRef, FaceInfoView faceInfoView2, Continuation<? super C33771> continuation) {
            super(2, continuation);
            this.$device = wearableDeviceModel;
            this.$curFace = watchFace;
            this.$bgView = faceInfoView;
            this.$ext = bleExt;
            this.$faceData = faceData;
            this.this$0 = faceHelperImpl;
            this.$styleUrl = objectRef;
            this.$upView = faceInfoView2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C33771(this.$device, this.$curFace, this.$bgView, this.$ext, this.$faceData, this.this$0, this.$styleUrl, this.$upView, continuation);
        }

        /* JADX WARN: Code duplicated, block: B:54:0x016f  */
        /* JADX WARN: Code duplicated, block: B:56:0x0175  */
        /* JADX WARN: Code duplicated, block: B:57:0x017b  */
        /* JADX WARN: Code duplicated, block: B:82:0x0223  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object watchFace;
            FaceData.BleExt ble_ext;
            Object watchFace2;
            FaceData.BleExt bleExt;
            String bottom_background;
            String md5;
            FaceCommonEntity faceCommonEntity;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            final String spiritColor = null;
            if (i != 0) {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                    watchFace = obj;
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    watchFace2 = obj;
                }
                faceCommonEntity = (FaceCommonEntity) watchFace2;
                if (faceCommonEntity != null) {
                    spiritColor = faceCommonEntity.getUpperColor();
                }
                Logger.i(this.this$0.TAG, "spiritColor: " + spiritColor);
                FaceManager faceManager = FaceManager.INSTANCE;
                String str = this.$styleUrl.element;
                final FaceInfoView faceInfoView = this.$upView;
                faceManager.loadFaceUrl(str, faceInfoView, (4092 & 4) != 0 ? false : false, (4092 & 8) != 0 ? false : false, (4092 & 16) != 0 ? false : true, (4092 & 32) != 0 ? false : false, (4092 & 64) != 0 ? null : new Callback() { // from class: com.xiaomi.fitness.watch.face.export.FaceHelperImpl.showBleFace.1.1
                    @Override // com.xiaomi.fitness.watch.face.impl.Callback
                    public void onReady(Drawable drawable) {
                        Intrinsics.checkNotNullParameter(drawable, "drawable");
                        faceInfoView.setImageDrawable(drawable);
                        faceInfoView.tintColor(spiritColor);
                    }
                }, (4092 & 128) != 0 ? false : false, (4092 & 256) != 0 ? false : false, (4092 & 512) != 0 ? 0 : 0, (4092 & 1024) != 0 ? 0 : 0, (4092 & 2048) != 0 ? null : null);
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            WatchFaceDao watchFaceDao = WatchFaceDataBase.INSTANCE.getInstance().watchFaceDao();
            String str2 = this.$device.getDid() + this.$curFace.getId();
            this.label = 1;
            watchFace = watchFaceDao.getWatchFace(str2, this);
            if (watchFace == coroutine_suspended) {
                return coroutine_suspended;
            }
            FaceCommonEntity faceCommonEntity2 = (FaceCommonEntity) watchFace;
            FaceManager faceManager2 = FaceManager.INSTANCE;
            if (!faceManager2.isInstalled(this.$curFace.getId()) || faceCommonEntity2 == null) {
                FaceData.BleExt bleExt2 = this.$ext;
                faceManager2.loadFaceUrl(bleExt2 != null ? bleExt2.getBottom_background() : null, this.$bgView, (4092 & 4) != 0 ? false : false, (4092 & 8) != 0 ? false : false, (4092 & 16) != 0 ? false : true, (4092 & 32) != 0 ? false : false, (4092 & 64) != 0 ? null : null, (4092 & 128) != 0 ? false : false, (4092 & 256) != 0 ? false : false, (4092 & 512) != 0 ? 0 : 0, (4092 & 1024) != 0 ? 0 : 0, (4092 & 2048) != 0 ? null : null);
            } else {
                String path = faceCommonEntity2.getPath();
                if (path == null || path.length() == 0 || (md5 = faceCommonEntity2.getMd5()) == null || md5.length() == 0) {
                    List<FaceBleMultiPhoto> multiPhotoDataList = faceCommonEntity2.getMultiPhotoDataList();
                    if (multiPhotoDataList == null || multiPhotoDataList.isEmpty()) {
                        FaceData.BleExt bleExt3 = this.$ext;
                        faceManager2.loadFaceUrl(bleExt3 != null ? bleExt3.getBottom_background() : null, this.$bgView, (4092 & 4) != 0 ? false : false, (4092 & 8) != 0 ? false : false, (4092 & 16) != 0 ? false : true, (4092 & 32) != 0 ? false : false, (4092 & 64) != 0 ? null : null, (4092 & 128) != 0 ? false : false, (4092 & 256) != 0 ? false : false, (4092 & 512) != 0 ? 0 : 0, (4092 & 1024) != 0 ? 0 : 0, (4092 & 2048) != 0 ? null : null);
                    } else {
                        String[] backgroundImageList = this.$curFace.getBackgroundImageList();
                        if (backgroundImageList == null || backgroundImageList.length == 0) {
                            FaceManager faceManager3 = FaceManager.INSTANCE;
                            bleExt = this.$ext;
                            if (bleExt != null) {
                                bottom_background = bleExt.getBottom_background();
                            } else {
                                bottom_background = null;
                            }
                            faceManager3.loadFaceUrl(bottom_background, this.$bgView, (4092 & 4) != 0 ? false : false, (4092 & 8) != 0 ? false : false, (4092 & 16) != 0 ? false : true, (4092 & 32) != 0 ? false : false, (4092 & 64) != 0 ? null : null, (4092 & 128) != 0 ? false : false, (4092 & 256) != 0 ? false : false, (4092 & 512) != 0 ? 0 : 0, (4092 & 1024) != 0 ? 0 : 0, (4092 & 2048) != 0 ? null : null);
                        } else {
                            boolean z = false;
                            for (String str3 : this.$curFace.getBackgroundImageList()) {
                                List<FaceBleMultiPhoto> multiPhotoDataList2 = faceCommonEntity2.getMultiPhotoDataList();
                                Intrinsics.checkNotNull(multiPhotoDataList2);
                                Iterator<FaceBleMultiPhoto> it = multiPhotoDataList2.iterator();
                                while (it.hasNext()) {
                                    if (Intrinsics.areEqual(str3, it.next().getMultiMd5())) {
                                        FaceManager faceManager4 = FaceManager.INSTANCE;
                                        List<FaceBleMultiPhoto> multiPhotoDataList3 = faceCommonEntity2.getMultiPhotoDataList();
                                        Intrinsics.checkNotNull(multiPhotoDataList3);
                                        faceManager4.loadFaceFile(new File(multiPhotoDataList3.get(0).getMultiPath() + ".png"), this.$bgView, (108 & 4) != 0 ? false : false, (108 & 8) != 0 ? false : false, (108 & 16) != 0 ? false : true, (108 & 32) != 0 ? false : false, (108 & 64) != 0 ? false : false);
                                        z = true;
                                        break;
                                    }
                                }
                            }
                            if (!z) {
                                FaceManager faceManager5 = FaceManager.INSTANCE;
                                bleExt = this.$ext;
                                if (bleExt != null) {
                                    bottom_background = bleExt.getBottom_background();
                                } else {
                                    bottom_background = null;
                                }
                                faceManager5.loadFaceUrl(bottom_background, this.$bgView, (4092 & 4) != 0 ? false : false, (4092 & 8) != 0 ? false : false, (4092 & 16) != 0 ? false : true, (4092 & 32) != 0 ? false : false, (4092 & 64) != 0 ? null : null, (4092 & 128) != 0 ? false : false, (4092 & 256) != 0 ? false : false, (4092 & 512) != 0 ? 0 : 0, (4092 & 1024) != 0 ? 0 : 0, (4092 & 2048) != 0 ? null : null);
                            }
                        }
                    }
                } else if (Intrinsics.areEqual(this.$curFace.getBackgroundImage(), faceCommonEntity2.getMd5())) {
                    faceManager2.loadFaceFile(new File(faceCommonEntity2.getPath() + ".png"), this.$bgView, (108 & 4) != 0 ? false : false, (108 & 8) != 0 ? false : false, (108 & 16) != 0 ? false : true, (108 & 32) != 0 ? false : false, (108 & 64) != 0 ? false : false);
                } else {
                    FaceData.BleExt bleExt4 = this.$ext;
                    faceManager2.loadFaceUrl(bleExt4 != null ? bleExt4.getBottom_background() : null, this.$bgView, (4092 & 4) != 0 ? false : false, (4092 & 8) != 0 ? false : false, (4092 & 16) != 0 ? false : true, (4092 & 32) != 0 ? false : false, (4092 & 64) != 0 ? null : null, (4092 & 128) != 0 ? false : false, (4092 & 256) != 0 ? false : false, (4092 & 512) != 0 ? 0 : 0, (4092 & 1024) != 0 ? 0 : 0, (4092 & 2048) != 0 ? null : null);
                }
            }
            FaceManager faceManager6 = FaceManager.INSTANCE;
            if (faceManager6.isInstalled(this.$curFace.getId()) && (ble_ext = this.$faceData.getBle_ext()) != null && ble_ext.hasSpirit()) {
                if (FaceExtKt.isSupportZhouHaiPhotoFace(this.$device)) {
                    WatchFaceDao watchFaceDao2 = WatchFaceDataBase.INSTANCE.getInstance().watchFaceDao();
                    String did = this.$device.getDid();
                    String id = this.$curFace.getId();
                    this.label = 2;
                    watchFace2 = watchFaceDao2.getWatchFace(did, id, this);
                    if (watchFace2 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    faceCommonEntity = (FaceCommonEntity) watchFace2;
                    if (faceCommonEntity != null) {
                        spiritColor = faceCommonEntity.getUpperColor();
                    }
                } else {
                    spiritColor = this.$curFace.getSpiritColor();
                }
                Logger.i(this.this$0.TAG, "spiritColor: " + spiritColor);
                FaceManager faceManager7 = FaceManager.INSTANCE;
                String str4 = this.$styleUrl.element;
                final FaceInfoView faceInfoView2 = this.$upView;
                faceManager7.loadFaceUrl(str4, faceInfoView2, (4092 & 4) != 0 ? false : false, (4092 & 8) != 0 ? false : false, (4092 & 16) != 0 ? false : true, (4092 & 32) != 0 ? false : false, (4092 & 64) != 0 ? null : new Callback() { // from class: com.xiaomi.fitness.watch.face.export.FaceHelperImpl.showBleFace.1.1
                    @Override // com.xiaomi.fitness.watch.face.impl.Callback
                    public void onReady(Drawable drawable) {
                        Intrinsics.checkNotNullParameter(drawable, "drawable");
                        faceInfoView2.setImageDrawable(drawable);
                        faceInfoView2.tintColor(spiritColor);
                    }
                }, (4092 & 128) != 0 ? false : false, (4092 & 256) != 0 ? false : false, (4092 & 512) != 0 ? 0 : 0, (4092 & 1024) != 0 ? 0 : 0, (4092 & 2048) != 0 ? null : null);
            } else if (this.$ext.isPortraitFace()) {
                faceManager6.loadFaceUrl(this.$faceData.getIcon(), this.$upView, (4092 & 4) != 0 ? false : false, (4092 & 8) != 0 ? false : false, (4092 & 16) != 0 ? false : true, (4092 & 32) != 0 ? false : false, (4092 & 64) != 0 ? null : null, (4092 & 128) != 0 ? false : false, (4092 & 256) != 0 ? false : false, (4092 & 512) != 0 ? 0 : 0, (4092 & 1024) != 0 ? 0 : 0, (4092 & 2048) != 0 ? null : null);
            } else {
                faceManager6.loadFaceUrl(this.$styleUrl.element, this.$upView, (4092 & 4) != 0 ? false : false, (4092 & 8) != 0 ? false : false, (4092 & 16) != 0 ? false : true, (4092 & 32) != 0 ? false : false, (4092 & 64) != 0 ? null : null, (4092 & 128) != 0 ? false : false, (4092 & 256) != 0 ? false : false, (4092 & 512) != 0 ? 0 : 0, (4092 & 1024) != 0 ? 0 : 0, (4092 & 2048) != 0 ? null : null);
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C33771) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.watch.face.export.FaceHelperImpl$signWatchFace$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.watch.face.export.FaceHelperImpl$signWatchFace$1", f = "FaceHelperImpl.kt", i = {}, l = {308}, m = "invokeSuspend", n = {}, s = {})
    public static final class C33781 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ WearableDeviceModel $deviceModel;
        final /* synthetic */ String $faceId;
        int label;
        final /* synthetic */ FaceHelperImpl this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C33781(WearableDeviceModel wearableDeviceModel, FaceHelperImpl faceHelperImpl, String str, Continuation<? super C33781> continuation) {
            super(2, continuation);
            this.$deviceModel = wearableDeviceModel;
            this.this$0 = faceHelperImpl;
            this.$faceId = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$1(final FaceHelperImpl faceHelperImpl, FaceInstallBaseImpl faceInstallBaseImpl, String str, FaceDownloadResultV2 faceDownloadResultV2) {
            Logger.i(faceHelperImpl.TAG, "requestDownload success: " + faceDownloadResultV2.getLicense());
            faceInstallBaseImpl.preInstall(str, null, 0L, 0L, true, faceDownloadResultV2.getLicense(), faceDownloadResultV2.getSign(), Integer.valueOf(faceDownloadResultV2.getTrailDuration()), new Function3() { // from class: com.xiaomi.fitness.watch.face.export.c
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return FaceHelperImpl.C33781.invokeSuspend$lambda$1$lambda$0(faceHelperImpl, ((Boolean) obj).booleanValue(), ((Integer) obj2).intValue(), (Integer) obj3);
                }
            });
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$1$lambda$0(FaceHelperImpl faceHelperImpl, boolean z, int i, Integer num) {
            Logger.i(faceHelperImpl.TAG, "prepare install success, sign only");
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$2(FaceHelperImpl faceHelperImpl, ApiException apiException) {
            Logger.e(faceHelperImpl.TAG, "requestDownload fail: " + apiException);
            return Unit.INSTANCE;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C33781(this.$deviceModel, this.this$0, this.$faceId, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            final FaceInstallBaseImpl faceInstallBleV2Impl;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                boolean z = (DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getDeviceCapability(this.$deviceModel.getDid()) & 4194304) == 4194304;
                if (DeviceModelExtKt.isHuaMi(this.$deviceModel)) {
                    faceInstallBleV2Impl = new FaceInstallHuamiImpl(this.$deviceModel);
                } else {
                    faceInstallBleV2Impl = z ? new FaceInstallBleV2Impl(this.$deviceModel) : new FaceInstallBleV1Impl(this.$deviceModel);
                }
                FaceApiRequestV2 faceApiRequestV2 = this.this$0.getFaceApiRequestV2();
                String did = this.$deviceModel.getDid();
                String model = DeviceModelExtKt.getModel(this.$deviceModel);
                final String str = this.$faceId;
                String str2 = str == null ? "" : str;
                final FaceHelperImpl faceHelperImpl = this.this$0;
                Function1 function1 = new Function1() { // from class: com.xiaomi.fitness.watch.face.export.d
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2(Object obj2) {
                        return FaceHelperImpl.C33781.invokeSuspend$lambda$1(faceHelperImpl, faceInstallBleV2Impl, str, (FaceDownloadResultV2) obj2);
                    }
                };
                final FaceHelperImpl faceHelperImpl2 = this.this$0;
                Function1 function2 = new Function1() { // from class: com.xiaomi.fitness.watch.face.export.e
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2(Object obj2) {
                        return FaceHelperImpl.C33781.invokeSuspend$lambda$2(faceHelperImpl2, (ApiException) obj2);
                    }
                };
                this.label = 1;
                if (faceApiRequestV2.requestDownload(did, model, str2, (24 & 8) != 0 ? false : false, (24 & 16) != 0 ? null : null, function1, function2, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C33781) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public FaceHelperImpl() {
        ld8.c().p(this);
    }

    private final rxg createBasicNotifyData() {
        rxg rxgVar = new rxg();
        rxgVar.c = ApplicationExtKt.getApplication().getPackageName();
        rxgVar.j = ApplicationExtKt.getApplication().getPackageName();
        String string = ApplicationExtKt.getApplication().getString(p1j.f29911a);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        rxgVar.d = string;
        rxgVar.e = string;
        rxgVar.f = string;
        rxgVar.g = string;
        rxgVar.h = new SimpleDateFormat("yyyyMMdd'T'HHmmss").format(new Date(System.currentTimeMillis()));
        rxgVar.l = 0;
        return rxgVar;
    }

    private final void getFirmwareVersion(WearableDeviceModel deviceModel, final Function1<? super String, Unit> firmwareVersion) {
        if (!deviceModel.getIsDeviceConnected()) {
            firmwareVersion.invoke2("");
            return;
        }
        String firmwareVersion2 = DeviceModelExtKt.getFirmwareVersion(deviceModel);
        if (firmwareVersion2 == null || firmwareVersion2.length() == 0) {
            deviceModel.readWatchInfo(new eu6<WatchInfo>() { // from class: com.xiaomi.fitness.watch.face.export.FaceHelperImpl.getFirmwareVersion.1
                @Override // defpackage.eu6
                public void onError(int errorCode) {
                    Logger.i(FaceHelperImpl.this.TAG, "readWatchInfo fail: " + errorCode);
                    firmwareVersion.invoke2("");
                }

                @Override // defpackage.eu6
                public void onResult(WatchInfo result) {
                    String firmwareVersion3;
                    Logger.i(FaceHelperImpl.this.TAG, "readWatchInfo: " + (result != null ? result.getFirmwareVersion() : null));
                    Function1<String, Unit> function1 = firmwareVersion;
                    if (result == null || (firmwareVersion3 = result.getFirmwareVersion()) == null) {
                        firmwareVersion3 = "";
                    }
                    function1.invoke2(firmwareVersion3);
                }
            });
            return;
        }
        String firmwareVersion3 = DeviceModelExtKt.getFirmwareVersion(deviceModel);
        Intrinsics.checkNotNull(firmwareVersion3);
        firmwareVersion.invoke2(firmwareVersion3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit gotoFaceDetail$lambda$3(FaceHelperImpl this$0, String str, String contentSource, String exposeSource, int i, String source, FaceDetailResultV2 it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(contentSource, "$contentSource");
        Intrinsics.checkNotNullParameter(exposeSource, "$exposeSource");
        Intrinsics.checkNotNullParameter(source, "$source");
        Intrinsics.checkNotNullParameter(it, "it");
        if (it.getWatchFace().getId().length() == 0) {
            Logger.i(this$0.TAG, "may be " + str + " not exist");
        } else {
            FaceSizeConstant faceSizeConstant = FaceSizeConstant.INSTANCE;
            FaceDeviceConfig deviceConfig = it.getDeviceConfig();
            faceSizeConstant.setCurrentType(deviceConfig != null ? deviceConfig.getShape() : 0);
            DeviceFaceMarketPageManager.INSTANCE.toFaceDetailPage(ApplicationExtKt.getApplication(), it.getWatchFace(), contentSource, exposeSource, i, source);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit gotoFaceDetail$lambda$4(FaceHelperImpl this$0, ApiException it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        Logger.i(this$0.TAG, "gotoFaceDetail fail: " + it.getErrorCode());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit loadFace$lambda$0(FaceHelperImpl this$0, WearableDeviceModel device, FaceInfoView bottomIcon, FaceInfoView topIcon, WatchFace watchFace, FaceDetailResultV2 it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(device, "$device");
        Intrinsics.checkNotNullParameter(bottomIcon, "$bottomIcon");
        Intrinsics.checkNotNullParameter(topIcon, "$topIcon");
        Intrinsics.checkNotNullParameter(it, "it");
        Logger.i(this$0.TAG, "face out view load success: " + it.getWatchFace());
        if (DeviceModelExtKt.isHuaMi(device)) {
            this$0.showHuamiFace();
        } else if (DeviceModelExtKt.isBluetooth(device)) {
            this$0.showBleFace(bottomIcon, topIcon, it.getWatchFace(), device, watchFace);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit loadFace$lambda$1(FaceHelperImpl this$0, ApiException it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        Logger.i(this$0.TAG, "face out view load fail: " + it.getErrorCode());
        return Unit.INSTANCE;
    }

    private final void pushExpiredMessageToDevice() {
        ArrayList arrayList = new ArrayList();
        rxg rxgVarCreateBasicNotifyData = createBasicNotifyData();
        rxgVarCreateBasicNotifyData.c = ApplicationExtKt.getApplication().getPackageName();
        rxgVarCreateBasicNotifyData.e = ApplicationExtKt.getApplication().getString(p1j.x2);
        rxgVarCreateBasicNotifyData.g = ApplicationExtKt.getApplication().getString(p1j.w2);
        arrayList.add(rxgVarCreateBasicNotifyData);
        sendNotificationsToDevice(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void removeUnavailableFaces(List<String> unavailableIds, List<WatchFace> localList, List<FaceData> watchfaceList) {
        Object obj;
        Object next;
        this.removeInvalidFaces = true;
        ArrayList arrayList = new ArrayList();
        boolean z = false;
        for (String str : unavailableIds) {
            Iterator<T> it = localList.iterator();
            do {
                obj = null;
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!Intrinsics.areEqual(((WatchFace) next).getId(), str));
            WatchFace watchFace = (WatchFace) next;
            if (watchFace == null || !watchFace.getOnTrial()) {
                if (watchfaceList != null) {
                    for (Object obj2 : watchfaceList) {
                        if (Intrinsics.areEqual(((FaceData) obj2).getId(), str)) {
                            obj = obj2;
                            break;
                        }
                    }
                    FaceData faceData = (FaceData) obj;
                    if (faceData != null && faceData.buyWithVip()) {
                        z = true;
                    }
                }
                arrayList.add(str);
            }
        }
        removeUnavailableFacesByGroup(arrayList, 0);
        if (z) {
            pushExpiredMessageToDevice();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void removeUnavailableFacesByGroup(final List<String> ids, final int groupIndex) {
        if (ids.isEmpty()) {
            return;
        }
        int i = this.groupCount;
        final int i2 = groupIndex * i;
        final int iCoerceAtMost = RangesKt___RangesKt.coerceAtMost((groupIndex + 1) * i, ids.size());
        List<String> listSubList = ids.subList(i2, iCoerceAtMost);
        final AtomicInteger atomicInteger = new AtomicInteger(0);
        for (final String str : listSubList) {
            s7r s7rVar = new s7r();
            s7rVar.e = 4;
            s7rVar.f = 2;
            v5r v5rVar = new v5r();
            v5rVar.C(str);
            s7rVar.e0(v5rVar);
            DeviceContact.DefaultImpls.call$default(DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE), s7rVar, true, new OnSyncCallback() { // from class: com.xiaomi.fitness.watch.face.export.FaceHelperImpl$removeUnavailableFacesByGroup$1$1
                @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
                public void onError(String did, int type, int code) {
                    Logger.i(this.this$0.TAG, "removeUnavailableFaces " + str + " fail: " + code);
                    int iIncrementAndGet = atomicInteger.incrementAndGet();
                    int i3 = iCoerceAtMost;
                    if (iIncrementAndGet == i3 - i2) {
                        if (i3 == ids.size()) {
                            this.this$0.syncLocalFace();
                        } else {
                            this.this$0.removeUnavailableFacesByGroup(ids, groupIndex + 1);
                        }
                    }
                }

                @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
                public void onSuccess(String did, int type, SyncResult result) {
                    s7r packet;
                    v5r v5rVarG;
                    Logger.i(this.this$0.TAG, "removeUnavailableFaces: " + str + " " + ((result == null || (packet = result.getPacket()) == null || (v5rVarG = packet.G()) == null) ? null : Boolean.valueOf(v5rVarG.v())));
                    int iIncrementAndGet = atomicInteger.incrementAndGet();
                    int i3 = iCoerceAtMost;
                    if (iIncrementAndGet == i3 - i2) {
                        if (i3 == ids.size()) {
                            this.this$0.syncLocalFace();
                        } else {
                            this.this$0.removeUnavailableFacesByGroup(ids, groupIndex + 1);
                        }
                    }
                }
            }, 0, 8, null);
        }
    }

    private final void requestFaceDetail(WearableDeviceModel device, String id, Function1<? super FaceDetailResultV2, Unit> success, Function1<? super ApiException, Unit> fail) {
        FaceApiRequestV2 faceApiRequestV2 = getFaceApiRequestV2();
        String model = DeviceModelExtKt.getModel(device);
        String firmwareVersion = DeviceModelExtKt.getFirmwareVersion(device);
        if (firmwareVersion == null) {
            firmwareVersion = "";
        }
        FaceApiRequestV2.getFaceDetail$default(faceApiRequestV2, model, id, firmwareVersion, null, success, fail, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit requestLoadFaceEntranceV4$lambda$2(FaceHelperImpl this$0, WearableDeviceModel deviceModel, Function1 success, Function1 fail, String it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(deviceModel, "$deviceModel");
        Intrinsics.checkNotNullParameter(success, "$success");
        Intrinsics.checkNotNullParameter(fail, "$fail");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.getFaceApiRequestV2().getFaceEntranceV2(DeviceModelExtKt.getModel(deviceModel), it, success, fail);
        return Unit.INSTANCE;
    }

    private final void resetState(FaceInfoView bgView, FaceInfoView upView) {
    }

    private final void sendNotificationsToDevice(List<rxg> notifyData) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(notifyData);
        rxg.d dVar = new rxg.d();
        dVar.c = (rxg[]) arrayList.toArray(new rxg[0]);
        s7r s7rVar = new s7r();
        s7rVar.e = 7;
        s7rVar.f = 0;
        qxg qxgVar = new qxg();
        qxgVar.z(dVar);
        s7rVar.a0(qxgVar);
        try {
            DeviceContact.DefaultImpls.call$default(DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE), s7rVar, false, null, 0, 8, null);
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0044 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:20:0x0046  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v10, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v4 */
    private final void showBleFace(FaceInfoView bgView, FaceInfoView upView, FaceData faceData, WearableDeviceModel device, WatchFace curFace) {
        String string;
        FaceData.BgStyle[] bg_styles;
        FaceData.BgStyle[] bg_styles2;
        FaceData.BgStyle bgStyle;
        String style;
        FaceData.BleExt ble_ext = faceData.getBle_ext();
        int type = ble_ext != null ? ble_ext.getType() : 0;
        boolean zCanEdit = ble_ext != null ? ble_ext.canEdit() : false;
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        T upper_background = "";
        objectRef.element = "";
        String style2 = curFace.getStyle();
        if (style2 == null || style2.length() == 0) {
            FaceData.BgStyle[] bg_styles3 = ble_ext != null ? ble_ext.getBg_styles() : null;
            if (bg_styles3 != null && bg_styles3.length != 0) {
                if (ble_ext != null && (bg_styles2 = ble_ext.getBg_styles()) != null && (bgStyle = bg_styles2[0]) != null && (style = bgStyle.getStyle()) != null) {
                    upper_background = style;
                } else if (ble_ext != null) {
                    upper_background = ble_ext.getUpper_background();
                }
                objectRef.element = upper_background;
                String str = this.TAG;
                if (ble_ext == null || (bg_styles = ble_ext.getBg_styles()) == null) {
                    string = null;
                } else {
                    string = Arrays.toString(bg_styles);
                    Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                }
                Logger.i(str, "setBleFaceEntrance style == null " + string);
            }
        } else {
            if (ble_ext != null) {
                String style3 = curFace.getStyle();
                Intrinsics.checkNotNull(style3);
                String styleUrl = ble_ext.getStyleUrl(style3);
                if (styleUrl != null) {
                    upper_background = styleUrl;
                } else if (ble_ext != null) {
                    upper_background = ble_ext.getUpper_background();
                }
            } else if (ble_ext != null) {
                upper_background = ble_ext.getUpper_background();
            }
            objectRef.element = upper_background;
            Logger.i(this.TAG, "setBleFaceEntrance cur style: " + curFace.getStyle() + " styleUrl: " + objectRef.element);
        }
        Logger.i(this.TAG, "setBleFaceEntrance type: " + type + " canEdit: " + zCanEdit);
        if (zCanEdit) {
            bgView.setVisibility(0);
            upView.setVisibility(type != 1 ? 4 : 0);
            upView.setImageDrawable(null);
            if (ble_ext == null || ble_ext.getBg_img() != 1) {
                FaceManager.INSTANCE.loadFaceBean(curFace, bgView, (108 & 4) != 0 ? false : false, (108 & 8) != 0 ? false : false, (108 & 16) != 0 ? false : true, (108 & 32) != 0 ? false : false, (108 & 64) != 0 ? false : false);
                return;
            } else {
                ScopeExtKt.scopeNet$default(null, new C33771(device, curFace, bgView, ble_ext, faceData, this, objectRef, upView, null), 1, null);
                return;
            }
        }
        if (type == 4) {
            upView.setVisibility(0);
            bgView.setVisibility(4);
            FaceManager.INSTANCE.loadFaceUrl((String) objectRef.element, upView, (4092 & 4) != 0 ? false : false, (4092 & 8) != 0 ? false : false, (4092 & 16) != 0 ? false : true, (4092 & 32) != 0 ? false : false, (4092 & 64) != 0 ? null : null, (4092 & 128) != 0 ? false : false, (4092 & 256) != 0 ? false : false, (4092 & 512) != 0 ? 0 : 0, (4092 & 1024) != 0 ? 0 : 0, (4092 & 2048) != 0 ? null : null);
        } else {
            upView.setVisibility(8);
            bgView.setVisibility(0);
            FaceManager.INSTANCE.loadFaceUrl(faceData.getIcon(), bgView, (4092 & 4) != 0 ? false : false, (4092 & 8) != 0 ? false : false, (4092 & 16) != 0 ? false : true, (4092 & 32) != 0 ? false : false, (4092 & 64) != 0 ? null : null, (4092 & 128) != 0 ? false : false, (4092 & 256) != 0 ? false : false, (4092 & 512) != 0 ? 0 : 0, (4092 & 1024) != 0 ? 0 : 0, (4092 & 2048) != 0 ? null : null);
        }
    }

    private final void showHuamiFace() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit syncLocalFace$lambda$11(List list) {
        FaceManager.INSTANCE.setSyncedData(list);
        ld8.c().l(new FaceReSycEvent());
        return Unit.INSTANCE;
    }

    @Override // com.xiaomi.fitness.watch.face.export.FaceHelper
    public void addFaceEventListener(@NotNull IFaceListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        if (!this.mFaceListeners.contains(listener)) {
            this.mFaceListeners.add(listener);
        }
        Logger.i(this.TAG, "addFaceEventListener, CurrentListener size : " + this.mFaceListeners.size());
    }

    @NotNull
    public final String getCurrentFaceId() {
        return this.currentFaceId;
    }

    @Override // com.xiaomi.fitness.watch.face.export.FaceHelper
    public long getEnterFaceEntranceTime(@NotNull String did) {
        Intrinsics.checkNotNullParameter(did, "did");
        long enterFaceMarketTime = FacePreference.INSTANCE.getEnterFaceMarketTime(did);
        Logger.i(this.TAG, "getEnterFaceEntranceTime did: " + did + " time: " + enterFaceMarketTime);
        return enterFaceMarketTime;
    }

    @NotNull
    public final FaceApiRequestV2 getFaceApiRequestV2() {
        FaceApiRequestV2 faceApiRequestV2 = this.faceApiRequestV2;
        if (faceApiRequestV2 != null) {
            return faceApiRequestV2;
        }
        Intrinsics.throwUninitializedPropertyAccessException("faceApiRequestV2");
        return null;
    }

    @Override // com.xiaomi.fitness.watch.face.export.FaceHelper
    public boolean getFaceEntranceRedPoint(@NotNull String did) {
        Intrinsics.checkNotNullParameter(did, "did");
        return FacePreference.INSTANCE.getFaceEntranceRedPoint(did);
    }

    @Override // com.xiaomi.fitness.watch.face.export.FaceHelper
    @NotNull
    public Map<String, WatchFace> getFaceList() {
        return FaceManager.INSTANCE.getFaceMap();
    }

    public final boolean getRemoveInvalidFaces() {
        return this.removeInvalidFaces;
    }

    public final boolean getShowOldMarket() {
        return this.showOldMarket;
    }

    @Override // com.xiaomi.fitness.watch.face.export.FaceHelper
    public void gotoFaceDetail(@Nullable String model, @Nullable final String id, @NotNull final String source, final int positionId, @NotNull final String contentSource, @NotNull final String exposeSource) {
        WearableDeviceModel wearableDeviceModel;
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(contentSource, "contentSource");
        Intrinsics.checkNotNullParameter(exposeSource, "exposeSource");
        if (id == null || (wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel()) == null) {
            return;
        }
        FacePreference.INSTANCE.setEnterFaceMarketTime(wearableDeviceModel.getDid());
        requestFaceDetail(wearableDeviceModel, id, new Function1() { // from class: jy8
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return FaceHelperImpl.gotoFaceDetail$lambda$3(this.f23240a, id, contentSource, exposeSource, positionId, source, (FaceDetailResultV2) obj);
            }
        }, new Function1() { // from class: ky8
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return FaceHelperImpl.gotoFaceDetail$lambda$4(this.f24414a, (ApiException) obj);
            }
        });
    }

    @Override // com.xiaomi.fitness.watch.face.export.FaceHelper
    public void gotoFaceFromDeviceTab(@NotNull Context context, @NotNull FaceData faceData, int position) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(faceData, "faceData");
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (wearableDeviceModel == null) {
            return;
        }
        FacePreference.INSTANCE.setEnterFaceMarketTime(wearableDeviceModel.getDid());
        Activity currentActivity = AppManager.INSTANCE.getInstance().getCurrentActivity();
        if (currentActivity == null) {
            return;
        }
        DeviceFaceMarketPageManager.INSTANCE.toFaceDetailPage(currentActivity, faceData, "manual_operation", "watchface_market_entrance", position + 1, "watchface_market_entrance");
    }

    @Override // com.xiaomi.fitness.watch.face.export.FaceHelper
    public void gotoFacePage(@NotNull Context context, @NotNull String newRoute) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(newRoute, "newRoute");
        if (!NetworkExtKt.isNetworkAvailable()) {
            ToastExtKt.toastShort(ApplicationExtKt.getApplication(), p1j.common_hint_network_unavailable);
            return;
        }
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (wearableDeviceModel == null) {
            return;
        }
        if (DeviceModelExtKt.isWearOS(wearableDeviceModel)) {
            FaceWearOsHelperExtKt.getInstance(FaceWearOsHelper.INSTANCE).gotoFacePage(context);
            return;
        }
        FacePreference.INSTANCE.setEnterFaceMarketTime(wearableDeviceModel.getDid());
        Activity currentActivity = AppManager.INSTANCE.getInstance().getCurrentActivity();
        boolean z = ConfigPreference.INSTANCE.getROUTE_NEW_FACE_POOL_FROM_ENTRANCE() && newRoute.length() > 0;
        if (z) {
            YRNHelperExtKt.getInstance(YRNHelper.INSTANCE).openPage(currentActivity, newRoute);
        } else {
            YRNHelperExtKt.getInstance(YRNHelper.INSTANCE).openPage(currentActivity, YRNConstants.APP_NAME, "dial/DialMarket", MapsKt__MapsJVMKt.mapOf(TuplesKt.to("_transitionAnimate", Boolean.valueOf(z))));
        }
    }

    @Override // com.xiaomi.fitness.watch.face.export.FaceHelper
    public void gotoFaceTabList(@NotNull Context context, @NotNull String tabId, @NotNull String source, @NotNull String exposeSource) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(tabId, "tabId");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(exposeSource, "exposeSource");
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (wearableDeviceModel == null) {
            return;
        }
        FacePreference.INSTANCE.setEnterFaceMarketTime(wearableDeviceModel.getDid());
        Activity currentActivity = AppManager.INSTANCE.getInstance().getCurrentActivity();
        if (currentActivity == null) {
            return;
        }
        YRNHelperExtKt.getInstance(YRNHelper.INSTANCE).openPage(currentActivity, YRNConstants.APP_NAME, "dial/DialCategoryList", MapsKt__MapsKt.mapOf(TuplesKt.to("source", source), TuplesKt.to("exposeSource", exposeSource), TuplesKt.to("operationType", 3), TuplesKt.to("operationId", tabId)));
    }

    @Override // com.xiaomi.fitness.watch.face.export.FaceHelper
    public void loadFace(@NotNull final FaceInfoView bottomIcon, @NotNull final FaceInfoView topIcon) {
        Intrinsics.checkNotNullParameter(bottomIcon, "bottomIcon");
        Intrinsics.checkNotNullParameter(topIcon, "topIcon");
        final WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (wearableDeviceModel == null) {
            return;
        }
        if (!DeviceModelExtKt.isSupportFeature(wearableDeviceModel, Feature.WATCHFACE)) {
            Logger.i(this.TAG, "not support watch face");
            return;
        }
        topIcon.setVisibility(4);
        bottomIcon.setVisibility(4);
        FaceIcon.setProperty(null);
        if (DeviceModelExtKt.isWearOS(wearableDeviceModel)) {
            FaceWearOsHelperExtKt.getInstance(FaceWearOsHelper.INSTANCE).loadFace(wearableDeviceModel, bottomIcon, topIcon);
            return;
        }
        final WatchFace curFace = FaceManager.INSTANCE.getCurFace();
        if (curFace == null) {
            Logger.i(this.TAG, "return cause curFace is null");
            return;
        }
        Logger.i(this.TAG, "setData: curFace = " + curFace);
        requestFaceDetail(wearableDeviceModel, (curFace.getTemplateId().length() <= 0 || !curFace.getSupportImageGroup()) ? curFace.getId() : curFace.getTemplateId(), new Function1() { // from class: ny8
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return FaceHelperImpl.loadFace$lambda$0(this.f28559a, wearableDeviceModel, bottomIcon, topIcon, curFace, (FaceDetailResultV2) obj);
            }
        }, new Function1() { // from class: oy8
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return FaceHelperImpl.loadFace$lambda$1(this.f29809a, (ApiException) obj);
            }
        });
    }

    @Override // com.xiaomi.fitness.watch.face.export.FaceHelper
    public void loadFaceEntranceImg(@Nullable String icon, @NotNull FaceInfoView view) {
        Intrinsics.checkNotNullParameter(view, "view");
        FaceIcon.setProperty(null);
        FaceManager.INSTANCE.loadFaceUrl(icon, view, (4092 & 4) != 0 ? false : false, (4092 & 8) != 0 ? false : false, (4092 & 16) != 0 ? false : false, (4092 & 32) != 0 ? false : false, (4092 & 64) != 0 ? null : null, (4092 & 128) != 0 ? false : false, (4092 & 256) != 0 ? false : false, (4092 & 512) != 0 ? 0 : FaceIcon.TYPE_ENTRANCE, (4092 & 1024) != 0 ? 0 : FaceSizeConstant.INSTANCE.getCurrentType(), (4092 & 2048) != 0 ? null : null);
    }

    @Override // com.xiaomi.fitness.watch.face.export.FaceHelper
    public void notifyFaceChanged(@Nullable String faceId) {
        ScopeExtKt.scope$default(null, new C33751(faceId, null), 1, null);
    }

    @uno(threadMode = ThreadMode.MAIN)
    public final void onFaceSetEvent(@NotNull orf event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (event instanceof FaceReSycEvent) {
            Logger.i(this.TAG, "face out view FaceReSycEvent ");
            notifyFaceChanged(null);
        } else if ((event instanceof FaceInstallEvent) || (event instanceof FaceDeleteEvent)) {
            Logger.i(this.TAG, "face out view onFaceCountChangedEvent");
            syncLocalFace();
        }
    }

    public final void onSyncFaceFinish(@Nullable s7r packet) {
        v5r v5rVarG;
        y5r.a aVarX;
        y5r[] y5rVarArr;
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (wearableDeviceModel == null || packet == null || (v5rVarG = packet.G()) == null || (aVarX = v5rVarG.x()) == null || (y5rVarArr = aVarX.c) == null) {
            return;
        }
        ScopeExtKt.scopeNet$default(null, new C33761(y5rVarArr, this, wearableDeviceModel, null), 1, null);
    }

    @Override // com.xiaomi.fitness.watch.face.export.FaceHelper
    public void removeFaceEventListener(@NotNull IFaceListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        if (this.mFaceListeners.contains(listener)) {
            this.mFaceListeners.remove(listener);
        }
        Logger.i(this.TAG, "removeFaceEventListener, CurrentListener size : " + this.mFaceListeners.size());
    }

    @Override // com.xiaomi.fitness.watch.face.export.FaceHelper
    public void requestLoadFaceEntranceV4(@NotNull final WearableDeviceModel deviceModel, @NotNull final Function1<? super FaceEntranceRespV4, Unit> success, @NotNull final Function1<? super Integer, Unit> fail) {
        Intrinsics.checkNotNullParameter(deviceModel, "deviceModel");
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(fail, "fail");
        getFirmwareVersion(deviceModel, new Function1() { // from class: my8
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return FaceHelperImpl.requestLoadFaceEntranceV4$lambda$2(this.f27341a, deviceModel, success, fail, (String) obj);
            }
        });
    }

    public final void setCurrentFaceId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.currentFaceId = str;
    }

    public final void setFaceApiRequestV2(@NotNull FaceApiRequestV2 faceApiRequestV2) {
        Intrinsics.checkNotNullParameter(faceApiRequestV2, "<set-?>");
        this.faceApiRequestV2 = faceApiRequestV2;
    }

    @Override // com.xiaomi.fitness.watch.face.export.FaceHelper
    public void setFaceEntranceRedPoint(@NotNull String did, boolean show) {
        Intrinsics.checkNotNullParameter(did, "did");
        FacePreference.INSTANCE.setFaceEntranceRedPoint(did, show);
    }

    public final void setRemoveInvalidFaces(boolean z) {
        this.removeInvalidFaces = z;
    }

    public final void setShowOldMarket(boolean z) {
        this.showOldMarket = z;
    }

    @Override // com.xiaomi.fitness.watch.face.export.FaceHelper
    public void showOldMarket(boolean show) {
        this.showOldMarket = show;
    }

    @Override // com.xiaomi.fitness.watch.face.export.FaceHelper
    public void signWatchFace(@Nullable String faceId) {
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (wearableDeviceModel == null) {
            return;
        }
        WatchFace face = FaceManager.INSTANCE.getFace(faceId);
        Boolean boolValueOf = face != null ? Boolean.valueOf(face.getOnTrial()) : null;
        Logger.i(this.TAG, "signWatchFace onTrial: " + boolValueOf);
        if (boolValueOf == null || Intrinsics.areEqual(boolValueOf, Boolean.FALSE)) {
            return;
        }
        ScopeExtKt.scope$default(null, new C33781(wearableDeviceModel, this, faceId, null), 1, null);
    }

    @Override // com.xiaomi.fitness.watch.face.export.FaceHelper
    public boolean supportImageSegment() {
        return t5d.w5(ApplicationExtKt.getApplication());
    }

    public final void syncLocalFace() {
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (wearableDeviceModel == null) {
            return;
        }
        if (DeviceModelExtKt.isHuaMi(wearableDeviceModel)) {
            FaceManager.INSTANCE.getHuaMiFaceInstalled(wearableDeviceModel, new Function1() { // from class: ly8
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return FaceHelperImpl.syncLocalFace$lambda$11((List) obj);
                }
            });
            return;
        }
        this.removeInvalidFaces = false;
        s7r s7rVar = new s7r();
        s7rVar.e = 4;
        s7rVar.f = 0;
        DeviceContact.DefaultImpls.call$default(DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE), s7rVar, false, null, 0, 14, null);
    }

    @Override // com.xiaomi.fitness.watch.face.export.FaceHelper
    public void testDeleteAll() {
        Map<String, WatchFace> faceMap = FaceManager.INSTANCE.getFaceMap();
        ArrayList arrayList = new ArrayList(faceMap.size());
        Iterator<Map.Entry<String, WatchFace>> it = faceMap.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getKey());
        }
        this.removeInvalidFaces = true;
        removeUnavailableFacesByGroup(arrayList, 0);
    }

    @Override // com.xiaomi.fitness.watch.face.export.FaceHelper
    public void loadFace(@NotNull ImageView view, @NotNull String url, int w, int h, int radius) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(url, "url");
        ImageLoadUtil.load$default(ImageLoadUtil.INSTANCE, view, url, w, h, radius, null, 32, null);
    }
}
