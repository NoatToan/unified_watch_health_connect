package com.xiaomi.hm.health.utils;

import android.text.TextUtils;
import com.huami.account.service.AccountService;
import com.huami.account.service.AccountServiceExtKt;
import com.huami.apm.prod.service.ApmApi;
import com.huami.koinstartup.KoinAdapterKt;
import com.huami.passport.AccountManager;
import com.huami.tools.log.HMLog;
import com.huami.watch.companion.CompanionApplication;
import com.huami.watch.companion.watchface.cloud.WatchFaceApi;
import com.xiaomi.hm.health.BraceletApp;
import com.xiaomi.hm.health.BuildConfig;
import com.xiaomi.hm.health.baseutil.MD5Util;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u0003\u001a\u00020\u0002H\u0007J\b\u0010\u0004\u001a\u00020\u0002H\u0007R\u0016\u0010\b\u001a\u00020\u00058\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00058B@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\tR\u0016\u0010\u000e\u001a\u00020\u000b8B@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0010\u001a\u00020\u000b8B@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\r¨\u0006\u0013"}, d2 = {"Lcom/xiaomi/hm/health/utils/ApmHelper;", "", "", "enable", WatchFaceApi.CUSTOMIZABLE_DISABLE, "", "a", "Ljava/lang/String;", "TAG", "()Ljava/lang/String;", "countryCode", "", "c", "()Z", "isAreaEnable", "b", "needManualCtrlFirebase", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class ApmHelper {

    @NotNull
    public static final ApmHelper INSTANCE = new ApmHelper();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private static final String TAG = "APM-Prod";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "手动禁用操作被忽略";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public static final b a = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "手动启用操作被忽略";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str) {
            super(0);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "已关联用户 ID：" + this.a + "(hashed)";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<String> {
        public static final d a = new d();

        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "用户地区：" + ApmHelper.INSTANCE.a() + " -> 未关联用户 ID";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<String> {
        public final /* synthetic */ boolean a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(boolean z) {
            super(0);
            this.a = z;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "APM-Prod 手动控制判断：" + this.a + " (branch=midong/6.10.0, area=" + ApmHelper.INSTANCE.a() + ", debug=false)";
        }
    }

    private ApmHelper() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String a() {
        return AccountManager.getDefault(CompanionApplication.get()).getCountryCode();
    }

    private final boolean b() {
        boolean z = !Intrinsics.areEqual(BuildConfig.BUILD_BRANCH, BuildConfig.FIREBASE_ENABLED_BRANCH) && c();
        HMLog.info("APM-Prod", new e(z));
        return z;
    }

    private final boolean c() {
        return !ArraysKt___ArraysKt.contains(new String[]{"CN", "unknown", ""}, a());
    }

    @JvmStatic
    public static final void disable() {
        if (!INSTANCE.b()) {
            HMLog.info("APM-Prod", a.a);
            return;
        }
        ApmApi apmApi = (ApmApi) KoinAdapterKt.getKoinProxy().getScopeRegistry().getRootScope().get(Reflection.getOrCreateKotlinClass(ApmApi.class), null, null);
        apmApi.disable(BraceletApp.getContext());
        apmApi.setUserId(null);
    }

    @JvmStatic
    public static final void enable() {
        ApmApi apmApi = (ApmApi) KoinAdapterKt.getKoinProxy().getScopeRegistry().getRootScope().get(Reflection.getOrCreateKotlinClass(ApmApi.class), null, null);
        AccountService accountService = (AccountService) KoinAdapterKt.getKoinProxy().getScopeRegistry().getRootScope().get(Reflection.getOrCreateKotlinClass(AccountService.class), null, null);
        ApmHelper apmHelper = INSTANCE;
        if (apmHelper.b()) {
            apmApi.enable(BraceletApp.getContext());
        } else {
            HMLog.info("APM-Prod", b.a);
        }
        if (!apmHelper.c()) {
            HMLog.info("APM-Prod", d.a);
            return;
        }
        String strUserId = AccountServiceExtKt.userId(accountService);
        if (TextUtils.isEmpty(strUserId)) {
            return;
        }
        String mD5String = MD5Util.getMD5String(strUserId);
        apmApi.setUserId(mD5String);
        HMLog.info("APM-Prod", new c(mD5String));
    }
}
