package com.huami.rawdata_uploader.relation.remote;

import com.huami.rawdata_uploader.ext.CommonExKt;
import com.huami.rawdata_uploader.ext.SerialzationExKt;
import com.huami.rawdata_uploader.relation.local.RawDataDbVo;
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
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KTypeProjection;
import kotlinx.serialization.SerializersKt;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.modules.SerializersModule;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\u0010\u0010\u0011J5\u0010\t\u001a\u0004\u0018\u00010\b2\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0086@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001c\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, d2 = {"Lcom/huami/rawdata_uploader/relation/remote/BloodPressureRawDataDelegate;", "", "", "Lcom/huami/rawdata_uploader/relation/local/RawDataDbVo;", "list", "", "eventType", "subType", "", "postDataList", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/huami/rawdata_uploader/relation/remote/IRawDataApi;", "Lcom/huami/rawdata_uploader/relation/remote/RawDataBloodPressureRequestEntity;", "a", "Lcom/huami/rawdata_uploader/relation/remote/IRawDataApi;", "iRawDataApi", "<init>", "(Lcom/huami/rawdata_uploader/relation/remote/IRawDataApi;)V", "rawdata-uploader_release"}, k = 1, mv = {1, 5, 1})
public final class BloodPressureRawDataDelegate {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final IRawDataApi<RawDataBloodPressureRequestEntity> iRawDataApi;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.rawdata_uploader.relation.remote.BloodPressureRawDataDelegate", f = "IRawDataApi.kt", i = {}, l = {94}, m = "postDataList", n = {}, s = {})
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
            return BloodPressureRawDataDelegate.this.postDataList(null, null, null, this);
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
            return " throw " + this.a.getMessage();
        }
    }

    public BloodPressureRawDataDelegate(@NotNull IRawDataApi<RawDataBloodPressureRequestEntity> iRawDataApi) {
        this.iRawDataApi = iRawDataApi;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object postDataList(@Nullable List<RawDataDbVo> list, @NotNull String str, @NotNull String str2, @NotNull Continuation<? super Boolean> continuation) {
        a aVar;
        ArrayList arrayList;
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
        Object objPostDataList = aVar.a;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i2 = aVar.c;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(objPostDataList);
                Result.Companion companion = Result.Companion;
                if (list == null) {
                    arrayList = null;
                } else {
                    arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
                    Iterator<T> it2 = list.iterator();
                    while (it2.hasNext()) {
                        arrayList.add(RawDataRequestEntityKt.toRequestEntity((RawDataDbVo) it2.next(), str, str2));
                    }
                }
                if (arrayList == null) {
                    return null;
                }
                Json enableEncodeDefaults = SerialzationExKt.getEnableEncodeDefaults(Json.INSTANCE);
                SerializersModule serializersModule = enableEncodeDefaults.getSerializersModule();
                KTypeProjection.Companion companion2 = KTypeProjection.Companion;
                String strEncodeToString = enableEncodeDefaults.encodeToString(SerializersKt.serializer(serializersModule, Reflection.typeOf(List.class, companion2.invariant(Reflection.typeOf(RawDataRequestEntity.class, companion2.invariant(Reflection.typeOf(RawDataBloodPressureRequestEntity.class)))))), arrayList);
                IRawDataApi<RawDataBloodPressureRequestEntity> iRawDataApi = this.iRawDataApi;
                aVar.c = 1;
                objPostDataList = iRawDataApi.postDataList(strEncodeToString, aVar);
                if (objPostDataList == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objPostDataList);
            }
            return Boxing.boxBoolean(((Boolean) objPostDataList).booleanValue());
        } catch (Throwable th) {
            Result.Companion companion3 = Result.Companion;
            Throwable thM3848exceptionOrNullimpl = Result.m3848exceptionOrNullimpl(Result.m3845constructorimpl(ResultKt.createFailure(th)));
            if (thM3848exceptionOrNullimpl != null) {
                CommonExKt.commonLog("postListError", new b(thM3848exceptionOrNullimpl));
            }
            return Boxing.boxBoolean(false);
        }
    }
}
