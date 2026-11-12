package defpackage;

import android.util.Base64;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes4.dex */
public final class np5<Model, Data> implements d7g<Model, Data> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a<Data> f28217a;

    public interface a<Data> {
        Class<Data> a();

        Data b(String str) throws IllegalArgumentException;

        void close(Data data) throws IOException;
    }

    public static final class b<Data> implements jl5<Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f28218a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final a<Data> f28219b;
        public Data c;

        public b(String str, a<Data> aVar) {
            this.f28218a = str;
            this.f28219b = aVar;
        }

        @Override // defpackage.jl5
        public Class<Data> a() {
            return this.f28219b.a();
        }

        @Override // defpackage.jl5
        public void b() {
            try {
                this.f28219b.close(this.c);
            } catch (IOException unused) {
            }
        }

        /* JADX WARN: Type inference failed for: r2v3, types: [Data, java.lang.Object] */
        @Override // defpackage.jl5
        public void c(Priority priority, jl5.a<? super Data> aVar) {
            try {
                Data dataB = this.f28219b.b(this.f28218a);
                this.c = dataB;
                aVar.e(dataB);
            } catch (IllegalArgumentException e) {
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

    public static final class c<Model> implements e7g<Model, InputStream> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final a<InputStream> f28220a = new a();

        public class a implements a<InputStream> {
            public a() {
            }

            @Override // np5.a
            public Class<InputStream> a() {
                return InputStream.class;
            }

            @Override // np5.a
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public void close(InputStream inputStream) throws IOException {
                inputStream.close();
            }

            @Override // np5.a
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public InputStream b(String str) {
                if (!str.startsWith("data:image")) {
                    throw new IllegalArgumentException("Not a valid image data URL.");
                }
                int iIndexOf = str.indexOf(44);
                if (iIndexOf == -1) {
                    throw new IllegalArgumentException("Missing comma in data URL.");
                }
                if (str.substring(0, iIndexOf).endsWith(";base64")) {
                    return new ByteArrayInputStream(Base64.decode(str.substring(iIndexOf + 1), 0));
                }
                throw new IllegalArgumentException("Not a base64 image data URL.");
            }
        }

        @Override // defpackage.e7g
        public void c() {
        }

        @Override // defpackage.e7g
        public d7g<Model, InputStream> d(iag iagVar) {
            return new np5(this.f28220a);
        }
    }

    public np5(a<Data> aVar) {
        this.f28217a = aVar;
    }

    @Override // defpackage.d7g
    public boolean a(Model model) {
        return model.toString().startsWith("data:image");
    }

    @Override // defpackage.d7g
    public d7g.a<Data> b(Model model, int i, int i2, cch cchVar) {
        return new d7g.a<>(new b4h(model), new b(model.toString(), this.f28217a));
    }
}
