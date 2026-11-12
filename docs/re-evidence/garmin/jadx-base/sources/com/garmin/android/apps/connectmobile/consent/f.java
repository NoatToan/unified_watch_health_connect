package com.garmin.android.apps.connectmobile.consent;

import androidx.lifecycle.u1;
import androidx.lifecycle.x1;
import p005kotlin.Metadata;
import r53.p2;
import r53.q2;
import vb.h;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/consent/f;", "Landroidx/lifecycle/u1;", "Lhl/a;", "screenAccessRole", "<init>", "(Lhl/a;)V", "a", "gcm-consent_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class f extends u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hl.a f32284a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p2 f32285b;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/consent/f$a;", "Landroidx/lifecycle/x1$c;", "Lhl/a;", "screenAccessRole", "<init>", "(Lhl/a;)V", "gcm-consent_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a implements x1.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final hl.a f32286a;

        static {
            hl.a.Companion companion = hl.a.INSTANCE;
        }

        public a(hl.a aVar) {
            aVar.getClass();
            this.f32286a = aVar;
        }

        @Override // androidx.lifecycle.x1.c
        public final <T extends u1> T create(Class<T> cls) {
            cls.getClass();
            if (cls.isAssignableFrom(f.class)) {
                return new f(this.f32286a);
            }
            h.z("UnKnown ViewModel class");
            return null;
        }
    }

    public f(hl.a aVar) {
        aVar.getClass();
        this.f32284a = aVar;
        this.f32285b = q2.a(null);
    }
}
