package com.huami.sky.lib.repo.settings;

import com.huami.sky.lib.entity.PlaySettingEntity;
import com.huami.sky.lib.properties.PlaySettingProperties;
import com.huami.userproperty.UserPropertyManager;
import kotlin.Metadata;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\bH\u0016J\u0010\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u000e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\bH\u0016R\u001c\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\r8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000eR\u001c\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\n0\r8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u000e¨\u0006\u0014"}, d2 = {"Lcom/huami/sky/lib/repo/settings/PlaySettingRepoImp;", "Lcom/huami/sky/lib/repo/settings/IPlaySettingRepo;", "Lcom/huami/sky/lib/entity/PlaySettingEntity;", "a", "", "minutes", "", "setPlayDuration", "Lkotlinx/coroutines/flow/Flow;", "getPlayDuration", "", "isSmartClose", "setSmartPLayClose", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "playDurationFlow", "b", "smartPlayFlow", "<init>", "()V", "sky-lib_release"}, k = 1, mv = {1, 5, 1})
public final class PlaySettingRepoImp implements IPlaySettingRepo {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final MutableStateFlow<Integer> playDurationFlow = StateFlowKt.MutableStateFlow(60);

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final MutableStateFlow<Boolean> smartPlayFlow = StateFlowKt.MutableStateFlow(Boolean.TRUE);

    private final PlaySettingEntity a() {
        PlaySettingEntity playSettingEntity = PlaySettingProperties.INSTANCE.getPlaySetting().get();
        return playSettingEntity == null ? new PlaySettingEntity(false, -1) : playSettingEntity;
    }

    @Override // com.huami.sky.lib.repo.settings.IPlaySettingRepo
    @NotNull
    public Flow<Integer> getPlayDuration() {
        MutableStateFlow<Integer> mutableStateFlow = this.playDurationFlow;
        PlaySettingEntity playSettingEntity = PlaySettingProperties.INSTANCE.getPlaySetting().get();
        mutableStateFlow.setValue(Integer.valueOf(playSettingEntity == null ? 60 : playSettingEntity.getMinutesToPlay()));
        return mutableStateFlow;
    }

    @Override // com.huami.sky.lib.repo.settings.IPlaySettingRepo
    @NotNull
    public Flow<Boolean> isSmartClose() {
        MutableStateFlow<Boolean> mutableStateFlow = this.smartPlayFlow;
        PlaySettingEntity playSettingEntity = PlaySettingProperties.INSTANCE.getPlaySetting().get();
        mutableStateFlow.setValue(Boolean.valueOf(playSettingEntity == null ? true : playSettingEntity.getSmartStopEnable()));
        return mutableStateFlow;
    }

    @Override // com.huami.sky.lib.repo.settings.IPlaySettingRepo
    public void setPlayDuration(int minutes) {
        this.playDurationFlow.setValue(Integer.valueOf(minutes));
        PlaySettingEntity playSettingEntityA = a();
        playSettingEntityA.setMinutesToPlay(minutes);
        PlaySettingProperties.INSTANCE.getPlaySetting().set(playSettingEntityA);
        UserPropertyManager.INSTANCE.schedulePushAll();
    }

    @Override // com.huami.sky.lib.repo.settings.IPlaySettingRepo
    public void setSmartPLayClose(boolean isSmartClose) {
        this.smartPlayFlow.setValue(Boolean.valueOf(isSmartClose));
        PlaySettingEntity playSettingEntityA = a();
        playSettingEntityA.setSmartStopEnable(isSmartClose);
        PlaySettingProperties.INSTANCE.getPlaySetting().set(playSettingEntityA);
        UserPropertyManager.INSTANCE.schedulePushAll();
    }
}
