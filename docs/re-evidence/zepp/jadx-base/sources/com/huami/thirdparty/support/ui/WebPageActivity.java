package com.huami.thirdparty.support.ui;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.os.BundleKt;
import androidx.fragment.app.FragmentTransaction;
import com.huami.lib.rainbow.titlebar.RainbowTitleBar;
import com.huami.thirdparty.support.R;
import com.huami.thirdparty.support.ui.WebPageActivity;
import com.huami.tools.analytics.DbUtils;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes14.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H\u0014J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0018\u0010\u0011\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u000eR\u0016\u0010\u0015\u001a\u00020\u00128\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0019"}, d2 = {"Lcom/huami/thirdparty/support/ui/WebPageActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "outState", "onSaveInstanceState", "Landroid/view/MenuItem;", "item", "", "onOptionsItemSelected", "", "a", "Ljava/lang/String;", "title", "b", "url", "Lcom/huami/lib/rainbow/titlebar/RainbowTitleBar;", "c", "Lcom/huami/lib/rainbow/titlebar/RainbowTitleBar;", "titleBar", "<init>", "()V", "Companion", "support_release"}, k = 1, mv = {1, 5, 1})
public final class WebPageActivity extends AppCompatActivity {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String EXTRA_URL = "url";

    @NotNull
    private static final String d = "title";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private String title;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private String url;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private RainbowTitleBar titleBar;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ$\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0007R\u0016\u0010\t\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0016\u0010\u000b\u001a\u00020\u00048\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\n¨\u0006\u000e"}, d2 = {"Lcom/huami/thirdparty/support/ui/WebPageActivity$Companion;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "url", "title", "Landroid/content/Intent;", "getIntent", "EXTRA_TITLE", "Ljava/lang/String;", "EXTRA_URL", "<init>", "()V", "support_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ Intent getIntent$default(Companion companion, Context context, String str, String str2, int i, Object obj) {
            if ((i & 4) != 0) {
                str2 = null;
            }
            return companion.getIntent(context, str, str2);
        }

        @JvmStatic
        @NotNull
        public final Intent getIntent(@NotNull Context context, @NotNull String url, @Nullable String title) {
            Intent intent = new Intent(context, (Class<?>) WebPageActivity.class);
            intent.putExtra("title", title);
            intent.putExtra("url", url);
            return intent;
        }
    }

    public WebPageActivity() {
        super(R.layout.activity_web_page);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(WebPageActivity webPageActivity, View view) {
        webPageActivity.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(WebPageActivity webPageActivity, WebView webView) {
        if (webPageActivity.title == null) {
            RainbowTitleBar rainbowTitleBar = webPageActivity.titleBar;
            Objects.requireNonNull(rainbowTitleBar);
            rainbowTitleBar.setTitle(webView.getTitle());
        }
    }

    @JvmStatic
    @NotNull
    public static final Intent getIntent(@NotNull Context context, @NotNull String str, @Nullable String str2) {
        return INSTANCE.getIntent(context, str, str2);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        setTheme(R.style.Theme_App_Zepp);
        super.onCreate(savedInstanceState);
        if (savedInstanceState != null) {
            this.title = savedInstanceState.getString("title");
            this.url = savedInstanceState.getString("url");
        } else {
            this.title = getIntent().getStringExtra("title");
            this.url = getIntent().getStringExtra("url");
        }
        RainbowTitleBar rainbowTitleBar = (RainbowTitleBar) findViewById(R.id.toolbar);
        String str = this.title;
        if (str != null) {
            rainbowTitleBar.setTitle(str);
        }
        rainbowTitleBar.setNavigationOnClickListener(new View.OnClickListener() { // from class: zp8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                WebPageActivity.e(this.a, view);
            }
        });
        Unit unit = Unit.INSTANCE;
        this.titleBar = rainbowTitleBar;
        Bundle bundleBundleOf = BundleKt.bundleOf(new Pair[0]);
        String str2 = this.url;
        if (str2 != null) {
            bundleBundleOf = WebFragment.INSTANCE.buildArguments(str2);
        }
        WebFragment webFragment = new WebFragment();
        webFragment.setArguments(bundleBundleOf);
        webFragment.setPageLoadCallback(new WebFragment.PageLoadCallback() { // from class: aq8
            @Override // com.huami.thirdparty.support.ui.WebFragment.PageLoadCallback
            public final void onLoadFinish(WebView webView) {
                WebPageActivity.f(this.a, webView);
            }
        });
        FragmentTransaction fragmentTransactionBeginTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransactionBeginTransaction.replace(R.id.fragment_container, webFragment);
        fragmentTransactionBeginTransaction.commit();
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(@NotNull MenuItem item) {
        if (item.getItemId() != 16908332) {
            return super.onOptionsItemSelected(item);
        }
        onBackPressed();
        return true;
    }

    @Override // androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(@NotNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString("title", this.title);
        outState.putString("url", this.url);
    }
}
