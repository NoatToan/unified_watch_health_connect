package com.xiaomi.fitness.watch.face.data;

import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.widget.ImageView;
import androidx.health.connect.client.records.metadata.DeviceTypes;
import androidx.lifecycle.Lifecycle;
import com.miui.tsmclient.util.Constants;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.DisplayUtil;
import com.xiaomi.fitness.common.utils.SettingsPropertiesUtil;
import com.xiaomi.fitness.common.utils.SystemProperties;
import com.xiaomi.fitness.common.utils.UIUtils;
import com.xiaomi.fitness.device.manager.bean.Product;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.login.region.RegionManagerImpl;
import com.xiaomi.fitness.net.extensions.ScopeExtKt;
import com.xiaomi.fitness.watch.face.FaceInfoBase;
import com.xiaomi.fitness.watch.face.db.FaceCommonEntity;
import com.xiaomi.fitness.watch.face.db.WatchFaceDao;
import com.xiaomi.fitness.watch.face.db.WatchFaceDataBase;
import com.xiaomi.fitness.watch.face.export.data.FaceData;
import com.xiaomi.fitness.watch.face.export.data.WatchFace;
import com.xiaomi.fitness.watch.face.export.exportview.FaceIcon;
import com.xiaomi.fitness.watch.face.helper.ImageLoadUtil;
import com.xiaomi.fitness.watch.face.impl.Callback;
import com.xiaomi.hm.health.bt.model.HMSedentaryConfig;
import defpackage.uw8;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt__MathJVMKt;
import kotlin.ranges.RangesKt___RangesKt;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000°\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u001d\n\u0002\u0010\u0015\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000e0\u001fJ\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u000e0!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u000e2\b\u0010#\u001a\u0004\u0018\u00010\u0005J\u0010\u0010$\u001a\u00020\u00142\b\u0010#\u001a\u0004\u0018\u00010\u0005J\u001a\u0010%\u001a\u00020\u00142\b\u0010&\u001a\u0004\u0018\u00010\u000e2\b\u0010'\u001a\u0004\u0018\u00010(J\u0010\u0010)\u001a\u00020\u00142\b\u0010&\u001a\u0004\u0018\u00010\u000eJ\u0010\u0010*\u001a\u00020\u00142\b\u0010&\u001a\u0004\u0018\u00010\u000eJ\u001a\u0010+\u001a\u00020\u00142\b\u0010&\u001a\u0004\u0018\u00010\u000e2\b\u0010,\u001a\u0004\u0018\u00010-J\b\u0010.\u001a\u0004\u0018\u00010\u000eJ\u0010\u0010/\u001a\u0002002\b\u00101\u001a\u0004\u0018\u00010\u000eJ\u000e\u0010/\u001a\u0002002\u0006\u0010#\u001a\u00020\u0005J\u0010\u00102\u001a\u0002002\b\u00103\u001a\u0004\u0018\u00010\u000eJ\u0016\u00104\u001a\u0002002\u000e\u00105\u001a\n\u0012\u0004\u0012\u00020-\u0018\u00010!J\u0006\u00108\u001a\u000200J\u0006\u00109\u001a\u000200J\u0010\u0010:\u001a\u0002002\b\u0010;\u001a\u0004\u0018\u00010\u0001J\u0016\u0010<\u001a\u0002002\u000e\u0010=\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010!J\u0010\u0010E\u001a\u00020\u00102\b\u0010'\u001a\u0004\u0018\u00010(J\u0006\u0010T\u001a\u00020\u0014J\u001a\u0010U\u001a\u0002002\b\u0010V\u001a\u0004\u0018\u00010\u00052\b\u00106\u001a\u0004\u0018\u00010NJ\u000e\u0010W\u001a\u00020\u00052\u0006\u0010#\u001a\u00020\u0005J\u0012\u0010X\u001a\u00020\u00142\b\u0010Y\u001a\u0004\u0018\u00010\u0005H\u0002J\u0010\u0010Z\u001a\u00020\u00102\b\u0010[\u001a\u0004\u0018\u00010\u0005J\u000e\u0010\\\u001a\u00020\u00052\u0006\u0010[\u001a\u00020\u0005JJ\u0010]\u001a\u0002002\b\u0010&\u001a\u0004\u0018\u00010\u000e2\u0006\u0010^\u001a\u00020_2\b\b\u0002\u0010`\u001a\u00020\u00142\b\b\u0002\u0010*\u001a\u00020\u00142\b\b\u0002\u0010a\u001a\u00020\u00142\b\b\u0002\u0010b\u001a\u00020\u00142\b\b\u0002\u0010c\u001a\u00020\u0014JH\u0010d\u001a\u0002002\u0006\u0010e\u001a\u00020f2\u0006\u0010^\u001a\u00020_2\b\b\u0002\u0010`\u001a\u00020\u00142\b\b\u0002\u0010*\u001a\u00020\u00142\b\b\u0002\u0010a\u001a\u00020\u00142\b\b\u0002\u0010b\u001a\u00020\u00142\b\b\u0002\u0010c\u001a\u00020\u0014J\u0080\u0001\u0010g\u001a\u0002002\b\u0010Y\u001a\u0004\u0018\u00010\u00052\u0006\u0010^\u001a\u00020_2\b\b\u0002\u0010*\u001a\u00020\u00142\b\b\u0002\u0010b\u001a\u00020\u00142\b\b\u0002\u0010a\u001a\u00020\u00142\b\b\u0002\u0010c\u001a\u00020\u00142\n\b\u0002\u0010h\u001a\u0004\u0018\u00010i2\b\b\u0002\u0010`\u001a\u00020\u00142\b\b\u0002\u0010j\u001a\u00020\u00142\b\b\u0002\u0010k\u001a\u00020\u00102\b\b\u0002\u0010l\u001a\u00020\u00102\n\b\u0002\u0010m\u001a\u0004\u0018\u00010nJ@\u0010o\u001a\u0002002\b\b\u0001\u0010p\u001a\u00020\u00102\u0006\u0010^\u001a\u00020_2\b\b\u0002\u0010*\u001a\u00020\u00142\b\b\u0002\u0010b\u001a\u00020\u00142\b\b\u0002\u0010a\u001a\u00020\u00142\b\b\u0002\u0010c\u001a\u00020\u0014J@\u0010o\u001a\u0002002\b\u0010q\u001a\u0004\u0018\u00010r2\u0006\u0010^\u001a\u00020_2\b\b\u0002\u0010*\u001a\u00020\u00142\b\b\u0002\u0010b\u001a\u00020\u00142\b\b\u0002\u0010a\u001a\u00020\u00142\b\b\u0002\u0010c\u001a\u00020\u0014J\"\u0010s\u001a\u0004\u0018\u00010N2\u0006\u0010*\u001a\u00020\u00142\u0006\u0010^\u001a\u00020t2\u0006\u0010`\u001a\u00020\u0014H\u0002J\u0010\u0010u\u001a\u00020\u00102\u0006\u0010v\u001a\u00020\u0007H\u0007J\u000e\u0010w\u001a\u00020\u00052\u0006\u0010x\u001a\u00020\u0005J\u001e\u0010y\u001a\u00020\u00052\u0006\u0010z\u001a\u00020\u00052\u0006\u0010{\u001a\u00020\u00052\u0006\u0010x\u001a\u00020\u0005J\u001e\u0010|\u001a\u00020\u00052\u0006\u0010z\u001a\u00020\u00052\u0006\u0010{\u001a\u00020\u00052\u0006\u0010x\u001a\u00020\u0005J*\u0010}\u001a\u0002002\u0006\u0010'\u001a\u00020(2\u001a\u0010h\u001a\u0016\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010!\u0012\u0004\u0012\u0002000~J\b\u0010\u007f\u001a\u00020\u0010H\u0007J\u0007\u0010\u0080\u0001\u001a\u00020\u0010J\u0014\u0010\u0081\u0001\u001a\u0004\u0018\u00010\u00052\t\u0010\u0082\u0001\u001a\u0004\u0018\u00010\u0005J\u0013\u0010\u0083\u0001\u001a\u0004\u0018\u00010\u00052\b\u0010{\u001a\u0004\u0018\u00010\u0005J\u0011\u0010\u0084\u0001\u001a\u00020\u00102\b\u0010\u0085\u0001\u001a\u00030\u0086\u0001R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\u00020\u0010X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u0014X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000e0\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u001b0\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u001dX\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u00107\u001a\u00020\u00142\u0006\u00106\u001a\u00020\u0014@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b7\u0010\u0016R\u001c\u0010>\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b?\u0010\n\"\u0004\b@\u0010\fR\u001a\u0010A\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bB\u0010\u0012\"\u0004\bC\u0010DR\u001a\u0010F\u001a\u00020\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bG\u0010\u0016\"\u0004\bH\u0010IR\u001a\u0010J\u001a\u00020\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bK\u0010\u0016\"\u0004\bL\u0010IR\u001e\u0010M\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0006\u0012\u0004\u0018\u00010N0\u001dX\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010O\u001a\u0004\u0018\u00010\u00058F¢\u0006\u0006\u001a\u0004\bP\u0010\nR\u0013\u0010Q\u001a\u0004\u0018\u00010N8F¢\u0006\u0006\u001a\u0004\bR\u0010S¨\u0006\u0087\u0001"}, d2 = {"Lcom/xiaomi/fitness/watch/face/data/FaceManager;", "", "<init>", "()V", "TAG", "", DeviceTypes.SCALE, "", "sCurFaceId", "getSCurFaceId", "()Ljava/lang/String;", "setSCurFaceId", "(Ljava/lang/String;)V", "sCurFace", "Lcom/xiaomi/fitness/watch/face/export/data/WatchFace;", "PAGE_SIZE", "", "getPAGE_SIZE", "()I", "flag", "", "getFlag", "()Z", "sFaceMap", "Ljava/util/LinkedHashMap;", "localVersions", "", "", "sFaceIds", "Ljava/util/HashMap;", "getFaceMap", "", "getLocalFace", "", "getFace", "id", "isInstalled", "canUpgrade", WatchFaceDataBase.DB_NAME, "deviceModel", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "canRemove", "isCurrent", "isTryOut", "faceData", "Lcom/xiaomi/fitness/watch/face/export/data/FaceData;", "getCurFace", "delete", "", "info", "changeCurFace", "watchFace", "setFaceInfo", "resp", "value", "isSynced", "reset", "disconnect", "setSyncedData", "obj", "setOriFace", "watchFaces", "jumpSource", "getJumpSource", "setJumpSource", "supportImageFormat", "getSupportImageFormat", "setSupportImageFormat", "(I)V", "getProductImageFormat", "supportHuamiMultiPhoto", "getSupportHuamiMultiPhoto", "setSupportHuamiMultiPhoto", "(Z)V", "albumRepeatable", "getAlbumRepeatable", "setAlbumRepeatable", "dataMap", "", "dataId", "getDataId", "dataList", "getDataList", "()[I", "supportData", "setData", "key", "getFullId", "isIconEmpty", "url", "getValidColor", "color", "constrainColor", "loadFaceBean", "imgView", "Lcom/xiaomi/fitness/watch/face/export/exportview/FaceIcon;", "fromInfo", "isDeviceTab", "isMulti", "isAodIcon", "loadFaceFile", "file", "Ljava/io/File;", "loadFaceUrl", "callback", "Lcom/xiaomi/fitness/watch/face/impl/Callback;", "isPreLoad", "location", "shapeType", "lifecycle", "Landroidx/lifecycle/Lifecycle;", "loadFaceDrawable", "res", "drawable", "Landroid/graphics/drawable/Drawable;", "setIconSize", "Landroid/widget/ImageView;", "getScaledSize", "px", "getBleZip", "hash", "getWatchFaceZipPath", "did", FaceInfoBase.FACE_ID, "getWatchFaceBinPath", "getHuaMiFaceInstalled", "Lkotlin/Function1;", "getListCount", "getMarketListCount", "getRandomFaceId", "templateId", "getTemplateId", "getFitInSampleSize", "options", "Landroid/graphics/BitmapFactory$Options;", "watch-face_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nFaceManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FaceManager.kt\ncom/xiaomi/fitness/watch/face/data/FaceManager\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,613:1\n1#2:614\n774#3:615\n865#3,2:616\n1557#3:618\n1628#3,3:619\n*S KotlinDebug\n*F\n+ 1 FaceManager.kt\ncom/xiaomi/fitness/watch/face/data/FaceManager\n*L\n565#1:615\n565#1:616,2\n566#1:618\n566#1:619,3\n*E\n"})
public final class FaceManager {
    private static boolean albumRepeatable;
    private static final boolean flag = false;
    private static boolean isSynced;

    @Nullable
    private static String jumpSource;

    @Nullable
    private static WatchFace sCurFace;
    private static boolean supportHuamiMultiPhoto;
    private static int supportImageFormat;

    @NotNull
    public static final FaceManager INSTANCE = new FaceManager();

    @NotNull
    private static final String TAG = "FaceManager";
    private static final float SCALE = DisplayUtil.getScreenDensity() / 3;

    @NotNull
    private static String sCurFaceId = "";
    private static final int PAGE_SIZE = 50;

    @NotNull
    private static final LinkedHashMap<String, WatchFace> sFaceMap = new LinkedHashMap<>();

    @NotNull
    private static final Map<String, Long> localVersions = new LinkedHashMap();

    @NotNull
    private static final HashMap<String, String> sFaceIds = new HashMap<>();

    @NotNull
    private static final HashMap<String, int[]> dataMap = new HashMap<>();

    /* JADX INFO: renamed from: com.xiaomi.fitness.watch.face.data.FaceManager$getHuaMiFaceInstalled$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.watch.face.data.FaceManager$getHuaMiFaceInstalled$1", f = "FaceManager.kt", i = {}, l = {526}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function1<List<WatchFace>, Unit> $callback;
        final /* synthetic */ WearableDeviceModel $deviceModel;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(WearableDeviceModel wearableDeviceModel, Function1<? super List<WatchFace>, Unit> function1, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$deviceModel = wearableDeviceModel;
            this.$callback = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$deviceModel, this.$callback, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                WatchFaceDao watchFaceDao = WatchFaceDataBase.INSTANCE.getInstance().watchFaceDao();
                String did = this.$deviceModel.getDid();
                this.label = 1;
                obj = watchFaceDao.getWatchFacesByDid(did, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            List list = (List) obj;
            Logger.i(FaceManager.TAG, "getHuaMiFaceInstalled: " + list);
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((FaceCommonEntity) it.next()).toFace());
            }
            this.$callback.invoke2(arrayList);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    private FaceManager() {
    }

    @JvmStatic
    public static final int getListCount() {
        String str = TAG;
        SettingsPropertiesUtil settingsPropertiesUtil = SettingsPropertiesUtil.INSTANCE;
        Logger.i(str, "getListCount posture: " + settingsPropertiesUtil.getPosture(ApplicationExtKt.getApplication()));
        if (UIUtils.INSTANCE.isTabletAndLandscape(ApplicationExtKt.getApplication())) {
            return 6;
        }
        return (!SystemProperties.INSTANCE.isFoldDisplay() || settingsPropertiesUtil.isFolded(ApplicationExtKt.getApplication())) ? 3 : 5;
    }

    @JvmStatic
    public static final int getScaledSize(float px) {
        return (int) ((px * SCALE) + 0.5f);
    }

    private final boolean isIconEmpty(String url) {
        return TextUtils.isEmpty(url) || Intrinsics.areEqual(url, "empty");
    }

    private final int[] setIconSize(boolean isCurrent, ImageView imgView, boolean fromInfo) {
        int i = 0;
        boolean z = isCurrent && !fromInfo;
        Intrinsics.checkNotNull(imgView, "null cannot be cast to non-null type com.xiaomi.fitness.watch.face.export.exportview.FaceIcon");
        FaceIcon faceIcon = (FaceIcon) imgView;
        if (z) {
            faceIcon.isCurrent(true);
            i = FaceIcon.CURRENT_BORDER_PADDING;
        } else {
            faceIcon.isCurrent(false);
        }
        faceIcon.setPaddingRelative(i, i, i, i);
        int w = faceIcon.getW();
        int h = faceIcon.getH();
        if (h <= 0 || w <= 0) {
            return null;
        }
        float radius = faceIcon.getRadius();
        if (FaceIcon.isCircle()) {
            radius = w / 2;
        }
        if (radius < 0.0f) {
            radius = 0.0f;
        }
        Logger.d(TAG, "setIconSize: w = " + w + "; h = " + h + "; radius = " + radius);
        return new int[]{w, h, (int) radius};
    }

    public final boolean canRemove(@Nullable WatchFace face) {
        WatchFace watchFace;
        if (face == null) {
            return false;
        }
        return face.getCanRemove() || (isInstalled(face.getId()) && (watchFace = sFaceMap.get(face.getId())) != null && watchFace.getCanRemove());
    }

    public final boolean canUpgrade(@Nullable WatchFace face, @Nullable WearableDeviceModel deviceModel) {
        String did;
        Long l;
        if (face == null) {
            return false;
        }
        WearableDeviceManager deviceManagerExtKt = DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE);
        if (deviceModel == null || (did = deviceModel.getDid()) == null) {
            did = "";
        }
        return (deviceManagerExtKt.getDeviceCapability(did) & 67108864) == 67108864 && (l = localVersions.get(face.getId())) != null && l.longValue() < face.getVersionCode();
    }

    public final void changeCurFace(@Nullable WatchFace watchFace) {
        if (watchFace == null) {
            return;
        }
        String id = watchFace.getId();
        boolean zIsCurrent = isCurrent(watchFace);
        boolean zIsInstalled = isInstalled(id);
        String str = TAG;
        Logger.d(str, "changeCurFace: curFaceId = " + sCurFaceId + "; faceId = " + id + "  name = " + watchFace.getName());
        StringBuilder sb = new StringBuilder();
        sb.append("changeCurFace: cur = ");
        sb.append(zIsCurrent);
        sb.append("; installed = ");
        sb.append(zIsInstalled);
        Logger.d(str, sb.toString());
        if (zIsCurrent || !zIsInstalled) {
            return;
        }
        WatchFace watchFace2 = sFaceMap.get(id);
        if (watchFace2 != null) {
            Logger.d(str, "changeCurFace: find out");
        }
        sCurFace = watchFace2;
    }

    @NotNull
    public final String constrainColor(@NotNull String color) {
        Intrinsics.checkNotNullParameter(color, "color");
        try {
            Color.parseColor(color);
            return color;
        } catch (Exception unused) {
            Logger.e(TAG, "constrainColor error ");
            return "#ffffff";
        }
    }

    public final void delete(@Nullable WatchFace info) {
        if (info == null) {
            return;
        }
        info.setCanRemove(false);
        info.setCurrent(false);
        sFaceMap.remove(info.getId());
    }

    public final void disconnect() {
        Logger.i(TAG, "disconnect");
        isSynced = false;
        sCurFace = null;
        sCurFaceId = "";
        supportImageFormat = 0;
        supportHuamiMultiPhoto = false;
    }

    public final boolean getAlbumRepeatable() {
        return albumRepeatable;
    }

    @NotNull
    public final String getBleZip(@NotNull String hash) {
        Intrinsics.checkNotNullParameter(hash, "hash");
        return uw8.c() + File.separator + hash;
    }

    @Nullable
    public final WatchFace getCurFace() {
        return sCurFace;
    }

    @Nullable
    public final String getDataId() {
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (wearableDeviceModel == null) {
            return null;
        }
        return wearableDeviceModel.getDeviceInfo().getDid() + RegionManagerImpl.LOCALE_REPORTED_SERVER_SEPARATOR + wearableDeviceModel.getDeviceInfo().getFirmwareVersion();
    }

    @Nullable
    public final int[] getDataList() {
        String dataId = getDataId();
        if (TextUtils.isEmpty(dataId)) {
            return new int[0];
        }
        HashMap<String, int[]> map = dataMap;
        if (!map.containsKey(dataId)) {
            return null;
        }
        int[] iArr = map.get(dataId);
        return iArr == null ? new int[0] : iArr;
    }

    @Nullable
    public final WatchFace getFace(@Nullable String id) {
        return sFaceMap.get(id);
    }

    @NotNull
    public final Map<String, WatchFace> getFaceMap() {
        return sFaceMap;
    }

    public final int getFitInSampleSize(@NotNull BitmapFactory.Options options) {
        Intrinsics.checkNotNullParameter(options, "options");
        int i = options.outWidth;
        int i2 = options.outHeight;
        int i3 = HMSedentaryConfig.INGORE_START_INDEX;
        int i4 = Constants.FHD_WIDTH;
        if (i > i2) {
            i4 = 720;
            i3 = 1080;
        }
        if (i > i3 || i2 > i4) {
            return MathKt__MathJVMKt.roundToInt(RangesKt___RangesKt.coerceAtMost(i / i3, i2 / i4));
        }
        return 1;
    }

    public final boolean getFlag() {
        return flag;
    }

    @NotNull
    public final String getFullId(@NotNull String id) {
        Intrinsics.checkNotNullParameter(id, "id");
        HashMap<String, String> map = sFaceIds;
        if (map.containsKey(id)) {
            return id;
        }
        for (String str : map.keySet()) {
            Intrinsics.checkNotNullExpressionValue(str, "next(...)");
            String str2 = str;
            if (StringsKt__StringsKt.contains$default((CharSequence) str2, (CharSequence) id, false, 2, (Object) null)) {
                return str2;
            }
        }
        return id;
    }

    public final void getHuaMiFaceInstalled(@NotNull WearableDeviceModel deviceModel, @NotNull Function1<? super List<WatchFace>, Unit> callback) {
        Intrinsics.checkNotNullParameter(deviceModel, "deviceModel");
        Intrinsics.checkNotNullParameter(callback, "callback");
        ScopeExtKt.scopeNet$default(null, new AnonymousClass1(deviceModel, callback, null), 1, null);
    }

    @Nullable
    public final String getJumpSource() {
        return jumpSource;
    }

    @NotNull
    public final List<WatchFace> getLocalFace() {
        return new ArrayList(sFaceMap.values());
    }

    public final int getMarketListCount() {
        String str = TAG;
        SettingsPropertiesUtil settingsPropertiesUtil = SettingsPropertiesUtil.INSTANCE;
        Logger.i(str, "getListCount posture: " + settingsPropertiesUtil.getPosture(ApplicationExtKt.getApplication()));
        if (UIUtils.INSTANCE.isTabletAndLandscape(ApplicationExtKt.getApplication())) {
            return 4;
        }
        return (!SystemProperties.INSTANCE.isFoldDisplay() || settingsPropertiesUtil.isFolded(ApplicationExtKt.getApplication())) ? 2 : 3;
    }

    public final int getPAGE_SIZE() {
        return PAGE_SIZE;
    }

    public final int getProductImageFormat(@Nullable WearableDeviceModel deviceModel) {
        Integer image_format_exist;
        Product product;
        Product.Size size = (deviceModel == null || (product = deviceModel.getProduct()) == null) ? null : product.getSize();
        if (size == null || (image_format_exist = size.getImage_format_exist()) == null || image_format_exist.intValue() != 1) {
            return supportImageFormat;
        }
        Integer image_format = size != null ? size.getImage_format() : null;
        return image_format != null ? image_format.intValue() : supportImageFormat;
    }

    @Nullable
    public final String getRandomFaceId(@Nullable String templateId) {
        if (templateId != null && templateId.length() != 0 && templateId.length() == 9 && templateId.charAt(4) == '4') {
            boolean z = false;
            try {
                String strSubstring = templateId.substring(0, 5);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                String strSubstring2 = templateId.substring(5, 7);
                Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
                Set<String> setKeySet = sFaceMap.keySet();
                Intrinsics.checkNotNullExpressionValue(setKeySet, "<get-keys>(...)");
                List list = CollectionsKt___CollectionsKt.toList(setKeySet);
                ArrayList<String> arrayList = new ArrayList();
                for (Object obj : list) {
                    String str = (String) obj;
                    if (str.charAt(4) == '4') {
                        Intrinsics.checkNotNull(str);
                        String strSubstring3 = str.substring(5, 7);
                        Intrinsics.checkNotNullExpressionValue(strSubstring3, "substring(...)");
                        if (Intrinsics.areEqual(strSubstring3, strSubstring2)) {
                            arrayList.add(obj);
                        }
                    }
                }
                ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
                for (String str2 : arrayList) {
                    Intrinsics.checkNotNull(str2);
                    String strSubstring4 = str2.substring(7, str2.length());
                    Intrinsics.checkNotNullExpressionValue(strSubstring4, "substring(...)");
                    arrayList2.add(Integer.valueOf(Integer.parseInt(strSubstring4)));
                }
                int iIntValue = arrayList2.isEmpty() ? 0 : ((Number) CollectionsKt___CollectionsKt.m1326maxOrThrow((Iterable) arrayList2)).intValue();
                while (!z) {
                    iIntValue = (iIntValue + 1) % 100;
                    if (!arrayList2.contains(Integer.valueOf(iIntValue))) {
                        z = true;
                    }
                }
                return strSubstring + strSubstring2 + (iIntValue < 10 ? "0" + iIntValue : String.valueOf(iIntValue));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    @NotNull
    public final String getSCurFaceId() {
        return sCurFaceId;
    }

    public final boolean getSupportHuamiMultiPhoto() {
        return supportHuamiMultiPhoto;
    }

    public final int getSupportImageFormat() {
        return supportImageFormat;
    }

    @Nullable
    public final String getTemplateId(@Nullable String faceId) {
        if (faceId == null || faceId.length() == 0 || faceId.length() != 9 || faceId.charAt(4) != '4') {
            return faceId;
        }
        String strSubstring = faceId.substring(0, 7);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring + "00";
    }

    public final int getValidColor(@Nullable String color) {
        try {
            return Color.parseColor(color);
        } catch (Exception unused) {
            Logger.e(TAG, "getValidColor error ");
            return 0;
        }
    }

    @NotNull
    public final String getWatchFaceBinPath(@NotNull String did, @NotNull String faceId, @NotNull String hash) {
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(faceId, "faceId");
        Intrinsics.checkNotNullParameter(hash, "hash");
        String strC = uw8.c();
        String str = File.separator;
        return strC + str + did + str + faceId + str + hash;
    }

    @NotNull
    public final String getWatchFaceZipPath(@NotNull String did, @NotNull String faceId, @NotNull String hash) {
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(faceId, "faceId");
        Intrinsics.checkNotNullParameter(hash, "hash");
        String strC = uw8.c();
        String str = File.separator;
        return strC + str + did + str + faceId + str + hash + ".zip";
    }

    public final boolean isCurrent(@Nullable WatchFace face) {
        if (face == null) {
            return false;
        }
        return face.isCurrent() || Intrinsics.areEqual(face.getId(), sCurFaceId);
    }

    public final boolean isInstalled(@Nullable String id) {
        return sFaceMap.containsKey(id);
    }

    public final boolean isSynced() {
        return isSynced;
    }

    public final boolean isTryOut(@Nullable WatchFace face, @Nullable FaceData faceData) {
        if (faceData != null && faceData.canPurchase()) {
            if (isInstalled(face != null ? face.getId() : null) && face != null && face.getOnTrial()) {
                return true;
            }
        }
        return false;
    }

    public final void loadFaceBean(@Nullable WatchFace face, @NotNull FaceIcon imgView, boolean fromInfo, boolean isCurrent, boolean isDeviceTab, boolean isMulti, boolean isAodIcon) {
        int[] iconSize;
        Intrinsics.checkNotNullParameter(imgView, "imgView");
        if (face == null || (iconSize = setIconSize(isCurrent, imgView, fromInfo)) == null) {
            return;
        }
        imgView.isCurrent(isCurrent);
        imgView.isDeviceTab = isDeviceTab;
        imgView.isPhotoPicker = isMulti;
        imgView.mIsAodIcon = isAodIcon;
        if (fromInfo) {
            ImageLoadUtil.load$default(ImageLoadUtil.INSTANCE, imgView, face.icon, iconSize[0], iconSize[1], iconSize[2], null, 32, null);
        } else if (isIconEmpty(face.icon)) {
            imgView.setImageResource(0);
        } else {
            ImageLoadUtil.load$default(ImageLoadUtil.INSTANCE, imgView, face.icon, iconSize[0], iconSize[1], iconSize[2], null, 32, null);
        }
    }

    public final void loadFaceDrawable(int res, @NotNull FaceIcon imgView, boolean isCurrent, boolean isMulti, boolean isDeviceTab, boolean isAodIcon) {
        Intrinsics.checkNotNullParameter(imgView, "imgView");
        imgView.isCurrent(isCurrent);
        imgView.isPhotoPicker = isMulti;
        imgView.isDeviceTab = isDeviceTab;
        imgView.mIsAodIcon = isAodIcon;
        int[] iconSize = setIconSize(isCurrent, imgView, false);
        if (iconSize == null) {
            return;
        }
        ImageLoadUtil.INSTANCE.load(imgView, res, iconSize[0], iconSize[1], iconSize[2]);
    }

    public final void loadFaceFile(@NotNull File file, @NotNull FaceIcon imgView, boolean fromInfo, boolean isCurrent, boolean isDeviceTab, boolean isMulti, boolean isAodIcon) {
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(imgView, "imgView");
        imgView.isCurrent(isCurrent);
        imgView.isDeviceTab = isDeviceTab;
        imgView.isPhotoPicker = isMulti;
        imgView.mIsAodIcon = isAodIcon;
        int[] iconSize = setIconSize(isCurrent, imgView, fromInfo);
        if (iconSize == null) {
            return;
        }
        if (file.exists()) {
            ImageLoadUtil.INSTANCE.loadNoCache(imgView, file, iconSize[0], iconSize[1], iconSize[2]);
        } else {
            imgView.setImageResource(0);
        }
    }

    public final void loadFaceUrl(@Nullable String url, @NotNull FaceIcon imgView, boolean isCurrent, boolean isMulti, boolean isDeviceTab, boolean isAodIcon, @Nullable Callback callback, boolean fromInfo, boolean isPreLoad, int location, int shapeType, @Nullable Lifecycle lifecycle) {
        Intrinsics.checkNotNullParameter(imgView, "imgView");
        imgView.isCurrent(isCurrent);
        imgView.isPhotoPicker = isMulti;
        imgView.isDeviceTab = isDeviceTab;
        imgView.mIsAodIcon = isAodIcon;
        imgView.location = location;
        imgView.faceType = shapeType;
        if (url == null || url.length() == 0) {
            return;
        }
        int[] iconSize = setIconSize(isCurrent, imgView, fromInfo);
        if (iconSize == null) {
            return;
        }
        if (callback != null) {
            ImageLoadUtil.INSTANCE.load(imgView, url, iconSize[0], iconSize[1], iconSize[2], callback);
        } else if (isPreLoad) {
            ImageLoadUtil.INSTANCE.preLoad(imgView, url, iconSize[0], iconSize[1], iconSize[2]);
        } else {
            ImageLoadUtil.INSTANCE.load(imgView, url, iconSize[0], iconSize[1], iconSize[2], lifecycle);
        }
    }

    public final void reset() {
        Logger.i(TAG, "reset: ");
        sCurFace = null;
        sFaceMap.clear();
        isSynced = false;
        jumpSource = "";
        supportImageFormat = 0;
        sCurFaceId = "";
        supportHuamiMultiPhoto = false;
    }

    public final void setAlbumRepeatable(boolean z) {
        albumRepeatable = z;
    }

    public final void setData(@Nullable String key, @Nullable int[] value) {
        dataMap.put(key, value);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x008a  */
    /* JADX WARN: Code duplicated, block: B:33:0x008d  */
    /* JADX WARN: Code duplicated, block: B:36:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:37:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:40:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:41:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:44:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:45:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:48:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:53:0x0109  */
    /* JADX WARN: Code duplicated, block: B:55:0x010f  */
    /* JADX WARN: Code duplicated, block: B:59:0x0124  */
    public final void setFaceInfo(@Nullable List<FaceData> resp) {
        FaceData faceData;
        String icon;
        Long version_code;
        long versionCode;
        FaceData.BleExt ble_ext;
        boolean zHasSpirit;
        Integer purchase_type;
        int iIntValue;
        FaceData.BleExt ble_ext2;
        FaceData.BgStyle[] bg_styles;
        Object next;
        Object next2;
        if (resp != null) {
            for (WatchFace watchFace : sFaceMap.values()) {
                Intrinsics.checkNotNullExpressionValue(watchFace, "next(...)");
                WatchFace watchFace2 = watchFace;
                if (!watchFace2.getSupportImageGroup() || watchFace2.getTemplateId().length() <= 0) {
                    Iterator<T> it = resp.iterator();
                    do {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                    } while (!Intrinsics.areEqual(((FaceData) next).getId(), watchFace2.getId()));
                    faceData = (FaceData) next;
                    if (faceData != null) {
                        if (TextUtils.isEmpty(faceData.getIcon())) {
                            icon = "empty";
                        } else {
                            icon = faceData.getIcon();
                        }
                        watchFace2.icon = icon;
                        watchFace2.setName(faceData.getDisplay_name());
                        watchFace2.setPublish_name(faceData.getPublish_name());
                        version_code = faceData.getVersion_code();
                        if (version_code != null) {
                            versionCode = version_code.longValue();
                        } else {
                            versionCode = watchFace2.getVersionCode();
                        }
                        watchFace2.setVersionCode(versionCode);
                        ble_ext = faceData.getBle_ext();
                        if (ble_ext != null) {
                            zHasSpirit = ble_ext.hasSpirit();
                        } else {
                            zHasSpirit = false;
                        }
                        watchFace2.setHasSpiritColor(zHasSpirit);
                        purchase_type = faceData.getPurchase_type();
                        if (purchase_type != null) {
                            iIntValue = purchase_type.intValue();
                        } else {
                            iIntValue = 22;
                        }
                        watchFace2.setPurchase_type(iIntValue);
                        watchFace2.setPurchase_status(faceData.getPurchase_status());
                        ble_ext2 = faceData.getBle_ext();
                        if (ble_ext2 != null) {
                            watchFace2.setCanEditByConfig(ble_ext2.canEdit());
                            if (watchFace2.getStyle() != null || StringsKt__StringsJVMKt.equals$default(watchFace2.getStyle(), "", false, 2, null)) {
                                bg_styles = ble_ext2.getBg_styles();
                                if (bg_styles != null || bg_styles.length == 0) {
                                    watchFace2.setStyleUrl(ble_ext2.getUpper_background());
                                } else {
                                    FaceData.BgStyle[] bg_styles2 = ble_ext2.getBg_styles();
                                    Intrinsics.checkNotNull(bg_styles2);
                                    watchFace2.setStyleUrl(bg_styles2[0].getStyle());
                                }
                            } else {
                                String style = watchFace2.getStyle();
                                Intrinsics.checkNotNull(style);
                                watchFace2.setStyleUrl(ble_ext2.getStyleUrl(style));
                            }
                            watchFace2.setBottom_background(ble_ext2.getBottom_background());
                            watchFace2.setFaceType(ble_ext2.getType());
                            watchFace2.setPortraitFace(ble_ext2.isPortraitFace());
                            watchFace2.setBgImg(ble_ext2.getBg_img());
                            watchFace2.setAlbum_picture_type(ble_ext2.getAlbum_picture_type());
                        }
                        Logger.i("faceMe face: " + watchFace2, new Object[0]);
                    }
                } else {
                    Iterator<T> it2 = resp.iterator();
                    do {
                        if (!it2.hasNext()) {
                            next2 = null;
                            break;
                        }
                        next2 = it2.next();
                    } while (!Intrinsics.areEqual(((FaceData) next2).getId(), watchFace2.getTemplateId()));
                    faceData = (FaceData) next2;
                    if (faceData != null) {
                        if (TextUtils.isEmpty(faceData.getIcon())) {
                            icon = "empty";
                        } else {
                            icon = faceData.getIcon();
                        }
                        watchFace2.icon = icon;
                        watchFace2.setName(faceData.getDisplay_name());
                        watchFace2.setPublish_name(faceData.getPublish_name());
                        version_code = faceData.getVersion_code();
                        if (version_code != null) {
                            versionCode = version_code.longValue();
                        } else {
                            versionCode = watchFace2.getVersionCode();
                        }
                        watchFace2.setVersionCode(versionCode);
                        ble_ext = faceData.getBle_ext();
                        if (ble_ext != null) {
                            zHasSpirit = ble_ext.hasSpirit();
                        } else {
                            zHasSpirit = false;
                        }
                        watchFace2.setHasSpiritColor(zHasSpirit);
                        purchase_type = faceData.getPurchase_type();
                        if (purchase_type != null) {
                            iIntValue = purchase_type.intValue();
                        } else {
                            iIntValue = 22;
                        }
                        watchFace2.setPurchase_type(iIntValue);
                        watchFace2.setPurchase_status(faceData.getPurchase_status());
                        ble_ext2 = faceData.getBle_ext();
                        if (ble_ext2 != null) {
                            watchFace2.setCanEditByConfig(ble_ext2.canEdit());
                            if (watchFace2.getStyle() != null) {
                                bg_styles = ble_ext2.getBg_styles();
                                if (bg_styles != null) {
                                    watchFace2.setStyleUrl(ble_ext2.getUpper_background());
                                } else {
                                    watchFace2.setStyleUrl(ble_ext2.getUpper_background());
                                }
                            } else {
                                bg_styles = ble_ext2.getBg_styles();
                                if (bg_styles != null) {
                                    watchFace2.setStyleUrl(ble_ext2.getUpper_background());
                                } else {
                                    watchFace2.setStyleUrl(ble_ext2.getUpper_background());
                                }
                            }
                            watchFace2.setBottom_background(ble_ext2.getBottom_background());
                            watchFace2.setFaceType(ble_ext2.getType());
                            watchFace2.setPortraitFace(ble_ext2.isPortraitFace());
                            watchFace2.setBgImg(ble_ext2.getBg_img());
                            watchFace2.setAlbum_picture_type(ble_ext2.getAlbum_picture_type());
                        }
                        Logger.i("faceMe face: " + watchFace2, new Object[0]);
                    }
                }
            }
        }
    }

    public final void setJumpSource(@Nullable String str) {
        jumpSource = str;
    }

    public final void setOriFace(@Nullable List<WatchFace> watchFaces) {
        if (watchFaces == null) {
            Logger.i("setOriFace watchFaces == null", new Object[0]);
            return;
        }
        sFaceIds.clear();
        localVersions.clear();
        sCurFaceId = "";
        sCurFace = null;
        Logger.i(TAG, "setOriFace: size = " + watchFaces.size());
        int size = watchFaces.size();
        LinkedHashMap linkedHashMap = new LinkedHashMap(size);
        for (int i = 0; i < size; i++) {
            WatchFace watchFace = watchFaces.get(i);
            if (watchFace.isCurrent()) {
                sCurFaceId = watchFace.getId();
                sCurFace = watchFace;
            }
            WatchFace watchFace2 = sFaceMap.get(watchFace.getId());
            if (watchFace2 != null) {
                watchFace.icon = watchFace2.icon;
            }
            linkedHashMap.put(watchFace.getId(), watchFace);
            localVersions.put(watchFace.getId(), Long.valueOf(watchFace.getVersionCode()));
        }
        LinkedHashMap<String, WatchFace> linkedHashMap2 = sFaceMap;
        linkedHashMap2.clear();
        linkedHashMap2.putAll(linkedHashMap);
        FaceFunUtil.INSTANCE.reqIconZip();
    }

    public final void setSCurFaceId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        sCurFaceId = str;
    }

    public final void setSupportHuamiMultiPhoto(boolean z) {
        supportHuamiMultiPhoto = z;
    }

    public final void setSupportImageFormat(int i) {
        supportImageFormat = i;
    }

    public final void setSyncedData(@Nullable Object obj) {
        List<WatchFace> list = obj == null ? null : (List) obj;
        Logger.i("setSyncedData: " + (list != null ? Integer.valueOf(list.size()) : null), new Object[0]);
        setOriFace(list);
        isSynced = true;
    }

    public final boolean supportData() {
        int[] dataList = getDataList();
        if (dataList == null) {
            return true;
        }
        return !(dataList.length == 0);
    }

    public final void delete(@NotNull String id) {
        Intrinsics.checkNotNullParameter(id, "id");
        sFaceMap.remove(getFullId(id));
    }

    public final void loadFaceDrawable(@Nullable Drawable drawable, @NotNull FaceIcon imgView, boolean isCurrent, boolean isMulti, boolean isDeviceTab, boolean isAodIcon) {
        Intrinsics.checkNotNullParameter(imgView, "imgView");
        imgView.isCurrent(isCurrent);
        imgView.isPhotoPicker = isMulti;
        imgView.isDeviceTab = isDeviceTab;
        imgView.mIsAodIcon = isAodIcon;
        int[] iconSize = setIconSize(isCurrent, imgView, false);
        if (iconSize == null) {
            return;
        }
        ImageLoadUtil.INSTANCE.load(imgView, drawable, iconSize[0], iconSize[1], iconSize[2]);
    }
}
