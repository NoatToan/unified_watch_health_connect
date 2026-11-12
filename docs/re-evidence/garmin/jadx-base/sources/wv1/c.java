package wv1;

import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0006\u0007\bB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0001\u0003\t\n\u000b¨\u0006\f"}, d2 = {"Lwv1/c;", "", "", "route", "<init>", "(Ljava/lang/String;)V", "b", "a", "c", "Lwv1/c$a;", "Lwv1/c$b;", "Lwv1/c$c;", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f187457a;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lwv1/c$a;", "Lwv1/c;", "<init>", "()V", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class a extends c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f187458b = new a();

        private a() {
            super("continue_training", null);
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 272481218;
        }

        public final String toString() {
            return "ContinueTraining";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lwv1/c$b;", "Lwv1/c;", "<init>", "()V", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class b extends c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final b f187459b = new b();

        private b() {
            super("progress_report", null);
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 930194444;
        }

        public final String toString() {
            return "HomeScreen";
        }
    }

    /* JADX INFO: renamed from: wv1.c$c, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lwv1/c$c;", "Lwv1/c;", "<init>", "()V", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class C3487c extends c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final C3487c f187460b = new C3487c();

        private C3487c() {
            super("plan_creation", null);
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof C3487c);
        }

        public final int hashCode() {
            return -394750263;
        }

        public final String toString() {
            return "PlanCreation";
        }
    }

    private c(String str) {
        this.f187457a = str;
    }

    public /* synthetic */ c(String str, j jVar) {
        this(str);
    }
}
