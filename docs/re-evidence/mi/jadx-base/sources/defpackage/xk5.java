package defpackage;

import java.io.File;

/* JADX INFO: loaded from: classes4.dex */
public class xk5<DataType> implements fy6.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x98<DataType> f39211a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DataType f39212b;
    public final cch c;

    public xk5(x98<DataType> x98Var, DataType datatype, cch cchVar) {
        this.f39211a = x98Var;
        this.f39212b = datatype;
        this.c = cchVar;
    }

    @Override // fy6.b
    public boolean a(File file) {
        return this.f39211a.b(this.f39212b, file, this.c);
    }
}
