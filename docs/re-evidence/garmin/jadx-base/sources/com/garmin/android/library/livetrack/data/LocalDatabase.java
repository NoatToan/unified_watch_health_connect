package com.garmin.android.library.livetrack.data;

import android.content.Context;
import androidx.room.b0;
import androidx.room.x;
import o13.r;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import v13.c;
import vb.h;
import wd2.i2;
import xd2.c1;
import zd2.d;
import zd2.f;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b!\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/library/livetrack/data/LocalDatabase;", "Landroidx/room/b0;", "<init>", "()V", "a", "livetrack_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class LocalDatabase extends b0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static LocalDatabase f50199b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f50198a = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Logger f50200c = i2.a("LocalDatabase");

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0056, code lost:
    
        if (r6.b(r0) == r1) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(c cVar) {
        c1 c1Var;
        if (cVar instanceof c1) {
            c1Var = (c1) cVar;
            int i14 = c1Var.f190071c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                c1Var.f190071c = i14 - Integer.MIN_VALUE;
            } else {
                c1Var = new c1(this, cVar);
            }
        } else {
            c1Var = new c1(this, cVar);
        }
        Object obj = c1Var.f190069a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = c1Var.f190071c;
        if (i15 == 0) {
            r.b(obj);
            f50200c.debug("Deleting all data");
            d dVarG = g();
            c1Var.f190071c = 1;
            if (dVarG.b(c1Var) != aVar) {
            }
            return aVar;
        }
        if (i15 == 1) {
            r.b(obj);
        } else {
            if (i15 != 2) {
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
        }
        return Unit.INSTANCE;
        f fVarH = h();
        c1Var.f190071c = 2;
    }

    public abstract zd2.a f();

    public abstract d g();

    public abstract f h();

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0018\u0010\t\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/garmin/android/library/livetrack/data/LocalDatabase$a;", "", "<init>", "()V", "", "DATABASE_NAME", "Ljava/lang/String;", "TAG", "Lcom/garmin/android/library/livetrack/data/LocalDatabase;", "database", "Lcom/garmin/android/library/livetrack/data/LocalDatabase;", "Lorg/slf4j/Logger;", "logger", "Lorg/slf4j/Logger;", "livetrack_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        public final synchronized LocalDatabase a(Context context) {
            LocalDatabase localDatabase;
            context.getClass();
            localDatabase = LocalDatabase.f50199b;
            if (localDatabase == null) {
                Context applicationContext = context.getApplicationContext();
                applicationContext.getClass();
                b0.a aVarA = x.a(applicationContext, LocalDatabase.class, "livetrack-database");
                aVarA.c();
                b0 b0VarB = aVarA.b();
                LocalDatabase.f50200c.debug("Created database instance");
                LocalDatabase.f50199b = (LocalDatabase) b0VarB;
                localDatabase = (LocalDatabase) b0VarB;
            }
            return localDatabase;
        }

        private a() {
        }
    }
}
