package aj;

import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes7.dex */
public class d implements o<File, ByteBuffer> {

    public static final class a implements com.bumptech.glide.load.data.d<ByteBuffer> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final File f3328a;

        public a(File file) {
            this.f3328a = file;
        }

        @Override // com.bumptech.glide.load.data.d
        public final Class<ByteBuffer> a() {
            return ByteBuffer.class;
        }

        @Override // com.bumptech.glide.load.data.d
        public final ui.a b() {
            return ui.a.LOCAL;
        }

        @Override // com.bumptech.glide.load.data.d
        public final void cancel() {
        }

        @Override // com.bumptech.glide.load.data.d
        public final void cleanup() {
        }

        @Override // com.bumptech.glide.load.data.d
        public final void d(com.bumptech.glide.g gVar, com.bumptech.glide.load.data.d.a<? super ByteBuffer> aVar) {
            try {
                aVar.c(qj.a.a(this.f3328a));
            } catch (IOException e4) {
                aVar.e(e4);
            }
        }
    }

    public static class b implements p<File, ByteBuffer> {
        @Override // aj.p
        public final o<File, ByteBuffer> d(s sVar) {
            return new d();
        }
    }

    @Override // aj.o
    public final o.a<ByteBuffer> a(File file, int i14, int i15, ui.h hVar) {
        File file2 = file;
        return new o.a<>(new pj.d(file2), new a(file2));
    }

    @Override // aj.o
    public final /* bridge */ /* synthetic */ boolean b(File file) {
        return true;
    }
}
