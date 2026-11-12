package com.garmin.android.apps.connectmobile.courses.details;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.c;
import com.garmin.android.apps.connectmobile.courses.presentation.list.CoursesActivity;
import com.garmin.android.apps.connectmobile.dashboard.presentation.DashboardActivity;
import com.garmin.android.apps.connectmobile.navigation.b;
import java.util.ArrayList;
import z6.h0;

/* JADX INFO: loaded from: classes8.dex */
public class PrivateCourseActivity extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f32767a = 0;

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_private_course);
        initActionBar(true, R.string.courses_private_course_title);
    }

    @Override // com.garmin.android.apps.connectmobile.z1, android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        h0 h0VarE = h0.e(this);
        ArrayList<Intent> arrayList = h0VarE.f202637a;
        b.b();
        arrayList.add(new Intent(this, (Class<?>) DashboardActivity.class));
        arrayList.add(new Intent(this, (Class<?>) CoursesActivity.class));
        h0VarE.g();
        return true;
    }
}
