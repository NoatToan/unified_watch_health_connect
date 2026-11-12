package com.xiaomi.hm.health.ui.keekalive;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import cn.com.smartdevices.bracelet.rom.AliveUtils;
import cn.com.smartdevices.bracelet.rom.ROM;
import com.huami.mifit.analytics.Analytics;
import com.huami.mifit.analytics.builder.CountEventBuilder;
import com.huami.view.basetitle.BaseTitleActivity;
import com.huami.watch.hmwatchmanager.R;
import com.xiaomi.hm.health.baseui.BaseTitleBarExtKt;
import com.xiaomi.hm.health.baseutil.GlobalConfig;
import com.xiaomi.hm.health.keeper.HMKeeper;

/* JADX INFO: loaded from: classes22.dex */
public class KeepAliveActivity extends BaseTitleActivity {
    public TextView A;
    public TextView B;
    public TextView C;
    public TextView D;
    public TextView E;
    public TextView F;
    public TextView G;
    public TextView H;
    public TextView I;
    private ROM L;
    public TextView y;
    public TextView z;
    private final int x = -1;
    private b[] J = {new b(ROM.MIUI, R.string.keep_alive_setting_title_miui, R.string.keep_alive_setting_auto_start_miui, R.string.keep_alive_setting_power_manager_miui, R.string.keep_alive_setting_app_lock_miui), new b(ROM.EMUI, R.string.keep_alive_setting_title_emui, R.string.keep_alive_setting_auto_start_emui, R.string.keep_alive_setting_power_manager_emui, R.string.keep_alive_setting_app_lock_emui), new b(ROM.TouchWiz, R.string.keep_alive_setting_title_samsung, R.string.keep_alive_setting_auto_start_samsung, R.string.keep_alive_setting_power_manager_samsung, R.string.keep_alive_setting_app_lock_samsung), new b(ROM.Flyme, R.string.keep_alive_setting_title_flyme, R.string.keep_alive_setting_auto_start_flyme, -1, R.string.keep_alive_setting_app_lock_flyme), new b(ROM.ColorOS, R.string.keep_alive_setting_title_oppo_color_os, R.string.keep_alive_setting_auto_start_color_os, R.string.keep_alive_setting_power_manager_color_os, R.string.keep_alive_setting_app_lock_color_os), new b(ROM.FuntouchOS, R.string.keep_alive_setting_title_vivo_funtouch_os, R.string.keep_alive_setting_auto_start_funtouch_os, R.string.keep_alive_setting_power_manager_funtouch_os, R.string.keep_alive_setting_app_lock_funtouch_os), new b(ROM.EUI, R.string.keep_alive_setting_title_eui, R.string.keep_alive_setting_auto_start_eui, -1, -1), new b(ROM.SmartisanOS, R.string.keep_alive_setting_title_smartisan_os, R.string.keep_alive_setting_auto_start_smartisan_os, R.string.keep_alive_setting_power_manager_smartisan_os, R.string.keep_alive_setting_app_lock_smartisan_os)};
    private b K = new b(ROM.Other, R.string.keep_alive_setting_title_other, -1, -1, -1);

    public class a implements KeepAliveChangeSystemDialog.b {
        public a() {
        }

        @Override // com.xiaomi.hm.health.ui.keekalive.KeepAliveChangeSystemDialog.b
        public void a(ROM select) {
            KeepAliveActivity.this.L = select;
            KeepAliveActivity.this.updateUI();
        }

        @Override // com.xiaomi.hm.health.ui.keekalive.KeepAliveChangeSystemDialog.b
        public b b() {
            return KeepAliveActivity.this.K;
        }

        @Override // com.xiaomi.hm.health.ui.keekalive.KeepAliveChangeSystemDialog.b
        public ROM c() {
            return KeepAliveActivity.this.L;
        }

        @Override // com.xiaomi.hm.health.ui.keekalive.KeepAliveChangeSystemDialog.b
        public b[] getItems() {
            return KeepAliveActivity.this.J;
        }
    }

    public class b {
        public final ROM a;
        public final int b;
        public final int c;
        public final int d;
        public final int e;

        public b(ROM rom, int titleRes, int autoStartRes, int powerManagerRes, int appLockRes) {
            this.a = rom;
            this.b = titleRes;
            this.c = autoStartRes;
            this.d = powerManagerRes;
            this.e = appLockRes;
        }
    }

    private int A(b item, int index) {
        if (item.d != -1) {
            this.C.setVisibility(0);
            index++;
            this.C.setText(getString(R.string.keep_alive_setting_power_manager, new Object[]{t(index)}));
            this.D.setVisibility(0);
            this.D.setText(item.d);
            this.E.setVisibility(AliveUtils.getInstance().supportPowerManager(this, this.L) ? 0 : 8);
            this.E.setOnClickListener(new View.OnClickListener() { // from class: tk4
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.a.w(view);
                }
            });
        } else {
            this.C.setVisibility(8);
            this.D.setVisibility(8);
            this.E.setVisibility(8);
        }
        return index;
    }

    private void init() {
        ((TextView) findViewById(R.id.keep_alive_current_phone)).setText(AliveUtils.getInstance().getManufacturer().getPhoneBrand());
        findViewById(R.id.keep_alive_change).setOnClickListener(new View.OnClickListener() { // from class: vk4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.u(view);
            }
        });
        this.y = (TextView) findViewById(R.id.keep_alive_setting_title);
        this.z = (TextView) findViewById(R.id.keep_alive_setting_auto_start);
        this.A = (TextView) findViewById(R.id.keep_alive_setting_auto_start_rom);
        this.B = (TextView) findViewById(R.id.keep_alive_setting_auto_start_setting);
        this.C = (TextView) findViewById(R.id.keep_alive_setting_power_manager);
        this.D = (TextView) findViewById(R.id.keep_alive_setting_power_manager_rom);
        this.E = (TextView) findViewById(R.id.keep_alive_setting_power_manager_setting);
        this.F = (TextView) findViewById(R.id.keep_alive_setting_app_lock);
        this.G = (TextView) findViewById(R.id.keep_alive_setting_app_lock_rom);
        this.H = (TextView) findViewById(R.id.keep_alive_setting_app_lock_setting);
        this.I = (TextView) findViewById(R.id.keep_alive_setting_other);
        updateUI();
    }

    private String t(int index) {
        if (index == 1) {
            return getString(R.string.keep_alive_setting_index_one);
        }
        if (index != 2) {
            return index != 3 ? "" : getString(R.string.keep_alive_setting_index_thr);
        }
        return getString(R.string.keep_alive_setting_index_two);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void u(View view) {
        KeepAliveChangeSystemDialog.k(this, new a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateUI() {
        for (b bVar : this.J) {
            if (bVar.a == this.L) {
                this.y.setText(getString(R.string.keep_alive_setting_title, new Object[]{getString(bVar.b)}));
                x(bVar, A(bVar, y(bVar, 0)));
                this.I.setVisibility(8);
                return;
            }
        }
        z();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void v(View view) {
        AliveUtils.getInstance().goAutoStart(this, this.L);
        HMKeeper.setKeepAliveIsSetted(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void w(View view) {
        AliveUtils.getInstance().goPowerManager(this, this.L);
        HMKeeper.setKeepAliveIsSetted(true);
    }

    private void x(b item, int index) {
        if (item.e == -1) {
            this.F.setVisibility(8);
            this.G.setVisibility(8);
            this.H.setVisibility(8);
        } else {
            this.F.setVisibility(0);
            this.F.setText(getString(R.string.keep_alive_setting_app_lock, new Object[]{t(index + 1)}));
            this.G.setVisibility(0);
            this.G.setText(item.e);
            this.H.setVisibility(8);
        }
    }

    private int y(b item, int index) {
        if (item.c != -1) {
            this.z.setVisibility(0);
            index++;
            this.z.setText(getString(R.string.keep_alive_setting_auto_start, new Object[]{t(index)}));
            this.A.setVisibility(0);
            this.A.setText(item.c);
            this.B.setVisibility(AliveUtils.getInstance().supportAutoStart(this, this.L) ? 0 : 8);
            this.B.setOnClickListener(new View.OnClickListener() { // from class: uk4
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.a.v(view);
                }
            });
        } else {
            this.z.setVisibility(8);
            this.A.setVisibility(8);
            this.B.setVisibility(8);
        }
        return index;
    }

    private void z() {
        this.y.setText(getString(R.string.keep_alive_setting_title, new Object[]{getString(R.string.keep_alive_setting_title_other)}));
        this.z.setVisibility(8);
        this.A.setVisibility(8);
        this.B.setVisibility(8);
        this.C.setVisibility(8);
        this.D.setVisibility(8);
        this.E.setVisibility(8);
        this.F.setVisibility(8);
        this.G.setVisibility(8);
        this.H.setVisibility(8);
        this.I.setVisibility(0);
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        setTheme(2132017904);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_keep_alive);
        if (GlobalConfig.get().isBuildMidong()) {
            BaseTitleBarExtKt.setTitleBar(this, getString(R.string.mine_item_keep_alive_title));
        } else {
            setStyle(BaseTitleActivity.STYLE.BACK_AND_TITLE, ContextCompat.getColor(this, R.color.pale_grey_four), getString(R.string.mine_item_keep_alive_title), true);
            setBaseTitleColor(ContextCompat.getColor(this, R.color.black_70));
        }
        this.L = AliveUtils.getInstance().getCurrentROM();
        init();
        Analytics.recordEvent(new CountEventBuilder("Mine_Keepalive"));
    }
}
