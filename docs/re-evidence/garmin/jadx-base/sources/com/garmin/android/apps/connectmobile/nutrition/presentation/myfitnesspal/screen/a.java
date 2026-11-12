package com.garmin.android.apps.connectmobile.nutrition.presentation.myfitnesspal.screen;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.garmin.android.apps.connectmobile.R;
import d20.d;
import d20.f;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import z10.b3;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/nutrition/presentation/myfitnesspal/screen/a;", "Lz10/b3;", "<init>", "()V", "a", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a extends b3 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final C0710a f39609n = new C0710a(null);

    @Override // z10.b3
    public final int v6() {
        return R.layout.third_party_my_fitness_pal_details;
    }

    @Override // z10.b3
    public final void w6(View view2) {
        d dVar;
        View viewFindViewById = view2.findViewById(R.id.mfp_logo);
        viewFindViewById.getClass();
        ImageView imageView = (ImageView) viewFindViewById;
        View viewFindViewById2 = view2.findViewById(R.id.mfp_header_message);
        viewFindViewById2.getClass();
        String string = getString(R.string.calories_enable_mfp_feature_msg);
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        ((TextView) viewFindViewById2).setContentDescription(oi0.c.A(contextRequireContext, new yq.d(16), string));
        zp0.c cVar = new zp0.c(this);
        f fVar = this.f200900b;
        cVar.f206565e = (fVar == null || (dVar = fVar.f57284b) == null) ? null : dVar.getImageUrl();
        cVar.h(imageView);
    }

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.nutrition.presentation.myfitnesspal.screen.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/nutrition/presentation/myfitnesspal/screen/a$a;", "", "<init>", "()V", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C0710a {
        public /* synthetic */ C0710a(j jVar) {
            this();
        }

        private C0710a() {
        }
    }
}
