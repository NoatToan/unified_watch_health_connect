package h3;

import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.RippleDrawable;
import o4.d0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001:\u0002\u0006\u0007B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lh3/m;", "Landroid/graphics/drawable/RippleDrawable;", "", "bounded", "<init>", "(Z)V", "b", "a", "material-ripple"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class m extends RippleDrawable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f81273a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public d0 f81274b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Integer f81275c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f81276d;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lh3/m$b;", "", "<init>", "()V", "material-ripple"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f81277a = new b();

        private b() {
        }
    }

    static {
        new a(null);
    }

    public m(boolean z14) {
        super(ColorStateList.valueOf(-16777216), null, z14 ? new ColorDrawable(-1) : null);
        this.f81273a = z14;
    }

    @Override // android.graphics.drawable.RippleDrawable, android.graphics.drawable.Drawable
    public final Rect getDirtyBounds() {
        if (!this.f81273a) {
            this.f81276d = true;
        }
        Rect dirtyBounds = super.getDirtyBounds();
        this.f81276d = false;
        return dirtyBounds;
    }

    @Override // android.graphics.drawable.RippleDrawable, android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
    public final boolean isProjected() {
        return this.f81276d;
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0016\u0010\b\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lh3/m$a;", "", "<init>", "()V", "Ljava/lang/reflect/Method;", "setMaxRadiusMethod", "Ljava/lang/reflect/Method;", "", "setMaxRadiusFetched", "Z", "material-ripple"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
