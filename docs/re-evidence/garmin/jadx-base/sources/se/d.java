package se;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.res.Configuration;
import android.graphics.Rect;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lse/d;", "Lse/b;", "<init>", "()V", "window_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class d implements b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final d f158727b = new d();

    private d() {
    }

    @Override // se.b
    @SuppressLint({"BanUncheckedReflection", "BlockedPrivateApi"})
    public final Rect a(Activity activity) throws Exception {
        Configuration configuration = activity.getResources().getConfiguration();
        try {
            Field declaredField = Configuration.class.getDeclaredField("windowConfiguration");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(configuration);
            Object objInvoke = obj.getClass().getDeclaredMethod("getBounds", null).invoke(obj, null);
            objInvoke.getClass();
            return new Rect((Rect) objInvoke);
        } catch (Exception e4) {
            if (!(e4 instanceof NoSuchFieldException) && !(e4 instanceof NoSuchMethodException) && !(e4 instanceof IllegalAccessException) && !(e4 instanceof InvocationTargetException)) {
                throw e4;
            }
            b.f158724a.getClass();
            b.a aVar = b.a.f158725a;
            return c.f158726b.a(activity);
        }
    }
}
