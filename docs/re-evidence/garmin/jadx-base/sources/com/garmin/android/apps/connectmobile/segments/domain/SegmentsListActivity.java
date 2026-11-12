package com.garmin.android.apps.connectmobile.segments.domain;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.Menu;
import android.view.MenuItem;
import androidx.fragment.app.v;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.c;
import com.garmin.android.apps.connectmobile.l2;
import com.garmin.android.apps.connectmobile.segments.presentation.ExploreSegmentsActivity;
import com.garmin.android.apps.connectmobile.segments.presentation.SegmentDetailsActivity;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import oc.b;
import p005kotlin.Metadata;
import xf1.h;
import xf1.i;
import xf1.j;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/segments/domain/SegmentsListActivity;", "Lcom/garmin/android/apps/connectmobile/c;", "Lxf1/h;", "<init>", "()V", "a", "gcm-segments_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class SegmentsListActivity extends c implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public j f41273a;

    static {
        new a(null);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.garmin.android.apps.connectmobile.z1, androidx.fragment.app.m, b.g, android.app.Activity
    public final void onActivityResult(int i14, int i15, Intent intent) {
        Serializable serializable;
        if (i14 == 10 && i15 == -1 && intent != null && intent.getExtras() != null) {
            Bundle extras = intent.getExtras();
            HashMap<String, Boolean> map = null;
            if (extras != null) {
                if (Build.VERSION.SDK_INT >= 33) {
                    serializable = extras.getSerializable("GCM_extra_segment_is_favorite", HashMap.class);
                } else {
                    Serializable serializable2 = extras.getSerializable("GCM_extra_segment_is_favorite");
                    serializable = (HashMap) (serializable2 instanceof HashMap ? serializable2 : null);
                }
                map = (HashMap) serializable;
            }
            j jVar = this.f41273a;
            jVar.getClass();
            i iVar = jVar.f190698k;
            if (iVar != null) {
                iVar.a(map);
            }
        }
        super.onActivityResult(i14, i15, intent);
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.gcm3_segments_list_layout);
        initActionBar(true, R.string.card_segments_title);
        ArrayList<? extends Parcelable> parcelableArrayListExtra = getIntent().getParcelableArrayListExtra("GCM_extra_segments_list");
        if (parcelableArrayListExtra == null) {
            finish();
            return;
        }
        j.f190696l.getClass();
        j jVar = new j();
        Bundle bundle2 = new Bundle();
        bundle2.putParcelableArrayList("SEGMENTS_LIST", parcelableArrayListExtra);
        l2.f37135b.getClass();
        l2.a.c(jVar, bundle2);
        this.f41273a = jVar;
        v supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.getClass();
        androidx.fragment.app.a aVar = new androidx.fragment.app.a(supportFragmentManager);
        aVar.l(R.id.segments_list_fragment, jVar, null);
        aVar.e();
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        menu.getClass();
        getMenuInflater().inflate(R.menu.segments_list, menu);
        return true;
    }

    @Override // com.garmin.android.apps.connectmobile.z1, android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        menuItem.getClass();
        if (menuItem.getItemId() == R.id.segments_list_explore_menu_item) {
            ExploreSegmentsActivity.C.getClass();
            startActivity(new Intent(this, (Class<?>) ExploreSegmentsActivity.class));
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // android.app.Activity
    public final boolean onPrepareOptionsMenu(Menu menu) {
        menu.getClass();
        b.G(menu.findItem(R.id.segments_list_explore_menu_item), this, R.color.gcm_icon_primary);
        return super.onPrepareOptionsMenu(menu);
    }

    @Override // xf1.h
    public final void u8(bg1.a aVar) {
        if (aVar != null) {
            SegmentDetailsActivity.Z.getClass();
            SegmentDetailsActivity.a.b(this, aVar, 10);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/segments/domain/SegmentsListActivity$a;", "", "<init>", "()V", "", "SEGMENT_DETAIL_REQUEST_CODE", "I", "gcm-segments_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
