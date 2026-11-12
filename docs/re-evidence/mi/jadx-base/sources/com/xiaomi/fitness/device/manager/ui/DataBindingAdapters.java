package com.xiaomi.fitness.device.manager.ui;

import android.widget.ImageView;
import com.airbnb.lottie.LottieAnimationView;
import com.miui.tsmclient.common.net.NetConstants;
import com.miui.tsmclient.net.TSMAuthContants;
import com.xiaomi.fitness.common.extensions.AnyExtKt;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.UIUtils;
import com.xiaomi.fitness.login.export.RegionExtKt;
import com.xiaomi.fitness.login.export.RegionManager;
import java.io.IOException;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt__StringsKt;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/xiaomi/fitness/device/manager/ui/DataBindingAdapters;", "", "<init>", "()V", "Companion", "device-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DataBindingAdapters {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String TAG = "DataBindingAdapter";

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0007J\u0018\u0010\n\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0007R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/fitness/device/manager/ui/DataBindingAdapters$Companion;", "", "<init>", "()V", "setImageResource", "", "view", "Landroid/widget/ImageView;", TSMAuthContants.PARAM_RESOURCE, "", "setLottie", "Lcom/airbnb/lottie/LottieAnimationView;", "lottie", "", "TAG", "", "device-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nDataBindingAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DataBindingAdapter.kt\ncom/xiaomi/fitness/device/manager/ui/DataBindingAdapters$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,73:1\n1#2:74\n*E\n"})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final void setImageResource(@NotNull ImageView view, int resource) {
            Intrinsics.checkNotNullParameter(view, "view");
            view.setImageResource(resource);
        }

        @JvmStatic
        public final void setLottie(@NotNull final LottieAnimationView view, boolean lottie) {
            Intrinsics.checkNotNullParameter(view, "view");
            Logger.i(DataBindingAdapters.TAG, "setLottie");
            String currentRegion = RegionExtKt.getInstance(RegionManager.INSTANCE).getCurrentRegion();
            if (currentRegion.length() == 0) {
                currentRegion = "cn";
            }
            String str = "https://hlth.io.mi.com/app/v1/resource/download";
            if (!Intrinsics.areEqual(currentRegion, "cn")) {
                int iIndexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) "https://hlth.io.mi.com/app/v1/resource/download", "://", 0, false, 6, (Object) null) + 3;
                String strSubstring = "https://hlth.io.mi.com/app/v1/resource/download".substring(0, iIndexOf$default);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                String strSubstring2 = "https://hlth.io.mi.com/app/v1/resource/download".substring(iIndexOf$default);
                Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
                str = strSubstring + currentRegion + "." + strSubstring2;
            }
            String str2 = UIUtils.isNightMode(ApplicationExtKt.getApplication()) ? "add_new_black" : "add_new_white";
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String str3 = String.format(Locale.US, "?data={\"module\":\"widget\",\"category\":\"%s\",\"name\":\"%s.zip\"}", Arrays.copyOf(new Object[]{"watch/all", str2}, 2));
            Intrinsics.checkNotNullExpressionValue(str3, "format(...)");
            new OkHttpClient().newCall(new Request.Builder().get().url(str + str3).header(NetConstants.COOKIE, "auth_key=rwelJuWBFJxmbMKD").build()).enqueue(new Callback() { // from class: com.xiaomi.fitness.device.manager.ui.DataBindingAdapters$Companion$setLottie$1
                @Override // okhttp3.Callback
                public void onFailure(Call call, IOException e) {
                    Intrinsics.checkNotNullParameter(call, "call");
                    Intrinsics.checkNotNullParameter(e, "e");
                }

                @Override // okhttp3.Callback
                public void onResponse(Call call, Response response) {
                    Intrinsics.checkNotNullParameter(call, "call");
                    Intrinsics.checkNotNullParameter(response, "response");
                    AnyExtKt.main$default(null, new DataBindingAdapters$Companion$setLottie$1$onResponse$1(response.request().url().getUrl(), view, null), 1, null);
                }
            });
        }
    }

    @JvmStatic
    public static final void setImageResource(@NotNull ImageView imageView, int i) {
        INSTANCE.setImageResource(imageView, i);
    }

    @JvmStatic
    public static final void setLottie(@NotNull LottieAnimationView lottieAnimationView, boolean z) {
        INSTANCE.setLottie(lottieAnimationView, z);
    }
}
