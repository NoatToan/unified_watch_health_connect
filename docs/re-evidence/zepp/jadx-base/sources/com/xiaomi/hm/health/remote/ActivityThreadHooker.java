package com.xiaomi.hm.health.remote;

import android.os.Build;
import android.os.Handler;
import android.os.Message;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00007\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\b\u0007*\u0001\u0012\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0002H\u0002J\u0006\u0010\u0006\u001a\u00020\u0002R\u0016\u0010\t\u001a\u00020\u00078\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0004\u0010\bR\u0016\u0010\f\u001a\u00020\n8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u000bR*\u0010\u0011\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e0\r8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0010R\u0016\u0010\u0015\u001a\u00020\u00128\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0018"}, d2 = {"Lcom/xiaomi/hm/health/remote/ActivityThreadHooker;", "", "", "c", "a", "b", "hook", "", LogUtil.I, "sScheduleCrash", "", "Ljava/lang/String;", "sActivityThreadName", "", "Lkotlin/Function0;", "", "Ljava/util/Map;", "msgHandlers", "com/xiaomi/hm/health/remote/ActivityThreadHooker$callbackHandler$1", GoogleApiAvailabilityLight.a, "Lcom/xiaomi/hm/health/remote/ActivityThreadHooker$callbackHandler$1;", "callbackHandler", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class ActivityThreadHooker {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private static final int sScheduleCrash = 134;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private static final String sActivityThreadName = "android.app.ActivityThread";

    @NotNull
    public static final ActivityThreadHooker INSTANCE = new ActivityThreadHooker();

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private static final Map<Integer, Function0<Boolean>> msgHandlers = new LinkedHashMap();

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private static final ActivityThreadHooker$callbackHandler$1 callbackHandler = new Handler.Callback() { // from class: com.xiaomi.hm.health.remote.ActivityThreadHooker$callbackHandler$1
        @Override // android.os.Handler.Callback
        public boolean handleMessage(@NotNull Message message) {
            Function0 function0;
            return ActivityThreadHooker.msgHandlers.containsKey(Integer.valueOf(message.what)) && (function0 = (Function0) ActivityThreadHooker.msgHandlers.get(Integer.valueOf(message.what))) != null && ((Boolean) function0.invoke()).booleanValue();
        }
    };

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000b\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<Boolean> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(invoke2());
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final boolean invoke2() {
            return true;
        }
    }

    private ActivityThreadHooker() {
    }

    private final void a() {
        if (Build.VERSION.SDK_INT >= 26) {
            try {
                b();
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    private final void b() throws IllegalAccessException, NoSuchFieldException {
        Reflection reflection = Reflection.INSTANCE;
        reflection.setClassMember(Handler.class, "mCallback", reflection.getClassMember(sActivityThreadName, "mH", Reflection.getClassMember$default(reflection, sActivityThreadName, "sCurrentActivityThread", null, 4, null)), callbackHandler);
    }

    private final void c() {
        msgHandlers.put(134, a.a);
    }

    public final void hook() {
        c();
        a();
    }
}
