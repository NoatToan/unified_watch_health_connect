package aj;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes7.dex */
public final class f<DataT> implements o<Integer, DataT> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f3334a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e<DataT> f3335b;

    public static final class a implements p<Integer, AssetFileDescriptor>, e<AssetFileDescriptor> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f3336a;

        public a(Context context) {
            this.f3336a = context;
        }

        @Override // aj.f.e
        public final Class<AssetFileDescriptor> a() {
            return AssetFileDescriptor.class;
        }

        @Override // aj.f.e
        public final void b(AssetFileDescriptor assetFileDescriptor) throws IOException {
            assetFileDescriptor.close();
        }

        @Override // aj.f.e
        public final Object c(int i14, Resources.Theme theme, Resources resources) {
            return resources.openRawResourceFd(i14);
        }

        @Override // aj.p
        public final o<Integer, AssetFileDescriptor> d(s sVar) {
            return new f(this.f3336a, this);
        }
    }

    public static final class b implements p<Integer, Drawable>, e<Drawable> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f3337a;

        public b(Context context) {
            this.f3337a = context;
        }

        @Override // aj.f.e
        public final Class<Drawable> a() {
            return Drawable.class;
        }

        @Override // aj.f.e
        public final /* bridge */ /* synthetic */ void b(Drawable drawable) {
        }

        @Override // aj.f.e
        public final Object c(int i14, Resources.Theme theme, Resources resources) {
            Context context = this.f3337a;
            return fj.b.a(context, context, i14, theme);
        }

        @Override // aj.p
        public final o<Integer, Drawable> d(s sVar) {
            return new f(this.f3337a, this);
        }
    }

    public static final class c implements p<Integer, InputStream>, e<InputStream> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f3338a;

        public c(Context context) {
            this.f3338a = context;
        }

        @Override // aj.f.e
        public final Class<InputStream> a() {
            return InputStream.class;
        }

        @Override // aj.f.e
        public final void b(InputStream inputStream) throws IOException {
            inputStream.close();
        }

        @Override // aj.f.e
        public final Object c(int i14, Resources.Theme theme, Resources resources) {
            return resources.openRawResource(i14);
        }

        @Override // aj.p
        public final o<Integer, InputStream> d(s sVar) {
            return new f(this.f3338a, this);
        }
    }

    public static final class d<DataT> implements com.bumptech.glide.load.data.d<DataT> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Resources.Theme f3339a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Resources f3340b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final e<DataT> f3341c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f3342d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public DataT f3343e;

        public d(Resources.Theme theme, Resources resources, e<DataT> eVar, int i14) {
            this.f3339a = theme;
            this.f3340b = resources;
            this.f3341c = eVar;
            this.f3342d = i14;
        }

        @Override // com.bumptech.glide.load.data.d
        public final Class<DataT> a() {
            return this.f3341c.a();
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
            DataT datat = this.f3343e;
            if (datat != null) {
                try {
                    this.f3341c.b(datat);
                } catch (IOException unused) {
                }
            }
        }

        /* JADX WARN: Type inference failed for: r4v3, types: [DataT, java.lang.Object] */
        @Override // com.bumptech.glide.load.data.d
        public final void d(com.bumptech.glide.g gVar, com.bumptech.glide.load.data.d.a<? super DataT> aVar) {
            try {
                ?? r14 = (DataT) this.f3341c.c(this.f3342d, this.f3339a, this.f3340b);
                this.f3343e = r14;
                aVar.c(r14);
            } catch (Resources.NotFoundException e4) {
                aVar.e(e4);
            }
        }
    }

    public interface e<DataT> {
        Class<DataT> a();

        void b(DataT datat);

        Object c(int i14, Resources.Theme theme, Resources resources);
    }

    public f(Context context, e<DataT> eVar) {
        this.f3334a = context.getApplicationContext();
        this.f3335b = eVar;
    }

    @Override // aj.o
    public final o.a a(Integer num, int i14, int i15, ui.h hVar) {
        Integer num2 = num;
        Resources.Theme theme = (Resources.Theme) hVar.c(fj.e.f71824b);
        return new o.a(new pj.d(num2), new d(theme, theme != null ? theme.getResources() : this.f3334a.getResources(), this.f3335b, num2.intValue()));
    }

    @Override // aj.o
    public final /* bridge */ /* synthetic */ boolean b(Integer num) {
        return true;
    }
}
