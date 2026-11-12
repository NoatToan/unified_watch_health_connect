package com.xiaomi.hm.health.play.repo;

import com.huami.tools.log.HMLog;
import com.huami.watch.util.ArraysUtil;
import com.huami.watchfacesstore.ext.KoinExtKt;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.databases.model.Device;
import com.xiaomi.hm.health.device.HMDeviceManager;
import com.xiaomi.hm.health.device.introduce.BindIntroExtendsKt;
import com.xiaomi.hm.health.play.PlayTabType;
import com.xiaomi.hm.health.play.PlayTool;
import com.xiaomi.hm.health.play.PlayToolsManager;
import com.xiaomi.hm.health.play.bean.SortTool;
import com.xiaomi.hm.health.play.process.IPlayToolsProcess;
import com.xiaomi.hm.health.play.process.PlayToolProcessFactory;
import com.xiaomi.hm.health.play.repo.ToolRepoImp;
import com.xiaomi.hm.health.play.sort.SortKeyManager;
import com.xiaomi.hm.health.smalltool.model.ToolKey;
import com.xiaomi.hm.health.utils.HMPropertyUtil;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u001c\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0016J$\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0016J\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u001e\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004H\u0016J\u001e\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004H\u0016¨\u0006\u0013"}, d2 = {"Lcom/xiaomi/hm/health/play/repo/ToolRepoImp;", "Lcom/xiaomi/hm/health/play/repo/IToolRepo;", "Lcom/xiaomi/hm/health/play/PlayTabType;", "tabType", "", "Lcom/xiaomi/hm/health/play/PlayTool;", "getSupportAndSortTools", "getTabAllTools", "tools", "getSupportTools", "getSortTools", "Lcom/xiaomi/hm/health/play/bean/SortTool;", "getSaveTools", "", "saveToolsToLocal", "saveToolsToCloud", "<init>", "()V", "Companion", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class ToolRepoImp implements IToolRepo {

    @NotNull
    private static final String a = "ToolRepoImp";

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PlayTabType.values().length];
            iArr[PlayTabType.INTELLIGENCE.ordinal()] = 1;
            iArr[PlayTabType.HEALTH.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
        }
    }

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
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "Read MyTools Json: " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ JSONException a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(JSONException jSONException) {
            super(0);
            this.a = jSONException;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "Read MyTools Json fail: " + this.a.getMessage();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public final /* synthetic */ List<PlayTool> a;
        public final /* synthetic */ List<PlayTool> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(List<PlayTool> list, List<PlayTool> list2) {
            super(0);
            this.a = list;
            this.b = list2;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "newTools: " + this.a + " \n sortTools: " + this.b;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<String> {
        public final /* synthetic */ List<Device> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(List<Device> list) {
            super(0);
            this.a = list;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            List<Device> list = this.a;
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
            for (Device device : list) {
                arrayList.add(TuplesKt.to(device.getDevice_source(), Boolean.valueOf(BindIntroExtendsKt.isActive(device))));
            }
            return "boundDevice: " + ArraysUtil.toString(arrayList);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<String> {
        public final /* synthetic */ JSONArray a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(JSONArray jSONArray) {
            super(0);
            this.a = jSONArray;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "after put tools jsonArray: " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function0<String> {
        public final /* synthetic */ PlayTabType a;
        public final /* synthetic */ List<SortTool> b;
        public final /* synthetic */ String c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(PlayTabType playTabType, List<SortTool> list, String str) {
            super(0);
            this.a = playTabType;
            this.b = list;
            this.c = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "Save MyTools[tabKey: " + this.a + ", " + ArraysUtil.toString(this.b) + "]: " + this.c;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g extends Lambda implements Function0<String> {
        public final /* synthetic */ JSONException a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(JSONException jSONException) {
            super(0);
            this.a = jSONException;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "saveToolsToLocal fail " + this.a.getMessage();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int b(List list, PlayTool playTool, PlayTool playTool2) {
        int iIndexOf = list.indexOf(playTool.getTool().getKey());
        int iIndexOf2 = list.indexOf(playTool2.getTool().getKey());
        return (iIndexOf < 0 || iIndexOf2 < 0) ? -(iIndexOf - iIndexOf2) : iIndexOf - iIndexOf2;
    }

    @Override // com.xiaomi.hm.health.play.repo.IToolRepo
    @NotNull
    public List<SortTool> getSaveTools(@NotNull PlayTabType tabType) {
        ArrayList arrayList = new ArrayList();
        String sortKeyByTabType = SortKeyManager.INSTANCE.getSortKeyByTabType(tabType);
        if (sortKeyByTabType != null) {
            try {
                String property = HMPropertyUtil.getProperty(sortKeyByTabType, "[]");
                HMLog.info(a, new a(property));
                Unit unit = Unit.INSTANCE;
                JSONArray jSONArray = new JSONArray(property);
                int length = jSONArray.length();
                int i = 0;
                if (length > 0) {
                    while (true) {
                        int i2 = i + 1;
                        JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
                        arrayList.add(new SortTool(jSONObjectOptJSONObject.optString("key"), jSONObjectOptJSONObject.optBoolean("isShow")));
                        if (i2 >= length) {
                            break;
                        }
                        i = i2;
                    }
                }
            } catch (JSONException e2) {
                HMLog.error$default(a, null, null, new b(e2), 6, null);
                e2.printStackTrace();
                Unit unit2 = Unit.INSTANCE;
            }
        }
        return arrayList;
    }

    @Override // com.xiaomi.hm.health.play.repo.IToolRepo
    @NotNull
    public List<PlayTool> getSortTools(@NotNull PlayTabType tabType, @NotNull List<PlayTool> tools) {
        List<SortTool> saveTools = getSaveTools(tabType);
        if (saveTools.isEmpty()) {
            return tools;
        }
        final ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(saveTools, 10));
        Iterator<T> it2 = saveTools.iterator();
        while (it2.hasNext()) {
            arrayList.add(((SortTool) it2.next()).getKey());
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator<T> it3 = tools.iterator();
        while (true) {
            if (!it3.hasNext()) {
                break;
            }
            Object next = it3.next();
            PlayTool playTool = (PlayTool) next;
            if ((arrayList.contains(playTool.getTool().getKey()) || Intrinsics.areEqual(playTool.getTool().getKey(), ToolKey.EDIT_CARD)) ? false : true) {
                arrayList2.add(next);
            }
        }
        List<PlayTool> mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) arrayList2);
        ArrayList<PlayTool> arrayList3 = new ArrayList();
        for (Object obj : tools) {
            if (!mutableList.contains((PlayTool) obj)) {
                arrayList3.add(obj);
            }
        }
        for (PlayTool playTool2 : arrayList3) {
            int iIndexOf = arrayList.indexOf(playTool2.getTool().getKey());
            if (iIndexOf != -1) {
                playTool2.setShow(saveTools.get(iIndexOf).isShow());
            }
        }
        List listSortedWith = CollectionsKt___CollectionsKt.sortedWith(arrayList3, new Comparator() { // from class: jr7
            @Override // java.util.Comparator
            public final int compare(Object obj2, Object obj3) {
                return ToolRepoImp.b(arrayList, (PlayTool) obj2, (PlayTool) obj3);
            }
        });
        HMLog.info(a, new c(mutableList, listSortedWith));
        mutableList.addAll(listSortedWith);
        return mutableList;
    }

    @Override // com.xiaomi.hm.health.play.repo.IToolRepo
    @NotNull
    public List<PlayTool> getSupportAndSortTools(@NotNull PlayTabType tabType) {
        List<PlayTool> sortTools = getSortTools(tabType, getSupportTools(getTabAllTools(tabType)));
        for (PlayTool playTool : sortTools) {
            IPlayToolsProcess playToolProcess = PlayToolProcessFactory.INSTANCE.getPlayToolProcess(playTool.getTool().getKey());
            if (playToolProcess != null) {
                playToolProcess.process(playTool);
            }
        }
        return sortTools;
    }

    @Override // com.xiaomi.hm.health.play.repo.IToolRepo
    @NotNull
    public List<PlayTool> getSupportTools(@NotNull List<PlayTool> tools) {
        List<Device> deviceListOrdered = HMDeviceManager.getDeviceListOrdered();
        HMLog.info(a, new d(deviceListOrdered));
        ArrayList arrayList = new ArrayList();
        for (Object obj : tools) {
            PlayTool playTool = (PlayTool) obj;
            boolean zIsSupport = true;
            if (!deviceListOrdered.isEmpty()) {
                Iterator<T> it2 = deviceListOrdered.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        zIsSupport = false;
                        break;
                    }
                    Device device = (Device) it2.next();
                    if (playTool.getTool().isSupport(KoinExtKt.getAppContext(), HMDeviceSource.fromValue(device.getDevice_source().intValue()))) {
                        playTool.setDeviceActive(BindIntroExtendsKt.isActive(device));
                        if (!Intrinsics.areEqual(playTool.getTool().getKey(), ToolKey.WATCHFACE_SETTING)) {
                            break;
                        }
                        playTool.setShow(BindIntroExtendsKt.isActive(device));
                        break;
                    }
                }
            } else {
                zIsSupport = playTool.getTool().isSupport(KoinExtKt.getAppContext(), null);
            }
            if (zIsSupport) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @Override // com.xiaomi.hm.health.play.repo.IToolRepo
    @NotNull
    public List<PlayTool> getTabAllTools(@NotNull PlayTabType tabType) {
        int i = WhenMappings.$EnumSwitchMapping$0[tabType.ordinal()];
        if (i != 1) {
            return i != 2 ? new PlayToolsManager().getSportToolList() : new PlayToolsManager().getHealthToolList();
        }
        return new PlayToolsManager().getIntelligenceToolList();
    }

    @Override // com.xiaomi.hm.health.play.repo.IToolRepo
    public void saveToolsToCloud(@NotNull PlayTabType tabType, @NotNull List<SortTool> tools) {
        HMPropertyUtil.postPropertisToServer(true);
    }

    @Override // com.xiaomi.hm.health.play.repo.IToolRepo
    public void saveToolsToLocal(@NotNull PlayTabType tabType, @NotNull List<SortTool> tools) {
        String sortKeyByTabType = SortKeyManager.INSTANCE.getSortKeyByTabType(tabType);
        if (sortKeyByTabType == null) {
            return;
        }
        try {
            JSONArray jSONArray = new JSONArray();
            for (SortTool sortTool : tools) {
                jSONArray.put(new JSONObject().put("key", sortTool.getKey()).put("isShow", sortTool.isShow()));
            }
            HMLog.info(a, new e(jSONArray));
            String string = jSONArray.toString();
            HMLog.debug(a, new f(tabType, tools, string));
            Unit unit = Unit.INSTANCE;
            HMPropertyUtil.setProperty(sortKeyByTabType, string);
        } catch (JSONException e2) {
            HMLog.error$default(a, null, null, new g(e2), 6, null);
            e2.printStackTrace();
        }
    }
}
