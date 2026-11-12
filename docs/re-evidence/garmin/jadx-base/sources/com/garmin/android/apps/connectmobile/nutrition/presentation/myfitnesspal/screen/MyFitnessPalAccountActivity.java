package com.garmin.android.apps.connectmobile.nutrition.presentation.myfitnesspal.screen;

import androidx.fragment.app.Fragment;
import c22.s3;
import com.garmin.android.apps.connectmobile.R;
import d53.u;
import f12.l;
import hk1.v;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import z10.p3;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/nutrition/presentation/myfitnesspal/screen/MyFitnessPalAccountActivity;", "Lz10/p3;", "Lcom/garmin/android/apps/connectmobile/e1;", "<init>", "()V", "a", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class MyFitnessPalAccountActivity extends p3 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f39608c = new a(null);

    @Override // z10.p3
    public final Fragment ca() {
        if (s3.b()) {
            c.f39631a.getClass();
            return new c();
        }
        b.f39610f.getClass();
        return new b();
    }

    @Override // z10.p3
    public final String da() {
        if (s3.b()) {
            return v.f84199e.f84204a;
        }
        String string = getString(R.string.gdpr_myfitnesspal_data_privacy);
        string.getClass();
        return string;
    }

    @Override // z10.p3
    public final String ea() {
        return u.v(da(), "/", "", false);
    }

    @Override // z10.p3
    public final boolean ia() {
        return true;
    }

    @Override // z10.p3
    public final boolean ja() {
        if (s3.b()) {
            return false;
        }
        l.f68084a.getClass();
        return !l.a.a().d3();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/nutrition/presentation/myfitnesspal/screen/MyFitnessPalAccountActivity$a;", "", "<init>", "()V", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
