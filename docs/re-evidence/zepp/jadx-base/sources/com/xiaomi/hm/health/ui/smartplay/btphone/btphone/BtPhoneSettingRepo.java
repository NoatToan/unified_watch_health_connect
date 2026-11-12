package com.xiaomi.hm.health.ui.smartplay.btphone.btphone;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.model.account.HMPersonInfo;
import com.xiaomi.hm.health.utils.HMPropertyUtil;
import com.xiaomi.hm.health.utils.Utils;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.q;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0002H\u0002J\n\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002J\n\u0010\t\u001a\u0004\u0018\u00010\u0002H\u0002J\u0006\u0010\n\u001a\u00020\u0002J\u000e\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0002J\u0006\u0010\r\u001a\u00020\u0004R\u001e\u0010\u0011\u001a\n \u000f*\u0004\u0018\u00010\u000e0\u000e8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0010¨\u0006\u0015"}, d2 = {"Lcom/xiaomi/hm/health/ui/smartplay/btphone/btphone/BtPhoneSettingRepo;", "", "Lcom/xiaomi/hm/health/ui/smartplay/btphone/btphone/BtPhonePropertyData;", "btPhoneData", "", "a", "c", "", "b", GoogleApiAvailabilityLight.a, "getBtPhoneSetting", "btPhoneSetting", "saveBtPhoneSetting", "uploadSettings", "Lcom/xiaomi/hm/health/model/account/HMPersonInfo;", "kotlin.jvm.PlatformType", "Lcom/xiaomi/hm/health/model/account/HMPersonInfo;", "personInfo", "<init>", "()V", "Companion", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class BtPhoneSettingRepo {

    @NotNull
    private static final String b = "BtPhoneSettingNetRepo";

    @NotNull
    private static final String c = "huami.mifit.user.settings.btphone";

    @NotNull
    private static final String d = "enable";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final HMPersonInfo personInfo = HMPersonInfo.getInstance();

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
            return "isBtPhoneEnable btPhoneConfigStr: " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ BtPhonePropertyData a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(BtPhonePropertyData btPhonePropertyData) {
            super(0);
            this.a = btPhonePropertyData;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "parse result: " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public static final c a = new c();

        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "parse config failed";
        }
    }

    private final void a(BtPhonePropertyData btPhoneData) {
        if (btPhoneData.getEnable()) {
            this.personInfo.getMiliConfig().disableInComingCallTime();
            this.personInfo.saveInfo(2);
        }
        btPhoneData.setDelayEnable(this.personInfo.getMiliConfig().isPhoneNotifyDelayEnable());
        btPhoneData.setDelayTime(this.personInfo.getMiliConfig().getInComingCallNotifyTime());
    }

    private final String b() {
        return HMPropertyUtil.getProperty(c, null);
    }

    private final BtPhonePropertyData c() {
        return new BtPhonePropertyData(this.personInfo.getMiliConfig().isInComingCallEnabled(), this.personInfo.getMiliConfig().isPhoneNotifyDelayEnable(), this.personInfo.getMiliConfig().getInComingCallNotifyTime());
    }

    private final BtPhonePropertyData d() {
        String strB = b();
        HMLog.info(b, new a(strB));
        if (strB == null) {
            return null;
        }
        try {
            BtPhonePropertyData btPhonePropertyData = (BtPhonePropertyData) Utils.getGson().fromJson(strB, BtPhonePropertyData.class);
            HMLog.info(b, new b(btPhonePropertyData));
            return btPhonePropertyData;
        } catch (Exception unused) {
            HMLog.info(b, c.a);
            return null;
        }
    }

    @NotNull
    public final BtPhonePropertyData getBtPhoneSetting() {
        BtPhonePropertyData btPhonePropertyDataD = d();
        if (btPhonePropertyDataD == null) {
            btPhonePropertyDataD = c();
            saveBtPhoneSetting(btPhonePropertyDataD);
        }
        a(btPhonePropertyDataD);
        return btPhonePropertyDataD;
    }

    public final void saveBtPhoneSetting(@NotNull BtPhonePropertyData btPhoneSetting) {
        HMPropertyUtil.setProperty(c, Utils.getGson().toJson(q.mapOf(TuplesKt.to("enable", btPhoneSetting.getEnable() ? "true" : "false"))));
        this.personInfo.getMiliConfig().setPhoneNotifyDelayEnable(btPhoneSetting.getDelayEnable());
        this.personInfo.getMiliConfig().setInComingCallNotifyTime(btPhoneSetting.getDelayTime());
    }

    public final void uploadSettings() {
        HMPropertyUtil.postPropertisToServer(false);
    }
}
