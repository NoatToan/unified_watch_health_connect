package defpackage;

import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes4.dex */
public class rl9<Data> implements d7g<File, Data> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d<Data> f32666a;

    public static class a<Data> implements e7g<File, Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d<Data> f32667a;

        public a(d<Data> dVar) {
            this.f32667a = dVar;
        }

        @Override // defpackage.e7g
        public final void c() {
        }

        @Override // defpackage.e7g
        public final d7g<File, Data> d(iag iagVar) {
            return new rl9(this.f32667a);
        }
    }

    public static class b extends a<ParcelFileDescriptor> {

        public class a implements d<ParcelFileDescriptor> {
            @Override // rl9.d
            public Class<ParcelFileDescriptor> a() {
                return ParcelFileDescriptor.class;
            }

            @Override // rl9.d
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public void close(ParcelFileDescriptor parcelFileDescriptor) throws IOException {
                parcelFileDescriptor.close();
            }

            @Override // rl9.d
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public ParcelFileDescriptor b(File file) throws FileNotFoundException {
                return ParcelFileDescriptor.open(file, 268435456);
            }
        }

        public b() {
            super(new a());
        }
    }

    public static final class c<Data> implements jl5<Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final File f32668a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final d<Data> f32669b;
        public Data c;

        public c(File file, d<Data> dVar) {
            this.f32668a = file;
            this.f32669b = dVar;
        }

        @Override // defpackage.jl5
        public Class<Data> a() {
            return this.f32669b.a();
        }

        @Override // defpackage.jl5
        public void b() {
            Data data = this.c;
            if (data != null) {
                try {
                    this.f32669b.close(data);
                } catch (IOException unused) {
                }
            }
        }

        /* JADX WARN: Type inference failed for: r3v3, types: [Data, java.lang.Object] */
        @Override // defpackage.jl5
        public void c(Priority priority, jl5.a<? super Data> aVar) {
            try {
                Data dataB = this.f32669b.b(this.f32668a);
                this.c = dataB;
                aVar.e(dataB);
            } catch (FileNotFoundException e) {
                Log.isLoggable("FileLoader", 3);
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

    public interface d<Data> {
        Class<Data> a();

        Data b(File file) throws FileNotFoundException;

        void close(Data data) throws IOException;
    }

    public static class e extends a<InputStream> {

        public class a implements d<InputStream> {
            @Override // rl9.d
            public Class<InputStream> a() {
                return InputStream.class;
            }

            @Override // rl9.d
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public void close(InputStream inputStream) throws IOException {
                inputStream.close();
            }

            @Override // rl9.d
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public InputStream b(File file) throws FileNotFoundException {
                return new FileInputStream(file);
            }
        }

        public e() {
            super(new a());
        }
    }

    public rl9(d<Data> dVar) {
        this.f32666a = dVar;
    }

    @Override // defpackage.d7g
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public d7g.a<Data> b(File file, int i, int i2, cch cchVar) {
        return new d7g.a<>(new b4h(file), new c(file, this.f32666a));
    }

    @Override // defpackage.d7g
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(File file) {
        return true;
    }
}
