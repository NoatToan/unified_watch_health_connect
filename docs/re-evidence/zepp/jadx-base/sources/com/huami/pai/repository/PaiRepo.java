package com.huami.pai.repository;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.pai.dc.PaiWebConst;
import com.huami.pai.dc.remote.userevent.IPaiEventApi;
import com.huami.pai.dto.HttpUserInfo;
import com.huami.pai.dto.IHttpUserInfoManager;
import com.huami.pai.vo.PaiEventVo;
import com.huami.tools.log.HMLog;
import com.huami.watch.companion.ecg.media.MediaRecorderHelper;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\r\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0011\u001a\u00020\f\u0012\u0006\u0010\u0017\u001a\u00020\u0012¢\u0006\u0004\b#\u0010$J%\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bR\u0019\u0010\u0011\u001a\u00020\f8\u0006@\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0017\u001a\u00020\u00128\u0006@\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\"\u0010\u001f\u001a\u00020\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001c\u0010\"\u001a\u00020\u00188\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\b \u0010\u001a\u001a\u0004\b!\u0010\u001c\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006%"}, d2 = {"Lcom/huami/pai/repository/PaiRepo;", "", "", "from", "to", "Lcom/huami/pai/vo/PaiEventVo;", "getData", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "jsonStr", "", "postData", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/huami/pai/dc/remote/userevent/IPaiEventApi;", "a", "Lcom/huami/pai/dc/remote/userevent/IPaiEventApi;", "getPaiEventApi", "()Lcom/huami/pai/dc/remote/userevent/IPaiEventApi;", "paiEventApi", "Lcom/huami/pai/dto/IHttpUserInfoManager;", "b", "Lcom/huami/pai/dto/IHttpUserInfoManager;", "getHttpUserManager", "()Lcom/huami/pai/dto/IHttpUserInfoManager;", "httpUserManager", "", "c", "J", "getLastToTime", "()J", "setLastToTime", "(J)V", "lastToTime", GoogleApiAvailabilityLight.a, "getTIME_INTERVAL", "TIME_INTERVAL", "<init>", "(Lcom/huami/pai/dc/remote/userevent/IPaiEventApi;Lcom/huami/pai/dto/IHttpUserInfoManager;)V", "lib_release"}, k = 1, mv = {1, 5, 1})
public final class PaiRepo {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final IPaiEventApi paiEventApi;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final IHttpUserInfoManager httpUserManager;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private long lastToTime;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final long TIME_INTERVAL = MediaRecorderHelper.MAX_RECORD_TIME;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.pai.repository.PaiRepo", f = "PaiRepo.kt", i = {}, l = {41}, m = "getData", n = {}, s = {})
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
            return PaiRepo.this.getData(null, null, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ long b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(long j) {
            super(0);
            this.b = j;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "paiStr re in TimeInterval lastToTime " + PaiRepo.this.getLastToTime() + " currentTo " + this.b;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public final /* synthetic */ Exception a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Exception exc) {
            super(0);
            this.a = exc;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "getData " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.pai.repository.PaiRepo", f = "PaiRepo.kt", i = {}, l = {55}, m = "postData", n = {}, s = {})
    public static final class d extends ContinuationImpl {
        public /* synthetic */ Object a;
        public int c;

        public d(Continuation<? super d> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.a = obj;
            this.c |= Integer.MIN_VALUE;
            return PaiRepo.this.postData(null, this);
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
            return "postData " + this.a;
        }
    }

    public PaiRepo(@NotNull IPaiEventApi iPaiEventApi, @NotNull IHttpUserInfoManager iHttpUserInfoManager) {
        this.paiEventApi = iPaiEventApi;
        this.httpUserManager = iHttpUserInfoManager;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Nullable
    public final Object getData(@NotNull String str, @NotNull String str2, @NotNull Continuation<? super PaiEventVo> continuation) {
        a aVar;
        PaiRepo paiRepo;
        String userId;
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
        a aVar2 = aVar;
        Object allData$default = aVar2.b;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i2 = aVar2.d;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            paiRepo = (PaiRepo) aVar2.a;
            try {
                ResultKt.throwOnFailure(allData$default);
            } catch (Exception e2) {
                e = e2;
                paiRepo.setLastToTime(0L);
                HMLog.info(PaiWebConst.Tag.HTTP_TAG, new c(e));
                return null;
            }
        }
        ResultKt.throwOnFailure(allData$default);
        try {
            long j = Long.parseLong(str2);
            long jLongValue = Boxing.boxLong(j).longValue();
            if (jLongValue - getLastToTime() < getTIME_INTERVAL()) {
                HMLog.info(PaiWebConst.Tag.HTTP_TAG, new b(jLongValue));
                return null;
            }
            setLastToTime(j);
            IPaiEventApi paiEventApi = getPaiEventApi();
            HttpUserInfo userInfo = getHttpUserManager().getUserInfo();
            String str3 = "";
            if (userInfo != null && (userId = userInfo.getUserId()) != null) {
                str3 = userId;
            }
            aVar2.a = this;
            aVar2.d = 1;
            allData$default = IPaiEventApi.DefaultImpls.getAllData$default(paiEventApi, str3, str, str2, null, null, null, aVar2, 56, null);
            return allData$default == coroutine_suspended ? coroutine_suspended : allData$default;
        } catch (Exception e3) {
            e = e3;
            paiRepo = this;
            paiRepo.setLastToTime(0L);
            HMLog.info(PaiWebConst.Tag.HTTP_TAG, new c(e));
            return null;
        }
    }

    @NotNull
    public final IHttpUserInfoManager getHttpUserManager() {
        return this.httpUserManager;
    }

    public final long getLastToTime() {
        return this.lastToTime;
    }

    @NotNull
    public final IPaiEventApi getPaiEventApi() {
        return this.paiEventApi;
    }

    public final long getTIME_INTERVAL() {
        return this.TIME_INTERVAL;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object postData(@NotNull String str, @NotNull Continuation<? super Boolean> continuation) {
        d dVar;
        String userId;
        if (continuation instanceof d) {
            dVar = (d) continuation;
            int i = dVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                dVar.c = i - Integer.MIN_VALUE;
            } else {
                dVar = new d(continuation);
            }
        } else {
            dVar = new d(continuation);
        }
        Object objPostDatas = dVar.a;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i2 = dVar.c;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(objPostDatas);
                IPaiEventApi paiEventApi = getPaiEventApi();
                HttpUserInfo userInfo = getHttpUserManager().getUserInfo();
                String str2 = "";
                if (userInfo != null && (userId = userInfo.getUserId()) != null) {
                    str2 = userId;
                }
                dVar.c = 1;
                objPostDatas = paiEventApi.postDatas(str2, str, dVar);
                if (objPostDatas == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objPostDatas);
            }
            return objPostDatas;
        } catch (Exception e2) {
            HMLog.info(PaiWebConst.Tag.HTTP_TAG, new e(e2));
            return Boxing.boxBoolean(false);
        }
    }

    public final void setLastToTime(long j) {
        this.lastToTime = j;
    }
}
