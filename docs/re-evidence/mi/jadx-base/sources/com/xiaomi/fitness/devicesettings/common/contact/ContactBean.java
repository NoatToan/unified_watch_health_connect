package com.xiaomi.fitness.devicesettings.common.contact;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\b\"\u0004\b\f\u0010\nR\u001a\u0010\r\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\b\"\u0004\b\u000f\u0010\n¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/common/contact/ContactBean;", "", "name", "", "phone", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "getPhone", "setPhone", "pinyin", "getPinyin", "setPinyin", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ContactBean {

    @NotNull
    private String name;

    @NotNull
    private String phone;

    @NotNull
    private String pinyin;

    public ContactBean(@NotNull String name, @NotNull String phone) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(phone, "phone");
        this.name = name;
        this.phone = phone;
        this.pinyin = "";
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final String getPhone() {
        return this.phone;
    }

    @NotNull
    public final String getPinyin() {
        return this.pinyin;
    }

    public final void setName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.name = str;
    }

    public final void setPhone(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.phone = str;
    }

    public final void setPinyin(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.pinyin = str;
    }
}
