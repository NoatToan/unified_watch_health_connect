package com.xiaomi.wearable.yrn.provider;

import com.miui.tsmclient.util.Constants;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.exception.export.ExceptionHelper;
import com.xiaomi.fitness.exception.export.ExceptionHelperExtKt;
import defpackage.p1d;
import io.sentry.SentryLevel;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010 \n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0018\u0010\u0019J'\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\r\u001a\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ-\u0010\r\u001a\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\r\u0010\tJ#\u0010\u000f\u001a\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u000eJ-\u0010\u000f\u001a\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\u000f\u0010\tJ#\u0010\u0010\u001a\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u000eJ-\u0010\u0010\u001a\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\u0010\u0010\tJ#\u0010\u0011\u001a\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u000eJ-\u0010\u0011\u001a\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\u0011\u0010\tJ#\u0010\u0012\u001a\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u000eJ-\u0010\u0012\u001a\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\u0012\u0010\tJ\u0019\u0010\u0013\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, d2 = {"Lcom/xiaomi/wearable/yrn/provider/WearableRNLogProvider;", "Lp1d;", "", "tag", "msg", "", "tr", "", "uploadExceptionEvent", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V", "", "logEnable", "()Z", "v", "(Ljava/lang/String;Ljava/lang/String;)V", PluginDeviceInfo.FICONOFF, "i", Constants.DEVICE_TYPE_WEAR, PluginDeviceInfo.FICONOFFLINE, "postCatchedException", "(Ljava/lang/Throwable;)V", "", "exceptionTagList", "Ljava/util/List;", "<init>", "()V", "sdk_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nWearableRNLogProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WearableRNLogProvider.kt\ncom/xiaomi/wearable/yrn/provider/WearableRNLogProvider\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,102:1\n295#2,2:103\n*S KotlinDebug\n*F\n+ 1 WearableRNLogProvider.kt\ncom/xiaomi/wearable/yrn/provider/WearableRNLogProvider\n*L\n93#1:103,2\n*E\n"})
public final class WearableRNLogProvider implements p1d {

    @NotNull
    private final List<String> exceptionTagList = CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{"YRNChannel", "YRNRootView", "YRNJsEventHelper", "YRNManager", "YRNFileUtils"});

    private final void uploadExceptionEvent(String tag, String msg, Throwable tr) {
        Object obj;
        try {
            Iterator<T> it = this.exceptionTagList.iterator();
            while (true) {
                obj = null;
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (StringsKt__StringsJVMKt.startsWith$default(msg, (String) next, false, 2, null)) {
                    obj = next;
                    break;
                }
            }
            if (((String) obj) != null) {
                ExceptionHelper.DefaultImpls.uploadEvent$default(ExceptionHelperExtKt.getInstance(ExceptionHelper.INSTANCE), CollectionsKt__CollectionsJVMKt.listOf(tag), (SentryLevel) null, "msg:" + msg + ", tr:" + tr, 2, (Object) null);
            }
        } catch (Exception unused) {
        }
    }

    @Override // defpackage.p1d
    public void d(@Nullable String tag, @Nullable String msg) {
        if (tag == null || msg == null) {
            return;
        }
        Logger.d(tag, msg);
    }

    @Override // defpackage.p1d
    public void e(@Nullable String tag, @Nullable String msg) {
        if (tag == null || msg == null) {
            return;
        }
        Logger.e(tag, msg);
    }

    public void i(@Nullable String tag, @Nullable String msg) {
        if (tag == null || msg == null) {
            return;
        }
        Logger.i(tag, msg);
    }

    @Override // defpackage.p1d
    public boolean logEnable() {
        return true;
    }

    public void postCatchedException(@Nullable Throwable tr) {
    }

    public void v(@Nullable String tag, @Nullable String msg) {
        if (tag == null || msg == null) {
            return;
        }
        Logger.INSTANCE.v(tag, msg);
    }

    @Override // defpackage.p1d
    public void w(@Nullable String tag, @Nullable String msg) {
        if (tag == null || msg == null) {
            return;
        }
        Logger.w(tag, msg);
    }

    public void d(@Nullable String tag, @Nullable String msg, @Nullable Throwable tr) {
        if (tag == null || msg == null) {
            return;
        }
        Logger.d(tag, msg, null, tr);
    }

    @Override // defpackage.p1d
    public void e(@Nullable String tag, @Nullable String msg, @Nullable Throwable tr) {
        if (tag == null || msg == null || tr == null) {
            return;
        }
        Logger.e(tag, msg, tr);
        uploadExceptionEvent(tag, msg, tr);
    }

    public void i(@Nullable String tag, @Nullable String msg, @Nullable Throwable tr) {
        if (tag == null || msg == null) {
            return;
        }
        Logger.i(tag, msg, null, tr);
    }

    public void v(@Nullable String tag, @Nullable String msg, @Nullable Throwable tr) {
        if (tag == null || msg == null || tr == null) {
            return;
        }
        Logger.INSTANCE.v(tag, "msg:" + msg + ", tr: " + tr);
    }

    public void w(@Nullable String tag, @Nullable String msg, @Nullable Throwable tr) {
        if (tag == null || msg == null || tr == null) {
            return;
        }
        Logger.w(tag, msg, tr);
    }
}
