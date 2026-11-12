package com.xiaomi.hm.health.smalltool.model;

import android.content.Context;
import com.google.android.exoplayer2.source.rtsp.SessionDescription;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.tools.analytics.DbUtils;
import com.huami.watch.util.ArraysUtil;
import com.huami.watch.util.Log;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.smalltool.model.Tool;
import com.xiaomi.hm.health.smalltool.model.ToolManager;
import com.xiaomi.hm.health.utils.HMPropertyUtil;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.slf4j.helpers.MessageFormatter;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0017\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b5\u00106J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002J\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002J&\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u0002H\u0002J\u0018\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u0007H\u0002J.\u0010\u0010\u001a\u00020\u000f2\b\u0010\f\u001a\u0004\u0018\u00010\u00072\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002J \u0010\u0012\u001a\u00020\u000f2\b\u0010\f\u001a\u0004\u0018\u00010\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\n0\u0002H\u0002J\u001a\u0010\u0014\u001a\u00020\u000f2\b\u0010\f\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0013\u001a\u00020\u0003H\u0002J\u0012\u0010\u0015\u001a\u00020\n2\b\u0010\f\u001a\u0004\u0018\u00010\u0007H\u0002J/\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0017\u001a\u00020\u00162\u0012\u0010\t\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u0018\"\u00020\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\"\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u001c\u001a\u00020\u001bJ\"\u0010\u001e\u001a\u00020\u000f2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002J\u000e\u0010\u001f\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0003J\u000e\u0010!\u001a\u00020 2\u0006\u0010\u0013\u001a\u00020\u0003R(\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00070\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R$\u0010.\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R(\u00101\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010#\u001a\u0004\b/\u0010%\"\u0004\b0\u0010'R(\u00104\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010#\u001a\u0004\b2\u0010%\"\u0004\b3\u0010'¨\u00067"}, d2 = {"Lcom/xiaomi/hm/health/smalltool/model/ToolManager;", "", "", "Lcom/xiaomi/hm/health/smalltool/model/Tool;", "c", "supportTools", "i", "Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "firstDevice", "devices", "", "e", "device", "f", "myTools", "", "g", "tools", "h", SessionDescription.s, "b", GoogleApiAvailabilityLight.a, "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "getSupportTools", "(Landroid/content/Context;[Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;)Ljava/util/List;", "", "myToolsSize", "getMyTools", "saveMyTools", "addToMyTools", "", "canAddToMyTools", "a", "Ljava/util/List;", "getMDevices", "()Ljava/util/List;", "setMDevices", "(Ljava/util/List;)V", "mDevices", "Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "getMCurrentDevice", "()Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "setMCurrentDevice", "(Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;)V", "mCurrentDevice", "getMSupportTools", "setMSupportTools", "mSupportTools", "getMMyTools", "setMMyTools", "mMyTools", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class ToolManager {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private static HMDeviceSource mCurrentDevice;

    @NotNull
    public static final ToolManager INSTANCE = new ToolManager();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private static List<? extends HMDeviceSource> mDevices = CollectionsKt__CollectionsKt.emptyList();

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private static List<? extends Tool> mSupportTools = CollectionsKt__CollectionsKt.emptyList();

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private static List<? extends Tool> mMyTools = CollectionsKt__CollectionsKt.emptyList();

    private ToolManager() {
    }

    private final void b(HMDeviceSource device, Tool tool) {
        if (canAddToMyTools(tool)) {
            List mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) mMyTools);
            if (mutableList.size() > 0) {
                mutableList.remove(mutableList.size() - 1);
            }
            mutableList.add(0, tool);
            mMyTools = CollectionsKt___CollectionsKt.toList(mutableList);
            Log.d("SmallTool-Manager", "Add [" + tool + "] to MyTools...", new Object[0]);
            h(device, ToolManagerKt.a(mMyTools));
        }
    }

    private final List<Tool> c() {
        return ArraysKt___ArraysKt.toList(Tool.values());
    }

    private final String d(HMDeviceSource device) {
        return (device == null ? "no_device" : Integer.valueOf(device.getValue())).toString();
    }

    private final List<String> e(HMDeviceSource firstDevice, List<? extends HMDeviceSource> devices) {
        List<String> mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) f(firstDevice));
        if (!devices.isEmpty()) {
            for (HMDeviceSource hMDeviceSource : devices) {
                Sort[] sortArrValues = Sort.values();
                int length = sortArrValues.length;
                int i = 0;
                while (i < length) {
                    Sort sort = sortArrValues[i];
                    i++;
                    if (sort.getFilter().match(hMDeviceSource)) {
                        List mutableList2 = CollectionsKt___CollectionsKt.toMutableList((Collection) ToolManagerKt.b(sort.getSort()));
                        mutableList2.removeAll(mutableList);
                        mutableList.addAll(mutableList2);
                    }
                }
            }
        } else if (mutableList.isEmpty()) {
            mutableList.addAll(ToolManagerKt.b(Sort.NO_DEVICE.getSort()));
        }
        Log.d("SmallTool-Manager", "ToolsSort: " + ArraysUtil.toString(mutableList), new Object[0]);
        return mutableList;
    }

    private final List<String> f(HMDeviceSource device) {
        int length;
        ArrayList arrayList = new ArrayList();
        try {
            String property = HMPropertyUtil.getProperty("huami.mifit.user.settings.home.tools.order", MessageFormatter.c);
            Log.d("SmallTool-Manager", "Read MyTools Json: " + property, new Object[0]);
            Unit unit = Unit.INSTANCE;
            JSONArray jSONArrayOptJSONArray = new JSONObject(property).optJSONArray(INSTANCE.d(device));
            if (jSONArrayOptJSONArray != null && (length = jSONArrayOptJSONArray.length()) > 0) {
                int i = 0;
                while (true) {
                    int i2 = i + 1;
                    arrayList.add(jSONArrayOptJSONArray.getString(i));
                    if (i2 >= length) {
                        break;
                    }
                    i = i2;
                }
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        Log.d("SmallTool-Manager", "Read MyTools[Device: " + device + "]: " + ArraysUtil.toString(arrayList), new Object[0]);
        return arrayList;
    }

    private final void g(HMDeviceSource device, List<? extends Tool> supportTools, List<? extends Tool> myTools) {
        List<? extends Tool> list = CollectionsKt___CollectionsKt.toList(myTools);
        mMyTools = list;
        h(device, ToolManagerKt.a(list));
        mSupportTools = i(supportTools);
    }

    private final void h(HMDeviceSource device, List<String> tools) {
        try {
            String property = HMPropertyUtil.getProperty("huami.mifit.user.settings.home.tools.order", MessageFormatter.c);
            Log.d("SmallTool-Manager", "Read MyTools Json: " + property, new Object[0]);
            Unit unit = Unit.INSTANCE;
            JSONObject jSONObject = new JSONObject(property);
            jSONObject.put(INSTANCE.d(device), new JSONArray((Collection) tools));
            String string = jSONObject.toString();
            Log.d("SmallTool-Manager", "Save MyTools[Device: " + device + ", " + ArraysUtil.toString(tools) + "]: " + string, new Object[0]);
            HMPropertyUtil.setProperty("huami.mifit.user.settings.home.tools.order", string);
            HMPropertyUtil.postPropertisToServer(true);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    private final List<Tool> i(List<? extends Tool> supportTools) {
        List mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) supportTools);
        ToolManager toolManager = INSTANCE;
        HMDeviceSource hMDeviceSource = toolManager.getMDevices().isEmpty() ^ true ? toolManager.getMDevices().get(0) : null;
        toolManager.setMCurrentDevice(hMDeviceSource);
        final List<String> listE = toolManager.e(hMDeviceSource, toolManager.getMDevices());
        g.sortWith(mutableList, new Comparator() { // from class: ir7
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ToolManager.j(listE, (Tool) obj, (Tool) obj2);
            }
        });
        List<Tool> list = CollectionsKt___CollectionsKt.toList(mutableList);
        Log.d("SmallTool-Manager", "Get SupportTools[Device: " + hMDeviceSource + "]: " + ArraysUtil.toString(list), new Object[0]);
        return list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int j(List list, Tool tool, Tool tool2) {
        int iIndexOf = list.indexOf(tool.getKey());
        int iIndexOf2 = list.indexOf(tool2.getKey());
        return (iIndexOf < 0 || iIndexOf2 < 0) ? -(iIndexOf - iIndexOf2) : iIndexOf - iIndexOf2;
    }

    public final void addToMyTools(@NotNull Tool tool) {
        b(mCurrentDevice, tool);
    }

    public final boolean canAddToMyTools(@NotNull Tool tool) {
        if (!mSupportTools.contains(tool)) {
            Log.w("SmallTool-Manager", "[" + tool + "] NOT in SupportTools, Abort!!", new Object[0]);
            return false;
        }
        if (mMyTools.contains(tool)) {
            Log.w("SmallTool-Manager", "[" + tool + "] ALREADY in MyTools, Abort!!", new Object[0]);
            return false;
        }
        Log.d("SmallTool-Manager", "Can add [" + tool + "] to MyTools!!", new Object[0]);
        return true;
    }

    @Nullable
    public final HMDeviceSource getMCurrentDevice() {
        return mCurrentDevice;
    }

    @NotNull
    public final List<HMDeviceSource> getMDevices() {
        return mDevices;
    }

    @NotNull
    public final List<Tool> getMMyTools() {
        return mMyTools;
    }

    @NotNull
    public final List<Tool> getMSupportTools() {
        return mSupportTools;
    }

    @NotNull
    public final List<Tool> getMyTools(@NotNull List<? extends Tool> supportTools, int myToolsSize) {
        ToolManager toolManager = INSTANCE;
        if (supportTools.size() > myToolsSize) {
            supportTools = supportTools.subList(0, myToolsSize);
        }
        List<? extends Tool> list = CollectionsKt___CollectionsKt.toList(supportTools);
        Log.d("SmallTool-Manager", "Get MyTools[Max: " + myToolsSize + "]: " + ArraysUtil.toString(list), new Object[0]);
        Unit unit = Unit.INSTANCE;
        toolManager.setMMyTools(list);
        return mMyTools;
    }

    @NotNull
    public final List<Tool> getSupportTools(@NotNull Context context, @NotNull HMDeviceSource... devices) {
        HMDeviceSource hMDeviceSource;
        Log.d("SmallTool-Manager", "Devices: " + ArraysUtil.toString(devices), new Object[0]);
        mDevices = ArraysKt___ArraysKt.toList(devices);
        List<Tool> listC = c();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listC) {
            Tool tool = (Tool) obj;
            boolean zIsSupport = true;
            if (tool.getIsOnlyBelongPlay()) {
                zIsSupport = false;
                break;
            }
            if (!(devices.length == 0)) {
                int length = devices.length;
                int i = 0;
                do {
                    if (i >= length) {
                        zIsSupport = false;
                        break;
                    }
                    hMDeviceSource = devices[i];
                    i++;
                } while (!tool.isSupport(context, hMDeviceSource));
            } else {
                zIsSupport = tool.isSupport(context, null);
            }
            if (zIsSupport) {
                arrayList.add(obj);
            }
        }
        List<Tool> listI = i(arrayList);
        mSupportTools = listI;
        return listI;
    }

    public final void saveMyTools(@NotNull List<? extends Tool> supportTools, @NotNull List<? extends Tool> myTools) {
        g(mCurrentDevice, supportTools, myTools);
    }

    public final void setMCurrentDevice(@Nullable HMDeviceSource hMDeviceSource) {
        mCurrentDevice = hMDeviceSource;
    }

    public final void setMDevices(@NotNull List<? extends HMDeviceSource> list) {
        mDevices = list;
    }

    public final void setMMyTools(@NotNull List<? extends Tool> list) {
        mMyTools = list;
    }

    public final void setMSupportTools(@NotNull List<? extends Tool> list) {
        mSupportTools = list;
    }
}
