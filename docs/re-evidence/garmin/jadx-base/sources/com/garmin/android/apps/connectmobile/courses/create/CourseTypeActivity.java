package com.garmin.android.apps.connectmobile.courses.create;

import a23.g;
import am.x0;
import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.lifecycle.z0;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.courses.create.CourseTypeActivity;
import com.garmin.android.apps.connectmobile.courses.model.e;
import com.garmin.android.apps.connectmobile.courses.model.i;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.l2;
import com.garmin.android.apps.connectmobile.view.view_3_0.GCMComplexOneLineButton;
import e23.l;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import o13.h;
import o13.m;
import o13.t;
import org.apache.commons.io.FileUtils;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.n;
import p005kotlin.jvm.internal.s;
import ps.x1;
import t20.j;
import ty1.f1;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/courses/create/CourseTypeActivity;", "Lcom/garmin/android/apps/connectmobile/c;", "<init>", "()V", "a", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class CourseTypeActivity extends com.garmin.android.apps.connectmobile.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final a f32753j = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f32754a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public x0 f32755b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ArrayList f32757d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f32758e;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Uri f32761h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public e f32762i;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f32756c = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final t f32759f = m.b(new f1(this, 25));

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final d f32760g = new d();

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f32763a;

        static {
            int[] iArr = new int[x0.values().length];
            try {
                iArr[x0.f4308n.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[x0.J0.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[x0.f4312o.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[x0.V0.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[x0.Z0.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[x0.f4346x.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f32763a = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements z0, n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f32764a;

        public c(l lVar) {
            lVar.getClass();
            this.f32764a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof n)) {
                return s.g(getFunctionDelegate(), ((n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final h<?> getFunctionDelegate() {
            return this.f32764a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f32764a.invoke(obj);
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/courses/create/CourseTypeActivity$d", "Lt20/j$a;", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class d implements j.a {
        public d() {
        }

        @Override // t20.j.a
        public final void a() {
            CourseTypeActivity courseTypeActivity = CourseTypeActivity.this;
            courseTypeActivity.hideProgressOverlay();
            CourseTypeActivity.ca(courseTypeActivity);
            courseTypeActivity.fa();
        }

        @Override // t20.j.a
        public final void b(e eVar) {
            eVar.getClass();
            CourseTypeActivity courseTypeActivity = CourseTypeActivity.this;
            courseTypeActivity.hideProgressOverlay();
            CourseTypeActivity.ca(courseTypeActivity);
            courseTypeActivity.f32762i = eVar;
        }
    }

    public static final void ca(CourseTypeActivity courseTypeActivity) {
        courseTypeActivity.getClass();
        try {
            g.d(pi1.b.a(courseTypeActivity, "courses"));
        } catch (Exception e4) {
            sn.a.s("Delete import course directory failed: ", e4.getMessage(), i2.f36769a, a2.COURSES, "CourseTypeActivity");
        }
    }

    public final void da(long j8, ArrayList arrayList, i iVar) {
        showProgressOverlay();
        v20.c cVar = (v20.c) this.f32759f.getValue();
        cVar.getClass();
        iVar.getClass();
        androidx.lifecycle.m.a(null, new v20.b(cVar, j8, iVar, arrayList, this, null), 3).f(this, new c(new uo1.a(this, 12)));
    }

    public final String ea() {
        Uri uri = this.f32761h;
        if (uri == null) {
            return "";
        }
        Cursor cursorQuery = getContentResolver().query(uri, null, null, null, null);
        try {
            Cursor cursor = cursorQuery;
            if (cursor == null) {
                jg.b.l(cursorQuery, null);
                return "file";
            }
            int columnIndex = cursor.getColumnIndex("_display_name");
            if (columnIndex == -1) {
                jg.b.l(cursorQuery, null);
                return "file";
            }
            cursor.moveToFirst();
            String string = cursor.getString(columnIndex);
            String str = string != null ? string : "file";
            jg.b.l(cursorQuery, null);
            return str;
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                jg.b.l(cursorQuery, th3);
                throw th4;
            }
        }
    }

    public final void fa() {
        Toast.makeText(this, R.string.message_course_loading_fail, 0).show();
        finish();
    }

    public final void ga() {
        Uri uri = this.f32761h;
        if (uri == null) {
            return;
        }
        try {
            InputStream inputStreamOpenInputStream = getContentResolver().openInputStream(uri);
            if (inputStreamOpenInputStream != null) {
                try {
                    showProgressOverlay();
                    File file = new File(pi1.b.a(this, "courses"), System.currentTimeMillis() + ".course");
                    FileUtils.copyInputStreamToFile(inputStreamOpenInputStream, file);
                    ((s20.g) KoinJavaComponent.get$default(s20.g.class, null, null, 6, null)).y(file, ea(), this.f32760g);
                    Unit unit = Unit.INSTANCE;
                    inputStreamOpenInputStream.close();
                } catch (Throwable th3) {
                    try {
                        throw th3;
                    } catch (Throwable th4) {
                        jg.b.l(inputStreamOpenInputStream, th3);
                        throw th4;
                    }
                }
            }
        } catch (FileNotFoundException e4) {
            sn.a.s("Unknown launch URI: ", e4.getMessage(), i2.f36769a, a2.COURSES, "CourseTypeActivity");
            fa();
        } catch (IOException e14) {
            sn.a.s("Invalid file information:", e14.getMessage(), i2.f36769a, a2.COURSES, "CourseTypeActivity");
            fa();
        } catch (SecurityException e15) {
            sn.a.s("File access denied, cannot access URI provided by outside app:", e15.getMessage(), i2.f36769a, a2.COURSES, "CourseTypeActivity");
            fa();
        }
    }

    public final void ha(int i14, i iVar) {
        GCMComplexOneLineButton gCMComplexOneLineButton = (GCMComplexOneLineButton) findViewById(i14);
        gCMComplexOneLineButton.setOnClickListener(new u12.e(14, this, iVar));
        gCMComplexOneLineButton.setButtonLeftLabel(iVar.f32979a);
        gCMComplexOneLineButton.setVisible(true);
    }

    @Override // com.garmin.android.apps.connectmobile.z1, androidx.fragment.app.m, b.g, android.app.Activity
    public final void onActivityResult(int i14, int i15, Intent intent) {
        if (i14 != 2) {
            super.onActivityResult(i14, i15, intent);
            return;
        }
        if (i15 == -1) {
            finish();
            return;
        }
        if (i15 != 0) {
            i2.a.q(i2.f36769a, "Unhandled result from request code REQUEST_CODE_CREATE_ACTIVITY_CONVERTED_COURSE, finish self");
            finish();
        } else {
            if (this.f32756c == -1 || this.f32755b != x0.O0) {
                return;
            }
            finish();
        }
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Object serializableExtra;
        x0 x0Var;
        Object serializable;
        super.onCreate(bundle);
        setContentView(R.layout.gcm3_course_type);
        this.f32754a = getIntent().getBooleanExtra("GCM_extra_navigate_to_course_from_ti", false);
        Intent intent = getIntent();
        int i14 = Build.VERSION.SDK_INT;
        if (i14 >= 33) {
            serializableExtra = intent != null ? intent.getSerializableExtra("GCM_extra_activity_type", x0.class) : null;
        } else {
            Object serializableExtra2 = intent != null ? intent.getSerializableExtra("GCM_extra_activity_type") : null;
            if (!(serializableExtra2 instanceof x0)) {
                serializableExtra2 = null;
            }
            serializableExtra = (x0) serializableExtra2;
        }
        x0 x0Var2 = (x0) serializableExtra;
        this.f32755b = x0Var2;
        initActionBar(true, (!this.f32754a || x0Var2 == null) ? R.string.lbl_course_setup : R.string.add_event);
        if (getIntent().getData() != null) {
            this.f32761h = getIntent().getData();
        }
        l2.a aVar = l2.f37135b;
        Intent intent2 = getIntent();
        aVar.getClass();
        Bundle bundleA = l2.a.a(intent2);
        if (bundleA != null) {
            this.f32757d = i14 >= 33 ? bundleA.getParcelableArrayList("GCM_extra_activity_splits", x1.class) : bundleA.getParcelableArrayList("GCM_extra_activity_splits");
            if (i14 >= 33) {
                serializable = bundleA.getSerializable("GCM_extra_activity_type", x0.class);
            } else {
                Object serializable2 = bundleA.getSerializable("GCM_extra_activity_type");
                serializable = (x0) (serializable2 instanceof x0 ? serializable2 : null);
            }
            this.f32755b = (x0) serializable;
            this.f32756c = bundleA.getLong("GCM_extra_activity_id", -1L);
        }
        if (this.f32756c != -1) {
            x0 x0Var3 = this.f32755b;
            x0 x0Var4 = x0.O0;
            if (x0Var3 == x0Var4) {
                LinearLayout linearLayout = (LinearLayout) findViewById(R.id.activity_courses_create);
                linearLayout.getClass();
                linearLayout.setVisibility(4);
                long j8 = this.f32756c;
                if (j8 == -1 || this.f32755b != x0Var4) {
                    return;
                }
                da(j8, this.f32757d, i.OBSTACLE_COURSE_RACING);
                return;
            }
        }
        TextView textView = (TextView) findViewById(R.id.running_section);
        TextView textView2 = (TextView) findViewById(R.id.cycling_section);
        TextView textView3 = (TextView) findViewById(R.id.hiking_section);
        TextView textView4 = (TextView) findViewById(R.id.other_section);
        int intExtra = getIntent().getIntExtra("GCM_create_course_flow", -1);
        this.f32758e = intExtra;
        if (this.f32754a && (x0Var = this.f32755b) != null) {
            if (x0Var != null) {
                switch (b.f32763a[x0Var.ordinal()]) {
                    case 1:
                    case 2:
                        ha(R.id.courses_create_running, i.RUNNING);
                        ha(R.id.courses_create_trail_running, i.TRAIL_RUNNING);
                        break;
                    case 3:
                    case 4:
                    case 5:
                        ha(R.id.courses_create_road_cycling, i.ROAD_CYCLING);
                        ha(R.id.courses_create_gravel_cycling, i.GRAVEL_CYCLING);
                        ha(R.id.courses_create_mountain_biking, i.MOUNTAIN_BIKING);
                        break;
                    case 6:
                        ha(R.id.courses_create_other, i.OTHER);
                        break;
                }
            }
        } else if (intExtra == 0) {
            textView.getClass();
            textView.setVisibility(0);
            ha(R.id.courses_create_running, i.RUNNING);
            ha(R.id.courses_create_trail_running, i.TRAIL_RUNNING);
        } else if (intExtra == 1) {
            textView2.getClass();
            textView2.setVisibility(0);
            ha(R.id.courses_create_road_cycling, i.ROAD_CYCLING);
            ha(R.id.courses_create_gravel_cycling, i.GRAVEL_CYCLING);
            ha(R.id.courses_create_mountain_biking, i.MOUNTAIN_BIKING);
        } else {
            textView.getClass();
            textView.setVisibility(0);
            ha(R.id.courses_create_running, i.RUNNING);
            ha(R.id.courses_create_trail_running, i.TRAIL_RUNNING);
            textView2.getClass();
            textView2.setVisibility(0);
            ha(R.id.courses_create_road_cycling, i.ROAD_CYCLING);
            ha(R.id.courses_create_gravel_cycling, i.GRAVEL_CYCLING);
            ha(R.id.courses_create_mountain_biking, i.MOUNTAIN_BIKING);
            textView3.getClass();
            textView3.setVisibility(0);
            ha(R.id.courses_create_hiking, i.HIKING);
            textView4.getClass();
            textView4.setVisibility(0);
            ha(R.id.courses_create_other, i.OTHER);
        }
        textView.setContentDescription(getString(R.string.lbl_heading, textView.getText().toString()));
        textView2.setContentDescription(getString(R.string.lbl_heading, textView2.getText().toString()));
        textView3.setContentDescription(getString(R.string.lbl_heading, textView3.getText().toString()));
        textView4.setContentDescription(getString(R.string.lbl_heading, textView4.getText().toString()));
    }

    @Override // androidx.fragment.app.m, b.g, android.app.Activity
    public final void onRequestPermissionsResult(int i14, String[] strArr, int[] iArr) {
        strArr.getClass();
        iArr.getClass();
        i2.a aVar = i2.f36769a;
        a2 a2Var = a2.COURSES;
        aVar.getClass();
        i2.a.b(a2Var, "CourseTypeActivity", "onRequestPermissionsResult");
        if (i14 != 1) {
            super.onRequestPermissionsResult(i14, strArr, iArr);
            return;
        }
        j22.b.f96736a.getClass();
        if (j22.b.E(iArr)) {
            ga();
            return;
        }
        i2.a.b(a2Var, "CourseTypeActivity", "onRequestPermissionsResult:user denied permission to use AndroidPermission.READ_EXTERNAL_STORAGE");
        final int i15 = 0;
        androidx.appcompat.app.e.a negativeButton = new androidx.appcompat.app.e.a(this).setMessage(j22.b.f(j22.a.f96721j)).setNegativeButton(R.string.lbl_cancel, new DialogInterface.OnClickListener(this) { // from class: v20.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CourseTypeActivity f175274b;

            {
                this.f175274b = this;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i16) {
                int i17 = i15;
                CourseTypeActivity courseTypeActivity = this.f175274b;
                switch (i17) {
                    case 0:
                        CourseTypeActivity.a aVar2 = CourseTypeActivity.f32753j;
                        courseTypeActivity.finish();
                        break;
                    default:
                        CourseTypeActivity.a aVar3 = CourseTypeActivity.f32753j;
                        j22.b.f96736a.getClass();
                        j22.b.r(courseTypeActivity);
                        break;
                }
            }
        });
        final int i16 = 1;
        negativeButton.setPositiveButton(R.string.lbl_settings, new DialogInterface.OnClickListener(this) { // from class: v20.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CourseTypeActivity f175274b;

            {
                this.f175274b = this;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i17) {
                int i18 = i16;
                CourseTypeActivity courseTypeActivity = this.f175274b;
                switch (i18) {
                    case 0:
                        CourseTypeActivity.a aVar2 = CourseTypeActivity.f32753j;
                        courseTypeActivity.finish();
                        break;
                    default:
                        CourseTypeActivity.a aVar3 = CourseTypeActivity.f32753j;
                        j22.b.f96736a.getClass();
                        j22.b.r(courseTypeActivity);
                        break;
                }
            }
        }).create().show();
    }

    @Override // android.app.Activity
    public final void onRestoreInstanceState(Bundle bundle) {
        bundle.getClass();
    }

    @Override // com.garmin.android.apps.connectmobile.z1, b.g, z6.e, android.app.Activity
    @SuppressLint({"MissingSuperCall"})
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.getClass();
    }

    @Override // com.garmin.android.apps.connectmobile.c, i.c, androidx.fragment.app.m, android.app.Activity
    public final void onStart() {
        super.onStart();
        if (this.f32761h == null || this.f32762i != null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 33) {
            j22.b bVar = j22.b.f96736a;
            j22.a aVar = j22.a.f96721j;
            bVar.getClass();
            if (!j22.b.k(aVar)) {
                j22.b.x(this, 1, aVar);
                return;
            }
        }
        ga();
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\f¨\u0006\u000e"}, d2 = {"Lcom/garmin/android/apps/connectmobile/courses/create/CourseTypeActivity$a;", "", "<init>", "()V", "", "INVALID_ACTIVITY_ID", "J", "", "TAG", "Ljava/lang/String;", "", "REQUEST_CODE_STORAGE_PERMISSION", "I", "REQUEST_CODE_CREATE_ACTIVITY_CONVERTED_COURSE", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
