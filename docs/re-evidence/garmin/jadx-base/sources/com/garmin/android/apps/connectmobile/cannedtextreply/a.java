package com.garmin.android.apps.connectmobile.cannedtextreply;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.room.b0;
import androidx.room.l0;
import c22.d0;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.library.connectdatabase.ConnectDatabase;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import gw.j0;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import o13.m;
import o13.t;
import org.apache.commons.lang3.ArrayUtils;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import zy.f;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0005\u0006\u0007B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/cannedtextreply/a;", "", "Lsd2/c;", "<init>", "()V", "c", "b", "a", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C0505a f31282d = new C0505a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final t f31283e = m.b(new zu1.a(1));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Set<? extends sd2.c> f31284a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Set<? extends sd2.c> f31285b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Set<? extends sd2.c> f31286c;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001B\u001b\u0012\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/cannedtextreply/a$b;", "Lcom/garmin/android/library/backgroundtaskmanagement/b$b;", "", "Lsd2/c;", "Lzy/f;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "<init>", "(Lcom/garmin/android/apps/connectmobile/cannedtextreply/a;Lzy/f;)V", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class b implements com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b<Set<? extends sd2.c>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public f<Set<sd2.c>> f31287a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Set<? extends sd2.c> f31288b;

        public b(a aVar, f<Set<sd2.c>> fVar) {
            fVar.getClass();
            this.f31287a = fVar;
        }

        /* JADX WARN: Code duplicated, block: B:8:0x001c  */
        @Override // com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b
        public final void onComplete(long j8, com.garmin.android.library.backgroundtaskmanagement.b.c cVar) {
            cVar.getClass();
            Set<? extends sd2.c> set = this.f31288b;
            if (set != null) {
                set.getClass();
                if (set.isEmpty()) {
                    f<Set<sd2.c>> fVar = this.f31287a;
                    fVar.getClass();
                    fVar.o(1);
                } else {
                    f<Set<sd2.c>> fVar2 = this.f31287a;
                    fVar2.getClass();
                    fVar2.onSuccess((Set<sd2.c>) this.f31288b);
                }
            } else {
                f<Set<sd2.c>> fVar3 = this.f31287a;
                fVar3.getClass();
                fVar3.o(1);
            }
            this.f31287a = null;
        }

        @Override // com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b
        public final void onResults(long j8, com.garmin.android.library.backgroundtaskmanagement.b.e eVar, Set<? extends sd2.c> set) {
            Set<? extends sd2.c> set2 = set;
            eVar.getClass();
            set2.getClass();
            this.f31288b = set2;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001b\u0012\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/garmin/android/apps/connectmobile/cannedtextreply/a$c;", "Lcom/garmin/android/library/backgroundtaskmanagement/b$b;", "Ljava/lang/Void;", "Lzy/f;", "", "Lsd2/c;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "<init>", "(Lcom/garmin/android/apps/connectmobile/cannedtextreply/a;Lzy/f;)V", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class c implements com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b<Void> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public f<Set<sd2.c>> f31289a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ a f31290b;

        public c(a aVar, f<Set<sd2.c>> fVar) {
            fVar.getClass();
            this.f31290b = aVar;
            this.f31289a = fVar;
        }

        @Override // com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b
        public final void onComplete(long j8, com.garmin.android.library.backgroundtaskmanagement.b.c cVar) {
            cVar.getClass();
            if (cVar == com.garmin.android.library.backgroundtaskmanagement.b.c.SUCCESS) {
                HashSet hashSet = new HashSet();
                a aVar = this.f31290b;
                Set<? extends sd2.c> set = aVar.f31284a;
                if (set != null) {
                    for (sd2.c cVar2 : set) {
                        hashSet.add(new sd2.c(cVar2.f158641a, cVar2.f158642b, cVar2.f158643c, cVar2.f158644d, cVar2.f158645e));
                    }
                }
                Set<? extends sd2.c> set2 = aVar.f31285b;
                if (set2 != null) {
                    for (sd2.c cVar3 : set2) {
                        hashSet.add(new sd2.c(cVar3.f158641a, cVar3.f158642b, cVar3.f158643c, cVar3.f158644d, cVar3.f158645e));
                    }
                }
                Set<? extends sd2.c> set3 = aVar.f31286c;
                if (set3 != null) {
                    for (sd2.c cVar4 : set3) {
                        hashSet.add(new sd2.c(cVar4.f158641a, cVar4.f158642b, cVar4.f158643c, cVar4.f158644d, cVar4.f158645e));
                    }
                }
                f<Set<sd2.c>> fVar = this.f31289a;
                fVar.getClass();
                fVar.onSuccess(hashSet);
            } else if (cVar == com.garmin.android.library.backgroundtaskmanagement.b.c.UNRECOVERABLE) {
                f<Set<sd2.c>> fVar2 = this.f31289a;
                fVar2.getClass();
                fVar2.o(0);
            }
            this.f31289a = null;
        }

        @Override // com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b
        public final void onResults(long j8, com.garmin.android.library.backgroundtaskmanagement.b.e eVar, Void r14) {
            eVar.getClass();
            r14.getClass();
        }
    }

    private a() {
    }

    public static a a() {
        return new a();
    }

    public static ArrayList b(int i14, long j8) {
        rd2.c cVar = (rd2.c) ConnectDatabase.g().e();
        cVar.getClass();
        l0 l0VarE = l0.e(2, "SELECT replyText FROM canned_text_reply WHERE deviceUnitId = ? AND replyType = ? AND isOnDevice ORDER BY replySortOrder ASC");
        l0VarE.h(1, j8);
        l0VarE.h(2, i14);
        b0 b0Var = cVar.f152036a;
        b0Var.assertNotSuspendingTransaction();
        Cursor cursorQuery = b0Var.query(l0VarE, (CancellationSignal) null);
        try {
            ArrayList arrayList = new ArrayList(cursorQuery.getCount());
            while (cursorQuery.moveToNext()) {
                arrayList.add(cursorQuery.getString(0));
            }
            cursorQuery.close();
            l0VarE.release();
            return arrayList;
        } catch (Throwable th3) {
            cursorQuery.close();
            l0VarE.release();
            throw th3;
        }
    }

    public final void c(k22.b bVar, long j8, String str, f fVar, int... iArr) {
        Set<? extends sd2.c> setA;
        Set<? extends sd2.c> setA2;
        Set<? extends sd2.c> setA3;
        if (ArrayUtils.contains(iArr, 0)) {
            d0.f23017a.getClass();
            setA = d0.a.a(bVar, j8, str, 0);
        } else {
            setA = null;
        }
        this.f31284a = setA;
        if (ArrayUtils.contains(iArr, 1)) {
            d0.f23017a.getClass();
            setA2 = d0.a.a(bVar, j8, str, 1);
        } else {
            setA2 = null;
        }
        this.f31285b = setA2;
        if (ArrayUtils.contains(iArr, 3)) {
            d0.f23017a.getClass();
            setA3 = d0.a.a(bVar, j8, str, 3);
        } else {
            setA3 = null;
        }
        this.f31286c = setA3;
        if (this.f31284a == null && this.f31285b == null && setA3 == null) {
            if (fVar != null) {
                fVar.o(2);
            }
            i2.a aVar = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar.getClass();
            i2.a.f(a2Var, "CannedTextReplyManager", "initDefaultCannedTextReplies: Loading default canned text replies from resources FAILED! Fix me developer!");
            return;
        }
        cw.f.f55917b.getClass();
        cw.f fVar2 = (cw.f) cw.f.f55918c.getValue();
        Set<? extends sd2.c> set = this.f31284a;
        Set<? extends sd2.c> set2 = this.f31285b;
        Set<? extends sd2.c> set3 = this.f31286c;
        c cVar = fVar != null ? new c(this, fVar) : null;
        fVar2.getClass();
        com.garmin.android.library.backgroundtaskmanagement.c.d(new j0(j8, set, set2, set3, true, fVar2), cVar);
    }

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.cannedtextreply.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/cannedtextreply/a$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C0505a {
        public /* synthetic */ C0505a(j jVar) {
            this();
        }

        public static a a() {
            return (a) a.f31283e.getValue();
        }

        private C0505a() {
        }
    }
}
