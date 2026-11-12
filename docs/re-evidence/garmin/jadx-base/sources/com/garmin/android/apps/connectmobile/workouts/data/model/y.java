package com.garmin.android.apps.connectmobile.workouts.data.model;

import com.garmin.android.apps.connectmobile.f3;
import java.util.List;
import lc.u0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/garmin/android/apps/connectmobile/workouts/data/model/y;", "", "<init>", "()V", "a", "c", "b", "Lcom/garmin/android/apps/connectmobile/workouts/data/model/y$a;", "Lcom/garmin/android/apps/connectmobile/workouts/data/model/y$b;", "Lcom/garmin/android/apps/connectmobile/workouts/data/model/y$c;", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class y {

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/workouts/data/model/y$a;", "Lcom/garmin/android/apps/connectmobile/workouts/data/model/y;", "", "Lsd2/f;", "screenlessDevices", "screenDevices", "", "hasGCPlusSubscriptionActive", "isEligibleForGCPlusSubscription", "<init>", "(Ljava/util/List;Ljava/util/List;ZZ)V", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class a extends y {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<sd2.f> f48350a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List<sd2.f> f48351b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f48352c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f48353d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(List<? extends sd2.f> list, List<? extends sd2.f> list2, boolean z14, boolean z15) {
            super(null);
            list.getClass();
            list2.getClass();
            this.f48350a = list;
            this.f48351b = list2;
            this.f48352c = z14;
            this.f48353d = z15;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return p005kotlin.jvm.internal.s.g(this.f48350a, aVar.f48350a) && p005kotlin.jvm.internal.s.g(this.f48351b, aVar.f48351b) && this.f48352c == aVar.f48352c && this.f48353d == aVar.f48353d;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f48353d) + q6.f.g(u0.b(this.f48350a.hashCode() * 31, 31, this.f48351b), 31, this.f48352c);
        }

        public final String toString() {
            return com.airbnb.lottie.animation.keyframe.a.f(", isEligibleForGCPlusSubscription=", ")", f3.k("MultiDevice(screenlessDevices=", ", screenDevices=", ", hasGCPlusSubscriptionActive=", this.f48350a, this.f48351b), this.f48352c, this.f48353d);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/workouts/data/model/y$b;", "Lcom/garmin/android/apps/connectmobile/workouts/data/model/y;", "", "Lsd2/f;", "devices", "<init>", "(Ljava/util/List;)V", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class b extends y {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<sd2.f> f48354a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(List<? extends sd2.f> list) {
            super(null);
            list.getClass();
            this.f48354a = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && p005kotlin.jvm.internal.s.g(this.f48354a, ((b) obj).f48354a);
        }

        public final int hashCode() {
            return this.f48354a.hashCode();
        }

        public final String toString() {
            return tn.k.h("ScreenOnly(devices=", ")", this.f48354a);
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/garmin/android/apps/connectmobile/workouts/data/model/y$c;", "Lcom/garmin/android/apps/connectmobile/workouts/data/model/y;", "", "Lsd2/f;", "devices", "", "hasGCPlusSubscriptionActive", "isEligibleForGCPlusSubscription", "<init>", "(Ljava/util/List;ZZ)V", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class c extends y {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<sd2.f> f48355a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f48356b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f48357c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(List<? extends sd2.f> list, boolean z14, boolean z15) {
            super(null);
            list.getClass();
            this.f48355a = list;
            this.f48356b = z14;
            this.f48357c = z15;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return p005kotlin.jvm.internal.s.g(this.f48355a, cVar.f48355a) && this.f48356b == cVar.f48356b && this.f48357c == cVar.f48357c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f48357c) + q6.f.g(this.f48355a.hashCode() * 31, 31, this.f48356b);
        }

        public final String toString() {
            StringBuilder sb3 = new StringBuilder("ScreenlessOnly(devices=");
            sb3.append(this.f48355a);
            sb3.append(", hasGCPlusSubscriptionActive=");
            sb3.append(this.f48356b);
            sb3.append(", isEligibleForGCPlusSubscription=");
            return hb.a.k(sb3, this.f48357c, ")");
        }
    }

    public /* synthetic */ y(p005kotlin.jvm.internal.j jVar) {
        this();
    }

    public final boolean a() {
        if (this instanceof a) {
            return ((a) this).f48352c;
        }
        if (this instanceof c) {
            return ((c) this).f48356b;
        }
        return false;
    }

    public final boolean b() {
        if (this instanceof a) {
            return ((a) this).f48353d;
        }
        if (this instanceof c) {
            return ((c) this).f48357c;
        }
        return false;
    }

    private y() {
    }
}
