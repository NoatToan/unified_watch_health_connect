package com.garmin.customermanagementlib.ui;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import c.j;
import com.mapbox.maps.extension.compose.style.standard.StandardStyleConfigurationState;
import eh2.b;
import je0.o;
import o13.m;
import o13.t;
import p005kotlin.Metadata;
import z3.e;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007²\u0006\f\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002"}, d2 = {"Lcom/garmin/customermanagementlib/ui/CustomerManagementLibMainActivity;", "Ljj2/a;", "<init>", "()V", "a", "Lx72/e;", StandardStyleConfigurationState.CONFIG_THEME, "customer-management_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class CustomerManagementLibMainActivity extends jj2.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f50711h = new a(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final t f50712i = m.b(new o(5));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f50713d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Handler f50714e = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final b f50715f = new b(this, 27);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f50716g;

    @Override // androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f50713d = getIntent().getBooleanExtra("EXTRA_IS_IN_RETRY_FLOW", false);
        j.a(this, new e(1165453137, true, new jj2.b(this, 0)));
    }

    @Override // androidx.fragment.app.m, android.app.Activity
    public final void onResume() {
        super.onResume();
        if (!this.f50713d || this.f50716g) {
            return;
        }
        Handler handler = this.f50714e;
        b bVar = this.f50715f;
        handler.removeCallbacks(bVar);
        handler.postDelayed(bVar, 900000L);
    }

    @Override // android.app.Activity
    public final void onUserInteraction() {
        if (this.f50713d && !this.f50716g) {
            Handler handler = this.f50714e;
            b bVar = this.f50715f;
            handler.removeCallbacks(bVar);
            handler.postDelayed(bVar, 900000L);
        }
        super.onUserInteraction();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/customermanagementlib/ui/CustomerManagementLibMainActivity$a;", "", "<init>", "()V", "customer-management_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
