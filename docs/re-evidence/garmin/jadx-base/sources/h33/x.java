package h33;

import ch.qos.logback.core.CoreConstants;

/* JADX INFO: loaded from: classes3.dex */
public final class x {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f81510d = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a0 f81511a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e23.l<x33.c, h0> f81512b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f81513c;

    /* JADX WARN: Multi-variable type inference failed */
    public x(a0 a0Var, e23.l<? super x33.c, ? extends h0> lVar) {
        a0Var.getClass();
        lVar.getClass();
        this.f81511a = a0Var;
        this.f81512b = lVar;
        this.f81513c = a0Var.f81405d || lVar.invoke(u.f81500a) == h0.IGNORE;
    }

    public final String toString() {
        return "JavaTypeEnhancementState(jsr305=" + this.f81511a + ", getReportLevelForAnnotation=" + this.f81512b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
