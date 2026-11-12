package com.garmin.android.apps.connectmobile.courses.filter;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.MenuItem;
import b.s;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.d;
import ik1.c;
import k30.n;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p3.c2;
import p3.p0;
import z3.e;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/courses/filter/CourseSortFilterActivity;", "Lcom/garmin/android/apps/connectmobile/d;", "<init>", "()V", "a", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class CourseSortFilterActivity extends d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f32768c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public c2 f32769a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f32770b = new b();

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/courses/filter/CourseSortFilterActivity$b", "Lb/s;", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b extends s {
        public b() {
            super(true);
        }

        @Override // b.s
        public final void b() {
            a aVar = CourseSortFilterActivity.f32768c;
            CourseSortFilterActivity courseSortFilterActivity = CourseSortFilterActivity.this;
            courseSortFilterActivity.da();
            courseSortFilterActivity.finish();
        }
    }

    public final void da() {
        Intent intent = new Intent();
        c2 c2Var = this.f32769a;
        if (c2Var == null) {
            p005kotlin.jvm.internal.s.m("courseSortFilter");
            throw null;
        }
        intent.putExtra("extra_sort_filter", (Parcelable) c2Var.getF182175a());
        setResult(-1, intent);
    }

    @Override // com.garmin.android.apps.connectmobile.z1, b.g, android.app.Activity
    public final void onBackPressed() {
        da();
        super.onBackPressed();
    }

    @Override // com.garmin.android.apps.connectmobile.d, com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Bundle extras;
        Parcelable parcelable;
        super.onCreate(bundle);
        Intent intent = getIntent();
        Parcelable parcelable2 = null;
        if (intent != null && (extras = intent.getExtras()) != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable = (Parcelable) extras.getParcelable("extra_sort_filter", n.class);
            } else {
                Parcelable parcelable3 = extras.getParcelable("extra_sort_filter");
                parcelable = (n) (parcelable3 instanceof n ? parcelable3 : null);
            }
            parcelable2 = (n) parcelable;
        }
        if (parcelable2 == null) {
            finish();
            return;
        }
        getOnBackPressedDispatcher().b(this.f32770b, this);
        this.f32769a = p0.n(parcelable2);
        initComposeScreen(new e(-1090844486, true, new c(this, 9)));
    }

    @Override // com.garmin.android.apps.connectmobile.z1, android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        menuItem.getClass();
        if (menuItem.getItemId() != R.id.home) {
            return super.onOptionsItemSelected(menuItem);
        }
        da();
        finish();
        return true;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/courses/filter/CourseSortFilterActivity$a;", "", "<init>", "()V", "", "EXTRA_SORT_FILTER", "Ljava/lang/String;", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
