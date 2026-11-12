package com.garmin.android.apps.connectmobile.activities.manual;

import am.a2;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MenuItem;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.lifecycle.v1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y0;
import c22.l1;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.c;
import com.garmin.android.apps.connectmobile.courses.model.d;
import f12.b;
import fw.p;
import iz1.g;
import java.util.List;
import lo.u;
import org.koin.java.KoinJavaComponent;
import p005kotlin.jvm.internal.s0;
import s20.i;
import s20.j;

/* JADX INFO: loaded from: classes7.dex */
public class CourseChooserActivity extends c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f29147f = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List<d> f29148a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public u f29149b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public d f29150c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TextView f29151d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public i f29152e;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f29153a;

        static {
            int[] iArr = new int[p.values().length];
            f29153a = iArr;
            try {
                iArr[p.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f29153a[p.ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f29153a[p.LOADING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public final void ca() {
        u uVar = this.f29149b;
        List<d> list = this.f29148a;
        d dVar = this.f29150c;
        uVar.clear();
        if (list != null) {
            if (dVar != null) {
                for (d dVar2 : list) {
                    String str = dVar.courseId;
                    if (!TextUtils.isEmpty(str) && str.equalsIgnoreCase(dVar2.courseId)) {
                        uVar.f113963c = list.indexOf(dVar2);
                        break;
                    }
                }
            }
            uVar.addAll(list);
        }
        this.f29151d.setVisibility(this.f29149b.isEmpty() ? 0 : 8);
    }

    public final void da() {
        u uVar = this.f29149b;
        int i14 = uVar.f113963c;
        d dVar = i14 >= 0 ? (d) uVar.getItem(i14) : null;
        Intent intent = new Intent();
        Bundle bundle = new Bundle();
        a2.b(bundle, "extra_selected_course", dVar);
        a2.a("extra_course_list", bundle, this.f29148a);
        intent.putExtras(bundle);
        setResult(dVar != this.f29150c ? -1 : 0, intent);
        finish();
    }

    @Override // com.garmin.android.apps.connectmobile.z1, b.g, android.app.Activity
    public final void onBackPressed() {
        da();
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.gcm3_list_with_empty_text_layout);
        initActionBar(true, R.string.title_course);
        Bundle extras = getIntent().getExtras();
        this.f29148a = a2.d(extras, "extra_course_list");
        this.f29150c = (d) a2.c(extras, "extra_selected_course");
        ListView listView = (ListView) findViewById(R.id.list_view);
        TextView textView = (TextView) findViewById(R.id.list_view_empty_text);
        this.f29151d = textView;
        textView.setText(l1.a(getString(R.string.courses_no_data_text)));
        u uVar = new u(this);
        this.f29149b = uVar;
        listView.setAdapter((ListAdapter) uVar);
        this.f29152e = (i) new x1(this).b(s0.f105811a.b(i.class));
        List<d> list = this.f29148a;
        if (list != null && !list.isEmpty()) {
            ca();
            return;
        }
        i iVar = this.f29152e;
        String userDisplayName = ((b) KoinJavaComponent.get(b.class)).getUserDisplayName();
        int userProfilePk = ((b) KoinJavaComponent.get(b.class)).getUserProfilePk();
        iVar.getClass();
        userDisplayName.getClass();
        y0 y0Var = new y0();
        ge1.b.T(v1.a(iVar), null, null, new j(y0Var, iVar, userDisplayName, userProfilePk, null), 3);
        y0Var.f(this, new g(this, 8));
    }

    @Override // com.garmin.android.apps.connectmobile.z1, android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        da();
        return true;
    }
}
