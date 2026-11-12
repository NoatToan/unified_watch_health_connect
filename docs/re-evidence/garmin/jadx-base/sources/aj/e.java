package aj;

import android.util.Base64;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes7.dex */
public final class e<Model, Data> implements o<Model, Data> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a<Data> f3329a;

    public interface a<Data> {
    }

    public static final class b<Data> implements com.bumptech.glide.load.data.d<Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f3330a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final a<Data> f3331b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public ByteArrayInputStream f3332c;

        public b(String str, a<Data> aVar) {
            this.f3330a = str;
            this.f3331b = aVar;
        }

        @Override // com.bumptech.glide.load.data.d
        public final Class<Data> a() {
            this.f3331b.getClass();
            return InputStream.class;
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
            try {
                a<Data> aVar = this.f3331b;
                ByteArrayInputStream byteArrayInputStream = this.f3332c;
                ((c.a) aVar).getClass();
                byteArrayInputStream.close();
            } catch (IOException unused) {
            }
        }

        @Override // com.bumptech.glide.load.data.d
        public final void d(com.bumptech.glide.g gVar, com.bumptech.glide.load.data.d.a<? super Data> aVar) {
            try {
                ByteArrayInputStream byteArrayInputStreamA = ((c.a) this.f3331b).a(this.f3330a);
                this.f3332c = byteArrayInputStreamA;
                aVar.c(byteArrayInputStreamA);
            } catch (IllegalArgumentException e4) {
                aVar.e(e4);
            }
        }
    }

    public static final class c<Model> implements p<Model, InputStream> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final a f3333a = new a(this);

        public class a implements a<InputStream> {
            public a(c cVar) {
            }

            public final ByteArrayInputStream a(String str) {
                if (!str.startsWith("data:image")) {
                    vb.h.s("Not a valid image data URL.");
                    return null;
                }
                int iIndexOf = str.indexOf(44);
                if (iIndexOf == -1) {
                    vb.h.s("Missing comma in data URL.");
                    return null;
                }
                if (str.substring(0, iIndexOf).endsWith(";base64")) {
                    return new ByteArrayInputStream(Base64.decode(str.substring(iIndexOf + 1), 0));
                }
                vb.h.s("Not a base64 image data URL.");
                return null;
            }
        }

        @Override // aj.p
        public final o<Model, InputStream> d(s sVar) {
            return new e(this.f3333a);
        }
    }

    public e(a<Data> aVar) {
        this.f3329a = aVar;
    }

    @Override // aj.o
    public final o.a<Data> a(Model model, int i14, int i15, ui.h hVar) {
        return new o.a<>(new pj.d(model), new b(model.toString(), this.f3329a));
    }

    @Override // aj.o
    public final boolean b(Model model) {
        return model.toString().startsWith("data:image");
    }
}
