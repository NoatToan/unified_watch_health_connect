package com.garmin.android.apps.connectmobile.userprofile.presentation;

import com.google.firebase.analytics.FirebaseAnalytics;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import v.e0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/garmin/android/apps/connectmobile/userprofile/presentation/a;", "", "<init>", "()V", "a", "b", "c", "Lcom/garmin/android/apps/connectmobile/userprofile/presentation/a$a;", "Lcom/garmin/android/apps/connectmobile/userprofile/presentation/a$b;", "Lcom/garmin/android/apps/connectmobile/userprofile/presentation/a$c;", "gcm-profile_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class a {

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.userprofile.presentation.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/userprofile/presentation/a$a;", "Lcom/garmin/android/apps/connectmobile/userprofile/presentation/a;", "", "dataChanged", "<init>", "(Z)V", "gcm-profile_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class C0906a extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f47007a;

        public C0906a(boolean z14) {
            super(null);
            this.f47007a = z14;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0906a) && this.f47007a == ((C0906a) obj).f47007a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f47007a);
        }

        public final String toString() {
            return com.airbnb.lottie.animation.keyframe.a.g("FinishActivity(dataChanged=", ")", this.f47007a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/userprofile/presentation/a$b;", "Lcom/garmin/android/apps/connectmobile/userprofile/presentation/a;", "Lw12/d;", FirebaseAnalytics.Param.DESTINATION, "<init>", "(Lw12/d;)V", "gcm-profile_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class b extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final w12.d f47008a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(w12.d dVar) {
            super(null);
            dVar.getClass();
            this.f47008a = dVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && s.g(this.f47008a, ((b) obj).f47008a);
        }

        public final int hashCode() {
            return this.f47008a.hashCode();
        }

        public final String toString() {
            return "NavigateTo(destination=" + this.f47008a + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/userprofile/presentation/a$c;", "Lcom/garmin/android/apps/connectmobile/userprofile/presentation/a;", "", "url", "token", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "gcm-profile_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class c extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f47009a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f47010b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, String str2) {
            super(null);
            str.getClass();
            str2.getClass();
            this.f47009a = str;
            this.f47010b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return s.g(this.f47009a, cVar.f47009a) && s.g(this.f47010b, cVar.f47010b);
        }

        public final int hashCode() {
            return this.f47010b.hashCode() + (this.f47009a.hashCode() * 31);
        }

        public final String toString() {
            return e0.g("OpenUrl(url=", this.f47009a, ", token=", this.f47010b, ")");
        }
    }

    public /* synthetic */ a(j jVar) {
        this();
    }

    private a() {
    }
}
