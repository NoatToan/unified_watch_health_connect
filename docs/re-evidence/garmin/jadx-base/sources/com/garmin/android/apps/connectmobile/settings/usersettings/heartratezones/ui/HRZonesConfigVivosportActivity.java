package com.garmin.android.apps.connectmobile.settings.usersettings.heartratezones.ui;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.v;
import androidx.viewpager.widget.ViewPager;
import b7.g;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.view.view_3_0.GCMSlidingTabLayout;
import hb2.i;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import vk1.e;
import vk1.f;
import xg1.l;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/usersettings/heartratezones/ui/HRZonesConfigVivosportActivity;", "Lcom/garmin/android/apps/connectmobile/settings/usersettings/heartratezones/ui/a;", "<init>", "()V", "b", "a", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class HRZonesConfigVivosportActivity extends com.garmin.android.apps.connectmobile.settings.usersettings.heartratezones.ui.a {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f44047j = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public b f44048i;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0084\u0004\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/usersettings/heartratezones/ui/HRZonesConfigVivosportActivity$b;", "Lh32/b;", "Landroidx/fragment/app/v;", "fm", "<init>", "(Lcom/garmin/android/apps/connectmobile/settings/usersettings/heartratezones/ui/HRZonesConfigVivosportActivity;Landroidx/fragment/app/v;)V", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class b extends h32.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f44049a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f44050b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f44051c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f44052d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final SparseArray<d> f44053e;

        public b(v vVar) {
            super(vVar);
            this.f44051c = -1;
            this.f44052d = 1;
            vk1.b bVar = HRZonesConfigVivosportActivity.this.f44089a;
            if (bVar != null && bVar.f178581a) {
                this.f44049a = 1;
                this.f44052d = 2;
            }
            if (bVar != null && bVar.f178582b) {
                int i14 = this.f44052d;
                this.f44050b = i14;
                this.f44052d = i14 + 1;
            }
            if (bVar != null && bVar.f178583c) {
                int i15 = this.f44052d;
                this.f44051c = i15;
                this.f44052d = i15 + 1;
            }
            this.f44053e = new SparseArray<>(this.f44052d);
        }

        @Override // h32.b
        public final Drawable b(int i14) {
            f fVarC = c(i14);
            if (fVarC != null) {
                try {
                    e eVarD = vk1.c.d(fVarC);
                    if (eVarD != null) {
                        Resources resources = HRZonesConfigVivosportActivity.this.getResources();
                        int i15 = eVarD.f178610f;
                        ThreadLocal<TypedValue> threadLocal = g.f16255a;
                        return resources.getDrawable(i15, null);
                    }
                } catch (IllegalArgumentException unused) {
                    i2.a aVar = i2.f36769a;
                    a2 a2Var = a2.SETTINGS;
                    String str = "getPageIcon: SportEnum name [" + fVarC.f178612b + "] is not defined.";
                    aVar.getClass();
                    i2.a.f(a2Var, "HRZonesConfigVivosportActivity", str);
                }
            }
            return null;
        }

        public final f c(int i14) {
            vk1.b bVar;
            HRZonesConfigVivosportActivity hRZonesConfigVivosportActivity = HRZonesConfigVivosportActivity.this;
            if (i14 == 0) {
                vk1.b bVar2 = hRZonesConfigVivosportActivity.f44089a;
                if (bVar2 != null) {
                    return bVar2.f178585e;
                }
                return null;
            }
            if (i14 == this.f44049a) {
                vk1.b bVar3 = hRZonesConfigVivosportActivity.f44089a;
                if (bVar3 != null) {
                    return bVar3.f178586f;
                }
                return null;
            }
            if (i14 == this.f44050b) {
                vk1.b bVar4 = hRZonesConfigVivosportActivity.f44089a;
                if (bVar4 != null) {
                    return bVar4.f178587g;
                }
                return null;
            }
            if (i14 != this.f44051c || (bVar = hRZonesConfigVivosportActivity.f44089a) == null) {
                return null;
            }
            return bVar.f178588h;
        }

        @Override // androidx.fragment.app.a0, fe.a
        public final void destroyItem(ViewGroup viewGroup, int i14, Object obj) {
            viewGroup.getClass();
            obj.getClass();
            super.destroyItem(viewGroup, i14, obj);
            SparseArray<d> sparseArray = this.f44053e;
            sparseArray.getClass();
            sparseArray.remove(i14);
        }

        @Override // fe.a
        /* JADX INFO: renamed from: getCount, reason: from getter */
        public final int getF44034e() {
            return this.f44052d;
        }

        @Override // androidx.fragment.app.a0
        public final Fragment getItem(int i14) {
            SparseArray<d> sparseArray = this.f44053e;
            sparseArray.getClass();
            d dVar = sparseArray.get(i14);
            if (dVar != null) {
                return dVar;
            }
            d.a aVar = d.N0;
            f fVarC = c(i14);
            fVarC.getClass();
            aVar.getClass();
            HRZonesConfigVivosportActivity hRZonesConfigVivosportActivity = HRZonesConfigVivosportActivity.this;
            hRZonesConfigVivosportActivity.getClass();
            Bundle bundle = new Bundle(1);
            bundle.putParcelable("dto", fVarC);
            Fragment fragmentInstantiate = Fragment.instantiate(hRZonesConfigVivosportActivity, d.class.getName(), bundle);
            fragmentInstantiate.getClass();
            return fragmentInstantiate;
        }

        @Override // androidx.fragment.app.a0, fe.a
        public final Object instantiateItem(ViewGroup viewGroup, int i14) {
            viewGroup.getClass();
            Object objInstantiateItem = super.instantiateItem(viewGroup, i14);
            objInstantiateItem.getClass();
            Fragment fragment = (Fragment) objInstantiateItem;
            SparseArray<d> sparseArray = this.f44053e;
            if (sparseArray != null) {
                sparseArray.put(i14, (d) fragment);
            }
            return fragment;
        }
    }

    static {
        new a(null);
    }

    @Override // com.garmin.android.apps.connectmobile.settings.usersettings.heartratezones.ui.a
    public final void ca() {
        int i14;
        this.f44048i = new b(getSupportFragmentManager());
        View viewFindViewById = findViewById(R.id.heartratezones_view_pager);
        viewFindViewById.getClass();
        ViewPager viewPager = (ViewPager) viewFindViewById;
        b bVar = this.f44048i;
        bVar.getClass();
        if (bVar.f44052d >= 1) {
            b bVar2 = this.f44048i;
            bVar2.getClass();
            i14 = bVar2.f44052d - 1;
        } else {
            i14 = 0;
        }
        viewPager.setOffscreenPageLimit(i14);
        viewPager.setAdapter(this.f44048i);
        View viewFindViewById2 = findViewById(R.id.heartratezones_sliding_tabs);
        viewFindViewById2.getClass();
        ((GCMSlidingTabLayout) viewFindViewById2).setViewPager(viewPager);
    }

    @Override // com.garmin.android.apps.connectmobile.settings.usersettings.heartratezones.ui.a, com.garmin.android.apps.connectmobile.z1, b.g, android.app.Activity
    public final void onBackPressed() {
        b bVar;
        if (!i.a(this) || (bVar = this.f44048i) == null) {
            finish();
            return;
        }
        SparseArray<d> sparseArray = bVar.f44053e;
        sparseArray.getClass();
        int size = sparseArray.size();
        boolean z14 = true;
        for (int i14 = 0; i14 < size; i14++) {
            d dVar = sparseArray.get(i14);
            dVar.getClass();
            d dVar2 = dVar;
            EditText editText = dVar2.f44172k;
            if (editText != null) {
                editText.clearFocus();
            }
            EditText editText2 = dVar2.f44174l;
            if (editText2 != null) {
                editText2.clearFocus();
            }
            EditText editText3 = dVar2.f44175m;
            if (editText3 != null) {
                editText3.clearFocus();
            }
            EditText editText4 = dVar2.f44176n;
            if (editText4 != null) {
                editText4.clearFocus();
            }
            EditText editText5 = dVar2.f44177o;
            if (editText5 != null) {
                editText5.clearFocus();
            }
            EditText editText6 = dVar2.f44178p;
            if (editText6 != null) {
                editText6.clearFocus();
            }
            EditText editText7 = dVar2.f44179q;
            if (editText7 != null) {
                editText7.clearFocus();
            }
            EditText editText8 = dVar2.f44180r;
            if (editText8 != null) {
                editText8.clearFocus();
            }
            EditText editText9 = dVar2.f44181t;
            if (editText9 != null) {
                editText9.clearFocus();
            }
            EditText editText10 = dVar2.f44182v;
            if (editText10 != null) {
                editText10.clearFocus();
            }
            EditText editText11 = dVar2.f44183w;
            if (editText11 != null) {
                editText11.clearFocus();
            }
            EditText editText12 = dVar2.f44184x;
            if (editText12 != null) {
                editText12.clearFocus();
            }
            EditText editText13 = dVar2.f44185y;
            if (editText13 != null) {
                editText13.clearFocus();
            }
            EditText editText14 = dVar2.f44186z;
            if (editText14 != null) {
                editText14.clearFocus();
            }
            z14 = z14 && dVar2.f44164c;
        }
        if (z14) {
            da();
        } else {
            new androidx.appcompat.app.e.a(this).setTitle(R.string.lbl_error_title_invalid_zone_data).setMessage(R.string.lbl_error_message_invalid_zone_data).setPositiveButton(R.string.lbl_ok, new l(this, 4)).create().show();
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/usersettings/heartratezones/ui/HRZonesConfigVivosportActivity$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
