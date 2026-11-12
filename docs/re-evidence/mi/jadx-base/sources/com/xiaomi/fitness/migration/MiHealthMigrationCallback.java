package com.xiaomi.fitness.migration;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import androidx.sqlite.db.SupportSQLiteDatabase;
import com.example.statistics.export.IOnetrack;
import com.example.statistics.export.OneTrackExtKt;
import com.example.statistics.export.OneTrackStatBean;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fit.fitness.export.api.FitnessServerSyncer;
import com.xiaomi.fit.fitness.export.di.FitnessDataExtKt;
import com.xiaomi.fitness.common.concurrent.ExecutorHelper;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.migration.sleep.migration.SleepAudioMigrateUtils;
import defpackage.el1;
import defpackage.frc;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010&\u001a\u00020%¢\u0006\u0004\b'\u0010(J\u000f\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0004\u0010\u0005J&\u0010\u000b\u001a\u00020\u00032\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\n\u001a\u00020\tH\u0082@¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\tH\u0014¢\u0006\u0004\b\u0014\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0018\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00158\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0019\u0010\u0017R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001e\u0010\u001f\u001a\n \u001e*\u0004\u0018\u00010\u001d0\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010\"\u001a\u00020!8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010$\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010\u001c¨\u0006)"}, d2 = {"Lcom/xiaomi/fitness/migration/MiHealthMigrationCallback;", "Lel1;", "Landroid/os/Handler$Callback;", "", "triggerScheduledDataSync", "()V", "", "Lfrc;", "transList", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "db", "startMigrate", "(Ljava/util/List;Landroidx/sqlite/db/SupportSQLiteDatabase;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroid/os/Message;", "msg", "", "handleMessage", "(Landroid/os/Message;)Z", "onOpen", "(Landroidx/sqlite/db/SupportSQLiteDatabase;)V", "onAsyncCreate", "", "TAG", "Ljava/lang/String;", "SPF_NAME", "KEY_COUNT", "", "HANDLER_MSG_WHAT_ID", "I", "Landroid/content/SharedPreferences;", "kotlin.jvm.PlatformType", "spf", "Landroid/content/SharedPreferences;", "Landroid/os/Handler;", "handler", "Landroid/os/Handler;", "triggerCount", "Landroid/content/Context;", "ctx", "<init>", "(Landroid/content/Context;)V", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nMiHealthMigrationCallback.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MiHealthMigrationCallback.kt\ncom/xiaomi/fitness/migration/MiHealthMigrationCallback\n+ 2 Runnable.kt\nkotlinx/coroutines/RunnableKt\n*L\n1#1,141:1\n17#2:142\n*S KotlinDebug\n*F\n+ 1 MiHealthMigrationCallback.kt\ncom/xiaomi/fitness/migration/MiHealthMigrationCallback\n*L\n69#1:142\n*E\n"})
public final class MiHealthMigrationCallback extends el1 implements Handler.Callback {
    private final int HANDLER_MSG_WHAT_ID;

    @NotNull
    private final String KEY_COUNT;

    @NotNull
    private final String SPF_NAME;

    @NotNull
    private final String TAG;
    private Handler handler;
    private SharedPreferences spf;
    private int triggerCount;

    /* JADX INFO: renamed from: com.xiaomi.fitness.migration.MiHealthMigrationCallback$onAsyncCreate$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.migration.MiHealthMigrationCallback$onAsyncCreate$1", f = "MiHealthMigrationCallback.kt", i = {}, l = {86}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ SupportSQLiteDatabase $db;
        final /* synthetic */ MigrationManager $mgr;
        final /* synthetic */ Ref.BooleanRef $transResult;
        int label;
        final /* synthetic */ MiHealthMigrationCallback this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(MigrationManager migrationManager, MiHealthMigrationCallback miHealthMigrationCallback, SupportSQLiteDatabase supportSQLiteDatabase, Ref.BooleanRef booleanRef, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$mgr = migrationManager;
            this.this$0 = miHealthMigrationCallback;
            this.$db = supportSQLiteDatabase;
            this.$transResult = booleanRef;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$mgr, this.this$0, this.$db, this.$transResult, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                List<frc> dbTransformList = this.$mgr.getDbTransformList(ApplicationExtKt.getApplication());
                MiHealthMigrationCallback miHealthMigrationCallback = this.this$0;
                SupportSQLiteDatabase supportSQLiteDatabase = this.$db;
                this.label = 1;
                if (miHealthMigrationCallback.startMigrate(dbTransformList, supportSQLiteDatabase, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            FitnessLogUtils.i(this.this$0.TAG, "all db migrate end");
            this.$transResult.element = true;
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.migration.MiHealthMigrationCallback$startMigrate$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.migration.MiHealthMigrationCallback$startMigrate$2", f = "MiHealthMigrationCallback.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nMiHealthMigrationCallback.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MiHealthMigrationCallback.kt\ncom/xiaomi/fitness/migration/MiHealthMigrationCallback$startMigrate$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,141:1\n1863#2,2:142\n*S KotlinDebug\n*F\n+ 1 MiHealthMigrationCallback.kt\ncom/xiaomi/fitness/migration/MiHealthMigrationCallback$startMigrate$2\n*L\n133#1:142,2\n*E\n"})
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ SupportSQLiteDatabase $db;
        final /* synthetic */ List<frc> $transList;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ MiHealthMigrationCallback this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(List<? extends frc> list, MiHealthMigrationCallback miHealthMigrationCallback, SupportSQLiteDatabase supportSQLiteDatabase, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$transList = list;
            this.this$0 = miHealthMigrationCallback;
            this.$db = supportSQLiteDatabase;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$transList, this.this$0, this.$db, continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            List<frc> list = this.$transList;
            MiHealthMigrationCallback miHealthMigrationCallback = this.this$0;
            SupportSQLiteDatabase supportSQLiteDatabase = this.$db;
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new MiHealthMigrationCallback$startMigrate$2$1$1(miHealthMigrationCallback, (frc) it.next(), supportSQLiteDatabase, null), 3, null);
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MiHealthMigrationCallback(@NotNull Context ctx) {
        super(ctx);
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        this.TAG = "DB_Trans";
        this.SPF_NAME = "spf_migration";
        this.KEY_COUNT = "count";
        this.HANDLER_MSG_WHAT_ID = 110;
        this.spf = getContext().getSharedPreferences("spf_migration", 0);
        this.triggerCount = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object startMigrate(List<? extends frc> list, SupportSQLiteDatabase supportSQLiteDatabase, Continuation<? super Unit> continuation) {
        Object objWithContext = BuildersKt.withContext(Dispatchers.getDefault(), new AnonymousClass2(list, this, supportSQLiteDatabase, null), continuation);
        return objWithContext == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWithContext : Unit.INSTANCE;
    }

    private final void triggerScheduledDataSync() {
        if (this.handler == null) {
            HandlerThread handlerThread = new HandlerThread(this.TAG);
            handlerThread.start();
            this.handler = new Handler(handlerThread.getLooper(), this);
        }
        Handler handler = this.handler;
        if (handler == null) {
            Intrinsics.throwUninitializedPropertyAccessException("handler");
            handler = null;
        }
        handler.sendEmptyMessageDelayed(this.HANDLER_MSG_WHAT_ID, this.triggerCount * 5000);
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(@NotNull Message msg) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        if (msg.what != this.HANDLER_MSG_WHAT_ID) {
            return false;
        }
        FitnessLogUtils.i(this.TAG, "triggerScheduledDataSync-" + this.triggerCount);
        FitnessServerSyncer.DefaultImpls.syncWithServer$default(FitnessDataExtKt.getInstance(FitnessServerSyncer.INSTANCE), false, "migration_old_health", null, 4, null);
        triggerScheduledDataSync();
        this.triggerCount = this.triggerCount + 1;
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:48:0x029c  */
    /* JADX WARN: Code duplicated, block: B:51:0x0318  */
    @Override // defpackage.el1
    public void onAsyncCreate(@NotNull SupportSQLiteDatabase db) throws Throwable {
        Ref.BooleanRef booleanRef;
        String str;
        String str2;
        int i;
        String str3;
        Ref.BooleanRef booleanRef2;
        Handler handler;
        Throwable th;
        long minTimestamp;
        MiHealthMigrationCallback miHealthMigrationCallback;
        Intrinsics.checkNotNullParameter(db, "db");
        MigrationManager companion = MigrationManager.INSTANCE.getInstance();
        int i2 = this.spf.getInt(this.KEY_COUNT, 1);
        long jCurrentTimeMillis = System.currentTimeMillis();
        Ref.BooleanRef booleanRef3 = new Ref.BooleanRef();
        triggerScheduledDataSync();
        Handler handler2 = null;
        try {
            try {
                BuildersKt__BuildersKt.runBlocking$default(null, new AnonymousClass1(companion, this, db, booleanRef3, null), 1, null);
                Handler handler3 = this.handler;
                if (handler3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("handler");
                } else {
                    handler2 = handler3;
                }
                handler2.removeMessages(this.HANDLER_MSG_WHAT_ID);
                FitnessServerSyncer.DefaultImpls.syncWithServer$default(FitnessDataExtKt.getInstance(FitnessServerSyncer.INSTANCE), false, "migration_old_health", null, 4, null);
                long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
                long minTimestamp2 = companion.getMinTimestamp();
                long maxTimestamp = companion.getMaxTimestamp();
                long j = maxTimestamp - minTimestamp2;
                long millis = j / TimeUnit.DAYS.toMillis(1L);
                FitnessLogUtils.e(this.TAG, "onAsyncCreate: migration duration = " + jCurrentTimeMillis2 + " ms, days = " + millis + ",dataDuration = " + j + ", minTime = " + minTimestamp2 + ", maxTime = " + maxTimestamp);
                if (minTimestamp2 == Long.MAX_VALUE || maxTimestamp == Long.MIN_VALUE) {
                    miHealthMigrationCallback = this;
                } else {
                    OneTrackExtKt.getInstance(IOnetrack.INSTANCE).reportData(new OneTrackStatBean("connect_v3", "56.42.2.1.16848"), "name", "local_transfer", "result", Boolean.valueOf(booleanRef3.element), "count", Integer.valueOf(i2), "duration_msec", Long.valueOf(jCurrentTimeMillis2), "duration_day", Long.valueOf(millis), "error_info", "success");
                    miHealthMigrationCallback = this;
                    SharedPreferences.Editor editorEdit = miHealthMigrationCallback.spf.edit();
                    editorEdit.putLong("minTime", minTimestamp2);
                    editorEdit.putLong("maxTime", maxTimestamp);
                    editorEdit.putLong("days", millis);
                    editorEdit.putInt(miHealthMigrationCallback.KEY_COUNT, 1 + i2);
                    editorEdit.apply();
                }
            } catch (Exception e) {
                e = e;
                booleanRef = booleanRef3;
                i = i2;
                str2 = "onAsyncCreate: migration duration = ";
                str = " ms, days = ";
                try {
                    booleanRef.element = false;
                    String str4 = this.TAG;
                    StringBuilder sb = new StringBuilder();
                    try {
                        sb.append("onAsyncCreate: error ");
                        sb.append(i);
                        FitnessLogUtils.e(str4, sb.toString(), e);
                        String string = e.toString();
                        Handler handler4 = this.handler;
                        if (handler4 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("handler");
                            handler4 = null;
                        }
                        handler4.removeMessages(this.HANDLER_MSG_WHAT_ID);
                        FitnessServerSyncer.DefaultImpls.syncWithServer$default(FitnessDataExtKt.getInstance(FitnessServerSyncer.INSTANCE), false, "migration_old_health", null, 4, null);
                        long jCurrentTimeMillis3 = System.currentTimeMillis() - jCurrentTimeMillis;
                        long minTimestamp3 = companion.getMinTimestamp();
                        Ref.BooleanRef booleanRef4 = booleanRef;
                        long maxTimestamp2 = companion.getMaxTimestamp();
                        long j2 = maxTimestamp2 - minTimestamp3;
                        long millis2 = j2 / TimeUnit.DAYS.toMillis(1L);
                        FitnessLogUtils.e(this.TAG, str2 + jCurrentTimeMillis3 + str + millis2 + ",dataDuration = " + j2 + ", minTime = " + minTimestamp3 + ", maxTime = " + maxTimestamp2);
                        if (minTimestamp3 == Long.MAX_VALUE || maxTimestamp2 == Long.MIN_VALUE) {
                            return;
                        }
                        OneTrackExtKt.getInstance(IOnetrack.INSTANCE).reportData(new OneTrackStatBean("connect_v3", "56.42.2.1.16848"), "name", "local_transfer", "result", Boolean.valueOf(booleanRef4.element), "count", Integer.valueOf(i), "duration_msec", Long.valueOf(jCurrentTimeMillis3), "duration_day", Long.valueOf(millis2), "error_info", string);
                        SharedPreferences.Editor editorEdit2 = this.spf.edit();
                        editorEdit2.putLong("minTime", minTimestamp3);
                        editorEdit2.putLong("maxTime", maxTimestamp2);
                        editorEdit2.putLong("days", millis2);
                        editorEdit2.putInt(this.KEY_COUNT, 1 + i);
                        editorEdit2.apply();
                    } catch (Throwable th2) {
                        th = th2;
                        booleanRef2 = booleanRef;
                        str3 = "days";
                        handler = this.handler;
                        if (handler == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("handler");
                            handler = null;
                        }
                        handler.removeMessages(this.HANDLER_MSG_WHAT_ID);
                        FitnessServerSyncer.DefaultImpls.syncWithServer$default(FitnessDataExtKt.getInstance(FitnessServerSyncer.INSTANCE), false, "migration_old_health", null, 4, null);
                        long jCurrentTimeMillis4 = System.currentTimeMillis() - jCurrentTimeMillis;
                        th = th;
                        minTimestamp = companion.getMinTimestamp();
                        String str5 = str3;
                        long maxTimestamp3 = companion.getMaxTimestamp();
                        long j3 = maxTimestamp3 - minTimestamp;
                        long millis3 = j3 / TimeUnit.DAYS.toMillis(1L);
                        FitnessLogUtils.e(this.TAG, str2 + jCurrentTimeMillis4 + str + millis3 + ",dataDuration = " + j3 + ", minTime = " + minTimestamp + ", maxTime = " + maxTimestamp3);
                        if (minTimestamp != Long.MAX_VALUE) {
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    str3 = r8;
                    booleanRef2 = booleanRef;
                    handler = this.handler;
                    if (handler == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("handler");
                        handler = null;
                    }
                    handler.removeMessages(this.HANDLER_MSG_WHAT_ID);
                    FitnessServerSyncer.DefaultImpls.syncWithServer$default(FitnessDataExtKt.getInstance(FitnessServerSyncer.INSTANCE), false, "migration_old_health", null, 4, null);
                    long jCurrentTimeMillis5 = System.currentTimeMillis() - jCurrentTimeMillis;
                    th = th;
                    minTimestamp = companion.getMinTimestamp();
                    String str6 = str3;
                    long maxTimestamp4 = companion.getMaxTimestamp();
                    long j4 = maxTimestamp4 - minTimestamp;
                    long millis4 = j4 / TimeUnit.DAYS.toMillis(1L);
                    FitnessLogUtils.e(this.TAG, str2 + jCurrentTimeMillis5 + str + millis4 + ",dataDuration = " + j4 + ", minTime = " + minTimestamp + ", maxTime = " + maxTimestamp4);
                    if (minTimestamp != Long.MAX_VALUE || maxTimestamp4 == Long.MIN_VALUE) {
                        throw th;
                    }
                    OneTrackExtKt.getInstance(IOnetrack.INSTANCE).reportData(new OneTrackStatBean("connect_v3", "56.42.2.1.16848"), "name", "local_transfer", "result", Boolean.valueOf(booleanRef2.element), "count", Integer.valueOf(i), "duration_msec", Long.valueOf(jCurrentTimeMillis5), "duration_day", Long.valueOf(millis4), "error_info", "success");
                    SharedPreferences.Editor editorEdit3 = this.spf.edit();
                    editorEdit3.putLong("minTime", minTimestamp);
                    editorEdit3.putLong("maxTime", maxTimestamp4);
                    editorEdit3.putLong(str6, millis4);
                    editorEdit3.putInt(this.KEY_COUNT, 1 + i);
                    editorEdit3.apply();
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
                booleanRef = booleanRef3;
                i = i2;
                str2 = "onAsyncCreate: migration duration = ";
                str = " ms, days = ";
                str3 = r8;
                booleanRef2 = booleanRef;
                handler = this.handler;
                if (handler == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("handler");
                    handler = null;
                }
                handler.removeMessages(this.HANDLER_MSG_WHAT_ID);
                FitnessServerSyncer.DefaultImpls.syncWithServer$default(FitnessDataExtKt.getInstance(FitnessServerSyncer.INSTANCE), false, "migration_old_health", null, 4, null);
                long jCurrentTimeMillis6 = System.currentTimeMillis() - jCurrentTimeMillis;
                th = th;
                minTimestamp = companion.getMinTimestamp();
                String str7 = str3;
                long maxTimestamp5 = companion.getMaxTimestamp();
                long j5 = maxTimestamp5 - minTimestamp;
                long millis5 = j5 / TimeUnit.DAYS.toMillis(1L);
                FitnessLogUtils.e(this.TAG, str2 + jCurrentTimeMillis6 + str + millis5 + ",dataDuration = " + j5 + ", minTime = " + minTimestamp + ", maxTime = " + maxTimestamp5);
                if (minTimestamp != Long.MAX_VALUE) {
                }
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
            booleanRef = booleanRef3;
            str = " ms, days = ";
            str2 = "onAsyncCreate: migration duration = ";
            i = i2;
        } catch (Throwable th5) {
            th = th5;
            booleanRef = booleanRef3;
            str = " ms, days = ";
            str2 = "onAsyncCreate: migration duration = ";
            i = i2;
        }
    }

    @Override // defpackage.el1, androidx.room.RoomDatabase.Callback
    public void onOpen(@NotNull SupportSQLiteDatabase db) {
        Intrinsics.checkNotNullParameter(db, "db");
        super.onOpen(db);
        if (isMigrateSucc(db)) {
            ExecutorHelper.runInBackground(new Runnable() { // from class: com.xiaomi.fitness.migration.MiHealthMigrationCallback$onOpen$$inlined$Runnable$1
                @Override // java.lang.Runnable
                public final void run() {
                    FitnessLogUtils.i(this.this$0.TAG, "MiHealthMigration: migrate success and process sleep audio");
                    SleepAudioMigrateUtils.Companion.getInstance().migrateOldHealthSleepData();
                }
            });
        }
    }
}
