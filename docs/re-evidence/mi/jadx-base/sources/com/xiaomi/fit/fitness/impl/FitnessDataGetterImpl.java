package com.xiaomi.fit.fitness.impl;

import android.text.TextUtils;
import androidx.lifecycle.LiveData;
import com.google.gson.Gson;
import com.mi.health.course.export.CourseApi;
import com.mi.health.course.export.data.CourseInfoItem;
import com.mi.health.course.export.data.CourseItem;
import com.mibi.sdk.component.Constants;
import com.xiaomi.fit.data.common.data.mi.FitnessDataId;
import com.xiaomi.fit.data.common.data.sport.Location;
import com.xiaomi.fit.data.common.data.sport.RecoverRateData;
import com.xiaomi.fit.data.common.data.sport.SportBasicReport;
import com.xiaomi.fit.data.common.data.sport.SportRecordKey;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fit.data.common.util.FitnessDateUtils;
import com.xiaomi.fit.fitness.export.api.FitnessDataGetter;
import com.xiaomi.fit.fitness.export.data.annotation.HomeDataType;
import com.xiaomi.fit.fitness.export.data.item.AlgoCurseItem;
import com.xiaomi.fit.fitness.export.data.item.DailyRecordItem;
import com.xiaomi.fit.fitness.export.data.item.EcgMedicalItemReport;
import com.xiaomi.fit.fitness.export.data.item.SwitchSongItem;
import com.xiaomi.fit.fitness.export.data.item.TemperatureCharacterItem;
import com.xiaomi.fit.fitness.export.data.item.TemperatureTrendItem;
import com.xiaomi.fit.fitness.impl.internal.FitnessFDSDataGetter;
import com.xiaomi.fit.fitness.parser.schema.DailyRecordKey;
import com.xiaomi.fit.fitness.persist.FitnessFDSUploader;
import com.xiaomi.fit.fitness.persist.db.internal.AlgoCurseEntity;
import com.xiaomi.fit.fitness.persist.db.internal.ServerRequestEntity;
import com.xiaomi.fit.fitness.persist.db.utils.AlgoCurseDaoUtil;
import com.xiaomi.fit.fitness.persist.db.utils.DailyRecordDaoUtils;
import com.xiaomi.fit.fitness.persist.db.utils.ServerRequestDaoUtils;
import com.xiaomi.fit.fitness.persist.db.utils.SportReportDaoUtils;
import com.xiaomi.fit.fitness.persist.db.utils.SwitchSongDaoUtils;
import com.xiaomi.fit.fitness.persist.server.FitnessDataRequest;
import com.xiaomi.fit.fitness.persist.server.data.GetSwitchSongItem;
import com.xiaomi.fitness.sport_eco.SportConstants;
import com.xiaomi.onetrack.OneTrack;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000ì\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0005\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 u2\u00020\u0001:\u0001uB\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\"\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\"\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u001e\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\r0\u00162\u0006\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u0013H\u0016J&\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\r0\u00162\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u0013H\u0016J,\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\r0\u00162\u0006\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u0013H\u0096@¢\u0006\u0002\u0010\u001cJD\u0010\u001d\u001a\u0014\u0012\u0004\u0012\u00020\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u00160\u001e2\u0006\u0010 \u001a\u00020!2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u00132\u0006\u0010\"\u001a\u00020\u0011H\u0016JJ\u0010#\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u00160\u001e0$2\u0006\u0010 \u001a\u00020!2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u00132\u0006\u0010\"\u001a\u00020\u0011H\u0016J>\u0010%\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u00160$2\u0006\u0010&\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u00132\u0006\u0010\"\u001a\u00020\u0011H\u0016JU\u0010'\u001a\u0014\u0012\u0004\u0012\u00020\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u00160\u001e2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u00132\u0006\u0010\"\u001a\u00020\u00112\u0012\u0010(\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000f0)\"\u00020\u000fH\u0016¢\u0006\u0002\u0010*J$\u0010+\u001a\u0004\u0018\u00010\u001f2\u0006\u0010&\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u00132\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J4\u0010,\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00162\u0006\u0010 \u001a\u00020!2\u0006\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u00132\u0006\u0010\"\u001a\u00020\u0011H\u0096@¢\u0006\u0002\u0010-J \u0010.\u001a\u0004\u0018\u00010/2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u00100\u001a\u000201H\u0096@¢\u0006\u0002\u00102J<\u00103\u001a \u0012\u0004\u0012\u00020\u0011\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u000204\u0012\n\u0012\b\u0012\u0004\u0012\u0002050\u00160\u001e0\u001e2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u00106\u001a\u00020\rH\u0096@¢\u0006\u0002\u00107J<\u00108\u001a \u0012\u0004\u0012\u00020\u0011\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u000204\u0012\n\u0012\b\u0012\u0004\u0012\u0002050\u00160\u001e0\u001e2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u00106\u001a\u00020\rH\u0096@¢\u0006\u0002\u00107J(\u00109\u001a\n\u0012\u0004\u0012\u00020:\u0018\u00010\u00162\b\u0010;\u001a\u0004\u0018\u00010\u000f2\u0006\u0010<\u001a\u00020\u000fH\u0096@¢\u0006\u0002\u0010=J\u0018\u0010>\u001a\u0004\u0018\u00010\u000f2\u0006\u0010;\u001a\u00020\u000fH\u0096@¢\u0006\u0002\u0010?J \u0010@\u001a\u0004\u0018\u00010A2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u00106\u001a\u00020\rH\u0096@¢\u0006\u0002\u00107J\u0016\u0010B\u001a\b\u0012\u0004\u0012\u00020\u00110C2\u0006\u0010D\u001a\u00020\u0013H\u0016J(\u0010E\u001a\u0004\u0018\u00010F2\u0006\u0010G\u001a\u00020H2\u0006\u0010I\u001a\u00020\u00112\u0006\u0010J\u001a\u00020\u0011H\u0096@¢\u0006\u0002\u0010KJ4\u0010L\u001a \u0012\n\u0012\b\u0012\u0004\u0012\u00020/0N\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u0016\u0012\u0004\u0012\u00020\u00130M2\u0006\u0010O\u001a\u00020\u0013H\u0096@¢\u0006\u0002\u0010PJ,\u0010Q\u001a\b\u0012\u0004\u0012\u00020R0\u00162\u0006\u0010S\u001a\u00020\u00132\u0006\u0010T\u001a\u00020\u00132\u0006\u0010U\u001a\u00020\u0011H\u0096@¢\u0006\u0002\u0010VJ8\u0010W\u001a\u0014\u0012\u0004\u0012\u00020\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020X0\u00160\u001e2\u0006\u0010S\u001a\u00020\u00132\u0006\u0010T\u001a\u00020\u00132\u0006\u0010U\u001a\u00020\u0011H\u0096@¢\u0006\u0002\u0010VJ1\u0010Y\u001a\u0004\u0018\u00010\u001f2\u0006\u0010&\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010Z\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0002\u0010[J0\u0010\\\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u00162\u0006\u0010]\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u00132\u0006\u0010\"\u001a\u00020\u0011H\u0016J\u001c\u0010^\u001a\b\u0012\u0004\u0012\u00020_0\u00162\u0006\u0010`\u001a\u00020\u0013H\u0096@¢\u0006\u0002\u0010PJ,\u0010a\u001a\u0010\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020\u000f\u0018\u00010b2\u0006\u0010;\u001a\u00020\u000f2\u0006\u0010<\u001a\u00020\u000fH\u0096@¢\u0006\u0002\u0010=J \u0010c\u001a\u0004\u0018\u00010/2\u0006\u0010;\u001a\u00020\u000f2\u0006\u0010<\u001a\u00020\u000fH\u0096@¢\u0006\u0002\u0010=J\u000e\u0010d\u001a\u00020eH\u0096@¢\u0006\u0002\u0010fJ\u0016\u0010g\u001a\u00020h2\u0006\u0010i\u001a\u00020jH\u0096@¢\u0006\u0002\u0010kJ\u000e\u0010l\u001a\b\u0012\u0004\u0012\u00020m0\u0016H\u0016J\u0016\u0010n\u001a\u00020o2\u0006\u0010p\u001a\u00020mH\u0096@¢\u0006\u0002\u0010qJ\b\u0010r\u001a\u00020oH\u0016J\u0016\u0010s\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0011\u0018\u00010bH\u0016J\b\u0010t\u001a\u00020\u0011H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006v"}, d2 = {"Lcom/xiaomi/fit/fitness/impl/FitnessDataGetterImpl;", "Lcom/xiaomi/fit/fitness/export/api/FitnessDataGetter;", "<init>", "()V", "gson", "Lcom/google/gson/Gson;", "courseApi", "Lcom/mi/health/course/export/CourseApi;", "getCourseApi", "()Lcom/mi/health/course/export/CourseApi;", "setCourseApi", "(Lcom/mi/health/course/export/CourseApi;)V", "getTheSportReport", "Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;", "sid", "", DailyRecordKey.sportType, "", "time", "", "key", "getSportReport", "", "startTime", "endTime", "getSportReportByType", "getSportReportByCategory", "category", "(Ljava/lang/String;JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllDailyRecord", "", "Lcom/xiaomi/fit/fitness/export/data/item/DailyRecordItem;", "dataType", "Lcom/xiaomi/fit/fitness/export/data/annotation/HomeDataType;", "zoneOffsetInSec", "getAllDailyRecordAsync", "Landroidx/lifecycle/LiveData;", "getDailyRecordAsync", "persistKey", "getTheDailyItems", "keys", "", "(Ljava/lang/String;JJI[Ljava/lang/String;)Ljava/util/Map;", "getRecentOneData", "getTheRecordSource", "(Lcom/xiaomi/fit/fitness/export/data/annotation/HomeDataType;JJILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getFDSStoreData", "", "dataId", "Lcom/xiaomi/fit/data/common/data/mi/FitnessDataId;", "(Ljava/lang/String;Lcom/xiaomi/fit/data/common/data/mi/FitnessDataId;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getSportGpsData", "Lcom/xiaomi/fit/data/common/data/sport/SportRecordKey;", "", "report", "(Ljava/lang/String;Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getSportRecordData", "getRouteGpsData", "Lcom/xiaomi/fit/data/common/data/sport/Location;", "url", "routeName", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPixelStringData", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getRecoverRateData", "Lcom/xiaomi/fit/data/common/data/sport/RecoverRateData;", "observerRecentCount", "Lkotlinx/coroutines/flow/Flow;", "startSec", "getEcgRecordData", "", "ecgRecord", "Lcom/xiaomi/fit/fitness/export/data/item/EcgMedicalItemReport;", "durationInSec", "sparsePoints", "(Lcom/xiaomi/fit/fitness/export/data/item/EcgMedicalItemReport;IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getTempFileData", "Lkotlin/Triple;", "", "startDateSec", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getTempTrendData", "Lcom/xiaomi/fit/fitness/export/data/item/TemperatureTrendItem;", "startDate", "endDate", OneTrack.Param.TZ, "(JJILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getTempCharacterRecordData", "Lcom/xiaomi/fit/fitness/export/data/item/TemperatureCharacterItem;", "getTheDailyRecord", "toZoneOffsetInSec", "(Ljava/lang/String;Ljava/lang/String;JLjava/lang/Integer;)Lcom/xiaomi/fit/fitness/export/data/item/DailyRecordItem;", "getCgmBloodSugar", "did", "getSwitchSong", "Lcom/xiaomi/fit/fitness/export/data/item/SwitchSongItem;", SportConstants.KEY_TIMESTAMP, "getTrackRawData", "Lkotlin/Pair;", "getTrackByteData", "getPullRecentOneYearDataResult", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCourseInfo", "Lcom/mi/health/course/export/data/CourseInfoItem;", "reqItem", "Lcom/mi/health/course/export/data/CourseItem;", "(Lcom/mi/health/course/export/data/CourseItem;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAlgoCurseData", "Lcom/xiaomi/fit/fitness/export/data/item/AlgoCurseItem;", "insertAlgoCurseData", "", "item", "(Lcom/xiaomi/fit/fitness/export/data/item/AlgoCurseItem;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "cleanAlgoCurseData", "getAlgoCursePeriod", "getAlgoCurseStatus", "Companion", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nFitnessDataGetterImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FitnessDataGetterImpl.kt\ncom/xiaomi/fit/fitness/impl/FitnessDataGetterImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,294:1\n1863#2,2:295\n1863#2,2:297\n*S KotlinDebug\n*F\n+ 1 FitnessDataGetterImpl.kt\ncom/xiaomi/fit/fitness/impl/FitnessDataGetterImpl\n*L\n214#1:295,2\n253#1:297,2\n*E\n"})
public final class FitnessDataGetterImpl implements FitnessDataGetter {

    @NotNull
    private static final String TAG = "FitnessDataGetterImpl";
    public CourseApi courseApi;

    @NotNull
    private final Gson gson = new Gson();

    /* JADX INFO: renamed from: com.xiaomi.fit.fitness.impl.FitnessDataGetterImpl$getPullRecentOneYearDataResult$1, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fit.fitness.impl.FitnessDataGetterImpl", f = "FitnessDataGetterImpl.kt", i = {}, l = {239}, m = "getPullRecentOneYearDataResult", n = {}, s = {})
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
            return FitnessDataGetterImpl.this.getPullRecentOneYearDataResult(this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fit.fitness.impl.FitnessDataGetterImpl$getSwitchSong$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fit.fitness.impl.FitnessDataGetterImpl", f = "FitnessDataGetterImpl.kt", i = {0, 0}, l = {212}, m = "getSwitchSong", n = {"this", Constants.KEY_PAY_RESULT_RET}, s = {"L$0", "L$1"})
    public static final class C15891 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C15891(Continuation<? super C15891> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FitnessDataGetterImpl.this.getSwitchSong(0L, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fit.fitness.impl.FitnessDataGetterImpl$getTempTrendData$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fit.fitness.impl.FitnessDataGetterImpl", f = "FitnessDataGetterImpl.kt", i = {}, l = {174}, m = "getTempTrendData", n = {}, s = {})
    public static final class C15901 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C15901(Continuation<? super C15901> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FitnessDataGetterImpl.this.getTempTrendData(0L, 0L, 0, this);
        }
    }

    @Override // com.xiaomi.fit.fitness.export.api.FitnessDataGetter
    public void cleanAlgoCurseData() {
        AlgoCurseDaoUtil algoCurseDaoUtil = AlgoCurseDaoUtil.INSTANCE;
        algoCurseDaoUtil.deleteAlgoCurse$fitness_data_core_chinaProductRelease(algoCurseDaoUtil.getALlAlgoCurse$fitness_data_core_chinaProductRelease());
    }

    @Override // com.xiaomi.fit.fitness.export.api.FitnessDataGetter
    @NotNull
    public List<AlgoCurseItem> getAlgoCurseData() {
        List<AlgoCurseEntity> aLlAlgoCurse$fitness_data_core_chinaProductRelease = AlgoCurseDaoUtil.INSTANCE.getALlAlgoCurse$fitness_data_core_chinaProductRelease();
        ArrayList arrayList = new ArrayList();
        for (AlgoCurseEntity algoCurseEntity : aLlAlgoCurse$fitness_data_core_chinaProductRelease) {
            arrayList.add(new AlgoCurseItem(algoCurseEntity.getId(), (int) algoCurseEntity.getStartTime(), (int) algoCurseEntity.getEndTime(), (int) algoCurseEntity.getOvulationTime(), algoCurseEntity.getCursePeriod(), algoCurseEntity.getMenstrualPeriod(), algoCurseEntity.getStatus()));
        }
        return arrayList;
    }

    @Override // com.xiaomi.fit.fitness.export.api.FitnessDataGetter
    @Nullable
    public Pair<Integer, Integer> getAlgoCursePeriod() {
        return AlgoCurseDaoUtil.INSTANCE.getAlgoCursePeriod$fitness_data_core_chinaProductRelease();
    }

    @Override // com.xiaomi.fit.fitness.export.api.FitnessDataGetter
    public int getAlgoCurseStatus() {
        Integer algoCurseStatus$fitness_data_core_chinaProductRelease = AlgoCurseDaoUtil.INSTANCE.getAlgoCurseStatus$fitness_data_core_chinaProductRelease();
        if (algoCurseStatus$fitness_data_core_chinaProductRelease != null) {
            return algoCurseStatus$fitness_data_core_chinaProductRelease.intValue();
        }
        return -1;
    }

    @Override // com.xiaomi.fit.fitness.export.api.FitnessDataGetter
    @NotNull
    public Map<String, List<DailyRecordItem>> getAllDailyRecord(@NotNull HomeDataType dataType, @Nullable String sid, long startTime, long endTime, int zoneOffsetInSec) {
        Intrinsics.checkNotNullParameter(dataType, "dataType");
        return DailyRecordDaoUtils.INSTANCE.getAllDailyRecord(dataType, sid, startTime, endTime, zoneOffsetInSec);
    }

    @Override // com.xiaomi.fit.fitness.export.api.FitnessDataGetter
    @NotNull
    public LiveData<Map<String, List<DailyRecordItem>>> getAllDailyRecordAsync(@NotNull HomeDataType dataType, @Nullable String sid, long startTime, long endTime, int zoneOffsetInSec) {
        Intrinsics.checkNotNullParameter(dataType, "dataType");
        return DailyRecordDaoUtils.INSTANCE.getAllDailyRecordAsync(dataType, sid, startTime, endTime, zoneOffsetInSec);
    }

    @Override // com.xiaomi.fit.fitness.export.api.FitnessDataGetter
    @Nullable
    public List<DailyRecordItem> getCgmBloodSugar(@NotNull String did, long startTime, long endTime, int zoneOffsetInSec) {
        Intrinsics.checkNotNullParameter(did, "did");
        return DailyRecordDaoUtils.INSTANCE.getTheDailyItems(did, startTime, endTime, zoneOffsetInSec, "blood_sugar").get("blood_sugar");
    }

    @NotNull
    public final CourseApi getCourseApi() {
        CourseApi courseApi = this.courseApi;
        if (courseApi != null) {
            return courseApi;
        }
        Intrinsics.throwUninitializedPropertyAccessException("courseApi");
        return null;
    }

    @Override // com.xiaomi.fit.fitness.export.api.FitnessDataGetter
    @Nullable
    public Object getCourseInfo(@NotNull CourseItem courseItem, @NotNull Continuation<? super CourseInfoItem> continuation) {
        return getCourseApi().getCourseInfo(courseItem, continuation);
    }

    @Override // com.xiaomi.fit.fitness.export.api.FitnessDataGetter
    @NotNull
    public LiveData<List<DailyRecordItem>> getDailyRecordAsync(@NotNull String persistKey, @Nullable String sid, long startTime, long endTime, int zoneOffsetInSec) {
        Intrinsics.checkNotNullParameter(persistKey, "persistKey");
        return DailyRecordDaoUtils.INSTANCE.getDailyRecordAsync(persistKey, sid, startTime, endTime, zoneOffsetInSec);
    }

    @Override // com.xiaomi.fit.fitness.export.api.FitnessDataGetter
    @Nullable
    public Object getEcgRecordData(@NotNull EcgMedicalItemReport ecgMedicalItemReport, int i, int i2, @NotNull Continuation<? super float[]> continuation) {
        return FitnessFDSDataGetter.INSTANCE.getInstance().getEcgRecordData(ecgMedicalItemReport, i, i2, continuation);
    }

    @Override // com.xiaomi.fit.fitness.export.api.FitnessDataGetter
    @Nullable
    public Object getFDSStoreData(@NotNull String str, @NotNull FitnessDataId fitnessDataId, @NotNull Continuation<? super byte[]> continuation) {
        return FitnessFDSDataGetter.INSTANCE.getInstance().getFDSStoreData(str, fitnessDataId, continuation);
    }

    @Override // com.xiaomi.fit.fitness.export.api.FitnessDataGetter
    @Nullable
    public Object getPixelStringData(@NotNull String str, @NotNull Continuation<? super String> continuation) {
        return FitnessFDSUploader.INSTANCE.getInstance().downloadFromUrl(str);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.xiaomi.fit.fitness.export.api.FitnessDataGetter
    @Nullable
    public Object getPullRecentOneYearDataResult(@NotNull Continuation<? super Boolean> continuation) {
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
        Object recentOneYearPullRequest = anonymousClass1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = anonymousClass1.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(recentOneYearPullRequest);
            ServerRequestDaoUtils serverRequestDaoUtils = ServerRequestDaoUtils.INSTANCE;
            anonymousClass1.label = 1;
            recentOneYearPullRequest = serverRequestDaoUtils.getRecentOneYearPullRequest("fitness_data", anonymousClass1);
            if (recentOneYearPullRequest == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(recentOneYearPullRequest);
        }
        ServerRequestEntity serverRequestEntity = (ServerRequestEntity) recentOneYearPullRequest;
        return (serverRequestEntity == null || !TextUtils.isEmpty(serverRequestEntity.getNextKey())) ? Boxing.boxBoolean(false) : Boxing.boxBoolean(true);
    }

    @Override // com.xiaomi.fit.fitness.export.api.FitnessDataGetter
    @Nullable
    public DailyRecordItem getRecentOneData(@NotNull String persistKey, long endTime, @Nullable String sid) {
        Intrinsics.checkNotNullParameter(persistKey, "persistKey");
        return DailyRecordDaoUtils.INSTANCE.getRecentOneData(persistKey, sid, endTime, FitnessDateUtils.getCurrentTZOffsetInSec());
    }

    @Override // com.xiaomi.fit.fitness.export.api.FitnessDataGetter
    @Nullable
    public Object getRecoverRateData(@NotNull String str, @NotNull SportBasicReport sportBasicReport, @NotNull Continuation<? super RecoverRateData> continuation) {
        return FitnessFDSDataGetter.INSTANCE.getInstance().getSportRecoverRateData(str, sportBasicReport, continuation);
    }

    @Override // com.xiaomi.fit.fitness.export.api.FitnessDataGetter
    @Nullable
    public Object getRouteGpsData(@Nullable String str, @NotNull String str2, @NotNull Continuation<? super List<? extends Location>> continuation) {
        return FitnessFDSDataGetter.INSTANCE.getInstance().getRouteGpsData(str, str2);
    }

    @Override // com.xiaomi.fit.fitness.export.api.FitnessDataGetter
    @Nullable
    public Object getSportGpsData(@NotNull String str, @NotNull SportBasicReport sportBasicReport, @NotNull Continuation<? super Map<Integer, ? extends Map<SportRecordKey, ? extends List<? extends Object>>>> continuation) {
        return FitnessFDSDataGetter.INSTANCE.getInstance().getSportGpsData(str, sportBasicReport, continuation);
    }

    @Override // com.xiaomi.fit.fitness.export.api.FitnessDataGetter
    @Nullable
    public Object getSportRecordData(@NotNull String str, @NotNull SportBasicReport sportBasicReport, @NotNull Continuation<? super Map<Integer, ? extends Map<SportRecordKey, ? extends List<? extends Object>>>> continuation) {
        return FitnessFDSDataGetter.INSTANCE.getInstance().getSportRecordData(str, sportBasicReport, continuation);
    }

    @Override // com.xiaomi.fit.fitness.export.api.FitnessDataGetter
    @NotNull
    public List<SportBasicReport> getSportReport(long startTime, long endTime) {
        return SportReportDaoUtils.INSTANCE.getSportReportBetween(startTime, endTime);
    }

    @Override // com.xiaomi.fit.fitness.export.api.FitnessDataGetter
    @Nullable
    public Object getSportReportByCategory(@NotNull String str, long j, long j2, @NotNull Continuation<? super List<SportBasicReport>> continuation) {
        return SportReportDaoUtils.INSTANCE.getSportReportByCategory(str, j, j2);
    }

    @Override // com.xiaomi.fit.fitness.export.api.FitnessDataGetter
    @NotNull
    public List<SportBasicReport> getSportReportByType(int sportType, long startTime, long endTime) {
        return SportReportDaoUtils.INSTANCE.getSportReportByKey(sportType, startTime, endTime);
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00bc A[Catch: Exception -> 0x0033, TRY_LEAVE, TryCatch #1 {Exception -> 0x0033, blocks: (B:12:0x002f, B:27:0x0076, B:29:0x007a, B:31:0x0084, B:32:0x008a, B:34:0x0090, B:36:0x00a6, B:37:0x00bc), top: B:45:0x002f }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.xiaomi.fit.fitness.export.api.FitnessDataGetter
    @Nullable
    public Object getSwitchSong(long j, @NotNull Continuation<? super List<SwitchSongItem>> continuation) {
        C15891 c15891;
        ArrayList arrayList;
        FitnessDataGetterImpl fitnessDataGetterImpl;
        List list;
        if (continuation instanceof C15891) {
            c15891 = (C15891) continuation;
            int i = c15891.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c15891.label = i - Integer.MIN_VALUE;
            } else {
                c15891 = new C15891(continuation);
            }
        } else {
            c15891 = new C15891(continuation);
        }
        Object obj = c15891.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c15891.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            ArrayList arrayList2 = new ArrayList();
            List<SwitchSongItem> switchSongByTimeStamp$fitness_data_core_chinaProductRelease = SwitchSongDaoUtils.INSTANCE.getSwitchSongByTimeStamp$fitness_data_core_chinaProductRelease(j);
            if (!switchSongByTimeStamp$fitness_data_core_chinaProductRelease.isEmpty()) {
                arrayList2.addAll(switchSongByTimeStamp$fitness_data_core_chinaProductRelease);
            }
            if (!arrayList2.isEmpty()) {
                return arrayList2;
            }
            try {
                c15891.L$0 = this;
                c15891.L$1 = arrayList2;
                c15891.label = 1;
                Object switchSongData = FitnessDataRequest.INSTANCE.getInstance().getSwitchSongData((int) j, c15891);
                if (switchSongData == coroutine_suspended) {
                    return coroutine_suspended;
                }
                fitnessDataGetterImpl = this;
                obj = switchSongData;
                arrayList = arrayList2;
                list = (List) obj;
                if (list == null) {
                    FitnessLogUtils.i(TAG, "get remote list empty!!");
                } else {
                    FitnessLogUtils.i(TAG, "get remote list empty!!");
                }
            } catch (Exception e) {
                e = e;
                arrayList = arrayList2;
                FitnessLogUtils.e(TAG, "get remote list exception!!", e);
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            arrayList = (ArrayList) c15891.L$1;
            fitnessDataGetterImpl = (FitnessDataGetterImpl) c15891.L$0;
            try {
                ResultKt.throwOnFailure(obj);
                list = (List) obj;
                if (list == null && (!list.isEmpty())) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        JSONArray jSONArray = new JSONArray(((GetSwitchSongItem) it.next()).getValue());
                        int length = jSONArray.length();
                        for (int i3 = 0; i3 < length; i3++) {
                            arrayList.add(fitnessDataGetterImpl.gson.fromJson(jSONArray.get(i3).toString(), SwitchSongItem.class));
                        }
                    }
                } else {
                    FitnessLogUtils.i(TAG, "get remote list empty!!");
                }
            } catch (Exception e2) {
                e = e2;
                FitnessLogUtils.e(TAG, "get remote list exception!!", e);
            }
        }
        return arrayList;
    }

    @Override // com.xiaomi.fit.fitness.export.api.FitnessDataGetter
    @Nullable
    public Object getTempCharacterRecordData(long j, long j2, int i, @NotNull Continuation<? super Map<String, ? extends List<TemperatureCharacterItem>>> continuation) {
        Map<String, List<DailyRecordItem>> allDailyRecord = DailyRecordDaoUtils.INSTANCE.getAllDailyRecord(HomeDataType.TEMPERATURE_CHARACTER, null, j, j2, i);
        Intrinsics.checkNotNull(allDailyRecord, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.collections.List<com.xiaomi.fit.fitness.export.data.item.TemperatureCharacterItem>>");
        return allDailyRecord;
    }

    @Override // com.xiaomi.fit.fitness.export.api.FitnessDataGetter
    @Nullable
    public Object getTempFileData(long j, @NotNull Continuation<? super Triple<? extends List<byte[]>, ? extends List<Long>, Long>> continuation) {
        return FitnessFDSDataGetter.INSTANCE.getInstance().getTemperatureFileData(j, continuation);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0017  */
    @Override // com.xiaomi.fit.fitness.export.api.FitnessDataGetter
    @Nullable
    public Object getTempTrendData(long j, long j2, int i, @NotNull Continuation<? super List<TemperatureTrendItem>> continuation) {
        C15901 c15901;
        if (continuation instanceof C15901) {
            c15901 = (C15901) continuation;
            int i2 = c15901.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c15901.label = i2 - Integer.MIN_VALUE;
            } else {
                c15901 = new C15901(continuation);
            }
        } else {
            c15901 = new C15901(continuation);
        }
        C15901 c15902 = c15901;
        Object limitedDataRecord = c15902.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = c15902.label;
        if (i3 == 0) {
            ResultKt.throwOnFailure(limitedDataRecord);
            DailyRecordDaoUtils dailyRecordDaoUtils = DailyRecordDaoUtils.INSTANCE;
            c15902.label = 1;
            limitedDataRecord = dailyRecordDaoUtils.getLimitedDataRecord("temperature_trend", (String) null, j, j2, i, 0, true, (Continuation<? super List<? extends DailyRecordItem>>) c15902);
            if (limitedDataRecord == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(limitedDataRecord);
        }
        Intrinsics.checkNotNull(limitedDataRecord, "null cannot be cast to non-null type kotlin.collections.List<com.xiaomi.fit.fitness.export.data.item.TemperatureTrendItem>");
        return (List) limitedDataRecord;
    }

    @Override // com.xiaomi.fit.fitness.export.api.FitnessDataGetter
    @NotNull
    public Map<String, List<DailyRecordItem>> getTheDailyItems(@Nullable String sid, long startTime, long endTime, int zoneOffsetInSec, @NotNull String... keys) {
        Intrinsics.checkNotNullParameter(keys, "keys");
        return DailyRecordDaoUtils.INSTANCE.getTheDailyItems(sid, startTime, endTime, zoneOffsetInSec, (String[]) Arrays.copyOf(keys, keys.length));
    }

    @Override // com.xiaomi.fit.fitness.export.api.FitnessDataGetter
    @Nullable
    public DailyRecordItem getTheDailyRecord(@NotNull String persistKey, @NotNull String sid, long time, @Nullable Integer toZoneOffsetInSec) {
        Intrinsics.checkNotNullParameter(persistKey, "persistKey");
        Intrinsics.checkNotNullParameter(sid, "sid");
        return DailyRecordDaoUtils.INSTANCE.getTheDailyRecord(persistKey, sid, time, toZoneOffsetInSec);
    }

    @Override // com.xiaomi.fit.fitness.export.api.FitnessDataGetter
    @Nullable
    public Object getTheRecordSource(@NotNull HomeDataType homeDataType, long j, long j2, int i, @NotNull Continuation<? super List<String>> continuation) {
        return DailyRecordDaoUtils.INSTANCE.getTheRecordSource(homeDataType, j, j2, i, continuation);
    }

    @Override // com.xiaomi.fit.fitness.export.api.FitnessDataGetter
    @Nullable
    public SportBasicReport getTheSportReport(@NotNull String sid, int sportType, long time) {
        Intrinsics.checkNotNullParameter(sid, "sid");
        return SportReportDaoUtils.INSTANCE.getTheSportReport(sid, sportType, time);
    }

    @Override // com.xiaomi.fit.fitness.export.api.FitnessDataGetter
    @Nullable
    public Object getTrackByteData(@NotNull String str, @NotNull String str2, @NotNull Continuation<? super byte[]> continuation) {
        return FitnessFDSDataGetter.INSTANCE.getInstance().getTrackByteData(str, str2, continuation);
    }

    @Override // com.xiaomi.fit.fitness.export.api.FitnessDataGetter
    @Nullable
    public Object getTrackRawData(@NotNull String str, @NotNull String str2, @NotNull Continuation<? super Pair<byte[], String>> continuation) {
        return FitnessFDSDataGetter.INSTANCE.getInstance().getTrackRawData(str, str2, continuation);
    }

    @Override // com.xiaomi.fit.fitness.export.api.FitnessDataGetter
    @Nullable
    public Object insertAlgoCurseData(@NotNull AlgoCurseItem algoCurseItem, @NotNull Continuation<? super Unit> continuation) {
        AlgoCurseDaoUtil.INSTANCE.insertAlgoCurse$fitness_data_core_chinaProductRelease(new AlgoCurseEntity(algoCurseItem.getId(), algoCurseItem.getStartTime(), algoCurseItem.getEndTime(), algoCurseItem.getOvulationTime(), algoCurseItem.getCursePeriod(), algoCurseItem.getMenstrualPeriod(), algoCurseItem.getStatus()));
        return Unit.INSTANCE;
    }

    @Override // com.xiaomi.fit.fitness.export.api.FitnessDataGetter
    @NotNull
    public Flow<Integer> observerRecentCount(long startSec) {
        return SportReportDaoUtils.INSTANCE.observerRecentCount(startSec);
    }

    public final void setCourseApi(@NotNull CourseApi courseApi) {
        Intrinsics.checkNotNullParameter(courseApi, "<set-?>");
        this.courseApi = courseApi;
    }

    @Override // com.xiaomi.fit.fitness.export.api.FitnessDataGetter
    @Nullable
    public SportBasicReport getTheSportReport(@NotNull String sid, @NotNull String key, long time) {
        Intrinsics.checkNotNullParameter(sid, "sid");
        Intrinsics.checkNotNullParameter(key, "key");
        return SportReportDaoUtils.INSTANCE.getTheSportReport(sid, key, time);
    }
}
