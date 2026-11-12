package com.xiaomi.fitness.database;

import android.content.Context;
import androidx.room.RoomDatabase;
import com.xiaomi.fitness.common.utils.SingleHolder;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/xiaomi/fitness/database/BaseDatabase;", "Landroidx/room/RoomDatabase;", "<init>", "()V", "Companion", "database_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class BaseDatabase extends RoomDatabase {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JI\u0010\u0004\u001a\u0002H\u0005\"\n\b\u0000\u0010\u0005\u0018\u0001*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u001a\b\u0006\u0010\u000b\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00050\r\u0012\u0004\u0012\u00020\u000e0\fH\u0086\bø\u0001\u0000¢\u0006\u0002\u0010\u000f\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/fitness/database/BaseDatabase$Companion;", "", "<init>", "()V", "getInstance", "T", "Lcom/xiaomi/fitness/database/BaseDatabase;", "context", "Landroid/content/Context;", "name", "", "block", "Lkotlin/Function1;", "Landroidx/room/RoomDatabase$Builder;", "", "(Landroid/content/Context;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Lcom/xiaomi/fitness/database/BaseDatabase;", "database_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ BaseDatabase getInstance$default(Companion companion, Context context, String name, Function1 block, int i, Object obj) {
            if ((i & 4) != 0) {
                Intrinsics.needClassReification();
                block = BaseDatabase$Companion$getInstance$1.INSTANCE;
            }
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(block, "block");
            Intrinsics.needClassReification();
            return (BaseDatabase) new SingleHolder(new BaseDatabase$Companion$getInstance$2(name, block)).getInstance(context);
        }

        public final /* synthetic */ <T extends BaseDatabase> T getInstance(Context context, String name, Function1<? super RoomDatabase.Builder<T>, Unit> block) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(block, "block");
            Intrinsics.needClassReification();
            return (T) new SingleHolder(new BaseDatabase$Companion$getInstance$2(name, block)).getInstance(context);
        }
    }
}
