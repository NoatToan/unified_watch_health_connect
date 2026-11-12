package com.huami.bloodpressure_core.dc.remote.night;

import com.huami.bloodpressure_core.dc.local.BloodPressureDbVo;
import com.huami.bloodpressure_core.dc.remote.base.IBloodPressureNight;
import com.huami.bloodpressure_core.ext.SerializationKtxKt;
import com.huami.bloodpressure_core.p002const.BloodPressureConst;
import com.huami.network.hmnetwork.server.HMServerDef;
import com.huami.tools.log.HMLog;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.json.Json;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000b\u0018\u00002\u001c\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00020\u00012\u00020\u0005B#\u0012\u001a\u0010\u0013\u001a\u0016\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00060\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J/\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\t\"\u00020\u0006H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ5\u0010\u000f\u001a\u00020\u000e2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u00022\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\t\"\u00020\u0006H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0011\u001a\u00020\u000e2\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\t\"\u00020\u0006H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\fR*\u0010\u0013\u001a\u0016\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00060\u00018\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0012R\u0016\u0010\u0016\u001a\u00020\u00068\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0019"}, d2 = {"Lcom/huami/bloodpressure_core/dc/remote/night/BloodPressureApiNightDelegate;", "Lcom/huami/bloodpressure_core/dc/remote/base/IBloodPressureNight;", "", "Lcom/huami/bloodpressure_core/dc/remote/night/BloodPressureNightVo;", "Lcom/huami/bloodpressure_core/dc/local/BloodPressureDbVo;", "Lorg/koin/core/component/KoinComponent;", "", "url", "a", "", "params", "getData", "([Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "data", "", "postData", "(Ljava/util/List;[Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "delData", "Lcom/huami/bloodpressure_core/dc/remote/base/IBloodPressureNight;", "eventApi", "b", "Ljava/lang/String;", "TAG", "<init>", "(Lcom/huami/bloodpressure_core/dc/remote/base/IBloodPressureNight;)V", "bloodpressure-core_release"}, k = 1, mv = {1, 5, 1})
public final class BloodPressureApiNightDelegate implements IBloodPressureNight<List<? extends BloodPressureNightVo>, List<? extends BloodPressureDbVo>>, KoinComponent {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final IBloodPressureNight<List<BloodPressureNightVo>, String> eventApi;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final String TAG = "BloodPressureApiNightDelegate";

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bloodpressure_core.dc.remote.night.BloodPressureApiNightDelegate", f = "BloodPressureApiNightDelegate.kt", i = {0}, l = {89}, m = "delData", n = {"this"}, s = {"L$0"})
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
            return BloodPressureApiNightDelegate.this.delData(null, this);
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
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return " delData " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bloodpressure_core.dc.remote.night.BloodPressureApiNightDelegate", f = "BloodPressureApiNightDelegate.kt", i = {}, l = {43}, m = "getData", n = {}, s = {})
    public static final class c extends ContinuationImpl {
        public /* synthetic */ Object a;
        public int c;

        public c(Continuation<? super c> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.a = obj;
            this.c |= Integer.MIN_VALUE;
            return BloodPressureApiNightDelegate.this.getData(null, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bloodpressure_core.dc.remote.night.BloodPressureApiNightDelegate", f = "BloodPressureApiNightDelegate.kt", i = {}, l = {70}, m = "postData", n = {}, s = {})
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
            return BloodPressureApiNightDelegate.this.postData((List<BloodPressureDbVo>) null, (String[]) null, (Continuation<? super Boolean>) this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<String> {
        public final /* synthetic */ Throwable a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Throwable th) {
            super(0);
            this.a = th;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return " postData " + this.a;
        }
    }

    public BloodPressureApiNightDelegate(@NotNull IBloodPressureNight<List<BloodPressureNightVo>, String> iBloodPressureNight) {
        this.eventApi = iBloodPressureNight;
    }

    private final String a(String url) {
        return HMServerDef.getHost() + url;
    }

    @Override // com.huami.http.HttpKit
    @NotNull
    public HttpUrl baseUrl() {
        return IBloodPressureNight.DefaultImpls.baseUrl(this);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.huami.bloodpressure_core.dc.remote.base.IBloodPressureDel
    @Nullable
    public Object delData(@NotNull String[] strArr, @NotNull Continuation<? super Boolean> continuation) {
        a aVar;
        BloodPressureApiNightDelegate bloodPressureApiNightDelegate;
        Object objM3845constructorimpl;
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
        Object objDelData = aVar.b;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i2 = aVar.d;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objDelData);
            try {
                Result.Companion companion = Result.Companion;
                String strA = a(BloodPressureConst.Path.USER_EVENTS_NIGHT);
                String str = strArr[0];
                aVar.a = this;
                aVar.d = 1;
                objDelData = this.eventApi.delData(new String[]{strA, str, "1"}, aVar);
                if (objDelData == coroutine_suspended) {
                    return coroutine_suspended;
                }
                bloodPressureApiNightDelegate = this;
            } catch (Throwable th) {
                th = th;
                bloodPressureApiNightDelegate = this;
                Result.Companion companion2 = Result.Companion;
                objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bloodPressureApiNightDelegate = (BloodPressureApiNightDelegate) aVar.a;
            try {
                ResultKt.throwOnFailure(objDelData);
            } catch (Throwable th2) {
                th = th2;
                Result.Companion companion3 = Result.Companion;
                objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
            }
        }
        objM3845constructorimpl = Result.m3845constructorimpl(Boxing.boxBoolean(((Boolean) objDelData).booleanValue()));
        Throwable thM3848exceptionOrNullimpl = Result.m3848exceptionOrNullimpl(objM3845constructorimpl);
        if (thM3848exceptionOrNullimpl != null) {
            HMLog.info(bloodPressureApiNightDelegate.TAG, new b(thM3848exceptionOrNullimpl));
        }
        return Result.m3850isFailureimpl(objM3845constructorimpl) ? Boxing.boxBoolean(false) : objM3845constructorimpl;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.huami.bloodpressure_core.dc.remote.base.IBloodPressureGet
    @Nullable
    public Object getData(@NotNull String[] strArr, @NotNull Continuation<? super List<BloodPressureNightVo>> continuation) {
        c cVar;
        Object objM3845constructorimpl;
        ArrayList arrayList;
        if (continuation instanceof c) {
            cVar = (c) continuation;
            int i = cVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                cVar.c = i - Integer.MIN_VALUE;
            } else {
                cVar = new c(continuation);
            }
        } else {
            cVar = new c(continuation);
        }
        Object data = cVar.a;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i2 = cVar.c;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(data);
                Result.Companion companion = Result.Companion;
                String strA = a(BloodPressureConst.Path.USER_EVENTS_NIGHT);
                IBloodPressureNight<List<BloodPressureNightVo>, String> iBloodPressureNight = this.eventApi;
                String[] strArr2 = {strA, strArr[0], strArr[1]};
                cVar.c = 1;
                data = iBloodPressureNight.getData(strArr2, cVar);
                if (data == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(data);
            }
            List list = (List) data;
            if (list == null) {
                arrayList = null;
            } else {
                arrayList = new ArrayList();
                for (Object obj : list) {
                    if (Boxing.boxBoolean(((BloodPressureNightVo) obj).getType() == 1).booleanValue()) {
                        arrayList.add(obj);
                    }
                }
            }
            objM3845constructorimpl = Result.m3845constructorimpl(arrayList);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m3850isFailureimpl(objM3845constructorimpl)) {
            return null;
        }
        return objM3845constructorimpl;
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }

    @Override // com.huami.http.HttpKit
    @NotNull
    public OkHttpClient okHttpClient() {
        return IBloodPressureNight.DefaultImpls.okHttpClient(this);
    }

    @Override // com.huami.bloodpressure_core.dc.remote.base.IBloodPressurePost
    public /* bridge */ /* synthetic */ Object postData(Object obj, String[] strArr, Continuation continuation) {
        return postData((List<BloodPressureDbVo>) obj, strArr, (Continuation<? super Boolean>) continuation);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public Object postData(@NotNull List<BloodPressureDbVo> list, @NotNull String[] strArr, @NotNull Continuation<? super Boolean> continuation) {
        d dVar;
        BloodPressureApiNightDelegate bloodPressureApiNightDelegate;
        Object objM3845constructorimpl;
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
        Object objPostData = dVar.b;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i2 = dVar.d;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objPostData);
            if (list == null || list.isEmpty()) {
                return Boxing.boxBoolean(true);
            }
            try {
                Result.Companion companion = Result.Companion;
                String strA = a(BloodPressureConst.Path.USER_EVENTS_NIGHT);
                Json nonStrictInstance = SerializationKtxKt.getNonStrictInstance(Json.INSTANCE);
                KSerializer kSerializerListSerializer = BuiltinSerializersKt.ListSerializer(BloodPressureNightVo.INSTANCE.serializer());
                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
                Iterator<T> it2 = list.iterator();
                while (it2.hasNext()) {
                    arrayList.add(BloodPressureNightVoKt.toNightEntity((BloodPressureDbVo) it2.next()));
                }
                String strEncodeToString = nonStrictInstance.encodeToString(kSerializerListSerializer, arrayList);
                dVar.a = this;
                dVar.d = 1;
                objPostData = this.eventApi.postData(strEncodeToString, new String[]{strA}, dVar);
                if (objPostData == coroutine_suspended) {
                    return coroutine_suspended;
                }
                bloodPressureApiNightDelegate = this;
            } catch (Throwable th) {
                th = th;
                bloodPressureApiNightDelegate = this;
                Result.Companion companion2 = Result.Companion;
                objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bloodPressureApiNightDelegate = (BloodPressureApiNightDelegate) dVar.a;
            try {
                ResultKt.throwOnFailure(objPostData);
            } catch (Throwable th2) {
                th = th2;
                Result.Companion companion3 = Result.Companion;
                objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
            }
        }
        objM3845constructorimpl = Result.m3845constructorimpl(Boxing.boxBoolean(((Boolean) objPostData).booleanValue()));
        Throwable thM3848exceptionOrNullimpl = Result.m3848exceptionOrNullimpl(objM3845constructorimpl);
        if (thM3848exceptionOrNullimpl != null) {
            HMLog.info(bloodPressureApiNightDelegate.TAG, new e(thM3848exceptionOrNullimpl));
        }
        return Result.m3850isFailureimpl(objM3845constructorimpl) ? Boxing.boxBoolean(true) : objM3845constructorimpl;
    }
}
