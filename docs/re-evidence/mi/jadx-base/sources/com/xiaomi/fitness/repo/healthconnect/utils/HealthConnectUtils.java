package com.xiaomi.fitness.repo.healthconnect.utils;

import android.content.Context;
import androidx.health.connect.client.HealthConnectClient;
import androidx.health.connect.client.PermissionController;
import com.xiaomi.fit.fitness.persist.db.internal.HealthConnectSyncDaoEntity;
import com.xiaomi.fitness.common.extensions.ListExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.repo.healthconnect.biz.daily.TimeRange;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005H\u0086@¢\u0006\u0002\u0010\u000bJ:\u0010\f\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\r0\u000e0\r2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000f0\r2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00100\rJ\u000e\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/xiaomi/fitness/repo/healthconnect/utils/HealthConnectUtils;", "", "<init>", "()V", "TAG", "", "hasPermission", "", "context", "Landroid/content/Context;", "permission", "(Landroid/content/Context;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "groupHealthConnectInfoByDays", "", "Lkotlin/Pair;", "Lcom/xiaomi/fitness/repo/healthconnect/biz/daily/TimeRange;", "Lcom/xiaomi/fit/fitness/persist/db/internal/HealthConnectSyncDaoEntity;", "timeRanges", "records", "isRangeSumType", "type", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nHealthConnectUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HealthConnectUtils.kt\ncom/xiaomi/fitness/repo/healthconnect/utils/HealthConnectUtils\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,65:1\n1863#2:66\n1872#2,3:67\n1863#2,2:70\n1864#2:72\n*S KotlinDebug\n*F\n+ 1 HealthConnectUtils.kt\ncom/xiaomi/fitness/repo/healthconnect/utils/HealthConnectUtils\n*L\n44#1:66\n46#1:67,3\n53#1:70,2\n44#1:72\n*E\n"})
public final class HealthConnectUtils {

    @NotNull
    public static final HealthConnectUtils INSTANCE = new HealthConnectUtils();

    @NotNull
    private static final String TAG = "HealthConnectUtils";

    /* JADX INFO: renamed from: com.xiaomi.fitness.repo.healthconnect.utils.HealthConnectUtils$hasPermission$1, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.repo.healthconnect.utils.HealthConnectUtils", f = "HealthConnectUtils.kt", i = {0}, l = {29}, m = "hasPermission", n = {"permission"}, s = {"L$0"})
    public static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
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
            return HealthConnectUtils.this.hasPermission(null, null, this);
        }
    }

    private HealthConnectUtils() {
    }

    @NotNull
    public final List<Pair<TimeRange, List<HealthConnectSyncDaoEntity>>> groupHealthConnectInfoByDays(@NotNull List<TimeRange> timeRanges, @NotNull List<HealthConnectSyncDaoEntity> records) {
        Intrinsics.checkNotNullParameter(timeRanges, "timeRanges");
        Intrinsics.checkNotNullParameter(records, "records");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (TimeRange timeRange : timeRanges) {
            ArrayList arrayList3 = new ArrayList();
            int i = 0;
            for (Object obj : records) {
                int i2 = i + 1;
                if (i < 0) {
                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                }
                HealthConnectSyncDaoEntity healthConnectSyncDaoEntity = (HealthConnectSyncDaoEntity) obj;
                if (healthConnectSyncDaoEntity.getTime() >= timeRange.getStartTimeStamp() && healthConnectSyncDaoEntity.getTime() <= timeRange.getEndTimeStamp()) {
                    arrayList2.add(Integer.valueOf(i));
                    arrayList3.add(healthConnectSyncDaoEntity);
                }
                i = i2;
            }
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                ListExtKt.remove(records, ((Number) it.next()).intValue());
            }
            arrayList.add(new Pair(timeRange, arrayList3));
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object hasPermission(@NotNull Context context, @NotNull String str, @NotNull Continuation<? super Boolean> continuation) {
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
        Object grantedPermissions = anonymousClass1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = anonymousClass1.label;
        boolean z = true;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(grantedPermissions);
                PermissionController permissionController = HealthConnectClient.Companion.getOrCreate$default(HealthConnectClient.INSTANCE, context, null, 2, null).getPermissionController();
                anonymousClass1.L$0 = str;
                anonymousClass1.label = 1;
                grantedPermissions = permissionController.getGrantedPermissions(anonymousClass1);
                if (grantedPermissions == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str = (String) anonymousClass1.L$0;
                ResultKt.throwOnFailure(grantedPermissions);
            }
            Set set = (Set) grantedPermissions;
            if (!(!set.isEmpty()) || !set.contains(str)) {
                z = false;
            }
            return Boxing.boxBoolean(z);
        } catch (Exception e) {
            Logger.e(TAG, "hasPermission exception: " + e.getMessage(), e);
            return Boxing.boxBoolean(false);
        }
    }

    public final boolean isRangeSumType(@NotNull String type) {
        Intrinsics.checkNotNullParameter(type, "type");
        return Intrinsics.areEqual(type, "step") || Intrinsics.areEqual(type, "calorie");
    }
}
