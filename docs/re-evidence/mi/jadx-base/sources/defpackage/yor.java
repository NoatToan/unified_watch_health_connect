package defpackage;

import android.view.LayoutInflater;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes3.dex */
public class yor {
    public static void a(LayoutInflater layoutInflater, LayoutInflater.Factory2 factory2) {
        LayoutInflater.Factory2 factory3 = layoutInflater.getFactory2();
        if (factory3 == null && layoutInflater.getFactory() == null) {
            dae.a(layoutInflater, factory2);
            return;
        }
        if (factory3 instanceof r69) {
            ((r69) layoutInflater.getFactory2()).a(factory2);
            return;
        }
        if (factory2 instanceof r69) {
            ((r69) factory2).a(factory3);
        }
        try {
            ebk.r(layoutInflater.getClass().getSuperclass(), layoutInflater, "mFactory2", factory2);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }
}
