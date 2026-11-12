package com.garmin.android.apps.connectmobile.gcplus.presentation.home;

import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/garmin/android/apps/connectmobile/gcplus/presentation/home/j;", "", "<init>", "()V", "c", "a", "b", "d", "Lcom/garmin/android/apps/connectmobile/gcplus/presentation/home/j$a;", "Lcom/garmin/android/apps/connectmobile/gcplus/presentation/home/j$b;", "Lcom/garmin/android/apps/connectmobile/gcplus/presentation/home/j$c;", "Lcom/garmin/android/apps/connectmobile/gcplus/presentation/home/j$d;", "gcm-gcplus_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class j {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/gcplus/presentation/home/j$a;", "Lcom/garmin/android/apps/connectmobile/gcplus/presentation/home/j;", "", "formattedDate", "<init>", "(Ljava/lang/String;)V", "gcm-gcplus_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class a extends j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f35494a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str) {
            super(null);
            str.getClass();
            this.f35494a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && s.g(this.f35494a, ((a) obj).f35494a);
        }

        public final int hashCode() {
            return this.f35494a.hashCode();
        }

        public final String toString() {
            return am.j.m("HasBillingIssue(formattedDate=", this.f35494a, ")");
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/gcplus/presentation/home/j$b;", "Lcom/garmin/android/apps/connectmobile/gcplus/presentation/home/j;", "", "isAutoRenew", "", "formattedDate", "<init>", "(ZLjava/lang/String;)V", "gcm-gcplus_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class b extends j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f35495a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f35496b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(boolean z14, String str) {
            super(null);
            str.getClass();
            this.f35495a = z14;
            this.f35496b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f35495a == bVar.f35495a && s.g(this.f35496b, bVar.f35496b);
        }

        public final int hashCode() {
            return this.f35496b.hashCode() + (Boolean.hashCode(this.f35495a) * 31);
        }

        public final String toString() {
            return "IsFreeTrial(isAutoRenew=" + this.f35495a + ", formattedDate=" + this.f35496b + ")";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/gcplus/presentation/home/j$c;", "Lcom/garmin/android/apps/connectmobile/gcplus/presentation/home/j;", "<init>", "()V", "gcm-gcplus_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class c extends j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f35497a = new c();

        private c() {
            super(null);
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -2090938896;
        }

        public final String toString() {
            return "IsOptimisticGrant";
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/gcplus/presentation/home/j$d;", "Lcom/garmin/android/apps/connectmobile/gcplus/presentation/home/j;", "", "isAutoRenew", "", "formattedDate", "<init>", "(ZLjava/lang/String;)V", "gcm-gcplus_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class d extends j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f35498a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f35499b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(boolean z14, String str) {
            super(null);
            str.getClass();
            this.f35498a = z14;
            this.f35499b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.f35498a == dVar.f35498a && s.g(this.f35499b, dVar.f35499b);
        }

        public final int hashCode() {
            return this.f35499b.hashCode() + (Boolean.hashCode(this.f35498a) * 31);
        }

        public final String toString() {
            return "Regular(isAutoRenew=" + this.f35498a + ", formattedDate=" + this.f35499b + ")";
        }
    }

    public /* synthetic */ j(p005kotlin.jvm.internal.j jVar) {
        this();
    }

    private j() {
    }
}
