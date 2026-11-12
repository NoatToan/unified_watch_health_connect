package defpackage;

import android.graphics.drawable.Drawable;
import android.util.Property;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes5.dex */
public class i47 extends Property<Drawable, Integer> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Property<Drawable, Integer> f20766b = new i47();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakHashMap<Drawable, Integer> f20767a;

    public i47() {
        super(Integer.class, "drawableAlphaCompat");
        this.f20767a = new WeakHashMap<>();
    }

    @Override // android.util.Property
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Integer get(Drawable drawable) {
        return Integer.valueOf(drawable.getAlpha());
    }

    @Override // android.util.Property
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void set(Drawable drawable, Integer num) {
        drawable.setAlpha(num.intValue());
    }
}
