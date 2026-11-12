package com.xiaomi.fitness.device.manager.ui.bind;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.mi.health.uri_parser.ILinkHandler;
import com.mi.health.uri_parser.links.UriMapKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.ToastUtil;
import com.xiaomi.fitness.rn.export.RNProductManager;
import com.xiaomi.fitness.rn.export.bean.RNProduct;
import com.xiaomi.fitness.rn.extetions.ProductExtKt;
import com.xiaomi.fitness.util.SportRecordBundleKey;
import defpackage.uzi;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\tH\u0002R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/xiaomi/fitness/device/manager/ui/bind/MiHomeBindLinkHandler;", "Lcom/mi/health/uri_parser/ILinkHandler;", "<init>", "()V", "context", "Landroid/content/Context;", "handleUri", "", SportRecordBundleKey.BUNDLE_PARAM_URI, "Landroid/net/Uri;", "from", "", "handleMiHomeLink", "", "Companion", "device-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MiHomeBindLinkHandler implements ILinkHandler {

    @NotNull
    private static final String TAG = "MiHomeBindLinkHandler";

    @Nullable
    private Context context;

    private final void handleMiHomeLink(Context context, Uri uri) {
        String queryParameter = uri.getQueryParameter("model");
        if (TextUtils.isEmpty(queryParameter)) {
            ToastUtil.showToast("model is invalid");
            return;
        }
        RNProductManager productExtKt = ProductExtKt.getInstance(RNProductManager.INSTANCE);
        if (queryParameter == null) {
            queryParameter = "";
        }
        RNProduct productByModel = productExtKt.getProductByModel(queryParameter);
        if (productByModel != null) {
            RestGuideActivity.INSTANCE.launch(context, productByModel.getModel(), productByModel.getProductId(), productByModel.getProductName(), productByModel.getBigIcon(), productByModel.getSmallIcon());
        } else {
            Logger.i(TAG, "handleMijiaLink: product == null, not support");
            ToastUtil.INSTANCE.showToast(uzi.common_not_support);
        }
    }

    @Override // com.mi.health.uri_parser.ILinkHandler
    public boolean handleUri(@NotNull Context context, @NotNull Uri uri, int from) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(uri, "uri");
        this.context = context;
        Logger.i(TAG, "handleUri() called with: context = " + context + ", uri = " + uri + ", from = " + from);
        if (!UriMapKt.isMiHomeLink(uri)) {
            return false;
        }
        handleMiHomeLink(context, uri);
        return true;
    }
}
