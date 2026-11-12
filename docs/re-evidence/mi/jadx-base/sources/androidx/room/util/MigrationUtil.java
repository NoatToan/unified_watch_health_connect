package androidx.room.util;

import androidx.annotation.RestrictTo;
import androidx.room.DatabaseConfiguration;
import androidx.room.RoomDatabase;
import androidx.room.migration.Migration;
import com.xiaomi.fitness.statistics.StatConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u0002\u001a\u001c\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0000\u001a\u001c\u0010\u0006\u001a\u00020\u0001*\u00020\u00072\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004H\u0000\u001a$\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b*\u00020\u00072\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0004H\u0000\u001a:\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b*\u00020\u00072\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\f0\u00112\u0006\u0010\u0012\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0004H\u0002¨\u0006\u0013"}, d2 = {"isMigrationRequired", "", "Landroidx/room/DatabaseConfiguration;", "fromVersion", "", "toVersion", "contains", "Landroidx/room/RoomDatabase$MigrationContainer;", "startVersion", "endVersion", "findMigrationPath", "", "Landroidx/room/migration/Migration;", StatConstants.PARAM_START, StatConstants.PARAM_END, "findUpMigrationPath", "result", "", "upgrade", "room-runtime_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
@JvmName(name = "MigrationUtil")
public final class MigrationUtil {
    public static final boolean contains(@NotNull RoomDatabase.MigrationContainer migrationContainer, int i, int i2) {
        Intrinsics.checkNotNullParameter(migrationContainer, "<this>");
        Map<Integer, Map<Integer, Migration>> migrations = migrationContainer.getMigrations();
        if (!migrations.containsKey(Integer.valueOf(i))) {
            return false;
        }
        Map<Integer, Migration> mapEmptyMap = migrations.get(Integer.valueOf(i));
        if (mapEmptyMap == null) {
            mapEmptyMap = MapsKt__MapsKt.emptyMap();
        }
        return mapEmptyMap.containsKey(Integer.valueOf(i2));
    }

    @Nullable
    public static final List<Migration> findMigrationPath(@NotNull RoomDatabase.MigrationContainer migrationContainer, int i, int i2) {
        Intrinsics.checkNotNullParameter(migrationContainer, "<this>");
        if (i == i2) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        return findUpMigrationPath(migrationContainer, new ArrayList(), i2 > i, i, i2);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0016  */
    /* JADX WARN: Code duplicated, block: B:15:0x002c  */
    /* JADX WARN: Code duplicated, block: B:27:0x0059 A[LOOP:0: B:2:0x0000->B:27:0x0059, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:31:0x0015 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:32:0x0058 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x003f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:35:0x0053 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x0038 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0009  */
    /* JADX WARN: Code duplicated, block: B:8:0x000e  */
    private static final List<Migration> findUpMigrationPath(RoomDatabase.MigrationContainer migrationContainer, List<Migration> list, boolean z, int i, int i2) {
        Pair<Map<Integer, Migration>, Iterable<Integer>> sortedNodes$room_runtime_release;
        Iterator<Integer> it;
        int iIntValue;
        boolean z2;
        while (true) {
            if (z) {
                if (i >= i2) {
                    break;
                }
                if (z) {
                    sortedNodes$room_runtime_release = migrationContainer.getSortedDescendingNodes$room_runtime_release(i);
                } else {
                    sortedNodes$room_runtime_release = migrationContainer.getSortedNodes$room_runtime_release(i);
                }
                if (sortedNodes$room_runtime_release == null) {
                    return null;
                }
                Map<Integer, Migration> mapComponent1 = sortedNodes$room_runtime_release.component1();
                it = sortedNodes$room_runtime_release.component2().iterator();
                while (true) {
                    if (it.hasNext()) {
                        iIntValue = i;
                        z2 = false;
                        break;
                    }
                    iIntValue = it.next().intValue();
                    if (!z) {
                        if (i2 <= iIntValue && iIntValue < i) {
                            Migration migration = mapComponent1.get(Integer.valueOf(iIntValue));
                            Intrinsics.checkNotNull(migration);
                            list.add(migration);
                            z2 = true;
                            break;
                        }
                    } else if (i + 1 <= iIntValue && iIntValue <= i2) {
                        Migration migration2 = mapComponent1.get(Integer.valueOf(iIntValue));
                        Intrinsics.checkNotNull(migration2);
                        list.add(migration2);
                        z2 = true;
                        break;
                    }
                }
                if (!z2) {
                    return null;
                }
                i = iIntValue;
            } else {
                if (i <= i2) {
                    break;
                }
                if (z) {
                    sortedNodes$room_runtime_release = migrationContainer.getSortedDescendingNodes$room_runtime_release(i);
                } else {
                    sortedNodes$room_runtime_release = migrationContainer.getSortedNodes$room_runtime_release(i);
                }
                if (sortedNodes$room_runtime_release == null) {
                    return null;
                }
                Map<Integer, Migration> mapComponent2 = sortedNodes$room_runtime_release.component1();
                it = sortedNodes$room_runtime_release.component2().iterator();
                while (true) {
                    if (it.hasNext()) {
                        iIntValue = i;
                        z2 = false;
                        break;
                    }
                    iIntValue = it.next().intValue();
                    if (!z) {
                        if (i + 1 <= iIntValue) {
                            continue;
                        }
                    } else if (i2 <= iIntValue) {
                        continue;
                    }
                }
                if (!z2) {
                    return null;
                }
                i = iIntValue;
            }
        }
        return list;
    }

    public static final boolean isMigrationRequired(@NotNull DatabaseConfiguration databaseConfiguration, int i, int i2) {
        Intrinsics.checkNotNullParameter(databaseConfiguration, "<this>");
        if (i > i2 && databaseConfiguration.allowDestructiveMigrationOnDowngrade) {
            return false;
        }
        Set<Integer> migrationNotRequiredFrom$room_runtime_release = databaseConfiguration.getMigrationNotRequiredFrom$room_runtime_release();
        if (databaseConfiguration.requireMigration) {
            return migrationNotRequiredFrom$room_runtime_release == null || !migrationNotRequiredFrom$room_runtime_release.contains(Integer.valueOf(i));
        }
        return false;
    }
}
