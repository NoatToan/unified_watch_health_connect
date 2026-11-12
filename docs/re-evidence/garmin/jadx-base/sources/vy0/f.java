package vy0;

import android.content.Intent;
import android.os.Build;
import com.garmin.android.apps.connectmobile.navigation.more.MoreActivity;
import java.io.Serializable;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class f implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f180709a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MoreActivity f180710b;

    public /* synthetic */ f(MoreActivity moreActivity, int i14) {
        this.f180709a = i14;
        this.f180710b = moreActivity;
    }

    @Override // e23.a
    public final Object invoke() {
        int i14 = this.f180709a;
        MoreActivity moreActivity = this.f180710b;
        switch (i14) {
            case 0:
                int i15 = MoreActivity.f39378g;
                Intent intent = moreActivity.getIntent();
                Serializable serializableExtra = null;
                if (Build.VERSION.SDK_INT < 33) {
                    Serializable serializableExtra2 = intent != null ? intent.getSerializableExtra("MORE_START_DESTINATION_EXTRA") : null;
                    serializableExtra = (ty0.b) (serializableExtra2 instanceof ty0.b ? serializableExtra2 : null);
                } else if (intent != null) {
                    serializableExtra = intent.getSerializableExtra("MORE_START_DESTINATION_EXTRA", ty0.b.class);
                }
                ty0.b bVar = (ty0.b) serializableExtra;
                return bVar == null ? ty0.b.f166892l3 : bVar;
            default:
                int i16 = MoreActivity.f39378g;
                moreActivity.getOnBackPressedDispatcher().d();
                return Unit.INSTANCE;
        }
    }
}
