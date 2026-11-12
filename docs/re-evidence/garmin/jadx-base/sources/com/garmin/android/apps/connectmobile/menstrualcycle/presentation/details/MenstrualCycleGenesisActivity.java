package com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.settings.model.UserSettingsDTO;
import go1.g0;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/menstrualcycle/presentation/details/MenstrualCycleGenesisActivity;", "Lcom/garmin/android/apps/connectmobile/c;", "Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$f;", "<init>", "()V", "a", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class MenstrualCycleGenesisActivity extends com.garmin.android.apps.connectmobile.c implements SwipeRefreshLayout.f {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f38811e = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public SwipeRefreshLayout f38813b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ax0.a f38812a = (ax0.a) KoinJavaComponent.get$default(ax0.a.class, null, null, 6, null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f38814c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b f38815d = new b();

    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/garmin/android/apps/connectmobile/menstrualcycle/presentation/details/MenstrualCycleGenesisActivity$b", "Lcom/garmin/android/library/backgroundtaskmanagement/b$b;", "Lcom/garmin/android/apps/connectmobile/settings/model/UserSettingsDTO;", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b implements com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b<UserSettingsDTO> {
        public b() {
        }

        @Override // com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b
        public final void onComplete(long j8, com.garmin.android.library.backgroundtaskmanagement.b.c cVar) {
            cVar.getClass();
            MenstrualCycleGenesisActivity menstrualCycleGenesisActivity = MenstrualCycleGenesisActivity.this;
            SwipeRefreshLayout swipeRefreshLayout = menstrualCycleGenesisActivity.f38813b;
            if (swipeRefreshLayout == null) {
                s.m("refreshLayout");
                throw null;
            }
            swipeRefreshLayout.setRefreshing(false);
            ax0.a aVar = (ax0.a) KoinJavaComponent.get$default(ax0.a.class, null, null, 6, null);
            if (cVar == com.garmin.android.library.backgroundtaskmanagement.b.c.SUCCESS && aVar.d()) {
                menstrualCycleGenesisActivity.startActivity(MenstrualCycleDetailsActivity.a.b(MenstrualCycleDetailsActivity.f38784t, menstrualCycleGenesisActivity, true, null, 28));
                menstrualCycleGenesisActivity.finish();
            }
        }

        @Override // com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b
        public final void onResults(long j8, com.garmin.android.library.backgroundtaskmanagement.b.e eVar, UserSettingsDTO userSettingsDTO) {
            eVar.getClass();
            userSettingsDTO.getClass();
        }
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.f
    public final void M7() {
        this.f38814c = ((ax0.a) KoinJavaComponent.get$default(ax0.a.class, null, null, 6, null)).i(this.f38815d);
    }

    @Override // com.garmin.android.apps.connectmobile.z1, androidx.fragment.app.m, b.g, android.app.Activity
    public final void onActivityResult(int i14, int i15, Intent intent) {
        super.onActivityResult(i14, i15, intent);
        if (i14 == 201 && i15 == -1) {
            if (intent != null && intent.getBooleanExtra("GO_TO_DETAILS_KEY", false)) {
                startActivity(MenstrualCycleDetailsActivity.a.b(MenstrualCycleDetailsActivity.f38784t, this, true, null, 28));
            }
            finish();
        }
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_menstrual_cycle_genesis);
        initActionBar(true, R.string.mct_menstrual_cycle);
        this.f38812a.x();
        findViewById(R.id.genesis_button).setOnClickListener(new g0(this, 11));
        View viewFindViewById = findViewById(R.id.refresh_layout);
        viewFindViewById.getClass();
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) viewFindViewById;
        this.f38813b = swipeRefreshLayout;
        swipeRefreshLayout.setOnRefreshListener(this);
        ComposeView composeView = (ComposeView) findViewById(R.id.natural_cycles_promo_genesis);
        hx0.b.f86021a.getClass();
        composeView.setContent(hx0.b.f86022b);
    }

    @Override // com.garmin.android.apps.connectmobile.c, i.c, androidx.fragment.app.m, android.app.Activity
    public final void onStop() {
        super.onStop();
        com.garmin.android.library.backgroundtaskmanagement.c.f50123c.a(this.f38814c);
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/menstrualcycle/presentation/details/MenstrualCycleGenesisActivity$a;", "", "<init>", "()V", "", "GO_TO_DETAILS_KEY", "Ljava/lang/String;", "", "SETUP_REQUEST_CODE", "I", "CONSENT_REQUEST_CODE", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
