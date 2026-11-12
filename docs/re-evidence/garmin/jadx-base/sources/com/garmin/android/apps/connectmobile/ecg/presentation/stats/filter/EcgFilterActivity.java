package com.garmin.android.apps.connectmobile.ecg.presentation.stats.filter;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;
import com.garmin.android.apps.connectmobile.R;
import d10.g;
import gf0.f;
import gf0.h;
import java.util.List;
import lc.m0;
import nf0.c;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/ecg/presentation/stats/filter/EcgFilterActivity;", "Ld10/g;", "Lrf0/a;", "<init>", "()V", "a", "gcm-electrocardiogram_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class EcgFilterActivity extends g<rf0.a> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f34906c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public rf0.a f34907a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public rf0.a f34908b;

    @Override // d10.c
    public final void N3() {
        this.f34908b = new rf0.a(null, null, null, null, 15, null);
    }

    @Override // d10.b
    public final Object O() {
        rf0.a aVar = this.f34908b;
        if (aVar != null) {
            return aVar;
        }
        s.m("filterData");
        throw null;
    }

    @Override // d10.c
    public final void d2() {
        rf0.a aVar = this.f34908b;
        if (aVar == null) {
            s.m("filterData");
            throw null;
        }
        if (!s.g(aVar, this.f34907a)) {
            Intent intent = new Intent();
            rf0.a aVar2 = this.f34908b;
            if (aVar2 == null) {
                s.m("filterData");
                throw null;
            }
            intent.putExtra("EXTRA_FILTER_DATA", aVar2);
            setResult(-1, intent);
        }
        finish();
    }

    @Override // d10.c
    public final boolean g8() {
        rf0.a aVar = this.f34908b;
        if (aVar != null) {
            return og.a.Q(aVar);
        }
        s.m("filterData");
        throw null;
    }

    @Override // d10.g, com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        rf0.a aVar;
        Parcelable parcelable;
        super.onCreate(bundle);
        Bundle extras = getIntent().getExtras();
        rf0.a aVar2 = null;
        if (extras != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable = (Parcelable) extras.getParcelable("EXTRA_FILTER_DATA", rf0.a.class);
            } else {
                Parcelable parcelable2 = extras.getParcelable("EXTRA_FILTER_DATA");
                parcelable = (rf0.a) (parcelable2 instanceof rf0.a ? parcelable2 : null);
            }
            aVar2 = (rf0.a) parcelable;
        }
        this.f34907a = aVar2;
        if (aVar2 != null) {
            List<? extends f> list = aVar2.f152388a;
            List<? extends h> list2 = aVar2.f152389b;
            LocalDate localDate = aVar2.f152390c;
            LocalDate localDate2 = aVar2.f152391d;
            list.getClass();
            list2.getClass();
            aVar = new rf0.a(list, list2, localDate, localDate2);
        } else {
            aVar = new rf0.a(null, null, null, null, 15, null);
        }
        this.f34908b = aVar;
        Fragment fragmentF = getSupportFragmentManager().F(R.id.nav_host_fragment);
        fragmentF.getClass();
        m0 m0VarU6 = ((NavHostFragment) fragmentF).u6();
        m0VarU6.a(new c(1, m0VarU6, this));
    }

    @Override // com.garmin.android.apps.connectmobile.z1, android.app.Activity
    public final boolean onNavigateUp() {
        onBackPressed();
        return true;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/ecg/presentation/stats/filter/EcgFilterActivity$a;", "", "<init>", "()V", "", "EXTRA_FILTER_DATA", "Ljava/lang/String;", "gcm-electrocardiogram_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
