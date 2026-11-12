package com.xiaomi.wearable.yrn.helper;

import android.app.Activity;
import com.facebook.yrn.manager.YRNOptionsConfig;
import com.xiaomi.wearable.yrn.internal.UrlUtils;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010J\u0014\u0010\u0011\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bJ\b\u0010\u0012\u001a\u0004\u0018\u00010\fJ\u0006\u0010\u0013\u001a\u00020\tJ\u000e\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u000eJ\u0006\u0010\u0016\u001a\u00020\tR\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/xiaomi/wearable/yrn/helper/WearableRNPageStackControl;", "", "<init>", "()V", "RN_PAGE_STACK", "", "Lcom/xiaomi/wearable/yrn/helper/RouterEntity;", "LOCK", "addPageRecord", "", "activityRef", "Ljava/lang/ref/WeakReference;", "Landroid/app/Activity;", "url", "", YRNOptionsConfig.INSTANCE_ID, "", "removePageRecord", "currentActivity", "popBack", "popTopStack", "pageUrl", "popStackAll", "sdk_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nWearableRNPageStackControl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WearableRNPageStackControl.kt\ncom/xiaomi/wearable/yrn/helper/WearableRNPageStackControl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,75:1\n1#2:76\n1863#3,2:77\n*S KotlinDebug\n*F\n+ 1 WearableRNPageStackControl.kt\ncom/xiaomi/wearable/yrn/helper/WearableRNPageStackControl\n*L\n70#1:77,2\n*E\n"})
public final class WearableRNPageStackControl {

    @NotNull
    public static final WearableRNPageStackControl INSTANCE = new WearableRNPageStackControl();

    @NotNull
    private static final List<RouterEntity> RN_PAGE_STACK = new LinkedList();

    @NotNull
    private static final Object LOCK = new Object();

    private WearableRNPageStackControl() {
    }

    public final void addPageRecord(@NotNull WeakReference<Activity> activityRef, @NotNull String url, int instanceId) {
        Intrinsics.checkNotNullParameter(activityRef, "activityRef");
        Intrinsics.checkNotNullParameter(url, "url");
        synchronized (LOCK) {
            RN_PAGE_STACK.add(new RouterEntity(activityRef, url, String.valueOf(instanceId)));
        }
    }

    @Nullable
    public final Activity currentActivity() {
        Activity activity;
        synchronized (LOCK) {
            List<RouterEntity> list = RN_PAGE_STACK;
            activity = list.isEmpty() ^ true ? ((RouterEntity) CollectionsKt___CollectionsKt.last((List) list)).getCurrentActivity().get() : null;
        }
        return activity;
    }

    public final void popBack() {
        synchronized (LOCK) {
            Activity activityCurrentActivity = INSTANCE.currentActivity();
            if (activityCurrentActivity != null) {
                activityCurrentActivity.finish();
                Unit unit = Unit.INSTANCE;
            }
        }
    }

    public final void popStackAll() {
        synchronized (LOCK) {
            try {
                List<RouterEntity> list = RN_PAGE_STACK;
                if (!list.isEmpty()) {
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        Activity activity = ((RouterEntity) it.next()).getCurrentActivity().get();
                        if (activity != null) {
                            activity.finish();
                        }
                    }
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void popTopStack(@NotNull String pageUrl) {
        Object obj;
        Object next;
        Intrinsics.checkNotNullParameter(pageUrl, "pageUrl");
        synchronized (LOCK) {
            try {
                Iterator<T> it = RN_PAGE_STACK.iterator();
                do {
                    obj = null;
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!Intrinsics.areEqual(((RouterEntity) next).getUrl(), pageUrl));
                RouterEntity routerEntity = (RouterEntity) next;
                if (routerEntity == null) {
                    for (Object obj2 : RN_PAGE_STACK) {
                        UrlUtils urlUtils = UrlUtils.INSTANCE;
                        if (Intrinsics.areEqual(urlUtils.getPath(((RouterEntity) obj2).getUrl()), urlUtils.getPath(pageUrl))) {
                            obj = obj2;
                            break;
                        }
                    }
                    routerEntity = (RouterEntity) obj;
                }
                if (routerEntity != null) {
                    List<RouterEntity> list = RN_PAGE_STACK;
                    int iIndexOf = list.indexOf(routerEntity);
                    for (int size = list.size() - 1; size > iIndexOf; size--) {
                        Activity activity = RN_PAGE_STACK.get(size).getCurrentActivity().get();
                        if (activity != null) {
                            activity.finish();
                        }
                    }
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void removePageRecord(@NotNull WeakReference<Activity> activityRef) {
        Object next;
        Intrinsics.checkNotNullParameter(activityRef, "activityRef");
        synchronized (LOCK) {
            try {
                Iterator<T> it = RN_PAGE_STACK.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!Intrinsics.areEqual(((RouterEntity) next).getCurrentActivity(), activityRef));
                RouterEntity routerEntity = (RouterEntity) next;
                if (routerEntity != null) {
                    RN_PAGE_STACK.remove(routerEntity);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
