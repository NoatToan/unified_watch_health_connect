package com.xiaomi.yrn.channel.debugui;

import android.R;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.Settings;
import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.Switch;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.smarthome.setting.ServerSetting;
import com.xiaomi.yrn.env.entity.YRNDevConfigInfo;
import com.xiaomi.yrn.env.entity.YRNDevModeInfo;
import defpackage.bzr;
import defpackage.rsi;
import defpackage.swr;
import defpackage.vwr;
import defpackage.xvi;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public class YRNDevModeActivity extends Activity {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Spinner f14506b;
    public Spinner c;
    public EditText d;
    public EditText e;
    public EditText f;
    public TextView g;
    public Switch h;
    public Switch i;
    public Switch j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public RecyclerView f14507k;
    public View l;
    public View m;
    public com.xiaomi.yrn.channel.debugui.a o;
    public String p;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f14505a = 110;
    public List<YRNDevModeInfo> n = new ArrayList();
    public String q = ":8081";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public String f14508r = "((2(5[0-5]|[0-4]\\d))|[0-1]?\\d{1,2})(\\.((2(5[0-5]|[0-4]\\d))|[0-1]?\\d{1,2})){3}";

    public class a implements AdapterView.OnItemSelectedListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ List f14509a;

        public a(List list) {
            this.f14509a = list;
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            if (i < 0 || i >= this.f14509a.size()) {
                return;
            }
            String str = (String) this.f14509a.get(i);
            if (TextUtils.equals(YRNDevModeActivity.this.p, str)) {
                return;
            }
            YRNDevModeActivity yRNDevModeActivity = YRNDevModeActivity.this;
            yRNDevModeActivity.p = str;
            yRNDevModeActivity.c.setSelection(yRNDevModeActivity.l(str));
            YRNDevModeActivity yRNDevModeActivity2 = YRNDevModeActivity.this;
            yRNDevModeActivity2.j.setChecked(yRNDevModeActivity2.v(yRNDevModeActivity2.p));
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    public class b implements AdapterView.OnItemSelectedListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ List f14511a;

        public b(List list) {
            this.f14511a = list;
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            if (i < 0 || i >= this.f14511a.size()) {
                return;
            }
            String str = (String) this.f14511a.get(i);
            YRNDevModeActivity yRNDevModeActivity = YRNDevModeActivity.this;
            yRNDevModeActivity.z(yRNDevModeActivity.p, str);
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (TextUtils.isEmpty(YRNDevModeActivity.this.p)) {
                bzr.l("请选择AppName");
                return;
            }
            String string = YRNDevModeActivity.this.d.getText().toString();
            String string2 = YRNDevModeActivity.this.e.getText().toString();
            String string3 = YRNDevModeActivity.this.f.getText().toString();
            if (TextUtils.isEmpty(string)) {
                bzr.l("请输入module");
                return;
            }
            if (YRNDevModeActivity.this.h.isChecked()) {
                if (TextUtils.isEmpty(string3)) {
                    bzr.l("请输入IP参数");
                    return;
                }
                if (!Pattern.compile(YRNDevModeActivity.this.f14508r).matcher(string3.contains(":") ? string3.substring(0, string3.indexOf(":")) : string3).matches()) {
                    bzr.l("请输入正确的IP参数");
                    return;
                }
                string2 = null;
            } else {
                if (TextUtils.isEmpty(string2)) {
                    bzr.l("请输入Branch参数");
                    return;
                }
                if (string2.contains(".") || string2.contains(":")) {
                    bzr.l("Branch参数包含.:特殊字符，请确认是否是Branch参数！");
                }
                string3 = null;
            }
            YRNDevModeActivity yRNDevModeActivity = YRNDevModeActivity.this;
            if (yRNDevModeActivity.B(yRNDevModeActivity.p, string, string2, string3)) {
                bzr.l("添加成功");
                YRNDevModeActivity.this.y();
            }
        }
    }

    public class d implements CompoundButton.OnCheckedChangeListener {
        public d() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            if (z) {
                YRNDevModeActivity.this.l.setVisibility(0);
                YRNDevModeActivity.this.m.setVisibility(8);
            } else {
                YRNDevModeActivity.this.l.setVisibility(8);
                YRNDevModeActivity.this.m.setVisibility(0);
            }
        }
    }

    public class e implements com.xiaomi.yrn.channel.debugui.a.c {
        public e() {
        }

        @Override // com.xiaomi.yrn.channel.debugui.a.c
        public void a(int i) {
            if (i >= YRNDevModeActivity.this.n.size() || i < 0) {
                return;
            }
            YRNDevModeActivity.this.g(YRNDevModeActivity.this.n.get(i));
            YRNDevModeActivity.this.n.remove(i);
            YRNDevModeActivity.this.o.notifyItemRemoved(i);
            bzr.l("删除成功");
        }

        @Override // com.xiaomi.yrn.channel.debugui.a.c
        public void b(int i) {
            if (i >= YRNDevModeActivity.this.n.size() || i < 0) {
                return;
            }
            YRNDevModeInfo yRNDevModeInfo = YRNDevModeActivity.this.n.get(i);
            YRNDevModeActivity yRNDevModeActivity = YRNDevModeActivity.this;
            yRNDevModeActivity.f14506b.setSelection(yRNDevModeActivity.i().indexOf(yRNDevModeInfo.a()));
            YRNDevModeActivity.this.d.setText(yRNDevModeInfo.e());
            YRNDevModeActivity.this.e.setText(yRNDevModeInfo.c());
            YRNDevModeActivity.this.f.setText(yRNDevModeInfo.d());
            YRNDevModeActivity.this.h.setChecked(!TextUtils.isEmpty(yRNDevModeInfo.d()));
        }
    }

    public class f extends ArrayList<String> {
        public f() {
            add("production");
            add(ServerSetting.SERVER_ENV_PREVIEW);
            add("staging");
        }
    }

    public final void A(String str, boolean z) {
        YRNDevConfigInfo yRNDevConfigInfoD = swr.e().d(str);
        if (yRNDevConfigInfoD == null) {
            yRNDevConfigInfoD = new YRNDevConfigInfo(str);
        }
        yRNDevConfigInfoD.e(z);
        swr.e().g(str, yRNDevConfigInfoD);
    }

    public boolean B(String str, String str2, String str3, String str4) {
        if (!TextUtils.isEmpty(str4) && !str4.contains(":")) {
            str4 = str4 + this.q;
        }
        return swr.e().h(new YRNDevModeInfo(str, str2, str3, str4));
    }

    public final void C() {
        com.xiaomi.yrn.channel.debugui.b.b().e(getBaseContext());
    }

    public void f() {
        if (Settings.canDrawOverlays(this)) {
            C();
            return;
        }
        startActivityForResult(new Intent("android.settings.action.MANAGE_OVERLAY_PERMISSION", Uri.parse("package:" + getPackageName())), this.f14505a);
    }

    public void g(YRNDevModeInfo yRNDevModeInfo) {
        swr.e().b(yRNDevModeInfo.a(), yRNDevModeInfo.e());
    }

    public List<YRNDevModeInfo> h() {
        List<YRNDevModeInfo> listC = swr.e().c();
        return listC == null ? new ArrayList() : listC;
    }

    public List<String> i() {
        return vwr.g().b();
    }

    public List<String> j() {
        return new f();
    }

    public final String k(String str) {
        YRNDevConfigInfo yRNDevConfigInfoD = swr.e().d(str);
        return yRNDevConfigInfoD != null ? yRNDevConfigInfoD.a() : "production";
    }

    public final int l(String str) {
        String strK = k(str);
        if (j().contains(strK)) {
            return j().indexOf(strK);
        }
        return 0;
    }

    public final void m() {
        Switch r0 = this.i;
        if (r0 != null && r0.isChecked()) {
            this.i.setChecked(false);
        }
        com.xiaomi.yrn.channel.debugui.b.b().c();
    }

    public final void n() {
        this.g.setOnClickListener(new c());
    }

    public final void o() {
        List<String> listI = i();
        ArrayAdapter arrayAdapter = new ArrayAdapter(this, R.layout.simple_spinner_item, listI);
        arrayAdapter.setDropDownViewResource(R.layout.simple_spinner_dropdown_item);
        this.f14506b.setAdapter((SpinnerAdapter) arrayAdapter);
        this.p = (listI == null || listI.size() <= 0) ? null : listI.get(0);
        this.f14506b.setOnItemSelectedListener(new a(listI));
    }

    @Override // android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == this.f14505a) {
            if (Settings.canDrawOverlays(this)) {
                C();
            } else {
                bzr.k("not granted permission!");
            }
        }
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(xvi.f39513a);
        u();
    }

    public final void p() {
        List<String> listJ = j();
        ArrayAdapter arrayAdapter = new ArrayAdapter(this, R.layout.simple_spinner_item, listJ);
        arrayAdapter.setDropDownViewResource(R.layout.simple_spinner_dropdown_item);
        this.c.setAdapter((SpinnerAdapter) arrayAdapter);
        this.c.setSelection(l(this.p));
        this.c.setOnItemSelectedListener(new b(listJ));
    }

    public final void q() {
        this.h.setOnCheckedChangeListener(new d());
    }

    public final void r() {
        this.j.setChecked(v(this.p));
        this.j.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: qwr
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                this.f31919a.w(compoundButton, z);
            }
        });
    }

    public void s() {
        List<YRNDevModeInfo> listH = h();
        this.n = listH;
        this.o = new com.xiaomi.yrn.channel.debugui.a(listH);
        this.f14507k.setLayoutManager(new LinearLayoutManager(this));
        this.f14507k.setAdapter(this.o);
        this.o.setOnDevModeListActionListener(new e());
    }

    public void t() {
        this.i.setChecked(com.xiaomi.yrn.channel.debugui.b.b().d());
        this.i.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: pwr
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                this.f30867a.x(compoundButton, z);
            }
        });
    }

    public void u() {
        this.i = (Switch) findViewById(rsi.o);
        this.j = (Switch) findViewById(rsi.n);
        this.f14506b = (Spinner) findViewById(rsi.f32861k);
        this.c = (Spinner) findViewById(rsi.l);
        this.d = (EditText) findViewById(rsi.e);
        this.f = (EditText) findViewById(rsi.d);
        this.e = (EditText) findViewById(rsi.c);
        this.g = (TextView) findViewById(rsi.f32859a);
        this.h = (Switch) findViewById(rsi.m);
        this.f14507k = (RecyclerView) findViewById(rsi.g);
        this.l = findViewById(rsi.h);
        this.m = findViewById(rsi.i);
        o();
        p();
        n();
        q();
        r();
        t();
        s();
    }

    public final boolean v(String str) {
        YRNDevConfigInfo yRNDevConfigInfoD = swr.e().d(str);
        return yRNDevConfigInfoD != null && yRNDevConfigInfoD.c();
    }

    public final /* synthetic */ void w(CompoundButton compoundButton, boolean z) {
        if (TextUtils.isEmpty(this.p)) {
            bzr.k("请选择应用");
        } else {
            A(this.p, z);
        }
    }

    public final /* synthetic */ void x(CompoundButton compoundButton, boolean z) {
        if (z) {
            f();
        } else {
            m();
        }
    }

    public void y() {
        List<YRNDevModeInfo> listH = h();
        this.n.clear();
        this.n.addAll(listH);
        this.o.notifyDataSetChanged();
    }

    public final void z(String str, String str2) {
        YRNDevConfigInfo yRNDevConfigInfoD = swr.e().d(str);
        if (yRNDevConfigInfoD == null) {
            yRNDevConfigInfoD = new YRNDevConfigInfo(str);
        }
        yRNDevConfigInfoD.d(str2);
        swr.e().g(str, yRNDevConfigInfoD);
    }
}
