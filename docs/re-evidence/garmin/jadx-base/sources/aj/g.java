package aj;

import android.os.ParcelFileDescriptor;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes7.dex */
public class g<Data> implements o<File, Data> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d<Data> f3344a;

    public static class a<Data> implements p<File, Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d<Data> f3345a;

        public a(d<Data> dVar) {
            this.f3345a = dVar;
        }

        @Override // aj.p
        public final o<File, Data> d(s sVar) {
            return new g(this.f3345a);
        }
    }

    public static class b extends a<ParcelFileDescriptor> {

        public class a implements d<ParcelFileDescriptor> {
            @Override // aj.g.d
            public final Class<ParcelFileDescriptor> a() {
                return ParcelFileDescriptor.class;
            }

            @Override // aj.g.d
            public final void b(ParcelFileDescriptor parcelFileDescriptor) throws IOException {
                parcelFileDescriptor.close();
            }

            @Override // aj.g.d
            public final ParcelFileDescriptor c(File file) {
                return ParcelFileDescriptor.open(file, 268435456);
            }
        }

        public b() {
            super(new a());
        }
    }

    public static final class c<Data> implements com.bumptech.glide.load.data.d<Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final File f3346a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final d<Data> f3347b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Data f3348c;

        public c(File file, d<Data> dVar) {
            this.f3346a = file;
            this.f3347b = dVar;
        }

        @Override // com.bumptech.glide.load.data.d
        public final Class<Data> a() {
            return this.f3347b.a();
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
            Data data = this.f3348c;
            if (data != null) {
                try {
                    this.f3347b.b(data);
                } catch (IOException unused) {
                }
            }
        }

        /* JADX WARN: Type inference failed for: r2v3, types: [Data, java.lang.Object] */
        @Override // com.bumptech.glide.load.data.d
        public final void d(com.bumptech.glide.g gVar, com.bumptech.glide.load.data.d.a<? super Data> aVar) {
            try {
                Data dataC = this.f3347b.c(this.f3346a);
                this.f3348c = dataC;
                aVar.c(dataC);
            } catch (FileNotFoundException e4) {
                aVar.e(e4);
            }
        }
    }

    public interface d<Data> {
        Class<Data> a();

        void b(Data data);

        Data c(File file);
    }

    public static class e extends a<InputStream> {

        public class a implements d<InputStream> {
            @Override // aj.g.d
            public final Class<InputStream> a() {
                return InputStream.class;
            }

            @Override // aj.g.d
            public final void b(InputStream inputStream) throws IOException {
                inputStream.close();
            }

            @Override // aj.g.d
            public final InputStream c(File file) {
                return new FileInputStream(file);
            }
        }

        public e() {
            super(new a());
        }
    }

    public g(d<Data> dVar) {
        this.f3344a = dVar;
    }

    @Override // aj.o
    public final o.a a(File file, int i14, int i15, ui.h hVar) {
        File file2 = file;
        return new o.a(new pj.d(file2), new c(file2, this.f3344a));
    }

    @Override // aj.o
    public final /* bridge */ /* synthetic */ boolean b(File file) {
        return true;
    }
}
