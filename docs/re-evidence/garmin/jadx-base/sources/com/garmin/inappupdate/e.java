package com.garmin.inappupdate;

import am.j;
import b63.l;
import b63.u;
import b63.z;
import h63.i;
import i63.h;
import l63.f;
import m63.e0;
import m63.k1;
import m63.m1;
import m63.u1;
import m63.y1;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import wr.g;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00132\u00020\u0001:\u0002\u0014\u0015B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fB\u0019\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\rBM\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u000b\u0010\u0012¨\u0006\u0016"}, d2 = {"Lcom/garmin/inappupdate/e;", "", "Lcom/garmin/inappupdate/d;", "promptType", "Lcom/garmin/inappupdate/c;", "priority", "", "version", "Lb63/l;", "recentTimePromptedFor", "appVersionWhenPrompted", "<init>", "(Lcom/garmin/inappupdate/d;Lcom/garmin/inappupdate/c;Ljava/lang/String;Lb63/l;Ljava/lang/String;)V", "(Lcom/garmin/inappupdate/c;Ljava/lang/String;)V", "", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILcom/garmin/inappupdate/d;Lcom/garmin/inappupdate/c;Ljava/lang/String;Lb63/l;Ljava/lang/String;Lm63/u1;)V", "Companion", "a", "b", "in-app-update_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@h
public final /* data */ class e {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final i63.c<Object>[] f52421f = {d.INSTANCE.serializer(), c.INSTANCE.serializer(), null, null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public d f52422a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f52423b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f52424c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final l f52425d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f52426e;

    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/inappupdate/Update.$serializer", "Lm63/e0;", "Lcom/garmin/inappupdate/e;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "in-app-update_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @o13.e
    public /* synthetic */ class a implements e0<e> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f52427a;
        private static final k63.e descriptor;

        static {
            a aVar = new a();
            f52427a = aVar;
            m1 m1Var = new m1("com.garmin.inappupdate.Update", aVar, 5);
            m1Var.j("promptType", false);
            m1Var.j("priority", false);
            m1Var.j("version", false);
            m1Var.j("recentTimePromptedFor", false);
            m1Var.j("appVersionWhenPrompted", false);
            descriptor = m1Var;
        }

        private a() {
        }

        @Override // m63.e0
        public final i63.c<?>[] childSerializers() {
            i63.c<?>[] cVarArr = e.f52421f;
            i63.c<?> cVar = cVarArr[0];
            i63.c<?> cVar2 = cVarArr[1];
            y1 y1Var = y1.f117048a;
            return new i63.c[]{cVar, cVar2, y1Var, i.f82300a, y1Var};
        }

        @Override // i63.b
        public final Object deserialize(l63.e eVar) {
            eVar.getClass();
            k63.e eVar2 = descriptor;
            l63.c cVarC = eVar.c(eVar2);
            i63.c<Object>[] cVarArr = e.f52421f;
            int i14 = l63.c.f110557a;
            boolean z14 = true;
            int i15 = 0;
            d dVar = null;
            c cVar = null;
            String strR = null;
            l lVar = null;
            String strR2 = null;
            while (z14) {
                int iE = cVarC.e(eVar2);
                if (iE == -1) {
                    z14 = false;
                } else if (iE == 0) {
                    dVar = (d) cVarC.l(eVar2, 0, cVarArr[0], dVar);
                    i15 |= 1;
                } else if (iE == 1) {
                    cVar = (c) cVarC.l(eVar2, 1, cVarArr[1], cVar);
                    i15 |= 2;
                } else if (iE == 2) {
                    strR = cVarC.r(eVar2, 2);
                    i15 |= 4;
                } else if (iE == 3) {
                    lVar = (l) cVarC.l(eVar2, 3, i.f82300a, lVar);
                    i15 |= 8;
                } else {
                    if (iE != 4) {
                        hb.a.o(iE);
                        return null;
                    }
                    strR2 = cVarC.r(eVar2, 4);
                    i15 |= 16;
                }
            }
            cVarC.b(eVar2);
            return new e(i15, dVar, cVar, strR, lVar, strR2, null);
        }

        @Override // i63.i, i63.b
        /* JADX INFO: renamed from: getDescriptor */
        public final k63.e getF158591b() {
            return descriptor;
        }

        @Override // i63.i
        public final void serialize(f fVar, Object obj) {
            e eVar = (e) obj;
            eVar.getClass();
            k63.e eVar2 = descriptor;
            l63.d dVarC = fVar.c(eVar2);
            i63.c<Object>[] cVarArr = e.f52421f;
            dVarC.e(eVar2, 0, cVarArr[0], eVar.f52422a);
            dVarC.e(eVar2, 1, cVarArr[1], eVar.f52423b);
            dVarC.k(eVar2, 2, eVar.f52424c);
            dVarC.e(eVar2, 3, i.f82300a, eVar.f52425d);
            dVarC.k(eVar2, 4, eVar.f52426e);
            dVarC.b(eVar2);
        }

        @Override // m63.e0
        public final i63.c<?>[] typeParametersSerializers() {
            return k1.f116970b;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public e(c cVar, String str) {
        this(d.NONE, cVar, str, b63.a.C0229a.f16171a.a(), new zy2.a().getInfo().f52812b);
        cVar.getClass();
        str.getClass();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f52422a == eVar.f52422a && this.f52423b == eVar.f52423b && s.g(this.f52424c, eVar.f52424c) && s.g(this.f52425d, eVar.f52425d) && s.g(this.f52426e, eVar.f52426e);
    }

    public final int hashCode() {
        return this.f52426e.hashCode() + g.k(this.f52425d.f16204a, g.j((this.f52423b.hashCode() + (this.f52422a.hashCode() * 31)) * 31, 31, this.f52424c), 31);
    }

    public final String toString() {
        String strName = this.f52422a.name();
        String strName2 = this.f52423b.name();
        z.INSTANCE.getClass();
        u uVarD = b63.b.d(this.f52425d, z.f16226b);
        StringBuilder sbI = p6.b.i("Update(promptType=", strName, ", priority=", strName2, ", version='");
        sbI.append(this.f52424c);
        sbI.append("', recentTimePromptedFor=");
        sbI.append(uVarD);
        sbI.append(", appVersionWhenPrompted='");
        return j.o(this.f52426e, "')", sbI);
    }

    /* JADX INFO: renamed from: com.garmin.inappupdate.e$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/garmin/inappupdate/e$b;", "", "<init>", "()V", "Li63/c;", "Lcom/garmin/inappupdate/e;", "serializer", "()Li63/c;", "in-app-update_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final i63.c<e> serializer() {
            return a.f52427a;
        }

        public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
            this();
        }
    }

    public e(d dVar, c cVar, String str, l lVar, String str2) {
        dVar.getClass();
        cVar.getClass();
        str.getClass();
        lVar.getClass();
        str2.getClass();
        this.f52422a = dVar;
        this.f52423b = cVar;
        this.f52424c = str;
        this.f52425d = lVar;
        this.f52426e = str2;
    }

    public /* synthetic */ e(int i14, d dVar, c cVar, String str, l lVar, String str2, u1 u1Var) {
        if (31 != (i14 & 31)) {
            k1.h(i14, 31, a.f52427a.getF158591b());
            throw null;
        }
        this.f52422a = dVar;
        this.f52423b = cVar;
        this.f52424c = str;
        this.f52425d = lVar;
        this.f52426e = str2;
    }
}
