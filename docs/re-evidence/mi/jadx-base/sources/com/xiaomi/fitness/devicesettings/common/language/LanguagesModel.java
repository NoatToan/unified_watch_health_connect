package com.xiaomi.fitness.devicesettings.common.language;

import com.xiaomi.hm.health.bt.model.HMLanguage;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0013\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0005¨\u0006\u0014"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/common/language/LanguagesModel;", "", "hmLanguage", "Lcom/xiaomi/hm/health/bt/model/HMLanguage;", "<init>", "(Lcom/xiaomi/hm/health/bt/model/HMLanguage;)V", "name", "", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "isSelected", "", "()Z", "setSelected", "(Z)V", "getHmLanguage", "()Lcom/xiaomi/hm/health/bt/model/HMLanguage;", "setHmLanguage", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class LanguagesModel {

    @Nullable
    private HMLanguage hmLanguage;
    private boolean isSelected;

    @Nullable
    private String name;

    public LanguagesModel(@Nullable HMLanguage hMLanguage) {
        this.hmLanguage = hMLanguage;
    }

    @Nullable
    public final HMLanguage getHmLanguage() {
        return this.hmLanguage;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: isSelected, reason: from getter */
    public final boolean getIsSelected() {
        return this.isSelected;
    }

    public final void setHmLanguage(@Nullable HMLanguage hMLanguage) {
        this.hmLanguage = hMLanguage;
    }

    public final void setName(@Nullable String str) {
        this.name = str;
    }

    public final void setSelected(boolean z) {
        this.isSelected = z;
    }
}
