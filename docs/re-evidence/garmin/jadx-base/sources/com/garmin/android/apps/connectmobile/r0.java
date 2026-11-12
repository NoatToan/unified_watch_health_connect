package com.garmin.android.apps.connectmobile;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import com.garmin.android.apps.connectmobile.dashboard.presentation.DashboardActivity;
import com.garmin.android.apps.connectmobile.logging.presentation.LifestyleLoggingActivity;
import com.garmin.android.apps.connectmobile.view.BottomNavigationLayout;
import java.io.Serializable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.WeakHashMap;
import org.apache.commons.lang3.ArrayUtils;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/r0;", "Lcom/garmin/android/apps/connectmobile/c;", "<init>", "()V", "a", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class r0 extends c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f41071d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public BottomNavigationLayout f41072a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String[] f41073b = new String[0];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public HashMap<String, Boolean> f41074c = new HashMap<>();

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/r0$b", "", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b {
        public b() {
        }
    }

    static {
        new a(null);
    }

    public static String[] ka() {
        bv.b.f21239a.getClass();
        bv.b.a();
        String str = z10.d1.r() ? "MY_DEVICE" : "HOME";
        f12.l.f68084a.getClass();
        String[] strArrT1 = f12.l.a.a().t1();
        String[] strArr = (String[]) ArrayUtils.add((String[]) ArrayUtils.addAll(new String[]{str}, Arrays.copyOf(strArrT1, strArrT1.length)), "MORE");
        strArr.getClass();
        return strArr;
    }

    @Override // com.garmin.android.apps.connectmobile.z1
    public final void applyBottomContentInsets() {
    }

    public final void ca(String str) {
        str.getClass();
        String[] strArrKa = ka();
        this.f41073b = strArrKa;
        boolean zContains = ArrayUtils.contains(strArrKa, str);
        BottomNavigationLayout bottomNavigationLayout = this.f41072a;
        if (!zContains) {
            if (bottomNavigationLayout != null) {
                bottomNavigationLayout.setVisibility(8);
                return;
            }
            return;
        }
        if (bottomNavigationLayout != null) {
            bottomNavigationLayout.setVisibility(0);
        }
        String[] strArr = this.f41073b;
        b bVar = new b();
        BottomNavigationLayout bottomNavigationLayout2 = this.f41072a;
        if (bottomNavigationLayout2 != null) {
            strArr.getClass();
            bottomNavigationLayout2.mSelectedItem = str;
            bottomNavigationLayout2.f47391a = bVar;
            bottomNavigationLayout2.removeAllViews();
            int length = strArr.length;
            for (int i14 = 0; i14 < length && i14 != 5; i14++) {
                String str2 = strArr[i14];
                View viewInflate = LayoutInflater.from(bottomNavigationLayout2.getContext()).inflate(R.layout.gcmx_bottom_navigation_item, (ViewGroup) bottomNavigationLayout2, false);
                viewInflate.setTag(str2);
                bottomNavigationLayout2.a(viewInflate, str2);
                viewInflate.setOnClickListener(bottomNavigationLayout2.f47393c);
                bottomNavigationLayout2.addView(viewInflate);
            }
            bv.b.f21239a.getClass();
            bv.b.a();
            for (String str3 : strArr) {
                if ("NEWS_FEED".equals(str3)) {
                    ((iz0.a) KoinJavaComponent.get$default(iz0.a.class, null, null, 6, null)).q(this, str.equals("NEWS_FEED"), new cn1.d(3, (Object) this, (Object) str3));
                }
            }
        }
    }

    public void da() {
        if (ha()) {
            BottomNavigationLayout bottomNavigationLayout = this.f41072a;
            if (bottomNavigationLayout != null) {
                com.airbnb.lottie.animation.keyframe.a aVar = new com.airbnb.lottie.animation.keyframe.a(12);
                WeakHashMap<View, androidx.core.view.g1> weakHashMap = androidx.core.view.s0.f6563a;
                androidx.core.view.s0.d.c(bottomNavigationLayout, aVar);
                return;
            }
            return;
        }
        View viewFindViewById = findViewById(R.id.content_frame);
        if (viewFindViewById == null) {
            return;
        }
        com.airbnb.lottie.animation.keyframe.a aVar2 = new com.airbnb.lottie.animation.keyframe.a(11);
        WeakHashMap<View, androidx.core.view.g1> weakHashMap2 = androidx.core.view.s0.f6563a;
        androidx.core.view.s0.d.c(viewFindViewById, aVar2);
    }

    public final void ea(boolean z14) {
        BottomNavigationLayout bottomNavigationLayout = this.f41072a;
        if (z14) {
            if (bottomNavigationLayout != null) {
                bottomNavigationLayout.setVisibility(0);
            }
        } else if (bottomNavigationLayout != null) {
            bottomNavigationLayout.setVisibility(8);
        }
    }

    public abstract String fa();

    public boolean ga() {
        return false;
    }

    public final boolean ha() {
        String strFa = fa();
        return strFa != null && ArrayUtils.contains(this.f41073b, strFa);
    }

    public void ia(String str) {
    }

    public final void ja(String str) {
        this.f41073b = ka();
        BottomNavigationLayout bottomNavigationLayout = this.f41072a;
        boolean z14 = false;
        if (bottomNavigationLayout != null && bottomNavigationLayout.getVisibility() == 0) {
            z14 = true;
        }
        ca(str);
        ea(z14);
    }

    public boolean la() {
        return this instanceof LifestyleLoggingActivity;
    }

    @Override // com.garmin.android.apps.connectmobile.z1
    public void modifyBottomInsets(k2 k2Var, ViewGroup viewGroup) {
        if (ha()) {
            return;
        }
        applyBottomInsets(k2Var, viewGroup);
    }

    @Override // com.garmin.android.apps.connectmobile.z1, androidx.fragment.app.m, b.g, android.app.Activity
    public void onActivityResult(int i14, int i15, Intent intent) {
        Bundle extras;
        super.onActivityResult(i14, i15, intent);
        if (i14 == 59465 && i15 == -1) {
            String string = "MORE";
            if (intent != null && (extras = intent.getExtras()) != null) {
                string = extras.getString("EXTRA_FROM_NAVIGATION_ITEM", "MORE");
                string.getClass();
            }
            this.f41073b = ka();
            ca(string);
        }
    }

    @Override // com.garmin.android.apps.connectmobile.z1, b.g, android.app.Activity
    public void onBackPressed() {
        if (ga()) {
            return;
        }
        bv.b.f21239a.getClass();
        bv.c cVarA = bv.b.a();
        if ((this instanceof DashboardActivity) || !ha()) {
            super.onBackPressed();
            return;
        }
        boolean zIsTaskRoot = isTaskRoot();
        ((kd0.m) cVarA).a(this, null, 603979776);
        if (zIsTaskRoot) {
            finish();
        }
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public void onCreate(Bundle bundle) {
        Serializable serializable;
        super.onCreate(bundle);
        this.f41073b = ka();
        Bundle extras = getIntent().getExtras();
        HashMap<String, Boolean> map = null;
        if (extras != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                serializable = extras.getSerializable("GCM_extra_navigation_item_unread_bubbles", HashMap.class);
            } else {
                Serializable serializable2 = extras.getSerializable("GCM_extra_navigation_item_unread_bubbles");
                serializable = (HashMap) (serializable2 instanceof HashMap ? serializable2 : null);
            }
            map = (HashMap) serializable;
        }
        if (map != null) {
            this.f41074c = map;
        }
    }

    @Override // com.garmin.android.apps.connectmobile.z1, i.c, android.app.Activity
    public final void onPostCreate(Bundle bundle) {
        BottomNavigationLayout bottomNavigationLayout;
        super.onPostCreate(bundle);
        if (ha()) {
            updateActionBarNavigation(1);
        }
        if (this.f41072a != null) {
            for (String str : this.f41074c.keySet()) {
                str.getClass();
                String str2 = str;
                Boolean bool = this.f41074c.get(str2);
                if (bool != null && (bottomNavigationLayout = this.f41072a) != null) {
                    bottomNavigationLayout.b(str2, bool.booleanValue());
                }
            }
        }
        da();
    }

    @Override // com.garmin.android.apps.connectmobile.z1, i.c, b.g, android.app.Activity
    public final void setContentView(int i14) {
        int i15;
        View viewFindViewById;
        super.setContentView(i14);
        if (la() && (i15 = Build.VERSION.SDK_INT) < 30 && (viewFindViewById = findViewById(R.id.content_frame_root)) != null) {
            WindowInsets windowInsets = androidx.core.view.w0.f6584a;
            if (i15 < 30) {
                androidx.core.view.v0 v0Var = new androidx.core.view.v0();
                viewFindViewById.setTag(R.id.tag_compat_insets_dispatch, v0Var);
                viewFindViewById.setOnApplyWindowInsetsListener(v0Var);
                androidx.core.view.w0.f6585b = true;
            }
        }
        this.f41072a = (BottomNavigationLayout) findViewById(R.id.bottom_navigation_bar);
    }

    @Override // com.garmin.android.apps.connectmobile.z1
    public boolean shouldConsumeInsets() {
        return false;
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/garmin/android/apps/connectmobile/r0$a;", "", "<init>", "()V", "", "EDIT_BOTTOM_NAV_REQUEST_CODE", "I", "", "EXTRA_FROM_NAVIGATION_ITEM", "Ljava/lang/String;", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
