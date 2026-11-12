package defpackage;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.hm.health.bt.profile.sport.IHMSportListener;
import com.xiaomi.hm.health.bt.profile.sport.SportCommand;
import com.xiaomi.hm.health.bt.profile.sport.SportConfig;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH&¢\u0006\u0004\b\u0007\u0010\rJ!\u0010\u000e\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH&¢\u0006\u0004\b\u000e\u0010\rJ\u000f\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\u0007\u0010\u000f¨\u0006\u0010"}, d2 = {"Laj;", "", "Lcom/xiaomi/hm/health/bt/profile/sport/SportConfig;", "sportConfig", "Lcom/xiaomi/hm/health/bt/profile/sport/IHMSportListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", PluginDeviceInfo.FMODEL, "(Lcom/xiaomi/hm/health/bt/profile/sport/SportConfig;Lcom/xiaomi/hm/health/bt/profile/sport/IHMSportListener;)V", "Lcom/xiaomi/hm/health/bt/profile/sport/SportCommand;", "command", "Lr6t;", "sportInfo", "(Lcom/xiaomi/hm/health/bt/profile/sport/SportCommand;Lr6t;)V", PluginDeviceInfo.FDESC, "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public interface aj {
    void a();

    void a(@NotNull SportCommand command, @Nullable r6t sportInfo);

    void a(@NotNull SportConfig sportConfig, @NotNull IHMSportListener listener);

    void b(@NotNull SportCommand command, @Nullable r6t sportInfo);
}
