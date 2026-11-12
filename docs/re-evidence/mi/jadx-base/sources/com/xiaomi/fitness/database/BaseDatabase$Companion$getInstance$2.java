package com.xiaomi.fitness.database;

import android.content.Context;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 176)
public final class BaseDatabase$Companion$getInstance$2<T> implements Function1<Context, T> {
    final /* synthetic */ Function1<RoomDatabase.Builder<T>, Unit> $block;
    final /* synthetic */ String $name;

    /* JADX WARN: Multi-variable type inference failed */
    public BaseDatabase$Companion$getInstance$2(String str, Function1<? super RoomDatabase.Builder<T>, Unit> function1) {
        this.$name = str;
        this.$block = function1;
    }

    /* JADX WARN: Incorrect return type in method signature: (Landroid/content/Context;)TT; */
    @Override // kotlin.jvm.functions.Function1
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final BaseDatabase invoke2(Context it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Context safeContext = ApplicationExtKt.getSafeContext(it);
        Intrinsics.reifiedOperationMarker(4, "T");
        RoomDatabase.Builder<T> builderDatabaseBuilder = Room.databaseBuilder(safeContext, BaseDatabase.class, this.$name);
        this.$block.invoke2(builderDatabaseBuilder);
        return (BaseDatabase) builderDatabaseBuilder.allowMainThreadQueries().build();
    }
}
