package com.huami.rawdata_uploader.usecase;

import android.content.Context;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.multidex.MultiDexExtractor;
import androidx.work.Constraints;
import androidx.work.ExistingWorkPolicy;
import androidx.work.NetworkType;
import androidx.work.OneTimeWorkRequest;
import androidx.work.WorkManager;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.bodymeasurements.common.utils.TimeFormatUtils;
import com.huami.mifit.sportlib.common.DataTypeSource;
import com.huami.rawdata_uploader.di.RawDataInterModuleKt;
import com.huami.rawdata_uploader.ext.CommonExKt;
import com.huami.rawdata_uploader.ext.FileManagerExKt;
import com.huami.rawdata_uploader.file.RawDataFileManager;
import com.huami.rawdata_uploader.file.remote.BloodPressureFileUploadDelegate;
import com.huami.rawdata_uploader.file.remote.RawDataUrlResponse;
import com.huami.rawdata_uploader.relation.local.IRawDataLocalRepo;
import com.huami.rawdata_uploader.relation.local.RawDataDbVo;
import com.huami.rawdata_uploader.relation.remote.BloodPressureRawDataDelegate;
import com.huami.rawdata_uploader.vo.IRawDataType;
import com.huami.rawdata_uploader.vo.RawDataDeviceInfo;
import com.huami.rawdata_uploader.vo.RawDataInfo;
import com.huami.rawdata_uploader.vo.RawDataUserInfo;
import com.huami.rawdata_uploader.workmanager.BloodPressureRawDataUploadWork;
import com.huami.tools.analytics.DbUtils;
import com.xiaomi.hm.health.baseutil.TimeUtils;
import it.sauronsoftware.ftp4j.FTPCodes;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.scope.Scope;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u00100\u001a\u00020+¢\u0006\u0004\bD\u0010EJ5\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0082@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u000eH\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J5\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\nH\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019J.\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bJ.\u0010\u001e\u001a\u00020\u001c2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bJ.\u0010\u001f\u001a\u00020\u001c2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bJ.\u0010#\u001a\u00020\u001c2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001a2\u000e\u0010\"\u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010 2\u0006\u0010\t\u001a\u00020\bJ3\u0010'\u001a\u00020\u001c2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010$\u001a\u00020!2\u0006\u0010\u001b\u001a\u00020\u001aH\u0080@ø\u0001\u0000¢\u0006\u0004\b%\u0010&J#\u0010(\u001a\u00020\u001c2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0086@ø\u0001\u0000¢\u0006\u0004\b(\u0010)J#\u0010*\u001a\u00020\u001c2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0086@ø\u0001\u0000¢\u0006\u0004\b*\u0010)R\u001c\u00100\u001a\u00020+8\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u001e\u00104\u001a\n 1*\u0004\u0018\u00010\n0\n8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u001f\u00109\u001a\u0004\u0018\u0001058B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u00106\u001a\u0004\b7\u00108R\u001f\u0010<\u001a\u0004\u0018\u00010:8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b7\u00106\u001a\u0004\b2\u0010;R\u001f\u0010@\u001a\u0004\u0018\u00010=8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b>\u00106\u001a\u0004\b,\u0010?R\u001f\u0010C\u001a\u0004\u0018\u00010A8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u00106\u001a\u0004\b>\u0010B\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006F"}, d2 = {"Lcom/huami/rawdata_uploader/usecase/BloodPressureRawDataUseCase;", "", "Lcom/huami/rawdata_uploader/vo/RawDataUserInfo;", "userInfo", "", "rawData", "", "generateTime", "Lcom/huami/rawdata_uploader/vo/IRawDataType;", "dataDataType", "", "f", "(Lcom/huami/rawdata_uploader/vo/RawDataUserInfo;[BJLcom/huami/rawdata_uploader/vo/IRawDataType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "postUri", "Ljava/io/File;", "zipFile", "", "g", "(Ljava/lang/String;Ljava/io/File;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "userId", "appName", "fileName", "type", "Lcom/huami/rawdata_uploader/file/remote/RawDataUrlResponse;", "c", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/huami/rawdata_uploader/vo/RawDataDeviceInfo;", "deviceInfo", "", "saveRawDataLocal", "saveRawDataRemote", "saveRawDataAndPostByWork", "", "Lcom/huami/rawdata_uploader/vo/RawDataInfo;", "rawDataInfoList", "savePostRawDataList", "rawDataInfo", "saveFileLocal$rawdata_uploader_release", "(Lcom/huami/rawdata_uploader/vo/RawDataUserInfo;Lcom/huami/rawdata_uploader/vo/IRawDataType;Lcom/huami/rawdata_uploader/vo/RawDataInfo;Lcom/huami/rawdata_uploader/vo/RawDataDeviceInfo;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveFileLocal", "postFileRelation", "(Lcom/huami/rawdata_uploader/vo/RawDataUserInfo;Lcom/huami/rawdata_uploader/vo/IRawDataType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "postFile", "Landroid/content/Context;", "a", "Landroid/content/Context;", "getContext$rawdata_uploader_release", "()Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "kotlin.jvm.PlatformType", "b", "Ljava/lang/String;", "TAG", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/Lazy;", GoogleApiAvailabilityLight.a, "()Lkotlinx/coroutines/CoroutineScope;", "scope", "Lcom/huami/rawdata_uploader/relation/local/IRawDataLocalRepo;", "()Lcom/huami/rawdata_uploader/relation/local/IRawDataLocalRepo;", "localRepo", "Lcom/huami/rawdata_uploader/file/remote/BloodPressureFileUploadDelegate;", "e", "()Lcom/huami/rawdata_uploader/file/remote/BloodPressureFileUploadDelegate;", "fileUploadRepo", "Lcom/huami/rawdata_uploader/relation/remote/BloodPressureRawDataDelegate;", "()Lcom/huami/rawdata_uploader/relation/remote/BloodPressureRawDataDelegate;", "ueUploadRepo", "<init>", "(Landroid/content/Context;)V", "rawdata-uploader_release"}, k = 1, mv = {1, 5, 1})
public final class BloodPressureRawDataUseCase {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String TAG = BloodPressureRawDataUseCase.class.getSimpleName();

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Lazy scope = LazyKt__LazyJVMKt.lazy(n.a);

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final Lazy localRepo = LazyKt__LazyJVMKt.lazy(c.a);

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final Lazy fileUploadRepo = LazyKt__LazyJVMKt.lazy(a.a);

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final Lazy ueUploadRepo = LazyKt__LazyJVMKt.lazy(o.a);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"Lcom/huami/rawdata_uploader/file/remote/BloodPressureFileUploadDelegate;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<BloodPressureFileUploadDelegate> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final BloodPressureFileUploadDelegate invoke() {
            Scope scopeRawDataKoinScope = RawDataInterModuleKt.rawDataKoinScope();
            if (scopeRawDataKoinScope == null) {
                return null;
            }
            return (BloodPressureFileUploadDelegate) RawDataInterModuleKt.rawDataKoinScope(scopeRawDataKoinScope.getKoin()).get(Reflection.getOrCreateKotlinClass(BloodPressureFileUploadDelegate.class), null, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.rawdata_uploader.usecase.BloodPressureRawDataUseCase", f = "BloodPressureRawDataUseCase.kt", i = {}, l = {192}, m = "getRawFileUrl", n = {}, s = {})
    public static final class b extends ContinuationImpl {
        public /* synthetic */ Object a;
        public int c;

        public b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.a = obj;
            this.c |= Integer.MIN_VALUE;
            return BloodPressureRawDataUseCase.this.c(null, null, null, null, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"Lcom/huami/rawdata_uploader/relation/local/IRawDataLocalRepo;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<IRawDataLocalRepo> {
        public static final c a = new c();

        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final IRawDataLocalRepo invoke() {
            Scope scopeRawDataKoinScope = RawDataInterModuleKt.rawDataKoinScope();
            if (scopeRawDataKoinScope == null) {
                return null;
            }
            return (IRawDataLocalRepo) RawDataInterModuleKt.rawDataKoinScope(scopeRawDataKoinScope.getKoin()).get(Reflection.getOrCreateKotlinClass(IRawDataLocalRepo.class), null, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.rawdata_uploader.usecase.BloodPressureRawDataUseCase", f = "BloodPressureRawDataUseCase.kt", i = {1, 1, 1, 1, 2, 2, 2, 2}, l = {293, TypedValues.AttributesType.TYPE_EASING, 323, 337}, m = "postFile", n = {"rawDataList", "zipName", "zipFile", "fileList", "rawDataList", "zipName", "zipFile", "fileList"}, s = {"L$3", "L$4", "L$5", "L$6", "L$3", "L$4", "L$5", "L$6"})
    public static final class d extends ContinuationImpl {
        public Object a;
        public Object b;
        public Object c;
        public Object d;
        public Object e;
        public Object f;
        public Object g;
        public /* synthetic */ Object h;
        public int j;

        public d(Continuation<? super d> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.h = obj;
            this.j |= Integer.MIN_VALUE;
            return BloodPressureRawDataUseCase.this.postFile(null, null, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.rawdata_uploader.usecase.BloodPressureRawDataUseCase", f = "BloodPressureRawDataUseCase.kt", i = {0, 0, 0, 1}, l = {268, 270, 277}, m = "postFileRelation", n = {"this", "userInfo", "dataDataType", "rawDataList"}, s = {"L$0", "L$1", "L$2", "L$3"})
    public static final class e extends ContinuationImpl {
        public Object a;
        public Object b;
        public Object c;
        public Object d;
        public /* synthetic */ Object e;
        public int g;

        public e(Continuation<? super e> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.e = obj;
            this.g |= Integer.MIN_VALUE;
            return BloodPressureRawDataUseCase.this.postFileRelation(null, null, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.rawdata_uploader.usecase.BloodPressureRawDataUseCase", f = "BloodPressureRawDataUseCase.kt", i = {0, 0, 0, 0, 0}, l = {231}, m = "saveFileLocal$rawdata_uploader_release", n = {"this", "userInfo", "dataDataType", "rawDataInfo", "deviceInfo"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4"})
    public static final class f extends ContinuationImpl {
        public Object a;
        public Object b;
        public Object c;
        public Object d;
        public Object e;
        public /* synthetic */ Object f;
        public int h;

        public f(Continuation<? super f> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f = obj;
            this.h |= Integer.MIN_VALUE;
            return BloodPressureRawDataUseCase.this.saveFileLocal$rawdata_uploader_release(null, null, null, null, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g extends Lambda implements Function0<String> {
        public final /* synthetic */ RawDataInfo a;
        public final /* synthetic */ IRawDataType b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(RawDataInfo rawDataInfo, IRawDataType iRawDataType) {
            super(0);
            this.a = rawDataInfo;
            this.b = iRawDataType;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "RawDataInfo " + TimeUtils.formatDate(TimeFormatUtils.PATTERN_YYY_MM_DD_HH_MM, this.a.getGenerateTime()) + "  dataDataType " + this.b;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.rawdata_uploader.usecase.BloodPressureRawDataUseCase$savePostRawDataList$1", f = "BloodPressureRawDataUseCase.kt", i = {}, l = {211, FTPCodes.NAME_SYSTEM_TIME, 218}, m = "invokeSuspend", n = {}, s = {})
    public static final class h extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public Object a;
        public Object b;
        public Object c;
        public Object d;
        public Object e;
        public int f;
        public final /* synthetic */ List<RawDataInfo> g;
        public final /* synthetic */ BloodPressureRawDataUseCase h;
        public final /* synthetic */ RawDataUserInfo i;
        public final /* synthetic */ IRawDataType j;
        public final /* synthetic */ RawDataDeviceInfo k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(List<RawDataInfo> list, BloodPressureRawDataUseCase bloodPressureRawDataUseCase, RawDataUserInfo rawDataUserInfo, IRawDataType iRawDataType, RawDataDeviceInfo rawDataDeviceInfo, Continuation<? super h> continuation) {
            super(2, continuation);
            this.g = list;
            this.h = bloodPressureRawDataUseCase;
            this.i = rawDataUserInfo;
            this.j = iRawDataType;
            this.k = rawDataDeviceInfo;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new h(this.g, this.h, this.i, this.j, this.k, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((h) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:24:0x00aa A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Iterator it2;
            BloodPressureRawDataUseCase bloodPressureRawDataUseCase;
            RawDataUserInfo rawDataUserInfo;
            IRawDataType iRawDataType;
            RawDataDeviceInfo rawDataDeviceInfo;
            BloodPressureRawDataUseCase bloodPressureRawDataUseCase2;
            RawDataUserInfo rawDataUserInfo2;
            IRawDataType iRawDataType2;
            h hVar = this;
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = hVar.f;
            if (i != 0) {
                if (i == 1) {
                    it2 = (Iterator) hVar.e;
                    RawDataDeviceInfo rawDataDeviceInfo2 = (RawDataDeviceInfo) hVar.d;
                    IRawDataType iRawDataType3 = (IRawDataType) hVar.c;
                    RawDataUserInfo rawDataUserInfo3 = (RawDataUserInfo) hVar.b;
                    BloodPressureRawDataUseCase bloodPressureRawDataUseCase3 = (BloodPressureRawDataUseCase) hVar.a;
                    ResultKt.throwOnFailure(obj);
                    rawDataDeviceInfo = rawDataDeviceInfo2;
                    iRawDataType = iRawDataType3;
                    rawDataUserInfo = rawDataUserInfo3;
                    bloodPressureRawDataUseCase = bloodPressureRawDataUseCase3;
                } else if (i == 2) {
                    ResultKt.throwOnFailure(obj);
                    hVar = hVar;
                    bloodPressureRawDataUseCase2 = hVar.h;
                    rawDataUserInfo2 = hVar.i;
                    iRawDataType2 = hVar.j;
                    hVar.f = 3;
                    if (bloodPressureRawDataUseCase2.postFileRelation(rawDataUserInfo2, iRawDataType2, hVar) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            List<RawDataInfo> list = hVar.g;
            BloodPressureRawDataUseCase bloodPressureRawDataUseCase4 = hVar.h;
            RawDataUserInfo rawDataUserInfo4 = hVar.i;
            IRawDataType iRawDataType4 = hVar.j;
            RawDataDeviceInfo rawDataDeviceInfo3 = hVar.k;
            it2 = list.iterator();
            bloodPressureRawDataUseCase = bloodPressureRawDataUseCase4;
            rawDataUserInfo = rawDataUserInfo4;
            iRawDataType = iRawDataType4;
            rawDataDeviceInfo = rawDataDeviceInfo3;
            while (it2.hasNext()) {
                RawDataInfo rawDataInfo = (RawDataInfo) it2.next();
                hVar.a = bloodPressureRawDataUseCase;
                hVar.b = rawDataUserInfo;
                hVar.c = iRawDataType;
                hVar.d = rawDataDeviceInfo;
                hVar.e = it2;
                hVar.f = 1;
                h hVar2 = hVar;
                if (bloodPressureRawDataUseCase.saveFileLocal$rawdata_uploader_release(rawDataUserInfo, iRawDataType, rawDataInfo, rawDataDeviceInfo, hVar) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                hVar = hVar2;
            }
            BloodPressureRawDataUseCase bloodPressureRawDataUseCase5 = hVar.h;
            RawDataUserInfo rawDataUserInfo5 = hVar.i;
            IRawDataType iRawDataType5 = hVar.j;
            hVar.a = null;
            hVar.b = null;
            hVar.c = null;
            hVar.d = null;
            hVar.e = null;
            hVar.f = 2;
            if (bloodPressureRawDataUseCase5.postFile(rawDataUserInfo5, iRawDataType5, hVar) == coroutine_suspended) {
                return coroutine_suspended;
            }
            bloodPressureRawDataUseCase2 = hVar.h;
            rawDataUserInfo2 = hVar.i;
            iRawDataType2 = hVar.j;
            hVar.f = 3;
            if (bloodPressureRawDataUseCase2.postFileRelation(rawDataUserInfo2, iRawDataType2, hVar) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.rawdata_uploader.usecase.BloodPressureRawDataUseCase$saveRawDataAndPostByWork$1", f = "BloodPressureRawDataUseCase.kt", i = {}, l = {150}, m = "invokeSuspend", n = {}, s = {})
    public static final class i extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ RawDataUserInfo c;
        public final /* synthetic */ IRawDataType d;
        public final /* synthetic */ long e;
        public final /* synthetic */ byte[] f;
        public final /* synthetic */ RawDataDeviceInfo g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(RawDataUserInfo rawDataUserInfo, IRawDataType iRawDataType, long j, byte[] bArr, RawDataDeviceInfo rawDataDeviceInfo, Continuation<? super i> continuation) {
            super(2, continuation);
            this.c = rawDataUserInfo;
            this.d = iRawDataType;
            this.e = j;
            this.f = bArr;
            this.g = rawDataDeviceInfo;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return BloodPressureRawDataUseCase.this.new i(this.c, this.d, this.e, this.f, this.g, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((i) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                BloodPressureRawDataUseCase bloodPressureRawDataUseCase = BloodPressureRawDataUseCase.this;
                RawDataUserInfo rawDataUserInfo = this.c;
                IRawDataType iRawDataType = this.d;
                RawDataInfo rawDataInfo = new RawDataInfo(this.e, this.f);
                RawDataDeviceInfo rawDataDeviceInfo = this.g;
                this.a = 1;
                if (bloodPressureRawDataUseCase.saveFileLocal$rawdata_uploader_release(rawDataUserInfo, iRawDataType, rawDataInfo, rawDataDeviceInfo, this) == coroutine_suspended) {
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
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.rawdata_uploader.usecase.BloodPressureRawDataUseCase$saveRawDataLocal$1", f = "BloodPressureRawDataUseCase.kt", i = {}, l = {107}, m = "invokeSuspend", n = {}, s = {})
    public static final class j extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ RawDataUserInfo c;
        public final /* synthetic */ IRawDataType d;
        public final /* synthetic */ long e;
        public final /* synthetic */ byte[] f;
        public final /* synthetic */ RawDataDeviceInfo g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(RawDataUserInfo rawDataUserInfo, IRawDataType iRawDataType, long j, byte[] bArr, RawDataDeviceInfo rawDataDeviceInfo, Continuation<? super j> continuation) {
            super(2, continuation);
            this.c = rawDataUserInfo;
            this.d = iRawDataType;
            this.e = j;
            this.f = bArr;
            this.g = rawDataDeviceInfo;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return BloodPressureRawDataUseCase.this.new j(this.c, this.d, this.e, this.f, this.g, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((j) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                BloodPressureRawDataUseCase bloodPressureRawDataUseCase = BloodPressureRawDataUseCase.this;
                RawDataUserInfo rawDataUserInfo = this.c;
                IRawDataType iRawDataType = this.d;
                RawDataInfo rawDataInfo = new RawDataInfo(this.e, this.f);
                RawDataDeviceInfo rawDataDeviceInfo = this.g;
                this.a = 1;
                if (bloodPressureRawDataUseCase.saveFileLocal$rawdata_uploader_release(rawDataUserInfo, iRawDataType, rawDataInfo, rawDataDeviceInfo, this) == coroutine_suspended) {
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
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.rawdata_uploader.usecase.BloodPressureRawDataUseCase$saveRawDataRemote$1", f = "BloodPressureRawDataUseCase.kt", i = {}, l = {123, 125, 127}, m = "invokeSuspend", n = {}, s = {})
    public static final class k extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ RawDataUserInfo c;
        public final /* synthetic */ IRawDataType d;
        public final /* synthetic */ long e;
        public final /* synthetic */ byte[] f;
        public final /* synthetic */ RawDataDeviceInfo g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(RawDataUserInfo rawDataUserInfo, IRawDataType iRawDataType, long j, byte[] bArr, RawDataDeviceInfo rawDataDeviceInfo, Continuation<? super k> continuation) {
            super(2, continuation);
            this.c = rawDataUserInfo;
            this.d = iRawDataType;
            this.e = j;
            this.f = bArr;
            this.g = rawDataDeviceInfo;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return BloodPressureRawDataUseCase.this.new k(this.c, this.d, this.e, this.f, this.g, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((k) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:20:0x0061 A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            BloodPressureRawDataUseCase bloodPressureRawDataUseCase;
            RawDataUserInfo rawDataUserInfo;
            IRawDataType iRawDataType;
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i != 0) {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else if (i == 2) {
                    ResultKt.throwOnFailure(obj);
                    bloodPressureRawDataUseCase = BloodPressureRawDataUseCase.this;
                    rawDataUserInfo = this.c;
                    iRawDataType = this.d;
                    this.a = 3;
                    if (bloodPressureRawDataUseCase.postFileRelation(rawDataUserInfo, iRawDataType, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            BloodPressureRawDataUseCase bloodPressureRawDataUseCase2 = BloodPressureRawDataUseCase.this;
            RawDataUserInfo rawDataUserInfo2 = this.c;
            IRawDataType iRawDataType2 = this.d;
            RawDataInfo rawDataInfo = new RawDataInfo(this.e, this.f);
            RawDataDeviceInfo rawDataDeviceInfo = this.g;
            this.a = 1;
            if (bloodPressureRawDataUseCase2.saveFileLocal$rawdata_uploader_release(rawDataUserInfo2, iRawDataType2, rawDataInfo, rawDataDeviceInfo, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            BloodPressureRawDataUseCase bloodPressureRawDataUseCase3 = BloodPressureRawDataUseCase.this;
            RawDataUserInfo rawDataUserInfo3 = this.c;
            IRawDataType iRawDataType3 = this.d;
            this.a = 2;
            if (bloodPressureRawDataUseCase3.postFile(rawDataUserInfo3, iRawDataType3, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            bloodPressureRawDataUseCase = BloodPressureRawDataUseCase.this;
            rawDataUserInfo = this.c;
            iRawDataType = this.d;
            this.a = 3;
            if (bloodPressureRawDataUseCase.postFileRelation(rawDataUserInfo, iRawDataType, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class l extends Lambda implements Function0<String> {
        public final /* synthetic */ IRawDataType a;
        public final /* synthetic */ long b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(IRawDataType iRawDataType, long j) {
            super(0);
            this.a = iRawDataType;
            this.b = j;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "save " + this.a + " error generateTime " + this.b;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class m extends Lambda implements Function0<String> {
        public final /* synthetic */ IRawDataType a;
        public final /* synthetic */ Throwable b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(IRawDataType iRawDataType, Throwable th) {
            super(0);
            this.a = iRawDataType;
            this.b = th;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "save " + this.a + " error " + this.b.getMessage();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class n extends Lambda implements Function0<CoroutineScope> {
        public static final n a = new n();

        public n() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final CoroutineScope invoke() {
            Scope scopeRawDataKoinScope = RawDataInterModuleKt.rawDataKoinScope();
            if (scopeRawDataKoinScope == null) {
                return null;
            }
            return (CoroutineScope) RawDataInterModuleKt.rawDataKoinScope(scopeRawDataKoinScope.getKoin()).get(Reflection.getOrCreateKotlinClass(CoroutineScope.class), null, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"Lcom/huami/rawdata_uploader/relation/remote/BloodPressureRawDataDelegate;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class o extends Lambda implements Function0<BloodPressureRawDataDelegate> {
        public static final o a = new o();

        public o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final BloodPressureRawDataDelegate invoke() {
            Scope scopeRawDataKoinScope = RawDataInterModuleKt.rawDataKoinScope();
            if (scopeRawDataKoinScope == null) {
                return null;
            }
            return (BloodPressureRawDataDelegate) RawDataInterModuleKt.rawDataKoinScope(scopeRawDataKoinScope.getKoin()).get(Reflection.getOrCreateKotlinClass(BloodPressureRawDataDelegate.class), null, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.rawdata_uploader.usecase.BloodPressureRawDataUseCase", f = "BloodPressureRawDataUseCase.kt", i = {}, l = {DataTypeSource.SPORT_TYPE_DOWNHILL}, m = "uploadRawFile", n = {}, s = {})
    public static final class p extends ContinuationImpl {
        public /* synthetic */ Object a;
        public int c;

        public p(Continuation<? super p> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.a = obj;
            this.c |= Integer.MIN_VALUE;
            return BloodPressureRawDataUseCase.this.g(null, null, this);
        }
    }

    public BloodPressureRawDataUseCase(@NotNull Context context) {
        this.context = context;
    }

    private final BloodPressureFileUploadDelegate a() {
        return (BloodPressureFileUploadDelegate) this.fileUploadRepo.getValue();
    }

    private final IRawDataLocalRepo b() {
        return (IRawDataLocalRepo) this.localRepo.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(String str, String str2, String str3, String str4, Continuation<? super RawDataUrlResponse> continuation) {
        b bVar;
        if (continuation instanceof b) {
            bVar = (b) continuation;
            int i2 = bVar.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bVar.c = i2 - Integer.MIN_VALUE;
            } else {
                bVar = new b(continuation);
            }
        } else {
            bVar = new b(continuation);
        }
        b bVar2 = bVar;
        Object objFetchRawDataUrlByType = bVar2.a;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i3 = bVar2.c;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objFetchRawDataUrlByType);
            BloodPressureFileUploadDelegate bloodPressureFileUploadDelegateA = a();
            if (bloodPressureFileUploadDelegateA == null) {
                return null;
            }
            bVar2.c = 1;
            objFetchRawDataUrlByType = bloodPressureFileUploadDelegateA.fetchRawDataUrlByType(str, str2, str3, str4, bVar2);
            if (objFetchRawDataUrlByType == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objFetchRawDataUrlByType);
        }
        return (RawDataUrlResponse) objFetchRawDataUrlByType;
    }

    private final CoroutineScope d() {
        return (CoroutineScope) this.scope.getValue();
    }

    private final BloodPressureRawDataDelegate e() {
        return (BloodPressureRawDataDelegate) this.ueUploadRepo.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object f(RawDataUserInfo rawDataUserInfo, byte[] bArr, long j2, IRawDataType iRawDataType, Continuation<? super String> continuation) {
        Object objM3845constructorimpl;
        try {
            Result.Companion companion = Result.Companion;
            RawDataFileManager rawDataFileManager = RawDataFileManager.INSTANCE;
            rawDataFileManager.initDir(getContext(), iRawDataType.getValueStr());
            if (!(bArr.length == 0)) {
                File fileSaveRawData = rawDataFileManager.saveRawData(getContext(), iRawDataType, rawDataUserInfo.getUserId(), j2, bArr);
                if (fileSaveRawData != null) {
                    return fileSaveRawData.getAbsolutePath();
                }
                CommonExKt.commonLog(this.TAG, new l(iRawDataType, j2));
                return null;
            }
            objM3845constructorimpl = Result.m3845constructorimpl(Unit.INSTANCE);
            Throwable thM3848exceptionOrNullimpl = Result.m3848exceptionOrNullimpl(objM3845constructorimpl);
            if (thM3848exceptionOrNullimpl != null) {
                CommonExKt.commonLog(this.TAG, new m(iRawDataType, thM3848exceptionOrNullimpl));
            }
            return null;
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object g(String str, File file, Continuation<? super Boolean> continuation) {
        p pVar;
        Object objM3845constructorimpl;
        Boolean bool;
        if (continuation instanceof p) {
            pVar = (p) continuation;
            int i2 = pVar.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pVar.c = i2 - Integer.MIN_VALUE;
            } else {
                pVar = new p(continuation);
            }
        } else {
            pVar = new p(continuation);
        }
        Object objUploadRawFile = pVar.a;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i3 = pVar.c;
        try {
            if (i3 == 0) {
                ResultKt.throwOnFailure(objUploadRawFile);
                Result.Companion companion = Result.Companion;
                BloodPressureFileUploadDelegate bloodPressureFileUploadDelegateA = a();
                if (bloodPressureFileUploadDelegateA == null) {
                    bool = null;
                } else {
                    pVar.c = 1;
                    objUploadRawFile = bloodPressureFileUploadDelegateA.uploadRawFile(str, file, pVar);
                    if (objUploadRawFile == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                objM3845constructorimpl = Result.m3845constructorimpl(bool);
                return Boxing.boxBoolean(Result.m3851isSuccessimpl(objM3845constructorimpl));
            }
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objUploadRawFile);
            bool = (Boolean) objUploadRawFile;
            objM3845constructorimpl = Result.m3845constructorimpl(bool);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
        }
        return Boxing.boxBoolean(Result.m3851isSuccessimpl(objM3845constructorimpl));
    }

    @NotNull
    /* JADX INFO: renamed from: getContext$rawdata_uploader_release, reason: from getter */
    public final Context getContext() {
        return this.context;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:33:0x012d A[LOOP:2: B:31:0x0127->B:33:0x012d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:36:0x0171 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:37:0x0172  */
    /* JADX WARN: Code duplicated, block: B:40:0x0180  */
    /* JADX WARN: Code duplicated, block: B:41:0x0182  */
    /* JADX WARN: Code duplicated, block: B:43:0x019d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:48:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:53:0x01c4 A[LOOP:0: B:51:0x01be->B:53:0x01c4, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:57:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:60:0x01ee A[LOOP:1: B:58:0x01e8->B:60:0x01ee, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:63:0x021f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Instruction removed from duplicated block: B:30:0x00ca, please report this as an issue */
    @Nullable
    public final Object postFile(@NotNull RawDataUserInfo rawDataUserInfo, @NotNull IRawDataType iRawDataType, @NotNull Continuation<? super Unit> continuation) throws IOException {
        d dVar;
        BloodPressureRawDataUseCase bloodPressureRawDataUseCase;
        Object obj;
        RawDataUserInfo rawDataUserInfo2;
        IRawDataType iRawDataType2;
        List list;
        String str;
        File zipPathByType;
        ArrayList arrayList;
        Iterator it2;
        Object objC;
        RawDataUserInfo rawDataUserInfo3;
        String str2;
        File file;
        IRawDataType iRawDataType3;
        BloodPressureRawDataUseCase bloodPressureRawDataUseCase2;
        List list2;
        List list3;
        RawDataUrlResponse rawDataUrlResponse;
        Boolean boolBoxBoolean;
        IRawDataType iRawDataType4;
        String str3;
        Iterator it3;
        IRawDataLocalRepo iRawDataLocalRepoB;
        String userId;
        ArrayList arrayList2;
        Iterator it4;
        int value;
        if (continuation instanceof d) {
            dVar = (d) continuation;
            int i2 = dVar.j;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dVar.j = i2 - Integer.MIN_VALUE;
            } else {
                dVar = new d(continuation);
            }
        } else {
            dVar = new d(continuation);
        }
        Object objG = dVar.h;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i3 = dVar.j;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objG);
            IRawDataLocalRepo iRawDataLocalRepoB2 = b();
            if (iRawDataLocalRepoB2 != null) {
                String userId2 = rawDataUserInfo.getUserId();
                int value2 = iRawDataType.getValue();
                dVar.a = this;
                dVar.b = rawDataUserInfo;
                dVar.c = iRawDataType;
                dVar.j = 1;
                Object unSyncFileList = iRawDataLocalRepoB2.getUnSyncFileList(userId2, value2, dVar);
                if (unSyncFileList == coroutine_suspended) {
                    return coroutine_suspended;
                }
                bloodPressureRawDataUseCase = this;
                obj = unSyncFileList;
                rawDataUserInfo2 = rawDataUserInfo;
                iRawDataType2 = iRawDataType;
                list = (List) obj;
                if (list != null) {
                    RawDataDbVo rawDataDbVo = (RawDataDbVo) list.get(0);
                    RawDataDbVo rawDataDbVo2 = (RawDataDbVo) CollectionsKt.last(list);
                    str = iRawDataType2.getFileNamePrefix() + "_" + rawDataUserInfo2.getUserId() + "_" + rawDataDbVo.getMeasureTime() + "_" + rawDataDbVo2.getMeasureTime() + MultiDexExtractor.EXTRACTED_SUFFIX;
                    zipPathByType = FileManagerExKt.getZipPathByType(RawDataFileManager.INSTANCE, bloodPressureRawDataUseCase.getContext(), rawDataUserInfo2.getUserId(), str, iRawDataType2);
                    arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
                    it2 = list.iterator();
                    while (it2.hasNext()) {
                        arrayList.add(new File(((RawDataDbVo) it2.next()).getRawLocalPath()));
                    }
                    RawDataFileManager.INSTANCE.zipFiles(arrayList, zipPathByType);
                    String userId3 = rawDataUserInfo2.getUserId();
                    String appName = rawDataUserInfo2.getAppName();
                    String uploadType = iRawDataType2.getUploadType();
                    dVar.a = bloodPressureRawDataUseCase;
                    dVar.b = rawDataUserInfo2;
                    dVar.c = iRawDataType2;
                    dVar.d = list;
                    dVar.e = str;
                    dVar.f = zipPathByType;
                    dVar.g = arrayList;
                    dVar.j = 2;
                    objC = bloodPressureRawDataUseCase.c(userId3, appName, str, uploadType, dVar);
                    if (objC == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    rawDataUserInfo3 = rawDataUserInfo2;
                    objG = objC;
                    str2 = str;
                    file = zipPathByType;
                    iRawDataType3 = iRawDataType2;
                    bloodPressureRawDataUseCase2 = bloodPressureRawDataUseCase;
                    list2 = list;
                    list3 = arrayList;
                    rawDataUrlResponse = (RawDataUrlResponse) objG;
                    if (rawDataUrlResponse == null) {
                        boolBoxBoolean = null;
                    } else {
                        String putURI = rawDataUrlResponse.getPutURI();
                        dVar.a = bloodPressureRawDataUseCase2;
                        dVar.b = rawDataUserInfo3;
                        dVar.c = iRawDataType3;
                        dVar.d = list2;
                        dVar.e = str2;
                        dVar.f = file;
                        dVar.g = list3;
                        dVar.j = 3;
                        objG = bloodPressureRawDataUseCase2.g(putURI, file, dVar);
                        if (objG == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        boolBoxBoolean = Boxing.boxBoolean(((Boolean) objG).booleanValue());
                    }
                    iRawDataType4 = iRawDataType3;
                    str3 = str2;
                    file.delete();
                    if (boolBoxBoolean != null) {
                        it3 = list3.iterator();
                        while (it3.hasNext()) {
                            RawDataFileManager.INSTANCE.deleteFile((File) it3.next());
                        }
                        iRawDataLocalRepoB = bloodPressureRawDataUseCase2.b();
                        if (iRawDataLocalRepoB != null) {
                            userId = rawDataUserInfo3.getUserId();
                            arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
                            it4 = list2.iterator();
                            while (it4.hasNext()) {
                                arrayList2.add(Boxing.boxLong(((RawDataDbVo) it4.next()).getMeasureTime()));
                            }
                            value = iRawDataType4.getValue();
                            dVar.a = null;
                            dVar.b = null;
                            dVar.c = null;
                            dVar.d = null;
                            dVar.e = null;
                            dVar.f = null;
                            dVar.g = null;
                            dVar.j = 4;
                            if (iRawDataLocalRepoB.updateZipNameByUserId(userId, arrayList2, str3, value, dVar) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                    }
                }
            }
        } else if (i3 == 1) {
            IRawDataType iRawDataType5 = (IRawDataType) dVar.c;
            RawDataUserInfo rawDataUserInfo4 = (RawDataUserInfo) dVar.b;
            BloodPressureRawDataUseCase bloodPressureRawDataUseCase3 = (BloodPressureRawDataUseCase) dVar.a;
            ResultKt.throwOnFailure(objG);
            iRawDataType2 = iRawDataType5;
            bloodPressureRawDataUseCase = bloodPressureRawDataUseCase3;
            obj = objG;
            rawDataUserInfo2 = rawDataUserInfo4;
            list = (List) obj;
            if (list != null) {
                RawDataDbVo rawDataDbVo3 = (RawDataDbVo) list.get(0);
                RawDataDbVo rawDataDbVo4 = (RawDataDbVo) CollectionsKt.last(list);
                str = iRawDataType2.getFileNamePrefix() + "_" + rawDataUserInfo2.getUserId() + "_" + rawDataDbVo3.getMeasureTime() + "_" + rawDataDbVo4.getMeasureTime() + MultiDexExtractor.EXTRACTED_SUFFIX;
                zipPathByType = FileManagerExKt.getZipPathByType(RawDataFileManager.INSTANCE, bloodPressureRawDataUseCase.getContext(), rawDataUserInfo2.getUserId(), str, iRawDataType2);
                arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
                it2 = list.iterator();
                while (it2.hasNext()) {
                    arrayList.add(new File(((RawDataDbVo) it2.next()).getRawLocalPath()));
                }
                RawDataFileManager.INSTANCE.zipFiles(arrayList, zipPathByType);
                String userId4 = rawDataUserInfo2.getUserId();
                String appName2 = rawDataUserInfo2.getAppName();
                String uploadType2 = iRawDataType2.getUploadType();
                dVar.a = bloodPressureRawDataUseCase;
                dVar.b = rawDataUserInfo2;
                dVar.c = iRawDataType2;
                dVar.d = list;
                dVar.e = str;
                dVar.f = zipPathByType;
                dVar.g = arrayList;
                dVar.j = 2;
                objC = bloodPressureRawDataUseCase.c(userId4, appName2, str, uploadType2, dVar);
                if (objC == coroutine_suspended) {
                    return coroutine_suspended;
                }
                rawDataUserInfo3 = rawDataUserInfo2;
                objG = objC;
                str2 = str;
                file = zipPathByType;
                iRawDataType3 = iRawDataType2;
                bloodPressureRawDataUseCase2 = bloodPressureRawDataUseCase;
                list2 = list;
                list3 = arrayList;
                rawDataUrlResponse = (RawDataUrlResponse) objG;
                if (rawDataUrlResponse == null) {
                    boolBoxBoolean = null;
                } else {
                    String putURI2 = rawDataUrlResponse.getPutURI();
                    dVar.a = bloodPressureRawDataUseCase2;
                    dVar.b = rawDataUserInfo3;
                    dVar.c = iRawDataType3;
                    dVar.d = list2;
                    dVar.e = str2;
                    dVar.f = file;
                    dVar.g = list3;
                    dVar.j = 3;
                    objG = bloodPressureRawDataUseCase2.g(putURI2, file, dVar);
                    if (objG == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    boolBoxBoolean = Boxing.boxBoolean(((Boolean) objG).booleanValue());
                }
                iRawDataType4 = iRawDataType3;
                str3 = str2;
                file.delete();
                if (boolBoxBoolean != null) {
                    it3 = list3.iterator();
                    while (it3.hasNext()) {
                        RawDataFileManager.INSTANCE.deleteFile((File) it3.next());
                    }
                    iRawDataLocalRepoB = bloodPressureRawDataUseCase2.b();
                    if (iRawDataLocalRepoB != null) {
                        userId = rawDataUserInfo3.getUserId();
                        arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
                        it4 = list2.iterator();
                        while (it4.hasNext()) {
                            arrayList2.add(Boxing.boxLong(((RawDataDbVo) it4.next()).getMeasureTime()));
                        }
                        value = iRawDataType4.getValue();
                        dVar.a = null;
                        dVar.b = null;
                        dVar.c = null;
                        dVar.d = null;
                        dVar.e = null;
                        dVar.f = null;
                        dVar.g = null;
                        dVar.j = 4;
                        if (iRawDataLocalRepoB.updateZipNameByUserId(userId, arrayList2, str3, value, dVar) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                }
            }
        } else if (i3 == 2) {
            list3 = (List) dVar.g;
            file = (File) dVar.f;
            str2 = (String) dVar.e;
            list2 = (List) dVar.d;
            iRawDataType3 = (IRawDataType) dVar.c;
            rawDataUserInfo3 = (RawDataUserInfo) dVar.b;
            BloodPressureRawDataUseCase bloodPressureRawDataUseCase4 = (BloodPressureRawDataUseCase) dVar.a;
            ResultKt.throwOnFailure(objG);
            bloodPressureRawDataUseCase2 = bloodPressureRawDataUseCase4;
            rawDataUrlResponse = (RawDataUrlResponse) objG;
            if (rawDataUrlResponse == null) {
                boolBoxBoolean = null;
            } else {
                String putURI3 = rawDataUrlResponse.getPutURI();
                dVar.a = bloodPressureRawDataUseCase2;
                dVar.b = rawDataUserInfo3;
                dVar.c = iRawDataType3;
                dVar.d = list2;
                dVar.e = str2;
                dVar.f = file;
                dVar.g = list3;
                dVar.j = 3;
                objG = bloodPressureRawDataUseCase2.g(putURI3, file, dVar);
                if (objG == coroutine_suspended) {
                    return coroutine_suspended;
                }
                boolBoxBoolean = Boxing.boxBoolean(((Boolean) objG).booleanValue());
            }
            iRawDataType4 = iRawDataType3;
            str3 = str2;
            file.delete();
            if (boolBoxBoolean != null) {
                it3 = list3.iterator();
                while (it3.hasNext()) {
                    RawDataFileManager.INSTANCE.deleteFile((File) it3.next());
                }
                iRawDataLocalRepoB = bloodPressureRawDataUseCase2.b();
                if (iRawDataLocalRepoB != null) {
                    userId = rawDataUserInfo3.getUserId();
                    arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
                    it4 = list2.iterator();
                    while (it4.hasNext()) {
                        arrayList2.add(Boxing.boxLong(((RawDataDbVo) it4.next()).getMeasureTime()));
                    }
                    value = iRawDataType4.getValue();
                    dVar.a = null;
                    dVar.b = null;
                    dVar.c = null;
                    dVar.d = null;
                    dVar.e = null;
                    dVar.f = null;
                    dVar.g = null;
                    dVar.j = 4;
                    if (iRawDataLocalRepoB.updateZipNameByUserId(userId, arrayList2, str3, value, dVar) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            }
        } else if (i3 == 3) {
            list3 = (List) dVar.g;
            file = (File) dVar.f;
            str2 = (String) dVar.e;
            list2 = (List) dVar.d;
            iRawDataType3 = (IRawDataType) dVar.c;
            rawDataUserInfo3 = (RawDataUserInfo) dVar.b;
            bloodPressureRawDataUseCase2 = (BloodPressureRawDataUseCase) dVar.a;
            ResultKt.throwOnFailure(objG);
            boolBoxBoolean = Boxing.boxBoolean(((Boolean) objG).booleanValue());
            iRawDataType4 = iRawDataType3;
            str3 = str2;
            file.delete();
            if (boolBoxBoolean != null && boolBoxBoolean.booleanValue()) {
                it3 = list3.iterator();
                while (it3.hasNext()) {
                    RawDataFileManager.INSTANCE.deleteFile((File) it3.next());
                }
                iRawDataLocalRepoB = bloodPressureRawDataUseCase2.b();
                if (iRawDataLocalRepoB != null) {
                    userId = rawDataUserInfo3.getUserId();
                    arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
                    it4 = list2.iterator();
                    while (it4.hasNext()) {
                        arrayList2.add(Boxing.boxLong(((RawDataDbVo) it4.next()).getMeasureTime()));
                    }
                    value = iRawDataType4.getValue();
                    dVar.a = null;
                    dVar.b = null;
                    dVar.c = null;
                    dVar.d = null;
                    dVar.e = null;
                    dVar.f = null;
                    dVar.g = null;
                    dVar.j = 4;
                    if (iRawDataLocalRepoB.updateZipNameByUserId(userId, arrayList2, str3, value, dVar) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            }
        } else {
            if (i3 != 4) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objG);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0092  */
    /* JADX WARN: Code duplicated, block: B:31:0x0099  */
    /* JADX WARN: Code duplicated, block: B:33:0x00b1 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:34:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:38:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:40:0x00c3 A[DONT_INVERT, PHI: r2 r3 r12 r13 r14
      0x00c3: PHI (r2v7 com.huami.rawdata_uploader.usecase.BloodPressureRawDataUseCase) = 
      (r2v4 com.huami.rawdata_uploader.usecase.BloodPressureRawDataUseCase)
      (r2v10 com.huami.rawdata_uploader.usecase.BloodPressureRawDataUseCase)
     binds: [B:29:0x0096, B:39:0x00c0] A[DONT_GENERATE, DONT_INLINE]
      0x00c3: PHI (r3v1 boolean) = (r3v0 boolean), (r3v3 boolean) binds: [B:29:0x0096, B:39:0x00c0] A[DONT_GENERATE, DONT_INLINE]
      0x00c3: PHI (r12v5 java.util.List<com.huami.rawdata_uploader.relation.local.RawDataDbVo>) = 
      (r12v2 java.util.List<com.huami.rawdata_uploader.relation.local.RawDataDbVo>)
      (r12v9 java.util.List<com.huami.rawdata_uploader.relation.local.RawDataDbVo>)
     binds: [B:29:0x0096, B:39:0x00c0] A[DONT_GENERATE, DONT_INLINE]
      0x00c3: PHI (r13v6 com.huami.rawdata_uploader.vo.RawDataUserInfo) = (r13v2 com.huami.rawdata_uploader.vo.RawDataUserInfo), (r13v9 com.huami.rawdata_uploader.vo.RawDataUserInfo) binds: [B:29:0x0096, B:39:0x00c0] A[DONT_GENERATE, DONT_INLINE]
      0x00c3: PHI (r14v10 com.huami.rawdata_uploader.vo.IRawDataType) = (r14v5 com.huami.rawdata_uploader.vo.IRawDataType), (r14v13 com.huami.rawdata_uploader.vo.IRawDataType) binds: [B:29:0x0096, B:39:0x00c0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:41:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:47:0x00e5 A[LOOP:0: B:45:0x00df->B:47:0x00e5, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:50:0x010b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object postFileRelation(@NotNull RawDataUserInfo rawDataUserInfo, @NotNull IRawDataType iRawDataType, @NotNull Continuation<? super Unit> continuation) {
        e eVar;
        BloodPressureRawDataUseCase bloodPressureRawDataUseCase;
        IRawDataType iRawDataType2;
        RawDataUserInfo rawDataUserInfo2;
        List<RawDataDbVo> list;
        BloodPressureRawDataDelegate bloodPressureRawDataDelegateE;
        Object objPostDataList;
        RawDataUserInfo rawDataUserInfo3;
        IRawDataType iRawDataType3;
        BloodPressureRawDataUseCase bloodPressureRawDataUseCase2;
        IRawDataLocalRepo iRawDataLocalRepoB;
        String userId;
        ArrayList arrayList;
        Iterator<T> it2;
        int value;
        if (continuation instanceof e) {
            eVar = (e) continuation;
            int i2 = eVar.g;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                eVar.g = i2 - Integer.MIN_VALUE;
            } else {
                eVar = new e(continuation);
            }
        } else {
            eVar = new e(continuation);
        }
        Object syncFileList = eVar.e;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i3 = eVar.g;
        boolean zBooleanValue = false;
        if (i3 != 0) {
            if (i3 == 1) {
                IRawDataType iRawDataType4 = (IRawDataType) eVar.c;
                RawDataUserInfo rawDataUserInfo4 = (RawDataUserInfo) eVar.b;
                bloodPressureRawDataUseCase = (BloodPressureRawDataUseCase) eVar.a;
                ResultKt.throwOnFailure(syncFileList);
                iRawDataType = iRawDataType4;
                rawDataUserInfo = rawDataUserInfo4;
            } else if (i3 == 2) {
                list = (List) eVar.d;
                iRawDataType3 = (IRawDataType) eVar.c;
                rawDataUserInfo3 = (RawDataUserInfo) eVar.b;
                bloodPressureRawDataUseCase2 = (BloodPressureRawDataUseCase) eVar.a;
                ResultKt.throwOnFailure(syncFileList);
                Boolean bool = (Boolean) syncFileList;
                zBooleanValue = bool != null ? bool.booleanValue() : false;
                iRawDataType2 = iRawDataType3;
                rawDataUserInfo2 = rawDataUserInfo3;
                bloodPressureRawDataUseCase = bloodPressureRawDataUseCase2;
                if (zBooleanValue && (iRawDataLocalRepoB = bloodPressureRawDataUseCase.b()) != null) {
                    userId = rawDataUserInfo2.getUserId();
                    arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
                    it2 = list.iterator();
                    while (it2.hasNext()) {
                        arrayList.add(Boxing.boxLong(((RawDataDbVo) it2.next()).getMeasureTime()));
                    }
                    value = iRawDataType2.getValue();
                    eVar.a = null;
                    eVar.b = null;
                    eVar.c = null;
                    eVar.d = null;
                    eVar.g = 3;
                    if (iRawDataLocalRepoB.deleteDataList(userId, arrayList, value, eVar) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else {
                if (i3 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(syncFileList);
            }
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(syncFileList);
        IRawDataLocalRepo iRawDataLocalRepoB2 = b();
        if (iRawDataLocalRepoB2 == null) {
            bloodPressureRawDataUseCase = this;
            iRawDataType2 = iRawDataType;
            rawDataUserInfo2 = rawDataUserInfo;
            list = null;
        } else {
            String userId2 = rawDataUserInfo.getUserId();
            int value2 = iRawDataType.getValue();
            eVar.a = this;
            eVar.b = rawDataUserInfo;
            eVar.c = iRawDataType;
            eVar.g = 1;
            syncFileList = iRawDataLocalRepoB2.getSyncFileList(userId2, value2, eVar);
            if (syncFileList == coroutine_suspended) {
                return coroutine_suspended;
            }
            bloodPressureRawDataUseCase = this;
        }
        if (list != null) {
            bloodPressureRawDataDelegateE = bloodPressureRawDataUseCase.e();
            if (bloodPressureRawDataDelegateE == null) {
                String eventType = iRawDataType2.getEventType();
                String subType = iRawDataType2.getSubType();
                eVar.a = bloodPressureRawDataUseCase;
                eVar.b = rawDataUserInfo2;
                eVar.c = iRawDataType2;
                eVar.d = list;
                eVar.g = 2;
                objPostDataList = bloodPressureRawDataDelegateE.postDataList(list, eventType, subType, eVar);
                if (objPostDataList == coroutine_suspended) {
                    return coroutine_suspended;
                }
                BloodPressureRawDataUseCase bloodPressureRawDataUseCase3 = bloodPressureRawDataUseCase;
                rawDataUserInfo3 = rawDataUserInfo2;
                iRawDataType3 = iRawDataType2;
                syncFileList = objPostDataList;
                bloodPressureRawDataUseCase2 = bloodPressureRawDataUseCase3;
                Boolean bool2 = (Boolean) syncFileList;
                if (bool2 != null) {
                }
                iRawDataType2 = iRawDataType3;
                rawDataUserInfo2 = rawDataUserInfo3;
                bloodPressureRawDataUseCase = bloodPressureRawDataUseCase2;
                if (zBooleanValue) {
                    userId = rawDataUserInfo2.getUserId();
                    arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
                    it2 = list.iterator();
                    while (it2.hasNext()) {
                        arrayList.add(Boxing.boxLong(((RawDataDbVo) it2.next()).getMeasureTime()));
                    }
                    value = iRawDataType2.getValue();
                    eVar.a = null;
                    eVar.b = null;
                    eVar.c = null;
                    eVar.d = null;
                    eVar.g = 3;
                    if (iRawDataLocalRepoB.deleteDataList(userId, arrayList, value, eVar) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else if (zBooleanValue) {
                userId = rawDataUserInfo2.getUserId();
                arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
                it2 = list.iterator();
                while (it2.hasNext()) {
                    arrayList.add(Boxing.boxLong(((RawDataDbVo) it2.next()).getMeasureTime()));
                }
                value = iRawDataType2.getValue();
                eVar.a = null;
                eVar.b = null;
                eVar.c = null;
                eVar.d = null;
                eVar.g = 3;
                if (iRawDataLocalRepoB.deleteDataList(userId, arrayList, value, eVar) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        }
        return Unit.INSTANCE;
        IRawDataType iRawDataType5 = iRawDataType;
        rawDataUserInfo2 = rawDataUserInfo;
        list = (List) syncFileList;
        iRawDataType2 = iRawDataType5;
        if (list != null) {
            bloodPressureRawDataDelegateE = bloodPressureRawDataUseCase.e();
            if (bloodPressureRawDataDelegateE == null) {
                String eventType2 = iRawDataType2.getEventType();
                String subType2 = iRawDataType2.getSubType();
                eVar.a = bloodPressureRawDataUseCase;
                eVar.b = rawDataUserInfo2;
                eVar.c = iRawDataType2;
                eVar.d = list;
                eVar.g = 2;
                objPostDataList = bloodPressureRawDataDelegateE.postDataList(list, eventType2, subType2, eVar);
                if (objPostDataList == coroutine_suspended) {
                    return coroutine_suspended;
                }
                BloodPressureRawDataUseCase bloodPressureRawDataUseCase4 = bloodPressureRawDataUseCase;
                rawDataUserInfo3 = rawDataUserInfo2;
                iRawDataType3 = iRawDataType2;
                syncFileList = objPostDataList;
                bloodPressureRawDataUseCase2 = bloodPressureRawDataUseCase4;
                Boolean bool3 = (Boolean) syncFileList;
                if (bool3 != null) {
                }
                iRawDataType2 = iRawDataType3;
                rawDataUserInfo2 = rawDataUserInfo3;
                bloodPressureRawDataUseCase = bloodPressureRawDataUseCase2;
                if (zBooleanValue) {
                    userId = rawDataUserInfo2.getUserId();
                    arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
                    it2 = list.iterator();
                    while (it2.hasNext()) {
                        arrayList.add(Boxing.boxLong(((RawDataDbVo) it2.next()).getMeasureTime()));
                    }
                    value = iRawDataType2.getValue();
                    eVar.a = null;
                    eVar.b = null;
                    eVar.c = null;
                    eVar.d = null;
                    eVar.g = 3;
                    if (iRawDataLocalRepoB.deleteDataList(userId, arrayList, value, eVar) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else if (zBooleanValue) {
                userId = rawDataUserInfo2.getUserId();
                arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
                it2 = list.iterator();
                while (it2.hasNext()) {
                    arrayList.add(Boxing.boxLong(((RawDataDbVo) it2.next()).getMeasureTime()));
                }
                value = iRawDataType2.getValue();
                eVar.a = null;
                eVar.b = null;
                eVar.c = null;
                eVar.d = null;
                eVar.g = 3;
                if (iRawDataLocalRepoB.deleteDataList(userId, arrayList, value, eVar) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Nullable
    public final Object saveFileLocal$rawdata_uploader_release(@NotNull RawDataUserInfo rawDataUserInfo, @NotNull IRawDataType iRawDataType, @NotNull RawDataInfo rawDataInfo, @NotNull RawDataDeviceInfo rawDataDeviceInfo, @NotNull Continuation<? super Unit> continuation) {
        f fVar;
        IRawDataType iRawDataType2;
        RawDataInfo rawDataInfo2;
        RawDataDeviceInfo rawDataDeviceInfo2;
        BloodPressureRawDataUseCase bloodPressureRawDataUseCase;
        RawDataUserInfo rawDataUserInfo2;
        IRawDataLocalRepo iRawDataLocalRepoB;
        if (continuation instanceof f) {
            fVar = (f) continuation;
            int i2 = fVar.h;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                fVar.h = i2 - Integer.MIN_VALUE;
            } else {
                fVar = new f(continuation);
            }
        } else {
            fVar = new f(continuation);
        }
        f fVar2 = fVar;
        Object objF = fVar2.f;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i3 = fVar2.h;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objF);
            byte[] rawData = rawDataInfo.getRawData();
            long generateTime = rawDataInfo.getGenerateTime();
            fVar2.a = this;
            fVar2.b = rawDataUserInfo;
            iRawDataType2 = iRawDataType;
            fVar2.c = iRawDataType2;
            rawDataInfo2 = rawDataInfo;
            fVar2.d = rawDataInfo2;
            rawDataDeviceInfo2 = rawDataDeviceInfo;
            fVar2.e = rawDataDeviceInfo2;
            fVar2.h = 1;
            objF = f(rawDataUserInfo, rawData, generateTime, iRawDataType, fVar2);
            if (objF == coroutine_suspended) {
                return coroutine_suspended;
            }
            bloodPressureRawDataUseCase = this;
            rawDataUserInfo2 = rawDataUserInfo;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            RawDataDeviceInfo rawDataDeviceInfo3 = (RawDataDeviceInfo) fVar2.e;
            RawDataInfo rawDataInfo3 = (RawDataInfo) fVar2.d;
            IRawDataType iRawDataType3 = (IRawDataType) fVar2.c;
            rawDataUserInfo2 = (RawDataUserInfo) fVar2.b;
            bloodPressureRawDataUseCase = (BloodPressureRawDataUseCase) fVar2.a;
            ResultKt.throwOnFailure(objF);
            rawDataDeviceInfo2 = rawDataDeviceInfo3;
            rawDataInfo2 = rawDataInfo3;
            iRawDataType2 = iRawDataType3;
        }
        String str = (String) objF;
        CommonExKt.commonLog("saveFileLocal", new g(rawDataInfo2, iRawDataType2));
        if (str != null && (iRawDataLocalRepoB = bloodPressureRawDataUseCase.b()) != null) {
            iRawDataLocalRepoB.insertData(new RawDataDbVo(rawDataInfo2.getGenerateTime(), rawDataUserInfo2.getUserId(), iRawDataType2.getValue(), null, rawDataDeviceInfo2.getDeviceSource(), rawDataDeviceInfo2.getDeviceType(), rawDataDeviceInfo2.getDeviceId(), rawDataDeviceInfo2.getDeviceMac(), rawDataDeviceInfo2.getFirmVersion(), rawDataDeviceInfo2.getSn(), str, rawDataInfo2.getRawData().length, null, null, 12296, null));
        }
        return Unit.INSTANCE;
    }

    public final void savePostRawDataList(@NotNull RawDataUserInfo userInfo, @NotNull RawDataDeviceInfo deviceInfo, @Nullable List<RawDataInfo> rawDataInfoList, @NotNull IRawDataType dataDataType) {
        CoroutineScope coroutineScopeD;
        if ((rawDataInfoList == null || rawDataInfoList.isEmpty()) || (coroutineScopeD = d()) == null) {
            return;
        }
        kotlinx.coroutines.e.f(coroutineScopeD, null, null, new h(rawDataInfoList, this, userInfo, dataDataType, deviceInfo, null), 3, null);
    }

    public final void saveRawDataAndPostByWork(@NotNull RawDataUserInfo userInfo, @NotNull RawDataDeviceInfo deviceInfo, @NotNull byte[] rawData, long generateTime, @NotNull IRawDataType dataDataType) {
        CoroutineScope coroutineScopeD = d();
        if (coroutineScopeD != null) {
            kotlinx.coroutines.e.f(coroutineScopeD, null, null, new i(userInfo, dataDataType, generateTime, rawData, deviceInfo, null), 3, null);
        }
        Context context = this.context;
        Constraints constraintsBuild = new Constraints.Builder().setRequiredNetworkType(NetworkType.UNMETERED).setRequiresBatteryNotLow(true).build();
        OneTimeWorkRequest.Builder builder = new OneTimeWorkRequest.Builder(BloodPressureRawDataUploadWork.class);
        BloodPressureRawDataUploadWork.Companion companion = BloodPressureRawDataUploadWork.INSTANCE;
        WorkManager.getInstance(context).enqueueUniqueWork(companion.getTAG(), ExistingWorkPolicy.APPEND_OR_REPLACE, builder.setInputData(companion.createInputDataForUri(userInfo, dataDataType)).setConstraints(constraintsBuild).build());
    }

    public final void saveRawDataLocal(@NotNull RawDataUserInfo userInfo, @NotNull RawDataDeviceInfo deviceInfo, @NotNull byte[] rawData, long generateTime, @NotNull IRawDataType dataDataType) {
        CoroutineScope coroutineScopeD = d();
        if (coroutineScopeD == null) {
            return;
        }
        kotlinx.coroutines.e.f(coroutineScopeD, null, null, new j(userInfo, dataDataType, generateTime, rawData, deviceInfo, null), 3, null);
    }

    public final void saveRawDataRemote(@NotNull RawDataUserInfo userInfo, @NotNull RawDataDeviceInfo deviceInfo, @NotNull byte[] rawData, long generateTime, @NotNull IRawDataType dataDataType) {
        CoroutineScope coroutineScopeD = d();
        if (coroutineScopeD == null) {
            return;
        }
        kotlinx.coroutines.e.f(coroutineScopeD, null, null, new k(userInfo, dataDataType, generateTime, rawData, deviceInfo, null), 3, null);
    }
}
