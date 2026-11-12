package com.huami.bluetooth.profile.channel.module.amc;

import com.huami.bluetooth.profile.channel.module.a;
import defpackage.C3621pl;
import defpackage.am;
import defpackage.d4;
import defpackage.lw;
import defpackage.mj;
import defpackage.nl;
import defpackage.r3;
import defpackage.t5t;
import defpackage.wl;
import defpackage.yl;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u0011\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u0004\u0018\u00010\u0007R\u0016\u0010\n\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\f\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0010R \u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0017\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u001c"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/amc/MusicControllerModule;", "Lcom/huami/bluetooth/profile/channel/module/a;", "", "queryVersion", "()Ljava/lang/Integer;", "", "init", "Lwl;", "loadApi", "", "needReload", "Z", "currentVersion", "I", "", "versionLock", "Ljava/lang/Object;", "apiLock", "Ljava/util/concurrent/ConcurrentHashMap;", "musicControllerApis", "Ljava/util/concurrent/ConcurrentHashMap;", "getVersion", "()I", "version", "Lr3;", "channelApi", "<init>", "(Lr3;)V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
@d4(id = 27)
public final class MusicControllerModule extends a {

    @NotNull
    private final Object apiLock;
    private int currentVersion;

    @NotNull
    private final ConcurrentHashMap<Integer, wl> musicControllerApis;
    private boolean needReload;

    @NotNull
    private final Object versionLock;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MusicControllerModule(@NotNull r3 channelApi) {
        super(channelApi);
        Intrinsics.checkNotNullParameter(channelApi, "channelApi");
        this.needReload = true;
        this.versionLock = new Object();
        this.apiLock = new Object();
        this.musicControllerApis = new ConcurrentHashMap<>();
    }

    private final synchronized Integer queryVersion() {
        return (Integer) C3621pl.a(new lw().a(sendRequest(new nl(am.d.f1192b, mj.t, 0L, null, false, 28, null))));
    }

    public final int getVersion() {
        if (this.needReload) {
            synchronized (this.versionLock) {
                if (!this.needReload) {
                    return this.currentVersion;
                }
                Integer numQueryVersion = queryVersion();
                this.currentVersion = numQueryVersion != null ? numQueryVersion.intValue() : 1;
                this.needReload = false;
                Unit unit = Unit.INSTANCE;
            }
        }
        return this.currentVersion;
    }

    @Override // com.huami.bluetooth.profile.channel.module.a
    public void init() {
        super.init();
        this.needReload = true;
    }

    @Nullable
    public final wl loadApi() {
        int version = getVersion();
        if (version == 0) {
            t5t.d(a.TAG, "没有读到音乐控制模块的版本号");
            return null;
        }
        wl wlVar = this.musicControllerApis.get(Integer.valueOf(version));
        if (wlVar != null) {
            return wlVar;
        }
        synchronized (this.apiLock) {
            wl wlVar2 = this.musicControllerApis.get(Integer.valueOf(version));
            if (wlVar2 != null) {
                return wlVar2;
            }
            if (version == 1) {
                yl ylVar = new yl(this);
                this.musicControllerApis.put(Integer.valueOf(version), ylVar);
                return ylVar;
            }
            Unit unit = Unit.INSTANCE;
            t5t.d(a.TAG, "Not support music controller api version " + version);
            return null;
        }
    }
}
