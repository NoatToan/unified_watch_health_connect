package com.garmin.android.apps.connectmobile.performance.trainingload;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.m;
import androidx.fragment.app.v;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import r22.b0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/performance/trainingload/d;", "Lx22/a;", "<init>", "()V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d extends x22.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f40216d = new a(null);

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/performance/trainingload/d$b", "Lr22/b0;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b extends b0 {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(b0.b bVar, v vVar) {
            super(vVar, 5, null, null, bVar, 12, null);
            vVar.getClass();
        }

        @Override // r22.b0
        public final Fragment b(long j8, long j14) {
            e.f40217t.getClass();
            e eVar = new e();
            Bundle bundle = new Bundle();
            bundle.putLong("GCM_extra_start_date", j8);
            bundle.putLong("GCM_extra_end_date", j14);
            eVar.setArguments(bundle);
            return eVar;
        }
    }

    @Override // x22.a
    public final b0 u6() {
        m activity = getActivity();
        return new b(activity != null ? new x22.b(activity) : new b0.c(), getChildFragmentManager());
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/performance/trainingload/d$a;", "", "<init>", "()V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
