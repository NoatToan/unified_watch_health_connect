package com.xiaomi.wearable.yrn.helper;

import android.app.Activity;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\b\u0018\u00002\u00020\u0001B%\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0006HÆ\u0003J-\u0010\u0012\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0006HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\r¨\u0006\u0019"}, d2 = {"Lcom/xiaomi/wearable/yrn/helper/RouterEntity;", "", "currentActivity", "Ljava/lang/ref/WeakReference;", "Landroid/app/Activity;", "url", "", "instance", "<init>", "(Ljava/lang/ref/WeakReference;Ljava/lang/String;Ljava/lang/String;)V", "getCurrentActivity", "()Ljava/lang/ref/WeakReference;", "getUrl", "()Ljava/lang/String;", "getInstance", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "sdk_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
final /* data */ class RouterEntity {

    @NotNull
    private final WeakReference<Activity> currentActivity;

    @NotNull
    private final String instance;

    @NotNull
    private final String url;

    public RouterEntity(@NotNull WeakReference<Activity> currentActivity, @NotNull String url, @NotNull String instance) {
        Intrinsics.checkNotNullParameter(currentActivity, "currentActivity");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(instance, "instance");
        this.currentActivity = currentActivity;
        this.url = url;
        this.instance = instance;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RouterEntity copy$default(RouterEntity routerEntity, WeakReference weakReference, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            weakReference = routerEntity.currentActivity;
        }
        if ((i & 2) != 0) {
            str = routerEntity.url;
        }
        if ((i & 4) != 0) {
            str2 = routerEntity.instance;
        }
        return routerEntity.copy(weakReference, str, str2);
    }

    @NotNull
    public final WeakReference<Activity> component1() {
        return this.currentActivity;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getInstance() {
        return this.instance;
    }

    @NotNull
    public final RouterEntity copy(@NotNull WeakReference<Activity> currentActivity, @NotNull String url, @NotNull String instance) {
        Intrinsics.checkNotNullParameter(currentActivity, "currentActivity");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(instance, "instance");
        return new RouterEntity(currentActivity, url, instance);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RouterEntity)) {
            return false;
        }
        RouterEntity routerEntity = (RouterEntity) other;
        return Intrinsics.areEqual(this.currentActivity, routerEntity.currentActivity) && Intrinsics.areEqual(this.url, routerEntity.url) && Intrinsics.areEqual(this.instance, routerEntity.instance);
    }

    @NotNull
    public final WeakReference<Activity> getCurrentActivity() {
        return this.currentActivity;
    }

    @NotNull
    public final String getInstance() {
        return this.instance;
    }

    @NotNull
    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return (((this.currentActivity.hashCode() * 31) + this.url.hashCode()) * 31) + this.instance.hashCode();
    }

    @NotNull
    public String toString() {
        return "RouterEntity(currentActivity=" + this.currentActivity + ", url=" + this.url + ", instance=" + this.instance + ")";
    }
}
