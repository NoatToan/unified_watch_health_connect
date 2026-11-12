package com.xiaomi.hm.health.manager;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.account.HMLoginManager;
import com.huami.ad.db.AdProvider;
import com.huami.ad.entity.HomePageNotify;
import com.huami.ad.utils.AdHelper;
import com.huami.ad.web.AdAPI;
import com.huami.mifit.analytics.Analytics;
import com.huami.mifit.analytics.builder.CountEventBuilder;
import com.huami.moving.sport.ui.webapi.impl.DeviceSettingApiImpl;
import com.huami.network.base.handler.ResponseHandler;
import com.huami.network.base.model.HMHttpResponseData;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.huami.util.net.NetUtil;
import com.huami.watch.notification.TransportUri;
import com.xiaomi.hm.health.databases.model.AdEntity;
import com.xiaomi.hm.health.discovery.WebHelper;
import com.xiaomi.hm.health.discovery.jsbridge.function.NavigateToHandler;
import com.xiaomi.hm.health.discovery.jsbridge.function.NavigateToHandlerOptions;
import com.xiaomi.hm.health.imageload.HMImageLoader;
import com.xiaomi.hm.health.keeper.HMKeeper;
import com.xiaomi.hm.health.locweather.LocWeatherManager;
import com.xiaomi.hm.health.manager.HMAdManager;
import com.xiaomi.hm.health.utils.Utils;
import com.xiaomi.hm.health.watchfacestore.WatchFaceIntentHandler;
import com.xiaomi.hm.health.wxapi.WeChatAPI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.Charsets;
import kotlin.text.Regex;
import kotlin.text.RegexOption;
import kotlin.text.m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\bK\u0010LJ7\u0010\b\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ1\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\r2\u0006\u0010\n\u001a\u00020\u00062\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u0004\u0018\u00010\u00032\u000e\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0010H\u0002J\b\u0010\u0013\u001a\u00020\u0012H\u0007J4\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00062\u001a\u0010\u0018\u001a\u0016\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0016\u0012\u0004\u0012\u00020\u00120\u0005H\u0007J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u001a\u001a\u00020\u0006H\u0007J\u0010\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u0006H\u0002J\u001a\u0010\u001d\u001a\u00020\u00122\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u001a\u001a\u00020\u0006H\u0007J\"\u0010 \u001a\u00020\u00062\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u0006H\u0007J\u001e\u0010!\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\r2\u0006\u0010\u0004\u001a\u00020\u0003H\u0007J\"\u0010'\u001a\u00020\u00122\u0006\u0010#\u001a\u00020\"2\b\u0010$\u001a\u0004\u0018\u00010\u00062\u0006\u0010&\u001a\u00020%H\u0007J\u001a\u0010*\u001a\u00020\u00122\u0006\u0010#\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010\u0006H\u0007JS\u00101\u001a\u00020\u00122\u0006\u0010#\u001a\u00020(2\b\u0010,\u001a\u0004\u0018\u00010+2\b\u0010-\u001a\u0004\u0018\u00010\u00062\b\u0010.\u001a\u0004\u0018\u00010\u00062\u0006\u0010/\u001a\u00020\u00062\u0014\u00100\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\rH\u0007¢\u0006\u0004\b1\u00102JI\u00104\u001a\u00020\u00122\u0006\u0010#\u001a\u0002032\b\u0010,\u001a\u0004\u0018\u00010+2\b\u0010)\u001a\u0004\u0018\u00010\u00062\u0006\u0010/\u001a\u00020\u00062\u0014\u00100\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\rH\u0007¢\u0006\u0004\b4\u00105J]\u00109\u001a\u00020\u00122\u0006\u00107\u001a\u0002062\b\u0010,\u001a\u0004\u0018\u00010+2\b\u0010)\u001a\u0004\u0018\u00010\u00062\b\u0010/\u001a\u0004\u0018\u00010\u00062\u0014\u00100\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\r2\u0010\b\u0002\u00108\u001a\n\u0012\u0004\u0012\u00020+\u0018\u00010\u0016H\u0007¢\u0006\u0004\b9\u0010:JS\u00109\u001a\u00020\u00122\u0006\u00107\u001a\u0002062\b\u0010,\u001a\u0004\u0018\u00010+2\b\u0010)\u001a\u0004\u0018\u00010\u00062\b\u0010/\u001a\u0004\u0018\u00010\u00062\u0014\u00100\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\r2\u0006\u0010;\u001a\u00020\u0006H\u0007¢\u0006\u0004\b9\u0010<J\u0018\u0010>\u001a\u00020\u00122\u0006\u00107\u001a\u0002062\u0006\u0010=\u001a\u00020\u0006H\u0002R\u0016\u0010A\u001a\u00020\u00068\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b?\u0010@R\u0016\u0010B\u001a\u00020\u00068\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\bB\u0010@R\u0016\u0010C\u001a\u00020\u00068\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\bC\u0010@R\u0016\u0010D\u001a\u00020\u00068\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\bD\u0010@R\u0016\u0010E\u001a\u00020+8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\bE\u0010FR\u0016\u0010G\u001a\u00020+8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\bG\u0010FR\u0016\u0010H\u001a\u00020+8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\bH\u0010FR\u0016\u0010I\u001a\u00020+8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\bI\u0010FR\u0016\u0010J\u001a\u00020+8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\bJ\u0010F¨\u0006M"}, d2 = {"Lcom/xiaomi/hm/health/manager/HMAdManager;", "", "R", "Lcom/xiaomi/hm/health/databases/model/AdEntity;", "entity", "Lkotlin/Function1;", "", TransportUri.ACTION_BLOCK, "b", "(Lcom/xiaomi/hm/health/databases/model/AdEntity;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "assets", "", "keys", "", "g", "(Ljava/lang/String;[Ljava/lang/String;)Ljava/util/Map;", "Lkotlin/Function0;", "c", "", "initAdLogic", "region", "country", "", "Lcom/huami/ad/entity/HomePageNotify;", "onResult", "requestHomeMsg", "type", "getCurrentAd", GoogleApiAvailabilityLight.a, "saveAdLoaded", "key", "defColor", "getCurrentColor", "getCurrentImage", "Landroid/widget/TextView;", ViewHierarchyConstants.VIEW_KEY, "prefix", "", "origin", "addPrefixTitle", "Landroid/widget/ImageView;", "url", "displayImage", "", "mode", "imageUrl", "linkUrl", "event", "extras", "initBannerView", "(Landroid/widget/ImageView;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "Landroid/view/View;", "initJumpView", "(Landroid/view/View;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, DeviceSettingApiImpl.PARAMS_SOURCE, "doJumpAction", "(Landroid/content/Context;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/List;)V", "source", "(Landroid/content/Context;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;)V", "target", "f", "a", "Ljava/lang/String;", "TAG", "IMAGE_POSITION_SHARE_BG", "TYPE_HOME_PAGE_AD", "APP_GOTO_MINI_PROGRAM_WECHAT", "MODE_JUMP_WEB", LogUtil.I, "MODE_JUMP_APP", "MODE_JUMP_RN", "MODE_JUMP_APPLETS", "MODE_JUMP_WECHAT_APPLET", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class HMAdManager {

    @NotNull
    public static final String APP_GOTO_MINI_PROGRAM_WECHAT = "miniprogram:wechat";

    @NotNull
    public static final String IMAGE_POSITION_SHARE_BG = "share-bg";

    @NotNull
    public static final HMAdManager INSTANCE = new HMAdManager();
    public static final int MODE_JUMP_APP = 2;
    public static final int MODE_JUMP_APPLETS = 5;
    public static final int MODE_JUMP_RN = 4;
    public static final int MODE_JUMP_WEB = 1;
    public static final int MODE_JUMP_WECHAT_APPLET = 6;

    @NotNull
    public static final String TYPE_HOME_PAGE_AD = "home_page_notify";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private static final String TAG = "HMAdManager";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/databases/model/AdEntity;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<AdEntity> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str) {
            super(0);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final AdEntity invoke() {
            List validityAdEntity = AdProvider.getInstance().getValidityAdEntity(this.a);
            if (validityAdEntity == null) {
                return null;
            }
            if (validityAdEntity.isEmpty()) {
                validityAdEntity = null;
            }
            if (validityAdEntity == null) {
                return null;
            }
            String strD = HMAdManager.INSTANCE.d(this.a);
            List list = validityAdEntity.size() == 1 ? null : validityAdEntity;
            if (list != null) {
                validityAdEntity = new ArrayList();
                for (Object obj : list) {
                    if (!Intrinsics.areEqual(((AdEntity) obj).getId(), strD)) {
                        validityAdEntity.add(obj);
                    }
                }
            }
            return (AdEntity) validityAdEntity.get(new Random().nextInt(validityAdEntity.size()));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "it", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function1<String, String> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str) {
            super(1);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function1
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(@NotNull String str) {
            String str2 = (String) HMAdManager.INSTANCE.g(str, new String[]{"colors", "position", "value"}).get(this.a);
            if (str2 != null && new Regex("#[0-9a-f]{6}", RegexOption.IGNORE_CASE).matches(str2)) {
                return str2;
            }
            return null;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function1<String, Map<String, ? extends String>> {
        public static final c a = new c();

        public c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Map<String, String> invoke(@NotNull String str) {
            return HMAdManager.INSTANCE.g(str, new String[]{"images", "position", "src"});
        }
    }

    private HMAdManager() {
    }

    @JvmStatic
    @SuppressLint({"SetTextI18n"})
    public static final void addPrefixTitle(@NotNull TextView view, @Nullable String prefix, @NotNull CharSequence origin) {
        if (!Intrinsics.areEqual(prefix == null ? null : Boolean.valueOf(!m.isBlank(prefix)), Boolean.TRUE)) {
            view.setText(origin);
            return;
        }
        view.setText(prefix + "  " + ((Object) origin));
    }

    private final <R> R b(AdEntity entity, Function1<? super String, ? extends R> block) {
        String str;
        if (entity == null || (str = entity.assets) == null) {
            return null;
        }
        if (m.isBlank(str)) {
            str = null;
        }
        if (str == null) {
            return null;
        }
        return block.invoke(str);
    }

    private final AdEntity c(Function0<? extends AdEntity> block) {
        if (Utils.shouldShowAd()) {
            return block.invoke();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String d(String type) {
        return HMKeeper.getAdLoaded(type);
    }

    @JvmStatic
    public static final void displayImage(@NotNull ImageView view, @Nullable String url) {
        if (url == null) {
            return;
        }
        if (m.isBlank(url)) {
            url = null;
        }
        if (url == null) {
            return;
        }
        ImageView imageView = view.getVisibility() == 0 ? null : view;
        if (imageView != null) {
            imageView.setVisibility(0);
        }
        HMImageLoader.with(view).load(url).into(view);
    }

    @JvmStatic
    @JvmOverloads
    public static final void doJumpAction(@NotNull Context context, @Nullable Integer num, @Nullable String str, @Nullable String str2, @Nullable Map<String, String> map) {
        doJumpAction$default(context, num, str, str2, map, null, 32, null);
    }

    @JvmStatic
    @JvmOverloads
    public static final void doJumpAction(@NotNull Context context, @Nullable Integer mode, @Nullable String url, @Nullable String event, @Nullable Map<String, String> extras, @Nullable List<Integer> deviceSources) {
        if (url == null) {
            return;
        }
        if (mode != null && mode.intValue() == 1) {
            WebHelper.launch(url);
        } else {
            if ((mode != null && mode.intValue() == 2) || (mode != null && mode.intValue() == 4)) {
                if (m.startsWith$default(url, "watch", false, 2, null)) {
                    WatchFaceIntentHandler.INSTANCE.handlerAction(context, url, deviceSources);
                } else {
                    new NavigateToHandler().handleNavigateTo(context, url, null);
                }
            } else if (mode != null && mode.intValue() == 6) {
                INSTANCE.f(context, url);
            }
        }
        if (event == null) {
            return;
        }
        if (Intrinsics.areEqual(event, "HOME_SELECTED_C")) {
            Analytics.recordEvent(new CountEventBuilder(event).setAnonymous(!HMLoginManager.isInChina()).setIdentified(HMLoginManager.isInChina()).putExtras(extras));
        } else {
            Analytics.recordEvent(new CountEventBuilder(event).setAnonymous(true).setIdentified(true).putExtras(extras));
        }
    }

    public static /* synthetic */ void doJumpAction$default(Context context, Integer num, String str, String str2, Map map, List list, int i, Object obj) {
        if ((i & 32) != 0) {
            list = null;
        }
        doJumpAction(context, num, str, str2, (Map<String, String>) map, (List<Integer>) list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(Integer num, String str, String str2, Map map, View view) {
        if (num != null && num.intValue() == 1) {
            WebHelper.launch(str);
        } else {
            if ((num != null && num.intValue() == 2) || (num != null && num.intValue() == 4)) {
                new NavigateToHandler().handleNavigateTo(view.getContext(), str, null);
            } else if (num != null && num.intValue() == 6) {
                INSTANCE.f(view.getContext(), str);
            }
        }
        Analytics.recordEvent(new CountEventBuilder(str2).setAnonymous(true).setIdentified(true).putExtras(map));
    }

    private final void f(Context context, String target) {
        new WeChatAPI(context.getApplicationContext()).launchMiniProgram(target);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Map<String, String> g(String assets, String[] keys) {
        int length;
        HashMap map = new HashMap();
        JSONObject jSONObject = new JSONObject(assets);
        int i = 0;
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(keys[0]);
        if (jSONArrayOptJSONArray != null) {
            if (!(jSONArrayOptJSONArray.length() > 0)) {
                jSONArrayOptJSONArray = null;
            }
            if (jSONArrayOptJSONArray != null && (length = jSONArrayOptJSONArray.length()) > 0) {
                while (true) {
                    int i2 = i + 1;
                    JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
                    map.put(jSONObjectOptJSONObject.optString(keys[1]), jSONObjectOptJSONObject.optString(keys[2]));
                    if (i2 >= length) {
                        break;
                    }
                    i = i2;
                }
            }
        }
        return map;
    }

    @JvmStatic
    @Nullable
    public static final AdEntity getCurrentAd(@NotNull String type) {
        return INSTANCE.c(new a(type));
    }

    @JvmStatic
    @NotNull
    public static final String getCurrentColor(@Nullable AdEntity entity, @NotNull String key, @NotNull String defColor) {
        String str = (String) INSTANCE.b(entity, new b(key));
        return str == null ? defColor : str;
    }

    @JvmStatic
    @Nullable
    public static final Map<String, String> getCurrentImage(@NotNull AdEntity entity) {
        return (Map) INSTANCE.b(entity, c.a);
    }

    @JvmStatic
    public static final void initAdLogic() {
        if (NetUtil.INSTANCE.networkInfo().isNetworkConnect() && Utils.shouldShowAd() && m.isBlank(LocWeatherManager.getInstance().getLocationAddressCode())) {
            HMKeeper.setLocReady(false);
        }
    }

    @JvmStatic
    public static final void initBannerView(@NotNull ImageView view, @Nullable Integer mode, @Nullable String imageUrl, @Nullable String linkUrl, @NotNull String event, @Nullable Map<String, String> extras) {
        if (imageUrl == null) {
            return;
        }
        if (m.isBlank(imageUrl)) {
            imageUrl = null;
        }
        if (imageUrl == null) {
            return;
        }
        view.setVisibility(0);
        HMImageLoader.with(view).load(imageUrl).into(view);
        initJumpView(view, mode, linkUrl, event, extras);
    }

    @JvmStatic
    public static final void initJumpView(@NotNull View view, @Nullable final Integer mode, @Nullable final String url, @NotNull final String event, @Nullable final Map<String, String> extras) {
        if (url == null) {
            return;
        }
        view.setOnClickListener(new View.OnClickListener() { // from class: wi2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                HMAdManager.e(mode, url, event, extras, view2);
            }
        });
    }

    @JvmStatic
    public static final void requestHomeMsg(@NotNull String region, @NotNull String country, @NotNull final Function1<? super List<HomePageNotify>, Unit> onResult) {
        if (NetUtil.INSTANCE.networkInfo().isNetworkConnect()) {
            AdAPI.requestServerWithSort(TYPE_HOME_PAGE_AD, "-online", region, country, new ResponseHandler() { // from class: com.xiaomi.hm.health.manager.HMAdManager.requestHomeMsg.1

                /* JADX INFO: renamed from: com.xiaomi.hm.health.manager.HMAdManager$requestHomeMsg$1$a */
                @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
                public static final class a extends Lambda implements Function0<String> {
                    public final /* synthetic */ HMHttpResponseData a;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public a(HMHttpResponseData hMHttpResponseData) {
                        super(0);
                        this.a = hMHttpResponseData;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    @Nullable
                    public final String invoke() {
                        return "onFailure response : " + this.a;
                    }
                }

                /* JADX INFO: renamed from: com.xiaomi.hm.health.manager.HMAdManager$requestHomeMsg$1$b */
                @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
                public static final class b extends Lambda implements Function0<String> {
                    public final /* synthetic */ HMHttpResponseData a;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public b(HMHttpResponseData hMHttpResponseData) {
                        super(0);
                        this.a = hMHttpResponseData;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    @Nullable
                    public final String invoke() {
                        return "response : " + this.a;
                    }
                }

                @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
                public void onFailure(@Nullable HMHttpResponseData item) {
                    HMLog.info(HMAdManager.TAG, new a(item));
                }

                @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
                public void onSuccess(@Nullable HMHttpResponseData item) {
                    if (item == null) {
                        return;
                    }
                    if (!item.isSuccess()) {
                        item = null;
                    }
                    if (item == null) {
                        return;
                    }
                    Function1<List<HomePageNotify>, Unit> function1 = onResult;
                    HMLog.debug(HMAdManager.TAG, new b(item));
                    List<HomePageNotify> homeNotify = AdHelper.parseHomeNotify(new String(item.getResponseBody(), Charsets.UTF_8));
                    if (homeNotify == null || homeNotify.isEmpty()) {
                        function1.invoke(null);
                    } else {
                        function1.invoke(homeNotify);
                    }
                }
            });
        }
    }

    @JvmStatic
    public static final void saveAdLoaded(@Nullable AdEntity entity, @NotNull String type) {
        if (entity == null) {
            entity = null;
        } else {
            HMKeeper.setAdLoaded(type, entity.getId());
        }
        if (entity == null) {
            HMKeeper.setAdLoaded(type, "");
        }
    }

    @JvmStatic
    public static final void doJumpAction(@NotNull Context context, @Nullable Integer mode, @Nullable String url, @Nullable String event, @Nullable Map<String, String> extras, @NotNull String source) {
        if (url == null) {
            return;
        }
        if (mode != null && mode.intValue() == 1) {
            WebHelper.launch(url);
        } else {
            if ((mode != null && mode.intValue() == 2) || (mode != null && mode.intValue() == 4)) {
                new NavigateToHandler().handleNavigateTo(new NavigateToHandlerOptions.Builder(context).position(url).jumpSource(source).build());
            } else if (mode != null && mode.intValue() == 5) {
                new NavigateToHandler().handleNavigateTo(new NavigateToHandlerOptions.Builder(context).data(url).position("miniprogram:wechat").jumpSource(source).build());
            } else if (mode != null && mode.intValue() == 6) {
                INSTANCE.f(context, url);
            }
        }
        if (event == null) {
            return;
        }
        Analytics.recordEvent(new CountEventBuilder(event).setAnonymous(true).setIdentified(true).putExtras(extras));
    }
}
