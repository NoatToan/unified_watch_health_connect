package com.huami.module.homepage.utils;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Typeface;
import androidx.annotation.DrawableRes;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.huami.account.HMLoginManager;
import com.huami.account.service.AnonymousService;
import com.huami.account.service.UserInfoPolicyService;
import com.huami.account.service.proxy.KoinProxyKt;
import com.huami.apm.prod.service.ApmCrashApi;
import com.huami.module.homepage.R;
import com.huami.module.homepage.koin.ScopesAndQualifersKt;
import com.huami.module.homepage.sync.manager.IDeviceJumpManager;
import com.huami.module.ktx.ContextExtKt;
import com.huami.tools.analytics.DbUtils;
import com.xiaomi.hm.health.baseutil.Language;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.collections.r;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\b\u0010\u0001\u001a\u00020\u0000H\u0000\u001a\b\u0010\u0002\u001a\u00020\u0000H\u0000\u001a\u0006\u0010\u0003\u001a\u00020\u0000\u001a\u0006\u0010\u0004\u001a\u00020\u0000\u001a\"\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\t\u001a\u00020\u0007H\u0000\u001a\b\u0010\f\u001a\u00020\u0000H\u0000\u001a\b\u0010\r\u001a\u00020\u0000H\u0000\u001a\u001a\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0000\u001a\u0010\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0000\"\u001f\u0010\u001a\u001a\u0004\u0018\u00010\u00158F@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"", "isMifitApp", "isChineseLanguage", "isSimplifiedChineseUser", "isSimplifiedChinese", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", ViewHierarchyConstants.DIMENSION_WIDTH_KEY, "icon", "Landroid/graphics/Bitmap;", "obtainBitmap", "checkPolicyState", "isAnonymousUser", "Lcom/xiaomi/hm/health/bt/device/HMDeviceType;", "deviceType", "", "executorDeviceJump", "", "throwable", "recordException", "Landroid/graphics/Typeface;", "a", "Lkotlin/Lazy;", "getMaisonTypeface", "()Landroid/graphics/Typeface;", "maisonTypeface", "homePage_release"}, k = 2, mv = {1, 5, 1})
@JvmName(name = "HomeUtils")
public final class HomeUtils {

    @NotNull
    private static final Lazy a = LazyKt__LazyJVMKt.lazy(a.a);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"Landroid/graphics/Typeface;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<Typeface> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Typeface invoke() {
            return ContextExtKt.getFont((Context) ScopesAndQualifersKt.getKoin().getScopeRegistry().getRootScope().get(Reflection.getOrCreateKotlinClass(Context.class), null, null), R.font.maisonneue);
        }
    }

    public static final boolean checkPolicyState() {
        return ((UserInfoPolicyService) KoinProxyKt.getKoinProxy().getScopeRegistry().getRootScope().get(Reflection.getOrCreateKotlinClass(UserInfoPolicyService.class), null, null)).interceptWithShowTip();
    }

    public static final void executorDeviceJump(@NotNull Context context, @Nullable HMDeviceType hMDeviceType) {
        IDeviceJumpManager iDeviceJumpManager = (IDeviceJumpManager) ScopesAndQualifersKt.getKoin().getScopeRegistry().getRootScope().getOrNull(Reflection.getOrCreateKotlinClass(IDeviceJumpManager.class), null, null);
        if (iDeviceJumpManager == null) {
            return;
        }
        iDeviceJumpManager.jumpToDevicePage(context, hMDeviceType);
    }

    @Nullable
    public static final Typeface getMaisonTypeface() {
        return (Typeface) a.getValue();
    }

    public static final boolean isAnonymousUser() {
        return ((AnonymousService) KoinProxyKt.getKoinProxy().getScopeRegistry().getRootScope().get(Reflection.getOrCreateKotlinClass(AnonymousService.class), null, null)).isAnonymousUser();
    }

    public static final boolean isChineseLanguage() {
        return Intrinsics.areEqual(Locale.getDefault().getLanguage(), Locale.CHINESE.getLanguage());
    }

    public static final boolean isMifitApp() {
        return ((Context) ScopesAndQualifersKt.getKoin().getScopeRegistry().getRootScope().get(Reflection.getOrCreateKotlinClass(Context.class), null, null)).getPackageName().equals("com.xiaomi.hm.health");
    }

    public static final boolean isSimplifiedChinese() {
        return Language.isSimplifiedChinese();
    }

    public static final boolean isSimplifiedChineseUser() {
        return (HMLoginManager.isInChina() || HMLoginManager.isInMainland()) && isSimplifiedChinese();
    }

    @NotNull
    public static final Bitmap obtainBitmap(@NotNull Context context, int i, @DrawableRes int i2) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeResource(context.getResources(), i2, options);
        options.inJustDecodeBounds = false;
        options.inDensity = options.outWidth;
        options.inTargetDensity = i;
        return BitmapFactory.decodeResource(context.getResources(), i2, options);
    }

    public static final void recordException(@NotNull Throwable th) {
        ApmCrashApi apmCrashApi;
        if ((th instanceof CancellationException) || (apmCrashApi = (ApmCrashApi) ScopesAndQualifersKt.getKoin().getScopeRegistry().getRootScope().getOrNull(Reflection.getOrCreateKotlinClass(ApmCrashApi.class), null, null)) == null) {
            return;
        }
        apmCrashApi.recordException(r.emptyMap(), th);
    }
}
