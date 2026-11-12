package com.huami.moving.ui.watermark;

import android.content.Context;
import com.google.firebase.crashlytics.internal.settings.network.DefaultSettingsSpiCall;
import com.huami.tools.analytics.DbUtils;
import com.huami.treadmill.ui.tdmillhome.TdmillHmFragment;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0011\u0018\u0000 \u001c2\u00020\u0001:\u0002\u001c\u001dB\t\b\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J \u0010\u000f\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016J\b\u0010\u0010\u001a\u00020\u0004H\u0016J(\u0010\u0013\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0006H\u0016R\"\u0010\u0014\u001a\u00020\u00018\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006\u001e"}, d2 = {"Lcom/huami/moving/ui/watermark/WatermarkClient;", "Lcom/huami/moving/ui/watermark/WatermarkDelegate;", "", "name", "", "setDeviceName", "", "from", "setFromSportSummary", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "trackId", "", "source", "startWatermarkActivity", "requestWatermarkApi", "sportType", TdmillHmFragment.ARG_IS_METRIC, "fillDataToValueMap", "delegate", "Lcom/huami/moving/ui/watermark/WatermarkDelegate;", "getDelegate", "()Lcom/huami/moving/ui/watermark/WatermarkDelegate;", "setDelegate", "(Lcom/huami/moving/ui/watermark/WatermarkDelegate;)V", "<init>", "()V", "Companion", "a", "moving_release"}, k = 1, mv = {1, 5, 1})
public final class WatermarkClient implements WatermarkDelegate {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final WatermarkClient a = a.a.a();
    public WatermarkDelegate delegate;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0019\u0010\u0003\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/huami/moving/ui/watermark/WatermarkClient$Companion;", "", "Lcom/huami/moving/ui/watermark/WatermarkClient;", DefaultSettingsSpiCall.n, "Lcom/huami/moving/ui/watermark/WatermarkClient;", "getInstance", "()Lcom/huami/moving/ui/watermark/WatermarkClient;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final WatermarkClient getInstance() {
            return WatermarkClient.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"com/huami/moving/ui/watermark/WatermarkClient$a", "", "Lcom/huami/moving/ui/watermark/WatermarkClient;", "b", "Lcom/huami/moving/ui/watermark/WatermarkClient;", "a", "()Lcom/huami/moving/ui/watermark/WatermarkClient;", "holder", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class a {

        @NotNull
        public static final a a = new a();

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        private static final WatermarkClient holder = new WatermarkClient(null);

        private a() {
        }

        @NotNull
        public final WatermarkClient a() {
            return holder;
        }
    }

    private WatermarkClient() {
    }

    public /* synthetic */ WatermarkClient(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @Override // com.huami.moving.ui.watermark.WatermarkDelegate
    public void fillDataToValueMap(long trackId, int source, int sportType, boolean isMetric) {
        getDelegate().fillDataToValueMap(trackId, source, sportType, isMetric);
    }

    @NotNull
    public final WatermarkDelegate getDelegate() {
        WatermarkDelegate watermarkDelegate = this.delegate;
        Objects.requireNonNull(watermarkDelegate);
        return watermarkDelegate;
    }

    @Override // com.huami.moving.ui.watermark.WatermarkDelegate
    public void requestWatermarkApi() {
        getDelegate().requestWatermarkApi();
    }

    public final void setDelegate(@NotNull WatermarkDelegate watermarkDelegate) {
        this.delegate = watermarkDelegate;
    }

    @Override // com.huami.moving.ui.watermark.WatermarkDelegate
    public void setDeviceName(@NotNull String name) {
        getDelegate().setDeviceName(name);
    }

    @Override // com.huami.moving.ui.watermark.WatermarkDelegate
    public void setFromSportSummary(boolean from) {
        getDelegate().setFromSportSummary(from);
    }

    @Override // com.huami.moving.ui.watermark.WatermarkDelegate
    public void startWatermarkActivity(@NotNull Context context, long trackId, int source) {
        getDelegate().startWatermarkActivity(context, trackId, source);
    }
}
