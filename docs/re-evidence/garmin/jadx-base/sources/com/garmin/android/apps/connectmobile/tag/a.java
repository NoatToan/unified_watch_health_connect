package com.garmin.android.apps.connectmobile.tag;

import com.garmin.android.apps.connectmobile.f3;
import java.util.List;
import p005kotlin.Metadata;
import tn.k;

/* JADX INFO: loaded from: classes10.dex */
public interface a {

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.tag.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/tag/a$a;", "Lcom/garmin/android/apps/connectmobile/tag/a$b;", "Ljava/lang/Exception;", "exception", "<init>", "(Ljava/lang/Exception;)V", "gcm-common-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class C0860a implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Exception f45055a;

        public C0860a(Exception exc) {
            exc.getClass();
            this.f45055a = exc;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0860a) && this.f45055a.equals(((C0860a) obj).f45055a);
        }

        public final int hashCode() {
            return this.f45055a.hashCode();
        }

        public final String toString() {
            return f3.h(this.f45055a, "Error(exception=", ")");
        }
    }

    public interface b extends a {
    }

    public interface c extends a {
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/tag/a$d;", "Lcom/garmin/android/apps/connectmobile/tag/a$c;", "<init>", "()V", "gcm-common-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class d implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f45056a = new d();

        private d() {
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/tag/a$e;", "Lcom/garmin/android/apps/connectmobile/tag/a$b;", "<init>", "()V", "gcm-common-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class e implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f45057a = new e();

        private e() {
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/tag/a$f;", "Lcom/garmin/android/apps/connectmobile/tag/a$c;", "", "Lds1/a;", "list", "<init>", "(Ljava/util/List;)V", "gcm-common-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class f implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<ds1.a> f45058a;

        public f(List<ds1.a> list) {
            list.getClass();
            this.f45058a = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && this.f45058a.equals(((f) obj).f45058a);
        }

        public final int hashCode() {
            return this.f45058a.hashCode();
        }

        public final String toString() {
            return k.h("ResultAvailable(list=", ")", this.f45058a);
        }
    }
}
