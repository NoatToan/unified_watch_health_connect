package com.huami.bluetooth.profile.channel.module.amc;

import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.bluetooth.profile.channel.ChannelApi;
import com.huami.bluetooth.profile.channel.module.BaseModule;
import com.huami.bluetooth.profile.channel.module.amc.impl.MusicControllerApiImpl;
import com.huami.bluetooth.profile.channel.module.annotation.ChannelModule;
import com.huami.bluetooth.profile.channel.module.base.IncreasePredict;
import com.huami.bluetooth.profile.channel.module.base.ModuleRequest;
import com.huami.bluetooth.profile.channel.module.base.ModuleResultKt;
import com.huami.bluetooth.profile.channel.module.battery.codec.VersionCodec;
import com.loc.z;
import com.xiaomi.hm.health.bt.debug.Debug;
import com.xmlywind.sdk.common.mta.PointCategory;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@ChannelModule(id = 27)
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 J\u0011\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u0004\u0018\u00010\u0007R\u0016\u0010\f\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\u000f\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\u0013\u001a\u00020\u00108\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0015\u001a\u00020\u00108\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0012R\"\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u00168\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0013\u0010\u001c\u001a\u00020\u00028F@\u0006¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006!"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/amc/MusicControllerModule;", "Lcom/huami/bluetooth/profile/channel/module/BaseModule;", "", "queryVersion", "()Ljava/lang/Integer;", "", PointCategory.INIT, "Lcom/huami/bluetooth/profile/channel/module/amc/MusicControllerApi;", "loadApi", "", "g", "Z", "needReload", "h", LogUtil.I, "currentVersion", "", "i", "Ljava/lang/Object;", "versionLock", z.j, "apiLock", "Ljava/util/concurrent/ConcurrentHashMap;", hl.k, "Ljava/util/concurrent/ConcurrentHashMap;", "musicControllerApis", "getVersion", "()I", "version", "Lcom/huami/bluetooth/profile/channel/ChannelApi;", "channelApi", "<init>", "(Lcom/huami/bluetooth/profile/channel/ChannelApi;)V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class MusicControllerModule extends BaseModule {

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private boolean needReload;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private int currentVersion;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private final Object versionLock;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    private final Object apiLock;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    private final ConcurrentHashMap<Integer, MusicControllerApi> musicControllerApis;

    public MusicControllerModule(@NotNull ChannelApi channelApi) {
        super(channelApi);
        this.needReload = true;
        this.versionLock = new Object();
        this.apiLock = new Object();
        this.musicControllerApis = new ConcurrentHashMap<>();
    }

    private final synchronized Integer queryVersion() {
        return (Integer) ModuleResultKt.peel(new VersionCodec().decode(sendRequest(new ModuleRequest(MusicControllerCommand.VersionWQueryCommand.INSTANCE, IncreasePredict.INSTANCE, 0L, null, false, 28, null))));
    }

    public final int getVersion() {
        if (this.needReload) {
            synchronized (this.versionLock) {
                if (!this.needReload) {
                    return this.currentVersion;
                }
                Integer numQueryVersion = queryVersion();
                this.currentVersion = numQueryVersion == null ? 1 : numQueryVersion.intValue();
                this.needReload = false;
                Unit unit = Unit.INSTANCE;
            }
        }
        return this.currentVersion;
    }

    @Override // com.huami.bluetooth.profile.channel.module.BaseModule
    public void init() {
        super.init();
        this.needReload = true;
    }

    @Nullable
    public final MusicControllerApi loadApi() {
        int version = getVersion();
        if (version == 0) {
            Debug.fi(BaseModule.TAG, "没有读到音乐控制模块的版本号");
            return null;
        }
        MusicControllerApi musicControllerApi = this.musicControllerApis.get(Integer.valueOf(version));
        if (musicControllerApi != null) {
            return musicControllerApi;
        }
        synchronized (this.apiLock) {
            MusicControllerApi musicControllerApi2 = this.musicControllerApis.get(Integer.valueOf(version));
            if (musicControllerApi2 != null) {
                return musicControllerApi2;
            }
            if (version == 1) {
                MusicControllerApiImpl musicControllerApiImpl = new MusicControllerApiImpl(this);
                this.musicControllerApis.put(Integer.valueOf(version), musicControllerApiImpl);
                return musicControllerApiImpl;
            }
            Unit unit = Unit.INSTANCE;
            Debug.fi(BaseModule.TAG, Intrinsics.stringPlus("Not support music controller api version ", Integer.valueOf(version)));
            return null;
        }
    }
}
