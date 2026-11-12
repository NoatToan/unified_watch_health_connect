package com.huami.third.googlefit;

import android.content.Context;
import com.google.android.gms.fitness.Fitness;
import com.google.android.gms.fitness.HistoryClient;
import com.google.android.gms.fitness.data.DataSet;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.fitness.data.Session;
import com.google.android.gms.fitness.request.DataDeleteRequest;
import com.google.android.gms.fitness.request.SessionInsertRequest;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes14.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0018\u0010\u0019JO\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072!\u0010\u0010\u001a\u001d\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u000f0\nJ9\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00122!\u0010\u0010\u001a\u001d\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u000f0\nJG\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00122\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00072!\u0010\u0010\u001a\u001d\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u000f0\n¨\u0006\u001a"}, d2 = {"Lcom/huami/third/googlefit/GoogleFitApi;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "startTime", "endTime", "", "Lcom/google/android/gms/fitness/data/DataType;", "dataTypes", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "success", "", "callback", "deleteAllSessions", "Lcom/google/android/gms/fitness/data/Session;", com.google.firebase.crashlytics.internal.settings.b.c, "deleteSession", "Lcom/google/android/gms/fitness/data/DataSet;", "dataSetList", "insertSession", "<init>", "()V", "googlefit_release"}, k = 1, mv = {1, 4, 1})
public final class GoogleFitApi {

    @NotNull
    public static final GoogleFitApi INSTANCE = new GoogleFitApi();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ljava/lang/Void;", "kotlin.jvm.PlatformType", "it", "", "a", "(Ljava/lang/Void;)V"}, k = 3, mv = {1, 4, 1})
    public static final class a<TResult> implements OnSuccessListener<Void> {
        public final /* synthetic */ Function1 a;

        public a(Function1 function1) {
            this.a = function1;
        }

        @Override // com.google.android.gms.tasks.OnSuccessListener
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void onSuccess(Void r2) {
            this.a.invoke(Boolean.TRUE);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ljava/lang/Exception;", "it", "", "onFailure", "(Ljava/lang/Exception;)V", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    public static final class b implements OnFailureListener {
        public final /* synthetic */ Function1 a;

        public b(Function1 function1) {
            this.a = function1;
        }

        @Override // com.google.android.gms.tasks.OnFailureListener
        public final void onFailure(@NotNull Exception exc) {
            this.a.invoke(Boolean.FALSE);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ljava/lang/Void;", "kotlin.jvm.PlatformType", "it", "", "a", "(Ljava/lang/Void;)V"}, k = 3, mv = {1, 4, 1})
    public static final class c<TResult> implements OnSuccessListener<Void> {
        public final /* synthetic */ Function1 a;

        public c(Function1 function1) {
            this.a = function1;
        }

        @Override // com.google.android.gms.tasks.OnSuccessListener
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void onSuccess(Void r2) {
            this.a.invoke(Boolean.TRUE);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ljava/lang/Exception;", "it", "", "onFailure", "(Ljava/lang/Exception;)V", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    public static final class d implements OnFailureListener {
        public final /* synthetic */ Function1 a;

        public d(Function1 function1) {
            this.a = function1;
        }

        @Override // com.google.android.gms.tasks.OnFailureListener
        public final void onFailure(@NotNull Exception exc) {
            this.a.invoke(Boolean.FALSE);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    public static final class e extends Lambda implements Function0<String> {
        public static final e a = new e();

        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "data set 为空";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ljava/lang/Void;", "kotlin.jvm.PlatformType", "it", "", "a", "(Ljava/lang/Void;)V"}, k = 3, mv = {1, 4, 1})
    public static final class f<TResult> implements OnSuccessListener<Void> {
        public final /* synthetic */ Function1 a;

        public f(Function1 function1) {
            this.a = function1;
        }

        @Override // com.google.android.gms.tasks.OnSuccessListener
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void onSuccess(Void r2) {
            this.a.invoke(Boolean.TRUE);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ljava/lang/Exception;", "it", "", "onFailure", "(Ljava/lang/Exception;)V", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    public static final class g implements OnFailureListener {
        public final /* synthetic */ Function1 a;

        public g(Function1 function1) {
            this.a = function1;
        }

        @Override // com.google.android.gms.tasks.OnFailureListener
        public final void onFailure(@NotNull Exception exc) {
            this.a.invoke(Boolean.FALSE);
        }
    }

    private GoogleFitApi() {
    }

    public final void deleteAllSessions(@NotNull Context context, long startTime, long endTime, @NotNull List<DataType> dataTypes, @NotNull Function1<? super Boolean, Unit> callback) {
        DataDeleteRequest.Builder timeInterval = new DataDeleteRequest.Builder().setTimeInterval(startTime, endTime, TimeUnit.MILLISECONDS);
        Iterator<T> it2 = dataTypes.iterator();
        while (it2.hasNext()) {
            timeInterval.addDataType((DataType) it2.next());
        }
        timeInterval.deleteAllSessions();
        Fitness.getHistoryClient(context, GoogleFit.getFitnessGoogleAccount(context)).deleteData(timeInterval.build()).addOnSuccessListener(new a(callback)).addOnFailureListener(new b(callback));
    }

    public final void deleteSession(@NotNull Context context, @NotNull Session session, @NotNull Function1<? super Boolean, Unit> callback) {
        HistoryClient historyClient = Fitness.getHistoryClient(context, GoogleFit.getFitnessGoogleAccount(context));
        DataDeleteRequest.Builder builderAddSession = new DataDeleteRequest.Builder().addSession(session);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        historyClient.deleteData(builderAddSession.setTimeInterval(session.getStartTime(timeUnit), session.getEndTime(timeUnit), timeUnit).build()).addOnSuccessListener(new c(callback)).addOnFailureListener(new d(callback));
    }

    public final void insertSession(@NotNull Context context, @NotNull Session session, @NotNull List<DataSet> dataSetList, @NotNull Function1<? super Boolean, Unit> callback) {
        if (dataSetList.isEmpty()) {
            HMLog.warn$default("Google", null, e.a, 2, null);
            return;
        }
        SessionInsertRequest.Builder session2 = new SessionInsertRequest.Builder().setSession(session);
        Iterator<T> it2 = dataSetList.iterator();
        while (it2.hasNext()) {
            session2.addDataSet((DataSet) it2.next());
        }
        Fitness.getSessionsClient(context, GoogleFit.getFitnessGoogleAccount(context)).insertSession(session2.build()).addOnSuccessListener(new f(callback)).addOnFailureListener(new g(callback));
    }
}
