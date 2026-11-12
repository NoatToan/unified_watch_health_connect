package com.xiaomi.hm.health.watchfacestore;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.moving.sport.ui.webapi.impl.DeviceSettingApiImpl;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.huami.watchfacesstore.ui.WatchFacesStoreActivity;
import com.huami.watchfacesstore.ui.store.detail.WatchFaceDetailActivity;
import com.huami.watchfacesstore.ui.store.list.CategoryListActivity;
import com.xiaomi.hm.health.HMIntentHandler;
import com.xiaomi.hm.health.activity.MainTabActivity;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.device.HMDeviceConfig;
import com.xiaomi.hm.health.device.HMDeviceManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.h;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\f\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\"\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0002J\u0010\u0010\t\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0016\u0010\f\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nJ&\u0010\f\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00042\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eR\u0016\u0010\u0011\u001a\u00020\u00048\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0013\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0012R\u0016\u0010\u0014\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0012R\u0016\u0010\u0016\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0012R\u0016\u0010\u0018\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0012¨\u0006\u001b"}, d2 = {"Lcom/xiaomi/hm/health/watchfacestore/WatchFaceIntentHandler;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "target", "id", "", "b", "a", "Lcom/xiaomi/hm/health/HMIntentHandler$HMAction;", "action", "handlerAction", "url", "", "", DeviceSettingApiImpl.PARAMS_SOURCE, "TARGET_WATCH", "Ljava/lang/String;", "WATCH_HOME", "WATCH_CATEGORY", "c", "WATCH_DETAIL", GoogleApiAvailabilityLight.a, "TAG", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class WatchFaceIntentHandler {

    @NotNull
    public static final WatchFaceIntentHandler INSTANCE = new WatchFaceIntentHandler();

    @NotNull
    public static final String TARGET_WATCH = "watch";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private static final String WATCH_HOME = "home";

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private static final String WATCH_CATEGORY = "category";

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private static final String WATCH_DETAIL = "detail";

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private static final String TAG = "WatchFaceIntentHandler";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "url格式不正确";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ HMIntentHandler.HMAction a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(HMIntentHandler.HMAction hMAction) {
            super(0);
            this.a = hMAction;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "jump action: " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public final /* synthetic */ HMDeviceSource a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(HMDeviceSource hMDeviceSource) {
            super(0);
            this.a = hMDeviceSource;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "currentDeviceSource: " + this.a.getValue();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;
        public final /* synthetic */ List<Integer> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str, List<Integer> list) {
            super(0);
            this.a = str;
            this.b = list;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "jump url: " + this.a + " deviceSources: " + this.b;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<String> {
        public final /* synthetic */ HMDeviceSource a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(HMDeviceSource hMDeviceSource) {
            super(0);
            this.a = hMDeviceSource;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "currentDeviceSource: " + this.a.getValue();
        }
    }

    private WatchFaceIntentHandler() {
    }

    private final void a(Context context) {
        context.startActivity(new Intent(context, (Class<?>) MainTabActivity.class).putExtra("tab_index", 3).addFlags(268435456));
    }

    private final void b(Context context, String target, String id) {
        boolean z = true;
        if (m.equals("home", target, true)) {
            WatchFacesStoreActivity.INSTANCE.actionStart(context);
            return;
        }
        if (m.equals("category", target, true)) {
            if (id != null && id.length() != 0) {
                z = false;
            }
            if (z) {
                return;
            }
            CategoryListActivity.INSTANCE.actionStart(context, 5, Integer.parseInt(id));
            return;
        }
        if (m.equals("detail", target, true)) {
            if (id != null && id.length() != 0) {
                z = false;
            }
            if (z) {
                return;
            }
            WatchFaceDetailActivity.Companion.actionStart$default(WatchFaceDetailActivity.INSTANCE, context, 0, Integer.parseInt(id), null, null, 24, null);
        }
    }

    public final void handlerAction(@NotNull Context context, @NotNull HMIntentHandler.HMAction action) {
        Object next;
        HMLog.info(TAG, new b(action));
        if (!HMDeviceConfig.isSupportNewWatchStore()) {
            a(context);
            return;
        }
        String vaildData = HMIntentHandler.getVaildData(action.getData(), "source");
        Unit unit = null;
        List listSplit$default = vaildData == null ? null : StringsKt__StringsKt.split$default((CharSequence) vaildData, new String[]{","}, false, 0, 6, (Object) null);
        HMDeviceManager hMDeviceManager = HMDeviceManager.getInstance();
        HMDeviceSource boundDeviceSource = hMDeviceManager.getBoundDeviceSource(hMDeviceManager.getMajorDeviceType());
        HMLog.info(TAG, new c(boundDeviceSource));
        if (listSplit$default != null) {
            Iterator it2 = listSplit$default.iterator();
            do {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
            } while (!Intrinsics.areEqual((String) next, String.valueOf(boundDeviceSource.getValue())));
            if (((String) next) != null) {
                INSTANCE.b(context, action.getTarget(), HMIntentHandler.getVaildData(action.getData(), "id"));
                unit = Unit.INSTANCE;
            }
        }
        if (unit == null) {
            a(context);
        }
    }

    public final void handlerAction(@NotNull Context context, @NotNull String url, @Nullable List<Integer> deviceSources) {
        Object obj;
        Object next;
        HMLog.info(TAG, new d(url, deviceSources));
        if (!HMDeviceConfig.isSupportNewWatchStore()) {
            a(context);
            return;
        }
        try {
            List listSplit$default = StringsKt__StringsKt.split$default((CharSequence) url, new String[]{":"}, false, 0, 6, (Object) null);
            String str = (String) listSplit$default.get(1);
            Unit unit = null;
            if (m.equals("home", str, true)) {
                List listSplit$default2 = StringsKt__StringsKt.split$default((CharSequence) listSplit$default.get(2), new String[]{","}, false, 0, 6, (Object) null);
                deviceSources = new ArrayList<>();
                Iterator it2 = listSplit$default2.iterator();
                while (it2.hasNext()) {
                    h.addAll(deviceSources, kotlin.collections.e.listOf(Integer.valueOf(Integer.parseInt((String) it2.next()))));
                }
                obj = null;
            } else {
                obj = listSplit$default.get(2);
            }
            if (deviceSources == null) {
                b(context, str, (String) obj);
                return;
            }
            HMDeviceManager hMDeviceManager = HMDeviceManager.getInstance();
            HMDeviceSource boundDeviceSource = hMDeviceManager.getBoundDeviceSource(hMDeviceManager.getMajorDeviceType());
            HMLog.info(TAG, new e(boundDeviceSource));
            Iterator<T> it3 = deviceSources.iterator();
            do {
                if (!it3.hasNext()) {
                    next = null;
                    break;
                }
                next = it3.next();
            } while (!(((Number) next).intValue() == boundDeviceSource.getValue()));
            Integer num = (Integer) next;
            if (num != null) {
                num.intValue();
                INSTANCE.b(context, str, (String) obj);
                unit = Unit.INSTANCE;
            }
            if (unit == null) {
                a(context);
            }
        } catch (IndexOutOfBoundsException e2) {
            HMLog.warn(TAG, e2, a.a);
        }
    }
}
