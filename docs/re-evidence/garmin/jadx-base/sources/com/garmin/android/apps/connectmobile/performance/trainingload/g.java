package com.garmin.android.apps.connectmobile.performance.trainingload;

import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.e0;
import androidx.fragment.app.v;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/garmin/android/apps/connectmobile/performance/trainingload/g;", "Landroidx/fragment/app/e0;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroidx/fragment/app/v;", "fragmentManager", "<init>", "(Landroid/content/Context;Landroidx/fragment/app/v;)V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class g extends e0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Context f40245h;

    static {
        new a(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(Context context, v vVar) {
        super(vVar);
        context.getClass();
        vVar.getClass();
        this.f40245h = context;
    }

    @Override // fe.a
    /* JADX INFO: renamed from: getCount */
    public final int getF44034e() {
        return 3;
    }

    @Override // androidx.fragment.app.e0
    public final Fragment getItem(int i14) {
        if (i14 == 0) {
            c.f40195p.getClass();
            return new c();
        }
        if (i14 == 1) {
            com.garmin.android.apps.connectmobile.performance.trainingload.a.f40182d.getClass();
            return new com.garmin.android.apps.connectmobile.performance.trainingload.a();
        }
        if (i14 != 2) {
            return new Fragment();
        }
        d.f40216d.getClass();
        return new d();
    }

    @Override // fe.a
    public final CharSequence getPageTitle(int i14) {
        Context context = this.f40245h;
        if (i14 == 0) {
            return context.getString(R.string.lbl_load_focus_lf);
        }
        if (i14 != 1) {
            return i14 != 2 ? "" : context.getString(R.string.lbl_training_load);
        }
        return context.getString(R.string.activities_load_title);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/garmin/android/apps/connectmobile/performance/trainingload/g$a;", "", "<init>", "()V", "", "POSITION_LOAD_FOCUS", "I", "POSITION_EXERCISE_LOAD", "POSITION_SEVEN_DAY_LOAD", "TAB_COUNT", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
