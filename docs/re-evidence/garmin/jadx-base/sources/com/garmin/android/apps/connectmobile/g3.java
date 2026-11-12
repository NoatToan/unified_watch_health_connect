package com.garmin.android.apps.connectmobile;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0087\b\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002:\u0001\u000eB9\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00018\u0000\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lcom/garmin/android/apps/connectmobile/g3;", "T", "", "Lfw/p;", "status", "data", "", "message", "Ljava/lang/Exception;", "exception", "", "responseCode", "<init>", "(Lfw/p;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Exception;Ljava/lang/Integer;)V", "a", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class g3<T> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f35298f = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f35299g = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fw.p f35300a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final T f35301b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f35302c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Exception f35303d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Integer f35304e;

    public g3(fw.p pVar, T t7, String str, Exception exc, Integer num) {
        pVar.getClass();
        this.f35300a = pVar;
        this.f35301b = t7;
        this.f35302c = str;
        this.f35303d = exc;
        this.f35304e = num;
    }

    public static g3 a(g3 g3Var, Object obj) {
        fw.p pVar = g3Var.f35300a;
        String str = g3Var.f35302c;
        Exception exc = g3Var.f35303d;
        Integer num = g3Var.f35304e;
        g3Var.getClass();
        pVar.getClass();
        return new g3(pVar, obj, str, exc, num);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g3)) {
            return false;
        }
        g3 g3Var = (g3) obj;
        return this.f35300a == g3Var.f35300a && p005kotlin.jvm.internal.s.g(this.f35301b, g3Var.f35301b) && p005kotlin.jvm.internal.s.g(this.f35302c, g3Var.f35302c) && p005kotlin.jvm.internal.s.g(this.f35303d, g3Var.f35303d) && p005kotlin.jvm.internal.s.g(this.f35304e, g3Var.f35304e);
    }

    public final int hashCode() {
        int iHashCode = this.f35300a.hashCode() * 31;
        T t7 = this.f35301b;
        int iHashCode2 = (iHashCode + (t7 == null ? 0 : t7.hashCode())) * 31;
        String str = this.f35302c;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Exception exc = this.f35303d;
        int iHashCode4 = (iHashCode3 + (exc == null ? 0 : exc.hashCode())) * 31;
        Integer num = this.f35304e;
        return iHashCode4 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("UIResource(status=");
        sb3.append(this.f35300a);
        sb3.append(", data=");
        sb3.append(this.f35301b);
        sb3.append(", message=");
        sb3.append(this.f35302c);
        sb3.append(", exception=");
        sb3.append(this.f35303d);
        sb3.append(", responseCode=");
        return f3.i(sb3, this.f35304e, ")");
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/g3$a;", "", "<init>", "()V", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static g3 a(a aVar, String str, Exception exc, Object obj, Integer num, int i14) {
            if ((i14 & 1) != 0) {
                str = null;
            }
            if ((i14 & 2) != 0) {
                exc = null;
            }
            if ((i14 & 4) != 0) {
                obj = null;
            }
            Integer num2 = (i14 & 8) != 0 ? null : num;
            aVar.getClass();
            return new g3(fw.p.ERROR, obj, str, exc, num2);
        }

        public static g3 b(Object obj) {
            return new g3(fw.p.LOADING, obj, null, null, null);
        }

        public static /* synthetic */ g3 c(a aVar) {
            aVar.getClass();
            return b(null);
        }

        public static g3 d(Object obj) {
            return new g3(fw.p.SUCCESS, obj, null, null, null);
        }

        public static /* synthetic */ g3 e(a aVar) {
            aVar.getClass();
            return d(null);
        }

        private a() {
        }
    }

    public /* synthetic */ g3(fw.p pVar, Object obj, String str, Exception exc, Integer num, int i14, p005kotlin.jvm.internal.j jVar) {
        this(pVar, obj, str, exc, (i14 & 16) != 0 ? null : num);
    }
}
