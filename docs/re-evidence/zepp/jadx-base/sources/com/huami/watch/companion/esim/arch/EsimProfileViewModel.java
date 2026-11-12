package com.huami.watch.companion.esim.arch;

import android.app.Application;
import androidx.p008lifecycle.AndroidViewModel;
import androidx.p008lifecycle.MediatorLiveData;
import androidx.p008lifecycle.Observer;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.huami.components.devicestatus.DeviceStatusDelegate;
import com.huami.components.devicestatus.DeviceStatusListener;
import com.huami.tools.log.HMLog;
import com.huami.watch.companion.esim.arch.EsimProfileViewModel;
import com.huami.watch.companion.esim.model.SimpleProfileInfo;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 +2\u00020\u0001:\u0001+B\u000f\u0012\u0006\u0010(\u001a\u00020'¢\u0006\u0004\b)\u0010*J\b\u0010\u0003\u001a\u00020\u0002H\u0014J\u000e\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u0016\u0010\n\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bJ\u0016\u0010\f\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0004J\u000e\u0010\r\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0004J\b\u0010\u000e\u001a\u0004\u0018\u00010\u0004J\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0007\u001a\u00020\u0004J\u0006\u0010\u0011\u001a\u00020\u0002J\u000e\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004R%\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u00140\u00138\u0006@\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u001f\u001a\u00020\u001a8\u0006@\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\b0\u00138\u0006@\u0006¢\u0006\f\n\u0004\b \u0010\u0016\u001a\u0004\b!\u0010\u0018R\u0016\u0010&\u001a\u00020#8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006,"}, d2 = {"Lcom/huami/watch/companion/esim/arch/EsimProfileViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "", "onCleared", "", "profileInfo", "setProfileData", "iccId", "", "isEnable", "setEnable", "name", "setName", "deleteProfile", "getEnableId", "Lcom/huami/watch/companion/esim/model/SimpleProfileInfo;", "getProfile", "clearData", "getProfileName", "Landroidx/lifecycle/MediatorLiveData;", "", "a", "Landroidx/lifecycle/MediatorLiveData;", "getProfileList", "()Landroidx/lifecycle/MediatorLiveData;", "profileList", "Lcom/huami/watch/companion/esim/arch/EsimProfileLiveData;", "b", "Lcom/huami/watch/companion/esim/arch/EsimProfileLiveData;", "getProfileMap", "()Lcom/huami/watch/companion/esim/arch/EsimProfileLiveData;", "profileMap", "c", "getConnectStateLiveData", "connectStateLiveData", "Lcom/huami/components/devicestatus/DeviceStatusListener;", GoogleApiAvailabilityLight.a, "Lcom/huami/components/devicestatus/DeviceStatusListener;", "deviceListener", "Landroid/app/Application;", MimeTypes.BASE_TYPE_APPLICATION, "<init>", "(Landroid/app/Application;)V", "Companion", "esim_release"}, k = 1, mv = {1, 5, 1})
public final class EsimProfileViewModel extends AndroidViewModel {

    @NotNull
    private static final String e = "EsimProfile";
    private static final int f = 4;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final MediatorLiveData<List<SimpleProfileInfo>> profileList;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final EsimProfileLiveData profileMap;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final MediatorLiveData<Boolean> connectStateLiveData;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final DeviceStatusListener deviceListener;

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
        public final String invoke() {
            return Intrinsics.stringPlus("ProfileList:", this.a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ Exception a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Exception exc) {
            super(0);
            this.a = exc;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return this.a.getMessage();
        }
    }

    public EsimProfileViewModel(@NotNull Application application) {
        super(application);
        MediatorLiveData<List<SimpleProfileInfo>> mediatorLiveData = new MediatorLiveData<>();
        this.profileList = mediatorLiveData;
        EsimProfileLiveData companion = EsimProfileLiveData.INSTANCE.getInstance();
        this.profileMap = companion;
        this.connectStateLiveData = new MediatorLiveData<>();
        DeviceStatusListener deviceStatusListener = new DeviceStatusListener() { // from class: com.huami.watch.companion.esim.arch.EsimProfileViewModel$deviceListener$1
            @Override // com.huami.components.devicestatus.DeviceStatusListener
            public void onConnected(int deviceType) {
                this.a.getConnectStateLiveData().postValue(Boolean.TRUE);
            }

            @Override // com.huami.components.devicestatus.DeviceStatusListener
            public void onConnecting(int deviceType) {
                if (deviceType == 4) {
                    this.a.getConnectStateLiveData().postValue(Boolean.FALSE);
                }
            }

            @Override // com.huami.components.devicestatus.DeviceStatusListener
            public void onConnectingTimeout(int deviceType) {
            }

            @Override // com.huami.components.devicestatus.DeviceStatusListener
            public void onDisconnected(int deviceType) {
                this.a.getConnectStateLiveData().postValue(Boolean.FALSE);
            }

            @Override // com.huami.components.devicestatus.DeviceStatusListener
            public void onStartSyncAGPS(int deviceType) {
            }

            @Override // com.huami.components.devicestatus.DeviceStatusListener
            public void onStartSyncData(int deviceType) {
            }

            @Override // com.huami.components.devicestatus.DeviceStatusListener
            public void onStopSyncAGPS(int deviceType, boolean hasError) {
            }

            @Override // com.huami.components.devicestatus.DeviceStatusListener
            public void onStopSyncData(int deviceType, boolean hasError) {
            }

            @Override // com.huami.components.devicestatus.DeviceStatusListener
            public void onSynchronizingAGPS(int deviceType, int percent) {
            }

            @Override // com.huami.components.devicestatus.DeviceStatusListener
            public void onSynchronizingData(int deviceType, int percent) {
            }
        };
        this.deviceListener = deviceStatusListener;
        mediatorLiveData.addSource(companion, new Observer() { // from class: xr1
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                EsimProfileViewModel.b(this.a, (Map) obj);
            }
        });
        DeviceStatusDelegate.getInstance().registerDeviceStatusListener(deviceStatusListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(EsimProfileViewModel esimProfileViewModel, Map map) {
        if (map == null) {
            return;
        }
        esimProfileViewModel.getProfileList().postValue(CollectionsKt___CollectionsKt.toMutableList(map.values()));
    }

    public final void clearData() {
        this.profileMap.postValue(new LinkedHashMap());
    }

    public final void deleteProfile(@NotNull String iccId) {
        Map<String, SimpleProfileInfo> value = this.profileMap.getValue();
        if (value == null) {
            return;
        }
        value.remove(iccId);
        getProfileMap().postValue(value);
    }

    @NotNull
    public final MediatorLiveData<Boolean> getConnectStateLiveData() {
        return this.connectStateLiveData;
    }

    @Nullable
    public final String getEnableId() {
        Collection<SimpleProfileInfo> collectionValues;
        Object next;
        Map<String, SimpleProfileInfo> value = this.profileMap.getValue();
        if (value == null || (collectionValues = value.values()) == null) {
            return null;
        }
        Iterator<T> it2 = collectionValues.iterator();
        do {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
        } while (!((SimpleProfileInfo) next).isEnabled());
        SimpleProfileInfo simpleProfileInfo = (SimpleProfileInfo) next;
        if (simpleProfileInfo == null) {
            return null;
        }
        return simpleProfileInfo.getIccid();
    }

    @Nullable
    public final SimpleProfileInfo getProfile(@NotNull String iccId) {
        Map<String, SimpleProfileInfo> value = this.profileMap.getValue();
        if (value == null) {
            return null;
        }
        return value.get(iccId);
    }

    @NotNull
    public final MediatorLiveData<List<SimpleProfileInfo>> getProfileList() {
        return this.profileList;
    }

    @NotNull
    public final EsimProfileLiveData getProfileMap() {
        return this.profileMap;
    }

    @NotNull
    public final String getProfileName(@NotNull String iccId) {
        SimpleProfileInfo simpleProfileInfo;
        String name;
        Map<String, SimpleProfileInfo> value = this.profileMap.getValue();
        return (value == null || (simpleProfileInfo = value.get(iccId)) == null || (name = simpleProfileInfo.getName(getApplication())) == null) ? "" : name;
    }

    @Override // androidx.p008lifecycle.ViewModel
    public void onCleared() {
        super.onCleared();
        DeviceStatusDelegate.getInstance().unregisterDeviceStatusListener(this.deviceListener);
    }

    public final void setEnable(@NotNull String iccId, boolean isEnable) {
        Map<String, SimpleProfileInfo> value = this.profileMap.getValue();
        if (value == null) {
            return;
        }
        for (Map.Entry<String, SimpleProfileInfo> entry : value.entrySet()) {
            SimpleProfileInfo value2 = entry.getValue();
            if (Intrinsics.areEqual(iccId, entry.getKey())) {
                value2.setEnabled(isEnable);
                value.put(iccId, value2);
            } else if (isEnable) {
                value2.setEnabled(false);
                value.put(entry.getKey(), value2);
            }
        }
        getProfileMap().postValue(value);
    }

    public final void setName(@NotNull String iccId, @NotNull String name) {
        SimpleProfileInfo simpleProfileInfo;
        Map<String, SimpleProfileInfo> value = this.profileMap.getValue();
        if (value == null || (simpleProfileInfo = value.get(iccId)) == null) {
            return;
        }
        simpleProfileInfo.setNickName(name);
        value.put(iccId, simpleProfileInfo);
        getProfileMap().postValue(value);
    }

    public final void setProfileData(@NotNull String profileInfo) {
        Object objFromJson;
        HMLog.info(e, new a(profileInfo));
        try {
            objFromJson = new Gson().fromJson(profileInfo, new TypeToken<List<? extends SimpleProfileInfo>>() { // from class: com.huami.watch.companion.esim.arch.EsimProfileViewModel.setProfileData.2
            }.getType());
        } catch (Exception e2) {
            HMLog.error$default(e, null, e2, new b(e2), 2, null);
            objFromJson = null;
        }
        List<SimpleProfileInfo> list = (List) objFromJson;
        if (list == null) {
            return;
        }
        getProfileList().setValue(objFromJson);
        Map<String, SimpleProfileInfo> value = getProfileMap().getValue();
        if (value == null) {
            value = new LinkedHashMap<>();
        }
        value.clear();
        for (SimpleProfileInfo simpleProfileInfo : list) {
            value.put(simpleProfileInfo.getIccid(), simpleProfileInfo);
        }
        getProfileMap().postValue(value);
    }
}
