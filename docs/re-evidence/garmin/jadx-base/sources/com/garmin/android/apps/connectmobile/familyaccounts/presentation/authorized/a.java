package com.garmin.android.apps.connectmobile.familyaccounts.presentation.authorized;

import androidx.lifecycle.u1;
import androidx.lifecycle.x1;
import c22.a0;
import p005kotlin.Metadata;
import r53.p2;
import r53.q2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0002\n\u000bB!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lcom/garmin/android/apps/connectmobile/familyaccounts/presentation/authorized/a;", "Landroidx/lifecycle/u1;", "", "inviteeId", "Lre0/h;", "familyAccountsService", "Lc22/a0;", "dispatcherProvider", "<init>", "(JLre0/h;Lc22/a0;)V", "a", "b", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a extends u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f35016a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final re0.h f35017b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a0 f35018c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p2 f35019d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p2 f35020e;

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.familyaccounts.presentation.authorized.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/familyaccounts/presentation/authorized/a$a;", "Landroidx/lifecycle/x1$c;", "", "inviteeId", "Lhl/a;", "screenAccessRole", "<init>", "(JLhl/a;)V", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C0596a implements x1.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f35021a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final hl.a f35022b;

        static {
            hl.a.Companion companion = hl.a.INSTANCE;
        }

        public C0596a(long j8, hl.a aVar) {
            aVar.getClass();
            this.f35021a = j8;
            this.f35022b = aVar;
        }

        @Override // androidx.lifecycle.x1.c
        public final <T extends u1> T create(Class<T> cls) {
            cls.getClass();
            if (!cls.isAssignableFrom(a.class)) {
                vb.h.z("UnKnown ViewModel class");
                return null;
            }
            re0.h.f152133t0.getClass();
            return new a(this.f35021a, re0.h.a.a(this.f35022b), null, 4, null);
        }
    }

    static {
        new b(null);
    }

    public a(long j8, re0.h hVar, a0 a0Var) {
        hVar.getClass();
        a0Var.getClass();
        this.f35016a = j8;
        this.f35017b = hVar;
        this.f35018c = a0Var;
        this.f35019d = q2.a(null);
        this.f35020e = q2.a(Boolean.FALSE);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/familyaccounts/presentation/authorized/a$b;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private b() {
        }
    }

    public /* synthetic */ a(long j8, re0.h hVar, a0 a0Var, int i14, p005kotlin.jvm.internal.j jVar) {
        this(j8, hVar, (i14 & 4) != 0 ? new a0(null, null, null, 7, null) : a0Var);
    }
}
