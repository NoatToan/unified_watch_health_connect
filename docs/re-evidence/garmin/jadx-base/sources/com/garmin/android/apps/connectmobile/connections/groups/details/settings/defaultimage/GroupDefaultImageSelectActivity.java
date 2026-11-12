package com.garmin.android.apps.connectmobile.connections.groups.details.settings.defaultimage;

import a7.b;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.p;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.c;
import java.util.ArrayList;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/connections/groups/details/settings/defaultimage/GroupDefaultImageSelectActivity;", "Lcom/garmin/android/apps/connectmobile/c;", "Lcom/garmin/android/apps/connectmobile/connections/groups/details/settings/defaultimage/a$b;", "<init>", "()V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class GroupDefaultImageSelectActivity extends c implements com.garmin.android.apps.connectmobile.connections.groups.details.settings.defaultimage.a.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f31494c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public com.garmin.android.apps.connectmobile.connections.groups.details.settings.defaultimage.a f31495a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public RecyclerView f31496b;

    @Override // com.garmin.android.apps.connectmobile.connections.groups.details.settings.defaultimage.a.b
    public final void d6(l10.a aVar) {
        Intent intent = new Intent();
        intent.putExtra("extra_group_default_image_select_id", aVar.f108051b);
        setResult(-1, intent);
        finish();
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_group_image_select);
        super.initActionBar(true, getString(R.string.social_select_image));
        this.f31495a = new com.garmin.android.apps.connectmobile.connections.groups.details.settings.defaultimage.a(this);
        View viewFindViewById = findViewById(R.id.gallery);
        viewFindViewById.getClass();
        RecyclerView recyclerView = (RecyclerView) viewFindViewById;
        this.f31496b = recyclerView;
        recyclerView.setLayoutManager(new GridLayoutManager(this, 2));
        RecyclerView recyclerView2 = this.f31496b;
        if (recyclerView2 == null) {
            s.m("gallery");
            throw null;
        }
        com.garmin.android.apps.connectmobile.connections.groups.details.settings.defaultimage.a aVar = this.f31495a;
        if (aVar == null) {
            s.m("groupDefaultImagePickerAdapter");
            throw null;
        }
        recyclerView2.setAdapter(aVar);
        Drawable drawable = b.getDrawable(this, R.drawable.group_default_image_selector_item_divider);
        p pVar = new p(this, 1);
        if (drawable != null) {
            pVar.f10584a = drawable;
        }
        RecyclerView recyclerView3 = this.f31496b;
        if (recyclerView3 == null) {
            s.m("gallery");
            throw null;
        }
        recyclerView3.addItemDecoration(pVar);
        k10.a.f102143a.getClass();
        ArrayList arrayListA = k10.a.a(this);
        com.garmin.android.apps.connectmobile.connections.groups.details.settings.defaultimage.a aVar2 = this.f31495a;
        if (aVar2 == null) {
            s.m("groupDefaultImagePickerAdapter");
            throw null;
        }
        aVar2.f31498b = arrayListA;
        aVar2.notifyDataSetChanged();
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/connections/groups/details/settings/defaultimage/GroupDefaultImageSelectActivity$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
