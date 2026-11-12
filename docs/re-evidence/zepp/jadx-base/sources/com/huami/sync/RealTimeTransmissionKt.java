package com.huami.sync;

import android.app.Application;
import com.huami.sync.job.Logger;
import com.huami.sync.job.Logging;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.huami.watch.notification.TransportUri;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes14.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a'\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0002\b\u0005¨\u0006\b"}, d2 = {"Landroid/app/Application;", DbUtils.Const.Table.CONTEXT, "Lkotlin/Function1;", "Lcom/huami/sync/Config;", "", "Lkotlin/ExtensionFunctionType;", TransportUri.ACTION_BLOCK, "realtimeTransmission", "realtime_transmission_release"}, k = 2, mv = {1, 5, 1})
public final class RealTimeTransmissionKt {
    public static final void realtimeTransmission(@NotNull Application application, @NotNull Function1<? super Config, Unit> function1) {
        Logging.INSTANCE.setLogger$realtime_transmission_release(new Logger() { // from class: com.huami.sync.RealTimeTransmissionKt.realtimeTransmission.1

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            @NotNull
            private final String TAG = "RealTimeTransmission";

            /* JADX INFO: renamed from: com.huami.sync.RealTimeTransmissionKt$realtimeTransmission$1$a */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class a extends Lambda implements Function0<String> {
                public final /* synthetic */ String a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(String str) {
                    super(0);
                    this.a = str;
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                public final String invoke() {
                    return this.a;
                }
            }

            @NotNull
            public final String getTAG() {
                return this.TAG;
            }

            @Override // com.huami.sync.job.Logger
            public void log(@Nullable String message) {
                HMLog.info(this.TAG, new a(message));
            }
        });
        function1.invoke(Config.INSTANCE);
        RealTimeTransmission.INSTANCE.init(application);
    }
}
