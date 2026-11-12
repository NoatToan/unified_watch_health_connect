package com.huami.thirdparty.webauth;

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
import com.huami.thirdparty.support.ui.WebFragment;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H\u0014J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0018\u0010\u0011\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u000e¨\u0006\u0015"}, d2 = {"Lcom/huami/thirdparty/webauth/WebAuthActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "outState", "onSaveInstanceState", "Landroid/view/MenuItem;", "item", "", "onOptionsItemSelected", "", "a", "Ljava/lang/String;", "title", "b", "url", "<init>", "()V", "Companion", "webauth_release"}, k = 1, mv = {1, 4, 1})
public final class WebAuthActivity extends AppCompatActivity {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String EXTRA_URL = "url";
    private static final String d = "WebAuthActivity";
    private static final String e = "title";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private String title;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private String url;
    private HashMap c;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ \u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0007R\u0016\u0010\t\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0016\u0010\u000b\u001a\u00020\u00048\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\nR\u0016\u0010\f\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\n¨\u0006\u000f"}, d2 = {"Lcom/huami/thirdparty/webauth/WebAuthActivity$Companion;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "url", "title", "Landroid/content/Intent;", "getIntent", "EXTRA_TITLE", "Ljava/lang/String;", "EXTRA_URL", "TAG", "<init>", "()V", "webauth_release"}, k = 1, mv = {1, 4, 1})
    public static final class Companion {
        private Companion() {
        }

        @JvmStatic
        @NotNull
        public final Intent getIntent(@NotNull Context context, @NotNull String url, @NotNull String title) {
            Intent intent = new Intent(context, (Class<?>) WebAuthActivity.class);
            intent.putExtra("title", title);
            intent.putExtra("url", url);
            return intent;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroid/webkit/WebView;", "webView", "", "onLoadFinish", "(Landroid/webkit/WebView;)V", "com/huami/thirdparty/webauth/WebAuthActivity$onCreate$fragment$1$1", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    public static final class a implements WebFragment.PageLoadCallback {
        public final /* synthetic */ Ref.ObjectRef b;

        public a(Ref.ObjectRef objectRef) {
            this.b = objectRef;
        }

        @Override // com.huami.thirdparty.support.ui.WebFragment.PageLoadCallback
        public final void onLoadFinish(@NotNull WebView webView) {
            Actions actions = Actions.INSTANCE;
            String url = webView.getUrl();
            if (url == null) {
                url = "";
            }
            actions.execute(url, WebAuthActivity.this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Landroid/view/View;", "kotlin.jvm.PlatformType", "it", "", "onClick", "(Landroid/view/View;)V", "com/huami/thirdparty/webauth/WebAuthActivity$onCreate$1$2", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    public static final class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            WebAuthActivity.this.finish();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0004\u0010\u0004\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"", "invoke", "()Ljava/lang/String;", "com/huami/thirdparty/webauth/WebAuthActivity$onCreate$2$1", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    public static final class c extends Lambda implements Function0<String> {
        public final /* synthetic */ Ref.ObjectRef b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Ref.ObjectRef objectRef) {
            super(0);
            this.b = objectRef;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "load web url:" + WebAuthActivity.this.url;
        }
    }

    public WebAuthActivity() {
        super(R.layout.activity_web_auth);
    }

    @JvmStatic
    @NotNull
    public static final Intent getIntent(@NotNull Context context, @NotNull String str, @NotNull String str2) {
        return INSTANCE.getIntent(context, str, str2);
    }

    public void _$_clearFindViewByIdCache() {
        HashMap map = this.c;
        if (map != null) {
            map.clear();
        }
    }

    public View _$_findCachedViewById(int i) {
        if (this.c == null) {
            this.c = new HashMap();
        }
        View view = (View) this.c.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View viewFindViewById = findViewById(i);
        this.c.put(Integer.valueOf(i), viewFindViewById);
        return viewFindViewById;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [T, android.os.Bundle] */
    /* JADX WARN: Type inference failed for: r0v9, types: [T, android.os.Bundle] */
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
        rainbowTitleBar.setNavigationOnClickListener(new b());
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = BundleKt.bundleOf(new Pair[0]);
        String str2 = this.url;
        if (str2 != null) {
            HMLog.info(d, new c(objectRef));
            objectRef.element = WebAuthFragment.INSTANCE.buildArguments(str2);
        }
        WebAuthFragment webAuthFragment = new WebAuthFragment();
        webAuthFragment.setArguments((Bundle) objectRef.element);
        webAuthFragment.setPageLoadCallback(new a(objectRef));
        FragmentTransaction fragmentTransactionBeginTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransactionBeginTransaction.replace(R.id.fragment_container, webAuthFragment);
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
