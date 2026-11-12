package com.xiaomi.hm.health.device.setting.appsort.repo;

import android.content.Context;
import android.widget.Toast;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.bluetooth.profile.channel.module.display_list_setting.DisplayBean;
import com.huami.bluetooth.profile.channel.module.display_list_setting.DisplayListSettingModule;
import com.huami.devicex.R;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.device.introduce.IntroduceShuffleFactoryKt;
import com.xiaomi.hm.health.device.setting.DeviceCenter;
import com.xiaomi.hm.health.device.setting.appsort.AppGroup;
import com.xiaomi.hm.health.device.setting.appsort.IdSortItem;
import com.xiaomi.hm.health.device.setting.appsort.condition.AppGroupCountCondition;
import com.xiaomi.hm.health.device.setting.appsort.condition.ZeppOSHideCondition;
import com.xiaomi.hm.health.device.setting.appsort.repo.iddesc.MockAppSortIdDescImpl;
import com.xiaomi.hm.health.device.setting.appsort.repo.iddesc.web.RealIdDescImpl;
import com.xiaomi.hm.health.device.setting.network.bean.Sort;
import com.xiaomi.hm.health.device.setting.network.bean.WatchSettings;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.WatchSettingExtsKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 $2\u00020\u0001:\u0001$B\u0017\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b\"\u0010#J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\t\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0010\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0004H\u0016J\u0010\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016R\u0016\u0010\u0013\u001a\u00020\u00108\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0018\u001a\u00020\u00078\u0016@\u0016X\u0096D¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R&\u0010\u001d\u001a\u0012\u0012\u0004\u0012\u00020\f0\u0019j\b\u0012\u0004\u0012\u00020\f`\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006%"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/appsort/repo/HuamiOSAppSortRepo;", "Lcom/xiaomi/hm/health/device/setting/appsort/repo/BaseHuamiOSSortRepo;", "Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "source", "", "", "getConditions", "", "group", "toPageIndex", "Lcom/xiaomi/hm/health/device/setting/appsort/AppGroup;", "getAppGroup", "", "config", "", "saveToDB", "Lcom/xiaomi/hm/health/device/setting/appsort/repo/iddesc/web/RealIdDescImpl;", "f", "Lcom/xiaomi/hm/health/device/setting/appsort/repo/iddesc/web/RealIdDescImpl;", "idSortApi", "g", LogUtil.I, "getType", "()I", "type", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "h", "Ljava/util/ArrayList;", "canNotHideIDList", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Lcom/xiaomi/hm/health/device/setting/DeviceCenter;", "deviceCenter", "<init>", "(Landroid/content/Context;Lcom/xiaomi/hm/health/device/setting/DeviceCenter;)V", "Companion", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class HuamiOSAppSortRepo extends BaseHuamiOSSortRepo {

    @NotNull
    private static final String i = "HuamiOSAppSortRepo";
    private static final int j = 1;
    private static final int k = 2;
    private static final int l = 3;
    private static final int m = Integer.MAX_VALUE;
    private static final int n = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final RealIdDescImpl idSortApi;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final int type;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private ArrayList<String> canNotHideIDList;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "list null";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str) {
            super(0);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "configStr: " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function1<Context, Unit> {
        public static final c a = new c();

        public c() {
            super(1);
        }

        public final void a(@NotNull Context context) {
            Toast.makeText(context, R.string.app_setting_not_support_hidden, 0).show();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Context context) {
            a(context);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/network/bean/WatchSettings;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function1<WatchSettings, Unit> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str) {
            super(1);
            this.a = str;
        }

        public final void a(@NotNull WatchSettings watchSettings) {
            Sort sort = watchSettings.getSort();
            if (sort == null) {
                return;
            }
            sort.setAppSort(this.a);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(WatchSettings watchSettings) {
            a(watchSettings);
            return Unit.INSTANCE;
        }
    }

    public HuamiOSAppSortRepo(@NotNull Context context, @NotNull DeviceCenter deviceCenter) {
        super(context, deviceCenter);
        this.idSortApi = new RealIdDescImpl(1, Integer.valueOf(deviceCenter.getDeviceSource().getValue()));
        this.type = 1;
        this.canNotHideIDList = new ArrayList<>();
    }

    @Override // com.xiaomi.hm.health.device.setting.appsort.repo.ISortRepo
    @Nullable
    public List<AppGroup> getAppGroup() {
        DisplayListSettingModule displayModule = getDisplayModule();
        List<DisplayBean> listQueryList = displayModule == null ? null : displayModule.queryList(getType());
        if (listQueryList == null || listQueryList.isEmpty()) {
            HMLog.error$default(i, null, null, a.a, 6, null);
            return null;
        }
        String configStr = BaseHuamiOSSortRepo.INSTANCE.toConfigStr(listQueryList);
        HMLog.info(i, new b(configStr));
        WatchSettingExtsKt.getWatchSettingManager().onQueryAppSort(configStr);
        RealIdDescImpl realIdDescImpl = this.idSortApi;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listQueryList, 10));
        Iterator<T> it2 = listQueryList.iterator();
        while (it2.hasNext()) {
            arrayList.add(String.valueOf(MockAppSortIdDescImpl.INSTANCE.hexStrToInt(((DisplayBean) it2.next()).getAppId())));
        }
        if (!realIdDescImpl.parse(arrayList)) {
            return null;
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        for (DisplayBean displayBean : listQueryList) {
            BaseHuamiOSSortRepo.Companion companion = BaseHuamiOSSortRepo.INSTANCE;
            if (!companion.canHide(displayBean)) {
                this.canNotHideIDList.add(displayBean.getAppId());
            }
            String desc = this.idSortApi.getDesc(String.valueOf(MockAppSortIdDescImpl.INSTANCE.hexStrToInt(displayBean.getAppId())));
            int pageIndex = displayBean.getPageIndex();
            if (pageIndex == 1) {
                arrayList2.add(new IdSortItem(desc, displayBean.getAppId(), companion.canHide(displayBean)));
            } else if (pageIndex == 2) {
                arrayList3.add(new IdSortItem(desc, displayBean.getAppId(), companion.canHide(displayBean)));
            } else if (pageIndex == 3) {
                arrayList4.add(new IdSortItem(desc, displayBean.getAppId(), companion.canHide(displayBean)));
            }
        }
        ArrayList arrayList5 = new ArrayList();
        arrayList5.add(new AppGroup(255, arrayList2, IntroduceShuffleFactoryKt.getString(R.string.sort_top_label)));
        arrayList5.add(new AppGroup(7, arrayList3, IntroduceShuffleFactoryKt.getString(R.string.more)));
        arrayList5.add(new AppGroup(arrayList4, IntroduceShuffleFactoryKt.getString(R.string.invisible_item_app)));
        return CollectionsKt___CollectionsKt.toList(arrayList5);
    }

    @Override // com.xiaomi.hm.health.device.setting.appsort.repo.ISortRepo
    @NotNull
    public List<Object> getConditions(@NotNull HMDeviceSource source) {
        ArrayList<String> arrayList = this.canNotHideIDList;
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
        for (String str : arrayList) {
            Integer numHexStrToInt = MockAppSortIdDescImpl.INSTANCE.hexStrToInt(str);
            arrayList2.add(new ZeppOSHideCondition(str, false, (numHexStrToInt != null && numHexStrToInt.intValue() == 19) ? c.a : null, 2, null));
        }
        String quantityString = getCom.huami.tools.analytics.DbUtils.Const.Table.CONTEXT java.lang.String().getResources().getQuantityString(R.plurals.app_sort_tips_max, Integer.MAX_VALUE, Integer.MAX_VALUE);
        String string = getCom.huami.tools.analytics.DbUtils.Const.Table.CONTEXT java.lang.String().getString(R.string.ds_zepp_os_app_sort_min_limit_tips);
        ArrayList arrayList3 = new ArrayList();
        arrayList3.add(new AppGroupCountCondition(255, Integer.MAX_VALUE, Integer.MIN_VALUE, quantityString, string));
        arrayList3.addAll(arrayList2);
        return arrayList3;
    }

    @Override // com.xiaomi.hm.health.device.setting.appsort.repo.BaseHuamiOSSortRepo
    public int getType() {
        return this.type;
    }

    @Override // com.xiaomi.hm.health.device.setting.appsort.repo.BaseHuamiOSSortRepo
    public boolean saveToDB(@NotNull String config) {
        WatchSettingExtsKt.getWatchSettingManager().modify(true, new d(config));
        return true;
    }

    @Override // com.xiaomi.hm.health.device.setting.appsort.repo.BaseHuamiOSSortRepo
    public int toPageIndex(int group) {
        if (group == -1) {
            return 3;
        }
        if (group == 7) {
            return 2;
        }
        if (group == 255) {
            return 1;
        }
        throw new IllegalStateException("parentType not found".toString());
    }
}
