package com.garmin.androiddynamicsettings.app.presentationlayer;

import android.content.Intent;
import android.os.Bundle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.androiddynamicsettings.app.baseviews.views.StyledTextView;
import com.nimbusds.jose.HeaderParameterNames;
import java.util.ArrayList;
import o13.m;
import o13.t;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.w;
import vb.h;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/androiddynamicsettings/app/presentationlayer/SelectableListActivity;", "Lcom/garmin/androiddynamicsettings/app/presentationlayer/b;", "<init>", "()V", "a", "androiddynamicsettings_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SelectableListActivity extends com.garmin.androiddynamicsettings.app.presentationlayer.b {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public com.garmin.androiddynamicsettings.app.presentationlayer.a f50670l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final t f50671m = m.b(new b());

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final t f50672n = m.b(new c());

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00010\u0000j\b\u0012\u0004\u0012\u00020\u0001`\u0002H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ljava/util/ArrayList;", "Lcom/garmin/androiddynamicsettings/app/presentationlayer/a$b;", "Lkotlin/collections/ArrayList;", "invoke", "()Ljava/util/ArrayList;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class b extends w implements e23.a<ArrayList<com.garmin.androiddynamicsettings.app.presentationlayer.a.b>> {
        public b() {
            super(0);
        }

        @Override // e23.a
        public final ArrayList<com.garmin.androiddynamicsettings.app.presentationlayer.a.b> invoke() {
            ArrayList<com.garmin.androiddynamicsettings.app.presentationlayer.a.b> parcelableArrayListExtra = SelectableListActivity.this.getIntent().getParcelableArrayListExtra("SelectableListActivity_listKey");
            parcelableArrayListExtra.getClass();
            return parcelableArrayListExtra;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Integer;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class c extends w implements e23.a<Integer> {
        public c() {
            super(0);
        }

        @Override // e23.a
        public final Integer invoke() {
            return Integer.valueOf(SelectableListActivity.this.getIntent().getIntExtra("SelectableListActivity_selectedIndexKey", 0));
        }
    }

    static {
        new a(null);
    }

    @Override // b.g, android.app.Activity
    public final void onBackPressed() {
        int iIntValue = ((Number) this.f50672n.getValue()).intValue();
        com.garmin.androiddynamicsettings.app.presentationlayer.a aVar = this.f50670l;
        if (aVar == null) {
            s.m("adapter");
            throw null;
        }
        if (iIntValue == aVar.f50679b) {
            super.onBackPressed();
            return;
        }
        Intent intent = new Intent();
        com.garmin.androiddynamicsettings.app.presentationlayer.a aVar2 = this.f50670l;
        if (aVar2 == null) {
            s.m("adapter");
            throw null;
        }
        intent.putExtra("SelectableListActivity_selectedIndexKey", aVar2.f50679b);
        setResult(-1, intent);
        finish();
    }

    @Override // com.garmin.androiddynamicsettings.app.presentationlayer.b, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        String stringExtra;
        super.onCreate(bundle);
        setContentView(R.layout.dsl_selectable_list);
        StyledTextView styledTextView = (StyledTextView) findViewById(R.id.selectable_list_header_text);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.selectable_list_recycler_view);
        Intent intent = getIntent();
        String stringExtra2 = intent != null ? intent.getStringExtra("SelectableListActivity_headerTextKey") : null;
        Intent intent2 = getIntent();
        if (intent2 == null || (stringExtra = intent2.getStringExtra("SelectableListActivity_titleKey")) == null) {
            h.z("SelectableListActivity must have toolBarText");
            return;
        }
        com.garmin.androiddynamicsettings.app.presentationlayer.b.Q9(this, stringExtra, null, 6);
        com.garmin.androiddynamicsettings.app.presentationlayer.a aVar = new com.garmin.androiddynamicsettings.app.presentationlayer.a(this, (ArrayList) this.f50671m.getValue(), bundle != null ? bundle.getInt("SelectableListActivity_selectedIndexKey") : ((Number) this.f50672n.getValue()).intValue());
        this.f50670l = aVar;
        recyclerView.setAdapter(aVar);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(1);
        recyclerView.setLayoutManager(linearLayoutManager);
        if (stringExtra2 == null || stringExtra2.length() == 0) {
            styledTextView.setVisibility(8);
        } else {
            styledTextView.setText(stringExtra2);
            styledTextView.setVisibility(0);
        }
    }

    @Override // b.g, z6.e, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.getClass();
        com.garmin.androiddynamicsettings.app.presentationlayer.a aVar = this.f50670l;
        if (aVar == null) {
            s.m("adapter");
            throw null;
        }
        bundle.putInt("SelectableListActivity_selectedIndexKey", aVar.f50679b);
        super.onSaveInstanceState(bundle);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006¨\u0006\u000b"}, d2 = {"Lcom/garmin/androiddynamicsettings/app/presentationlayer/SelectableListActivity$a;", "", "<init>", "()V", "", "headerTextKey", "Ljava/lang/String;", "listKey", "selectedIndexKey", HeaderParameterNames.AUTHENTICATION_TAG, "titleKey", "androiddynamicsettings_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
