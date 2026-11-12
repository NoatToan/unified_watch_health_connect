package com.huami.snore.core.helper;

import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;
import android.os.Build;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import com.huami.snore.core.domain.RecorderConfig;
import com.huami.snore.core.domain.SnoreConstant;
import com.huami.snore.core.manager.SnoreDataManager;
import com.huami.snore.core.service.SnoreRecordService;
import com.huami.snore.core.util.DateParseUtilKt;
import com.huami.snore.core.util.SnoreSpCache;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import java.util.Date;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u0000 \u00172\u00020\u0001:\u0002\u0017\tB\u0007¢\u0006\u0004\b\u0015\u0010\u0016J&\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0002J\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\r\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0002J\u0010\u0010\u000f\u001a\u00020\u000e2\b\u0010\n\u001a\u0004\u0018\u00010\u0002J\u0010\u0010\u0010\u001a\u00020\u000e2\b\u0010\n\u001a\u0004\u0018\u00010\u0002J\u000e\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0002R\u0016\u0010\u0014\u001a\u00020\u00128\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b\t\u0010\u0013¨\u0006\u0018"}, d2 = {"Lcom/huami/snore/core/helper/SnoreHelper;", "Lorg/koin/core/component/KoinComponent;", "Landroid/content/Context;", "activity", "Ljava/lang/Class;", "nxt", "Lcom/huami/snore/core/domain/RecorderConfig;", "config", "Landroid/content/Intent;", "a", DbUtils.Const.Table.CONTEXT, "", "startRecorder", "stopRecorder", "", "isFmActive", "isTelephonyCalling", "abnormalFinishDeleteData", "", "Ljava/lang/String;", "mTag", "<init>", "()V", "Companion", "snore_release"}, k = 1, mv = {1, 5, 1})
public final class SnoreHelper implements KoinComponent {

    @NotNull
    public static final String RECORDER_CONFIG = "recorder_config";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final String mTag = "SnoreHelper";

    @JvmField
    @NotNull
    public static final SnoreHelper instance = a.a.a();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"com/huami/snore/core/helper/SnoreHelper$a", "", "Lcom/huami/snore/core/helper/SnoreHelper;", "b", "Lcom/huami/snore/core/helper/SnoreHelper;", "a", "()Lcom/huami/snore/core/helper/SnoreHelper;", "holder", "<init>", "()V", "snore_release"}, k = 1, mv = {1, 5, 1})
    public static final class a {

        @NotNull
        public static final a a = new a();

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        private static final SnoreHelper holder = new SnoreHelper();

        private a() {
        }

        @NotNull
        public final SnoreHelper a() {
            return holder;
        }
    }

    private final Intent a(Context activity, Class<?> nxt, RecorderConfig config) {
        Bundle bundle = new Bundle();
        bundle.putSerializable(RECORDER_CONFIG, config);
        return new Intent(activity, nxt).putExtras(bundle);
    }

    public static /* synthetic */ Intent b(SnoreHelper snoreHelper, Context context, Class cls, RecorderConfig recorderConfig, int i, Object obj) {
        if ((i & 4) != 0) {
            recorderConfig = new RecorderConfig();
        }
        return snoreHelper.a(context, cls, recorderConfig);
    }

    public static /* synthetic */ void startRecorder$default(SnoreHelper snoreHelper, Context context, RecorderConfig recorderConfig, int i, Object obj) {
        if ((i & 2) != 0) {
            recorderConfig = new RecorderConfig();
        }
        snoreHelper.startRecorder(context, recorderConfig);
    }

    public final void abnormalFinishDeleteData(@NotNull Context context) {
        SnoreSpCache.Companion companion = SnoreSpCache.INSTANCE;
        long jLoadLongCache = companion.getInstance().loadLongCache(context, SnoreConstant.SP_KEY_START_MONITOR);
        HMLog.i(this.mTag, "开始监测时间：  " + jLoadLongCache, new Object[0]);
        if (jLoadLongCache > 0 && !companion.getInstance().loadBooleanCache(context, SnoreConstant.SP_KEY_MORE_TEN_MINI)) {
            HMLog.i(this.mTag, "app异常结束后再进 清除监测时间小于10分钟的数据", new Object[0]);
            SnoreDataManager.instance.deleteWithinTimeData(DateParseUtilKt.timeStampToDate(Long.valueOf(jLoadLongCache)), new Date());
        }
        companion.getInstance().removeShareCache(context, SnoreConstant.SP_KEY_START_MONITOR);
        companion.getInstance().removeShareCache(context, SnoreConstant.SP_KEY_MORE_TEN_MINI);
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }

    public final boolean isFmActive(@Nullable Context context) {
        if (context == null) {
            return false;
        }
        Object systemService = context.getSystemService("audio");
        Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.media.AudioManager");
        return ((AudioManager) systemService).isMusicActive();
    }

    public final boolean isTelephonyCalling(@Nullable Context context) {
        if (context == null) {
            return false;
        }
        Object systemService = context.getSystemService("phone");
        Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.telephony.TelephonyManager");
        TelephonyManager telephonyManager = (TelephonyManager) systemService;
        return 2 == telephonyManager.getCallState() || 1 == telephonyManager.getCallState();
    }

    public final void startRecorder(@NotNull Context context, @NotNull RecorderConfig config) {
        if (Build.VERSION.SDK_INT >= 26) {
            context.startForegroundService(a(context, SnoreRecordService.class, config));
        } else {
            context.startService(a(context, SnoreRecordService.class, config));
        }
    }

    public final void stopRecorder(@NotNull Context context) {
        context.stopService(new Intent(context, (Class<?>) SnoreRecordService.class));
    }
}
