package ie2;

import android.graphics.Bitmap;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Lie2/d;", "", "<init>", "()V", "a", "c", "d", "b", "Lie2/d$a;", "Lie2/d$b;", "Lie2/d$c;", "Lie2/d$d;", "map-sdk-adapter-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class d {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lie2/d$a;", "Lie2/d;", "<init>", "()V", "map-sdk-adapter-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a extends d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f93115a = new a();

        private a() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lie2/d$c;", "Lie2/d;", "<init>", "()V", "map-sdk-adapter-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class c extends d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f93118a = new c();

        private c() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: ie2.d$d, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lie2/d$d;", "Lie2/d;", "<init>", "()V", "map-sdk-adapter-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class C1784d extends d {
        static {
            new C1784d();
        }

        private C1784d() {
            super(null);
        }
    }

    public /* synthetic */ d(p005kotlin.jvm.internal.j jVar) {
        this();
    }

    private d() {
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lie2/d$b;", "Lie2/d;", "Landroid/graphics/Bitmap;", "bitmap", "", "refWidth", "<init>", "(Landroid/graphics/Bitmap;F)V", "map-sdk-adapter-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class b extends d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Bitmap f93116a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final float f93117b;

        public /* synthetic */ b(Bitmap bitmap, float f14, int i14, p005kotlin.jvm.internal.j jVar) {
            this(bitmap, (i14 & 2) != 0 ? 10.0f : f14);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return p005kotlin.jvm.internal.s.g(this.f93116a, bVar.f93116a) && Float.compare(this.f93117b, bVar.f93117b) == 0;
        }

        public final int hashCode() {
            Bitmap bitmap = this.f93116a;
            return Float.hashCode(this.f93117b) + ((bitmap == null ? 0 : bitmap.hashCode()) * 31);
        }

        public final String toString() {
            return "CustomCap(bitmap=" + this.f93116a + ", refWidth=" + this.f93117b + ")";
        }

        public b(Bitmap bitmap, float f14) {
            super(null);
            this.f93116a = bitmap;
            this.f93117b = f14;
        }
    }
}
