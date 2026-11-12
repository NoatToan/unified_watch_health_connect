package com.xiaomi.hm.health.device.earbud.repo;

import com.huami.devicex.manager.DeviceManagerApi;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.databases.HMDaoManager;
import com.xiaomi.hm.health.databases.model.EarbudMusicInfo;
import com.xiaomi.hm.health.databases.model.EarbudMusicInfoDao;
import com.xiaomi.hm.health.device.webapi.earbud.EarbudCloudMusicData;
import com.xiaomi.hm.health.device.webapi.earbud.HmEarbudWebApi;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.qualifier.Qualifier;
import org.koin.mp.KoinPlatformTools;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0014\u0010\t\u001a\u00020\b2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006J\u0006\u0010\n\u001a\u00020\bR\u001d\u0010\u000f\u001a\u00020\u000b8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000e¨\u0006\u0013"}, d2 = {"Lcom/xiaomi/hm/health/device/earbud/repo/EarbudCloudDataRepo;", "Lorg/koin/core/component/KoinComponent;", "", DTransferConstants.PAGE, "Lcom/xiaomi/hm/health/device/webapi/earbud/EarbudCloudMusicData;", "getMusicList", "", "ids", "", "getMusicByIds", "refreshMusicNames", "Lcom/huami/devicex/manager/DeviceManagerApi;", "a", "Lkotlin/Lazy;", "()Lcom/huami/devicex/manager/DeviceManagerApi;", "deviceManagerApi", "<init>", "()V", "Companion", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class EarbudCloudDataRepo implements KoinComponent {
    private static final int b = 10;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Lazy deviceManagerApi;

    /* JADX WARN: Multi-variable type inference failed */
    public EarbudCloudDataRepo() {
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = KoinPlatformTools.INSTANCE.defaultLazyMode();
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.deviceManagerApi = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<DeviceManagerApi>() { // from class: com.xiaomi.hm.health.device.earbud.repo.EarbudCloudDataRepo$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.devicex.manager.DeviceManagerApi, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final DeviceManagerApi invoke() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(DeviceManagerApi.class), qualifier, objArr);
            }
        });
    }

    private final DeviceManagerApi a() {
        return (DeviceManagerApi) this.deviceManagerApi.getValue();
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }

    public final void getMusicByIds(@NotNull List<Integer> ids) {
        List<EarbudMusicInfo> musicListById = HmEarbudWebApi.INSTANCE.getMusicListById(a().getBoundDeviceSource(HMDeviceType.EARBUD).getValue(), ids);
        if (musicListById == null) {
            return;
        }
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(musicListById, 10));
        for (EarbudMusicInfo earbudMusicInfo : musicListById) {
            earbudMusicInfo.setLocalStatus(3);
            earbudMusicInfo.setLocalUpdateTime(Long.valueOf(System.currentTimeMillis()));
            arrayList.add(earbudMusicInfo);
        }
        if (!(!arrayList.isEmpty())) {
            arrayList = null;
        }
        if (arrayList == null) {
            return;
        }
        HMDaoManager.getInstance().getEarbudMusicInfoDao().insertOrReplaceInTx(arrayList);
    }

    @Nullable
    public final EarbudCloudMusicData getMusicList(int page) {
        EarbudCloudMusicData musicList = HmEarbudWebApi.INSTANCE.getMusicList(a().getBoundDeviceSource(HMDeviceType.EARBUD).getValue(), page, 10);
        EarbudMusicInfoDao earbudMusicInfoDao = HMDaoManager.getInstance().getEarbudMusicInfoDao();
        if (musicList != null) {
            List<EarbudMusicInfo> data = musicList.getData();
            List<EarbudMusicInfo> list = null;
            if (data != null) {
                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(data, 10));
                for (EarbudMusicInfo earbudMusicInfo : data) {
                    EarbudMusicInfo earbudMusicInfoLoad = earbudMusicInfoDao.load(earbudMusicInfo.getId());
                    if (earbudMusicInfoLoad != null) {
                        earbudMusicInfo.setLocalStatus(earbudMusicInfoLoad.getLocalStatus());
                        earbudMusicInfo.setLocalUpdateTime(earbudMusicInfoLoad.getLocalUpdateTime());
                    }
                    arrayList.add(earbudMusicInfo);
                }
                List<EarbudMusicInfo> mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) arrayList);
                if (mutableList != null) {
                    earbudMusicInfoDao.insertOrReplaceInTx(mutableList);
                    Unit unit = Unit.INSTANCE;
                    list = mutableList;
                }
            }
            musicList.setData(list);
        }
        return musicList;
    }

    public final void refreshMusicNames() {
        List<Integer> arrayList;
        EarbudMusicInfoDao earbudMusicInfoDao = HMDaoManager.getInstance().getEarbudMusicInfoDao();
        int value = a().getBoundDeviceSource(HMDeviceType.EARBUD).getValue();
        List<EarbudMusicInfo> listLoadAll = earbudMusicInfoDao.loadAll();
        if (listLoadAll == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList<>(CollectionsKt__IterablesKt.collectionSizeOrDefault(listLoadAll, 10));
            Iterator<T> it2 = listLoadAll.iterator();
            while (it2.hasNext()) {
                arrayList.add(Integer.valueOf((int) ((EarbudMusicInfo) it2.next()).getId().longValue()));
            }
        }
        if (arrayList == null) {
            arrayList = CollectionsKt__CollectionsKt.emptyList();
        }
        List<EarbudMusicInfo> musicListById = HmEarbudWebApi.INSTANCE.getMusicListById(value, arrayList);
        if (musicListById == null) {
            return;
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(musicListById, 10));
        for (EarbudMusicInfo earbudMusicInfo : musicListById) {
            EarbudMusicInfo earbudMusicInfoLoad = earbudMusicInfoDao.load(earbudMusicInfo.getId());
            if (earbudMusicInfoLoad != null) {
                earbudMusicInfoLoad.setName(earbudMusicInfo.getName());
                earbudMusicInfo = earbudMusicInfoLoad;
            }
            arrayList2.add(earbudMusicInfo);
        }
        ArrayList arrayList3 = arrayList2.isEmpty() ^ true ? arrayList2 : null;
        if (arrayList3 == null) {
            return;
        }
        earbudMusicInfoDao.insertOrReplaceInTx(arrayList3);
    }
}
