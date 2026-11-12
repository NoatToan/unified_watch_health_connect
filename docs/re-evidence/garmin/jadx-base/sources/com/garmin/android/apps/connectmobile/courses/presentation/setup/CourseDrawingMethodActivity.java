package com.garmin.android.apps.connectmobile.courses.presentation.setup;

import android.os.Build;
import android.os.Bundle;
import androidx.compose.ui.platform.ComposeView;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.c;
import com.garmin.android.apps.connectmobile.courses.model.i;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import z3.e;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/courses/presentation/setup/CourseDrawingMethodActivity;", "Lcom/garmin/android/apps/connectmobile/c;", "<init>", "()V", "a", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class CourseDrawingMethodActivity extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f33101a = new a(null);

    /* JADX WARN: Code duplicated, block: B:13:0x0036  */
    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        i iVar;
        Object serializable;
        super.onCreate(bundle);
        setContentView(R.layout.composable_container);
        initActionBar(true, R.string.lbl_drawing_method);
        Bundle extras = getIntent().getExtras();
        if (extras == null) {
            iVar = i.OTHER;
        } else {
            if (Build.VERSION.SDK_INT >= 33) {
                serializable = extras.getSerializable("GCM_extra_course_type", i.class);
            } else {
                Object serializable2 = extras.getSerializable("GCM_extra_course_type");
                if (!(serializable2 instanceof i)) {
                    serializable2 = null;
                }
                serializable = (i) serializable2;
            }
            iVar = (i) serializable;
            if (iVar == null) {
                iVar = i.OTHER;
            }
        }
        Bundle extras2 = getIntent().getExtras();
        ((ComposeView) findViewById(R.id.composable_container)).setContent(new e(-1373263370, true, new y50.a(this, iVar, extras2 != null ? extras2.getInt("GCM_create_course_flow", -1) : -1, 0)));
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/courses/presentation/setup/CourseDrawingMethodActivity$a;", "", "<init>", "()V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
