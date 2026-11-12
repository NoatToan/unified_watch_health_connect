package com.garmin.android.apps.connectmobile.settings.devices.controlsmenu;

import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Point;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Display;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.fragment.app.m;
import androidx.viewpager.widget.ViewPager;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.c;
import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;
import hb2.i;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import rd2.j;
import yg1.d;
import yg1.e;
import yg1.f;
import yg1.g;

/* JADX INFO: loaded from: classes10.dex */
public class ControlsMenuActivity extends c {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ int f42861y = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ViewPager f42862a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public RelativeLayout f42863b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TextView f42864c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ImageView f42865d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public f f42866e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public e f42867f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public g f42868g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ImageView[] f42869h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ImageView f42870i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public LinearLayout[] f42871j;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean[] f42877p;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public DeviceSettingsDTO f42880t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public long f42881v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public d80.f f42882w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Point f42883x;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f42872k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f42873l = 2131233578;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f42874m = 2131233558;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f42875n = 2131233564;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f42876o = 255;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f42878q = false;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f42879r = 255;

    public class a implements ViewPager.j {
        public a() {
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public final void onPageScrollStateChanged(int i14) {
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public final void onPageScrolled(int i14, float f14, int i15) {
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public final void onPageSelected(int i14) {
            int i15 = ControlsMenuActivity.f42861y;
            ControlsMenuActivity.this.ea(i14);
        }
    }

    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view2) {
            ControlsMenuActivity controlsMenuActivity = ControlsMenuActivity.this;
            if (controlsMenuActivity.f42870i.getTag() == null || ((Integer) controlsMenuActivity.f42870i.getTag()).intValue() != controlsMenuActivity.f42875n) {
                return;
            }
            controlsMenuActivity.f42867f.a(255, controlsMenuActivity.f42876o, true);
        }
    }

    public static void ia(c cVar, DeviceSettingsDTO deviceSettingsDTO, String str, int i14, int i15, long j8, boolean z14) {
        Intent intent = new Intent(cVar, (Class<?>) ControlsMenuActivity.class);
        intent.putExtra("GCM_deviceSettings", deviceSettingsDTO);
        intent.putExtra("GCM_deviceSettingsTitle", str);
        intent.putExtra("GCM_watchFaceBackground", i14);
        intent.putExtra("GCM_watchFaceBatteryBackground", 2131233558);
        intent.putExtra("GCM_extra_device_connected_unit_id", j8);
        intent.putExtra("GCM_isLTEDevice", z14);
        cVar.startActivityForResult(intent, i15);
    }

    public final void ca() {
        for (g gVar : this.f42866e.f196917c) {
            int i14 = gVar.f196920b;
            ImageView[] imageViewArr = this.f42869h;
            if (i14 < imageViewArr.length) {
                imageViewArr[i14].setImageResource(gVar.f196922d);
                int i15 = gVar.f196924f;
                ImageView[] imageViewArr2 = this.f42869h;
                int i16 = gVar.f196920b;
                if (i15 != 0) {
                    imageViewArr2[i16].setImageTintList(ColorStateList.valueOf(a7.b.getColor(this, i15)));
                } else {
                    imageViewArr2[i16].setImageTintList(null);
                }
                this.f42869h[gVar.f196920b].setBackgroundResource(2131233562);
                this.f42869h[gVar.f196920b].setContentDescription(getString(gVar.f196925g));
            }
        }
        da();
        this.f42870i.setImageResource(this.f42874m);
        this.f42870i.setImportantForAccessibility(2);
        this.f42870i.setTag(Integer.valueOf(this.f42874m));
        e eVar = this.f42867f;
        eVar.f196912d = 255;
        eVar.f196913e = null;
    }

    public final void da() {
        this.f42862a.setAlpha(0.5f);
        for (int i14 = 0; i14 < this.f42862a.getChildCount(); i14++) {
            this.f42862a.getChildAt(i14).setEnabled(false);
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0053  */
    public final void ea(int i14) {
        Point point = this.f42883x;
        if (point == null || point.x <= 0 || this.f42866e.f196918d.isEmpty()) {
            return;
        }
        float size = this.f42866e.f196918d.size();
        int iCeil = (int) Math.ceil(size / (c22.b.a(this) > 1.3f ? 3 : 4));
        int i15 = this.f42883x.x;
        int i16 = i15 / iCeil;
        float f14 = i14;
        int i17 = (int) ((i15 / size) * f14);
        if (i17 + i16 < i15) {
            if (size - f14 <= (c22.b.a(this) > 1.3f ? 3 : 4)) {
                i17 = this.f42883x.x - i16;
            }
        } else {
            i17 = this.f42883x.x - i16;
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(i16, (int) getResources().getDimension(R.dimen.spacing_micro));
        layoutParams.setMargins(i17, 0, 0, 0);
        this.f42865d.setLayoutParams(layoutParams);
    }

    public final void fa(int i14, int i15, boolean z14) {
        if (z14) {
            while (i14 <= i15) {
                if (f.b(i14, this.f42866e.f196917c) != null) {
                    f.b(i14, this.f42866e.f196917c).f196920b = i14 - 1;
                }
                i14++;
            }
            return;
        }
        while (i14 >= i15) {
            if (f.b(i14, this.f42866e.f196917c) != null) {
                f.b(i14, this.f42866e.f196917c).f196920b = i14 + 1;
            }
            i14--;
        }
    }

    @Override // android.app.Activity
    public final void finish() {
        if (this.f42880t.f33905x.size() > 0) {
            ArrayList arrayList = new ArrayList();
            Iterator<g> it = this.f42866e.f196917c.iterator();
            while (it.hasNext()) {
                arrayList.add(Integer.valueOf(it.next().f196920b));
            }
            for (int i14 = 0; i14 < this.f42872k; i14++) {
                if (!arrayList.contains(Integer.valueOf(i14))) {
                    this.f42866e.f196917c.add(new g("INVALID", i14, R.drawable.plus, R.string.controls_menu_title, false, 255, R.color.gcm_icon_primary, R.color.gcm_icon_on_color));
                }
            }
            this.f42880t.f33905x.clear();
            Iterator<g> it3 = this.f42866e.f196917c.iterator();
            while (it3.hasNext()) {
                this.f42880t.f33905x.add(it3.next());
            }
            Iterator<g> it4 = this.f42866e.f196918d.iterator();
            while (it4.hasNext()) {
                this.f42880t.f33905x.add(it4.next());
            }
            getIntent().putExtra("GCM_deviceSettings", this.f42880t);
            getIntent().putExtra("activityForResult", this.f42880t.Y1().toString());
            setResult(-1, getIntent());
        }
        super.finish();
    }

    public final void ga() {
        for (int i14 = 0; i14 < this.f42872k; i14++) {
            this.f42869h[i14].setImageResource(R.drawable.plus);
            this.f42869h[i14].setImageTintList(ColorStateList.valueOf(a7.b.getColor(this, R.color.gcm_icon_on_color)));
            this.f42869h[i14].setBackgroundResource(2131233562);
            this.f42869h[i14].setContentDescription(getString(R.string.lbl_add));
            this.f42877p[i14] = false;
        }
    }

    public final void ha() {
        this.f42879r = 255;
        this.f42868g = null;
        da();
        this.f42870i.setImageResource(this.f42874m);
        this.f42870i.setTag(Integer.valueOf(this.f42874m));
        this.f42870i.setImportantForAccessibility(2);
        this.f42864c.setText(getResources().getString(R.string.tap_an_icon));
        e eVar = this.f42867f;
        eVar.f196912d = 255;
        eVar.f196913e = null;
        ea(this.f42862a.getCurrentItem());
    }

    @Override // i.c, b.g, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        Intent intent = getIntent();
        intent.putExtra("GCM_deviceSettings", this.f42880t);
        intent.putExtra("activityForResult", this.f42880t.Y1().toString());
        finish();
        startActivity(intent);
        super.onConfigurationChanged(configuration);
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        String strA1;
        super.onCreate(bundle);
        setContentView(R.layout.gcm3_controls_menu);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String string = extras.getString("GCM_deviceSettingsTitle");
            if (TextUtils.isEmpty(string)) {
                string = getString(R.string.controls_menu_title);
            }
            initActionBar(true, string);
            this.f42872k = extras.getInt("GCM_numberOfOptionsInControlsMenu");
            this.f42880t = (DeviceSettingsDTO) extras.getParcelable("GCM_deviceSettings");
            this.f42881v = getIntent().getLongExtra("GCM_extra_device_connected_unit_id", -1L);
            this.f42873l = extras.getInt("GCM_watchFaceBackground");
            this.f42874m = extras.getInt("GCM_watchFaceBatteryBackground");
            this.f42878q = extras.getBoolean("GCM_isLTEDevice", false);
        } else {
            finish();
        }
        boolean z14 = this.f42878q;
        if (z14) {
            this.f42874m = 2131233559;
        } else {
            this.f42874m = 2131233558;
        }
        this.f42866e = new f(this.f42880t, z14);
        List<g> list = this.f42880t.f33905x;
        int i14 = 0;
        for (int i15 = 0; i15 < list.size(); i15++) {
            if (list.get(i15).f196920b >= 0 && list.get(i15).f196920b < 255) {
                i14++;
            }
        }
        this.f42872k = i14;
        if (i14 == 0 || this.f42880t.f33905x.size() == 0) {
            Toast.makeText(this, R.string.txt_error_occurred, 0).show();
            finish();
        }
        ViewPager viewPager = (ViewPager) findViewById(R.id.vp_control_menu_carousel);
        this.f42862a = viewPager;
        viewPager.setOnPageChangeListener(new a());
        this.f42862a.getLayoutParams().height = (int) c22.b.c(this, xy2.b.n(getResources(), 80.0f), 2.0f);
        this.f42863b = (RelativeLayout) findViewById(R.id.rl_controls_menu);
        this.f42864c = (TextView) findViewById(R.id.tv_tap_an_icon);
        this.f42865d = (ImageView) findViewById(R.id.iv_sliding_tool_bar);
        ImageView imageView = (ImageView) findViewById(R.id.iv_device_background);
        j jVar = rd2.f.a().f152045a;
        long j8 = this.f42881v;
        jVar.getClass();
        sd2.f fVarI = j.i(j8, null);
        if (fVarI == null || (strA1 = fVarI.a1()) == null) {
            imageView.setImageResource(this.f42873l);
        } else {
            zp0.c.f206560v.getClass();
            zp0.c cVar = new zp0.c((m) this);
            cVar.f206565e = strA1;
            cVar.h(imageView);
            imageView.setScaleX(1.1f);
            imageView.setScaleY(1.1f);
        }
        ImageView imageView2 = (ImageView) findViewById(R.id.iv_watch_face_center_icon);
        this.f42870i = imageView2;
        imageView2.setImageResource(this.f42874m);
        this.f42870i.setImportantForAccessibility(2);
        this.f42870i.setTag(Integer.valueOf(this.f42874m));
        this.f42870i.setOnClickListener(new b());
        if (this.f42867f == null) {
            this.f42867f = new e(this, this.f42866e, c22.b.a(this) > 1.3f ? 3 : 4);
        }
        this.f42862a.setAdapter(this.f42867f);
        e eVar = this.f42867f;
        eVar.f196912d = 255;
        eVar.f196913e = null;
        int i16 = this.f42872k;
        int i17 = 360 / i16;
        this.f42869h = new ImageView[i16];
        this.f42871j = new LinearLayout[i16];
        this.f42877p = new boolean[i16];
        for (int i18 = 0; i18 < i16; i18++) {
            this.f42871j[i18] = new LinearLayout(this);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams.addRule(13);
            this.f42871j[i18].setLayoutParams(layoutParams);
            int i19 = i17 * i18;
            this.f42871j[i18].setRotation(i19);
            this.f42869h[i18] = new ImageView(this);
            this.f42869h[i18].setImageResource(R.drawable.plus);
            this.f42869h[i18].setImageTintList(ColorStateList.valueOf(a7.b.getColor(this, R.color.gcm_icon_on_color)));
            this.f42869h[i18].setBackgroundResource(2131233562);
            this.f42869h[i18].setContentDescription(getString(R.string.lbl_add));
            int i24 = (int) (getResources().getDisplayMetrics().density * 5.0f);
            this.f42869h[i18].setPadding(i24, i24, i24, i24);
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
            layoutParams2.setMargins(0, 0, 0, (int) ((i16 == 10 ? 140 : 120) * getResources().getDisplayMetrics().density));
            this.f42869h[i18].setLayoutParams(layoutParams2);
            this.f42869h[i18].setOnClickListener(new yg1.a(this, i18));
            this.f42869h[i18].setRotation(-i19);
            this.f42871j[i18].addView(this.f42869h[i18]);
            this.f42877p[i18] = false;
            this.f42863b.addView(this.f42871j[i18]);
        }
        ca();
        Display defaultDisplay = getWindowManager().getDefaultDisplay();
        Point point = new Point();
        this.f42883x = point;
        if (defaultDisplay != null) {
            defaultDisplay.getSize(point);
        }
        ea(0);
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.controls_menu_overflow, menu);
        return true;
    }

    @Override // com.garmin.android.apps.connectmobile.z1, android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == R.id.menu_item_clear) {
            Iterator<g> it = this.f42866e.f196917c.iterator();
            while (it.hasNext()) {
                g next = it.next();
                if (!next.f196921c.booleanValue()) {
                    next.f196920b = 255;
                    this.f42866e.f196918d.add(next);
                    it.remove();
                }
            }
            Collections.sort(this.f42866e.f196918d, new yg1.c(this));
            if (this.f42866e.f196917c.size() > 1) {
                Collections.sort(this.f42866e.f196917c, new d(this));
            }
            Iterator<g> it3 = this.f42866e.f196917c.iterator();
            int i14 = 0;
            while (it3.hasNext()) {
                it3.next().f196920b = i14;
                i14++;
            }
            ga();
            ca();
            this.f42867f.notifyDataSetChanged();
            ha();
        } else if (itemId == R.id.menu_item_reset_defaults && i.a(this)) {
            showProgressOverlay();
            yg1.i iVarM = yg1.i.M();
            long j8 = this.f42881v;
            yg1.b bVar = new yg1.b(this);
            iVarM.getClass();
            d80.f.b bVar2 = new d80.f.b(new Object[]{String.valueOf(j8)}, lj0.f.f112989o);
            bVar2.f58273c = yg1.j.class;
            bVar2.f58274d = bVar;
            bVar2.f58275e = d80.g.JSON_OBJECT;
            d80.f fVarA = bVar2.a();
            fVarA.b();
            this.f42882w = fVarA;
            hideProgressOverlay();
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // com.garmin.android.apps.connectmobile.c, i.c, androidx.fragment.app.m, android.app.Activity
    public final void onStop() {
        super.onStop();
        d80.f fVar = this.f42882w;
        if (fVar != null) {
            fVar.a();
        }
    }
}
