package com.huami.snore.core.db;

import android.content.Context;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.room.TypeConverters;
import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import com.google.android.gms.fitness.data.WorkoutExercises;
import com.google.firebase.crashlytics.internal.settings.network.DefaultSettingsSpiCall;
import com.huami.snore.core.db.dao.DateConvert;
import com.huami.snore.core.db.dao.VoiceRecorderDao;
import com.huami.snore.core.db.dao.VoiceTypeConvert;
import com.huami.snore.core.db.entity.VoiceRecorderEntity;
import com.huami.tools.analytics.DbUtils;
import com.xmlywind.sdk.common.mta.PointCategory;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;
import kotlinx.coroutines.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@TypeConverters({DateConvert.class, VoiceTypeConvert.class})
@Database(entities = {VoiceRecorderEntity.class}, exportSchema = true, version = 2)
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b'\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\u0003\u001a\u00020\u0002J\b\u0010\u0005\u001a\u00020\u0004H&¨\u0006\t"}, d2 = {"Lcom/huami/snore/core/db/VoiceRecorderDB;", "Landroidx/room/RoomDatabase;", "", WorkoutExercises.CLEAN, "Lcom/huami/snore/core/db/dao/VoiceRecorderDao;", "voiceRecorderDao", "<init>", "()V", "Companion", "snore_release"}, k = 1, mv = {1, 5, 1})
public abstract class VoiceRecorderDB extends RoomDatabase {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String DB_NAME = "snore_dream_talk_data.db";

    @Nullable
    private static VoiceRecorderDB instance;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u000e\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0016\u0010\b\u001a\u00020\u00078\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0018\u0010\n\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/huami/snore/core/db/VoiceRecorderDB$Companion;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Lcom/huami/snore/core/db/VoiceRecorderDB;", "create", PointCategory.INIT, "", "DB_NAME", "Ljava/lang/String;", DefaultSettingsSpiCall.n, "Lcom/huami/snore/core/db/VoiceRecorderDB;", "<init>", "()V", "snore_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final VoiceRecorderDB create(Context context) {
            return (VoiceRecorderDB) Room.databaseBuilder(context, VoiceRecorderDB.class, VoiceRecorderDB.DB_NAME).addMigrations(new Migration() { // from class: com.huami.snore.core.db.VoiceRecorderDB$Companion$create$1
                @Override // androidx.room.migration.Migration
                public void migrate(@NotNull SupportSQLiteDatabase database) {
                    database.execSQL("ALTER TABLE voice_recorder_table ADD COLUMN uploaded INTEGER NOT NULL DEFAULT 0");
                }
            }).allowMainThreadQueries().build();
        }

        @NotNull
        public final synchronized VoiceRecorderDB init(@NotNull Context context) {
            if (VoiceRecorderDB.instance == null) {
                VoiceRecorderDB.instance = create(context);
            }
            return VoiceRecorderDB.instance;
        }
    }

    /* JADX INFO: renamed from: com.huami.snore.core.db.VoiceRecorderDB$clean$1, reason: invalid class name */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.snore.core.db.VoiceRecorderDB$clean$1", f = "VoiceRecorderDB.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int label;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return VoiceRecorderDB.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            a.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            try {
                VoiceRecorderDB unused = VoiceRecorderDB.instance;
                VoiceRecorderDB.this.voiceRecorderDao().clean();
            } catch (Throwable unused2) {
            }
            return Unit.INSTANCE;
        }
    }

    public final void clean() {
        e.f(GlobalScope.INSTANCE, Dispatchers.getIO(), null, new AnonymousClass1(null), 2, null);
    }

    @NotNull
    public abstract VoiceRecorderDao voiceRecorderDao();
}
