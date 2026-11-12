package com.xiaomi.hm.health.bodyfat.slimming.repo;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.feature.config.FeatureSwitch;
import com.huami.tools.log.HMLog;
import com.huami.userproperty.UserPropertyManager;
import com.huami.userproperty.service.entity.remote.FetchResult;
import com.xiaomi.hm.health.bodyfat.manager.WeightInfoManager;
import com.xiaomi.hm.health.bodyfat.property.BodyfatProperty;
import com.xiaomi.hm.health.bodyfat.slimming.constants.LoseWeightPropertyKey;
import com.xiaomi.hm.health.bodyfat.utils.BFCallback;
import com.xiaomi.hm.health.bodyfat.utils.Utils;
import com.xiaomi.hm.health.databases.model.WeightInfos;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.SafeContinuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import org.koin.core.context.GlobalContext;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0002J\u0010\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0002J\u0010\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0002J\n\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016J\u0018\u0010\u0013\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J\u0018\u0010\u0014\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J\u0015\u0010\u0015\u001a\u0004\u0018\u00010\tH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0017\u001a\u0004\u0018\u00010\fH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0016\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001b"}, d2 = {"Lcom/xiaomi/hm/health/bodyfat/slimming/repo/LoseWeightRepoImpl;", "Lcom/xiaomi/hm/health/bodyfat/slimming/repo/LoseWeightRepo;", "", "propertyKey", "c", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "propertyValue", "", GoogleApiAvailabilityLight.a, "Lcom/xiaomi/hm/health/bodyfat/slimming/repo/LoseWeightPlan;", "loseWeightPlan", "a", "Lcom/xiaomi/hm/health/bodyfat/slimming/repo/LoseWeightWeightInfo;", "loseWeightWeightInfo", "b", "Lcom/xiaomi/hm/health/databases/model/WeightInfos;", "searchCurrentUserWeightInfos", "Lcom/xiaomi/hm/health/bodyfat/slimming/repo/PostResponseCallback;", "postResponseCallback", "saveLoseWeightPlan", "saveLoseWeightWeightInfo", "getLoseWeightPlanObject", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getLoseWeightWeightInfoObject", "<init>", "()V", "Companion", "bodyfat_midongRelease"}, k = 1, mv = {1, 5, 1})
public final class LoseWeightRepoImpl implements LoseWeightRepo {
    private static final long a = 0;

    @NotNull
    public static final String tag = "LoseWeightRepo";

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.bodyfat.slimming.repo.LoseWeightRepoImpl", f = "LoseWeightRepo.kt", i = {}, l = {108}, m = "getLoseWeightPlanObject", n = {}, s = {})
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
            return LoseWeightRepoImpl.this.getLoseWeightPlanObject(this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public static final b a = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "Get slimming lose weight plan is null!";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public static final c a = new c();

        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "Get lose weight plan success";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str) {
            super(0);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return Intrinsics.stringPlus("parse lose weight plan error json string is >> ", this.a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.bodyfat.slimming.repo.LoseWeightRepoImpl", f = "LoseWeightRepo.kt", i = {}, l = {134}, m = "getLoseWeightWeightInfoObject", n = {}, s = {})
    public static final class e extends ContinuationImpl {
        public /* synthetic */ Object a;
        public int c;

        public e(Continuation<? super e> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.a = obj;
            this.c |= Integer.MIN_VALUE;
            return LoseWeightRepoImpl.this.getLoseWeightWeightInfoObject(this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function0<String> {
        public static final f a = new f();

        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "Get slimming lose weight info is null!";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g extends Lambda implements Function0<String> {
        public static final g a = new g();

        public g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "Get lose weight info success";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class h extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(String str) {
            super(0);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return Intrinsics.stringPlus("parse lose weight weight info  error json string is >> ", this.a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class i extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;
        public final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(String str, String str2) {
            super(0);
            this.a = str;
            this.b = str2;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "Read local property: " + this.a + ", value: " + ((Object) this.b);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\n"}, d2 = {"Lcom/huami/userproperty/service/entity/remote/FetchResult;", "", "fetchResult", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class j extends Lambda implements Function1<FetchResult<String>, Unit> {
        public final /* synthetic */ Continuation<String> a;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<String> {
            public final /* synthetic */ String a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(String str) {
                super(0);
                this.a = str;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final String getA() {
                return Intrinsics.stringPlus("Load property from server. Property value:", this.a);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class b extends Lambda implements Function0<String> {
            public final /* synthetic */ Exception a;
            public final /* synthetic */ FetchResult<String> b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(Exception exc, FetchResult<String> fetchResult) {
                super(0);
                this.a = exc;
                this.b = fetchResult;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final String getA() {
                return "Load property from server exception:" + this.a + ", Property value:" + this.b;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public j(Continuation<? super String> continuation) {
            super(1);
            this.a = continuation;
        }

        public final void a(@NotNull FetchResult<String> fetchResult) {
            if (!(fetchResult instanceof FetchResult.Success)) {
                if (fetchResult instanceof FetchResult.Failed) {
                    Continuation<String> continuation = this.a;
                    Result.Companion companion = Result.Companion;
                    continuation.resumeWith(Result.m3845constructorimpl(null));
                    return;
                }
                return;
            }
            try {
                String str = (String) ((FetchResult.Success) fetchResult).getValue();
                HMLog.info(LoseWeightRepoImpl.tag, new a(str));
                if (str == null) {
                    Continuation<String> continuation2 = this.a;
                    Result.Companion companion2 = Result.Companion;
                    continuation2.resumeWith(Result.m3845constructorimpl(null));
                } else {
                    if (str.length() == 0) {
                        Continuation<String> continuation3 = this.a;
                        Result.Companion companion3 = Result.Companion;
                        continuation3.resumeWith(Result.m3845constructorimpl(null));
                    } else {
                        Continuation<String> continuation4 = this.a;
                        Result.Companion companion4 = Result.Companion;
                        continuation4.resumeWith(Result.m3845constructorimpl(str));
                    }
                }
            } catch (Exception e) {
                HMLog.error$default(LoseWeightRepoImpl.tag, null, null, new b(e, fetchResult), 6, null);
                Continuation<String> continuation5 = this.a;
                Result.Companion companion5 = Result.Companion;
                continuation5.resumeWith(Result.m3845constructorimpl(null));
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(FetchResult<String> fetchResult) {
            a(fetchResult);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class k extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;
        public final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(String str, String str2) {
            super(0);
            this.a = str;
            this.b = str2;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "Save property: " + this.a + ", value: " + this.b;
        }
    }

    private final String a(LoseWeightPlan loseWeightPlan) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("duration", loseWeightPlan.getDuration());
        jSONObject.put(LoseWeightPropertyKey.LOSE_WEIGHT, loseWeightPlan.getLoseWeight());
        jSONObject.put(LoseWeightPropertyKey.EXERCISE_NAME, loseWeightPlan.getExerciseName());
        jSONObject.put("type", loseWeightPlan.getType());
        jSONObject.put(LoseWeightPropertyKey.EXERCISE_MINUTES, loseWeightPlan.getExerciseMinutes());
        return jSONObject.toString();
    }

    private final String b(LoseWeightWeightInfo loseWeightWeightInfo) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("weight", Float.valueOf(loseWeightWeightInfo.getWeight()));
        jSONObject.put("height", Float.valueOf(loseWeightWeightInfo.getHeight()));
        jSONObject.put("encryptImpedance", loseWeightWeightInfo.getEncryptImpedance());
        jSONObject.put("age", loseWeightWeightInfo.getAge());
        jSONObject.put("gender", loseWeightWeightInfo.getGender());
        jSONObject.put(LoseWeightPropertyKey.IDENTITY, loseWeightWeightInfo.getIdentity());
        jSONObject.put(LoseWeightPropertyKey.LOSE_WEIGHT, loseWeightWeightInfo.getLoseWeight());
        return jSONObject.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:10:0x0032  */
    /* JADX WARN: Code duplicated, block: B:12:0x0052  */
    /* JADX WARN: Code duplicated, block: B:13:0x005f  */
    public final Object c(String str, Continuation<? super String> continuation) {
        SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation));
        UserPropertyManager userPropertyManager = UserPropertyManager.INSTANCE;
        String local$default = UserPropertyManager.readLocal$default(userPropertyManager, str, null, 2, null);
        HMLog.info(tag, new i(str, local$default));
        if (local$default != null) {
            if (local$default.length() > 0) {
                Result.Companion companion = Result.Companion;
                safeContinuation.resumeWith(Result.m3845constructorimpl(local$default));
            } else if (((FeatureSwitch) GlobalContext.INSTANCE.get().getScopeRegistry().getRootScope().get(Reflection.getOrCreateKotlinClass(FeatureSwitch.class), null, null)).isSyncDataEnable()) {
                UserPropertyManager.singleFetch$default(userPropertyManager, str, null, 2, null).get(new j(safeContinuation));
            } else {
                Result.Companion companion2 = Result.Companion;
                safeContinuation.resumeWith(Result.m3845constructorimpl(null));
            }
        } else if (((FeatureSwitch) GlobalContext.INSTANCE.get().getScopeRegistry().getRootScope().get(Reflection.getOrCreateKotlinClass(FeatureSwitch.class), null, null)).isSyncDataEnable()) {
            UserPropertyManager.singleFetch$default(userPropertyManager, str, null, 2, null).get(new j(safeContinuation));
        } else {
            Result.Companion companion3 = Result.Companion;
            safeContinuation.resumeWith(Result.m3845constructorimpl(null));
        }
        Object orThrow = safeContinuation.getOrThrow();
        if (orThrow == kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return orThrow;
    }

    private final void d(String propertyKey, String propertyValue) {
        UserPropertyManager.INSTANCE.saveLocal(propertyKey, null, propertyValue);
        HMLog.info(tag, new k(propertyKey, propertyValue));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // com.xiaomi.hm.health.bodyfat.slimming.repo.LoseWeightRepo
    @Nullable
    public Object getLoseWeightPlanObject(@NotNull Continuation<? super LoseWeightPlan> continuation) {
        a aVar;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i2 = aVar.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                aVar.c = i2 - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        } else {
            aVar = new a(continuation);
        }
        Object objC = aVar.a;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i3 = aVar.c;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objC);
            aVar.c = 1;
            objC = c(BodyfatProperty.PROPERTY_LOSE_WEIGHT_SETTING, aVar);
            if (objC == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objC);
        }
        String str = (String) objC;
        if (str != null) {
            if (!(str.length() == 0)) {
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    String string = jSONObject.getString("duration");
                    int i4 = jSONObject.getInt(LoseWeightPropertyKey.LOSE_WEIGHT);
                    String string2 = jSONObject.getString(LoseWeightPropertyKey.EXERCISE_NAME);
                    int i5 = jSONObject.getInt("type");
                    int i6 = jSONObject.getInt(LoseWeightPropertyKey.EXERCISE_MINUTES);
                    HMLog.info(tag, c.a);
                    return new LoseWeightPlan(string, i4, string2, i5, i6);
                } catch (Exception unused) {
                    HMLog.error$default(tag, null, null, new d(str), 6, null);
                    return null;
                }
            }
        }
        HMLog.error$default(tag, null, null, b.a, 6, null);
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // com.xiaomi.hm.health.bodyfat.slimming.repo.LoseWeightRepo
    @Nullable
    public Object getLoseWeightWeightInfoObject(@NotNull Continuation<? super LoseWeightWeightInfo> continuation) {
        e eVar;
        if (continuation instanceof e) {
            eVar = (e) continuation;
            int i2 = eVar.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                eVar.c = i2 - Integer.MIN_VALUE;
            } else {
                eVar = new e(continuation);
            }
        } else {
            eVar = new e(continuation);
        }
        Object objC = eVar.a;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i3 = eVar.c;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objC);
            eVar.c = 1;
            objC = c(BodyfatProperty.PROPERTY_LOSE_WEIGHT_SETTING_ALGORITHM, eVar);
            if (objC == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objC);
        }
        String str = (String) objC;
        if (str != null) {
            if (!(str.length() == 0)) {
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    float f2 = (float) jSONObject.getDouble("weight");
                    float f3 = (float) jSONObject.getDouble("height");
                    int i4 = jSONObject.getInt("encryptImpedance");
                    int i5 = jSONObject.getInt("age");
                    int i6 = jSONObject.getInt("gender");
                    int i7 = jSONObject.getInt(LoseWeightPropertyKey.IDENTITY);
                    int i8 = jSONObject.getInt(LoseWeightPropertyKey.LOSE_WEIGHT);
                    HMLog.info(tag, g.a);
                    return new LoseWeightWeightInfo(f2, f3, i4, i5, i6, i7, i8);
                } catch (Exception unused) {
                    HMLog.error$default(tag, null, null, new h(str), 6, null);
                    return null;
                }
            }
        }
        HMLog.error$default(tag, null, null, f.a, 6, null);
        return null;
    }

    @Override // com.xiaomi.hm.health.bodyfat.slimming.repo.LoseWeightRepo
    public void saveLoseWeightPlan(@NotNull LoseWeightPlan loseWeightPlan, @NotNull PostResponseCallback postResponseCallback) {
        d(BodyfatProperty.PROPERTY_LOSE_WEIGHT_SETTING, a(loseWeightPlan));
        postResponseCallback.onPostSuccess();
    }

    @Override // com.xiaomi.hm.health.bodyfat.slimming.repo.LoseWeightRepo
    public void saveLoseWeightWeightInfo(@NotNull LoseWeightWeightInfo loseWeightWeightInfo, @NotNull PostResponseCallback postResponseCallback) {
        d(BodyfatProperty.PROPERTY_LOSE_WEIGHT_SETTING_ALGORITHM, b(loseWeightWeightInfo));
        postResponseCallback.onPostSuccess();
    }

    @Override // com.xiaomi.hm.health.bodyfat.slimming.repo.LoseWeightRepo
    @Nullable
    public WeightInfos searchCurrentUserWeightInfos() {
        return WeightInfoManager.getManager().getLatestInfo(Utils.INSTANCE.toLongValue(BFCallback.getHMPersonInfo().getUserid(), 0L));
    }
}
