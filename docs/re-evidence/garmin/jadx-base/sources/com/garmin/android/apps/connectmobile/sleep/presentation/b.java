package com.garmin.android.apps.connectmobile.sleep.presentation;

import i63.h;
import m63.u1;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import ro0.i;
import ro0.l;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \r2\u00020\u00012\u00020\u0001:\u0002\u000e\u000fB\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/garmin/android/apps/connectmobile/sleep/presentation/b;", "", "Lcom/garmin/android/apps/connectmobile/sleep/presentation/a$b;", "data", "Lro0/i;", "extras", "<init>", "(Lcom/garmin/android/apps/connectmobile/sleep/presentation/a$b;Lro0/i;)V", "", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILcom/garmin/android/apps/connectmobile/sleep/presentation/a$b;Lro0/i;Lm63/u1;)V", "Companion", "a", "b", "gcm-sleep_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@h
public final /* data */ class b {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.garmin.android.apps.connectmobile.sleep.presentation.a.b f44273a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f44274b;

    static {
        i.Companion bVar = i.INSTANCE;
    }

    public b(int i14, com.garmin.android.apps.connectmobile.sleep.presentation.a.b bVar, i iVar, u1 u1Var) {
        if ((i14 & 1) == 0) {
            this.f44273a = new com.garmin.android.apps.connectmobile.sleep.presentation.a.b(false, false, false, false, (com.garmin.android.apps.connectmobile.sleep.presentation.a.d) null, 31, (j) null);
        } else {
            this.f44273a = bVar;
        }
        if ((i14 & 2) != 0) {
            this.f44274b = iVar;
        } else {
            sn1.b.f160414a.getClass();
            this.f44274b = new i(l.SLEEP_ENHANCED, null);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return s.g(this.f44273a, bVar.f44273a) && s.g(this.f44274b, bVar.f44274b);
    }

    public final int hashCode() {
        return this.f44274b.hashCode() + (this.f44273a.hashCode() * 31);
    }

    public final String toString() {
        return "Help(data=" + this.f44273a + ", extras=" + this.f44274b + ")";
    }

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.sleep.presentation.b$b, reason: collision with other inner class name and from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/sleep/presentation/b$b;", "", "<init>", "()V", "Li63/c;", "Lcom/garmin/android/apps/connectmobile/sleep/presentation/b;", "serializer", "()Li63/c;", "gcm-sleep_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(j jVar) {
            this();
        }

        public final i63.c<b> serializer() {
            return a.f44275a;
        }

        private Companion() {
        }
    }

    public b() {
        this((com.garmin.android.apps.connectmobile.sleep.presentation.a.b) null, (i) null, 3, (j) null);
    }

    public b(com.garmin.android.apps.connectmobile.sleep.presentation.a.b bVar, i iVar) {
        bVar.getClass();
        iVar.getClass();
        this.f44273a = bVar;
        this.f44274b = iVar;
    }

    public b(com.garmin.android.apps.connectmobile.sleep.presentation.a.b bVar, i iVar, int i14, j jVar) {
        if ((i14 & 1) != 0) {
            bVar = new com.garmin.android.apps.connectmobile.sleep.presentation.a.b(false, false, false, false, (com.garmin.android.apps.connectmobile.sleep.presentation.a.d) null, 31, (j) null);
        }
        if ((i14 & 2) != 0) {
            sn1.b.f160414a.getClass();
            iVar = new i(l.SLEEP_ENHANCED, null);
        }
        this(bVar, iVar);
    }
}
