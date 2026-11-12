package com.garmin.android.apps.connectmobile.userprofile.presentation;

import com.garmin.android.apps.connectmobile.activities.PrivacyType;
import m12.t;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0006\u0007\b\tB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0001\u0004\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lcom/garmin/android/apps/connectmobile/userprofile/presentation/f;", "", "Lm12/t;", "sourceItem", "<init>", "(Lm12/t;)V", "d", "c", "b", "a", "Lcom/garmin/android/apps/connectmobile/userprofile/presentation/f$a;", "Lcom/garmin/android/apps/connectmobile/userprofile/presentation/f$b;", "Lcom/garmin/android/apps/connectmobile/userprofile/presentation/f$c;", "Lcom/garmin/android/apps/connectmobile/userprofile/presentation/f$d;", "gcm-profile_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f47071a;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/userprofile/presentation/f$a;", "Lcom/garmin/android/apps/connectmobile/userprofile/presentation/f;", "Lm12/t;", "sourceItem", "<init>", "(Lm12/t;)V", "gcm-profile_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class a extends f {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final t f47072b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(t tVar) {
            super(tVar, null);
            tVar.getClass();
            this.f47072b = tVar;
        }

        @Override // com.garmin.android.apps.connectmobile.userprofile.presentation.f
        /* JADX INFO: renamed from: a, reason: from getter */
        public final t getF47071a() {
            return this.f47072b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.f47072b == ((a) obj).f47072b;
        }

        public final int hashCode() {
            return this.f47072b.hashCode();
        }

        public final String toString() {
            return "Navigate(sourceItem=" + this.f47072b + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/userprofile/presentation/f$b;", "Lcom/garmin/android/apps/connectmobile/userprofile/presentation/f;", "Lm12/t;", "sourceItem", "Lcom/garmin/android/apps/connectmobile/activities/PrivacyType;", "privacy", "<init>", "(Lm12/t;Lcom/garmin/android/apps/connectmobile/activities/PrivacyType;)V", "gcm-profile_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class b extends f {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final t f47073b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final PrivacyType f47074c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(t tVar, PrivacyType privacyType) {
            super(tVar, null);
            tVar.getClass();
            privacyType.getClass();
            this.f47073b = tVar;
            this.f47074c = privacyType;
        }

        @Override // com.garmin.android.apps.connectmobile.userprofile.presentation.f
        /* JADX INFO: renamed from: a, reason: from getter */
        public final t getF47071a() {
            return this.f47073b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f47073b == bVar.f47073b && this.f47074c == bVar.f47074c;
        }

        public final int hashCode() {
            return this.f47074c.hashCode() + (this.f47073b.hashCode() * 31);
        }

        public final String toString() {
            return "PrivacyChanged(sourceItem=" + this.f47073b + ", privacy=" + this.f47074c + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/userprofile/presentation/f$c;", "Lcom/garmin/android/apps/connectmobile/userprofile/presentation/f;", "Lm12/t;", "sourceItem", "", "enabled", "<init>", "(Lm12/t;Z)V", "gcm-profile_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class c extends f {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final t f47075b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f47076c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(t tVar, boolean z14) {
            super(tVar, null);
            tVar.getClass();
            this.f47075b = tVar;
            this.f47076c = z14;
        }

        @Override // com.garmin.android.apps.connectmobile.userprofile.presentation.f
        /* JADX INFO: renamed from: a, reason: from getter */
        public final t getF47071a() {
            return this.f47075b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f47075b == cVar.f47075b && this.f47076c == cVar.f47076c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f47076c) + (this.f47075b.hashCode() * 31);
        }

        public final String toString() {
            return "SwitchChanged(sourceItem=" + this.f47075b + ", enabled=" + this.f47076c + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/userprofile/presentation/f$d;", "Lcom/garmin/android/apps/connectmobile/userprofile/presentation/f;", "Lm12/t;", "sourceItem", "", "value", "<init>", "(Lm12/t;Ljava/lang/String;)V", "gcm-profile_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class d extends f {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final t f47077b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f47078c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(t tVar, String str) {
            super(tVar, null);
            tVar.getClass();
            str.getClass();
            this.f47077b = tVar;
            this.f47078c = str;
        }

        @Override // com.garmin.android.apps.connectmobile.userprofile.presentation.f
        /* JADX INFO: renamed from: a, reason: from getter */
        public final t getF47071a() {
            return this.f47077b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.f47077b == dVar.f47077b && s.g(this.f47078c, dVar.f47078c);
        }

        public final int hashCode() {
            return this.f47078c.hashCode() + (this.f47077b.hashCode() * 31);
        }

        public final String toString() {
            return "TextChanged(sourceItem=" + this.f47077b + ", value=" + this.f47078c + ")";
        }
    }

    private f(t tVar) {
        this.f47071a = tVar;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public t getF47071a() {
        return this.f47071a;
    }

    public /* synthetic */ f(t tVar, j jVar) {
        this(tVar);
    }
}
