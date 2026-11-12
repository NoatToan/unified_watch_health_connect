package com.garmin.android.apps.connectmobile.settings.usersettings.heartratezones.ui;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.v;
import androidx.viewpager.widget.ViewPager;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.view.view_3_0.GCMSlidingTabLayout;
import com.google.firebase.perf.util.Constants;
import hb2.i;
import java.util.ArrayList;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import vk1.e;
import vk1.f;
import xg1.l;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/usersettings/heartratezones/ui/HRZonesConfigActivity;", "Lcom/garmin/android/apps/connectmobile/settings/usersettings/heartratezones/ui/a;", "<init>", "()V", "b", "a", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class HRZonesConfigActivity extends com.garmin.android.apps.connectmobile.settings.usersettings.heartratezones.ui.a {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final a f44028j = new a(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public b f44029i;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0084\u0004\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/usersettings/heartratezones/ui/HRZonesConfigActivity$b;", "Lh32/b;", "Landroidx/fragment/app/v;", "fm", "<init>", "(Lcom/garmin/android/apps/connectmobile/settings/usersettings/heartratezones/ui/HRZonesConfigActivity;Landroidx/fragment/app/v;)V", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class b extends h32.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f44030a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f44031b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f44032c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f44033d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f44034e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final SparseArray<com.garmin.android.apps.connectmobile.settings.usersettings.heartratezones.ui.b> f44035f;

        /* JADX WARN: Code duplicated, block: B:11:0x0021  */
        /* JADX WARN: Code duplicated, block: B:20:0x0037  */
        /* JADX WARN: Code duplicated, block: B:29:0x004d  */
        /* JADX WARN: Code duplicated, block: B:37:0x0061  */
        public b(v vVar) {
            super(vVar);
            this.f44030a = -1;
            this.f44031b = -1;
            this.f44032c = -1;
            this.f44033d = -1;
            vk1.b bVar = HRZonesConfigActivity.this.f44089a;
            if (bVar == null || !bVar.f178584d) {
                if ((bVar != null ? bVar.f178585e : null) != null) {
                    int i14 = this.f44034e;
                    this.f44033d = i14;
                    this.f44034e = i14 + 1;
                }
            } else {
                int i15 = this.f44034e;
                this.f44033d = i15;
                this.f44034e = i15 + 1;
            }
            if (bVar == null || !bVar.f178581a) {
                if ((bVar != null ? bVar.f178586f : null) != null) {
                    int i16 = this.f44034e;
                    this.f44030a = i16;
                    this.f44034e = i16 + 1;
                }
            } else {
                int i17 = this.f44034e;
                this.f44030a = i17;
                this.f44034e = i17 + 1;
            }
            if (bVar == null || !bVar.f178582b) {
                if ((bVar != null ? bVar.f178587g : null) != null) {
                    int i18 = this.f44034e;
                    this.f44031b = i18;
                    this.f44034e = i18 + 1;
                }
            } else {
                int i19 = this.f44034e;
                this.f44031b = i19;
                this.f44034e = i19 + 1;
            }
            if (bVar == null || !bVar.f178583c) {
                if ((bVar != null ? bVar.f178588h : null) != null) {
                    int i24 = this.f44034e;
                    this.f44032c = i24;
                    this.f44034e = i24 + 1;
                }
            } else {
                int i25 = this.f44034e;
                this.f44032c = i25;
                this.f44034e = i25 + 1;
            }
            this.f44035f = new SparseArray<>(this.f44034e);
        }

        @Override // h32.b
        public final String a(int i14) {
            HRZonesConfigActivity hRZonesConfigActivity = HRZonesConfigActivity.this;
            if (i14 == 0) {
                return hRZonesConfigActivity.getString(R.string.heart_rate_zones);
            }
            if (i14 == 1) {
                return hRZonesConfigActivity.getString(R.string.hr_zones_lbl_zones_running);
            }
            if (i14 == 2) {
                return hRZonesConfigActivity.getString(R.string.hr_zones_lbl_zones_cycling);
            }
            if (i14 != 3) {
                return null;
            }
            return hRZonesConfigActivity.getString(R.string.hr_zones_lbl_zones_swimming);
        }

        @Override // h32.b
        public final Drawable b(int i14) {
            f fVarC = c(i14);
            if (fVarC == null) {
                return null;
            }
            try {
                e eVarD = vk1.c.d(fVarC);
                if (eVarD != null) {
                    return a7.b.getDrawable(HRZonesConfigActivity.this, eVarD.f178610f);
                }
                return null;
            } catch (IllegalArgumentException unused) {
                i2.a aVar = i2.f36769a;
                a2 a2Var = a2.SETTINGS;
                String str = "getPageIcon: SportEnum name [" + fVarC.f178612b + "] is not defined.";
                aVar.getClass();
                i2.a.f(a2Var, "HRZonesConfigActivity", str);
                return null;
            }
        }

        public final f c(int i14) {
            vk1.b bVar;
            int i15 = this.f44033d;
            HRZonesConfigActivity hRZonesConfigActivity = HRZonesConfigActivity.this;
            if (i14 == i15) {
                vk1.b bVar2 = hRZonesConfigActivity.f44089a;
                if (bVar2 != null) {
                    return bVar2.f178585e;
                }
                return null;
            }
            if (i14 == this.f44030a) {
                vk1.b bVar3 = hRZonesConfigActivity.f44089a;
                if (bVar3 != null) {
                    return bVar3.f178586f;
                }
                return null;
            }
            if (i14 == this.f44031b) {
                vk1.b bVar4 = hRZonesConfigActivity.f44089a;
                if (bVar4 != null) {
                    return bVar4.f178587g;
                }
                return null;
            }
            if (i14 != this.f44032c || (bVar = hRZonesConfigActivity.f44089a) == null) {
                return null;
            }
            return bVar.f178588h;
        }

        @Override // androidx.fragment.app.a0, fe.a
        public final void destroyItem(ViewGroup viewGroup, int i14, Object obj) {
            viewGroup.getClass();
            obj.getClass();
            super.destroyItem(viewGroup, i14, obj);
            this.f44035f.remove(i14);
        }

        @Override // fe.a
        /* JADX INFO: renamed from: getCount, reason: from getter */
        public final int getF44052d() {
            return this.f44034e;
        }

        @Override // androidx.fragment.app.a0
        public final Fragment getItem(int i14) {
            vk1.b bVar;
            vk1.b bVar2;
            vk1.b bVar3;
            vk1.b bVar4;
            com.garmin.android.apps.connectmobile.settings.usersettings.heartratezones.ui.b bVar5 = this.f44035f.get(i14);
            if (bVar5 != null) {
                return bVar5;
            }
            com.garmin.android.apps.connectmobile.settings.usersettings.heartratezones.ui.b.a aVar = com.garmin.android.apps.connectmobile.settings.usersettings.heartratezones.ui.b.J0;
            f fVarC = c(i14);
            int i15 = this.f44033d;
            boolean z14 = false;
            HRZonesConfigActivity hRZonesConfigActivity = HRZonesConfigActivity.this;
            if (i14 != i15 ? i14 != this.f44030a ? i14 != this.f44031b ? i14 != this.f44032c || ((bVar = hRZonesConfigActivity.f44089a) != null && bVar.f178583c && bVar.f178591k) : (bVar2 = hRZonesConfigActivity.f44089a) != null && bVar2.f178582b && bVar2.f178590j : (bVar3 = hRZonesConfigActivity.f44089a) != null && bVar3.f178581a && bVar3.f178589i : (bVar4 = hRZonesConfigActivity.f44089a) != null && bVar4.f178584d && bVar4.f178592l) {
                z14 = true;
            }
            String str = hRZonesConfigActivity.f44093e;
            aVar.getClass();
            Bundle bundle = new Bundle(1);
            bundle.putParcelable("dto", fVarC);
            bundle.putString("GCM_deviceProductNbr", str);
            bundle.putBoolean(Constants.ENABLE_DISABLE, z14);
            com.garmin.android.apps.connectmobile.settings.usersettings.heartratezones.ui.b bVar6 = new com.garmin.android.apps.connectmobile.settings.usersettings.heartratezones.ui.b();
            bVar6.setArguments(bundle);
            return bVar6;
        }

        @Override // androidx.fragment.app.a0, fe.a
        public final Object instantiateItem(ViewGroup viewGroup, int i14) {
            viewGroup.getClass();
            Object objInstantiateItem = super.instantiateItem(viewGroup, i14);
            objInstantiateItem.getClass();
            Fragment fragment = (Fragment) objInstantiateItem;
            this.f44035f.put(i14, (com.garmin.android.apps.connectmobile.settings.usersettings.heartratezones.ui.b) fragment);
            return fragment;
        }
    }

    @Override // com.garmin.android.apps.connectmobile.settings.usersettings.heartratezones.ui.a
    public final void ca() {
        int i14;
        int i15;
        this.f44029i = new b(getSupportFragmentManager());
        ViewPager viewPager = (ViewPager) findViewById(R.id.heartratezones_view_pager);
        b bVar = this.f44029i;
        bVar.getClass();
        if (bVar.f44034e >= 1) {
            b bVar2 = this.f44029i;
            bVar2.getClass();
            i14 = bVar2.f44034e - 1;
        } else {
            i14 = 0;
        }
        viewPager.setOffscreenPageLimit(i14);
        viewPager.setAdapter(this.f44029i);
        GCMSlidingTabLayout gCMSlidingTabLayout = (GCMSlidingTabLayout) findViewById(R.id.heartratezones_sliding_tabs);
        gCMSlidingTabLayout.setViewPager(viewPager);
        b bVar3 = this.f44029i;
        bVar3.getClass();
        if (bVar3.f44034e < 1) {
            gCMSlidingTabLayout.setVisibility(8);
        }
        int intExtra = getIntent().getIntExtra("EXTRA_SELECTED_TAB_INDEX", 0);
        b bVar4 = this.f44029i;
        Integer num = null;
        if (bVar4 != null) {
            if (intExtra == 1) {
                i15 = bVar4.f44030a;
            } else if (intExtra != 2) {
                i15 = intExtra != 3 ? -1 : bVar4.f44032c;
            } else {
                i15 = bVar4.f44031b;
            }
            Integer numValueOf = Integer.valueOf(i15);
            if (i15 != -1) {
                num = numValueOf;
            }
        }
        if (num != null) {
            viewPager.setCurrentItem(intExtra);
        }
    }

    @Override // com.garmin.android.apps.connectmobile.settings.usersettings.heartratezones.ui.a, com.garmin.android.apps.connectmobile.z1, b.g, android.app.Activity
    public final void onBackPressed() {
        b bVar;
        if (!i.a(this) || (bVar = this.f44029i) == null) {
            finish();
            return;
        }
        SparseArray<com.garmin.android.apps.connectmobile.settings.usersettings.heartratezones.ui.b> sparseArray = bVar.f44035f;
        int size = sparseArray.size();
        boolean z14 = true;
        for (int i14 = 0; i14 < size; i14++) {
            com.garmin.android.apps.connectmobile.settings.usersettings.heartratezones.ui.b bVar2 = sparseArray.get(i14);
            bVar2.getClass();
            com.garmin.android.apps.connectmobile.settings.usersettings.heartratezones.ui.b bVar3 = bVar2;
            ArrayList<EditText> arrayList = bVar3.f44119w;
            if (arrayList != null) {
                for (EditText editText : arrayList) {
                    if (editText != null) {
                        editText.clearFocus();
                    }
                }
            }
            z14 = z14 && bVar3.f44101d;
        }
        if (z14) {
            da();
        } else {
            new androidx.appcompat.app.e.a(this).setTitle(R.string.lbl_error_title_invalid_zone_data).setMessage(R.string.lbl_error_message_invalid_zone_data).setPositiveButton(R.string.lbl_ok, new l(this, 2)).create().show();
        }
    }

    @Override // com.garmin.android.apps.connectmobile.settings.usersettings.heartratezones.ui.a, com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ((a31.e) KoinJavaComponent.get$default(a31.e.class, null, null, 6, null)).b(e31.a.HEART_RATE_ZONES_CONFIGURED);
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\nR\u0014\u0010\f\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\nR\u0014\u0010\r\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\n¨\u0006\u000e"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/usersettings/heartratezones/ui/HRZonesConfigActivity$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "EXTRA_TAB_INDEX", "", "DEFAULT_TAB", "I", "RUNNING_TAB", "CYCLING_TAB", "SWIMMING_TAB", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        public static void a(Context context, long j8, String str, int i14) {
            context.getClass();
            str.getClass();
            Intent intent = new Intent(context, (Class<?>) HRZonesConfigActivity.class);
            intent.putExtra("GCM_deviceUnitID", j8);
            intent.putExtra("GCM_deviceProductNbr", str);
            intent.putExtra("EXTRA_SELECTED_TAB_INDEX", i14);
            context.startActivity(intent);
        }

        private a() {
        }
    }
}
