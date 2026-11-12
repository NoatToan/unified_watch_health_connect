package defpackage;

import android.util.Log;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes4.dex */
public class c73 implements d7g<File, ByteBuffer> {

    public static final class a implements jl5<ByteBuffer> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final File f5007a;

        public a(File file) {
            this.f5007a = file;
        }

        @Override // defpackage.jl5
        public Class<ByteBuffer> a() {
            return ByteBuffer.class;
        }

        @Override // defpackage.jl5
        public void b() {
        }

        @Override // defpackage.jl5
        public void c(Priority priority, jl5.a<? super ByteBuffer> aVar) {
            try {
                aVar.e(f73.a(this.f5007a));
            } catch (IOException e) {
                Log.isLoggable("ByteBufferFileLoader", 3);
                aVar.f(e);
            }
        }

        @Override // defpackage.jl5
        public void cancel() {
        }

        @Override // defpackage.jl5
        public DataSource d() {
            return DataSource.LOCAL;
        }
    }

    public static class b implements e7g<File, ByteBuffer> {
        @Override // defpackage.e7g
        public void c() {
        }

        @Override // defpackage.e7g
        public d7g<File, ByteBuffer> d(iag iagVar) {
            return new c73();
        }
    }

    @Override // defpackage.d7g
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public d7g.a<ByteBuffer> b(File file, int i, int i2, cch cchVar) {
        return new d7g.a<>(new b4h(file), new a(file));
    }

    @Override // defpackage.d7g
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(File file) {
        return true;
    }
}
