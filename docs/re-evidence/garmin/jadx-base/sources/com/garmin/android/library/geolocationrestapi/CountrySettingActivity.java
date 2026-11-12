package com.garmin.android.library.geolocationrestapi;

import am.j;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.Html;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.g1;
import androidx.core.view.s0;
import androidx.lifecycle.i0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.garmin.android.apps.connectmobile.R;
import d53.u;
import d53.w;
import java.io.Serializable;
import java.util.List;
import java.util.Locale;
import java.util.WeakHashMap;
import o53.f0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p13.j0;
import u62.z;
import ve2.e;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/library/geolocationrestapi/CountrySettingActivity;", "Li/c;", "<init>", "()V", "a", "b", "geolocation-rest-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class CountrySettingActivity extends i.c {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f50141g = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public RecyclerView f50143b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public com.garmin.android.library.geolocationrestapi.a f50144c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public e f50145d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f50146e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f50142a = new c();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public List<String> f50147f = j0.f134944a;

    public interface b {
        void a(int i14);
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/library/geolocationrestapi/CountrySettingActivity$c", "Lcom/garmin/android/library/geolocationrestapi/CountrySettingActivity$b;", "geolocation-rest-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class c implements b {
        public c() {
        }

        @Override // com.garmin.android.library.geolocationrestapi.CountrySettingActivity.b
        public final void a(int i14) {
            ud2.b bVar = ud2.b.f170019a;
            CountrySettingActivity countrySettingActivity = CountrySettingActivity.this;
            String str = countrySettingActivity.f50147f.get(i14);
            bVar.getClass();
            ud2.b.c(countrySettingActivity, str);
            countrySettingActivity.onBackPressed();
        }
    }

    public static final String O9(CountrySettingActivity countrySettingActivity, String str) {
        countrySettingActivity.getClass();
        Locale locale = Locale.getDefault();
        if (!TextUtils.equals(locale.getLanguage(), "en") && !TextUtils.equals(locale.getLanguage(), "zh")) {
            String displayCountry = new Locale("", str).getDisplayCountry();
            displayCountry.getClass();
            return displayCountry;
        }
        if ("CN".equals(str)) {
            String string = countrySettingActivity.getString(R.string.china_display_name_overwrite);
            string.getClass();
            return string;
        }
        String displayCountry2 = new Locale("", str).getDisplayCountry();
        displayCountry2.getClass();
        return displayCountry2;
    }

    @Override // b.g, android.app.Activity
    @o13.e
    public final void onBackPressed() {
        Intent intent = new Intent();
        ud2.b bVar = ud2.b.f170019a;
        String strA = hb2.e.a(this);
        bVar.getClass();
        intent.putExtra("extra.country.code.data", ud2.b.a(this, strA));
        Unit unit = Unit.INSTANCE;
        setResult(-1, intent);
        super.onBackPressed();
    }

    @Override // androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        e eVar;
        super.onCreate(bundle);
        Bundle extras = getIntent().getExtras();
        if (extras == null) {
            finish();
            return;
        }
        if (Build.VERSION.SDK_INT >= 33) {
            Serializable serializable = extras.getSerializable("extra.sso.env", e.class);
            serializable.getClass();
            eVar = (e) serializable;
        } else {
            Serializable serializable2 = extras.getSerializable("extra.sso.env");
            serializable2.getClass();
            eVar = (e) serializable2;
        }
        this.f50145d = eVar;
        ud2.b bVar = ud2.b.f170019a;
        String strA = hb2.e.a(this);
        bVar.getClass();
        this.f50146e = ud2.b.a(this, strA);
        setContentView(R.layout.country_setting_layout);
        getWindow().getDecorView().setBackgroundColor(a7.b.getColor(this, R.color.geo_activity_background_color));
        this.f50144c = new com.garmin.android.library.geolocationrestapi.a(this.f50142a);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        com.garmin.android.library.geolocationrestapi.a aVar = this.f50144c;
        if (aVar == null) {
            s.m("countrySettingAdapter");
            throw null;
        }
        recyclerView.setAdapter(aVar);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(1);
        recyclerView.setLayoutManager(linearLayoutManager);
        this.f50143b = recyclerView;
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setBackgroundColor(a7.b.getColor(this, R.color.geo_actionbar_background_color));
        toolbar.setTitleTextColor(a7.b.getColor(this, R.color.geo_actionbar_text_color));
        setSupportActionBar(toolbar);
        i.a supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.q(true);
            supportActionBar.u(R.string.lbl_navigate_up);
            supportActionBar.C(getResources().getString(R.string.title_authentication_domain));
        }
        String string = getString(R.string.golf_sign_in_authentication_domain_msg);
        string.getClass();
        String strSubstring = string.substring(0, w.H(string, ":", 0, false, 6) + 1);
        String strV = u.v(string, strSubstring, j.m("<b>", strSubstring, "</b>"), false);
        TextView textView = (TextView) findViewById(R.id.warning_view);
        textView.setText(Html.fromHtml(strV, 0));
        textView.setTextColor(a7.b.getColor(this, R.color.geo_warning_text_color));
        b.j.a(this);
        ViewGroup viewGroup = (ViewGroup) findViewById(android.R.id.content);
        z zVar = new z(21);
        WeakHashMap<View, g1> weakHashMap = s0.f6563a;
        s0.d.c(viewGroup, zVar);
        i0 i0VarW = f0.w(this);
        x53.c cVar = o53.s0.f129406a;
        ge1.b.T(i0VarW, x53.b.f189152a, null, new ud2.a(this, null), 2);
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        menuItem.getClass();
        if (menuItem.getItemId() == 16908332) {
            onBackPressed();
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/garmin/android/library/geolocationrestapi/CountrySettingActivity$a;", "", "<init>", "()V", "", "EXTRA_SSO_ENVIRONMENT", "Ljava/lang/String;", "EXTRA_COUNTRY_CODE_DATA", "geolocation-rest-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
