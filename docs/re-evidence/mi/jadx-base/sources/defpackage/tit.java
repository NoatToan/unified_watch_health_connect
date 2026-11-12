package defpackage;

import com.google.android.play.core.splitinstall.internal.zzbl;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes5.dex */
public class tit {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f34752a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Field f34753b;
    public final Class c;

    public tit(Object obj, Field field, Class cls) {
        this.f34752a = obj;
        this.f34753b = field;
        this.c = cls;
    }

    public final Object a() {
        try {
            return this.c.cast(this.f34753b.get(this.f34752a));
        } catch (Exception e) {
            throw new zzbl(String.format("Failed to get value of field %s of type %s on object of type %s", this.f34753b.getName(), this.f34752a.getClass().getName(), this.c.getName()), e);
        }
    }

    public final Field b() {
        return this.f34753b;
    }

    public final void c(Object obj) {
        try {
            this.f34753b.set(this.f34752a, obj);
        } catch (Exception e) {
            throw new zzbl(String.format("Failed to set value of field %s of type %s on object of type %s", this.f34753b.getName(), this.f34752a.getClass().getName(), this.c.getName()), e);
        }
    }
}
