package defpackage;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes4.dex */
public final class xx6<DataT> implements d7g<Integer, DataT> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f39548a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e<DataT> f39549b;

    public static final class a implements e7g<Integer, AssetFileDescriptor>, e<AssetFileDescriptor> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f39550a;

        public a(Context context) {
            this.f39550a = context;
        }

        @Override // xx6.e
        public Class<AssetFileDescriptor> a() {
            return AssetFileDescriptor.class;
        }

        @Override // defpackage.e7g
        public void c() {
        }

        @Override // defpackage.e7g
        public d7g<Integer, AssetFileDescriptor> d(iag iagVar) {
            return new xx6(this.f39550a, this);
        }

        @Override // xx6.e
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void close(AssetFileDescriptor assetFileDescriptor) throws IOException {
            assetFileDescriptor.close();
        }

        @Override // xx6.e
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public AssetFileDescriptor b(Resources.Theme theme, Resources resources, int i) {
            return resources.openRawResourceFd(i);
        }
    }

    public static final class b implements e7g<Integer, Drawable>, e<Drawable> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f39551a;

        public b(Context context) {
            this.f39551a = context;
        }

        @Override // xx6.e
        public Class<Drawable> a() {
            return Drawable.class;
        }

        @Override // defpackage.e7g
        public void c() {
        }

        @Override // defpackage.e7g
        public d7g<Integer, Drawable> d(iag iagVar) {
            return new xx6(this.f39551a, this);
        }

        @Override // xx6.e
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void close(Drawable drawable) throws IOException {
        }

        @Override // xx6.e
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public Drawable b(Resources.Theme theme, Resources resources, int i) {
            return l47.a(this.f39551a, i, theme);
        }
    }

    public static final class c implements e7g<Integer, InputStream>, e<InputStream> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f39552a;

        public c(Context context) {
            this.f39552a = context;
        }

        @Override // xx6.e
        public Class<InputStream> a() {
            return InputStream.class;
        }

        @Override // defpackage.e7g
        public void c() {
        }

        @Override // defpackage.e7g
        public d7g<Integer, InputStream> d(iag iagVar) {
            return new xx6(this.f39552a, this);
        }

        @Override // xx6.e
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void close(InputStream inputStream) throws IOException {
            inputStream.close();
        }

        @Override // xx6.e
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public InputStream b(Resources.Theme theme, Resources resources, int i) {
            return resources.openRawResource(i);
        }
    }

    public static final class d<DataT> implements jl5<DataT> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Resources.Theme f39553a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Resources f39554b;
        public final e<DataT> c;
        public final int d;
        public DataT e;

        public d(Resources.Theme theme, Resources resources, e<DataT> eVar, int i) {
            this.f39553a = theme;
            this.f39554b = resources;
            this.c = eVar;
            this.d = i;
        }

        @Override // defpackage.jl5
        public Class<DataT> a() {
            return this.c.a();
        }

        @Override // defpackage.jl5
        public void b() {
            DataT datat = this.e;
            if (datat != null) {
                try {
                    this.c.close(datat);
                } catch (IOException unused) {
                }
            }
        }

        /* JADX WARN: Type inference failed for: r4v3, types: [DataT, java.lang.Object] */
        @Override // defpackage.jl5
        public void c(Priority priority, jl5.a<? super DataT> aVar) {
            try {
                DataT datatB = this.c.b(this.f39553a, this.f39554b, this.d);
                this.e = datatB;
                aVar.e(datatB);
            } catch (Resources.NotFoundException e) {
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

    public interface e<DataT> {
        Class<DataT> a();

        DataT b(Resources.Theme theme, Resources resources, int i);

        void close(DataT datat) throws IOException;
    }

    public xx6(Context context, e<DataT> eVar) {
        this.f39548a = context.getApplicationContext();
        this.f39549b = eVar;
    }

    public static e7g<Integer, AssetFileDescriptor> c(Context context) {
        return new a(context);
    }

    public static e7g<Integer, Drawable> e(Context context) {
        return new b(context);
    }

    public static e7g<Integer, InputStream> g(Context context) {
        return new c(context);
    }

    @Override // defpackage.d7g
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public d7g.a<DataT> b(Integer num, int i, int i2, cch cchVar) {
        Resources.Theme theme = (Resources.Theme) cchVar.c(vqk.f37138b);
        return new d7g.a<>(new b4h(num), new d(theme, theme != null ? theme.getResources() : this.f39548a.getResources(), this.f39549b, num.intValue()));
    }

    @Override // defpackage.d7g
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public boolean a(Integer num) {
        return true;
    }
}
