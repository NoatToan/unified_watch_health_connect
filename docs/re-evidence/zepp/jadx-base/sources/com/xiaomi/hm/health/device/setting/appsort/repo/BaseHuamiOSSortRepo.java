package com.xiaomi.hm.health.device.setting.appsort.repo;

import android.content.Context;
import com.amazon.identity.auth.device.datastore.AESEncryptionHelper;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.bluetooth.profile.channel.module.display_list_setting.DisplayBean;
import com.huami.bluetooth.profile.channel.module.display_list_setting.DisplayListSettingModule;
import com.huami.tools.analytics.DbUtils;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.device.setting.DeviceCenter;
import com.xiaomi.hm.health.device.setting.appsort.AppGroup;
import com.xiaomi.hm.health.device.setting.appsort.AppItem;
import com.xiaomi.hm.health.device.setting.appsort.IdSortItem;
import com.xiaomi.hm.health.device.setting.appsort.repo.iddesc.MockAppSortIdDescImpl;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\b&\u0018\u0000 (2\u00020\u0001:\u0001(B\u0017\u0012\u0006\u0010\u0014\u001a\u00020\u0010\u0012\u0006\u0010\u001a\u001a\u00020\u0015¢\u0006\u0004\b&\u0010'J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H&J\u0016\u0010\f\u001a\u00020\u00022\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0016J\u0010\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH&R\u001c\u0010\u0014\u001a\u00020\u00108\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\u001a\u001a\u00020\u00158\u0006@\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R$\u0010\"\u001a\u0004\u0018\u00010\u001b8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u0016\u0010%\u001a\u00020\u00068&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$¨\u0006)"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/appsort/repo/BaseHuamiOSSortRepo;", "Lcom/xiaomi/hm/health/device/setting/appsort/repo/ISortRepo;", "", "canDisable", "", "a", "", "group", "toPageIndex", "", "Lcom/xiaomi/hm/health/device/setting/appsort/AppGroup;", "groups", "saveToDeviceAndDb", "", "config", "saveToDB", "Landroid/content/Context;", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Lcom/xiaomi/hm/health/device/setting/DeviceCenter;", "b", "Lcom/xiaomi/hm/health/device/setting/DeviceCenter;", "getDeviceCenter", "()Lcom/xiaomi/hm/health/device/setting/DeviceCenter;", "deviceCenter", "Lcom/huami/bluetooth/profile/channel/module/display_list_setting/DisplayListSettingModule;", "c", "Lcom/huami/bluetooth/profile/channel/module/display_list_setting/DisplayListSettingModule;", "getDisplayModule", "()Lcom/huami/bluetooth/profile/channel/module/display_list_setting/DisplayListSettingModule;", "setDisplayModule", "(Lcom/huami/bluetooth/profile/channel/module/display_list_setting/DisplayListSettingModule;)V", "displayModule", "getType", "()I", "type", "<init>", "(Landroid/content/Context;Lcom/xiaomi/hm/health/device/setting/DeviceCenter;)V", "Companion", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public abstract class BaseHuamiOSSortRepo implements ISortRepo {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final int d = 0;
    private static final int e = 1;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final DeviceCenter deviceCenter;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private DisplayListSettingModule displayModule;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ\n\u0010\u0004\u001a\u00020\u0003*\u00020\u0002J\u0010\u0010\u0007\u001a\u00020\u0006*\b\u0012\u0004\u0012\u00020\u00020\u0005R\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0016\u0010\u000b\u001a\u00020\b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\n¨\u0006\u000e"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/appsort/repo/BaseHuamiOSSortRepo$Companion;", "", "Lcom/huami/bluetooth/profile/channel/module/display_list_setting/DisplayBean;", "", "canHide", "", "", "toConfigStr", "", "FLAG_CANNOT_HIDE", LogUtil.I, "FLAG_NULL", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/display_list_setting/DisplayBean;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function1<DisplayBean, CharSequence> {
            public static final a a = new a();

            public a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final CharSequence invoke(@NotNull DisplayBean displayBean) {
                int pageIndex = displayBean.getPageIndex();
                byte feature = displayBean.getFeature();
                return pageIndex + "," + ((int) feature) + "," + displayBean.getItemIndex() + "," + MockAppSortIdDescImpl.INSTANCE.hexStrToInt(displayBean.getAppId());
            }
        }

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean canHide(@NotNull DisplayBean displayBean) {
            return (displayBean.getFeature() & 1) == 0;
        }

        @NotNull
        public final String toConfigStr(@NotNull List<DisplayBean> list) {
            return CollectionsKt___CollectionsKt.joinToString$default(list, AESEncryptionHelper.SEPARATOR, null, null, 0, null, a.a, 30, null);
        }
    }

    public BaseHuamiOSSortRepo(@NotNull Context context, @NotNull DeviceCenter deviceCenter) {
        this.context = context;
        this.deviceCenter = deviceCenter;
        HMBaseDevice device = deviceCenter.getDevice();
        this.displayModule = device == null ? null : (DisplayListSettingModule) device.getChannelModule(DisplayListSettingModule.class);
    }

    private final byte a(boolean canDisable) {
        return (byte) (!canDisable ? 1 : 0);
    }

    @Override // com.xiaomi.hm.health.device.setting.appsort.repo.ISortRepo
    @NotNull
    public Context getContext() {
        return this.context;
    }

    @Override // com.xiaomi.hm.health.device.setting.appsort.repo.ISortRepo
    @NotNull
    public final DeviceCenter getDeviceCenter() {
        return this.deviceCenter;
    }

    @Nullable
    public final DisplayListSettingModule getDisplayModule() {
        return this.displayModule;
    }

    public abstract int getType();

    public abstract boolean saveToDB(@NotNull String config);

    @Override // com.xiaomi.hm.health.device.setting.appsort.repo.ISortRepo
    public boolean saveToDeviceAndDb(@NotNull List<AppGroup> groups) {
        ArrayList arrayList = new ArrayList();
        int i = Integer.MAX_VALUE;
        int i2 = 0;
        for (AppGroup appGroup : CollectionsKt___CollectionsKt.sortedWith(groups, new Comparator() { // from class: com.xiaomi.hm.health.device.setting.appsort.repo.BaseHuamiOSSortRepo$saveToDeviceAndDb$$inlined$sortedByDescending$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return ComparisonsKt__ComparisonsKt.compareValues(Integer.valueOf(((AppGroup) t2).getGroup()), Integer.valueOf(((AppGroup) t).getGroup()));
            }
        })) {
            int pageIndex = toPageIndex(appGroup.getGroup());
            if (i != pageIndex) {
                i2 = 0;
            }
            Iterator<T> it2 = appGroup.getItems().iterator();
            while (it2.hasNext()) {
                IdSortItem idSortItem = (IdSortItem) ((AppItem) it2.next());
                arrayList.add(new DisplayBean(pageIndex, a(idSortItem.getCanDisable()), i2, idSortItem.getId()));
                i2++;
            }
            i = pageIndex;
        }
        DisplayListSettingModule displayListSettingModule = this.displayModule;
        boolean zUpdateList = displayListSettingModule != null ? displayListSettingModule.updateList(getType(), arrayList) : false;
        if (zUpdateList) {
            saveToDB(INSTANCE.toConfigStr(arrayList));
        }
        return zUpdateList;
    }

    public final void setDisplayModule(@Nullable DisplayListSettingModule displayListSettingModule) {
        this.displayModule = displayListSettingModule;
    }

    public abstract int toPageIndex(int group);
}
