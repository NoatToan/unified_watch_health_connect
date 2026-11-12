package com.xiaomi.fitness.login.export;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lcom/xiaomi/fitness/login/export/SetUserDataParamModel;", "", "category", "", "settings", "", "Lcom/xiaomi/fitness/login/export/Setting;", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "getCategory", "()Ljava/lang/String;", "getSettings", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "login-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SetUserDataParamModel {

    @SerializedName("category")
    @NotNull
    private final String category;

    @SerializedName("settings")
    @NotNull
    private final List<Setting> settings;

    public SetUserDataParamModel(@NotNull String category, @NotNull List<Setting> settings) {
        Intrinsics.checkNotNullParameter(category, "category");
        Intrinsics.checkNotNullParameter(settings, "settings");
        this.category = category;
        this.settings = settings;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SetUserDataParamModel copy$default(SetUserDataParamModel setUserDataParamModel, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = setUserDataParamModel.category;
        }
        if ((i & 2) != 0) {
            list = setUserDataParamModel.settings;
        }
        return setUserDataParamModel.copy(str, list);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCategory() {
        return this.category;
    }

    @NotNull
    public final List<Setting> component2() {
        return this.settings;
    }

    @NotNull
    public final SetUserDataParamModel copy(@NotNull String category, @NotNull List<Setting> settings) {
        Intrinsics.checkNotNullParameter(category, "category");
        Intrinsics.checkNotNullParameter(settings, "settings");
        return new SetUserDataParamModel(category, settings);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SetUserDataParamModel)) {
            return false;
        }
        SetUserDataParamModel setUserDataParamModel = (SetUserDataParamModel) other;
        return Intrinsics.areEqual(this.category, setUserDataParamModel.category) && Intrinsics.areEqual(this.settings, setUserDataParamModel.settings);
    }

    @NotNull
    public final String getCategory() {
        return this.category;
    }

    @NotNull
    public final List<Setting> getSettings() {
        return this.settings;
    }

    public int hashCode() {
        return (this.category.hashCode() * 31) + this.settings.hashCode();
    }

    @NotNull
    public String toString() {
        return "SetUserDataParamModel(category=" + this.category + ", settings=" + this.settings + ")";
    }
}
