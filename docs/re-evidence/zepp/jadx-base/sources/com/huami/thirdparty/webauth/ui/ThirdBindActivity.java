package com.huami.thirdparty.webauth.ui;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.account.AccountStatEvent;
import com.huami.lib.rainbow.titlebar.RainbowTitleBar;
import com.huami.tools.analytics.DbUtils;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0011\u0018\u0000  2\u00020\u0001:\u0001 B\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0014J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0014J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016R\u0016\u0010\u000f\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\u0013\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0015\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0012R\u0016\u0010\u0017\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0012R\u0016\u0010\u0019\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0012R\u0016\u0010\u001b\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u0012R\u0016\u0010\u001d\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u0012¨\u0006!"}, d2 = {"Lcom/huami/thirdparty/webauth/ui/ThirdBindActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Landroid/os/Bundle;", "outState", "", "onSaveInstanceState", "savedInstanceState", "onCreate", "Landroid/view/MenuItem;", "item", "", "onOptionsItemSelected", "Lcom/huami/thirdparty/webauth/ui/AuthType;", "a", "Lcom/huami/thirdparty/webauth/ui/AuthType;", "authType", "", "b", "Ljava/lang/String;", "uid", "c", "clientId", GoogleApiAvailabilityLight.a, AccountStatEvent.KEY_ACCOUNT_SIGN_THIRD_NAME, "e", "countryCode", "f", "region", "g", "name", "<init>", "()V", "Companion", "webauth-ui_release"}, k = 1, mv = {1, 4, 1})
public final class ThirdBindActivity extends AppCompatActivity {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private AuthType authType;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private String uid;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private String clientId;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private String thirdName;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private String countryCode;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private String region;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private String name;
    private HashMap h;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010JH\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0006H\u0007¨\u0006\u0011"}, d2 = {"Lcom/huami/thirdparty/webauth/ui/ThirdBindActivity$Companion;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Lcom/huami/thirdparty/webauth/ui/AuthType;", "authType", "", "uid", "clientId", AccountStatEvent.KEY_ACCOUNT_SIGN_THIRD_NAME, "countryCode", "region", "name", "Landroid/content/Intent;", "getIntent", "<init>", "()V", "webauth-ui_release"}, k = 1, mv = {1, 4, 1})
    public static final class Companion {
        private Companion() {
        }

        @JvmStatic
        @NotNull
        public final Intent getIntent(@NotNull Context context, @NotNull AuthType authType, @NotNull String uid, @NotNull String clientId, @NotNull String thirdName, @NotNull String countryCode, @NotNull String region, @NotNull String name) {
            Intent intent = new Intent(context, (Class<?>) ThirdBindActivity.class);
            intent.putExtra("auth_type", authType);
            intent.putExtra("uid", uid);
            intent.putExtra("client_id", clientId);
            intent.putExtra("third_name", thirdName);
            intent.putExtra("country_code", countryCode);
            intent.putExtra("region", region);
            intent.putExtra("name", name);
            return intent;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Landroid/view/View;", "kotlin.jvm.PlatformType", "it", "", "onClick", "(Landroid/view/View;)V", "com/huami/thirdparty/webauth/ui/ThirdBindActivity$onCreate$1$1", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    public static final class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            ThirdBindActivity.this.finish();
        }
    }

    public ThirdBindActivity() {
        super(R.layout.third_party_activity_bind_webauth);
        this.authType = AuthType.Relive;
        this.uid = "";
        this.clientId = "";
        this.thirdName = "";
        this.countryCode = "";
        this.region = "";
        this.name = "";
    }

    @JvmStatic
    @NotNull
    public static final Intent getIntent(@NotNull Context context, @NotNull AuthType authType, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6) {
        return INSTANCE.getIntent(context, authType, str, str2, str3, str4, str5, str6);
    }

    public void _$_clearFindViewByIdCache() {
        HashMap map = this.h;
        if (map != null) {
            map.clear();
        }
    }

    public View _$_findCachedViewById(int i) {
        if (this.h == null) {
            this.h = new HashMap();
        }
        View view = (View) this.h.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View viewFindViewById = findViewById(i);
        this.h.put(Integer.valueOf(i), viewFindViewById);
        return viewFindViewById;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        String stringExtra;
        String stringExtra2;
        String stringExtra3;
        String stringExtra4;
        String stringExtra5;
        String stringExtra6;
        setTheme(R.style.Theme_App_Zepp);
        super.onCreate(savedInstanceState);
        String str = "";
        if (savedInstanceState != null) {
            Serializable serializable = savedInstanceState.getSerializable("auth_type");
            Objects.requireNonNull(serializable, "null cannot be cast to non-null type com.huami.thirdparty.webauth.ui.AuthType");
            this.authType = (AuthType) serializable;
            String string = savedInstanceState.getString("uid");
            if (string == null) {
                string = "";
            }
            this.uid = string;
            String string2 = savedInstanceState.getString("client_id");
            if (string2 == null) {
                string2 = "";
            }
            this.clientId = string2;
            String string3 = savedInstanceState.getString("third_name");
            if (string3 == null) {
                string3 = "";
            }
            this.thirdName = string3;
            String string4 = savedInstanceState.getString("country_code");
            if (string4 == null) {
                string4 = "";
            }
            this.countryCode = string4;
            String string5 = savedInstanceState.getString("region");
            if (string5 == null) {
                string5 = "";
            }
            this.region = string5;
            String string6 = savedInstanceState.getString("name");
            this.name = string6 != null ? string6 : "";
        } else {
            Intent intent = getIntent();
            Serializable serializableExtra = intent != null ? intent.getSerializableExtra("auth_type") : null;
            Objects.requireNonNull(serializableExtra, "null cannot be cast to non-null type com.huami.thirdparty.webauth.ui.AuthType");
            this.authType = (AuthType) serializableExtra;
            Intent intent2 = getIntent();
            if (intent2 == null || (stringExtra = intent2.getStringExtra("uid")) == null) {
                stringExtra = "";
            }
            this.uid = stringExtra;
            Intent intent3 = getIntent();
            if (intent3 == null || (stringExtra2 = intent3.getStringExtra("client_id")) == null) {
                stringExtra2 = "";
            }
            this.clientId = stringExtra2;
            Intent intent4 = getIntent();
            if (intent4 == null || (stringExtra3 = intent4.getStringExtra("third_name")) == null) {
                stringExtra3 = "";
            }
            this.thirdName = stringExtra3;
            Intent intent5 = getIntent();
            if (intent5 == null || (stringExtra4 = intent5.getStringExtra("country_code")) == null) {
                stringExtra4 = "";
            }
            this.countryCode = stringExtra4;
            Intent intent6 = getIntent();
            if (intent6 == null || (stringExtra5 = intent6.getStringExtra("region")) == null) {
                stringExtra5 = "";
            }
            this.region = stringExtra5;
            Intent intent7 = getIntent();
            if (intent7 != null && (stringExtra6 = intent7.getStringExtra("name")) != null) {
                str = stringExtra6;
            }
            this.name = str;
        }
        RainbowTitleBar rainbowTitleBar = (RainbowTitleBar) findViewById(R.id.toolbar);
        rainbowTitleBar.setTitle(R.string.auth);
        rainbowTitleBar.setNavigationOnClickListener(new a());
        FragmentTransaction fragmentTransactionBeginTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransactionBeginTransaction.replace(R.id.fragment_container, ThirdBindFragment.class, ThirdBindFragment.INSTANCE.buildArguments(this.authType, this.uid, this.clientId, this.thirdName, this.countryCode, this.region, this.name), null);
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
        outState.putAll(ThirdBindFragment.INSTANCE.buildArguments(this.authType, this.uid, this.clientId, this.thirdName, this.countryCode, this.region, this.name));
    }
}
