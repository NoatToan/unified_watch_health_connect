package com.mi.health.uri_parser.links;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.mi.health.uri_parser.UriParserExportKt;
import com.mi.health.uri_parser.links.HttpLinkActivity;
import com.miui.tsmclient.util.ServiceUtils;
import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.manager.AccountManager;
import com.xiaomi.fitness.account.region.RegionPreference;
import com.xiaomi.fitness.baseui.view.BaseActivity;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.export.WearableProductManager;
import com.xiaomi.fitness.device.manager.export.bean.WearableProduct;
import com.xiaomi.fitness.util.SportRecordBundleKey;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0014J\b\u0010\u0019\u001a\u00020\u0011H\u0002J\b\u0010\u001a\u001a\u00020\u0011H\u0002J\u0012\u0010\u001b\u001a\u00020\u00182\b\u0010\u0004\u001a\u0004\u0018\u00010\u001cH\u0002J\u0010\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u001e\u001a\u00020\u0005H\u0002R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\rR\u001a\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00110\u0017X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lcom/mi/health/uri_parser/links/HttpLinkActivity;", "Lcom/xiaomi/fitness/baseui/view/BaseActivity;", "<init>", "()V", SportRecordBundleKey.BUNDLE_PARAM_URI, "", "getUri", "()Ljava/lang/String;", "setUri", "(Ljava/lang/String;)V", "from", "", "getFrom", "()I", "setFrom", "(I)V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "layoutId", "getLayoutId", "accountListener", "Lkotlin/Function1;", "", "removeAccountListener", ServiceUtils.EXTRA_PROCESS, "needLogin", "Landroid/net/Uri;", "startAppDefault", "packageName", "Companion", "uri-parser_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class HttpLinkActivity extends BaseActivity {

    @NotNull
    private static final String TAG = "HttpLinkActivity";
    public String uri;
    private int from = 8;

    @NotNull
    private final Function1<Boolean, Unit> accountListener = new Function1() { // from class: wgc
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2(Object obj) {
            return HttpLinkActivity.accountListener$lambda$1(this.f37940a, ((Boolean) obj).booleanValue());
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit accountListener$lambda$1(HttpLinkActivity this$0, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (z) {
            Logger.d(TAG, "Already logged in");
            Uri linkUri = HttpLinkUtilKt.getLinkUri();
            if (linkUri != null) {
                HttpLinkManager.INSTANCE.getInstance().handleLink(this$0, linkUri, this$0.from);
            }
            HttpLinkUtilKt.setLinkUri(null);
            this$0.removeAccountListener();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean needLogin(Uri uri) {
        WearableProduct wearableProduct;
        if (uri != null) {
            try {
                final String queryParameter = uri.getQueryParameter("redir");
                if (queryParameter == null || (wearableProduct = (WearableProduct) DeviceManagerExtKt.getInstance(WearableProductManager.INSTANCE).findProduct(new Function1() { // from class: xgc
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2(Object obj) {
                        return Boolean.valueOf(HttpLinkActivity.needLogin$lambda$5(queryParameter, (WearableProduct) obj));
                    }
                })) == null) {
                    return true;
                }
                boolean z = !DeviceModelExtKt.isWearOS(wearableProduct);
                Logger.i(TAG, "needLogin() called with: " + z);
                return z;
            } catch (Exception e) {
                Logger.i(TAG, "needLogin() called with: exception = " + e);
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean needLogin$lambda$5(String redirection, WearableProduct it) {
        Intrinsics.checkNotNullParameter(redirection, "$redirection");
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getProductId() == Integer.parseInt(redirection);
    }

    private final void process() {
        boolean privacy_agree = RegionPreference.INSTANCE.getPRIVACY_AGREE();
        AccountManager.Companion companion = AccountManager.INSTANCE;
        boolean zIsLogin = AccountManagerExtKt.getInstance(companion).isLogin();
        Logger.i(TAG, "process: login " + zIsLogin + ", policy agree = " + privacy_agree);
        Uri data = getIntent().getData();
        if (data == null) {
            data = this.uri != null ? Uri.parse(getUri()) : null;
        }
        Logger.i(TAG, "process:intent.data " + getIntent().getData());
        if (getIntent().getData() != null) {
            String packageName = getApplication().getPackageName();
            Intrinsics.checkNotNullExpressionValue(packageName, "getPackageName(...)");
            startAppDefault(packageName);
        }
        if (needLogin(data)) {
            if (zIsLogin) {
                if (data != null) {
                    HttpLinkManager.INSTANCE.getInstance().handleLink(this, data, this.from);
                }
            } else if (data != null) {
                HttpLinkUtilKt.setLinkUri(getIntent().getData());
                AccountManagerExtKt.getInstance(companion).addAccountListener(this.accountListener);
            }
        } else if (data != null) {
            HttpLinkManager.INSTANCE.getInstance().handleLink(this, data, this.from);
        }
        finish();
    }

    private final void removeAccountListener() {
        AccountManagerExtKt.getInstance(AccountManager.INSTANCE).removeAccountListener(this.accountListener);
    }

    private final void startAppDefault(String packageName) {
        Intent launchIntentForPackage = getPackageManager().getLaunchIntentForPackage(packageName);
        Bundle bundle = new Bundle();
        bundle.putBoolean("showLoginDialog", true);
        if (launchIntentForPackage != null) {
            launchIntentForPackage.putExtra("flag", bundle);
        }
        if (launchIntentForPackage != null) {
            launchIntentForPackage.setFlags(335544320);
        }
        if (launchIntentForPackage != null) {
            startActivity(launchIntentForPackage);
        }
    }

    public final int getFrom() {
        return this.from;
    }

    @Override // com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return -1;
    }

    @NotNull
    public final String getUri() {
        String str = this.uri;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException(SportRecordBundleKey.BUNDLE_PARAM_URI);
        return null;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String stringExtra = getIntent().getStringExtra(UriParserExportKt.KEY_LINK_URI);
        if (stringExtra == null) {
            stringExtra = "";
        }
        setUri(stringExtra);
        int intExtra = getIntent().getIntExtra(UriParserExportKt.KEY_FROM, 8);
        this.from = intExtra;
        Logger.i(TAG, "onCreate() called with: from = " + intExtra + ",  " + getIntent().getExtras());
        process();
    }

    public final void setFrom(int i) {
        this.from = i;
    }

    public final void setUri(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.uri = str;
    }
}
