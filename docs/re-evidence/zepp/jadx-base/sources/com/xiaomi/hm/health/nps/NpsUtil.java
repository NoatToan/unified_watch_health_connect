package com.xiaomi.hm.health.nps;

import android.content.Context;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.huami.tools.analytics.DbUtils;
import com.huami.watch.companion.device.DeviceManager;
import com.xiaomi.hm.health.HMProperty;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.device.HMDeviceManager;
import com.xiaomi.hm.health.nps.model.NpsTarget;
import com.xiaomi.hm.health.nps.ui.NpsHelper;
import com.xiaomi.hm.health.utils.HMPropertyUtil;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b)\u0010*J\u0014\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002J\u001e\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u000e\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\tJ\u0014\u0010\u000e\u001a\u00020\n2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u0002J)\u0010\u0015\u001a\u00020\u00132!\u0010\u0014\u001a\u001d\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u00130\u000fJ\u0006\u0010\u0016\u001a\u00020\u0013J3\u0010\u0019\u001a\u00020\u00132+\u0010\u0014\u001a'\u0012\u001d\u0012\u001b\u0012\u0006\u0012\u0004\u0018\u00010\u0017\u0018\u00010\u0002¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0018\u0012\u0004\u0012\u00020\u00130\u000fJ\u0018\u0010\u001a\u001a\u00020\u00132\u0010\u0010\u0018\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0017\u0018\u00010\u0002R\u0016\u0010\u001c\u001a\u00020\u001b8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010\u001f\u001a\u00020\u001e8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010!\u001a\u00020\u001e8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b!\u0010 R\u0016\u0010\"\u001a\u00020\u001e8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\"\u0010 R\"\u0010(\u001a\u00020\u001e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010 \u001a\u0004\b$\u0010%\"\u0004\b&\u0010'¨\u0006+"}, d2 = {"Lcom/xiaomi/hm/health/nps/NpsUtil;", "", "", "Lcom/xiaomi/hm/health/bt/device/HMDeviceType;", "deviceTypes", "Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "findActiveDeviceSource", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "", "isActiveDeviceConnected", "Lcom/xiaomi/hm/health/nps/model/NpsTarget;", "targets", "hasUserResultInV1", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "isClicked", "", "statusCallback", "readNpsClickStatus", "setNpsClickStatus", "Lcom/xiaomi/hm/health/nps/NpsClickedMode;", "clickedMode", "getNpsClickStatus", "updateNpsClickStatus", "", "NPS_STATUS_CLICKED", "Ljava/lang/String;", "", "NPS_DONE", LogUtil.I, "NPS_SHOWED", "NPS_NOT_DONE", "a", "getHasNpsActivityDone", "()I", "setHasNpsActivityDone", "(I)V", "hasNpsActivityDone", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class NpsUtil {
    public static final int NPS_DONE = 0;
    public static final int NPS_NOT_DONE = -1;
    public static final int NPS_SHOWED = 1;

    @NotNull
    public static final String NPS_STATUS_CLICKED = "true";

    @NotNull
    public static final NpsUtil INSTANCE = new NpsUtil();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private static int hasNpsActivityDone = -1;

    private NpsUtil() {
    }

    @NotNull
    public final HMDeviceSource findActiveDeviceSource(@NotNull List<? extends HMDeviceType> deviceTypes) {
        HMDeviceSource hMDeviceSource = HMDeviceSource.VDEVICE;
        Iterator<T> it2 = deviceTypes.iterator();
        while (it2.hasNext()) {
            HMDeviceSource boundDeviceSource = HMDeviceManager.getInstance().getBoundDeviceSource((HMDeviceType) it2.next());
            if (boundDeviceSource != HMDeviceSource.VDEVICE) {
                return boundDeviceSource;
            }
        }
        return hMDeviceSource;
    }

    public final int getHasNpsActivityDone() {
        return hasNpsActivityDone;
    }

    public final void getNpsClickStatus(@NotNull final Function1<? super List<NpsClickedMode>, Unit> statusCallback) {
        HMPropertyUtil.getPropertyAsync(HMProperty.PROP_KEY_NPS_MULTI_COMPLETED, true, new HMPropertyUtil.GetPropertyHandler() { // from class: com.xiaomi.hm.health.nps.NpsUtil.getNpsClickStatus.1
            @Override // com.xiaomi.hm.health.utils.HMPropertyUtil.GetPropertyHandler
            public void onFailed() {
                statusCallback.invoke(null);
            }

            @Override // com.xiaomi.hm.health.utils.HMPropertyUtil.GetPropertyHandler
            public void onSuccess(@Nullable String value) {
                if (value == null) {
                    statusCallback.invoke(null);
                } else {
                    statusCallback.invoke((List) new Gson().fromJson(value, new TypeToken<List<? extends NpsClickedMode>>() { // from class: com.xiaomi.hm.health.nps.NpsUtil$getNpsClickStatus$1$onSuccess$clickedModeList$1
                    }.getType()));
                }
            }
        });
    }

    public final boolean hasUserResultInV1(@NotNull List<NpsTarget> targets) throws InterruptedException {
        final CountDownLatch countDownLatch = new CountDownLatch(targets.size());
        final LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (final NpsTarget npsTarget : targets) {
            NpsHelper.INSTANCE.retrieveNpsUserResultAsync(npsTarget.getSurveyId(), npsTarget.getDeviceId(), new NpsHelper.OnNpsUserResultSuccessListener() { // from class: com.xiaomi.hm.health.nps.NpsUtil$hasUserResultInV1$1$1
                @Override // com.xiaomi.hm.health.nps.ui.NpsHelper.OnNpsUserResultSuccessListener
                public void onSuccess(boolean answered) {
                    if (answered) {
                        linkedHashSet.add(npsTarget.getSurveyId());
                    }
                    countDownLatch.countDown();
                }
            }, new NpsHelper.OnNpsUserResultErrorListener() { // from class: com.xiaomi.hm.health.nps.NpsUtil$hasUserResultInV1$1$2
                @Override // com.xiaomi.hm.health.nps.ui.NpsHelper.OnNpsUserResultErrorListener
                public void onError() {
                    countDownLatch.countDown();
                }
            });
        }
        countDownLatch.await();
        return linkedHashSet.size() > 0;
    }

    public final boolean isActiveDeviceConnected(@NotNull Context context, @NotNull List<? extends HMDeviceType> deviceTypes) {
        while (true) {
            boolean z = false;
            for (HMDeviceType hMDeviceType : deviceTypes) {
                if (hMDeviceType != HMDeviceType.WATCH) {
                    HMBaseDevice device = HMDeviceManager.getInstance().getDevice(hMDeviceType);
                    if (z || (device != null && device.isConnected())) {
                        z = true;
                    }
                } else if (z || DeviceManager.getManager(context).isBoundDeviceConnected()) {
                    z = true;
                }
            }
            return z;
        }
    }

    public final void readNpsClickStatus(@NotNull final Function1<? super Boolean, Unit> statusCallback) {
        HMPropertyUtil.getPropertyAsync(HMProperty.PROP_KEY_NPS_COMPLETED, true, new HMPropertyUtil.GetPropertyHandler() { // from class: com.xiaomi.hm.health.nps.NpsUtil.readNpsClickStatus.1
            @Override // com.xiaomi.hm.health.utils.HMPropertyUtil.GetPropertyHandler
            public void onFailed() {
                statusCallback.invoke(Boolean.TRUE);
            }

            @Override // com.xiaomi.hm.health.utils.HMPropertyUtil.GetPropertyHandler
            public void onSuccess(@Nullable String value) {
                statusCallback.invoke(Boolean.valueOf(Intrinsics.areEqual(value, "true")));
            }
        });
        String property = HMPropertyUtil.getProperty(HMProperty.PROP_KEY_NPS_COMPLETED, null);
        if (property != null) {
            statusCallback.invoke(Boolean.valueOf(Intrinsics.areEqual(property, "true")));
        }
    }

    public final void setHasNpsActivityDone(int i) {
        hasNpsActivityDone = i;
    }

    public final void setNpsClickStatus() {
        HMPropertyUtil.setProperty(HMProperty.PROP_KEY_NPS_COMPLETED, "true");
        HMPropertyUtil.postPropertisToServer(true);
    }

    public final void updateNpsClickStatus(@Nullable List<NpsClickedMode> clickedMode) {
        HMPropertyUtil.setProperty(HMProperty.PROP_KEY_NPS_MULTI_COMPLETED, clickedMode == null ? "[]" : new Gson().toJson(clickedMode));
        HMPropertyUtil.postPropertisToServer(true);
    }
}
