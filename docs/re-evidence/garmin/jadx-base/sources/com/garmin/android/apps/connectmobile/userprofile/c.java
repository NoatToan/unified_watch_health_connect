package com.garmin.android.apps.connectmobile.userprofile;

import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.userprofile.model.n;
import com.garmin.android.apps.connectmobile.userprofile.model.q;
import j12.k;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import z12.m;
import z12.t;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/userprofile/c;", "Lb32/c;", "<init>", "()V", "a", "gcm-profile_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c extends b32.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f46547b;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/userprofile/c$a;", "Lo12/j$a;", "<init>", "()V", "gcm-profile_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a implements o12.j.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public q f46548a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public k f46549b;

        @Override // o12.j.a
        public final boolean a() {
            if (!c()) {
                return false;
            }
            q qVar = this.f46548a;
            return (qVar != null ? qVar.i() : null) == n.PRIVATE;
        }

        @Override // o12.j.a
        public final int b() {
            return R.string.user_profile_about_private_hint;
        }

        public final boolean c() {
            q qVar = this.f46548a;
            return qVar != null && qVar.getUserId() == ((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).getUserProfilePk();
        }
    }

    public c() {
        a aVar = new a();
        this.f46547b = aVar;
        z(new o12.j(aVar));
        z(new m());
        z(new z12.q());
        z(new t());
    }
}
