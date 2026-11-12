package com.xiaomi.fitness.migration;

import android.content.Context;
import com.google.gson.Gson;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fit.data.common.util.FitnessDateUtils;
import com.xiaomi.fit.fitness.export.api.FitnessDataGetter;
import com.xiaomi.fit.fitness.export.di.FitnessDataExtKt;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.migration.MigrationManager;
import com.xiaomi.fitness.migration.sleep.migration.a;
import defpackage.bbo;
import defpackage.ffo;
import defpackage.frc;
import defpackage.hqf;
import defpackage.mnb;
import defpackage.q6c;
import defpackage.qgr;
import defpackage.s03;
import defpackage.ztb;
import defpackage.zvg;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000 -2\u00020\u0001:\u0001-B\u0007¢\u0006\u0004\b+\u0010,J\r\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001b\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u000b\u0010\fR*\u0010\u000f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R*\u0010\u0015\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0010\u001a\u0004\b\u0016\u0010\u0012\"\u0004\b\u0017\u0010\u0014R\u001b\u0010\u001d\u001a\u00020\u00188FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001b\u0010 \u001a\u00020\u00188FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u001a\u001a\u0004\b\u001f\u0010\u001cR\u001b\u0010%\u001a\u00020!8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010\u001a\u001a\u0004\b#\u0010$R\u001b\u0010*\u001a\u00020&8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b'\u0010\u001a\u001a\u0004\b(\u0010)¨\u0006."}, d2 = {"Lcom/xiaomi/fitness/migration/MigrationManager;", "", "", "requestPhoneSid", "()Ljava/lang/String;", "Landroid/content/Context;", "context", "", "Lfrc;", "getDbTransformList", "(Landroid/content/Context;)Ljava/util/List;", "TAG", "Ljava/lang/String;", "", "value", "minTimestamp", "J", "getMinTimestamp", "()J", "setMinTimestamp", "(J)V", "maxTimestamp", "getMaxTimestamp", "setMaxTimestamp", "", "curTimeZoneOffsetInSecond$delegate", "Lkotlin/Lazy;", "getCurTimeZoneOffsetInSecond", "()I", "curTimeZoneOffsetInSecond", "curTimeZoneOffset15Min$delegate", "getCurTimeZoneOffset15Min", "curTimeZoneOffset15Min", "Lcom/google/gson/Gson;", "gson$delegate", "getGson", "()Lcom/google/gson/Gson;", "gson", "Lcom/xiaomi/fit/fitness/export/api/FitnessDataGetter;", "dbGetter$delegate", "getDbGetter", "()Lcom/xiaomi/fit/fitness/export/api/FitnessDataGetter;", "dbGetter", "<init>", "()V", "Companion", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class MigrationManager {

    @NotNull
    public static final String appSid = "xiaomiwear_app";

    @NotNull
    public static final String manualSid = "xiaomiwear_app_manually";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final MigrationManager instance = new MigrationManager();

    @NotNull
    private final String TAG = "DB_Trans";
    private long minTimestamp = Long.MAX_VALUE;
    private long maxTimestamp = Long.MIN_VALUE;

    /* JADX INFO: renamed from: curTimeZoneOffsetInSecond$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy curTimeZoneOffsetInSecond = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: mxf
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Integer.valueOf(FitnessDateUtils.getCurrentTZOffsetInSec());
        }
    });

    /* JADX INFO: renamed from: curTimeZoneOffset15Min$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy curTimeZoneOffset15Min = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: nxf
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Integer.valueOf(FitnessDateUtils.getCurrentTZOffsetIn15min());
        }
    });

    /* JADX INFO: renamed from: gson$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy gson = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: oxf
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return MigrationManager.gson_delegate$lambda$2();
        }
    });

    /* JADX INFO: renamed from: dbGetter$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy dbGetter = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: pxf
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return MigrationManager.dbGetter_delegate$lambda$3();
        }
    });

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/xiaomi/fitness/migration/MigrationManager$Companion;", "", "<init>", "()V", "instance", "Lcom/xiaomi/fitness/migration/MigrationManager;", "getInstance", "()Lcom/xiaomi/fitness/migration/MigrationManager;", "manualSid", "", "appSid", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final MigrationManager getInstance() {
            return MigrationManager.instance;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FitnessDataGetter dbGetter_delegate$lambda$3() {
        return FitnessDataExtKt.getInstance(FitnessDataGetter.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Gson gson_delegate$lambda$2() {
        return new Gson();
    }

    public final int getCurTimeZoneOffset15Min() {
        return ((Number) this.curTimeZoneOffset15Min.getValue()).intValue();
    }

    public final int getCurTimeZoneOffsetInSecond() {
        return ((Number) this.curTimeZoneOffsetInSecond.getValue()).intValue();
    }

    @NotNull
    public final FitnessDataGetter getDbGetter() {
        return (FitnessDataGetter) this.dbGetter.getValue();
    }

    @NotNull
    public final List<frc> getDbTransformList(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Objects.requireNonNull(context);
        String packageName = context.getPackageName();
        LinkedList linkedList = new LinkedList();
        Intrinsics.checkNotNull(packageName);
        if (!StringsKt__StringsKt.contains$default((CharSequence) packageName, (CharSequence) "com.mi.health", false, 2, (Object) null)) {
            return linkedList;
        }
        linkedList.add(new ffo(context));
        linkedList.add(new ztb(context));
        linkedList.add(new hqf(context));
        linkedList.add(new bbo(context));
        linkedList.add(new q6c(context));
        linkedList.add(new qgr(context));
        linkedList.add(new s03(context));
        linkedList.add(new mnb(context));
        linkedList.add(new zvg(context));
        linkedList.add(new a(context));
        linkedList.add(new OtherTransformation(context));
        return linkedList;
    }

    @NotNull
    public final Gson getGson() {
        return (Gson) this.gson.getValue();
    }

    public final long getMaxTimestamp() {
        return this.maxTimestamp;
    }

    public final long getMinTimestamp() {
        return this.minTimestamp;
    }

    @NotNull
    public final String requestPhoneSid() {
        String currentPhoneSid = DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentPhoneSid();
        if (currentPhoneSid.length() == 0) {
            currentPhoneSid = "fitness_app_sid";
        }
        FitnessLogUtils.i(this.TAG, "requestPhoneSid: sid = " + currentPhoneSid);
        return currentPhoneSid;
    }

    public final void setMaxTimestamp(long j) {
        if (this.maxTimestamp < j) {
            this.maxTimestamp = j;
        }
    }

    public final void setMinTimestamp(long j) {
        if (this.minTimestamp > j) {
            this.minTimestamp = j;
        }
    }
}
