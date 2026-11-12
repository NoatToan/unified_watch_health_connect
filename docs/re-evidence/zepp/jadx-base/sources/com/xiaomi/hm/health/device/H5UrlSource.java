package com.xiaomi.hm.health.device;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.devicex.injection.basic.DeviceUtilsApi;
import com.huami.network.hmnetwork.server.HMServerDef;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.device.headset.common.MozartH5;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import org.koin.java.KoinJavaComponent;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/xiaomi/hm/health/device/H5UrlSource;", "", "<init>", "()V", "Companion", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class H5UrlSource {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String H5_URL_SETTING = "h5_url";

    @NotNull
    public static final String HEADSET_PLAY_H5_URL = "t/mifit.play.watch.%d";

    @NotNull
    public static final String HELP_DETAIL_URL = "t/posts/watch?meta_key=device&category=%s&meta_value=%s&platform=watch";
    public static final int HELP_HEADSET_CATEGORY = 35;

    @NotNull
    public static final String KEY_FAQ = "faq";

    @NotNull
    public static final String KEY_MOZART = "mozart";

    @NotNull
    public static final String KEY_PLAY = "play";

    @NotNull
    public static final String PROD_AMAZFIT = "amazfit";

    @NotNull
    public static final String PROD_ZEPP = "midong";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0004J\u0006\u0010\f\u001a\u00020\u000bJ\u000e\u0010\r\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u0004R\u0016\u0010\u000e\u001a\u00020\u00068\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0010\u001a\u00020\u00068\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u000fR\u0016\u0010\u0011\u001a\u00020\u00068\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u000fR\u0016\u0010\u0012\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0014\u001a\u00020\u00068\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\u000fR\u0016\u0010\u0015\u001a\u00020\u00068\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0015\u0010\u000fR\u0016\u0010\u0016\u001a\u00020\u00068\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\u000fR\u0016\u0010\u0017\u001a\u00020\u00068\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0017\u0010\u000fR\u0016\u0010\u0018\u001a\u00020\u00068\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0018\u0010\u000f¨\u0006\u001b"}, d2 = {"Lcom/xiaomi/hm/health/device/H5UrlSource$Companion;", "", "", "category", "Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "hmDeviceSource", "", "getHelpUrl", "getHeadsetHelpUrl", "deviceSource", "getHeadsetPlayUrl", "Lcom/xiaomi/hm/health/device/headset/common/MozartH5;", "getMozartH5", "getMozartH5UrlStatic", "H5_URL_SETTING", "Ljava/lang/String;", "HEADSET_PLAY_H5_URL", "HELP_DETAIL_URL", "HELP_HEADSET_CATEGORY", LogUtil.I, "KEY_FAQ", "KEY_MOZART", "KEY_PLAY", "PROD_AMAZFIT", "PROD_ZEPP", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {

        @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[HMDeviceSource.values().length];
                iArr[HMDeviceSource.OTHER_MOZART.ordinal()] = 1;
                iArr[HMDeviceSource.OTHER_HAYDN.ordinal()] = 2;
                $EnumSwitchMapping$0 = iArr;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<String> {
            public final /* synthetic */ Exception a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Exception exc) {
                super(0);
                this.a = exc;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "ERROR:get h5 url failed:" + this.a;
            }
        }

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final String getHeadsetHelpUrl(@NotNull HMDeviceSource hmDeviceSource) {
            return getHelpUrl(35, hmDeviceSource);
        }

        @NotNull
        public final String getHeadsetPlayUrl(@NotNull HMDeviceSource deviceSource) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            return HMServerDef.getUrl(String.format(H5UrlSource.HEADSET_PLAY_H5_URL, Arrays.copyOf(new Object[]{Integer.valueOf(deviceSource.getValue())}, 1)));
        }

        @NotNull
        public final String getHelpUrl(int category, @NotNull HMDeviceSource hmDeviceSource) {
            int i = WhenMappings.$EnumSwitchMapping$0[hmDeviceSource.ordinal()];
            String str = "50.256.7.700";
            if (i != 1 && i == 2) {
                str = "90.256.7.701";
            }
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            return HMServerDef.getUrl(String.format(H5UrlSource.HELP_DETAIL_URL, Arrays.copyOf(new Object[]{Integer.valueOf(category), str}, 2)));
        }

        @NotNull
        public final MozartH5 getMozartH5() {
            try {
                JSONObject jSONObject = new JSONObject(new JSONObject(((DeviceUtilsApi) KoinJavaComponent.getKoin().getScopeRegistry().getRootScope().get(Reflection.getOrCreateKotlinClass(DeviceUtilsApi.class), null, null)).getAppSetting(H5UrlSource.H5_URL_SETTING, "RANGE")).getString(H5UrlSource.H5_URL_SETTING));
                return new MozartH5((jSONObject.has("play") && jSONObject.getJSONObject("play").has(H5UrlSource.KEY_MOZART)) ? jSONObject.getJSONObject("play").getString(H5UrlSource.KEY_MOZART) : null, (jSONObject.has(H5UrlSource.KEY_FAQ) && jSONObject.getJSONObject(H5UrlSource.KEY_FAQ).has(H5UrlSource.KEY_MOZART)) ? jSONObject.getJSONObject(H5UrlSource.KEY_FAQ).getString(H5UrlSource.KEY_MOZART) : null);
            } catch (Exception e) {
                HMLog.info("HeadSettingViewModel", new a(e));
                return new MozartH5(null, null, 3, null);
            }
        }

        @NotNull
        public final MozartH5 getMozartH5UrlStatic(@NotNull HMDeviceSource deviceSource) {
            return new MozartH5(getHeadsetPlayUrl(deviceSource), getHeadsetHelpUrl(deviceSource));
        }
    }
}
