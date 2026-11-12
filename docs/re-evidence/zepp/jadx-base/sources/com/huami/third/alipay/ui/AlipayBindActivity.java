package com.huami.third.alipay.ui;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;
import com.huami.lib.rainbow.titlebar.RainbowTitleBar;
import com.huami.mifit.analytics.Analytics;
import com.huami.mifit.analytics.builder.CountEventBuilder;
import com.huami.tools.analytics.DbUtils;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes14.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0016\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0014J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0014J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016J\b\u0010\r\u001a\u00020\fH\u0016J\b\u0010\u000f\u001a\u00020\u000eH\u0016R\u0016\u0010\u0013\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0015\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0012¨\u0006\u0019"}, d2 = {"Lcom/huami/third/alipay/ui/AlipayBindActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Landroid/os/Bundle;", "outState", "", "onSaveInstanceState", "savedInstanceState", "onCreate", "Landroid/view/MenuItem;", "item", "", "onOptionsItemSelected", "", "getLayoutResId", "Lcom/huami/third/alipay/ui/AlipayBindFragment;", "createFragment", "", "a", "Ljava/lang/String;", "userId", "b", "appId", "<init>", "()V", "Companion", "alipay-ui_release"}, k = 1, mv = {1, 4, 1})
public class AlipayBindActivity extends AppCompatActivity {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private String userId = "";

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private String appId = "";
    private HashMap c;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ \u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0007¨\u0006\u000b"}, d2 = {"Lcom/huami/third/alipay/ui/AlipayBindActivity$Companion;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "userId", "appId", "Landroid/content/Intent;", "getIntent", "<init>", "()V", "alipay-ui_release"}, k = 1, mv = {1, 4, 1})
    public static final class Companion {
        private Companion() {
        }

        @JvmStatic
        @NotNull
        public final Intent getIntent(@NotNull Context context, @NotNull String userId, @NotNull String appId) {
            Intent intent = new Intent(context, (Class<?>) AlipayBindActivity.class);
            intent.putExtra("userId", userId);
            intent.putExtra("appId", appId);
            return intent;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Landroid/view/View;", "kotlin.jvm.PlatformType", "it", "", "onClick", "(Landroid/view/View;)V", "com/huami/third/alipay/ui/AlipayBindActivity$onCreate$1$1", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    public static final class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            AlipayBindActivity.this.finish();
        }
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

    @NotNull
    public AlipayBindFragment createFragment() {
        return new AlipayBindFragment();
    }

    public int getLayoutResId() {
        return R.layout.activity_bind;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        setTheme(R.style.Theme_App_Zepp);
        super.onCreate(savedInstanceState);
        setContentView(getLayoutResId());
        Analytics.recordEvent(new CountEventBuilder(StateEvent.INSTANCE.getALIPAY_VIEW_NUM()));
        if (savedInstanceState != null) {
            String string = savedInstanceState.getString("userId");
            if (string == null) {
                string = "";
            }
            this.userId = string;
            String string2 = savedInstanceState.getString("appId");
            this.appId = string2 != null ? string2 : "";
        } else {
            String stringExtra = getIntent().getStringExtra("userId");
            if (stringExtra == null) {
                stringExtra = "";
            }
            this.userId = stringExtra;
            String stringExtra2 = getIntent().getStringExtra("appId");
            this.appId = stringExtra2 != null ? stringExtra2 : "";
        }
        RainbowTitleBar rainbowTitleBar = (RainbowTitleBar) findViewById(R.id.toolbar);
        rainbowTitleBar.setTitle(R.string.bind_alipay_title);
        rainbowTitleBar.setBackgroundResource(R.color.s15);
        rainbowTitleBar.setNavigationOnClickListener(new a());
        FragmentTransaction fragmentTransactionBeginTransaction = getSupportFragmentManager().beginTransaction();
        int i = R.id.fragment_container;
        AlipayBindFragment alipayBindFragmentCreateFragment = createFragment();
        alipayBindFragmentCreateFragment.setArguments(AlipayBindFragment.INSTANCE.buildArguments(this.userId, this.appId));
        Unit unit = Unit.INSTANCE;
        fragmentTransactionBeginTransaction.replace(i, alipayBindFragmentCreateFragment);
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
        outState.putAll(AlipayBindFragment.INSTANCE.buildArguments(this.userId, this.appId));
    }
}
