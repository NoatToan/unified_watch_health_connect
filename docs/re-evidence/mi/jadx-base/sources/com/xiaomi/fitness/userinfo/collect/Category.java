package com.xiaomi.fitness.userinfo.collect;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/xiaomi/fitness/userinfo/collect/Category;", "", "<init>", "()V", "BASIC_INFO", "", "APPLICATION_DATA", "DEVICE_INFO", "user-info_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class Category {

    @NotNull
    public static final String APPLICATION_DATA = "application_data";

    @NotNull
    public static final String BASIC_INFO = "basic_info";

    @NotNull
    public static final String DEVICE_INFO = "device_info";

    @NotNull
    public static final Category INSTANCE = new Category();

    private Category() {
    }
}
