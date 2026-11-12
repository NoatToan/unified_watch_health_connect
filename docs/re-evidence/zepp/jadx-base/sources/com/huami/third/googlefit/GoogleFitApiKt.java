package com.huami.third.googlefit;

import android.content.Context;
import com.google.android.gms.fitness.data.DataPoint;
import com.google.android.gms.fitness.data.DataSet;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.Field;
import com.google.android.gms.fitness.data.Session;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes14.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u001a\u0018\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003\u001a5\u0010\u000f\u001a\u00020\r*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032!\u0010\u000e\u001a\u001d\u0012\u0013\u0012\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r0\b\"\u0016\u0010\u0013\u001a\u00020\u00108\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lcom/huami/third/googlefit/Workout;", "Lcom/google/android/gms/fitness/data/Session;", "toSession", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "Lcom/google/android/gms/fitness/data/DataSet;", "toDataSetList", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "success", "", "callback", "updateToGoogleFit", "", "a", "Ljava/lang/String;", "GOOGLE_LOG_TAG", "googlefit_release"}, k = 2, mv = {1, 4, 1})
public final class GoogleFitApiKt {
    private static final String a = "Google";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    public static final class a extends Lambda implements Function0<String> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "上传运动";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "insertSuccess", "", "invoke", "(Z)V", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    public static final class b extends Lambda implements Function1<Boolean, Unit> {
        public final /* synthetic */ Function1 a;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
        public static final class a extends Lambda implements Function0<String> {
            public final /* synthetic */ boolean a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(boolean z) {
                super(0);
                this.a = z;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                StringBuilder sb = new StringBuilder();
                sb.append("上传运动");
                sb.append(this.a ? "成功" : "失败");
                return sb.toString();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Function1 function1) {
            super(1);
            this.a = function1;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke(bool.booleanValue());
            return Unit.INSTANCE;
        }

        public final void invoke(boolean z) {
            HMLog.info(GoogleFitApiKt.a, new a(z));
            this.a.invoke(Boolean.valueOf(z));
        }
    }

    @NotNull
    public static final List<DataSet> toDataSetList(@NotNull Workout workout, @NotNull Context context) {
        ArrayList arrayList = new ArrayList();
        for (Data data : workout.getDataList()) {
            DataSource dataSourceBuild = new DataSource.Builder().setAppPackageName(context).setDataType(data.getDataType()).setStreamName(data.getName()).setType(0).build();
            DataSet.Builder builder = DataSet.builder(dataSourceBuild);
            for (Segment segment : data.getSegments()) {
                DataPoint.Builder builder2 = DataPoint.builder(dataSourceBuild);
                if (segment.getTimestamp() > 0) {
                    builder2.setTimestamp(segment.getTimestamp(), TimeUnit.MILLISECONDS);
                } else {
                    builder2.setTimeInterval(segment.getStartTime(), segment.getEndTime(), TimeUnit.MILLISECONDS);
                }
                FieldPair<?> filed = segment.getFiled();
                if (filed != null) {
                    Object value = filed.getValue();
                    if (value instanceof Integer) {
                        builder2.setField(filed.getFiled(), ((Number) filed.getValue()).intValue());
                    } else if (value instanceof Float) {
                        builder2.setField(filed.getFiled(), ((Number) filed.getValue()).floatValue());
                    } else if (value instanceof String) {
                        builder2.setField(filed.getFiled(), (String) filed.getValue());
                    } else {
                        Field filed2 = filed.getFiled();
                        Object value2 = filed.getValue();
                        Objects.requireNonNull(value2, "null cannot be cast to non-null type kotlin.Int");
                        builder2.setField(filed2, ((Integer) value2).intValue());
                    }
                }
                ActivityField activityFiled = segment.getActivityFiled();
                if (activityFiled != null) {
                    builder2.setActivityField(activityFiled.getFiled(), activityFiled.getFitnessActivities());
                }
                builder.add(builder2.build());
            }
            arrayList.add(builder.build());
        }
        return arrayList;
    }

    @NotNull
    public static final Session toSession(@NotNull Workout workout) {
        Session.Builder activity = new Session.Builder().setName(workout.getName()).setActivity(workout.getActivity());
        long startTime = workout.getStartTime();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        Session.Builder endTime = activity.setStartTime(startTime, timeUnit).setEndTime(workout.getEndTime(), timeUnit);
        String desc = workout.getDesc();
        if (desc != null) {
            endTime.setDescription(desc);
        }
        String identifier = workout.getIdentifier();
        if (identifier != null) {
            endTime.setIdentifier(identifier);
        }
        return endTime.build();
    }

    public static final void updateToGoogleFit(@NotNull Workout workout, @NotNull Context context, @NotNull Function1<? super Boolean, Unit> function1) {
        Session session = toSession(workout);
        HMLog.info(a, a.a);
        GoogleFitApi.INSTANCE.insertSession(context, session, toDataSetList(workout, context), new b(function1));
    }
}
