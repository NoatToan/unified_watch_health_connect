package com.garmin.android.apps.connectmobile.ecg.presentation.stats.filter;

import android.content.Context;
import android.os.Bundle;
import androidx.compose.ui.platform.ComposeView;
import d10.d;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import pf0.s;
import z3.e;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/ecg/presentation/stats/filter/EcgFilterFragment;", "Ld10/d;", "Lrf0/a;", "<init>", "()V", "a", "gcm-electrocardiogram_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class EcgFilterFragment extends d<rf0.a> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f34911e = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public s f34912d;

    static {
        new a(null);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        this.f34912d = new s(contextRequireContext);
    }

    @Override // d10.d
    public final void w6() {
        ComposeView composeView = this.f57032c;
        if (composeView != null) {
            composeView.setContent(new e(1735647628, true, new rf0.e(this, 0)));
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/ecg/presentation/stats/filter/EcgFilterFragment$a;", "", "<init>", "()V", "gcm-electrocardiogram_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
