package com.xiaomi.hm.health.smalltool.util;

import android.content.Context;
import com.google.android.exoplayer2.source.rtsp.SessionDescription;
import com.huami.tools.analytics.DbUtils;
import com.huami.watch.util.Log;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.device.HMDeviceManager;
import com.xiaomi.hm.health.smalltool.ToolUpdateEvent;
import com.xiaomi.hm.health.smalltool.model.Tool;
import com.xiaomi.hm.health.smalltool.model.ToolManager;
import de.greenrobot.event.EventBus;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0007J\u0018\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0018\u0010\r\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000b\u001a\u00020\nH\u0007J\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000b\u001a\u00020\nH\u0007J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000b\u001a\u00020\nH\u0007J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000b\u001a\u00020\nH\u0007J\u001a\u0010\u0014\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\u0013\u001a\u0004\u0018\u00010\u000eH\u0007¨\u0006\u0017"}, d2 = {"Lcom/xiaomi/hm/health/smalltool/util/ToolUtil;", "", "Lcom/xiaomi/hm/health/smalltool/model/Tool;", SessionDescription.s, "", "addToMyTools", "", "toolName", "", "canAddToMyTools", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "open", "isSupport", "Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "getCurrentDevice", "getCurrentSecondDevice", "getCurrentThirdDevice", "getCurrentForthDevice", "currentDevice", "isCurrentDeviceConnected", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class ToolUtil {

    @NotNull
    public static final ToolUtil INSTANCE = new ToolUtil();

    private ToolUtil() {
    }

    @JvmStatic
    public static final void addToMyTools(@NotNull Tool tool) {
        ToolManager.INSTANCE.addToMyTools(tool);
        EventBus.getDefault().post(new ToolUpdateEvent());
    }

    @JvmStatic
    public static final boolean canAddToMyTools(@NotNull Tool tool) {
        return ToolManager.INSTANCE.canAddToMyTools(tool);
    }

    @JvmStatic
    @Nullable
    public static final HMDeviceSource getCurrentDevice(@NotNull Context context) {
        HMDeviceSource boundDeviceSource = HMDeviceManager.getInstance().getBoundDeviceSource(HMDeviceType.MILI);
        if (boundDeviceSource == HMDeviceSource.VDEVICE) {
            boundDeviceSource = HMDeviceManager.getInstance().getBoundDeviceSource(HMDeviceType.WATCH);
        }
        Log.d("SmallTool-Util", "Get CurrentDevice: " + boundDeviceSource, new Object[0]);
        return boundDeviceSource;
    }

    @JvmStatic
    @Nullable
    public static final HMDeviceSource getCurrentForthDevice(@NotNull Context context) {
        HMDeviceSource boundDeviceSource = HMDeviceManager.getInstance().getBoundDeviceSource(HMDeviceType.EARBUD);
        Log.d("SmallTool-Util", "Get CurrentForthDevice: " + boundDeviceSource, new Object[0]);
        return boundDeviceSource;
    }

    @JvmStatic
    @Nullable
    public static final HMDeviceSource getCurrentSecondDevice(@NotNull Context context) {
        HMDeviceSource boundDeviceSource = HMDeviceManager.getInstance().getBoundDeviceSource(HMDeviceType.WEIGHT);
        Log.d("SmallTool-Util", "Get CurrentSecondDevice: " + boundDeviceSource, new Object[0]);
        return boundDeviceSource;
    }

    @JvmStatic
    @Nullable
    public static final HMDeviceSource getCurrentThirdDevice(@NotNull Context context) {
        HMDeviceSource boundDeviceSource = HMDeviceManager.getInstance().getBoundDeviceSource(HMDeviceType.TREADMILL);
        Log.d("SmallTool-Util", "Get CurrentSecondDevice: " + boundDeviceSource, new Object[0]);
        return boundDeviceSource;
    }

    @JvmStatic
    public static final boolean isCurrentDeviceConnected(@NotNull Context context, @Nullable HMDeviceSource currentDevice) {
        if (currentDevice == null) {
            return false;
        }
        return HMDeviceManager.getInstance().isConnected(currentDevice.getType());
    }

    @JvmStatic
    public static final boolean isSupport(@NotNull Context context, @NotNull Tool tool) {
        return tool.isSupport(context, ToolManager.INSTANCE.getMCurrentDevice());
    }

    @JvmStatic
    public static final void open(@NotNull Context context, @NotNull Tool tool) {
        tool.open(context, ToolManager.INSTANCE.getMCurrentDevice());
    }

    @JvmStatic
    public static final boolean canAddToMyTools(@NotNull String toolName) {
        try {
            return canAddToMyTools(Tool.valueOf(toolName));
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
            return false;
        }
    }

    @JvmStatic
    public static final void addToMyTools(@NotNull String toolName) {
        try {
            addToMyTools(Tool.valueOf(toolName));
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
    }
}
