package com.garmin.android.apps.connectmobile.weighttracker.presentation;

import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0006\u0007B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0001\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/garmin/android/apps/connectmobile/weighttracker/presentation/a;", "", "", "route", "<init>", "(Ljava/lang/String;)V", "b", "a", "Lcom/garmin/android/apps/connectmobile/weighttracker/presentation/a$a;", "Lcom/garmin/android/apps/connectmobile/weighttracker/presentation/a$b;", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f48004a;

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.weighttracker.presentation.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/weighttracker/presentation/a$a;", "Lcom/garmin/android/apps/connectmobile/weighttracker/presentation/a;", "<init>", "()V", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class C0938a extends a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final C0938a f48005b = new C0938a();

        private C0938a() {
            super("EDIT_WEIGHT_GOAL_ROUTE", null);
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof C0938a);
        }

        public final int hashCode() {
            return 1186185922;
        }

        public final String toString() {
            return "EditWeightGoalScreen";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/weighttracker/presentation/a$b;", "Lcom/garmin/android/apps/connectmobile/weighttracker/presentation/a;", "<init>", "()V", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class b extends a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final b f48006b = new b();

        private b() {
            super("REPORTS_ROUTE", null);
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 1030884234;
        }

        public final String toString() {
            return "ReportsScreen";
        }
    }

    private a(String str) {
        this.f48004a = str;
    }

    public /* synthetic */ a(String str, j jVar) {
        this(str);
    }
}
