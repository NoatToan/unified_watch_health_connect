package com.mi.health.course.api;

import com.google.gson.Gson;
import com.mi.health.course.export.data.CourseModel;
import com.mi.health.course.export.data.CourseTrainRecord;
import com.xiaomi.fit.fitness.parser.schema.DailyRecordKey;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.net.BaseRequest;
import com.xiaomi.fitness.net.extensions.HttpPoint;
import dagger.hilt.android.EntryPointAccessors;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004J4\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0012\u001a\u00020\u000eH\u0086@¢\u0006\u0002\u0010\u0013J4\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0012\u001a\u00020\u000eH\u0086@¢\u0006\u0002\u0010\u0013J\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0086@¢\u0006\u0002\u0010\u001aJ\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001d\u001a\u00020\u0010H\u0086@¢\u0006\u0002\u0010\u001eJ0\u0010\u001f\u001a\u00020 2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010!\u001a\u00020\u00192\b\u0010\"\u001a\u0004\u0018\u00010\u00102\u0006\u0010#\u001a\u00020\u000eH\u0086@¢\u0006\u0002\u0010$J\u001e\u0010%\u001a\u00020&2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010!\u001a\u00020\u0019H\u0086@¢\u0006\u0002\u0010'J\u0016\u0010(\u001a\u00020 2\u0006\u0010\u001d\u001a\u00020\u0010H\u0086@¢\u0006\u0002\u0010\u001eR\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006)"}, d2 = {"Lcom/mi/health/course/api/CourseRequest;", "Lcom/xiaomi/fitness/net/BaseRequest;", "Lcom/mi/health/course/api/CourseService;", "<init>", "()V", "gson", "Lcom/google/gson/Gson;", "getGson", "()Lcom/google/gson/Gson;", "setGson", "(Lcom/google/gson/Gson;)V", "getCourseList", "Lcom/mi/health/course/export/data/CourseModel$CourseListData;", "courseType", "", "tags", "", "nextKey", "count", "(ILjava/lang/String;Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPracticedCourseList", "Lcom/mi/health/course/export/data/CourseModel$PracticedCourseList;", "getCourseDetail", "Lcom/mi/health/course/export/data/CourseModel$CourseDetailResult;", "courseId", "", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getMultiCourseInfo", "Lcom/mi/health/course/export/data/CourseModel$CourseBasicInformationList;", "courseIds", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "postCourseTrainRecord", "Lcom/mi/health/course/export/data/CourseModel$RequestResult;", "time", "did", DailyRecordKey.sportType, "(JJLjava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getTrainRecord", "Lcom/mi/health/course/export/data/CourseTrainRecord;", "(JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "removeCourse", "course_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCourseRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CourseRequest.kt\ncom/mi/health/course/api/CourseRequest\n+ 2 BaseRequest.kt\ncom/xiaomi/fitness/net/BaseRequest\n+ 3 HttpExtension.kt\ncom/xiaomi/fitness/net/extensions/HttpExtensionKt\n*L\n1#1,65:1\n141#2:66\n141#2:70\n141#2:74\n141#2:78\n141#2:82\n141#2:86\n141#2:90\n31#3:67\n28#3,2:68\n31#3:71\n28#3,2:72\n31#3:75\n28#3,2:76\n31#3:79\n28#3,2:80\n31#3:83\n28#3,2:84\n31#3:87\n28#3,2:88\n31#3:91\n28#3,2:92\n*S KotlinDebug\n*F\n+ 1 CourseRequest.kt\ncom/mi/health/course/api/CourseRequest\n*L\n19#1:66\n24#1:70\n29#1:74\n34#1:78\n52#1:82\n57#1:86\n63#1:90\n19#1:67\n19#1:68,2\n24#1:71\n24#1:72,2\n29#1:75\n29#1:76,2\n34#1:79\n34#1:80,2\n52#1:83\n52#1:84,2\n57#1:87\n57#1:88,2\n63#1:91\n63#1:92,2\n*E\n"})
public final class CourseRequest extends BaseRequest<CourseService> {
    public Gson gson;

    /* JADX INFO: renamed from: com.mi.health.course.api.CourseRequest$getCourseDetail$1, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.mi.health.course.api.CourseRequest", f = "CourseRequest.kt", i = {}, l = {29}, m = "getCourseDetail", n = {}, s = {})
    public static final class AnonymousClass1 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CourseRequest.this.getCourseDetail(0L, this);
        }
    }

    /* JADX INFO: renamed from: com.mi.health.course.api.CourseRequest$getCourseList$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.mi.health.course.api.CourseRequest", f = "CourseRequest.kt", i = {}, l = {19}, m = "getCourseList", n = {}, s = {})
    public static final class C14321 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C14321(Continuation<? super C14321> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CourseRequest.this.getCourseList(0, null, null, 0, this);
        }
    }

    /* JADX INFO: renamed from: com.mi.health.course.api.CourseRequest$getMultiCourseInfo$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.mi.health.course.api.CourseRequest", f = "CourseRequest.kt", i = {}, l = {34}, m = "getMultiCourseInfo", n = {}, s = {})
    public static final class C14331 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C14331(Continuation<? super C14331> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CourseRequest.this.getMultiCourseInfo(null, this);
        }
    }

    /* JADX INFO: renamed from: com.mi.health.course.api.CourseRequest$getPracticedCourseList$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.mi.health.course.api.CourseRequest", f = "CourseRequest.kt", i = {}, l = {24}, m = "getPracticedCourseList", n = {}, s = {})
    public static final class C14341 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C14341(Continuation<? super C14341> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CourseRequest.this.getPracticedCourseList(0, null, null, 0, this);
        }
    }

    /* JADX INFO: renamed from: com.mi.health.course.api.CourseRequest$getTrainRecord$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.mi.health.course.api.CourseRequest", f = "CourseRequest.kt", i = {}, l = {57}, m = "getTrainRecord", n = {}, s = {})
    public static final class C14351 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C14351(Continuation<? super C14351> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CourseRequest.this.getTrainRecord(0L, 0L, this);
        }
    }

    /* JADX INFO: renamed from: com.mi.health.course.api.CourseRequest$postCourseTrainRecord$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.mi.health.course.api.CourseRequest", f = "CourseRequest.kt", i = {}, l = {52}, m = "postCourseTrainRecord", n = {}, s = {})
    public static final class C14361 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C14361(Continuation<? super C14361> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CourseRequest.this.postCourseTrainRecord(0L, 0L, null, 0, this);
        }
    }

    /* JADX INFO: renamed from: com.mi.health.course.api.CourseRequest$removeCourse$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.mi.health.course.api.CourseRequest", f = "CourseRequest.kt", i = {}, l = {63}, m = "removeCourse", n = {}, s = {})
    public static final class C14371 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C14371(Continuation<? super C14371> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CourseRequest.this.removeCourse(null, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object getCourseDetail(long j, @NotNull Continuation<? super CourseModel.CourseDetailResult> continuation) {
        AnonymousClass1 anonymousClass1;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            int i = anonymousClass1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(continuation);
        }
        Object courseInfo = anonymousClass1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = anonymousClass1.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(courseInfo);
            CourseModel.CourseInformationRequest courseInformationRequest = new CourseModel.CourseInformationRequest(j);
            CourseService mService = getMService();
            String json = getGson().toJson(courseInformationRequest);
            Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
            anonymousClass1.label = 1;
            courseInfo = mService.getCourseInfo(json, anonymousClass1);
            if (courseInfo == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(courseInfo);
        }
        return ((HttpPoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), HttpPoint.class)).getHttpConfig().getHttpResultHandler().handleResponse(courseInfo);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object getCourseList(int i, @Nullable String str, @Nullable String str2, int i2, @NotNull Continuation<? super CourseModel.CourseListData> continuation) {
        C14321 c14321;
        if (continuation instanceof C14321) {
            c14321 = (C14321) continuation;
            int i3 = c14321.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c14321.label = i3 - Integer.MIN_VALUE;
            } else {
                c14321 = new C14321(continuation);
            }
        } else {
            c14321 = new C14321(continuation);
        }
        Object courseList = c14321.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i4 = c14321.label;
        if (i4 == 0) {
            ResultKt.throwOnFailure(courseList);
            String json = getGson().toJson(new CourseModel.CourseListRequest(i, str, str2, i2));
            CourseService mService = getMService();
            Intrinsics.checkNotNull(json);
            c14321.label = 1;
            courseList = mService.getCourseList(json, c14321);
            if (courseList == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i4 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(courseList);
        }
        return ((HttpPoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), HttpPoint.class)).getHttpConfig().getHttpResultHandler().handleResponse(courseList);
    }

    @NotNull
    public final Gson getGson() {
        Gson gson = this.gson;
        if (gson != null) {
            return gson;
        }
        Intrinsics.throwUninitializedPropertyAccessException("gson");
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object getMultiCourseInfo(@NotNull String str, @NotNull Continuation<? super CourseModel.CourseBasicInformationList> continuation) {
        C14331 c14331;
        if (continuation instanceof C14331) {
            c14331 = (C14331) continuation;
            int i = c14331.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c14331.label = i - Integer.MIN_VALUE;
            } else {
                c14331 = new C14331(continuation);
            }
        } else {
            c14331 = new C14331(continuation);
        }
        Object multiCourseInfo = c14331.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c14331.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(multiCourseInfo);
            CourseModel.MultyCourseInformationRequest multyCourseInformationRequest = new CourseModel.MultyCourseInformationRequest(str);
            CourseService mService = getMService();
            String json = getGson().toJson(multyCourseInformationRequest);
            Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
            c14331.label = 1;
            multiCourseInfo = mService.getMultiCourseInfo(json, c14331);
            if (multiCourseInfo == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(multiCourseInfo);
        }
        return ((HttpPoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), HttpPoint.class)).getHttpConfig().getHttpResultHandler().handleResponse(multiCourseInfo);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object getPracticedCourseList(int i, @Nullable String str, @Nullable String str2, int i2, @NotNull Continuation<? super CourseModel.PracticedCourseList> continuation) {
        C14341 c14341;
        if (continuation instanceof C14341) {
            c14341 = (C14341) continuation;
            int i3 = c14341.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c14341.label = i3 - Integer.MIN_VALUE;
            } else {
                c14341 = new C14341(continuation);
            }
        } else {
            c14341 = new C14341(continuation);
        }
        Object practicedCourseList = c14341.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i4 = c14341.label;
        if (i4 == 0) {
            ResultKt.throwOnFailure(practicedCourseList);
            CourseModel.CourseListRequest courseListRequest = new CourseModel.CourseListRequest(i, str, str2, i2);
            CourseService mService = getMService();
            String json = getGson().toJson(courseListRequest);
            Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
            c14341.label = 1;
            practicedCourseList = mService.getPracticedCourseList(json, c14341);
            if (practicedCourseList == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i4 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(practicedCourseList);
        }
        return ((HttpPoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), HttpPoint.class)).getHttpConfig().getHttpResultHandler().handleResponse(practicedCourseList);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object getTrainRecord(long j, long j2, @NotNull Continuation<? super CourseTrainRecord> continuation) {
        C14351 c14351;
        if (continuation instanceof C14351) {
            c14351 = (C14351) continuation;
            int i = c14351.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c14351.label = i - Integer.MIN_VALUE;
            } else {
                c14351 = new C14351(continuation);
            }
        } else {
            c14351 = new C14351(continuation);
        }
        Object trainRecord = c14351.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c14351.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(trainRecord);
            CourseModel.GetTrainRecordRequest getTrainRecordRequest = new CourseModel.GetTrainRecordRequest(j, j2);
            CourseService mService = getMService();
            String json = getGson().toJson(getTrainRecordRequest);
            Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
            c14351.label = 1;
            trainRecord = mService.getTrainRecord(json, c14351);
            if (trainRecord == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(trainRecord);
        }
        return ((HttpPoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), HttpPoint.class)).getHttpConfig().getHttpResultHandler().handleResponse(trainRecord);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    @Nullable
    public final Object postCourseTrainRecord(long j, long j2, @Nullable String str, int i, @NotNull Continuation<? super CourseModel.RequestResult> continuation) {
        C14361 c14361;
        if (continuation instanceof C14361) {
            c14361 = (C14361) continuation;
            int i2 = c14361.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c14361.label = i2 - Integer.MIN_VALUE;
            } else {
                c14361 = new C14361(continuation);
            }
        } else {
            c14361 = new C14361(continuation);
        }
        Object objPostTrainRecord = c14361.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = c14361.label;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objPostTrainRecord);
            CourseTrainRecord.SportRecord sportRecord = new CourseTrainRecord.SportRecord();
            sportRecord.did = str;
            sportRecord.time = j2;
            sportRecord.sport_type = i;
            CourseModel.PostTrainRecordRequest postTrainRecordRequest = new CourseModel.PostTrainRecordRequest(j, j2, sportRecord, TimeZone.getDefault().getOffset(System.currentTimeMillis()) / 1000);
            CourseService mService = getMService();
            String json = getGson().toJson(postTrainRecordRequest);
            Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
            c14361.label = 1;
            objPostTrainRecord = mService.postTrainRecord(json, c14361);
            if (objPostTrainRecord == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objPostTrainRecord);
        }
        return ((HttpPoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), HttpPoint.class)).getHttpConfig().getHttpResultHandler().handleResponse(objPostTrainRecord);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object removeCourse(@NotNull String str, @NotNull Continuation<? super CourseModel.RequestResult> continuation) {
        C14371 c14371;
        if (continuation instanceof C14371) {
            c14371 = (C14371) continuation;
            int i = c14371.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c14371.label = i - Integer.MIN_VALUE;
            } else {
                c14371 = new C14371(continuation);
            }
        } else {
            c14371 = new C14371(continuation);
        }
        Object objPostRemoveCourse = c14371.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c14371.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objPostRemoveCourse);
            CourseModel.MultyCourseInformationRequest multyCourseInformationRequest = new CourseModel.MultyCourseInformationRequest(str);
            CourseService mService = getMService();
            String json = getGson().toJson(multyCourseInformationRequest);
            Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
            c14371.label = 1;
            objPostRemoveCourse = mService.postRemoveCourse(json, c14371);
            if (objPostRemoveCourse == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objPostRemoveCourse);
        }
        return ((HttpPoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), HttpPoint.class)).getHttpConfig().getHttpResultHandler().handleResponse(objPostRemoveCourse);
    }

    public final void setGson(@NotNull Gson gson) {
        Intrinsics.checkNotNullParameter(gson, "<set-?>");
        this.gson = gson;
    }
}
