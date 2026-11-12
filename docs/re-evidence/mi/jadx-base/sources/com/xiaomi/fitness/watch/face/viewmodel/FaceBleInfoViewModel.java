package com.xiaomi.fitness.watch.face.viewmodel;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import coil.ImageLoader;
import coil.ImageLoaders;
import coil.request.ImageRequest;
import coil.request.SuccessResult;
import com.mibi.sdk.component.Constants;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.ToastExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.device.contact.export.DataHandlerWrapper;
import com.xiaomi.fitness.device.contact.export.DeviceContact;
import com.xiaomi.fitness.device.contact.export.DeviceSyncExtKt;
import com.xiaomi.fitness.device.contact.export.OnSyncCallback;
import com.xiaomi.fitness.device.contact.export.SyncResult;
import com.xiaomi.fitness.device.contact.export.SyncStateListener;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.device.manager.export.bean.WearableDeviceInfo;
import com.xiaomi.fitness.login.utils.RegionUtil;
import com.xiaomi.fitness.medal.export.MedalManager;
import com.xiaomi.fitness.medal.export.MedalManagerExtKt;
import com.xiaomi.fitness.net.response.ApiException;
import com.xiaomi.fitness.watch.face.FaceBlePhotoFragmentKt;
import com.xiaomi.fitness.watch.face.FaceInfoBase;
import com.xiaomi.fitness.watch.face.data.FaceManager;
import com.xiaomi.fitness.watch.face.data.FacePhotoItem;
import com.xiaomi.fitness.watch.face.db.FaceCommonEntity;
import com.xiaomi.fitness.watch.face.db.WatchFaceDao;
import com.xiaomi.fitness.watch.face.db.WatchFaceDataBase;
import com.xiaomi.fitness.watch.face.export.data.FaceData;
import com.xiaomi.fitness.watch.face.export.data.FaceDownloadResultV2;
import com.xiaomi.fitness.watch.face.export.exportview.FaceIcon;
import com.xiaomi.fitness.watch.face.ext.FaceExtKt;
import com.xiaomi.fitness.watch.face.helper.FaceDownloadHelper;
import com.xiaomi.fitness.watch.face.helper.FaceZhouHaiHelper;
import com.xiaomi.fitness.watch.face.install.FaceInstallBleV1Impl;
import com.xiaomi.fitness.watch.face.request.FaceApiRequestV2;
import com.xiaomi.fitness.watch.face.request.FaceDetailResultV2;
import com.xiaomi.fitness.watch.face.viewmodel.FaceBleInfoViewModel;
import com.xiaomi.smarthome.framework.plugin.rn.utils.MediaStoreUtil;
import com.xiaomi.smarthome.plugin.update.PluginPackageConstant;
import com.xiaomi.wearable.hm.BroadcastsKt;
import defpackage.l5f;
import defpackage.m5f;
import defpackage.o5r;
import defpackage.p1j;
import defpackage.p5r;
import defpackage.q5r;
import defpackage.s5r;
import defpackage.s7r;
import defpackage.swo;
import defpackage.tgc;
import defpackage.txo;
import defpackage.v5r;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt___RangesKt;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000ü\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\f\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\fÁ\u0001Â\u0001Ã\u0001Ä\u0001Å\u0001Æ\u0001B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u00132\b\u0010%\u001a\u0004\u0018\u00010\u0013J\u000e\u0010)\u001a\u00020#2\u0006\u0010*\u001a\u00020\u0013Jc\u00105\u001a\u00020#2\u0006\u0010*\u001a\u00020\u00132\u0006\u00106\u001a\u00020\u00132\u0006\u0010%\u001a\u00020\u00132\u0006\u00107\u001a\u0002082\u0006\u00109\u001a\u00020\u00132\u001a\u0010:\u001a\u0016\u0012\u0004\u0012\u00020,\u0018\u00010<j\n\u0012\u0004\u0012\u00020,\u0018\u0001`;2\n\b\u0002\u0010=\u001a\u0004\u0018\u00010\u00132\u0006\u0010>\u001a\u00020\r¢\u0006\u0002\u0010?Jg\u00105\u001a\u00020#2\u0006\u0010*\u001a\u00020\u00132\u000e\u0010@\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130A2\u0006\u0010B\u001a\u00020C2\u000e\u0010D\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130A2\u0006\u00109\u001a\u00020\u00132\u0006\u0010>\u001a\u00020\r2\u0006\u0010E\u001a\u00020\r2\u0006\u0010F\u001a\u00020\r2\n\b\u0002\u0010=\u001a\u0004\u0018\u00010\u0013¢\u0006\u0002\u0010GJ\u001e\u0010K\u001a\u00020#2\u0006\u0010L\u001a\u00020\u00132\u0006\u0010$\u001a\u00020\u00132\u0006\u0010M\u001a\u00020,J$\u0010N\u001a\u00020#2\f\u0010O\u001a\b\u0012\u0004\u0012\u00020Q0P2\u0006\u0010$\u001a\u00020\u00132\u0006\u0010M\u001a\u00020,J&\u0010j\u001a\u00020#2\f\u0010O\u001a\b\u0012\u0004\u0012\u00020Q0P2\u0006\u0010$\u001a\u00020\u00132\u0006\u0010M\u001a\u00020,H\u0002J,\u0010k\u001a\u00020#2\u0006\u0010l\u001a\u00020\u00132\u0014\u0010m\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010o\u0012\u0004\u0012\u00020#0nH\u0086@¢\u0006\u0002\u0010pJ\u001e\u0010u\u001a\u00020#2\u0006\u0010v\u001a\u00020\u00132\u0006\u0010w\u001a\u00020x2\u0006\u0010*\u001a\u00020\u0013J\\\u0010y\u001a\u00020#2\u0006\u0010*\u001a\u00020\u00132\u0006\u0010w\u001a\u00020x2\u0006\u0010z\u001a\u0002082\u0006\u0010`\u001a\u0002082\b\u0010{\u001a\u0004\u0018\u00010\u00132\b\u0010|\u001a\u0004\u0018\u00010\u00132 \u0010}\u001a\u001c\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020,\u0012\u0006\u0012\u0004\u0018\u00010,\u0012\u0004\u0012\u00020#0~J\u0011\u0010\u007f\u001a\u0002082\u0007\u0010\u0080\u0001\u001a\u000208H\u0002J\u0013\u0010\u0085\u0001\u001a\u00020#2\n\u0010\u0086\u0001\u001a\u0005\u0018\u00010\u0087\u0001J'\u0010\u008f\u0001\u001a\u00020#2\u0006\u0010w\u001a\u00020x2\u0006\u0010*\u001a\u00020\u00132\b\u0010M\u001a\u0004\u0018\u00010,¢\u0006\u0003\u0010\u0090\u0001J\u000f\u0010\u0095\u0001\u001a\u00020#2\u0006\u0010*\u001a\u00020\u0013J\t\u0010\u0096\u0001\u001a\u00020#H\u0002J\u0010\u0010\u0099\u0001\u001a\u00020#2\u0007\u0010\u009a\u0001\u001a\u000208J.\u0010\u009c\u0001\u001a\u00020#2\u0007\u0010\u009d\u0001\u001a\u0002082\t\b\u0002\u0010\u009e\u0001\u001a\u0002082\u0011\b\u0002\u0010\u009f\u0001\u001a\n\u0012\u0004\u0012\u00020Q\u0018\u00010PJ\u0007\u0010 \u0001\u001a\u00020#J\u0010\u0010¡\u0001\u001a\u00020,2\u0007\u0010¢\u0001\u001a\u00020,J\"\u0010£\u0001\u001a\u00020,2\u0007\u0010¤\u0001\u001a\u00020,2\u0007\u0010¢\u0001\u001a\u00020,2\u0007\u0010¥\u0001\u001a\u00020\rJ\u0019\u0010¦\u0001\u001a\u00020,2\u0007\u0010¤\u0001\u001a\u00020,2\u0007\u0010¢\u0001\u001a\u00020,J0\u0010§\u0001\u001a\u00020#2\u0007\u0010¨\u0001\u001a\u00020\u00132\t\b\u0002\u0010©\u0001\u001a\u00020\u00132\u0013\u0010ª\u0001\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020#0nJl\u0010«\u0001\u001a\u00020#2\u0007\u0010¬\u0001\u001a\u00020,2\u0006\u0010=\u001a\u00020\u00132\t\u0010\u00ad\u0001\u001a\u0004\u0018\u00010\u00132\b\u0010®\u0001\u001a\u00030\u0087\u00012=\u0010¯\u0001\u001a8\u0012.\u0012,0´\u0001j\u0015`°\u0001¢\u0006\u000f\b±\u0001\u0012\n\b²\u0001\u0012\u0005\b\b(³\u0001¢\u0006\u000f\b±\u0001\u0012\n\b²\u0001\u0012\u0005\b\b(³\u0001\u0012\u0004\u0012\u00020#0nJ)\u0010µ\u0001\u001a\u0005\u0018\u00010¶\u00012\t\u0010·\u0001\u001a\u0004\u0018\u00010\u00132\t\u0010¸\u0001\u001a\u0004\u0018\u00010\u0013H\u0082@¢\u0006\u0003\u0010¹\u0001J$\u0010º\u0001\u001a\u00020\r2\u0007\u0010»\u0001\u001a\u00020\u00132\u0007\u0010¨\u0001\u001a\u00020\u00132\u0007\u0010©\u0001\u001a\u00020\u0013H\u0002J\u0007\u0010¼\u0001\u001a\u00020\rJ\t\u0010½\u0001\u001a\u00020#H\u0014J\u0015\u0010¾\u0001\u001a\u00020#2\n\u0010¿\u0001\u001a\u0005\u0018\u00010À\u0001H\u0016R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR!\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\u0018\u001a\u0004\u0018\u00010\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u0011\u001a\u0004\b\u001a\u0010\u001bR\u000e\u0010\u001d\u001a\u00020\u001eX\u0082\u0004¢\u0006\u0002\n\u0000R!\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00130\f8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\u0011\u001a\u0004\b \u0010\u000fR!\u0010&\u001a\b\u0012\u0004\u0012\u00020\r0\f8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b(\u0010\u0011\u001a\u0004\b'\u0010\u000fR\u001a\u0010+\u001a\u00020,X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R!\u00101\u001a\b\u0012\u0004\u0012\u0002020\f8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b4\u0010\u0011\u001a\u0004\b3\u0010\u000fR!\u0010H\u001a\b\u0012\u0004\u0012\u00020,0\f8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bJ\u0010\u0011\u001a\u0004\bI\u0010\u000fR\u001a\u0010R\u001a\u00020,X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bS\u0010.\"\u0004\bT\u00100R \u0010U\u001a\b\u0018\u00010VR\u00020\u0000X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bW\u0010X\"\u0004\bY\u0010ZR \u0010[\u001a\b\u0012\u0004\u0012\u00020Q0PX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\\\u0010]\"\u0004\b^\u0010_R\u001a\u0010`\u001a\u00020,X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\ba\u0010.\"\u0004\bb\u00100R\u001a\u0010c\u001a\u00020,X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bd\u0010.\"\u0004\be\u00100R\u001a\u0010f\u001a\u00020\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bg\u0010\u0015\"\u0004\bh\u0010iR!\u0010q\u001a\b\u0012\u0004\u0012\u00020r0\f8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bt\u0010\u0011\u001a\u0004\bs\u0010\u000fR%\u0010\u0081\u0001\u001a\t\u0012\u0005\u0012\u00030\u0082\u00010\f8FX\u0086\u0084\u0002¢\u0006\u000e\n\u0005\b\u0084\u0001\u0010\u0011\u001a\u0005\b\u0083\u0001\u0010\u000fR%\u0010\u0088\u0001\u001a\t\u0012\u0005\u0012\u00030\u0089\u00010\f8FX\u0086\u0084\u0002¢\u0006\u000e\n\u0005\b\u008b\u0001\u0010\u0011\u001a\u0005\b\u008a\u0001\u0010\u000fR$\u0010\u008c\u0001\u001a\b\u0012\u0004\u0012\u00020,0\f8FX\u0086\u0084\u0002¢\u0006\u000e\n\u0005\b\u008e\u0001\u0010\u0011\u001a\u0005\b\u008d\u0001\u0010\u000fR\u0014\u0010\u0091\u0001\u001a\u00070\u0092\u0001R\u00020\u0000X\u0082\u000e¢\u0006\u0002\n\u0000R\u0019\u0010\u0093\u0001\u001a\b\u0012\u0004\u0012\u00020,0\f¢\u0006\t\n\u0000\u001a\u0005\b\u0094\u0001\u0010\u000fR\u0010\u0010\u0097\u0001\u001a\u00030\u0098\u0001X\u0082\u000e¢\u0006\u0002\n\u0000R\u000f\u0010\u009b\u0001\u001a\u000208X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006Ç\u0001"}, d2 = {"Lcom/xiaomi/fitness/watch/face/viewmodel/FaceBleInfoViewModel;", "Lcom/xiaomi/fitness/watch/face/viewmodel/StateViewModel;", "Lcom/xiaomi/fitness/watch/face/request/FaceDetailResultV2;", "<init>", "()V", "faceApiRequest", "Lcom/xiaomi/fitness/watch/face/request/FaceApiRequestV2;", "getFaceApiRequest", "()Lcom/xiaomi/fitness/watch/face/request/FaceApiRequestV2;", "setFaceApiRequest", "(Lcom/xiaomi/fitness/watch/face/request/FaceApiRequestV2;)V", "dismissDialogLiveData", "Landroidx/lifecycle/MutableLiveData;", "", "getDismissDialogLiveData", "()Landroidx/lifecycle/MutableLiveData;", "dismissDialogLiveData$delegate", "Lkotlin/Lazy;", "TAG", "", "getTAG", "()Ljava/lang/String;", "mHandler", "Landroid/os/Handler;", "device", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "getDevice", "()Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "device$delegate", "faceInstallController", "Lcom/xiaomi/fitness/watch/face/install/FaceInstallBleV1Impl;", "bgImg", "getBgImg", "bgImg$delegate", Constants.KEY_REQUEST_DATA, "", FaceInfoBase.FACE_ID, "bgImgMd5", "setFaceResult", "getSetFaceResult", "setFaceResult$delegate", "setFaceId", "id", "canAcceptCount", "", "getCanAcceptCount", "()I", "setCanAcceptCount", "(I)V", "editRet", "Lcom/xiaomi/fitness/watch/face/viewmodel/FaceBleInfoViewModel$EditRet;", "getEditRet", "editRet$delegate", "requestEdit", "bgColor", "bgImgSize", "", "style", "dataList", "Lkotlin/collections/ArrayList;", "Ljava/util/ArrayList;", "spiritColor", "setCurrent", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/util/ArrayList;Ljava/lang/String;Z)V", "bgImgMd5List", "", "bgImgSizeList", "", "bgImgOrderList", "needOrderList", "deleteAllImages", "(Ljava/lang/String;[Ljava/lang/String;[I[Ljava/lang/String;Ljava/lang/String;ZZZLjava/lang/String;)V", "bgImgTransfer", "getBgImgTransfer", "bgImgTransfer$delegate", "transferImg", "path", "segmentLength", "transferImgList", "faceList", "", "Lcom/xiaomi/fitness/watch/face/data/FacePhotoItem;", "receiveCount", "getReceiveCount", "setReceiveCount", "imgDataHandler", "Lcom/xiaomi/fitness/watch/face/viewmodel/FaceBleInfoViewModel$ImgDataHandler;", "getImgDataHandler", "()Lcom/xiaomi/fitness/watch/face/viewmodel/FaceBleInfoViewModel$ImgDataHandler;", "setImgDataHandler", "(Lcom/xiaomi/fitness/watch/face/viewmodel/FaceBleInfoViewModel$ImgDataHandler;)V", "sendFaceList", "getSendFaceList", "()Ljava/util/List;", "setSendFaceList", "(Ljava/util/List;)V", MediaStoreUtil.MediaInfo.SIZE, "getSize", "setSize", "index", "getIndex", "setIndex", "sendFaceId", "getSendFaceId", "setSendFaceId", "(Ljava/lang/String;)V", "transferToDevice", "requestDownload", "realFaceId", "result", "Lkotlin/Function1;", "Lcom/xiaomi/fitness/watch/face/export/data/FaceDownloadResultV2;", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "download", "Lcom/xiaomi/fitness/watch/face/viewmodel/FaceBleInfoViewModel$DownloadRet;", "getDownload", "download$delegate", "downloadFace", "url", "file", "Ljava/io/File;", "installBleFace", "version", "license", "sign", "action", "Lkotlin/Function3;", "getInstallTimeout", "timeout", "wearOSFaceInstallRet", "Lcom/xiaomi/fitness/watch/face/viewmodel/FaceBleInfoViewModel$WearOSFaceInstallRet;", "getWearOSFaceInstallRet", "wearOSFaceInstallRet$delegate", "installWearOsFace", "data", "Lcom/xiaomi/fitness/watch/face/export/data/FaceData;", "faceInstallRet", "Lcom/xiaomi/fitness/watch/face/viewmodel/FaceBleInfoViewModel$FaceInstallRet;", "getFaceInstallRet", "faceInstallRet$delegate", "installFaceProgress", "getInstallFaceProgress", "installFaceProgress$delegate", "doInstallFace", "(Ljava/io/File;Ljava/lang/String;Ljava/lang/Integer;)V", "installDataHandler", "Lcom/xiaomi/fitness/watch/face/viewmodel/FaceBleInfoViewModel$InstallDataHandler;", "delete", "getDelete", "deleteFace", "unRegisterPacket", "zipImgRatio", "", "initZipImgRatio", "zipSize", "installProgressSize", "initInstallProgressSize", "fileSize", "imgSize", "imgList", "dismissDialog", "getDownloadProgress", BroadcastsKt.SILENT_PUSHING_PROGRESS, "getPushProgress", "usedProgress", "hasImg", "getImgProgress", "checkDeviceVersion", "targetVersion", "split", "callback", "calculateFaceData", "zhouHaiDeviceType", "bgPath", "faceData", "errCallback", "Lkotlin/Exception;", "Lkotlin/ParameterName;", "name", PluginDeviceInfo.FICONOFFLINE, "Ljava/lang/Exception;", "loadBitmap", "Landroid/graphics/Bitmap;", "imgPath", "imgUrl", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "checkVersionSupport", "curVersion", "isDeviceConnected", "onCleared", "attach", "savedInstanceState", "Landroid/os/Bundle;", "EditRet", "ImgDataHandler", "DownloadRet", "WearOSFaceInstallRet", "FaceInstallRet", "InstallDataHandler", "watch-face_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nFaceBleInfoViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FaceBleInfoViewModel.kt\ncom/xiaomi/fitness/watch/face/viewmodel/FaceBleInfoViewModel\n+ 2 Color.kt\nandroidx/core/graphics/ColorKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,860:1\n125#2:861\n133#2:862\n141#2:863\n125#2:864\n133#2:865\n141#2:866\n1872#3,3:867\n*S KotlinDebug\n*F\n+ 1 FaceBleInfoViewModel.kt\ncom/xiaomi/fitness/watch/face/viewmodel/FaceBleInfoViewModel\n*L\n189#1:861\n190#1:862\n191#1:863\n249#1:864\n250#1:865\n251#1:866\n807#1:867,3\n*E\n"})
public final class FaceBleInfoViewModel extends StateViewModel<FaceDetailResultV2> {
    private int canAcceptCount;
    public FaceApiRequestV2 faceApiRequest;

    @Nullable
    private ImgDataHandler imgDataHandler;
    private int index;
    private int receiveCount;
    private int size;
    private float zipImgRatio;

    /* JADX INFO: renamed from: dismissDialogLiveData$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy dismissDialogLiveData = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: fn8
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return FaceBleInfoViewModel.dismissDialogLiveData_delegate$lambda$0();
        }
    });

    @NotNull
    private final Handler mHandler = new Handler();

    /* JADX INFO: renamed from: device$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy device = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: gn8
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return FaceBleInfoViewModel.device_delegate$lambda$1();
        }
    });

    @NotNull
    private final FaceInstallBleV1Impl faceInstallController = new FaceInstallBleV1Impl(getDevice());

    /* JADX INFO: renamed from: bgImg$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy bgImg = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: hn8
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return FaceBleInfoViewModel.bgImg_delegate$lambda$2();
        }
    });

    /* JADX INFO: renamed from: setFaceResult$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy setFaceResult = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: in8
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return FaceBleInfoViewModel.setFaceResult_delegate$lambda$3();
        }
    });

    /* JADX INFO: renamed from: editRet$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy editRet = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: jn8
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return FaceBleInfoViewModel.editRet_delegate$lambda$4();
        }
    });

    /* JADX INFO: renamed from: bgImgTransfer$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy bgImgTransfer = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: kn8
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return FaceBleInfoViewModel.bgImgTransfer_delegate$lambda$7();
        }
    });

    @NotNull
    private List<FacePhotoItem> sendFaceList = new ArrayList();

    @NotNull
    private String sendFaceId = "";

    /* JADX INFO: renamed from: download$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy download = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: ln8
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return FaceBleInfoViewModel.download_delegate$lambda$10();
        }
    });

    /* JADX INFO: renamed from: wearOSFaceInstallRet$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy wearOSFaceInstallRet = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: mn8
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return FaceBleInfoViewModel.wearOSFaceInstallRet_delegate$lambda$11();
        }
    });

    /* JADX INFO: renamed from: faceInstallRet$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy faceInstallRet = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: cn8
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return FaceBleInfoViewModel.faceInstallRet_delegate$lambda$12();
        }
    });

    /* JADX INFO: renamed from: installFaceProgress$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy installFaceProgress = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: dn8
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return FaceBleInfoViewModel.installFaceProgress_delegate$lambda$13();
        }
    });

    @NotNull
    private InstallDataHandler installDataHandler = new InstallDataHandler(this, null, 1, 0 == true ? 1 : 0);

    @NotNull
    private final MutableLiveData<Integer> delete = new MutableLiveData<>();
    private long installProgressSize = 99;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0014"}, d2 = {"Lcom/xiaomi/fitness/watch/face/viewmodel/FaceBleInfoViewModel$DownloadRet;", "", "percent", "", "msg", "", "<init>", "(ILjava/lang/String;)V", "getPercent", "()I", "getMsg", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "watch-face_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class DownloadRet {

        @Nullable
        private final String msg;
        private final int percent;

        public DownloadRet(int i, @Nullable String str) {
            this.percent = i;
            this.msg = str;
        }

        public static /* synthetic */ DownloadRet copy$default(DownloadRet downloadRet, int i, String str, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = downloadRet.percent;
            }
            if ((i2 & 2) != 0) {
                str = downloadRet.msg;
            }
            return downloadRet.copy(i, str);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getPercent() {
            return this.percent;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getMsg() {
            return this.msg;
        }

        @NotNull
        public final DownloadRet copy(int percent, @Nullable String msg) {
            return new DownloadRet(percent, msg);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DownloadRet)) {
                return false;
            }
            DownloadRet downloadRet = (DownloadRet) other;
            return this.percent == downloadRet.percent && Intrinsics.areEqual(this.msg, downloadRet.msg);
        }

        @Nullable
        public final String getMsg() {
            return this.msg;
        }

        public final int getPercent() {
            return this.percent;
        }

        public int hashCode() {
            int iHashCode = Integer.hashCode(this.percent) * 31;
            String str = this.msg;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        @NotNull
        public String toString() {
            return "DownloadRet(percent=" + this.percent + ", msg=" + this.msg + ")";
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/xiaomi/fitness/watch/face/viewmodel/FaceBleInfoViewModel$EditRet;", "", Constants.KEY_PAY_RESULT_RET, "", "segmentLength", "<init>", "(II)V", "getRet", "()I", "getSegmentLength", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "watch-face_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class EditRet {
        private final int ret;
        private final int segmentLength;

        public EditRet(int i, int i2) {
            this.ret = i;
            this.segmentLength = i2;
        }

        public static /* synthetic */ EditRet copy$default(EditRet editRet, int i, int i2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i = editRet.ret;
            }
            if ((i3 & 2) != 0) {
                i2 = editRet.segmentLength;
            }
            return editRet.copy(i, i2);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getRet() {
            return this.ret;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final int getSegmentLength() {
            return this.segmentLength;
        }

        @NotNull
        public final EditRet copy(int ret, int segmentLength) {
            return new EditRet(ret, segmentLength);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof EditRet)) {
                return false;
            }
            EditRet editRet = (EditRet) other;
            return this.ret == editRet.ret && this.segmentLength == editRet.segmentLength;
        }

        public final int getRet() {
            return this.ret;
        }

        public final int getSegmentLength() {
            return this.segmentLength;
        }

        public int hashCode() {
            return (Integer.hashCode(this.ret) * 31) + Integer.hashCode(this.segmentLength);
        }

        @NotNull
        public String toString() {
            return "EditRet(ret=" + this.ret + ", segmentLength=" + this.segmentLength + ")";
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\b\u0010\r\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u0003\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\t\u0010\nJ0\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00052\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0007J\u001a\u0010\u0015\u001a\u00020\u00022\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0017\u001a\u0004\b\u0018\u0010\u0004R\u0017\u0010\f\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\f\u0010\u0019\u001a\u0004\b\u001a\u0010\u0007R\u0019\u0010\r\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\r\u0010\u001b\u001a\u0004\b\u001c\u0010\n¨\u0006\u001f"}, d2 = {"Lcom/xiaomi/fitness/watch/face/viewmodel/FaceBleInfoViewModel$FaceInstallRet;", "", "", "component1", "()Z", "", "component2", "()I", "Ls5r;", "component3", "()Ls5r;", "success", "code", "result", "copy", "(ZILs5r;)Lcom/xiaomi/fitness/watch/face/viewmodel/FaceBleInfoViewModel$FaceInstallRet;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getSuccess", "I", "getCode", "Ls5r;", "getResult", "<init>", "(ZILs5r;)V", "watch-face_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public static final /* data */ class FaceInstallRet {
        private final int code;

        @Nullable
        private final s5r result;
        private final boolean success;

        public FaceInstallRet(boolean z, int i, @Nullable s5r s5rVar) {
            this.success = z;
            this.code = i;
            this.result = s5rVar;
        }

        public static /* synthetic */ FaceInstallRet copy$default(FaceInstallRet faceInstallRet, boolean z, int i, s5r s5rVar, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                z = faceInstallRet.success;
            }
            if ((i2 & 2) != 0) {
                i = faceInstallRet.code;
            }
            if ((i2 & 4) != 0) {
                s5rVar = faceInstallRet.result;
            }
            return faceInstallRet.copy(z, i, s5rVar);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final boolean getSuccess() {
            return this.success;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final int getCode() {
            return this.code;
        }

        @Nullable
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final s5r getResult() {
            return this.result;
        }

        @NotNull
        public final FaceInstallRet copy(boolean success, int code, @Nullable s5r result) {
            return new FaceInstallRet(success, code, result);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FaceInstallRet)) {
                return false;
            }
            FaceInstallRet faceInstallRet = (FaceInstallRet) other;
            return this.success == faceInstallRet.success && this.code == faceInstallRet.code && Intrinsics.areEqual(this.result, faceInstallRet.result);
        }

        public final int getCode() {
            return this.code;
        }

        @Nullable
        public final s5r getResult() {
            return this.result;
        }

        public final boolean getSuccess() {
            return this.success;
        }

        public int hashCode() {
            int iHashCode = ((Boolean.hashCode(this.success) * 31) + Integer.hashCode(this.code)) * 31;
            s5r s5rVar = this.result;
            return iHashCode + (s5rVar == null ? 0 : s5rVar.hashCode());
        }

        @NotNull
        public String toString() {
            return "FaceInstallRet(success=" + this.success + ", code=" + this.code + ", result=" + this.result + ")";
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012J)\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\"\u0010\u000b\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lcom/xiaomi/fitness/watch/face/viewmodel/FaceBleInfoViewModel$InstallDataHandler;", "Lcom/xiaomi/fitness/device/contact/export/DataHandlerWrapper;", "", "did", "", "type", "Ls7r;", "packet", "", "handlePacket", "(Ljava/lang/String;ILs7r;)Z", FaceInfoBase.FACE_ID, "Ljava/lang/String;", "getFaceId", "()Ljava/lang/String;", "setFaceId", "(Ljava/lang/String;)V", "<init>", "(Lcom/xiaomi/fitness/watch/face/viewmodel/FaceBleInfoViewModel;Ljava/lang/String;)V", "watch-face_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public final class InstallDataHandler extends DataHandlerWrapper {

        @NotNull
        private String faceId;
        final /* synthetic */ FaceBleInfoViewModel this$0;

        public InstallDataHandler(@NotNull FaceBleInfoViewModel faceBleInfoViewModel, String faceId) {
            Intrinsics.checkNotNullParameter(faceId, "faceId");
            this.this$0 = faceBleInfoViewModel;
            this.faceId = faceId;
        }

        @NotNull
        public final String getFaceId() {
            return this.faceId;
        }

        @Override // com.xiaomi.fitness.device.contact.export.DataHandlerWrapper, com.xiaomi.fitness.device.contact.export.DataHandler
        public boolean handlePacket(@NotNull String did, int type, @Nullable s7r packet) {
            Intrinsics.checkNotNullParameter(did, "did");
            if (type == 4 && packet != null && packet.f == 5) {
                Logger.i(this.this$0.getTAG(), "receivePacket InstallDataHandler");
                if (packet.G() != null && packet.G().s() != null) {
                    s5r s5rVarS = packet.G().s();
                    Logger.i(this.this$0.getTAG(), "InstallDataHandler receivePacket receiver id = " + s5rVarS.c + "; reqId = " + this.faceId + "; code = " + s5rVarS.d);
                    if (!Intrinsics.areEqual(this.faceId, s5rVarS.c)) {
                        this.this$0.unRegisterPacket();
                        this.this$0.getFaceInstallRet().postValue(new FaceInstallRet(false, 255, null));
                        return false;
                    }
                    int i = s5rVarS.d;
                    boolean z = i == 3 || i == 2;
                    this.this$0.getInstallFaceProgress().postValue(100);
                    this.this$0.getFaceInstallRet().postValue(new FaceInstallRet(z, z ? i : 255, s5rVarS));
                    this.this$0.unRegisterPacket();
                    return true;
                }
            }
            return false;
        }

        public final void setFaceId(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.faceId = str;
        }

        public /* synthetic */ InstallDataHandler(FaceBleInfoViewModel faceBleInfoViewModel, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(faceBleInfoViewModel, (i & 1) != 0 ? "" : str);
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00032\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0014"}, d2 = {"Lcom/xiaomi/fitness/watch/face/viewmodel/FaceBleInfoViewModel$WearOSFaceInstallRet;", "", "success", "", "code", "", "<init>", "(ZI)V", "getSuccess", "()Z", "getCode", "()I", "component1", "component2", "copy", "equals", "other", "hashCode", "toString", "", "watch-face_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class WearOSFaceInstallRet {
        private final int code;
        private final boolean success;

        public WearOSFaceInstallRet(boolean z, int i) {
            this.success = z;
            this.code = i;
        }

        public static /* synthetic */ WearOSFaceInstallRet copy$default(WearOSFaceInstallRet wearOSFaceInstallRet, boolean z, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                z = wearOSFaceInstallRet.success;
            }
            if ((i2 & 2) != 0) {
                i = wearOSFaceInstallRet.code;
            }
            return wearOSFaceInstallRet.copy(z, i);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final boolean getSuccess() {
            return this.success;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final int getCode() {
            return this.code;
        }

        @NotNull
        public final WearOSFaceInstallRet copy(boolean success, int code) {
            return new WearOSFaceInstallRet(success, code);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof WearOSFaceInstallRet)) {
                return false;
            }
            WearOSFaceInstallRet wearOSFaceInstallRet = (WearOSFaceInstallRet) other;
            return this.success == wearOSFaceInstallRet.success && this.code == wearOSFaceInstallRet.code;
        }

        public final int getCode() {
            return this.code;
        }

        public final boolean getSuccess() {
            return this.success;
        }

        public int hashCode() {
            return (Boolean.hashCode(this.success) * 31) + Integer.hashCode(this.code);
        }

        @NotNull
        public String toString() {
            return "WearOSFaceInstallRet(success=" + this.success + ", code=" + this.code + ")";
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.watch.face.viewmodel.FaceBleInfoViewModel$calculateFaceData$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.watch.face.viewmodel.FaceBleInfoViewModel$calculateFaceData$1", f = "FaceBleInfoViewModel.kt", i = {0, 1, 1, 2, 2, 2}, l = {741, 750, 751}, m = "invokeSuspend", n = {"color", "sourceData", "color", "sourceData", "bgBitmap", "color"}, s = {"I$0", "L$0", "I$0", "L$0", "L$1", "I$0"})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $bgPath;
        final /* synthetic */ Function1<Exception, Unit> $errCallback;
        final /* synthetic */ FaceData $faceData;
        final /* synthetic */ String $spiritColor;
        final /* synthetic */ int $zhouHaiDeviceType;
        int I$0;
        Object L$0;
        Object L$1;
        int label;
        final /* synthetic */ FaceBleInfoViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(String str, FaceBleInfoViewModel faceBleInfoViewModel, Function1<? super Exception, Unit> function1, FaceData faceData, String str2, int i, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$spiritColor = str;
            this.this$0 = faceBleInfoViewModel;
            this.$errCallback = function1;
            this.$faceData = faceData;
            this.$bgPath = str2;
            this.$zhouHaiDeviceType = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$spiritColor, this.this$0, this.$errCallback, this.$faceData, this.$bgPath, this.$zhouHaiDeviceType, continuation);
        }

        /* JADX WARN: Code duplicated, block: B:33:0x00ce  */
        /* JADX WARN: Code duplicated, block: B:34:0x00d3  */
        /* JADX WARN: Code duplicated, block: B:37:0x00e2 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:38:0x00e3  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            int color;
            byte[] bArr;
            Bitmap bitmap;
            FaceData.BleExt ble_ext;
            String upper_background;
            Object objLoadBitmap;
            Bitmap bitmap2;
            int i;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.label;
            if (i2 != 0) {
                if (i2 == 1) {
                    color = this.I$0;
                    ResultKt.throwOnFailure(obj);
                } else if (i2 == 2) {
                    color = this.I$0;
                    bArr = (byte[]) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    bitmap = (Bitmap) obj;
                    FaceBleInfoViewModel faceBleInfoViewModel = this.this$0;
                    ble_ext = this.$faceData.getBle_ext();
                    if (ble_ext != null) {
                        upper_background = ble_ext.getUpper_background();
                    } else {
                        upper_background = null;
                    }
                    this.L$0 = bArr;
                    this.L$1 = bitmap;
                    this.I$0 = color;
                    this.label = 3;
                    objLoadBitmap = faceBleInfoViewModel.loadBitmap(null, upper_background, this);
                    if (objLoadBitmap == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    bitmap2 = bitmap;
                    i = color;
                    obj = objLoadBitmap;
                } else {
                    if (i2 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i = this.I$0;
                    Bitmap bitmap3 = (Bitmap) this.L$1;
                    byte[] bArr2 = (byte[]) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    bitmap2 = bitmap3;
                    bArr = bArr2;
                }
                try {
                    FaceZhouHaiHelper.INSTANCE.getCustomClockDialData(this.$zhouHaiDeviceType, bArr, Color.red(i), Color.green(i), Color.blue(i), bitmap2, (Bitmap) obj);
                } catch (Exception e) {
                    Logger.e(this.this$0.getTAG(), "calculateFaceData error:", e);
                    e.printStackTrace();
                    this.$errCallback.invoke2(e);
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            color = Color.parseColor(TextUtils.isEmpty(this.$spiritColor) ? "#FFFFFF" : this.$spiritColor);
            CoroutineDispatcher io2 = Dispatchers.getIO();
            FaceBleInfoViewModel$calculateFaceData$1$sourceData$1 faceBleInfoViewModel$calculateFaceData$1$sourceData$1 = new FaceBleInfoViewModel$calculateFaceData$1$sourceData$1(this.$faceData, null);
            this.I$0 = color;
            this.label = 1;
            obj = BuildersKt.withContext(io2, faceBleInfoViewModel$calculateFaceData$1$sourceData$1, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            byte[] bArr3 = (byte[]) obj;
            if (bArr3.length == 0) {
                Logger.d(this.this$0.getTAG(), "calculateFaceData error :sourceData.isEmpty");
                this.$errCallback.invoke2(new IllegalArgumentException("error source date:" + FaceManager.INSTANCE.getBleZip(this.$faceData.getFile_hash())));
                return Unit.INSTANCE;
            }
            FaceBleInfoViewModel faceBleInfoViewModel2 = this.this$0;
            String str = this.$bgPath;
            FaceData.BleExt ble_ext2 = this.$faceData.getBle_ext();
            String bottom_background = ble_ext2 != null ? ble_ext2.getBottom_background() : null;
            this.L$0 = bArr3;
            this.I$0 = color;
            this.label = 2;
            Object objLoadBitmap2 = faceBleInfoViewModel2.loadBitmap(str, bottom_background, this);
            if (objLoadBitmap2 == coroutine_suspended) {
                return coroutine_suspended;
            }
            bArr = bArr3;
            obj = objLoadBitmap2;
            bitmap = (Bitmap) obj;
            FaceBleInfoViewModel faceBleInfoViewModel3 = this.this$0;
            ble_ext = this.$faceData.getBle_ext();
            if (ble_ext != null) {
                upper_background = ble_ext.getUpper_background();
            } else {
                upper_background = null;
            }
            this.L$0 = bArr;
            this.L$1 = bitmap;
            this.I$0 = color;
            this.label = 3;
            objLoadBitmap = faceBleInfoViewModel3.loadBitmap(null, upper_background, this);
            if (objLoadBitmap == coroutine_suspended) {
                return coroutine_suspended;
            }
            bitmap2 = bitmap;
            i = color;
            obj = objLoadBitmap;
            FaceZhouHaiHelper.INSTANCE.getCustomClockDialData(this.$zhouHaiDeviceType, bArr, Color.red(i), Color.green(i), Color.blue(i), bitmap2, (Bitmap) obj);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.watch.face.viewmodel.FaceBleInfoViewModel$doInstallFace$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0018\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\bH\u0016¨\u0006\u000b"}, d2 = {"com/xiaomi/fitness/watch/face/viewmodel/FaceBleInfoViewModel$doInstallFace$1", "Lcom/xiaomi/fitness/device/contact/export/SyncStateListener;", LifecycleConstantKt.ON_START, "", "did", "", "onSyncing", BroadcastsKt.SILENT_PUSHING_PROGRESS, "", "onFinish", "code", "watch-face_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class C34021 implements SyncStateListener {
        final /* synthetic */ String $id;

        public C34021(String str) {
            this.$id = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void onFinish$lambda$0(FaceBleInfoViewModel this$0, String id) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(id, "$id");
            this$0.unRegisterPacket();
            Logger.i(this$0.getTAG(), "receivePacket installDataHandler: time out id = " + id);
            this$0.getFaceInstallRet().postValue(new FaceInstallRet(false, -1, null));
        }

        @Override // com.xiaomi.fitness.device.contact.export.SyncStateListener
        public void onFinish(String did, int code) {
            Intrinsics.checkNotNullParameter(did, "did");
            Logger.i(FaceBleInfoViewModel.this.getTAG(), "doInstallFace sendWatchFaceFile complete code: " + code);
            if (code != 0) {
                FaceBleInfoViewModel.this.getFaceInstallRet().postValue(new FaceInstallRet(false, 255, null));
                return;
            }
            Handler handler = FaceBleInfoViewModel.this.mHandler;
            final FaceBleInfoViewModel faceBleInfoViewModel = FaceBleInfoViewModel.this;
            final String str = this.$id;
            handler.postDelayed(new Runnable() { // from class: nn8
                @Override // java.lang.Runnable
                public final void run() {
                    FaceBleInfoViewModel.C34021.onFinish$lambda$0(faceBleInfoViewModel, str);
                }
            }, FaceBleInfoViewModel.this.getInstallTimeout(12000L));
            FaceBleInfoViewModel.this.installDataHandler.setFaceId(this.$id);
            DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE).addDataHandler(4, FaceBleInfoViewModel.this.installDataHandler);
        }

        @Override // com.xiaomi.fitness.device.contact.export.SyncStateListener
        public void onStart(String did) {
            Intrinsics.checkNotNullParameter(did, "did");
            Logger.i(FaceBleInfoViewModel.this.getTAG(), "doInstallFace start");
        }

        @Override // com.xiaomi.fitness.device.contact.export.SyncStateListener
        public void onSyncing(String did, int progress) {
            Intrinsics.checkNotNullParameter(did, "did");
            Logger.i(FaceBleInfoViewModel.this.getTAG(), "doInstallFace onSend: " + progress);
            FaceBleInfoViewModel.this.getInstallFaceProgress().postValue(Integer.valueOf(Math.min(99, progress)));
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.watch.face.viewmodel.FaceBleInfoViewModel$downloadFace$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.watch.face.viewmodel.FaceBleInfoViewModel$downloadFace$1", f = "FaceBleInfoViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class C34031 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ File $file;
        final /* synthetic */ String $id;
        final /* synthetic */ String $url;
        int label;
        final /* synthetic */ FaceBleInfoViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C34031(String str, File file, FaceBleInfoViewModel faceBleInfoViewModel, String str2, Continuation<? super C34031> continuation) {
            super(2, continuation);
            this.$url = str;
            this.$file = file;
            this.this$0 = faceBleInfoViewModel;
            this.$id = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C34031(this.$url, this.$file, this.this$0, this.$id, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            FaceDownloadHelper faceDownloadHelper = FaceDownloadHelper.INSTANCE;
            String str = this.$url;
            String absolutePath = this.$file.getAbsolutePath();
            Intrinsics.checkNotNullExpressionValue(absolutePath, "getAbsolutePath(...)");
            final FaceBleInfoViewModel faceBleInfoViewModel = this.this$0;
            final String str2 = this.$id;
            faceDownloadHelper.downloadFile(str, absolutePath, new tgc() { // from class: com.xiaomi.fitness.watch.face.viewmodel.FaceBleInfoViewModel.downloadFace.1.1
                @Override // defpackage.tgc
                public void onComplete() {
                    String model;
                    Logger.d(faceBleInfoViewModel.getTAG(), "doDownload onComplete: ");
                    faceBleInfoViewModel.getDownload().setValue(new DownloadRet(100, null));
                    if (RegionUtil.INSTANCE.isMedalSupport()) {
                        MedalManager medalManagerExtKt = MedalManagerExtKt.getInstance(MedalManager.INSTANCE);
                        String str3 = str2;
                        WearableDeviceModel device = faceBleInfoViewModel.getDevice();
                        if (device == null || (model = DeviceModelExtKt.getModel(device)) == null) {
                            model = "";
                        }
                        medalManagerExtKt.doMedalAssistFaceDownload(str3, model);
                    }
                }

                @Override // defpackage.tgc
                public void onError(String errorMsg) {
                    faceBleInfoViewModel.getDownload().setValue(new DownloadRet(-1, errorMsg));
                    Logger.d(faceBleInfoViewModel.getTAG(), "doDownload onError: " + errorMsg);
                }

                @Override // defpackage.tgc
                public void onProgress(int progress) {
                    faceBleInfoViewModel.getDownload().setValue(new DownloadRet(progress, null));
                    Logger.i("doDownload progress " + progress, new Object[0]);
                }
            });
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C34031) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.watch.face.viewmodel.FaceBleInfoViewModel$loadBitmap$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Landroid/graphics/Bitmap;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.watch.face.viewmodel.FaceBleInfoViewModel$loadBitmap$2", f = "FaceBleInfoViewModel.kt", i = {}, l = {782}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Bitmap>, Object> {
        final /* synthetic */ String $imgPath;
        final /* synthetic */ String $imgUrl;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(String str, String str2, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$imgPath = str;
            this.$imgUrl = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.$imgPath, this.$imgUrl, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Logger.d("loadBitmap path:" + this.$imgPath + ", url:" + this.$imgUrl, new Object[0]);
                    String str = this.$imgPath;
                    if (str != null && str.length() != 0) {
                        return BitmapFactory.decodeFile(FaceBlePhotoFragmentKt.getPngPath(this.$imgPath));
                    }
                    ImageLoader imageLoaderCreate = ImageLoaders.create(ApplicationExtKt.getApplication());
                    ImageRequest imageRequestBuild = new ImageRequest.Builder(ApplicationExtKt.getApplication()).data(this.$imgUrl).size((int) FaceIcon.ORI_WIDTH, (int) FaceIcon.ORI_HEIGHT).allowHardware(false).build();
                    this.label = 1;
                    obj = imageLoaderCreate.execute(imageRequestBuild, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type coil.request.SuccessResult");
                Drawable drawable = ((SuccessResult) obj).getDrawable();
                Intrinsics.checkNotNull(drawable, "null cannot be cast to non-null type android.graphics.drawable.BitmapDrawable");
                return ((BitmapDrawable) drawable).getBitmap();
            } catch (Exception e) {
                Logger.e("loadBitmap error:", e);
                e.printStackTrace();
                return null;
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Bitmap> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.watch.face.viewmodel.FaceBleInfoViewModel$requestData$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.watch.face.viewmodel.FaceBleInfoViewModel$requestData$1", f = "FaceBleInfoViewModel.kt", i = {}, l = {111}, m = "invokeSuspend", n = {}, s = {})
    public static final class C34051 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ WearableDeviceModel $device;
        final /* synthetic */ String $faceId;
        int label;
        final /* synthetic */ FaceBleInfoViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C34051(WearableDeviceModel wearableDeviceModel, String str, FaceBleInfoViewModel faceBleInfoViewModel, Continuation<? super C34051> continuation) {
            super(2, continuation);
            this.$device = wearableDeviceModel;
            this.$faceId = str;
            this.this$0 = faceBleInfoViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C34051(this.$device, this.$faceId, this.this$0, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                WatchFaceDao watchFaceDao = WatchFaceDataBase.INSTANCE.getInstance().watchFaceDao();
                String str = this.$device.getDeviceInfo().getDid() + this.$faceId;
                this.label = 1;
                obj = watchFaceDao.getWatchFace(str, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            FaceCommonEntity faceCommonEntity = (FaceCommonEntity) obj;
            Logger.i("requestData info: " + faceCommonEntity, new Object[0]);
            MutableLiveData<String> bgImg = this.this$0.getBgImg();
            String path = null;
            if (FaceManager.INSTANCE.isInstalled(this.$faceId)) {
                if ((faceCommonEntity != null ? faceCommonEntity.getPath() : null) != null) {
                    String path2 = faceCommonEntity.getPath();
                    Intrinsics.checkNotNull(path2);
                    if (new File(path2).exists()) {
                        path = faceCommonEntity.getPath();
                    }
                }
            }
            bgImg.postValue(path);
            FaceApiRequestV2 faceApiRequest = this.this$0.getFaceApiRequest();
            String model = this.$device.getDeviceInfo().getModel();
            String str2 = this.$faceId;
            String firmwareVersion = DeviceModelExtKt.getFirmwareVersion(this.$device);
            if (firmwareVersion == null) {
                firmwareVersion = "";
            }
            String str3 = firmwareVersion;
            final FaceBleInfoViewModel faceBleInfoViewModel = this.this$0;
            Function1<FaceDetailResultV2, Unit> function1 = new Function1<FaceDetailResultV2, Unit>() { // from class: com.xiaomi.fitness.watch.face.viewmodel.FaceBleInfoViewModel.requestData.1.1
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public /* bridge */ /* synthetic */ Unit invoke2(FaceDetailResultV2 faceDetailResultV2) {
                    invoke2(faceDetailResultV2);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public void invoke2(FaceDetailResultV2 result) {
                    Intrinsics.checkNotNullParameter(result, "result");
                    faceBleInfoViewModel.setSuccess(result);
                }
            };
            final FaceBleInfoViewModel faceBleInfoViewModel2 = this.this$0;
            FaceApiRequestV2.getFaceDetail$default(faceApiRequest, model, str2, str3, null, function1, new Function1<ApiException, Unit>() { // from class: com.xiaomi.fitness.watch.face.viewmodel.FaceBleInfoViewModel.requestData.1.2
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public /* bridge */ /* synthetic */ Unit invoke2(ApiException apiException) {
                    invoke2(apiException);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public void invoke2(ApiException p1) {
                    Intrinsics.checkNotNullParameter(p1, "p1");
                    faceBleInfoViewModel2.setError(p1.getErrorCode());
                }
            }, 8, null);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C34051) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.watch.face.viewmodel.FaceBleInfoViewModel$transferImg$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0018\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\bH\u0016¨\u0006\u000b"}, d2 = {"com/xiaomi/fitness/watch/face/viewmodel/FaceBleInfoViewModel$transferImg$1", "Lcom/xiaomi/fitness/device/contact/export/SyncStateListener;", LifecycleConstantKt.ON_START, "", "did", "", "onSyncing", BroadcastsKt.SILENT_PUSHING_PROGRESS, "", "onFinish", "code", "watch-face_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class C34081 implements SyncStateListener {
        final /* synthetic */ String $faceId;
        final /* synthetic */ int $segmentLength;

        public C34081(String str, int i) {
            this.$faceId = str;
            this.$segmentLength = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void onFinish$lambda$0(FaceBleInfoViewModel this$0, String faceId) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(faceId, "$faceId");
            this$0.unRegisterPacket();
            this$0.getBgImgTransfer().postValue(-1);
            Logger.i(this$0.getTAG(), "receivePacket ImgDataHandler: time out id = " + faceId);
        }

        @Override // com.xiaomi.fitness.device.contact.export.SyncStateListener
        public void onFinish(String did, int code) {
            Intrinsics.checkNotNullParameter(did, "did");
            Logger.i(FaceBleInfoViewModel.this.getTAG(), "sendWatchFaceBgImage onFinish: code = " + code);
            FaceBleInfoViewModel.this.unRegisterPacket();
            if (code != 0) {
                FaceBleInfoViewModel.this.getBgImgTransfer().postValue(255);
            }
            Handler handler = FaceBleInfoViewModel.this.mHandler;
            final FaceBleInfoViewModel faceBleInfoViewModel = FaceBleInfoViewModel.this;
            final String str = this.$faceId;
            handler.postDelayed(new Runnable() { // from class: on8
                @Override // java.lang.Runnable
                public final void run() {
                    FaceBleInfoViewModel.C34081.onFinish$lambda$0(faceBleInfoViewModel, str);
                }
            }, FaceBleInfoViewModel.this.getInstallTimeout(15000L));
            FaceBleInfoViewModel faceBleInfoViewModel2 = FaceBleInfoViewModel.this;
            faceBleInfoViewModel2.setImgDataHandler(new ImgDataHandler(faceBleInfoViewModel2, this.$faceId, true, this.$segmentLength));
            DeviceContact deviceSyncExtKt = DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE);
            ImgDataHandler imgDataHandler = FaceBleInfoViewModel.this.getImgDataHandler();
            Intrinsics.checkNotNull(imgDataHandler);
            deviceSyncExtKt.addDataHandler(4, imgDataHandler);
        }

        @Override // com.xiaomi.fitness.device.contact.export.SyncStateListener
        public void onStart(String did) {
            Intrinsics.checkNotNullParameter(did, "did");
            Logger.i("transferImg onStart", new Object[0]);
        }

        @Override // com.xiaomi.fitness.device.contact.export.SyncStateListener
        public void onSyncing(String did, int progress) {
            Intrinsics.checkNotNullParameter(did, "did");
            FaceBleInfoViewModel.this.getBgImgTransfer().postValue(Integer.valueOf(Math.min(99, progress)));
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.watch.face.viewmodel.FaceBleInfoViewModel$transferToDevice$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0018\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\bH\u0016¨\u0006\u000b"}, d2 = {"com/xiaomi/fitness/watch/face/viewmodel/FaceBleInfoViewModel$transferToDevice$1", "Lcom/xiaomi/fitness/device/contact/export/SyncStateListener;", LifecycleConstantKt.ON_START, "", "did", "", "onSyncing", BroadcastsKt.SILENT_PUSHING_PROGRESS, "", "onFinish", "code", "watch-face_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class C34091 implements SyncStateListener {
        final /* synthetic */ String $faceId;
        final /* synthetic */ boolean $isLastPhoto;
        final /* synthetic */ int $segmentLength;

        public C34091(String str, boolean z, int i) {
            this.$faceId = str;
            this.$isLastPhoto = z;
            this.$segmentLength = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void onFinish$lambda$0(FaceBleInfoViewModel this$0, String faceId) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(faceId, "$faceId");
            this$0.unRegisterPacket();
            this$0.getBgImgTransfer().postValue(-1);
            Logger.i(this$0.getTAG(), "receivePacket ImgDataHandler: time out id = " + faceId);
        }

        @Override // com.xiaomi.fitness.device.contact.export.SyncStateListener
        public void onFinish(String did, int code) {
            Intrinsics.checkNotNullParameter(did, "did");
            Logger.i(FaceBleInfoViewModel.this.getTAG(), "sendWatchFaceBgImage onFinish: code = " + code);
            FaceBleInfoViewModel.this.unRegisterPacket();
            if (code != 0) {
                FaceBleInfoViewModel.this.getBgImgTransfer().postValue(255);
            }
            Handler handler = FaceBleInfoViewModel.this.mHandler;
            final FaceBleInfoViewModel faceBleInfoViewModel = FaceBleInfoViewModel.this;
            final String str = this.$faceId;
            handler.postDelayed(new Runnable() { // from class: pn8
                @Override // java.lang.Runnable
                public final void run() {
                    FaceBleInfoViewModel.C34091.onFinish$lambda$0(faceBleInfoViewModel, str);
                }
            }, FaceBleInfoViewModel.this.getInstallTimeout(15000L));
            FaceBleInfoViewModel faceBleInfoViewModel2 = FaceBleInfoViewModel.this;
            faceBleInfoViewModel2.setImgDataHandler(new ImgDataHandler(faceBleInfoViewModel2, this.$faceId, this.$isLastPhoto, this.$segmentLength));
            DeviceContact deviceSyncExtKt = DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE);
            ImgDataHandler imgDataHandler = FaceBleInfoViewModel.this.getImgDataHandler();
            Intrinsics.checkNotNull(imgDataHandler);
            deviceSyncExtKt.addDataHandler(4, imgDataHandler);
        }

        @Override // com.xiaomi.fitness.device.contact.export.SyncStateListener
        public void onStart(String did) {
            Intrinsics.checkNotNullParameter(did, "did");
            Logger.i(FaceBleInfoViewModel.this.getTAG(), "transferToDevice start");
        }

        @Override // com.xiaomi.fitness.device.contact.export.SyncStateListener
        public void onSyncing(String did, int progress) {
            Intrinsics.checkNotNullParameter(did, "did");
            Logger.i(FaceBleInfoViewModel.this.getTAG(), "do transferImgToDevice onSend: " + progress);
            FaceBleInfoViewModel.this.getBgImgTransfer().postValue(Integer.valueOf((int) Math.min(99.0f, ((float) (progress / FaceBleInfoViewModel.this.getSize())) + ((((float) FaceBleInfoViewModel.this.getIndex()) * 100.0f) / ((float) FaceBleInfoViewModel.this.getSize())))));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MutableLiveData bgImgTransfer_delegate$lambda$7() {
        return new MutableLiveData();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MutableLiveData bgImg_delegate$lambda$2() {
        return new MutableLiveData();
    }

    public static /* synthetic */ void checkDeviceVersion$default(FaceBleInfoViewModel faceBleInfoViewModel, String str, String str2, Function1 function1, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = ".";
        }
        faceBleInfoViewModel.checkDeviceVersion(str, str2, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean checkVersionSupport(String curVersion, String targetVersion, String split) {
        if (TextUtils.equals(curVersion, targetVersion)) {
            return true;
        }
        try {
            List listSplit$default = StringsKt__StringsKt.split$default((CharSequence) curVersion, new String[]{split}, false, 0, 6, (Object) null);
            List listSplit$default2 = StringsKt__StringsKt.split$default((CharSequence) targetVersion, new String[]{split}, false, 0, 6, (Object) null);
            if (listSplit$default.size() != listSplit$default2.size()) {
                return false;
            }
            int i = 0;
            for (Object obj : listSplit$default) {
                int i2 = i + 1;
                if (i < 0) {
                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                }
                String str = (String) obj;
                if (!TextUtils.equals(str, (CharSequence) listSplit$default2.get(i))) {
                    return Integer.parseInt(str) > Integer.parseInt((String) listSplit$default2.get(i));
                }
                i = i2;
            }
        } catch (Exception e) {
            Logger.e(getTAG(), "checkDeviceVersion(" + targetVersion + "," + targetVersion + "," + split + ") error:", e);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WearableDeviceModel device_delegate$lambda$1() {
        return (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MutableLiveData dismissDialogLiveData_delegate$lambda$0() {
        return new MutableLiveData();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MutableLiveData download_delegate$lambda$10() {
        return new MutableLiveData();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MutableLiveData editRet_delegate$lambda$4() {
        return new MutableLiveData();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MutableLiveData faceInstallRet_delegate$lambda$12() {
        return new MutableLiveData();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final WearableDeviceModel getDevice() {
        return (WearableDeviceModel) this.device.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long getInstallTimeout(long timeout) {
        if (AppUtil.INSTANCE.isPlayChannel()) {
            return 80000L;
        }
        return timeout;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void initInstallProgressSize$default(FaceBleInfoViewModel faceBleInfoViewModel, long j, long j2, List list, int i, Object obj) {
        if ((i & 2) != 0) {
            j2 = 0;
        }
        long j3 = j2;
        if ((i & 4) != 0) {
            list = null;
        }
        faceBleInfoViewModel.initInstallProgressSize(j, j3, list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MutableLiveData installFaceProgress_delegate$lambda$13() {
        return new MutableLiveData();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object loadBitmap(String str, String str2, Continuation<? super Bitmap> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new AnonymousClass2(str, str2, null), continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit requestDownload$lambda$8(FaceBleInfoViewModel this$0, Function1 result, FaceDownloadResultV2 it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(result, "$result");
        Intrinsics.checkNotNullParameter(it, "it");
        Logger.i(this$0.getTAG(), "requestDownload success: " + it.getLicense());
        result.invoke2(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit requestDownload$lambda$9(FaceBleInfoViewModel this$0, Function1 result, ApiException it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(result, "$result");
        Intrinsics.checkNotNullParameter(it, "it");
        Logger.e(this$0.getTAG(), "requestDownload fail: " + it);
        result.invoke2(null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MutableLiveData setFaceResult_delegate$lambda$3() {
        return new MutableLiveData();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void transferToDevice(List<FacePhotoItem> faceList, String faceId, int segmentLength) {
        WearableDeviceInfo deviceInfo;
        WearableDeviceModel device = getDevice();
        String did = (device == null || (deviceInfo = device.getDeviceInfo()) == null) ? null : deviceInfo.getDid();
        String str = faceList.get(this.index).path;
        boolean z = this.index + 1 == this.size;
        unRegisterPacket();
        DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE).sendFile(did, 3, 0, str, segmentLength, new C34091(faceId, z, segmentLength));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void unRegisterPacket() {
        this.mHandler.removeCallbacksAndMessages(null);
        if (getDevice() != null) {
            Logger.i(getTAG(), "do unRegisterPacket");
            if (this.imgDataHandler != null) {
                DeviceContact deviceSyncExtKt = DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE);
                ImgDataHandler imgDataHandler = this.imgDataHandler;
                Intrinsics.checkNotNull(imgDataHandler);
                deviceSyncExtKt.removeDataHandler(4, imgDataHandler);
            }
            DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE).removeDataHandler(4, this.installDataHandler);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MutableLiveData wearOSFaceInstallRet_delegate$lambda$11() {
        return new MutableLiveData();
    }

    @Override // com.xiaomi.fitness.watch.face.viewmodel.BaseStateViewModel, com.xiaomi.fitness.baseui.BaseViewModel, com.xiaomi.fitness.baseui.AbsViewModel
    public void attach(@Nullable Bundle savedInstanceState) {
    }

    public final void calculateFaceData(int zhouHaiDeviceType, @NotNull String spiritColor, @Nullable String bgPath, @NotNull FaceData faceData, @NotNull Function1<? super Exception, Unit> errCallback) {
        Intrinsics.checkNotNullParameter(spiritColor, "spiritColor");
        Intrinsics.checkNotNullParameter(faceData, "faceData");
        Intrinsics.checkNotNullParameter(errCallback, "errCallback");
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new AnonymousClass1(spiritColor, this, errCallback, faceData, bgPath, zhouHaiDeviceType, null), 3, null);
    }

    public final void checkDeviceVersion(@NotNull final String targetVersion, @NotNull final String split, @NotNull final Function1<? super Boolean, Unit> callback) {
        Intrinsics.checkNotNullParameter(targetVersion, "targetVersion");
        Intrinsics.checkNotNullParameter(split, "split");
        Intrinsics.checkNotNullParameter(callback, "callback");
        s7r s7rVar = new s7r();
        s7rVar.e = 2;
        s7rVar.f = 2;
        DeviceContact deviceSyncExtKt = DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE);
        WearableDeviceModel device = getDevice();
        DeviceContact.DefaultImpls.call$default(deviceSyncExtKt, device != null ? device.getDid() : null, s7rVar, true, new OnSyncCallback() { // from class: com.xiaomi.fitness.watch.face.viewmodel.FaceBleInfoViewModel.checkDeviceVersion.1
            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onError(String did, int type, int code) {
                callback.invoke2(Boolean.FALSE);
            }

            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onSuccess(String did, int type, SyncResult result) {
                txo txoVarE;
                swo swoVarR;
                if (result == null || !FaceExtKt.isSuccess(result)) {
                    return;
                }
                s7r packet = result.getPacket();
                String str = (packet == null || (txoVarE = packet.E()) == null || (swoVarR = txoVarE.r()) == null) ? null : swoVarR.d;
                if (str != null) {
                    callback.invoke2(Boolean.valueOf(this.checkVersionSupport(str, targetVersion, split)));
                } else {
                    callback.invoke2(Boolean.FALSE);
                }
            }
        }, 0, 16, (Object) null);
    }

    public final void deleteFace(@NotNull String id) {
        Intrinsics.checkNotNullParameter(id, "id");
        s7r s7rVar = new s7r();
        s7rVar.e = 4;
        s7rVar.f = 2;
        v5r v5rVar = new v5r();
        v5rVar.C(id);
        s7rVar.e0(v5rVar);
        DeviceContact deviceSyncExtKt = DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE);
        WearableDeviceModel device = getDevice();
        DeviceContact.DefaultImpls.call$default(deviceSyncExtKt, device != null ? device.getDid() : null, s7rVar, true, new OnSyncCallback() { // from class: com.xiaomi.fitness.watch.face.viewmodel.FaceBleInfoViewModel.deleteFace.1
            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onError(String did, int type, int code) {
                Logger.i(FaceBleInfoViewModel.this.getTAG(), "deleteFace fail: " + code);
                FaceBleInfoViewModel.this.getDelete().postValue(Integer.valueOf(code));
            }

            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onSuccess(String did, int type, SyncResult result) {
                s7r packet;
                if (((result == null || (packet = result.getPacket()) == null) ? null : packet.G()) != null) {
                    s7r packet2 = result.getPacket();
                    Intrinsics.checkNotNull(packet2);
                    if (packet2.G().v()) {
                        Logger.i(FaceBleInfoViewModel.this.getTAG(), "deleteFace succeed");
                        FaceBleInfoViewModel.this.getDelete().postValue(0);
                        return;
                    }
                }
                Logger.i(FaceBleInfoViewModel.this.getTAG(), "deleteFace fail");
                FaceBleInfoViewModel.this.getDelete().postValue(255);
            }
        }, 0, 16, (Object) null);
    }

    public final void dismissDialog() {
        getDismissDialogLiveData().postValue(Boolean.TRUE);
    }

    public final void doInstallFace(@NotNull File file, @NotNull String id, @Nullable Integer segmentLength) {
        WearableDeviceInfo deviceInfo;
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(id, "id");
        unRegisterPacket();
        DeviceContact deviceSyncExtKt = DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE);
        WearableDeviceModel device = getDevice();
        String did = (device == null || (deviceInfo = device.getDeviceInfo()) == null) ? null : deviceInfo.getDid();
        String absolutePath = file.getAbsolutePath();
        Intrinsics.checkNotNull(segmentLength);
        deviceSyncExtKt.sendFile(did, 1, 0, absolutePath, segmentLength.intValue(), new C34021(id));
    }

    public final void downloadFace(@NotNull String url, @NotNull File file, @NotNull String id) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(id, "id");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new C34031(url, file, this, id, null), 2, null);
    }

    @NotNull
    public final MutableLiveData<String> getBgImg() {
        return (MutableLiveData) this.bgImg.getValue();
    }

    @NotNull
    public final MutableLiveData<Integer> getBgImgTransfer() {
        return (MutableLiveData) this.bgImgTransfer.getValue();
    }

    public final int getCanAcceptCount() {
        return this.canAcceptCount;
    }

    @NotNull
    public final MutableLiveData<Integer> getDelete() {
        return this.delete;
    }

    @NotNull
    public final MutableLiveData<Boolean> getDismissDialogLiveData() {
        return (MutableLiveData) this.dismissDialogLiveData.getValue();
    }

    @NotNull
    public final MutableLiveData<DownloadRet> getDownload() {
        return (MutableLiveData) this.download.getValue();
    }

    public final int getDownloadProgress(int progress) {
        return Math.min(1, Math.max((int) ((progress / 100.0f) * 1), 0));
    }

    @NotNull
    public final MutableLiveData<EditRet> getEditRet() {
        return (MutableLiveData) this.editRet.getValue();
    }

    @NotNull
    public final FaceApiRequestV2 getFaceApiRequest() {
        FaceApiRequestV2 faceApiRequestV2 = this.faceApiRequest;
        if (faceApiRequestV2 != null) {
            return faceApiRequestV2;
        }
        Intrinsics.throwUninitializedPropertyAccessException("faceApiRequest");
        return null;
    }

    @NotNull
    public final MutableLiveData<FaceInstallRet> getFaceInstallRet() {
        return (MutableLiveData) this.faceInstallRet.getValue();
    }

    @Nullable
    public final ImgDataHandler getImgDataHandler() {
        return this.imgDataHandler;
    }

    public final int getImgProgress(int usedProgress, int progress) {
        return (int) (((progress / 100.0f) * (100 - usedProgress)) + usedProgress);
    }

    public final int getIndex() {
        return this.index;
    }

    @NotNull
    public final MutableLiveData<Integer> getInstallFaceProgress() {
        return (MutableLiveData) this.installFaceProgress.getValue();
    }

    public final int getPushProgress(int usedProgress, int progress, boolean hasImg) {
        return (int) (((progress / 100.0f) * this.installProgressSize) + usedProgress);
    }

    public final int getReceiveCount() {
        return this.receiveCount;
    }

    @NotNull
    public final String getSendFaceId() {
        return this.sendFaceId;
    }

    @NotNull
    public final List<FacePhotoItem> getSendFaceList() {
        return this.sendFaceList;
    }

    @NotNull
    public final MutableLiveData<Boolean> getSetFaceResult() {
        return (MutableLiveData) this.setFaceResult.getValue();
    }

    public final int getSize() {
        return this.size;
    }

    @Override // com.xiaomi.fitness.baseui.BaseViewModel
    @NotNull
    public String getTAG() {
        return "FaceBleInfoViewModel";
    }

    @NotNull
    public final MutableLiveData<WearOSFaceInstallRet> getWearOSFaceInstallRet() {
        return (MutableLiveData) this.wearOSFaceInstallRet.getValue();
    }

    public final void initInstallProgressSize(long fileSize, long imgSize, @Nullable List<FacePhotoItem> imgList) {
        if (imgSize != 0) {
            this.installProgressSize = (((long) 100) * fileSize) / (imgSize + fileSize);
        }
        if (imgList != null) {
            Iterator<FacePhotoItem> it = imgList.iterator();
            int i = 0;
            while (it.hasNext()) {
                i += it.next().size;
            }
            this.installProgressSize = RangesKt___RangesKt.coerceAtMost((((long) 100) * fileSize) / (fileSize + ((long) i)), 99L);
        }
    }

    public final void initZipImgRatio(long zipSize) {
        if (this.zipImgRatio == 0.0f) {
            float f = zipSize;
            this.zipImgRatio = f / (((FaceIcon.ORI_HEIGHT * FaceIcon.ORI_WIDTH) * 2) + f);
        }
    }

    public final void installBleFace(@NotNull String id, @NotNull File file, long version, long size, @Nullable String license, @Nullable String sign, @NotNull Function3<? super Boolean, ? super Integer, ? super Integer, Unit> action) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(action, "action");
        WearableDeviceModel device = getDevice();
        Intrinsics.checkNotNull(device);
        if (!DeviceModelExtKt.isBluetooth(device) || !file.exists()) {
            action.invoke(Boolean.FALSE, 255, null);
        }
        this.faceInstallController.preInstall(id, file.getAbsolutePath(), version, size, true, license, sign, 0, action);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0022  */
    public final void installWearOsFace(@Nullable FaceData data) {
        String config_file = data != null ? data.getConfig_file() : null;
        if (config_file == null || config_file.length() == 0) {
            getWearOSFaceInstallRet().postValue(new WearOSFaceInstallRet(false, 255));
            Logger.i(getTAG(), "installWearOsFace: data valid");
        } else {
            String package_name = data != null ? data.getPackage_name() : null;
            if (package_name == null || package_name.length() == 0) {
                getWearOSFaceInstallRet().postValue(new WearOSFaceInstallRet(false, 255));
                Logger.i(getTAG(), "installWearOsFace: data valid");
            }
        }
        Logger.i(getTAG(), "installBleFace wear os: face = " + data);
        s7r s7rVar = new s7r();
        s7rVar.e = 15;
        s7rVar.f = 3;
        s7rVar.W(data != null ? data.toMarket() : null);
        DeviceContact deviceSyncExtKt = DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE);
        WearableDeviceModel device = getDevice();
        DeviceContact.DefaultImpls.call$default(deviceSyncExtKt, device != null ? device.getDid() : null, s7rVar, true, new OnSyncCallback() { // from class: com.xiaomi.fitness.watch.face.viewmodel.FaceBleInfoViewModel.installWearOsFace.1
            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onError(String did, int type, int code) {
                FaceBleInfoViewModel.this.getWearOSFaceInstallRet().postValue(new WearOSFaceInstallRet(false, code));
            }

            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onSuccess(String did, int type, SyncResult result) {
                m5f m5fVarY;
                if (result == null) {
                    FaceBleInfoViewModel.this.getWearOSFaceInstallRet().postValue(new WearOSFaceInstallRet(false, 255));
                    return;
                }
                s7r packet = result.getPacket();
                l5f l5fVarO = (packet == null || (m5fVarY = packet.y()) == null) ? null : m5fVarY.o();
                if (l5fVarO != null) {
                    FaceBleInfoViewModel.this.getWearOSFaceInstallRet().postValue(new WearOSFaceInstallRet(true, l5fVarO.c));
                } else {
                    FaceBleInfoViewModel.this.getWearOSFaceInstallRet().postValue(new WearOSFaceInstallRet(false, 255));
                }
            }
        }, 0, 16, (Object) null);
    }

    public final boolean isDeviceConnected() {
        WearableDeviceModel device = getDevice();
        return device != null && device.getIsCurrent() && device.getIsDeviceConnected();
    }

    @Override // com.xiaomi.fitness.watch.face.viewmodel.BaseStateViewModel, defpackage.dvq
    public void onCleared() {
        super.onCleared();
        unRegisterPacket();
        this.imgDataHandler = null;
    }

    public final void requestData(@Nullable String faceId, @Nullable String bgImgMd5) {
        WearableDeviceInfo deviceInfo;
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (((wearableDeviceModel == null || (deviceInfo = wearableDeviceModel.getDeviceInfo()) == null) ? null : deviceInfo.getModel()) == null || faceId == null) {
            setError();
        } else {
            setLoading();
            BuildersKt__Builders_commonKt.launch$default(this, null, null, new C34051(wearableDeviceModel, faceId, this, null), 3, null);
        }
    }

    @Nullable
    public final Object requestDownload(@NotNull String str, @NotNull final Function1<? super FaceDownloadResultV2, Unit> function1, @NotNull Continuation<? super Unit> continuation) {
        String model;
        String did;
        Logger.i(getTAG(), "requestDownload realFaceId: " + str);
        FaceApiRequestV2 faceApiRequest = getFaceApiRequest();
        WearableDeviceModel device = getDevice();
        String str2 = (device == null || (did = device.getDid()) == null) ? "" : did;
        WearableDeviceModel device2 = getDevice();
        Object objRequestDownload = faceApiRequest.requestDownload(str2, (device2 == null || (model = DeviceModelExtKt.getModel(device2)) == null) ? "" : model, str, false, str, new Function1() { // from class: bn8
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return FaceBleInfoViewModel.requestDownload$lambda$8(this.f4387a, function1, (FaceDownloadResultV2) obj);
            }
        }, new Function1() { // from class: en8
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return FaceBleInfoViewModel.requestDownload$lambda$9(this.f16837a, function1, (ApiException) obj);
            }
        }, continuation);
        return objRequestDownload == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objRequestDownload : Unit.INSTANCE;
    }

    public final void requestEdit(@NotNull String id, @NotNull String bgColor, @NotNull String bgImgMd5, long bgImgSize, @NotNull String style, @Nullable ArrayList<Integer> dataList, @Nullable String spiritColor, boolean setCurrent) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(bgColor, "bgColor");
        Intrinsics.checkNotNullParameter(bgImgMd5, "bgImgMd5");
        Intrinsics.checkNotNullParameter(style, "style");
        p5r p5rVar = new p5r();
        p5rVar.c = id;
        p5rVar.g = bgImgMd5;
        p5rVar.h = (int) bgImgSize;
        p5rVar.p = style;
        if (FaceManager.INSTANCE.getFlag()) {
            p5rVar.e = bgColor;
        }
        if (dataList != null && !dataList.isEmpty()) {
            p5rVar.n = CollectionsKt___CollectionsKt.toIntArray(dataList);
        }
        if (spiritColor != null && spiritColor.length() != 0 && StringsKt__StringsJVMKt.startsWith$default(spiritColor, PluginPackageConstant.RN_SDK_TIMESTAMP_PREFIX, false, 2, null) && (spiritColor.length() == 9 || spiritColor.length() == 7)) {
            int color = Color.parseColor(spiritColor);
            p5rVar.f = new byte[]{-1, (byte) ((color >> 16) & 255), (byte) ((color >> 8) & 255), (byte) (color & 255)};
        }
        p5rVar.d = setCurrent;
        v5r v5rVar = new v5r();
        v5rVar.B(p5rVar);
        s7r s7rVar = new s7r();
        s7rVar.e = 4;
        s7rVar.f = 11;
        s7rVar.e0(v5rVar);
        Logger.i(getTAG(), "requestEdit packet: " + s7rVar);
        DeviceContact deviceSyncExtKt = DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE);
        WearableDeviceModel device = getDevice();
        DeviceContact.DefaultImpls.call$default(deviceSyncExtKt, device != null ? device.getDid() : null, s7rVar, true, new OnSyncCallback() { // from class: com.xiaomi.fitness.watch.face.viewmodel.FaceBleInfoViewModel.requestEdit.2
            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onError(String did, int type, int code) {
                FaceBleInfoViewModel.this.getEditRet().postValue(new EditRet(code, 0));
            }

            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onSuccess(String did, int type, SyncResult result) {
                s7r packet;
                v5r v5rVarG;
                q5r q5rVarQ = (result == null || (packet = result.getPacket()) == null || (v5rVarG = packet.G()) == null) ? null : v5rVarG.q();
                FaceBleInfoViewModel.this.getEditRet().postValue(new EditRet(q5rVarQ != null ? q5rVarQ.d : 4, q5rVarQ != null ? q5rVarQ.f : 0));
            }
        }, 0, 16, (Object) null);
    }

    public final void setCanAcceptCount(int i) {
        this.canAcceptCount = i;
    }

    public final void setFaceApiRequest(@NotNull FaceApiRequestV2 faceApiRequestV2) {
        Intrinsics.checkNotNullParameter(faceApiRequestV2, "<set-?>");
        this.faceApiRequest = faceApiRequestV2;
    }

    public final void setFaceId(@NotNull String id) {
        Intrinsics.checkNotNullParameter(id, "id");
        Logger.i(getTAG(), "setFaceId: " + id);
        s7r s7rVar = new s7r();
        s7rVar.e = 4;
        s7rVar.f = 1;
        v5r v5rVar = new v5r();
        v5rVar.C(id);
        s7rVar.e0(v5rVar);
        DeviceContact deviceSyncExtKt = DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE);
        WearableDeviceModel device = getDevice();
        DeviceContact.DefaultImpls.call$default(deviceSyncExtKt, device != null ? device.getDid() : null, s7rVar, true, new OnSyncCallback() { // from class: com.xiaomi.fitness.watch.face.viewmodel.FaceBleInfoViewModel.setFaceId.1
            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onError(String did, int type, int code) {
                Logger.i(FaceBleInfoViewModel.this.getTAG(), "setFaceId error: code: " + code);
                FaceBleInfoViewModel.this.getSetFaceResult().postValue(Boolean.FALSE);
            }

            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onSuccess(String did, int type, SyncResult result) {
                v5r v5rVarG;
                if (result == null) {
                    FaceBleInfoViewModel.this.getSetFaceResult().postValue(Boolean.FALSE);
                    return;
                }
                MutableLiveData<Boolean> setFaceResult = FaceBleInfoViewModel.this.getSetFaceResult();
                s7r packet = result.getPacket();
                setFaceResult.postValue((packet == null || (v5rVarG = packet.G()) == null) ? null : Boolean.valueOf(v5rVarG.v()));
            }
        }, 0, 16, (Object) null);
    }

    public final void setImgDataHandler(@Nullable ImgDataHandler imgDataHandler) {
        this.imgDataHandler = imgDataHandler;
    }

    public final void setIndex(int i) {
        this.index = i;
    }

    public final void setReceiveCount(int i) {
        this.receiveCount = i;
    }

    public final void setSendFaceId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.sendFaceId = str;
    }

    public final void setSendFaceList(@NotNull List<FacePhotoItem> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.sendFaceList = list;
    }

    public final void setSize(int i) {
        this.size = i;
    }

    public final void transferImg(@NotNull String path, @NotNull String faceId, int segmentLength) {
        WearableDeviceInfo deviceInfo;
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(faceId, "faceId");
        unRegisterPacket();
        DeviceContact deviceSyncExtKt = DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE);
        WearableDeviceModel device = getDevice();
        deviceSyncExtKt.sendFile((device == null || (deviceInfo = device.getDeviceInfo()) == null) ? null : deviceInfo.getDid(), 3, 0, path, segmentLength, new C34081(faceId, segmentLength));
    }

    public final void transferImgList(@NotNull List<FacePhotoItem> faceList, @NotNull String faceId, int segmentLength) {
        Intrinsics.checkNotNullParameter(faceList, "faceList");
        Intrinsics.checkNotNullParameter(faceId, "faceId");
        if (faceList.isEmpty()) {
            Logger.i(getTAG(), "faceList.isNullOrEmpty");
            ToastExtKt.toastShort(AppUtil.getApp(), p1j.common_hint_unkonwn_error);
            return;
        }
        this.size = faceList.size();
        this.sendFaceList = faceList;
        this.sendFaceId = faceId;
        this.index = 0;
        transferToDevice(faceList, faceId, segmentLength);
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\u0004\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0012\u001a\u00020\b\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0004¢\u0006\u0004\b\u0014\u0010\u0015J)\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0016"}, d2 = {"Lcom/xiaomi/fitness/watch/face/viewmodel/FaceBleInfoViewModel$ImgDataHandler;", "Lcom/xiaomi/fitness/device/contact/export/DataHandlerWrapper;", "", "did", "", "type", "Ls7r;", "packet", "", "handlePacket", "(Ljava/lang/String;ILs7r;)Z", "id", "Ljava/lang/String;", "isLastPhoto", "Z", "segmentLength", "I", "photoId", "lastPhoto", "length", "<init>", "(Lcom/xiaomi/fitness/watch/face/viewmodel/FaceBleInfoViewModel;Ljava/lang/String;ZI)V", "watch-face_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public final class ImgDataHandler extends DataHandlerWrapper {

        @NotNull
        private final String id;
        private final boolean isLastPhoto;
        private final int segmentLength;
        final /* synthetic */ FaceBleInfoViewModel this$0;

        public ImgDataHandler(@NotNull FaceBleInfoViewModel faceBleInfoViewModel, String photoId, boolean z, int i) {
            Intrinsics.checkNotNullParameter(photoId, "photoId");
            this.this$0 = faceBleInfoViewModel;
            this.id = photoId;
            this.isLastPhoto = z;
            this.segmentLength = i;
        }

        @Override // com.xiaomi.fitness.device.contact.export.DataHandlerWrapper, com.xiaomi.fitness.device.contact.export.DataHandler
        public boolean handlePacket(@NotNull String did, int type, @Nullable s7r packet) {
            Intrinsics.checkNotNullParameter(did, "did");
            if (type != 4 || packet == null || packet.f != 12) {
                return false;
            }
            Logger.i(this.this$0.getTAG(), "receivePacket ImgDataHandler");
            v5r v5rVarG = packet.G();
            if ((v5rVarG != null ? v5rVarG.o() : null) == null) {
                Logger.i(this.this$0.getTAG(), "ImgDataHandler receivePacket receiver type = " + type + "; face = " + (packet.G() == null));
                return false;
            }
            o5r o5rVarO = packet.G().o();
            Logger.i(this.this$0.getTAG(), "ImgDataHandler receivePacket receiver id = " + o5rVarO.d + "; reqId = " + this.id + "; code = " + o5rVarO.c + " isLastPhoto: " + this.isLastPhoto);
            if (!Intrinsics.areEqual(this.id, o5rVarO.d)) {
                this.this$0.unRegisterPacket();
                this.this$0.getBgImgTransfer().postValue(255);
                return false;
            }
            if (this.isLastPhoto) {
                MutableLiveData<Integer> bgImgTransfer = this.this$0.getBgImgTransfer();
                int i = o5rVarO.c;
                if (i == 0) {
                    i = 100;
                }
                bgImgTransfer.postValue(Integer.valueOf(i));
            } else if (o5rVarO.c != 0) {
                this.this$0.getBgImgTransfer().postValue(Integer.valueOf(o5rVarO.c));
            } else {
                this.this$0.setIndex(this.this$0.getIndex() + 1);
                FaceBleInfoViewModel faceBleInfoViewModel = this.this$0;
                faceBleInfoViewModel.transferToDevice(faceBleInfoViewModel.getSendFaceList(), this.this$0.getSendFaceId(), this.segmentLength);
            }
            this.this$0.unRegisterPacket();
            return true;
        }

        public /* synthetic */ ImgDataHandler(FaceBleInfoViewModel faceBleInfoViewModel, String str, boolean z, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(faceBleInfoViewModel, (i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? true : z, (i2 & 4) != 0 ? 0 : i);
        }
    }

    public final void requestEdit(@NotNull String id, @NotNull String[] bgImgMd5List, @NotNull int[] bgImgSizeList, @NotNull String[] bgImgOrderList, @NotNull String style, boolean setCurrent, boolean needOrderList, boolean deleteAllImages, @Nullable String spiritColor) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(bgImgMd5List, "bgImgMd5List");
        Intrinsics.checkNotNullParameter(bgImgSizeList, "bgImgSizeList");
        Intrinsics.checkNotNullParameter(bgImgOrderList, "bgImgOrderList");
        Intrinsics.checkNotNullParameter(style, "style");
        p5r p5rVar = new p5r();
        p5rVar.c = id;
        if (needOrderList) {
            p5rVar.f30040k = bgImgOrderList;
        }
        p5rVar.i = bgImgMd5List;
        p5rVar.j = bgImgSizeList;
        p5rVar.p = style;
        p5rVar.d = setCurrent;
        p5rVar.l = deleteAllImages;
        if (spiritColor != null && spiritColor.length() != 0 && StringsKt__StringsJVMKt.startsWith$default(spiritColor, PluginPackageConstant.RN_SDK_TIMESTAMP_PREFIX, false, 2, null) && (spiritColor.length() == 9 || spiritColor.length() == 7)) {
            int color = Color.parseColor(spiritColor);
            p5rVar.f = new byte[]{-1, (byte) ((color >> 16) & 255), (byte) ((color >> 8) & 255), (byte) (color & 255)};
        }
        v5r v5rVar = new v5r();
        v5rVar.B(p5rVar);
        s7r s7rVar = new s7r();
        s7rVar.e = 4;
        s7rVar.f = 11;
        s7rVar.e0(v5rVar);
        Logger.i(getTAG(), "requestEdit: " + s7rVar);
        DeviceContact deviceSyncExtKt = DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE);
        WearableDeviceModel device = getDevice();
        DeviceContact.DefaultImpls.call$default(deviceSyncExtKt, device != null ? device.getDid() : null, s7rVar, true, new OnSyncCallback() { // from class: com.xiaomi.fitness.watch.face.viewmodel.FaceBleInfoViewModel.requestEdit.4
            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onError(String did, int type, int code) {
                FaceBleInfoViewModel.this.getEditRet().postValue(new EditRet(code, 0));
            }

            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onSuccess(String did, int type, SyncResult result) {
                s7r packet;
                v5r v5rVarG;
                q5r q5rVarQ = (result == null || (packet = result.getPacket()) == null || (v5rVarG = packet.G()) == null) ? null : v5rVarG.q();
                if (q5rVarQ == null) {
                    onError(did, type, 4);
                } else {
                    FaceBleInfoViewModel.this.setCanAcceptCount(q5rVarQ.e);
                    FaceBleInfoViewModel.this.getEditRet().postValue(new EditRet(q5rVarQ.d, q5rVarQ.f));
                }
            }
        }, 0, 16, (Object) null);
    }
}
