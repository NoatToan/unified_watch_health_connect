package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.service.notification.StatusBarNotification;
import com.google.gson.ExclusionStrategy;
import com.google.gson.FieldAttributes;
import com.google.gson.GsonBuilder;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwdevice.phoneprocess.service.HandleIntentService;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.CommonUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes23.dex */
public class cgs {
    public void e(StatusBarNotification statusBarNotification) {
        try {
            Map<String, Object> mapB = b(statusBarNotification);
            GsonBuilder gsonBuilder = new GsonBuilder();
            gsonBuilder.setExclusionStrategies(new b());
            String json = gsonBuilder.create().toJson(mapB);
            Bundle bundle = new Bundle();
            bundle.putString("LIVE_NOTIFICATION_PUSH_TYPE", "LIVE_NOTIFICATION_PUSH");
            bundle.putString("LIVE_NOTIFICATION_PUSH_JSON_STRING", json);
            e(bundle);
        } catch (Exception e) {
            LogUtil.e("NotificLivePush", e.toString());
        }
    }

    private Map<String, Object> b(StatusBarNotification statusBarNotification) {
        Bundle bundle = statusBarNotification.getNotification().extras;
        HashMap map = new HashMap();
        map.put("title", cgl.d(bundle));
        map.put("text", cgl.a(bundle));
        map.put("packageName", statusBarNotification.getPackageName());
        map.put("notificationId", Integer.valueOf(statusBarNotification.getId()));
        map.put("notificationKey", statusBarNotification.getKey());
        map.put("notification.live.operation", Integer.valueOf(bundle.getInt("notification.live.operation")));
        map.put("notification.live.keepTime", Long.valueOf(bundle.getLong("notification.live.keepTime")));
        map.put("notification.live.type", Integer.valueOf(bundle.getInt("notification.live.type", 0)));
        map.put("notification.live.event", cgl.a(bundle, "notification.live.event", "OTHER"));
        map.put("notification.live.titleOverlay", cgl.a(bundle, "notification.live.titleOverlay", ""));
        map.put("notification.live.contentOverlay", cgl.a(bundle, "notification.live.contentOverlay", ""));
        map.put("notification.live.externalEnable", Boolean.valueOf(bundle.getBoolean("notification.live.externalEnable", false)));
        map.put("notification.live.externalTitle", cgl.a(bundle, "notification.live.externalTitle", ""));
        map.put("notification.live.externalBody", cgl.a(bundle, "notification.live.externalBody", ""));
        Bundle bundle2 = bundle.getBundle("notification.live.feature");
        if (bundle2 != null) {
            map.put("notification.live.feature", c(bundle2));
        } else {
            LogUtil.e("NotificLivePush", "liveFeature is null;");
        }
        Bundle bundle3 = bundle.getBundle("notification.live.capsule");
        if (bundle3 == null) {
            LogUtil.e("NotificLivePush", "liveCapsule is null;");
            return map;
        }
        map.put("notification.live.capsule", c(bundle3));
        return map;
    }

    private Map<String, Object> c(Bundle bundle) {
        HashMap map = new HashMap();
        for (String str : bundle.keySet()) {
            map.put(str, bundle.get(str));
        }
        return map;
    }

    private void e(Bundle bundle) {
        Intent intent = new Intent(BaseApplication.getContext(), (Class<?>) HandleIntentService.class);
        intent.setAction("com.huawei.bone.ACTION_NOTIFICATION_PUSH");
        intent.putExtras(bundle);
        ReleaseLogUtil.d("Notify_NotificLivePush", "LiveNotificationHandle start to push notification msg");
        try {
            BaseApplication.getContext().startService(intent);
        } catch (IllegalStateException | SecurityException e) {
            ReleaseLogUtil.a("Notify_NotificLivePush", "LiveNotificationHandle startService: ", ExceptionUtils.c(e));
        }
        if (CommonUtil.ai(BaseApplication.getContext())) {
            return;
        }
        ReleaseLogUtil.d("Notify_NotificLivePush", "LiveNotificationHandle phoneService not running");
        lng.d(1001);
    }

    class b implements ExclusionStrategy {
        @Override // com.google.gson.ExclusionStrategy
        public boolean shouldSkipClass(Class<?> cls) {
            return false;
        }

        b() {
        }

        @Override // com.google.gson.ExclusionStrategy
        public boolean shouldSkipField(FieldAttributes fieldAttributes) {
            return fieldAttributes.getName().equals("mChangingConfigurations");
        }
    }
}
