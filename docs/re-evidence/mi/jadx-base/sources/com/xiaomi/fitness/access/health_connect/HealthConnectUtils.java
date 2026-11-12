package com.xiaomi.fitness.access.health_connect;

import android.content.Context;
import androidx.health.connect.client.HealthConnectClient;
import androidx.health.connect.client.PermissionController;
import androidx.health.connect.client.permission.HealthPermission;
import androidx.health.connect.client.records.ActiveCaloriesBurnedRecord;
import androidx.health.connect.client.records.DistanceRecord;
import androidx.health.connect.client.records.ElevationGainedRecord;
import androidx.health.connect.client.records.ExerciseSessionRecord;
import androidx.health.connect.client.records.HeartRateRecord;
import androidx.health.connect.client.records.OxygenSaturationRecord;
import androidx.health.connect.client.records.SleepSessionRecord;
import androidx.health.connect.client.records.SpeedRecord;
import androidx.health.connect.client.records.StepsCadenceRecord;
import androidx.health.connect.client.records.StepsRecord;
import com.miui.tsmclient.common.net.NetConstants;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.log.Logger;
import defpackage.eni;
import defpackage.mzi;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.collections.SetsKt__SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013J\u0016\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0086@¢\u0006\u0002\u0010\u0015R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR)\u0010\n\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\r0\f0\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0016"}, d2 = {"Lcom/xiaomi/fitness/access/health_connect/HealthConnectUtils;", "", "<init>", "()V", "TAG", "", "PERMISSIONS", "", "getPERMISSIONS", "()Ljava/util/Set;", "PERMISSION_2_DESC", "", "Lkotlin/Pair;", "", "getPERMISSION_2_DESC", "()Ljava/util/Map;", "isHealthConnectInstalled", "", "context", "Landroid/content/Context;", "hasHealthConnectAuthed", "(Landroid/content/Context;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "access_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class HealthConnectUtils {

    @NotNull
    public static final HealthConnectUtils INSTANCE = new HealthConnectUtils();

    @NotNull
    private static final Set<String> PERMISSIONS;

    @NotNull
    private static final Map<String, Pair<String, Integer>> PERMISSION_2_DESC;

    @NotNull
    private static final String TAG = "HealthConnectUtils";

    /* JADX INFO: renamed from: com.xiaomi.fitness.access.health_connect.HealthConnectUtils$hasHealthConnectAuthed$1, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.access.health_connect.HealthConnectUtils", f = "HealthConnectUtils.kt", i = {0}, l = {95}, m = "hasHealthConnectAuthed", n = {NetConstants.AUTH_TYPE_AUTHED}, s = {"I$0"})
    public static final class AnonymousClass1 extends ContinuationImpl {
        int I$0;
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
            return HealthConnectUtils.this.hasHealthConnectAuthed(null, this);
        }
    }

    static {
        HealthPermission.Companion companion = HealthPermission.INSTANCE;
        PERMISSIONS = SetsKt__SetsKt.setOf((Object[]) new String[]{companion.getWritePermission(Reflection.getOrCreateKotlinClass(StepsRecord.class)), companion.getWritePermission(Reflection.getOrCreateKotlinClass(OxygenSaturationRecord.class)), companion.getWritePermission(Reflection.getOrCreateKotlinClass(HeartRateRecord.class)), companion.getWritePermission(Reflection.getOrCreateKotlinClass(ActiveCaloriesBurnedRecord.class)), companion.getWritePermission(Reflection.getOrCreateKotlinClass(ExerciseSessionRecord.class)), companion.getWritePermission(Reflection.getOrCreateKotlinClass(SpeedRecord.class)), companion.getWritePermission(Reflection.getOrCreateKotlinClass(StepsCadenceRecord.class)), companion.getWritePermission(Reflection.getOrCreateKotlinClass(SleepSessionRecord.class)), HealthPermission.PERMISSION_WRITE_EXERCISE_ROUTE, companion.getWritePermission(Reflection.getOrCreateKotlinClass(ElevationGainedRecord.class)), companion.getWritePermission(Reflection.getOrCreateKotlinClass(DistanceRecord.class))});
        PERMISSION_2_DESC = MapsKt__MapsKt.mapOf(TuplesKt.to(companion.getWritePermission(Reflection.getOrCreateKotlinClass(StepsRecord.class)), new Pair(ResourceExtKt.getString(mzi.u), Integer.valueOf(eni.h))), TuplesKt.to(companion.getWritePermission(Reflection.getOrCreateKotlinClass(OxygenSaturationRecord.class)), new Pair(ResourceExtKt.getString(mzi.t), Integer.valueOf(eni.n))), TuplesKt.to(companion.getWritePermission(Reflection.getOrCreateKotlinClass(HeartRateRecord.class)), new Pair(ResourceExtKt.getString(mzi.q), Integer.valueOf(eni.f16846k))), TuplesKt.to(companion.getWritePermission(Reflection.getOrCreateKotlinClass(ActiveCaloriesBurnedRecord.class)), new Pair(ResourceExtKt.getString(mzi.l), Integer.valueOf(eni.g))), TuplesKt.to(companion.getWritePermission(Reflection.getOrCreateKotlinClass(ExerciseSessionRecord.class)), new Pair(ResourceExtKt.getString(mzi.o), Integer.valueOf(eni.h))), TuplesKt.to(companion.getWritePermission(Reflection.getOrCreateKotlinClass(SpeedRecord.class)), new Pair(ResourceExtKt.getString(mzi.s), Integer.valueOf(eni.m))), TuplesKt.to(companion.getWritePermission(Reflection.getOrCreateKotlinClass(StepsCadenceRecord.class)), new Pair(ResourceExtKt.getString(mzi.v), Integer.valueOf(eni.f))), TuplesKt.to(companion.getWritePermission(Reflection.getOrCreateKotlinClass(SleepSessionRecord.class)), new Pair(ResourceExtKt.getString(mzi.f27382r), Integer.valueOf(eni.l))), TuplesKt.to(HealthPermission.PERMISSION_WRITE_EXERCISE_ROUTE, new Pair(ResourceExtKt.getString(mzi.p), Integer.valueOf(eni.h))), TuplesKt.to(companion.getWritePermission(Reflection.getOrCreateKotlinClass(ElevationGainedRecord.class)), new Pair(ResourceExtKt.getString(mzi.n), Integer.valueOf(eni.j))), TuplesKt.to(companion.getWritePermission(Reflection.getOrCreateKotlinClass(DistanceRecord.class)), new Pair(ResourceExtKt.getString(mzi.m), Integer.valueOf(eni.i))));
    }

    private HealthConnectUtils() {
    }

    @NotNull
    public final Set<String> getPERMISSIONS() {
        return PERMISSIONS;
    }

    @NotNull
    public final Map<String, Pair<String, Integer>> getPERMISSION_2_DESC() {
        return PERMISSION_2_DESC;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object hasHealthConnectAuthed(@NotNull Context context, @NotNull Continuation<? super Boolean> continuation) {
        AnonymousClass1 anonymousClass1;
        int i;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            int i2 = anonymousClass1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i2 - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(continuation);
        }
        Object grantedPermissions = anonymousClass1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = anonymousClass1.label;
        if (i3 == 0) {
            ResultKt.throwOnFailure(grantedPermissions);
            try {
                PermissionController permissionController = HealthConnectClient.Companion.getOrCreate$default(HealthConnectClient.INSTANCE, context, null, 2, null).getPermissionController();
                anonymousClass1.I$0 = 0;
                anonymousClass1.label = 1;
                grantedPermissions = permissionController.getGrantedPermissions(anonymousClass1);
                if (grantedPermissions == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } catch (Exception e) {
                e = e;
                i = 0;
                Logger.e(TAG, "hasHealthConnectAuthed exception: " + e.getMessage(), e);
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i = anonymousClass1.I$0;
            try {
                ResultKt.throwOnFailure(grantedPermissions);
            } catch (Exception e2) {
                e = e2;
                Logger.e(TAG, "hasHealthConnectAuthed exception: " + e.getMessage(), e);
            }
        }
        i = !((Set) grantedPermissions).isEmpty() ? 1 : 0;
        return Boxing.boxBoolean(i != 0);
    }

    public final boolean isHealthConnectInstalled(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return HealthConnectClient.Companion.getSdkStatus$default(HealthConnectClient.INSTANCE, context, null, 2, null) == 3;
    }
}
