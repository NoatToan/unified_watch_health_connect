package com.xiaomi.hm.health.healthdata.bp;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.bloodpressure_core.dc.local.BloodPressureDbVo;
import com.huami.bloodpressure_core.dc.research.BloodPressureAttachData;
import com.huami.bloodpressure_core.dc.research.BloodPressureResearchVo;
import com.huami.bloodpressure_core.dc.research.IResearchApi;
import com.huami.bloodpressure_core.di.KoinExKt;
import com.huami.bloodpressure_core.ext.TimeFormatEx;
import com.huami.bloodpressure_core.ext.UserEx;
import com.huami.bloodpressure_core.p002const.BloodPressureConst;
import com.huami.bloodpressure_core.repo.IBloodPressureRepo;
import com.huami.bloodpressure_core.sharedpreference.ISharedPref;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bodyfat.utils.ParamKey;
import com.xiaomi.hm.health.bt.profile.gdsp.bloodpressure.BloodPressureMeasureResult;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0011\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001f\u0010 J&\u0010\t\u001a\u00020\b*\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0003H\u0002J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002J\b\u0010\u000e\u001a\u00020\nH\u0002J\u0006\u0010\u000f\u001a\u00020\fJ\u0014\u0010\u0012\u001a\u00020\f2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u0010J\u0014\u0010\u0013\u001a\u00020\f2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u0010J\u0006\u0010\u0014\u001a\u00020\fJ\u0013\u0010\u0015\u001a\u00020\nH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u0013\u0010\u0017\u001a\u00020\nH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0016R\u0016\u0010\u0019\u001a\u00020\u00038\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u000e\u0010\u0018R\u0016\u0010\u001a\u001a\u00020\u00038\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u0018R\u0016\u0010\u001c\u001a\u00020\u00058\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u001bR\u0016\u0010\u001e\u001a\u00020\u00058\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001d\u0010\u001b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006!"}, d2 = {"Lcom/xiaomi/hm/health/healthdata/bp/BloodPressureHelper;", "", "Lcom/xiaomi/hm/health/bt/profile/gdsp/bloodpressure/BloodPressureMeasureResult;", "", "userId", "", ParamKey.dataSource, "subType", "Lcom/huami/bloodpressure_core/dc/local/BloodPressureDbVo;", "c", "", "state", "", "b", "a", "syncBloodPressureData", "", "data", "saveBloodPressureAndPost", "saveNightBloodPressureAndPost", "cleanBloodPressureData", "getUserBPResearchStatus", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getBPRawDataEnable", "Ljava/lang/String;", "TAG", BloodPressureHelper.KEY_BP_RESEARCH_STATE, LogUtil.I, "TIME_MINUS", GoogleApiAvailabilityLight.a, "TIME_ZONE_MINUS", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class BloodPressureHelper {

    @NotNull
    public static final BloodPressureHelper INSTANCE = new BloodPressureHelper();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private static final String TAG = "BloodPressureHelper";

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private static final String KEY_BP_RESEARCH_STATE = "KEY_BP_RESEARCH_STATE";

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private static final int TIME_MINUS = 1000;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private static final int TIME_ZONE_MINUS = 900;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.healthdata.bp.BloodPressureHelper", f = "BloodPressureHelper.kt", i = {}, l = {159}, m = "getBPRawDataEnable", n = {}, s = {})
    public static final class a extends ContinuationImpl {
        public /* synthetic */ Object a;
        public int c;

        public a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.a = obj;
            this.c |= Integer.MIN_VALUE;
            return BloodPressureHelper.this.getBPRawDataEnable(this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ Throwable a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Throwable th) {
            super(0);
            this.a = th;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "raw data exception " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public final /* synthetic */ boolean a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(boolean z) {
            super(0);
            this.a = z;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "raw data upload enable " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.healthdata.bp.BloodPressureHelper", f = "BloodPressureHelper.kt", i = {}, l = {129}, m = "getUserBPResearchStatus", n = {}, s = {})
    public static final class d extends ContinuationImpl {
        public Object a;
        public /* synthetic */ Object b;
        public int d;

        public d(Continuation<? super d> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.b = obj;
            this.d |= Integer.MIN_VALUE;
            return BloodPressureHelper.this.getUserBPResearchStatus(this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<String> {
        public final /* synthetic */ boolean a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(boolean z) {
            super(0);
            this.a = z;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "saveBPResearch " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function0<String> {
        public final /* synthetic */ Throwable a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Throwable th) {
            super(0);
            this.a = th;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            this.a.printStackTrace();
            return "on error " + Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g extends Lambda implements Function0<String> {
        public final /* synthetic */ boolean a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(boolean z) {
            super(0);
            this.a = z;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "getBPResearch " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class h extends Lambda implements Function0<String> {
        public final /* synthetic */ Throwable a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(Throwable th) {
            super(0);
            this.a = th;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "post night error " + this.a;
        }
    }

    private BloodPressureHelper() {
    }

    private final boolean a() {
        ISharedPref iSharedPref = (ISharedPref) KoinExKt.bloodPressureScope().getOrNull(Reflection.getOrCreateKotlinClass(ISharedPref.class), null, null);
        if (iSharedPref == null) {
            return false;
        }
        return iSharedPref.getBoolean(KEY_BP_RESEARCH_STATE, false);
    }

    private final void b(boolean state) {
        ISharedPref iSharedPref = (ISharedPref) KoinExKt.bloodPressureScope().getOrNull(Reflection.getOrCreateKotlinClass(ISharedPref.class), null, null);
        if (iSharedPref == null) {
            return;
        }
        iSharedPref.saveBoolean(KEY_BP_RESEARCH_STATE, state);
    }

    private final BloodPressureDbVo c(BloodPressureMeasureResult bloodPressureMeasureResult, String str, int i, String str2) {
        long j = 1000;
        return new BloodPressureDbVo(bloodPressureMeasureResult.getTimestamp() * j, bloodPressureMeasureResult.getSystolic(), bloodPressureMeasureResult.getDiastolic(), Integer.valueOf(bloodPressureMeasureResult.getHr()), Integer.valueOf(bloodPressureMeasureResult.getTimeZone() * 900), str, "blood_pressure", str2, false, TimeFormatEx.INSTANCE.formatTimeYMD(bloodPressureMeasureResult.getTimestamp() * j), i, null, null, 6144, null);
    }

    public static /* synthetic */ BloodPressureDbVo d(BloodPressureHelper bloodPressureHelper, BloodPressureMeasureResult bloodPressureMeasureResult, String str, int i, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = UserEx.getUserId();
        }
        return bloodPressureHelper.c(bloodPressureMeasureResult, str, i, str2);
    }

    public final void cleanBloodPressureData() {
        IBloodPressureRepo iBloodPressureRepo = (IBloodPressureRepo) KoinExKt.bloodPressureScope().getOrNull(Reflection.getOrCreateKotlinClass(IBloodPressureRepo.class), null, null);
        if (iBloodPressureRepo != null) {
            iBloodPressureRepo.cleanData();
        }
        b(false);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x005b  */
    /* JADX WARN: Code duplicated, block: B:39:0x008a  */
    /* JADX WARN: Code duplicated, block: B:42:0x009e  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object getBPRawDataEnable(@NotNull Continuation<? super Boolean> continuation) {
        a aVar;
        Object objM3845constructorimpl;
        Throwable thM3848exceptionOrNullimpl;
        Boolean boolBoxBoolean;
        BloodPressureAttachData attachData;
        Boolean uploadSwitch;
        boolean zBooleanValue;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i = aVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                aVar.c = i - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        } else {
            aVar = new a(continuation);
        }
        Object research = aVar.a;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i2 = aVar.c;
        BloodPressureResearchVo bloodPressureResearchVo = null;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(research);
                IResearchApi iResearchApi = (IResearchApi) KoinExKt.bloodPressureScope().getOrNull(Reflection.getOrCreateKotlinClass(IResearchApi.class), null, null);
                Result.Companion companion = Result.Companion;
                if (iResearchApi != null) {
                    aVar.c = 1;
                    research = iResearchApi.getResearch("2", aVar);
                    if (research == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                if (bloodPressureResearchVo != null || (attachData = bloodPressureResearchVo.getAttachData()) == null || (uploadSwitch = attachData.getUploadSwitch()) == null) {
                    zBooleanValue = false;
                } else {
                    zBooleanValue = uploadSwitch.booleanValue();
                }
                objM3845constructorimpl = Result.m3845constructorimpl(Boxing.boxBoolean(zBooleanValue));
                thM3848exceptionOrNullimpl = Result.m3848exceptionOrNullimpl(objM3845constructorimpl);
                if (thM3848exceptionOrNullimpl != null) {
                    HMLog.info(TAG, new b(thM3848exceptionOrNullimpl));
                }
                boolBoxBoolean = Boxing.boxBoolean(false);
                if (Result.m3850isFailureimpl(objM3845constructorimpl)) {
                    objM3845constructorimpl = boolBoxBoolean;
                }
                HMLog.info(TAG, new c(((Boolean) objM3845constructorimpl).booleanValue()));
                return objM3845constructorimpl;
            }
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(research);
            bloodPressureResearchVo = (BloodPressureResearchVo) research;
            if (bloodPressureResearchVo != null) {
                zBooleanValue = false;
            } else {
                zBooleanValue = uploadSwitch.booleanValue();
            }
            objM3845constructorimpl = Result.m3845constructorimpl(Boxing.boxBoolean(zBooleanValue));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
        }
        thM3848exceptionOrNullimpl = Result.m3848exceptionOrNullimpl(objM3845constructorimpl);
        if (thM3848exceptionOrNullimpl != null) {
            HMLog.info(TAG, new b(thM3848exceptionOrNullimpl));
        }
        boolBoxBoolean = Boxing.boxBoolean(false);
        if (Result.m3850isFailureimpl(objM3845constructorimpl)) {
            objM3845constructorimpl = boolBoxBoolean;
        }
        HMLog.info(TAG, new c(((Boolean) objM3845constructorimpl).booleanValue()));
        return objM3845constructorimpl;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0065  */
    /* JADX WARN: Code duplicated, block: B:29:0x0066 A[Catch: all -> 0x002e, TryCatch #1 {all -> 0x002e, blocks: (B:12:0x002a, B:26:0x0061, B:34:0x0070, B:38:0x0081, B:42:0x008d, B:29:0x0066), top: B:57:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:32:0x006d  */
    /* JADX WARN: Code duplicated, block: B:33:0x006f  */
    /* JADX WARN: Code duplicated, block: B:36:0x007e  */
    /* JADX WARN: Code duplicated, block: B:37:0x0080  */
    /* JADX WARN: Code duplicated, block: B:40:0x008b  */
    /* JADX WARN: Code duplicated, block: B:41:0x008c  */
    /* JADX WARN: Code duplicated, block: B:50:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:53:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:59:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object getUserBPResearchStatus(@NotNull Continuation<? super Boolean> continuation) {
        d dVar;
        BloodPressureHelper bloodPressureHelper;
        BloodPressureResearchVo bloodPressureResearchVo;
        Object objM3845constructorimpl;
        Throwable thM3848exceptionOrNullimpl;
        Boolean boolBoxBoolean;
        boolean z;
        boolean zBooleanValue;
        boolean z2;
        if (continuation instanceof d) {
            dVar = (d) continuation;
            int i = dVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                dVar.d = i - Integer.MIN_VALUE;
            } else {
                dVar = new d(continuation);
            }
        } else {
            dVar = new d(continuation);
        }
        Object research = dVar.b;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i2 = dVar.d;
        Long joinTime = null;
        boolean z3 = true;
        if (i2 == 0) {
            ResultKt.throwOnFailure(research);
            IResearchApi iResearchApi = (IResearchApi) KoinExKt.bloodPressureScope().getOrNull(Reflection.getOrCreateKotlinClass(IResearchApi.class), null, null);
            try {
                Result.Companion companion = Result.Companion;
                if (iResearchApi == null) {
                    bloodPressureHelper = this;
                    bloodPressureResearchVo = null;
                } else {
                    dVar.a = this;
                    dVar.d = 1;
                    research = iResearchApi.getResearch("2", dVar);
                    if (research == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    bloodPressureHelper = this;
                }
                if (bloodPressureResearchVo == null) {
                    joinTime = bloodPressureResearchVo.getJoinTime();
                }
                if (joinTime != null) {
                    z = true;
                } else {
                    z = false;
                }
                Boolean boolBoxBoolean2 = Boxing.boxBoolean(z);
                zBooleanValue = boolBoxBoolean2.booleanValue();
                String str = TAG;
                if (zBooleanValue) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                HMLog.info(str, new e(z2));
                BloodPressureHelper bloodPressureHelper2 = INSTANCE;
                if (zBooleanValue) {
                    z3 = false;
                }
                bloodPressureHelper2.b(z3);
                objM3845constructorimpl = Result.m3845constructorimpl(Boxing.boxBoolean(boolBoxBoolean2.booleanValue()));
            } catch (Throwable th) {
                th = th;
                bloodPressureHelper = this;
                Result.Companion companion2 = Result.Companion;
                objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
            }
            thM3848exceptionOrNullimpl = Result.m3848exceptionOrNullimpl(objM3845constructorimpl);
            if (thM3848exceptionOrNullimpl != null) {
                HMLog.info(TAG, new f(thM3848exceptionOrNullimpl));
            }
            boolBoxBoolean = Boxing.boxBoolean(bloodPressureHelper.a());
            HMLog.info(TAG, new g(boolBoxBoolean.booleanValue()));
            if (Result.m3850isFailureimpl(objM3845constructorimpl)) {
                return boolBoxBoolean;
            }
            return objM3845constructorimpl;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        bloodPressureHelper = (BloodPressureHelper) dVar.a;
        try {
            ResultKt.throwOnFailure(research);
        } catch (Throwable th2) {
            th = th2;
            Result.Companion companion3 = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
        }
        bloodPressureResearchVo = (BloodPressureResearchVo) research;
        if (bloodPressureResearchVo == null) {
            joinTime = bloodPressureResearchVo.getJoinTime();
        }
        if (joinTime != null) {
            z = true;
        } else {
            z = false;
        }
        Boolean boolBoxBoolean3 = Boxing.boxBoolean(z);
        zBooleanValue = boolBoxBoolean3.booleanValue();
        String str2 = TAG;
        if (zBooleanValue) {
            z2 = true;
        } else {
            z2 = false;
        }
        HMLog.info(str2, new e(z2));
        BloodPressureHelper bloodPressureHelper3 = INSTANCE;
        if (zBooleanValue) {
            z3 = false;
        }
        bloodPressureHelper3.b(z3);
        objM3845constructorimpl = Result.m3845constructorimpl(Boxing.boxBoolean(boolBoxBoolean3.booleanValue()));
        thM3848exceptionOrNullimpl = Result.m3848exceptionOrNullimpl(objM3845constructorimpl);
        if (thM3848exceptionOrNullimpl != null) {
            HMLog.info(TAG, new f(thM3848exceptionOrNullimpl));
        }
        boolBoxBoolean = Boxing.boxBoolean(bloodPressureHelper.a());
        HMLog.info(TAG, new g(boolBoxBoolean.booleanValue()));
        if (Result.m3850isFailureimpl(objM3845constructorimpl)) {
            return boolBoxBoolean;
        }
        return objM3845constructorimpl;
    }

    public final void saveBloodPressureAndPost(@NotNull List<BloodPressureMeasureResult> data) {
        if (data.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList(data.size());
        for (BloodPressureMeasureResult bloodPressureMeasureResult : data) {
            long j = 1000;
            arrayList.add(new BloodPressureDbVo(bloodPressureMeasureResult.getTimestamp() * j, bloodPressureMeasureResult.getSystolic(), bloodPressureMeasureResult.getDiastolic(), Integer.valueOf(bloodPressureMeasureResult.getHr()), Integer.valueOf(bloodPressureMeasureResult.getTimeZone() * 900), UserEx.getUserId(), "blood_pressure", "real_data", false, TimeFormatEx.INSTANCE.formatTimeYMD(bloodPressureMeasureResult.getTimestamp() * j), 1, null, null, 6144, null));
        }
        IBloodPressureRepo iBloodPressureRepo = (IBloodPressureRepo) KoinExKt.bloodPressureScope().getOrNull(Reflection.getOrCreateKotlinClass(IBloodPressureRepo.class), null, null);
        if (iBloodPressureRepo == null) {
            return;
        }
        iBloodPressureRepo.saveAndPostData(arrayList);
    }

    public final void saveNightBloodPressureAndPost(@NotNull List<BloodPressureMeasureResult> data) {
        Object objM3845constructorimpl;
        if (data.isEmpty()) {
            return;
        }
        try {
            Result.Companion companion = Result.Companion;
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(data, 10));
            Iterator<T> it2 = data.iterator();
            while (it2.hasNext()) {
                arrayList.add(d(INSTANCE, (BloodPressureMeasureResult) it2.next(), null, 3, BloodPressureConst.ParamValue.ALL_DAY, 1, null));
            }
            Unit unit = null;
            IBloodPressureRepo iBloodPressureRepo = (IBloodPressureRepo) KoinExKt.bloodPressureScope().getOrNull(Reflection.getOrCreateKotlinClass(IBloodPressureRepo.class), null, null);
            if (iBloodPressureRepo != null) {
                iBloodPressureRepo.saveAndPostNightData(arrayList);
                unit = Unit.INSTANCE;
            }
            objM3845constructorimpl = Result.m3845constructorimpl(unit);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM3848exceptionOrNullimpl = Result.m3848exceptionOrNullimpl(objM3845constructorimpl);
        if (thM3848exceptionOrNullimpl == null) {
            return;
        }
        HMLog.info(TAG, new h(thM3848exceptionOrNullimpl));
    }

    public final void syncBloodPressureData() {
        IBloodPressureRepo iBloodPressureRepo = (IBloodPressureRepo) KoinExKt.bloodPressureScope().getOrNull(Reflection.getOrCreateKotlinClass(IBloodPressureRepo.class), null, null);
        if (iBloodPressureRepo == null) {
            return;
        }
        iBloodPressureRepo.getUserData();
    }
}
