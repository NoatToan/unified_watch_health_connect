package com.xiaomi.hm.health.firstbeat;

import android.app.Application;
import android.content.Context;
import com.huami.devicex.funapi.DeviceXFunctionsKt;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.huami.watch.dataflow.cloud.api.FirstbeatDataAPI;
import com.huami.watch.dataflow.sync.bean.FirstbeatData;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlin.text.m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/xiaomi/hm/health/firstbeat/FirstbeatApi;", "", "<init>", "()V", "Companion", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class FirstbeatApi {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String TAG = "FirstbeatApi";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u001e\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002J\u001e\u0010\f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002J\u000e\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\rR\u0016\u0010\u0010\u001a\u00020\u00048\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Lcom/xiaomi/hm/health/firstbeat/FirstbeatApi$Companion;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "firstbeatConfig", "", "a", "", "Lcom/huami/watch/dataflow/sync/bean/FirstbeatData$Item;", "items", "c", "b", "Lcom/huami/watch/dataflow/sync/bean/FirstbeatData;", "firstbeatData", "postToServer", "TAG", "Ljava/lang/String;", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {

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
                return "FirstbeatConfig Item: " + this.a;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class b extends Lambda implements Function0<String> {
            public final /* synthetic */ FirstbeatData.Item a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(FirstbeatData.Item item) {
                super(0);
                this.a = item;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "SportThaInfo Item: " + this.a;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class c extends Lambda implements Function0<String> {
            public final /* synthetic */ FirstbeatData.Item a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(FirstbeatData.Item item) {
                super(0);
                this.a = item;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "VO2max Item: " + this.a;
            }
        }

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final boolean a(Context context, String firstbeatConfig) {
            if (!m.isBlank(firstbeatConfig)) {
                return true;
            }
            HMLog.info(FirstbeatApi.TAG, new a(firstbeatConfig));
            return FirstbeatDataAPI.postConfig(context, firstbeatConfig);
        }

        private final boolean b(Context context, List<? extends FirstbeatData.Item> items) {
            boolean zPostSportLoad = true;
            for (FirstbeatData.Item item : items) {
                HMLog.info(FirstbeatApi.TAG, new b(item));
                zPostSportLoad = FirstbeatDataAPI.postSportLoad(context, item.getData());
                if (!zPostSportLoad) {
                    break;
                }
            }
            return zPostSportLoad;
        }

        private final boolean c(Context context, List<? extends FirstbeatData.Item> items) {
            boolean zPostVO2max = true;
            for (FirstbeatData.Item item : items) {
                HMLog.info(FirstbeatApi.TAG, new c(item));
                zPostVO2max = FirstbeatDataAPI.postVO2max(context, item.getData());
                if (!zPostVO2max) {
                    break;
                }
            }
            return zPostVO2max;
        }

        public final boolean postToServer(@NotNull FirstbeatData firstbeatData) {
            Application context = DeviceXFunctionsKt.getContext();
            return a(context, firstbeatData.firstbeatconfig) && c(context, firstbeatData.getVo2max()) && b(context, firstbeatData.getSportThaInfo());
        }
    }
}
