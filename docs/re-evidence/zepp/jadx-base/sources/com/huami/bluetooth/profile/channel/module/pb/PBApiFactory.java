package com.huami.bluetooth.profile.channel.module.pb;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.bluetooth.profile.channel.module.pb.impl.PBApiImpl;
import com.xiaomi.hm.health.bt.profile.base.BaseProfile;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/pb/PBApiFactory;", "", "<init>", "()V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class PBApiFactory {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final int a = 1;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/pb/PBApiFactory$Companion;", "", "Lcom/xiaomi/hm/health/bt/profile/base/BaseProfile;", "baseProfile", "Lcom/huami/bluetooth/profile/channel/module/pb/PBApi;", "create", "", "VERSION_1", LogUtil.I, "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Nullable
        public final PBApi create(@NotNull BaseProfile baseProfile) {
            Integer version;
            if (!baseProfile.supportModule(PersonalBestModule.class)) {
                if (baseProfile instanceof PBApi) {
                    return (PBApi) baseProfile;
                }
                return null;
            }
            PersonalBestModule personalBestModule = (PersonalBestModule) baseProfile.getChannelModule(PersonalBestModule.class);
            if (personalBestModule == null || (version = personalBestModule.getVersion()) == null || version.intValue() != 1) {
                return null;
            }
            return new PBApiImpl(personalBestModule);
        }
    }
}
