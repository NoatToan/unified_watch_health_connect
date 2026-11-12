package defpackage;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes4.dex */
public interface uif {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final uif f35791a = new a();

    public class a implements uif {
        @Override // defpackage.uif
        public long a() {
            throw new NoSuchElementException();
        }

        @Override // defpackage.uif
        public long b() {
            throw new NoSuchElementException();
        }

        @Override // defpackage.uif
        public boolean next() {
            return false;
        }
    }

    long a();

    long b();

    boolean next();
}
